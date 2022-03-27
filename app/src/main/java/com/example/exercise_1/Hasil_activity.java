package com.example.exercise_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Hasil_activity extends AppCompatActivity {

    TextView task, jenis, time;

    String vtask, vjenis, vtime;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.nLogout)
        {
            Intent i = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        task = findViewById(R.id.hasilTask);
        jenis = findViewById(R.id.hslJenis);
        time = findViewById(R.id.hslTime);

        // Penggunaan Bundle
        Bundle bundle = getIntent().getExtras();

        vtask = bundle.getString("task");
        vjenis = bundle.getString("jenis");
        vtime = bundle.getString("time");

        task.setText(vtask);
        jenis.setText(vjenis);
        time.setText(vtime);

    }
}
