package com.package.name;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import com.package.name.R;

/**
 * Created by Rahimnejhad on 1/22/2018.
 */

public class CustomDialogClass extends Dialog implements View.OnClickListener {

    public Activity c;
    public Dialog d;
    public Button yes, no, man;
    MyOnClickListener mListener;

    public CustomDialogClass(Activity a, MyOnClickListener listener)
    {
        super(a);
        mListener = listener;
        this.c = a;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.custom_dialog);

        yes = (Button) findViewById(R.id.btn_yes);
        no = (Button) findViewById(R.id.btn_no);
        man= (Button) findViewById(R.id.btn_man);

        yes.setOnClickListener(this);
        no.setOnClickListener(this);
        man.setOnClickListener(this);

    }


    @Override
    public void onClick(View v)
    {
        mListener.onClick(v.getId(),this);
    }

    public interface MyOnClickListener
    {
        void onClick(int mId, Dialog d);
    }
}
