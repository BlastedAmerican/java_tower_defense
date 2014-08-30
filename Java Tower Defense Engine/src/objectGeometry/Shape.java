package objectGeometry;
import java.util.ArrayList;
/*
 * V 0.01 of a shape interface object.
 * Designed to work as geometry engine for 
 * interfacing with various rendering systems.
 * 
 */
public interface Shape 
{
	public void setLocation( float xPos, float yPos);
	public void setZLevel( int zLevel );
	public ArrayList<ArrayList<Point>> getPointPairs();
	public boolean overlaps( Shape checkObject );
	public void moveBy( float xPos, float yPos);
	public Shape copy();
	public ArrayList<Point> getPoints();
	

}
