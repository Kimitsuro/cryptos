package ru.kimi.repository;

import ru.kimi.model.Trend;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrendRepository extends JpaRepository<Trend, Long> {
}
