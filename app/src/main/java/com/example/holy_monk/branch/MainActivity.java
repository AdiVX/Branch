package com.example.holy_monk.branch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void StringFunc(){
        String str = "Johnyy";
        str += " Bro";
        String res = str + new String(" Jackal");
    }
}
