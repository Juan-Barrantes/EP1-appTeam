package com.aldo.ep1comida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.aldo.ep1comida.databinding.ActivityMainMenuBinding;
import com.aldo.ep1comida.fragments.HomeFragment;
import com.aldo.ep1comida.fragments.LikedFragment;
import com.aldo.ep1comida.fragments.PerfilFragment;
import com.aldo.ep1comida.fragments.SearchFragment;
import com.aldo.ep1comida.fragments.SettingsFragment;

public class MainMenuActivity extends AppCompatActivity implements View.OnClickListener {
    private ActivityMainMenuBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        binding = ActivityMainMenuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnPerfil.setOnClickListener(this);
        binding.btnLiked.setOnClickListener(this);
        binding.btnHome.setOnClickListener(this);
        binding.btnSearch.setOnClickListener(this);
        binding.btnSetting.setOnClickListener(this);

        mostrarSearch();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnPerfil:
                mostrarPerfil();
                break;
            case R.id.btnLiked:
                mostrarLiked();
                break;
            case R.id.btnHome:
                mostrarHome();
                break;
            case R.id.btnSearch:
                mostrarSearch();
                break;
            case R.id.btnSetting:
                mostrarSettings();
                break;
        }
    }

    private void mostrarSettings() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new SettingsFragment())
                .commit();
    }
    private void mostrarSearch() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new SearchFragment())
                .commit();
    }
    private void mostrarHome() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new HomeFragment())
                .commit();
    }
    private void mostrarLiked() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new LikedFragment())
                .commit();
    }
    private void mostrarPerfil() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new PerfilFragment())
                .commit();
    }
}