public class Triangle{
  private Point pointA;
  private Point pointB;
  private Point pointC;

  public Triangle(Point newpointA,
                  Point newpointB,Point newpointC){
    pointA=new Point(newpointA);
    pointB=new Point(newpointB);
    pointC=new Point(newpointC);
  }

  public Triangle(double axcor, double aycor, double bxcor, double bycor,
                  double cxcor, double cycor){
                    pointA=new Point(axcor,aycor);
                    pointB=new Point(bxcor,bycor);
                    pointC=new Point(cxcor,cycor);
  }

  public double getPerimeter(){
    return pointA.distanceTo(pointB) +
           pointB.distanceTo(pointC) + pointC.distanceTo(pointA);
  }

  public Point getVertex(int index){
    if(index==0)
    {
      return new Point(pointA);
    }
    if(index==1)
    {
      return new Point(pointB);
    }
    if(index==2)
    {
      return new Point(pointC);
    }
    else
    {
      return new Point(00000000.0,00000000.0);
    }
  }

  public String toString(){
    return "Triangle: A(" + (pointA.getX()+",")
                          + (pointA.getY()+") B(")
                          + (pointB.getX()+",")
                          + (pointB.getY()+") C(")
                          + (pointC.getX()+",")
                          + (pointC.getY()+")");
  }

  public void setVertex(int index, Point newP){
    if(index==0)
    {
      pointA=newP;
    }
    if(index==1)
    {
      pointB=newP;
    }
    if(index==2)
    {
      pointC=newP;
    }
    else
    {
      pointA=pointA; //means to do nothing
    }
  }

}
