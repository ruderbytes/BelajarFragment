package jsource_indonesia.co.id.belajarfragment.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

import jsource_indonesia.co.id.belajarfragment.fragment.TabFragment1;
import jsource_indonesia.co.id.belajarfragment.fragment.TabFragment2;

/**
 * Created by muhammad on 13/10/15.
 */
public class AdapterFragmentTab extends FragmentPagerAdapter {

    String[] title= new String[]{"Tab 1","Tab 2"};

    public CharSequence getPageTitle(int position){
        return title[position];
    }

    public AdapterFragmentTab(android.support.v4.app.FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment tab = null;
        switch (position){
            case 0:
                tab = new TabFragment1();
                break;
            case 1:
                tab = new TabFragment2();
                break;
        }
        return tab;
    }

    @Override
    public int getCount() {
        return 2;
    }

}
