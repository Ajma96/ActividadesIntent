package es.vcarmen.amacias.actividadesintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by matinal on 19/01/18.
 */

public class ResultadoActivity extends AppCompatActivity
{
    private TextView tvNombre, tvYear;

    @Override
    public void onCreate( @NonNull Bundle savedInstanceState )
    {
        super.onCreate(savedInstanceState );
        setContentView( R.layout.resultado );

        tvNombre = findViewById( R.id.tv_nombre );
        tvYear   = findViewById( R.id.tv_year );

        Intent intent = getIntent();

        String miNombre   = intent.getStringExtra( "Nombre" );
        String year       = intent.getStringExtra( "Year" );


        tvNombre.setText( miNombre );
        tvYear  .setText( year );
        tvYear  .append( "\n" + intent.getStringExtra( "provincia1" ) );
        tvYear  .append( "\n" + intent.getStringExtra( "provincia2" ) );
        tvYear  .append( "\n" + intent.getStringExtra( "provincia3" ) );
    }
}
