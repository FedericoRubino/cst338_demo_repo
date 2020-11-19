package com.example.demo_cst338;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ChildActivity extends AppCompatActivity {

    public static final String CHILD_MESSAGE = "EXTRA CHILD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

//        Intent intent = getIntent();
//        String message = intent.getStringExtra(MainActivity.HOME_MESSAGE);
//        TextView textView = findViewById(R.id.childPageTV);
//        textView.setText(message);

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);


    }

    public void sendMessageC(View view){
        Intent intent = new Intent(this, MainActivity.class);
        EditText editText = findViewById(R.id.childET);
        String message = editText.getText().toString();
        intent.putExtra(CHILD_MESSAGE, message);
        startActivity(intent);
    }


    public static Intent factoryIntent(){
        Intent intent = new Intent()


    }


}