/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import models.ModelIndice;
import views.ViewIndice;
import controllers.ControllerIndice;
/**
 *
 * @author Oscar
 */
public class Main {
    private static ControllerIndice controllerindice;
    private static ViewIndice viewindice;
    private static ModelIndice modelindice;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        viewindice = new ViewIndice();
        modelindice = new ModelIndice();
        controllerindice = new ControllerIndice(viewindice, modelindice);
        
    }
    
}
