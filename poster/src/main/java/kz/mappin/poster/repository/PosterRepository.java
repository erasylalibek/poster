package kz.mappin.poster.repository;

import kz.mappin.poster.model.Poster;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PosterRepository extends CrudRepository<Poster, Integer> {
}
