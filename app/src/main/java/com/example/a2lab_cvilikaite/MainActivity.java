package com.example.a2lab_cvilikaite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.AdapterView;

import Functions.TextCounter;

public class MainActivity extends AppCompatActivity {
    Spinner countingOptions;
    EditText inputText;
    TextView resultText;
    Button clickButton = (Button) findViewById(R.id.button);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.inputText = findViewById(R.id.inputText);
        this.resultText = findViewById(R.id.resultText);
        this.countingOptions = findViewById(R.id.countingOptions);



        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.counterOptions, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        this.countingOptions.setAdapter(adapter);

        clickButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {

            }
        }
    }
    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // Take action.
        }
    });
    clickButton.setOnClickListener( new OnClickListener() {
        @Override
        public void onItemSelected(AdapterView<?> arg0, View arg1, int position,long id) {
            String line = this.inputText.toString().replace('.', ' ').replace(',', ' ');
            int wordsCount = (int) TextCounter.wordCount(line);
            String formattedResult = String.valueOf(wordsCount);
            this.resultText.setText(formattedResult);
        }
        @Override
        public void onItemSelected(AdapterView<?> arg1, View arg2, int position,long id) {
            String line = this.inputText.toString();
            int charCount = (int) TextCounter.charCount(line);
            String formattedResult = String.valueOf(charCount);
            this.resultText.setText(formattedResult);
        }
    }
    );
}