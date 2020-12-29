package mgm.u.tmdbclientdemo.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import mgm.u.tmdbclientdemo.data.model.artist.Artist
import mgm.u.tmdbclientdemo.data.model.movie.Movie
import mgm.u.tmdbclientdemo.data.model.tvshow.TVShow

@Database(entities = [Movie::class, TVShow::class, Artist::class],
version = 1,
exportSchema = false)
abstract class TMDBDatabase : RoomDatabase() {

    abstract fun movieDao() : MovieDao

    abstract fun tvDao() : TVShowDao

    abstract fun artistDao() : ArtistDao
}