package org.sid.Repository;

import org.sid.Model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepositiory extends JpaRepository<Client,Integer> {
}
