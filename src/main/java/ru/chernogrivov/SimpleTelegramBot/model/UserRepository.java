package ru.chernogrivov.SimpleTelegramBot.model;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
