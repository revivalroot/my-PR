package com.cookandroid.ex_6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // 클래그 객체 변수
    CheckBox cb1, cb2;
    Switch sb1;
    RadioGroup rbg;
    RadioButton rb1, rb2, rb3, rb4, rb5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2. 객체변수에 위젯 연결
        cb1 = (CheckBox) findViewById(R.id.cb1);
        cb2 = (CheckBox) findViewById(R.id.cb2);

        sb1 = (Switch) findViewById(R.id.sb1);

        rbg = (RadioGroup) findViewById(R.id.rbg);
        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        rb3 = (RadioButton) findViewById(R.id.rb3);
        rb4 = (RadioButton) findViewById(R.id.rb4);
        rb5 = (RadioButton) findViewById(R.id.rb5);

        // 3. 이벤트 리스너
        cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                // 이벤트 동작 부분 구현

                if(b){
                    Toast.makeText(MainActivity.this, "아이폰 선택", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "아이폰 미선택", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                // 이벤트 동작 부분 구현

                if(b){
                    Toast.makeText(MainActivity.this, "안드로이드 선택", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "안드로이드 미선택", Toast.LENGTH_SHORT).show();
                }
            }
        });

        sb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                // 이벤트 동작 부분 구현

                if(b){
                    Toast.makeText(MainActivity.this, "스위치 on", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "스위치 off", Toast.LENGTH_SHORT).show();
                }
            }
        });

        rb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Toast.makeText(MainActivity.this, "rb1 on : "+b, Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "rb2 off: "+b, Toast.LENGTH_SHORT).show();
                }
            }
        });

        rbg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                // Toast.makeText(MainActivity.this, "i: "+i, Toast.LENGTH_SHORT).show();  // 선택된 radio 값의 id
                if(i==R.id.rb3){
                    Toast.makeText(MainActivity.this, "rb3 선택", Toast.LENGTH_SHORT).show();
                }
                else if(i==R.id.rb4){
                    Toast.makeText(MainActivity.this, "rb4 선택", Toast.LENGTH_SHORT).show();
                }
                else if(i==R.id.rb5){
                    Toast.makeText(MainActivity.this, "rb5 선택", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "잘못된 선택", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    
}
