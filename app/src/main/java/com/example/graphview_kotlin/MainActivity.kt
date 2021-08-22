package com.example.graphview_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.jjoe64.graphview.GraphView
import com.jjoe64.graphview.Viewport
import com.jjoe64.graphview.series.DataPoint
import com.jjoe64.graphview.series.LineGraphSeries
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var series: LineGraphSeries<DataPoint>
    private lateinit var graph: GraphView
    private lateinit var viewport: Viewport
    private lateinit var button: Button
    val x = mutableListOf(0.0, 10.0, 20.0, 30.0, 40.0, 50.0, 60.0, 70.0, 80.0, 90.0, 100.0)
    val y = mutableListOf(0.0, 10.0, 20.0, 30.0, 40.0, 50.0, 60.0, 70.0, 80.0, 90.0, 100.0)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button)
        graph = findViewById(R.id.graph)
        series = LineGraphSeries()
        graph.addSeries(series)

        button.setOnClickListener {
            // Resets the series to clear preivous graph
            series.resetData(arrayOf(DataPoint(0.0, 0.0)))
            makeGraph()
        }
        makeGraph()
    }

    fun makeGraph() {
        // Give x and y axises their range
        viewport = graph.viewport
        viewport.isYAxisBoundsManual = true
        viewport.setMinX(0.0)
        viewport.setMaxX(100.0)
        viewport.setMinY(0.0)
        viewport.setMaxY(100.0)
        viewport.isScrollable = true

        for (i in 0..x.size - 1) {
            series.appendData(
                DataPoint(
                    x[i],
                    y.shuffled()[i]
                ),
                true,
                100
            )
        }


    }




}