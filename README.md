# IRCS Karnataka - First Aid & Disaster Management App

This is an Android application developed in Kotlin for the **Indian Red Cross Society (IRCS), Karnataka State Branch**. The app serves as an informational resource, providing guidance on various first aid techniques, disaster management procedures, and creating awareness about important health topics like Drug Abuse, AIDS, TB, and Basic Sanitation.

## Overview

The primary goal of this app is to educate users and provide easily accessible information on critical life-saving skills and health practices. It features dedicated sections for different topics, often supplemented with instructional videos embedded directly within the app. Additionally, it integrates closely with the IRCS Karnataka State Branch's online presence by providing direct links to their website, registration forms, social media channels, helpline numbers, and location.

## Key Features

*   **Comprehensive Information:** Covers a wide range of topics including First Aid, Disaster Management, Drug Awareness, AIDS Awareness, TB Awareness, and Basic Sanitation.
*   **Modular Content:** Information is organized into distinct sections and sub-sections for easy navigation.
*   **Video Integration:** Embeds relevant YouTube videos within content pages using `WebView` to provide visual instructions and information.
*   **Intuitive Navigation:** Utilizes a combination of:
    *   A main dashboard with `CardView` buttons for major sections.
    *   A side Navigation Drawer (`NavigationView`) for accessing IRCS specific links and actions.
    *   A `BottomNavigationView` for quick access to Home, Info, and Helpline.
    *   Standard ActionBar with back navigation within sub-sections.
*   **IRCS Karnataka Integration:**
    *   Direct links to the official IRCS Karnataka website.
    *   Links to specific registration forms (Blood Donor, First Aid Training, School/College Registrations).
    *   Quick links to IRCS Karnataka's Social Media handles (Instagram, Facebook, Twitter).
    *   Direct dialer intent for the IRCS Karnataka Helpline number.
    *   Direct link to IRCS Karnataka location on Google Maps.
    *   WhatsApp integration for "Chat With Us".
*   **Engaging UI:**
    *   Uses Lottie animations for the splash screen and potentially other areas (`healthcare.json`).
    *   Custom icons and themed UI elements (Material Components).
    *   Uses `CardView` for a modern layout presentation.
*   **Splash Screen:** Provides an animated entry point to the application.

## Content Areas Covered

The app is structured around the following main informational modules:

1.  **First Aid:**
    *   Burns (Classification, What to do, When to go to hospital)
    *   Choking (Adults, Infants)
    *   CPR (Cardiopulmonary Resuscitation)
    *   Splints (Types, How to apply)
    *   Seizures (Causes, Symptoms, Treatment)
    *   Shock (Danger, Response, Burns management in shock)
2.  **Disaster Management:**
    *   Floods (Causes, Safety measures, IRCS contribution)
    *   Earthquake (Causes, Safety measures)
    *   Forest Fires (Causes)
    *   Epidemic (Definition, Epidemic vs Pandemic vs Endemic, Safety measures, IRCS COVID-19 role)
3.  **Drugs Awareness:**
    *   Commonly Abused Substances (Cannabis, Synthetics, Barbiturates, etc.)
    *   Harmful Effects of Consumption
    *   Myths vs Reality
    *   Prevention Strategies
4.  **AIDS Awareness:**
    *   AIDS vs HIV Explained
    *   Symptoms (Primary, Latent, Symptomatic, Progression to AIDS)
    *   Transmission & Treatment
5.  **Tuberculosis (TB) Awareness:**
    *   Prevention Methods (Vaccination, Diagnosis, Environment, Immune System)
    *   Screening (Latent vs Active, Test Types - Skin & Blood)
    *   Treatment & Medication Side Effects
6.  **Basic Sanitation:**
    *   Importance of Handwashing
    *   Steps for Proper Handwashing
    *   When to Wash Hands

## Tech Stack

*   **Language:** Kotlin
*   **Platform:** Android
*   **UI Toolkit:** Android XML Layouts
    *   Views: `ConstraintLayout`, `LinearLayout`, `ScrollView`, `CardView`, `Button`, `TextView`, `ImageView`, `WebView`, `BottomNavigationView`, `NavigationView`
    *   Material Components
*   **Animations:** Lottie for Android (`com.airbnb.android:lottie`)
*   **Architecture:** Primarily Activity-based navigation.
*   **Video Playback:** Embedded YouTube videos via `WebView`.
*   **Build System:** Gradle
*   **IDE:** Android Studio

## Setup and Installation

1.  **Clone the repository:**
    ```bash
    git clone <your-repository-url>
    cd <repository-directory>
    ```
2.  **Open in Android Studio:**
    *   Launch Android Studio.
    *   Select "Open an Existing Project" and navigate to the cloned repository directory.
3.  **Sync Gradle:**
    *   Allow Android Studio to sync the project with Gradle files. It will download necessary dependencies.
4.  **Build the Project:**
    *   Build the project using `Build > Make Project` or by running the app.

*Note: This project does not seem to require external API keys or special configuration beyond a standard Android development setup.*

## Running the Application

1.  **Connect a Device or Start an Emulator:**
    *   Ensure you have an Android device connected via USB with developer options enabled, or an Android Virtual Device (Emulator) set up and running in Android Studio.
2.  **Run from Android Studio:**
    *   Select the target device/emulator from the dropdown menu.
    *   Click the "Run" button (green play icon) or use the menu `Run > Run 'app'`.

## Demo

Watch a demonstration of the app here:
[https://youtu.be/ECFnbRuMyLY](https://youtu.be/ECFnbRuMyLY)




