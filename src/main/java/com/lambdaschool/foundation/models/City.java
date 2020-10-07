package com.lambdaschool.foundation.models;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "cities")
public class City extends Auditable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long cityid;

    @NotNull
    @Column(unique = true)
    private String cityName;

    @NotNull
    @Column(unique = true)
    private String state;

    @NotNull
    @Column(unique = true)
    private long zipcode;


    public City()
    {
    }


    public City( @NotNull String cityName, @NotNull String state, @NotNull long zipcode)
    {

        this.cityName = cityName;
        this.state = state;
        this.zipcode = zipcode;
    }


    public long getCityid()
    {
        return cityid;
    }

    public void setCityid(long cityid)
    {
        this.cityid = cityid;
    }

    public String getCityName()
    {
        return cityName;
    }

    public void setCityName(String cityName)
    {
        this.cityName = cityName;
    }

    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public long getZipcode()
    {
        return zipcode;
    }

    public void setZipcode(long zipcode)
    {
        this.zipcode = zipcode;
    }
}