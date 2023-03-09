package Application.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import v1.model.User;
import v1.model.UserWithId;
import v1.rest.UserApi;

import java.util.UUID;

@RestController
public class UserController implements UserApi {
    @Override
    public ResponseEntity<Void> deleteById(UUID id) {
        return null;
    }

    @Override
    public ResponseEntity<UserWithId> getById(UUID id) {
        return null;
    }

    @Override
    public ResponseEntity<UserWithId> getUsers() {

        System.out.println("HOLA MUNDO");
        return null;
    }

    @Override
    public ResponseEntity<Void> patchUser(UUID id, User body) {
        return null;
    }

    @Override
    public ResponseEntity<Void> postUser(User body) {
        return null;
    }

    @Override
    public ResponseEntity<Void> uploadAvatar(UUID id, MultipartFile receipt) {
        return null;
    }
}
