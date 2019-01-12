package by.course.domain;

import by.course.data.models.News;
import by.course.data.models.NewsFeed;
import com.rometools.rome.feed.synd.SyndCategory;
import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;

public class NewsConverter {

    public static NewsFeed from(SyndFeed syndFeed) {
        NewsFeed newsFeed = new NewsFeed();
        newsFeed.title = syndFeed.getTitle();
        newsFeed.description = syndFeed.getDescription();
        newsFeed.link = syndFeed.getLink();
        newsFeed.imageUrl = syndFeed.getImage().getUrl();
        newsFeed.feedType = syndFeed.getFeedType();

        for (SyndEntry syndEntry : syndFeed.getEntries()) {
            News news = new News();
            news.link = syndEntry.getLink();
            news.title = syndEntry.getTitle();
            news.description = syndEntry.getDescription().getValue();
            if (syndEntry.getEnclosures() != null && !syndEntry.getEnclosures().isEmpty())
                news.imageUrl = syndEntry.getEnclosures().get(0).getUrl();
            if (syndEntry.getCategories() != null && !syndEntry.getCategories().isEmpty()) {
                SyndCategory category = syndEntry.getCategories().get(0);
                news.category = category.getName();
                news.categoryUrl = category.getTaxonomyUri();
            }
            newsFeed.newsItems.add(news);
        }
        return new NewsFeed();
    }
}
