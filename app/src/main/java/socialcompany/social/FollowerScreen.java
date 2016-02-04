package socialcompany.social;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class FollowerScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_follower_screen);

        ImageButton Follower1 = (ImageButton) findViewById(R.id.Follower1);
        Follower1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FollowerScreen.this, ProfileScreen.class));
            }
        });

        ImageButton Follower2 = (ImageButton) findViewById(R.id.Follower2);
        Follower2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FollowerScreen.this, ProfileScreen.class));
            }
        });

        ImageButton Following1 = (ImageButton) findViewById(R.id.Following1);
        Following1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FollowerScreen.this, ProfileScreen.class));
            }
        });
    }


}
