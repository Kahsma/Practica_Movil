package com.edu.javeriana;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
import android.app.Activity;
import android.os.Bundle;
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
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int res = Integer.parseInt(binding.entrada.getText().toString());
                if (numeroAleatorio != res) {
                    cont++;
                    binding.respuesta.setText("Vas: " + cont + " Intentos!");
                    Toast.makeText(getBaseContext(),"Fallaste",Toast.LENGTH_SHORT).show();



                }else {
                    //corre
                }

            }

            });

    }
}