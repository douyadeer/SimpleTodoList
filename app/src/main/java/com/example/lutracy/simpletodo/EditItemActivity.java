package com.example.lutracy.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    EditText etEditItem;
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        String currentText = getIntent().getStringExtra("current_text");
        position = getIntent().getIntExtra("position", 0);
        etEditItem = (EditText) findViewById(R.id.etEditItem);
        etEditItem.setText(currentText);
    }

    public void onSaveItem(View view) {
        Intent data = new Intent();
        data.putExtra("text", etEditItem.getText().toString());
        data.putExtra("position", position);
        setResult(RESULT_OK, data);
        finish();
    }
}
