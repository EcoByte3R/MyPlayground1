C:\Users\fm727\AndroidStudioProjects\MyApplication1\app\src\main\java\com\example\myapplication1\ui\components\LineListPane.kt

package com.example.myapplication1.ui.components

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItemDefaults
import androidx.compose.material3.ListItemShapes
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SegmentedListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.myapplication1.data.model.TransportLine
import com.example.myapplication1.data.model.TransportLineGroup
import com.example.myapplication1.data.model.endUngroupedLineKeys
import com.example.myapplication1.data.model.midUngroupedLineKeys
import com.example.myapplication1.data.model.overgroundGroup
import com.example.myapplication1.data.model.undergroundGroup
import com.example.myapplication1.data.model.ungroupedLineKeys

@OptIn(ExperimentalMaterial3ExpressiveApi::class)
@Composable
fun LineListPane(
    lines: List<TransportLine>,
    selectedLineKey: String?,
    onLineSelected: (TransportLine) -> Unit,
    modifier: Modifier = Modifier
) {
    val lineByKey = remember(lines) { lines.associateBy { it.key } }

    val expandedGroups = remember {
        mutableStateMapOf<String, Boolean>().apply {
            put(undergroundGroup.id, false)
            put(overgroundGroup.id, false)
        }
    }

    LazyColumn(
        modifier = modifier.fillMaxSize(),
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
        verticalArrangement = Arrangement.spacedBy(2.dp)
    ) {
        groupSection(
            group = undergroundGroup,
            isExpanded = expandedGroups[undergroundGroup.id] ?: false,
            onToggle = {
                expandedGroups[undergroundGroup.id] = !(expandedGroups[undergroundGroup.id] ?: false)
            },
            lineByKey = lineByKey,
            selectedLineKey = selectedLineKey,
            onLineSelected = onLineSelected
        )

        standaloneLines(
            keys = midUngroupedLineKeys,
            lineByKey = lineByKey,
            selectedLineKey = selectedLineKey,
            onLineSelected = onLineSelected,
            headerKey = "mid_ungrouped_spacer"
        )

        groupSection(
            group = overgroundGroup,
            isExpanded = expandedGroups[overgroundGroup.id] ?: false,
            onToggle = {
                expandedGroups[overgroundGroup.id] = !(expandedGroups[overgroundGroup.id] ?: false)
            },
            lineByKey = lineByKey,
            selectedLineKey = selectedLineKey,
            onLineSelected = onLineSelected
        )

        standaloneLines(
            keys = endUngroupedLineKeys,
            lineByKey = lineByKey,
            selectedLineKey = selectedLineKey,
            onLineSelected = onLineSelected,
            headerKey = "end_ungrouped_spacer"
        )
    }
}

@OptIn(ExperimentalMaterial3ExpressiveApi::class)
private fun LazyListScope.groupSection(
    group: TransportLineGroup,
    isExpanded: Boolean,
    onToggle: () -> Unit,
    lineByKey: Map<String, TransportLine>,
    selectedLineKey: String?,
    onLineSelected: (TransportLine) -> Unit
) {
    item(key = "header_${group.id}") {
        GroupHeader(
            titleRes = group.titleRes,
            expanded = isExpanded,
            onClick = onToggle,
            modifier = Modifier.animateItem()
        )
    }

    if (isExpanded) {
        val groupLines = group.lineKeys.mapNotNull { lineByKey[it] }

        itemsIndexed(
            items = groupLines,
            key = { _, line -> line.key }
        ) { index, line ->
            LineListItem(
                line = line,
                selected = line.key == selectedLineKey,
                shapes = ListItemDefaults.segmentedShapes(
                    index = index,
                    count = groupLines.size
                ),
                onClick = { onLineSelected(line) },
                modifier = Modifier.animateItem()
            )
        }
    }
}

@OptIn(ExperimentalMaterial3ExpressiveApi::class)
private fun LazyListScope.standaloneLines(
    keys: List<String>,
    lineByKey: Map<String, TransportLine>,
    selectedLineKey: String?,
    onLineSelected: (TransportLine) -> Unit,
    headerKey: String
) {
    val standaloneLines = keys.mapNotNull { lineByKey[it] }
    if (standaloneLines.isEmpty()) return

    item(key = headerKey) {
        Spacer(modifier = Modifier.padding(top = 8.dp))
    }

    items(standaloneLines, key = { line -> line.key }) { line ->
        LineListItem(
            line = line,
            selected = line.key == selectedLineKey,
            shapes = ListItemDefaults.segmentedShapes(index = 0, count = 1),
            onClick = { onLineSelected(line) },
            modifier = Modifier
                .animateItem()
                .padding(bottom = 6.dp)
        )
    }
}

@Composable
private fun GroupHeader(
    titleRes: Int,
    expanded: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val rotation by animateFloatAsState(
        targetValue = if (expanded) 0f else -90f,
        label = "chevron_rotation"
    )

    Row(
        modifier = modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(top = 16.dp, bottom = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = stringResource(titleRes),
            style = MaterialTheme.typography.titleMedium
        )
        Icon(
            imageVector = Icons.Filled.KeyboardArrowDown,
            contentDescription = null,
            modifier = Modifier.rotate(rotation)
        )
    }
}

@OptIn(ExperimentalMaterial3ExpressiveApi::class)
@Composable
private fun LineListItem(
    line: TransportLine,
    selected: Boolean,
    shapes: ListItemShapes,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    SegmentedListItem(
        selected = selected,
        onClick = onClick,
        shapes = shapes,
        modifier = modifier.fillMaxWidth(),
        leadingContent = {
            TransportLineSwatch(line = line)
        },
        trailingContent = {
            Icon(
                imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                contentDescription = null
            )
        },
        supportingContent = {
            if (line.mapDescTemplateRes != null && line.descTemplateRes != null && line.descColourRes != null) {
                val colourName = stringResource(line.descColourRes)
                val lineStyleText = stringResource(line.descTemplateRes, colourName)

                Text(stringResource(line.mapDescTemplateRes, lineStyleText))
            } else {
                Text(stringResource(line.nameRes))
            }
        },
        colors = ListItemDefaults.segmentedColors(
            containerColor = MaterialTheme.colorScheme.surfaceContainer
        )
    ) {
        Text(stringResource(line.nameRes))
    }
}
