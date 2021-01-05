package mgm.u.tmdbclientdemo.presentation.tvshows

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import mgm.u.tmdbclientdemo.R
import mgm.u.tmdbclientdemo.databinding.ActivityTvShowBinding

class TVShowActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTvShowBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_tv_show)
    }
}