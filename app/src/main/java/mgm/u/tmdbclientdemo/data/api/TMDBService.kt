package mgm.u.tmdbclientdemo.data.api

import mgm.u.tmdbclientdemo.data.model.artist.ArtistList
import mgm.u.tmdbclientdemo.data.model.movie.MovieList
import mgm.u.tmdbclientdemo.data.model.tvshow.TVShowList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface TMDBService {

    @GET("movie/popular")
    suspend fun getPopularMovies(
        @Query(
            "api_key"
        ) apiKey: String
    ) : Response<MovieList>

    @GET("tv/popular")
    suspend fun getPopularTVShows(
        @Query(
            "api_key"
        ) apiKey: String
    ) : Response<TVShowList>

    @GET("person/popular")
    suspend fun getPopularArtist(
        @Query(
            "api_key"
        ) apiKey: String
    ) : Response<ArtistList>
}