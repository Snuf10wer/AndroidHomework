package com.example.myapplication;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        EditText zhanghao;
        EditText mima;
        Button anniu;
        Toast toastSuccess = Toast.makeText(getApplicationContext(),"登陆成功",Toast.LENGTH_SHORT);
        Toast toastFail = Toast.makeText(getApplicationContext(),"用户名或密码错误",Toast.LENGTH_SHORT);
        toastSuccess.setGravity(Gravity.BOTTOM,0,0);
        toastFail.setGravity(Gravity.BOTTOM,0,0);


        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        zhanghao = (EditText)findViewById(R.id.zhanghao);
        mima = (EditText)findViewById(R.id.mima);
        anniu = (Button)findViewById(R.id.anniu);



        anniu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String xingming = zhanghao.getText().toString();
                String xuehao = mima.getText().toString();
                if(xingming.equals("xuruikang")&&xuehao.equals("202115029")){
                    toastSuccess.show();
                }
                else{
                    toastFail.show();
                }
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}