package com.example.model

data class Video(
    val id: String,
    val title: String,
    val channelName: String,
    val channelAvatar: String,
    val thumbnailUrl: String,
    val duration: String,
    val views: String,
    val uploadTime: String,
    val category: String,
    val description: String,
    val likeCount: Int,
    val isLiked: Boolean = false,
    val isDisliked: Boolean = false,
    val isSubscribed: Boolean = false,
    val isWatchLater: Boolean = false,
    val isDownloaded: Boolean = false,
    val primaryColorHex: Long = 0xFF1E293B,
    val secondaryColorHex: Long = 0xFF0F172A,
    val watchProgress: Float = 0.0f
)

data class ShortVideo(
    val id: String,
    val title: String,
    val channelName: String,
    val channelAvatar: String,
    val likes: String,
    val commentsCount: String,
    val audioTrack: String,
    val isLiked: Boolean = false,
    val isSubscribed: Boolean = false,
    val primaryColorHex: Long = 0xFF312E81,
    val secondaryColorHex: Long = 0xFF1E1B4B
)

data class Channel(
    val id: String,
    val name: String,
    val avatar: String,
    val subscribers: String,
    val isSubscribed: Boolean = true,
    val hasNewContent: Boolean = true
)

data class Comment(
    val id: String,
    val userName: String,
    val userAvatar: String,
    val content: String,
    val timeAgo: String,
    val likeCount: Int,
    val isLiked: Boolean = false
)

enum class NavigationTab(val label: String) {
    HOME("الرئيسية"),
    SHORTS("شورتس"),
    SUBSCRIPTIONS("الاشتراكات"),
    LIBRARY("المكتبة")
}
