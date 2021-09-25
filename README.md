# GraphView-Kotlin
Demonstrates a simple GraphView example in Kotlin. Used jjoe64's GraphView library (https://github.com/jjoe64/GraphView)

1) Add dependency:
```
implementation 'com.jjoe64:graphview:4.2.2'
```
2) Add view to layout:
```xml
 <com.jjoe64.graphview.GraphView
        android:id="@+id/graph"
        android:layout_width="400dp"
        android:layout_height="550dp"/>

```
3) Import following GraphView libraries in activity:
```kotlin
import com.jjoe64.graphview.GraphView
import com.jjoe64.graphview.Viewport
import com.jjoe64.graphview.series.DataPoint
import com.jjoe64.graphview.series.LineGraphSeries
```
4) Implement them in the activity. See [MainActivity](https://github.com/Tiam-Abderezai/GraphView-Kotlin/blob/master/app/src/main/java/com/example/graphview_kotlin/MainActivity.kt)


![Alt text](https://github.com/Tiam-Abderezai/Images/blob/main/GraphView-Kotlin.gif)
