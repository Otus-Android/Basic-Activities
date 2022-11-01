package otus.gpb.homework.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)
    }

    fun onClickGoA(view: View){
        val intent = Intent(this, ActivityA::class.java)
            .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
    }

    // в кейсе с переходом в ActivityD (onClickGoD) не понятно как действовать
    // флаг FLAG_ACTIVITY_CLEAR_TASK - отлично сработал бы если бы у нас была ActivityD корневой
    //, иначе это не сработает как в кеейсе

    //конструкция .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK) также хороший вариант
    // но по тз не подходит, так как FLAG_ACTIVITY_NEW_TASK открывает новый стек

    // как вариант думала не сохранять в стеке, но это не эффективно и также по тз не проходит

    fun onClickGoD(view: View){
        val intent = Intent(this, ActivityD::class.java)
            .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
        startActivity(intent)
    }

    fun onClickGoC(view: View){
        finish()
    }

    fun onClickCloseStack(view: View){
        finishAffinity()
    }
}