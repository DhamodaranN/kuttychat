package com.chatapp.tamilchat1;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MyAppWebViewClient extends WebViewClient {

    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        if (url.contains("tel:")) {
            view.getContext().startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(url)));
            return true;
        } else if (url.contains("mailto:")) {
            view.getContext().startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
            return true;
        } else if (url.contains("https://goo.gl/")) {
            view.getContext().startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
            return true;
        } else {
            view.loadUrl(url);
            return true;
        }
    }
}