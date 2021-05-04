package skyglass.composer.location.persistence;

import org.springframework.data.repository.CrudRepository;

interface LocationRepository extends CrudRepository<LocationEntity, String> {
	LocationEntity findByUuid(String uuid);
}
