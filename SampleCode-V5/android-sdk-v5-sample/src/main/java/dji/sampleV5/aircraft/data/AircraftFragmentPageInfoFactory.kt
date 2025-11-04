package dji.sampleV5.aircraft.data

import dji.sampleV5.aircraft.R


/**
 * Class Description
 *
 * @author Hoker
 * @date 2021/5/7
 *F
 * Copyright (c) 2021, DJI All Rights Reserved.
 */
class
AircraftFragmentPageInfoFactory : IFragmentPageInfoFactory {

    override fun createPageInfo(): FragmentPageItemList {
        return FragmentPageItemList(R.navigation.nav_aircraft).apply {
            items.add(FragmentPageItem(R.id.virtual_stick_page, R.string.item_virtual_stick_title, R.string.item_virtual_description))
            items.add(FragmentPageItem(R.id.flight_record_page, R.string.item_flight_record_title, R.string.item_flight_record_description))
            items.add(FragmentPageItem(R.id.waypoint_v3_page, R.string.item_waypoint_title, R.string.item_waypoint_description))
            items.add(FragmentPageItem(R.id.waypoint_v3_page, R.string.item_waypoint_title, R.string.item_waypoint_description))
            items.add(FragmentPageItem(R.id.uas_page, R.string.item_uas_title, R.string.item_uas_description))
            items.add(FragmentPageItem(R.id.fly_safe_page, R.string.item_fly_safe_title, R.string.item_fly_safe_description))
        }
    }
}