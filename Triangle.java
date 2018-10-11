public class Triangle{
  private Point pointA;
  private Point pointB;
  private Point pointC;

  public Triangle(Point newpointA,
                  Point newpointB,Point newpointC){
    pointA=newpointA;
    pointB=newpointB;
    pointC=newpointC;
  }

  public Triangle(double axcor, double aycor, double bxcor, double bycor,
                  double cxcor, double cycor){
                    Point pointA=new Point(axcor,aycor);
                    Point pointB=new Point(bxcor,bycor);
                    Point pointC=new Point(cxcor,cycor);
  }

  public double getPerimeter(){
    return pointA.distanceTo(pointB) +
           pointB.distanceTo(pointC) + pointC.distanceTo(pointA);
  }

  public Point getVertex(int index){
    Point[] pointarray = {pointA, pointB, pointC};
    /* Point[] pointarray=new Point[3];
    pointarray[0]=pointA;
    pointarray[1]=pointB;
    pointarray[2]=pointC;  */
    Point pointcopy=new Point(pointarray[index].getXcor(),
                                pointarray[index].getYcor());
    return pointcopy;
  }

  public String toString(){
    return "Triangle: A(" + (pointA.getXcor()+",")
                          + (pointA.getYcor()+") B(")
                          + (pointB.getXcor()+",")
                          + (pointB.getYcor()+") C(")
                          + (pointC.getXcor()+",")
                          + (pointC.getYcor()+")");
  }

}
