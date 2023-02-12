DESCRIPTION = "hello world example"
PN = "hello"
PV = "1"

python do_build() {
        bb.warn("Hello! bitbake world!")
}

