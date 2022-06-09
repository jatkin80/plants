package com.juliemarieatkins.plantapi.plant;

import com.juliemarieatkins.plantapi.exception.ResourceNotFoundException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("plants")
public class PlantController {

  @Autowired
  private PlantService plantService;

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public Map<String, Iterable<Plant>> list() {
    Iterable<Plant> plants = plantService.list();
    return createHashPlural(plants);
  }

  @GetMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  public Map<String, Plant> read(@PathVariable Long id) {
    Plant plant = plantService
      .findById(id)
      .orElseThrow(
        () -> new ResourceNotFoundException("No plant with that ID")
      );
    return createHashSingular(plant);
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public Map<String, Plant> create(@Validated @RequestBody Plant plant) {
    Plant createdPlant = plantService.create(plant);
    return createHashSingular(createdPlant);
  }

  @PutMapping("/{id}")
  @ResponseStatus(HttpStatus.CREATED)
  public Map<String, Plant> update(
    @RequestBody Plant plant,
    @PathVariable Long id
  ) {
    Plant updatedPlant = plantService
      .update(plant)
      .orElseThrow(
        () -> new ResourceNotFoundException("No plant with that ID")
      );

    return createHashSingular(updatedPlant);
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void delete(@PathVariable Long id) {
    plantService.deleteById(id);
  }

  private Map<String, Plant> createHashSingular(Plant plant) {
    Map<String, Plant> response = new HashMap<String, Plant>();
    response.put("plant", plant);

    return response;
  }

  private Map<String, Iterable<Plant>> createHashPlural(
    Iterable<Plant> plants
  ) {
    Map<String, Iterable<Plant>> response = new HashMap<String, Iterable<Plant>>();
    response.put("Plants", plants);

    return response;
  }
}
