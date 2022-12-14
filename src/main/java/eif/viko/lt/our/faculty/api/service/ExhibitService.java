package eif.viko.lt.our.faculty.api.service;


import eif.viko.lt.our.faculty.api.model.Exhibit;
import eif.viko.lt.our.faculty.api.repository.ExhibitRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
@Transactional
public class ExhibitService {

  @Inject
  ExhibitRepository repository;

  public void create(Exhibit exhibit){
    repository.persist(exhibit);
  }
  public void delete(long id){
    repository.deleteById(id);
  }
  public List<Exhibit> displayAllItems(){
    return repository.listAll();
  }




}
