package mgm.u.tmdbclientdemo.data.repository.tvshow.datasource

import mgm.u.tmdbclientdemo.data.model.movie.MovieList
import mgm.u.tmdbclientdemo.data.model.tvshow.TVShowList
import retrofit2.Response

interface TVShowRemoteDataSource {
    suspend fun getTVShows(): Response<TVShowList>
}