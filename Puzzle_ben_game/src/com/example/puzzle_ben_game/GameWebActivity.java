package com.example.puzzle_ben_game;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class GameWebActivity extends Activity{
	private WebView webview;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.activity_gameweb);
		
		webview = (WebView)findViewById(R.id.webview);
		WebSettings webSetting = webview.getSettings();
		webSetting.setJavaScriptEnabled(true);
		webview.setWebViewClient(new WebViewClient() {
			@Override
			public boolean shouldOverrideUrlLoading(WebView view, String url) {
				view.loadUrl(url);
				return true;
			}
		});
		webview.loadUrl("http://114.215.127.231/xxm/miyu/riddle!challenge.action");
		
	}
}
