import  scala.math.sqrt
import  scala.math.abs
import  scala.math.pow
object Myapp extends App{
 val p1=Point(3,2)
 val p2=Point(-3,-2)
 val distance=p1.distance(p2)
 println(distance)

    case class Point(a:Int,b:Int){
        def x:Int=a
        def y:Int=b

        def +(that:Point)=Point(this.x+that.x,this.y+that.y)
        def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)
        def invert()=Point(this.y,this.x)
        def distance(that:Point):Double={
            val temp=Point(this.x-that.x,this.y-that.y)
            sqrt(pow(abs(temp.x),2)+pow(abs(temp.y),2))
        }
    }
}