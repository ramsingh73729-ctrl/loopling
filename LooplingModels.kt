package com.loopling.app.data.model

enum class AuthMode {
    LOGIN,
    SIGN_UP
}

enum class MediaType {
    IMAGE,
    VIDEO
}

enum class ProfileTab {
    POSTS,
    REELS,
    TAGGED
}

data class User(
    val id: String,
    val username: String,
    val fullName: String,
    val bio: String,
    val profileImageUrl: String,
    val followers: Int,
    val following: Int
)

data class Story(
    val id: String,
    val user: User,
    val isViewed: Boolean,
    val thumbnailUrl: String
)

data class Post(
    val id: String,
    val user: User,
    val imageUrl: String,
    val caption: String,
    val hashtags: List<String>,
    val location: String,
    val likes: Int,
    val comments: Int,
    val isLiked: Boolean,
    val isSaved: Boolean,
    val createdAt: String
)

data class Reel(
    val id: String,
    val user: User,
    val thumbnailUrl: String,
    val caption: String,
    val audioTitle: String,
    val likes: Int,
    val comments: Int,
    val shares: Int,
    val isLiked: Boolean,
    val isSaved: Boolean
)

data class NotificationItem(
    val id: String,
    val actor: User,
    val text: String,
    val timeAgo: String
)

data class MessageThread(
    val id: String,
    val user: User,
    val lastMessage: String,
    val unreadCount: Int
)

data class UploadDraft(
    val caption: String = "",
    val hashtags: String = "",
    val location: String = "",
    val selectedMediaType: MediaType = MediaType.IMAGE
)
