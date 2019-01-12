package by.course.domain;

import by.course.data.models.News;
import by.course.data.models.NewsFeed;
import com.rometools.rome.feed.synd.SyndCategory;
import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;

public class NewsConverter {

    public static NewsFeed from(SyndFeed syndFeed) {
        NewsFeed newsFeed = new NewsFeed()
                .setTitle(syndFeed.getTitle())
                .setDescription(syndFeed.getDescription())
                .setImageUrl(syndFeed.getImage().getUrl())
                .setLink(syndFeed.getLink())
                .setFeedType(syndFeed.getFeedType());

        for (SyndEntry syndEntry : syndFeed.getEntries()) {
            News news = new News()
                    .setLink(syndEntry.getLink())
                    .setTitle(syndEntry.getTitle())
                    .setDescription(syndEntry.getDescription().getValue());
            
            if (syndEntry.getEnclosures() != null && !syndEntry.getEnclosures().isEmpty())
                news.imageUrl = syndEntry.getEnclosures().get(0).getUrl();
            if (syndEntry.getCategories() != null && !syndEntry.getCategories().isEmpty()) {
                SyndCategory category = syndEntry.getCategories().get(0);
                news.category = category.getName();
                news.categoryUrl = category.getTaxonomyUri();
            }
            if (syndEntry.getContents() != null && !syndEntry.getContents().isEmpty())
                news.imageUrl = syndEntry.getContents().get(0).getValue();
            newsFeed.newsItems.add(news);
        }
        return new NewsFeed();
    }
}
