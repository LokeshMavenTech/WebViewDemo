package app.scrollfrom.webviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
WebView myWebApp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myWebApp=findViewById(R.id.myWebApp);
        myWebApp.getSettings().setJavaScriptEnabled(true);
        myWebApp.setWebViewClient(new WebViewClient());
        myWebApp.loadUrl("www.w3schools.com");
    }
}