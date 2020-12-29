package mgm.u.tmdbclientdemo.domain.usecase

import mgm.u.tmdbclientdemo.data.model.artist.Artist
import mgm.u.tmdbclientdemo.domain.repository.ArtistRepository

class UpdateArtistUseCase(private val artistRepository: ArtistRepository) {

    suspend fun execute(): List<Artist>? = artistRepository.updateArtist()
}