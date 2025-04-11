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

        public static void setContext(android.content.Context context) { setContext(context); }

        public static int printEnd_Api() { return printEnd_Api(); }

        public static int printQueryStatus_Api() { return printQueryStatus_Api(); }

        public static void printAddBarCode_Api(int align, int width, int height, boolean isShowtext, String barcode, String code) { printAddBarCode_Api(align, width, height, isShowtext, barcode, code); }

        public static int printPaperFeed_Api(int pixel) { return printPaperFeed_Api(pixel); }

        public static int printSetTextSize_Api(int textSize) { return printSetTextSize_Api(textSize); }

        public static void printSetBlodText_Api(boolean isBold) { printSetBlodText_Api(isBold); }

        public static int printGetTextSize_Api() { return printGetTextSize_Api(); }

        public static void printSetLineThrough_Api(boolean isLineThrough) { printSetLineThrough_Api(isLineThrough); }

        public static void printSetItalic_Api(float value) { printSetItalic_Api(value); }

        public static void printSetAlign_Api(int value) { printSetAlign_Api(value); }

        public static void printSetGray_Api(int gray) { printSetGray_Api(gray); }

        public static void printSetInvert_Api(boolean isInvert) { printSetInvert_Api(isInvert); }

        public static void PrnSetParams_Api(android.os.Bundle bundle) { PrnSetParams_Api(bundle); }

        public static void printAddText_Api(int font, int align, String text) { printAddText_Api(font, align, text); }

        public static void printAddBarCode_Api(int align, int width, int height, boolean isShowtext, String barcode) { com.vanstone.trans.api.PrinterApi.printAddBarCode_Api(align, width, height, isShowtext, barcode); }

        public static void printAddBarCode_Api(int align, int width, int height, String barcode) { com.vanstone.trans.api.PrinterApi.printAddBarCode_Api(align, width, height, barcode); }

        public static void printAddQrCode_Api(int align, int height, String qrCode) {  printAddQrCode_Api(align, height, qrCode); }

        public static void printAddImage_Api(int offset, int width, int height, byte[] imageData) { printAddImage_Api(offset, width, height, imageData); }

        public static void printFeedLine_Api(int lines) { printFeedLine_Api(lines); }

        public static void printStartPrint_Api() { printStartPrint_Api(); }

        public static int PrnStep_Api(int pixel) { return PrnStep_Api(pixel); }

        public static int PrnStatus_Api(android.content.Context context) { return PrnStatus_Api(context); }

        public static int PrnStatus_Api() { return com.vanstone.trans.api.PrinterApi.PrnStatus_Api(); }

        public static void PrnClrBuff_Api() { PrnClrBuff_Api(); }

        public static void PrnLeftIndSet_Api(short usLeftIndent) { PrnLeftIndSet_Api(usLeftIndent); }

        public static void PrnLineSpaceSet_Api(short ucLineSpace, int ucCharSpace) { PrnLineSpaceSet_Api(ucLineSpace, ucCharSpace); }

        public static void PrnSpeedSet_Api(int ucSpeed) { PrnSpeedSet_Api(ucSpeed); }

        public static void PrnFontSet_Api(int Ascii, int CFont, int Zoom) { PrnFontSet_Api(Ascii, CFont, Zoom); }

        public static void PrnHTSet_Api(int HT) { PrnHTSet_Api(HT); }

        public static int PrnStr_Api(String strIn) { return PrnStr_Api(strIn); }

        public static int PrnCheckPrnData_Api() { return PrnCheckPrnData_Api(); }

        public static int PrnStart_Api() { return PrnStart_Api(); }

        public static int GetPrintState() { return GetPrintState(); }

        public static int PrnLogo_Api(byte[] Logo, int ArorFnFlag) { return PrnLogo_Api(Logo, ArorFnFlag); }

        public static int PrnLogo_Api(android.graphics.Bitmap bitmap) { return PrnLogo_Api(bitmap); }

        public static int PrnSetGray_Api(int Gray) { return PrnSetGray_Api(Gray); }

        public static void SetLang_Api(int lang, int encodeType) { SetLang_Api(lang, encodeType); }

        public static int GetLang_Api() { return GetLang_Api(); }

        public static int PrnSetFont_Api(int font, int style) { return PrnSetFont_Api(font, style); }

        /**
         * @deprecated
         */
        public static void PrnLessen_Api(boolean b) {  PrnLessen_Api(b); }

        /**
         * @deprecated
         */
        public static void PrnZoom_Api(boolean b) { PrnZoom_Api(b); }

        /**
         * @deprecated
         */
        public static void PrnHTSet_Api(boolean b) { PrnHTSet_Api(b); }

        public static int PrnOpen_Api(String str, android.content.Context context) { return PrnOpen_Api(str, context); }

        public static void PrnClose_Api() { PrnClose_Api(); }

        public static void PrnCut_Api() { PrnCut_Api(); }

        public static int PrnStr_Api(byte[] buf) { return PrnStr_Api(buf); }

        public static int setFontName_Api(String fontPath) { return setFontName_Api(fontPath); }

        public static void PrnFontSet_Api(android.content.res.AssetManager assets, String fontName) { PrnFontSet_Api(assets, fontName); }

        public static void PrnReleaseModule_Api() { PrnReleaseModule_Api(); }

        public static int PrnSelectModule_Api(String moduleName, android.os.Bundle param) { return PrnSelectModule_Api(moduleName, param); }

        public static String[] PrnGetSupportModule_Api() { return PrnGetSupportModule_Api(); }

        public static android.os.Bundle PrnGetModuleInfo_Api() { return PrnGetModuleInfo_Api(); }
    }
