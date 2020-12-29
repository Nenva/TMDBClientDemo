package mgm.u.tmdbclientdemo.data.model.movie
import com.google.gson.annotations.SerializedName

data class MovieList(
    @SerializedName("movies")
    val movies: List<Movie>
)