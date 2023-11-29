package com.example.listplanet;

import java.util.ArrayList;

public class dataplanet {
    private static String[] namaPlanet = {
            "Merkurius",
            "Venus",
            "Bumi",
            "Mars",
            "Jupiter",
            "Saturnus",
            "Uranus",
            "Neptunus",
            "Pluto",
            "Haumea"
    };

    private static String[] diameterPlanet = {
            "Diamter Planet: 58,7 juta kilometer",
            "Diamter Planet: 12.104 kilometer",
            "Diamter Planet: 12.742 kilometer",
            "Diamter Planet: 6.779 kilometer",
            "Diamter Planet: 142 ribu kilometer",
            "Diamter Planet: 120 ribu kilometer",
            "Diamter Planet: 50,724 kilometer",
            "Diamter Planet: 49,244 kilometer",
            "Diamter Planet: 2.376,6 kilometer",
            "Diamter Planet: 1.632 kilometer"
    };

    private static String[] detailPlanet = {
            "Planet merkurius merupakan planet terkecil dalam tata surya kita dengan diameter 58,7 juta kilometer dan sekaligus yang paling dekat dengan matahari. " +
                    "Planet merkurius juga memiliki suhu yang paling tinggi karena berada paling dekat dengan matahari, yaitu bisa mencapai 439 derajat celcius, namun pada malam hari, suhu merkurius bisa menjadi sangat dingin. " +
                    "Karena suhu yang sangat tinggi inilah yang menyebabkan gaya gravitasi planet merkurius sangat lemah sehingga udara pada permukaan menguap dan atmosfer menjadi tipis. Dalam satu kali orbit, planet merkurius memerlukan waktu 88 hari. " +
                    "Bagian permukaan planet merkurius memiliki banyak kawah besar yang diduga akibat tabrakan dari meteorit.",
            "Planet venus memiliki ukuran yang hampir sama dengan planet kita, bumi, yaitu memiliki diameter 12.104 kilometer. Jarak antara planet venus ini dengan matahari adalah 108,9 juta kilometer. Meskipun memiliki ukuran yang hampir sama dengan planet bumi, " +
                    "planet venus diselimuti oleh karbon dioksida sehingga tidak memungkin manusia untuk bernafas di planet ini. Selain itu juga, planet venus diselimuti awan yang terbentuk dari asam belerang yang mematikan. Planet venus juga memiliki arah rotasi yang " +
                    "berlawanan dengan planet bumi dan juga sangat lambat. Dalam satu kali rotasi atau perputaran planetnya, planet venus memerlukan waktu 243 hari di planet bumi. Sementara untuk waktu rotasi atau berapa lama planet venus mengitari matahari adalah 255 hari. " +
                    "Suhu di planet venus juga tidak jauh berbeda dengan planet merkurius, yaitu bisa mencapai 463 derajat celcius.",
            "Alasan kenapa planet bumi menjadi satu-satunya planet yang dapat ditinggali oleh makhluk hidup adalah karena planet bumi diselimuti oleh gas yang disebut atmosfer yang memberikan udara untuk bernafas sekaligus mencegah planet bumi dari tabrakan meteor atau batu " +
                    "langit di tata surya. Atmosfer planet bumi terbuat dari 78% nitrogen, 21% oksigen dan 1% zat lainnya. Selain itu juga, jarak antara matahari dan planet bumi juga tepat, yaitu 149,7 juta kilometer. Dalam satu kali waktu orbit, planet bumi memerlukan 365 seperempat " +
                    "hari, sementara untuk waktu rotasinya adalah 24 jam. Karena jarak yang tepat tersebut, membuat matahari dapat memberikan kehangatan dalam jumlah yang pas, sehingga makhluk hidup tidak merasa kepanasan, atau kedinginan dalam cuaca yang ekstrem.",
            "kita akan mengenal planet merah atau planet mars yang memiliki diameter 6.779 kilometer. Planet mars mendapatkan julukan planet merah karena debu yang melapisi bagian permukaan planet ini. Sebagai planet keempat, jarak antara planet mars dengan matahari adalah 250.67 juta kilometer. " +
                    "Planet mars sendiri memiliki waktu orbit selama 786 hari, namun untuk waktu rotasinya hanya memakan waktu 24,6 jam saja.",
            "kita akan mengenal planet jupiter yang memiliki jarak dengan matahari sejauh 741.42 juta kilometer. Jupiter juga merupakan planet terbesar dalam tata surya kita dengan diameter mencapai 142 ribu kilometer. Planet terbesar dalam tata surya kita ini memiliki waktu orbit selama 12 tahun, " +
                    "namun memiliki waktu rotasi yang singkat, yaitu hanya 9,8 jam saja. Planet terbesar dalam tata surya kita juga memiliki jumlah satelit yang paling banyak dibandingkan planet lainnya, yaitu sebanyak 63 satelit.",
            "Meskipun ukurannya tidak sebesar jupiter, planet saturnus juga termasuk planet yang besar karena memiliki diameter 120 ribu kilometer. Salah satu ciri khas atau hal yang sangat membedakan saturnus dengan planet lainnya adalah planet saturnus memiliki cincin yang merupakan kristal es " +
                    "dengan ketebalan mencapai 402 ribu kilometer yang melingkari planet saturnus. Selain karena cincinnya, planet saturnus jua memiliki cukup banyak satelit, yaitu sebanyak 62 satelit.",
            "Hal yang menarik dari planet uranus adalah planet ini memiliki poros putar yang miring dan juga mendapatkan julukan sebagai planet es terbesar karena suhu rata-rata di dalam planet uranus adalah -224 derajat celcius. Selain itu juga ternyata planet uranus memiliki cincin yang mirip " +
                    "seperti saturnus, namun ukurannya sangat tipis.",
            "Planet terjauh ini memiliki jarak 4,5 miliar dari matahari dan memiliki diameter 49,244 kilometer. Neptunus memiliki waktu orbit atau durasi waktu tempuh mengelilingi matahari adalah selama 165 tahun, dengan waktu rotasi selama 15 jam 48 menit.",
            "Pluto adalah planet katai di sabuk Kuiper dan objek trans-Neptunus pertama yang ditemukan. Pluto merupakan planet katai terbesar dan bermassa terbesar kedua di Tata Surya dan benda terbesar kesembilan dan bermassa terbesar kesepuluh yang mengorbit Matahari secara langsung",
            "Haumea, secara resmi disebut Haumea dan sebutan sementara 2003 EL61 adalah planet katai di sabuk Kuiper, secara kasar sekitar sepertiga massa Pluto, ditemukan oleh tim Mike Brown di Caltech di Amerika Serikat atau J. L. Ortiz et al. dari Instituto de Astrofísica de Andalucía di Observatorium Sierra Nevada di Spanyol"
    };

    private static int[] photoPlanet = {
            R.drawable.merkurius,
            R.drawable.venus,
            R.drawable.bumi,
            R.drawable.mars,
            R.drawable.jupiter,
            R.drawable.saturnus,
            R.drawable.uranus,
            R.drawable.neptunus,
            R.drawable.pluto,
            R.drawable.haumea
    };

    static ArrayList<Planet> getListData() {
        ArrayList<Planet> list = new ArrayList<>();
        for (int position = 0; position < namaPlanet.length; position++) {
            Planet planet = new Planet();
            planet.setNamaPlanet(namaPlanet[position]);
            planet.setDiameterPlanet(diameterPlanet[position]);
            planet.setPhotoPlanet(photoPlanet[position]);
            planet.setDetailPlanet(detailPlanet[position]);
            list.add(planet);
        }
        return list;
    }
}
