package together.study.kmemo.activity

import android.app.Activity
import android.os.Bundle
import together.study.kmemo.R

class AtlasActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main_atlas)
    }

    override fun onBackPressed() {

        setResult(0)
        super.onBackPressed()

    }
}