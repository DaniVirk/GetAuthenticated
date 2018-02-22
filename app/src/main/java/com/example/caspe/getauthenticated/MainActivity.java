package com.example.caspe.getauthenticated;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText emailField;
    public EditText passwordField;
    public Button loginButton;
    public String emailTest = "1";
    public String passwordTest = "1";
    public TextView loginIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailField = (EditText) findViewById(R.id.emailField);
        passwordField = (EditText) findViewById(R.id.passwordField);
        loginButton = (Button) findViewById(R.id.loginButton);
        loginIndicator = (TextView) findViewById(R.id.loginIndicator);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //String username = emailField.getText().toString();

                // if email and password matches, success
                if (emailField.getText().toString().equals(emailTest)
                        && passwordField.getText().toString().equals(passwordTest)) {

                    loginIndicator.setText("SUCCESS");
                    loginIndicator.setVisibility(1);

                // if password is wrong, wrong password
                } else if (emailField.getText().toString().equals(emailTest)
                        && !passwordField.getText().toString().equals(passwordTest)) {

                    loginIndicator.setText("Wrong password");
                    loginIndicator.setVisibility(1);

                // if nothing matches
                } else {
                    loginIndicator.setText("User not found");
                    loginIndicator.setVisibility(1);
                }
            }
        });
    }
}
