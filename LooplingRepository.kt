package com.loopling.app.data.repository

import com.loopling.app.data.model.MessageThread
import com.loopling.app.data.model.NotificationItem
import com.loopling.app.data.model.Post
import com.loopling.app.data.model.Reel
import com.loopling.app.data.model.Story
import com.loopling.app.data.model.UploadDraft
import com.loopling.app.data.model.User

interface LooplingRepository {
    fun getCurrentUser(): User
    fun getStories(): List<Story>
    fun getFeedPosts(): List<Post>
    fun getExplorePosts(): List<Post>
    fun getReels(): List<Reel>
    fun getNotifications(): List<NotificationItem>
    fun getMessages(): List<MessageThread>
    fun toggleLikePost(postId: String, liked: Boolean): List<Post>
    fun toggleSavePost(postId: String, saved: Boolean): List<Post>
    fun toggleLikeReel(reelId: String, liked: Boolean): List<Reel>
    fun updateProfile(username: String, bio: String): User
    fun createPost(draft: UploadDraft): List<Post>
}
