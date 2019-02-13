package com.example.admin.benz;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class GalleryF extends Fragment {


    public GalleryF() {
        // Required empty public constructor
    }

    private RecyclerView vertical_recyclerview;
    private VerticalAdapter verticalAdapter;
    private ArrayList<String> name;
    private int[] imagejava = {R.drawable.amggla45, R.drawable.amgc4, R.drawable.gle43, R.drawable.amggts,R.drawable.amgg63};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_gallery, container, false);

        vertical_recyclerview = v.findViewById(R.id.verticalrview);
        name = new ArrayList<String>();
        name.add("AMG GLA 45");
        name.add("AMG C 43");
        name.add("AMG GLE 43 COUPE");
        name.add("AMG GT S");
        name.add("AMG G 63");

        verticalAdapter = new VerticalAdapter(name);
        LinearLayoutManager verticalLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        vertical_recyclerview.setAdapter(verticalAdapter);
        vertical_recyclerview.setLayoutManager(verticalLayoutManager);

        return v;
    }

    public class VerticalAdapter extends RecyclerView.Adapter<VerticalAdapter.MyViewHolder> {

        private ArrayList<String> namelist;


        @NonNull
        @Override
        public VerticalAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gallery, viewGroup, false);
            return new MyViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull VerticalAdapter.MyViewHolder myViewHolder, int i) {
            myViewHolder.carimagejava.setImageResource(imagejava[i]);
            myViewHolder.carnamejava.setText(name.get(i));

        }

        public VerticalAdapter(List<String> namestr) {
            this.namelist = name;

        }

        @Override
        public int getItemCount() {
            return namelist.size();
        }

        public class MyViewHolder extends RecyclerView.ViewHolder {

            public ImageView carimagejava;
            public TextView carnamejava;


            public MyViewHolder(@NonNull View itemView) {
                super(itemView);
                carimagejava = itemView.findViewById(R.id.imagexml);
                carnamejava = itemView.findViewById(R.id.namexml);
            }
        }

    }
}
