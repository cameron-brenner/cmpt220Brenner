/*
Cameron Brenner
Software Dev 1 
Lab6_9_01_class.java
*/


/**************************************************
|               Rectangle                         |  
| ------------------------------------------------|  
| width: double                                   |
| height: double                                  | 
| Rectangle()                                     |  
| Rectangle(newWidth: double, newHeight: double)  |
| getArea(): double                               |
| getPerimeter(): double                          |
***************************************************/


public class Lab6_9_01_class {
  double width;	
  double height;	

	
  Rectangle() {
    width = 1;
    height = 1;
  } 


  Rectangle(double newWidth, double newHeight) {
    width = newWidth;
    height = newHeight;
  }

	
  double getArea() {
    return width * height; 
  }

	
  double getPerimeter() {
    return 2 * (width + height);
  }
}