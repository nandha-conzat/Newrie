package rukina.newrie;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Nandha on 25-07-2016.
 */
public class HomeFragment extends Fragment{

    public HomeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_home, container, false);
//        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
//        return rootView;

    }
}
