package mgm.u.tmdbclientdemo.domain.repository

import mgm.u.tmdbclientdemo.data.model.movie.Movie
import mgm.u.tmdbclientdemo.data.model.tvshow.TVShow

interface TVShowRepository {

    suspend fun getTVShows(): List<TVShow>?
    suspend fun updateTVShows(): List<TVShow>?
}