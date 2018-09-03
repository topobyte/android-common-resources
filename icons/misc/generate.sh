#!/bin/bash

TARGET="../../app/src/main/assets/common-icons"
TARGET2="../../app/src/main/res"

SvgToBvg -strategy int_delta email.svg "$TARGET/item_email.bvg"
SvgToBvg -strategy int_delta rate.svg "$TARGET/item_rate.bvg"
SvgToBvg -strategy int_delta share.svg "$TARGET/item_share.bvg"
SvgToBvg -strategy int_delta cafe.svg "$TARGET/item_cafe.bvg"
SvgToBvg -strategy int_delta biergarten.svg "$TARGET/item_biergarten.bvg"
SvgToBvg -strategy int_delta cinema.svg "$TARGET/item_cinema.bvg"
SvgToBvg -strategy int_delta restaurant.svg "$TARGET/item_restaurant.bvg"
SvgToBvg -strategy int_delta netzplan.svg "$TARGET/item_netzplan.bvg"
SvgToBvg -strategy int_delta dice.svg "$TARGET/item_dice.bvg"
SvgToBvg -strategy int_delta map.svg "$TARGET/item_map.bvg"
SvgToBvg -strategy int_delta bugs.svg "$TARGET/item_bugs.bvg"

/home/z/git/android-res-utils/pngs_from_svg.py common_globe.svg "$TARGET2" 36 -s _36
/home/z/git/android-res-utils/pngs_from_svg.py common_globe.svg "$TARGET2" 48 -s _48
