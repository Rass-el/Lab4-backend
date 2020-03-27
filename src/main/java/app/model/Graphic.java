package app.model;

import app.entities.Point;
import org.springframework.stereotype.Component;

@Component
public class Graphic {
    private boolean isInArea(double x, double y, double r) {
        if (r<=0) return false;
        boolean triangle = x >= -r && x <= 0 && y >= -r/2 && y <= 0 && x >= -2*y - r;
        boolean square = y >= 0 && x <= 0 && x >= -r && y <= r;
        boolean sector = x >= 0 && y <= 0 && x*x + y*y <= r*r;
        return triangle || square || sector;
    }

    public boolean isInArea(Point point) {
        return isInArea(point.getX(), point.getY(), point.getR());
    }

}
