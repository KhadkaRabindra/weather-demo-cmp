Weather App Demo (Compose Multiplatform)

# A simple weather demo application built using Compose Multiplatform (CMP) that fetches and displays weather information based on the user’s location. This demo app supports both Android and desktop platforms with a shared codebase for UI and business logic.

## Features

- Location-based Weather: Automatically fetch weather data using the device’s location.
- Current Weather: Displays real-time temperature, weather conditions, and icons.
- Forecasts: Shows hourly and daily weather forecasts with detailed weather data.
- Cross-platform UI: Shared UI code for Android and desktop using Jetpack Compose Multiplatform.

## Tech Stack

- Jetpack Compose Multiplatform: For building the UI across Android and desktop.
- Kotlin Multiplatform: Sharing core logic between platforms.
- Kotlin Coroutines: To handle asynchronous API calls and background tasks.
- OpenWeatherMap API: For fetching real-time weather data (requires an API key).
- Ktor Client: Networking library for multiplatform API calls.

## Usage

- On launch, the app fetches the current weather based on your location.
- Use the search bar to get weather details for a specific city.
- View daily and hourly forecasts by scrolling down.
