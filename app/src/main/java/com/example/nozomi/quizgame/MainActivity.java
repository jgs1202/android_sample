package com.example.nozomi.quizgame;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //タイトルバーを非表示にする（必ずsetContentViewの前にすること）
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        // レイアウトをセットする
        setContentView(R.layout.activity_main);

        // フォントを変更 ここから***********************************************************************************

        // タイトルテキスト
        ((TextView)findViewById(R.id.titleText)).setTypeface(Typeface.createFromAsset(getAssets(), "fonts/manteka.ttf"));
        // Normalボタン
        ((Button)findViewById(R.id.button_normal)).setTypeface(Typeface.createFromAsset(getAssets(), "fonts/manteka.ttf"));
        // Randomボタン
        ((Button)findViewById(R.id.button_random)).setTypeface(Typeface.createFromAsset(getAssets(), "fonts/manteka.ttf"));
        // TimeAttackボタン
        ((Button)findViewById(R.id.button_time)).setTypeface(Typeface.createFromAsset(getAssets(), "fonts/manteka.ttf"));

        // フォントを変更 ここまで***********************************************************************************
    }

    // ボタンがタッチされた時の処理
    public void onClick(View v){
        switch (v.getId()) {
            // タッチされたボタンがノーマルの場合
            case R.id.button_normal:
//                Toast.makeText(this, "ノーマルがタッチされた！", Toast.LENGTH_SHORT).show();
                // 遷移先のActivityを指定
                // Intent intent = new　Intent(このクラスから, このクラスへ)
                Intent intent = new Intent(MainActivity.this, StageSelect.class);
                // 遷移開始
                startActivity(intent);
                break;
            // タッチされたボタンがランダムの場合
            case R.id.button_random:
                Toast.makeText(this, "ランダムがタッチされた！", Toast.LENGTH_SHORT).show();
                break;
            // タッチされたボタンがタイムアタックの場合
            case R.id.button_time:
                Toast.makeText(this, "タイムアタックがタッチされた！", Toast.LENGTH_SHORT).show();
                break;
        }
    }

}

