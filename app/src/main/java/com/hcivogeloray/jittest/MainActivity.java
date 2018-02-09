package com.hcivogeloray.jittest;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.hcivogeloray.anotherlib.AnotherProcessor;
import com.hcivogeloray.importantlib.ImportantProcessor;

import java.util.Locale;

@SuppressLint("SetTextI18n")
public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    TextView output = findViewById(R.id.output);
    output.setText(String.format(Locale.US, "%s %d",
        AnotherProcessor.create().process(output.getText().toString()),
        ImportantProcessor.create().calculateTheAnswer()));
  }
}
