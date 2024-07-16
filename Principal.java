package JAVA.Principal;


public Principal(SerieRepository repository) {
    this.repositorio = repository;
}

public void muestraElMenu() {
    var opcion = -1;
    while (opcion != 0) {
        var menu = """
                    1 - Buscar libro
                    2 - Buscar libro por idiomas 
                    3 - Mostrar libros buscados 
                    4 - Buscar libros por autores fallecidos
                    5 - Top 5 mejores libros
                    6 - Buscar libros por categoría
                    7 - filtrar libros por categoría 
                    8 - Buscar capítulos por titulo
                    9 - Top 5 mejores libros por categoría
                                  
                    0 - Salir
                    """;
        System.out.println(menu);
        opcion = teclado.nextInt();
        teclado.nextLine();
