package ru.gb.android_lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

/**
 * Создать проект со следующими пользовательскими элементами:
 * TextView+, EditText+, Button+, Switch+, CheckBox+, ToggleButton+.
 * Для работы использовать LinearLayout. Использовать различные шрифты, цвета, размеры, прочие атрибуты.
 *
 *  Создать ещё один макет (если не получается, то проект) с несколькими EditText,
 * где использовать атрибут inputType: text, textPersonName, phone, number, textPassword, textEmailAddress и другие значения.
 * Добавить в проект элемент CalendarView.
 * * Разобраться, что такое параметр ems.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("mylogs","MainActivity onCreate()");


        Button button = findViewById(R.id.btn_show);
        TextView textView = findViewById(R.id.textView);
        ToggleButton toggleButton = findViewById(R.id.toggleButton);
        EditText editText = findViewById(R.id.editText);
        TextView textViewInput = findViewById(R.id.textViewInput);
        CheckBox checkBox = findViewById(R.id.checkBox);
        Switch switchTest = findViewById(R.id.switchTest);
        switchTest.toggle();

        switchTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(switchTest.isChecked()){
                    switchTest.setLayoutDirection(View.LAYOUT_DIRECTION_LTR);
                } else {
                    switchTest.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
                }

            }
        });



        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean checked = ((CheckBox) view).isChecked();
                if(checked) {
                    Log.d("mylogs","editText.setFocusable(true)");

                    editText.setVisibility(View.VISIBLE);
                }
                else {
                    editText.setVisibility(View.INVISIBLE);
                }
            }
        });


        editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if(keyEvent.getAction() == KeyEvent.ACTION_DOWN &&
                        (keyCode == KeyEvent.KEYCODE_ENTER))
                {
                    // сохраняем текст, введённый до нажатия Enter в переменную
                    textViewInput.setText(editText.getText().toString());
                    return true;
                }
                return false;
            }
        });
        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean checked = ((ToggleButton) view).isChecked();
                if (checked){
                    textView.setText("Будильник включен");
                }
                else{
                    textView.setText("Будильник выключен");
                }
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("mylogs","onClick");
                if(textView.getVisibility() == View.VISIBLE){
                    textView.setVisibility(View.INVISIBLE);
                    Log.d("mylogs","TextView INVISIBLE");
                } else {
                    textView.setVisibility(View.VISIBLE);
                    Log.d("mylogs","TextView VISIBLE");
                }
            }
        });
    }
}