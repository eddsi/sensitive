# Sensitive Word Detection

## About

This repository hosts the **Sensitive Word Detection** project, a robust and efficient interface designed for the
detection and filtering of sensitive words in text data. The primary goal of this project is to provide developers with
a tool that can be easily integrated into various applications requiring content moderation, such as social media
platforms. The interface leverages the `sensitive-word` package to perform real-time checks and filtering of sensitive
content.

## Features

- **Real-Time Detection**: Quickly identifies sensitive words in texts.
- **Easy Integration**: Designed to be seamlessly integrated into existing applications.
- **Customizable Filters**: Allows for customization of the sensitive words list based on application-specific needs.

## Getting Started

### Prerequisites

- Java 11 or later
- Maven 3.6 or later
- Spring Boot 2.5 or later

### Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/eddsi/sensitive.git
   cd sensitive
   ```
2. **Build the Project**

```bash
mvn clean install
```

3. **Run the Application**

```
mvn spring-boot:run
```

## Usage

To check if a text contains sensitive words, make a GET request to the /api/sensitive/check endpoint with the text you
want to analyze:

```
curl -X POST 'http://localhost:8080/api/sensitive/check'
```

## API Reference

### GET `/api/sensitive/check`

- **Parameters**:
    - `text` (string): Text to be checked for sensitive words.
- **Returns**: Boolean indicating whether the text contains sensitive words.

## Contributing

Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any
contributions you make are greatly appreciated.

- **Fork the Project**
- **Create your Feature Branch**
- **Commit your Changes**
- **Push to the Branch**
- **Open a Pull Request**