SUMMARY = "Flutter Dashboard ffi"
DESCRIPTION = "Flutter Dashboard ffi"
AUTHOR = "Google"
HOMEPAGE = "https://github.com/Lagavulin9/Flutter_Dashboard"
BUGTRACKER = "https://github.com/Lagavulin9/Flutter_Dashboard/issues"
SECTION = "graphics"

LICENSE = "CLOSED"

SRCREV = "fb1adf86123c796c1853360fb70c66e8bdf8459b"
SRC_URI = "git://github.com/Lagavulin9/Flutter_Dashboard.git;protocol=https;branch=dev"

S = "${WORKDIR}/git"

DEPENDS = " \
           common-api-c++ \
           vsomeip \
           common-api-c++-someip \
"

inherit pkgconfig cmake

INSANE_SKIP:${PN} += "file-rdeps ldflags"
INSANE_SKIP:${PN}-dev += "file-rdeps dev-elf"


PACKAGES = "${PN} ${PN}-dev ${PN}-dbg ${PN}-src"
FILES:${PN} += "${libdir}/*.so"
FILES:${PN}-dev += "${includedir} ${libdir}/*.la ${libdir}/*.a"
FILES:${PN}-dbg += "${libdir}/debug"
FILES:${PN}-src += "${S}/*"
