
//      ANTHONY ESTUARDO CORDOVA MORENO

package com.ug.examen_parcial_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SeconMainActivity extends AppCompatActivity {

    private DatabaseReference databaseReference;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textViewName = findViewById(R.id.editTextName);
        TextView textViewLastName = findViewById(R.id.editTextLastName);
        TextView textViewEmail = findViewById(R.id.editTextEmail);
        TextView textViewYear = findViewById(R.id.editTextYear);
        Button btnGrabarFirebase = findViewById(R.id.buttonSubmit);

        Intent intent = getIntent();
        if (intent != null) {
            String name = intent.getStringExtra("name");
            String lastname = intent.getStringExtra("lastname");
            String email = intent.getStringExtra("email");
            String year = intent.getStringExtra("year");


            textViewName.setText("Name"+name);
            textViewLastName.setText("LastName"+lastname);
            textViewEmail.setText("Email: " + email);
            textViewYear.setText("Year: " + year);


        }

        databaseReference = FirebaseDatabase.getInstance().getReference();
        btnGrabarFirebase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = getIntent().getStringExtra("name");
                String lastname = getIntent().getStringExtra("lastname");
                String email = getIntent().getStringExtra("email");
                String year = getIntent().getStringExtra("year");

                UsuarioActivity User_activity = new UsuarioActivity(name, lastname, email, year);

                databaseReference.child("Users").push().setValue(User_activity);
            }
        });
    }
}