package ru.otus.otusdemo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // вызывается в момент инициализиации экрана
    // и служит для задания системных параметров, файла верстки
    // Вызывается перед отрисовкой экрана, верстка создана, но экран не отобразился
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // Вызывается после отрисовки экрана, но пользователь в момент вызова еще не может
    // взаимодействовать с интерфейсом
    override fun onStart() {
        super.onStart()
        val button = findViewById<Button>(R.id.buttonSecondActivity)
        button.setOnClickListener {

//            val id = (applicationContext as OtusApplication).id
//            Toast.makeText(this, "Кнопка бэк была нажата", Toast.LENGTH_SHORT).show()

            val intent = Intent(applicationContext, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    // Весь экран отрисован, готов к работе, пользователю доступно взаимодействие с интерфейсом
    override fun onResume() {
        super.onResume()
    }

    //У пользователя пропадает возможность взаимодействовать с интерфейсом, хотя экран еще виден
    override fun onPause() {
        super.onPause()
    }

    // Экран уже не виден
    override fun onStop() {
        super.onStop()
        // отменить все запросы кеоторые были отправлены но не дошли
    }

    // Наша активити уничтожена и больше нет ее в памяти
    override fun onDestroy() {
        super.onDestroy()
    }
}
