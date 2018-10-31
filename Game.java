/**
 * MineSweeper
 */
public class Game 
{
  public static void main(String[] args) 
  {

    int top = 5;    // top-left-corner on console screen
    int left = 5;   // top-left-corner on console screen
    int height = 8; // Field dimension 
    int width = 8;  // Field dimension 
    int mines = 10; // Number of mines
    Model model = new Model(top, left, height, width, mines);
    model.displayField();

    // After Console Field is displaed;
    // Display Usage
    View.setPosition(1, 1);
    System.out.print(String.format("[u]p, [d]own, [l]eft, [r]ight, [f]lag, [o]pen\n"));

    Controller game = new Controller(model);
    game.start();
  }
}