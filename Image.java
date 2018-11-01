import java.awt.*
 public Class MouseEventHandler extends Frame implements
   int x=0 , y=0 ;
   String str = " ";
 public MouseEventHandler (){
   setSize (100,100,200);
   setTitle("mouse Event Test")
  WindowHandler wh =
       add windowListner (this);
       add MouseListner  (this);
  }
 public Void Paint (Graphics g){
     g.draw String (str,x,y);
  }
 public Void MouseClicked (MouseEvent e){
     x = e.getx();
     y = e.gety();
     str = "Mouse Clicked";
      repaint ();
  }
 public Void MouseEntered (MouseEvent e){
     x = e.getx();
     y = e.gety();
     str = "Mouse External";
      repaint ();
  }
 public Void MouseEvented (MouseEvent e){
     x = e.getx();
     y = e.gety();
     str = "Mouse Evented";
      repaint ();
  }
 public Void MousePressed (MouseEvent e){
     x = e.getx();
     y = e.gety();
     str = "Mouse Pressed";
      repaint ();
  }
 public Void MouseReleased (MouseEvent e){
     x = e.getx();
     y = e.gety();
     str = "Mouse Released";
      repaint ();
  }
 public static void main (String args[]){
    MouseEventHandler meh = new MouseEventHandler ();
                      meh.setvisible (true);
 public Void MouseEvented (MouseEvent e){
     x = e.getx();
     y = e.gety();
   str = "Mouse Clicked";
      repaint ();
  }
  public Void MouseEvented (MouseEvent e){
     x = e.getx();
     y = e.gety();
     str = "Mouse External";
      repaint ();
  }
 public Void MouseEvented (MouseEvent e){
     x = e.getx();
     y = e.gety();
     str = "Mouse Evented";
      repaint ();
  }
 public Void MousePressed (MouseEvent e){
     x = e.getx();
     y = e.gety();
     str = "Mouse Pressed";
      repaint ();
  }
 public Void MouseReleased (MouseEvent e){
     x = e.getx();
     y = e.gety();
     str = "Mouse Released";
      repaint ();
  }
 public static void main (String args[]){
    MouseEventHandler meh = new MouseEventHandler ();
                      meh.setvisible (true);
  }
}
