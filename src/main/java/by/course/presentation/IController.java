package by.course.presentation;

import by.course.MainApplication;
import javafx.scene.layout.AnchorPane;

/**
 * Interface of all controller with default methods.
 *
 * @author Evgeniy Shevtsov
 * @version 0.1  16.05.2017
 */
public interface IController {

    /**
     * Set reference to main application to controller to get data.
     *
     * @param mainApplication reference to main application.
     */
    void setMainApplication(MainApplication mainApplication) ;

    /**
     * Set reference of this layout to control it.
     *
     * @param pane reference of this layout.
     */
    void setReferenceOfThisLayout(AnchorPane pane);

    /**
     * Set reference to parent controller of this controller and layout.
     *
     * @param controller parent controller.
     */
    void setParentController(IController controller);

    /**
     * Return reference to parent controller of its.
     *
     * @return parent controller.
     */
    IController getParentController();

    /**
     * Get reference of this layout.
     *
     * @return reference of this layout
     */
    AnchorPane getReferenceOfThisLayout();
}
