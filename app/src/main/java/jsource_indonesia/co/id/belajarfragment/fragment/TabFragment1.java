package jsource_indonesia.co.id.belajarfragment.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import jsource_indonesia.co.id.belajarfragment.R;

/**
 * Created by muhammad on 13/10/15.
 */
public class TabFragment1 extends Fragment {

    public TabFragment1(){

    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.tab1, container, false);
    }
}
