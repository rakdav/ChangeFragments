package com.example.changefragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ListFragment.OnFragmentSendDataListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onSendData(String data) {
        DetailFragment fragment=(DetailFragment) getSupportFragmentManager().
                findFragmentById(R.id.detail_fragment);
        if(fragment!=null) fragment.setSelectedItem(data);
    }
}