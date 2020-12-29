package mgm.u.tmdbclientdemo.data.repository.tvshow.datasource

import mgm.u.tmdbclientdemo.data.model.movie.Movie
import mgm.u.tmdbclientdemo.data.model.tvshow.TVShow

interface TVShowLocalDataSource {
    suspend fun getTVShowsFromDB(): List<TVShow>
    suspend fun saveTVShowsToDB(movies: List<TVShow>)
    suspend fun clearAllTVShows()
}