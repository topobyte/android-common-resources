#!/bin/bash

DIR=$(dirname $0)
TARGET="$DIR/../../app/src/main/assets/common-icons"
TARGET2="$DIR/../../app/src/main/res"

SvgToBvg -strategy int_delta "$DIR/email.svg" "$TARGET/item_email.bvg"
SvgToBvg -strategy int_delta "$DIR/rate.svg" "$TARGET/item_rate.bvg"
SvgToBvg -strategy int_delta "$DIR/share.svg" "$TARGET/item_share.bvg"
SvgToBvg -strategy int_delta "$DIR/cafe.svg" "$TARGET/item_cafe.bvg"
SvgToBvg -strategy int_delta "$DIR/biergarten.svg" "$TARGET/item_biergarten.bvg"
SvgToBvg -strategy int_delta "$DIR/cinema.svg" "$TARGET/item_cinema.bvg"
SvgToBvg -strategy int_delta "$DIR/restaurant.svg" "$TARGET/item_restaurant.bvg"
SvgToBvg -strategy int_delta "$DIR/netzplan.svg" "$TARGET/item_netzplan.bvg"
SvgToBvg -strategy int_delta "$DIR/dice.svg" "$TARGET/item_dice.bvg"
SvgToBvg -strategy int_delta "$DIR/map.svg" "$TARGET/item_map.bvg"
SvgToBvg -strategy int_delta "$DIR/bugs.svg" "$TARGET/item_bugs.bvg"

/home/z/git/android-res-utils/pngs_from_svg.py "$DIR/common_globe.svg" "$TARGET2" 36 -s _36
/home/z/git/android-res-utils/pngs_from_svg.py "$DIR/common_globe.svg" "$TARGET2" 48 -s _48
