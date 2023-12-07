package cacttus.education.adresa.controllers;

import cacttus.education.adresa.entities.YourEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.impl.YourEntityService;

import java.util.List;

public class YourEntityController {// src/main/java/com/example/demo/controllers/YourEntityController.java

    @RestController
    @RequestMapping("/api/your-entity")
    public class yourentitycontroller {

        @Autowired
        private YourEntityService yourEntityService;

        @GetMapping
        public List<cacttus.education.adresa.repositories.Repository.YourEntity> getAllEntities() {
            return yourEntityService.getAllEntities();
        }

        @GetMapping("/{id}")
        public YourEntity getEntityById(@PathVariable Long id) {
            return (YourEntity) yourEntityService.getEntityById(id);
        }

        @PostMapping

        public YourEntity saveEntity(@RequestBody YourEntity yourEntity) {
            cacttus.education.adresa.repositories.Repository.YourEntity YourEntity = null;
            return (YourEntity) yourEntityService.saveEntity(YourEntity);
        }

        @DeleteMapping("/{id}")
        public void deleteEntity(@PathVariable Long id) {
            yourEntityService.deleteEntity(id);
        }
    }

}
