package br.com.oliveira.placeservice.web;

import br.com.oliveira.placeservice.api.PlaceResponse;
import br.com.oliveira.placeservice.domain.Place;

public class PlaceMapper {
    public static PlaceResponse fromPlaceToResponse(Place place){
        return new PlaceResponse(place.name(), place.slug(),
                place.state(), place.createdAt(), place.updatedAt());
    }
}
