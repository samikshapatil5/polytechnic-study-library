# 📚 Polytechnic Study Library

The **Polytechnic Study Library** is an Android application designed specifically for **Polytechnic students** to easily access and manage e-books.  
It provides **subject-wise categorized study material**, supports **offline reading**, and offers a clean, simple interface for effective learning.

---

## ✨ Features

- 📖 **Subject-wise categorized e-books**  
- 📂 **Download & Offline Reading**  
- 🔑 **Firebase Login & Signup**  
- 🎨 **Simple & User-friendly UI**  

---

## 🛠 Tech Stack

- **Java** (Android app development)  
- **Firebase Authentication** (Login & Signup)  
- **Gradle (Kotlin DSL)** for build system  
- **Android SDK**

---

## 🚀 Installation & Setup

### Prerequisites
- [Android Studio](https://developer.android.com/studio)
- Java 8 or later
- Gradle (comes bundled with Android Studio)
- ### Steps to Run the App
1. Open the project in **Android Studio**.
2. Click **Sync Project with Gradle Files** (this will install all dependencies like Firebase, AndroidX, etc.).
3. Connect an Android device or start an emulator.
4. Press ▶️ **Run** to build and launch the app.

### 🔥 Firebase Setup
1. Go to Firebase Console and create a new project.
2. Add your Android app package name in Firebase project settings.
3. Download `google-services.json`.
4. Place `google-services.json` in the `app/` folder of your project.
5. Add Firebase dependencies in your `app/build.gradle` file:
```gradle
implementation 'com.google.firebase:firebase-auth:22.1.2'
implementation 'com.google.firebase:firebase-database:20.3.0'


### Steps
1. Clone this repository:
```bash
git clone https://github.com/samikshapatil5/polytechnic-study-library.git
