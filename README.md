# 🔴 Sistema de Gestión de Socios - Club Atlético Independiente

Este ejercicio simula un sistema de gestión de socios del Club Atlético Independiente, aplicando Programación Orientada a Objetos, HashMap y Streams en Java.

---

## 📌 Enunciado

El Club Atlético Independiente necesita una aplicación para administrar la información de sus socios.

Los datos se encuentran en un archivo de texto llamado `socios.txt`, donde cada línea representa un socio.

---

## 🧾 Tipos de socios

Existen dos tipos:

- Socio Simple (S)
- Socio Premium (P)

---

## 📄 Formato del archivo

### Socio Simple:
S;numeroSocio;nombre;antiguedad;cuotaMensual

### Socio Premium:
P;numeroSocio;nombre;antiguedad;cuotaMensual;beneficio

---

## 📂 Ejemplo de archivo

S;1001;Juan Perez;2;8000  
P;1002;Ana Gomez;5;12000;PLATEA  
S;1003;Luis Diaz;1;7000  
P;1004;Carlos Ruiz;3;15000;PALCO  
S;1005;Martin Suarez;4;9000  
P;1006;Sofia Lopez;6;14000;PLATEA  

---

## 🧱 Requisitos

- Utilizar un HashMap<Integer, Socio>
- Clave → número de socio
- Valor → objeto Socio

---

## 🏗️ Modelo de clases

### Clase abstracta Socio

Debe contener el método:

java
public abstract double calcularCuotaFinal();
Clases hijas
SocioSimple
SocioPremium

Aplicando herencia y polimorfismo.

💰 Reglas de negocio
Socio Simple

cuotaFinal = cuotaMensual

Socio Premium

cuotaFinal = cuotaMensual + adicional

Adicional según beneficio:

"PLATEA" → +5000
"PALCO" → +10000
Otro → +3000

🧪 Funcionalidades a implementar

Leer el archivo y cargar los socios en el HashMap.
Mostrar todos los socios con su cuota final.
Buscar un socio por número.
Calcular la recaudación total del club utilizando Streams.
Obtener el socio que paga la cuota más alta utilizando Streams.
Contar cuántos socios Premium hay.
Mostrar socios cuya cuota final sea mayor a $15000.
Calcular el promedio de cuota de socios simples.
Obtener una lista con los nombres de socios Premium.
Mostrar los números de socio ordenados de mayor a menor según cuota final.

🚀 Conceptos a aplicar

Programación Orientada a Objetos
Clases abstractas
Herencia
Polimorfismo
HashMap
Streams (filter, map, mapToInt, average, sum, sorted)
Lectura de archivos

⚠️ Importante

No modificar la estructura del archivo
Usar Streams en los puntos indicados
Aplicar correctamente el polimorfismo
Validar datos al leer el archivo
