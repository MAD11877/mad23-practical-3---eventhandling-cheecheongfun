package sg.edu.np.mad.week2t04;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.CaseMap;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    final String TITLE = "Main Activity";

    User user1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TITLE, "On Create!");
        user1 = new User("Chun Fai", "blahhhhhhhhh");
        TextView boldtext = findViewById(R.id.textView2);
        TextView normtext = findViewById(R.id.textView3);
        boldtext.setText(user1.name);
        normtext.setText(user1.description);

    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.v(TITLE, "On Start!");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.v(TITLE,"On Pause!");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.v(TITLE, "On Resume!");
        User myUser = new User();
        Button followButton = findViewById(R.id.button);
        followButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myUser.followed == false){
                    myUser.followed = true;
                    followButton.setText("Unfollow");
                }
                else{
                    myUser.followed = false;
                    followButton.setText("Follow");
                }
                Log.v(TITLE,"Button A is pressed");
            }
        });
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.v(TITLE, "On Stop!");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.v(TITLE, "On Destroy!");
    }
}