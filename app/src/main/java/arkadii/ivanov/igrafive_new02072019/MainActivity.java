package arkadii.ivanov.igrafive_new02072019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

	private static final String TAG = "MyLog";


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.d(TAG, "Сработал метод onCreate в MainActivity");

		//Убераем понель состояния (выше ActionBar)
		Window w = getWindow();
		w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		Log.d(TAG, "Убралась понель состояния в MainActivity");


	}

	public void BtnOne_Start(View view) {
		Intent intent = new Intent(MainActivity.this, One_levelActivity.class);
		startActivity(intent);
		Log.d(TAG, "сработала кнопка btn_start");
	}


}
