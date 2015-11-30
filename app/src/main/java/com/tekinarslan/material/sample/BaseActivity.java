package com.tekinarslan.material.sample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by bajian on 2015/11/30.
 * email 313066164@qq.com
 */
public class BaseActivity extends AppCompatActivity {

    public static final String SEND = "BAJAIN";

    private BroadcastReceiver br=new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            Log.e("BaseActivity", "Receive");
            if(SEND.equals(intent.getAction())){
                String msg = intent.getStringExtra("msg");
//                Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
                Intent it=new Intent(BaseActivity.this,DialogueActivity.class);
                it.putExtra("msg",msg);
                startActivity(it);
            }
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //zhuce
        IntentFilter filter = new IntentFilter();
        filter.addAction(SEND);
        registerReceiver(br,filter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(br);
    }
}
