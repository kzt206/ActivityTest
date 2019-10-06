package jp.ne.sakura.penguin.activitytest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText editNumber;
    private TextView numberView;
    private Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNumber = findViewById(R.id.editNumber);
        numberView = findViewById(R.id.numberView);

        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = Integer.parseInt(editNumber.getText().toString());
                String text = String.valueOf(number);
                numberView.setText(text);
            }


        });

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(this);



    }

    public void onClick(View view){
        String numberStr = editNumber.getText().toString();
//        int number = Integer.parseInt(editNumber.getText().toString());
        Intent intent = new Intent(this,Main2Activity.class);
        intent.putExtra("Number",numberStr);
        startActivity(intent);
    }



}
