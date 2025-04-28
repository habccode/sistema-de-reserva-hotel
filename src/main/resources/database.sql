-- Crear la tabla usuario
CREATE TABLE usuario (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    usuario TEXT NOT NULL,
    contraseña TEXT NOT NULL,
    email TEXT UNIQUE NOT NULL
);

-- Insertar usuarios de ejemplo
INSERT INTO usuario (usuario, contraseña, email) VALUES
    ('Juan Pérez', 'pass123', 'juan@example.com'),
    ('Ana López', 'securePass', 'ana@example.com'),
    ('Carlos Gómez', 'claveSegura', 'carlos@example.com');