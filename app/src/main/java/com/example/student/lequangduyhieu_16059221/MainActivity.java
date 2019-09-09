package com.example.student.lequangduyhieu_16059221;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edttaikhoan,edtmatkhau;
    Button btndangnhap, btnthoat;
    CheckBox cbluuthongtin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_le_quang_duy_hieu_16059221);
        AnhXa();
        Thoat();
        cbluuthongtin.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Toast.makeText(MainActivity.this, "Chào mừng bạn đăng nhập hệ thống, thông tin bạn đã được lưu", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Chào mừng bạn đăng nhập hệ thống, thông tin bạn không được lưu", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void Thoat() {
        btnthoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this, android.R.style.Theme_DeviceDefault_Light_Dialog);
                builder.setTitle("Bạn muốn thoát không ?");
                builder.setIcon(android.R.drawable.ic_dialog_alert);
                builder.setPositiveButton("Co", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        onBackPressed();
                    }
                });
                builder.setNegativeButton("Khong", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                builder.show();
            }
        });
    }


    private void AnhXa() {
        edttaikhoan = (EditText)findViewById(R.id.edttaikhoan);
        edtmatkhau = (EditText)findViewById(R.id.edtmatkhau);
        btndangnhap = (Button) findViewById(R.id.btndangnhap);
        btnthoat = (Button) findViewById(R.id.btnthoat);
        cbluuthongtin = (CheckBox) findViewById(R.id.cbluuthongtin);
    }


}
