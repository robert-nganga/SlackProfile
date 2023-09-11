package com.nganga.robert.slackprofile

import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView


@Composable
fun GithubProfileScreen(){
    val context = LocalContext.current

    AndroidView(
        factory = {
            WebView(context).apply {
                webViewClient = WebViewClient()
                loadUrl("https://github.com/robert-nganga")
            }},
        update = {
                 it.loadUrl("https://github.com/robert-nganga")
        },
        modifier = Modifier.fillMaxSize()
    )
}