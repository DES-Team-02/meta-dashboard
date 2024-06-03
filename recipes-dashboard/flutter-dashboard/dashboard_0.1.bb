SUMMARY = "Flutter Dashboard Application"
DESCRIPTION = "Flutter Dashboard Application"
AUTHOR = "Google"
HOMEPAGE = "https://github.com/Lagavulin9/Flutter_Dashboard"
BUGTRACKER = "https://github.com/Lagavulin9/Flutter_Dashboard/issues"
SECTION = "graphics"

LICENSE = "CLOSED"

SRCREV = "2467cf2fed2f03415324e8f1d05674899357be2a"
SRC_URI = "git://github.com/Lagavulin9/Flutter_Dashboard.git;protocol=https;branch=main"

S = "${WORKDIR}/git"

DEPENDS += " flutter-pi flutter-engine "

PUBSPEC_APPNAME = "flutter_dashboard_application"
FLUTTER_APPLICATION_PATH = "packages/video_player/video_player/example"
FLUTTER_APPLICATION_INSTALL_PREFIX = "/flutter"
FLUTTER_PREBUILD_CMD = "flutter pub get"

inherit flutter-app

INSANE_SKIP:${PN} += "file-rdeps ldflags"
INSANE_SKIP:${PN}-dev += "file-rdeps dev-elf"
