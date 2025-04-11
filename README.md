# PrinterSDK Library for Android (Kotlin)

The PrinterSDK is an Android library designed specifically for the A75 Android device. It provides seamless support for interacting with the printer hardware embedded in the A75 device. This library is distributed as a JitPack library and is not available as an AAR file.

## Features

- Easy integration for printing functionality on A75 devices.
- Designed and optimized to work exclusively with the A75 Android device.
- Lightweight and efficient for fast printing tasks.

## Requirements

- Device: **A75 & A75 PRO Android Device** (This library will not work on other devices).

## Installation

To integrate the PrinterSDK library into your project, follow these steps:

1. Add the JitPack repository to your project-level `build.gradle` file:

   ```gradle
   allprojects {
       repositories {
           ...
           maven { url 'https://jitpack.io' }
       }
   }
   ```

2. Add the dependency to your app-level `build.gradle` file:

   ```gradle
   dependencies {
       implementation 'com.github.Skilworth:Printer-SDK:v1.0.1'
   }
   ```

## Usage

### Initialization

To use the PrinterSDK library, you need to initialize it in your application or activity:

```kotlin
import com.skilworth.bpprinter.PrinterSDK

PrinterSDK.init(context, new InitCallback() {
    @Override
    public void onSuccess() {
        Log.d("ClientApp", "Printer SDK Initialized successfully!");
    }

    @Override
    public void onFailure() {
        Log.d("ClientApp", "Printer SDK Initialization failed.");
    }
});
```

### Example: Printing Text

You can only print after receiving a successful response from the init API; otherwise, you will get an exception.

```kotlin
BPPrinter.PrnStr_Api("Bijlipay");

int returnValue = BPPrinter.PrnStart_Api();

if (returnValue == 2) {
    Toast.makeText(context, "Paper is not enough", Toast.LENGTH_SHORT).show();
} else if (returnValue == 3) {
    Toast.makeText(context, "Too hot", Toast.LENGTH_SHORT).show();
} else if (returnValue == 0) {
    Toast.makeText(context, "Printed successfully", Toast.LENGTH_SHORT).show();
}
```

### Example: Printing Images

```kotlin
int width = bitmap.getWidth();
BPPrinter.PrnLeftIndSet_Api((short) ((385 - width) / 2));
BPPrinter.PrnLogo_Api(bitmap);

int returnValue = BPPrinter.PrnStart_Api();

if (returnValue == 2) {
    Toast.makeText(context, "Paper is not enough", Toast.LENGTH_SHORT).show();
} else if (returnValue == 3) {
    Toast.makeText(context, "Too hot", Toast.LENGTH_SHORT).show();
} else if (returnValue == 0) {
    Toast.makeText(context, "Printed successfully", Toast.LENGTH_SHORT).show();
}

```

## Limitations

- **Device-Specific**: This library is exclusively designed for the A75 Android device and will not function on any other devices.
