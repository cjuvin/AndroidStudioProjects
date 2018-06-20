package fr.julien.eldapptest;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private Button shoplist;
    private Button coffee;
    private Button appointment;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.shoplist= findViewById(R.id.shoplist);
        this.coffee=findViewById(R.id.coffee);
        this.appointment=findViewById(R.id.appointment);

        shoplist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherAct = new Intent(getApplicationContext(),ShopList.class);
                startActivity(otherAct);
                // finish();
            }
        });
        coffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherAct = new Intent(getApplicationContext(),Directory.class);
                startActivity(otherAct);
                //finish();
            }
        });

        /*appointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherAct = new Intent(getApplicationContext(),Appointement.class);
                startActivity(otherAct);
                finish();
            }
        });*/
    }
}

