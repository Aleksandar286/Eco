/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

/**
 *
 * @author qa
 */
public class IndexSlider {
    private int id;
    private String title;
    private String description;
    private String link_type;
    private String link_label;
    private int status;
    private int order_number;

    public String getLink_type() {
        return link_type;
    }

    public void setLink_type(String link_type) {
        this.link_type = link_type;
    }

    public String getLink_label() {
        return link_label;
    }

    public void setLink_label(String link_label) {
        this.link_label = link_label;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getOrder_number() {
        return order_number;
    }

    public void setOrder_number(int order_number) {
        this.order_number = order_number;
    }
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    
    
}
