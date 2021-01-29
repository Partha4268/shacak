package com.ls.shacak;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.ls.shacak.adapters.SliderAdapter;
import com.ls.shacak.adapters.SliderImageModel;

import java.util.ArrayList;

public class ProfileDetailsActivity extends AppCompatActivity {

    ViewPager viewPager;
    SliderAdapter adapter;
    ArrayList<SliderImageModel> all_list;
    SliderImageModel model;
    TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_details);

        viewPager = findViewById(R.id.profile_view_pager);
        tabLayout = findViewById(R.id.tab_layout);

        all_list = new ArrayList<>();
        all_list.clear();

        model = new SliderImageModel("", R.drawable.false_image);
        all_list.add(model);

        model = new SliderImageModel("", R.drawable.false_image);
        all_list.add(model);

        model = new SliderImageModel("", R.drawable.false_image);
        all_list.add(model);

        model = new SliderImageModel("", R.drawable.false_image);
        all_list.add(model);

        model = new SliderImageModel("", R.drawable.false_image);
        all_list.add(model);

        model = new SliderImageModel("", R.drawable.false_image);
        all_list.add(model);

        adapter = new SliderAdapter(this,all_list);
        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager, true);
    }
}