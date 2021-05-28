/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bud.rc;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.inject.Inject;

/**
 *
 * @author buddhika
 */
@Named(value = "mainController")
@SessionScoped
public class MainController implements Serializable {

    private String apiRequestId;
    private String respose;
    private String status;

    private String month;
    private String year;
    private String name;
    private String id;
    private String instituteId;

    /**
     * Creates a new instance of MainController
     */
    public MainController() {
    }

    public void rendApiRequestPath() {
        NewJerseyClient newJerseyClient = new NewJerseyClient();
        respose = newJerseyClient.updateClientProcedureRest(apiRequestId, status);
        newJerseyClient.close();
    }

    public void rendApiRequestData() {
        NewJerseyClient newJerseyClient = new NewJerseyClient();
        respose = newJerseyClient.getJson(month, year, name, id, instituteId);
        newJerseyClient.close();
    }

    public String getApiRequestId() {
        return apiRequestId;
    }

    public void setApiRequestId(String apiRequestId) {
        this.apiRequestId = apiRequestId;
    }

    public String getRespose() {
        return respose;
    }

    public void setRespose(String respose) {
        this.respose = respose;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInstituteId() {
        return instituteId;
    }

    public void setInstituteId(String instituteId) {
        this.instituteId = instituteId;
    }

}
