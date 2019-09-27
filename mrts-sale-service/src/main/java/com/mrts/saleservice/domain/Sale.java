/**
 * 
 */
package com.mrts.saleservice.domain;

import java.io.Serializable;
import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @author bharamil
 *
 */
@Document(collection = "mrts_sale")
public class Sale implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @Field(value = "personId")
    private String personId;

    @Field(value = "ticketId")
    private String ticketId;

    @Field(value = "startDate")
    private Date startDate;

    @Field(value = "endDate")
    private Date endDate;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the personId
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * @param personId
     *            the personId to set
     */
    public void setPersonId(String personId) {
        this.personId = personId;
    }

    /**
     * @return the ticketId
     */
    public String getTicketId() {
        return ticketId;
    }

    /**
     * @param ticketId
     *            the ticketId to set
     */
    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    /**
     * @return the startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate
     *            the startDate to set
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the enddate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @param enddate
     *            the enddate to set
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

}
