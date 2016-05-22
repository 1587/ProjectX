package am.project.x.activities;


import am.project.x.R;
import am.project.x.widgets.citylistview.CitysUtils;

public class CitysStringUtils {
	public static final int ERROR_ID = 0;

	/**
	 * 获取省份对应的String资源ID
	 * 
	 * @param province
	 * @return
	 */
	public static int getProvinceResString(CitysUtils.Province province) {
		if (province == null) {
			return ERROR_ID;
		}
		switch (province) {
		case AN_HUI:
			return R.string.provinces_an_hui;
		case AO_MEN:
			return R.string.provinces_ao_men;
		case BEI_JING:
			return R.string.provinces_bei_jing;
		case CHONG_QING:
			return R.string.provinces_chong_qing;
		case FU_JIAN:
			return R.string.provinces_fu_jian;
		case GAN_SU:
			return R.string.provinces_gan_su;
		case GUANG_DONG:
			return R.string.provinces_guang_dong;
		case GUANG_XI:
			return R.string.provinces_guang_xi;
		case GUI_ZHOU:
			return R.string.provinces_gui_zhou;
		case HAI_NAN:
			return R.string.provinces_hai_nan;
		case HE_BEI:
			return R.string.provinces_he_bei;
		case HE_NAN:
			return R.string.provinces_he_nan;
		case HEI_LONG_JIANG:
			return R.string.provinces_hei_long_jiang;
		case HU_BEI:
			return R.string.provinces_hu_bei;
		case HU_NAN:
			return R.string.provinces_hu_nan;
		case JI_LIN:
			return R.string.provinces_ji_lin;
		case JIANG_SU:
			return R.string.provinces_jiang_su;
		case JIANG_XI:
			return R.string.provinces_jiang_xi;
		case LIAO_NING:
			return R.string.provinces_liao_ning;
		case NEI_MENG_GU:
			return R.string.provinces_nei_meng_gu;
		case NING_XIA:
			return R.string.provinces_ning_xia;
		case QING_HAI:
			return R.string.provinces_qing_hai;
		case SHAN_DONG:
			return R.string.provinces_shan_dong;
		case SHAN_XI_1:
			return R.string.provinces_shan_xi_1;
		case SHAN_XI_3:
			return R.string.provinces_shan_xi_3;
		case SHANG_HAI:
			return R.string.provinces_shang_hai;
		case SI_CHUAN:
			return R.string.provinces_si_chuan;
		case TAI_WAN:
			return R.string.provinces_tai_wan;
		case TIAN_JIN:
			return R.string.provinces_tian_jin;
		case XI_ZANG:
			return R.string.provinces_xi_zang;
		case XIANG_GANG:
			return R.string.provinces_xiang_gang;
		case XIN_JIANG:
			return R.string.provinces_xin_jiang;
		case YUN_NAN:
			return R.string.provinces_yun_nan;
		case ZHE_JIANG:
			return R.string.provinces_zhe_jiang;
		default:
			return ERROR_ID;
		}
	}

	/**
	 * 获取城市对应的String资源ID
	 * 
	 * @param city
	 * @return
	 */
	public static int getCityResString(CitysUtils.City city) {
		if (city == null) {
			return ERROR_ID;
		}
		switch (city) {
		case A_BA:
			return R.string.citys_a_ba;
		case A_KE_SU:
			return R.string.citys_a_ke_su;
		case A_LA_SHAN_MENG:
			return R.string.citys_a_la_shan_meng;
		case A_LE_TAI:
			return R.string.citys_a_le_tai;
		case A_LI:
			return R.string.citys_a_li;
		case AN_KANG:
			return R.string.citys_an_kang;
		case AN_QING:
			return R.string.citys_an_qing;
		case AN_SHAN:
			return R.string.citys_an_shan;
		case AN_SHUN:
			return R.string.citys_an_shun;
		case AN_YANG:
			return R.string.citys_an_yang;
		case AO_MEN:
			return R.string.citys_ao_men;
		case BA_YAN_NAO_ER:
			return R.string.citys_ba_yan_nao_er;
		case BA_YIN_GUO_LENG:
			return R.string.citys_ba_yin_guo_leng;
		case BA_ZHONG:
			return R.string.citys_ba_zhong;
		case BAI_CHENG:
			return R.string.citys_bai_cheng;
		case BAI_SE:
			return R.string.citys_bai_se;
		case BAI_SHAN:
			return R.string.citys_bai_shan;
		case BAI_YIN:
			return R.string.citys_bai_yin;
		case BANG_BU:
			return R.string.citys_bang_bu;
		case BAO_DING:
			return R.string.citys_bao_ding;
		case BAO_JI:
			return R.string.citys_bao_ji;
		case BAO_SHAN:
			return R.string.citys_bao_shan;
		case BAO_TOU:
			return R.string.citys_bao_tou;
		case BEI_HAI:
			return R.string.citys_bei_hai;
		case BEI_JING:
			return R.string.citys_bei_jing;
		case BEN_XI:
			return R.string.citys_ben_xi;
		case BI_JIE:
			return R.string.citys_bi_jie;
		case BIN_ZHOU:
			return R.string.citys_bin_zhou;
		case BO_ER_TA_LA:
			return R.string.citys_bo_er_ta_la;
		case BO_ZHOU:
			return R.string.citys_bo_zhou;
		case CANG_ZHOU:
			return R.string.citys_cang_zhou;
		case CHANG_CHUN:
			return R.string.citys_chang_chun;
		case CHANG_DE:
			return R.string.citys_chang_de;
		case CHANG_DOU:
			return R.string.citys_chang_dou;
		case CHANG_JI:
			return R.string.citys_chang_ji;
		case CHANG_SHA:
			return R.string.citys_chang_sha;
		case CHANG_ZHI:
			return R.string.citys_chang_zhi;
		case CHANG_ZHOU:
			return R.string.citys_chang_zhou;
		case CHAO_YANG:
			return R.string.citys_chao_yang;
		case CHAO_ZHOU:
			return R.string.citys_chao_zhou;
		case CHEN_ZHOU:
			return R.string.citys_chen_zhou;
		case CHENG_DE:
			return R.string.citys_cheng_de;
		case CHENG_DOU:
			return R.string.citys_cheng_dou;
		case CHI_FENG:
			return R.string.citys_chi_feng;
		case CHI_ZHOU:
			return R.string.citys_chi_zhou;
		case CHONG_QING:
			return R.string.citys_chong_qing;
		case CHONG_ZUO:
			return R.string.citys_chong_zuo;
		case CHU_XIONG:
			return R.string.citys_chu_xiong;
		case CHU_ZHOU:
			return R.string.citys_chu_zhou;
		case DA_LI:
			return R.string.citys_da_li;
		case DA_LIAN:
			return R.string.citys_da_lian;
		case DA_QING:
			return R.string.citys_da_qing;
		case DA_TONG:
			return R.string.citys_da_tong;
		case DA_XING_AN_LING:
			return R.string.citys_da_xing_an_ling;
		case DA_ZHOU:
			return R.string.citys_da_zhou;
		case DAN_DONG:
			return R.string.citys_dan_dong;
		case DE_HONG:
			return R.string.citys_de_hong;
		case DE_YANG:
			return R.string.citys_de_yang;
		case DE_ZHOU:
			return R.string.citys_de_zhou;
		case DI_QING:
			return R.string.citys_di_qing;
		case DING_XI:
			return R.string.citys_ding_xi;
		case DONG_GUAN:
			return R.string.citys_dong_guan;
		case DONG_YING:
			return R.string.citys_dong_ying;
		case E_ER_DUO_SI:
			return R.string.citys_e_er_duo_si;
		case E_ZHOU:
			return R.string.citys_e_zhou;
		case EN_SHI:
			return R.string.citys_en_shi;
		case FANG_CHENG_GANG:
			return R.string.citys_fang_cheng_gang;
		case FO_SHAN:
			return R.string.citys_fo_shan;
		case FU_SHUN:
			return R.string.citys_fu_shun;
		case FU_XIN:
			return R.string.citys_fu_xin;
		case FU_YANG:
			return R.string.citys_fu_yang;
		case FU_ZHOU_2:
			return R.string.citys_fu_zhou_2;
		case FU_ZHOU_3:
			return R.string.citys_fu_zhou_3;
		case GAN_NAN:
			return R.string.citys_gan_nan;
		case GAN_ZHOU:
			return R.string.citys_gan_zhou;
		case GAN_ZI:
			return R.string.citys_gan_zi;
		case GU_YUAN:
			return R.string.citys_gu_yuan;
		case GUANG_AN:
			return R.string.citys_guang_an;
		case GUANG_YUAN:
			return R.string.citys_guang_yuan;
		case GUANG_ZHOU:
			return R.string.citys_guang_zhou;
		case GUI_GANG:
			return R.string.citys_gui_gang;
		case GUI_LIN:
			return R.string.citys_gui_lin;
		case GUI_YANG:
			return R.string.citys_gui_yang;
		case GUO_LUO:
			return R.string.citys_guo_luo;
		case HA_ER_BIN:
			return R.string.citys_ha_er_bin;
		case HA_MI:
			return R.string.citys_ha_mi;
		case HAI_BEI:
			return R.string.citys_hai_bei;
		case HAI_DONG:
			return R.string.citys_hai_dong;
		case HAI_KOU:
			return R.string.citys_hai_kou;
		case HAI_NAN:
			return R.string.citys_hai_nan;
		case HAI_XI:
			return R.string.citys_hai_xi;
		case HAN_DAN:
			return R.string.citys_han_dan;
		case HAN_ZHONG:
			return R.string.citys_han_zhong;
		case HANG_ZHOU:
			return R.string.citys_hang_zhou;
		case HE_BI:
			return R.string.citys_he_bi;
		case HE_CHI:
			return R.string.citys_he_chi;
		case HE_FEI:
			return R.string.citys_he_fei;
		case HE_GANG:
			return R.string.citys_he_gang;
		case HE_TIAN:
			return R.string.citys_he_tian;
		case HE_YUAN:
			return R.string.citys_he_yuan;
		case HE_ZE:
			return R.string.citys_he_ze;
		case HE_ZHOU:
			return R.string.citys_he_zhou;
		case HEI_HE:
			return R.string.citys_hei_he;
		case HENG_SHUI:
			return R.string.citys_heng_shui;
		case HENG_YANG:
			return R.string.citys_heng_yang;
		case HONG_HE:
			return R.string.citys_hong_he;
		case HU_HE_HAO_TE:
			return R.string.citys_hu_he_hao_te;
		case HU_LU_DAO:
			return R.string.citys_hu_lu_dao;
		case HU_LUN_BEI_ER:
			return R.string.citys_hu_lun_bei_er;
		case HU_ZHOU:
			return R.string.citys_hu_zhou;
		case HUAI_AN:
			return R.string.citys_huai_an;
		case HUAI_BEI:
			return R.string.citys_huai_bei;
		case HUAI_HUA:
			return R.string.citys_huai_hua;
		case HUAI_NAN:
			return R.string.citys_huai_nan;
		case HUANG_GANG:
			return R.string.citys_huang_gang;
		case HUANG_NAN:
			return R.string.citys_huang_nan;
		case HUANG_SHAN:
			return R.string.citys_huang_shan;
		case HUANG_SHI:
			return R.string.citys_huang_shi;
		case HUI_ZHOU:
			return R.string.citys_hui_zhou;
		case JI_AN:
			return R.string.citys_ji_an;
		case JI_LIN:
			return R.string.citys_ji_lin;
		case JI_NAN:
			return R.string.citys_ji_nan;
		case JI_NING:
			return R.string.citys_ji_ning;
		case JI_XI:
			return R.string.citys_ji_xi;
		case JIA_MU_SI:
			return R.string.citys_jia_mu_si;
		case JIA_XING:
			return R.string.citys_jia_xing;
		case JIA_YU_GUAN:
			return R.string.citys_jia_yu_guan;
		case JIANG_MEN:
			return R.string.citys_jiang_men;
		case JIAO_ZUO:
			return R.string.citys_jiao_zuo;
		case JIE_YANG:
			return R.string.citys_jie_yang;
		case JIN_CHANG:
			return R.string.citys_jin_chang;
		case JIN_CHENG:
			return R.string.citys_jin_cheng;
		case JIN_HUA:
			return R.string.citys_jin_hua;
		case JIN_ZHONG:
			return R.string.citys_jin_zhong;
		case JIN_ZHOU:
			return R.string.citys_jin_zhou;
		case JING_DE_ZHEN:
			return R.string.citys_jing_de_zhen;
		case JING_MEN:
			return R.string.citys_jing_men;
		case JING_ZHOU:
			return R.string.citys_jing_zhou;
		case JIU_JIANG:
			return R.string.citys_jiu_jiang;
		case JIU_QUAN:
			return R.string.citys_jiu_quan;
		case KA_SHI:
			return R.string.citys_ka_shi;
		case KAI_FENG:
			return R.string.citys_kai_feng;
		case KE_LA_MA_YI:
			return R.string.citys_ke_la_ma_yi;
		case KE_ZI_LE_SU_KE_ER_KE_ZI:
			return R.string.citys_ke_zi_le_su_ke_er_ke_zi;
		case KUN_MING:
			return R.string.citys_kun_ming;
		case LA_SA:
			return R.string.citys_la_sa;
		case LAI_BIN:
			return R.string.citys_lai_bin;
		case LAI_WU:
			return R.string.citys_lai_wu;
		case LAN_ZHOU:
			return R.string.citys_lan_zhou;
		case LANG_FANG:
			return R.string.citys_lang_fang;
		case LE_SHAN:
			return R.string.citys_le_shan;
		case LI_JIANG:
			return R.string.citys_li_jiang;
		case LI_SHUI:
			return R.string.citys_li_shui;
		case LIAN_YUN_GANG:
			return R.string.citys_lian_yun_gang;
		case LIANG_SHAN:
			return R.string.citys_liang_shan;
		case LIAO_CHENG:
			return R.string.citys_liao_cheng;
		case LIAO_YANG:
			return R.string.citys_liao_yang;
		case LIAO_YUAN:
			return R.string.citys_liao_yuan;
		case LIN_CANG:
			return R.string.citys_lin_cang;
		case LIN_FEN:
			return R.string.citys_lin_fen;
		case LIN_XIA:
			return R.string.citys_lin_xia;
		case LIN_YI:
			return R.string.citys_lin_yi;
		case LIN_ZHI:
			return R.string.citys_lin_zhi;
		case LIU_AN:
			return R.string.citys_liu_an;
		case LIU_PAN_SHUI:
			return R.string.citys_liu_pan_shui;
		case LIU_ZHOU:
			return R.string.citys_liu_zhou;
		case LONG_NAN:
			return R.string.citys_long_nan;
		case LONG_YAN:
			return R.string.citys_long_yan;
		case LOU_DI:
			return R.string.citys_lou_di;
		case LU_ZHOU:
			return R.string.citys_lu_zhou;
		case LUO_HE:
			return R.string.citys_luo_he;
		case LUO_YANG:
			return R.string.citys_luo_yang;
		case LV_LIANG:
			return R.string.citys_lv_liang;
		case MA_AN_SHAN:
			return R.string.citys_ma_an_shan;
		case MAO_MING:
			return R.string.citys_mao_ming;
		case MEI_SHAN:
			return R.string.citys_mei_shan;
		case MEI_ZHOU:
			return R.string.citys_mei_zhou;
		case MIAN_YANG:
			return R.string.citys_mian_yang;
		case MU_DAN_JIANG:
			return R.string.citys_mu_dan_jiang;
		case NA_QU:
			return R.string.citys_na_qu;
		case NAN_CHANG:
			return R.string.citys_nan_chang;
		case NAN_CHONG:
			return R.string.citys_nan_chong;
		case NAN_JING:
			return R.string.citys_nan_jing;
		case NAN_NING:
			return R.string.citys_nan_ning;
		case NAN_PING:
			return R.string.citys_nan_ping;
		case NAN_TONG:
			return R.string.citys_nan_tong;
		case NAN_YANG:
			return R.string.citys_nan_yang;
		case NEI_JIANG:
			return R.string.citys_nei_jiang;
		case NING_BO:
			return R.string.citys_ning_bo;
		case NING_DE:
			return R.string.citys_ning_de;
		case NU_JIANG:
			return R.string.citys_nu_jiang;
		case PAN_JIN:
			return R.string.citys_pan_jin;
		case PAN_ZHI_HUA:
			return R.string.citys_pan_zhi_hua;
		case PING_DING_SHAN:
			return R.string.citys_ping_ding_shan;
		case PING_LIANG:
			return R.string.citys_ping_liang;
		case PING_XIANG:
			return R.string.citys_ping_xiang;
		case PU_ER:
			return R.string.citys_pu_er;
		case PU_TIAN:
			return R.string.citys_pu_tian;
		case PU_YANG:
			return R.string.citys_pu_yang;
		case QI_QI_HA_ER:
			return R.string.citys_qi_qi_ha_er;
		case QI_TAI_HE:
			return R.string.citys_qi_tai_he;
		case QIAN_DONG_NAN:
			return R.string.citys_qian_dong_nan;
		case QIAN_NAN:
			return R.string.citys_qian_nan;
		case QIAN_XI_NAN:
			return R.string.citys_qian_xi_nan;
		case QIN_HUANG_DAO:
			return R.string.citys_qin_huang_dao;
		case QIN_ZHOU:
			return R.string.citys_qin_zhou;
		case QING_DAO:
			return R.string.citys_qing_dao;
		case QING_YANG:
			return R.string.citys_qing_yang;
		case QING_YUAN:
			return R.string.citys_qing_yuan;
		case QU_JING:
			return R.string.citys_qu_jing;
		case QU_ZHOU:
			return R.string.citys_qu_zhou;
		case QUAN_ZHOU:
			return R.string.citys_quan_zhou;
		case RI_KA_ZE:
			return R.string.citys_ri_ka_ze;
		case RI_ZHAO:
			return R.string.citys_ri_zhao;
		case SAN_MEN_XIA:
			return R.string.citys_san_men_xia;
		case SAN_MING:
			return R.string.citys_san_ming;
		case SAN_SHA:
			return R.string.citys_san_sha;
		case SAN_YA:
			return R.string.citys_san_ya;
		case SHAN_NAN:
			return R.string.citys_shan_nan;
		case SHAN_TOU:
			return R.string.citys_shan_tou;
		case SHAN_WEI:
			return R.string.citys_shan_wei;
		case SHANG_HAI:
			return R.string.citys_shang_hai;
		case SHANG_LUO:
			return R.string.citys_shang_luo;
		case SHANG_QIU:
			return R.string.citys_shang_qiu;
		case SHANG_RAO:
			return R.string.citys_shang_rao;
		case SHAO_GUAN:
			return R.string.citys_shao_guan;
		case SHAO_XING:
			return R.string.citys_shao_xing;
		case SHAO_YANG:
			return R.string.citys_shao_yang;
		case SHEN_YANG:
			return R.string.citys_shen_yang;
		case SHEN_ZHEN:
			return R.string.citys_shen_zhen;
		case SHI_JIA_ZHUANG:
			return R.string.citys_shi_jia_zhuang;
		case SHI_YAN:
			return R.string.citys_shi_yan;
		case SHI_ZUI_SHAN:
			return R.string.citys_shi_zui_shan;
		case SHUANG_YA_SHAN:
			return R.string.citys_shuang_ya_shan;
		case SHUO_ZHOU:
			return R.string.citys_shuo_zhou;
		case SI_PING:
			return R.string.citys_si_ping;
		case SONG_YUAN:
			return R.string.citys_song_yuan;
		case SU_QIAN:
			return R.string.citys_su_qian;
		case SU_ZHOU_1:
			return R.string.citys_su_zhou_1;
		case SU_ZHOU_4:
			return R.string.citys_su_zhou_4;
		case SUI_HUA:
			return R.string.citys_sui_hua;
		case SUI_NING:
			return R.string.citys_sui_ning;
		case SUI_ZHOU:
			return R.string.citys_sui_zhou;
		case TA_CHENG:
			return R.string.citys_ta_cheng;
		case TAI_AN:
			return R.string.citys_tai_an;
		case TAI_WAN:
			return R.string.citys_tai_wan;
		case TAI_YUAN:
			return R.string.citys_tai_yuan;
		case TAI_ZHOU_2:
			return R.string.citys_tai_zhou_2;
		case TAI_ZHOU_4:
			return R.string.citys_tai_zhou_4;
		case TANG_SHAN:
			return R.string.citys_tang_shan;
		case TIAN_JIN:
			return R.string.citys_tian_jin;
		case TIAN_SHUI:
			return R.string.citys_tian_shui;
		case TIE_LING:
			return R.string.citys_tie_ling;
		case TONG_CHUAN:
			return R.string.citys_tong_chuan;
		case TONG_HUA:
			return R.string.citys_tong_hua;
		case TONG_LIAO:
			return R.string.citys_tong_liao;
		case TONG_LING:
			return R.string.citys_tong_ling;
		case TONG_REN:
			return R.string.citys_tong_ren;
		case TU_LU_FAN:
			return R.string.citys_tu_lu_fan;
		case WEI_FANG:
			return R.string.citys_wei_fang;
		case WEI_HAI:
			return R.string.citys_wei_hai;
		case WEI_NAN:
			return R.string.citys_wei_nan;
		case WEN_SHAN:
			return R.string.citys_wen_shan;
		case WEN_ZHOU:
			return R.string.citys_wen_zhou;
		case WU_HAI:
			return R.string.citys_wu_hai;
		case WU_HAN:
			return R.string.citys_wu_han;
		case WU_HU:
			return R.string.citys_wu_hu;
		case WU_LAN_CHA_BU:
			return R.string.citys_wu_lan_cha_bu;
		case WU_LU_MU_QI:
			return R.string.citys_wu_lu_mu_qi;
		case WU_WEI:
			return R.string.citys_wu_wei;
		case WU_XI:
			return R.string.citys_wu_xi;
		case WU_ZHONG:
			return R.string.citys_wu_zhong;
		case WU_ZHOU:
			return R.string.citys_wu_zhou;
		case XI_AN:
			return R.string.citys_xi_an;
		case XI_LIN_GUO_LE_MENG:
			return R.string.citys_xi_lin_guo_le_meng;
		case XI_NING:
			return R.string.citys_xi_ning;
		case XI_SHUANG_BAN_NA:
			return R.string.citys_xi_shuang_ban_na;
		case XIA_MEN:
			return R.string.citys_xia_men;
		case XIAN_NING:
			return R.string.citys_xian_ning;
		case XIAN_YANG:
			return R.string.citys_xian_yang;
		case XIANG_GANG:
			return R.string.citys_xiang_gang;
		case XIANG_TAN:
			return R.string.citys_xiang_tan;
		case XIANG_XI:
			return R.string.citys_xiang_xi;
		case XIANG_YANG:
			return R.string.citys_xiang_yang;
		case XIAO_GAN:
			return R.string.citys_xiao_gan;
		case XIN_XIANG:
			return R.string.citys_xin_xiang;
		case XIN_YANG:
			return R.string.citys_xin_yang;
		case XIN_YU:
			return R.string.citys_xin_yu;
		case XIN_ZHOU:
			return R.string.citys_xin_zhou;
		case XING_AN_MENG:
			return R.string.citys_xing_an_meng;
		case XING_TAI:
			return R.string.citys_xing_tai;
		case XU_CHANG:
			return R.string.citys_xu_chang;
		case XU_ZHOU:
			return R.string.citys_xu_zhou;
		case XUAN_CHENG:
			return R.string.citys_xuan_cheng;
		case YA_AN:
			return R.string.citys_ya_an;
		case YAN_AN:
			return R.string.citys_yan_an;
		case YAN_BIAN:
			return R.string.citys_yan_bian;
		case YAN_CHENG:
			return R.string.citys_yan_cheng;
		case YAN_TAI:
			return R.string.citys_yan_tai;
		case YANG_JIANG:
			return R.string.citys_yang_jiang;
		case YANG_QUAN:
			return R.string.citys_yang_quan;
		case YANG_ZHOU:
			return R.string.citys_yang_zhou;
		case YI_BIN:
			return R.string.citys_yi_bin;
		case YI_CHANG:
			return R.string.citys_yi_chang;
		case YI_CHUN_1:
			return R.string.citys_yi_chun_1;
		case YI_CHUN_2:
			return R.string.citys_yi_chun_2;
		case YI_LI_HA_SA_KE:
			return R.string.citys_yi_li_ha_sa_ke;
		case YI_YANG:
			return R.string.citys_yi_yang;
		case YIN_CHUAN:
			return R.string.citys_yin_chuan;
		case YING_KOU:
			return R.string.citys_ying_kou;
		case YING_TAN:
			return R.string.citys_ying_tan;
		case YONG_ZHOU:
			return R.string.citys_yong_zhou;
		case YU_LIN_2:
			return R.string.citys_yu_lin_2;
		case YU_LIN_4:
			return R.string.citys_yu_lin_4;
		case YU_SHU:
			return R.string.citys_yu_shu;
		case YU_XI:
			return R.string.citys_yu_xi;
		case YUE_YANG:
			return R.string.citys_yue_yang;
		case YUN_CHENG:
			return R.string.citys_yun_cheng;
		case YUN_FU:
			return R.string.citys_yun_fu;
		case ZAO_ZHUANG:
			return R.string.citys_zao_zhuang;
		case ZHAN_JIANG:
			return R.string.citys_zhan_jiang;
		case ZHANG_JIA_JIE:
			return R.string.citys_zhang_jia_jie;
		case ZHANG_JIA_KOU:
			return R.string.citys_zhang_jia_kou;
		case ZHANG_YE:
			return R.string.citys_zhang_ye;
		case ZHANG_ZHOU:
			return R.string.citys_zhang_zhou;
		case ZHAO_QING:
			return R.string.citys_zhao_qing;
		case ZHAO_TONG:
			return R.string.citys_zhao_tong;
		case ZHEN_JIANG:
			return R.string.citys_zhen_jiang;
		case ZHENG_ZHOU:
			return R.string.citys_zheng_zhou;
		case ZHONG_SHAN:
			return R.string.citys_zhong_shan;
		case ZHONG_WEI:
			return R.string.citys_zhong_wei;
		case ZHOU_KOU:
			return R.string.citys_zhou_kou;
		case ZHOU_SHAN:
			return R.string.citys_zhou_shan;
		case ZHU_HAI:
			return R.string.citys_zhu_hai;
		case ZHU_MA_DIAN:
			return R.string.citys_zhu_ma_dian;
		case ZHU_ZHOU:
			return R.string.citys_zhu_zhou;
		case ZI_BO:
			return R.string.citys_zi_bo;
		case ZI_GONG:
			return R.string.citys_zi_gong;
		case ZI_YANG:
			return R.string.citys_zi_yang;
		case ZUN_YI:
			return R.string.citys_zun_yi;
		default:
			return ERROR_ID;
		}
	}
}