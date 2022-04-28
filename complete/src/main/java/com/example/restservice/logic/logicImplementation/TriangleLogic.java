package com.example.restservice.logic.logicImplementation;

import com.example.restservice.logic.ITriangleLogic;
import com.example.restservice.model.Triangle;
import org.springframework.stereotype.Service;

@Service
public class TriangleLogic implements ITriangleLogic {


    public String checkTriangle(Triangle triangle) {

        // To check if sides are more than 0
        if (triangle.getFirstSide() <= 0 || triangle.getSecondSide() <= 0 || triangle.getThirdSide() <= 0)
            return ("Not a triangle");

        // To check if all sides are equal
        else if (triangle.getFirstSide() == triangle.getSecondSide() && triangle.getSecondSide() == triangle.getThirdSide())
            return ("Equilateral Triangle");

        // To check if at least 2 sides are equal
        else if (triangle.getFirstSide() == triangle.getSecondSide() || triangle.getSecondSide() == triangle.getThirdSide() || triangle.getThirdSide() == triangle.getFirstSide())
            return ("Isosceles Triangle");

        // To say that neither of sides are equal
        else
            return ("Scalene Triangle");
    }
}
