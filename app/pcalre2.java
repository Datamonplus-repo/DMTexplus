package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcalre2 extends GXProcedure
{
   public pcalre2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcalre2.class ), "" );
   }

   public pcalre2( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( )
   {
      pcalre2.this.aP0 = new String[] {""};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( String[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( String[] aP0 )
   {
      pcalre2.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV20Flag2 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, "038001", GXv_int1) ;
      pcalre2.this.AV20Flag2 = GXv_int1[0] ;
      AV25Flag3 = (byte)(0) ;
      GXv_char2[0] = AV15EmprCod ;
      GXv_char3[0] = "011100" ;
      GXv_int4[0] = AV26ContVal ;
      new app.pbuscou(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_int4) ;
      pcalre2.this.AV15EmprCod = GXv_char2[0] ;
      pcalre2.this.AV26ContVal = GXv_int4[0] ;
      if ( AV26ContVal == 1 )
      {
         AV19Consumos = (byte)(1) ;
      }
      else
      {
         AV19Consumos = (byte)(0) ;
      }
      GXv_char3[0] = AV15EmprCod ;
      GXv_char2[0] = httpContext.getMessage( "NUMCIE", "") ;
      GXv_int4[0] = AV33TopCie ;
      new app.pbuscou(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_int4) ;
      pcalre2.this.AV15EmprCod = GXv_char3[0] ;
      pcalre2.this.AV33TopCie = GXv_int4[0] ;
      GXv_char3[0] = AV15EmprCod ;
      GXv_char2[0] = httpContext.getMessage( "TOPPRO", "") ;
      GXv_int4[0] = AV34TopPro ;
      new app.pbuscou(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_int4) ;
      pcalre2.this.AV15EmprCod = GXv_char3[0] ;
      pcalre2.this.AV34TopPro = GXv_int4[0] ;
      AV31NumCie = 0 ;
      /* Using cursor P00ES2 */
      pr_default.execute(0, new Object[] {AV15EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P00ES2_A130BarCodPar[0] ;
         A132BarCodReo = P00ES2_A132BarCodReo[0] ;
         A129BarCod = P00ES2_A129BarCod[0] ;
         A396EmprCod = P00ES2_A396EmprCod[0] ;
         A2498BarPrdPes = P00ES2_A2498BarPrdPes[0] ;
         A180BarMaqCod = P00ES2_A180BarMaqCod[0] ;
         if ( GXutil.strcmp(A2498BarPrdPes, httpContext.getMessage( "S", "")) == 0 )
         {
            AV30Flag = (byte)(0) ;
            /* Using cursor P00ES3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A2490BarDosEst = P00ES3_A2490BarDosEst[0] ;
               n2490BarDosEst = P00ES3_n2490BarDosEst[0] ;
               A2489BarDosCan = P00ES3_A2489BarDosCan[0] ;
               n2489BarDosCan = P00ES3_n2489BarDosCan[0] ;
               A2495BarDosUsa = P00ES3_A2495BarDosUsa[0] ;
               n2495BarDosUsa = P00ES3_n2495BarDosUsa[0] ;
               A719PrdNum = P00ES3_A719PrdNum[0] ;
               A2494BarDosPro = P00ES3_A2494BarDosPro[0] ;
               if ( GXutil.strcmp(A2490BarDosEst, httpContext.getMessage( "N", "")) == 0 )
               {
                  /* Using cursor P00ES4 */
                  pr_default.execute(2, new Object[] {A396EmprCod, A719PrdNum});
                  A707PrdFacCon = P00ES4_A707PrdFacCon[0] ;
                  A705PrdExiCC = P00ES4_A705PrdExiCC[0] ;
                  A704PrdExiAlm = P00ES4_A704PrdExiAlm[0] ;
                  A685PrdCanRes = P00ES4_A685PrdCanRes[0] ;
                  AV30Flag = (byte)(1) ;
                  if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") == 0 )
                  {
                     AV21PrdComCod = A719PrdNum ;
                     AV22PrdCant = A2489BarDosCan ;
                     AV24PrdCanFin = A2495BarDosUsa ;
                     GXv_char3[0] = A396EmprCod ;
                     GXv_char2[0] = AV21PrdComCod ;
                     GXv_decimal5[0] = AV22PrdCant ;
                     GXv_decimal6[0] = AV24PrdCanFin ;
                     GXv_int1[0] = AV25Flag3 ;
                     GXv_int7[0] = AV20Flag2 ;
                     GXv_int8[0] = AV19Consumos ;
                     new app.pcompue(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_decimal5, GXv_decimal6, GXv_int1, GXv_int7, GXv_int8) ;
                     pcalre2.this.A396EmprCod = GXv_char3[0] ;
                     pcalre2.this.AV21PrdComCod = GXv_char2[0] ;
                     pcalre2.this.AV22PrdCant = GXv_decimal5[0] ;
                     pcalre2.this.AV24PrdCanFin = GXv_decimal6[0] ;
                     pcalre2.this.AV25Flag3 = GXv_int1[0] ;
                     pcalre2.this.AV20Flag2 = GXv_int7[0] ;
                     pcalre2.this.AV19Consumos = GXv_int8[0] ;
                  }
                  else
                  {
                     AV18Exis = ((A2495BarDosUsa).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon) ;
                     if ( (0==AV25Flag3) )
                     {
                        if ( AV19Consumos == 0 )
                        {
                           A705PrdExiCC = A705PrdExiCC.subtract(AV18Exis) ;
                        }
                        else
                        {
                           if ( A704PrdExiAlm.subtract(AV18Exis).doubleValue() < 0 )
                           {
                              A704PrdExiAlm = DecimalUtil.doubleToDec(0) ;
                           }
                           else
                           {
                              A704PrdExiAlm = A704PrdExiAlm.subtract(AV18Exis) ;
                           }
                           if ( ! (0==AV20Flag2) )
                           {
                              AV24PrdCanFin = A2489BarDosCan ;
                              A685PrdCanRes = A685PrdCanRes.subtract(((AV24PrdCanFin.multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN))) ;
                           }
                           GXv_char3[0] = A396EmprCod ;
                           GXv_char2[0] = A719PrdNum ;
                           GXv_decimal6[0] = AV18Exis ;
                           GXv_char9[0] = AV35EntLotN ;
                           new app.palmtin(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_decimal6, GXv_char9) ;
                           pcalre2.this.A396EmprCod = GXv_char3[0] ;
                           pcalre2.this.A719PrdNum = GXv_char2[0] ;
                           pcalre2.this.AV18Exis = GXv_decimal6[0] ;
                           pcalre2.this.AV35EntLotN = GXv_char9[0] ;
                        }
                     }
                     else
                     {
                        if ( AV19Consumos == 0 )
                        {
                           A705PrdExiCC = A705PrdExiCC.subtract(AV18Exis) ;
                        }
                        else
                        {
                           GXv_char9[0] = A396EmprCod ;
                           GXv_char3[0] = A719PrdNum ;
                           GXv_decimal6[0] = AV18Exis ;
                           GXv_char2[0] = AV35EntLotN ;
                           new app.palmtin(remoteHandle, context).execute( GXv_char9, GXv_char3, GXv_decimal6, GXv_char2) ;
                           pcalre2.this.A396EmprCod = GXv_char9[0] ;
                           pcalre2.this.A719PrdNum = GXv_char3[0] ;
                           pcalre2.this.AV18Exis = GXv_decimal6[0] ;
                           pcalre2.this.AV35EntLotN = GXv_char2[0] ;
                        }
                     }
                  }
                  A2490BarDosEst = httpContext.getMessage( "S", "") ;
                  n2490BarDosEst = false ;
                  /* Using cursor P00ES5 */
                  pr_default.execute(3, new Object[] {A705PrdExiCC, A704PrdExiAlm, A685PrdCanRes, A396EmprCod, A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
                  /* Using cursor P00ES6 */
                  pr_default.execute(4, new Object[] {Boolean.valueOf(n2490BarDosEst), A2490BarDosEst, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2494BarDosPro, A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARDOS");
               }
               pr_default.readNext(1);
            }
            pr_default.close(1);
            pr_default.close(2);
            if ( AV30Flag == 0 )
            {
               AV31NumCie = (int)(AV31NumCie+1) ;
               GXv_char9[0] = A396EmprCod ;
               GXv_int4[0] = A129BarCod ;
               GXv_int8[0] = A132BarCodReo ;
               GXv_char3[0] = A130BarCodPar ;
               GXv_char2[0] = httpContext.getMessage( "C", "") ;
               GXv_int7[0] = (byte)(0) ;
               GXv_int10[0] = (short)(0) ;
               GXv_int11[0] = (short)(10) ;
               GXv_char12[0] = A180BarMaqCod ;
               GXv_char13[0] = httpContext.getMessage( "A", "") ;
               new app.pcietin(remoteHandle, context).execute( GXv_char9, GXv_int4, GXv_int8, GXv_char3, GXv_char2, GXv_int7, GXv_int10, GXv_int11, GXv_char12, GXv_char13) ;
               pcalre2.this.A396EmprCod = GXv_char9[0] ;
               pcalre2.this.A129BarCod = GXv_int4[0] ;
               pcalre2.this.A132BarCodReo = GXv_int8[0] ;
               pcalre2.this.A130BarCodPar = GXv_char3[0] ;
               pcalre2.this.A180BarMaqCod = GXv_char12[0] ;
            }
            if ( AV31NumCie == AV33TopCie )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV32NumNue = 0 ;
      /* Using cursor P00ES7 */
      pr_default.execute(5, new Object[] {AV15EmprCod, AV15EmprCod});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A2490BarDosEst = P00ES7_A2490BarDosEst[0] ;
         n2490BarDosEst = P00ES7_n2490BarDosEst[0] ;
         A130BarCodPar = P00ES7_A130BarCodPar[0] ;
         A132BarCodReo = P00ES7_A132BarCodReo[0] ;
         A129BarCod = P00ES7_A129BarCod[0] ;
         A2489BarDosCan = P00ES7_A2489BarDosCan[0] ;
         n2489BarDosCan = P00ES7_n2489BarDosCan[0] ;
         A2495BarDosUsa = P00ES7_A2495BarDosUsa[0] ;
         n2495BarDosUsa = P00ES7_n2495BarDosUsa[0] ;
         A719PrdNum = P00ES7_A719PrdNum[0] ;
         A2494BarDosPro = P00ES7_A2494BarDosPro[0] ;
         A396EmprCod = P00ES7_A396EmprCod[0] ;
         if ( GXutil.strcmp(A130BarCodPar, httpContext.getMessage( "Z", "")) == 0 )
         {
            if ( GXutil.strcmp(A2490BarDosEst, httpContext.getMessage( "N", "")) == 0 )
            {
               /* Using cursor P00ES8 */
               pr_default.execute(6, new Object[] {A396EmprCod, A719PrdNum});
               A707PrdFacCon = P00ES8_A707PrdFacCon[0] ;
               A705PrdExiCC = P00ES8_A705PrdExiCC[0] ;
               A704PrdExiAlm = P00ES8_A704PrdExiAlm[0] ;
               AV32NumNue = (int)(AV32NumNue+1) ;
               if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") == 0 )
               {
                  AV21PrdComCod = A719PrdNum ;
                  AV22PrdCant = A2489BarDosCan ;
                  AV24PrdCanFin = A2495BarDosUsa ;
                  AV23PrdCanAny = DecimalUtil.doubleToDec(0) ;
                  GXv_char13[0] = A396EmprCod ;
                  GXv_char12[0] = AV21PrdComCod ;
                  GXv_decimal6[0] = AV22PrdCant ;
                  GXv_decimal5[0] = AV24PrdCanFin ;
                  GXv_int8[0] = AV25Flag3 ;
                  GXv_int7[0] = AV20Flag2 ;
                  GXv_int1[0] = AV19Consumos ;
                  new app.pcompue(remoteHandle, context).execute( GXv_char13, GXv_char12, GXv_decimal6, GXv_decimal5, GXv_int8, GXv_int7, GXv_int1) ;
                  pcalre2.this.A396EmprCod = GXv_char13[0] ;
                  pcalre2.this.AV21PrdComCod = GXv_char12[0] ;
                  pcalre2.this.AV22PrdCant = GXv_decimal6[0] ;
                  pcalre2.this.AV24PrdCanFin = GXv_decimal5[0] ;
                  pcalre2.this.AV25Flag3 = GXv_int8[0] ;
                  pcalre2.this.AV20Flag2 = GXv_int7[0] ;
                  pcalre2.this.AV19Consumos = GXv_int1[0] ;
               }
               else
               {
                  AV18Exis = ((A2495BarDosUsa).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon) ;
                  if ( (0==AV25Flag3) )
                  {
                     if ( AV19Consumos == 0 )
                     {
                        A705PrdExiCC = A705PrdExiCC.subtract(AV18Exis) ;
                     }
                     else
                     {
                        if ( A704PrdExiAlm.subtract(AV18Exis).doubleValue() < 0 )
                        {
                           A704PrdExiAlm = DecimalUtil.doubleToDec(0) ;
                        }
                        else
                        {
                           A704PrdExiAlm = A704PrdExiAlm.subtract(AV18Exis) ;
                        }
                        GXv_char13[0] = A396EmprCod ;
                        GXv_char12[0] = A719PrdNum ;
                        GXv_decimal6[0] = AV18Exis ;
                        GXv_char9[0] = AV35EntLotN ;
                        new app.palmtin(remoteHandle, context).execute( GXv_char13, GXv_char12, GXv_decimal6, GXv_char9) ;
                        pcalre2.this.A396EmprCod = GXv_char13[0] ;
                        pcalre2.this.A719PrdNum = GXv_char12[0] ;
                        pcalre2.this.AV18Exis = GXv_decimal6[0] ;
                        pcalre2.this.AV35EntLotN = GXv_char9[0] ;
                     }
                  }
                  else
                  {
                     if ( AV19Consumos == 0 )
                     {
                        A705PrdExiCC = A705PrdExiCC.subtract(AV18Exis) ;
                     }
                     else
                     {
                        GXv_char13[0] = A396EmprCod ;
                        GXv_char12[0] = A719PrdNum ;
                        GXv_decimal6[0] = AV18Exis ;
                        GXv_char9[0] = AV35EntLotN ;
                        new app.palmtin(remoteHandle, context).execute( GXv_char13, GXv_char12, GXv_decimal6, GXv_char9) ;
                        pcalre2.this.A396EmprCod = GXv_char13[0] ;
                        pcalre2.this.A719PrdNum = GXv_char12[0] ;
                        pcalre2.this.AV18Exis = GXv_decimal6[0] ;
                        pcalre2.this.AV35EntLotN = GXv_char9[0] ;
                     }
                  }
               }
               A2490BarDosEst = httpContext.getMessage( "S", "") ;
               n2490BarDosEst = false ;
               if ( AV32NumNue == AV34TopPro )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  /* Using cursor P00ES9 */
                  pr_default.execute(7, new Object[] {A705PrdExiCC, A704PrdExiAlm, A396EmprCod, A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
                  /* Using cursor P00ES10 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n2490BarDosEst), A2490BarDosEst, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2494BarDosPro, A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARDOS");
                  if (true) break;
               }
               /* Using cursor P00ES11 */
               pr_default.execute(9, new Object[] {A705PrdExiCC, A704PrdExiAlm, A396EmprCod, A719PrdNum});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
               /* Using cursor P00ES12 */
               pr_default.execute(10, new Object[] {Boolean.valueOf(n2490BarDosEst), A2490BarDosEst, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2494BarDosPro, A719PrdNum});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARDOS");
            }
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
      pr_default.close(6);
      cleanup();
   }

   public void S111( )
   {
      /* 'COMPUEST' Routine */
      returnInSub = false ;
      /* Using cursor P00ES13 */
      pr_default.execute(11, new Object[] {AV15EmprCod, AV15EmprCod, AV21PrdComCod});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A688PrdComCod = P00ES13_A688PrdComCod[0] ;
         A690PrdComFN = P00ES13_A690PrdComFN[0] ;
         A719PrdNum = P00ES13_A719PrdNum[0] ;
         A396EmprCod = P00ES13_A396EmprCod[0] ;
         if ( GXutil.strcmp(A688PrdComCod, AV21PrdComCod) == 0 )
         {
            /* Using cursor P00ES14 */
            pr_default.execute(12, new Object[] {A396EmprCod, A719PrdNum});
            A707PrdFacCon = P00ES14_A707PrdFacCon[0] ;
            A705PrdExiCC = P00ES14_A705PrdExiCC[0] ;
            A704PrdExiAlm = P00ES14_A704PrdExiAlm[0] ;
            A685PrdCanRes = P00ES14_A685PrdCanRes[0] ;
            AV18Exis = ((AV22PrdCant.add(AV23PrdCanAny)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon).multiply(A690PrdComFN).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            if ( (0==AV25Flag3) )
            {
               if ( AV19Consumos == 0 )
               {
                  A705PrdExiCC = A705PrdExiCC.subtract(AV18Exis) ;
               }
               else
               {
                  if ( A704PrdExiAlm.subtract(AV18Exis).doubleValue() < 0 )
                  {
                     A704PrdExiAlm = DecimalUtil.doubleToDec(0) ;
                  }
                  else
                  {
                     A704PrdExiAlm = A704PrdExiAlm.subtract(AV18Exis) ;
                  }
                  if ( ! (0==AV20Flag2) )
                  {
                     A685PrdCanRes = A685PrdCanRes.subtract(((AV24PrdCanFin.multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A690PrdComFN).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)) ;
                  }
                  GXv_char13[0] = A396EmprCod ;
                  GXv_char12[0] = A719PrdNum ;
                  GXv_decimal6[0] = AV18Exis ;
                  GXv_char9[0] = AV35EntLotN ;
                  new app.palmtin(remoteHandle, context).execute( GXv_char13, GXv_char12, GXv_decimal6, GXv_char9) ;
                  pcalre2.this.A396EmprCod = GXv_char13[0] ;
                  pcalre2.this.A719PrdNum = GXv_char12[0] ;
                  pcalre2.this.AV18Exis = GXv_decimal6[0] ;
                  pcalre2.this.AV35EntLotN = GXv_char9[0] ;
               }
            }
            else
            {
               if ( AV19Consumos == 0 )
               {
                  A705PrdExiCC = A705PrdExiCC.subtract(AV18Exis) ;
               }
               else
               {
                  GXv_char13[0] = A396EmprCod ;
                  GXv_char12[0] = A719PrdNum ;
                  GXv_decimal6[0] = AV18Exis ;
                  GXv_char9[0] = AV35EntLotN ;
                  new app.palmtin(remoteHandle, context).execute( GXv_char13, GXv_char12, GXv_decimal6, GXv_char9) ;
                  pcalre2.this.A396EmprCod = GXv_char13[0] ;
                  pcalre2.this.A719PrdNum = GXv_char12[0] ;
                  pcalre2.this.AV18Exis = GXv_decimal6[0] ;
                  pcalre2.this.AV35EntLotN = GXv_char9[0] ;
               }
            }
            /* Using cursor P00ES15 */
            pr_default.execute(13, new Object[] {A705PrdExiCC, A704PrdExiAlm, A685PrdCanRes, A396EmprCod, A719PrdNum});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
         }
         pr_default.readNext(11);
      }
      pr_default.close(11);
      pr_default.close(12);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcalre2.this.AV15EmprCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcalre2");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P00ES2_A130BarCodPar = new String[] {""} ;
      P00ES2_A132BarCodReo = new byte[1] ;
      P00ES2_A129BarCod = new int[1] ;
      P00ES2_A396EmprCod = new String[] {""} ;
      P00ES2_A2498BarPrdPes = new String[] {""} ;
      P00ES2_A180BarMaqCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A2498BarPrdPes = "" ;
      A180BarMaqCod = "" ;
      P00ES3_A396EmprCod = new String[] {""} ;
      P00ES3_A129BarCod = new int[1] ;
      P00ES3_A132BarCodReo = new byte[1] ;
      P00ES3_A130BarCodPar = new String[] {""} ;
      P00ES3_A2490BarDosEst = new String[] {""} ;
      P00ES3_n2490BarDosEst = new boolean[] {false} ;
      P00ES3_A2489BarDosCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ES3_n2489BarDosCan = new boolean[] {false} ;
      P00ES3_A2495BarDosUsa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ES3_n2495BarDosUsa = new boolean[] {false} ;
      P00ES3_A719PrdNum = new String[] {""} ;
      P00ES3_A2494BarDosPro = new String[] {""} ;
      A2490BarDosEst = "" ;
      A2489BarDosCan = DecimalUtil.ZERO ;
      A2495BarDosUsa = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      A2494BarDosPro = "" ;
      P00ES4_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ES4_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ES4_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ES4_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      AV21PrdComCod = "" ;
      AV22PrdCant = DecimalUtil.ZERO ;
      AV24PrdCanFin = DecimalUtil.ZERO ;
      AV18Exis = DecimalUtil.ZERO ;
      AV35EntLotN = "" ;
      GXv_int4 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int10 = new short[1] ;
      GXv_int11 = new short[1] ;
      P00ES7_A2490BarDosEst = new String[] {""} ;
      P00ES7_n2490BarDosEst = new boolean[] {false} ;
      P00ES7_A130BarCodPar = new String[] {""} ;
      P00ES7_A132BarCodReo = new byte[1] ;
      P00ES7_A129BarCod = new int[1] ;
      P00ES7_A2489BarDosCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ES7_n2489BarDosCan = new boolean[] {false} ;
      P00ES7_A2495BarDosUsa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ES7_n2495BarDosUsa = new boolean[] {false} ;
      P00ES7_A719PrdNum = new String[] {""} ;
      P00ES7_A2494BarDosPro = new String[] {""} ;
      P00ES7_A396EmprCod = new String[] {""} ;
      P00ES8_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ES8_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ES8_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV23PrdCanAny = DecimalUtil.ZERO ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      GXv_int8 = new byte[1] ;
      GXv_int7 = new byte[1] ;
      GXv_int1 = new byte[1] ;
      P00ES13_A688PrdComCod = new String[] {""} ;
      P00ES13_A690PrdComFN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ES13_A719PrdNum = new String[] {""} ;
      P00ES13_A396EmprCod = new String[] {""} ;
      A688PrdComCod = "" ;
      A690PrdComFN = DecimalUtil.ZERO ;
      P00ES14_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ES14_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ES14_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ES14_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      GXv_char13 = new String[1] ;
      GXv_char12 = new String[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_char9 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcalre2__default(),
         new Object[] {
             new Object[] {
            P00ES2_A130BarCodPar, P00ES2_A132BarCodReo, P00ES2_A129BarCod, P00ES2_A396EmprCod, P00ES2_A2498BarPrdPes, P00ES2_A180BarMaqCod
            }
            , new Object[] {
            P00ES3_A396EmprCod, P00ES3_A129BarCod, P00ES3_A132BarCodReo, P00ES3_A130BarCodPar, P00ES3_A2490BarDosEst, P00ES3_n2490BarDosEst, P00ES3_A2489BarDosCan, P00ES3_n2489BarDosCan, P00ES3_A2495BarDosUsa, P00ES3_n2495BarDosUsa,
            P00ES3_A719PrdNum, P00ES3_A2494BarDosPro
            }
            , new Object[] {
            P00ES4_A707PrdFacCon, P00ES4_A705PrdExiCC, P00ES4_A704PrdExiAlm, P00ES4_A685PrdCanRes
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00ES7_A2490BarDosEst, P00ES7_n2490BarDosEst, P00ES7_A130BarCodPar, P00ES7_A132BarCodReo, P00ES7_A129BarCod, P00ES7_A2489BarDosCan, P00ES7_n2489BarDosCan, P00ES7_A2495BarDosUsa, P00ES7_n2495BarDosUsa, P00ES7_A719PrdNum,
            P00ES7_A2494BarDosPro, P00ES7_A396EmprCod
            }
            , new Object[] {
            P00ES8_A707PrdFacCon, P00ES8_A705PrdExiCC, P00ES8_A704PrdExiAlm
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00ES13_A688PrdComCod, P00ES13_A690PrdComFN, P00ES13_A719PrdNum, P00ES13_A396EmprCod
            }
            , new Object[] {
            P00ES14_A707PrdFacCon, P00ES14_A705PrdExiCC, P00ES14_A704PrdExiAlm, P00ES14_A685PrdCanRes
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV20Flag2 ;
   private byte AV25Flag3 ;
   private byte AV19Consumos ;
   private byte A132BarCodReo ;
   private byte AV30Flag ;
   private byte GXv_int8[] ;
   private byte GXv_int7[] ;
   private byte GXv_int1[] ;
   private short GXv_int10[] ;
   private short GXv_int11[] ;
   private short Gx_err ;
   private int AV26ContVal ;
   private int AV33TopCie ;
   private int AV34TopPro ;
   private int AV31NumCie ;
   private int A129BarCod ;
   private int GXv_int4[] ;
   private int AV32NumNue ;
   private java.math.BigDecimal A2489BarDosCan ;
   private java.math.BigDecimal A2495BarDosUsa ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal AV22PrdCant ;
   private java.math.BigDecimal AV24PrdCanFin ;
   private java.math.BigDecimal AV18Exis ;
   private java.math.BigDecimal AV23PrdCanAny ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal A690PrdComFN ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private String AV15EmprCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A2498BarPrdPes ;
   private String A180BarMaqCod ;
   private String A2490BarDosEst ;
   private String A719PrdNum ;
   private String A2494BarDosPro ;
   private String AV21PrdComCod ;
   private String AV35EntLotN ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String A688PrdComCod ;
   private String GXv_char13[] ;
   private String GXv_char12[] ;
   private String GXv_char9[] ;
   private boolean n2490BarDosEst ;
   private boolean n2489BarDosCan ;
   private boolean n2495BarDosUsa ;
   private boolean returnInSub ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P00ES2_A130BarCodPar ;
   private byte[] P00ES2_A132BarCodReo ;
   private int[] P00ES2_A129BarCod ;
   private String[] P00ES2_A396EmprCod ;
   private String[] P00ES2_A2498BarPrdPes ;
   private String[] P00ES2_A180BarMaqCod ;
   private String[] P00ES3_A396EmprCod ;
   private int[] P00ES3_A129BarCod ;
   private byte[] P00ES3_A132BarCodReo ;
   private String[] P00ES3_A130BarCodPar ;
   private String[] P00ES3_A2490BarDosEst ;
   private boolean[] P00ES3_n2490BarDosEst ;
   private java.math.BigDecimal[] P00ES3_A2489BarDosCan ;
   private boolean[] P00ES3_n2489BarDosCan ;
   private java.math.BigDecimal[] P00ES3_A2495BarDosUsa ;
   private boolean[] P00ES3_n2495BarDosUsa ;
   private String[] P00ES3_A719PrdNum ;
   private String[] P00ES3_A2494BarDosPro ;
   private java.math.BigDecimal[] P00ES4_A707PrdFacCon ;
   private java.math.BigDecimal[] P00ES4_A705PrdExiCC ;
   private java.math.BigDecimal[] P00ES4_A704PrdExiAlm ;
   private java.math.BigDecimal[] P00ES4_A685PrdCanRes ;
   private String[] P00ES7_A2490BarDosEst ;
   private boolean[] P00ES7_n2490BarDosEst ;
   private String[] P00ES7_A130BarCodPar ;
   private byte[] P00ES7_A132BarCodReo ;
   private int[] P00ES7_A129BarCod ;
   private java.math.BigDecimal[] P00ES7_A2489BarDosCan ;
   private boolean[] P00ES7_n2489BarDosCan ;
   private java.math.BigDecimal[] P00ES7_A2495BarDosUsa ;
   private boolean[] P00ES7_n2495BarDosUsa ;
   private String[] P00ES7_A719PrdNum ;
   private String[] P00ES7_A2494BarDosPro ;
   private String[] P00ES7_A396EmprCod ;
   private java.math.BigDecimal[] P00ES8_A707PrdFacCon ;
   private java.math.BigDecimal[] P00ES8_A705PrdExiCC ;
   private java.math.BigDecimal[] P00ES8_A704PrdExiAlm ;
   private String[] P00ES13_A688PrdComCod ;
   private java.math.BigDecimal[] P00ES13_A690PrdComFN ;
   private String[] P00ES13_A719PrdNum ;
   private String[] P00ES13_A396EmprCod ;
   private java.math.BigDecimal[] P00ES14_A707PrdFacCon ;
   private java.math.BigDecimal[] P00ES14_A705PrdExiCC ;
   private java.math.BigDecimal[] P00ES14_A704PrdExiAlm ;
   private java.math.BigDecimal[] P00ES14_A685PrdCanRes ;
}

final  class pcalre2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00ES2", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarPrdPes, BarMaqCod FROM TXPBARCAD WHERE EmprCod = ? ORDER BY EmprCod, BarPrdPes, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00ES3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDosEst, BarDosCan, BarDosUsa, PrdNum, BarDosPro FROM TXPBARDOS WHERE (EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) AND (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarDosPro, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00ES4", "SELECT PrdFacCon, PrdExiCC, PrdExiAlm, PrdCanRes FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00ES5", "UPDATE TXPPRODUC SET PrdExiCC=?, PrdExiAlm=?, PrdCanRes=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
         ,new UpdateCursor("P00ES6", "UPDATE TXPBARDOS SET BarDosEst=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarDosPro = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARDOS")
         ,new ForEachCursor("P00ES7", "SELECT BarDosEst, BarCodPar, BarCodReo, BarCod, BarDosCan, BarDosUsa, PrdNum, BarDosPro, EmprCod FROM TXPBARDOS WHERE (EmprCod = ? AND BarCod = 99999999 AND BarCodReo = 9) AND (EmprCod = ? and BarCod = 99999999 and BarCodReo = 9) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarDosPro, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00ES8", "SELECT PrdFacCon, PrdExiCC, PrdExiAlm FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00ES9", "UPDATE TXPPRODUC SET PrdExiCC=?, PrdExiAlm=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
         ,new UpdateCursor("P00ES10", "UPDATE TXPBARDOS SET BarDosEst=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarDosPro = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARDOS")
         ,new UpdateCursor("P00ES11", "UPDATE TXPPRODUC SET PrdExiCC=?, PrdExiAlm=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
         ,new UpdateCursor("P00ES12", "UPDATE TXPBARDOS SET BarDosEst=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarDosPro = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARDOS")
         ,new ForEachCursor("P00ES13", "SELECT PrdComCod, PrdComFN, PrdNum, EmprCod FROM TXPLPRDCO WHERE (EmprCod = ?) AND ((EmprCod = ?) AND (PrdComCod = ?)) ORDER BY EmprCod, PrdNum, PrdComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00ES14", "SELECT PrdFacCon, PrdExiCC, PrdExiAlm, PrdCanRes FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00ES15", "UPDATE TXPPRODUC SET PrdExiCC=?, PrdExiAlm=?, PrdCanRes=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 6);
               ((String[]) buf[11])[0] = rslt.getString(9, 6);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,3);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 6);
               ((String[]) buf[10])[0] = rslt.getString(8, 6);
               ((String[]) buf[11])[0] = rslt.getString(9, 3);
               return;
            case 6 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 12 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 4);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 6);
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setString(6, (String)parms[6], 6);
               stmt.setString(7, (String)parms[7], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 7 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setString(6, (String)parms[6], 6);
               stmt.setString(7, (String)parms[7], 6);
               return;
            case 9 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setString(6, (String)parms[6], 6);
               stmt.setString(7, (String)parms[7], 6);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 13 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 4);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 6);
               return;
      }
   }

}

