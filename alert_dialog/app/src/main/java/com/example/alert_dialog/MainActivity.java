package com.example.alert_dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        new AlertDialog.Builder(this)
                .setIcon(R.drawable.ic_sj)
                .setTitle("Be alert!")
                .setMessage("FOLLOW SOCIAL DISTANCING")
                .setNeutralButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(),"Hello",Toast.LENGTH_SHORT).show();
                            }
                        }).show();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}