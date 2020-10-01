package com.example.toastandtextedit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etFirst, etSecond;
    private Button btnAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFirst = findViewById(R.id.etFirst) ;
        etSecond= findViewById(R.id.etSecond) ;
        btnAdd = findViewById(R.id.btnAdd) ;



        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first, second, result;
                first = Integer.parseInt(etFirst.getText().toString());
                second = Integer.parseInt(etSecond.getText().toString());
                if(v.getId()==R.id.btnAdd){
                    result = first + second;
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Sum is : "+result,
                            Toast.LENGTH_LONG);

                    toast.show();
                    //set the position of toast
                    toast.setGravity(Gravity.TOP,0,50);
                }

                //display.setText("Button is clicked.");


            }
        });
    }
}