package com.example.daquan.calculator;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    StringBuilder builder = new StringBuilder();//构建一个空的字符串构建器
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();  //隐藏标题栏
        Button button0 = (Button)findViewById(R.id.button0);
        button0.setOnClickListener(this);
        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(this);
        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);
        Button button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(this);
        Button button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(this);
        Button button5 = (Button)findViewById(R.id.button5);
        button5.setOnClickListener(this);
        Button button6 = (Button)findViewById(R.id.button6);
        button6.setOnClickListener(this);
        Button button7 = (Button)findViewById(R.id.button7);
        button7.setOnClickListener(this);
        Button button8 = (Button)findViewById(R.id.button8);
        button8.setOnClickListener(this);
        Button button9 = (Button)findViewById(R.id.button9);
        button9.setOnClickListener(this);
        Button button_point = (Button)findViewById(R.id.button_point);
        button_point.setOnClickListener(this);
        Button button_add = (Button)findViewById(R.id.button_add);
        button_add.setOnClickListener(this);
        Button button_minus = (Button)findViewById(R.id.button_minus);
        button_minus.setOnClickListener(this);
        Button button_multiply = (Button)findViewById(R.id.button_multiply);
        button_multiply.setOnClickListener(this);
        Button button_divide = (Button)findViewById(R.id.button_divide);
        button_divide.setOnClickListener(this);
        Button button_zero = (Button)findViewById(R.id.button_zero);
        button_zero.setOnClickListener(this);
        Button button_remove = (Button)findViewById(R.id.button_remove);
        button_remove.setOnClickListener(this);
        Button button_result = (Button)findViewById(R.id.button_result);
        button_result.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        double number;
        final TextView textView = (TextView)findViewById(R.id.textView);
        switch (view.getId()){
            case R.id.button1:
            case R.id.button2:
            case R.id.button3:
            case R.id.button4:
            case R.id.button5:
            case R.id.button6:
            case R.id.button7:
            case R.id.button8:
            case R.id.button9:
            case R.id.button0:
            case R.id.button_point:
            case R.id.button_add:
            case R.id.button_minus:
            case R.id.button_multiply:
            case R.id.button_divide:
                builder.append(((Button)view).getText());//向字符串追加数据
                textView.setText(builder);//textView显示字符串
                break;
            case R.id.button_zero:
                builder.delete( 0, builder.length());//归零清空字符串
                textView.setText(builder);
                break;
            case R.id.button_remove:
                builder.delete( builder.length()-1, builder.length());//减去字符串最后一位字符
                textView.setText(builder);
                break;
            case R.id.button_result:
                double result = Calculator.conversion(builder.toString());//用toString方法得到string对象
                builder.delete( 0, builder.length());
                textView.setText(String.valueOf(result));//将数据转换成字符串
                break;
            default:
        }
    }
}