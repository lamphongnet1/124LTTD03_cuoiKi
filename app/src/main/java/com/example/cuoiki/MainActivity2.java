package com.example.cuoiki;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.cuoiki.fragment.Adapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity2 extends AppCompatActivity {
    private ViewPager view_pager;
    private BottomNavigationView bottom_menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        view_pager = findViewById(R.id.view_pager);
        bottom_menu = findViewById(R.id.bottom_menu);

        Adapter adapter = new Adapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        view_pager.setAdapter(adapter);
        view_pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0:
                        bottom_menu.getMenu().findItem(R.id.menu_home).setChecked(true);
                        break;
                    case 1:
                        bottom_menu.getMenu().findItem(R.id.menu_video).setChecked(true);
                        break;
                    case 2:
                        bottom_menu.getMenu().findItem(R.id.menu_user).setChecked(true);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        bottom_menu.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId()==R.id.menu_home){
                    view_pager.setCurrentItem(0);
                }
                if (item.getItemId()==R.id.menu_video){
                    view_pager.setCurrentItem(1);
                }
                if (item.getItemId()==R.id.menu_user){
                    view_pager.setCurrentItem(2);
                }
                return true;
            }
        });
    }
}