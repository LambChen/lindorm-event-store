#!/bin/sh

rm -rvf $(find . -name ".idea")
rm -rvf $(find . -name "target")
rm -rvf $(find . -name "*.iml")
rm -rvf $(find . -name ".settings")
rm -rvf $(find . -name ".project")
rm -rvf $(find . -name ".classpath")
rm -rvf $(find . -name ".factorypath")
