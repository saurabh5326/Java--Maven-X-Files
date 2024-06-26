package org.example;

import org.springframework.data.jpa.repository.JpaRepository;

public interface APICountRepository extends JpaRepository<APICount, Long> {
}
