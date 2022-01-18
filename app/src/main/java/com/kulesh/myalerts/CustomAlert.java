package com.kulesh.myalerts;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class CustomAlert extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        final AlertDialog.Builder dialog=new AlertDialog.Builder(getContext());
        LayoutInflater layoutInflater=LayoutInflater.from(getContext());
        View view=layoutInflater.inflate(R.layout.custom_alert,null);
        dialog.setView(view);
        final  AlertDialog alertDialog=dialog.create();
        Button btn=(Button) view.findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "HelLo Error!", Toast.LENGTH_SHORT).show();
                alertDialog.dismiss();
            }
        });return alertDialog;
    }
}
