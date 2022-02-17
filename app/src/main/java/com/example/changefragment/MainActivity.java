package com.example.changefragment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
                findFragmentById(R.id.detailFragment);
        if(fragment!=null&&fragment.isVisible())
            fragment.setSelectedItem(data);
        else
        {
            Intent intent=new Intent(getApplicationContext(),DetailActivity.class);
            intent.putExtra(DetailActivity.SELECTED_ITEM,data);
            startActivity(intent);
        }
    }
}