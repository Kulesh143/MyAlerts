package com.kulesh.myalerts;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class AlertOne extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder alert=new AlertDialog.Builder(getContext());
        alert.setTitle("Wrong!!!");
        alert.setMessage("Show some errors Here!!");
        DialogInterface.OnClickListener listener=new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getContext(), "Alright!!!", Toast.LENGTH_SHORT).show();
            }
        };
        DialogInterface.OnClickListener listener2=new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getContext(), "Error", Toast.LENGTH_SHORT).show();
            }
        };
        alert.setPositiveButton("Ok",listener);
        alert.setNegativeButton("Cancel",listener2);
        return alert.create();
    }
}
