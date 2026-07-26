package com.example.myapplication1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandVertically
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItemDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SegmentedListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.stateDescription
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication1.ui.theme.MyApplication1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplication1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplication1Theme {
        Greeting("Android")
    }
}

//@Composable
//fun TrainAppScaffold() {
//    // 1. Navigator & State
//    val navigator = rememberListDetailPaneScaffoldNavigator<Nothing>()
//    val scaffoldState = rememberThreePaneScaffoldState()
//
//    // 2. Detect foldable & avoid hinge
//    val windowAdaptiveInfo = rememberWindowAdaptiveInfo()
//    val foldingFeature = windowAdaptiveInfo.windowLayoutInfo?.foldingFeature
//
//    // Define safe area: never put panes over hinge
//    val directive = calculateStandardPaneScaffoldDirective(
//        windowAdaptiveInfo = windowAdaptiveInfo,
//        // Force panes to stay clear of fold/hinge
//        excludedBounds = foldingFeature?.let { Rect(it.bounds) } ?: Rect.Zero
//    )
//
//    // 3. Resizable setup with VerticalDragHandle
//    ListDetailPaneScaffold(
//        modifier = Modifier.fillMaxSize(),
//        scaffoldDirective = directive,
//        scaffoldState = scaffoldState,
//        listPane = {
//            // 📌 Pane 1: Train Lines List
//            TrainLinesList(
//                onLineSelected = { line ->
//                    // Go to stations list
//                    navigator.navigateTo(ThreePaneScaffoldRole.Detail)
//                }
//            )
//        },
//        detailPane = {
//            // 📌 Pane 2: Stations List (filtered)
//            TrainStationsList(
//                onStationSelected = { station ->
//                    // Open details pane
//                    navigator.navigateTo(ThreePaneScaffoldRole.Extra)
//                }
//            )
//        },
//        extraPane = {
//            // 📌 Pane 3: Station Details
//            StationDetailsScreen()
//        }
//    )
//}
//
//@Composable
//fun SegmentedListItemWithExpansion() {
//    var expanded by rememberSaveable { mutableStateOf(false) }
//    val numChildren = 3
//    val itemCount = 1 + if (expanded) numChildren else 0
//    val childrenChecked = rememberSaveable { mutableStateListOf(*Array(numChildren) { false }) }
//
//    val colors =
//        ListItemDefaults.colors(containerColor = MaterialTheme.colorScheme.surfaceContainer)
//
//    Column(
//        verticalArrangement = Arrangement.spacedBy(ListItemDefaults.SegmentedGap),
//    ) {
//        SegmentedListItem(
//            onClick = { expanded = !expanded },
//            modifier =
//                Modifier.semantics { stateDescription = if (expanded) "Expanded" else "Collapsed" },
//            colors = colors,
//            shapes = ListItemDefaults.segmentedShapes(index = 0, count = itemCount),
////            leadingContent = { Icon(Icons.Default.Favorite, contentDescription = null) },
//            trailingContent = {
//                Icon(
//                    if (expanded) Icons.Default.ExpandLess else Icons.Default.ExpandMore,
//                    contentDescription = null,
//                )
//            },
//            content = { Text("Click to expand/collapse") },
//        )
//        AnimatedVisibility(
//            visible = expanded,
//            enter = expandVertically(MaterialTheme.motionScheme.fastSpatialSpec()),
//            exit = shrinkVertically(MaterialTheme.motionScheme.fastSpatialSpec()),
//        ) {
//            Column(verticalArrangement = Arrangement.spacedBy(ListItemDefaults.SegmentedGap)) {
//                repeat(numChildren) { index ->
//                    SegmentedListItem(
////                        checked = childrenChecked[index],
////                        onCheckedChange = { childrenChecked[index] = it },
//                        colors = colors,
//                        shapes =
//                            ListItemDefaults.segmentedShapes(index = index + 1, count = itemCount),
//                        leadingContent = {
////                            Icon(Icons.Default.Favorite, contentDescription = null)
//                        },
//                        trailingContent = {
////                            Checkbox(checked = childrenChecked[index], onCheckedChange = null)
//                        },
//                        content = { Text("Child ${index + 1}") },
//                    )
//                }
//            }
//        }
//    }
//}
