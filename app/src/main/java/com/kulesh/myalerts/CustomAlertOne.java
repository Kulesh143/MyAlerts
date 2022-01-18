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

public class CustomAlertOne extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        final AlertDialog.Builder dialog=new AlertDialog.Builder(getContext());
        LayoutInflater inflater=LayoutInflater.from(getContext());
        View view=inflater.inflate(R.layout.customlayoutone,null);
        dialog.setView(view);
        final AlertDialog alertDialog=dialog.create();
        Button btn=view.findViewById(R.id.btnOne);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Hello Errror!!!", Toast.LENGTH_SHORT).show();
                alertDialog.dismiss();
            }
        }

        )
        ;
        Button btn2=view.findViewById(R.id.btntwo);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Hello You are Right!!!!", Toast.LENGTH_SHORT).show();
                alertDialog.dismiss();
            }
        });
        return  alertDialog;
    }
}
