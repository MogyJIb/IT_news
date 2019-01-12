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

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFeedType() {
        return feedType;
    }

    public void setFeedType(String feedType) {
        this.feedType = feedType;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<News> getNewsItems() {
        return newsItems;
    }

    public void setNewsItems(List<News> newsItems) {
        this.newsItems = newsItems;
    }
}
