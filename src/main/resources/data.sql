INSERT INTO peliculas (titulo, duracion, genero, fecha_estreno, clasificacion, estado)
VALUES ('Misión Final', 125, 'ACCION', '2023-11-10', 8.20, 'D')
    ON CONFLICT (titulo) DO NOTHING;

INSERT INTO peliculas (titulo, duracion, genero, fecha_estreno, clasificacion, estado)
VALUES ('El Último Suspiro', 138, 'DRAMA', '2022-07-21', 7.50, 'N')
    ON CONFLICT (titulo) DO NOTHING;

INSERT INTO peliculas (titulo, duracion, genero, fecha_estreno, clasificacion, estado)
VALUES ('Aventura en el Bosque', 95, 'FAMILIAR', '2024-03-05', 6.90, 'D')
    ON CONFLICT (titulo) DO NOTHING;

INSERT INTO peliculas (titulo, duracion, genero, fecha_estreno, clasificacion, estado)
VALUES ('Horizonte 9', 110, 'CIENCIA_FICCION', '2021-12-18', 8.75, 'N')
    ON CONFLICT (titulo) DO NOTHING;

INSERT INTO peliculas (titulo, duracion, genero, fecha_estreno, clasificacion, estado)
VALUES ('El Reino de los Colores', 88, 'ANIMADA', '2020-05-14', 9.10, 'D')
    ON CONFLICT (titulo) DO NOTHING;

INSERT INTO peliculas (titulo, duracion, genero, fecha_estreno, clasificacion, estado)
VALUES ('Noche Infinita', 102, 'TERROR', '2023-01-30', 7.00, 'N')
    ON CONFLICT (titulo) DO NOTHING;
