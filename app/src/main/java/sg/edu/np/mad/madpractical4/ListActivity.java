package sg.edu.np.mad.madpractical4;

import android.os.Bundle;
import android.content.DialogInterface;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.activity.EdgeToEdge;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AlertDialog;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import java.util.Random;

public class ListActivity extends AppCompatActivity {
    final String Title = "List Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list);
        ArrayList<User> userList = new ArrayList<User>();
        String[] nameList = {"Alice", "Bob", "Charlie", "David", "Emma", "Frank", "Grace", "Henry", "Ivy", "Jack"};
        String[] descriptionList = {
                "Business Studies",
                "Mass Communication",
                "Film, Sound & Video",
                "Aerospace Electronics",
                "Biomedical Engineering",
                "Business & Social Enterprise",
                "Chemical & Biomolecular Engineering",
                "Digital Game Art & Design",
                "Early Childhood Education",
                "Financial Informatics",
                "Health Sciences (Nursing)",
                "International Business",
                "Marine & Offshore Technology",
                "Pharmaceutical Science",
                "Sustainable Urban Design & Engineering",
                "Tourism & Resort Management",
                "Visual Effects",
                "Nanotechnology & Materials Science",
                "Robotics & Smart Systems",
                "User Experience & Test Design"
        };
        boolean[] follow = {true,false};
        Random random = new Random();
        int randomId = random.nextInt(20) +1;
        int followChoice = random.nextInt(1);
        User user = new User(nameList[randomId],descriptionList[randomId],randomId,follow[followChoice]);
        userList.add(user);
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.v(Title, "onStart:");

    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.v(Title, "onResume:");
        ImageView profileImg = findViewById(R.id.imageView4);
        profileImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(Title,"Image Pressed:");
                imageAlert();
            }
        });

    }

    private void imageAlert(){
        AlertDialog.Builder builder = new AlertDialog.Builder(ListActivity.this);

        builder.setTitle("Profile");
        builder.setMessage("MADness");
        builder.setCancelable(true);
        builder.setPositiveButton("View", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Random random = new Random();
                int randomNumber = random.nextInt(900000) + 100000;

                Intent activityName = new Intent(ListActivity.this, MainActivity.class);

                activityName.putExtra("randomNumber", randomNumber);
                startActivity(activityName);

            }
        });
        AlertDialog.Builder close = builder.setNegativeButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }

        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}
