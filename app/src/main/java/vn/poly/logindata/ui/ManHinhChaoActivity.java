package vn.poly.logindata.ui;

import android.content.Intent;
import android.os.CountDownTimer;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import vn.poly.logindata.R;


public class ManHinhChaoActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinhchao);

        CountDownTimer countDownTimer = new CountDownTimer(1500,1500) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                finish();
                startActivity(new Intent(getApplicationContext(),LoginActivity.class));
            }
        }.start();

    }
}
