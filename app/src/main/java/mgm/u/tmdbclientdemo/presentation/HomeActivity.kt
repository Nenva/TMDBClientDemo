package mgm.u.tmdbclientdemo.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import mgm.u.tmdbclientdemo.R
import mgm.u.tmdbclientdemo.databinding.ActivityHomeBinding
import mgm.u.tmdbclientdemo.presentation.artist.ArtistActivity
import mgm.u.tmdbclientdemo.presentation.movie.MovieActivity
import mgm.u.tmdbclientdemo.presentation.tvshows.TVShowActivity

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home)

        binding.moviesButton.setOnClickListener {
            val intent = Intent(this, MovieActivity::class.java)
            startActivity(intent)
        }

        binding.tvButtons.setOnClickListener {
            val intent = Intent(this, TVShowActivity::class.java)
            startActivity(intent)
        }

        binding.artistsButton.setOnClickListener {
            val intent = Intent(this, ArtistActivity::class.java)
            startActivity(intent)
        }
    }
}