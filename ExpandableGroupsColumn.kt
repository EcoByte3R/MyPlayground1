package com.example.myapplication1.ui.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.ListItemDefaults
import androidx.compose.material3.ListItemShapes
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import kotlin.time.Duration.Companion.milliseconds

data class ExpandableGroupData<T>(
    val id: String,
    val title: String,
    val items: List<T>
)

@OptIn(ExperimentalMaterial3ExpressiveApi::class, ExperimentalFoundationApi::class)
@Composable
fun <T> ExpandableGroupsColumn(
    groups: List<ExpandableGroupData<T>>,
    expandedGroups: Map<String, Boolean>,
    alreadyAnimatedGroups: Set<String>,
    onToggleGroup: (String) -> Unit,
    onGroupAnimationFinished: (String) -> Unit,
    itemKey: (T) -> String,
    modifier: Modifier = Modifier,
    listState: LazyListState = rememberLazyListState(),
    alwaysExpanded: Boolean = false,
    itemContent: @Composable (
        item: T,
        index: Int,
        shapes: ListItemShapes,
        skipEntranceAnimation: Boolean
    ) -> Unit
) {
    groups.forEach { group ->
        val isExpanded = alwaysExpanded || (expandedGroups[group.id] ?: false)
        val alreadyAnimated = alreadyAnimatedGroups.contains(group.id)

        LaunchedEffect(isExpanded, alreadyAnimated) {
            if (isExpanded && !alreadyAnimated) {
                val totalMs = (group.items.size - 1) * 40L + 220L
                delay(totalMs.milliseconds)
                onGroupAnimationFinished(group.id)
            }
        }
    }

    val navBarBottomPadding = WindowInsets.navigationBars.asPaddingValues().calculateBottomPadding()

    LazyColumn(
        state = listState,
        modifier = modifier.fillMaxSize(),
        contentPadding = PaddingValues(
            start = 16.dp,
            end = 16.dp,
            top = 8.dp,
            bottom = 8.dp + navBarBottomPadding
        ),
        verticalArrangement = Arrangement.spacedBy(2.dp)
    ) {
        groups.forEach { group ->
            val isExpanded = alwaysExpanded || (expandedGroups[group.id] ?: false)
            val skipEntranceAnimation = alreadyAnimatedGroups.contains(group.id)

            stickyHeader(key = "header_${group.id}") {
                val expandDurationMs = (group.items.size - 1) * 40L + 220L
                val collapseDurationMs = 250L
                val contentAnimationDurationMillis =
                    if (isExpanded) collapseDurationMs else expandDurationMs

                Surface(color = MaterialTheme.colorScheme.surface) {
                    GroupHeader(
                        title = group.title,
                        expanded = isExpanded,
                        contentAnimationDurationMillis = contentAnimationDurationMillis,
                        onClick = { if (!alwaysExpanded) onToggleGroup(group.id) },
                        showChevron = !alwaysExpanded,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }

            if (isExpanded) {
                itemsIndexed(
                    items = group.items,
                    key = { _, item -> itemKey(item) }
                ) { index, item ->
                    itemContent(
                        item,
                        index,
                        ListItemDefaults.segmentedShapes(index = index, count = group.items.size),
                        skipEntranceAnimation
                    )
                }
            }
        }
    }
}
