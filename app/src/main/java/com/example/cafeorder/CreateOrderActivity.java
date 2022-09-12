package com.example.cafeorder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class CreateOrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_order);
    }

    public void onClickCreateOrder(View view) {
        Toast.makeText(this, "Работает кнопка", Toast.LENGTH_SHORT).show();
    }
}