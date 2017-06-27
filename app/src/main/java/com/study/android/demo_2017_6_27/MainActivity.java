package com.study.android.demo_2017_6_27;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.study.android.demo_2017_6_27.adapter.Listadapter;
import com.study.android.demo_2017_6_27.bean.Listdata;

import java.util.ArrayList;
import java.util.List;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

public class MainActivity extends AppCompatActivity {

    private ListView listview;
    private List<Listdata>list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initData() {
        //封装listdata的地方
        list=new ArrayList<>();
        Listdata listdata= new Listdata();
        listdata.setTitle("第一个标题");
        listdata.setOne_text("第一个标题布局");
        list.add(listdata);
        listdata =new Listdata();
        listdata.setTitle("第二个标题");
        listdata.setOne_text("第二个标题");
        listdata.setTwo_text("第二个标题布局");
        list.add(listdata);
        listdata =new Listdata();
        listdata.setTitle("第二个标题");
        listdata.setOne_text("第二个标题");
        listdata.setTwo_text("第二个标题布局");
        list.add(listdata);
        listdata =new Listdata();
        listdata.setTitle("第二个标题");
        listdata.setOne_text("第二个标题");
        listdata.setTwo_text("第二个标题布局");
        list.add(listdata);
        listdata =new Listdata();
        listdata.setTitle("第二个标题");
        listdata.setOne_text("第二个标题");
        listdata.setTwo_text("第二个标题布局");
        list.add(listdata);
        listdata =new Listdata();
        listdata.setTitle("第二个标题");
        listdata.setOne_text("第二个标题");
        listdata.setTwo_text("第二个标题布局");
        list.add(listdata);
        listdata =new Listdata();
        listdata.setTitle("第一个标题");
        listdata.setOne_text("第一个标题布局");
        list.add(listdata);
        listdata =new Listdata();
        listdata.setTitle("第二个标题");
        listdata.setOne_text("第二个标题");
        listdata.setTwo_text("第二个标题布局");
        list.add(listdata);
        listdata.setTitle("第一个标题");
        listdata.setOne_text("第一个标题");
        list.add(listdata);
        ListAdapter listadapter =new Listadapter(getApplicationContext(),list);
        listview.setAdapter(listadapter);
    }

    private void initView() {
        listview=(ListView)findViewById(R.id.listview);
    }
}
