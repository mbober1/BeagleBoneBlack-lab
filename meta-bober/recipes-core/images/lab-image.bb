DESCRIPTION = "Test image"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit core-image

INIT_MANAGER = "systemd"
PACKAGE_CLASSES = "package_ipk"

IMAGE_INSTALL = " \
	packagegroup-core-boot \
	swupdate \
	swupdate-www \
	swupdate-client \
	swupdate-tools \
	nano \
	htop \
"


EXTRA_IMAGE_FEATURES = " \
    debug-tweaks \
    package-management \
"