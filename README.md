# meta-example-dev
HOST: Ubuntu 14.04

~$ sudo apt-get install gawk wget git-core diffstat unzip texinfo gcc-multilib build-essential chrpath socat libsdl1.2-dev xterm

~$ mkdir ~/working 

~$ cd ~/working 

~$ git clone https://github.com/duclongpl/meta-example-dev.git 

~$ cd ~/working/meta-dev 

~$ git submodule init 

~$ git submodule update 

~$ cd ~/working

~$ source meta-dev/poky/oe-init-build-env build 

~$ cp ~/working/meta-example-dev/meta-image/conf/templates/* ~/working/build/conf/

~$ echo "MACHINE = 'zedboard-zynq7'" >> conf/local.conf

~$ bitbake zynq-minimal-image
