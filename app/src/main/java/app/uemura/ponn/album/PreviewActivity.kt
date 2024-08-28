package app.uemura.ponn.album

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import app.uemura.ponn.album.databinding.ActivityMainBinding
import app.uemura.ponn.album.databinding.ActivityPreviewBinding

class PreviewActivity : AppCompatActivity() {

    //バインディングクラスの変数
    private lateinit var binding: ActivityPreviewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityPreviewBinding.inflate(layoutInflater).apply { setContentView(this.root) }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //前の画面から写真を受け取る
        val imageId = intent.getIntExtra("image", 0)

        //前の画面からタイトルを受け取る
        val displayTitle = intent.getStringExtra("title")

        //受け取った写真をセット
        binding.previewImage.setImageResource(imageId)

        //受け取ったタイトルをセット
        binding.titleText.text = displayTitle

        //戻るボタンがタップされたとき
        binding.backButton.setOnClickListener() {
            //画面を閉じる
            finish()
        }
    }
}