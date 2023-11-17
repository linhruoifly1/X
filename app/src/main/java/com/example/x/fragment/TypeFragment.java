package com.example.x.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.x.DAO.TypeDAO;
import com.example.x.R;
import com.example.x.adapter.TypeAdapter;
import com.example.x.model.Type;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class TypeFragment extends Fragment {
    private RecyclerView rcvType;
    private FloatingActionButton fltAddType;
    TypeDAO typeDAO;
    ArrayList<Type> arrayList;
    TypeAdapter adapter;
    Type type;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_type, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rcvType = view.findViewById(R.id.rcvType);
        fltAddType = view.findViewById(R.id.fltAddType);
        typeDAO = new TypeDAO(getContext());
        arrayList = typeDAO.getAll();
        rcvType.setLayoutManager(new GridLayoutManager(getContext(),1));
        adapter = new TypeAdapter(getContext(),arrayList);
        rcvType.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        fltAddType.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDiaLogInsert(type);
            }
        });
    }

    private void openDiaLogInsert(Type type) {
    }
}