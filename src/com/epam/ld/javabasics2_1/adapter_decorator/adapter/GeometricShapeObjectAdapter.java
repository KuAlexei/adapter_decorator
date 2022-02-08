package com.epam.ld.javabasics2_1.adapter_decorator.adapter;

import com.epam.ld.javabasics2_1.adapter_decorator.adapter.extra.GeometricShape;
import com.epam.ld.javabasics2_1.adapter_decorator.adapter.extra.Rhombus;
import com.epam.ld.javabasics2_1.adapter_decorator.adapter.extra.Triangle;

public class GeometricShapeObjectAdapter implements Shape {

    private final GeometricShape adaptee;

    public GeometricShapeObjectAdapter(GeometricShape adaptee) {
        super();
        this.adaptee = adaptee;
    }

    @Override
    public void draw() {
        adaptee.drawShape();
    }

    @Override
    public void resize() {
        System.out.println(description() + " can't be resized. Please create new one with required values.");
    }

    @Override
    public String description() {
        if (adaptee instanceof Triangle) {
            return "Triangle object";
        } else if (adaptee instanceof Rhombus) {
            return "Rhombus object";
        } else {
            return "Unknown object";
        }
    }

    @Override
    public boolean isHide() {
        return false;
    }

}
