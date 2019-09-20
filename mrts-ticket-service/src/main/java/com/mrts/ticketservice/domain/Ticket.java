/**
 * 
 */
package com.mrts.ticketservice.domain;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * The Class Ticket.
 *
 * @author bharamil
 */
@Document(collection = "mrts_ticket")
public class Ticket implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The id. */
    @Id
    private String _id;

    /** The name. */
    @Field(value = "name")
    private String name;

    /** The min age. */
    @Field(value = "minAge")
    private int minAge;

    /** The max age. */
    @Field(value = "maxAge")
    private int maxAge;

    /** The validity in days. */
    @Field(value = "validityInDays")
    private int validityInDays;

    /**
     * Gets the id.
     *
     * @return the _id
     */
    public String get_id() {
        return _id;
    }

    /**
     * Sets the id.
     *
     * @param _id
     *            the _id to set
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * Gets the min age.
     *
     * @return the minAge
     */
    public int getMinAge() {
        return minAge;
    }

    /**
     * Sets the min age.
     *
     * @param minAge
     *            the minAge to set
     */
    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    /**
     * Gets the max age.
     *
     * @return the maxAge
     */
    public int getMaxAge() {
        return maxAge;
    }

    /**
     * Sets the max age.
     *
     * @param maxAge
     *            the maxAge to set
     */
    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name
     *            the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the validity in days.
     *
     * @return the validityInDays
     */
    public int getValidityInDays() {
        return validityInDays;
    }

    /**
     * Sets the validity in days.
     *
     * @param validityInDays
     *            the validityInDays to set
     */
    public void setValidityInDays(int validityInDays) {
        this.validityInDays = validityInDays;
    }

}
