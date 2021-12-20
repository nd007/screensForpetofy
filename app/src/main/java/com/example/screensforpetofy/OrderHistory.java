package com.example.screensforpetofy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class OrderHistory extends AppCompatActivity {

    orderhistoryAdapter orderhistoryAdapter;
    RecyclerView orderhistroy_RV;
    List<OrderhistoryResponse> orderhistoryResponseList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_history);
        insertData();
        orderhistroy_RV=findViewById(R.id.orderhistroy_RV);
        orderhistoryAdapter=new orderhistoryAdapter(this, (ArrayList<OrderhistoryResponse>) orderhistoryResponseList);
        orderhistroy_RV.setLayoutManager(new LinearLayoutManager(this));
        orderhistroy_RV.setAdapter(orderhistoryAdapter);
        orderhistoryAdapter.notifyDataSetChanged();
    }





    public void insertData(){
        OrderhistoryResponse orderhistoryResponse=new OrderhistoryResponse("test","sdsadadad",3,"190");
        orderhistoryResponseList.add(orderhistoryResponse);
        OrderhistoryResponse orderhistoryResponse1=new OrderhistoryResponse("test1","sdsadadad",3,"190");
        orderhistoryResponseList.add(orderhistoryResponse1);

        OrderhistoryResponse orderhistoryResponse2=new OrderhistoryResponse("test2","sdsadadad",3,"190");
        orderhistoryResponseList.add(orderhistoryResponse2);

        OrderhistoryResponse orderhistoryResponse3=new OrderhistoryResponse("test3","sdsadadad",3,"190");
        orderhistoryResponseList.add(orderhistoryResponse3);

        OrderhistoryResponse orderhistoryResponse4=new OrderhistoryResponse("test4","sdsadadad",3,"190");
        orderhistoryResponseList.add(orderhistoryResponse4);

        OrderhistoryResponse orderhistoryResponse5=new OrderhistoryResponse("test5","sdsadadad",3,"190");
        orderhistoryResponseList.add(orderhistoryResponse5);

        OrderhistoryResponse orderhistoryResponse6=new OrderhistoryResponse("test6","sdsadadad",3,"190");
        orderhistoryResponseList.add(orderhistoryResponse6);

    }
}

