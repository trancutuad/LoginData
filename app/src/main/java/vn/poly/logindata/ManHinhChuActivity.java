package vn.poly.logindata;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import vn.poly.logindata.ui.NguoidungActivity;


public class ManHinhChuActivity extends AppCompatActivity {


    ImageView nguoidung;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_chu);

        nguoidung = (ImageView)  findViewById(R.id.nguoidung);


        nguoidung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManHinhChuActivity.this, NguoidungActivity.class);
                startActivity(intent);
            }
        });
    }
        }







