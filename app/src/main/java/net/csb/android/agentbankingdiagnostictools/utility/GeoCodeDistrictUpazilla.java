package net.csb.android.agentbankingdiagnostictools.utility;

public class GeoCodeDistrictUpazilla {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        GeoCodeDistrictUpazilla geoCodeDistrictUpazilla = new GeoCodeDistrictUpazilla();
       /* System.out.println("0138: " + geoCodeDistrictUpazilla.getDistrictUpazilla("01", "01", 0));
        System.out.println("0138: " + geoCodeDistrictUpazilla.getDistrictUpazilla("01", "01", 1));
        System.out.println("0138: " + geoCodeDistrictUpazilla.getDistrictUpazilla("72", "38", 0));
        System.out.println("0138: " + geoCodeDistrictUpazilla.getDistrictUpazilla("72", "38", 1));
*/
    }

    public String getDistrictUpazilla(String districtCode, String upazillaCode, int languageSelection) {
        String districUpazillaCode = districtCode + upazillaCode;
        String districtUpazilla = "";
        String districtUpazilla_bn = "";

        switch (districUpazillaCode) {
            case "0108":
                districtUpazilla = "Bagerhat, Bagerhat";
                districtUpazilla_bn = "বাগেরহাট, বাগেরহাট সদর";
                break;
            case "0114":
                districtUpazilla = "Bagerhat, Chitalmari";
                districtUpazilla_bn = "বাগেরহাট, চিতলমারী";
                break;
            case "0134":
                districtUpazilla = "Bagerhat, Fakirhat";
                districtUpazilla_bn = "বাগেরহাট, ফকিরহাট";
                break;
            case "0138":
                districtUpazilla = "Bagerhat, Kuchua";
                districtUpazilla_bn = "বাগেরহাট, কচুয়া";
                break;
            case "0156":
                districtUpazilla = "Bagerhat, Mollahat";
                districtUpazilla_bn = "বাগেরহাট, মোল্লাহাট";
                break;
            case "0158":
                districtUpazilla = "Bagerhat, Mongla";
                districtUpazilla_bn = "বাগেরহাট, মোংলা";
                break;
            case "0160":
                districtUpazilla = "Bagerhat, Morrelganj";
                districtUpazilla_bn = "বাগেরহাট, মোড়েলগঞ্জ";
                break;
            case "0173":
                districtUpazilla = "Bagerhat, Rampal";
                districtUpazilla_bn = "বাগেরহাট, রামপাল";
                break;
            case "0177":
                districtUpazilla = "Bagerhat, Sarankhola";
                districtUpazilla_bn = "বাগেরহাট, শরণখোলা";
                break;
            case "0304":
                districtUpazilla = "Bandarban, Alikadam";
                districtUpazilla_bn = "বান্দরবন, আলীকদম";
                break;
            case "0314":
                districtUpazilla = "Bandarban, Bandarban";
                districtUpazilla_bn = "বান্দরবন, বান্দরবান সদর";
                break;
            case "0351":
                districtUpazilla = "Bandarban, Lama";
                districtUpazilla_bn = "বান্দরবন, লামা";
                break;
            case "0373":
                districtUpazilla = "Bandarban, Naikhongchhari";
                districtUpazilla_bn = "বান্দরবন, নাইক্ষ্যংছড়ি";
                break;
            case "0389":
                districtUpazilla = "Bandarban, Rowangchhari";
                districtUpazilla_bn = "বান্দরবন, রোয়াংছড়ি";
                break;
            case "0391":
                districtUpazilla = "Bandarban, Ruma";
                districtUpazilla_bn = "বান্দরবন, রুমা";
                break;
            case "0395":
                districtUpazilla = "Bandarban, Thanchi";
                districtUpazilla_bn = "বান্দরবন, থানচি";
                break;
            case "0409":
                districtUpazilla = "Barguna, Amtali";
                districtUpazilla_bn = "বরগুনা, আমতলী";
                break;
            case "0419":
                districtUpazilla = "Barguna, Bamna";
                districtUpazilla_bn = "বরগুনা, বামনা";
                break;
            case "0428":
                districtUpazilla = "Barguna, Barguna";
                districtUpazilla_bn = "বরগুনা, বরগুনা";
                break;
            case "0447":
                districtUpazilla = "Barguna, Betagi";
                districtUpazilla_bn = "বরগুনা, বেতাগী";
                break;
            case "0485":
                districtUpazilla = "Barguna, Patharghata";
                districtUpazilla_bn = "বরগুনা, পাথরঘাটা";
                break;
            case "0602":
                districtUpazilla = "Barisal, Agailjhara";
                districtUpazilla_bn = "বরিশাল, আগৈলঝরা";
                break;
            case "0603":
                districtUpazilla = "Barisal, Babuganj";
                districtUpazilla_bn = "বরিশাল, বাবুগঞ্জ";
                break;
            case "0607":
                districtUpazilla = "Barisal, Bakerganj";
                districtUpazilla_bn = "বরিশাল, বাকেরগঞ্জ";
                break;
            case "0610":
                districtUpazilla = "Barisal, Banaripara";
                districtUpazilla_bn = "বরিশাল, বানারীপাড়া";
                break;
            case "0632":
                districtUpazilla = "Barisal, Gaurnadi";
                districtUpazilla_bn = "বরিশাল, গৌরনদী";
                break;
            case "0636":
                districtUpazilla = "Barisal, Hizla";
                districtUpazilla_bn = "বরিশাল, হিজলা";
                break;
            case "0651":
                districtUpazilla = "Barisal, Barisal";
                districtUpazilla_bn = "বরিশাল, বরিশাল সদর";
                break;
            case "0662":
                districtUpazilla = "Barisal, Mehendiganj";
                districtUpazilla_bn = "বরিশাল, মেহেন্দীগঞ্জ";
                break;
            case "0669":
                districtUpazilla = "Barisal, Muladi";
                districtUpazilla_bn = "বরিশাল, মুলাদি";
                break;
            case "0694":
                districtUpazilla = "Barisal, Wazirpur";
                districtUpazilla_bn = "বরিশাল, উজিরপুর";
                break;
            case "0918":
                districtUpazilla = "Bhola, Bhola";
                districtUpazilla_bn = "ভোলা, ভোলা সদর";
                break;
            case "0921":
                districtUpazilla = "Bhola, Burhanuddin";
                districtUpazilla_bn = "ভোলা, বোরহানউদ্দিন";
                break;
            case "0925":
                districtUpazilla = "Bhola, Char Fasson";
                districtUpazilla_bn = "ভোলা, চরফ্যাশন";
                break;
            case "0929":
                districtUpazilla = "Bhola, Daulatkhan";
                districtUpazilla_bn = "ভোলা, দৌলতখান";
                break;
            case "0954":
                districtUpazilla = "Bhola, Lalmohan";
                districtUpazilla_bn = "ভোলা, লালমোহন";
                break;
            case "0965":
                districtUpazilla = "Bhola, Manpura";
                districtUpazilla_bn = "ভোলা, মনপুরা";
                break;
            case "0991":
                districtUpazilla = "Bhola, Tazumuddin";
                districtUpazilla_bn = "ভোলা, তজুমদ্দিন";
                break;
            case "1006":
                districtUpazilla = "Bogra, Adamdighi";
                districtUpazilla_bn = "বগুড়া, আদমদিঘি";
                break;
            case "1020":
                districtUpazilla = "Bogra, Bogra";
                districtUpazilla_bn = "বগুড়া, বগুড়া সদর";
                break;
            case "1021":
                districtUpazilla = "Bogra, Shajahanpur (Majhira)";
                districtUpazilla_bn = "বগুড়া, শাজাহানপুর";
                break;
            case "1027":
                districtUpazilla = "Bogra, Dhunat";
                districtUpazilla_bn = "বগুড়া, ধুনট";
                break;
            case "1033":
                districtUpazilla = "Bogra, Dhupchanchia";
                districtUpazilla_bn = "বগুড়া, দুপচাচিঁয়া";
                break;
            case "1040":
                districtUpazilla = "Bogra, Gabtali";
                districtUpazilla_bn = "বগুড়া, গাবতলী";
                break;
            case "1054":
                districtUpazilla = "Bogra, Kahaloo";
                districtUpazilla_bn = "বগুড়া, কাহালু";
                break;
            case "1067":
                districtUpazilla = "Bogra, Nandigram";
                districtUpazilla_bn = "বগুড়া, নন্দিগ্রাম";
                break;
            case "1081":
                districtUpazilla = "Bogra, Sariakandi";
                districtUpazilla_bn = "বগুড়া, সারিয়াকান্দি";
                break;
            case "1088":
                districtUpazilla = "Bogra, Sherpur";
                districtUpazilla_bn = "বগুড়া, শেরপুর";
                break;
            case "1094":
                districtUpazilla = "Bogra, Shibgonj";
                districtUpazilla_bn = "বগুড়া, শিবগঞ্জ";
                break;
            case "1095":
                districtUpazilla = "Bogra, Sonatala";
                districtUpazilla_bn = "বগুড়া, সোনাতলা";
                break;
            case "1202":
                districtUpazilla = "Brahamanbaria, Akhaura";
                districtUpazilla_bn = "ব্রাহ্মণবাড়িয়া, আখাউড়া";
                break;
            case "1204":
                districtUpazilla = "Brahamanbaria, Bancharampur";
                districtUpazilla_bn = "ব্রাহ্মণবাড়িয়া, বাঞ্ছারামপুর";
                break;
            case "1213":
                districtUpazilla = "Brahamanbaria, Brahamanbaria";
                districtUpazilla_bn = "ব্রাহ্মণবাড়িয়া, ব্রাহ্মণবাড়িয়া সদর";
                break;
            case "1233":
                districtUpazilla = "Brahamanbaria, Ashuganj";
                districtUpazilla_bn = "ব্রাহ্মণবাড়িয়া, আশুগঞ্জ";
                break;
            case "1263":
                districtUpazilla = "Brahamanbaria, Kasba";
                districtUpazilla_bn = "ব্রাহ্মণবাড়িয়া, কসবা";
                break;
            case "1285":
                districtUpazilla = "Brahamanbaria, Nabinagar";
                districtUpazilla_bn = "ব্রাহ্মণবাড়িয়া, নবীনগর";
                break;
            case "1290":
                districtUpazilla = "Brahamanbaria, Nasirnagar";
                districtUpazilla_bn = "ব্রাহ্মণবাড়িয়া, নাসিরনগর";
                break;
            case "1294":
                districtUpazilla = "Brahamanbaria, Sarail";
                districtUpazilla_bn = "ব্রাহ্মণবাড়িয়া, সরাইল";
                break;
            case "1322":
                districtUpazilla = "Chandpur, Chandpur";
                districtUpazilla_bn = "চাঁদপুর, চাঁদপুর সদর";
                break;
            case "1345":
                districtUpazilla = "Chandpur, Faridganj";
                districtUpazilla_bn = "চাঁদপুর, ফরিদগঞ্জ";
                break;
            case "1347":
                districtUpazilla = "Chandpur, Haimchar";
                districtUpazilla_bn = "চাঁদপুর, হাইমচর";
                break;
            case "1349":
                districtUpazilla = "Chandpur, Haziganj";
                districtUpazilla_bn = "চাঁদপুর, হাজীগঞ্জ";
                break;
            case "1358":
                districtUpazilla = "Chandpur, Kachua";
                districtUpazilla_bn = "চাঁদপুর, কচুয়া";
                break;
            case "1376":
                districtUpazilla = "Chandpur, Matlab";
                districtUpazilla_bn = "চাঁদপুর, মতলব";
                break;
            case "1379":
                districtUpazilla = "Chandpur, Uttar Matlab";
                districtUpazilla_bn = "চাঁদপুর, উত্তর মতলব";
                break;
            case "1395":
                districtUpazilla = "Chandpur, Shahrasti";
                districtUpazilla_bn = "চাঁদপুর, শাহরাস্তি";
                break;
            case "1504":
                districtUpazilla = "Chittagong, Anowara";
                districtUpazilla_bn = "চট্টগ্রাম, আনোয়ারা";
                break;
            case "1508":
                districtUpazilla = "Chittagong, Banshkhali";
                districtUpazilla_bn = "চট্টগ্রাম, বাঁশখালী";
                break;
            case "1512":
                districtUpazilla = "Chittagong, Boalkhali";
                districtUpazilla_bn = "চট্টগ্রাম, বোয়ালখালী";
                break;
            case "1518":
                districtUpazilla = "Chittagong, Chandanaish";
                districtUpazilla_bn = "চট্টগ্রাম, চন্দনাইশ";
                break;
            case "1533":
                districtUpazilla = "Chittagong, Fatikchhari";
                districtUpazilla_bn = "চট্টগ্রাম, ফটিকছড়ি";
                break;
            case "1537":
                districtUpazilla = "Chittagong, City Corporation";
                districtUpazilla_bn = "চট্টগ্রাম, সিটি কর্পোরেশন";
                break;
            case "1541":
                districtUpazilla = "Chittagong, City Corporation";
                districtUpazilla_bn = "চট্টগ্রাম, সিটি কর্পোরেশন";
                break;
            case "1547":
                districtUpazilla = "Chittagong, Lohagora";
                districtUpazilla_bn = "চট্টগ্রাম, লোহাগাড়া";
                break;
            case "1553":
                districtUpazilla = "Chittagong, Mirsaharai";
                districtUpazilla_bn = "চট্টগ্রাম, মীরসরাই";
                break;
            case "1561":
                districtUpazilla = "Chittagong, Patiya";
                districtUpazilla_bn = "চট্টগ্রাম, পটিয়া";
                break;
            case "1570":
                districtUpazilla = "Chittagong, Rangunia";
                districtUpazilla_bn = "চট্টগ্রাম, রাঙ্গুনিয়া";
                break;
            case "1574":
                districtUpazilla = "Chittagong, Raozan";
                districtUpazilla_bn = "চট্টগ্রাম, রাউজান";
                break;
            case "1578":
                districtUpazilla = "Chittagong, Sandwip";
                districtUpazilla_bn = "চট্টগ্রাম, সন্দ্বীপ";
                break;
            case "1582":
                districtUpazilla = "Chittagong, Satkania";
                districtUpazilla_bn = "চট্টগ্রাম, সাতকানিয়া";
                break;
            case "1586":
                districtUpazilla = "Chittagong, Sitakunda";
                districtUpazilla_bn = "চট্টগ্রাম, সীতাকুন্ড";
                break;
            case "1807":
                districtUpazilla = "Chuadanga, Alamdanga";
                districtUpazilla_bn = "চুয়াডাঙ্গা, আলমডাঙ্গা";
                break;
            case "1823":
                districtUpazilla = "Chuadanga, Chuadanga";
                districtUpazilla_bn = "চুয়াডাঙ্গা, চুয়াডাঙ্গা সদর";
                break;
            case "1831":
                districtUpazilla = "Chuadanga, Dhamurhuda";
                districtUpazilla_bn = "চুয়াডাঙ্গা, দামুড়হুদা";
                break;
            case "1855":
                districtUpazilla = "Chuadanga, Jaban Nagar";
                districtUpazilla_bn = "চুয়াডাঙ্গা, জীবননগর";
                break;
            case "1909":
                districtUpazilla = "Comilla, Baura";
                districtUpazilla_bn = "কুমিল্লা, বরুড়া";
                break;
            case "1915":
                districtUpazilla = "Comilla, Brahman para";
                districtUpazilla_bn = "কুমিল্লা, ব্রাহ্মণপাড়া";
                break;
            case "1918":
                districtUpazilla = "Comilla, Burichang";
                districtUpazilla_bn = "কুমিল্লা, বুড়িচং";
                break;
            case "1927":
                districtUpazilla = "Comilla, Cahndina";
                districtUpazilla_bn = "কুমিল্লা, চান্দিনা";
                break;
            case "1931":
                districtUpazilla = "Comilla, Chauddagram";
                districtUpazilla_bn = "কুমিল্লা, চৌদ্দগ্রাম";
                break;
            case "1936":
                districtUpazilla = "Comilla, Daudkandi";
                districtUpazilla_bn = "কুমিল্লা, দাউদকান্দি";
                break;
            case "1937":
                districtUpazilla = "Comilla, Titash";
                districtUpazilla_bn = "কুমিল্লা, তিতাস";
                break;
            case "1940":
                districtUpazilla = "Comilla, Debidwar";
                districtUpazilla_bn = "কুমিল্লা, দেবিদ্বার";
                break;
            case "1954":
                districtUpazilla = "Comilla, Homna";
                districtUpazilla_bn = "কুমিল্লা, হোমনা";
                break;
            case "1967":
                districtUpazilla = "Comilla, Comilla";
                districtUpazilla_bn = "কুমিল্লা, কুমিল্লা সদর";
                break;
            case "1968":
                districtUpazilla = "Comilla, South Comilla";
                districtUpazilla_bn = "কুমিল্লা, সদর দক্ষিণ";
                break;
            case "1972":
                districtUpazilla = "Comilla, Laksam";
                districtUpazilla_bn = "কুমিল্লা, লাকসাম";
                break;
            case "1973":
                districtUpazilla = "Comilla, Monoharganj";
                districtUpazilla_bn = "কুমিল্লা, মনোহরগঞ্জ";
                break;
            case "1975":
                districtUpazilla = "Comilla, Meghna";
                districtUpazilla_bn = "কুমিল্লা, মেঘনা";
                break;
            case "1981":
                districtUpazilla = "Comilla, Muradnagar";
                districtUpazilla_bn = "কুমিল্লা, মুরাদনগর";
                break;
            case "1987":
                districtUpazilla = "Comilla, Nangalkot";
                districtUpazilla_bn = "কুমিল্লা, নাঙ্গলকোট";
                break;
            case "2216":
                districtUpazilla = "Cox's Bazar, Chakaria";
                districtUpazilla_bn = "কক্সবাজার, চকরিয়া";
                break;
            case "2224":
                districtUpazilla = "Cox's Bazar, Cox's Bazar";
                districtUpazilla_bn = "কক্সবাজার, কক্সবাজার সদর";
                break;
            case "2245":
                districtUpazilla = "Cox's Bazar, Kutubdia";
                districtUpazilla_bn = "কক্সবাজার, কুতুবদিয়া";
                break;
            case "2249":
                districtUpazilla = "Cox's Bazar, Maheshkhali";
                districtUpazilla_bn = "কক্সবাজার, মহেশখালী";
                break;
            case "2266":
                districtUpazilla = "Cox's Bazar, Ramu";
                districtUpazilla_bn = "কক্সবাজার, রামু";
                break;
            case "2290":
                districtUpazilla = "Cox's Bazar, Teknaf";
                districtUpazilla_bn = "কক্সবাজার, টেকনাফ";
                break;
            case "2294":
                districtUpazilla = "Cox's Bazar, Ukhia";
                districtUpazilla_bn = "কক্সবাজার, উখিয়া";
                break;
            case "2295":
                districtUpazilla = "Cox's Bazar, Pekua";
                districtUpazilla_bn = "কক্সবাজার, পেকুয়া";
                break;
            case "2614":
                districtUpazilla = "Dhaka, Dhamrai";
                districtUpazilla_bn = "ঢাকা, ধামরাই";
                break;
            case "2618":
                districtUpazilla = "Dhaka, Dohar";
                districtUpazilla_bn = "ঢাকা, দোহার";
                break;
            case "2638":
                districtUpazilla = "Dhaka, Keraniganj";
                districtUpazilla_bn = "ঢাকা, কেরাণীগঞ্জ";
                break;
            case "2640":
                districtUpazilla = "Dhaka, City Corporation";
                districtUpazilla_bn = "ঢাকা, সিটি কর্পোরেশন";
                break;
            case "2662":
                districtUpazilla = "Dhaka, Nawabganz";
                districtUpazilla_bn = "ঢাকা, নবাবগঞ্জ";
                break;
            case "2672":
                districtUpazilla = "Dhaka, Savar";
                districtUpazilla_bn = "ঢাকা, সাভার";
                break;
            case "2710":
                districtUpazilla = "Dinajpur, Birampur";
                districtUpazilla_bn = "দিনাজপুর, বিরামপুর";
                break;
            case "2712":
                districtUpazilla = "Dinajpur, Birganj";
                districtUpazilla_bn = "দিনাজপুর, বীরগঞ্জ";
                break;
            case "2717":
                districtUpazilla = "Dinajpur, Biral";
                districtUpazilla_bn = "দিনাজপুর, বিরল";
                break;
            case "2721":
                districtUpazilla = "Dinajpur, Bochaganj";
                districtUpazilla_bn = "দিনাজপুর, বোচাগঞ্জ";
                break;
            case "2730":
                districtUpazilla = "Dinajpur, Chirirbandar";
                districtUpazilla_bn = "দিনাজপুর, চিরিরবন্দর";
                break;
            case "2738":
                districtUpazilla = "Dinajpur, Fulbari";
                districtUpazilla_bn = "দিনাজপুর, ফুলবাড়ী";
                break;
            case "2743":
                districtUpazilla = "Dinajpur, Ghoraghat";
                districtUpazilla_bn = "দিনাজপুর, ঘোড়াঘাট";
                break;
            case "2747":
                districtUpazilla = "Dinajpur, Hakimpur";
                districtUpazilla_bn = "দিনাজপুর, হাকিমপুর";
                break;
            case "2756":
                districtUpazilla = "Dinajpur, Kaharole";
                districtUpazilla_bn = "দিনাজপুর, কাহারোল";
                break;
            case "2760":
                districtUpazilla = "Dinajpur, Khansama";
                districtUpazilla_bn = "দিনাজপুর, খানসামা";
                break;
            case "2764":
                districtUpazilla = "Dinajpur, Dinajpur";
                districtUpazilla_bn = "দিনাজপুর, দিনাজপুর সদর";
                break;
            case "2769":
                districtUpazilla = "Dinajpur, Nawabgonj";
                districtUpazilla_bn = "দিনাজপুর, নবাবগঞ্জ";
                break;
            case "2777":
                districtUpazilla = "Dinajpur, Parbatipur";
                districtUpazilla_bn = "দিনাজপুর, পার্বতীপুর";
                break;
            case "2903":
                districtUpazilla = "Faridpur, Alfadanga";
                districtUpazilla_bn = "ফরিদপুর, আলফাডাঙ্গা";
                break;
            case "2910":
                districtUpazilla = "Faridpur, Bhanga";
                districtUpazilla_bn = "ফরিদপুর, ভাঙ্গা";
                break;
            case "2918":
                districtUpazilla = "Faridpur, Boalmari";
                districtUpazilla_bn = "ফরিদপুর, বোয়ালমারী";
                break;
            case "2921":
                districtUpazilla = "Faridpur, Char Bhadrasan";
                districtUpazilla_bn = "ফরিদপুর, চরভদ্রাসন";
                break;
            case "2947":
                districtUpazilla = "Faridpur, Faridpur";
                districtUpazilla_bn = "ফরিদপুর, ফরিদপুর সদর";
                break;
            case "2956":
                districtUpazilla = "Faridpur, Madhukhali";
                districtUpazilla_bn = "ফরিদপুর, মধুখালী";
                break;
            case "2962":
                districtUpazilla = "Faridpur, Nagarkandi";
                districtUpazilla_bn = "ফরিদপুর, নগরকান্দা";
                break;
            case "2984":
                districtUpazilla = "Faridpur, Sadarpur";
                districtUpazilla_bn = "ফরিদপুর, সদরপুর";
                break;
            case "3014":
                districtUpazilla = "Feni, Chhagalnaiya";
                districtUpazilla_bn = "ফেনী, ছাগলনাইয়া";
                break;
            case "3025":
                districtUpazilla = "Feni, Daganbhuiyan";
                districtUpazilla_bn = "ফেনী, দাগনভূঞা";
                break;
            case "3029":
                districtUpazilla = "Feni, Feni";
                districtUpazilla_bn = "ফেনী, ফেনী সদর";
                break;
            case "3051":
                districtUpazilla = "Feni, Parshuram";
                districtUpazilla_bn = "ফেনী, পরশুরাম";
                break;
            case "3094":
                districtUpazilla = "Feni, Sonagazi";
                districtUpazilla_bn = "ফেনী, সোনাগাজী";
                break;
            case "3095":
                districtUpazilla = "Feni, Fulgazi";
                districtUpazilla_bn = "ফেনী, ফুলগাজী";
                break;
            case "3221":
                districtUpazilla = "Gaibandha, Fulchhari";
                districtUpazilla_bn = "গাইবান্ধা, ফুলছড়ি";
                break;
            case "3224":
                districtUpazilla = "Gaibandha, Gaibandha";
                districtUpazilla_bn = "গাইবান্ধা, গাইবান্ধা সদর";
                break;
            case "3230":
                districtUpazilla = "Gaibandha, Gobindaganj";
                districtUpazilla_bn = "গাইবান্ধা, গোবিন্দগঞ্জ";
                break;
            case "3267":
                districtUpazilla = "Gaibandha, Palashbari";
                districtUpazilla_bn = "গাইবান্ধা, পলাশবাড়ী";
                break;
            case "3282":
                districtUpazilla = "Gaibandha, Sadullapur";
                districtUpazilla_bn = "গাইবান্ধা, সাদুল্লাপুর";
                break;
            case "3288":
                districtUpazilla = "Gaibandha, Saghatta";
                districtUpazilla_bn = "গাইবান্ধা, সাঘাটা";
                break;
            case "3291":
                districtUpazilla = "Gaibandha, Sundarganj";
                districtUpazilla_bn = "গাইবান্ধা, সুন্দরগঞ্জ";
                break;
            case "3330":
                districtUpazilla = "Gazipur, Gazipur";
                districtUpazilla_bn = "গাজীপুর, গাজীপুর সদর";
                break;
            case "3332":
                districtUpazilla = "Gazipur, Kaliakair";
                districtUpazilla_bn = "গাজীপুর, কালিয়াকৈর";
                break;
            case "3334":
                districtUpazilla = "Gazipur, Kaliganj";
                districtUpazilla_bn = "গাজীপুর, কালীগঞ্জ";
                break;
            case "3336":
                districtUpazilla = "Gazipur, Kapasia";
                districtUpazilla_bn = "গাজীপুর, কাপাসিয়া";
                break;
            case "3386":
                districtUpazilla = "Gazipur, Sreepur";
                districtUpazilla_bn = "গাজীপুর, শ্রীপুর";
                break;
            case "3532":
                districtUpazilla = "Gopalganj, Gopalganj";
                districtUpazilla_bn = "গোপালগঞ্জ, গোপালগঞ্জ সদর";
                break;
            case "3543":
                districtUpazilla = "Gopalganj, Kashiani";
                districtUpazilla_bn = "গোপালগঞ্জ, কাশিয়ানী";
                break;
            case "3551":
                districtUpazilla = "Gopalganj, Kotalipara";
                districtUpazilla_bn = "গোপালগঞ্জ, কোটালীপাড়া";
                break;
            case "3558":
                districtUpazilla = "Gopalganj, Muksudpur";
                districtUpazilla_bn = "গোপালগঞ্জ, মুকসুদপুর";
                break;
            case "3591":
                districtUpazilla = "Gopalganj, Tungipara";
                districtUpazilla_bn = "গোপালগঞ্জ, টুংগীপাড়া";
                break;
            case "3602":
                districtUpazilla = "Habiganj, Ajmiriganj";
                districtUpazilla_bn = "হবিগঞ্জ, আজমিরীগঞ্জ";
                break;
            case "3605":
                districtUpazilla = "Habiganj, Bahubal";
                districtUpazilla_bn = "হবিগঞ্জ, বাহুবল";
                break;
            case "3611":
                districtUpazilla = "Habiganj, Baniachong";
                districtUpazilla_bn = "হবিগঞ্জ, বানিয়াচং";
                break;
            case "3626":
                districtUpazilla = "Habiganj, Chunarughat";
                districtUpazilla_bn = "হবিগঞ্জ, চুনারুঘাট";
                break;
            case "3644":
                districtUpazilla = "Habiganj, Habiganj";
                districtUpazilla_bn = "হবিগঞ্জ, হবিগঞ্জ সদর";
                break;
            case "3668":
                districtUpazilla = "Habiganj, Lakhai";
                districtUpazilla_bn = "হবিগঞ্জ, লাখাই";
                break;
            case "3671":
                districtUpazilla = "Habiganj, Madhabpur";
                districtUpazilla_bn = "হবিগঞ্জ, মাধবপুর";
                break;
            case "3677":
                districtUpazilla = "Habiganj, Nabiganj";
                districtUpazilla_bn = "হবিগঞ্জ, নবীগঞ্জ";
                break;
            case "3813":
                districtUpazilla = "Joypurhat, Akkelpur";
                districtUpazilla_bn = "জয়পুরহাট, আক্কেলপুর";
                break;
            case "3847":
                districtUpazilla = "Joypurhat, Joypurhat";
                districtUpazilla_bn = "জয়পুরহাট, জয়পুরহাট সদর";
                break;
            case "3858":
                districtUpazilla = "Joypurhat, Kalai";
                districtUpazilla_bn = "জয়পুরহাট, কালাই";
                break;
            case "3861":
                districtUpazilla = "Joypurhat, Khetlal";
                districtUpazilla_bn = "জয়পুরহাট, ক্ষেতলাল";
                break;
            case "3874":
                districtUpazilla = "Joypurhat, Panchbibi";
                districtUpazilla_bn = "জয়পুরহাট, পাঁচবিবি";
                break;
            case "3907":
                districtUpazilla = "Jamalpur, Bakshiganj";
                districtUpazilla_bn = "জামালপুর, বকশীগঞ্জ";
                break;
            case "3915":
                districtUpazilla = "Jamalpur, Dewanganj";
                districtUpazilla_bn = "জামালপুর, দেওয়ানগঞ্জ";
                break;
            case "3929":
                districtUpazilla = "Jamalpur, Islampur";
                districtUpazilla_bn = "জামালপুর, ইসলামপুর";
                break;
            case "3936":
                districtUpazilla = "Jamalpur, Jamalpur";
                districtUpazilla_bn = "জামালপুর, জামালপুর সদর";
                break;
            case "3958":
                districtUpazilla = "Jamalpur, Madarganj";
                districtUpazilla_bn = "জামালপুর, মাদারগঞ্জ";
                break;
            case "3961":
                districtUpazilla = "Jamalpur, Melandaha";
                districtUpazilla_bn = "জামালপুর, মেলান্দহ";
                break;
            case "3985":
                districtUpazilla = "Jamalpur, Sarishabari";
                districtUpazilla_bn = "জামালপুর, সরিষাবাড়ী";
                break;
            case "4104":
                districtUpazilla = "Jessore, Abhaynagar";
                districtUpazilla_bn = "যশোর, অভয়নগর";
                break;
            case "4109":
                districtUpazilla = "Jessore, Bagher para";
                districtUpazilla_bn = "যশোর, বাঘারপাড়া";
                break;
            case "4111":
                districtUpazilla = "Jessore, Chaugachha";
                districtUpazilla_bn = "যশোর, চৌগাছা";
                break;
            case "4123":
                districtUpazilla = "Jessore, Jhikargachha";
                districtUpazilla_bn = "যশোর, ঝিকরগাছা";
                break;
            case "4138":
                districtUpazilla = "Jessore, Keshabpur";
                districtUpazilla_bn = "যশোর, কেশবপুর";
                break;
            case "4147":
                districtUpazilla = "Jessore, Jessore";
                districtUpazilla_bn = "যশোর, যশোর সদর";
                break;
            case "4161":
                districtUpazilla = "Jessore, Manirampur";
                districtUpazilla_bn = "যশোর, মণিরামপুর";
                break;
            case "4190":
                districtUpazilla = "Jessore, Sharsha";
                districtUpazilla_bn = "যশোর, শার্শা";
                break;
            case "4240":
                districtUpazilla = "Jhalokati, Jhalokati";
                districtUpazilla_bn = "ঝালকাঠি, ঝালকাঠি সদর";
                break;
            case "4243":
                districtUpazilla = "Jhalokati, Kanthalia";
                districtUpazilla_bn = "ঝালকাঠি, কাঁঠালিয়া";
                break;
            case "4273":
                districtUpazilla = "Jhalokati, Nalchity";
                districtUpazilla_bn = "ঝালকাঠি, নলছিটি";
                break;
            case "4284":
                districtUpazilla = "Jhalokati, Rajapur";
                districtUpazilla_bn = "ঝালকাঠি, রাজাপুর";
                break;
            case "4414":
                districtUpazilla = "Jhenaidah, Harinakunda";
                districtUpazilla_bn = "ঝিনাইদহ, হরিণাকুন্ডু";
                break;
            case "4419":
                districtUpazilla = "Jhenaidah, Jhenaidaha";
                districtUpazilla_bn = "ঝিনাইদহ, ঝিনাইদহ সদর";
                break;
            case "4433":
                districtUpazilla = "Jhenaidah, Kaliganj";
                districtUpazilla_bn = "ঝিনাইদহ, কালীগঞ্জ";
                break;
            case "4442":
                districtUpazilla = "Jhenaidah, Kotchandpur";
                districtUpazilla_bn = "ঝিনাইদহ, কোটচাঁদপুর";
                break;
            case "4471":
                districtUpazilla = "Jhenaidah, Maheshpur";
                districtUpazilla_bn = "ঝিনাইদহ, মহেশপুর";
                break;
            case "4480":
                districtUpazilla = "Jhenaidah, Shailkupa";
                districtUpazilla_bn = "ঝিনাইদহ, শৈলকুপা";
                break;
            case "4643":
                districtUpazilla = "Khagrachhari, Dighinala";
                districtUpazilla_bn = "খাগড়াছড়ি, দিঘীনালা";
                break;
            case "4649":
                districtUpazilla = "Khagrachhari, Khagrachhari";
                districtUpazilla_bn = "খাগড়াছড়ি, খাগড়াছড়ি সদর";
                break;
            case "4661":
                districtUpazilla = "Khagrachhari, Lakshmichhari";
                districtUpazilla_bn = "খাগড়াছড়ি, লক্ষীছড়ি";
                break;
            case "4665":
                districtUpazilla = "Khagrachhari, Mahalchhari";
                districtUpazilla_bn = "খাগড়াছড়ি, মহালছড়ি";
                break;
            case "4667":
                districtUpazilla = "Khagrachhari, Manikchhari";
                districtUpazilla_bn = "খাগড়াছড়ি, মানিকছড়ি";
                break;
            case "4670":
                districtUpazilla = "Khagrachhari, Matiranga";
                districtUpazilla_bn = "খাগড়াছড়ি, মাটিরাঙ্গা";
                break;
            case "4677":
                districtUpazilla = "Khagrachhari, Panchhari";
                districtUpazilla_bn = "খাগড়াছড়ি, পানছড়ি";
                break;
            case "4680":
                districtUpazilla = "Khagrachhari, Ramgarh";
                districtUpazilla_bn = "খাগড়াছড়ি, রামগড়";
                break;
            case "4712":
                districtUpazilla = "Khulna, Batiagahata";
                districtUpazilla_bn = "খুলনা, বটিয়াঘাটা";
                break;
            case "4717":
                districtUpazilla = "Khulna, Dacope";
                districtUpazilla_bn = "খুলনা, দাকোপ";
                break;
            case "4721":
                districtUpazilla = "Khulna, KCC (Daulatpur)";
                districtUpazilla_bn = "খুলনা, দৌলতপুর";
                break;
            case "4730":
                districtUpazilla = "Khulna, Dumuria";
                districtUpazilla_bn = "খুলনা, ডুমুরিয়া";
                break;
            case "4740":
                districtUpazilla = "Khulna, Dighalia";
                districtUpazilla_bn = "খুলনা, দিঘলিয়া";
                break;
            case "4745":
                districtUpazilla = "Khulna, KCC (Khalishpur)";
                districtUpazilla_bn = "খুলনা, খালিশপুর";
                break;
            case "4748":
                districtUpazilla = "Khulna, City Corporation";
                districtUpazilla_bn = "খুলনা, সিটি কর্পোরেশন";
                break;
            case "4751":
                districtUpazilla = "Khulna, KCC (Kotwali)";
                districtUpazilla_bn = "খুলনা, কোতয়ালী";
                break;
            case "4753":
                districtUpazilla = "Khulna, Koyra";
                districtUpazilla_bn = "খুলনা, কয়রা";
                break;
            case "4764":
                districtUpazilla = "Khulna, Paikgachha";
                districtUpazilla_bn = "খুলনা, পাইকগাছা";
                break;
            case "4769":
                districtUpazilla = "Khulna, Phultala";
                districtUpazilla_bn = "খুলনা, ফুলতলা";
                break;
            case "4775":
                districtUpazilla = "Khulna, Rupsa";
                districtUpazilla_bn = "খুলনা, রূপসা";
                break;
            case "4785":
                districtUpazilla = "Khulna, KCC (Sonadanga)";
                districtUpazilla_bn = "খুলনা, সোনাডাঙ্গা";
                break;
            case "4794":
                districtUpazilla = "Khulna, Terokhada";
                districtUpazilla_bn = "খুলনা, তেরখাদা";
                break;
            case "4802":
                districtUpazilla = "Kishoreganj, Austagram";
                districtUpazilla_bn = "কিশোরগঞ্জ, অষ্টগ্রাম";
                break;
            case "4806":
                districtUpazilla = "Kishoreganj, Bajitpur";
                districtUpazilla_bn = "কিশোরগঞ্জ, বাজিতপুর";
                break;
            case "4811":
                districtUpazilla = "Kishoreganj, Bhairab";
                districtUpazilla_bn = "কিশোরগঞ্জ, ভৈরব";
                break;
            case "4827":
                districtUpazilla = "Kishoreganj, Hossainpur";
                districtUpazilla_bn = "কিশোরগঞ্জ, হোসেনপুর";
                break;
            case "4833":
                districtUpazilla = "Kishoreganj, Itna";
                districtUpazilla_bn = "কিশোরগঞ্জ, ইটনা";
                break;
            case "4842":
                districtUpazilla = "Kishoreganj, Karimganj";
                districtUpazilla_bn = "কিশোরগঞ্জ, করিমগঞ্জ";
                break;
            case "4845":
                districtUpazilla = "Kishoreganj, Katiadi";
                districtUpazilla_bn = "কিশোরগঞ্জ, কটিয়াদী";
                break;
            case "4849":
                districtUpazilla = "Kishoreganj, Kishoregonj";
                districtUpazilla_bn = "কিশোরগঞ্জ, কিশোরগঞ্জ সদর";
                break;
            case "4854":
                districtUpazilla = "Kishoreganj, Kuliarchar";
                districtUpazilla_bn = "কিশোরগঞ্জ, কুলিয়ারচর";
                break;
            case "4859":
                districtUpazilla = "Kishoreganj, Mithamain";
                districtUpazilla_bn = "কিশোরগঞ্জ, মিঠামইন";
                break;
            case "4876":
                districtUpazilla = "Kishoreganj, Nikli";
                districtUpazilla_bn = "কিশোরগঞ্জ, নিকলী";
                break;
            case "4879":
                districtUpazilla = "Kishoreganj, Pakundia";
                districtUpazilla_bn = "কিশোরগঞ্জ, পাকুন্দিয়া";
                break;
            case "4892":
                districtUpazilla = "Kishoreganj, Tarail";
                districtUpazilla_bn = "কিশোরগঞ্জ, তাড়াইল";
                break;
            case "4906":
                districtUpazilla = "Kurigram, Bhurungamari";
                districtUpazilla_bn = "কুড়িগ্রাম, ভুরুঙ্গামারী";
                break;
            case "4908":
                districtUpazilla = "Kurigram, Char Rajibpur";
                districtUpazilla_bn = "কুড়িগ্রাম, চর রাজিবপুর";
                break;
            case "4909":
                districtUpazilla = "Kurigram, Chilmari";
                districtUpazilla_bn = "কুড়িগ্রাম, চিলমারী";
                break;
            case "4918":
                districtUpazilla = "Kurigram, Phulbari";
                districtUpazilla_bn = "কুড়িগ্রাম, ফুলবাড়ী";
                break;
            case "4952":
                districtUpazilla = "Kurigram, Kurigram";
                districtUpazilla_bn = "কুড়িগ্রাম, কুড়িগ্রাম সদর";
                break;
            case "4961":
                districtUpazilla = "Kurigram, Nageshwari";
                districtUpazilla_bn = "কুড়িগ্রাম, নাগেশ্বরী";
                break;
            case "4977":
                districtUpazilla = "Kurigram, Rajarhat";
                districtUpazilla_bn = "কুড়িগ্রাম, রাজারহাট";
                break;
            case "4979":
                districtUpazilla = "Kurigram, Raumari";
                districtUpazilla_bn = "কুড়িগ্রাম, রৌমারী";
                break;
            case "4994":
                districtUpazilla = "Kurigram, Ulipur";
                districtUpazilla_bn = "কুড়িগ্রাম, উলিপুর";
                break;
            case "5015":
                districtUpazilla = "Kushtia, Bheramara";
                districtUpazilla_bn = "কুষ্টিয়া, ভেড়ামারা";
                break;
            case "5039":
                districtUpazilla = "Kushtia, Daulatpur";
                districtUpazilla_bn = "কুষ্টিয়া, দৌলতপুর";
                break;
            case "5063":
                districtUpazilla = "Kushtia, Khoksa";
                districtUpazilla_bn = "কুষ্টিয়া, খোকসা";
                break;
            case "5071":
                districtUpazilla = "Kushtia, Kumarkhali";
                districtUpazilla_bn = "কুষ্টিয়া, কুমারখালী";
                break;
            case "5079":
                districtUpazilla = "Kushtia, Kushtia";
                districtUpazilla_bn = "কুষ্টিয়া, কুষ্টিয়া সদর";
                break;
            case "5094":
                districtUpazilla = "Kushtia, Mirpur";
                districtUpazilla_bn = "কুষ্টিয়া, মিরপুর";
                break;
            case "5143":
                districtUpazilla = "Lakshmipur, Lakshmipur";
                districtUpazilla_bn = "লক্ষ্মীপুর, লক্ষ্মীপুর সদর";
                break;
            case "5158":
                districtUpazilla = "Lakshmipur, Roypur";
                districtUpazilla_bn = "লক্ষ্মীপুর, রায়পুর";
                break;
            case "5165":
                districtUpazilla = "Lakshmipur, Ramganj";
                districtUpazilla_bn = "লক্ষ্মীপুর, রামগঞ্জ";
                break;
            case "5173":
                districtUpazilla = "Lakshmipur, Ramgati";
                districtUpazilla_bn = "লক্ষ্মীপুর, রামগতি";
                break;
            case "5202":
                districtUpazilla = "Lalmonirhat, Aditmari";
                districtUpazilla_bn = "লালমনিরহাট, আদিতমারী";
                break;
            case "5233":
                districtUpazilla = "Lalmonirhat, Hatibandha";
                districtUpazilla_bn = "লালমনিরহাট, হাতীবান্ধা";
                break;
            case "5239":
                districtUpazilla = "Lalmonirhat, Kaliganj";
                districtUpazilla_bn = "লালমনিরহাট, কালীগঞ্জ";
                break;
            case "5255":
                districtUpazilla = "Lalmonirhat, Lalmonirhat";
                districtUpazilla_bn = "লালমনিরহাট, লালমনিরহাট সদর";
                break;
            case "5270":
                districtUpazilla = "Lalmonirhat, Patgram";
                districtUpazilla_bn = "লালমনিরহাট, পাটগ্রাম";
                break;
            case "5440":
                districtUpazilla = "Madaripur, Kalkini";
                districtUpazilla_bn = "মাদারীপুর, কালকিনি";
                break;
            case "5454":
                districtUpazilla = "Madaripur, Madaripur";
                districtUpazilla_bn = "মাদারীপুর, মাদারীপুর সদর";
                break;
            case "5480":
                districtUpazilla = "Madaripur, Rajoir";
                districtUpazilla_bn = "মাদারীপুর, রাজৈর";
                break;
            case "5487":
                districtUpazilla = "Madaripur, Shib Char";
                districtUpazilla_bn = "মাদারীপুর, শিবচর";
                break;
            case "5557":
                districtUpazilla = "Magura, Magura";
                districtUpazilla_bn = "মাগুরা, মাগুরা সদর";
                break;
            case "5566":
                districtUpazilla = "Magura, Mahammadpur";
                districtUpazilla_bn = "মাগুরা, মহম্মদপুর";
                break;
            case "5585":
                districtUpazilla = "Magura, Shalikha";
                districtUpazilla_bn = "মাগুরা, শালিখা";
                break;
            case "5595":
                districtUpazilla = "Magura, Sripur";
                districtUpazilla_bn = "মাগুরা, শ্রীপুর";
                break;
            case "5610":
                districtUpazilla = "Manikganj, Dawlatpur";
                districtUpazilla_bn = "মানিকগঞ্জ, দৌলতপুর";
                break;
            case "5622":
                districtUpazilla = "Manikganj, Ghior";
                districtUpazilla_bn = "মানিকগঞ্জ, ঘিওর";
                break;
            case "5628":
                districtUpazilla = "Manikganj, Harirampur";
                districtUpazilla_bn = "মানিকগঞ্জ, হরিরামপুর";
                break;
            case "5646":
                districtUpazilla = "Manikganj, Manikganj";
                districtUpazilla_bn = "মানিকগঞ্জ, মানিকগঞ্জ সদর";
                break;
            case "5670":
                districtUpazilla = "Manikganj, Saturia";
                districtUpazilla_bn = "মানিকগঞ্জ, সাটুরিয়া";
                break;
            case "5678":
                districtUpazilla = "Manikganj, Shibalaya";
                districtUpazilla_bn = "মানিকগঞ্জ, শিবালয়";
                break;
            case "5682":
                districtUpazilla = "Manikganj, Singair";
                districtUpazilla_bn = "মানিকগঞ্জ, সিংগাইর";
                break;
            case "5747":
                districtUpazilla = "Meherpur, Gangni";
                districtUpazilla_bn = "মেহেরপুর, গাংনী";
                break;
            case "5760":
                districtUpazilla = "Meherpur, Mujibnagar";
                districtUpazilla_bn = "মেহেরপুর, মুজিবনগর";
                break;
            case "5787":
                districtUpazilla = "Meherpur, Meherpur";
                districtUpazilla_bn = "মেহেরপুর, মেহেরপুর সদর";
                break;
            case "5814":
                districtUpazilla = "Maulvibazar, Barlekha";
                districtUpazilla_bn = "মৌলভীবাজার, বড়লেখা";
                break;
            case "5815":
                districtUpazilla = "Maulvibazar, Juri";
                districtUpazilla_bn = "মৌলভীবাজার, জুড়ী";
                break;
            case "5856":
                districtUpazilla = "Maulvibazar, Kamalganj";
                districtUpazilla_bn = "মৌলভীবাজার, কমলগঞ্জ";
                break;
            case "5865":
                districtUpazilla = "Maulvibazar, Kulaura";
                districtUpazilla_bn = "মৌলভীবাজার, কুলাউড়া";
                break;
            case "5874":
                districtUpazilla = "Maulvibazar, Maulvibazar";
                districtUpazilla_bn = "মৌলভীবাজার, মৌলভীবাজার সদর";
                break;
            case "5880":
                districtUpazilla = "Maulvibazar, Rajnagar";
                districtUpazilla_bn = "মৌলভীবাজার, রাজনগর";
                break;
            case "5883":
                districtUpazilla = "Maulvibazar, Sreemangal";
                districtUpazilla_bn = "মৌলভীবাজার, শ্রীমঙ্গল";
                break;
            case "5924":
                districtUpazilla = "Munshiganj, Gazaria";
                districtUpazilla_bn = "মুন্সিগঞ্জ, গজারিয়া";
                break;
            case "5944":
                districtUpazilla = "Munshiganj, Lahajang";
                districtUpazilla_bn = "মুন্সিগঞ্জ, লৌহজং";
                break;
            case "5956":
                districtUpazilla = "Munshiganj, Munshiganj";
                districtUpazilla_bn = "মুন্সিগঞ্জ, মুন্সিগঞ্জ সদর";
                break;
            case "5974":
                districtUpazilla = "Munshiganj, Serajdikhan";
                districtUpazilla_bn = "মুন্সিগঞ্জ, সিরাজদিখান";
                break;
            case "5984":
                districtUpazilla = "Munshiganj, Sreenagar";
                districtUpazilla_bn = "মুন্সিগঞ্জ, শ্রীনগর";
                break;
            case "5994":
                districtUpazilla = "Munshiganj, Tongibari";
                districtUpazilla_bn = "মুন্সিগঞ্জ, টংগীবাড়ি";
                break;
            case "6113":
                districtUpazilla = "Mymensingh, Bhaluka";
                districtUpazilla_bn = "ময়মনসিংহ, ভালুকা";
                break;
            case "6116":
                districtUpazilla = "Mymensingh, Dhobaura";
                districtUpazilla_bn = "ময়মনসিংহ, ধোবাউড়া";
                break;
            case "6120":
                districtUpazilla = "Mymensingh, Fulbaria";
                districtUpazilla_bn = "ময়মনসিংহ, ফুলবাড়ীয়া";
                break;
            case "6122":
                districtUpazilla = "Mymensingh, Gaffargaon";
                districtUpazilla_bn = "ময়মনসিংহ, গফরগাঁও";
                break;
            case "6123":
                districtUpazilla = "Mymensingh, Gauripur";
                districtUpazilla_bn = "ময়মনসিংহ, গৌরীপুর";
                break;
            case "6124":
                districtUpazilla = "Mymensingh, Haluaghat";
                districtUpazilla_bn = "ময়মনসিংহ, হালুয়াঘাট";
                break;
            case "6131":
                districtUpazilla = "Mymensingh, Ishwarganj";
                districtUpazilla_bn = "ময়মনসিংহ, ঈশ্বরগঞ্জ";
                break;
            case "6152":
                districtUpazilla = "Mymensingh, Mymenshingh";
                districtUpazilla_bn = "ময়মনসিংহ, ময়মনসিংহ সদর";
                break;
            case "6165":
                districtUpazilla = "Mymensingh, Muktagachha";
                districtUpazilla_bn = "ময়মনসিংহ, মুক্তাগাছা";
                break;
            case "6172":
                districtUpazilla = "Mymensingh, Nandail";
                districtUpazilla_bn = "ময়মনসিংহ, নান্দাইল";
                break;
            case "6181":
                districtUpazilla = "Mymensingh, Phulpur";
                districtUpazilla_bn = "ময়মনসিংহ, ফুলপুর";
                break;
            case "6194":
                districtUpazilla = "Mymensingh, Trishal";
                districtUpazilla_bn = "ময়মনসিংহ, ত্রিশাল";
                break;
            case "6403":
                districtUpazilla = "Naogaon, Atrai";
                districtUpazilla_bn = "নওগাঁ, আত্রাই";
                break;
            case "6406":
                districtUpazilla = "Naogaon, Badalgachhi";
                districtUpazilla_bn = "নওগাঁ, বদলগাছী";
                break;
            case "6428":
                districtUpazilla = "Naogaon, Dhamourhat";
                districtUpazilla_bn = "নওগাঁ, ধামইরহাট";
                break;
            case "6447":
                districtUpazilla = "Naogaon, Manda";
                districtUpazilla_bn = "নওগাঁ, মান্দা";
                break;
            case "6450":
                districtUpazilla = "Naogaon, Mahadebpur";
                districtUpazilla_bn = "নওগাঁ, মহাদেবপুর";
                break;
            case "6460":
                districtUpazilla = "Naogaon, Naogaon";
                districtUpazilla_bn = "নওগাঁ, নওগাঁ সদর";
                break;
            case "6469":
                districtUpazilla = "Naogaon, Niamatpur";
                districtUpazilla_bn = "নওগাঁ, নিয়ামতপুর";
                break;
            case "6475":
                districtUpazilla = "Naogaon, Patnitala";
                districtUpazilla_bn = "নওগাঁ, পত্নিতলা";
                break;
            case "6479":
                districtUpazilla = "Naogaon, Porsha";
                districtUpazilla_bn = "নওগাঁ, পোরশা";
                break;
            case "6485":
                districtUpazilla = "Naogaon, Raninagar";
                districtUpazilla_bn = "নওগাঁ, রাণীনগর";
                break;
            case "6486":
                districtUpazilla = "Naogaon, Sapahar";
                districtUpazilla_bn = "নওগাঁ, সাপাহার";
                break;
            case "6528":
                districtUpazilla = "Narail, Kalia";
                districtUpazilla_bn = "নড়াইল, কালিয়া";
                break;
            case "6552":
                districtUpazilla = "Narail, Lohagara";
                districtUpazilla_bn = "নড়াইল, লোহাগড়া";
                break;
            case "6576":
                districtUpazilla = "Narail, Narail";
                districtUpazilla_bn = "নড়াইল, নড়াইল সদর";
                break;
            case "6702":
                districtUpazilla = "Narayanganj, Araihazar";
                districtUpazilla_bn = "নারায়নগঞ্জ, আড়াইহাজার";
                break;
            case "6704":
                districtUpazilla = "Narayanganj, Sonargaon";
                districtUpazilla_bn = "নারায়নগঞ্জ, সোনারগাঁ";
                break;
            case "6706":
                districtUpazilla = "Narayanganj, Bandar";
                districtUpazilla_bn = "নারায়নগঞ্জ, বন্দর";
                break;
            case "6758":
                districtUpazilla = "Narayanganj, Narayangonj";
                districtUpazilla_bn = "নারায়নগঞ্জ, নারায়নগঞ্জ সদর";
                break;
            case "6768":
                districtUpazilla = "Narayanganj, Rupganj";
                districtUpazilla_bn = "নারায়নগঞ্জ, রূপগঞ্জ";
                break;
            case "6807":
                districtUpazilla = "Narsingdi, Belabo";
                districtUpazilla_bn = "নরসিংদী, বেলাবো";
                break;
            case "6852":
                districtUpazilla = "Narsingdi, Manohardi";
                districtUpazilla_bn = "নরসিংদী, মনোহরদী";
                break;
            case "6860":
                districtUpazilla = "Narsingdi, Narsingdi";
                districtUpazilla_bn = "নরসিংদী, নরসিংদী সদর";
                break;
            case "6863":
                districtUpazilla = "Narsingdi, Palash";
                districtUpazilla_bn = "নরসিংদী, পলাশ";
                break;
            case "6864":
                districtUpazilla = "Narsingdi, Roypura";
                districtUpazilla_bn = "নরসিংদী, রায়পুরা";
                break;
            case "6876":
                districtUpazilla = "Narsingdi, Shibpur";
                districtUpazilla_bn = "নরসিংদী, শিবপুর";
                break;
            case "6909":
                districtUpazilla = "Natore, Bagatipara";
                districtUpazilla_bn = "নাটোর, বাগাতিপাড়া";
                break;
            case "6915":
                districtUpazilla = "Natore, Baraigram";
                districtUpazilla_bn = "নাটোর, বড়াইগ্রাম";
                break;
            case "6941":
                districtUpazilla = "Natore, Gurudaspur";
                districtUpazilla_bn = "নাটোর, গুরুদাসপুর";
                break;
            case "6944":
                districtUpazilla = "Natore, Lalpur";
                districtUpazilla_bn = "নাটোর, লালপুর";
                break;
            case "6963":
                districtUpazilla = "Natore, Natore";
                districtUpazilla_bn = "নাটোর, নাটোর সদর";
                break;
            case "6991":
                districtUpazilla = "Natore, Singra";
                districtUpazilla_bn = "নাটোর, সিংড়া";
                break;
            case "7018":
                districtUpazilla = "Chapai Nawabganj, Bholahat";
                districtUpazilla_bn = "নবাবগঞ্জ, ভোলাহাট";
                break;
            case "7037":
                districtUpazilla = "Chapai Nawabganj, Gomastapur";
                districtUpazilla_bn = "নবাবগঞ্জ, গোমস্তাপুর";
                break;
            case "7056":
                districtUpazilla = "Chapai Nawabganj, Nachole";
                districtUpazilla_bn = "নবাবগঞ্জ, নাচোল";
                break;
            case "7066":
                districtUpazilla = "Chapai Nawabganj, Chapai Nawabganj";
                districtUpazilla_bn = "নবাবগঞ্জ, চাঁপাইনবাবগঞ্জ সদর";
                break;
            case "7088":
                districtUpazilla = "Chapai Nawabganj, Shibganj";
                districtUpazilla_bn = "নবাবগঞ্জ, শিবগঞ্জ";
                break;
            case "7204":
                districtUpazilla = "Netrakona, Atpara";
                districtUpazilla_bn = "নেত্রকোনা, আটপাড়া";
                break;
            case "7209":
                districtUpazilla = "Netrakona, Barhatta";
                districtUpazilla_bn = "নেত্রকোনা, বারহাট্টা";
                break;
            case "7218":
                districtUpazilla = "Netrakona, Durgapur";
                districtUpazilla_bn = "নেত্রকোনা, দুর্গাপুর";
                break;
            case "7238":
                districtUpazilla = "Netrakona, Khaliajuri";
                districtUpazilla_bn = "নেত্রকোনা, খালিয়াজুরী";
                break;
            case "7240":
                districtUpazilla = "Netrakona, Kalmakanda";
                districtUpazilla_bn = "নেত্রকোনা, কলমাকান্দা";
                break;
            case "7247":
                districtUpazilla = "Netrakona, Kendua";
                districtUpazilla_bn = "নেত্রকোনা, কেন্দুয়া";
                break;
            case "7256":
                districtUpazilla = "Netrakona, Madan";
                districtUpazilla_bn = "নেত্রকোনা, মদন";
                break;
            case "7263":
                districtUpazilla = "Netrakona, Mohanganj";
                districtUpazilla_bn = "নেত্রকোনা, মোহনগঞ্জ";
                break;
            case "7274":
                districtUpazilla = "Netrakona, Netrakona";
                districtUpazilla_bn = "নেত্রকোনা, নেত্রকোনা সদর";
                break;
            case "7283":
                districtUpazilla = "Netrakona, Purba Dhala";
                districtUpazilla_bn = "নেত্রকোনা, পূর্ব ধলা";
                break;
            case "7312":
                districtUpazilla = "Nilphamari, Dimla";
                districtUpazilla_bn = "নীলফামারী, ডিমলা";
                break;
            case "7315":
                districtUpazilla = "Nilphamari, Domar";
                districtUpazilla_bn = "নীলফামারী, ডোমার";
                break;
            case "7336":
                districtUpazilla = "Nilphamari, Jaldhaka";
                districtUpazilla_bn = "নীলফামারী, জলঢাকা";
                break;
            case "7345":
                districtUpazilla = "Nilphamari, Kishoreganj";
                districtUpazilla_bn = "নীলফামারী, কিশোরগঞ্জ";
                break;
            case "7364":
                districtUpazilla = "Nilphamari, Nilphamari";
                districtUpazilla_bn = "নীলফামারী, নীলফামারী সদর";
                break;
            case "7385":
                districtUpazilla = "Nilphamari, Saidpur";
                districtUpazilla_bn = "নীলফামারী, সৈয়দপুর";
                break;
            case "7507":
                districtUpazilla = "Noakhali, Begumganj";
                districtUpazilla_bn = "নোয়াখালী, বেগমগঞ্জ";
                break;
            case "7508":
                districtUpazilla = "Noakhali, Sonaimuri";
                districtUpazilla_bn = "নোয়াখালী, সোনাইমুড়ী";
                break;
            case "7510":
                districtUpazilla = "Noakhali, Chatkhil";
                districtUpazilla_bn = "নোয়াখালী, চাটখিল";
                break;
            case "7521":
                districtUpazilla = "Noakhali, Companiganj";
                districtUpazilla_bn = "নোয়াখালী, কোম্পানীগঞ্জ";
                break;
            case "7536":
                districtUpazilla = "Noakhali, Hatiya";
                districtUpazilla_bn = "নোয়াখালী, হাতিয়া";
                break;
            case "7580":
                districtUpazilla = "Noakhali, Senbagh";
                districtUpazilla_bn = "নোয়াখালী, সেনবাগ";
                break;
            case "7587":
                districtUpazilla = "Noakhali, Noakhali";
                districtUpazilla_bn = "নোয়াখালী, নোয়াখালী সদর";
                break;
            case "7588":
                districtUpazilla = "Noakhali, Subarnachar";
                districtUpazilla_bn = "নোয়াখালী, সুবর্ণচর";
                break;
            case "7589":
                districtUpazilla = "Noakhali, Kabirhat";
                districtUpazilla_bn = "নোয়াখালী, কবিরহাট";
                break;
            case "7605":
                districtUpazilla = "Pabna, Atgharia";
                districtUpazilla_bn = "পাবনা, আটঘরিয়া";
                break;
            case "7616":
                districtUpazilla = "Pabna, Bera";
                districtUpazilla_bn = "পাবনা, বেড়া";
                break;
            case "7619":
                districtUpazilla = "Pabna, Bhangura";
                districtUpazilla_bn = "পাবনা, ভাঙ্গুড়া";
                break;
            case "7622":
                districtUpazilla = "Pabna, Chatmohar";
                districtUpazilla_bn = "পাবনা, চাটমোহর";
                break;
            case "7633":
                districtUpazilla = "Pabna, Fareedpur";
                districtUpazilla_bn = "পাবনা, ফরিদপুর";
                break;
            case "7639":
                districtUpazilla = "Pabna, Ishwardi";
                districtUpazilla_bn = "পাবনা, ঈশ্বরদী";
                break;
            case "7655":
                districtUpazilla = "Pabna, Pabna";
                districtUpazilla_bn = "পাবনা, পাবনা সদর";
                break;
            case "7672":
                districtUpazilla = "Pabna, Santhia";
                districtUpazilla_bn = "পাবনা, সাঁথিয়া";
                break;
            case "7683":
                districtUpazilla = "Pabna, Sujanagar";
                districtUpazilla_bn = "পাবনা, সুজানগর";
                break;
            case "7704":
                districtUpazilla = "Panchagarh, Atwari";
                districtUpazilla_bn = "পঞ্চগড়, আটোয়ারী";
                break;
            case "7725":
                districtUpazilla = "Panchagarh, Boda";
                districtUpazilla_bn = "পঞ্চগড়, বোদা";
                break;
            case "7734":
                districtUpazilla = "Panchagarh, Debiganj";
                districtUpazilla_bn = "পঞ্চগড়, দেবীগঞ্জ";
                break;
            case "7773":
                districtUpazilla = "Panchagarh, Panchagarh Sadar";
                districtUpazilla_bn = "পঞ্চগড়, পঞ্চগড় সদর";
                break;
            case "7790":
                districtUpazilla = "Panchagarh, Tentulia";
                districtUpazilla_bn = "পঞ্চগড়, তেতুলিয়া";
                break;
            case "7838":
                districtUpazilla = "Patuakhali, Bauphal";
                districtUpazilla_bn = "পটুয়াখালী, বাউফল";
                break;
            case "7852":
                districtUpazilla = "Patuakhali, Dashmina";
                districtUpazilla_bn = "পটুয়াখালী, দশমিনা";
                break;
            case "7855":
                districtUpazilla = "Patuakhali, Dumki";
                districtUpazilla_bn = "পটুয়াখালী, দুমকি";
                break;
            case "7857":
                districtUpazilla = "Patuakhali, Galachipa";
                districtUpazilla_bn = "পটুয়াখালী, গলাচিপা";
                break;
            case "7866":
                districtUpazilla = "Patuakhali, Kalapara";
                districtUpazilla_bn = "পটুয়াখালী, কলাপাড়া";
                break;
            case "7876":
                districtUpazilla = "Patuakhali, Mirzapur";
                districtUpazilla_bn = "পটুয়াখালী, মির্জাগঞ্জ";
                break;
            case "7895":
                districtUpazilla = "Patuakhali, Patuakhali";
                districtUpazilla_bn = "পটুয়াখালী, পটুয়াখালী সদর";
                break;
            case "7914":
                districtUpazilla = "Pirojpur, Bandaria";
                districtUpazilla_bn = "পিরোজপুর, ভান্ডারিয়া";
                break;
            case "7947":
                districtUpazilla = "Pirojpur, Kawkhali";
                districtUpazilla_bn = "পিরোজপুর, কাউখালী";
                break;
            case "7958":
                districtUpazilla = "Pirojpur, Mothbaria";
                districtUpazilla_bn = "পিরোজপুর, মঠবাড়ীয়া";
                break;
            case "7976":
                districtUpazilla = "Pirojpur, Nazirpur";
                districtUpazilla_bn = "পিরোজপুর, নাজিরপুর";
                break;
            case "7980":
                districtUpazilla = "Pirojpur, Pirojpur";
                districtUpazilla_bn = "পিরোজপুর, পিরোজপুর সদর";
                break;
            case "7987":
                districtUpazilla = "Pirojpur, Nesarabad";
                districtUpazilla_bn = "পিরোজপুর, নেছারাবাদ";
                break;
            case "7988":
                districtUpazilla = "Pirojpur, Zianagar";
                districtUpazilla_bn = "পিরোজপুর, জিয়ানগর";
                break;
            case "8110":
                districtUpazilla = "Rajshahi, Bagha";
                districtUpazilla_bn = "রাজশাহী, বাঘা";
                break;
            case "8112":
                districtUpazilla = "Rajshahi, Baghmara";
                districtUpazilla_bn = "রাজশাহী, বাগমারা";
                break;
            case "8122":
                districtUpazilla = "Rajshahi, RCC (Boalia)";
                districtUpazilla_bn = "রাজশাহী, বোয়ালিয়া";
                break;
            case "8125":
                districtUpazilla = "Rajshahi, Charghat";
                districtUpazilla_bn = "রাজশাহী, চারঘাট";
                break;
            case "8131":
                districtUpazilla = "Rajshahi, Dugapur";
                districtUpazilla_bn = "রাজশাহী, দুর্গাপুর";
                break;
            case "8134":
                districtUpazilla = "Rajshahi, Godagari";
                districtUpazilla_bn = "রাজশাহী, গোদাগাড়ী";
                break;
            case "8140":
                districtUpazilla = "Rajshahi, RCC (Motihar)";
                districtUpazilla_bn = "রাজশাহী, মতিহার";
                break;
            case "8153":
                districtUpazilla = "Rajshahi, Mohanpur";
                districtUpazilla_bn = "রাজশাহী, মোহনপুর";
                break;
            case "8172":
                districtUpazilla = "Rajshahi, Paba";
                districtUpazilla_bn = "রাজশাহী, পবা";
                break;
            case "8182":
                districtUpazilla = "Rajshahi, Puthia";
                districtUpazilla_bn = "রাজশাহী, পুঠিয়া";
                break;
            case "8185":
                districtUpazilla = "Rajshahi, RCC (Rajpara)";
                districtUpazilla_bn = "রাজশাহী, রাজপাড়া";
                break;
            case "8190":
                districtUpazilla = "Rajshahi, RCC (Shahmokhdum)";
                districtUpazilla_bn = "রাজশাহী, শাহামখদুম";
                break;
            case "8194":
                districtUpazilla = "Rajshahi, Tanore";
                districtUpazilla_bn = "রাজশাহী, তানোর";
                break;
            case "8207":
                districtUpazilla = "Rajbari, Baliakandi";
                districtUpazilla_bn = "রাজবাড়ী, বালিয়াকান্দি";
                break;
            case "8229":
                districtUpazilla = "Rajbari, Goalanda";
                districtUpazilla_bn = "রাজবাড়ী, গোয়ালন্দ";
                break;
            case "8273":
                districtUpazilla = "Rajbari, Pangsha";
                districtUpazilla_bn = "রাজবাড়ী, পাংশা";
                break;
            case "8276":
                districtUpazilla = "Rajbari, Rajbari";
                districtUpazilla_bn = "রাজবাড়ী, রাজবাড়ী সদর";
                break;
            case "8407":
                districtUpazilla = "Rangamati, Baghaichhari";
                districtUpazilla_bn = "রাঙ্গামাটি, বাঘাইছড়ি";
                break;
            case "8421":
                districtUpazilla = "Rangamati, Barkal";
                districtUpazilla_bn = "রাঙ্গামাটি, বরকল";
                break;
            case "8425":
                districtUpazilla = "Rangamati, Kawkhali";
                districtUpazilla_bn = "রাঙ্গামাটি, কাউখালী";
                break;
            case "8429":
                districtUpazilla = "Rangamati, Belaichhari";
                districtUpazilla_bn = "রাঙ্গামাটি, বিলাইছড়ি";
                break;
            case "8436":
                districtUpazilla = "Rangamati, Kaptai";
                districtUpazilla_bn = "রাঙ্গামাটি, কাপ্তাই";
                break;
            case "8447":
                districtUpazilla = "Rangamati, Juraichhari";
                districtUpazilla_bn = "রাঙ্গামাটি, জুরাছড়ি";
                break;
            case "8458":
                districtUpazilla = "Rangamati, Langadu";
                districtUpazilla_bn = "রাঙ্গামাটি, লংগদু";
                break;
            case "8475":
                districtUpazilla = "Rangamati, Nanner Char";
                districtUpazilla_bn = "রাঙ্গামাটি, নানিয়ারচর";
                break;
            case "8478":
                districtUpazilla = "Rangamati, Rajasthali";
                districtUpazilla_bn = "রাঙ্গামাটি, রাজস্থলী";
                break;
            case "8487":
                districtUpazilla = "Rangamati, Rangamati";
                districtUpazilla_bn = "রাঙ্গামাটি, রাঙ্গামাটি সদর";
                break;
            case "8503":
                districtUpazilla = "Rangpur, Badarganj";
                districtUpazilla_bn = "রংপুর, বদরগঞ্জ";
                break;
            case "8527":
                districtUpazilla = "Rangpur, Gangachara";
                districtUpazilla_bn = "রংপুর, গংগাচড়া";
                break;
            case "8542":
                districtUpazilla = "Rangpur, Kaunia";
                districtUpazilla_bn = "রংপুর, কাউনিয়া";
                break;
            case "8549":
                districtUpazilla = "Rangpur, Rangpur";
                districtUpazilla_bn = "রংপুর, রংপুর সদর";
                break;
            case "8558":
                districtUpazilla = "Rangpur, Mithapukur";
                districtUpazilla_bn = "রংপুর, মিঠাপুকুর";
                break;
            case "8573":
                districtUpazilla = "Rangpur, Pirgachha";
                districtUpazilla_bn = "রংপুর, পীরগাছা";
                break;
            case "8576":
                districtUpazilla = "Rangpur, Pirganj";
                districtUpazilla_bn = "রংপুর, পীরগঞ্জ";
                break;
            case "8592":
                districtUpazilla = "Rangpur, Taraganj";
                districtUpazilla_bn = "রংপুর, তারাগঞ্জ";
                break;
            case "8614":
                districtUpazilla = "Shariatpur, Bhedarganj";
                districtUpazilla_bn = "শরীয়তপুর, ভেদরগঞ্জ";
                break;
            case "8625":
                districtUpazilla = "Shariatpur, Damudya";
                districtUpazilla_bn = "শরীয়তপুর, ডামুড্যা";
                break;
            case "8636":
                districtUpazilla = "Shariatpur, Gosairhat";
                districtUpazilla_bn = "শরীয়তপুর, গোসাইরহাট";
                break;
            case "8665":
                districtUpazilla = "Shariatpur, Naria";
                districtUpazilla_bn = "শরীয়তপুর, নড়িয়া";
                break;
            case "8669":
                districtUpazilla = "Shariatpur, Palong";
                districtUpazilla_bn = "শরীয়তপুর, শরিয়তপুর সদর";
                break;
            case "8694":
                districtUpazilla = "Shariatpur, Zanjira";
                districtUpazilla_bn = "শরীয়তপুর, জাজিরা";
                break;
            case "8704":
                districtUpazilla = "Satkhira, Assasuni";
                districtUpazilla_bn = "সাতক্ষীরা, আশাশুনি";
                break;
            case "8725":
                districtUpazilla = "Satkhira, Debhata";
                districtUpazilla_bn = "সাতক্ষীরা, দেবহাটা";
                break;
            case "8743":
                districtUpazilla = "Satkhira, Kalaroa";
                districtUpazilla_bn = "সাতক্ষীরা, কলারোয়া";
                break;
            case "8747":
                districtUpazilla = "Satkhira, Kaliganj";
                districtUpazilla_bn = "সাতক্ষীরা, কালিগঞ্জ";
                break;
            case "8782":
                districtUpazilla = "Satkhira, Satkhira";
                districtUpazilla_bn = "সাতক্ষীরা, সাতক্ষীরা সদর";
                break;
            case "8786":
                districtUpazilla = "Satkhira, Shyamnagar";
                districtUpazilla_bn = "সাতক্ষীরা, শ্যামনগর";
                break;
            case "8790":
                districtUpazilla = "Satkhira, Tala";
                districtUpazilla_bn = "সাতক্ষীরা, তালা";
                break;
            case "8811":
                districtUpazilla = "Sirajganj, Belkuchi";
                districtUpazilla_bn = "সিরাজগঞ্জ, বেলকুচি";
                break;
            case "8827":
                districtUpazilla = "Sirajganj, Chauhali";
                districtUpazilla_bn = "সিরাজগঞ্জ, চৌহালি";
                break;
            case "8844":
                districtUpazilla = "Sirajganj, Kamarkhanda";
                districtUpazilla_bn = "সিরাজগঞ্জ, কামারখন্দ";
                break;
            case "8850":
                districtUpazilla = "Sirajganj, Kazipur";
                districtUpazilla_bn = "সিরাজগঞ্জ, কাজীপুর";
                break;
            case "8861":
                districtUpazilla = "Sirajganj, Royganj";
                districtUpazilla_bn = "সিরাজগঞ্জ, রায়গঞ্জ";
                break;
            case "8867":
                districtUpazilla = "Sirajganj, Shahjadpur";
                districtUpazilla_bn = "সিরাজগঞ্জ, শাহজাদপুর";
                break;
            case "8878":
                districtUpazilla = "Sirajganj, Sirajganj";
                districtUpazilla_bn = "সিরাজগঞ্জ, সিরাজগঞ্জ সদর";
                break;
            case "8889":
                districtUpazilla = "Sirajganj, Tarash";
                districtUpazilla_bn = "সিরাজগঞ্জ, তাড়াশ";
                break;
            case "8894":
                districtUpazilla = "Sirajganj, Ullahpara";
                districtUpazilla_bn = "সিরাজগঞ্জ, উল্লাপাড়া";
                break;
            case "8937":
                districtUpazilla = "Sherpur, Jhenaigati";
                districtUpazilla_bn = "শেরপুর, ঝিনাইগাতী";
                break;
            case "8967":
                districtUpazilla = "Sherpur, Nakla";
                districtUpazilla_bn = "শেরপুর, নকলা";
                break;
            case "8970":
                districtUpazilla = "Sherpur, Nalitabari";
                districtUpazilla_bn = "শেরপুর, নালিতাবাড়ী";
                break;
            case "8988":
                districtUpazilla = "Sherpur, Sherpur";
                districtUpazilla_bn = "শেরপুর, শেরপুর সদর";
                break;
            case "8990":
                districtUpazilla = "Sherpur, Sreebardi";
                districtUpazilla_bn = "শেরপুর, শ্রীবরদী";
                break;
            case "9018":
                districtUpazilla = "Sunamganj, Bishwambarpur";
                districtUpazilla_bn = "সুনামগঞ্জ, বিশ্বম্ভরপুর";
                break;
            case "9023":
                districtUpazilla = "Sunamganj, Chattak";
                districtUpazilla_bn = "সুনামগঞ্জ, ছাতক";
                break;
            case "9029":
                districtUpazilla = "Sunamganj, Derai";
                districtUpazilla_bn = "সুনামগঞ্জ, দিরাই";
                break;
            case "9032":
                districtUpazilla = "Sunamganj, Dharampasha";
                districtUpazilla_bn = "সুনামগঞ্জ, ধর্মপাশা";
                break;
            case "9033":
                districtUpazilla = "Sunamganj, Dowarabazar";
                districtUpazilla_bn = "সুনামগঞ্জ, দোয়ারাবাজার";
                break;
            case "9047":
                districtUpazilla = "Sunamganj, Jagannathpur";
                districtUpazilla_bn = "সুনামগঞ্জ, জগন্নাথপুর";
                break;
            case "9050":
                districtUpazilla = "Sunamganj, Jamalganj";
                districtUpazilla_bn = "সুনামগঞ্জ, জামালগঞ্জ";
                break;
            case "9086":
                districtUpazilla = "Sunamganj, Sulla";
                districtUpazilla_bn = "সুনামগঞ্জ, শাল্লা";
                break;
            case "9089":
                districtUpazilla = "Sunamganj, Sunamganj";
                districtUpazilla_bn = "সুনামগঞ্জ, সুনামগঞ্জ সদর";
                break;
            case "9090":
                districtUpazilla = "Sunamganj, South Sunamganj";
                districtUpazilla_bn = "সুনামগঞ্জ, দক্ষিণ সুনামগঞ্জ";
                break;
            case "9092":
                districtUpazilla = "Sunamganj, Tahirpur";
                districtUpazilla_bn = "সুনামগঞ্জ, তাহিরপুর";
                break;
            case "9108":
                districtUpazilla = "Sylhet, Balaganj";
                districtUpazilla_bn = "সিলেট, বালাগঞ্জ";
                break;
            case "9117":
                districtUpazilla = "Sylhet, Beanibazar";
                districtUpazilla_bn = "সিলেট, বিয়ানীবাজার";
                break;
            case "9120":
                districtUpazilla = "Sylhet, Bishwanath";
                districtUpazilla_bn = "সিলেট, বিশ্বনাথ";
                break;
            case "9127":
                districtUpazilla = "Sylhet, Companigonj";
                districtUpazilla_bn = "সিলেট, কোম্পানীগঞ্জ";
                break;
            case "9135":
                districtUpazilla = "Sylhet, Fenchuganj";
                districtUpazilla_bn = "সিলেট, ফেঞ্চুগঞ্জ";
                break;
            case "9138":
                districtUpazilla = "Sylhet, Golabganj";
                districtUpazilla_bn = "সিলেট, গোলাপগঞ্জ";
                break;
            case "9141":
                districtUpazilla = "Sylhet, Gowainghat";
                districtUpazilla_bn = "সিলেট, গোয়াইনঘাট";
                break;
            case "9153":
                districtUpazilla = "Sylhet, Jaintiapur";
                districtUpazilla_bn = "সিলেট, জৈন্তাপুর";
                break;
            case "9159":
                districtUpazilla = "Sylhet, Kanaighat";
                districtUpazilla_bn = "সিলেট, কানাইঘাট";
                break;
            case "9162":
                districtUpazilla = "Sylhet, Sylhet";
                districtUpazilla_bn = "সিলেট, সিলেট সদর";
                break;
            case "9163":
                districtUpazilla = "Sylhet, South Surma";
                districtUpazilla_bn = "সিলেট, দক্ষিণ সুরমা";
                break;
            case "9194":
                districtUpazilla = "Sylhet, Zakiganj";
                districtUpazilla_bn = "সিলেট, জকিগঞ্জ";
                break;
            case "9309":
                districtUpazilla = "Tangail, Basail";
                districtUpazilla_bn = "টাঙ্গাইল, বাসাইল";
                break;
            case "9319":
                districtUpazilla = "Tangail, Bhuapur";
                districtUpazilla_bn = "টাঙ্গাইল, ভুয়াপুর";
                break;
            case "9323":
                districtUpazilla = "Tangail, Delduar";
                districtUpazilla_bn = "টাঙ্গাইল, দেলদুয়ার";
                break;
            case "9328":
                districtUpazilla = "Tangail, Ghatail";
                districtUpazilla_bn = "টাঙ্গাইল, ঘাটাইল";
                break;
            case "9338":
                districtUpazilla = "Tangail, Gopalpur";
                districtUpazilla_bn = "টাঙ্গাইল, গোপালপুর";
                break;
            case "9347":
                districtUpazilla = "Tangail, Kalihati";
                districtUpazilla_bn = "টাঙ্গাইল, কালিহাতী";
                break;
            case "9357":
                districtUpazilla = "Tangail, Madhupur";
                districtUpazilla_bn = "টাঙ্গাইল, মধুপুর";
                break;
            case "9358":
                districtUpazilla = "Tangail, Dhanbari";
                districtUpazilla_bn = "টাঙ্গাইল, ধনবাড়ী";
                break;
            case "9366":
                districtUpazilla = "Tangail, Mirzapur";
                districtUpazilla_bn = "টাঙ্গাইল, মির্জাপুর";
                break;
            case "9376":
                districtUpazilla = "Tangail, Nagarpur";
                districtUpazilla_bn = "টাঙ্গাইল, নাগরপুর";
                break;
            case "9385":
                districtUpazilla = "Tangail, Sakhipur";
                districtUpazilla_bn = "টাঙ্গাইল, সখিপুর";
                break;
            case "9395":
                districtUpazilla = "Tangail, Tangail";
                districtUpazilla_bn = "টাঙ্গাইল, টাঙ্গাইল সদর";
                break;
            case "9408":
                districtUpazilla = "Thakurgaon, Baliadangi";
                districtUpazilla_bn = "ঠাকুরগাঁ, বালিয়াডাঙ্গী";
                break;
            case "9451":
                districtUpazilla = "Thakurgaon, Haripur";
                districtUpazilla_bn = "ঠাকুরগাঁ, হরিপুর";
                break;
            case "9482":
                districtUpazilla = "Thakurgaon, Pirganj";
                districtUpazilla_bn = "ঠাকুরগাঁ, পীরগঞ্জ";
                break;
            case "9486":
                districtUpazilla = "Thakurgaon, Ranisankail";
                districtUpazilla_bn = "ঠাকুরগাঁ, রাণীশংকৈল";
                break;
            case "9494":
                districtUpazilla = "Thakurgaon, Thakurgaon";
                districtUpazilla_bn = "ঠাকুরগাঁ, ঠাকুরগাঁও সদর";
                break;
            default:
                districtUpazilla = "";
                districtUpazilla_bn = "";
                break;
        }

        if (languageSelection == 0)
            return districtUpazilla;
        else
            return districtUpazilla_bn;

    }

}
