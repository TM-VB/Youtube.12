package com.example.data

import com.example.model.Channel
import com.example.model.Comment
import com.example.model.ShortVideo
import com.example.model.Video

object SampleData {
    val categories = listOf(
        "الكل",
        "برمجة",
        "تكنولوجيا",
        "ألعاب",
        "موسيقى",
        "بودكاست",
        "ذكاء اصطناعي",
        "تصميم"
    )

    val channels = listOf(
        Channel(
            id = "c1",
            name = "تقنية المستقبل",
            avatar = "https://images.unsplash.com/photo-1535713875002-d1d0cf377fde?w=150&auto=format&fit=crop&q=80",
            subscribers = "1.8M مشترك",
            isSubscribed = true,
            hasNewContent = true
        ),
        Channel(
            id = "c2",
            name = "كود بالعربي",
            avatar = "https://images.unsplash.com/photo-1570295999919-56ceb5ecca61?w=150&auto=format&fit=crop&q=80",
            subscribers = "850K مشترك",
            isSubscribed = true,
            hasNewContent = true
        ),
        Channel(
            id = "c3",
            name = "ألعاب الأسبوع",
            avatar = "https://images.unsplash.com/photo-1566492031773-4f4e44671857?w=150&auto=format&fit=crop&q=80",
            subscribers = "2.4M مشترك",
            isSubscribed = false,
            hasNewContent = false
        ),
        Channel(
            id = "c4",
            name = "بودكاست فكرة",
            avatar = "https://images.unsplash.com/photo-1580489944761-15a19d654956?w=150&auto=format&fit=crop&q=80",
            subscribers = "510K مشترك",
            isSubscribed = true,
            hasNewContent = true
        ),
        Channel(
            id = "c5",
            name = "نغم وألحان",
            avatar = "https://images.unsplash.com/photo-1494790108377-be9c29b29330?w=150&auto=format&fit=crop&q=80",
            subscribers = "1.2M مشترك",
            isSubscribed = false,
            hasNewContent = false
        ),
        Channel(
            id = "c6",
            name = "استوديو الأندرويد",
            avatar = "https://images.unsplash.com/photo-1507003211169-0a1dd7228f2d?w=150&auto=format&fit=crop&q=80",
            subscribers = "390K مشترك",
            isSubscribed = true,
            hasNewContent = false
        )
    )

    val videos = listOf(
        Video(
            id = "v1",
            title = "بناء تطبيقات الأندرويد الحديثة باستخدام Jetpack Compose و Kotlin من الصفر",
            channelName = "كود بالعربي",
            channelAvatar = "https://images.unsplash.com/photo-1570295999919-56ceb5ecca61?w=150&auto=format&fit=crop&q=80",
            thumbnailUrl = "https://images.unsplash.com/photo-1555066931-4365d14bab8c?w=800&auto=format&fit=crop&q=80",
            duration = "24:18",
            views = "142 ألف مشاهدة",
            uploadTime = "قبل يومين",
            category = "برمجة",
            description = "دليل شامل ومفصل لتعلم كيفية بناء واجهات المستخدم الحديثة بنظام Jetpack Compose مع تطبيق نمط MVVM وحالات الدولة التفاعلية.\n\n#أندرويد #كوتلن #برمجة #JetpackCompose",
            likeCount = 12400,
            isLiked = false,
            isSubscribed = true,
            primaryColorHex = 0xFF1E3A8A,
            secondaryColorHex = 0xFF172554,
            watchProgress = 0.45f
        ),
        Video(
            id = "v2",
            title = "مراجعة شاملة: أفضل هواتف الذكاء الاصطناعي لعام 2026 مقارنة بالواقع",
            channelName = "تقنية المستقبل",
            channelAvatar = "https://images.unsplash.com/photo-1535713875002-d1d0cf377fde?w=150&auto=format&fit=crop&q=80",
            thumbnailUrl = "https://images.unsplash.com/photo-1511707171634-5f897ff02aa9?w=800&auto=format&fit=crop&q=80",
            duration = "18:45",
            views = "450 ألف مشاهدة",
            uploadTime = "قبل 4 أيام",
            category = "تكنولوجيا",
            description = "نستعرض في هذا الفيديو المقارنة الكاملة بين أحدث الهواتف الرائدة وقدرات المعالجات العصبية والكاميرات الحسابية.\n\n#تكنولوجيا #مراجعات #هواتف",
            likeCount = 38200,
            isLiked = true,
            isSubscribed = true,
            primaryColorHex = 0xFF312E81,
            secondaryColorHex = 0xFF1E1B4B,
            watchProgress = 0.8f
        ),
        Video(
            id = "v3",
            title = "تجربة لعب 4K بأعلى إعدادات رسومية مع تتبع الأشعة الكامل",
            channelName = "ألعاب الأسبوع",
            channelAvatar = "https://images.unsplash.com/photo-1566492031773-4f4e44671857?w=150&auto=format&fit=crop&q=80",
            thumbnailUrl = "https://images.unsplash.com/photo-1542751371-adc38448a05e?w=800&auto=format&fit=crop&q=80",
            duration = "32:10",
            views = "890 ألف مشاهدة",
            uploadTime = "قبل أسبوع",
            category = "ألعاب",
            description = "بث مسجل لتجربة أقوى بطاقات الرسوميات مع أحدث ألعاب العالم المفتوح على شاشة OLED بمعدل 120 إطار بالثانية.\n\n#ألعاب #Gaming #4K",
            likeCount = 67000,
            isLiked = false,
            primaryColorHex = 0xFF831843,
            secondaryColorHex = 0xFF500724
        ),
        Video(
            id = "v4",
            title = "بودكاست فكرة #42: كيف سيغير الذكاء الاصطناعي وظائف المستقبل وطرق التعلم؟",
            channelName = "بودكاست فكرة",
            channelAvatar = "https://images.unsplash.com/photo-1580489944761-15a19d654956?w=150&auto=format&fit=crop&q=80",
            thumbnailUrl = "https://images.unsplash.com/photo-1478737270239-2f02b77fc618?w=800&auto=format&fit=crop&q=80",
            duration = "1:15:20",
            views = "215 ألف مشاهدة",
            uploadTime = "قبل 3 أيام",
            category = "بودكاست",
            description = "حوار شيق مع نخبة من الخبراء حول مستقبل الذكاء الاصطناعي وتأثيره المباشر على التعليم والعمل والإنتاجية.\n\n#بودكاست #ذكاء_اصطناعي #فكرة",
            likeCount = 18900,
            isLiked = false,
            primaryColorHex = 0xFF064E3B,
            secondaryColorHex = 0xFF022C22
        ),
        Video(
            id = "v5",
            title = "موسيقى هادئة للاسترخاء والتركيز أثناء العمل والدراسة (Lofi Chill Beats)",
            channelName = "نغم وألحان",
            channelAvatar = "https://images.unsplash.com/photo-1494790108377-be9c29b29330?w=150&auto=format&fit=crop&q=80",
            thumbnailUrl = "https://images.unsplash.com/photo-1518609878373-06d740f60d8b?w=800&auto=format&fit=crop&q=80",
            duration = "45:00",
            views = "1.2M مشاهدة",
            uploadTime = "قبل أسبوعين",
            category = "موسيقى",
            description = "مجموعة مختارة بعناية من مقاطع الموسيقى الهادئة المساعدة على التركيز العميق والهدوء النفسي.\n\n#موسيقى #دراسة #Lofi",
            likeCount = 94000,
            isLiked = true,
            primaryColorHex = 0xFF701A75,
            secondaryColorHex = 0xFF4A044E
        ),
        Video(
            id = "v6",
            title = "أسرار هندسة البرمجيات في كبرى شركات التقنية العالمية",
            channelName = "استوديو الأندرويد",
            channelAvatar = "https://images.unsplash.com/photo-1507003211169-0a1dd7228f2d?w=150&auto=format&fit=crop&q=80",
            thumbnailUrl = "https://images.unsplash.com/photo-1522071820081-009f0129c71c?w=800&auto=format&fit=crop&q=80",
            duration = "15:30",
            views = "78 ألف مشاهدة",
            uploadTime = "قبل 5 ساعات",
            category = "برمجة",
            description = "نصائح عملية من واقع العمل الميداني: كيف تبني أنظمة قوية تتحمل ملايين المستخدمين المتزامنين.\n\n#هندسة_البرمجيات #SystemDesign #Android",
            likeCount = 8200,
            isLiked = false,
            primaryColorHex = 0xFF0F172A,
            secondaryColorHex = 0xFF020617
        )
    )

    val shorts = listOf(
        ShortVideo(
            id = "s1",
            title = "حيلة ذكية في Kotlin تختصر عليك 50 سطر برمجي! 🚀",
            channelName = "كود بالعربي",
            channelAvatar = "https://images.unsplash.com/photo-1570295999919-56ceb5ecca61?w=150&auto=format&fit=crop&q=80",
            likes = "45.2K",
            commentsCount = "312",
            audioTrack = "الصوت الأصلي - كود بالعربي",
            isLiked = true,
            primaryColorHex = 0xFF4338CA,
            secondaryColorHex = 0xFF1E1B4B
        ),
        ShortVideo(
            id = "s2",
            title = "ميزة جديدة وسرية في أحدث تحديث للأندرويد! 🔥",
            channelName = "تقنية المستقبل",
            channelAvatar = "https://images.unsplash.com/photo-1535713875002-d1d0cf377fde?w=150&auto=format&fit=crop&q=80",
            likes = "118K",
            commentsCount = "1.4K",
            audioTrack = "Tech Beat - Future Trends",
            isLiked = false,
            primaryColorHex = 0xFF047857,
            secondaryColorHex = 0xFF064E3B
        ),
        ShortVideo(
            id = "s3",
            title = "أسرع ضربة رأس في تاريخ البطولات العالمية ⚽",
            channelName = "ألعاب الأسبوع",
            channelAvatar = "https://images.unsplash.com/photo-1566492031773-4f4e44671857?w=150&auto=format&fit=crop&q=80",
            likes = "280K",
            commentsCount = "3.8K",
            audioTrack = "Epic Stadium Anthem",
            isLiked = false,
            primaryColorHex = 0xFFB91C1C,
            secondaryColorHex = 0xFF7F1D1D
        )
    )

    val sampleComments = listOf(
        Comment(
            id = "cm1",
            userName = "أحمد خالد",
            userAvatar = "https://images.unsplash.com/photo-1534528741775-53994a69daeb?w=150&auto=format&fit=crop&q=80",
            content = "شرح ممتاز جداً ومبسط، استفدت كثيراً من توضيح إدارة الحالة State وتطبيقها العملي!",
            timeAgo = "منذ 3 ساعات",
            likeCount = 84,
            isLiked = true
        ),
        Comment(
            id = "cm2",
            userName = "سارة محمود",
            userAvatar = "https://images.unsplash.com/photo-1494790108377-be9c29b29330?w=150&auto=format&fit=crop&q=80",
            content = "ياريت تعمل حلقة مخصصة عن Clean Architecture والتعامل مع قواعد البيانات المحلية Room.",
            timeAgo = "منذ 6 ساعات",
            likeCount = 42,
            isLiked = false
        ),
        Comment(
            id = "cm3",
            userName = "محمد العمراني",
            userAvatar = "https://images.unsplash.com/photo-1507003211169-0a1dd7228f2d?w=150&auto=format&fit=crop&q=80",
            content = "aYoutube.12 تطبيق رائع وسلس جداً! التصميم أنيق وسرعة الاستجابة خرافية.",
            timeAgo = "منذ يوم",
            likeCount = 119,
            isLiked = true
        )
    )
}
