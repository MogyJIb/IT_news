package by.course.presentation;

import by.course.MainApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;


/**
 * Abstract controller which implements IController interface
 * and implements its methods.
 */
public class AbstractController implements IController {

    /**
     * Reference to main application, parent controller and this controller layout.
     */
    protected MainApplication mainApplication;
    protected IController controller;
    protected AnchorPane pane;

    @Override
    public void setMainApplication(MainApplication mainApplication) {
        this.mainApplication = mainApplication;
    }

    @Override
    public void setReferenceOfThisLayout(AnchorPane pane) {
        this.pane = pane;
    }

    @Override
    public void setParentController(IController controller) {
        this.controller = controller;
    }

    @Override
    public IController getParentController() {
        return controller;
    }

    @Override
    public AnchorPane getReferenceOfThisLayout() {
        return pane;
    }

    /**
     * Load additional information to layout.
     */
    public void loadInformationToLayout() {

    }

    /**
     * Load new layout from this controller and make its children.
     *
     * @param layoutName layout name to load.
     * @return controller of loaded layout.
     */
    public IController loadLayout(String layoutName) {
        /* Get FXML loader. */
        FXMLLoader loader = new FXMLLoader();

        /* Set layout location from load it. */
        loader.setLocation(MainApplication.class.getResource(layoutName));
        try {

            /* Load the layout and controller and set its parameters. */
            AnchorPane layout = loader.load();
            AbstractController controller = loader.getController();
            controller.setMainApplication(mainApplication);
            controller.setParentController(this);
            controller.setReferenceOfThisLayout(layout);
            controller.loadInformationToLayout();

            /* Return loaded controller. */
            return controller;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
