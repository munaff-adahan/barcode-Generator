
package com.azoza.ui;

import com.formdev.flatlaf.IntelliJTheme;

/**
 *
 * @author Munaff Adahan
 */
public class Barcode {
    public static void main(String[] args) {
            try {
            IntelliJTheme.setup(Frame.class.getResourceAsStream("/com/azoza/resources/arc-theme-orange.theme.json"));
        } catch (Exception e) {
        }
        new Frame();
    }
    
}
