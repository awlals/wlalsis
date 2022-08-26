package com.example.d03_2_lotto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        TextView res = (TextView) findViewById(R.id.output);
        Random rd = new Random();

        int [] a = new int [6];
        String n = "";
        for(int i = 0; i < 6; i++) {
            a[i] = rd.nextInt(45 + 1);
            for(int j = 0; j < i; j++){
                if(a[i] == a[j]) { i--;}
            }
        }
        for(int i = 0; i < 6; i++) {
            n += a[i];
            n += "  ";
        }
        res.setText(n);
    }

//    public void sendMessage(View view) {
//
//        TextView res = (TextView) findViewById(R.id.Output);
//        Random rd = new Random();
//
//        int a[] = new int[6];
//        for (int i = 0; i < a.length; i++){
//            a[i] = (rd.nextInt(45+1));
//        }
//
//        res.setText(String.valueOf(a));
//
//
////
////        int lotto[] = new int[6];
////        int min = 1;
////        int max = 45;
////
////        for (int i = 0; i < lotto.length;i++) {
////            lotto[i] = (rd.nextInt((max - min) + 1) + min);
////
////        }
////
////
////        res.setText(String.valueOf(lotto));
//
//
//
//
////
////        for (int j = 0; j < i; j++) {
////            if (lotto[i] == lotto[j]) {
////                i--;
////                break;
////
////            }
////        }
//
//
//    }
}