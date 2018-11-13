package com.lbp.prototypes.microservices.ratingserver.domain;

/**
 * @author Adam Johnson <Adam.Johnson@rbaconsulting.com>
 * @since 11/13/2018
 */
public class Rating
{
    private Long id;
    private Long bookId;
    private int stars;

    public Rating(Long id, Long bookId, int stars)
    {
        this.id = id;
        this.bookId = bookId;
        this.stars = stars;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getBookId()
    {
        return bookId;
    }

    public void setBookId(Long bookId)
    {
        this.bookId = bookId;
    }

    public int getStars()
    {
        return stars;
    }

    public void setStars(int stars)
    {
        this.stars = stars;
    }
}