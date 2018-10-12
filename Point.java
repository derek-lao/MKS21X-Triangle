public class Point{
  private double xcor;
  private double ycor;

  public Point(double x, double y){
    xcor=x;
    ycor=y;
  }

  public Point(Point original){
  		this.xcor = original.xcor;
  		this.ycor = original.ycor;
  	}

  public double getX(){
    return xcor;
  }

  public double getY(){
    return ycor;
  }

  public double distanceTo(Point newpoint){
    return Math.sqrt((this.getX() - newpoint.getX())
          *(this.getX() - newpoint.getX()) +
           (this.getY() - newpoint.getY())
          *(this.getY() - newpoint.getY()));
  }

  public static double distance(Point point1, Point point2){
    return Math.sqrt((point1.getX() - point2.getX())
          *(point1.getX() - point2.getX()) +
           (point1.getY() - point2.getY())
          *(point1.getY() - point2.getY()));
  }

  public String toString(){
    return "(" + (xcor+",") + (ycor+")");
  }

}
