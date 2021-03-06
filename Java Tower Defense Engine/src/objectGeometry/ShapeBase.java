package objectGeometry;
import java.util.*;

public class ShapeBase implements Shape
{
	//List of protected points that work with the object.
	protected ArrayList<Point> PointList;
	//Key point. Used for various manipulations of Shape location.
	protected Point keyPoint;
	//ZLevel. Optional. Hook for displaying objects on various levels.
	protected int zLevel = 0;
	/*
	 * Creates a shape object with no points.
	 * Shape is not intended to be used as
	 * an actual shape, instead it is suggested
	 * that class's based off it are created.
	 * 
	 */
	public ShapeBase()
	{
		
	}
	/*
	 * First version. Moves all points that compose the object.
	 * Takes two values, a X and Y for position.
	 * @param float xPosition
	 * @param float yPosition
	 * @see objectGeometry.Shape#setLocation(float, float)
	 */
	public void setLocation(float xPos, float yPos) 
	{
		if( keyPoint != null)
		{
			float keyPointXLoc = keyPoint.getXPos();
			float keyPointYLoc = keyPoint.getYPos();
			float extraShiftY = 0;
			float extraShiftX = 0;
			for( Point movingPoint: PointList )
			{
				extraShiftX = movingPoint.getXPos() - keyPointXLoc;
				extraShiftY = movingPoint.getYPos() - keyPointYLoc;
				movingPoint.setPosition(xPos + extraShiftX,
										yPos + extraShiftY );
				
			}
		}
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setZLevel(int newZLevel) 
	{
		zLevel = newZLevel;
	}
	@Override
	public ArrayList<ArrayList<Point>> getPointPairs() 
	{
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean overlaps(Shape checkObject) 
	{
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void moveBy(float xPos, float yPos) 
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public Shape copy() 
	{
		// TODO Auto-generated method stub
		// NOTE Must make a copy! Not a reference to pointers in memory!
		
		return null;
	}
	@Override
	public ArrayList<Point> getPoints() 
	{
		// TODO Auto-generated method stub
		return null;
	}
	public String print()
	{
		String output = "Empty Shape";
		
		if( PointList != null )
		{
			output = "Shape - " + PointList.size() + "Points";
			for( Point n: PointList )
			{
				output = output + n.print();
			}
		}
		
		
		return output;
		
	}
	
	public static void main(String[] args)
	{
		
	}
	

}
