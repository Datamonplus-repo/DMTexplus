package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprer04 extends GXProcedure
{
   public pprer04( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprer04.class ), "" );
   }

   public pprer04( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             byte[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             int[] aP5 ,
                             int[] aP6 ,
                             short[] aP7 ,
                             int[] aP8 ,
                             byte[] aP9 ,
                             byte[] aP10 ,
                             short[] aP11 ,
                             byte[] aP12 ,
                             byte[] aP13 ,
                             byte[] aP14 ,
                             byte[] aP15 ,
                             short[] aP16 ,
                             byte[] aP17 )
   {
      pprer04.this.aP18 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18);
      return aP18[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        byte[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        int[] aP5 ,
                        int[] aP6 ,
                        short[] aP7 ,
                        int[] aP8 ,
                        byte[] aP9 ,
                        byte[] aP10 ,
                        short[] aP11 ,
                        byte[] aP12 ,
                        byte[] aP13 ,
                        byte[] aP14 ,
                        byte[] aP15 ,
                        short[] aP16 ,
                        byte[] aP17 ,
                        String[] aP18 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             byte[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             int[] aP5 ,
                             int[] aP6 ,
                             short[] aP7 ,
                             int[] aP8 ,
                             byte[] aP9 ,
                             byte[] aP10 ,
                             short[] aP11 ,
                             byte[] aP12 ,
                             byte[] aP13 ,
                             byte[] aP14 ,
                             byte[] aP15 ,
                             short[] aP16 ,
                             byte[] aP17 ,
                             String[] aP18 )
   {
      pprer04.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprer04.this.AV67PrdNumPaso = aP1[0];
      this.aP1 = aP1;
      pprer04.this.AV15Cantidad = aP2[0];
      this.aP2 = aP2;
      pprer04.this.AV16UniMed = aP3[0];
      this.aP3 = aP3;
      pprer04.this.AV17TotKil = aP4[0];
      this.aP4 = aP4;
      pprer04.this.AV18BarVol = aP5[0];
      this.aP5 = aP5;
      pprer04.this.AV19ValCos = aP6[0];
      this.aP6 = aP6;
      pprer04.this.AV20LinRec = aP7[0];
      this.aP7 = aP7;
      pprer04.this.AV72RecPreCod = aP8[0];
      this.aP8 = aP8;
      pprer04.this.AV25Flag1 = aP9[0];
      this.aP9 = aP9;
      pprer04.this.AV26Flag2 = aP10[0];
      this.aP10 = aP10;
      pprer04.this.AV27UltRecLin = aP11[0];
      this.aP11 = aP11;
      pprer04.this.AV28Linea = aP12[0];
      this.aP12 = aP12;
      pprer04.this.AV29ExiCon = aP13[0];
      this.aP13 = aP13;
      pprer04.this.AV30FlagComp = aP14[0];
      this.aP14 = aP14;
      pprer04.this.AV51ProForNro = aP15[0];
      this.aP15 = aP15;
      pprer04.this.AV52RecLinMaq = aP16[0];
      this.aP16 = aP16;
      pprer04.this.AV54TanqueN = aP17[0];
      this.aP17 = aP17;
      pprer04.this.AV56ProForDes = aP18[0];
      this.aP18 = aP18;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( (0==AV30FlagComp) )
      {
         AV27UltRecLin = (short)(AV20LinRec+10) ;
      }
      if ( AV16UniMed == 3 )
      {
         AV31CanTeo = AV15Cantidad.multiply(AV17TotKil).multiply(DecimalUtil.doubleToDec(AV19ValCos)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      }
      else
      {
         AV31CanTeo = AV15Cantidad.multiply(DecimalUtil.doubleToDec(AV18BarVol)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      }
      AV47PrdCanFin = DecimalUtil.doubleToDec(0) ;
      AV48PrdCanAny = DecimalUtil.doubleToDec(0) ;
      AV66FlagValCod = (byte)(0) ;
      /* Using cursor P01CB2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV67PrdNumPaso});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P01CB2_A719PrdNum[0] ;
         n719PrdNum = P01CB2_n719PrdNum[0] ;
         A718PrdNom = P01CB2_A718PrdNom[0] ;
         A856ValCod = P01CB2_A856ValCod[0] ;
         A685PrdCanRes = P01CB2_A685PrdCanRes[0] ;
         A704PrdExiAlm = P01CB2_A704PrdExiAlm[0] ;
         AV69PrdNomPaso = A718PrdNom ;
         if ( A856ValCod > 1 )
         {
            AV66FlagValCod = (byte)(1) ;
            AV70PrdNum2 = A719PrdNum ;
            GXv_char1[0] = A396EmprCod ;
            GXv_char2[0] = AV70PrdNum2 ;
            GXv_decimal3[0] = AV31CanTeo ;
            GXv_int4[0] = AV65FlagExis2 ;
            new app.pexialt2(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_decimal3, GXv_int4) ;
            pprer04.this.A396EmprCod = GXv_char1[0] ;
            pprer04.this.AV70PrdNum2 = GXv_char2[0] ;
            pprer04.this.AV31CanTeo = GXv_decimal3[0] ;
            pprer04.this.AV65FlagExis2 = GXv_int4[0] ;
            if ( AV65FlagExis2 == 0 )
            {
               AV37PrdNum = "" ;
               AV38PrdNom = httpContext.getMessage( "@ATENCION:", "") + A719PrdNum + httpContext.getMessage( "SUPRIMIDO", "") ;
               AV16UniMed = (byte)(0) ;
               AV33CanRec = DecimalUtil.ZERO ;
               AV15Cantidad = DecimalUtil.ZERO ;
               AV51ProForNro = (byte)(0) ;
               AV54TanqueN = (byte)(0) ;
               AV68RecAnyTie = (short)(1) ;
               /* Execute user subroutine: 'NEWRECETA' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         else
         {
            AV45Comp = GXutil.substring( A719PrdNum, 1, 1) ;
            if ( GXutil.strcmp(AV45Comp, "0") != 0 )
            {
               AV32ExiRes = A704PrdExiAlm.subtract(A685PrdCanRes) ;
               if ( DecimalUtil.compareTo(AV32ExiRes, AV31CanTeo) >= 0 )
               {
                  AV64FlagExis1 = (byte)(1) ;
               }
               else
               {
                  AV70PrdNum2 = A719PrdNum ;
                  GXv_char2[0] = A396EmprCod ;
                  GXv_char1[0] = AV70PrdNum2 ;
                  GXv_decimal3[0] = AV31CanTeo ;
                  GXv_int4[0] = AV65FlagExis2 ;
                  new app.pexialt2(remoteHandle, context).execute( GXv_char2, GXv_char1, GXv_decimal3, GXv_int4) ;
                  pprer04.this.A396EmprCod = GXv_char2[0] ;
                  pprer04.this.AV70PrdNum2 = GXv_char1[0] ;
                  pprer04.this.AV31CanTeo = GXv_decimal3[0] ;
                  pprer04.this.AV65FlagExis2 = GXv_int4[0] ;
                  AV68RecAnyTie = (short)(0) ;
                  if ( AV65FlagExis2 == 0 )
                  {
                     AV64FlagExis1 = (byte)(1) ;
                     AV68RecAnyTie = (short)(1) ;
                  }
               }
            }
            else
            {
               AV37PrdNum = A719PrdNum ;
               AV38PrdNom = A718PrdNom ;
               AV33CanRec = AV31CanTeo ;
               AV68RecAnyTie = (short)(0) ;
               /* Execute user subroutine: 'NEWRECETA' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               GXv_char2[0] = A396EmprCod ;
               GXv_char1[0] = AV37PrdNum ;
               GXv_decimal3[0] = AV31CanTeo ;
               GXv_int4[0] = AV16UniMed ;
               GXv_decimal5[0] = AV17TotKil ;
               GXv_int6[0] = AV18BarVol ;
               GXv_int7[0] = AV19ValCos ;
               new app.prescom(remoteHandle, context).execute( GXv_char2, GXv_char1, GXv_decimal3, GXv_int4, GXv_decimal5, GXv_int6, GXv_int7) ;
               pprer04.this.A396EmprCod = GXv_char2[0] ;
               pprer04.this.AV37PrdNum = GXv_char1[0] ;
               pprer04.this.AV31CanTeo = GXv_decimal3[0] ;
               pprer04.this.AV16UniMed = GXv_int4[0] ;
               pprer04.this.AV17TotKil = GXv_decimal5[0] ;
               pprer04.this.AV18BarVol = GXv_int6[0] ;
               pprer04.this.AV19ValCos = GXv_int7[0] ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( ( ( AV66FlagValCod == 1 ) && ( AV65FlagExis2 == 0 ) ) || ( GXutil.strcmp(AV45Comp, "0") == 0 ) )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( AV64FlagExis1 == 1 )
      {
         AV33CanRec = AV31CanTeo ;
         AV37PrdNum = AV67PrdNumPaso ;
         AV38PrdNom = AV69PrdNomPaso ;
         /* Execute user subroutine: 'NEWRECETA' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         GXv_char2[0] = A396EmprCod ;
         GXv_char1[0] = AV67PrdNumPaso ;
         GXv_decimal5[0] = AV31CanTeo ;
         new app.pactres(remoteHandle, context).execute( GXv_char2, GXv_char1, GXv_decimal5) ;
         pprer04.this.A396EmprCod = GXv_char2[0] ;
         pprer04.this.AV67PrdNumPaso = GXv_char1[0] ;
         pprer04.this.AV31CanTeo = GXv_decimal5[0] ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( AV65FlagExis2 == 1 )
      {
         AV68RecAnyTie = (short)(0) ;
         /* Using cursor P01CB3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV67PrdNumPaso});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A719PrdNum = P01CB3_A719PrdNum[0] ;
            n719PrdNum = P01CB3_n719PrdNum[0] ;
            A680PrdAltNum = P01CB3_A680PrdAltNum[0] ;
            A678PrdAltFac = P01CB3_A678PrdAltFac[0] ;
            A679PrdAltNom = P01CB3_A679PrdAltNom[0] ;
            n679PrdAltNom = P01CB3_n679PrdAltNom[0] ;
            A679PrdAltNom = P01CB3_A679PrdAltNom[0] ;
            n679PrdAltNom = P01CB3_n679PrdAltNom[0] ;
            AV37PrdNum = A680PrdAltNum ;
            GXv_char2[0] = A396EmprCod ;
            GXv_char1[0] = AV37PrdNum ;
            GXv_decimal5[0] = AV31CanTeo ;
            GXv_int4[0] = AV71FlagExis3 ;
            new app.pexialt3(remoteHandle, context).execute( GXv_char2, GXv_char1, GXv_decimal5, GXv_int4) ;
            pprer04.this.A396EmprCod = GXv_char2[0] ;
            pprer04.this.AV37PrdNum = GXv_char1[0] ;
            pprer04.this.AV31CanTeo = GXv_decimal5[0] ;
            pprer04.this.AV71FlagExis3 = GXv_int4[0] ;
            if ( AV71FlagExis3 == 1 )
            {
               AV31CanTeo = AV31CanTeo.multiply(A678PrdAltFac) ;
               AV15Cantidad = AV15Cantidad.multiply(A678PrdAltFac) ;
               AV33CanRec = AV31CanTeo ;
               AV37PrdNum = A680PrdAltNum ;
               AV38PrdNom = A679PrdAltNom ;
               GXv_char2[0] = A396EmprCod ;
               GXv_char1[0] = A680PrdAltNum ;
               GXv_decimal5[0] = AV31CanTeo ;
               new app.pactres(remoteHandle, context).execute( GXv_char2, GXv_char1, GXv_decimal5) ;
               pprer04.this.A396EmprCod = GXv_char2[0] ;
               pprer04.this.A680PrdAltNum = GXv_char1[0] ;
               pprer04.this.AV31CanTeo = GXv_decimal5[0] ;
               /* Execute user subroutine: 'NEWRECETA' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  pr_default.close(1);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'NEWRECETA' Routine */
      returnInSub = false ;
      AV20LinRec = (short)(AV20LinRec+10) ;
      /*
         INSERT RECORD ON TABLE TXPPRERLN

      */
      A4744RecPreCod = AV72RecPreCod ;
      A4762RecPreLin = AV28Linea ;
      A4763RecPreNli = AV20LinRec ;
      A4764RecPrePrdN = AV37PrdNum ;
      n4764RecPrePrdN = false ;
      A4765RecPrePrdD = AV38PrdNom ;
      n4765RecPrePrdD = false ;
      A490ForPrdUMe = AV16UniMed ;
      n490ForPrdUMe = false ;
      A4769RecPreCan2 = AV33CanRec.multiply(DecimalUtil.doubleToDec(1000)) ;
      n4769RecPreCan2 = false ;
      A4768RecPreCan1 = AV15Cantidad ;
      n4768RecPreCan1 = false ;
      A719PrdNum = AV37PrdNum ;
      n719PrdNum = false ;
      /* Using cursor P01CB4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A4744RecPreCod), Short.valueOf(A4762RecPreLin), Short.valueOf(A4763RecPreNli), Boolean.valueOf(n4764RecPrePrdN), A4764RecPrePrdN, Boolean.valueOf(n4765RecPrePrdD), A4765RecPrePrdD, Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe), Boolean.valueOf(n4768RecPreCan1), A4768RecPreCan1, Boolean.valueOf(n4769RecPreCan2), A4769RecPreCan2});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRERLN");
      if ( (pr_default.getStatus(2) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprer04.this.A396EmprCod;
      this.aP1[0] = pprer04.this.AV67PrdNumPaso;
      this.aP2[0] = pprer04.this.AV15Cantidad;
      this.aP3[0] = pprer04.this.AV16UniMed;
      this.aP4[0] = pprer04.this.AV17TotKil;
      this.aP5[0] = pprer04.this.AV18BarVol;
      this.aP6[0] = pprer04.this.AV19ValCos;
      this.aP7[0] = pprer04.this.AV20LinRec;
      this.aP8[0] = pprer04.this.AV72RecPreCod;
      this.aP9[0] = pprer04.this.AV25Flag1;
      this.aP10[0] = pprer04.this.AV26Flag2;
      this.aP11[0] = pprer04.this.AV27UltRecLin;
      this.aP12[0] = pprer04.this.AV28Linea;
      this.aP13[0] = pprer04.this.AV29ExiCon;
      this.aP14[0] = pprer04.this.AV30FlagComp;
      this.aP15[0] = pprer04.this.AV51ProForNro;
      this.aP16[0] = pprer04.this.AV52RecLinMaq;
      this.aP17[0] = pprer04.this.AV54TanqueN;
      this.aP18[0] = pprer04.this.AV56ProForDes;
      Application.commitDataStores(context, remoteHandle, pr_default, "pprer04");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV31CanTeo = DecimalUtil.ZERO ;
      AV47PrdCanFin = DecimalUtil.ZERO ;
      AV48PrdCanAny = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P01CB2_A396EmprCod = new String[] {""} ;
      P01CB2_A719PrdNum = new String[] {""} ;
      P01CB2_n719PrdNum = new boolean[] {false} ;
      P01CB2_A718PrdNom = new String[] {""} ;
      P01CB2_A856ValCod = new byte[1] ;
      P01CB2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01CB2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      AV69PrdNomPaso = "" ;
      AV70PrdNum2 = "" ;
      AV37PrdNum = "" ;
      AV38PrdNom = "" ;
      AV33CanRec = DecimalUtil.ZERO ;
      AV45Comp = "" ;
      AV32ExiRes = DecimalUtil.ZERO ;
      GXv_decimal3 = new java.math.BigDecimal[1] ;
      GXv_int6 = new int[1] ;
      GXv_int7 = new int[1] ;
      P01CB3_A396EmprCod = new String[] {""} ;
      P01CB3_A719PrdNum = new String[] {""} ;
      P01CB3_n719PrdNum = new boolean[] {false} ;
      P01CB3_A680PrdAltNum = new String[] {""} ;
      P01CB3_A678PrdAltFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01CB3_A679PrdAltNom = new String[] {""} ;
      P01CB3_n679PrdAltNom = new boolean[] {false} ;
      A680PrdAltNum = "" ;
      A678PrdAltFac = DecimalUtil.ZERO ;
      A679PrdAltNom = "" ;
      GXv_int4 = new byte[1] ;
      GXv_char2 = new String[1] ;
      GXv_char1 = new String[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      A4764RecPrePrdN = "" ;
      A4765RecPrePrdD = "" ;
      A4769RecPreCan2 = DecimalUtil.ZERO ;
      A4768RecPreCan1 = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprer04__default(),
         new Object[] {
             new Object[] {
            P01CB2_A396EmprCod, P01CB2_A719PrdNum, P01CB2_A718PrdNom, P01CB2_A856ValCod, P01CB2_A685PrdCanRes, P01CB2_A704PrdExiAlm
            }
            , new Object[] {
            P01CB3_A396EmprCod, P01CB3_A719PrdNum, P01CB3_A680PrdAltNum, P01CB3_A678PrdAltFac, P01CB3_A679PrdAltNom, P01CB3_n679PrdAltNom
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16UniMed ;
   private byte AV25Flag1 ;
   private byte AV26Flag2 ;
   private byte AV28Linea ;
   private byte AV29ExiCon ;
   private byte AV30FlagComp ;
   private byte AV51ProForNro ;
   private byte AV54TanqueN ;
   private byte AV66FlagValCod ;
   private byte A856ValCod ;
   private byte AV65FlagExis2 ;
   private byte AV64FlagExis1 ;
   private byte AV71FlagExis3 ;
   private byte GXv_int4[] ;
   private byte A490ForPrdUMe ;
   private short AV20LinRec ;
   private short AV27UltRecLin ;
   private short AV52RecLinMaq ;
   private short AV68RecAnyTie ;
   private short A4762RecPreLin ;
   private short A4763RecPreNli ;
   private short Gx_err ;
   private int AV18BarVol ;
   private int AV19ValCos ;
   private int AV72RecPreCod ;
   private int GXv_int6[] ;
   private int GXv_int7[] ;
   private int GX_INS706 ;
   private int A4744RecPreCod ;
   private java.math.BigDecimal AV15Cantidad ;
   private java.math.BigDecimal AV17TotKil ;
   private java.math.BigDecimal AV31CanTeo ;
   private java.math.BigDecimal AV47PrdCanFin ;
   private java.math.BigDecimal AV48PrdCanAny ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal AV33CanRec ;
   private java.math.BigDecimal AV32ExiRes ;
   private java.math.BigDecimal GXv_decimal3[] ;
   private java.math.BigDecimal A678PrdAltFac ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal A4769RecPreCan2 ;
   private java.math.BigDecimal A4768RecPreCan1 ;
   private String A396EmprCod ;
   private String AV67PrdNumPaso ;
   private String AV56ProForDes ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String AV69PrdNomPaso ;
   private String AV70PrdNum2 ;
   private String AV37PrdNum ;
   private String AV38PrdNom ;
   private String AV45Comp ;
   private String A680PrdAltNum ;
   private String A679PrdAltNom ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String A4764RecPrePrdN ;
   private String A4765RecPrePrdD ;
   private String Gx_emsg ;
   private boolean n719PrdNum ;
   private boolean returnInSub ;
   private boolean n679PrdAltNom ;
   private boolean n4764RecPrePrdN ;
   private boolean n4765RecPrePrdD ;
   private boolean n490ForPrdUMe ;
   private boolean n4769RecPreCan2 ;
   private boolean n4768RecPreCan1 ;
   private String[] aP18 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private byte[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private int[] aP5 ;
   private int[] aP6 ;
   private short[] aP7 ;
   private int[] aP8 ;
   private byte[] aP9 ;
   private byte[] aP10 ;
   private short[] aP11 ;
   private byte[] aP12 ;
   private byte[] aP13 ;
   private byte[] aP14 ;
   private byte[] aP15 ;
   private short[] aP16 ;
   private byte[] aP17 ;
   private IDataStoreProvider pr_default ;
   private String[] P01CB2_A396EmprCod ;
   private String[] P01CB2_A719PrdNum ;
   private boolean[] P01CB2_n719PrdNum ;
   private String[] P01CB2_A718PrdNom ;
   private byte[] P01CB2_A856ValCod ;
   private java.math.BigDecimal[] P01CB2_A685PrdCanRes ;
   private java.math.BigDecimal[] P01CB2_A704PrdExiAlm ;
   private String[] P01CB3_A396EmprCod ;
   private String[] P01CB3_A719PrdNum ;
   private boolean[] P01CB3_n719PrdNum ;
   private String[] P01CB3_A680PrdAltNum ;
   private java.math.BigDecimal[] P01CB3_A678PrdAltFac ;
   private String[] P01CB3_A679PrdAltNom ;
   private boolean[] P01CB3_n679PrdAltNom ;
}

final  class pprer04__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01CB2", "SELECT EmprCod, PrdNum, PrdNom, ValCod, PrdCanRes, PrdExiAlm FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01CB3", "SELECT T1.EmprCod, T1.PrdNum, T1.PrdAltNum, T1.PrdAltFac, COALESCE( T2.PrdNom, ' ') AS PrdAltNom FROM (TXPPRDALT T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdAltNum) WHERE T1.EmprCod = ? and T1.PrdNum = ? ORDER BY T1.EmprCod, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01CB4", "INSERT INTO TXPPRERLN(EmprCod, RecPreCod, RecPreLin, RecPreNli, RecPrePrdN, RecPrePrdD, PrdNum, ForPrdUMe, RecPreCan1, RecPreCan2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRERLN")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 6);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[7], 26);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[9], 6);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[11]).byteValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[13], 3);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[15], 3);
               }
               return;
      }
   }

}

