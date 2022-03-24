package com.example.api_child.service;

import com.example.api_child.entity.Child;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface ChildService {
    Child create(Child child, HttpServletRequest req);

    Child read(Long id, HttpServletRequest req);

    Child update(Child child, HttpServletRequest req);

    void delete(Long id, HttpServletRequest req);

    List<Child> getAll(HttpServletRequest req);
}
