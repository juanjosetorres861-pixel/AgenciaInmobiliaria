# AgenciaInmobiliaria
Proyecto AgenciaInmobiliaria
 Sistema de Gestión Inmobiliaria 
Proyecto realizado por: Juan Jose Torres Rodriguez y Samuel Rodriguez Serrano .
---
##  Diseño del Sistema (Diagrama UML)
Para la arquitectura del sistema, diseñamos un diagrama de clases que representa la lógica de la oficina:

* Clase Abstracta ,Propiedad : Definimos esta clase como abstracta porque representa un concepto general. En la vida real, no se transa una propiedad genérica, sino tipos específicos como casas o locales.
* Herencia : Las clases Casa, Apartamento y Local heredan de Propiedad, reutilizando atributos comunes (dirección, precio) y añadiendo los suyos propios.
* Relaciones de Negocio:
    * Agente - Propiedad: Relación 1 a muchos, donde un agente gestiona un catálogo de inmuebles.
    * Cliente - Visita: Registra el interés de los usuarios por conocer las propiedades físicamente.
    * Contrato: La entidad que formaliza la relación legal entre un cliente y un inmueble.

##  Implementación Técnica
En esta primera fase, nos enfocamos en construir el "cerebro" del sistema en Java:

1.  Encapsulamiento: Todos los atributos se definieron como private. Implementamos métodos Getters y Setters para controlar el acceso a la información, simulando los permisos de seguridad de una oficina real.
2.  Organización por Paquetes: 
     com.inmobiliaria.mode`: Contiene el dominio y las entidades.
     com.inmobiliaria.main: Contiene la lógica de ejecución y pruebas.
3.  Abstracciones e Interfaces: Dejamos proyectadas interfaces como Arrendable y Vendible para definir comportamientos específicos en futuras entregas, cumpliendo con la escalabilidad del sistema.
