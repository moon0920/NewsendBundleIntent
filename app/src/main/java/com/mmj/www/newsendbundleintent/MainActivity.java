package com.mmj.www.newsendbundleintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnMain = findViewById(R.id.btnMain);
        btnMain.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        String text = ((Button)view).getText().toString();
        Bundle bundle = new Bundle();
        bundle.putString("singleName", text);
        Intent intent = new Intent(this,ExplicitActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
