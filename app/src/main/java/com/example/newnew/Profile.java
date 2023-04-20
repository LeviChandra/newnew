package com.example.newnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Profile extends AppCompatActivity {

    String username = " admin";
    String password = " admin";
    String fullName = " Admin Admin Admin";
    String nickName = " Nickname";
    String blank = " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        TextView nicknameLabel = findViewById(R.id.nicknameLabel);

        EditText user = findViewById(R.id.usernameBox);
        EditText pass = findViewById(R.id.passwordBox);
        EditText fName = findViewById(R.id.fullNameBox);
        EditText nick = findViewById(R.id.nickNameBox);

        user.setText(username);
        pass.setText(password);
        fName.setText(fullName);
        nick.setText(nickName);

        Button updateProfile = findViewById(R.id.submitUpdate);
        Button clearEdits = findViewById(R.id.clearEdits);
        Button backHome = findViewById(R.id.backHome);

        updateProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newNick = nick.getText().toString();
                nicknameLabel.setText(newNick);

                String newPass = pass.getText().toString();
                password = newPass;

                String newFull = fName.getText().toString();
                fullName = newFull;

                String newUser = user.getText().toString();
                username = newUser;

                Toast.makeText(Profile.this, "Changes saved!", Toast.LENGTH_SHORT).show();
            }
        });

        clearEdits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user.setText(blank);
                pass.setText(blank);
                fName.setText(blank);
                nick.setText(blank);
            }
        });

        backHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile.this, homepage.class);
                startActivity(intent);
            }
        });
    }
}