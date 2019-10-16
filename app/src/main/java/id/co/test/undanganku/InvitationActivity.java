package id.co.test.undanganku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.widget.TextView;

public class InvitationActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invitation);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        textView = findViewById(R.id.textView6);
        textView.setText(Html.fromHtml("Maha suci Allah yang telah menciptakan mahluk-Nya berpasang-pasangan.<br> Ya Allah, perkenankanlah kami merangkaikan kasih sayang yang Kau ciptakan diantara putra-putri kami<br><br><br> <b>Ririn Lisa Hardiyanti</b><br> Putri ke 1 dari Abdul Hamid & Eni Widi Astuti <br><br> dengan <br><br> <b>Park Chan Yeol</b><br> Putra ke 2 dari 2 Park Jin Young & Kim Mi Soo<br><br><br> Untuk melaksanankan syariat agama-Mu, mengikuti sunnah rasul-Mu <br> Dalam membentuk rumah tangga Sakinah, Mawaddah Wa Rahmahdalam ikatan pernikahan<br><br> Yang insya Allah akan diselenggarakan pada:<br> Minggu, 21-2-2021<br> 10.00<br> Ballroom Novotel<br> Lampung <br><br> Atas kehadiran dan doa restu Bapak/Ibu/Saudara/i kami ucapkan terima kasih <br> <br> Kami yang berbahagia <br><br> Abdul Hamid & Eni Widi Astuti <br> Park Jin Young & Kim Mi Soo"));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
