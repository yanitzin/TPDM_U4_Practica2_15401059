package mx.edu.ittepic.tpdm_u4_u5_practica_2_15401022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
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
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        mMap.mapType = GoogleMap.MAP_TYPE_TERRAIN
        val itt = LatLng(21.476913340719847, -104.86665880756551)
        mMap.addMarker(MarkerOptions().position(itt).title("Marcador ITT"))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(itt,15f))
        val CB = LatLng(21.477522355826366,-104.86684387995923)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).
            anchor(0f,1f).
            position(CB).
            title("Edificio Ciencias Basicas"))
        val LabComputo = LatLng(21.478025341397696,-104.86709600761836)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).
            anchor(0f,1f).
            position(LabComputo).
            title("Edificio Laboratorio de computo"))
        val uvp = LatLng(21.478148378590376,-104.86786903864515)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).
            anchor(0f,1f).
            position(uvp).
            title("Edificio Unidad de vinculacion - Unidad de postgrado"))
        val UD = LatLng(21.477746265492527,-104.86589706022136)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).
            anchor(0f,1f).
            position(UD).
            title("Edificio Unidad Departamental"))
        val LIIA = LatLng(21.478819052094792,-104.86750370343906)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).
            anchor(0f,1f).
            position(LIIA).
            title("Edificio LIIA"))
        val LICBI = LatLng(21.479648383553197,-104.86710405423052)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).
            anchor(0f,1f).
            position(LICBI).
            title("Edificio LICBI"))
        val EF = LatLng(21.478958824166114,-104.8667553670742)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).
            anchor(0f,1f).
            position(EF).
            title("Laboratorio de Ing. Civil e Ing. Electrica")
        val ES = LatLng(21.478684271034,-104.8663020737498)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).
            anchor(0f,1f).
            position(ES).
            title("Edificio S"))
        val EK = LatLng(21.478829718386308,-104.86618942095237)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).
            anchor(0f,1f).
            position(EK).
            title("Edificio K"))
        val ADMON = LatLng(21.47853519744301,-104.8655966527408)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).
            anchor(0f,1f).
            position(ADMON).
            title("Edificio Administrativo"))
        val CI = LatLng(21.47853519744301,-104.8655966527408)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).
            anchor(0f,1f).
            position(CI).
            title("Edificio Centro de Informacion"))
        val TA = LatLng(21.47853519744301,-104.8655966527408)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).
            anchor(0f,1f).
            position(TA).
            title("Edificio Taller de Arquitectura"))
        val EJ = LatLng(21.479104271132087,-104.86620551420015)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).
            anchor(0f,1f).
            position(EJ).
            title("Edificio J"))
        val EL = LatLng(21.47901940938462,-104.86572808099893)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).
            anchor(0f,1f).
            position(EL).
            title("Edificio L"))
        val EX = LatLng(21.478894612612763,-104.86512994838957)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).
            anchor(0f,1f).
            position(EX).
            title("Edificio X"))
        val EN = LatLng(21.47874984823575,-104.86477589681094)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).
            anchor(0f,1f).
            position(EN).
            title("Edificio N"))
        val EH = LatLng(21.47933389654743,-104.86612504792883)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).
            anchor(0f,1f).
            position(EH).
            title("Edificio H"))
        val EM = LatLng(21.479239051226358,-104.86553764415943)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).
            anchor(0f,1f).
            position(EM).
            title("Edificio M"))
        val EA = LatLng(21.47914420584432,-104.86510849072344)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).
            anchor(0f,1f).
            position(EA).
            title("Edificio A"))
        val EA2 = LatLng(21.479051856326848,-104.86480674220975)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).
            anchor(0f,1f).
            position(EA2).
            title("Edificio A'"))
        val EP = LatLng(21.479548546354152,-104.86580050068396)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).
            anchor(0f,1f).
            position(EP).
            title("Edificio P"))
        val EEE = LatLng(21.479541058595572,-104.86545851903665)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).
            anchor(0f,1f).
            position(EEE).
            title("Edificio EE"))
        val EG = LatLng(21.479393798912014,-104.8651205607142)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).
            anchor(0f,1f).
            position(EG).
            title("Edificio G"))
        val EG2 = LatLng(21.47925153095737,-104.86475980359837)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).
            anchor(0f,1f).
            position(EG2).
            title("Edificio G'"))
        val EQ = LatLng(21.47958598528443,-104.86503473000452)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).
            anchor(0f,1f).
            position(EQ).
            title("Edificio Q"))
        val EB = LatLng(21.47977817135869,-104.86576294974125)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).
            anchor(0f,1f).
            position(EB).
            title("Edificio B"))
        val EB2 = LatLng(21.47991544695543,-104.86612102464684)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).
            anchor(0f,1f).
            position(EB2).
            title("Edificio B'"))
        val EBG = LatLng(21.48134317740582,-104.86469307003254)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).
            anchor(0f,1f).
            position(EBG).
            title("Edificio Banda de Guerra"))
        val CVP = LatLng(21.481597758414466,-104.86532338915677)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).
            anchor(0f,1f).
            position(CVP).
            title("Cancha de voleibol de playa"))
        val CFB4 = LatLng(21.481747511745894,-104.8656211143549)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).
            anchor(0f,1f).
            position(CFB4).
            title("Cancha de Futbol 4"))
        val CM12 = LatLng(21.481747511754804,-104.86527510938805)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).
            anchor(0f,1f).
            position(CM12).
            title("Canchas Multiproposito"))
        val DD = LatLng(21.48224169663628,-104.86507930813012)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).
            anchor(0f,1f).
            position(DD).
            title("Domo"))
        val CBB = LatLng(21.48224169663628,-104.86507930813012)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).
            anchor(0f,1f).
            position(CBB).
            title("Cancha Béisbol"))
        val CFB3 = LatLng(21.481793204211158,-104.86309983791708)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).
            anchor(0f,1f).
            position(CFB3).
            title("Cancha de Futbol 3"))
        val CFB2 = LatLng(21.481014485345185,-104.86348875824234)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).
            anchor(0f,1f).
            position(CFB2).
            title("Cancha de Futbol 2"))
        val CFB1 = LatLng(21.48125409154352,-104.8641995436668)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).
            anchor(0f,1f).
            position(CFB1).
            title("Cancha de Futbol 1"))
    }
}