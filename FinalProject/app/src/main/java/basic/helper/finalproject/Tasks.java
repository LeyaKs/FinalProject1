package basic.helper.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Tasks extends AppCompatActivity {

    Array1 total_arr = new Array1();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tasks);
        TextView button_back = (TextView)findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Tasks.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }catch (Exception e){

                }
            }
        });
        TextView task1 = (TextView)findViewById(R.id.task1);
        TextView task2 = (TextView)findViewById(R.id.task2);
        TextView task3 = (TextView)findViewById(R.id.task3);
        TextView task4 = (TextView)findViewById(R.id.task4);
        TextView task5 = (TextView)findViewById(R.id.task5);
        TextView task6 = (TextView)findViewById(R.id.task6);
        task1.setOnClickListener(v -> {
            try {
                Intent intent = new Intent(Tasks.this, Task1.class);
                startActivity(intent);
                finish();
            }catch (Exception e){

            }
        });
        task2.setOnClickListener(v -> {
            try {
                Intent intent = new Intent(Tasks.this, Level1.class);
                intent.putExtra("key1", total_arr.strings10);
                intent.putExtra("task_key1", 3);
                startActivity(intent);
                finish();
            }catch (Exception e){

            }
        });
        task3.setOnClickListener(v -> {
            try {
                Intent intent = new Intent(Tasks.this, Level1.class);
                intent.putExtra("key1", total_arr.strings11);
                intent.putExtra("task_key1", 4);
                startActivity(intent);
                finish();
            }catch (Exception e){

            }
        });
        task4.setOnClickListener(v -> {
            try {
                Intent intent = new Intent(Tasks.this, Level1.class);
                intent.putExtra("key1", total_arr.strings12);
                intent.putExtra("task_key1", 5);
                startActivity(intent);
                finish();
            }catch (Exception e){

            }
        });
        task5.setOnClickListener(v -> {
            try {
                Intent intent = new Intent(Tasks.this, Level1.class);
                intent.putExtra("key1", total_arr.strings13);
                intent.putExtra("task_key1", 6);
                startActivity(intent);
                finish();
            }catch (Exception e){

            }
        });
        task6.setOnClickListener(v -> {
            try {
                Intent intent = new Intent(Tasks.this, Level1.class);
                intent.putExtra("key1", total_arr.strings14);
                intent.putExtra("task_key1", 7);
                startActivity(intent);
                finish();
            }catch (Exception e){

            }
        });
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    @Override
    public void onBackPressed() {
        try {
            Intent intent = new Intent(Tasks.this, MainActivity.class);
            startActivity(intent);
            finish();
        }catch (Exception e){

        }
    }
}