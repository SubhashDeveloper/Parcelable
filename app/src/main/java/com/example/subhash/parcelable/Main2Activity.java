package com.example.subhash.parcelable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Pojo pojo=getIntent().getParcelableExtra("object");
        Toast.makeText(this, "Hello "+pojo.getName(), Toast.LENGTH_SHORT).show();
        textView=findViewById(R.id.textView);
        textView.setText(pojo.getName()+" "+pojo.getLastname()+" "+pojo.getProfile());

    }
}
