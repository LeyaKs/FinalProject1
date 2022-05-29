package basic.helper.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import java.util.Arrays;

public class Task1 extends AppCompatActivity {
    Array1 arr = new Array1();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task);
        TextView lvl1 = (TextView)findViewById(R.id.lvl1);
        lvl1.setOnClickListener(v -> {
            try {
                Intent intent = new Intent(Task1.this, Level1.class);
                intent.putExtra("key1", arr.strings1);
                intent.putExtra("task_key1", 0);
                startActivity(intent);
                finish();
            }catch (Exception e){

            }
        });
        TextView lvl2 = (TextView)findViewById(R.id.lvl2);
        lvl2.setOnClickListener(v -> {
            try {
                Intent intent = new Intent(Task1.this, Level1.class);
                intent.putExtra("key1", arr.strings2);
                intent.putExtra("task_key1", 1);
                startActivity(intent);
                finish();
            }catch (Exception e){

            }
        });
        TextView lvl3 = (TextView)findViewById(R.id.lvl3);
        lvl3.setOnClickListener(v -> {
            try {
                Intent intent = new Intent(Task1.this, Level1.class);
                intent.putExtra("key1", arr.strings3);
                intent.putExtra("task_key1", 2);
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
            Intent intent = new Intent(Task1.this, Tasks.class);
            startActivity(intent);
            finish();
        }catch (Exception e){

        }
    }
}