package arkadii.ivanov.igrafive_new02072019;

import android.content.Intent;
import android.os.Bundle;
import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class One_levelActivity extends AppCompatActivity {

	//Говорим что бу нас будут логи, прописываем TAG
	private static final String TAG = "MyLog";

	//Говорим,что будем здесь использовать сlass One_Table_levelTextActivity
	One_Table_levelTextActivity one_table_levelTextActivity = new One_Table_levelTextActivity();

	//Говорим программе что будем оспользовать еше один class Deley.
	Delay delay = new Delay();

	//Здесь начинаеся Анимация
	public Animation a;
	public TextView textView_TitleOne1;
	public ImageView imageViewOne1;
	public TextView textView_Text1;
	public TextView textView_Text2;
	public TextView textView_Text3;
	public TextView textView_Text4;
	public TextView textView_Text5;
	public TextView textView_Text6;
	public ImageView imageViewOne2;
	public TextView textView_TitleOne2;
	public TextView textView_Text7;
	public TextView textView_Text8;
	public TextView textView_Text9;
	public TextView textView_Text10;
	public TextView textView_TitleOne3;
	public TextView textView_Text11;
	public TextView textView_Text12;
	public TextView textView_Text13;
	public ImageView imageViewOne3;
	public TextView textView_Text14;
	public TextView textView_Text15;
	public TextView textView_Text16;
	public TextView textView_Text17;
	public TextView textView_Text18;
	public TextView textView_Text19;
	public Button one_Btn_Next;

	// Здесь заканчивается Анимация
	public int line = 0;


	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_one_level);

		Log.d(TAG, "Сработал метод onCreate в One_levelActivity");

		//Убераем понель состояния (выше ActionBar)
		Log.d(TAG, "Убралась понель состояния в One_levelActivity");
		Window w = getWindow();
		w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

//Инициализируем переменные (строки, кнопки, картинки)
		final TextView textView_TitleOne1 = findViewById(R.id.textView_TitleOne1);
		final ImageView imageViewOne1 = findViewById(R.id.imageViewOne1);
		final TextView textView_Text1 = findViewById(R.id.textView_Text1);
		final TextView textView_Text2 = findViewById(R.id.textView_Text2);
		final TextView textView_Text3 = findViewById(R.id.textView_Text3);
		final TextView textView_Text4 = findViewById(R.id.textView_Text4);
		final TextView textView_Text5 = findViewById(R.id.textView_Text5);
		final TextView textView_Text6 = findViewById(R.id.textView_Text6);
		final ImageView imageViewOne2 = findViewById(R.id.imageViewOne2);
		final TextView textView_TitleOne2 = findViewById(R.id.textView_TitleOne2);
		final TextView textView_Text7 = findViewById(R.id.textView_Text7);
		final TextView textView_Text8 = findViewById(R.id.textView_Text8);
		final TextView textView_Text9 = findViewById(R.id.textView_Text9);
		final TextView textView_Text10 = findViewById(R.id.textView_Text10);
		final TextView textView_TitleOne3 = findViewById(R.id.textView_TitleOne3);
		final TextView textView_Text11 = findViewById(R.id.textView_Text11);
		final TextView textView_Text12 = findViewById(R.id.textView_Text12);
		final TextView textView_Text13 = findViewById(R.id.textView_Text13);
		final ImageView imageViewOne3 = findViewById(R.id.imageViewOne3);
		final TextView textView_Text14 = findViewById(R.id.textView_Text14);
		final TextView textView_Text15 = findViewById(R.id.textView_Text15);
		final TextView textView_Text16 = findViewById(R.id.textView_Text16);
		final TextView textView_Text17 = findViewById(R.id.textView_Text17);
		final TextView textView_Text18 = findViewById(R.id.textView_Text18);
		final TextView textView_Text19 = findViewById(R.id.textView_Text19);
		final TextView textView_Text20 = findViewById(R.id.textView_Text20);
		final Button one_Btn_Next = findViewById(R.id.one_Btn_Next);

		//Приписываем путь к тесту который будем брать из класса (one_table_levelTextActivity)
		textView_TitleOne1.setText(one_table_levelTextActivity.one_scenario[0]);
		textView_Text1.setText(one_table_levelTextActivity.one_scenario[1]);
		textView_Text2.setText(one_table_levelTextActivity.one_scenario[2]);
		textView_Text3.setText(one_table_levelTextActivity.one_scenario[3]);
		textView_Text4.setText(one_table_levelTextActivity.one_scenario[4]);
		textView_Text5.setText(one_table_levelTextActivity.one_scenario[5]);
		textView_Text6.setText(one_table_levelTextActivity.one_scenario[6]);
		textView_TitleOne2.setText(one_table_levelTextActivity.one_scenario[7]);
		textView_Text7.setText(one_table_levelTextActivity.one_scenario[8]);
		textView_Text8.setText(one_table_levelTextActivity.one_scenario[9]);
		textView_Text9.setText(one_table_levelTextActivity.one_scenario[10]);
		textView_Text10.setText(one_table_levelTextActivity.one_scenario[11]);
		textView_TitleOne3.setText(one_table_levelTextActivity.one_scenario[12]);
		textView_Text11.setText(one_table_levelTextActivity.one_scenario[13]);
		textView_Text12.setText(one_table_levelTextActivity.one_scenario[14]);
		textView_Text13.setText(one_table_levelTextActivity.one_scenario[15]);
		textView_TitleOne3.setText(one_table_levelTextActivity.one_scenario[16]);
		textView_Text14.setText(one_table_levelTextActivity.one_scenario[17]);
		textView_Text15.setText(one_table_levelTextActivity.one_scenario[18]);
		textView_Text16.setText(one_table_levelTextActivity.one_scenario[19]);
		textView_Text17.setText(one_table_levelTextActivity.one_scenario[20]);
		textView_Text18.setText(one_table_levelTextActivity.one_scenario[21]);
		textView_Text19.setText(one_table_levelTextActivity.one_scenario[22]);

		//В низу будет код, который будет прятать текст
		textView_TitleOne1.setVisibility(View.INVISIBLE);
		textView_Text1.setVisibility(View.INVISIBLE);
		textView_Text2.setVisibility(View.INVISIBLE);
		textView_Text3.setVisibility(View.INVISIBLE);
		textView_Text4.setVisibility(View.INVISIBLE);
		textView_Text5.setVisibility(View.INVISIBLE);
		textView_Text6.setVisibility(View.INVISIBLE);
		imageViewOne1.setVisibility(View.INVISIBLE);
		textView_TitleOne2.setVisibility(View.INVISIBLE);
		textView_Text7.setVisibility(View.INVISIBLE);
		textView_Text8.setVisibility(View.INVISIBLE);
		textView_Text9.setVisibility(View.INVISIBLE);
		textView_Text10.setVisibility(View.INVISIBLE);
		textView_TitleOne3.setVisibility(View.INVISIBLE);
		textView_Text11.setVisibility(View.INVISIBLE);
		textView_Text12.setVisibility(View.INVISIBLE);
		textView_Text13.setVisibility(View.INVISIBLE);
		imageViewOne2.setVisibility(View.INVISIBLE);
		textView_Text14.setVisibility(View.INVISIBLE);
		textView_Text15.setVisibility(View.INVISIBLE);
		textView_Text16.setVisibility(View.INVISIBLE);
		textView_Text17.setVisibility(View.INVISIBLE);
		textView_Text18.setVisibility(View.INVISIBLE);
		textView_Text19.setVisibility(View.INVISIBLE);
		imageViewOne3.setVisibility(View.INVISIBLE);
		one_Btn_Next.setVisibility(View.INVISIBLE);

//Прописываем анимацию.
		//final Animation a = AnimationUtils.loadAnimation(One_levelActivity.this, R.anim.alpfa);

		/*
		textView_TitleOne1.setVisibility(View.VISIBLE);
		textView_TitleOne1.startAnimation(a);
		imageViewOne1.setVisibility(View.VISIBLE);
		imageViewOne1.startAnimation(a);
		textView_Text1.setVisibility(View.VISIBLE);
		textView_Text1.startAnimation(a);
		textView_Text2.setVisibility(View.VISIBLE);
		textView_Text2.startAnimation(a);
		textView_Text3.setVisibility(View.VISIBLE);
		textView_Text3.startAnimation(a);
		textView_Text4.setVisibility(View.VISIBLE);
		textView_Text4.startAnimation(a);
		*/

		delay.execute();
	}

	//Кнопка "Назад" которая будет закрывать игру
	@Override
	public void onBackPressed() {
		delay.cancel(true);
		delay = null;
		finish();
	}

	//Команда которая запускает AsyncTask.

	//С этого места начинается код AsyncTask
	class Delay extends AsyncTask<Void, Integer, Void> {

		@Override
		protected Void doInBackground(Void... params) {
			while (line <= 26) {
				publishProgress(line++);
				try {
					Thread.sleep(5000);
					if (isCancelled()) return null;
				} catch (Exception e) {
				}
			}
			return null;
		}

		@Override
		protected void onProgressUpdate(Integer... values) {

			final TextView textView_TitleOne1 = findViewById(R.id.textView_TitleOne1);
			final ImageView imageViewOne1 = findViewById(R.id.imageViewOne1);
			final TextView textView_Text1 = findViewById(R.id.textView_Text1);
			final TextView textView_Text2 = findViewById(R.id.textView_Text2);
			final TextView textView_Text3 = findViewById(R.id.textView_Text3);
			final TextView textView_Text4 = findViewById(R.id.textView_Text4);
			final TextView textView_Text5 = findViewById(R.id.textView_Text5);
			final TextView textView_Text6 = findViewById(R.id.textView_Text6);
			final ImageView imageViewOne2 = findViewById(R.id.imageViewOne2);
			final TextView textView_TitleOne2 = findViewById(R.id.textView_TitleOne2);
			final TextView textView_Text7 = findViewById(R.id.textView_Text7);
			final TextView textView_Text8 = findViewById(R.id.textView_Text8);
			final TextView textView_Text9 = findViewById(R.id.textView_Text9);
			final TextView textView_Text10 = findViewById(R.id.textView_Text10);
			final TextView textView_TitleOne3 = findViewById(R.id.textView_TitleOne3);
			final TextView textView_Text11 = findViewById(R.id.textView_Text11);
			final TextView textView_Text12 = findViewById(R.id.textView_Text12);
			final TextView textView_Text13 = findViewById(R.id.textView_Text13);
			final ImageView imageViewOne3 = findViewById(R.id.imageViewOne3);
			final TextView textView_Text14 = findViewById(R.id.textView_Text14);
			final TextView textView_Text15 = findViewById(R.id.textView_Text15);
			final TextView textView_Text16 = findViewById(R.id.textView_Text16);
			final TextView textView_Text17 = findViewById(R.id.textView_Text17);
			final TextView textView_Text18 = findViewById(R.id.textView_Text18);
			final TextView textView_Text19 = findViewById(R.id.textView_Text19);
			//final TextView textView_Text20 = findViewById(R.id.textView_Text20);
			final Button one_Btn_Next = findViewById(R.id.one_Btn_Next);


			final Animation a = AnimationUtils.loadAnimation(One_levelActivity.this, R.anim.alpfa);
//Пишем switch (line). Смысл таков:
			// switch проверяет, если (line) равен 1, то textView_TitleOne1.setVisibility(View.VISIBLE); и т д. все в таком духе.
			switch (line) {
				case 1:
					textView_TitleOne1.setVisibility(View.VISIBLE);
					textView_TitleOne1.startAnimation(a);
					break;
				case 2:
					imageViewOne1.setVisibility(View.VISIBLE);
					imageViewOne1.startAnimation(a);
					break;
				case 3:
					textView_Text1.setVisibility(View.VISIBLE);
					textView_Text1.startAnimation(a);
					break;
				case 4:
					textView_Text2.setVisibility(View.VISIBLE);
					textView_Text2.startAnimation(a);
					break;
				case 5:
					textView_Text3.setVisibility(View.VISIBLE);
					textView_Text3.startAnimation(a);
					break;
				case 6:
					textView_Text4.setVisibility(View.VISIBLE);
					textView_Text4.startAnimation(a);
					break;
				case 7:
					textView_Text5.setVisibility(View.VISIBLE);
					textView_Text5.startAnimation(a);
					break;
				case 8:
					textView_Text6.setVisibility(View.VISIBLE);
					textView_Text6.startAnimation(a);
					break;
				case 9:
					imageViewOne2.setVisibility(View.VISIBLE);
					imageViewOne2.startAnimation(a);
					break;
				case 10:
					textView_TitleOne2.setVisibility(View.VISIBLE);
					textView_TitleOne2.startAnimation(a);
					break;
				case 11:
					textView_TitleOne3.setVisibility(View.VISIBLE);
					textView_TitleOne3.startAnimation(a);
					break;
				case 12:
					textView_Text7.setVisibility(View.VISIBLE);
					textView_Text7.startAnimation(a);
					break;
				case 13:
					textView_Text8.setVisibility(View.VISIBLE);
					textView_Text8.startAnimation(a);
					break;
				case 14:
					textView_Text9.setVisibility(View.VISIBLE);
					textView_Text9.startAnimation(a);
					break;
				case 15:
					textView_Text10.setVisibility(View.VISIBLE);
					textView_Text10.startAnimation(a);
				case 16:
					textView_Text11.setVisibility(View.VISIBLE);
					textView_Text11.startAnimation(a);
					break;
				case 17:
					textView_Text12.setVisibility(View.VISIBLE);
					textView_Text12.startAnimation(a);
					break;
				case 18:
					textView_Text13.setVisibility(View.VISIBLE);
					textView_Text13.startAnimation(a);
					break;
				case 19:
					imageViewOne3.setVisibility(View.VISIBLE);
					imageViewOne3.startAnimation(a);
				case 20:
					textView_Text14.setVisibility(View.VISIBLE);
					textView_Text14.startAnimation(a);
					break;
				case 21:
					textView_Text15.setVisibility(View.VISIBLE);
					textView_Text15.startAnimation(a);
					break;
				case 22:
					textView_Text16.setVisibility(View.VISIBLE);
					textView_Text16.startAnimation(a);
					break;
				case 23:
					textView_Text17.setVisibility(View.VISIBLE);
					textView_Text17.startAnimation(a);
					break;
				case 24:
					textView_Text18.setVisibility(View.VISIBLE);
					textView_Text18.startAnimation(a);
					break;
				case 25:
					textView_Text19.setVisibility(View.VISIBLE);
					textView_Text19.startAnimation(a);
					break;
				case 26:
					one_Btn_Next.setVisibility(View.VISIBLE);
					one_Btn_Next.startAnimation(a);
					break;
				default:
					break;
			}

		}

	}
	//На этом месте заканчивается код AsyncTask

	public void Click_one_Btn_Next(View view) {
		Intent intent = new Intent(One_levelActivity.this, Two_levelActivity.class);
		startActivity(intent);
		Log.d(TAG, "Сработала кнопка, переход на Two_levelActivity");

	}
}