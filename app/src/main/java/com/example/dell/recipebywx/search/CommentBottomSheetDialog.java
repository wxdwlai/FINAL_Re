package com.example.dell.recipebywx.search;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetDialog;

public class CommentBottomSheetDialog extends BottomSheetDialog {
    public CommentBottomSheetDialog(@NonNull Context context) {
        super(context);
    }

    public CommentBottomSheetDialog(@NonNull Context context, int theme) {
        super(context, theme);

    }

    protected CommentBottomSheetDialog(@NonNull Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}
