import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor  
{  
    private int oldEdge;
    private int time = 0;
    static int numBounces = 0; 
    public void act()   
    {  
        if(time == 0)
        {
            setRotation(69);
        }
        time++;
        move(10);  
        checkWalls();
    }      
   
    public void checkWalls(){  
        int edge = atWorldEdge();
        if(edge >= 0 && edge != oldEdge)
        {  
           setRotation(getRotation()*-1+(180*(edge%2)));
        }  
    }  
   
    public int atWorldEdge()    
    {    
      if(getX() < 10) return 1; 
      if(getX() > 600 - 10) return 3;    
      if(getY() < 10) return 2;
      if (getY() > 400 - 10) return 4; 
      return -1;
    } 

}

