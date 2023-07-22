package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private EditText editText;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView2);
        editText=findViewById(R.id.editTextNumber);
    button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
             String s=editText.getText().toString();
             int kg=Integer.parseInt(s);
             double inPound=2.205*kg;
             textView.setText("value in pound is "+ inPound);

           }
       });
    }
}