import android.webkit.WebView
import androidx.activity.ComponentActivity
import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun WebViewComponent(activity: ComponentActivity) {
    val webView = WebView(activity)
    webView.settings.javaScriptEnabled = true
    webView.loadUrl("file:///android_asset/index.html")
    AndroidView({ webView }) { androidWebView ->
        androidWebView.settings.javaScriptEnabled = true
    }
}
