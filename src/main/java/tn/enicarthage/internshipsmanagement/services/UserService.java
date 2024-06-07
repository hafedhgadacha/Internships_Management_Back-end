package tn.enicarthage.internshipsmanagement.services;

import tn.enicarthage.internshipsmanagement.entities.User;
import tn.enicarthage.internshipsmanagement.response.UserDTO;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User save(User user);
    User updateUser(User user);
    void deleteUser(User user);
    void deleteUserById(Long id);
    User getUser(Long id);
    List<UserDTO> getAllDirections();

    Optional<User> findByEmail(String email);
    Optional<User> findByUsername(String username);
    List<User> getEtudiants();

    List<UserDTO> getAllEnseignants();

    List<UserDTO> getAllEtudiants();

    List<UserDTO> getDemandes();

    User findBySfe(String msg);
    List<UserDTO> getAllEnseignantsByDepartment(Long id);
}
