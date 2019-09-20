/**
 * 
 */
package com.mrts.ticketservice.domain;

import java.io.Serializable;

/**
 * @author bharamil
 *
 */
public class GetTicketCriteria implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private int age;

    private int validityDays;

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age
     *            the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the validityDays
     */
    public int getValidityDays() {
        return validityDays;
    }

    /**
     * @param validityDays
     *            the validityDays to set
     */
    public void setValidityDays(int validityDays) {
        this.validityDays = validityDays;
    }

}
