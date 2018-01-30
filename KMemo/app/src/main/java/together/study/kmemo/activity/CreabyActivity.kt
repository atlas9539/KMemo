package together.study.kmemo.activity

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_creaby.*
import together.study.kmemo.R


class CreabyActivity : Activity() {

    val TAG ="Creaby"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_creaby)

        btn_first.setOnClickListener {
            first_text.setText(R.string.hello_world)
        }

    }

}