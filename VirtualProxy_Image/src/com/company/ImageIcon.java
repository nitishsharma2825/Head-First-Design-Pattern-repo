package com.company;

import java.awt.*;

public class ImageIcon implements Icon{
    String url;

    public ImageIcon(String a) {
        this.url=a;
    }

    @Override
    public int getIconWidth() {
        return 0;
    }

    @Override
    public int getIconHeight() {
        return 0;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {

    }
}
