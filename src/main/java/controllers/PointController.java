package controllers;

import dto.Point;

public class PointController {


  public void changeX(Point point, int howMuchChange){
    switch (howMuchChange){
      case 10:
        point.setX(point.getX()+100);
        break;
      case 1:
        point.setX(point.getX()+1);
        break;
      case -10:
        point.setX(point.getX()-100);
        break;
      default:
        point.setX(point.getX());
    }
  }

  public void addX(Point point){
  point.setX(point.getX()+1);
  }

  public void minusX(Point point){
    point.setX(point.getX()-1);
  }

  public void addY(Point point){
    point.setY(point.getY()+1);
  }

  public void minusY(Point point){
    point.setY(point.getY()-1);
  }


}
