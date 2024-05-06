
package sg.edu.np.mad.madpractical4;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {
    final String Title = "Main Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(Title,"On Create:");
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Intent myIntent = getIntent();
        int randomNumber;
        // Initialize a new User object
        User user = new User( "MAD", "MAD Developer", 1, false);

        // Get the TextViews and Button from the layout
        TextView tvName = findViewById(R.id.tvName);
        TextView tvDescription = findViewById(R.id.tvDescription);
        Button btnFollow = findViewById(R.id.btnFollow);

        // Set the TextViews with the User's name, description and default button message
        tvName.setText(user.name);
        tvDescription.setText(user.description);
        btnFollow.setText("Follow");

        btnFollow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.v(Title,"Button Clicked");
                if (user.followed){
                    btnFollow.setText("Unfollow");
                    user.followed = false;
                    Toast.makeText(getApplicationContext(), "Followed", Toast.LENGTH_SHORT).show();
                } else {
                    btnFollow.setText("Follow");
                    user.followed = true;
                    Toast.makeText(getApplicationContext(), "Unfollowed", Toast.LENGTH_SHORT).show();
                }
            }
        });

        randomNumber = myIntent.getIntExtra("randomNumber", 0);
        String name = user.name + " " + randomNumber;

        tvName.setText(name);
    }
}