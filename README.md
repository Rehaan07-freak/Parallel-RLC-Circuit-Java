# Parallel RLC Circuit Simulation — Java

A Java-based simulation tool that computes branch currents and key electrical parameters of a **parallel RLC circuit** under AC conditions. Built as part of the Basic Electrical and Electronics Engineering Laboratory course at VNR Vignana Jyothi Institute of Engineering & Technology.

---

## 📌 Overview

Analysing parallel RLC circuits manually for varying component values is time-consuming and error-prone. This program automates the computation of admittance, impedance, RMS voltage, and individual branch currents — making it a practical educational tool for students learning AC circuit theory.

---

## ⚙️ How It Works

The user provides:
- Resistance (Ω)
- Inductance (H)
- Capacitance (F)
- Frequency (Hz)
- Peak source current (A)

The program then computes:

| Parameter | Formula |
|---|---|
| Resistor Admittance | `Y_R = 1 / R` |
| Inductor Admittance | `Y_L = 1 / (2πfL)` |
| Capacitor Admittance | `Y_C = 2πfC` |
| Total Admittance | `Y_T = Y_R + Y_L + Y_C` |
| Total Impedance | `Z_T = 1 / Y_T` |
| RMS Voltage | `V_rms = (I_max / √2) × Z_T` |
| Branch Currents | `I = V_rms × Y` |

> **Note:** This simulation uses magnitude-only analysis (no complex phasor math or phase shift handling), making it beginner-friendly while still accurately reflecting current division behaviour.

---

## 🖥️ Sample Output

```
Enter the resistance (Ohms): 150
Enter the inductance (Henries): 0.1
Enter the capacitance (Farads): 0.00001
Enter the frequency (Hz): 100
Enter the value of maximum current (Amps): 1.5

Calculated Values:
Total Admittance: 0.028865 S
Total Impedance: 34.643617 Ohms
Source RMS Voltage: 36.745105 V
Current through Resistor: 0.244967 A
Current through Inductor: 0.584817 A
Current through Capacitor: 0.230876 A
```

---

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK 8 or above)
- Any IDE (IntelliJ IDEA, Eclipse) or command line

### Run

```bash
javac Parallel_RLC.java
java Parallel_RLC
```

---

## 📊 Key Observations

- Lower impedance branches conduct higher currents in a parallel configuration
- Inductor and capacitor admittances are frequency-dependent — higher frequency increases capacitor current and decreases inductor current
- The resistor current depends solely on resistance and RMS voltage

---

## 🛠️ Tech Stack

- **Language:** Java
- **Concepts:** AC Circuit Analysis, Admittance, Impedance, KCL, RMS Calculations, OOP

---

## 👥 Team

| Name | Roll No |
|---|---|
| Manchukonda Vaishali | 24071A6636 |
| Mandadi Lakshmi Sahithi | 24071A6637 |
| Meena Srinallaparaju | 24071A6638 |
| Mohammed Rehaan | 24071A6639 |
| Mohammed Tawfeeq Omar | 24071A6640 |

**Guided by:**
- Dr. B. Neelakanteshwar Rao, Associate Professor (EEE Dept.)
- Dr. O. Sobhana, Assistant Professor (EEE Dept.)

---

## 📄 License

This project was developed for academic purposes at VNR VJIET, Hyderabad.
