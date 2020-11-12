package jp.ac.hal.dron_deriver_fake;

//import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SubActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        ImageView mDriver;

        mDriver = findViewById(R.id.imageView2);
        mDriver.setImageResource(R.drawable.second);

        mDriver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubActivity.this, ThirdActivity.class);
                startActivity(intent);

            }
        });
    }
}
