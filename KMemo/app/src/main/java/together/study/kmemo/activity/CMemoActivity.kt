package together.study.kmemo.activity

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.os.Environment
import android.util.Log
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_cmemo.*
import together.study.kmemo.R
import java.io.*

/**
 *
 * Created by Creaby on 2018. 1. 30..
 */
class CMemoActivity : Activity() {

    lateinit var save: ImageButton
    lateinit var file: ImageButton
    lateinit var contents: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cmemo)

//        val contents = findViewById<EditText>(R.id.edit_contents)

        save = findViewById<ImageButton>(R.id.btn_save) as ImageButton
        file = findViewById<ImageButton>(R.id.btn_file) as ImageButton
        contents = findViewById<EditText>(R.id.edit_contents) as EditText

//        val filePath = File(this.getExternalFilesDir(null).toString() + "/KMemo/")


        save.setOnClickListener {

        }



        file.setOnClickListener {

            var content:String? = contents.text.toString()
            var title:String? = edit_title.text.toString()

            Toast.makeText(this, contents.text.toString(), Toast.LENGTH_LONG).show()

            try {
                val file = File(Environment.getExternalStorageDirectory().absolutePath, title + ".txt")
//                var buffer = ByteArray(1024)
//                var read: Int = 0

                var path:String? = file.toString()

//                out = FileOutputStream(path)

                val temp = "abc"

//                OutputStream fos = new FileOutputStream(path)

//                val saveFile = OutputStreamWriter(openFileOutput(path, Activity.MODE_PRIVATE))
//                FileOutputStream(path).use { output ->
//                    this.write(content)
//                }

                Log.e("KMemo", "bla2 : " + title)
                this.openFileOutput(title, Context.MODE_PRIVATE).use {
                    it.write(temp.toByteArray())
                }

//                val saveFile = OutputStreamWriter(openFileOutput(path, Activity.MODE_PRIVATE))
//                saveFile.write(content)
//                saveFile.flush()
//                saveFile.close()

                Toast.makeText(this, "complete", Toast.LENGTH_LONG).show()

            } catch(e : IOException) {
                e.printStackTrace()
            }
//            val saveFile = OutputStreamWriter(openFileOutput(title, Activity.MODE_PRIVATE))
//            saveFile.write(content)
//            saveFile.flush()
//            saveFile.close()
        }

    }
}
