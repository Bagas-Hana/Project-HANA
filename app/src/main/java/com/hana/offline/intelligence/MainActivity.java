package com.hana.offline.intelligence;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.Gravity;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Menampilkan pesan selamat datang HANA
        TextView textView = new TextView(this);
        textView.setText("HANA: Offline Intelligence\nStatus: Sistem Aktif");
        textView.setGravity(Gravity.CENTER);
        textView.setTextSize(24);
        
        setContentView(textView);
    }
}