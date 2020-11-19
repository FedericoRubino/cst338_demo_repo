package com.example.demo_cst338;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String HOME_MESSAGE = "EXTRA MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        if(getIntent() != null) {
//            Intent intent = getIntent();
//            String message = intent.getStringExtra(ChildActivity.CHILD_MESSAGE);
//            TextView textView = findViewById(R.id.mainPageTV);
//            textView.setText(message);
//        }
    }

    public void sendMessage(View view){
        Intent intent = new Intent(this,ChildActivity.class);
        EditText editText = findViewById(R.id.homeET);
        String message = editText.getText().toString();
        intent.putExtra(MainActivity.HOME_MESSAGE, message);
        startActivity(intent);
    }

}