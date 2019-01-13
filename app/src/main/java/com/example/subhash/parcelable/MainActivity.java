package com.example.subhash.parcelable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openActivity(View view) {
        Pojo pojo=new Pojo();
        pojo.setName("Subhash");
        pojo.setLastname("Verma");
        pojo.setProfile("Android Developer");
        Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
        intent.putExtra("object",pojo);
        startActivity(intent);
    }
}
