package com.example.intent02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_F extends AppCompatActivity {
Button button_close_activity_f;
TextView textView_OutPutF;
Double c,f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f);

        button_close_activity_f=findViewById(R.id.button_close_activity_f);
        textView_OutPutF=findViewById(R.id.textview_output_f);

        Bundle bundle = this.getIntent().getExtras();
        if(bundle !=null){
            c = Double.parseDouble(bundle.getString("TEMP_C"));
            f = ((9.0*c)/5)+32;
            textView_OutPutF.setText("華氏溫度:"+f);
        }

        button_close_activity_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}