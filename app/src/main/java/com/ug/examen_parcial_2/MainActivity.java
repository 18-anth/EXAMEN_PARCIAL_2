
//      ANTHONY ESTUARDO CORDOVA MORENO

package com.ug.examen_parcial_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editTextName = findViewById(R.id.editTextName);
        final EditText editTextLastName = findViewById(R.id.editTextLastName);
        final EditText editTextEmail = findViewById(R.id.editTextEmail);
        final EditText editTextyear = findViewById(R.id.editTextYear);

        Button btnEnviar = findViewById(R.id.buttonSubmit);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editTextName.getText().toString();
                String lastname = editTextLastName.getText().toString();
                String email = editTextEmail.getText().toString();
                String year =  editTextyear.getText().toString();

                Intent intent = new Intent(MainActivity.this, SeconMainActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("lastname", lastname);
                intent.putExtra("email", email);
                intent.putExtra("year", year);
                startActivity(intent);
            }
        });
    }
}