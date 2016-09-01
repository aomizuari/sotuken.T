package com.example.tanabe.sotukent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ArrayAdapter を作成
        String items[] = {"帽子","シャツ","ズボン","ワンピース"};
        ArrayAdapter<String> adapter
                = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, items);

        // ドロップダウンリストのレイアウトを設定
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //spinnerにAdapterを設定
        Spinner spinner  = (Spinner)this.findViewById(R.id.Spinner01);
        spinner.setAdapter(adapter);
        // Spinner に表示させるプロンプトを設定
        spinner.setPromptId(R.string.app_name);

        // スピナーのアイテムが選択された時に呼び出されるコールバックリスナーを登録します
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            //Spinnerのドロップダウンアイテムが選択された時
            public void onItemSelected(AdapterView parent, View viw, int arg2, long arg3) {
                Spinner spinner = (Spinner)parent;
                String item = (String)spinner.getSelectedItem();
                Toast.makeText(MainActivity.this, item, Toast.LENGTH_LONG).show();
            }
            //Spinnerのドロップダウンアイテムが選択されなかった時
            public void onNothingSelected(AdapterView parent) {
            }});

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//インテントの作成
                Intent intent = new Intent(getApplication(), sub1.class);
//データをセット
                EditText editText = (EditText)findViewById(R.id.editText);
                intent.putExtra("sendText",editText.getText().toString());

                EditText editText2 = (EditText)findViewById(R.id.editText2);
                intent.putExtra("sendText2",editText2.getText().toString());
//遷移先の画面を起動
                startActivity(intent);
            }
        });
    }

}
