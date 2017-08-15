package in.prithvikpr.hackathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        Button user = (Button) findViewById(R.id.user);
        Button verifier = (Button) findViewById(R.id.verifier);
        user.setOnClickListener(new  View.OnClickListener(){
            public void onClick(View v)
            {
                Intent fb = new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(fb);
            }
        });

    }
}
