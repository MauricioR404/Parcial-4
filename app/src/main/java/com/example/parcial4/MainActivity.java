package com.example.parcial4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent listDepartaments = new Intent(MainActivity.this, listDepartment.class);
        //startActivity(listDepartaments);


        Button tvLogin = (Button) findViewById(R.id.tvLogin);

        tvLogin.setOnClickListener(new View.OnClickListener() {
            EditText username = (EditText) findViewById(R.id.username);
            EditText password = (EditText) findViewById(R.id.password);
            TextView textoNormal = (TextView) findViewById(R.id.textNormal);

            @Override

            public void onClick(View v) {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                Intent i = new Intent(MainActivity.this, listDepartment.class);
                String [] users;
                String [] password;

                users = getResources().getStringArray(R.array.usuarios);
                password = getResources().getStringArray(R.array.claves);
                //textoNormal.setText(users[1]);

                for (int index = 0; index < users.length; ++index) {
                    if(users[index].equals(user) && password[index].equals(pass)) {
                        startActivity(i);
                    } else {
                        textoNormal.setText("Usuario o Contraseña incorrecta");
                    }
                }

                //if(user.equals("ELE1") && pass.equals("SECC01")) {
                  //  startActivity(i);
               // }
            }
        });
    }
}
