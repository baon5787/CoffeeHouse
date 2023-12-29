package com.coffee.house.admin.helper;

public class AppConstant {

	// URL API
	public static final String URL_API_ADMIN = "/api/admin";
	public static final String URL_API_ADMIN_AUTH = "/api/admin/auth";
	public static final String URL_LOGIN = "/login";
	public static final String URL_FORGOT_PASSWORD = "/forgot/password";
	public static final String URL_REFRESH = "/refresh";
	public static final String URL_USERS = AppConstant.URL_API_ADMIN + "/users";
	public static final String URL_ROLES = AppConstant.URL_API_ADMIN + "/roles";
	public static final String URL_PRODUCTS = AppConstant.URL_API_ADMIN + "/products";
	public static final String URL_CATEGORIES = AppConstant.URL_API_ADMIN + "/categories";
	public static final String URL_SIZES = AppConstant.URL_API_ADMIN + "/sizes";
	public static final String URL_COUPONS = AppConstant.URL_API_ADMIN + "/coupons";
	public static final String URL_PRODUCTS_SIZES = AppConstant.URL_API_ADMIN + "/products/sizes";
	public static final String URL_WAREHOUSES = AppConstant.URL_API_ADMIN + "/warehouses";
	public static final String URL_ORDERS = AppConstant.URL_API_ADMIN + "/orders";
	public static final String URL_DELIVERY_ORDERS = AppConstant.URL_API_ADMIN + "/delivery/orders";
	public static final String URL_STATISTIC = AppConstant.URL_API_ADMIN + "/statistic";
	public static final String URL_DASHBOARD = AppConstant.URL_API_ADMIN + "/dashboard";

	// URL
	public static final String URL_SELECT = "/select";
	public static final String URL_CATEGORIES_SELECT = "/categories/select";
	public static final String URL_CHECKBOX = "/checkbox";
	public static final String URL_RADIO = "/radio";
	public static final String URL_SEARCH = "/search";
	public static final String URL_DELETE = "/delete";
	public static final String URL_ENABLED = "/enabled";
	public static final String URL_DISENABLE = "/disenable";
	public static final String URL_PROFILE = "/profile";
	public static final String URL_PROFILE_PASSWORD = URL_PROFILE + "/password";

	// PathVariable
	public static final String EMAIL = "/{email}";
	public static final String EMAILS = "/{emails}";
	public static final String PHONE = "/{phone}";
	public static final String SKU = "/{sku}";
	public static final String SKUS = "/{skus}";
	public static final String NAME = "/{name}";
	public static final String CODE = "/{code}";
	public static final String CODES = "/{codes}";
	public static final String PRODUCTID_SIZEID = "/{productId}/{sizeId}";
	public static final String PAYMENTCODE = "/{paymentCode}";

	// WAREHOUSE
	public static final String URL_TITLE_PRODUCTID_SIZEID = "/title" + PRODUCTID_SIZEID;
	public static final String URL_CONFIRM_PRODUCTID_SIZEID = "/confirm" + PRODUCTID_SIZEID;

	// USER
	public static final String URL_PASSWORD_EMAIL = "/password" + EMAIL;
	public static final String URL_ROLE_EMAIL = "/role" + EMAIL;

	// SELECTED
	public static final String URL_SELECTED = "/selected";
	public static final String URL_SELECTED_DISENABLE_SKUS = URL_SELECTED + URL_DISENABLE + SKUS;
	public static final String URL_SELECTED_DISENABLE_CODES = URL_SELECTED + URL_DISENABLE + CODES;
	public static final String URL_SELECTED_DISENABLE_EMAILS = URL_SELECTED + URL_DISENABLE + EMAILS;

	// Disenable
	public static final String URL_DISENABLE_SEARCH = URL_DISENABLE + URL_SEARCH;
	public static final String URL_DISENABLE_EMAIL = URL_DISENABLE + EMAIL;
	public static final String URL_DISENABLE_SKU = URL_DISENABLE + SKU;
	public static final String URL_DISENABLE_CODE = URL_DISENABLE + CODE;
	public static final String URL_DISENABLE_ENABLED_SKU = URL_DISENABLE + URL_ENABLED + SKU;
	public static final String URL_DISENABLE_ENABLED_EMAIL = URL_DISENABLE + URL_ENABLED + EMAIL;
	public static final String URL_DISENABLE_ENABLED_CODE = URL_DISENABLE + URL_ENABLED + CODE;
	public static final String URL_DISENABLE_SELECTED_ENABLED_SKUS = URL_DISENABLE + URL_SELECTED + URL_ENABLED + SKUS;
	public static final String URL_DISENABLE_SELECTED_ENABLED_CODES = URL_DISENABLE + URL_SELECTED + URL_ENABLED
			+ CODES;
	public static final String URL_DISENABLE_SELECTED_ENABLED_EMAILS = URL_DISENABLE + URL_SELECTED + URL_ENABLED
			+ EMAILS;

	// PARENT
	public static final String URL_PARENT = "/parent";
	public static final String URL_PARENT_SEARCH = URL_PARENT + URL_SEARCH;
	public static final String URL_PARENT_CODE = URL_PARENT + CODE;
	public static final String URL_PARENT_SELECTED_DISENABLE_CODES = URL_PARENT + URL_SELECTED_DISENABLE_CODES;
	public static final String URL_PARENT_SELECT = URL_PARENT + URL_SELECT;

	// SUB
	public static final String URL_SUB = "/sub";
	public static final String URL_SUB_SEARCH = URL_SUB + URL_SEARCH;
	public static final String URL_SUB_CODE = URL_SUB + CODE;
	public static final String URL_SUB_SELECTED_DISENABLE_CODES = URL_SUB + URL_SELECTED_DISENABLE_CODES;
	public static final String URL_SUB_SELECT = URL_SUB + URL_SELECT;

	// DELIVERY
	public static final String URL_UNCONFIMRED = "/unconfimred";
	public static final String URL_UNCONFIMRED_SEARCH = URL_UNCONFIMRED + URL_SEARCH;
	public static final String URL_UNACCOMPLISHED = "/unaccomplished";
	public static final String URL_UNACCOMPLISHED_SEARCH = URL_UNACCOMPLISHED + URL_SEARCH;
	public static final String URL_ACCOMPLISHED = "/accomplished";
	public static final String URL_ACCOMPLISHED_SEARCH = URL_ACCOMPLISHED + URL_SEARCH;
	public static final String URL_STATE_TRANSTION = "/state/transtion";
	public static final String URL_PAYMENT_STATE_TRANSTION = "/payment" + URL_STATE_TRANSTION;
	public static final String URL_PAYMENTCODE_EVENT = PAYMENTCODE + "/event/{event}";

	// ADDRESS
	public static final String URL_SELECT_PROVINCES = URL_SELECT + "/provinces";
	public static final String URL_SELECT_DISTRICTS_CODE = URL_SELECT + "/districts" + CODE;
	public static final String URL_SELECT_WARD_CODE_DISTRICTSNAME = URL_SELECT + "/ward" + CODE + "/{districtName}";

	// STATISTIC
	public static final String URL_OVERVIEW_COMPANY = "/overview/company";
	public static final String URL_REVENUE = "/revenue";
	public static final String URL_SALES_PRODUCT = "/sales/product";
	public static final String URL_BEST_SELLING_PRODUCT = "/best/selling/product";
	public static final String URL_SEARCH_BEST_SELLING_PRODUCT = URL_SEARCH + "/best/selling/product";
	public static final String URL_STATISTICS_CATEGORY_PRODUCT = "/statistics/category/product";

	// ENUM
	public static final String URL_SELECT_STATUSES = URL_SELECT + "/statuses";
	public static final String URL_SELECT_COUPONS_STATUSES = URL_SELECT + "/coupons" + "/statuses";
	public static final String URL_SELECT_COUPONS_TYPES = URL_SELECT + "/coupons" + "/types";
	public static final String URL_SELECT_ORDERS_STATUSES = URL_SELECT + "/orders" + "/statuses";
	public static final String URL_RADIO_GENDER = URL_RADIO + "/gender";

	// Recover
	public static final String URL_RECOVER = "/recover";

	// MATCH
	public static final String ADD_MATCH_NAME = "/add/match/name";
	public static final String ADD_MATCH_SKU = "/add/match/sku";
	public static final String ADD_MATCH_CODE = "/add/match/code";
	public static final String ADD_MATCH_EMAIL = "/add/match/email";
	public static final String ADD_MATCH_PHONE = "/add/match/phone";
	public static final String UPDATE_MATCH_NAME = "/update/match/name";
	public static final String UPDATE_MATCH_SKU = "/update/match/sku";
	public static final String UPDATE_MATCH_CODE = "/update/match/code";
	public static final String UPDATE_MATCH_PHONE = "/update/match/phone";
	public static final String URL_ADD_MATCH_NAME = ADD_MATCH_NAME + NAME;
	public static final String URL_ADD_MATCH_SKU = ADD_MATCH_SKU + SKU;
	public static final String URL_ADD_MATCH_CODE = ADD_MATCH_CODE + CODE;
	public static final String URL_ADD_MATCH_EMAIL = ADD_MATCH_EMAIL + EMAIL;
	public static final String URL_ADD_MATCH_PHONE = ADD_MATCH_PHONE + PHONE;
	public static final String URL_UPDATE_MATCH_EMAIL_PHONE = UPDATE_MATCH_PHONE + EMAIL + PHONE;
	public static final String URL_UPDATE_MATCH_SKU_NAME = UPDATE_MATCH_NAME + SKU + NAME;
	public static final String URL_UPDATE_MATCH_PRODUCTSKU_SKU = UPDATE_MATCH_SKU + "/{productSku}" + SKU;
	public static final String URL_UPDATE_MATCH_CODE_NAME = UPDATE_MATCH_NAME + CODE + NAME;
	public static final String URL_UPDATE_MATCH_CATEGORYCODE_CODE = UPDATE_MATCH_CODE + "/{categoryCode}" + CODE;
	public static final String URL_UPDATE_MATCH_SIZECODE_CODE = UPDATE_MATCH_CODE + "/{sizeCode}" + CODE;
	public static final String URL_UPDATE_MATCH_COUPONCODE_CODE = UPDATE_MATCH_CODE + "/{couponCode}" + CODE;
	public static final String URL_UPDATE_PROFILE_MATCH_PHONE = "/update/profile/match/phone/{phone}";
}
