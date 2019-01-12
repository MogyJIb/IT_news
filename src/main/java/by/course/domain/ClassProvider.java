package by.course.domain;

import by.course.data.NewsRepository;
import by.course.data.NewsService;

public class ClassProvider {

    private NewsService newsService;
    private NewsRepository newsRepository;
    private GetNewsUseCase getNewsUseCase;

    public NewsConverter newsConverter() {
        return new NewsConverter();
    }

    public NewsService newsService(NewsConverter newsConverter) {
        if (newsService == null)
            newsService = new NewsService(newsConverter);
        return newsService;
    }

    public NewsRepository newsRepository(NewsService newsService) {
        if (newsRepository == null)
            newsRepository = new NewsRepository(newsService);
        return newsRepository;
    }

    public Logger logger() {
        return new Logger();
    }

    public GetNewsUseCase getNewsUseCase(NewsRepository newsRepository, Logger logger) {
        return new GetNewsUseCase(newsRepository, logger);
    }
}
