package ru.gb.android_lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * Создать проект со следующими пользовательскими элементами:
 * TextView, EditText, Button, Switch, CheckBox, ToggleButton.
 * Для работы использовать LinearLayout. Использовать различные шрифты, цвета, размеры, прочие атрибуты.
 * Создать ещё один макет (если не получается, то проект) с несколькими EditText,
 * где использовать атрибут inputType: text, textPersonName, phone, number, textPassword, textEmailAddress и другие значения.
 * Добавить в проект элемент CalendarView.
 * * Разобраться, что такое параметр ems.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}