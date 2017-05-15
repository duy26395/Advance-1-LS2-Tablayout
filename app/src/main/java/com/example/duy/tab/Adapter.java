package com.example.duy.tab;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by duy on 16/05/2017.
 */

public class Adapter extends FragmentPagerAdapter {
 //   String[] tabtitle = new String[]{"TAB_1", "TAB_2", "TAB_3"};
    Context context;
   // private int pagec = 3;

    public Adapter(FragmentManager fm, Context context) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
     /*   Frangment1 fragment1 = new Frangment1();
        return fragment1; */
        switch (position) {
            case 0:
                Frangment1 tb1 = new Frangment1();
                return tb1;
            case 1:
                Frangment2 tb2 = new Frangment2();
                return tb2;
            case 2:
                Frangment3 tb3 = new Frangment3();
                return tb3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Dien thoai";
            case 1:
                return " may tinh ";
            case 2:
                return " xe ";
        }
        //      return  tabtitle[position];
    return null;
    }



}
