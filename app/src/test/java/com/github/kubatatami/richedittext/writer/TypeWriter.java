package com.github.kubatatami.richedittext.writer;

import android.widget.EditText;

public class TypeWriter implements Writer {

    @Override
    public void write(EditText editText, String text) {
        for (int i = 0; i < text.length(); i++) {
            editText.getText().insert(editText.getSelectionStart(), text.substring(i, i + 1));
        }
    }

    @Override
    public void delete(EditText editText) {
        editText.getEditableText().delete(editText.getSelectionStart() - 1, editText.getSelectionStart());
    }
}
