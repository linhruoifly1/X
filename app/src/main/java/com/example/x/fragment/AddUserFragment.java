package com.example.x.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.x.DAO.ReceptionistDAO;
import com.example.x.R;
import com.example.x.model.Receptionist;

import java.util.List;


public class AddUserFragment extends Fragment {

    EditText edthoTen, edtEmail, edtUsername, edtpass;
    Button btnthem;
    ReceptionistDAO receptionistDAO;





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add_user, container, false);

        // ánh xạ
        edthoTen = view.findViewById(R.id.edthoTenadd);
        edtEmail = view.findViewById(R.id.edtEmailadd);
        edtUsername = view.findViewById(R.id.edtUsernameadd);
        edtpass = view.findViewById(R.id.edtpassadd);

        btnthem = view.findViewById(R.id.btnthemUser);

        btnthem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hoten = edthoTen.getText().toString();
                String email = edtEmail.getText().toString();
                String user = edtUsername.getText().toString();
                String pass = edtpass.getText().toString();

                if (hoten.equals("") || email.equals("") || user.equals("") || pass.equals("")){
                    Toast.makeText(getContext(), "Vui lòng điền đủ thông tin", Toast.LENGTH_SHORT).show();

                }

                Receptionist receptionist = new Receptionist(hoten,email,user,pass);
                 receptionistDAO = new ReceptionistDAO(getContext());


                   long kq= receptionistDAO.insert(receptionist);
                if (kq>0){
                    Toast.makeText(getContext(), "Thêm Thành Công", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getContext(), "ko thêm đc", Toast.LENGTH_SHORT).show();
                }



            }


        });

        return view;
    }
}