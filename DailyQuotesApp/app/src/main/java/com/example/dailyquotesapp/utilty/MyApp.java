package com.example.dailyquotesapp.utilty;

import android.app.Application;

public class MyApp extends Application {
	  
	  @Override
	  public void onCreate() {
		  TypefaceUtil.overrideFont(getApplicationContext(), "SERIF", "fonts/Bradley_Hand_ITC_TT.ttf"); // font from assets: "assets/fonts/Roboto-Regular.ttf
	  }
}