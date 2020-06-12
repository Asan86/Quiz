package space.turdukulov.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class GameLevels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamelevels);

        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Button button_back = (Button)findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Здесь будет команда для кнопки

                //Начало конструкции
                try {                                 // Попытка выполнить команду
                    Intent intent = new Intent(GameLevels.this, MainActivity.class); // Переход из GameLevels в MainActivity
                    startActivity(intent);finish();
                }catch (Exception e){                // Поймает ошибку

                }
                //Конец конструкции
            }
        });
    }
    // Системная кнопка "Назад" начало

    @Override
    public void onBackPressed() {
        try {                                 // Попытка выполнить команду
            Intent intent = new Intent(GameLevels.this, MainActivity.class); // Переход из GameLevels в MainActivity
            startActivity(intent);finish();
        }catch (Exception e){                // Поймает ошибку

        }
    }

    // Системная кнопка "Назад" конец

}