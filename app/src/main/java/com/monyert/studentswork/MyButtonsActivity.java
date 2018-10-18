package com.monyert.studentswork;

import android.media.Image;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;

public class MyButtonsActivity extends MainMenu {
    private RadioButton gender;
    Boolean ON = true;
    Button button;
    ConstraintLayout constraintLayout;
    Toolbar toolbar;
    Boolean checked = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_buttons);
        gender = (RadioButton) findViewById(R.id.radio_woman);

        toolbar = findViewById(R.id.toolbar);
        constraintLayout = findViewById(R.id.constraintLayout2);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        setSupportActionBar(toolbar);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


    public void button_on_off(View v) {
        button = findViewById(R.id.toggleButton);
        if (ON) {
            button.setText(R.string.on);
            Toast.makeText(this, getString(R.string.toast_toggle_on), Toast.LENGTH_SHORT).show();
            ON = false;
        } else {
            button.setText(R.string.off);
            Toast.makeText(this, getString(R.string.toast_toggle_off), Toast.LENGTH_SHORT).show();
            ON = true;
        }

    }

    ImageButton img1;
    ImageButton img2;
    public void img_off(View v) {


        img1= findViewById(R.id.imageButtonON);
        img2= findViewById(R.id.imageButtonOFF);

        switch(v.getId()) {
            case R.id.imageButtonOFF:
                if(true) {

                    img2.setVisibility(View.INVISIBLE);
                    img1.setVisibility(View.VISIBLE);
                }
        }

    }

    public void img_on(View v) {


        img1= findViewById(R.id.imageButtonON);
        img2= findViewById(R.id.imageButtonOFF);
        switch(v.getId()) {
            case R.id.imageButtonON:
                if(true) {
                    img1.setVisibility(View.INVISIBLE);
                    img2.setVisibility(View.VISIBLE);
                }
        }

    }

    public void Dialog(String title, String message, String text) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.setPositiveButton(text, null);
        builder.create();
        builder.show();
    }

    public void onRadioButtonClicked(View view) {
        boolean marcado = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.radio_woman:
                if (marcado) {
                    Dialog(getString(R.string.radio_alert), getString(R.string.click_alert_woman), getString(R.string.acept));
                    //Sin actividad de momento
                }
                break;

            case R.id.radio_man:
                if (marcado) {
                    Dialog(getString(R.string.radio_alert), getString(R.string.click_alert_man), getString(R.string.acept));
                    //Sin actividad de momento
                }
                break;
        }
    }


    public void switch_on_off(View view) {

        if(checked){
            constraintLayout.setVisibility(View.VISIBLE);
            checked = false;
            Toast.makeText(this, "Seleccionat Visible ", Toast.LENGTH_SHORT).show();
        }
        else{
            constraintLayout.setVisibility(View.INVISIBLE);
            checked = true;
            Toast.makeText(this, "Seleccionat Invisible ", Toast.LENGTH_SHORT).show();
        }
    }
}


