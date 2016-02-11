package socialcompany.social;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class CreateAccScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_acc_screen);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width * 0.8), (int) (height * 0.8));

        Button Create = (Button) findViewById(R.id.Create);
        Create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText editText = (EditText) findViewById(R.id.Username);
                String UsernameInput = editText.getText().toString();
                writeToFile(UsernameInput);

                editText = (EditText) findViewById(R.id.Email);
                String EmailInput = editText.getText().toString();
                writeToFile(EmailInput);

                editText = (EditText) findViewById(R.id.Password);
                String PasswordInput = editText.getText().toString();
                writeToFile(PasswordInput);

                startActivity(new Intent(CreateAccScreen.this, LoginScreen.class));

            }

            public void writeToFile(String input) {
                try {
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openFileOutput("PSEUDOSERVER.txt", Context.MODE_APPEND));
                    outputStreamWriter.write(input);
                    outputStreamWriter.close();
                }
                catch (IOException e) {
                    Log.e("Exception", "File write failed: " + e.toString());
                }
            }

        });
    }
}
