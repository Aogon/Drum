package app.sakai.tororoimo.drum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var menu: String = "チーズバーガー"
        textView.text = menu + "は" + priceDecision(menu).toString() + "円です"
    }

    fun priceDecision(menu: String): Int {
        var price: Int = 0
        if (menu == "チーズバーガー") {
            price = 125
        } else if (menu == "ダブルチーズバーガー") {
            price = 300
        }
        return price
    }
}
