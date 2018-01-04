package tw.com.shiaoshia.ex2018010401;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        /*
        //沒有用到layout 產生TextView
        TextView tv = new TextView(this);
        setContentView(tv);
        tv.setText("Hello World");
        */

        //沒有用到layout 產生Button
        Button bnt = new Button(this);
        bnt.setText("OK");
        bnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Hello World!",Toast.LENGTH_SHORT).show();
            }
        });

        Button bnt2 = new Button(this);
        bnt2.setText("Canal");
        bnt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"取消按鈕",Toast.LENGTH_SHORT).show();
            }
        });

        //建立LinearLayout
        LinearLayout layout = new LinearLayout(this);
        layout.addView(bnt);
        layout.addView(bnt2);
        setContentView(layout);

    }
}
