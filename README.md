# 📚 Polytechnic Study Library

The **Polytechnic Study Library** is an Android application designed specifically for **Polytechnic students** to easily access and manage e-books.
It provides **subject-wise categorized study material**, supports **offline reading**, and offers a clean, simple interface for effective learning.

---

## ✨ Features

* 📖 **Subject-wise categorized e-books**
* 📂 **Download & Offline Reading**
* 🔑 **Firebase Login & Signup**
* 🎨 **Simple & User-friendly UI**
* 🌐 **Direct PDF access from Google Drive**

---

## 🛠 Tech Stack

* **Java** (Android app development)
* **Firebase Authentication & Realtime Database**
* **Gradle (Kotlin DSL)** for build system
* **Android SDK**
* **Google Drive PDF access**

---

## 🚀 Installation & Setup

### Prerequisites

* [Android Studio](https://developer.android.com/studio)
* Java 8 or later
* Gradle (comes bundled with Android Studio)

### Steps to Run the App

1. Clone this repository:

```bash
git clone https://github.com/samikshapatil5/polytechnic-study-library.git
```

2. Open the project in **Android Studio**.
3. Click **Sync Project with Gradle Files** to install dependencies.
4. Connect an Android device or start an emulator.
5. Press ▶️ **Run** to build and launch the app.

---

### 🔥 Firebase Setup

1. Go to [Firebase Console](https://console.firebase.google.com/) and create a new project.
2. Add your Android app package name in Firebase project settings.
3. Download `google-services.json` and place it in the `app/` folder.
4. Add Firebase dependencies in your `app/build.gradle` file:

```gradle
implementation 'com.google.firebase:firebase-auth:22.1.2'
implementation 'com.google.firebase:firebase-database:20.3.0'
```

5. Apply Google services plugin at the bottom of `app/build.gradle`:

```gradle
apply plugin: 'com.google.gms.google-services'
```

---

### 📱 Google Drive PDF Access

1. Upload your PDFs to **Google Drive**.
2. Make them **shareable**: “Anyone with the link can view”.
3. Get the **file ID** from the link:

```
https://drive.google.com/file/d/FILE_ID/view
```

4. Convert it to a **direct download link**:

```
https://drive.google.com/uc?export=download&id=FILE_ID
```

5. Open PDF in your app using `android-pdf-viewer`:

```java
pdfView.fromUri(Uri.parse("https://drive.google.com/uc?export=download&id=FILE_ID"))
       .enableSwipe(true)
       .swipeHorizontal(false)
       .load();
```

* Optional: Download for **offline reading**.

---

### 📚 Usage

* Login or sign up using Firebase Authentication.
* Browse e-books by subject.
* Click an e-book to **open PDF directly from Google Drive**.
* Download PDFs for offline reading.

---

### 🤝 Contribution

Contributions are welcome!

1. Fork the repository
2. Create a new branch (`git checkout -b feature-name`)
3. Commit your changes (`git commit -m 'Add feature'`)
4. Push to the branch (`git push origin feature-name`)
5. Open a Pull Request

---

### 📝 License

This project is licensed under the MIT License.   
