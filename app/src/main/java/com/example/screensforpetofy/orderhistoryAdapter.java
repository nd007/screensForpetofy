package com.example.screensforpetofy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class orderhistoryAdapter extends RecyclerView.Adapter<orderhistoryAdapter.MyViewHolder> {


    Context context;
    ArrayList<OrderhistoryResponse> orderhistoryList;

    public orderhistoryAdapter(Context context, ArrayList<OrderhistoryResponse> orderhistoryList) {
        this.context = context;
        this.orderhistoryList = orderhistoryList;
    }

    @NonNull
    @Override
    public orderhistoryAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       View v=LayoutInflater.from(parent.getContext()).inflate(R.layout.orderhistory_items,parent,false);
       MyViewHolder myViewHolder=new MyViewHolder(v);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull orderhistoryAdapter.MyViewHolder holder, int position) {
        holder.productname_TV.setText(orderhistoryList.get(position).getProductName());
//        holder.desc_TV.setText(orderhistoryList.get(position).getShort_desc());
        holder.priceOfProduct.setText(orderhistoryList.get(position).getPrice());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"click performed",Toast.LENGTH_SHORT).show();
            }
        });
//        holder.Qty.setText(orderhistoryList.get(position).getQuantity());

    }

    @Override
    public int getItemCount() {
        return orderhistoryList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView productname_TV,desc_TV,priceOfProduct,Qty;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            productname_TV=itemView.findViewById(R.id.productname_TV);
            desc_TV=itemView.findViewById( R.id.price);
            priceOfProduct=itemView.findViewById(R.id.priceOfProduct);
            Qty=itemView.findViewById(R.id.Qty);



        }
    }
}
