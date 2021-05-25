package sg.edu.rp.c346.id20027025.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tvResult = findViewById(R.id.tvResult);
        Intent intentReceived = getIntent();
        char value = intentReceived.getCharExtra("value", 'a');
        tvResult.setText("Character value received is: " + value);
    }
}