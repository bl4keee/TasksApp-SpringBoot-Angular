package com.therealbartek.tasks.repository;

import com.therealbartek.tasks.domain.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {


}
