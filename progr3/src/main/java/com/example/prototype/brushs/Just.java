package com.example.prototype.brushs;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class Just extends Brush implements Cloneable{
    public Just(Color color, double size) {
        super(color, size);
    }
    @Override
    public void draw(GraphicsContext gc, MouseEvent mouseEvent) {
        gc.setFill(color);
        gc.fillOval(mouseEvent.getX() - Math.random()*15, mouseEvent.getY()-Math.random()*15, 10*size/5, 10*size/5);
        gc.setFill(color);
        gc.fillOval(mouseEvent.getX() - Math.random()*15, mouseEvent.getY()-Math.random()*15, 10*size/5, 10*size/5);
        gc.setFill(color);
        gc.fillOval(mouseEvent.getX() - Math.random()*15, mouseEvent.getY()-Math.random()*15, 10*size/5, 10*size/5);
        gc.setFill(color);
        gc.fillOval(mouseEvent.getX() - Math.random()*15, mouseEvent.getY()-Math.random()*15, 10*size/5, 10*size/5);
        gc.setFill(color);
        gc.fillOval(mouseEvent.getX() - Math.random()*15, mouseEvent.getY()-Math.random()*15, 10*size/5, 10*size/5);
        gc.setFill(color);
    }
    @Override
    public String toString() {
        return "Перо";
    }

    @Override
    public Just clone() {
        return (Just) super.clone();
    }

}
