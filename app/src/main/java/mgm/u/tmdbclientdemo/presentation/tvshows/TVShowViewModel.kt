package mgm.u.tmdbclientdemo.presentation.tvshows

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import mgm.u.tmdbclientdemo.domain.usecase.GetTVShowsUseCase
import mgm.u.tmdbclientdemo.domain.usecase.UpdateTVShowsUseCase

class TVShowViewModel(
    private val getTVShowsUseCase: GetTVShowsUseCase,
    private val updateTVShowsUseCase: UpdateTVShowsUseCase
) : ViewModel() {

    fun getTVShows() = liveData {
        val tvShowList = getTVShowsUseCase.execute()
        emit(tvShowList)
    }

    fun updateTVShows() = liveData {
        val tvShowList = updateTVShowsUseCase.execute()
        emit(tvShowList)
    }
}