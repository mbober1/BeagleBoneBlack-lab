SUMMARY = "AGV Manager recipe"
DESCRIPTION = "Recipe created by Marcin Bober"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS += "qtbase"

SRCREV = "08037d1a0d2969534cca3008b28f60eb599f46af"
SRC_URI = "git://github.com/mbober1/AGV_Manager.git;protocol=https;branch=yocto"

S = "${WORKDIR}/git"

inherit qmake5

do_install() {
	install -d ${D}${bindir}
	install -m 0755 AGV_Manager ${D}${bindir}
}