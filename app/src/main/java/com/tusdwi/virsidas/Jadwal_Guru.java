package com.tusdwi.virsidas;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.tusdwi.virsidas.Jadwal.Jumat;
import com.tusdwi.virsidas.Jadwal.Kamis;
import com.tusdwi.virsidas.Jadwal.Rabu;
import com.tusdwi.virsidas.Jadwal.Selasa;
import com.tusdwi.virsidas.Jadwal.Senin;

import java.util.ArrayList;
import java.util.List;

public class Jadwal_Guru extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadwal_guru);

        //view pager
        viewPager = findViewById(R.id.view_pager);
        setupViewPager(viewPager);

        //tab layout
        tabLayout = findViewById(R.id.tab);
        tabLayout.setupWithViewPager(viewPager);

        //toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    private void setupViewPager(ViewPager viewPager){
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Senin(), "SENIN");
        adapter.addFragment(new Selasa(), "SELASA");
        adapter.addFragment(new Rabu(), "RABU");
        adapter.addFragment(new Kamis(), "KAMIS");
        adapter.addFragment(new Jumat(),"JUMAT");
        adapter.addFragment(new Fragment(),"SABTU");
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}