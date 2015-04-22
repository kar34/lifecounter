package kar34.washington.edu.lifecounter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.*;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    private int p1Lives;
    private int p2Lives;
    private int p3Lives;
    private int p4Lives;
    private TextView p1Label;
    private TextView p2Label;
    private TextView p3Label;
    private TextView p4Label;
    private TextView loser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initializing variables
        p1Lives = 20;
        p2Lives = 20;
        p3Lives = 20;
        p4Lives = 20;
        p1Label = (TextView) findViewById(R.id.p1label);
        p2Label = (TextView) findViewById(R.id.p2label);
        p3Label = (TextView) findViewById(R.id.p3label);
        p4Label = (TextView) findViewById(R.id.p4label);
        loser = (TextView) findViewById(R.id.loser);

        // player 1
        findViewById(R.id.p1inc1).setOnClickListener(listener);
        findViewById(R.id.p1dec1).setOnClickListener(listener);
        findViewById(R.id.p1inc5).setOnClickListener(listener);
        findViewById(R.id.p1dec5).setOnClickListener(listener);
        p1Label.setText("Player 1 has " + p1Lives + " lives");

        // player 2
        findViewById(R.id.p2inc1).setOnClickListener(listener);
        findViewById(R.id.p2dec1).setOnClickListener(listener);
        findViewById(R.id.p2inc5).setOnClickListener(listener);
        findViewById(R.id.p2dec5).setOnClickListener(listener);
        p2Label.setText("Player 2 has " + p2Lives + " lives");

        // player 3
        findViewById(R.id.p3inc1).setOnClickListener(listener);
        findViewById(R.id.p3dec1).setOnClickListener(listener);
        findViewById(R.id.p3inc5).setOnClickListener(listener);
        findViewById(R.id.p3dec5).setOnClickListener(listener);
        p3Label.setText("Player 3 has " + p3Lives + " lives");

        // player 4
        findViewById(R.id.p4inc1).setOnClickListener(listener);
        findViewById(R.id.p4dec1).setOnClickListener(listener);
        findViewById(R.id.p4inc5).setOnClickListener(listener);
        findViewById(R.id.p4dec5).setOnClickListener(listener);
        p4Label.setText("Player 4 has " + p4Lives + " lives");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            // player 1
            if(v.getId() == R.id.p1inc1)
                p1Lives++;
            else if (v.getId() == R.id.p1dec1)
                p1Lives--;
            else if (v.getId() == R.id.p1inc5)
                p1Lives += 5;
            else if (v.getId() == R.id.p1dec5)
                p1Lives -= 5;

            // player 2
            else if(v.getId() == R.id.p2inc1)
                p2Lives++;
            else if (v.getId() == R.id.p2dec1)
                p2Lives--;
            else if (v.getId() == R.id.p2inc5)
                p2Lives += 5;
            else if (v.getId() == R.id.p2dec5)
                p2Lives -= 5;

            // player 3
            else if(v.getId() == R.id.p3inc1)
                p3Lives++;
            else if (v.getId() == R.id.p3dec1)
                p3Lives--;
            else if (v.getId() == R.id.p3inc5)
                p3Lives += 5;
            else if (v.getId() == R.id.p3dec5)
                p3Lives -= 5;

            // player 4
            else if(v.getId() == R.id.p4inc1)
                p4Lives++;
            else if (v.getId() == R.id.p4dec1)
                p4Lives--;
            else if (v.getId() == R.id.p4inc5)
                p4Lives += 5;
            else if (v.getId() == R.id.p4dec5)
                p4Lives -= 5;

            // update text
            p1Label.setText("Player 1 has " + p1Lives + " lives");
            p2Label.setText("Player 2 has " + p2Lives + " lives");
            p3Label.setText("Player 3 has " + p3Lives + " lives");
            p4Label.setText("Player 4 has " + p4Lives + " lives");

            // losing player
            if (p1Lives <= 0)
                loser.setText("Player 1 LOSES!");
            else if (p2Lives <= 0)
                loser.setText("Player 2 LOSES!");
            else if (p3Lives <= 0)
                loser.setText("Player 3 LOSES!");
            else if (p4Lives <= 0)
                loser.setText("Player 4 LOSES!");
        };
    };
}t