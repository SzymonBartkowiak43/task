package org.example.geometria;

import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    static ArrayList<Point> points = new ArrayList<>();

    public static void main(String[] args) {
        points.add(new Point(1,1));
        points.add(new Point(1,4));
        points.add(new Point(1,8));
        points.add(new Point(1,2));

        int index = 3;
        System.out.println(points.get(index));

        System.out.println(findNearPoint(points.get(index)));
        System.out.println(findNearPointStream(points.get(index)));
        System.out.println(findNearPoint(points.get(index), 0, null, Double.MAX_VALUE));
    }

    public static Point findNearPoint(Point point) {
        double mindistance = Double.MAX_VALUE;
        Point closestPoint = null;

        for(Point point1: points) {
            if(!point.equals(point1)) {
                double distance = point1.distance(point);
                if(distance < mindistance) {
                    mindistance = distance;
                    closestPoint = point1;
                }
            }
        }
        return closestPoint;
    }

    public static Point findNearPoint(Point target, int currentIndex, Point closestPoint, double minDistance) {
        if (currentIndex >= points.size()) {
            return closestPoint;
        }

        Point currentPoint = points.get(currentIndex);

        if (!target.equals(currentPoint)) {
            double distance = currentPoint.distance(target);
            if (distance < minDistance) {
                closestPoint = currentPoint;
                minDistance = distance;
            }
        }
        return findNearPoint(target, currentIndex + 1, closestPoint, minDistance);
    }

    public static Point findNearPointStream(Point target) {
        return points.stream()
                .filter(point -> !point.equals(target))
                .min(Comparator.comparing(point -> point.distance(target)))
                .orElse(null);
    }
}
