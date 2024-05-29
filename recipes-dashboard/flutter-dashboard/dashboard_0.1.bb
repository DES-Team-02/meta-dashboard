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

DEPENDS += " flutter-pi "

do_install() {
    install -d ${D}${datadir}/flutter/flutter-app/Dashboard/
    cp -r ${S}/bundle/* ${D}${datadir}/flutter/flutter-app/Dashboard/
    install -d ${D}${libdir}/
    cp ${S}/bundle/lib/libDashboard-someip.so ${D}${libdir}/
}

FILES:${PN} += "\
    ${datadir}/flutter/flutter-app/Dashboard/* \
    ${libdir}/libDashboard-someip.so \
"
FILES:${PN}-dev += "\
    ${libdir}/libDashboard-someip.so \
"

INSANE_SKIP:${PN} += "file-rdeps ldflags"
INSANE_SKIP:${PN}-dev += "file-rdeps dev-elf"
