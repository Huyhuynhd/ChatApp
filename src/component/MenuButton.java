/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package component;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.JButton;

/**
 *
 * @author ADMIN
 */
public class MenuButton extends JButton {

    public Icon getIconSimple() {
        return iconDisabled;
    }

    public void setIconSimple(Icon iconDisabled) {
        this.iconDisabled = iconDisabled;
    }

    public Icon getIconSelected() {
        return iconSelected;
    }

    public void setIconSelected(Icon iconSelected) {
        this.iconSelected = iconSelected;
    }
    
    private Icon iconDisabled;
    private Icon iconSelected;
       public MenuButton(){
           setContentAreaFilled(false);
           setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
       }

    @Override
    public void setSelected(boolean bln) {
        super.setSelected(bln);
        if(bln){
            setIcon(iconSelected);
        }else{
            setIcon(iconDisabled);
        }
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        if(isSelected()){
            grphcs.setColor(new Color(110, 213, 255));
            grphcs.fillRect(0, getHeight() - 3, getWidth(), getHeight());
        }
    }
    
    
       
       
}
