package com.example.summaab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.summaab.R;

public class MainActivity extends AppCompatActivity {

    // статическая константа для метки при логировании
    // лучшее значение = имя класса и метод
    static final String TAG = "MainActivity";

    // объект кнопки на экране
    Button bt;
    // поля ввода на экране
    EditText et_a, et_b;
    // поле вывода на экране
    TextView tv;

    // метод создания активности в памяти (не отрисовка)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // вывод лога в logcat
        Log.e(TAG, "Загрузка");
        // определение пользовательсткого интерфейса
        setContentView(R.layout.activity_main);
        Log.e(TAG, "Работает");

        // получение объектов с экрана по ID
        // R -  папка ресурсов
        // id - раздел, где хранятся все id приложения
        // a,b,tv,bt -  id данные элементам в activity_main.xml
        et_a = (EditText) findViewById(R.id.a);
        et_b = (EditText) findViewById(R.id.b);
        tv = (TextView) findViewById(R.id.tv);
        bt = (Button) findViewById(R.id.bt);
        // подключение слушателя на кнопку
        // onClick сработает, когда пользователь нажмет на кнопку
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // получение теста, который ввел пользователь в поля ввода
                String s1 = et_a.getText().toString();
                String s2 = et_b.getText().toString();
                // если пользователь ввел данные в оба поля
                if (!(s1.equals("")||(s2.equals("")))){
                    // то преобразуем строки в числа
                    int a = Integer.parseInt(s1);
                    int b = Integer.parseInt(s2);
                    int c = a+b;
                    // создание строки "Результат = " + число
                    // getString - по имени ресурса получает строку
                    // string - папка string в папке res
                    String s = getString(R.string.str) + " = " + String.valueOf(c);
                    // установка строки в поле вывода
                    tv.setText(s);
                }
                else{
                    // если пользователь забыл ввести одно из значений
                    // вывести сообщение на экране
                    Toast.makeText(getApplicationContext(), "Введите все данные", Toast.LENGTH_LONG).show();
                }


            }
        });
    }
}