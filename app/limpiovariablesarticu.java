package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class limpiovariablesarticu extends GXProcedure
{
   public limpiovariablesarticu( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( limpiovariablesarticu.class ), "" );
   }

   public limpiovariablesarticu( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String aP0 ,
                                           String[] aP1 ,
                                           String[] aP2 ,
                                           String[] aP3 ,
                                           String[] aP4 ,
                                           String[] aP5 ,
                                           String[] aP6 ,
                                           String[] aP7 ,
                                           short[] aP8 ,
                                           String[] aP9 ,
                                           String[] aP10 ,
                                           String[] aP11 ,
                                           String[] aP12 ,
                                           String[] aP13 ,
                                           short[] aP14 ,
                                           short[] aP15 ,
                                           short[] aP16 ,
                                           java.math.BigDecimal[] aP17 ,
                                           byte[] aP18 ,
                                           String[] aP19 ,
                                           String[] aP20 ,
                                           String[] aP21 ,
                                           short[] aP22 ,
                                           short[] aP23 ,
                                           short[] aP24 ,
                                           short[] aP25 ,
                                           short[] aP26 ,
                                           short[] aP27 ,
                                           short[] aP28 ,
                                           short[] aP29 ,
                                           short[] aP30 ,
                                           short[] aP31 ,
                                           short[] aP32 ,
                                           short[] aP33 ,
                                           short[] aP34 ,
                                           short[] aP35 ,
                                           short[] aP36 ,
                                           short[] aP37 ,
                                           short[] aP38 ,
                                           short[] aP39 ,
                                           java.math.BigDecimal[] aP40 ,
                                           java.math.BigDecimal[] aP41 ,
                                           String[] aP42 ,
                                           String[] aP43 ,
                                           String[] aP44 ,
                                           String[] aP45 )
   {
      limpiovariablesarticu.this.aP46 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33, aP34, aP35, aP36, aP37, aP38, aP39, aP40, aP41, aP42, aP43, aP44, aP45, aP46);
      return aP46[0];
   }

   public void execute( String aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        short[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 ,
                        String[] aP11 ,
                        String[] aP12 ,
                        String[] aP13 ,
                        short[] aP14 ,
                        short[] aP15 ,
                        short[] aP16 ,
                        java.math.BigDecimal[] aP17 ,
                        byte[] aP18 ,
                        String[] aP19 ,
                        String[] aP20 ,
                        String[] aP21 ,
                        short[] aP22 ,
                        short[] aP23 ,
                        short[] aP24 ,
                        short[] aP25 ,
                        short[] aP26 ,
                        short[] aP27 ,
                        short[] aP28 ,
                        short[] aP29 ,
                        short[] aP30 ,
                        short[] aP31 ,
                        short[] aP32 ,
                        short[] aP33 ,
                        short[] aP34 ,
                        short[] aP35 ,
                        short[] aP36 ,
                        short[] aP37 ,
                        short[] aP38 ,
                        short[] aP39 ,
                        java.math.BigDecimal[] aP40 ,
                        java.math.BigDecimal[] aP41 ,
                        String[] aP42 ,
                        String[] aP43 ,
                        String[] aP44 ,
                        String[] aP45 ,
                        java.math.BigDecimal[] aP46 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33, aP34, aP35, aP36, aP37, aP38, aP39, aP40, aP41, aP42, aP43, aP44, aP45, aP46);
   }

   private void execute_int( String aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             short[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 ,
                             String[] aP13 ,
                             short[] aP14 ,
                             short[] aP15 ,
                             short[] aP16 ,
                             java.math.BigDecimal[] aP17 ,
                             byte[] aP18 ,
                             String[] aP19 ,
                             String[] aP20 ,
                             String[] aP21 ,
                             short[] aP22 ,
                             short[] aP23 ,
                             short[] aP24 ,
                             short[] aP25 ,
                             short[] aP26 ,
                             short[] aP27 ,
                             short[] aP28 ,
                             short[] aP29 ,
                             short[] aP30 ,
                             short[] aP31 ,
                             short[] aP32 ,
                             short[] aP33 ,
                             short[] aP34 ,
                             short[] aP35 ,
                             short[] aP36 ,
                             short[] aP37 ,
                             short[] aP38 ,
                             short[] aP39 ,
                             java.math.BigDecimal[] aP40 ,
                             java.math.BigDecimal[] aP41 ,
                             String[] aP42 ,
                             String[] aP43 ,
                             String[] aP44 ,
                             String[] aP45 ,
                             java.math.BigDecimal[] aP46 )
   {
      limpiovariablesarticu.this.AV59EmprCod = aP0;
      limpiovariablesarticu.this.aP1 = aP1;
      limpiovariablesarticu.this.aP2 = aP2;
      limpiovariablesarticu.this.aP3 = aP3;
      limpiovariablesarticu.this.aP4 = aP4;
      limpiovariablesarticu.this.aP5 = aP5;
      limpiovariablesarticu.this.aP6 = aP6;
      limpiovariablesarticu.this.aP7 = aP7;
      limpiovariablesarticu.this.aP8 = aP8;
      limpiovariablesarticu.this.aP9 = aP9;
      limpiovariablesarticu.this.aP10 = aP10;
      limpiovariablesarticu.this.aP11 = aP11;
      limpiovariablesarticu.this.aP12 = aP12;
      limpiovariablesarticu.this.aP13 = aP13;
      limpiovariablesarticu.this.aP14 = aP14;
      limpiovariablesarticu.this.aP15 = aP15;
      limpiovariablesarticu.this.aP16 = aP16;
      limpiovariablesarticu.this.aP17 = aP17;
      limpiovariablesarticu.this.aP18 = aP18;
      limpiovariablesarticu.this.aP19 = aP19;
      limpiovariablesarticu.this.aP20 = aP20;
      limpiovariablesarticu.this.aP21 = aP21;
      limpiovariablesarticu.this.aP22 = aP22;
      limpiovariablesarticu.this.aP23 = aP23;
      limpiovariablesarticu.this.aP24 = aP24;
      limpiovariablesarticu.this.aP25 = aP25;
      limpiovariablesarticu.this.aP26 = aP26;
      limpiovariablesarticu.this.aP27 = aP27;
      limpiovariablesarticu.this.aP28 = aP28;
      limpiovariablesarticu.this.aP29 = aP29;
      limpiovariablesarticu.this.aP30 = aP30;
      limpiovariablesarticu.this.aP31 = aP31;
      limpiovariablesarticu.this.aP32 = aP32;
      limpiovariablesarticu.this.aP33 = aP33;
      limpiovariablesarticu.this.aP34 = aP34;
      limpiovariablesarticu.this.aP35 = aP35;
      limpiovariablesarticu.this.aP36 = aP36;
      limpiovariablesarticu.this.aP37 = aP37;
      limpiovariablesarticu.this.aP38 = aP38;
      limpiovariablesarticu.this.aP39 = aP39;
      limpiovariablesarticu.this.aP40 = aP40;
      limpiovariablesarticu.this.aP41 = aP41;
      limpiovariablesarticu.this.aP42 = aP42;
      limpiovariablesarticu.this.aP43 = aP43;
      limpiovariablesarticu.this.aP44 = aP44;
      limpiovariablesarticu.this.aP45 = aP45;
      limpiovariablesarticu.this.aP46 = aP46;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8DisArtMat = "" ;
      AV9DisArtTip = (short)(0) ;
      AV10DisArtDsc = "" ;
      AV11DisArtPes = (short)(0) ;
      AV33DisArtAnh = (short)(0) ;
      AV34DisArtAn1 = (short)(0) ;
      AV35DisArtAcb = (short)(0) ;
      AV36DisArtAc2 = (short)(0) ;
      AV12DisArtRdt = DecimalUtil.doubleToDec(0) ;
      AV13DisArtPle = "" ;
      AV14DisArtLar = "" ;
      AV15DisArtCor = "N" ;
      AV16DisArtEnc = "N" ;
      AV17DisArtSua = "" ;
      AV18DisArtAca = "" ;
      AV19DisArtUrg = (byte)(9) ;
      AV20DisArtTr1 = "" ;
      AV21DisArtTr2 = "" ;
      AV22DisArtTr3 = "" ;
      AV23DisArtPt1 = (short)(0) ;
      AV24DisArtPt2 = (short)(0) ;
      AV25DisArtPt3 = (short)(0) ;
      AV26DisArtUr1 = "" ;
      AV27DisArtUr2 = "" ;
      AV28DisArtUr3 = "" ;
      AV29DisArtPu1 = (short)(0) ;
      AV30DisArtPu2 = (short)(0) ;
      AV31DisArtPu3 = (short)(0) ;
      AV32DisGraCru = (short)(0) ;
      AV37DisEncCom = (short)(0) ;
      AV38DisEncAnh = (short)(0) ;
      AV40DisPle2 = "" ;
      AV42DisAncSal1 = (short)(0) ;
      AV43DisAncSal2 = (short)(0) ;
      AV44DisAncSal3 = (short)(0) ;
      AV45DisGraAca2 = (short)(0) ;
      AV46DisGraCru2 = (short)(0) ;
      AV41DisNumCor = (short)(0) ;
      AV47DisGraAca = (short)(0) ;
      AV48DisRdoA = DecimalUtil.doubleToDec(0) ;
      AV49DisRdoN = DecimalUtil.doubleToDec(0) ;
      AV52dISITEM5 = " " ;
      AV57DisArtMer = DecimalUtil.doubleToDec(0) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = limpiovariablesarticu.this.AV10DisArtDsc;
      this.aP2[0] = limpiovariablesarticu.this.AV8DisArtMat;
      this.aP3[0] = limpiovariablesarticu.this.AV40DisPle2;
      this.aP4[0] = limpiovariablesarticu.this.AV14DisArtLar;
      this.aP5[0] = limpiovariablesarticu.this.AV17DisArtSua;
      this.aP6[0] = limpiovariablesarticu.this.AV18DisArtAca;
      this.aP7[0] = limpiovariablesarticu.this.AV13DisArtPle;
      this.aP8[0] = limpiovariablesarticu.this.AV9DisArtTip;
      this.aP9[0] = limpiovariablesarticu.this.AV16DisArtEnc;
      this.aP10[0] = limpiovariablesarticu.this.AV15DisArtCor;
      this.aP11[0] = limpiovariablesarticu.this.AV20DisArtTr1;
      this.aP12[0] = limpiovariablesarticu.this.AV21DisArtTr2;
      this.aP13[0] = limpiovariablesarticu.this.AV22DisArtTr3;
      this.aP14[0] = limpiovariablesarticu.this.AV23DisArtPt1;
      this.aP15[0] = limpiovariablesarticu.this.AV24DisArtPt2;
      this.aP16[0] = limpiovariablesarticu.this.AV25DisArtPt3;
      this.aP17[0] = limpiovariablesarticu.this.AV12DisArtRdt;
      this.aP18[0] = limpiovariablesarticu.this.AV19DisArtUrg;
      this.aP19[0] = limpiovariablesarticu.this.AV26DisArtUr1;
      this.aP20[0] = limpiovariablesarticu.this.AV27DisArtUr2;
      this.aP21[0] = limpiovariablesarticu.this.AV28DisArtUr3;
      this.aP22[0] = limpiovariablesarticu.this.AV29DisArtPu1;
      this.aP23[0] = limpiovariablesarticu.this.AV30DisArtPu2;
      this.aP24[0] = limpiovariablesarticu.this.AV31DisArtPu3;
      this.aP25[0] = limpiovariablesarticu.this.AV11DisArtPes;
      this.aP26[0] = limpiovariablesarticu.this.AV32DisGraCru;
      this.aP27[0] = limpiovariablesarticu.this.AV33DisArtAnh;
      this.aP28[0] = limpiovariablesarticu.this.AV34DisArtAn1;
      this.aP29[0] = limpiovariablesarticu.this.AV35DisArtAcb;
      this.aP30[0] = limpiovariablesarticu.this.AV36DisArtAc2;
      this.aP31[0] = limpiovariablesarticu.this.AV37DisEncCom;
      this.aP32[0] = limpiovariablesarticu.this.AV38DisEncAnh;
      this.aP33[0] = limpiovariablesarticu.this.AV41DisNumCor;
      this.aP34[0] = limpiovariablesarticu.this.AV42DisAncSal1;
      this.aP35[0] = limpiovariablesarticu.this.AV43DisAncSal2;
      this.aP36[0] = limpiovariablesarticu.this.AV44DisAncSal3;
      this.aP37[0] = limpiovariablesarticu.this.AV45DisGraAca2;
      this.aP38[0] = limpiovariablesarticu.this.AV46DisGraCru2;
      this.aP39[0] = limpiovariablesarticu.this.AV47DisGraAca;
      this.aP40[0] = limpiovariablesarticu.this.AV48DisRdoA;
      this.aP41[0] = limpiovariablesarticu.this.AV49DisRdoN;
      this.aP42[0] = limpiovariablesarticu.this.AV51DisObsgrm;
      this.aP43[0] = limpiovariablesarticu.this.AV50DisObsanc;
      this.aP44[0] = limpiovariablesarticu.this.AV52dISITEM5;
      this.aP45[0] = limpiovariablesarticu.this.AV53DisUniMed;
      this.aP46[0] = limpiovariablesarticu.this.AV57DisArtMer;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10DisArtDsc = "" ;
      AV8DisArtMat = "" ;
      AV40DisPle2 = "" ;
      AV14DisArtLar = "" ;
      AV17DisArtSua = "" ;
      AV18DisArtAca = "" ;
      AV13DisArtPle = "" ;
      AV16DisArtEnc = "" ;
      AV15DisArtCor = "" ;
      AV20DisArtTr1 = "" ;
      AV21DisArtTr2 = "" ;
      AV22DisArtTr3 = "" ;
      AV12DisArtRdt = DecimalUtil.ZERO ;
      AV26DisArtUr1 = "" ;
      AV27DisArtUr2 = "" ;
      AV28DisArtUr3 = "" ;
      AV48DisRdoA = DecimalUtil.ZERO ;
      AV49DisRdoN = DecimalUtil.ZERO ;
      AV51DisObsgrm = "" ;
      AV50DisObsanc = "" ;
      AV52dISITEM5 = "" ;
      AV53DisUniMed = "" ;
      AV57DisArtMer = DecimalUtil.ZERO ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV19DisArtUrg ;
   private short AV9DisArtTip ;
   private short AV23DisArtPt1 ;
   private short AV24DisArtPt2 ;
   private short AV25DisArtPt3 ;
   private short AV29DisArtPu1 ;
   private short AV30DisArtPu2 ;
   private short AV31DisArtPu3 ;
   private short AV11DisArtPes ;
   private short AV32DisGraCru ;
   private short AV33DisArtAnh ;
   private short AV34DisArtAn1 ;
   private short AV35DisArtAcb ;
   private short AV36DisArtAc2 ;
   private short AV37DisEncCom ;
   private short AV38DisEncAnh ;
   private short AV41DisNumCor ;
   private short AV42DisAncSal1 ;
   private short AV43DisAncSal2 ;
   private short AV44DisAncSal3 ;
   private short AV45DisGraAca2 ;
   private short AV46DisGraCru2 ;
   private short AV47DisGraAca ;
   private short Gx_err ;
   private java.math.BigDecimal AV12DisArtRdt ;
   private java.math.BigDecimal AV48DisRdoA ;
   private java.math.BigDecimal AV49DisRdoN ;
   private java.math.BigDecimal AV57DisArtMer ;
   private String AV59EmprCod ;
   private String AV10DisArtDsc ;
   private String AV8DisArtMat ;
   private String AV40DisPle2 ;
   private String AV14DisArtLar ;
   private String AV17DisArtSua ;
   private String AV18DisArtAca ;
   private String AV13DisArtPle ;
   private String AV16DisArtEnc ;
   private String AV15DisArtCor ;
   private String AV20DisArtTr1 ;
   private String AV21DisArtTr2 ;
   private String AV22DisArtTr3 ;
   private String AV26DisArtUr1 ;
   private String AV27DisArtUr2 ;
   private String AV28DisArtUr3 ;
   private String AV51DisObsgrm ;
   private String AV50DisObsanc ;
   private String AV52dISITEM5 ;
   private String AV53DisUniMed ;
   private java.math.BigDecimal[] aP46 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private short[] aP8 ;
   private String[] aP9 ;
   private String[] aP10 ;
   private String[] aP11 ;
   private String[] aP12 ;
   private String[] aP13 ;
   private short[] aP14 ;
   private short[] aP15 ;
   private short[] aP16 ;
   private java.math.BigDecimal[] aP17 ;
   private byte[] aP18 ;
   private String[] aP19 ;
   private String[] aP20 ;
   private String[] aP21 ;
   private short[] aP22 ;
   private short[] aP23 ;
   private short[] aP24 ;
   private short[] aP25 ;
   private short[] aP26 ;
   private short[] aP27 ;
   private short[] aP28 ;
   private short[] aP29 ;
   private short[] aP30 ;
   private short[] aP31 ;
   private short[] aP32 ;
   private short[] aP33 ;
   private short[] aP34 ;
   private short[] aP35 ;
   private short[] aP36 ;
   private short[] aP37 ;
   private short[] aP38 ;
   private short[] aP39 ;
   private java.math.BigDecimal[] aP40 ;
   private java.math.BigDecimal[] aP41 ;
   private String[] aP42 ;
   private String[] aP43 ;
   private String[] aP44 ;
   private String[] aP45 ;
}

