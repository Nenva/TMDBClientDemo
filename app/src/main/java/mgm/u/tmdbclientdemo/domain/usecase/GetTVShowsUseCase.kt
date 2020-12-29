package mgm.u.tmdbclientdemo.domain.usecase

import mgm.u.tmdbclientdemo.data.model.tvshow.TVShow
import mgm.u.tmdbclientdemo.domain.repository.TVShowRepository

class GetTVShowsUseCase(private val tvShowRepository: TVShowRepository) {

    suspend fun execute(): List<TVShow>? = tvShowRepository.getTVShows()
}