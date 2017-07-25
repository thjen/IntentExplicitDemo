package com.example.qthjen.intentexplicitdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        tv = (TextView) findViewById(R.id.tv);

        Intent intent = getIntent();
        String data = intent.getStringExtra("key1");
        int number = intent.getIntExtra("key2", 13); // 13 là số mặc định nếu key sai
        String array1[] = intent.getStringArrayExtra("key3");

        Student student = (Student) intent.getSerializableExtra("key4");

        Bundle bundle = intent.getBundleExtra("key5");
        if ( bundle != null) {
            String name = bundle.getString("bundle1");
            int berthday = bundle.getInt("byndle2");
            String array[] = bundle.getStringArray("bundle3");
            Student student1 = (Student) bundle.getSerializable("bundle4");
        }

        tv.setText(data);
        tv.append(String.valueOf(number));
        tv.append("\n");
        tv.append(array1.length + "\n" +  array1[2]);

        tv.append("\n");
        tv.append(student.getName() + "\n" + student.getBerthday());
    }
}
