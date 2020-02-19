package com.example.mddialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Dialog myDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDialog = new Dialog(MainActivity.this);
        myDialog.setContentView(R.layout.my_dialog);

        Button btnPressMe = findViewById(R.id.btnPressMe);
        btnPressMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                myDialog.show();

            }
        });

        //We have three buttons that define to the dialog.Now we have to declare every each button.
        //But this buttons are inside in my_dialog.xml So we must related to activity_main.xml to run this app.-->
        Button btnAccept = myDialog.findViewById(R.id.btnAccept);
        Button btnCancel = myDialog.findViewById(R.id.btnCancel);
        Button btnDelete = myDialog.findViewById(R.id.btnDelete);

        btnAccept.setOnClickListener(MainActivity.this);
        btnCancel.setOnClickListener(MainActivity.this);
        btnDelete.setOnClickListener(MainActivity.this);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.btnAccept:
                Toast.makeText(MainActivity.this,"Accepted",Toast.LENGTH_SHORT).show();
                myDialog.dismiss();
                break;
            case  R.id.btnCancel:
                Toast.makeText(MainActivity.this,"Canceled",Toast.LENGTH_SHORT).show();
                myDialog.dismiss();
                break;
            case R.id.btnDelete:
                Toast.makeText(MainActivity.this,"Deleted",Toast.LENGTH_SHORT).show();
                myDialog.dismiss();
                break;
        }

    }
}
