package com.example.api_child.repository;

import com.example.api_child.entity.Child;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ChildRepository extends CrudRepository<Child, Long> {
    List<Child> findAll();
    Optional<Child> findByFamilyId(long familyId);

}
