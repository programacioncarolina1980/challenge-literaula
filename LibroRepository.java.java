package repository;

public interface LibroRepository extends JpaRepository<Libro, Long> {
    Optional>Libro>findByTituloContainsIgnoreCase(String nombreLibro);
}


