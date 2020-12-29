package mgm.u.tmdbclientdemo.data.repository.tvshow.datasource

import mgm.u.tmdbclientdemo.data.model.movie.Movie
import mgm.u.tmdbclientdemo.data.model.tvshow.TVShow

interface TVShowCacheDataSource {
    suspend fun getTVShowFromCache(): List<TVShow>
    suspend fun saveTVShowToCache(tvShows: List<TVShow>)
}