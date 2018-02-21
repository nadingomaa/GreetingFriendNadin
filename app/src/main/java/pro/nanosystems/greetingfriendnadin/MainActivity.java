package pro.nanosystems.greetingfriendnadin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button mSend;
    EditText mFriendName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSend=findViewById(R.id.send);
        mFriendName=findViewById(R.id.friendName);

    }

    public void sendMsg(View view) {

        String dataToPass = mFriendName.getText().toString();

        Intent greetMsgIntent;
        greetMsgIntent=new Intent(this,GreetingMsg.class);
        //to transfer data
        greetMsgIntent.putExtra("Data",dataToPass);

        startActivity(greetMsgIntent);

    }


    }
