package com.example.dangnhap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtEmail, edtPassworld;
    Button btnLoggin;
    Account account;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        DangNhap();
    }

    private void DangNhap() {
        btnLoggin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = "admin";
                String password = "123456";


                if(edtEmail.getText().toString().equals(email) && edtPassworld.getText().toString().equals(password)){
                    Toast.makeText(MainActivity.this, R.string.logginsuccess, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                else Toast.makeText(MainActivity.this, R.string.logginerror, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void anhxa() {
        edtEmail = (EditText) findViewById(R.id.edtEmail);
        edtPassworld = (EditText) findViewById(R.id.edtPassword);
        btnLoggin = (Button) findViewById(R.id.btnLogin);
    }
}
