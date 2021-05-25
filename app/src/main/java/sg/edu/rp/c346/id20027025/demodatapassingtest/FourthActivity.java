package sg.edu.rp.c346.id20027025.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        tvResult = findViewById(R.id.tvResult);
        Intent intentReceived = getIntent();
        double value = intentReceived.getDoubleExtra("value", 0.0);
        tvResult.setText("Double value received is: " + value);
    }
}