/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model17;

import java.util.ArrayList;
import javafx.scene.shape.Line;

/**
 *
 * @author Baianater 4
 */
public class InvoiceModel {
    private int num;
    private String date;
    private String customer;
    private ArrayList <Line> lines;

    public InvoiceModel() {
    }

    public InvoiceModel(int num, String date, String customer) {
        this.num = num;
        this.date = date;
        this.customer = customer;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
}
