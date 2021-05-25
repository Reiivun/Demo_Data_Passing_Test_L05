package sg.edu.rp.c346.id20027025.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvResult = findViewById(R.id.tvResult);
        Intent intentReceived = getIntent();
        int value = intentReceived.getIntExtra("value", 0);
        tvResult.setText("Integer value received is: " + value);

    }
}