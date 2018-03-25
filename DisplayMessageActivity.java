package com.example.connor.teamup;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class DisplayMessageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
    }

    public void toCentralPage(View view) {
        Intent intent = new Intent(this, CentralActivity.class);
        EditText nameText = (EditText) findViewById(R.id.nameText);
        String name = nameText.getText().toString();

       // SharedPreferences sharedPref = getParent().getPreferences(Context.MODE_PRIVATE);
       // SharedPreferences.Editor editor = sharedPref.edit();
       // editor.putString("name_value",name);
       // editor.commit();
        startActivity(intent);
    }


}
