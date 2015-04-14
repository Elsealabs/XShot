package com.elsealabs.xshot.program;


import com.elsealabs.xshot.graphics.ColorContainer;
import com.elsealabs.xshot.graphics.ColorGlobalSet;
import com.elsealabs.xshot.views.ViewMainModern;

import java.awt.*;
import java.util.HashMap;

public class Program {

    private ColorGlobalSet colors;

    public void run()
    {
        init();
        EventQueue.invokeLater(() -> new ViewMainModern());
    }

    public void init()
    {
        defineColors();
    }

    public void defineColors()
    {
        colors = ColorGlobalSet.getInstance();

        HashMap<String, Color> main_red_colors = new HashMap<String, Color>();
        main_red_colors.put("dark",      new Color(43, 6, 6));
        main_red_colors.put("med_dark",  new Color(130, 24, 24));
        main_red_colors.put("med_light", new Color(178, 52, 52));
        main_red_colors.put("light", new Color(226, 86, 86));

        ColorContainer main_red = new ColorContainer("main", "red", main_red_colors);
        main_red.setDefault(false);
        colors.addContainer(main_red);

        HashMap<String, Color> main_gray_colors = new HashMap<String, Color>();
        main_gray_colors.put("dark",      new Color(40, 40, 40));
        main_gray_colors.put("med_dark", new Color(73, 73, 73));
        main_gray_colors.put("med_light", new Color(126, 126, 126));
        main_gray_colors.put("light", new Color(182, 182, 182));

        ColorContainer main_gray = new ColorContainer("main", "red", main_gray_colors);
        main_gray.setDefault(true);
        colors.addContainer(main_gray);

        HashMap<String, Color> main_green_colors = new HashMap<String, Color>();
        main_green_colors.put("dark",      new Color(15, 39, 12));
        main_green_colors.put("med_dark",  new Color(43, 83, 37));
        main_green_colors.put("med_light", new Color(76, 130, 68));
        main_green_colors.put("light",     new Color(123, 192, 121));

        ColorContainer main_green = new ColorContainer("main", "red", main_green_colors);
        main_green.setDefault(false);
        colors.addContainer(main_green);
    }

}