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
public class TabFragment2 extends Fragment {
    public TabFragment2(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState){
        return inflater.inflate(R.layout.tab2, viewGroup, false);
    }
}
