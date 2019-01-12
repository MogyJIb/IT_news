package by.course;

import by.course.data.NewsRepository;
import by.course.data.NewsService;
import by.course.domain.ClassProvider;
import by.course.presentation.NewsListController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainApplication extends Application{

    private ClassProvider provider;

    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("IT-news");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/news_list_layout.fxml"));
        AnchorPane root = loader.load();
        primaryStage.setScene(new Scene(root));

        NewsListController controller = loader.getController();
        controller.setMainApplication(this);
        controller.setReferenceOfThisLayout(root);

        provider = new ClassProvider();
        NewsService newsService = provider.newsService(provider.newsConverter());
        NewsRepository newsRepository = provider.newsRepository(newsService);
        controller.setGetNewsUseCase(provider.getNewsUseCase(newsRepository, provider.logger()));

        primaryStage.show();

        controller.loadInformationToLayout();
    }

    public ClassProvider getProvider() {
        return provider;
    }

}