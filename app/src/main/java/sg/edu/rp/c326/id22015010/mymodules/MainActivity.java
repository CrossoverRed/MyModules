package sg.edu.rp.c326.id22015010.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView C346;
TextView C390;
TextView C203;
TextView C206;
TextView C218;
TextView C235;
TextView G953;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        C346=findViewById(R.id.C346text);
        C390=findViewById(R.id.C390text);
        C203=findViewById(R.id.C203text);
        C206=findViewById(R.id.C206text);
        C218=findViewById(R.id.C218text);
        C235=findViewById(R.id.C235text);
        G953=findViewById(R.id.G953text);
        C346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, FirstActivity.class);
                intent.putExtra("ModuleCode","C346");
                intent.putExtra("ModuleName", "Mobile App Development");
                intent.putExtra("AcademicYear", 2);
                intent.putExtra("Semester", 1);
                intent.putExtra("ModuleCredit", 4);
                intent.putExtra("Venue", "E63A");
                startActivity(intent);
            }
        });
        C390.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, FirstActivity.class);
                intent.putExtra("ModuleCode","C390");
                intent.putExtra("ModuleName", "Portfolio Development");
                intent.putExtra("AcademicYear", 2);
                intent.putExtra("Semester", 1);
                intent.putExtra("ModuleCredit", 4);
                intent.putExtra("Venue", "-");
                startActivity(intent);
            }
        });
        C203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, FirstActivity.class);
                intent.putExtra("ModuleCode","C203");
                intent.putExtra("ModuleName", "Web App In Development Process");
                intent.putExtra("AcademicYear", 2);
                intent.putExtra("Semester", 1);
                intent.putExtra("ModuleCredit", 4);
                intent.putExtra("Venue", "W64N");
                startActivity(intent);
            }
        });
        C206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, FirstActivity.class);
                intent.putExtra("ModuleCode","C206");
                intent.putExtra("ModuleName", "Software Development Process");
                intent.putExtra("AcademicYear", 2);
                intent.putExtra("Semester", 1);
                intent.putExtra("ModuleCredit", 4);
                intent.putExtra("Venue", "W64N");
                startActivity(intent);
            }
        });
        C218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, FirstActivity.class);
                intent.putExtra("ModuleCode","C218");
                intent.putExtra("ModuleName", "UI/UX Design for Apps");
                intent.putExtra("AcademicYear", 2);
                intent.putExtra("Semester", 1);
                intent.putExtra("ModuleCredit", 4);
                intent.putExtra("Venue", "W64N");
                startActivity(intent);
            }
        });
        C235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, FirstActivity.class);
                intent.putExtra("ModuleCode","C235");
                intent.putExtra("ModuleName", "IT Security and Management");
                intent.putExtra("AcademicYear", 2);
                intent.putExtra("Semester", 1);
                intent.putExtra("ModuleCredit", 4);
                intent.putExtra("Venue", "W64N");
                startActivity(intent);
            }
        });
        G953.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, FirstActivity.class);
                intent.putExtra("ModuleCode","G953");
                intent.putExtra("ModuleName", "UI/UX Design for Apps");
                intent.putExtra("AcademicYear", 2);
                intent.putExtra("Semester", 1);
                intent.putExtra("ModuleCredit", 1);
                intent.putExtra("Venue", "W64N");
                startActivity(intent);
            }
        });
    }
}