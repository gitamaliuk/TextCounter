package com.example.textcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.textcounter.utils.TextUtils;

public class MainActivity extends AppCompatActivity {

    TextView tvResult;
    EditText txtMain;
    Spinner spOptionSelection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvResult=findViewById(R.id.tvResult);
        this.txtMain=findViewById(R.id.txtMain);
        this.spOptionSelection = findViewById(R.id.spOptionSelection);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,
                R.array.counting_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spOptionSelection.setAdapter(adapter);

    }

    public void onBtnCalculateClick(View view) { //padaryti naudojant resursus(1:40)
        if(true) {
            if (this.spOptionSelection.getSelectedItem().toString().equalsIgnoreCase("Words")) {
                //TODO:
            } else {
                int charsCount = TextUtils.getcharsCount(this.txtMain.getText().toString());
                String charsCountFormatted = String.valueOf(charsCount);
                this.tvResult.setText(charsCount);

                // String content = this.txtMain.getText().toString();
                // int charsCount = content.length();
                // String charsCountFormatted = String.valueOf(charsCount);
                //this.tvResult.setText(charsCount);
            }
        }
        else{
            Toast.makeText(this,"Text is empty", Toast.LENGTH_LONG).show();
        }
    }
}