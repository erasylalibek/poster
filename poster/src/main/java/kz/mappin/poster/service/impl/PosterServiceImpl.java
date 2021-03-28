package kz.mappin.poster.service.impl;

import kz.mappin.poster.model.Poster;
import kz.mappin.poster.repository.PosterRepository;
import kz.mappin.poster.service.IPosterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PosterServiceImpl implements IPosterService {

    @Autowired
    PosterRepository posterRepository;

    @Override
    public void create(Poster poster) {
        posterRepository.save(poster);
    }
}
