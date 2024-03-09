package com.example.flutter_js_imp

import android.os.Bundle
import io.flutter.embedding.android.FlutterActivity

class MainActivity : FlutterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        System.loadLibrary("cblite");
        System.loadLibrary("cblitedart");
        super.onCreate(savedInstanceState)
    }
}