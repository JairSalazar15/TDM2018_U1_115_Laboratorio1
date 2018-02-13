package tdm2018.ittepic.edu.tdm2018_u1_115_laboratorio1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    Button anterior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        anterior=(Button)findViewById(R.id.btnRun2);

        anterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(Main2Activity.this,MainActivity.class);
                startActivity(intent2);
            }
        });
    }
}
