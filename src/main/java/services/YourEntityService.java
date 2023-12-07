package services;

import cacttus.education.adresa.entities.YourEntity;

import java.util.List;

    public interface YourEntityService {
        List<YourEntity> getAllEntities();
        YourEntity getEntityById(Long id);
        YourEntity saveEntity(YourEntity yourEntity);
        void deleteEntity(Long id);
    }


