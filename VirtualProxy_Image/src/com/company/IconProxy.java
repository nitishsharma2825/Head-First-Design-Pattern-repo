package com.company;

import java.awt.*;

public class IconProxy implements Icon{
    ImageIcon icon;
    String url;
    Thread retrievingThread;
    boolean retrieving=false;

    public IconProxy(String url) {
        this.url = url;
    }

    @Override
    public int getIconWidth() {
        if(icon==null){
            return icon.getIconWidth();
        } else {
            return 800;
        }
    }

    @Override
    public int getIconHeight() {
        if(icon==null){
            return icon.getIconHeight();
        } else {
            return 800;
        }
    }

    @Override
    public void paintIcon(final Component c, Graphics g, int x, int y) {
        if(icon!=null){
            icon.paintIcon(c,g,x,y);
        } else {
            g.drawString("Loading...Please wait!",x+300,y+190);
            if(!retrieving){
                retrieving=true;
                retrievingThread=new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try{
                            icon=new ImageIcon(url);
                        } catch(Exception e){
                            e.printStackTrace();
                        }
                    }
                });
                retrievingThread.start();
            }
        }
    }
}
