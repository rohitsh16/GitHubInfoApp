package com.example.hp.gitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
        BarChart barChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        barChart=(BarChart)findViewById(R.id.bargraph);
        ArrayList<BarEntry> yVals1 = new ArrayList<BarEntry>();

        yVals1.add(new BarEntry(0,MainActivity.i1));
        yVals1.add(new BarEntry(1, MainActivity.i2));
        yVals1.add(new BarEntry(2, MainActivity.i3));
        yVals1.add(new BarEntry(3, MainActivity.i4));
        yVals1.add(new BarEntry(4, MainActivity.i5));
        final ArrayList<String> xAxisLabel = new ArrayList<>();
        xAxisLabel.add(MainActivity.editText.getText().toString());
        xAxisLabel.add(MainActivity.editText1.getText().toString());
        xAxisLabel.add(MainActivity.editText2.getText().toString());
        xAxisLabel.add(MainActivity.editText3.getText().toString());
        xAxisLabel.add(MainActivity.editText4.getText().toString());



        BarDataSet set1 = new BarDataSet(yVals1, "Public Repos in order of Given Name");
        set1.setColors(ColorTemplate.MATERIAL_COLORS);

        ArrayList<IBarDataSet> dataSets = new ArrayList<IBarDataSet>();
        dataSets.add(set1);

        BarData data = new BarData(dataSets);

        data.setValueTextSize(10f);
        data.setBarWidth(0.9f);

        barChart.setTouchEnabled(false);
        barChart.setData(data);

    }
}
