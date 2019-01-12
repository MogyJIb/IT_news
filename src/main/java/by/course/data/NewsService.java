package by.course.data;

import by.course.data.models.NewsFeed;
import by.course.domain.NewsConverter;
import com.rometools.rome.io.FeedException;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;

import java.io.IOException;
import java.io.Reader;
import java.net.URL;

public class NewsService {
    public NewsFeed get(String source) throws IOException, FeedException {
        Reader reader = new XmlReader(new URL(source));
        SyndFeedInput syndFeedInput = new SyndFeedInput();
        syndFeedInput.setAllowDoctypes(true);
        syndFeedInput.setXmlHealerOn(true);
        syndFeedInput.setPreserveWireFeed(true);
        return NewsConverter.from(syndFeedInput.build(reader));
    }
}
