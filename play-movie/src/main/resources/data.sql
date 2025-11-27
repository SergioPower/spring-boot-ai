INSERT INTO peliculas (titulo, duracion, genero, fecha_estreno, clasificacion, estado)
VALUES ('Misión Final', 125, 'Acción', '2023-11-10', 8.20, 'A')
    ON CONFLICT (titulo) DO NOTHING;

INSERT INTO peliculas (titulo, duracion, genero, fecha_estreno, clasificacion, estado)
VALUES ('El Último Suspiro', 138, 'Drama', '2022-07-21', 7.50, 'A')
    ON CONFLICT (titulo) DO NOTHING;

INSERT INTO peliculas (titulo, duracion, genero, fecha_estreno, clasificacion, estado)
VALUES ('Aventura en el Bosque', 95, 'Familiar', '2024-03-05', 6.90, 'I')
    ON CONFLICT (titulo) DO NOTHING;

INSERT INTO peliculas (titulo, duracion, genero, fecha_estreno, clasificacion, estado)
VALUES ('Horizonte 9', 110, 'Ciencia Ficción', '2021-12-18', 8.75, 'A')
    ON CONFLICT (titulo) DO NOTHING;

INSERT INTO peliculas (titulo, duracion, genero, fecha_estreno, clasificacion, estado)
VALUES ('El Reino de los Colores', 88, 'Animación', '2020-05-14', 9.10, 'A')
    ON CONFLICT (titulo) DO NOTHING;

INSERT INTO peliculas (titulo, duracion, genero, fecha_estreno, clasificacion, estado)
VALUES ('Noche Infinita', 102, 'Terror', '2023-01-30', 7.00, 'I')
    ON CONFLICT (titulo) DO NOTHING;
