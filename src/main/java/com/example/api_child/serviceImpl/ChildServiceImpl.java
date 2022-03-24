package com.example.api_child.serviceImpl;

import com.example.api_child.entity.Child;
import com.example.api_child.repository.ChildRepository;
import com.example.api_child.service.ChildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class ChildServiceImpl implements ChildService {

    @Autowired
    ChildRepository repository;



    public Child create(Child child, HttpServletRequest req) {
        return repository.save(child);
    }


    public Child read(Long id, HttpServletRequest req) {
        return repository.findById(id).orElse(null);
    }


    public Child update(Child child, HttpServletRequest req) {
        return repository.save(child);
    }


    public void delete(Long id, HttpServletRequest req) {
        repository.deleteById(id);
    }


    public List<Child> getAll(HttpServletRequest req) {
        List<Child> child = repository.findAll();

        return child;
    }
}
