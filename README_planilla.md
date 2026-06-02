# 📱 Gestión de Planilla de Trabajadores

Aplicación Android nativa desarrollada en Kotlin para el registro de trabajadores y el cálculo automático de descuentos según régimen de seguro (AFP u ONP).

---

## 📌 Descripción

Esta aplicación permite registrar empleados con sus datos básicos y calcular de forma automática su sueldo neto según el tipo de seguro seleccionado. Aplica la lógica de planilla peruana con validaciones en tiempo real e interfaz adaptada a Material Design 3.

---

## ✨ Funcionalidades

- Registro de trabajadores: nombre, apellidos, género y sueldo básico
- Selección de régimen de seguro: **AFP (12.5%)** u **ONP (8%)**
- Cálculo automático de descuento y sueldo neto al instante
- Validación de campos en tiempo real antes de procesar cada registro
- Soporte para **modo oscuro** (Dark Mode)

---

## 🧮 Lógica de Negocio

| Régimen | Descuento | Ejemplo con S/ 2,000 |
|---------|-----------|----------------------|
| AFP     | 12.5%     | Descuento: S/ 250 → Neto: **S/ 1,750** |
| ONP     | 8%        | Descuento: S/ 160 → Neto: **S/ 1,840** |

---

## 🛠️ Tecnologías

| Herramienta | Uso |
|-------------|-----|
| Kotlin | Lenguaje principal |
| Android Studio | Entorno de desarrollo |
| Material Design 3 | Componentes de UI |
| ConstraintLayout + RadioGroup | Estructura de pantallas |
| Gradle | Sistema de build |
| Git / GitHub | Control de versiones |

---

## 🚀 Cómo ejecutar el proyecto

1. Clona el repositorio:
   ```bash
   git clone https://github.com/arturo-carrasco22/APP_SEGURO_DESCUENTO.git
   ```
2. Abre el proyecto en **Android Studio** (versión Hedgehog o superior).
3. Conecta un dispositivo físico Android o inicia un emulador (API 24+).
4. Ejecuta con `Run > Run 'app'` o el botón ▶️.

---

## 📂 Estructura del proyecto

```
app/
└── src/
    └── main/
        ├── java/        # Lógica de negocio y actividades
        ├── res/         # Layouts, drawables, strings, themes
        └── AndroidManifest.xml
```

---

## 📸 Capturas de pantalla

> _Próximamente_

---

## 👤 Autor

**Arturo Carrasco** · [github.com/arturo-carrasco22](https://github.com/arturo-carrasco22)
