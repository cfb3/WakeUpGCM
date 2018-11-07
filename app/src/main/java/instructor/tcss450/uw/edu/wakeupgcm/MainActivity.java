package instructor.tcss450.uw.edu.wakeupgcm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick(final View theButton) {
        GcmKeepAlive gka = new GcmKeepAlive(this);
        gka.broadcastIntents();
    }
}
