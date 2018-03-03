package com.example.et_c112.clase3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    private ImageView iv1;
    private RadioGroup rg1;
    private RadioButton rb1, rb2, rb3, rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv1 = findViewById(R.id.imageView);
        rg1 = findViewById(R.id.radioButton);
        rb1 = findViewById(R.id.boton1);
        rb2 = findViewById(R.id.boton2);
        rb3 = findViewById(R.id.boton3);
        rb4 = findViewById(R.id.boton4);

        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                //Toast.makeText(getApplicationContext(),String.valueOf(i),Toast.LENGTH_LONG).show();
                switch (i)
                {
                    case R.id.boton1: iv1.setImageResource(R.drawable.brazil);break;
                    case R.id.boton2: iv1.setImageResource(R.drawable.espana);break;
                    case R.id.boton3: iv1.setImageResource(R.drawable.francia);break;
                    case R.id.boton4: iv1.setImageResource(R.drawable.peru);break;
                }
            }
        });

    }

}
