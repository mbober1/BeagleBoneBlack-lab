require recipes-bsp/u-boot/u-boot-common.inc
require recipes-bsp/u-boot/u-boot.inc

LIC_FILES_CHKSUM = "file://Licenses/README;md5=2ca5f2c35c8cc335f0a19756634782f1"
SRCREV = "b5f403936d037e0bc08e78b8af64adf53da13b90"

PROVIDES += "u-boot"

DEPENDS:append = " u-boot-default-script"

# UBOOT_INITIAL_ENV = "u-boot-initial-env"

SRC_URI += "\
	file://u-boot.cfg \
"