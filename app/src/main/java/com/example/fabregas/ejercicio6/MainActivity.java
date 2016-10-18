package com.example.fabregas.ejercicio6;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView texto;
    private RadioButton radioButton;
    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = (TextView) findViewById(R.id.textView);
        checkBox = (CheckBox) findViewById(R.id.checkBox);



    }


    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.rojo:
                if (checked)
                    texto.setBackgroundColor(Color.RED);
                    break;
            case R.id.verde:
                if (checked)
                    texto.setBackgroundColor(Color.GREEN);
                    break;
            case R.id.negro:
                if(checked)
                    texto.setBackgroundColor(Color.BLACK);
                    break;
            case R.id.azul:
                if (checked)
                    texto.setTextColor(Color.BLUE);
                break;
            case R.id.amarillo:
                if (checked)
                    texto.setTextColor(Color.YELLOW);
                break;
            case R.id.blanco:
                if (checked)
                    texto.setTextColor(Color.WHITE);

        }
    }

}
