package com.aldo.ep1comida;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

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
            case R.id.nav_menu:
                mostrarMenu();
                return true;
            case R.id.nav_carritoCompras:
                mostrarCarrito();
                return true;
            case R.id.nav_sugerencias:
                mostrarSugerencia();
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

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void mostrarMenu(){
        startActivity(new Intent(this, MainMenuActivity.class));
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