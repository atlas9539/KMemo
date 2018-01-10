package together.study.kmemo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import together.study.kmemo.activity.AtlasActivity
import together.study.kmemo.activity.CreabyActivity

class MainActivity : AppCompatActivity(){

    val REQ_CODE = 7777 as Int
    val TAG = "WHAT THE FUN"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        cmemo.setOnClickListener{
            Toast.makeText(this,"go to Creaby",Toast.LENGTH_SHORT).show()
            val intent = Intent(this,CreabyActivity::class.java)
            startActivity(intent)

        }

        amemo.setOnClickListener {
            Toast.makeText(this,"go to Atlas",Toast.LENGTH_SHORT).show()

            val intent = Intent(this,AtlasActivity::class.java)
            startActivityForResult(intent,REQ_CODE)

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        Toast.makeText(this,""+resultCode,Toast.LENGTH_SHORT).show()

    }
}
