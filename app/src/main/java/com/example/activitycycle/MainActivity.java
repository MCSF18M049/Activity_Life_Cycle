
package com.example.activitycycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    int count=0;
    TextView textView;

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ALC","onStart Called" );

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ALC","onDestroy Called" );
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ALC","onStop Called" );
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ALC","onRestart Called" );
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.buttoncounter);
        textView=findViewById(R.id.textviewcounter);
        Log.d("ALC","onCreate Called" );
        //Log.d("ALC","onStop Called" );
    }

    public void IncreaseNumber(View view) {
     count=Integer.parseInt(textView.getText().toString());
     count++;
     textView.setText(String.valueOf(count));
    }

    public void MoveToActivity2(View view) {
        Intent intent=new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void MoveToActivity3(View view) {
        Intent intent=new Intent(this,MainActivity3.class);
        startActivity(intent);
    }
}