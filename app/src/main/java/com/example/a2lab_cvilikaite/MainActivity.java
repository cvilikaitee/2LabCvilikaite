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
import android.widget.Toast;

import Functions.TextCounter;

public class MainActivity extends AppCompatActivity {
    Spinner countingOptions;
    EditText inputText;
    TextView resultText;
    TextView textView2;
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

    }
    public void onButtonClick(View view) {
        String text = this.countingOptions.getSelectedItem().toString();
        String line = this.inputText.getText().toString().replace('.', ' ').replace(',', ' ');
        if(line.isEmpty())
            Toast.makeText(this, "Please enter the text", Toast.LENGTH_LONG).show();
        else {
            if (text.equals("words")) {
                Toast.makeText(this, "Words are counting....", Toast.LENGTH_LONG).show();
                int wordsCount = (int) TextCounter.wordCount(line);
                String formattedResult = String.valueOf(wordsCount);
                Toast.makeText(this, "Words were counted.", Toast.LENGTH_LONG).show();
                this.resultText.setText("count is = " + formattedResult);
            } else {
                Toast.makeText(this, "Chars are counting....", Toast.LENGTH_LONG).show();
                int charCount = (int) TextCounter.charCount(line);
                //String formattedResult = String.valueOf(charCount);
                String formattedResult = Integer.toString(charCount);
                this.resultText.setText(formattedResult);
                Toast.makeText(this, "Chars were counted.", Toast.LENGTH_LONG).show();
                this.resultText.setText("count is = " + formattedResult);
            }
        }
    }
}