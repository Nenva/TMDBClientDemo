package mgm.u.tmdbclientdemo.presentation.artist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import mgm.u.tmdbclientdemo.domain.usecase.GetArtistUseCase
import mgm.u.tmdbclientdemo.domain.usecase.UpdateArtistUseCase

class ArtistViewModel(
    private val getArtistUseCase: GetArtistUseCase,
    private val updateArtistUseCase: UpdateArtistUseCase
) : ViewModel() {

    fun getArtists() = liveData {
        val artistList = getArtistUseCase.execute()
        emit(artistList)
    }

    fun updateArtists() = liveData {
        val artistList = updateArtistUseCase.execute()
        emit(artistList)
    }
}