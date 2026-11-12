# Watch_Faces

Wear OS watch faces (Watch Face Format) for Samsung Galaxy Watch 7.

## hifi-watchface — "Hi-Fi Stereo"
Analog/digital hybrid face: orange hands, LCD time with AM/PM and unread count, 24h time, date + weekday sub-dial, steps + heart-rate sub-dial, and a retro "WATT" battery meter.

- Ready-to-install APK: `apk/HiFiStereo-release.apk`
- Source: `hifi-watchface/` (layout in `app/src/main/res/raw/watchface.xml`, artwork in `res/drawable-nodpi`)
- Built automatically by GitHub Actions on every push to `main` (see `.github/workflows`). Fresh APKs also land on the `watchface-dist` branch.

### Install on the watch
Use an APK installer for Wear OS (e.g. "Wear Installer 2") from the phone, or `adb install` over Wi-Fi debugging. Then long-press the watch face on the watch, swipe to the end, and choose **Hi-Fi Stereo**. Allow the body-sensor / activity permissions so heart rate and steps show.
