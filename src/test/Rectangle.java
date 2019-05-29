package test;

import java.util.List;

public class Rectangle {
    private List<Point> pointList;

    public void setPointList(List<Point> pointList) {
        this.pointList = pointList;
    }

    void showPoints(){
        for(Point point:pointList)
            System.out.println(point.toString());
    }
}
