package com.example.uitest3;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView testTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testTextView = findViewById(R.id.test_text_view);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        switch (item.getItemId()) {
            case R.id.font_size_small:
                testTextView.setTextSize(10);
                return true;
            case R.id.font_size_medium:
                testTextView.setTextSize(16);
                return true;
            case R.id.font_size_large:
                testTextView.setTextSize(20);
                return true;
            case R.id.normal_item:
                Toast.makeText(context, "你点击了普通菜单项", duration).show();
                return true;
            case R.id.font_color_red:
                testTextView.setTextColor(Color.RED);
                return true;
            case R.id.font_color_black:
                testTextView.setTextColor(Color.BLACK);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}