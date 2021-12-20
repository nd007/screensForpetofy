package com.example.screensforpetofy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements cartDetails {

    RecyclerView addToCart_RV;
    AddToCartAdapter addToCartAdapter;
    Button cart_continue;
    List<AddTocartResponse> addTocartResponseList=new ArrayList<>();;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addToCart_RV=findViewById(R.id.addToCart_RV);
        cart_continue=findViewById(R.id.cart_continue);
        addData();
        addToCartAdapter=new AddToCartAdapter(addTocartResponseList,this);
        addToCart_RV.setLayoutManager(new LinearLayoutManager(this));
        addToCart_RV.setAdapter(addToCartAdapter);

        Log.d("Mainactivity", "onCreate: "+addToCartAdapter.cartData);


        addToCartAdapter.notifyDataSetChanged();
//        addToCart_RV.notifyAll();



    }

    public void addData(){
        AddTocartResponse addTocartResponse=new AddTocartResponse("jjfajsfjalkjdfla","dsfdasadsfdsf",3);
        addTocartResponseList.add(addTocartResponse);

        AddTocartResponse addTocartResponse1=new AddTocartResponse("aaaaaaaaaaaa","wwwwwwwwwwww",1);
        addTocartResponseList.add(addTocartResponse1);



        AddTocartResponse addTocartResponse2=new AddTocartResponse("aaaaaaaaaaaa","wwwwwwwwwwww",9);
        addTocartResponseList.add(addTocartResponse2);


        AddTocartResponse addTocartResponse3=new AddTocartResponse("aaaaaaaaaaaa","wwwwwwwwwwww",2);
        addTocartResponseList.add(addTocartResponse3);


        AddTocartResponse addTocartResponse4=new AddTocartResponse("aaaaaaaaaaaa","wwwwwwwwwwww",4);
        addTocartResponseList.add(addTocartResponse4);


        AddTocartResponse addTocartResponse5=new AddTocartResponse("aaaaaaaaaaaa","wwwwwwwwwwww",60);
        addTocartResponseList.add(addTocartResponse5);



    }

    @Override
    public void sendData(List<String> dd) {
        List<String> a=dd;
        Log.d("SEND_DATA", "sendData: "+dd.size());
    }
}