/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.vitic.apivitic.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
/**
 *
 * @author Marlon
 */
@Entity
public class Model {

    private static final long serialVersionUID = -3904417485279370766L;

    @Id
    private Long id;

    private String name;

    public Model() {
    }

    public Model(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
