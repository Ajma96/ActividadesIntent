package es.vcarmen.amacias.actividadesintent;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActividadesIntent extends AppCompatActivity
{
    private Button boton;

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_actividades_intent );

        boton = findViewById( R.id.boton );
        boton.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                /*Intent intent = new Intent( getApplication(), ResultadoActivity.class );
                intent.putExtra( "Nombre", "Alejandro Macías" );
                intent.putExtra( "Year"  , "" + Calendar.getInstance().get(Calendar.YEAR));
                intent.putExtra( "Provincia1", "Jaén" );
                intent.putExtra( "Provincia2", "Huelva" );
                intent.putExtra( "Provincia3", "ALmería" );

                startActivity( intent );*/

                /*Intent mIntent = new Intent( Intent.ACTION_VIEW );
                mIntent.setData( Uri.parse( "http://iesvirgendelcarmen.com" ) );*/

                /*Intent mIntent = new Intent( Intent.ACTION_WEB_SEARCH );
                mIntent.putExtra(  SearchManager.QUERY, "geo:0,0?z4&q=institutos" );*/

                /*Intent mIntent = new Intent( Intent.ACTION_DIAL );
                mIntent.setData( Uri.parse( "tel:023456789" ) );*/

                /*Intent mIntent = new Intent( Intent.ACTION_CALL );
                mIntent.setData( Uri.parse( "tel:023456789" ) );

                if ( ActivityCompat.checkSelfPermission(
                        ActividadesIntent.this, Manifest.permission.CALL_PHONE) !=
                        PackageManager.PERMISSION_DENIED )
                {
                    String[] listaPermisos = { Manifest.permission.CALL_PHONE };
                    ActivityCompat.requestPermissions( ActividadesIntent.this, listaPermisos , 1 );


                }*/

                /*Intent mIntent = new Intent( MediaStore.ACTION_IMAGE_CAPTURE );*/

                Intent mIntent = new Intent( Intent.ACTION_VIEW );
                mIntent.setData( Uri.parse( "content://contacts/people" ) );

                startActivity( mIntent );

            }
        });
    }

}
