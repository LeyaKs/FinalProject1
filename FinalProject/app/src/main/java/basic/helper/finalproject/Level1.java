package basic.helper.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class Level1 extends AppCompatActivity {

    Random random = new Random();
    public int your_answer = 1;
    public int val1;
    public int val2;
    public int val3;
    public int val4;
    int task;
    Array1 text = new Array1();
    int[] array1 = new int[63];
    int[] values = {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.levels);
        TextView text_level1 = findViewById(R.id.text_level);
        Button button_next = findViewById(R.id.button_next);
        CheckBox option1 = findViewById(R.id.option1);
        CheckBox option2 = findViewById(R.id.option2);
        CheckBox option3 = findViewById(R.id.option3);
        CheckBox option4 = findViewById(R.id.option4);
        TextView answer = findViewById(R.id.answer);
        option1.setTextColor(Color.BLACK);
        option2.setTextColor(Color.BLACK);
        option3.setTextColor(Color.BLACK);
        option4.setTextColor(Color.BLACK);
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Bundle str = getIntent().getExtras();
        array1 = str.getIntArray("key1");
        task = str.getInt("task_key1");
        text_level1.setText (text.task_level[task]);
        val1 = random.nextInt(11);
        option1.setText(array1[val1]);
        val2 = random.nextInt(11);
        while (val1 == val2){
            val2 = random.nextInt(11);
        }
        option2.setText(array1[val2]);
        val3 = random.nextInt(11);
        while ((val2 == val3) || (val1 == val3)){
            val3 = random.nextInt(11);
        }
        option3.setText(array1[val3]);
        val4 = random.nextInt(11);
        while ((val3 == val4) || (val2 == val4) || (val1 == val4)){
            val4 = random.nextInt(11);
        }
        option4.setText(array1[val4]);
        Button check_button = findViewById(R.id.check_button);
        check_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                your_answer = 1;
                if (option1.isChecked())
                    your_answer = your_answer * values[val1];
                if (option2.isChecked())
                    your_answer = your_answer * values[val2];
                if (option3.isChecked())
                    your_answer = your_answer * values[val3];
                if (option4.isChecked())
                    your_answer = your_answer * values[val4];
                if (!option1.isChecked() && values[val1] == 1)
                    your_answer = 0;
                if (!option2.isChecked() && values[val2] == 1)
                    your_answer = 0;
                if (!option3.isChecked() && values[val3] == 1)
                    your_answer = 0;
                if (!option4.isChecked() && values[val4] == 1)
                    your_answer = 0;
                if (values[val1] == 1)
                    option1.setTextColor(Color.GREEN);
                else option1.setTextColor(Color.RED);
                if (values[val2] == 1)
                    option2.setTextColor(Color.GREEN);
                else option2.setTextColor(Color.RED);
                if (values[val3] == 1)
                    option3.setTextColor(Color.GREEN);
                else option3.setTextColor(Color.RED);
                if (values[val4] == 1)
                    option4.setTextColor(Color.GREEN);
                else option4.setTextColor(Color.RED);
                if (your_answer == 1){
                    answer.setText("Правильно");
                    answer.setTextColor(Color.GREEN);

                }else {
                    answer.setText("Неправильно");
                    answer.setTextColor(Color.RED);
                }
                option1.setEnabled(false);
                option2.setEnabled(false);
                option3.setEnabled(false);
                option4.setEnabled(false);
            }
        });
        button_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                option1.setEnabled(true);
                option2.setEnabled(true);
                option3.setEnabled(true);
                option4.setEnabled(true);
                option1.setChecked(false);
                option2.setChecked(false);
                option3.setChecked(false);
                option4.setChecked(false);
                answer.setText("");
                option1.setTextColor(Color.BLACK);
                option2.setTextColor(Color.BLACK);
                option3.setTextColor(Color.BLACK);
                option4.setTextColor(Color.BLACK);
                val1 = random.nextInt(11);
                option1.setText(array1[val1]);
                val2 = random.nextInt(11);
                while (val1 == val2){
                    val2 = random.nextInt(11);
                }
                option2.setText(array1[val2]);
                val3 = random.nextInt(11);
                while ((val2 == val3) || (val1 == val3)){
                    val3 = random.nextInt(11);
                }
                option3.setText(array1[val3]);
                val4 = random.nextInt(11);
                while ((val3 == val4) || (val2 == val4) || (val1 == val4)){
                    val4 = random.nextInt(11);
                }
                option4.setText(array1[val4]);
            }
        });
    }
    @Override
    public void onBackPressed() {
        try {
            Intent intent = new Intent(Level1.this, Tasks.class);
            startActivity(intent);
            finish();
        }catch (Exception e){

        }
    }
}