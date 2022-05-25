package com.aldo.ep1comida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.aldo.ep1comida.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private ActivityLoginBinding binding;

    private EditText nombre, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_login);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnIniciarSesion.setOnClickListener(this);
        nombre= (EditText) findViewById(R.id.editTextusuario);
        pass = (EditText) findViewById(R.id.editTextclave);
        Button btnlogin = findViewById(R.id.btnIniciarSesion);
        btnlogin.setOnClickListener(this);





    }

    @Override
    public void onClick(View view) {
        String userName =nombre.getText().toString();
        String userPass = pass.getText().toString();

        if (userName=="" || userPass ==""){
            Toast.makeText(this, "Cree un usuario y contraseña", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, RegistroActivity.class));
        }else{
            startActivity(new Intent(this, MainActivity.class));
        }
    }


    public void registro(View view) {
        startActivity(new Intent(this, RegistroActivity.class));
    }
}