package com.example.screensforpetofy;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AddToCartAdapter extends RecyclerView.Adapter<AddToCartAdapter.MyViewHolder> {

    List<AddTocartResponse> cartList;
    Context context;
    cartDetails cartDetailsListener;
    int count = 0;
    //    data which will be send to backend
    List<String> cartData;


    public AddToCartAdapter(List<AddTocartResponse> cartList, Context context) {
        this.cartList = cartList;
        this.context = context;
    }


    @NonNull
    @Override
    public AddToCartAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.add_to_cart, parent, false);
        AddToCartAdapter.MyViewHolder vh = new AddToCartAdapter.MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull AddToCartAdapter.MyViewHolder holder, @SuppressLint("RecyclerView") int position) {
        try {
            count = cartList.get(position).getQty();

            Log.d("ADAPTERCART", "onBindViewHolder: " + count);
//            Log.d("ADAPTERCART", "onBindViewHolder: "+position);
            holder.qty_value.setText(String.valueOf(cartList.get(position).getQty()));
            holder.Desc_TV.setText(cartList.get(position).getDesc());
            holder.plus_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int ab = Integer.parseInt(holder.qty_value.getText().toString());
                    if (ab > 0) {
                        Log.d("COUNT", "if: " + holder.qty_value.getText().toString());
                        ab++;
                        holder.qty_value.setText(String.valueOf(ab));

                    } else {
                        Log.d("COUNT", "else : " + count);
                        Toast.makeText(context.getApplicationContext(), "plus button  is clicked", Toast.LENGTH_SHORT).show();
                    }

                }
            });

            holder.minus_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int b = Integer.parseInt(holder.qty_value.getText().toString());
                    if (b > 1) {
                        b--;
                        holder.qty_value.setText(String.valueOf(b));
                    } else {
                        Log.d("COUNT", "minus: " + count);
                        Toast.makeText(context.getApplicationContext(), "Cannot be zero", Toast.LENGTH_SHORT).show();
                    }
                }

            });

//            notifyItemChanged(position);


            holder.removeItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    int pp = holder.getAdapterPosition();
                    cartList.remove(pp);
//                   Log.d("COUNT", "minus: " + cartList.size());
                    if (cartList.size() > 0) {

                        notifyItemRemoved(pp);
                    } else {
//                       Redirect to product List activity
                        Intent intent = new Intent(context.getApplicationContext(), OrderHistory.class);
                        context.startActivity(intent);
//                       Toast.makeText(context.getApplicationContext(), "Cannot be zero", Toast.LENGTH_SHORT).show();
                    }
                }
            });


        } catch (Exception e) {
            e.printStackTrace();
        }

        Log.d("ABC", "onBindViewHolder: " + holder.qty_value.getText().toString());


    }


    @Override
    public int getItemCount() {
        return cartList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView Product_IV;
        TextView Desc_TV, qty_value, plus_button, minus_button;
        Button removeItem;
        ;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            Product_IV = itemView.findViewById(R.id.Product_IV);
            Desc_TV = itemView.findViewById(R.id.price);
            qty_value = itemView.findViewById(R.id.qty_value);
            plus_button = itemView.findViewById(R.id.plus_button);
            minus_button = itemView.findViewById(R.id.minus_button);
            removeItem = itemView.findViewById(R.id.removeItem);

            try {
                cartData.add(qty_value.getText().toString());
                cartData.add(Desc_TV.getText().toString());
                cartData.add(Product_IV.toString());

                Log.d("sample", "MyViewHolder: " + qty_value.getText().toString());
                cartDetailsListener.sendData(cartData);


            } catch (Exception e) {
                e.printStackTrace();
            }


        }
    }
}
