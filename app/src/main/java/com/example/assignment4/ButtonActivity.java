package com.example.assignment4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_button);
        Button btnCustom=findViewById(R.id.btn_custom);
        Button btnExpand=findViewById(R.id.btn_expndable);

        btnCustom.setOnClickListener(v->{
            Intent intent=new Intent(ButtonActivity.this,MainActivity.class);
            startActivity(intent);
        });

        btnExpand.setOnClickListener(v->{
            Intent intent=new Intent(ButtonActivity.this,ExpandableListActivity.class);
            startActivity(intent);
        });
    }
}