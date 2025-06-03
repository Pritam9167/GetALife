package com.example.organdonation.repository;



import com.example.organdonation.model.Story;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoryRepository extends CrudRepository<Story, Integer> {
}

