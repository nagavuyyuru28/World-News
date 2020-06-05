package com.example.worldnews;

public class News {

    //Title of news
    private String mTitle;

    //Section to which news belongs to
    private String mSection;

    //Date of news
    private String mDate;

    //Author of news
    private String mAuthor;

    //Website URL of the news
    private String mUrl;

    /**
     * Constructs a new {@link News} object.
     *
     * @param mTitle is the Title of news
     * @param mSection is the Section to which news belongs to
     * @param mDate is the Date of news
     * @param mAuthor is the Author of news
     * @param mUrl is the website URL to find more details about the earthquake
     */

    public News(String mTitle, String mSection, String mDate, String mAuthor, String mUrl) {
        this.mTitle = mTitle;
        this.mSection = mSection;
        this.mDate = mDate;
        this.mAuthor = mAuthor;
        this.mUrl =mUrl;
    }

    //returns the title of news
    public String getmTitle() {
        return mTitle;
    }

    //sets the title of news
    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    //returns the Section to which news belongs to
    public String getmSection() {
        return mSection;
    }

    //sets the Section to which news belongs to
    public void setmSection(String mSection) {
        this.mSection = mSection;
    }

    //returns the Date of news
    public String getmDate() {
        return mDate;
    }

    //sets the Date of news
    public void setmDate(String mDate) {
        this.mDate = mDate;
    }

    //returns the Author of news
    public String getmAuthor() {
        return mAuthor;
    }

    //sets the Author of news
    public void setmAuthor(String mAuthor) {
        this.mAuthor = mAuthor;
    }

    //returns the Website URL of the news
    public String getmUrl() {
        return mUrl;
    }

    //sets the Website URL of the news
    public void setmUrl(String mUrl) {
        this.mUrl = mUrl;
    }

}
