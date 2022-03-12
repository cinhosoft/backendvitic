package co.com.vitic.apivitic.service.impl;

import co.com.vitic.apivitic.model.Model;
import co.com.vitic.apivitic.repository.ModelRepository;
import co.com.vitic.apivitic.exception.BadResourceRequestException;
import co.com.vitic.apivitic.exception.NoSuchResourceFoundException;
import co.com.vitic.apivitic.service.IModelService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("modelService")
public class ModelServiceImpl implements IModelService {
    @Autowired
    private ModelRepository modelRepository;

    @Override
    public void deleteAllModels() {
        modelRepository.deleteAllInBatch();
    }

    @Override
    public void deleteModelById(Long id) {
        modelRepository.deleteById(id);
    }

    @Override
    public void createModel(Model model) {
        Optional<Model> existingModel = modelRepository.findById(model.getId());

        if (!existingModel.isPresent()) {
            throw new BadResourceRequestException("Model with same id exists.");
        }

        modelRepository.save(model);
    }

    @Override
    public Model getModelById(Long id) {
        Optional<Model> model = modelRepository.findById(id);

        if (!model.isPresent()) {
            throw new NoSuchResourceFoundException("No model with given id found.");
        }

        return model.get();
    }

    @Override
    public List<Model> getAllModels() {
        return modelRepository.findAll();
    }
}
