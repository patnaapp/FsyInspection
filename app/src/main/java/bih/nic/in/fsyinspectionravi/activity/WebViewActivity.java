package bih.nic.in.fsyinspectionravi.activity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import bih.nic.in.fsyinspectionravi.R;

public class WebViewActivity extends AppCompatActivity {
    WebView webview;
    ProgressBar progressbar;
    String idproof = "",resedential = "",bankpassbook = "",bhu_swamitwa ="",swa_gosna;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        try {
            idproof = getIntent().getStringExtra("IDPROOF");
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            resedential = getIntent().getStringExtra("resedential");
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            bankpassbook = getIntent().getStringExtra("bankpassbook");
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            bhu_swamitwa = getIntent().getStringExtra("bhu_swamitwa");
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            swa_gosna = getIntent().getStringExtra("swa_gosna");
        }catch (Exception e){
            e.printStackTrace();
        }


        webview = (WebView)findViewById(R.id.webview);
        progressbar = (ProgressBar) findViewById(R.id.progressbar);
        webview.getSettings().setJavaScriptEnabled(true);
        String filename ="https://www3.nd.edu/~cpoellab/teaching/cse40816/android_tutorial.pdf";
        if(!(idproof.equalsIgnoreCase("N") )){
                webview.loadUrl("http://docs.google.com/gview?embedded=true&url=" + idproof);
        }else if(!(resedential.equalsIgnoreCase("N"))) {
            webview.loadUrl("http://docs.google.com/gview?embedded=true&url=" + resedential);
        }else if(!(bankpassbook.equalsIgnoreCase("N"))) {
            webview.loadUrl("http://docs.google.com/gview?embedded=true&url=" + bankpassbook);
        }else if(!(bhu_swamitwa.equalsIgnoreCase("N"))) {
            webview.loadUrl("http://docs.google.com/gview?embedded=true&url=" + bhu_swamitwa);
        }else if(!(swa_gosna.equalsIgnoreCase("N"))){
            webview.loadUrl("http://docs.google.com/gview?embedded=true&url=" + swa_gosna);
        }else {
            Toast.makeText(WebViewActivity.this, "कोई रिकॉर्ड नही है!", Toast.LENGTH_SHORT).show();

        }

        webview.setWebViewClient(new WebViewClient() {

            public void onPageFinished(WebView view, String url) {
                // do your stuff here
                progressbar.setVisibility(View.GONE);
            }
        });


//        WebView webview = (WebView) findViewById(R.id.webview);
//        webview.getSettings().setJavaScriptEnabled(true);
//        String pdf = "http://10.133.20.159/TestService/FSY/Uploads/JBZREET8/1819/HELP/209000000004_SA_HELP.Pdf";
//        webview.loadUrl("http://drive.google.com/viewerng/viewer?embedded=true&url=" + pdf);


    }
}
