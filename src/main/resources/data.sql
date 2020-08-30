INSERT INTO Productos (id_producto, ref_producto, nombre_producto) VALUES (1, 'REF1', 'Portátil AK005');
INSERT INTO Productos (id_producto, ref_producto, nombre_producto) VALUES (2, 'REF2', 'Portatil 14-cf3037la');
INSERT INTO Productos (id_producto, ref_producto, nombre_producto) VALUES (3, 'REF3', 'Tablet  Yoga');
INSERT INTO Productos (id_producto, ref_producto, nombre_producto) VALUES (4, 'REF4', 'Teclado Alambrico');
INSERT INTO Productos (id_producto, ref_producto, nombre_producto) VALUES (5, 'REF5', 'Teclado Inalambrico');
INSERT INTO Productos (id_producto, ref_producto, nombre_producto) VALUES (6, 'REF6', 'Mouse Inalambrico');
INSERT INTO Productos (id_producto, ref_producto, nombre_producto) VALUES (7, 'REF7', 'Router');
INSERT INTO Productos (id_producto, ref_producto, nombre_producto) VALUES (8, 'REF8', 'Impresora');

INSERT INTO Proveedores (id_proveedor, nombre_proveedor, tipo_Documento_proveedor, num_documento_proveedor) VALUES (1, 'Proveedor1', 'NIT', '123456');
INSERT INTO Proveedores (id_proveedor, nombre_proveedor, tipo_Documento_proveedor, num_documento_proveedor) VALUES (2, 'Proveedor2', 'CC', '987654');

INSERT INTO Pedidos (id_pedidos, estadopedido, fecha_pedido, Cantidad, Productos_id_producto, Productos_id_producto1, Cantidad1, Productos_id_producto2, Cantidad2, Proveedores_id_proveedor) VALUES ('1', 'Completado', now(), '1', '1', '2', '2', '3', '3', 1);
