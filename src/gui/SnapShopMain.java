/*
 * TCSS 305 - Assignment 3: SnapShop
 */

package gui;

import java.awt.EventQueue;

/**
 * Runs SnapShop by instantiating and starting the SnapShopGUI.
 * 
 * @author Marty Stepp
 * @author Daniel M. Zimmerman
 * @author Alan Fowler
 * @version Winter 2015
 */
public final class SnapShopMain {

    /**
     * Private constructor, to prevent instantiation of this class.
     * 
     * @throws IllegalStateException when this constructor is called
     */
    private SnapShopMain() {
        throw new IllegalStateException();
    }

    /**
     * The main method, invokes the SnapShop GUI. Command line arguments are
     * ignored.
     * 
     * @param theArgs Command line arguments.
     */
    public static void main(final String[] theArgs) {
        EventQueue.invokeLater(SnapShopGUI::createAndShowGui);
    }
}
