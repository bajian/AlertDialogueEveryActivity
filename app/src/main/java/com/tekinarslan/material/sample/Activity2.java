package com.tekinarslan.material.sample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by bajian on 2015/11/30.
 * email 313066164@qq.com
 */
public class Activity2 extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }


    public void send(View v){
        Intent intent = new Intent();
        intent.setAction(BaseActivity.SEND);
        intent.putExtra("msg", "this is the msg from sendBroadcast");
        sendBroadcast(intent);
        System.out.println("sendBroadcast");
    }
}
