# Principios-SOLID


# Discusión Inicial

Al analizar el diseño original, observé que si quisiera añadir una nueva figura, como Triangle, sería necesario modificar directamente la clescalabilidadlator. Esto implicaría agregar nuevas condiciones (if instanceof Triangle) y lógica extra para calcular su área.

Esto generaría varios problemas:

Escalabilidad limitada: cada nueva figura obliga a modificar la misma clase.

Alto riesgo de errores: al tocar código existente, se pueden introducir errores en funcionalidades que ya estaban correctas.

Dependencia entre clases: AreaCalculator depende de los detalles internos de todas las figuras.

Violación del Principio Abierto/Cerrado (OCP): la clase no está cerrada a la modificación, sino que requiere cambios constantes.

En conclusión, la arquitectura inicial no resulta sostenible ni segura a medida que el sistema crece, lo que compromete su mantenibilidad y escalabilidad.

# Discusión final
Acoplamiento y cohesión:
En el diseño original, la clase AreaCalculator dependía demasiado de los detalles de cada figura y se mezclaban varias responsabilidades en un mismo lugar. En cambio, después de la refactorización, cada figura se encarga de calcular su propia área y AreaCalculator solo suma los resultados. Esto hace que el código sea más claro y con menos dependencias innecesarias.

Uso de polimorfismo y facilidad para agregar nuevas figuras:
En el nuevo diseño, todas las figuras tienen el mismo método (getArea()), por lo que AreaCalculator no necesita condicionales ni saber cómo funciona cada una por dentro. De esta forma, si quiero agregar una figura nueva, solo la creo y funciona directamente sin tocar el resto del código. Esto hace que el sistema se pueda ampliar fácilmente sin tener que modificar lo que ya estaba hecho.

Independencia entre partes del sistema:
Al inicio, la clase principal (AreaCalculator) dependía directamente de clases específicas como Rectangle y Circle. En el diseño final, tanto las figuras como AreaCalculator dependen de una interfaz común (Shape). Esto hace que ninguna parte esté atada a otra en particular, y que el sistema sea más flexible y sencillo de mejorar o cambiar en el futuro.

En conclusión, la refactorización basada en los principios SOLID permitió transformar un diseño rígido y poco escalable en una arquitectura flexible, mantenible y extensible. El uso de SRP, OCP y DIP asegura que el sistema pueda crecer sin necesidad de alterar el código existente, reduciendo riesgos y mejorando la calidad del software.