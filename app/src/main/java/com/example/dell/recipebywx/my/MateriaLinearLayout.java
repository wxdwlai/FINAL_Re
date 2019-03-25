package com.example.dell.recipebywx.my;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.dell.recipebywx.R;

/**
 * Created by dell on 2019/3/25.
 */

public class MateriaLinearLayout extends LinearLayout {
    private int i;
    private EditText materiaEtv;
    private EditText numEtv;
    private ImageView deleteIv;
    public MateriaLinearLayout(Context context) {
        super(context);
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.layout_materia_item,null);
        materiaEtv = (EditText)view.findViewById(R.id.item_materia_tv);
        numEtv = (EditText)view.findViewById(R.id.item_materia_num_tv);
        deleteIv = (ImageView)view.findViewById(R.id.item_materia_delete_iv);
        addView(view);
    }

    public EditText getMateriaEtv() {
        return materiaEtv;
    }

    public void setMateriaEtv(EditText materiaEtv) {
        this.materiaEtv = materiaEtv;
    }

    public EditText getNumEtv() {
        return numEtv;
    }

    public void setNumEtv(EditText numEtv) {
        this.numEtv = numEtv;
    }

    public ImageView getDeleteIv() {
        return deleteIv;
    }

    public void setDeleteIv(ImageView deleteIv) {
        this.deleteIv = deleteIv;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setVisible(boolean visible) {
        if (visible)
            deleteIv.setVisibility(VISIBLE);
        else deleteIv.setVisibility(GONE);
    }
}
