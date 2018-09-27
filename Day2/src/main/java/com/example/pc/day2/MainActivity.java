package com.example.pc.day2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private EditText firstEdit, secondEdit;
    private Button addButton, nextButton;
    private  String s1, s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstEdit=(EditText)findViewById(R.id.firstNumberId);
        secondEdit=(EditText)findViewById(R.id.secondNumberId);
        addButton=(Button)findViewById(R.id.addButtonId);
        nextButton=(Button)findViewById(R.id.nextButtonId);

        addButton.setOnClickListener(this);
        nextButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {


        if(v.getId()==R.id.addButtonId)
        {
            try{

                int num1 = Integer.parseInt(firstEdit.getText().toString());
                int num2 = Integer.parseInt(secondEdit.getText().toString());

                int result = num1 + num2;

                Toast.makeText(MainActivity.this, "Sum: "+result, Toast.LENGTH_SHORT).show();

            }catch (Exception e)
            {
                Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
            }
        }
        else if(v.getId()==R.id.nextButtonId)
        {
            startActivity(new Intent(getApplicationContext(), SecondPage.class));
        }
    }
}
