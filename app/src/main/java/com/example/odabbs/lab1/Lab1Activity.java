package com.example.odabbs.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Lab1Activity extends AppCompatActivity {

    EditText myEditText1;
    TextView myTextView1;
    Button myButton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab1);

        myEditText1 = (EditText)findViewById(R.id.myEditText1);
        myTextView1 = (TextView)findViewById(R.id.myTextView1);
        myButton1 = (Button)findViewById(R.id.myButton1);

    }

    public void onclick(View view){
        if(myEditText1.getText().toString() == ""){
            myTextView1.setText(R.string.no_text_entered);
        }
        else{
            myTextView1.setText(getString(R.string.text_entered, myEditText1.getText().toString()));
        }
    }
}
