package com.example.restservice.restController;

import com.example.restservice.logic.ITriangleLogic;
import com.example.restservice.model.Triangle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class TriangleController {

    private final ITriangleLogic triangleLogic;

    private static final String template = "is: %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    public TriangleController(ITriangleLogic triangleLogic) {
        this.triangleLogic = triangleLogic;
    }

    @GetMapping("/triangle")
    public String getTriangleType(
            @RequestParam(value = "x", defaultValue = "5") int x,
            @RequestParam(value = "y", defaultValue = "7") int y,
            @RequestParam(value = "z", defaultValue = "6") int z) throws IOException, InterruptedException {
        return new String("Triangle №:" + counter.incrementAndGet() + " " +
                String.format(template, triangleLogic.checkTriangle(new Triangle(x, y, z))));
    }
}