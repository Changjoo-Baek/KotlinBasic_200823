package com.zzazzu.kotlinbasic_200823

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickMeBtn.setOnClickListener {
            it: View!
//              클릭미 버튼이 눌리면 실행될 코드 {    }

            Log.d("메인화면", "클릭 미 버튼 눌") 림
        }

//        xml에 추가한 버튼을 makeLogBtn 으로 이름지어서 => 눌리면 "로그 남기기 버튼 눌림" 로그 남겨보가
    }


        makeLogBtn.setOnClickListener
    {
        it: view!

        Log.d("메인화면", "로그 남기기 버튼 눌림")
    }
}