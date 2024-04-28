part list mmc 0 -bootable bootpart
load mmc 0:${bootpart} $loadaddr /boot/zImage
load mmc 0:${bootpart} $fdtaddr /boot/am335x-boneblack.dtb
setenv bootargs rootwait console=ttyS0,115200 root=/dev/mmcblk0p${bootpart}
bootz $loadaddr - $fdt_addr_r
