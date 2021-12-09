package com.alberto.a6dashboard.activities;

import androidx.fragment.app.FragmentActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;

import com.alberto.a6dashboard.R;
import com.alberto.a6dashboard.databinding.ActivityMapsBinding;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;


public class Maps_Activity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {

        //Le decimos que los estilos de mapa que queremos usar
        // estan en el recurso json que nos hemos traido
       try {
            boolean success = googleMap.setMapStyle(
                    MapStyleOptions.loadRawResourceStyle(this, R.raw.estilo)
            );
            if (!success) {
                Log.e("MAPAS", "Existe el recurso pero no lo cargamos bien");
            }
        } catch (Resources.NotFoundException e) {
            Log.e("MAPAS", "No Existe el recurso json ");
        }


            mMap = googleMap;

            // Add a marker in Sydney and move the camera
            LatLng sydney = new LatLng(-34, 151);
            mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));


            LatLng Teruel = new LatLng(40.33404075727316, -1.1011831903210934);
            mMap.addMarker(new MarkerOptions().position(Teruel).title("Marker in Teruel"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(Teruel));

            LatLng Teruel1 = new LatLng(40.33404075727316, -1.1011831903210934);
            mMap.addMarker(new MarkerOptions().position(Teruel1).title("Marker in Teruel"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(Teruel1));

        LatLng Teruel2 = new LatLng(40.333288338523595, -1.090668931381131);
        mMap.addMarker(new MarkerOptions().position(Teruel2).title("Marker in Teruel"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Teruel2));

        LatLng Teruel3 = new LatLng(40.3363143195119, -1.1022560744328744);
        mMap.addMarker(new MarkerOptions().position(Teruel3).title("Marker in Teruel"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Teruel3));

        LatLng Teruel4 = new LatLng(40.33404075727316, -1.1011831903210934);
        mMap.addMarker(new MarkerOptions().position(Teruel4).title("Marker in Teruel"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Teruel4));

        LatLng Teruel5 = new LatLng(40.341613548430246, -1.1082642227687014);
        mMap.addMarker(new MarkerOptions().position(Teruel5).title("Marker in Teruel"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Teruel5));

        LatLng Teruel6 = new LatLng(40.33536564820107, -1.1134140643199342);
        mMap.addMarker(new MarkerOptions().position(Teruel6).title("Marker in Teruel"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Teruel6));

        LatLng Teruel7 = new LatLng(40.33562735196545, -1.1141865405562923);
        mMap.addMarker(new MarkerOptions().position(Teruel7).title("Marker in Teruel"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Teruel7));

        LatLng Teruel8 = new LatLng(40.34462280187128, -1.125988260419938);
        mMap.addMarker(new MarkerOptions().position(Teruel8).title("Marker in Teruel"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Teruel8));

        LatLng Teruel9 = new LatLng(40.351883708269455, -1.1264174137109493);
        mMap.addMarker(new MarkerOptions().position(Teruel9).title("Marker in Teruel"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Teruel9));

        LatLng Teruel10 = new LatLng(40.36097509235341, -1.1105387358063075);
        mMap.addMarker(new MarkerOptions().position(Teruel10).title("Marker in Teruel"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Teruel10));


        }
    }
