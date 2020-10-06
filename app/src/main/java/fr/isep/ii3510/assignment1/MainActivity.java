package fr.isep.ii3510.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity<Public> extends AppCompatActivity {
     EditText EditText;
     TextView TextView;
     Button Button;
     Button fc;
     Button fs;
     int color [];
    int size [];

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        color= new int[] {Color.BLACK, Color.GREEN,  Color.GRAY, Color.BLUE, Color.RED, Color.YELLOW, Color.CYAN };
        size= new int[] {10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80};

        EditText=(EditText) findViewById(R.id.EditText);
        TextView=(TextView) findViewById(R.id.TextView);
        Button= (Button) findViewById(R.id.Button);
        fc= (Button) findViewById(R.id.fontclrbtn);
        fs= (Button) findViewById(R.id.fontsizbtn);


        Button.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          String name = EditText.getText().toString();
                                          TextView.setText(name);
                                      }
    });

        fc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int arr_len=color.length;
                Random random=new Random();
                int RanNum=random.nextInt(arr_len);
                //String name = EditText.getText().toString();
                TextView.setTextColor(color[RanNum]);
            }
        });

        fs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int arr_len=size.length;
                Random random=new Random();
                int RanNum=random.nextInt(arr_len);
                //String name = EditText.getText().toString();
                TextView.setTextSize(size[RanNum]);
            }
        });

       


    }
    }