package com.example.administrator.disanke.recyclerview;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.administrator.disanke.R;

public class WebActivity extends AppCompatActivity {

    private WebView w1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        w1=findViewById(R.id.web_1);
        w1.getSettings().setJavaScriptEnabled(true);
        w1.setWebViewClient(new MyWebviewClient());
        w1.setWebChromeClient(new MyWebChromeClient());
        w1.loadUrl("http://m.baidu.com");
        }
        class MyWebChromeClient extends WebChromeClient{
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                super.onProgressChanged(view, newProgress);

            }

            @Override
            public void onReceivedTitle(WebView view, String title) {
                super.onReceivedTitle(view, title);
                setTitle(title);
            }
        }
        class MyWebviewClient extends  WebViewClient{
           @TargetApi(Build.VERSION_CODES.LOLLIPOP)
           @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                view.loadUrl(request.getUrl().toString());
                return true;
            }

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                Log.d("WebView", "onPageStarted...");
            }

            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                Log.d("WebView", "onPageFinished...");
                //w1.loadUrl("javascript:alert('hello')");
               // w1.evaluateJavascript("javascript:alert('222')",null);
            }
        }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode==KeyEvent.KEYCODE_BACK&&w1.canGoBack()){
            w1.goBack();
            return  true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
