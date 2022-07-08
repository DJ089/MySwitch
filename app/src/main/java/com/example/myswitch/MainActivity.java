package com.example.myswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout layout_1;
    //RadioButton radio_button1,radio_button2,radio_button3;
    ImageView img_view;
    //Button btn_exit,btn_begin;
    Switch switch1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout_1=findViewById(R.id.layout_1);
        img_view=findViewById(R.id.img_view);
        switch1=findViewById(R.id.switch1);





        findViewById(R.id.radio_button1).setOnClickListener(this);
        findViewById(R.id.radio_button2).setOnClickListener(this);
        findViewById(R.id.radio_button3).setOnClickListener(this);
        findViewById(R.id.btn_exit).setOnClickListener(this);
        findViewById(R.id.btn_begin).setOnClickListener(this);
        findViewById(R.id.switch1).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.radio_button1:
                img_view.setImageResource(R.drawable.an8);

                break;
            case R.id.radio_button2:
                img_view.setImageResource(R.drawable.an9);

                break;
            case R.id.radio_button3:
                img_view.setImageResource(R.drawable.an10);

                break;

            case R.id.switch1:
                Toast.makeText(this, "스위치", Toast.LENGTH_SHORT).show();
                if(switch1.isChecked()){
                    layout_1.setVisibility(View.VISIBLE);
                }else
                    layout_1.setVisibility(View.INVISIBLE);

                break;
            case R.id.btn_exit:
                //switch1.setChecked(false);
               //layout_1.setVisibility(View.INVISIBLE);
               switch1.performClick();


                break;
            case R.id.btn_begin:


                break;

        }

    }
}