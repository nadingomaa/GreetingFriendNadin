package pro.nanosystems.greetingfriendnadin;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void sendMsg(View view) {

        EditText mFriendName = findViewById(R.id.friendName);
        TextView mGreetMsg = findViewById(R.id.greetMsg);
        String dataToPass = mFriendName.getText().toString();

        //Intent greetMsgIntent;
        //greetMsgIntent=new Intent(this,GreetingMsg.class);
        //to transfer data
        //greetMsgIntent.putExtra("Data",dataToPass);
        // startActivity(greetMsgIntent);

        Calendar cd = Calendar.getInstance();
        int currentHour = cd.get(Calendar.DAY_OF_WEEK_IN_MONTH);


        if ((currentHour >= 4) && (currentHour <= 12)) {
            mGreetMsg.setText("Good Morning " + dataToPass + "!");
        } else if ((currentHour > 12) && (currentHour <= 20)) {
            mGreetMsg.setText("Good afternoon " + dataToPass + "!");
        } else if ((currentHour > 20) && (currentHour < 4)) {
            mGreetMsg.setText("Good evening " + dataToPass + "!");
        }


    }
}
