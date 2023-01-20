package com.example.mktest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;

import com.example.mktest.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (binding.etPassword.getText().toString().equals("admin")) {
                    binding.etPassword.setVisibility(View.GONE);
                    binding.etName.setVisibility(View.GONE);
                    binding.tvWelcome.setText("Привет"+ " " + binding.etName.getText().toString()+"!");
                    Toast.makeText(MainActivity.this, "Вы успешно зарегистрировались!", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Неверный пароль!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
