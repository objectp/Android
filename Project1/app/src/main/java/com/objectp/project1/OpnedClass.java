package com.objectp.project1;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by ethiotech on 3/28/2015.
 */
public class OpnedClass extends Activity implements View.OnClickListener,RadioGroup.OnCheckedChangeListener{
    TextView question,test;
    Button retunData;
    RadioGroup selectionList;
    String gotBread,setData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.send);
        initializeVars();
        SharedPreferences getData = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        String et = getData.getString("name", "Travis is...");
        String values = getData.getString("list", "4");
        if(values.contentEquals("1")){
            question.setText(et);
        }
        /*Bundle gotBasket = getIntent().getExtras();
        gotBread = gotBasket.getString("key");
        question.setText(gotBread);*/

    }

    private void initializeVars() {
        question = (TextView) findViewById(R.id.tvQuestion);
        test = (TextView) findViewById(R.id.tvTest);
        retunData = (Button) findViewById(R.id.bReturn);
        selectionList = (RadioGroup)findViewById(R.id.rgAnswers);
        retunData.setOnClickListener(this);
        selectionList.setOnCheckedChangeListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent person = new Intent();
        Bundle backpack = new Bundle();
        backpack.putString("answer",setData);
        person.putExtras(backpack);
        setResult(RESULT_OK, person);
        finish();

    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId){
            case R.id.rCrazy:
                setData = "Probably right";
                break;
            case R.id.rSexy:
                setData = "Definitely right";
                break;
            case R.id.rBoth:
                setData = "Spot On!";
                break;
        }
        test.setText(setData);
    }
}
