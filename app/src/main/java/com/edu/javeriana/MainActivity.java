package com.edu.javeriana;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.edu.javeriana.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    Random rand = new Random();
    int numeroAleatorio = rand.nextInt(101);
    int cont = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v("NumeroA","El numero es:" + numeroAleatorio);
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                boolean fin = false;

                int res = Integer.parseInt(binding.entrada.getText().toString());


                if(numeroAleatorio == res && cont < 3) {
                    binding.respuesta.setText("Bien Hecho!");
                    Toast.makeText(getBaseContext(),"Respuesta Correcta",Toast.LENGTH_SHORT).show();
                }
                if (numeroAleatorio != res && cont  <3 ) {
                    cont++;
                    binding.respuesta.setText("Vas: " + cont + " Intentos!");
                    Toast.makeText(getBaseContext(),"Fallaste",Toast.LENGTH_SHORT).show();





                }else if(cont >=3) {
                    binding.respuesta.setText("Perdiste!");
                    Toast.makeText(getBaseContext(), "No más intentos!", Toast.LENGTH_SHORT).show();


                }

            }

            });

    }


}