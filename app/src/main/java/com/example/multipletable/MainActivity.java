package com.example.multipletable;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result;
    TextView num;
    int ans = 0;
    SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            ((ActionBar) actionBar).setBackgroundDrawable(getResources().getDrawable(R.drawable.actionbar));
        }



        result = (TextView)findViewById(R.id.textView);
        num = (TextView)findViewById(R.id.num);
        seekBar = (SeekBar) findViewById(R.id.seekBar);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {


                String inputednum = String.valueOf(progress);
                num.setText(inputednum);
                StringBuffer buffer = new StringBuffer();
                int n=progress;
                for (int i = 1; i <= 10; i++) {
                    ans = (i * n);
                    buffer.append("\n" + n + " X " + i
                            + " = " + ans + "\n");
                }
                result.setText(buffer);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}

