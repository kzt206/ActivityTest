package jp.ne.sakura.penguin.activitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    private TextView nextView;
    private Button showButton;
    private String numberStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nextView = findViewById(R.id.nextView);

        Intent intent = getIntent();
        numberStr = intent.getStringExtra("Number");
        nextView.setText(numberStr);
//        Integer number = intent.getIntExtra("number",1);
//        nextView.setText(String.valueOf(number));

        showButton = findViewById(R.id.button3);
        showButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int number2 = Integer.parseInt(numberStr) ;
                int number3 = number2 - 1;
                nextView.setText(String.valueOf(number3));
            }
        });

    }

}
