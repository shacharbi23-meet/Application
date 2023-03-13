package com.example.application;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    private ListView listView;
    private ArrayList<User> users;
    private ArrayAdapter<User> Adapteruser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        listView.findViewById(R.id.list);
        users = new ArrayList<>();
        users.add(new User("Kohane", "k@h.com", "123"));
        Adapteruser = new UserArrayAdapter(this, R.layout.user_row, users);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.homemenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.signout){
            Intent in = new Intent(this, MainActivity.class);
            startActivity(in);
        }
        return true;
    }
}