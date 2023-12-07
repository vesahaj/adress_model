package services.impl;

import cacttus.education.adresa.repositories.Repository.YourEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public abstract class YourEntityService {
    public abstract List<YourEntity> getAllEntities();// src/main/java/com/example/demo/services/YourEntityServiceImpl.java

    public abstract YourEntity getEntityById(Long id);

    public abstract YourEntity saveEntity(YourEntity yourEntity);

    public abstract void deleteEntity(Long id);

    @Service
    public class YourEntityServiceImpl extends YourEntityService {

        @Autowired
        private YourEntity.YourEntityRepository yourEntityRepository;

        @Override
        public List<YourEntity> getAllEntities() {
            return yourEntityRepository.findAll();
        }

        @Override
        public YourEntity getEntityById(Long id) {
            return yourEntityRepository.findById(id).orElse(null);
        }

        @Override
        public YourEntity saveEntity(YourEntity yourEntity) {
            return yourEntityRepository.save(yourEntity);
        }

        @Override
        public void deleteEntity(Long id) {
            yourEntityRepository.deleteById(id);
        }
    }

}
