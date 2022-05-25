package com.aldo.ep1comida;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class HomeActivity extends YouTubeBaseActivity implements View.OnClickListener {
    String api_key = "AIzaSyAcltS4IZPkyCSRRqj1cTRP3-qdmkPTA4I";
    YouTubePlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageButton mbtnPerfil = findViewById(R.id.btnPerfil);
        ImageButton mbtnLiked = findViewById(R.id.btnLiked);
        ImageButton mbtnHome = findViewById(R.id.btnHome);
        ImageButton mbtnSearch = findViewById(R.id.btnSearch);
        ImageButton mbtnSetting = findViewById(R.id.btnSetting);

        mbtnPerfil.setOnClickListener(this);
        mbtnLiked.setOnClickListener(this);
        mbtnHome.setOnClickListener(this);
        mbtnSearch.setOnClickListener(this);
        mbtnSetting.setOnClickListener(this);

        leerVideo();
    }
    private void leerVideo() {
        YouTubePlayerView ytPlayer = (YouTubePlayerView)findViewById(R.id.ytPlayer);
        ytPlayer.initialize(api_key,
                new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                        player = youTubePlayer;
                        mostrarVideo();
                    }
                    @Override
                    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                    }
                });
    }

    private void mostrarVideo() {
        player.loadVideo("vSKfyhM0fDQ"); //este codigo está en los videos del yutuf, presionas compartir y sale
        player.play();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_iniciar, menu);
        return true;
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnPerfil:
                startActivity(new Intent(this, PerfilActivity.class));
                break;
            case R.id.btnLiked:
                startActivity(new Intent(this, LikedActivity.class));
                break;
            case R.id.btnHome:
                //startActivity(new Intent(this, HomeActivity.class));
                break;
            case R.id.btnSearch:
                startActivity(new Intent(this, CartillaActivity.class));
                break;
            case R.id.btnSetting:
                startActivity(new Intent(this, SettingActivity.class));
                break;
        }
    }

    //Control de el menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.nav_menu:
                mostrarHome();
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
        //startActivity(new Intent(this, AboutActivity.class));
    }
    private void mostrarContacto(){
        startActivity(new Intent(this, ContactosActivity.class));
    }
    private void mostrarEmpleados(){
        //startActivity(new Intent(this, EmpleadosActivity.class));
    }
    private void mostrarTerminos(){
        //startActivity(new Intent(this, TerminosActivity.class));
    }
    private void mostrarSugerencia(){
        startActivity(new Intent(this, SugerenciaActivity.class));
    }
}