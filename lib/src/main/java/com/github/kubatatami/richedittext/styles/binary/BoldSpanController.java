package com.github.kubatatami.richedittext.styles.binary;

import android.annotation.SuppressLint;
import android.graphics.Typeface;

import org.xml.sax.Attributes;

import java.util.Map;

public class BoldSpanController extends FontStyleSpanController {

    public BoldSpanController() {
        super(Typeface.BOLD, "b", "font-weight", "bold");
    }

    @Override
    public RichStyleSpan createSpanFromTag(String tag, Map<String, String> styleMap, Attributes attributes) {
        if (tag.equals("b") || tag.equals("strong") ||
                (tag.equals("span") && "bold".equals(styleMap.get("font-weight")))) {
            return new RichStyleSpan(typeface);
        }
        return null;
    }

    @Override
    RichStyleSpan createSpan() {
        return new RichBoldSpan();
    }

    public Class<?> spanFromEndTag(String tag) {
        if (tag.equals("b") || tag.equals("strong") || tag.equals("span")) {
            return clazz;
        }
        return null;
    }

    @SuppressLint("ParcelCreator")
    public static class RichBoldSpan extends RichStyleSpan {

        public RichBoldSpan() {
            super(Typeface.BOLD);
        }
    }

}
