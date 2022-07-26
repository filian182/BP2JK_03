package com.example.shortcut;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;

public class main extends Activity {

    private TextView tv;
    Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8;
    Toast toast; // instance dari kelas Toast

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        tv = (TextView) this.findViewById(R.id.marqueeText);
        tv.setSelected(true);

        btn_1 = findViewById(R.id.btn_SIMKOMPETEN);
        btn_2 = findViewById(R.id.btn_SIMPK);
        btn_3 = findViewById(R.id.btn_SIKI);
        btn_4 = findViewById(R.id.btn_SIMPAN);
        btn_5 = findViewById(R.id.btn_SIPASTI);
        btn_6 = findViewById(R.id.btn_SIKOMPAK);
        btn_7 = findViewById(R.id.btn_SIKAP);
        btn_8 = findViewById(R.id.btn_SIPBJ);


        btn_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                WebView.url = "https://simkompetensi.com/";
                Intent i = new Intent(main.this, WebView.class);
                startActivity(i);
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WebView.url = "https://simpk.pu.go.id/";
                Intent i = new Intent(main.this, WebView.class);
                startActivity(i);
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WebView.url = "https://siki.pu.go.id/";
                Intent i = new Intent(main.this, WebView.class);
                startActivity(i);
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WebView.url = "https://simpan.pu.go.id/";
                Intent i = new Intent(main.this, WebView.class);
                startActivity(i);
            }
       });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Context context = getApplicationContext();
                CharSequence text = "Layanan Belum Tersedia";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebView.url = "https://www.sikompak.xyz/#";
                Intent i = new Intent(main.this, WebView.class);
                startActivity(i);
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebView.url = "https://sikap.lkpp.go.id/";
                Intent i = new Intent(main.this, WebView.class);
                startActivity(i);
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebView.url = "https://sipbj.pu.go.id/2022/";
                Intent i = new Intent(main.this, WebView.class);
                startActivity(i);
            }
        });
    }



    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(R.drawable.icon_aplikasi)
                .setTitle("AKU PUPR")
                .setMessage("Anda yakin ingin keluar?")
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }

                })
                .setNegativeButton("Tidak", null)
                .show();
    }
}