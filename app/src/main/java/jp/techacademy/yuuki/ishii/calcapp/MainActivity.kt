
package jp.techacademy.yuuki.ishii.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Plus process
        button.setOnClickListener{
            if(editText.text.toString() != "" && editText2.text.toString() != "" ){
                val intent = Intent(this, SecondActivity::class.java)
                var value1 = editText.text.toString().toDouble()
                var value2 = editText2.text.toString().toDouble()
                val value = value1 + value2
                intent.putExtra("VALUE", value.toString())
                startActivity(intent)
            } else {
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("VALUE","エラーです。必ず数値を入力してください")
                startActivity(intent)
            }
        }

        //Minus process
        Minus.setOnClickListener{
            if(editText.text.toString() != "" && editText2.text.toString() != "" ){
                val intent = Intent(this, SecondActivity::class.java)
                var value1 = editText.text.toString().toDouble()
                var value2 = editText2.text.toString().toDouble()
                val value = value1 - value2
                intent.putExtra("VALUE", value.toString())
                startActivity(intent)
            } else {
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("VALUE","エラーです。必ず数値を入力してください")
                startActivity(intent)
            }
        }

        //Multi process
        multiply.setOnClickListener{
            if(editText.text.toString() != "" && editText2.text.toString() != "" ){
                val intent = Intent(this, SecondActivity::class.java)
                var value1 = editText.text.toString().toDouble()
                var value2 = editText2.text.toString().toDouble()
                val value = value1 * value2
                intent.putExtra("VALUE", value.toString())
                startActivity(intent)
            } else {
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("VALUE","エラーです。必ず数値を入力してください")
                startActivity(intent)
            }
        }

        //Div process
        divider.setOnClickListener{
            if(editText.text.toString() != "" && editText2.text.toString() != "" ){
                val intent = Intent(this, SecondActivity::class.java)
                var value1 = editText.text.toString().toDouble()
                var value2 = editText2.text.toString().toDouble()
                val value = value1 / value2
                intent.putExtra("VALUE", value.toString())
                startActivity(intent)
            } else {
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("VALUE","エラーです。必ず数値を入力してください")
                startActivity(intent)
            }
        }

    }
}