package com.ozimos.android_pemuala_dicoding

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Product(
    val id: Int = 0,
    val image: String = "",
    val name: String = "",
    val composition: List<String> = emptyList(),
    val time: String = "",
    val calory: String = "",
    val desc: String = ""
) : Parcelable

val listProduct = listOf(
    Product(
        id = 1,
        image = "https://resepkoki.co/wp-content/uploads/2016/03/01-resep-omelet-keju.jpg",
        name = "Omelet Keju",
        composition = listOf("Telur", "Keju", "Parutan wortel"),
        time = "5-7 Menit",
        calory = "357 kkal",
        desc = "Telur yang kaya akan protein yang baik untuk tubuh serta ditambah dengan rasa keju yang renyah maka akan sangat cocok untuk menjadi menu sarapan anda dan keluarga. Membuatnya sangat gampang anda cukup mengocok semua bahan menjadi satu dengan Better Beater Hand Mixer, lalu goreng di atas wajan yang panas.  Omelet keju siap di hidangkan"
    ),
    Product(
        id = 2,
        image = "https://resepkoki.co/wp-content/uploads/2016/03/02-roti-bakar-selai-buah-naga.jpg",
        name = "Roti Bakar Selai Buah Naga",
        composition = listOf("Roti Tawar", "Selai buah naga"),
        time = "10-14 menit",
        calory = "207 kkal",
        desc = "Jika menurut anda sarapan dengan nasi terlalu mengenyangkan bagaimana jika mencoba menu roti bakar dengan selai buah naga yang tidak biasa berikut ini. Anda pun bisa juga mengganti selainya sesuai dengan selera anda dan keluarga. Roti bisa menjadi alternatif pengganti karbohidrat di pagi hari Anda.  Olesi kedua bagian roti lalu panggang roti dan tunggu hingga matang. Roti panggang selai buah naga siap anda nikamti."
    ),
    Product(
        id = 3,
        image = "https://resepkoki.co/wp-content/uploads/2016/03/03-potato-salad.jpg",
        name = "Omelet Keju",
        composition = listOf("Kentang kukus", "Telur rebus", "Timun", "Minyak zaitun", "Mayones"),
        time = "7-10 menit",
        calory = "277 kkal",
        desc = "Menu sarapan yang satu ini adalah sarapan non nasi, tapi jangan khawatir kerena kebutuhan karbohidrat anda pasti akan terpenuhi dan pastinya anda bisa melakukan segala aktifitas dengan mengkonsumsi Potato Salad yang satu ini. Cara membuatnya anda cukup memotong kecil-kecil bahan diatas lalu tambahkan dengan minyak zaitun dan mayones tambahkan rempah lain agar semakin lezat."
    ),
    Product(
        id = 4,
        name = "Orak Arik Bunga Kol & Bakso",
        image = "https://resepkoki.co/wp-content/uploads/2016/03/05-orak-arik-bunga-kol-bakso.jpg",
        composition = listOf("Telur", "Telur rebus", "Bunga kol", "Bakso"),
        time = "7-12 menit",
        calory = "307 kkal",
        desc = "Ada yang berbeda dari telur orak-arik yang satu ini karena ada bunga kol yang kaya nutrisi dan irisan bakso yang akan di sukai si kecil, sajikan saat sarapan resep yang satu ini di jamin keluarga anda dan di buat ketagihan. Tumis semua bumbu dan masukkan sayuran masak hingga layu terakhir masukkan telur kocok masak hingga matang. Sarapan pagi penuh bergizi siap anda nikmati."
    ),
    Product(
        id = 5,
        name = "Banana Smoothies",
        image = "https://resepkoki.co/wp-content/uploads/2016/03/banana-smoothie.jpg",
        composition = listOf("Pisang", "Yogurt", "Bunga kol", "Air Es"),
        time = "5 menit",
        calory = "250 kkal",
        desc = "Buah pisang yang kaya nutrisi sangat cocok untuk menjadi pilihan menu sarapan bergizi anda dan keluarga. Untuk membuat Banana Smoothies anda cukup memotong kecil buah pisang lalu masukkan ke dalam blender bersamaan dengan yogurt dan air es. Blend hingga hancur semua maka banana smoothies siap untuk anda sajikan."
    ),
    Product(
        id = 6,
        name = "Strawberry Soy Smoothies",
        image = "https://resepkoki.co/wp-content/uploads/2016/03/07-starwberry-soy-smoothies.jpg",
        composition = listOf("Susu kedelai", "Strawberry beku", "Madu", "Oatmeal"),
        time = "5 menit",
        calory = "240 kkal",
        desc = "Buah starwberry segar, ditambah susu kedelai dan madu mempunyai rasa asam segar dan juga enak. Cukup mengenyang untuk menu sarapan. Strawberry smoothies yang satu ini cocok untuk sarapan pagi anda dan keluarga. Yuk coba! Cara membuatnya anda cukup mencampurkan semua bahan ke dalam blender lalu blan hingga tercampur rata. Strawberry smoothies siap dinikmati."
    ),
    Product(
        id = 7,
        name = "Egg Sandwich",
        image = "https://resepkoki.co/wp-content/uploads/2016/03/09-sandwich-roti-gandum.jpg",
        composition = listOf("Roti gandum", "Telur", "Keju", "Acar timun botolan", "Tomat"),
        time = "7-10 menit",
        calory = "300 kkal",
        desc = "Resep sarapan yang satu cocok untuk anda yang sedang diet karena menggunakan roti gandum sebagai bahan utamanya ditambah dengan telur yang kaya protein yang menyehatkan maka akan menambah kelezatan sandwich yang satu ini. Cara membuatnya hanya dengan menggoreng telur lalu letakkan di atas roti semua bahan terakhir letakkan roti gandum untuk menutupnya. Selamat mencoba."
    ),

    Product(
        id = 8,
        name = "Sereal Buah",
        image = "https://resepkoki.co/wp-content/uploads/2016/03/10-sereal-buah.jpg",
        composition = listOf("Sereal", "Buah-buahan favorite Anda", "Madu", "Susu"),
        time = "7 – 12 menit",
        calory = "330 kkal",
        desc = "Sudah bosan dengan sarapan nasi, bubur atau roti? Anda bisa mencoba menu sarapan dengan bahan dasar sereal. Sereal tambah irisan buah kesukaan anda maka akan semakin menyehatkan bukan untuk sarapan. Cukup praktis dan tidak memakan banyak waktu bukan. Selamat mencoba."
    ),

    Product(
        id = 9,
        name = "Telur Orak-Arik Mayo",
        image = "https://resepkoki.co/wp-content/uploads/2016/03/telur-orak-arik-mayo.jpg",
        composition = listOf("Telur", "Lada bubuk", "Mayones", "Mentega"),
        time = "7 menit",
        calory = "320 kkal",
        desc = "Siapkan semua bahan. Kemudian, campurkan semuanya menjadi satu dan kocok rata menggunakan Better Beater Hand Mixer, kecuali margarin. Panaskan wajan anti lengket dan tambahkan margarin, masukkan adonan telur tadi dan orak-arik hingga matang. Setelah matang anda tambahkan saus mayones diatasnya. Resep praktis yang satu ini siap anda hidangkan."
    ),
    Product(
        id = 10,
        name = "Bubur Ayam Oatmeal",
        image = "https://resepkoki.co/wp-content/uploads/2016/03/bubur-ayam-oatmeal.jpg",
        composition = listOf(
            "Oatmeal instan",
            "Susu",
            "Potongan daging ayam",
            "Wortel",
            "Jagung manis",
            "Buncis"
        ),
        time = "10 menit",
        calory = "345 kkal",
        desc = "Cara membuat oatmeal bubur ayam sangat mudah anda hanya perlu menumis bawang putih hingga harum, lalu masukan bawang bombay, aduk sebentar hingga layu. Setelah semuanya layu masukan sayuran yang sudah disiapkan dan potongan ayam, masak semuanya hingga berwarna kecokelatan setelah itu masukan susu segar, rebus sebentar, lalu masukan oatmeal, aduk hingga rata. Sajikan hangat untuk sarapan pagi anda."
    ),

    Product(
        id = 11,
        name = "Egg Muffin",
        image = "https://resepkoki.co/wp-content/uploads/2016/03/egg-muffin.jpg",
        composition = listOf("Muffin inggris", "telur", "seledri"),
        time = "7-10 menit",
        calory = "279 kkal",
        desc = "Muffin inggris sangat pas di sajikan saat sarapan karena teksturnya mirip sekali dengan roti, sangat pas untuk konsumsi karbohidrat di pagi hari anda. Memasak egg muffin sangat mudah anda cukup menggoreng telur cepok setelah matang letakkan di atas muffin tambahkan seledri segar. Egg muffin siap di santap, sajikan dengan saus tomat tau sambal sebagai pendampingnya."
    ),

    Product(
        id = 12,
        name = "Roti Selesai Favorit Anda",
        image = "https://resepkoki.co/wp-content/uploads/2016/03/roti-selai-favorit.jpg",
        composition = listOf("Roti tawar", "Selai favorit anda"),
        time = "8 menit",
        calory = "259 kkal",
        desc = "Siapkan roti tawar dan selai favorit anda dan keluarga, bisa selai strawberry, cokelat atau kacang. Olesakan selai diatas roti dan tutup kembali dengan roti tawar. Sajikan dengan teh atau kopi hangat sebagai pendamping roti selai favorit anda. Simpel dan mudah bukan membuatnya dan tentunya tidak memakan waktu banyak. Selamat menikmati."
    ),
)