package com.thishkt.a008;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void BMI_button(View v){

        EditText height = (EditText)findViewById(R.id.editTextTextPersonName);
        EditText weight = (EditText)findViewById(R.id.editTextTextPersonName2);

        Intent intent = new Intent(this, MainActivity2.class);
        Bundle bundle = new Bundle();
        bundle.putString("Height", height.getText().toString());
        bundle.putString("Weight", weight.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);//傳值至下一頁
    }
}