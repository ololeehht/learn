package com.hht.mynavgation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hht.mynavgation.databinding.FragmentMainBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MainFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    
    
    /**
     * @param  
     * @return 
     * @author (ololee)lizhengqing@honghe-tech.com 
     * @creed: 
     * @date 2020/9/25 17:26
     */
    public MainFragment() {
        // Required empty public constructor
       
    }



    /*** 
     * @param param1
     * @param param2 
     * @return com.hht.mynavgation.MainFragment
     * @author (ololee)lizhengqing@honghe-tech.com 
     * @creed: 
     * @date 2020/9/25 17:23
     */
    public static MainFragment newInstance(String param1, String param2) {
        
        MainFragment fragment = new MainFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    /**
     * @param savedInstanceState 
     * @return void
     * @author (ololee)lizhengqing@honghe-tech.com 
     * @creed: 
     * @date 2020/9/25 17:23
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }



    /**
     * @param inflater
     * @param container
     * @param savedInstanceState 
     * @return android.view.View
     * @author (ololee)lizhengqing@honghe-tech.com 
     * @creed: 
     * @date 2020/9/25 17:22
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentMainBinding binding = FragmentMainBinding.inflate(getLayoutInflater());
        binding.btnToSecondFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle=new MainFragmentArgs.Builder()
                        .setUserName("ololee")
                        .setAge(23)
                        .build()
                        .toBundle();
                Navigation.findNavController(v)
                        .navigate(R.id.action_mainFragment_to_secondFragment,bundle);
            }
        });
        return binding.getRoot();
    }
}