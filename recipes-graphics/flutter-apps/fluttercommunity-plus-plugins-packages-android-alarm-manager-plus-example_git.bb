#
# Copyright (c) 2020-2024 Joel Winarske. All rights reserved.
#

SUMMARY = "android_alarm_manager_example"
DESCRIPTION = "Demonstrates how to use the android_alarm_manager_plus plugin."
AUTHOR = "Flutter Community"
HOMEPAGE = "None"
BUGTRACKER = "None"
SECTION = "graphics"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=aaa4daf7a83c6896af2c007b59db56e4"

SRCREV = "83f86a357da31c7e9c47ee668fe3142bafea9c91"
SRC_URI = "git://github.com/fluttercommunity/plus_plugins.git;lfs=1;branch=main;protocol=https;destsuffix=git"

S = "${WORKDIR}/git"

PUB_CACHE_EXTRA_ARCHIVE_PATH = "${WORKDIR}/pub_cache/bin"
PUB_CACHE_EXTRA_ARCHIVE_CMD = "flutter pub global activate melos; \
    melos bootstrap"

PUBSPEC_APPNAME = "android_alarm_manager_example"
FLUTTER_APPLICATION_INSTALL_SUFFIX = "fluttercommunity-plus-plugins-packages-android-alarm-manager-plus-example"
FLUTTER_APPLICATION_PATH = "packages/android_alarm_manager_plus/example"

inherit flutter-app
