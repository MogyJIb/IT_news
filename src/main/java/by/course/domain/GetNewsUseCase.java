package by.course.domain;

import by.course.data.NewsRepository;
import by.course.data.models.News;

import java.util.ArrayList;
import java.util.List;

public class GetNewsUseCase {
    private static final String IT_FEED_URL = "https://www.techradar.com/rss";
    private NewsRepository newsRepository;
    private Logger logger;

    public GetNewsUseCase(NewsRepository newsRepository, Logger logger) {
        this.newsRepository = newsRepository;
        this.logger = logger;
    }

    public List<News> getNewsList() {
        try {
            return newsRepository.get(IT_FEED_URL).newsItems;
        } catch (Exception exc) {
            logger.log(exc);
            return new ArrayList<>();
        }
    }
}
