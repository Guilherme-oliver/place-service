package br.com.oliveira.placeservice.domain;

import br.com.oliveira.placeservice.api.PlaceRequest;
import com.github.slugify.Slugify;
import reactor.core.publisher.Mono;

public class PlaceService {
    private PlaceRepository placeRepository;
    private Slugify slugify;

    public PlaceService(PlaceRepository placeRepository){
        this.placeRepository = placeRepository;
        this.slugify = Slugify.builder().build();
    }

    public Mono<Place> create(PlaceRequest placeRequest){
        var place = new Place(null, placeRequest.name(), slugify.slugify(placeRequest.name()),
                placeRequest.state(), null, null);
        return placeRepository.save(place);
    }
}
