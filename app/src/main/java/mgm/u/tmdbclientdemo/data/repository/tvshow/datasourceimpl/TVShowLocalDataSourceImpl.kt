package mgm.u.tmdbclientdemo.data.repository.tvshow.datasourceimpl

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import mgm.u.tmdbclientdemo.data.db.TVShowDao
import mgm.u.tmdbclientdemo.data.model.tvshow.TVShow
import mgm.u.tmdbclientdemo.data.repository.tvshow.datasource.TVShowLocalDataSource

class TVShowLocalDataSourceImpl(
    private val tvShowDao: TVShowDao
): TVShowLocalDataSource {

    override suspend fun getTVShowsFromDB(): List<TVShow> {
        return tvShowDao.getTVShows()
    }

    override suspend fun saveTVShowsToDB(tvShows: List<TVShow>) {
        CoroutineScope(Dispatchers.IO).launch {
            tvShowDao.saveTVShows(tvShows)
        }
    }

    override suspend fun clearAllTVShows() {
        CoroutineScope(Dispatchers.IO).launch {
            tvShowDao.deleteAllTVShows()
        }
    }
}