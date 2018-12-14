package com.example.validation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = (EditText)findViewById(R.id.editText);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String num = editText.getText().toString();
                //以下のコメントは半角英数字
                //if (num.matches((".*[0-9a-zA-Z].*"))) {
                //日本語
                if (num.matches((".*[ぁ-んァ-ンｦ-ﾟ一-龥].*"))) {

                    Toast toast = Toast.makeText(MainActivity.this, "あるなぁ", Toast.LENGTH_LONG);
                    toast.show();
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "ないなぁ", Toast.LENGTH_LONG);
                    toast.show();
                }

            }
        });

    }
}
