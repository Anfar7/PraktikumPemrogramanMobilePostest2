package com.pemob.postestprak2
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.pemob.postestprak2.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.rv_stories)

        val stories = mutableListOf<Story>()
        stories.add(
            Story(
                "Keindahan Tersembunyi Gunung Bromo",
                "Gunung Bromo atau dalam bahasa Tengger dieja \"Brama\", juga disebut Kaldera Tengger, adalah sebuah gunung berapi aktif di Jawa Timur, Indonesia. Gunung ini memiliki ketinggian 2.614 meter di atas permukaan laut dan berada dalam empat wilayah kabupaten, yakni Kabupaten Probolinggo, Kabupaten Pasuruan, Kabupaten Lumajang, dan Kabupaten Malang. Gunung Bromo terkenal sebagai objek wisata utama di Jawa Timur. Sebagai sebuah objek wisata, Bromo menjadi menarik karena statusnya sebagai gunung berapi yang masih aktif. Gunung Bromo termasuk dalam kawasan Taman Nasional Bromo Tengger Semeru.\n" +
                        "\n" +
                        "Nama Bromo berasal dari nama dewa utama dalam agama Hindu, Brahma.\n" +
                        "\n" +
                        "Bentuk tubuh Gunung Bromo bertautan antara lembah dan ngarai dengan kaldera atau lautan pasir seluas sekitar 10 kilometer persegi, Gunung ini mempunyai sebuah kawah dengan garis tengah ± 800 meter (utara-selatan) dan ± 600 meter (timur-barat). Sedangkan daerah bahayanya berupa lingkaran dengan jari-jari 4 km dari pusat kawah Bromo.",
                "Fotografi Alam",
                R.drawable.gambar_bromo
            )
        )
        stories.add(
            Story(
                "Resep Nasi Goreng Spesial Keluarga",
                "Nasi goreng adalah hidangan favorit sepanjang masa. Dengan resep ini, Anda bisa membuat nasi goreng spesial dengan bumbu yang meresap. " +
                        "Dirangkum dari buku 'Nasi Goreng dan Mi Goreng Istimewa' karya Budi Sutomo, '100 Resep Nasi Goreng' oleh Dapur Alma, '180 Resep Masakan Nusantara Racikan Nyonya Rumah' yang ditulis oleh Julie Sutarjana, 'Nasi Goreng dan Makanan Sepinggan Lengkap' oleh Murdijati-Gardjito, dkk., 'Menu Istimewa Sarapan Keluarga: Resep Sepanjang Masa' karya Anggaraeini Prabaningrum, hingga 'Menu 30 Hari dan Resep untuk Diabetisi' oleh Yasa Boga, berikut rangkuman resep nasi goreng jawa rumahan yang menarik untuk dicoba.\n" +
                        "\n" +
                        "Baca artikel detikjogja, \"Resep Nasi Goreng Jawa Rumahan yang Sederhana dan Enak\" selengkapnya https://www.detik.com/jogja/kuliner/d-7623243/resep-nasi-goreng-jawa-rumahan-yang-sederhana-dan-enak.\n" +
                        "\n" +
                        "Download Apps Detikcom Sekarang https://apps.detik.com/detik/",
                "Kuliner",
                R.drawable.gambar_nasigoreng
            )
        )
        stories.add(
            Story(
                "Smartphone Terbaru Rilis dengan Kamera 200MP",
                "Persaingan di pasar smartphone semakin ketat dengan diluncurkannya model terbaru yang mengusung sensasi kamera 200MP. Perbedaan kamera Galaxy S25 FE dan seri S25 lainnya\n" +
                        "Galaxy S25 FE: Kamera utamanya adalah 50MP. Varian ini tidak memiliki kamera 200MP. \n" +
                        "Galaxy S25 (non-FE): Dilengkapi kamera utama 50MP, ultrawide 12MP, dan telefoto 10MP dengan 3x optical zoom. \n" +
                        "Galaxy S25 Edge: Memiliki kamera 200MP dengan detail dan kejernihan luar biasa, serta desain ultra-tipis (hanya 5,8 mm). \n" +
                        "Fitur Galaxy S25 FE\n" +
                        "Kamera: Sistem kamera 50MP (lensa utama), 12MP (ultrawide), dan 8MP (telephoto). Kamera depan ditingkatkan menjadi 12MP. \n" +
                        "Performa: Ditenagai chipset Exynos 2400 dengan dukungan teknologi AI. \n" +
                        "Desain: Ramping dan minimalis, dengan bingkai Armor Aluminum dan ketahanan IP68. \n" +
                        "Baterai: 4.900 mAh dengan pengisian daya cepat 45W. \n" +
                        "Lainnya: Fitur AI seperti Generative Edit, Instant Slow-mo, Audio Eraser, dan Portrait Studio. ",
                "Teknologi",
                R.drawable.gambar_smartphone
            )
        )
        stories.add(
            Story(
                "Tips Belajar Bahasa Pemrograman dengan Cepat",
                "Bagi pemula, belajar bahasa pemrograman bisa terasa menakutkan. Namun, dengan strategi yang tepat. " +
                        "Langkah Awal\n" +
                        "Tetapkan Tujuan yang Jelas: Pikirkan apa yang ingin Anda capai dengan coding, seperti membuat website, aplikasi mobile, atau software. \n" +
                        "Pahami Dasar-Dasar Pemrograman: Kuasai konsep umum coding dan prinsip dasar pemrograman sebelum mendalami bahasa tertentu. \n" +
                        "Fokus pada Satu Bahasa Pemrograman: Pilih satu bahasa coding yang sesuai tujuan Anda dan fokus mempelajarinya hingga menguasainya sebelum beralih ke bahasa lain. \n" +
                        "Pelajari Algoritma: Pahami dasar-dasar algoritma, yaitu urutan instruksi untuk menyelesaikan masalah, agar Anda bisa berpikir secara efisien dan memecahkan masalah. \n" +
                        "Praktik dan Pengembangan\n" +
                        "Praktik \"Learning by Doing\": Belajar coding tidak cukup hanya dengan membaca atau menonton. Terapkan pengetahuan dengan menulis dan menguji kode secara langsung. \n" +
                        "Buat Proyek Sederhana: Mulailah membuat proyek-proyek kecil seperti kalkulator sederhana atau website statis untuk menerapkan konsep yang dipelajari. \n" +
                        "Jadwalkan Latihan Rutin: Konsistensi adalah kunci. Jadwalkan waktu belajar secara teratur agar coding menjadi kebiasaan. \n" +
                        "Cari dan Gabung Komunitas: Belajar bersama teman atau bergabung dengan komunitas coding dapat membuat proses belajar lebih menyenangkan dan memberikan dukungan. \n" +
                        "Tips Tambahan\n" +
                        "Manfaatkan Sumber Belajar yang Beragam: Gunakan internet, tutorial, kursus, atau buku untuk memperluas referensi belajar Anda. \n" +
                        "Belajar dari Kesalahan: Jangan takut dengan error. Anggap kesalahan sebagai kesempatan belajar untuk memahami cara kerja kode dan memperbaiki masalahnya. \n" +
                        "Evaluasi dan Sesuaikan Metode Belajar: Lakukan analisis terhadap proses belajar dan proyek yang Anda buat, serta jangan ragu untuk menyesuaikan strategi jika metode yang digunakan belum cocok. \n" +
                        "Rayakan Setiap Pencapaian: Berhasil menyelesaikan program, sekecil apapun itu, adalah sebuah pencapaian. Rayakan keberhasilan Anda untuk menjaga semangat dan motivasi. ",
                "Edukasi",
                R.drawable.gambar_koding
            )
        )

        val adapter = StoryAdapter(stories)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}