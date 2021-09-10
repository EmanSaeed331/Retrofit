package com.example.emans.myapplication.Activty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import com.example.emans.myapplication.Adapter.UserAdapter;
import com.example.emans.myapplication.Models.User;
import com.example.emans.myapplication.Presnter.UserPresnter;
import com.example.emans.myapplication.R;
import com.example.emans.myapplication.UserView;

import java.util.List;

public class ListUser extends AppCompatActivity implements UserView {
UserPresnter userPresnter;
RecyclerView userRV;
UserAdapter userAdapter;
RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_user);
        userRV=findViewById(R.id.userRV);
        layoutManager=new LinearLayoutManager(this);
        userRV.setLayoutManager(layoutManager);
        userPresnter=new UserPresnter(this,this);
        userPresnter.getUser("");

    }

    @Override
    public void showUsers(List<User> users) {
        userAdapter=new UserAdapter(this,users);
        userRV.setAdapter(userAdapter);
        userAdapter.notifyDataSetChanged();

    }
}
