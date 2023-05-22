package sg.edu.rp.c326.id22015010.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {
    TextView tvAnswer;
    Button btn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        btn = findViewById(R.id.button1);
        tvAnswer=findViewById(R.id.textView1);
        Intent intentReceived=getIntent();
        String value=intentReceived.getStringExtra("ModuleCode");
        tvAnswer.setText("Module Code: "+value);

        tvAnswer=findViewById(R.id.textView2);
        Intent intentReceived2=getIntent();
        String value1=intentReceived2.getStringExtra("ModuleName");
        tvAnswer.setText("Module Name: "+value1);

        tvAnswer=findViewById(R.id.textView3);
        Intent intentReceived3=getIntent();
        int value2=intentReceived3.getIntExtra("AcademicYear",0);
        tvAnswer.setText("Academic Year: "+value2);

        tvAnswer=findViewById(R.id.textView4);
        Intent intentReceived4=getIntent();
        int value3=intentReceived4.getIntExtra("Semester",0);
        tvAnswer.setText("Semester: "+value3);

        tvAnswer=findViewById(R.id.textView5);
        Intent intentReceived5=getIntent();
        int value4=intentReceived5.getIntExtra("ModuleCredit",0);
        tvAnswer.setText("Module Credit: "+value4);

        tvAnswer=findViewById(R.id.textView6);
        Intent intentReceived6=getIntent();
        String value5=intentReceived2.getStringExtra("Venue");
        tvAnswer.setText("Venue: "+value5);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FirstActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}