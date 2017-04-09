package com.socializent.application.socializent;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Irem on 9.4.2017.
 */

public class SignUp extends Activity {
    EditText name;
    EditText surname;
    EditText username;
    EditText password;
    EditText email;
    Button showSignUpButton;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        name = (EditText) findViewById(R.id.signUpEditName);
        surname = (EditText) findViewById(R.id.signUpEditSurname);
        username = (EditText) findViewById(R.id.signUpEditUsername);
        password = (EditText) findViewById(R.id.signUpPass);
        email = (EditText) findViewById(R.id.signUpemail);
        showSignUpButton = (Button) findViewById(R.id.signUpButton);


    }
    public void signUpToServer(View view){
        AlertDialog.Builder mBuilder = new AlertDialog.Builder(SignUp.this);
        View mView = getLayoutInflater().inflate(R.layout.signupdialog, null);
        Button dialogOK = (Button) mView.findViewById(R.id.signUpOK);
        Button dialogCancel = (Button) mView.findViewById(R.id.signUpCancel);

        mBuilder.setView(mView);
        final AlertDialog dialog = mBuilder.create();

        dialogOK.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //buralara diğer variablar da eklenebilir
                if(!name.getText().toString().isEmpty() && !surname.getText().toString().isEmpty()){
                    Toast.makeText(SignUp.this, "You are signing up!", Toast.LENGTH_SHORT).show();
                    //TODO: burada server a eklenmesi lazım
                    //TODO: ana sayfaya dönecek
                    Intent intentNavigationBar = new Intent(SignUp.this, main.class);
                    startActivity(intentNavigationBar);

                }
                else{
                    Toast.makeText(SignUp.this, "Please fill empty areas!", Toast.LENGTH_SHORT).show();
                }

            }
        });
        dialogCancel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                dialog.dismiss();


            }
        });

        dialog.show();
    }
}
