package com.cookandroid.project4_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et1, et2;
    Button btnAdd, btnSub, btnMul, btnDiv;
    TextView tvResult;

    String num1, num2;

    Integer result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 위젯 할당
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);

        tvResult = (TextView) findViewById(R.id.tv_result);

        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul= findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        
        // 동작
        btnAdd.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                // 버튼 동작 부분 구현

                // 입력
                num1 = et1.getText().toString();
                num2 = et2.getText().toString();
                // 계산
                result = Integer.parseInt(num1) + Integer.parseInt(num2);
                // 계산 결과 표시
                tvResult.setText("계산 결과 : " + result.toString());
                return false;
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 버튼 동작 부분 구현

                // 입력
                num1 = et1.getText().toString();
                num2 = et2.getText().toString();
                // 계산
                result = Integer.parseInt(num1) - Integer.parseInt(num2);
                // 계산 결과 표시
                tvResult.setText("계산 결과 : " + result.toString());
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 버튼 동작 부분 구현

                // 입력
                num1 = et1.getText().toString();
                num2 = et2.getText().toString();
                // 계산
                result = Integer.parseInt(num1) * Integer.parseInt(num2);
                // 계산 결과 표시
                tvResult.setText("계산 결과 : " + result.toString());
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 버튼 동작 부분 구현

                // 입력
                num1 = et1.getText().toString();
                num2 = et2.getText().toString();
                // 계산
                result = Integer.parseInt(num1) / Integer.parseInt(num2);
                // 계산 결과 표시
                tvResult.setText("계산 결과 : " + result.toString());
            }
        });


    }
}
