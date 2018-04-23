# meta-example-dev
HOST MACHINE: Ubuntu 14.04 

~$ sudo apt-get install gawk wget git-core diffstat unzip texinfo gcc-multilib build-essential chrpath socat libsdl1.2-dev xterm

~$ mkdir ~/working 

~$ cd ~/working 

~$ git clone https://github.com/duclongpl/meta-example-dev.git 

~$ cd ~/working/meta-dev 

~$ git submodule init 

~$ git submodule update 

~$ cd ~/working

~$ source meta-example-dev/poky/oe-init-build-env build 

~$ cp ~/working/meta-example-dev/meta-image/conf/templates/* ~/working/build/conf/

~$ echo "MACHINE = 'microzed-zynq7'" >> conf/local.conf

~$ bitbake asterisk

 The current libxml2 still not link to sysroot to build asterisk. So we need copy manualy to its sysroot folder

~$ bitbake libxml2

~$ rsync -avz ~/working/build/tmp/work/cortexa9hf-neon-poky-linux-gnueabi/libxml2/2.9.4-r0/image/usr/  ~/working/build/tmp/work/cortexa9hf-neon-poky-linux-gnueabi/asterisk/13.5.0-r0/recipe-sysroot/usr

~$ bitbake zynq-ip-pbx-image

Please check ~/working/build3/tmp/deploy/images/microzed-zynq7 folder. Your rootfs will be *.tar.gz or you can use ramdisk *.cpio.gz.u-boot (can rename it to *.image.gz)
