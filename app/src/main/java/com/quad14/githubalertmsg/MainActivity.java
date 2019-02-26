package com.quad14.githubalertmsg;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.shashank.sony.fancydialoglib.Animation;
import com.shashank.sony.fancydialoglib.FancyAlertDialog;
import com.shashank.sony.fancydialoglib.FancyAlertDialogListener;
import com.shashank.sony.fancydialoglib.Icon;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fancyDialog();
    }

    public void fancyDialog(){
        new FancyAlertDialog.Builder(this)
                .setTitle("Start Service")
                .setBackgroundColor(Color.parseColor("#cc0000"))  //Don't pass R.color.colorvalue
                .setMessage("Select StartLiveData From Menu Items")
                .setNegativeBtnText("Cancel")
                .setPositiveBtnBackground(Color.parseColor("#00cc00"))  //Don't pass R.color.colorvalue
                .setPositiveBtnText("Ok")
                .setNegativeBtnBackground(Color.parseColor("#FFA9A7A8"))  //Don't pass R.color.colorvalue
                .setAnimation(Animation.SIDE)
                .isCancellable(true)
                .setIcon(R.drawable.ic_setting, Icon.Visible)
                .OnPositiveClicked(new FancyAlertDialogListener() {
                    @Override
                    public void OnClick() {
                        Toast.makeText(getApplicationContext(),"OK",Toast.LENGTH_SHORT).show();
                    }
                })
                .OnNegativeClicked(new FancyAlertDialogListener() {
                    @Override
                    public void OnClick() {
                        Toast.makeText(getApplicationContext(),"Cancel",Toast.LENGTH_SHORT).show();
                    }
                })
                .build();

    }
}
