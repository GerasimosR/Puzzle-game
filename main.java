public class main 
{
     public static void main(String[] args)
    {
        Game g =new Game();
        g.init();   // Invoke the applet's init() method
        g.start();  // Start the applet
 
        // Create a window (JFrame) and make applet the content pane
        javax.swing.JFrame window = new javax.swing.JFrame("Puzzle Game");
        window.setContentPane(g);
        window.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        window.pack();              // Arrange the components
        window.setVisible(true);    // Make the window visible
    }
}