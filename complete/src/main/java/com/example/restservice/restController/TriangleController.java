package com.example.restservice.restController;

import com.example.restservice.logic.ITriangleLogic;
import com.example.restservice.model.ResponseMessage;
import com.example.restservice.model.Triangle;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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

    //  @CrossOrigin(origins = "http://localhost:8000")  //For manual CORS
    @GetMapping("/triangle")
    public ResponseMessage getTriangleType(
            @RequestParam(value = "x", defaultValue = "0") int x,
            @RequestParam(value = "y", defaultValue = "0") int y,
            @RequestParam(value = "z", defaultValue = "0") int z) throws IOException, InterruptedException {
        return new ResponseMessage("Triangle №:" + counter.incrementAndGet() + " " +
                String.format(template, triangleLogic.checkTriangle(new Triangle(x, y, z))));
    }
}
