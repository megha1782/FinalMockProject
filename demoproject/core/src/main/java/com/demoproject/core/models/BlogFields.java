package com.demoproject.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class BlogFields {
    @Inject
    private String img;

    @Inject
    private String heading;

    @Inject
    private String subHeading;

//    @Inject
//    private String currentDate;

//    @Inject
//    private String content;

    @Inject
    private String link;

//    public String getCurrentDate() {
//        return currentDate;
//    }

//    public void setCurrentDate(String currentDate) {
//        this.currentDate = currentDate;
//    }

//    public String getContent() {
//        return content;
//    }

//    public void setContent(String content) {
//        this.content = content;
//    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }


    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getSubHeading() {
        return subHeading;
    }

    public void setSubHeading(String subHeading) {
        this.subHeading = subHeading;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
