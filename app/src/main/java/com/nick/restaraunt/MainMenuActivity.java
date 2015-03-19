package com.nick.restaraunt;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.GetChars;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainMenuActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);


        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn3 = (Button) findViewById(R.id.btn3);
        Button btn4 = (Button) findViewById(R.id.btn4);
        Button btn5 = (Button) findViewById(R.id.btn5);

        btn1.setOnClickListener(oclBtn);
        btn2.setOnClickListener(oclBtn);


    }

    OnClickListener oclBtn = new OnClickListener() {


        @Override
        public void onClick(View v) {


            Intent intent;

            switch (v.getId()) {
                case R.id.btn1:
                    intent = new Intent(MainMenuActivity.this, ListOfCategoriesActivity.class);

                    startActivity(intent);
                    break;
                case R.id.btn2:
                    showDialogWithSingleList();
                    break;
                case R.id.btn3:
                    break;
                case R.id.btn4:
                    break;
                case R.id.btn5:
                    break;


            }
        }
    };


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main_menu_actvity, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id;

        id = item.getItemId();



        if(id == R.id.item3)
        {

            return true;
        }



        return super.onOptionsItemSelected(item);
    }


    private void showDialogWithSingleList() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.dialog_title);

        final int[] selectedItem = {0};

        builder.setSingleChoiceItems(R.array.dialog_items, selectedItem[0],
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        switch (which) {
                            case 0:
                                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://urartu.ua/ru/"));
                                startActivity(browserIntent);
                                break;

                            case 1:
                                StartWebView();
                                break;

                        }
                    }
                });



        AlertDialog dialog = builder.create();
        dialog.show();
    }


void StartWebView(){
    startActivity(new Intent(this, WebViewActivity.class));
}
}
