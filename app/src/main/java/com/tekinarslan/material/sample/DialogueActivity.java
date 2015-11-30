package com.tekinarslan.material.sample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by bajian on 2015/11/30.
 * email 313066164@qq.com
 */
public class DialogueActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_dialogue);
        TextView tv=(TextView)findViewById(R.id.msg);

        Intent it=getIntent();
        String msg=it.getStringExtra("msg");
        tv.setText(msg);

    }

    public void jump1(View v){
        Intent it=new Intent(DialogueActivity.this,SampleActivity.class);
        it.putExtra("toMsgFragment",true);
        startActivity(it);
        finish();
    }
    public void exit(View v){
        finish();
    }
}
