DESCRIPTION = "hello world example"
PN = "hello"
PV = "1"

python do_build() {
    bb.warn("Hello! bitbake world!");
}
addtask build

python do_preprebuild() {
    bb.warn("Add preprebuild")
}
addtask preprebuild before do_build

python do_prebuild() {
    bb.warn("Add prebuild")
}
addtask prebuild after do_preprebuild before do_build

