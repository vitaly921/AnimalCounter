package com.example.admin.ravencounter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    //Объявление переменных на уровне класса
    private Button mRavenCounterButton;
    private Button mCatCounterButton;
    private int mCountRaven = 0;             //переменная-счётчик
    private int mCountCat = 0;               //переменная-счётчик
    private TextView mInfoTextView;
    private TextView mInfoText;

    //Инициализация переменных в методе onCreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mInfoTextView = findViewById(R.id.textView);
        mInfoText = findViewById(R.id.textView2);
        mRavenCounterButton = findViewById(R.id.button_counter_raven);
        mRavenCounterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mInfoTextView.setText("Я насчитал "+ ++mCountRaven + " ворон");
            }
        });

        mCatCounterButton = findViewById(R.id.button_counter_cat);
        mCatCounterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mInfoText.setText("Я насчитал "+ ++mCountCat + " котов");
            }
        });
    }

    //Самый простой вариант обработки нажатия на кнопку.
    public void onClick(View view) {
        mInfoTextView.setText("Кар-кар...");
        mInfoText.setText("Мяу миау, мррр..");

    }
}
