package mx.peta.clase1;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by rayo on 6/10/16.
 */
public class ActivityDetail extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        TextView txt = (TextView) findViewById(R.id.detail_username);
        String data = (String) getIntent().getExtras().get("key_user");
        // String hello = String.format(getString(R.string.hello), data);
        String hello = String.format(getResources().getString(R.string.hello),data);
        txt.setText(hello);
    }

}
