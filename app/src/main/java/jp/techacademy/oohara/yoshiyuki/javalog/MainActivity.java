package jp.techacademy.oohara.yoshiyuki.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("そら", 3, "おもちゃ");     // 名前をそら、年齢3歳、趣味はおもちゃで、Humanのインスタンスを作る

        human.say();
        human.think();

        Human human2 = new Human("うみ", 29, "ダイエット");     // 名前をうみ、年齢29歳、趣味はダイエットで、Humanのインスタンスを作る

        human2.say();
        human2.think();
    }


}
