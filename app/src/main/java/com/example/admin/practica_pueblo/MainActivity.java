package com.example.admin.practica_pueblo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.MiPerfil:
                Intent a = new Intent(this,Perfil.class);
                startActivity(a);
                finish();
                break;

            case R.id.Cerrar:
                Intent b = new Intent(this,LoginActivity.class);
                startActivity(b);
                finish();
                break;
            case R.id.Principal:

                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
