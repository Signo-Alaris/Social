package socialcompany.social;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProfileScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_screen);

        Button FollowersButton = (Button) findViewById(R.id.FollowersButton);
        FollowersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileScreen.this, FollowerScreen.class));
            }
        });

        Button HistoryButton = (Button) findViewById(R.id.HistoryButton);
        HistoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileScreen.this, VotesScreen.class));
            }
        });
    }
};
