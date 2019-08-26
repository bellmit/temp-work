package com.max.core.utils;

import java.util.HashMap;
import java.util.Map;

public class InternationalSmsArea {
    private static Map<String, String> areaMap = new HashMap<>();

    static {
        areaMap.put("+1", "美国/加拿大");
        areaMap.put("+7", "俄罗斯/哈萨克");
        areaMap.put("+20", "埃及");
        areaMap.put("+27", "南非");
        areaMap.put("+30", "希腊");
        areaMap.put("+31", "荷兰");
        areaMap.put("+32", "比利时");
        areaMap.put("+33", "法国");
        areaMap.put("+34", "西班牙");
        areaMap.put("+36", "匈牙利");
        areaMap.put("+39", "意大利");
        areaMap.put("+40", "罗马尼亚");
        areaMap.put("+41", "瑞士");
        areaMap.put("+43", "奥地利");
        areaMap.put("+44", "英国");
        areaMap.put("+45", "丹麦");
        areaMap.put("+46", "瑞典");
        areaMap.put("+47", "挪威");
        areaMap.put("+48", "波兰");
        areaMap.put("+49", "德国");
        areaMap.put("+51", "秘鲁");
        areaMap.put("+52", "墨西哥");
        areaMap.put("+53", "古巴");
        areaMap.put("+54", "阿根廷");
        areaMap.put("+55", "巴西");
        areaMap.put("+56", "智利");
        areaMap.put("+57", "哥伦比亚");
        areaMap.put("+58", "委内瑞拉");
        areaMap.put("+60", "马来西亚");
        areaMap.put("+61", "澳洲");
        areaMap.put("+62", "印度尼西亚");
        areaMap.put("+63", "菲律宾");
        areaMap.put("+64", "新西兰");
        areaMap.put("+65", "新加坡");
        areaMap.put("+66", "泰国");
        areaMap.put("+81", "日本");
        areaMap.put("+82", "韩国");
        areaMap.put("+84", "越南");
        areaMap.put("+90", "土耳其");
        areaMap.put("+91", "印度");
        areaMap.put("+92", "巴基斯坦");
        areaMap.put("+93", "阿富汗");
        areaMap.put("+94", "斯里兰卡");
        areaMap.put("+95", "缅甸");
        areaMap.put("+98", "伊朗");
        areaMap.put("+211", "南苏丹");
        areaMap.put("+212", "摩洛哥");
        areaMap.put("+213", "阿尔及利亚");
        areaMap.put("+216", "突尼斯");
        areaMap.put("+218", "利比亚");
        areaMap.put("+220", "冈比亚");
        areaMap.put("+221", "塞内加尔");
        areaMap.put("+222", "毛里塔尼亚");
        areaMap.put("+223", "马里共和国");
        areaMap.put("+224", "几内亚");
        areaMap.put("+225", "科特迪瓦");
        areaMap.put("+226", "布基纳法索");
        areaMap.put("+227", "尼日");
        areaMap.put("+228", "多哥");
        areaMap.put("+229", "贝宁");
        areaMap.put("+230", "毛里求斯");
        areaMap.put("+231", "利比里亚");
        areaMap.put("+232", "狮子山共和国");
        areaMap.put("+233", "加纳");
        areaMap.put("+234", "尼日利亚");
        areaMap.put("+235", "查德");
        areaMap.put("+236", "中非共和国");
        areaMap.put("+237", "喀麦隆");
        areaMap.put("+238", "佛得角");
        areaMap.put("+239", "圣多美普林西比");
        areaMap.put("+240", "赤道几内亚");
        areaMap.put("+241", "加蓬");
        areaMap.put("+242", "刚果共和国");
        areaMap.put("+243", "刚果民主共和国");
        areaMap.put("+244", "安哥拉");
        areaMap.put("+245", "几内亚比绍");
        areaMap.put("+247", "阿森松岛");
        areaMap.put("+248", "塞舌尔");
        areaMap.put("+249", "苏丹");
        areaMap.put("+250", "卢旺达");
        areaMap.put("+251", "埃塞俄比亚");
        areaMap.put("+252", "索马里");
        areaMap.put("+253", "吉布提");
        areaMap.put("+254", "肯尼亚");
        areaMap.put("+255", "坦桑尼亚");
        areaMap.put("+256", "乌干达");
        areaMap.put("+257", "布隆迪");
        areaMap.put("+258", "莫桑比克");
        areaMap.put("+260", "赞比亚");
        areaMap.put("+261", "马达加斯加");
        areaMap.put("+262", "留尼汪 (法国)");
        areaMap.put("+263", "津巴布韦");
        areaMap.put("+264", "纳米比亚");
        areaMap.put("+265", "马拉维");
        areaMap.put("+266", "莱索托");
        areaMap.put("+267", "博茨瓦纳");
        areaMap.put("+268", "斯威士兰");
        areaMap.put("+269", "科摩罗/马约特");
        areaMap.put("+297", "阿鲁巴 (荷兰王国)");
        areaMap.put("+298", "法罗群岛 (丹麦)");
        areaMap.put("+299", "格陵兰 (丹麦)");
        areaMap.put("+350", "直布罗陀 (英国)");
        areaMap.put("+351", "葡萄牙");
        areaMap.put("+352", "卢森堡");
        areaMap.put("+389", "马其顿");
        areaMap.put("+353", "爱尔兰共和国");
        areaMap.put("+354", "冰岛");
        areaMap.put("+355", "阿尔巴尼亚");
        areaMap.put("+356", "马耳他");
        areaMap.put("+357", "塞浦路斯");
        areaMap.put("+358", "芬兰");
        areaMap.put("+359", "保加利亚");
        areaMap.put("+370", "立陶宛");
        areaMap.put("+371", "拉脱维亚");
        areaMap.put("+372", "爱沙尼亚");
        areaMap.put("+373", "摩尔多瓦");
        areaMap.put("+374", "亚美尼亚");
        areaMap.put("+375", "白俄罗斯");
        areaMap.put("+376", "安道尔");
        areaMap.put("+377", "摩纳哥");
        areaMap.put("+378", "圣马力诺");
        areaMap.put("+380", "乌克兰");
        areaMap.put("+381", "塞尔维亚共和国");
        areaMap.put("+382", "黑山共和国");
        areaMap.put("+385", "克罗地亚");
        areaMap.put("+386", "斯洛文尼亚");
        areaMap.put("+387", "波斯尼亚与赫塞哥维纳");
        areaMap.put("+420", "捷克");
        areaMap.put("+421", "斯洛伐克");
        areaMap.put("+423", "列支敦士登");
        areaMap.put("+501", "伯利兹");
        areaMap.put("+502", "危地马拉");
        areaMap.put("+503", "萨尔瓦多");
        areaMap.put("+504", "洪都拉斯");
        areaMap.put("+505", "尼加拉瓜");
        areaMap.put("+506", "哥斯达黎加");
        areaMap.put("+507", "巴拿马");
        areaMap.put("+508", "圣皮耶与密克隆群岛 (法国)");
        areaMap.put("+509", "海地");
        areaMap.put("+590", "瓜德罗普岛/圣马丁岛");
        areaMap.put("+591", "玻利维亚");
        areaMap.put("+592", "圭亚那");
        areaMap.put("+593", "厄瓜多尔");
        areaMap.put("+594", "法属圭亚那 (法国)");
        areaMap.put("+595", "巴拉圭");
        areaMap.put("+596", "马提尼克 (法国)");
        areaMap.put("+597", "苏里南");
        areaMap.put("+598", "乌拉圭");
        areaMap.put("+599", "博内尔岛，圣尤斯特歇斯和/库拉索");
        areaMap.put("+670", "东帝汶");
        areaMap.put("+673", "文莱");
        areaMap.put("+675", "巴布亚新几内亚");
        areaMap.put("+676", "东加");
        areaMap.put("+677", "所罗门群岛");
        areaMap.put("+678", "瓦努阿图");
        areaMap.put("+679", "斐济");
        areaMap.put("+680", "帕劳");
        areaMap.put("+682", "库克群岛 (新西兰)");
        areaMap.put("+685", "萨摩亚");
        areaMap.put("+686", "基里巴斯");
        areaMap.put("+687", "新喀里多尼亚 (法国)");
        areaMap.put("+689", "法属波利尼西亚 (法国)");
        areaMap.put("+852", "香港");
        areaMap.put("+853", "澳门");
        areaMap.put("+855", "柬埔寨");
        areaMap.put("+856", "老挝");
        areaMap.put("+880", "孟加拉国");
        areaMap.put("+886", "台湾");
        areaMap.put("+930", "巴勒斯坦");
        areaMap.put("+960", "马尔代夫");
        areaMap.put("+961", "黎巴嫩");
        areaMap.put("+962", "约旦");
        areaMap.put("+963", "叙利亚");
        areaMap.put("+964", "伊拉克");
        areaMap.put("+965", "科威特");
        areaMap.put("+966", "沙特阿拉伯");
        areaMap.put("+967", "也门");
        areaMap.put("+968", "阿曼");
        areaMap.put("+971", "阿拉伯联合酋长国");
        areaMap.put("+972", "以色列");
        areaMap.put("+973", "巴林");
        areaMap.put("+974", "卡达");
        areaMap.put("+975", "不丹");
        areaMap.put("+976", "蒙古国");
        areaMap.put("+977", "尼泊尔");
        areaMap.put("+992", "塔吉克");
        areaMap.put("+993", "土库曼");
        areaMap.put("+994", "阿塞拜疆");
        areaMap.put("+995", "乔治亚");
        areaMap.put("+996", "吉尔吉斯");
        areaMap.put("+998", "乌兹别克");
        areaMap.put("+1242", "巴哈马");
        areaMap.put("+1246", "巴巴多斯");
        areaMap.put("+1264", "安圭拉");
        areaMap.put("+1268", "安提瓜和巴布达");
        areaMap.put("+1284", "英属维尔京群岛");
        areaMap.put("+1340", "美属维尔京群岛)");
        areaMap.put("+1345", "开曼群岛 (英国)");
        areaMap.put("+1441", "百慕大 (英国)");
        areaMap.put("+1473", "格林纳达");
        areaMap.put("+1649", "土克凯可群岛 (英国)");
        areaMap.put("+1664", "蒙塞拉特岛 (英国)");
        areaMap.put("+1671", "关岛 (美国)");
        areaMap.put("+1684", "美属萨摩亚 (美国)");
        areaMap.put("+1758", "圣卢西亚");
        areaMap.put("+1767", "多米尼克");
        areaMap.put("+1784", "圣文森及格林纳丁");
        areaMap.put("+1787", "波多黎各 (美国)");
        areaMap.put("+1809", "多米尼加共和国");
        areaMap.put("+1868", "特立尼达和多巴哥");
        areaMap.put("+1869", "圣克里斯多福与尼维斯");
        areaMap.put("+1876", "牙买加");
    }

    private static Map<String, String> areaEngMap = new HashMap<>();

    static {
        areaEngMap.put("+1", "United States/Canada");
        areaEngMap.put("+7", "Russian Federation/Kazakhstan");
        areaEngMap.put("+20", "Egypt");
        areaEngMap.put("+27", "South Africa");
        areaEngMap.put("+30", "Greece");
        areaEngMap.put("+31", "Netherlands");
        areaEngMap.put("+32", "Belgium");
        areaEngMap.put("+33", "France");
        areaEngMap.put("+34", "Spain");
        areaEngMap.put("+36", "Hungary");
        areaEngMap.put("+39", "Italy");
        areaEngMap.put("+40", "Romania");
        areaEngMap.put("+41", "Switzerland");
        areaEngMap.put("+43", "Austria");
        areaEngMap.put("+44", "United Kingdom");
        areaEngMap.put("+45", "Denmark");
        areaEngMap.put("+46", "Sweden");
        areaEngMap.put("+47", "Norway");
        areaEngMap.put("+48", "Poland");
        areaEngMap.put("+49", "Germany");
        areaEngMap.put("+51", "Peru");
        areaEngMap.put("+52", "Mexico");
        areaEngMap.put("+53", "Cuba");
        areaEngMap.put("+54", "Argentina");
        areaEngMap.put("+55", "Brazil");
        areaEngMap.put("+56", "Chile");
        areaEngMap.put("+57", "Colombia");
        areaEngMap.put("+58", "Venezuela, Bolivarian Republic of");
        areaEngMap.put("+60", "Malaysia");
        areaEngMap.put("+61", "Australia");
        areaEngMap.put("+62", "Indonesia");
        areaEngMap.put("+63", "Philippines");
        areaEngMap.put("+64", "New Zealand");
        areaEngMap.put("+65", "Singapore");
        areaEngMap.put("+66", "Thailand");
        areaEngMap.put("+81", "Japan");
        areaEngMap.put("+82", "Korea, Republic of");
        areaEngMap.put("+84", "Vietnam");
        areaEngMap.put("+90", "Turkey");
        areaEngMap.put("+91", "India");
        areaEngMap.put("+92", "Pakistan");
        areaEngMap.put("+93", "Afghanistan");
        areaEngMap.put("+94", "Sri Lanka");
        areaEngMap.put("+95", "Myanmar");
        areaEngMap.put("+98", "Iran, Islamic Republic of");
        areaEngMap.put("+211", "South Sudan");
        areaEngMap.put("+212", "Morocco");
        areaEngMap.put("+213", "Algeria");
        areaEngMap.put("+216", "Tunisia");
        areaEngMap.put("+218", "Libya");
        areaEngMap.put("+220", "Gambia");
        areaEngMap.put("+221", "Senegal");
        areaEngMap.put("+222", "Mauritania");
        areaEngMap.put("+223", "Mali");
        areaEngMap.put("+224", "Guinea");
        areaEngMap.put("+225", "Côte d'Ivoire");
        areaEngMap.put("+226", "Burkina Faso");
        areaEngMap.put("+227", "Niger");
        areaEngMap.put("+228", "Togo");
        areaEngMap.put("+229", "Benin");
        areaEngMap.put("+230", "Mauritius");
        areaEngMap.put("+231", "Liberia");
        areaEngMap.put("+232", "Sierra Leone");
        areaEngMap.put("+233", "Ghana");
        areaEngMap.put("+234", "Nigeria");
        areaEngMap.put("+235", "Chad");
        areaEngMap.put("+236", "Central African Republicv");
        areaEngMap.put("+237", "Cameroon");
        areaEngMap.put("+238", "Cape Verde");
        areaEngMap.put("+239", "Sao Tome and Principe");
        areaEngMap.put("+240", "Equatorial Guinea");
        areaEngMap.put("+241", "Gabon");
        areaEngMap.put("+242", "Congo");
        areaEngMap.put("+243", "Congo, the Democratic Republic of the");
        areaEngMap.put("+244", "Angola");
        areaEngMap.put("+245", "Guinea");
        areaEngMap.put("+247", "Ascension island");
        areaEngMap.put("+248", "Seychelles");
        areaEngMap.put("+249", "Sudan");
        areaEngMap.put("+250", "Rwanda");
        areaEngMap.put("+251", "Ethiopia");
        areaEngMap.put("+252", "Somalia");
        areaEngMap.put("+253", "Djibouti");
        areaEngMap.put("+254", "Kenya");
        areaEngMap.put("+255", "Tanzania, United Republic of");
        areaEngMap.put("+256", "Uganda");
        areaEngMap.put("+257", "Burundi");
        areaEngMap.put("+258", "Mozambique");
        areaEngMap.put("+260", "Zambia");
        areaEngMap.put("+261", "Madagascar");
        areaEngMap.put("+262", "Réunion");
        areaEngMap.put("+263", "Republic of Zimbabwe");
        areaEngMap.put("+264", "Namibia");
        areaEngMap.put("+265", "Malawi");
        areaEngMap.put("+266", "Lesotho");
        areaEngMap.put("+267", "Botswana");
        areaEngMap.put("+268", "Swaziland");
        areaEngMap.put("+269", "Comoros/Mayotte");
        areaEngMap.put("+297", "Aruba");
        areaEngMap.put("+298", "Faroe Islands");
        areaEngMap.put("+299", "Greenland");
        areaEngMap.put("+350", "Gibraltar");
        areaEngMap.put("+351", "Portugal");
        areaEngMap.put("+352", "Luxembourg");
        areaEngMap.put("+389", "Macedonia");
        areaEngMap.put("+353", "Ireland");
        areaEngMap.put("+354", "Iceland");
        areaEngMap.put("+355", "Albania");
        areaEngMap.put("+356", "Malta");
        areaEngMap.put("+357", "Cyprus");
        areaEngMap.put("+358", "Finland");
        areaEngMap.put("+359", "Bulgaria");
        areaEngMap.put("+370", "Lithuania");
        areaEngMap.put("+371", "Latvia");
        areaEngMap.put("+372", "Estonia");
        areaEngMap.put("+373", "Moldova");
        areaEngMap.put("+374", "Armenia");
        areaEngMap.put("+375", "Belarus");
        areaEngMap.put("+376", "Andorra");
        areaEngMap.put("+377", "Monaco");
        areaEngMap.put("+378", "San Marino");
        areaEngMap.put("+380", "Ukraine");
        areaEngMap.put("+381", "Serbia");
        areaEngMap.put("+382", "Montenegro");
        areaEngMap.put("+385", "Croatia");
        areaEngMap.put("+386", "Slovenia");
        areaEngMap.put("+387", "Bosnia and Herzegovina");
        areaEngMap.put("+420", "Czech Republic");
        areaEngMap.put("+421", "Slovakia");
        areaEngMap.put("+423", "Liechtenstein");
        areaEngMap.put("+501", "Belize");
        areaEngMap.put("+502", "Guatemala");
        areaEngMap.put("+503", "El Salvador");
        areaEngMap.put("+504", "Honduras");
        areaEngMap.put("+505", "Nicaragua");
        areaEngMap.put("+506", "Costa Rica");
        areaEngMap.put("+507", "Panama");
        areaEngMap.put("+508", "Saint Pierre and Miquelon");
        areaEngMap.put("+509", "Haiti");
        areaEngMap.put("+590", "Guadeloupe/Sint Maarten");
        areaEngMap.put("+591", "Bolivia, Plurinational");
        areaEngMap.put("+592", "Guyana");
        areaEngMap.put("+593", "Ecuador");
        areaEngMap.put("+594", "French Guiana");
        areaEngMap.put("+595", "Paraguay");
        areaEngMap.put("+596", "Martinique");
        areaEngMap.put("+597", "Suriname");
        areaEngMap.put("+598", "Uruguay");
        areaEngMap.put("+599", "Bonaire Sint Eustat/Curacao");
        areaEngMap.put("+670", "Timor ");
        areaEngMap.put("+673", "Brunei Darussalam");
        areaEngMap.put("+675", "Papua New Guinea");
        areaEngMap.put("+676", "Tonga");
        areaEngMap.put("+677", "Solomon Islands");
        areaEngMap.put("+678", "Vanuatu");
        areaEngMap.put("+679", "Fiji");
        areaEngMap.put("+680", "Palau");
        areaEngMap.put("+682", "Cook Islands");
        areaEngMap.put("+685", "Samoa");
        areaEngMap.put("+686", "Kiribati");
        areaEngMap.put("+687", "New Caledonia");
        areaEngMap.put("+689", "French Polynesia");
        areaEngMap.put("+852", "Hong Kong");
        areaEngMap.put("+853", "Macao");
        areaEngMap.put("+855", "Cambodia");
        areaEngMap.put("+856", "Lao People's Democratic Republic");
        areaEngMap.put("+880", "Bangladesh");
        areaEngMap.put("+886", "Taiwan");
        areaEngMap.put("+930", "Palestine");
        areaEngMap.put("+960", "Maldives");
        areaEngMap.put("+961", "Lebanon");
        areaEngMap.put("+962", "Jordan");
        areaEngMap.put("+963", "Syrian Arab Republic");
        areaEngMap.put("+964", "Iraq");
        areaEngMap.put("+965", "Kuwait");
        areaEngMap.put("+966", "Saudi Arabia");
        areaEngMap.put("+967", "Yemen");
        areaEngMap.put("+968", "Oman");
        areaEngMap.put("+971", "United Arab Emirates");
        areaEngMap.put("+972", "Israel");
        areaEngMap.put("+973", "Bahrain");
        areaEngMap.put("+974", "Qatar");
        areaEngMap.put("+975", "Bhutan");
        areaEngMap.put("+976", "Mongolia");
        areaEngMap.put("+977", "Nepal");
        areaEngMap.put("+992", "Tajikistan");
        areaEngMap.put("+993", "Turkmenistan");
        areaEngMap.put("+994", "Azerbaijan");
        areaEngMap.put("+995", "Georgia");
        areaEngMap.put("+996", "Kyrgyzstan");
        areaEngMap.put("+998", "Uzbekistan");
        areaEngMap.put("+1242", "Bahamas");
        areaEngMap.put("+1246", "Barbados");
        areaEngMap.put("+1264", "Anguilla");
        areaEngMap.put("+1268", "Antigua and Barbuda");
        areaEngMap.put("+1284", "Virgin Islands, U.S.");
        areaEngMap.put("+1340", "United States Virgin Islands");
        areaEngMap.put("+1345", "Cayman Islands");
        areaEngMap.put("+1441", "Bermuda");
        areaEngMap.put("+1473", "Grenada");
        areaEngMap.put("+1649", "Turks and Caicos Islands");
        areaEngMap.put("+1664", "Montserrat");
        areaEngMap.put("+1671", "Guam");
        areaEngMap.put("+1684", "American Samoa");
        areaEngMap.put("+1758", "Saint Lucia");
        areaEngMap.put("+1767", "Dominica");
        areaEngMap.put("+1784", "Saint Vincent and the Grenadines");
        areaEngMap.put("+1787", "Puerto Rico");
        areaEngMap.put("+1809", "Dominican Republic");
        areaEngMap.put("+1868", "Trinidad and Tobago");
        areaEngMap.put("+1869", "Saint Kitts and Nevis");
        areaEngMap.put("+1876", "Jamaica");
    }

    public static String getTelAreaCNName(String telArea) {
        return areaMap.get(telArea);
    }
    public static String getTelAreaEngName(String telArea) {
        return areaEngMap.get(telArea);
    }
}
