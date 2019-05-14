package com.marivin.motherandbabycare;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Consult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consult);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Consult");

        Button chat = (Button) findViewById(R.id.chatNow);
        chat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //Uri uri = Uri.parse("smsto:" + "+6285647697981");
                //Intent i = new Intent(Intent.ACTION_SENDTO, uri);
                //i.setPackage("com.whatsapp");
                //startActivity(i);
                openWhatsApp("+6285647697981");
            }
        });
    }

    private void openWhatsApp(String number) {
        try {
            number = number.replace(" ", "").replace("+", "");

            Intent sendIntent = new Intent("android.intent.action.MAIN");
            sendIntent.setComponent(new ComponentName("com.whatsapp","com.whatsapp.Conversation"));
            sendIntent.putExtra("jid", PhoneNumberUtils.stripSeparators(number)+"@s.whatsapp.net");
            startActivity(sendIntent);

        } catch(Exception e) {
            //Log.e(TAG, "ERROR_OPEN_MESSANGER"+e.toString());
        }
    }
}
