package com.example.organdonation.repository;

import com.example.organdonation.model.Donor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonorRepository extends CrudRepository<Donor, Integer> {
}
