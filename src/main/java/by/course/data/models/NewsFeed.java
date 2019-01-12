package by.course.data.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NewsFeed {
    public String title;
    public String description;
    public String feedType;
    public String link;
    public String imageUrl;

    public List<News> newsItems = new ArrayList<>();

    public NewsFeed() {}

    public NewsFeed(String title, String description, String feedType, String link, String imageUrl, List<News> newsItems) {
        this.title = title;
        this.description = description;
        this.feedType = feedType;
        this.link = link;
        this.imageUrl = imageUrl;
        this.newsItems = newsItems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewsFeed newsFeed = (NewsFeed) o;
        return Objects.equals(title, newsFeed.title) &&
                Objects.equals(description, newsFeed.description) &&
                Objects.equals(feedType, newsFeed.feedType) &&
                Objects.equals(link, newsFeed.link) &&
                Objects.equals(imageUrl, newsFeed.imageUrl) &&
                Objects.equals(newsItems, newsFeed.newsItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, feedType, link, imageUrl, newsItems);
    }

    @Override
    public String toString() {
        return "NewsFeed{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", feedType='" + feedType + '\'' +
                ", link='" + link + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", newsItems=" + newsItems +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public NewsFeed setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public NewsFeed setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getFeedType() {
        return feedType;
    }

    public NewsFeed setFeedType(String feedType) {
        this.feedType = feedType;
        return this;
    }

    public String getLink() {
        return link;
    }

    public NewsFeed setLink(String link) {
        this.link = link;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public NewsFeed setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public List<News> getNewsItems() {
        return newsItems;
    }

    public NewsFeed setNewsItems(List<News> newsItems) {
        this.newsItems = newsItems;
        return this;
    }
}
