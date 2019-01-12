package by.course.presentation;


import by.course.data.models.News;
import by.course.domain.GetNewsUseCase;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;


public class NewsListController extends AbstractController {

    private GetNewsUseCase getNewsUseCase;
    @FXML
    VBox list_container;

    @FXML
    private void initialize() {
    }

    @Override
    public void loadInformationToLayout() {
        ObservableList<News> newsList = FXCollections.observableArrayList(getNewsUseCase.getNewsList());

        for(News news : newsList) {
            NewsRowController rowController =
                    (NewsRowController) loadLayout("views/news_item_layout.fxml");
            rowController.setNewsData(news);
            list_container.getChildren().add(rowController.getReferenceOfThisLayout());
        }
    }

    public void setGetNewsUseCase(GetNewsUseCase getNewsUseCase) {
        this.getNewsUseCase = getNewsUseCase;
    }

}
