package com.vicente.nombre;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static String TAG = "ActivityName";
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
    }

    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG,  "onSaveInstanceState");

        final EditText editText = (EditText) findViewById(R.id.editText);
        CharSequence text = editText.getText();
        outState.putCharSequence("savedText", text);

}
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG,"onRestoreInstanceState");
        final TextView textView = (TextView) findViewById(R.id.textView);

        CharSequence savedText = savedInstanceState.getCharSequence("savedText");
        textView.setText(savedText);

    }
}
