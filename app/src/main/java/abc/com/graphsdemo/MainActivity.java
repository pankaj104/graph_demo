package abc.com.graphsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;



import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GraphView linegraph = (GraphView) findViewById(R.id.line_graph);
        LineGraphSeries<DataPoint> lineSeries = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(0, 1),
                new DataPoint(1, 50),
                new DataPoint(2, 3),
                new DataPoint(3, 20),
                new DataPoint(4, 60),
                new DataPoint(5, 5),
                new DataPoint(6, 10),
                new DataPoint(7, 6),
                new DataPoint(9,34),
                new DataPoint(30,100)

        });
        linegraph.addSeries(lineSeries);
        lineSeries.setColor(Color.GREEN);
        lineSeries.setTitle(" This is Line Chart");
        lineSeries.setDataPointsRadius(16);

        lineSeries.setAnimated(true);


            }

}