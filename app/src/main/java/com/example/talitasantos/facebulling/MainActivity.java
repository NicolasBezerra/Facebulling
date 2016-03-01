package com.example.talitasantos.facebulling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private String mainLogin;
    private String mainPassword;
    private boolean clicked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button buttonLogin = (Button) findViewById(R.id.loginButton);
        final Button buttonSingUp = (Button) findViewById(R.id.singUpButton);
        final Button singingUp = (Button) findViewById(R.id.singingUpButton);
        final EditText textlogin = (EditText) findViewById(R.id.usernameText);
        final EditText fieldPass = (EditText)findViewById(R.id.passwordText);
        final EditText confirmPass = (EditText)findViewById(R.id.confirmPasswordButton);
        final EditText registro = (EditText) findViewById(R.id.registro);
        final Button confirmSingingUp = (Button) findViewById(R.id.confirmSingingUp);
        final Button random = (Button) findViewById(R.id.random);
        final ImageView jamv = (ImageView) findViewById(R.id.jamv);

        mainLogin = "a";
        mainPassword = "a";

        buttonLogin.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v){
                String login = textlogin.getText().toString();
                String pass = fieldPass.getText().toString();

                if(login.equals(mainLogin) && pass.equals(mainPassword)){

                    registro.setText("Sucessfull login!");
                    registro.setVisibility(View.VISIBLE);
                }
                else {
                    registro.setText("fail to login");
                    registro.setVisibility(View.VISIBLE);
                }
            }
        });

        buttonSingUp.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v){
                confirmPass.setVisibility(View.VISIBLE);
                buttonLogin.setVisibility(View.INVISIBLE);
                buttonLogin.setEnabled(false);
                buttonSingUp.setVisibility(View.INVISIBLE);
                buttonSingUp.setEnabled(false);
                singingUp.setVisibility(View.VISIBLE);
                singingUp.setEnabled(true);
                registro.setVisibility(View.INVISIBLE);
            }
        });

        singingUp.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v){
                String pass = fieldPass.getText().toString();
                String login = textlogin.getText().toString();
                String confirm = confirmPass.getText().toString();

                if(pass != null || login != null) {
                    if (confirm.equals(pass)) {
                        mainPassword = pass;
                        mainLogin = login;
                        registro.setText("Sucessfull Sing up!");
                        registro.setVisibility(View.VISIBLE);

                        singingUp.setVisibility(View.INVISIBLE);
                        singingUp.setEnabled(false);
                        confirmSingingUp.setVisibility(View.VISIBLE);
                        confirmSingingUp.setEnabled(true);
                    }
                }
                else{
                    registro.setText("fail to sing up");
                    registro.setVisibility(View.VISIBLE);
                }
            }
        });

        confirmSingingUp.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v){
                confirmSingingUp.setVisibility(View.INVISIBLE);
                confirmSingingUp.setEnabled(false);
                buttonLogin.setVisibility(View.VISIBLE);
                buttonLogin.setEnabled(true);
                registro.setVisibility(View.INVISIBLE);
                confirmPass.setVisibility(View.INVISIBLE);
                confirmPass.setEnabled(false);
            }
        });

        random.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                clicked = !clicked;

                if(clicked)
                    jamv.setVisibility(View.VISIBLE);
                else jamv.setVisibility(View.INVISIBLE);
            }
        });
    }
}
