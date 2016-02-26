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
        final CheckBox statusloguin;
        final Button buttonLogin = (Button) findViewById(R.id.button);
        final EditText textLoguin = (EditText) findViewById(R.id.editText);
        final EditText fieldPass = (EditText)findViewById(R.id.editText2);
        statusloguin = (CheckBox)findViewById(R.id.checkBox);

        buttonLogin.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String login = textLoguin.getText().toString();
                String pass = fieldPass.getText().toString();

                if(login.equals("a") && pass.equals("d")) statusloguin.setChecked(true);
                else Toast.makeText(v.getContext(), "Incorrect Data", Toast.LENGTH_SHORT).show();
            }
        });



    }
}
