package app.uemura.ponn.album

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import app.uemura.ponn.album.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //バインディングクラスの変数
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater).apply { setContentView(this.root ) }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //プレビュー画像に情報を送る変数を準備
        val preview = Intent(this, PreviewActivity::class.java)

        //海の写真がタップされたとき
        binding.albumImage1.setOnClickListener{
            //海の写真をセットする
            preview.putExtra("image", R.drawable.sea_image)
            //タイトルをセットする
            preview.putExtra("title", "海")
            //プレビュー画面に送る
            startActivity(preview)
        }

        //猫の写真がタップされたとき
        binding.albumImage2.setOnClickListener{
            //猫の写真をセットする
            preview.putExtra("image", R.drawable.cat_image)
            //タイトルをセットする
            preview.putExtra("title", "猫")
            //プレビュー画面に送る
            startActivity(preview)
        }


        //海の写真がタップされたとき
        binding.albumImage3.setOnClickListener{
            //子犬の写真をセットする
            preview.putExtra("image", R.drawable.dog_image)
            //タイトルをセットする
            preview.putExtra("title", "子犬")
            //プレビュー画面に送る
            startActivity(preview)
        }


        //ケーキの写真がタップされたとき
        binding.albumImage4.setOnClickListener{
            //ケーキの写真をセットする
            preview.putExtra("image", R.drawable.cake_image)
            //タイトルをセットする
            preview.putExtra("title", "ケーキ")
            //プレビュー画面に送る
            startActivity(preview)
        }


        //夜景の写真がタップされたとき
        binding.albumImage5.setOnClickListener{
            //夜景の写真をセットする
            preview.putExtra("image", R.drawable.night_image)
            //タイトルをセットする
            preview.putExtra("title", "夜景")
            //プレビュー画面に送る
            startActivity(preview)
        }


        //花の写真がタップされたとき
        binding.albumImage1.setOnClickListener{
            //花の写真をセットする
            preview.putExtra("image", R.drawable.flower_image)
            //タイトルをセットする
            preview.putExtra("title", "桜")
            //プレビュー画面に送る
            startActivity(preview)
        }
    }
}