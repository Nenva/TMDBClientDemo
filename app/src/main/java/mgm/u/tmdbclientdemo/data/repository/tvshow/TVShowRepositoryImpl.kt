package mgm.u.tmdbclientdemo.data.repository.tvshow

import android.util.Log
import mgm.u.tmdbclientdemo.data.model.movie.Movie
import mgm.u.tmdbclientdemo.data.model.tvshow.TVShow
import mgm.u.tmdbclientdemo.data.repository.tvshow.datasource.TVShowCacheDataSource
import mgm.u.tmdbclientdemo.data.repository.tvshow.datasource.TVShowLocalDataSource
import mgm.u.tmdbclientdemo.data.repository.tvshow.datasource.TVShowRemoteDataSource
import mgm.u.tmdbclientdemo.domain.repository.TVShowRepository

class TVShowRepositoryImpl(
    private val tvShowRemoteDataSource: TVShowRemoteDataSource,
    private val tvShowLocalDataSource: TVShowLocalDataSource,
    private val tvShowCacheDataSource: TVShowCacheDataSource
): TVShowRepository {

    override suspend fun getTVShows(): List<TVShow>? {
        return getTVShowsFromCache()
    }

    override suspend fun updateTVShows(): List<TVShow>? {
        val newListOfTVShow = getTVShowsFromAPI()
        tvShowLocalDataSource.clearAllTVShows()
        tvShowLocalDataSource.saveTVShowsToDB(newListOfTVShow)
        tvShowCacheDataSource.saveTVShowToCache(newListOfTVShow)
        return newListOfTVShow
    }

    suspend fun getTVShowsFromAPI(): List<TVShow> {
        lateinit var tvShowList: List<TVShow>
        try {
            val response = tvShowRemoteDataSource.getTVShows()
            val body = response.body()
            if (body != null) {
                tvShowList = body.tvShows
            }
        } catch (exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        return tvShowList
    }

    suspend fun getTVShowsFromDB(): List<TVShow> {
        lateinit var tvShowList: List<TVShow>
        try {
            tvShowList = tvShowLocalDataSource.getTVShowsFromDB()
        } catch (exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        if (tvShowList.size > 0) {
            return tvShowList
        } else {
            tvShowList = getTVShowsFromAPI()
            tvShowLocalDataSource.saveTVShowsToDB(tvShowList)
        }
        return tvShowList
    }

    suspend fun getTVShowsFromCache(): List<TVShow> {
        lateinit var tvShowList: List<TVShow>
        try {
            tvShowList = tvShowCacheDataSource.getTVShowFromCache()
        } catch (exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        if (tvShowList.size > 0) {
            return tvShowList
        } else {
            tvShowList = getTVShowsFromDB()
            tvShowCacheDataSource.saveTVShowToCache(tvShowList)
        }
        return tvShowList
    }
}