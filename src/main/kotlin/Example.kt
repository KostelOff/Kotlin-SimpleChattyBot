//class Example {
//
//    package ru.netology.nmedia
//
//    import androidx.appcompat.app.AppCompatActivity
//    import android.os.Bundle
//    import androidx.annotation .DrawableRes
//    import ru.netology.nmedia.databinding.ActivityMainBinding
//    import ru.netology.nmedia.dto.Post
//
//
//    class MainActivity : AppCompatActivity() {
//
//        override fun onCreate(savedInstanceState: Bundle?) {
//            super.onCreate(savedInstanceState)
//
//            val binding = ActivityMainBinding.inflate(layoutInflater)
//            setContentView(binding.root)
//
//            var post = Post(
//                id = 1,
//                author = "Pavel",
//                content = "Sotnikov",
//                published = "07.03.2022",
//                likes = 999
//            )
//
//            binding.render(post)
//
//            binding.postFavoriteButton.setOnClickListener {
//                post.likedByMe = !post.likedByMe
//                post = if (post.likedByMe) {
//                    post.copy(likes = post.likes + 1)
//                } else {
//                    post.copy(likes = post.likes - 1)
//                }
//
//                binding.render(post)
//                binding.postFavoriteButton.setImageResource(getLikeIconResId(post.likedByMe))
//            }
//            binding.postShareButton.setOnClickListener {
//                post = post.copy(shares = post.shares + 100) //Для проверки в сотнях
//                binding.render(post)
//            }
//            setContentView(binding.root)
//        }
//
//        private fun ActivityMainBinding.render(post: Post) {
//            postAuthorName.text = post.author
//            postText.text = post.content
//            postDate.text = post.published
//            postFavoriteText.text = countNumbers(post.likes)
//            postShareText.text = countNumbers(post.shares)
//            postFavoriteButton.setImageResource(getLikeIconResId(post.likedByMe))
//        }
//
//        @DrawableRes
//        private fun getLikeIconResId(liked: Boolean) =
//            if (liked) R.drawable.ic_likes_red_24 else R.drawable.ic_like_24dp
//
//        private fun countNumbers(likes: Int): String {
//            return when (likes) {
//                in 1..999 -> "$likes"
//                in 1000..1099 -> "${likes / 1000}K"
//                in 1100..9999 -> "${likes / 1000}.${likes / 100 % 10}K"
//                in 10000..999999 -> "${likes / 1000}K"
//                in 1_000_000..1_099_999 -> "${likes / 1000000}M"
//                in 1_000_000..9_999_999 -> "${likes / 1000_000}.${likes / 1000_000 % 10}M"
//                in 10_000_000..99_999_999 -> "${likes / 1000000}M"
//                else -> ""
//            }
//        }
//    }
//
//}