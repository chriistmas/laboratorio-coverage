# Laboratorio 04: xUnit y Cobertura de Código

<p align="center">
  <img src="https://shields.io" alt="Java 21">
  <img src="https://shields.io" alt="JUnit 5">
  <img src="https://shields.io" alt="JaCoCo">
  <img src="https://shields.io" alt="Ubuntu">
</p>

---

## 📝 Descripción
Practical Bubble Sort implementation with JUnit 5 unit testing and JaCoCo code coverage.

Este repositorio contiene la implementación práctica del algoritmo **Bubble Sort** y su suite de pruebas unitarias estructuradas bajo el estándar de la industria, garantizando un análisis riguroso de cobertura lógicas por ramas.

## 👤 Integrante
* **Nombre:** Ronald Reynaldo Valdez Agüero

## 🛠️ Tecnologías Utilizadas
* **Lenguaje:** Java 21 (OpenJDK)
* **Gestor de dependencias:** Apache Maven 3.8.7
* **Framework de pruebas (xUnit):** JUnit 5 (Jupiter)
* **Herramienta de cobertura:** JaCoCo (Branch Coverage Strategy)

---

## 📂 Estructura del Proyecto
El proyecto sigue estrictamente la arquitectura estándar de Maven:
```text
laboratorio-coverage/
├── src/
│   ├── main/java/com/ccomp/app/      # Código Fuente (Clase Sorter)
│   └── test/java/com/ccomp/app/      # Pruebas Unitarias (SorterTest)
├── .gitignore                        # Exclusiones de Git (Ignora /target)
├── pom.xml                           # Configuración de Dependencias y Plugins
└── README.md                         # Documentación del Proyecto
```

---

## 🚀 Instrucciones de Ejecución

### Pre-requisitos
Asegúrate de contar con Maven instalado en tu entorno local:
```bash
mvn -version
```

### Ejecutar Pruebas y Generar Reporte
Para limpiar compilaciones previas, compilar el proyecto, ejecutar la suite de pruebas automatizadas y disparar el agente de JaCoCo, ejecute:
```bash
mvn clean test
```

---

## 📊 Visualización de Resultados de Cobertura

Una vez finalizada la ejecución con un estado exitoso (`BUILD SUCCESS`), el reporte interactivo detallado se almacena localmente. Puede abrirlo directamente en su navegador web (Firefox/Chrome) mediante la siguiente ruta:

📂 `target/site/jacoco/index.html`

### 💡 Código de Colores de JaCoCo en el Reporte:
* 🟢 **Verde:** Líneas y ramas de decisión totalmente cubiertas por las pruebas.
* 🟡 **Amarillo:** Ramas parcialmente cubiertas (falta evaluar la opción contraria del condicional).
* 🔴 **Rojo:** Código que no fue ejecutado por ningún caso de prueba.

