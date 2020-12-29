package mgm.u.tmdbclientdemo.data.repository.tvshow.datasourceimpl

import mgm.u.tmdbclientdemo.data.model.tvshow.TVShow
import mgm.u.tmdbclientdemo.data.repository.tvshow.datasource.TVShowCacheDataSource

class TVShowCacheDataSourceImpl: TVShowCacheDataSource {

    private var tvShowList = ArrayList<TVShow>()

    override suspend fun getTVShowFromCache(): List<TVShow> {
        return tvShowList
    }

    override suspend fun saveTVShowToCache(tvShows: List<TVShow>) {
        tvShowList.clear()
        tvShowList = ArrayList(tvShows)
    }
}