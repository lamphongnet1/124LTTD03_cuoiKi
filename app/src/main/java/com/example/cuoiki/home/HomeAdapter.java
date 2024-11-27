package com.example.cuoiki.home;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.cuoiki.fragment.home;

public class HomeAdapter extends FragmentStatePagerAdapter {

    public HomeAdapter(FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @Override
    public Fragment getItem(int position) {
        // Loại bỏ logic trả về các tab phụ
        return new home(); // Trả về một fragment chính duy nhất
    }

    @Override
    public int getCount() {
        return 1; // Chỉ có một tab
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Home"; // Tiêu đề của tab chính
    }
}
