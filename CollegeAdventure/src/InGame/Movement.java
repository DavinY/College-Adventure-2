/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InGame;

/**
 *
 * @author Davin Yulion
 */
public interface Movement {
    public int MoveUp(int y);   
    public int MoveDown(int y);
    public int MoveLeft(int x);
    public int MoveRight(int x);
}
