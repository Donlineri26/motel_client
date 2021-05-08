package com.example.motel;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class NomeraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nomera);
        TextView header = (TextView) findViewById(R.id.title_header);
        header.setText("НОМЕРА");
        TextView count_people = (TextView) findViewById(R.id.count_people);
        findViewById(R.id.button_plus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = Integer.parseInt(count_people.getText().toString());
                if (i < 2) {
                    count_people.setText(String.valueOf(i+1));
                }
            }
        });
        findViewById(R.id.button_minus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = Integer.parseInt(count_people.getText().toString());
                if (i > 0) {
                    count_people.setText(String.valueOf(i-1));
                }
            }
        });
    }

    public void getForm(View v) {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.form);
        linearLayout.setVisibility(View.VISIBLE);
        GridLayout nomera = (GridLayout) findViewById(R.id.nomera);
        final int childCount = nomera.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View view = nomera.getChildAt(i);
            view.setBackground(getDrawable(R.drawable.poly_nomera));
        }
        v.setBackground(getDrawable(R.drawable.poly_active_nomera));
    }

    public void sendForm(View v) {
        Toast toast = Toast.makeText(this, "complete!", Toast.LENGTH_LONG);
        toast.show();
    }
}