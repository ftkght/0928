package com.example.student.a0928;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.mymenu,menu);

//        menu.add(0,1,0,"選單一");
//        menu.add(0,2,0,"選單-二");
        return  super.onCreateOptionsMenu(menu);
    }
    public  boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.menu1){
            Toast.makeText(MainActivity.this, "新增被按下", Toast.LENGTH_SHORT).show();
        }

//        if (item.getItemId() == 1) {
 //           Toast.makeText(MainActivity.this, "選單一被按下", Toast.LENGTH_SHORT).show();
//        }
//
 //       if (item.getItemId() == 2) {
  //          Toast.makeText(MainActivity.this, "選單二被按下", Toast.LENGTH_SHORT).show();
   //     }
       return super.onOptionsItemSelected(item);
    }
}
