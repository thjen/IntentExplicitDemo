package com.example.qthjen.intentexplicitdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt = (Button) findViewById(R.id.bt);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Activity2.class);

                String array[] = {"Kotlin", "Java", "Go lang", "Swift", "CShap"};

                intent.putExtra("key1", "My string" + "\n");
                intent.putExtra("key2", 131313);
                intent.putExtra("key3", array);

                Student student = new Student("Q.ThjeN", 1998);

                intent.putExtra("key4",student);

                /** sử dụng bundle để gửi toàn bộ data **/
                Bundle bundle = new Bundle();
                String array2[] = {"Ruby", "PHP", "Javascript", "CSS", "HTML 5"};
                Student student1 = new Student("Tun Hentai", 1998);

                bundle.putString("bundle1", "Hi Q.ThjeN");
                bundle.putInt("bundle2", 123);
                bundle.putStringArray("bundle3",array2);
                bundle.putSerializable("bundle4", student1);

                intent.putExtra("key5", bundle);

                startActivity(intent);

            }
        });

    }
}
