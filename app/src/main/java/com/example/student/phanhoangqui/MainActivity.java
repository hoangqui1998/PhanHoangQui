package com.example.student.phanhoangqui;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText tK,mK;
        Button bnt,bnt2;
        final CheckBox cB;

        tK = (EditText) findViewById(R.id.tk);
        mK = (EditText) findViewById(R.id.mk);
        cB = (CheckBox) findViewById(R.id.cb);
        bnt = (Button) findViewById(R.id.bnt);
        bnt2 = (Button) findViewById(R.id.bnt2);

        bnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mK.getText().toString().trim().equalsIgnoreCase("")||tK.getText().toString().trim().equalsIgnoreCase(""))
                    Toast.makeText(MainActivity.this,"Khong đe trong",Toast.LENGTH_SHORT).show();
                else{
                    AlertDialog.Builder bu = new AlertDialog.Builder(MainActivity.this);
                    bu.setTitle("XN");

                    if(cB.isChecked()){
                        bu.setMessage("Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu");
                    }
                    else {
                        bu.setMessage("Chào mừng bạn đăng nhập hệ thống, thông tin của bạn không được lưu");
                    }
                    bu.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    });
                }
            }
        });
        bnt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder bu = new AlertDialog.Builder(MainActivity.this);
                bu.setTitle("Thong bao");
                bu.setMessage("Ban co muon thoat");
                bu.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                bu.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
            }
        });


    }
}
