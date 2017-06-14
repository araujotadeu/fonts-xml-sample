package concrete.com.br.localfontxml;

import android.graphics.Typeface;
import android.widget.TextView;

public abstract class FontUtils {

    public static void applyFont(TextView view) {
        Typeface font = Typeface.createFromAsset(
                view.getContext().getAssets(),
                "fonts/Arizonia-Regular.ttf");
        view.setTypeface(font);
    }

}
