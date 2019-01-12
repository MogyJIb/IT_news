package by.course.presentation;

import by.course.data.models.News;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.web.WebView;

public class NewsRowController extends AbstractController{

    @FXML
    private Label  news_title;
    @FXML
    private Label  news_description;
    @FXML
    private WebView news_content;
    @FXML
    private ImageView image_view;

    @Override
    public void loadInformationToLayout() { }

    public void setNewsData(News news) {
        if (news == null) return;
        news_title.setText(news.getTitle());
        news_description.setText(news.getDescription());
        news_content.getEngine().loadContent(news.getContent());
        image_view.setImage(new Image(news.getImageUrl()));
    }

}
