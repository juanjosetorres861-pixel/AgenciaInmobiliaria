# AgenciaInmobiliaria
Proyecto AgenciaInmobiliaria
 Sistema de Gestión Inmobiliaria 
Proyecto realizado por: Juan Jose Torres Rodriguez y Samuel Rodriguez Serrano .
---
##  Diseño del Sistema (Diagrama UML)
Diseño del Sistema (Diagrama UML)
Para la arquitectura del sistema, escalamos el diseño a un total de 10 clases que representan la lógica completa de una oficina moderna:

Clase Padre, Inmueble: Definimos esta clase como la base de la jerarquía. Contiene los atributos comunes como ID de referencia, dirección, precio base y área, además de la lógica para el cálculo de comisiones.

Herencia: Las clases Casa, Apartamento, LocalComercial, Lote, Bodega, Oficina, Finca y Consultorio heredan de Inmueble, permitiendo una especialización del catálogo.

Relaciones de Negocio:

Vendedor - Inmueble: Relación donde el agente gestiona las propiedades y acumula comisiones por cada venta realizada.

Cliente - Inmueble: Registra los datos del comprador y su presupuesto para validar la viabilidad de la compra.

ContratoVenta: La entidad que formaliza la transacción legal entre el cliente, el vendedor y el inmueble, cambiando el estado de la propiedad a "Vendido".

## Implementación Técnica
En esta fase avanzada, hemos robustecido el "cerebro" del sistema en Java siguiendo estos principios:

Encapsulamiento: Todos los atributos se definieron como private o protected. Implementamos métodos Getters y Setters para controlar el acceso a la información y proteger los datos financieros.

Polimorfismo y Especialización: Cada clase hija implementa atributos únicos (como distanciaCiudad en Fincas o numVitrinas en Locales), permitiendo que el sistema sea flexible.

Gestión de Estados: El sistema controla el ciclo de vida del inmueble (Disponible, Vendido, Arrendado), asegurando que un inmueble no se venda dos veces.

Organización de Archivos: El proyecto incluye un archivo .gitignore profesional que filtra archivos temporales de Eclipse e IntelliJ, manteniendo el repositorio de GitHub limpio y enfocado exclusivamente en el código fuente.
