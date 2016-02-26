package com.example.talitasantos.facebulling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button buttonLogin = (Button) findViewById(R.id.button);
        final Button buttonSingUp = (Button) findViewById(R.id.button2);
        final Button singingUp = (Button) findViewById(R.id.button4);
        final EditText textLoguin = (EditText) findViewById(R.id.editText);
        final EditText fieldPass = (EditText)findViewById(R.id.editText2);
        final EditText confirmPass = (EditText)findViewById(R.id.editText4);
        final EditText registro = (EditText) findViewById(R.id.registro);


        buttonLogin.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String login = textLoguin.getText().toString();
                String pass = fieldPass.getText().toString();
                String LoginCorrect = "a";
                String PassCorrect = "a";

                if(login.equals(LoginCorrect) && pass.equals(PassCorrect)){

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
            public void onClick(View v)
            {
                confirmPass.setVisibility(View.VISIBLE);
                buttonLogin.setVisibility(View.INVISIBLE);
                singingUp.setVisibility(View.VISIBLE);
                buttonSingUp.setVisibility(View.INVISIBLE);
                singingUp.isEnabled();


            }
        });

        buttonSingUp.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String pass = fieldPass.getText().toString();
                String confirmPass = "";

                if(pass.equals(confirmPass))                {
                    registro.setText("Sucessfull Sing up!");
                    registro.setVisibility(View.VISIBLE);
                }
                else{
                    registro.setText("fail to sing up");
                    registro.setVisibility(View.VISIBLE);
                }


            }
        });


    }
}
