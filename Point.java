public class Point{
  private double xcor;
  private double ycor;

  public Point(double x, double y){
    xcor=x;
    ycor=y;
  }

  public double getXcor(){
    return xcor;
  }

  public double getYcor(){
    return ycor;
  }

  public double distanceTo(Point newpoint){
    return Math.sqrt((this.getXcor() - newpoint.getXcor())
          *(this.getXcor() - newpoint.getXcor()) +
           (this.getYcor() - newpoint.getYcor())
          *(this.getYcor() - newpoint.getYcor()));
  }

  public double distanceTo(Point point1, Point point2){
    return Math.sqrt((point1.getXcor() - point2.getXcor())
          *(point1.getXcor() - point2.getXcor()) +
           (point1.getYcor() - point2.getYcor())
          *(point1.getYcor() - point2.getYcor()));
  }

  public String toString(){
    return "(" + (xcor+",") + (ycor+")");
  }

}
