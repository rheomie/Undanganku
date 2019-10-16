package id.co.test.undanganku;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void tombolInvitation(View view) {
        i = new Intent(this, InvitationActivity.class);
        startActivity(i);
    }

    public void tombolGalery(View view) {
        i = new Intent(this, GaleryActivity.class);
        startActivity(i);
    }

    public void tombolMap(View view) {
        Uri peta = Uri.parse("google.navigation:q=novotel+lampung");
        i = new Intent(Intent.ACTION_VIEW, peta);
        i.setPackage("com.google.android.apps.maps");
        startActivity(i);

    }
}
