package henriques.scripturestorage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "henriques.scripturestorage.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = findViewById(R.id.editText4);
        EditText editText1 = findViewById(R.id.editText5);
        EditText editText2 = findViewById(R.id.editText6);
        String message = editText.getText().toString() +" "+ editText1.getText().toString() +":"+ editText2.getText().toString()+".";


        intent.putExtra(EXTRA_MESSAGE, message);

        startActivity(intent);
    }
}
