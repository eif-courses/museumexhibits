package eif.viko.lt.our.faculty.api.repository;

import eif.viko.lt.our.faculty.api.model.Exhibit;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
public class ExhibitRepository implements PanacheRepository<Exhibit> {

  public Optional<Exhibit> findTitleOptional(String title){
    return find("title", title).firstResultOptional();
  }
}
