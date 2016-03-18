package com.job.activity;

import com.job.R;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;


public class StartActivity extends Activity {

	private static final int FAILURE = 0; // 失败 
    private static final int SUCCESS = 1; // 成功 
    private static final int OFFLINE = 2; // 如果支持离线阅读，进入离线模式 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		new AsyncTask<Void, Void, Integer>() {

			@Override
			protected Integer doInBackground(Void... params) {
				int result;
				result = loadingCache();
				
				return result;
			}

			@Override
			protected void onPostExecute(Integer result) {
				Intent intent = new Intent(StartActivity.this,MainActivity.class);
				startActivity(intent);
				finish();
		
				
			}
			
			
			
		}.execute(new Void[]{});
	}

	protected int loadingCache() {
		
		return 0;
	}
}
