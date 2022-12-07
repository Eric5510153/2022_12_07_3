package com.example.intent02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
   Button button_CtoF;
   EditText editTextInput_c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_CtoF=findViewById(R.id.button_ctof);
        editTextInput_c =findViewById(R.id.edittext_input_c);

        button_CtoF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Activity_F.class);
                Bundle b = new Bundle();
                b.putString("TEMP_C",editTextInput_c.getText().toString());

                i.putExtras(b);
                startActivity(i);
            }
        });











    }
}