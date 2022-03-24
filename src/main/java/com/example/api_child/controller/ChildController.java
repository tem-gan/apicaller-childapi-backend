package com.example.api_child.controller;

import com.example.api_child.entity.Child;
import com.example.api_child.service.ChildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("parent")
@CrossOrigin("*")
public class ChildController {
    @Autowired
    ChildService service;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<Object> create(@RequestBody Child child, HttpServletRequest req) {
        return ResponseEntity.ok(service.create(child, req));
    }
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResponseEntity<Object> read(@PathVariable("id") Long id, HttpServletRequest req) {

        return ResponseEntity.ok(service.read(id, req));
    }
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ResponseEntity<Object> update(@RequestBody Child child, HttpServletRequest req) {
        return ResponseEntity.ok(service.update(child, req));
    }
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> delete(@PathVariable("id") Long id, HttpServletRequest req) {
        service.delete(id, req);
        return ResponseEntity.ok(null);
    }
    @RequestMapping(value = "all", method = RequestMethod.GET)
    public ResponseEntity<Object> delete(HttpServletRequest req) {
        return ResponseEntity.ok(service.getAll(req));
    }
}
