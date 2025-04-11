package com.skilworth.bpprinter;


public class BPPrinter {

        public static final int ENCODING_UTF8 = 3;
        public static final int ENCODING_GBK = 4;
        public static final int LANG_CH = 0;
        public static final int LANG_PERSIAN = 1;
        public static final int LANG_ENGLISH = 2;
        public static final int LANG_FRENCH = 3;
        public static final int LANG_RUSSIAN = 4;
        public static final int LANG_SPANISH = 5;
        public static final int LANG_PORTUGUESE = 6;
        public static final String USE_DRIVER_PRINT = "usedriverPrint";
        public static final String MODULE_NAME_ASD18 = "asd18";
        public static StringBuffer strSb;

        public BPPrinter() { /* compiled code */ }

        public static void setContext(android.content.Context context) { com.vanstone.trans.api.PrinterApi.setContext(context); }

        public static int printEnd_Api() { return com.vanstone.trans.api.PrinterApi.printEnd_Api(); }

        public static int printQueryStatus_Api() { return com.vanstone.trans.api.PrinterApi.printQueryStatus_Api(); }

        public static void printAddBarCode_Api(int align, int width, int height, boolean isShowtext, String barcode, String code) { com.vanstone.trans.api.PrinterApi.printAddBarCode_Api(align, width, height, isShowtext, barcode, code); }

        public static int printPaperFeed_Api(int pixel) { return com.vanstone.trans.api.PrinterApi.printPaperFeed_Api(pixel); }

        public static int printSetTextSize_Api(int textSize) { return com.vanstone.trans.api.PrinterApi.printSetTextSize_Api(textSize); }

        public static void printSetBlodText_Api(boolean isBold) { com.vanstone.trans.api.PrinterApi.printSetBlodText_Api(isBold); }

        public static int printGetTextSize_Api() { return com.vanstone.trans.api.PrinterApi.printGetTextSize_Api(); }

        public static void printSetLineThrough_Api(boolean isLineThrough) { com.vanstone.trans.api.PrinterApi.printSetLineThrough_Api(isLineThrough); }

        public static void printSetItalic_Api(float value) { com.vanstone.trans.api.PrinterApi.printSetItalic_Api(value); }

        public static void printSetAlign_Api(int value) { com.vanstone.trans.api.PrinterApi.printSetAlign_Api(value); }

        public static void printSetGray_Api(int gray) { com.vanstone.trans.api.PrinterApi.printSetGray_Api(gray); }

        public static void printSetInvert_Api(boolean isInvert) { com.vanstone.trans.api.PrinterApi.printSetInvert_Api(isInvert); }

        public static void PrnSetParams_Api(android.os.Bundle bundle) { com.vanstone.trans.api.PrinterApi.PrnSetParams_Api(bundle); }

        public static void printAddText_Api(int font, int align, String text) { com.vanstone.trans.api.PrinterApi.printAddText_Api(font, align, text); }

        public static void printAddBarCode_Api(int align, int width, int height, boolean isShowtext, String barcode) { com.vanstone.trans.api.PrinterApi.printAddBarCode_Api(align, width, height, isShowtext, barcode); }

        public static void printAddBarCode_Api(int align, int width, int height, String barcode) { com.vanstone.trans.api.PrinterApi.printAddBarCode_Api(align, width, height, barcode); }

        public static void printAddQrCode_Api(int align, int height, String qrCode) {  com.vanstone.trans.api.PrinterApi.printAddQrCode_Api(align, height, qrCode); }

        public static void printAddImage_Api(int offset, int width, int height, byte[] imageData) { com.vanstone.trans.api.PrinterApi.printAddImage_Api(offset, width, height, imageData); }

        public static void printFeedLine_Api(int lines) { com.vanstone.trans.api.PrinterApi.printFeedLine_Api(lines); }

        public static void printStartPrint_Api() { com.vanstone.trans.api.PrinterApi.printStartPrint_Api(); }

        public static int PrnStep_Api(int pixel) { return com.vanstone.trans.api.PrinterApi.PrnStep_Api(pixel); }

        public static int PrnStatus_Api(android.content.Context context) { return com.vanstone.trans.api.PrinterApi.PrnStatus_Api(context); }

        public static int PrnStatus_Api() { return com.vanstone.trans.api.PrinterApi.PrnStatus_Api(); }

        public static void PrnClrBuff_Api() { com.vanstone.trans.api.PrinterApi.PrnClrBuff_Api(); }

        public static void PrnLeftIndSet_Api(short usLeftIndent) { com.vanstone.trans.api.PrinterApi.PrnLeftIndSet_Api(usLeftIndent); }

        public static void PrnLineSpaceSet_Api(short ucLineSpace, int ucCharSpace) { com.vanstone.trans.api.PrinterApi.PrnLineSpaceSet_Api(ucLineSpace, ucCharSpace); }

        public static void PrnSpeedSet_Api(int ucSpeed) { com.vanstone.trans.api.PrinterApi.PrnSpeedSet_Api(ucSpeed); }

        public static void PrnFontSet_Api(int Ascii, int CFont, int Zoom) { com.vanstone.trans.api.PrinterApi.PrnFontSet_Api(Ascii, CFont, Zoom); }

        public static void PrnHTSet_Api(int HT) { com.vanstone.trans.api.PrinterApi.PrnHTSet_Api(HT); }

        public static int PrnStr_Api(String strIn) { return com.vanstone.trans.api.PrinterApi.PrnStr_Api(strIn); }

        public static int PrnCheckPrnData_Api() { return com.vanstone.trans.api.PrinterApi.PrnCheckPrnData_Api(); }

        public static int PrnStart_Api() { return com.vanstone.trans.api.PrinterApi.PrnStart_Api(); }

        public static int GetPrintState() { return com.vanstone.trans.api.PrinterApi.GetPrintState(); }

        public static int PrnLogo_Api(byte[] Logo, int ArorFnFlag) { return com.vanstone.trans.api.PrinterApi.PrnLogo_Api(Logo, ArorFnFlag); }

        public static int PrnLogo_Api(android.graphics.Bitmap bitmap) { return com.vanstone.trans.api.PrinterApi.PrnLogo_Api(bitmap); }

        public static int PrnSetGray_Api(int Gray) { return com.vanstone.trans.api.PrinterApi.PrnSetGray_Api(Gray); }

        public static void SetLang_Api(int lang, int encodeType) { SetLang_Api(lang, encodeType); }

        public static int GetLang_Api() { return com.vanstone.trans.api.PrinterApi.GetLang_Api(); }

        public static int PrnSetFont_Api(int font, int style) { return com.vanstone.trans.api.PrinterApi.PrnSetFont_Api(font, style); }

        /**
         * @deprecated
         */
        public static void PrnLessen_Api(boolean b) {  com.vanstone.trans.api.PrinterApi.PrnLessen_Api(b); }

        /**
         * @deprecated
         */
        public static void PrnZoom_Api(boolean b) { com.vanstone.trans.api.PrinterApi.PrnZoom_Api(b); }

        /**
         * @deprecated
         */
        public static void PrnHTSet_Api(boolean b) { com.vanstone.trans.api.PrinterApi.PrnHTSet_Api(b); }

        public static int PrnOpen_Api(String str, android.content.Context context) { return com.vanstone.trans.api.PrinterApi.PrnOpen_Api(str, context); }

        public static void PrnClose_Api() { com.vanstone.trans.api.PrinterApi.PrnClose_Api(); }

        public static void PrnCut_Api() { com.vanstone.trans.api.PrinterApi.PrnCut_Api(); }

        public static int PrnStr_Api(byte[] buf) { return com.vanstone.trans.api.PrinterApi.PrnStr_Api(buf); }

        public static int setFontName_Api(String fontPath) { return com.vanstone.trans.api.PrinterApi.setFontName_Api(fontPath); }

        public static void PrnFontSet_Api(android.content.res.AssetManager assets, String fontName) { com.vanstone.trans.api.PrinterApi.PrnFontSet_Api(assets, fontName); }

        public static void PrnReleaseModule_Api() { com.vanstone.trans.api.PrinterApi.PrnReleaseModule_Api(); }

        public static int PrnSelectModule_Api(String moduleName, android.os.Bundle param) { return com.vanstone.trans.api.PrinterApi.PrnSelectModule_Api(moduleName, param); }

        public static String[] PrnGetSupportModule_Api() { return com.vanstone.trans.api.PrinterApi.PrnGetSupportModule_Api(); }

        public static android.os.Bundle PrnGetModuleInfo_Api() { return com.vanstone.trans.api.PrinterApi.PrnGetModuleInfo_Api(); }
    }
