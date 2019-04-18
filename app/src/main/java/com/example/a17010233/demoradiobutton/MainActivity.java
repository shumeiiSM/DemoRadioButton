package com.example.a17010233.demoradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    RadioGroup rg;
    RadioButton rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the RadioGroup object
                RadioGroup rg = findViewById(R.id.radioGroup1);
                // Get the ID of the selected radio button in the Radio Group
                int selectedButtonId = rg.getCheckedRadioButtonId();
                // Get the radio button object from the ID we had gotten above
                RadioButton rb = findViewById(selectedButtonId);
                // Show a Toast that display the text on the selected radio button
                Toast.makeText(getBaseContext(), rb.getText(), Toast.LENGTH_LONG).show();

            }});
    }
}
