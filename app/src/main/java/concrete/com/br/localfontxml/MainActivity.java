package concrete.com.br.localfontxml;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView txtDirectJava = findViewById(R.id.txtDirectJava);
        TextView txtFamilyJava = findViewById(R.id.txtFamilyJava);
        TextView txtHtml = findViewById(R.id.txtHtml);

        Typeface font = ResourcesCompat.getFont(this, R.font.hanalei_regular);
        txtDirectJava.setTypeface(font);

        font = ResourcesCompat.getFont(this, R.font.my_font_family);
        txtFamilyJava.setTypeface(font);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            txtHtml.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>", Html.FROM_HTML_MODE_COMPACT));
        } else {
            txtHtml.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>"));
        }
    }
}
