package com.kulesh.myalerts;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class Alert extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder alert=new AlertDialog.Builder(getContext());
        alert.setTitle("Wrong!!!");
        alert.setMessage("You have entered wrong values!");
        DialogInterface.OnClickListener onClickListener=new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getContext(), "Alright", Toast.LENGTH_SHORT).show();
            }
        };
        DialogInterface.OnClickListener onClickListener2=new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getContext(), "Cancel", Toast.LENGTH_SHORT).show();
            }
        };
        alert.setPositiveButton("OK",onClickListener);
        alert.setNegativeButton("Cancel",onClickListener2);
        return  alert.create();

    }
}
