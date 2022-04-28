package com.example.restservice.logic;

import com.example.restservice.model.Triangle;

import java.io.IOException;

public interface ITriangleLogic {

    String checkTriangle(Triangle triangle) throws IOException, InterruptedException;
}
