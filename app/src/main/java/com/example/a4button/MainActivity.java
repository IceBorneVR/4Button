package com.example.a4button;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    // 변수 선언
    Button btn_nate, btn_911, btn_gallery, btn_shutdown;

    // 앱 실행 후 가장 먼저 로딩되는 부분
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // activity_main.xml 에서 생성했던 객체와 연결
        // 얘네가 꼭 제일 앞에 있어야됨
        btn_nate = (Button) findViewById(R.id.btn_nate);
        btn_911 = (Button) findViewById(R.id.btn_911);
        btn_gallery = (Button) findViewById(R.id.btn_gallery);
        btn_shutdown = (Button) findViewById(R.id.btn_shutdown);

        // 버튼 글자 및 배경 색상 변경
        btn_nate.setBackgroundColor(Color.GRAY);
        btn_nate.setTextColor(Color.BLACK);
        btn_911.setBackgroundColor(Color.GREEN);
        btn_911.setTextColor(Color.BLACK);
        btn_gallery.setBackgroundColor(Color.RED);
        btn_shutdown.setBackgroundColor(Color.YELLOW);
        btn_shutdown.setTextColor(Color.BLACK);

        // Nate 버튼 클릭 메소드
        btn_nate.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.nate.com/"));
                startActivity(mIntent);
            }
        });

        // 911 버튼 클릭 메소드
        btn_911.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/911"));
                startActivity(mIntent);
            }
        });

        // 갤러리 버튼 클릭 메소드
        btn_gallery.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"));
                startActivity(mIntent);
            }
        });

        // 종료 버튼 클릭 메소드
        btn_shutdown.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(getApplicationContext(),"앱이 종료되었습니다.", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

    }
}