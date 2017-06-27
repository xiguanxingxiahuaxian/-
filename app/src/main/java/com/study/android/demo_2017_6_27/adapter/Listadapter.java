package com.study.android.demo_2017_6_27.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.study.android.demo_2017_6_27.R;
import com.study.android.demo_2017_6_27.bean.Listdata;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by maw on 2017/6/27.
 * //下午再找找问题
 */

public class Listadapter extends BaseAdapter {
    private Context context;
    private List<Listdata> list;

    public Listadapter(Context context, List<Listdata> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = new ViewHolder();
        ;
        if (convertView == null) {
            if (list.get(position).getTitle().equals("第一个标题")) {
                convertView = LayoutInflater.from(context).inflate(R.layout.one_item, null);

                viewHolder.title = (TextView) convertView.findViewById(R.id.one_title);
                viewHolder.one_text = (TextView) convertView.findViewById(R.id.one_text);
                convertView.setTag(viewHolder);
            } else if (list.get(position).getTitle().equals("第二个标题")) {
                convertView = LayoutInflater.from(context).inflate(R.layout.two_item, null);
                viewHolder.title = (TextView) convertView.findViewById(R.id.two_title);
                viewHolder.one_text = (TextView) convertView.findViewById(R.id.one_text);
                viewHolder.two_text = (TextView) convertView.findViewById(R.id.two_text);
                convertView.setTag(viewHolder);
            }
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        if (list.get(position).getTitle().equals("第一个标题")) {
            viewHolder.title.setText(list.get(position).getTitle());
            viewHolder.one_text.setText(list.get(position).getOne_text() == null ? "数据为空" : list.get(position).getOne_text());
        } else if (list.get(position).getTitle().equals("第二个标题")) {

            viewHolder.title.setText(list.get(position).getTitle());
            viewHolder.one_text.setText(list.get(position).getOne_text() == null ? "数据为空" : list.get(position).getOne_text());
            viewHolder.two_text.setText(list.get(position).getTwo_text() == null ? "数据为空" : list.get(position).getTwo_text());
        }

        return convertView;
    }

    class ViewHolder {
        public TextView title;
        public TextView one_text;
        public TextView two_text;
    }
}
