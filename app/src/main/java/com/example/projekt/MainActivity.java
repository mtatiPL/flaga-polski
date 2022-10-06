package com.example.projekt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
public int licznik;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void zlaOdpowiedz(View view) {
        Toast.makeText(MainActivity.this,R.string.zla_odp, Toast.LENGTH_SHORT ).show();
    }

    public void dobraOdpowiedz(View view) {
        view.setVisibility(View.INVISIBLE);
        licznik++;
        if(licznik==5){
            TextView pytanieTextView=findViewById(R.id.pytanieTextview);
            pytanieTextView.setText("z tych kolorów składa się \n flaga polski");

        }
    }
}