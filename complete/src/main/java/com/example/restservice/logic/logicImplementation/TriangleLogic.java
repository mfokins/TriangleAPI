package com.example.restservice.logic.logicImplementation;

import com.example.restservice.logic.ITriangleLogic;
import com.example.restservice.model.Triangle;
import org.springframework.stereotype.Service;

@Service
public class TriangleLogic implements ITriangleLogic {


    public String checkTriangle(Triangle triangle) {

        // Check for equilateral triangle
        if (triangle.getFirstSide() == triangle.getSecondSide() && triangle.getSecondSide() == triangle.getThirdSide())
            return ("Equilateral Triangle");

            // Check for isosceles triangle
        else if (triangle.getFirstSide() == triangle.getSecondSide() || triangle.getSecondSide() == triangle.getThirdSide() || triangle.getThirdSide() == triangle.getFirstSide())
            return ("Isosceles Triangle");

            // Otherwise scalene triangle
        else
            return ("Scalene Triangle");
    }
}
