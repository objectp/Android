package com.objectp.project1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by ethiotech on 3/27/2015.
 */
public class Email extends Activity implements View.OnClickListener{
    EditText personEmail, intro, personName, stupidThings, hatefulAction, outro;
    String emailAdd, beginning, name, stupidAction, hatefulAct, out;
    Button sendEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.email);
        initializeVars();
        sendEmail.setOnClickListener(this);
    }

    private void initializeVars() {
        personEmail = (EditText) findViewById(R.id.etEmails);
        intro = (EditText) findViewById(R.id.etIntro);
        personName = (EditText) findViewById(R.id.etName);
        stupidThings = (EditText) findViewById(R.id.etThings);
        hatefulAction = (EditText) findViewById(R.id.etAction);
        outro = (EditText) findViewById(R.id.etOutro);
        sendEmail = (Button) findViewById(R.id.bSentEmail);

    }

    @Override
    public void onClick(View v) {
        convertEditTextVarsIntoStringsAndYesThisIsAMethodWeCreated();
        String emailaddress[] = {emailAdd};
        String message = "Well hello"
                + name
                + " I just wanted to say "
                + beginning
                + ". Not only the but I hate when you "
                + stupidAction
                + ", that just really make me crazy. I just want to make "
                + hatefulAct
                + ". Welp, thats all I wanted to chit-chat about, oh on "
                + out
                + ". Oh also if you get boared you should check out "
                + '\n' + "PS. I think I love ...";
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.putExtra(Intent.EXTRA_EMAIL, emailaddress);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "I hate you!");
        emailIntent.setType("plain/text");
        emailIntent.putExtra(Intent.EXTRA_TEXT, message);
        startActivity(emailIntent);//sends the email
    }

    private void convertEditTextVarsIntoStringsAndYesThisIsAMethodWeCreated() {
        emailAdd = personEmail.getText().toString();
        beginning = intro.getText().toString();
        name = personName.getText().toString();
        stupidAction = stupidThings.getText().toString();
        hatefulAct = hatefulAction.getText().toString();
        out = outro.getText().toString();
    }

    @Override //finsih the activity
    protected void onPause() {
        super.onPause();
        finish();
    }
}
