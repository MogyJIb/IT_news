package by.course.data.models;

import java.util.Objects;

public class News {
    public String link;
    public String title;
    public String description;
    public String imageUrl;
    public String categoryUrl;
    public String category;

    public News() {}

    public News(String link, String title, String description, String imageUrl, String categoryUrl, String category) {
        this.link = link;
        this.title = title;
        this.description = description;
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
                Objects.equals(imageUrl, news.imageUrl) &&
                Objects.equals(categoryUrl, news.categoryUrl) &&
                Objects.equals(category, news.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(link, title, description, imageUrl, categoryUrl, category);
    }

    @Override
    public String toString() {
        return "News{" +
                "link='" + link + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", categoryUrl='" + categoryUrl + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCategoryUrl() {
        return categoryUrl;
    }

    public void setCategoryUrl(String categoryUrl) {
        this.categoryUrl = categoryUrl;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
