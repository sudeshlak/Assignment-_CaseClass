


object CaseClass{
	def main(args:Array[String]){
		  
		case class Point(a:Int,b:Int){
			def x:Int=a
			def y:Int=b
			
			def Invert(that:Point)=Point(this.y,this.x)
			def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)
			def +(that:Point)=Point(this.x+that.x,this.y+that.y) 
			def -(that:Point)=Point(this.x-that.x,this.y-that.y) 
			def Distance(that:Point):Double=
			{
			val dis=math.sqrt((this.x)*(this.x)+(this.y)*(this.y))
			return dis
			}
		}
		val p=Point(12,30)
		val q=Point(24,50)
		val r=p-q
		println("Move"+p+" by given dis="+q.move(5, 24))
		println("Add "+p+" and "+q+"="+(p+q))
		println("Invert of "+p+"="+p.Invert(p))
		println("Distance between "+p+" and "+q+"="+r.Distance(r))
	   
	   
  }
}