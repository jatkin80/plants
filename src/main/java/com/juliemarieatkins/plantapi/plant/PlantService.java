package com.juliemarieatkins.plantapi.plant;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlantService {

  @Autowired
  private PlantRepository plantRepository;

  public Iterable<Plant> list() {
    return plantRepository.findAll();
  }

  public Optional<Plant> findById(Long id) {
    return plantRepository.findById(id);
  }

  public Plant create(Plant plant) {
    return plantRepository.save(plant);
  }

  public Optional<Plant> update(Plant plant) {
    Optional<Plant> foundPlant = plantRepository.findById(plant.getId());

    if (foundPlant.isPresent()) {
      Plant updatedPlant = foundPlant.get();
      updatedPlant.setName(plant.getName());
      updatedPlant.setType(plant.getType());
      updatedPlant.setDescription(plant.getDescription());
      updatedPlant.setImageUrl(plant.getImageUrl());
      updatedPlant.setDateadded(plant.getDateadded());
      updatedPlant.setNotes(plant.getNotes());
      updatedPlant.setDaystomaturity(plant.getDaystomaturity());
      updatedPlant.setSpacing(plant.getSpacing());
      plantRepository.save(updatedPlant);

      return Optional.of(updatedPlant);
    } else {
      return Optional.empty();
    }
  }

  public void deleteById(Long id) {
    plantRepository.deleteById(id);
  }
}
