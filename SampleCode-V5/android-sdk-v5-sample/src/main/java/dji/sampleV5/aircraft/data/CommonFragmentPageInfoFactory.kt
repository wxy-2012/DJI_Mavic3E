package dji.sampleV5.aircraft.data

import dji.sampleV5.aircraft.R

/**
 * Class Description
 *
 * @author Hoker
 * @date 2021/5/7
 *
 * Copyright (c) 2021, DJI All Rights Reserved.
 */
class CommonFragmentPageInfoFactory : IFragmentPageInfoFactory {

    override fun createPageInfo(): FragmentPageItemList {
        return FragmentPageItemList(R.navigation.nav_common).apply {
            items.add(FragmentPageItem(R.id.key_value_page, R.string.item_key_value_title, R.string.item_key_value_description))
            items.add(FragmentPageItem(R.id.key_multi_camera_stream_page, R.string.item_multi_camera_stream_title, R.string.item_multi_camera_stream_description))
            items.add(FragmentPageItem(R.id.key_data_protection_page, R.string.item_data_protection_title, R.string.item_data_protection_description))
            items.add(FragmentPageItem(R.id.key_login_account_page, R.string.item_login_account_title, R.string.item_login_account_description))
        }
    }
}