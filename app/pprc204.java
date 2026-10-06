package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc204 extends GXProcedure
{
   public pprc204( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc204.class ), "" );
   }

   public pprc204( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            String[] aP1 ,
                            String[] aP2 ,
                            String[] aP3 ,
                            String[] aP4 ,
                            String[] aP5 ,
                            String[] aP6 ,
                            String[] aP7 ,
                            String[] aP8 ,
                            String[] aP9 ,
                            String[] aP10 ,
                            String[] aP11 ,
                            String[] aP12 ,
                            String[] aP13 ,
                            String[] aP14 ,
                            String[] aP15 ,
                            String[] aP16 ,
                            String[] aP17 ,
                            String[] aP18 ,
                            String[] aP19 ,
                            String[] aP20 ,
                            String[] aP21 ,
                            String[] aP22 ,
                            String[] aP23 ,
                            String[] aP24 ,
                            String[] aP25 ,
                            String[] aP26 ,
                            String[] aP27 ,
                            String[] aP28 ,
                            String[] aP29 ,
                            String[] aP30 ,
                            String[] aP31 ,
                            String[] aP32 ,
                            String[] aP33 ,
                            String[] aP34 ,
                            String[] aP35 ,
                            String[] aP36 ,
                            String[] aP37 ,
                            String[] aP38 ,
                            String[] aP39 ,
                            String[] aP40 ,
                            String[] aP41 ,
                            String[] aP42 ,
                            String[] aP43 ,
                            String[] aP44 ,
                            String[] aP45 ,
                            String[] aP46 ,
                            String[] aP47 ,
                            String[] aP48 ,
                            String[] aP49 ,
                            String[] aP50 ,
                            String[] aP51 ,
                            String[] aP52 ,
                            String[] aP53 ,
                            String[] aP54 ,
                            String[] aP55 ,
                            String[] aP56 ,
                            String[] AV68Tab_maq ,
                            String[][] AV65MaqHdrs )
   {
      pprc204.this.aP59 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33, aP34, aP35, aP36, aP37, aP38, aP39, aP40, aP41, aP42, aP43, aP44, aP45, aP46, aP47, aP48, aP49, aP50, aP51, aP52, aP53, aP54, aP55, aP56, AV68Tab_maq, AV65MaqHdrs, aP59);
      return aP59[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 ,
                        String[] aP11 ,
                        String[] aP12 ,
                        String[] aP13 ,
                        String[] aP14 ,
                        String[] aP15 ,
                        String[] aP16 ,
                        String[] aP17 ,
                        String[] aP18 ,
                        String[] aP19 ,
                        String[] aP20 ,
                        String[] aP21 ,
                        String[] aP22 ,
                        String[] aP23 ,
                        String[] aP24 ,
                        String[] aP25 ,
                        String[] aP26 ,
                        String[] aP27 ,
                        String[] aP28 ,
                        String[] aP29 ,
                        String[] aP30 ,
                        String[] aP31 ,
                        String[] aP32 ,
                        String[] aP33 ,
                        String[] aP34 ,
                        String[] aP35 ,
                        String[] aP36 ,
                        String[] aP37 ,
                        String[] aP38 ,
                        String[] aP39 ,
                        String[] aP40 ,
                        String[] aP41 ,
                        String[] aP42 ,
                        String[] aP43 ,
                        String[] aP44 ,
                        String[] aP45 ,
                        String[] aP46 ,
                        String[] aP47 ,
                        String[] aP48 ,
                        String[] aP49 ,
                        String[] aP50 ,
                        String[] aP51 ,
                        String[] aP52 ,
                        String[] aP53 ,
                        String[] aP54 ,
                        String[] aP55 ,
                        String[] aP56 ,
                        String[] AV68Tab_maq ,
                        String[][] AV65MaqHdrs ,
                        short[] aP59 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33, aP34, aP35, aP36, aP37, aP38, aP39, aP40, aP41, aP42, aP43, aP44, aP45, aP46, aP47, aP48, aP49, aP50, aP51, aP52, aP53, aP54, aP55, aP56, AV68Tab_maq, AV65MaqHdrs, aP59);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 ,
                             String[] aP13 ,
                             String[] aP14 ,
                             String[] aP15 ,
                             String[] aP16 ,
                             String[] aP17 ,
                             String[] aP18 ,
                             String[] aP19 ,
                             String[] aP20 ,
                             String[] aP21 ,
                             String[] aP22 ,
                             String[] aP23 ,
                             String[] aP24 ,
                             String[] aP25 ,
                             String[] aP26 ,
                             String[] aP27 ,
                             String[] aP28 ,
                             String[] aP29 ,
                             String[] aP30 ,
                             String[] aP31 ,
                             String[] aP32 ,
                             String[] aP33 ,
                             String[] aP34 ,
                             String[] aP35 ,
                             String[] aP36 ,
                             String[] aP37 ,
                             String[] aP38 ,
                             String[] aP39 ,
                             String[] aP40 ,
                             String[] aP41 ,
                             String[] aP42 ,
                             String[] aP43 ,
                             String[] aP44 ,
                             String[] aP45 ,
                             String[] aP46 ,
                             String[] aP47 ,
                             String[] aP48 ,
                             String[] aP49 ,
                             String[] aP50 ,
                             String[] aP51 ,
                             String[] aP52 ,
                             String[] aP53 ,
                             String[] aP54 ,
                             String[] aP55 ,
                             String[] aP56 ,
                             String[] AV68Tab_maq ,
                             String[][] AV65MaqHdrs ,
                             short[] aP59 )
   {
      pprc204.this.AV69Emprcod = aP0[0];
      this.aP0 = aP0;
      pprc204.this.AV9Maqcod1 = aP1[0];
      this.aP1 = aP1;
      pprc204.this.AV10MaqCod10 = aP2[0];
      this.aP2 = aP2;
      pprc204.this.AV11Maqcod11 = aP3[0];
      this.aP3 = aP3;
      pprc204.this.AV12MaqCod12 = aP4[0];
      this.aP4 = aP4;
      pprc204.this.AV13Maqcod13 = aP5[0];
      this.aP5 = aP5;
      pprc204.this.AV14Maqcod14 = aP6[0];
      this.aP6 = aP6;
      pprc204.this.AV15Maqcod15 = aP7[0];
      this.aP7 = aP7;
      pprc204.this.AV16Maqcod16 = aP8[0];
      this.aP8 = aP8;
      pprc204.this.AV17Maqcod17 = aP9[0];
      this.aP9 = aP9;
      pprc204.this.AV18Maqcod18 = aP10[0];
      this.aP10 = aP10;
      pprc204.this.AV19Maqcod19 = aP11[0];
      this.aP11 = aP11;
      pprc204.this.AV20Maqcod2 = aP12[0];
      this.aP12 = aP12;
      pprc204.this.AV21Maqcod20 = aP13[0];
      this.aP13 = aP13;
      pprc204.this.AV22Maqcod21 = aP14[0];
      this.aP14 = aP14;
      pprc204.this.AV23Maqcod22 = aP15[0];
      this.aP15 = aP15;
      pprc204.this.AV24Maqcod23 = aP16[0];
      this.aP16 = aP16;
      pprc204.this.AV25Maqcod24 = aP17[0];
      this.aP17 = aP17;
      pprc204.this.AV26Maqcod25 = aP18[0];
      this.aP18 = aP18;
      pprc204.this.AV27Maqcod26 = aP19[0];
      this.aP19 = aP19;
      pprc204.this.AV28Maqcod27 = aP20[0];
      this.aP20 = aP20;
      pprc204.this.AV29Maqcod28 = aP21[0];
      this.aP21 = aP21;
      pprc204.this.AV30Maqcod3 = aP22[0];
      this.aP22 = aP22;
      pprc204.this.AV31Maqcod4 = aP23[0];
      this.aP23 = aP23;
      pprc204.this.AV32Maqcod5 = aP24[0];
      this.aP24 = aP24;
      pprc204.this.AV33Maqcod6 = aP25[0];
      this.aP25 = aP25;
      pprc204.this.AV34Maqcod7 = aP26[0];
      this.aP26 = aP26;
      pprc204.this.AV35Maqcod8 = aP27[0];
      this.aP27 = aP27;
      pprc204.this.AV36Maqcod9 = aP28[0];
      this.aP28 = aP28;
      pprc204.this.AV37Maqdsc1 = aP29[0];
      this.aP29 = aP29;
      pprc204.this.AV38Maqdsc10 = aP30[0];
      this.aP30 = aP30;
      pprc204.this.AV39Maqdsc11 = aP31[0];
      this.aP31 = aP31;
      pprc204.this.AV40Maqdsc12 = aP32[0];
      this.aP32 = aP32;
      pprc204.this.AV41Maqdsc13 = aP33[0];
      this.aP33 = aP33;
      pprc204.this.AV42Maqdsc14 = aP34[0];
      this.aP34 = aP34;
      pprc204.this.AV43Maqdsc15 = aP35[0];
      this.aP35 = aP35;
      pprc204.this.AV44MaqDsc16 = aP36[0];
      this.aP36 = aP36;
      pprc204.this.AV45MaqDsc17 = aP37[0];
      this.aP37 = aP37;
      pprc204.this.AV46MaqDsc18 = aP38[0];
      this.aP38 = aP38;
      pprc204.this.AV47MaqDsc19 = aP39[0];
      this.aP39 = aP39;
      pprc204.this.AV48Maqdsc2 = aP40[0];
      this.aP40 = aP40;
      pprc204.this.AV49MaqDsc20 = aP41[0];
      this.aP41 = aP41;
      pprc204.this.AV50MaqDsc21 = aP42[0];
      this.aP42 = aP42;
      pprc204.this.AV51MaqDsc22 = aP43[0];
      this.aP43 = aP43;
      pprc204.this.AV52MaqDsc23 = aP44[0];
      this.aP44 = aP44;
      pprc204.this.AV53MaqDsc24 = aP45[0];
      this.aP45 = aP45;
      pprc204.this.AV54MaqDsc25 = aP46[0];
      this.aP46 = aP46;
      pprc204.this.AV55MaqDsc26 = aP47[0];
      this.aP47 = aP47;
      pprc204.this.AV56MaqDsc27 = aP48[0];
      this.aP48 = aP48;
      pprc204.this.AV57MaqDsc28 = aP49[0];
      this.aP49 = aP49;
      pprc204.this.AV58Maqdsc3 = aP50[0];
      this.aP50 = aP50;
      pprc204.this.AV59Maqdsc4 = aP51[0];
      this.aP51 = aP51;
      pprc204.this.AV60Maqdsc5 = aP52[0];
      this.aP52 = aP52;
      pprc204.this.AV61Maqdsc6 = aP53[0];
      this.aP53 = aP53;
      pprc204.this.AV62Maqdsc7 = aP54[0];
      this.aP54 = aP54;
      pprc204.this.AV63Maqdsc8 = aP55[0];
      this.aP55 = aP55;
      pprc204.this.AV64Maqdsc9 = aP56[0];
      this.aP56 = aP56;
      pprc204.this.AV68Tab_maq = AV68Tab_maq;
      pprc204.this.AV65MaqHdrs = AV65MaqHdrs;
      pprc204.this.AV67t = aP59[0];
      this.aP59 = aP59;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9Maqcod1 = "" ;
      AV20Maqcod2 = "" ;
      AV30Maqcod3 = "" ;
      AV31Maqcod4 = "" ;
      AV32Maqcod5 = "" ;
      AV33Maqcod6 = "" ;
      AV34Maqcod7 = "" ;
      AV35Maqcod8 = "" ;
      AV36Maqcod9 = "" ;
      AV10MaqCod10 = "" ;
      AV11Maqcod11 = "" ;
      AV12MaqCod12 = "" ;
      AV13Maqcod13 = "" ;
      AV14Maqcod14 = "" ;
      AV15Maqcod15 = "" ;
      AV16Maqcod16 = "" ;
      AV17Maqcod17 = "" ;
      AV18Maqcod18 = "" ;
      AV19Maqcod19 = "" ;
      AV21Maqcod20 = "" ;
      AV22Maqcod21 = "" ;
      AV23Maqcod22 = "" ;
      AV24Maqcod23 = "" ;
      AV25Maqcod24 = "" ;
      AV26Maqcod25 = "" ;
      AV27Maqcod26 = "" ;
      AV28Maqcod27 = "" ;
      AV29Maqcod28 = "" ;
      AV37Maqdsc1 = "" ;
      AV48Maqdsc2 = "" ;
      AV58Maqdsc3 = "" ;
      AV59Maqdsc4 = "" ;
      AV60Maqdsc5 = "" ;
      AV61Maqdsc6 = "" ;
      AV62Maqdsc7 = "" ;
      AV63Maqdsc8 = "" ;
      AV64Maqdsc9 = "" ;
      AV38Maqdsc10 = "" ;
      AV39Maqdsc11 = "" ;
      AV40Maqdsc12 = "" ;
      AV41Maqdsc13 = "" ;
      AV42Maqdsc14 = "" ;
      AV43Maqdsc15 = "" ;
      AV44MaqDsc16 = "" ;
      AV45MaqDsc17 = "" ;
      AV46MaqDsc18 = "" ;
      AV47MaqDsc19 = "" ;
      AV49MaqDsc20 = "" ;
      AV50MaqDsc21 = "" ;
      AV51MaqDsc22 = "" ;
      AV52MaqDsc23 = "" ;
      AV53MaqDsc24 = "" ;
      AV54MaqDsc25 = "" ;
      AV55MaqDsc26 = "" ;
      AV56MaqDsc27 = "" ;
      AV57MaqDsc28 = "" ;
      AV66i = (short)(1) ;
      AV67t = (short)(1) ;
      GX_I = 1 ;
      while ( GX_I <= 30 )
      {
         GX_J = 1 ;
         while ( GX_J <= 1000 )
         {
            AV65MaqHdrs[GX_I-1][GX_J-1] = " " ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      while ( AV66i <= 28 )
      {
         if ( AV66i == 1 )
         {
            AV9Maqcod1 = AV68Tab_maq[AV67t-1] ;
            GXt_char1 = AV37Maqdsc1 ;
            GXv_char2[0] = AV69Emprcod ;
            GXv_char3[0] = AV68Tab_maq[AV67t-1] ;
            GXv_char4[0] = GXt_char1 ;
            new app.pdscmqplanificar(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4) ;
            pprc204.this.AV69Emprcod = GXv_char2[0] ;
            pprc204.this.AV68Tab_maq[AV67t-1] = GXv_char3[0] ;
            pprc204.this.GXt_char1 = GXv_char4[0] ;
            AV37Maqdsc1 = GXt_char1 ;
            AV65MaqHdrs[AV66i-1][1-1] = AV37Maqdsc1 ;
         }
         else if ( AV66i == 2 )
         {
            AV20Maqcod2 = AV68Tab_maq[AV67t-1] ;
            GXt_char1 = AV48Maqdsc2 ;
            GXv_char4[0] = AV69Emprcod ;
            GXv_char3[0] = AV68Tab_maq[AV67t-1] ;
            GXv_char2[0] = GXt_char1 ;
            new app.pdscmqplanificar(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
            pprc204.this.AV69Emprcod = GXv_char4[0] ;
            pprc204.this.AV68Tab_maq[AV67t-1] = GXv_char3[0] ;
            pprc204.this.GXt_char1 = GXv_char2[0] ;
            AV48Maqdsc2 = GXt_char1 ;
            AV65MaqHdrs[AV66i-1][1-1] = AV48Maqdsc2 ;
         }
         else if ( AV66i == 3 )
         {
            AV30Maqcod3 = AV68Tab_maq[AV67t-1] ;
            GXt_char1 = AV58Maqdsc3 ;
            GXv_char4[0] = AV69Emprcod ;
            GXv_char3[0] = AV68Tab_maq[AV67t-1] ;
            GXv_char2[0] = GXt_char1 ;
            new app.pdscmqplanificar(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
            pprc204.this.AV69Emprcod = GXv_char4[0] ;
            pprc204.this.AV68Tab_maq[AV67t-1] = GXv_char3[0] ;
            pprc204.this.GXt_char1 = GXv_char2[0] ;
            AV58Maqdsc3 = GXt_char1 ;
            AV65MaqHdrs[AV66i-1][1-1] = AV58Maqdsc3 ;
         }
         else if ( AV66i == 4 )
         {
            AV31Maqcod4 = AV68Tab_maq[AV67t-1] ;
            GXt_char1 = AV59Maqdsc4 ;
            GXv_char4[0] = AV69Emprcod ;
            GXv_char3[0] = AV68Tab_maq[AV67t-1] ;
            GXv_char2[0] = GXt_char1 ;
            new app.pdscmqplanificar(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
            pprc204.this.AV69Emprcod = GXv_char4[0] ;
            pprc204.this.AV68Tab_maq[AV67t-1] = GXv_char3[0] ;
            pprc204.this.GXt_char1 = GXv_char2[0] ;
            AV59Maqdsc4 = GXt_char1 ;
            AV65MaqHdrs[AV66i-1][1-1] = AV59Maqdsc4 ;
         }
         else if ( AV66i == 5 )
         {
            AV32Maqcod5 = AV68Tab_maq[AV67t-1] ;
            GXt_char1 = AV60Maqdsc5 ;
            GXv_char4[0] = AV69Emprcod ;
            GXv_char3[0] = AV68Tab_maq[AV67t-1] ;
            GXv_char2[0] = GXt_char1 ;
            new app.pdscmqplanificar(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
            pprc204.this.AV69Emprcod = GXv_char4[0] ;
            pprc204.this.AV68Tab_maq[AV67t-1] = GXv_char3[0] ;
            pprc204.this.GXt_char1 = GXv_char2[0] ;
            AV60Maqdsc5 = GXt_char1 ;
            AV65MaqHdrs[AV66i-1][1-1] = AV60Maqdsc5 ;
         }
         else if ( AV66i == 6 )
         {
            AV33Maqcod6 = AV68Tab_maq[AV67t-1] ;
            GXt_char1 = AV61Maqdsc6 ;
            GXv_char4[0] = AV69Emprcod ;
            GXv_char3[0] = AV68Tab_maq[AV67t-1] ;
            GXv_char2[0] = GXt_char1 ;
            new app.pdscmqplanificar(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
            pprc204.this.AV69Emprcod = GXv_char4[0] ;
            pprc204.this.AV68Tab_maq[AV67t-1] = GXv_char3[0] ;
            pprc204.this.GXt_char1 = GXv_char2[0] ;
            AV61Maqdsc6 = GXt_char1 ;
            AV65MaqHdrs[AV66i-1][1-1] = AV61Maqdsc6 ;
         }
         else if ( AV66i == 7 )
         {
            AV34Maqcod7 = AV68Tab_maq[AV67t-1] ;
            GXt_char1 = AV62Maqdsc7 ;
            GXv_char4[0] = AV69Emprcod ;
            GXv_char3[0] = AV68Tab_maq[AV67t-1] ;
            GXv_char2[0] = GXt_char1 ;
            new app.pdscmqplanificar(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
            pprc204.this.AV69Emprcod = GXv_char4[0] ;
            pprc204.this.AV68Tab_maq[AV67t-1] = GXv_char3[0] ;
            pprc204.this.GXt_char1 = GXv_char2[0] ;
            AV62Maqdsc7 = GXt_char1 ;
            AV65MaqHdrs[AV66i-1][1-1] = AV62Maqdsc7 ;
         }
         else if ( AV66i == 8 )
         {
            AV35Maqcod8 = AV68Tab_maq[AV67t-1] ;
            GXt_char1 = AV63Maqdsc8 ;
            GXv_char4[0] = AV69Emprcod ;
            GXv_char3[0] = AV68Tab_maq[AV67t-1] ;
            GXv_char2[0] = GXt_char1 ;
            new app.pdscmqplanificar(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
            pprc204.this.AV69Emprcod = GXv_char4[0] ;
            pprc204.this.AV68Tab_maq[AV67t-1] = GXv_char3[0] ;
            pprc204.this.GXt_char1 = GXv_char2[0] ;
            AV63Maqdsc8 = GXt_char1 ;
            AV65MaqHdrs[AV66i-1][1-1] = AV63Maqdsc8 ;
         }
         else if ( AV66i == 9 )
         {
            AV36Maqcod9 = AV68Tab_maq[AV67t-1] ;
            GXt_char1 = AV64Maqdsc9 ;
            GXv_char4[0] = AV69Emprcod ;
            GXv_char3[0] = AV68Tab_maq[AV67t-1] ;
            GXv_char2[0] = GXt_char1 ;
            new app.pdscmqplanificar(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
            pprc204.this.AV69Emprcod = GXv_char4[0] ;
            pprc204.this.AV68Tab_maq[AV67t-1] = GXv_char3[0] ;
            pprc204.this.GXt_char1 = GXv_char2[0] ;
            AV64Maqdsc9 = GXt_char1 ;
            AV65MaqHdrs[AV66i-1][1-1] = AV64Maqdsc9 ;
         }
         else if ( AV66i == 10 )
         {
            AV10MaqCod10 = AV68Tab_maq[AV67t-1] ;
            GXt_char1 = AV38Maqdsc10 ;
            GXv_char4[0] = AV69Emprcod ;
            GXv_char3[0] = AV68Tab_maq[AV67t-1] ;
            GXv_char2[0] = GXt_char1 ;
            new app.pdscmqplanificar(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
            pprc204.this.AV69Emprcod = GXv_char4[0] ;
            pprc204.this.AV68Tab_maq[AV67t-1] = GXv_char3[0] ;
            pprc204.this.GXt_char1 = GXv_char2[0] ;
            AV38Maqdsc10 = GXt_char1 ;
            AV65MaqHdrs[AV66i-1][1-1] = AV38Maqdsc10 ;
         }
         else if ( AV66i == 11 )
         {
            AV11Maqcod11 = AV68Tab_maq[AV67t-1] ;
            GXt_char1 = AV39Maqdsc11 ;
            GXv_char4[0] = AV69Emprcod ;
            GXv_char3[0] = AV68Tab_maq[AV67t-1] ;
            GXv_char2[0] = GXt_char1 ;
            new app.pdscmqplanificar(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
            pprc204.this.AV69Emprcod = GXv_char4[0] ;
            pprc204.this.AV68Tab_maq[AV67t-1] = GXv_char3[0] ;
            pprc204.this.GXt_char1 = GXv_char2[0] ;
            AV39Maqdsc11 = GXt_char1 ;
            AV65MaqHdrs[AV66i-1][1-1] = AV39Maqdsc11 ;
         }
         else if ( AV66i == 12 )
         {
            AV12MaqCod12 = AV68Tab_maq[AV67t-1] ;
            GXt_char1 = AV40Maqdsc12 ;
            GXv_char4[0] = AV69Emprcod ;
            GXv_char3[0] = AV68Tab_maq[AV67t-1] ;
            GXv_char2[0] = GXt_char1 ;
            new app.pdscmqplanificar(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
            pprc204.this.AV69Emprcod = GXv_char4[0] ;
            pprc204.this.AV68Tab_maq[AV67t-1] = GXv_char3[0] ;
            pprc204.this.GXt_char1 = GXv_char2[0] ;
            AV40Maqdsc12 = GXt_char1 ;
            AV65MaqHdrs[AV66i-1][1-1] = AV40Maqdsc12 ;
         }
         else if ( AV66i == 13 )
         {
            AV13Maqcod13 = AV68Tab_maq[AV67t-1] ;
            GXt_char1 = AV41Maqdsc13 ;
            GXv_char4[0] = AV69Emprcod ;
            GXv_char3[0] = AV68Tab_maq[AV67t-1] ;
            GXv_char2[0] = GXt_char1 ;
            new app.pdscmqplanificar(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
            pprc204.this.AV69Emprcod = GXv_char4[0] ;
            pprc204.this.AV68Tab_maq[AV67t-1] = GXv_char3[0] ;
            pprc204.this.GXt_char1 = GXv_char2[0] ;
            AV41Maqdsc13 = GXt_char1 ;
            AV65MaqHdrs[AV66i-1][1-1] = AV41Maqdsc13 ;
         }
         else if ( AV66i == 14 )
         {
            AV14Maqcod14 = AV68Tab_maq[AV67t-1] ;
            GXt_char1 = AV42Maqdsc14 ;
            GXv_char4[0] = AV69Emprcod ;
            GXv_char3[0] = AV68Tab_maq[AV67t-1] ;
            GXv_char2[0] = GXt_char1 ;
            new app.pdscmqplanificar(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
            pprc204.this.AV69Emprcod = GXv_char4[0] ;
            pprc204.this.AV68Tab_maq[AV67t-1] = GXv_char3[0] ;
            pprc204.this.GXt_char1 = GXv_char2[0] ;
            AV42Maqdsc14 = GXt_char1 ;
            AV65MaqHdrs[AV66i-1][1-1] = AV42Maqdsc14 ;
         }
         else if ( AV66i == 15 )
         {
            AV15Maqcod15 = AV68Tab_maq[AV67t-1] ;
            GXt_char1 = AV43Maqdsc15 ;
            GXv_char4[0] = AV69Emprcod ;
            GXv_char3[0] = AV68Tab_maq[AV67t-1] ;
            GXv_char2[0] = GXt_char1 ;
            new app.pdscmqplanificar(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
            pprc204.this.AV69Emprcod = GXv_char4[0] ;
            pprc204.this.AV68Tab_maq[AV67t-1] = GXv_char3[0] ;
            pprc204.this.GXt_char1 = GXv_char2[0] ;
            AV43Maqdsc15 = GXt_char1 ;
            AV65MaqHdrs[AV66i-1][1-1] = AV43Maqdsc15 ;
         }
         else if ( AV66i == 16 )
         {
            AV16Maqcod16 = AV68Tab_maq[AV67t-1] ;
            GXt_char1 = AV44MaqDsc16 ;
            GXv_char4[0] = AV69Emprcod ;
            GXv_char3[0] = AV68Tab_maq[AV67t-1] ;
            GXv_char2[0] = GXt_char1 ;
            new app.pdscmqplanificar(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
            pprc204.this.AV69Emprcod = GXv_char4[0] ;
            pprc204.this.AV68Tab_maq[AV67t-1] = GXv_char3[0] ;
            pprc204.this.GXt_char1 = GXv_char2[0] ;
            AV44MaqDsc16 = GXt_char1 ;
            AV65MaqHdrs[AV66i-1][1-1] = AV44MaqDsc16 ;
         }
         else if ( AV66i == 17 )
         {
            AV17Maqcod17 = AV68Tab_maq[AV67t-1] ;
            GXt_char1 = AV45MaqDsc17 ;
            GXv_char4[0] = AV69Emprcod ;
            GXv_char3[0] = AV68Tab_maq[AV67t-1] ;
            GXv_char2[0] = GXt_char1 ;
            new app.pdscmqplanificar(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
            pprc204.this.AV69Emprcod = GXv_char4[0] ;
            pprc204.this.AV68Tab_maq[AV67t-1] = GXv_char3[0] ;
            pprc204.this.GXt_char1 = GXv_char2[0] ;
            AV45MaqDsc17 = GXt_char1 ;
            AV65MaqHdrs[AV66i-1][1-1] = AV45MaqDsc17 ;
         }
         else if ( AV66i == 18 )
         {
            AV18Maqcod18 = AV68Tab_maq[AV67t-1] ;
            GXt_char1 = AV46MaqDsc18 ;
            GXv_char4[0] = AV69Emprcod ;
            GXv_char3[0] = AV68Tab_maq[AV67t-1] ;
            GXv_char2[0] = GXt_char1 ;
            new app.pdscmqplanificar(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
            pprc204.this.AV69Emprcod = GXv_char4[0] ;
            pprc204.this.AV68Tab_maq[AV67t-1] = GXv_char3[0] ;
            pprc204.this.GXt_char1 = GXv_char2[0] ;
            AV46MaqDsc18 = GXt_char1 ;
            AV65MaqHdrs[AV66i-1][1-1] = AV46MaqDsc18 ;
         }
         else if ( AV66i == 19 )
         {
            AV19Maqcod19 = AV68Tab_maq[AV67t-1] ;
            GXt_char1 = AV47MaqDsc19 ;
            GXv_char4[0] = AV69Emprcod ;
            GXv_char3[0] = AV68Tab_maq[AV67t-1] ;
            GXv_char2[0] = GXt_char1 ;
            new app.pdscmqplanificar(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
            pprc204.this.AV69Emprcod = GXv_char4[0] ;
            pprc204.this.AV68Tab_maq[AV67t-1] = GXv_char3[0] ;
            pprc204.this.GXt_char1 = GXv_char2[0] ;
            AV47MaqDsc19 = GXt_char1 ;
            AV65MaqHdrs[AV66i-1][1-1] = AV47MaqDsc19 ;
         }
         else if ( AV66i == 20 )
         {
            AV21Maqcod20 = AV68Tab_maq[AV67t-1] ;
            GXt_char1 = AV49MaqDsc20 ;
            GXv_char4[0] = AV69Emprcod ;
            GXv_char3[0] = AV68Tab_maq[AV67t-1] ;
            GXv_char2[0] = GXt_char1 ;
            new app.pdscmqplanificar(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
            pprc204.this.AV69Emprcod = GXv_char4[0] ;
            pprc204.this.AV68Tab_maq[AV67t-1] = GXv_char3[0] ;
            pprc204.this.GXt_char1 = GXv_char2[0] ;
            AV49MaqDsc20 = GXt_char1 ;
            AV65MaqHdrs[AV66i-1][1-1] = AV49MaqDsc20 ;
         }
         else if ( AV66i == 21 )
         {
            AV22Maqcod21 = AV68Tab_maq[AV67t-1] ;
            GXt_char1 = AV50MaqDsc21 ;
            GXv_char4[0] = AV69Emprcod ;
            GXv_char3[0] = AV68Tab_maq[AV67t-1] ;
            GXv_char2[0] = GXt_char1 ;
            new app.pdscmqplanificar(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
            pprc204.this.AV69Emprcod = GXv_char4[0] ;
            pprc204.this.AV68Tab_maq[AV67t-1] = GXv_char3[0] ;
            pprc204.this.GXt_char1 = GXv_char2[0] ;
            AV50MaqDsc21 = GXt_char1 ;
            AV65MaqHdrs[AV66i-1][1-1] = AV50MaqDsc21 ;
         }
         else if ( AV66i == 22 )
         {
            AV23Maqcod22 = AV68Tab_maq[AV67t-1] ;
            GXt_char1 = AV51MaqDsc22 ;
            GXv_char4[0] = AV69Emprcod ;
            GXv_char3[0] = AV68Tab_maq[AV67t-1] ;
            GXv_char2[0] = GXt_char1 ;
            new app.pdscmqplanificar(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
            pprc204.this.AV69Emprcod = GXv_char4[0] ;
            pprc204.this.AV68Tab_maq[AV67t-1] = GXv_char3[0] ;
            pprc204.this.GXt_char1 = GXv_char2[0] ;
            AV51MaqDsc22 = GXt_char1 ;
            AV65MaqHdrs[AV66i-1][1-1] = AV51MaqDsc22 ;
         }
         else if ( AV66i == 23 )
         {
            AV24Maqcod23 = AV68Tab_maq[AV67t-1] ;
            GXt_char1 = AV52MaqDsc23 ;
            GXv_char4[0] = AV69Emprcod ;
            GXv_char3[0] = AV68Tab_maq[AV67t-1] ;
            GXv_char2[0] = GXt_char1 ;
            new app.pdscmqplanificar(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
            pprc204.this.AV69Emprcod = GXv_char4[0] ;
            pprc204.this.AV68Tab_maq[AV67t-1] = GXv_char3[0] ;
            pprc204.this.GXt_char1 = GXv_char2[0] ;
            AV52MaqDsc23 = GXt_char1 ;
            AV65MaqHdrs[AV66i-1][1-1] = AV24Maqcod23 ;
         }
         else if ( AV66i == 24 )
         {
            AV25Maqcod24 = AV68Tab_maq[AV67t-1] ;
            GXt_char1 = AV53MaqDsc24 ;
            GXv_char4[0] = AV69Emprcod ;
            GXv_char3[0] = AV68Tab_maq[AV67t-1] ;
            GXv_char2[0] = GXt_char1 ;
            new app.pdscmqplanificar(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
            pprc204.this.AV69Emprcod = GXv_char4[0] ;
            pprc204.this.AV68Tab_maq[AV67t-1] = GXv_char3[0] ;
            pprc204.this.GXt_char1 = GXv_char2[0] ;
            AV53MaqDsc24 = GXt_char1 ;
            AV65MaqHdrs[AV66i-1][1-1] = AV53MaqDsc24 ;
         }
         else if ( AV66i == 25 )
         {
            AV26Maqcod25 = AV68Tab_maq[AV67t-1] ;
            GXt_char1 = AV54MaqDsc25 ;
            GXv_char4[0] = AV69Emprcod ;
            GXv_char3[0] = AV68Tab_maq[AV67t-1] ;
            GXv_char2[0] = GXt_char1 ;
            new app.pdscmqplanificar(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
            pprc204.this.AV69Emprcod = GXv_char4[0] ;
            pprc204.this.AV68Tab_maq[AV67t-1] = GXv_char3[0] ;
            pprc204.this.GXt_char1 = GXv_char2[0] ;
            AV54MaqDsc25 = GXt_char1 ;
            AV65MaqHdrs[AV66i-1][1-1] = AV54MaqDsc25 ;
         }
         else if ( AV66i == 26 )
         {
            AV27Maqcod26 = AV68Tab_maq[AV67t-1] ;
            GXt_char1 = AV55MaqDsc26 ;
            GXv_char4[0] = AV69Emprcod ;
            GXv_char3[0] = AV68Tab_maq[AV67t-1] ;
            GXv_char2[0] = GXt_char1 ;
            new app.pdscmqplanificar(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
            pprc204.this.AV69Emprcod = GXv_char4[0] ;
            pprc204.this.AV68Tab_maq[AV67t-1] = GXv_char3[0] ;
            pprc204.this.GXt_char1 = GXv_char2[0] ;
            AV55MaqDsc26 = GXt_char1 ;
            AV65MaqHdrs[AV66i-1][1-1] = AV55MaqDsc26 ;
         }
         else if ( AV66i == 27 )
         {
            AV28Maqcod27 = AV68Tab_maq[AV67t-1] ;
            GXt_char1 = AV56MaqDsc27 ;
            GXv_char4[0] = AV69Emprcod ;
            GXv_char3[0] = AV68Tab_maq[AV67t-1] ;
            GXv_char2[0] = GXt_char1 ;
            new app.pdscmqplanificar(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
            pprc204.this.AV69Emprcod = GXv_char4[0] ;
            pprc204.this.AV68Tab_maq[AV67t-1] = GXv_char3[0] ;
            pprc204.this.GXt_char1 = GXv_char2[0] ;
            AV56MaqDsc27 = GXt_char1 ;
            AV65MaqHdrs[AV66i-1][1-1] = AV56MaqDsc27 ;
         }
         else if ( AV66i == 28 )
         {
            AV29Maqcod28 = AV68Tab_maq[AV67t-1] ;
            GXt_char1 = AV57MaqDsc28 ;
            GXv_char4[0] = AV69Emprcod ;
            GXv_char3[0] = AV68Tab_maq[AV67t-1] ;
            GXv_char2[0] = GXt_char1 ;
            new app.pdscmqplanificar(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
            pprc204.this.AV69Emprcod = GXv_char4[0] ;
            pprc204.this.AV68Tab_maq[AV67t-1] = GXv_char3[0] ;
            pprc204.this.GXt_char1 = GXv_char2[0] ;
            AV57MaqDsc28 = GXt_char1 ;
            AV65MaqHdrs[AV66i-1][1-1] = AV57MaqDsc28 ;
         }
         AV66i = (short)(AV66i+1) ;
         AV67t = (short)(AV67t+1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc204.this.AV69Emprcod;
      this.aP1[0] = pprc204.this.AV9Maqcod1;
      this.aP2[0] = pprc204.this.AV10MaqCod10;
      this.aP3[0] = pprc204.this.AV11Maqcod11;
      this.aP4[0] = pprc204.this.AV12MaqCod12;
      this.aP5[0] = pprc204.this.AV13Maqcod13;
      this.aP6[0] = pprc204.this.AV14Maqcod14;
      this.aP7[0] = pprc204.this.AV15Maqcod15;
      this.aP8[0] = pprc204.this.AV16Maqcod16;
      this.aP9[0] = pprc204.this.AV17Maqcod17;
      this.aP10[0] = pprc204.this.AV18Maqcod18;
      this.aP11[0] = pprc204.this.AV19Maqcod19;
      this.aP12[0] = pprc204.this.AV20Maqcod2;
      this.aP13[0] = pprc204.this.AV21Maqcod20;
      this.aP14[0] = pprc204.this.AV22Maqcod21;
      this.aP15[0] = pprc204.this.AV23Maqcod22;
      this.aP16[0] = pprc204.this.AV24Maqcod23;
      this.aP17[0] = pprc204.this.AV25Maqcod24;
      this.aP18[0] = pprc204.this.AV26Maqcod25;
      this.aP19[0] = pprc204.this.AV27Maqcod26;
      this.aP20[0] = pprc204.this.AV28Maqcod27;
      this.aP21[0] = pprc204.this.AV29Maqcod28;
      this.aP22[0] = pprc204.this.AV30Maqcod3;
      this.aP23[0] = pprc204.this.AV31Maqcod4;
      this.aP24[0] = pprc204.this.AV32Maqcod5;
      this.aP25[0] = pprc204.this.AV33Maqcod6;
      this.aP26[0] = pprc204.this.AV34Maqcod7;
      this.aP27[0] = pprc204.this.AV35Maqcod8;
      this.aP28[0] = pprc204.this.AV36Maqcod9;
      this.aP29[0] = pprc204.this.AV37Maqdsc1;
      this.aP30[0] = pprc204.this.AV38Maqdsc10;
      this.aP31[0] = pprc204.this.AV39Maqdsc11;
      this.aP32[0] = pprc204.this.AV40Maqdsc12;
      this.aP33[0] = pprc204.this.AV41Maqdsc13;
      this.aP34[0] = pprc204.this.AV42Maqdsc14;
      this.aP35[0] = pprc204.this.AV43Maqdsc15;
      this.aP36[0] = pprc204.this.AV44MaqDsc16;
      this.aP37[0] = pprc204.this.AV45MaqDsc17;
      this.aP38[0] = pprc204.this.AV46MaqDsc18;
      this.aP39[0] = pprc204.this.AV47MaqDsc19;
      this.aP40[0] = pprc204.this.AV48Maqdsc2;
      this.aP41[0] = pprc204.this.AV49MaqDsc20;
      this.aP42[0] = pprc204.this.AV50MaqDsc21;
      this.aP43[0] = pprc204.this.AV51MaqDsc22;
      this.aP44[0] = pprc204.this.AV52MaqDsc23;
      this.aP45[0] = pprc204.this.AV53MaqDsc24;
      this.aP46[0] = pprc204.this.AV54MaqDsc25;
      this.aP47[0] = pprc204.this.AV55MaqDsc26;
      this.aP48[0] = pprc204.this.AV56MaqDsc27;
      this.aP49[0] = pprc204.this.AV57MaqDsc28;
      this.aP50[0] = pprc204.this.AV58Maqdsc3;
      this.aP51[0] = pprc204.this.AV59Maqdsc4;
      this.aP52[0] = pprc204.this.AV60Maqdsc5;
      this.aP53[0] = pprc204.this.AV61Maqdsc6;
      this.aP54[0] = pprc204.this.AV62Maqdsc7;
      this.aP55[0] = pprc204.this.AV63Maqdsc8;
      this.aP56[0] = pprc204.this.AV64Maqdsc9;
      this.aP59[0] = pprc204.this.AV67t;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV67t ;
   private short AV66i ;
   private short Gx_err ;
   private int GX_I ;
   private int GX_J ;
   private String AV69Emprcod ;
   private String AV9Maqcod1 ;
   private String AV10MaqCod10 ;
   private String AV11Maqcod11 ;
   private String AV12MaqCod12 ;
   private String AV13Maqcod13 ;
   private String AV14Maqcod14 ;
   private String AV15Maqcod15 ;
   private String AV16Maqcod16 ;
   private String AV17Maqcod17 ;
   private String AV18Maqcod18 ;
   private String AV19Maqcod19 ;
   private String AV20Maqcod2 ;
   private String AV21Maqcod20 ;
   private String AV22Maqcod21 ;
   private String AV23Maqcod22 ;
   private String AV24Maqcod23 ;
   private String AV25Maqcod24 ;
   private String AV26Maqcod25 ;
   private String AV27Maqcod26 ;
   private String AV28Maqcod27 ;
   private String AV29Maqcod28 ;
   private String AV30Maqcod3 ;
   private String AV31Maqcod4 ;
   private String AV32Maqcod5 ;
   private String AV33Maqcod6 ;
   private String AV34Maqcod7 ;
   private String AV35Maqcod8 ;
   private String AV36Maqcod9 ;
   private String AV37Maqdsc1 ;
   private String AV38Maqdsc10 ;
   private String AV39Maqdsc11 ;
   private String AV40Maqdsc12 ;
   private String AV41Maqdsc13 ;
   private String AV42Maqdsc14 ;
   private String AV43Maqdsc15 ;
   private String AV44MaqDsc16 ;
   private String AV45MaqDsc17 ;
   private String AV46MaqDsc18 ;
   private String AV47MaqDsc19 ;
   private String AV48Maqdsc2 ;
   private String AV49MaqDsc20 ;
   private String AV50MaqDsc21 ;
   private String AV51MaqDsc22 ;
   private String AV52MaqDsc23 ;
   private String AV53MaqDsc24 ;
   private String AV54MaqDsc25 ;
   private String AV55MaqDsc26 ;
   private String AV56MaqDsc27 ;
   private String AV57MaqDsc28 ;
   private String AV58Maqdsc3 ;
   private String AV59Maqdsc4 ;
   private String AV60Maqdsc5 ;
   private String AV61Maqdsc6 ;
   private String AV62Maqdsc7 ;
   private String AV63Maqdsc8 ;
   private String AV64Maqdsc9 ;
   private String AV68Tab_maq[] ;
   private String AV65MaqHdrs[][] ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private short[] aP59 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private String[] aP10 ;
   private String[] aP11 ;
   private String[] aP12 ;
   private String[] aP13 ;
   private String[] aP14 ;
   private String[] aP15 ;
   private String[] aP16 ;
   private String[] aP17 ;
   private String[] aP18 ;
   private String[] aP19 ;
   private String[] aP20 ;
   private String[] aP21 ;
   private String[] aP22 ;
   private String[] aP23 ;
   private String[] aP24 ;
   private String[] aP25 ;
   private String[] aP26 ;
   private String[] aP27 ;
   private String[] aP28 ;
   private String[] aP29 ;
   private String[] aP30 ;
   private String[] aP31 ;
   private String[] aP32 ;
   private String[] aP33 ;
   private String[] aP34 ;
   private String[] aP35 ;
   private String[] aP36 ;
   private String[] aP37 ;
   private String[] aP38 ;
   private String[] aP39 ;
   private String[] aP40 ;
   private String[] aP41 ;
   private String[] aP42 ;
   private String[] aP43 ;
   private String[] aP44 ;
   private String[] aP45 ;
   private String[] aP46 ;
   private String[] aP47 ;
   private String[] aP48 ;
   private String[] aP49 ;
   private String[] aP50 ;
   private String[] aP51 ;
   private String[] aP52 ;
   private String[] aP53 ;
   private String[] aP54 ;
   private String[] aP55 ;
   private String[] aP56 ;
}

