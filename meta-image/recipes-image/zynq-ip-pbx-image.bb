DESCRIPTION = "Create Image of Zynq${PV}"
require zynq-minimal-image.bb

ZYNQ_PKGS_INSTALL += " \
	asterisk \
"

DEPENDS = ""
RDEPENDS = ""

inherit core-image
