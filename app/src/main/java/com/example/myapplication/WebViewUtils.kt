import android.util.Log
import android.webkit.WebResourceError
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.AndroidView
import androidx.activity.ComponentActivity

@Composable
fun WebViewComponent(activity: ComponentActivity) {
    AndroidView(factory = {
        WebView(activity).apply {
            settings.javaScriptEnabled = true
            webViewClient = object : WebViewClient() {
                override fun onPageFinished(view: WebView?, url: String?) {
                    Log.d("WebView", "Page loaded: $url")
                }
                override fun onReceivedError(
                    view: WebView?, request: WebResourceRequest?, error: WebResourceError?
                ) {
                    Log.e("WebView", "Error loading page: $error")
                }
            }
            loadUrl("file:///android_asset/index.html")
        }
    })
}
