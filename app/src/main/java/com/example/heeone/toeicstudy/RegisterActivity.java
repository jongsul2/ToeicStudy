package com.example.heeone.toeicstudy;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by heeone on 2017-09-20.
 */

public class RegisterActivity extends AppCompatActivity {

    //EditText email = (EditText) findViewById(R.id.editText8);

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registerpage);

        final Button button = (Button) findViewById(R.id.button12);
        final EditText pw = (EditText) findViewById(R.id.editText6);
        final EditText pwconfirm = (EditText) findViewById(R.id.editText7);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        //비밀번호와 비밀번호확인이 일치하는지 검사
        pwconfirm.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //입력되는 텍스트에 변화가 있을때
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //입력이 끝났을 때
                String password = pw.getText().toString();
                String confirm = pwconfirm.getText().toString();

                if(password.equals(confirm)) {
                    pw.setBackgroundColor(Color.GREEN); //rgb(25,25,25)로 더 디테일하게 바꿀수 있음
                    pwconfirm.setBackgroundColor(Color.GREEN);
                }
                else {
                    pw.setBackgroundColor(Color.RED);
                    pwconfirm.setBackgroundColor(Color.RED);
                }
            }
            @Override
            public void afterTextChanged(Editable s) {
                //입력하기 전에
            }
        });
    }
}