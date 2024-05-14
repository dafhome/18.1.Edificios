Instructions
Tienes un programa principal de gestión inmobiliaria, que gestiona tres tipos de inmuebles:

Características en común: superficie, precio, ubicación. Opcional: se puede añadir tipo: casa, piso, trastero
como un campo más en vez de buscar la clase.
Características personalizadas:
- Casa => es adosada?
- Piso => en que planta está? Tiene ascensor?
- Trastero => tiene seguridad?
Crear una clase abstracta Edificio, o Inmueble, u otro nombre, de la cual hereden el resto.

- Instanciar al menos dos de cada tipo (casa, piso , trastero).

- Dos tipos de consulta: una que muestre solo tipo y ubicación: ‘casa en Santa Coloma’

- Y otra que muestre todas las características. Mostrar casas

• Probar constructor vacío y luego llenarlo en el main

• Probar sobrecarga de métodos (método solo con tipo y ubicación)

• Verificar qué ocurre con los toString() en cada caso. No vale decir: ascensor=true. Tiene que ser
frase completa: ‘Es una casa de 100m2 en Sta. Coloma que vale 400.000E y está adosada’
• Probar a crear un atributo final en una de las clases hijas.

+extra: añadir datos por entrada de teclado
