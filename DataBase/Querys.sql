-- Consulta 1: Se solicita mostrar los nombres y cantidades solicitadas de los platos en el pedido de id 1.
SELECT nombre, cantidad
FROM detalle_pedido 
JOIN plato ON  detalle_pedido.Plato_ID = plato.id
JOIN pedido ON detalle_pedido.Pedido_ID = pedido.id
where Pedido_ID = 1;

-- Consulta 2 : Se solicita una lista con la cantidad de pedidos que ha recibido cada mesa
SELECT ID as IdPedido, Mesa_ID ,count(cantidad) as CantidadPedidos 
from pedido 
Join detalle_pedido ON pedido.ID = detalle_pedido.Pedido_ID
group by ID;

-- Consulta 3 : Se solicita una lista con el monto de ventas de cada camarero, ordenados alfabéticamente
-- de forma descendente, agrupados por el nombre del camarero.

Select nombre, total from pedido
Join Camarero ON pedido.Camarero_ID = Camarero.ID 
Order by total DESC;

-- Consulta 4 : Se solicita mostrar el plato más solicitado y la cantidad correspondiente de solicitudes.

select Count(cantidad) as solicitudes ,Nombre  
from detalle_pedido
join plato 
on plato.id = detalle_pedido.Plato_ID
 group by Plato_ID
 order by sum(cantidad) desc
 limit 1;


-- Consulta 5 : Se solicita una lista con los platos vendidos y el valor total que se ha obtenido por cada plato,
-- agrupados por el nombre del plato y ordenados de forma ascendente.
Select ID,Nombre, Precio ,SUM(Cantidad*Precio) as totalVendido
from detalle_pedido
JOIN plato
ON plato.ID=detalle_pedido.Plato_ID
Group by ID
Order by totalVendido ASC;





