package com.example.lishuangling.liverobot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.lishuangling.liverobot.net.TuLingDataBean;
import com.example.lishuangling.liverobot.net.TulingRequestBean;
import com.example.okhttputils.GsonUtils;
import com.example.okhttputils.OkHttpUtils;
import com.example.okhttputils.callback.GenericsCallback;
import com.example.okhttputils.callback.GenericsJsonFormat;
import com.example.okhttputils.callback.StringCallback;
import com.example.okhttputils.request.RequestCall;

import okhttp3.Call;
import okhttp3.MediaType;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText editText;
    private TextView textView;
    private TulingRequestBean tulingRequestBean;
    private TulingRequestBean.UserInfoBean userInfoBean;
    private TulingRequestBean.PerceptionBean perceptionBean;
    private TulingRequestBean.PerceptionBean.InputTextBean inputTextBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.bt_test);
        editText = (EditText) findViewById(R.id.et_message);
        textView = (TextView) findViewById(R.id.tv_message);
        button.setOnClickListener(onClickListener);
        initRequestData();
    }

    private void initRequestData() {
        tulingRequestBean = new TulingRequestBean();
        userInfoBean = new TulingRequestBean.UserInfoBean();
        userInfoBean.setApiKey("1528f81095914bdba5dedd7417c3e7ee");
        userInfoBean.setUserId(1);
        perceptionBean = new TulingRequestBean.PerceptionBean();
        inputTextBean = new TulingRequestBean.PerceptionBean.InputTextBean();
        tulingRequestBean.setPerception(perceptionBean);
        tulingRequestBean.setUserInfo(userInfoBean);
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            inputTextBean.setText(editText.getText().toString());
            perceptionBean.setInputText(inputTextBean);
            String content = GsonUtils.getGson().toJson(tulingRequestBean);
            RequestCall requestCall = OkHttpUtils.getInstance().postString()
                    .mediaType(MediaType.parse("application/json"))
                    .content(content)
                    .url("http://openapi.tuling123.com/openapi/api/v2").build();
            requestCall.execute(new StringCallback() {
                @Override
                public void onException(Call call, Exception e, int id) {

                }

                @Override
                public void onResponse(String response, int id) {
                    Log.e("lishling","response string is =" +response);
                    textView.setText(response);
                }

                @Override
                public void onErrorResponse(int statusCode, String responseBody, int id) {

                }
            });
        }
    };

}
