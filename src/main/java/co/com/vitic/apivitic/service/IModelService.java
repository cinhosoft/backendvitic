/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.vitic.apivitic.service;

import co.com.vitic.apivitic.model.Model;
import java.util.List;

/**
 *
 * @author Marlon
 */
public interface IModelService {

    void deleteAllModels();

    void deleteModelById(Long id);

    void createModel(Model model);

    Model getModelById(Long id);

    List<Model> getAllModels();
}
