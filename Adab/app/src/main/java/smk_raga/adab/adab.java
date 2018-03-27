package smk_raga.adab;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class adab extends AppCompatActivity {

    String[] namaadab = {
            "Adab menuntut ilmu",
            "Adab tidur",
            "Adab sebelum makan",
            "Adab di saat bersantap",
            "Adab mencuci pakaian",
            "Adab bertamu dan menerima tamu",
            "Adab dikamar mandi",
            "Adab berpakaian",
            "Adab seorang muslim terhadap dirinya sendiri",
            "Adab dalam berwudhu",
            "Adab Kepada Rasulullah shallallahu ‘alaihi wa sallam",
            "Adab Kepada Al-Qur’an",
            "Adab kepada Allah ‘Azza wa Jalla",
            "Adab dengan guru",



    };

    Integer[] gambaradab = {
            R.drawable.reading,
            R.drawable.bed,
            R.drawable.makans,
            R.drawable.santap,
            R.drawable.laundry,
            R.drawable.tamu,
            R.drawable.toilet,
            R.drawable.baju,
            R.drawable.ngaca,
            R.drawable.wudhu,
            R.drawable.rasulullah,
            R.drawable.alquran,
            R.drawable.tuhan,
            R.drawable.guru,



    };

    String[] subtitle = {
            "subtitle",
            "subtitle",
            "subtitle",
            "subtitle",
            "subtitle",
            "subtitle",
            "subtitle",
            "subtitle",
            "subtitle",
            "subtitle",
            "subtitle",
            "subtitle",
            "subtitle",
            "subtitle",
            "subtitle",
            "subtitle",
    };

    String[] penjelasan= {
            "1) Ikhlas Kerana Allah\n" +
                    "2) Meninggalkan Perbuatan Maksiat dan Dosa\n" +
                    "3) Menuntut Ilmu Sejak Kecil\n" +
                    "4) Mencatat Setiap Ilmu yang dipelajari\n" +
                    "5) Sabar Ketika Dibimbing Guru\n" +
                    "6) Menguruskan Waktu dengan Bijak\n" +
                    "7) Menikmati Ilmu yang Dipelajari\n" +
                    "8) Bergaul/Berkawan dengan Orang Berilmu dan Soleh\n" +
                    "9) Mengembara Mencari Ilmu\n" +
                    "10) Menghargai Pendapat Orang Lain\n" +
                    "11) Tak Pernah Puas dengan Ilmu\n",
            "1) Muhasabah:mengoreksi segala perbuatan\n" +
                    "   yang telah ia lakukan di siang hari\n" +
                    "2) Tidurlah seawal mungkin, jangan larut malam\n" +
                    "3) Berwudhulah sebelum tidur \n" +
                    "4) Kibaskan sprei tiga kali sebelum berbaring\n" +
                    "5) berbaring miring ke sebelah kanan\n" +
                    "6) Jangan tidur di atas dak terbuka\n" +
                    "7) Tutuplah pintu, jendela, dan memadamkan api\n" +
                    "    dan lampu sebelum tidur\n" +
                    "8) Baca ayat Kursi\n" +
                    "9) Baca dua ayat terakhir dari Surah Al-Baqarah\n" +
                    "10) Surah Al-Ikhlas, Al-Falaq dan An-Nas\n" +
                    "11) dan tidurlah dengan nyenyak\n",
            "1) Niat yang Benar\n" +
                    "2) Berusaha Mencari Makanan yang Halal\n" +
                    "3) Tidak Makan ketika Perut masih Kenyang\n" +
                    "4) Memenuhi Undangan Makan\n" +
                    "5) Tidak Makan dengan Bejana Emas dan Perak\n"+
                    "6) Mengajak Makan Orang yang Hadir\n" +
                    "7) Mengajak Pembantu untuk Ikut Makan\n" +
                    "8) Rendah Hati\n" +
                    "9) Mengikutsertakan Tetangga untuk Mencicipi Makanan\n" +
                    "10) Memasak Makanan untuk Orang Banyak.\n" +
                    "11) Mencuci kedua tangan\n" +
                    "12) Mencuci mulut atau berkumur\n" +
                    "13) Membaca basmalah ketika hendak makan\n",

            "1) Makan dan minum harus dengan duduk\n" +
                    "2) Ketika makan tidak boleh berbicara\n" +
                    "3) Makan dengan tangan kanan\n" +
                    "4) Ketika makan harus tenang, tidak boleh tergesa-gesa\n" +
                    "5) makanan tidak boleh tercecer.\n" +
                    "6) Tidak boleh makan sambil berjalan\n" +
                    "7) Makan secukupnya jangan berlebihan\n" +
                    "8) Hendaklah saat makan tidak membicarakan hal-hal buruk\n" +
                    "9) Mengambil makanan yang dekat dan tidak meraih\n" +
                    "    makanan di tempat yang jauh\n" +
                    "10) Apabila makan bersama, dilarang mengambil lagi\n"+
                    "      kecuali bila sudah mendapat izin\n" +
                    "11) Mulailah untuk mengambil makanan dari pinggir dan\n" +
                    "      dilarang dari tengah\n" +
                    "12) Tidak boleh mencela makanan tetapi sunah untuk \n" +
                    "      memujinya",

            "1) Hendaknya mencuci di air yang mengalir\n" +
                    "2) Pisahkan pakaian yang terkena najis dan \n" +
                    "     pakaian yang tidak terkena najis.\n" +
                    "3) Cucilah dulu pakaian yang terkena najis \n" +
                    "     sampai hilang bau dan warnanya\n" +
                    "4) Usahakan basuh pakaian hingga 3x ganti air,\n" +
                    "     agar najis yang menempel benar-benar hilang\n" +
                    "5) Jangan jemur pakaian dalam kita di luar yang dilalui\n" +
                    "     orang banyak karena itu juga termasuk aurat kita\n"+
                    "6) Usahakan mencuci sendiri pakaian dalam kita dan suami\n",

            "Adab Bertamu\n" +
                    "\n" +
                    "1) Niat Baik Dalam Bertamu\n" +
                    "2) Berpakain Rapi Dan Pantas\n" +
                    "3) Bertamu Di Waktu Yang Tepat\n" +
                    "4) Meminta Ijin\n" +
                    "5) Bersalaman\n" +
                    "6) Menghindari Ikhtilat Dalam Bertamu\n" +
                    "7) Sopan Santun Dalam Sikap Dan Ucapan\n" +
                    "8) Menerapkan Batas Waktu Bertamu\n" +
                    "\n" +
                    "Adab Menerima Tamu\n" +
                    "\n" +
                    "1) Berpakain yang Pantas\n" +
                    "2) Bersikap Baik Saat Menerima Tamu\n" +
                    "3) Menyediakan Jamuan atau makanan\n" +
                    "4) Menghormati Tamu Yang Menginap\n" +
                    "5) Mengantarkan Tamu Sampai Halaman Saat Akan Pulang\n",

            "1) Membaca Doa\n" +
                    "2) Mendahulukan kaki kiri ketika masuk kamar mandi\n" +
                    "3) Menggunakan alas kaki, sangat dianjurkan\n" +
                    "4) Jangan berbicara ketika berada di dalam kamar mandi\n" +
                    "5) Tidak boleh menghadap atau membelakangi kiblat\n" +
                    "     ketika Buang air kecil dan buang air besar\n" +
                    "6) Tidak boleh menjawab salam dikamar mandi\n" +
                    "7) Tidak boleh membawa lafadz Allah dan Rasulullah \n" +
                    "8) Tidak boleh membaca Al Qur'an dikamar mandi\n" +
                    "9) Tidak boleh mandi berduaan di dalam kamar mandi, \n" +
                    "     kecuali suami istri\n" +
                    "10) Tidak boleh makan dan minum ketika berada di dalam\n" +
                    "       kamar mandi\n" +
                    "11) Berhati-hatilah dengan percikan najis\n" +
                    "12) Memakai penutup kamar mandi, agar tidak terlihat orang\n" +
                    "       lain\n" +
                    "13) Mendahulukan kaki kanan ketika keluar kamar mandi\n" +
                    "14) Membaca doa setelah keluar kamar mandi",

            "1) Menutup aurat\n" +
                    "2) Tidak menampakkan tubuh\n" +
                    "3) Pakaian tidak ketat\n" +
                    "4) Tidak menimbulkan ria\n" +
                    "5) Larangan pakai sutera\n" +
                    "6) Mengenakan Pakaian yang Sederhana\n" +
                    "7) Tidak Mengenakan Pakaian yang Sensasional (Syuhrah)\n" +
                    "8) Memakai memulai Dari Sebelah Kanan\n" +
                    "9) Tidak Memakai Emas\n" +
                    "10) Tidak Memanjangkan Melewati Mata Kaki (Isbal)\n" +
                    "11) Tidak Menyerupai Cara Berpakaian Lawan Jenis\n",

            "1) At Taubah (bertaubat)\n" +
                    "2) Al-Muraqabah (Merasa diawasi Allah)\n" +
                    "3) Al-Muhasabah (mawas diri)\n" +
                    "4) Al-Mujahadah (bersungguh-sungguh)\n",

            "1) Niat\n" +
                    "2) Membaca Basmalah\n" +
                    "3) Banyaknya basuhan anggota wudhu, jumhur ulama \n" +
                    "     mengatakan wajibnya cukup satu kali saja.\n" +
                    "4) Membasuh tangan\n" +
                    "5) berkumur, istinsyaq dan istintsar\n" +
                    "6) membasuh wajahnya tiga kali.\n" +
                    "7) Membasuh tangan hingga ke siku\n" +
                    "8) Mengusap Kepala\n" +
                    "9) Membasuh/Mengusap Kaki\n" +
                    "10) Berdo’a ketika telah selesai berwudhu\n",

            "1) Hendaklah mentaati Nabi Muhammad S.A.W di samping\n" +
                    "     mengikuti jejaknya dalam urusan dunia dan agama.\n" +
                    "2) Menjadikan Nabi Muhammad S.A.W sebagai orang yang\n" +
                    "     paling dicintai, dihormati dan diagungkan dari \n" +
                    "     seluruh makhluk Allah\n" +
                    "3) Mengagung dan menghormati Nabi Muhammad S.A.W \n" +
                    "     apabila namanya disebut dan berselawat serta  \n" +
                    "     salam ke atasnya.\n" +
                    "4) Membenarkan segala yang dibawa oleh Nabi Muhammad\n " +
                    "     S.A.W soal agama dan dunia\n" +
                    "5) Mencintai para salihin dan para pengikutnya karena \n" +
                    "     mereka mencintai Rasulullah\n",


            "1) Ikhlas dan meluruskan niat semata-mata karena Allah Ta’aala.\n" +
                    "2) Bersiwak sebelum membaca Al-Qur’an.\n" +
                    "3) Menutup aurat.\n" +
                    "4) Memakai wewangian.\n" +
                    "5) Bersuci atau berwudhu terlebih dahulu.\n" +
                    "6) Mengawalinya dengan membaca ta’awudz (berlindung) \n" +
                    "     kepada Allah.\n" +
                    "7) Menghadirkan hati (tawajjuh)\n" +
                    "8) Duduk bersila atau iftirasy.\n" +
                    "9) Menghadap kiblat.\n" +
                    "10) Mentadabburi (merenungi) maknanya.\n" +
                    "11) Tâtsur fiqalbi (mengesankan dalam hati).\n" +
                    "12) Membenarkan (tasdiq) dan meyakini bahwa kalamullah \n" +
                    "      adalah haq.\n" +
                    "13) Memuliakan dan menghormatinya.\n" +
                    "14) Tidak memotong bacaan dengan suatu perkataan, \n" +
                    "      kecuali bila sangat terpaksa atau diperlukan\n" +
                    "15) Tidak membawa dan membacanya di tempat yang kotor,\n" +
                    "      seperti wc.\n" +
                    "16) Membacanya dengan tartil.\n" +
                    "17) Membaca dengan membaguskan suara sesuai  \n" +
                    "      dengan aturan dan anjuran Nabi Muhammad Saw.\n" +
                    "18) Meletakkan mushaf di tempat yang tinggi.\n" +
                    "19) Niat mengamalkan dan menyampaikan.\n",

            "1) Iman Dan Tidak Kufur\n" +
                    "2) Syukur Dan Tidak Kufur Nikmat.\n" +
                    "3) Taat Dan Tidak Bermaksiat\n" +
                    "4) Tidak Mendahului Allah Subhanahu Wa Ta’ala Dan \n" +
                    "     Rasul-Nya.\n" +
                    "5) Mengingat Allah Subhanahu Wa Ta’ala Dan Tidak Melupakan-Nya.\n" +
                    "6) Takut Terhadap Siksa-Nya\n" +
                    "7) tidak musyrik atau tidak menyekutukannya\n" +
                    "8) Malu Kepada-Nya\n" +
                    "9) Bertaubat Kepada-Nya\n" +
                    "10) Husnuzhan (Berbaik Sangka) Kepada-Nya.\n",
           "1) Taat kepada guru kita dalam semua perkara kecuali\n" +
                   "       perkara yang maksiat\n" +
                   "2) Bertutur katalah dengan lemah lembut dan penuh rendah  \n" +
                   "      diri kepada guru kita.\n" +
                   "3) Meminta izin kepada guru kita untuk bertanya atau pergi \n" +
                   "      dari majlis.\n" +
                   "4) Memberi salam kepada guru apabila berjumpa dan \n" +
                   "      sentiasa hormat kepadanya.\n" +
                   "5) Lakukan apa yang paling disegani oleh guru kita.\n" +
                   "6) Hindari dari menyinggung perasaan guru pada saat\n" +
                   "      berbicara.\n" +
                   "7) Mendoakan keampunan dan kesejahteraan buat guru.\n" +
                   "8) selalu menziarahi makam mereka jika mereka sudah \n" +
                   "      meninggal\n" +
                   "9) Mengambil berkah dengan mereka, doa mereka, bekas \n" +
                   "      atau lebihan air atau makanan mereka.",

























    };


    ListView list1;
    AlertDialog.Builder alertdialog;
    AlertDialog alert;
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adab);

        CustomListAdapter cladpter = new CustomListAdapter(this,namaadab,subtitle,gambaradab);
        list1 = (ListView)findViewById(R.id.list1);
        list1.setAdapter(cladpter);

        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
                alertdialog = new AlertDialog.Builder(adab.this);
                alertdialog
                        .setTitle(namaadab[position])
                        .setMessage("Anda ingin membaca tentang " + namaadab[position])
                        .setPositiveButton("ya", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String title = namaadab[position];
                                Integer gambar = gambaradab[position];
                                String isi = penjelasan[position];

                                Bundle ngambil = new Bundle();

                                ngambil.putString("judul", title);
                                ngambil.putInt("image", gambar);
                                ngambil.putString("isi", isi);

                                Intent kirim = new Intent(adab.this , detailadab.class);
                                kirim.putExtras(ngambil);
                                startActivity(kirim);


                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                alert = alertdialog.create();
                alert.show();

            }
        });



    }
}
