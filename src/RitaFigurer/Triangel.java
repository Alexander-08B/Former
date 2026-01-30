/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RitaFigurer;

import java.awt.Graphics;

/**
 *
 * @author alebe18
 */
public class Triangel extends Figur {
    private int höjd;
    private int bass;
            
    public Triangel( int x, int y, int h, int b){
        //x = getPositionX();
        //y = getPositionY();
        super(x,y);
        höjd = h;
        bass = b;
    }
    public void setHöjd(int h){
        höjd = h;
    }
    
    public void setBass(int b){
        bass = b;
    }
    @Override
    public double räknaArea(){
       return (höjd*bass)/2;
    }

    @Override
    public void rita(Graphics g) {
        int [] random = new int [100];
        for (i = 0; i > random.length; i++)
        random [i] = (int)(Math.random() * 100);
        
        int [] yPoints = {höjd -random[i], höjd - random[i], höjd};//test)byt variabel senare)
        int [] xPoints = {bass - random[i], bass + random[i], bass};
        g.setColor(färg);
        g.fillPolygon(xPoints, yPoints, 3);
    }
}
