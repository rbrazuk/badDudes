package com.example.rbrazuk.baddudes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void toast(View view){

        TextView messageLabel = (TextView) findViewById(R.id.messageLabel);
        String message = "Let's go for a burger...HA! HA! HA!";

        messageLabel.setText(message);

        // Toast.makeText(getApplicationContext(),"The president has been kidnapped by ninjas!",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
