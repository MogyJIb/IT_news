package by.course.data;

import by.course.data.models.NewsFeed;
import by.course.domain.DateTimeUtil;
import com.rometools.rome.io.FeedException;

import java.io.IOException;
import java.time.LocalDateTime;


public class NewsRepository {

    private static final int UPDATE_INTERVAL = 10000;

    private NewsService newsService;

    private NewsFeed cashedFeed;
    private LocalDateTime loadedTime = LocalDateTime.now();

    public NewsRepository(NewsService newsService) {
        this.newsService = newsService;
    }

    public NewsFeed get(String source) throws IOException, FeedException {
        if (cashedFeed == null || DateTimeUtil.subtract(LocalDateTime.now(), loadedTime) > UPDATE_INTERVAL)
            cashedFeed = newsService.get(source);
        return cashedFeed;
    }
}
