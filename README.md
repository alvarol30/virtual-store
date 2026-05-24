Este proyecto consiste en el desarrollo de una tienda virtual por consola en Java, aplicando distintos patrones de diseño de software para resolver problemas específicos dentro del sistema.
La aplicación permite:
- Registrar productos.
- Agregar productos a un carrito de compras.
- Calcular el total de la compra.
- Aplicar descuentos dinámicamente.
- Procesar pagos mediante distintos métodos.
- Confirmar órdenes.
- Notificar automáticamente a diferentes componentes del sistema.
Los patrones implementados son:
- Strategy: El patrón Strategy se utilizó para implementar diferentes métodos de descuento dentro de la tienda virtual. Este patrón permite definir una familia de algoritmos, encapsular cada uno de ellos en clases separadas y hacer que puedan intercambiarse dinámicamente durante la ejecución del programa.
- Adapter: El patrón Adapter se utilizó para integrar un servicio externo de PayPal con el sistema de pagos de la tienda virtual. Este patrón permitió reutilizar código externo sin modificarlo y mantener desacoplada la lógica de pagos del resto de la aplicación.
- Observer: El patrón Observer se utilizó para implementar el sistema de notificaciones automáticas al confirmar una compra. Este patrón establece una relación uno-a-muchos entre objetos, permitiendo que múltiples observadores sean notificados automáticamente cuando ocurre un cambio de estado en el sistema.

<img width="1096" height="820" alt="image" src="https://github.com/user-attachments/assets/10e5e89f-b273-40d2-859b-dec4bc240d1a" />

