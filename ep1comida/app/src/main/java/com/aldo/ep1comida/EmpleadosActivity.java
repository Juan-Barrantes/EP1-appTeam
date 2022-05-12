package com.aldo.ep1comida;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
//import com.aldo.ep1comida.databinding.ActivityContactoBinding;

public class EmpleadosActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_iniciar, menu);
        return true;
    }

    //Control de el menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.nav_home:
                mostrarHome();
                return true;
            case R.id.nav_settings:
                mostrarSetting();
                return true;
            case R.id.nav_perfil:
                mostrarPerfil();
                return true;
            case R.id.nav_liked:
                mostrarLiked();
                return true;
            case R.id.nav_carritoCompras:
                mostrarCarrito();
                return true;
            case R.id.nav_sobre_nosotros:
                mostrarAbout();
                return true;
            case R.id.nav_contacto:
                mostrarContacto();
                return true;

            case R.id.nav_empleados:
                mostrarEmpleados();
                return true;
            case R.id.nav_terminos_condiciones:
                mostrarTerminos();
                return true;
            case R.id.nav_sugerencias:
                mostrarSugerencia();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void mostrarHome(){
        startActivity(new Intent(this, HomeActivity.class));
    }
    private void mostrarSetting(){
        startActivity(new Intent(this, SettingActivity.class));
    }
    private void mostrarPerfil(){
        startActivity(new Intent(this, PerfilActivity.class));
    }
    private void mostrarLiked(){
        startActivity(new Intent(this, LikedActivity.class));
    }
    private void mostrarCarrito(){
        startActivity(new Intent(this, CarritoActivity.class));
    }
    private void mostrarAbout(){
        startActivity(new Intent(this, NosotrosActivity.class));
    }
    private void mostrarContacto(){
        startActivity(new Intent(this, ContactosActivity.class));
    }
    private void mostrarEmpleados(){

        startActivity(new Intent(this, EmpleadosActivity.class));
    }
    private void mostrarTerminos(){
        startActivity(new Intent(this, TerminosActivity.class));
    }
    private void mostrarSugerencia(){
        startActivity(new Intent(this, SugerenciaActivity.class));
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_contacto);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}