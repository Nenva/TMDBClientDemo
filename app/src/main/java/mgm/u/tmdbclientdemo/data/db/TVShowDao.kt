package mgm.u.tmdbclientdemo.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import mgm.u.tmdbclientdemo.data.model.tvshow.TVShow

@Dao
interface TVShowDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveTVShows(tvShows : List<TVShow>)

    @Query("DELETE FROM popular_tvShows")
    suspend fun deleteAllTVShows()

    @Query("SELECT * FROM popular_tvShows")
    suspend fun getTVShows(): List<TVShow>
}