package by.course.data.models;

import java.util.Objects;

public class News {
    public String link;
    public String title;
    public String description;
    public String content;
    public String imageUrl;
    public String categoryUrl;
    public String category;

    public News() {}

    public News(String link, String title, String description, String content, String imageUrl, String categoryUrl, String category) {
        this.link = link;
        this.title = title;
        this.description = description;
        this.content = content;
        this.imageUrl = imageUrl;
        this.categoryUrl = categoryUrl;
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        News news = (News) o;
        return Objects.equals(link, news.link) &&
                Objects.equals(title, news.title) &&
                Objects.equals(description, news.description) &&
                Objects.equals(content, news.content) &&
                Objects.equals(imageUrl, news.imageUrl) &&
                Objects.equals(categoryUrl, news.categoryUrl) &&
                Objects.equals(category, news.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(link, title, description, content, imageUrl, categoryUrl, category);
    }

    @Override
    public String toString() {
        return "News{" +
                "link='" + link + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", content='" + content + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", categoryUrl='" + categoryUrl + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    public String getLink() {
        return link;
    }

    public News setLink(String link) {
        this.link = link;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public News setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public News setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public News setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public String getCategoryUrl() {
        return categoryUrl;
    }

    public News setCategoryUrl(String categoryUrl) {
        this.categoryUrl = categoryUrl;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public News setCategory(String category) {
        this.category = category;
        return this;
    }

    public String getContent() {
        return content;
    }

    public News setContent(String content) {
        this.content = content;
        return this;
    }
}
