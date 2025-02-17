#
# Copyright (c) 2020-2024 Joel Winarske. All rights reserved.
#

SUMMARY = "form_app"
DESCRIPTION = "A sample demonstrating different types of forms and best practices"
AUTHOR = "Google"
HOMEPAGE = "None"
BUGTRACKER = "None"
SECTION = "graphics"

LICENSE = "BSD3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b7eeb61b41ae366e94383bca5e113fce"

SRCREV = "a5ae1fe4487e75e9276eb2656c1f3a81e9b4962e"
SRC_URI = "git://github.com/flutter/samples.git;lfs=1;branch=main;protocol=https;destsuffix=git"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "form_app"
FLUTTER_APPLICATION_INSTALL_SUFFIX = "flutter-samples-form-app"
FLUTTER_APPLICATION_PATH = "form_app"

inherit flutter-app
