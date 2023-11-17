package com.example.x.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.x.DAO.TypeDAO;
import com.example.x.R;
import com.example.x.model.Type;

import java.util.ArrayList;

public class TypeAdapter extends RecyclerView.Adapter<TypeAdapter.viewHolder>{
    private Context context;
    private ArrayList<Type> arrayList;
    TypeDAO typeDAO;
    public TypeAdapter(Context context, ArrayList<Type> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
        typeDAO = new TypeDAO(context);
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_type,null);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        Type type = arrayList.get(position);
        holder.tvIdType.setText(""+type.getId());
        holder.tvNameType.setText(type.getName());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        TextView tvIdType,tvNameType;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            tvIdType = itemView.findViewById(R.id.tvIdType);
            tvNameType = itemView.findViewById(R.id.tvNameType);
        }
    }
}
