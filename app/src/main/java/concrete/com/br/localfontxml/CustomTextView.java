package concrete.com.br.localfontxml;

import android.content.Context;
import android.util.AttributeSet;

public class CustomTextView extends android.support.v7.widget.AppCompatTextView {

    public CustomTextView(Context context) {
        super(context);

        FontUtils.applyFont(this);
    }

    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        FontUtils.applyFont(this);
    }

    public CustomTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        FontUtils.applyFont(this);
    }
}
