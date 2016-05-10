package com.github.kubatatami.richedittext.styles.list;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;
import android.text.style.UpdateAppearance;
import android.text.style.UpdateLayout;

public class BottomMarginSpan implements LineHeightSpan.WithDensity, UpdateLayout, UpdateAppearance {

    private static final int VERTICAL_SPACING = 10;

    @Override
    public void chooseHeight(CharSequence text, int start, int end, int spanstartv, int v, Paint.FontMetricsInt fm, TextPaint paint) {
        fm.bottom += VERTICAL_SPACING * paint.density;
        fm.descent += VERTICAL_SPACING * paint.density;
    }

    @Override
    public void chooseHeight(CharSequence text, int start, int end, int spanstartv, int v, Paint.FontMetricsInt fm) {

    }
}