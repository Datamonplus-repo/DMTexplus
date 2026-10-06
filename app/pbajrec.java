package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbajrec extends GXProcedure
{
   public pbajrec( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbajrec.class ), "" );
   }

   public pbajrec( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 )
   {
      pbajrec.this.aP4 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 )
   {
      pbajrec.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbajrec.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pbajrec.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pbajrec.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pbajrec.this.A2804RecLinMaq = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = (byte)(DecimalUtil.decToDouble(AV18Flag2)) ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, "038001", GXv_int1) ;
      pbajrec.this.AV18Flag2 = DecimalUtil.doubleToDec(GXv_int1[0]) ;
      GXt_char2 = AV26Station ;
      GXv_char3[0] = GXt_char2 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char3) ;
      pbajrec.this.GXt_char2 = GXv_char3[0] ;
      AV26Station = GXt_char2 ;
      GXv_char3[0] = A396EmprCod ;
      GXv_char4[0] = AV27EmprNom ;
      GXv_char5[0] = AV28UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV26Station, GXv_char3, GXv_char4, GXv_char5) ;
      pbajrec.this.A396EmprCod = GXv_char3[0] ;
      pbajrec.this.AV27EmprNom = GXv_char4[0] ;
      pbajrec.this.AV28UsurCod = GXv_char5[0] ;
      AV22Num_r = (short)(0) ;
      AV23Num_rt = (short)(0) ;
      AV24Num_ra = (short)(0) ;
      /* Using cursor P00232 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6039RecAcab = P00232_A6039RecAcab[0] ;
         n6039RecAcab = P00232_n6039RecAcab[0] ;
         AV22Num_r = (short)(AV22Num_r+1) ;
         if ( GXutil.strcmp(A6039RecAcab, httpContext.getMessage( "S", "")) == 0 )
         {
            AV24Num_ra = (short)(AV24Num_ra+1) ;
         }
         else
         {
            AV23Num_rt = (short)(AV23Num_rt+1) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV25RECACAB = httpContext.getMessage( "N", "") ;
      /* Using cursor P00233 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A6039RecAcab = P00233_A6039RecAcab[0] ;
         n6039RecAcab = P00233_n6039RecAcab[0] ;
         AV25RECACAB = A6039RecAcab ;
         /* Using cursor P00234 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A1273RecLinPro = P00234_A1273RecLinPro[0] ;
            A764ProForCod = P00234_A764ProForCod[0] ;
            if ( AV18Flag2.doubleValue() == 1 )
            {
               /* Using cursor P00235 */
               pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A686PrdCant = P00235_A686PrdCant[0] ;
                  A719PrdNum = P00235_A719PrdNum[0] ;
                  n719PrdNum = P00235_n719PrdNum[0] ;
                  A811RecLin = P00235_A811RecLin[0] ;
                  if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A686PrdCant)==0) )
                  {
                     if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") != 0 )
                     {
                        GXv_char5[0] = A396EmprCod ;
                        GXv_char4[0] = A719PrdNum ;
                        GXv_decimal6[0] = A686PrdCant ;
                        new app.pactres4(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_decimal6) ;
                        pbajrec.this.A396EmprCod = GXv_char5[0] ;
                        pbajrec.this.A719PrdNum = GXv_char4[0] ;
                        pbajrec.this.A686PrdCant = GXv_decimal6[0] ;
                     }
                     else
                     {
                        AV19PrdNum = A719PrdNum ;
                        AV20PrdCant = A686PrdCant ;
                        /* Execute user subroutine: 'COMPUESTOS' */
                        S111 ();
                        if ( returnInSub )
                        {
                           pr_default.close(3);
                           pr_default.close(2);
                           pr_default.close(1);
                           returnInSub = true;
                           cleanup();
                           if (true) return;
                        }
                     }
                  }
                  pr_default.readNext(3);
               }
               pr_default.close(3);
            }
            /* Optimized DELETE. */
            /* Using cursor P00236 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRECET");
            /* End optimized DELETE. */
            /* Optimized DELETE. */
            /* Using cursor P00237 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLANYAD");
            /* End optimized DELETE. */
            /* Optimized DELETE. */
            /* Using cursor P00238 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSREC");
            /* End optimized DELETE. */
            GXv_char5[0] = A396EmprCod ;
            GXv_int7[0] = A129BarCod ;
            GXv_int1[0] = A132BarCodReo ;
            GXv_char4[0] = A130BarCodPar ;
            GXv_int8[0] = A2804RecLinMaq ;
            GXv_int9[0] = A1273RecLinPro ;
            new app.pbajpre(remoteHandle, context).execute( GXv_char5, GXv_int7, GXv_int1, GXv_char4, GXv_int8, GXv_int9) ;
            pbajrec.this.A396EmprCod = GXv_char5[0] ;
            pbajrec.this.A129BarCod = GXv_int7[0] ;
            pbajrec.this.A132BarCodReo = GXv_int1[0] ;
            pbajrec.this.A130BarCodPar = GXv_char4[0] ;
            pbajrec.this.A2804RecLinMaq = GXv_int8[0] ;
            pbajrec.this.A1273RecLinPro = GXv_int9[0] ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         /* Using cursor P00239 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMAQ");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( GXutil.strcmp(AV25RECACAB, httpContext.getMessage( "S", "")) != 0 )
      {
         /* Using cursor P002310 */
         pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A212BarSer = P002310_A212BarSer[0] ;
            A213BarSit = P002310_A213BarSit[0] ;
            A3870BarFecLRe = P002310_A3870BarFecLRe[0] ;
            A4908BarMacPro = P002310_A4908BarMacPro[0] ;
            if ( A213BarSit == 4 )
            {
               AV29Inc_obs = httpContext.getMessage( "Baja Receta.Cambio Situacion.", "") + GXutil.newLine( ) ;
               AV29Inc_obs += httpContext.getMessage( "Receta Acabado= ", "") + AV25RECACAB + GXutil.newLine( ) ;
               AV29Inc_obs += httpContext.getMessage( "Situacion Actual= ", "") + GXutil.str( A213BarSit, 2, 0) + GXutil.newLine( ) ;
               AV29Inc_obs += httpContext.getMessage( "Situacion Nueva = ", "") + "1" ;
               new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV40Pgmname, AV28UsurCod, AV26Station, AV29Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
               A213BarSit = (byte)(1) ;
               A3870BarFecLRe = GXutil.nullDate() ;
            }
            A4908BarMacPro = " " ;
            /* Using cursor P002311 */
            pr_default.execute(9, new Object[] {Byte.valueOf(A213BarSit), A3870BarFecLRe, A4908BarMacPro, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(8);
         /* Using cursor P002312 */
         pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(10) != 101) )
         {
            A122BarAgrPar = P002312_A122BarAgrPar[0] ;
            A124BarAgrReo = P002312_A124BarAgrReo[0] ;
            A119BarAgrCod = P002312_A119BarAgrCod[0] ;
            GXv_char5[0] = A396EmprCod ;
            GXv_int7[0] = A119BarAgrCod ;
            GXv_int9[0] = A124BarAgrReo ;
            GXv_char4[0] = A122BarAgrPar ;
            GXv_int1[0] = (byte)(1) ;
            new app.pmodsit(remoteHandle, context).execute( GXv_char5, GXv_int7, GXv_int9, GXv_char4, GXv_int1) ;
            pbajrec.this.A396EmprCod = GXv_char5[0] ;
            pbajrec.this.A119BarAgrCod = GXv_int7[0] ;
            pbajrec.this.A124BarAgrReo = GXv_int9[0] ;
            pbajrec.this.A122BarAgrPar = GXv_char4[0] ;
            pr_default.readNext(10);
         }
         pr_default.close(10);
      }
      /* Using cursor P002313 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A2792TermiCod = P002313_A2792TermiCod[0] ;
         A2793BarULinMaq = P002313_A2793BarULinMaq[0] ;
         n2793BarULinMaq = P002313_n2793BarULinMaq[0] ;
         /* Using cursor P002314 */
         pr_default.execute(12, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(12) != 101) )
         {
            A2794BarLinMaq = P002314_A2794BarLinMaq[0] ;
            A2795BarMaqPrf = P002314_A2795BarMaqPrf[0] ;
            n2795BarMaqPrf = P002314_n2795BarMaqPrf[0] ;
            /* Optimized DELETE. */
            /* Using cursor P002315 */
            pr_default.execute(13, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2794BarLinMaq)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPR2");
            /* End optimized DELETE. */
            /* Using cursor P002316 */
            pr_default.execute(14, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2794BarLinMaq)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARMAQ");
            pr_default.readNext(12);
         }
         pr_default.close(12);
         /* Using cursor P002317 */
         pr_default.execute(15, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARTER");
         pr_default.readNext(11);
      }
      pr_default.close(11);
      /* Optimized DELETE. */
      /* Using cursor P002318 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLANYAD");
      /* End optimized DELETE. */
      cleanup();
   }

   public void S111( )
   {
      /* 'COMPUESTOS' Routine */
      returnInSub = false ;
      /* Using cursor P002319 */
      pr_default.execute(17, new Object[] {A396EmprCod, AV19PrdNum});
      while ( (pr_default.getStatus(17) != 101) )
      {
         A688PrdComCod = P002319_A688PrdComCod[0] ;
         A690PrdComFN = P002319_A690PrdComFN[0] ;
         A719PrdNum = P002319_A719PrdNum[0] ;
         n719PrdNum = P002319_n719PrdNum[0] ;
         AV17Cantidad = AV20PrdCant.multiply(A690PrdComFN).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         GXv_char5[0] = A396EmprCod ;
         GXv_char4[0] = A719PrdNum ;
         GXv_decimal6[0] = AV17Cantidad ;
         new app.pactres4(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_decimal6) ;
         pbajrec.this.A396EmprCod = GXv_char5[0] ;
         pbajrec.this.A719PrdNum = GXv_char4[0] ;
         pbajrec.this.AV17Cantidad = GXv_decimal6[0] ;
         pr_default.readNext(17);
      }
      pr_default.close(17);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbajrec.this.A396EmprCod;
      this.aP1[0] = pbajrec.this.A129BarCod;
      this.aP2[0] = pbajrec.this.A132BarCodReo;
      this.aP3[0] = pbajrec.this.A130BarCodPar;
      this.aP4[0] = pbajrec.this.A2804RecLinMaq;
      Application.commitDataStores(context, remoteHandle, pr_default, "pbajrec");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV18Flag2 = DecimalUtil.ZERO ;
      AV26Station = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV27EmprNom = "" ;
      AV28UsurCod = "" ;
      scmdbuf = "" ;
      P00232_A396EmprCod = new String[] {""} ;
      P00232_A129BarCod = new int[1] ;
      P00232_A132BarCodReo = new byte[1] ;
      P00232_A130BarCodPar = new String[] {""} ;
      P00232_A2804RecLinMaq = new short[1] ;
      P00232_A6039RecAcab = new String[] {""} ;
      P00232_n6039RecAcab = new boolean[] {false} ;
      A6039RecAcab = "" ;
      AV25RECACAB = "" ;
      P00233_A396EmprCod = new String[] {""} ;
      P00233_A129BarCod = new int[1] ;
      P00233_A132BarCodReo = new byte[1] ;
      P00233_A130BarCodPar = new String[] {""} ;
      P00233_A2804RecLinMaq = new short[1] ;
      P00233_A6039RecAcab = new String[] {""} ;
      P00233_n6039RecAcab = new boolean[] {false} ;
      P00234_A396EmprCod = new String[] {""} ;
      P00234_A129BarCod = new int[1] ;
      P00234_A132BarCodReo = new byte[1] ;
      P00234_A130BarCodPar = new String[] {""} ;
      P00234_A2804RecLinMaq = new short[1] ;
      P00234_A1273RecLinPro = new byte[1] ;
      P00234_A764ProForCod = new String[] {""} ;
      A764ProForCod = "" ;
      P00235_A396EmprCod = new String[] {""} ;
      P00235_A129BarCod = new int[1] ;
      P00235_A132BarCodReo = new byte[1] ;
      P00235_A130BarCodPar = new String[] {""} ;
      P00235_A2804RecLinMaq = new short[1] ;
      P00235_A1273RecLinPro = new byte[1] ;
      P00235_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00235_A719PrdNum = new String[] {""} ;
      P00235_n719PrdNum = new boolean[] {false} ;
      P00235_A811RecLin = new short[1] ;
      A686PrdCant = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      AV19PrdNum = "" ;
      AV20PrdCant = DecimalUtil.ZERO ;
      GXv_int8 = new short[1] ;
      P002310_A396EmprCod = new String[] {""} ;
      P002310_A129BarCod = new int[1] ;
      P002310_A132BarCodReo = new byte[1] ;
      P002310_A130BarCodPar = new String[] {""} ;
      P002310_A212BarSer = new String[] {""} ;
      P002310_A213BarSit = new byte[1] ;
      P002310_A3870BarFecLRe = new java.util.Date[] {GXutil.nullDate()} ;
      P002310_A4908BarMacPro = new String[] {""} ;
      A212BarSer = "" ;
      A3870BarFecLRe = GXutil.nullDate() ;
      A4908BarMacPro = "" ;
      AV29Inc_obs = "" ;
      AV40Pgmname = "" ;
      P002312_A396EmprCod = new String[] {""} ;
      P002312_A129BarCod = new int[1] ;
      P002312_A132BarCodReo = new byte[1] ;
      P002312_A130BarCodPar = new String[] {""} ;
      P002312_A122BarAgrPar = new String[] {""} ;
      P002312_A124BarAgrReo = new byte[1] ;
      P002312_A119BarAgrCod = new int[1] ;
      A122BarAgrPar = "" ;
      GXv_int7 = new int[1] ;
      GXv_int9 = new byte[1] ;
      GXv_int1 = new byte[1] ;
      P002313_A396EmprCod = new String[] {""} ;
      P002313_A129BarCod = new int[1] ;
      P002313_A132BarCodReo = new byte[1] ;
      P002313_A130BarCodPar = new String[] {""} ;
      P002313_A2792TermiCod = new String[] {""} ;
      P002313_A2793BarULinMaq = new short[1] ;
      P002313_n2793BarULinMaq = new boolean[] {false} ;
      A2792TermiCod = "" ;
      P002314_A396EmprCod = new String[] {""} ;
      P002314_A2792TermiCod = new String[] {""} ;
      P002314_A129BarCod = new int[1] ;
      P002314_A132BarCodReo = new byte[1] ;
      P002314_A130BarCodPar = new String[] {""} ;
      P002314_A2794BarLinMaq = new short[1] ;
      P002314_A2795BarMaqPrf = new String[] {""} ;
      P002314_n2795BarMaqPrf = new boolean[] {false} ;
      A2795BarMaqPrf = "" ;
      P002319_A396EmprCod = new String[] {""} ;
      P002319_A688PrdComCod = new String[] {""} ;
      P002319_A690PrdComFN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002319_A719PrdNum = new String[] {""} ;
      P002319_n719PrdNum = new boolean[] {false} ;
      A688PrdComCod = "" ;
      A690PrdComFN = DecimalUtil.ZERO ;
      AV17Cantidad = DecimalUtil.ZERO ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbajrec__default(),
         new Object[] {
             new Object[] {
            P00232_A396EmprCod, P00232_A129BarCod, P00232_A132BarCodReo, P00232_A130BarCodPar, P00232_A2804RecLinMaq, P00232_A6039RecAcab, P00232_n6039RecAcab
            }
            , new Object[] {
            P00233_A396EmprCod, P00233_A129BarCod, P00233_A132BarCodReo, P00233_A130BarCodPar, P00233_A2804RecLinMaq, P00233_A6039RecAcab, P00233_n6039RecAcab
            }
            , new Object[] {
            P00234_A396EmprCod, P00234_A129BarCod, P00234_A132BarCodReo, P00234_A130BarCodPar, P00234_A2804RecLinMaq, P00234_A1273RecLinPro, P00234_A764ProForCod
            }
            , new Object[] {
            P00235_A396EmprCod, P00235_A129BarCod, P00235_A132BarCodReo, P00235_A130BarCodPar, P00235_A2804RecLinMaq, P00235_A1273RecLinPro, P00235_A686PrdCant, P00235_A719PrdNum, P00235_n719PrdNum, P00235_A811RecLin
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
            P002310_A396EmprCod, P002310_A129BarCod, P002310_A132BarCodReo, P002310_A130BarCodPar, P002310_A212BarSer, P002310_A213BarSit, P002310_A3870BarFecLRe, P002310_A4908BarMacPro
            }
            , new Object[] {
            }
            , new Object[] {
            P002312_A396EmprCod, P002312_A129BarCod, P002312_A132BarCodReo, P002312_A130BarCodPar, P002312_A122BarAgrPar, P002312_A124BarAgrReo, P002312_A119BarAgrCod
            }
            , new Object[] {
            P002313_A396EmprCod, P002313_A129BarCod, P002313_A132BarCodReo, P002313_A130BarCodPar, P002313_A2792TermiCod, P002313_A2793BarULinMaq, P002313_n2793BarULinMaq
            }
            , new Object[] {
            P002314_A396EmprCod, P002314_A2792TermiCod, P002314_A129BarCod, P002314_A132BarCodReo, P002314_A130BarCodPar, P002314_A2794BarLinMaq, P002314_A2795BarMaqPrf, P002314_n2795BarMaqPrf
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
            P002319_A396EmprCod, P002319_A688PrdComCod, P002319_A690PrdComFN, P002319_A719PrdNum
            }
         }
      );
      AV40Pgmname = "PBAJREC" ;
      /* GeneXus formulas. */
      AV40Pgmname = "PBAJREC" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte A213BarSit ;
   private byte A124BarAgrReo ;
   private byte GXv_int9[] ;
   private byte GXv_int1[] ;
   private short A2804RecLinMaq ;
   private short AV22Num_r ;
   private short AV23Num_rt ;
   private short AV24Num_ra ;
   private short A811RecLin ;
   private short GXv_int8[] ;
   private short A2793BarULinMaq ;
   private short A2794BarLinMaq ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A119BarAgrCod ;
   private int GXv_int7[] ;
   private java.math.BigDecimal AV18Flag2 ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal AV20PrdCant ;
   private java.math.BigDecimal A690PrdComFN ;
   private java.math.BigDecimal AV17Cantidad ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV26Station ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private String AV27EmprNom ;
   private String AV28UsurCod ;
   private String scmdbuf ;
   private String A6039RecAcab ;
   private String AV25RECACAB ;
   private String A764ProForCod ;
   private String A719PrdNum ;
   private String AV19PrdNum ;
   private String A212BarSer ;
   private String A4908BarMacPro ;
   private String AV40Pgmname ;
   private String A122BarAgrPar ;
   private String A2792TermiCod ;
   private String A2795BarMaqPrf ;
   private String A688PrdComCod ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private java.util.Date A3870BarFecLRe ;
   private boolean n6039RecAcab ;
   private boolean n719PrdNum ;
   private boolean returnInSub ;
   private boolean n2793BarULinMaq ;
   private boolean n2795BarMaqPrf ;
   private String AV29Inc_obs ;
   private short[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00232_A396EmprCod ;
   private int[] P00232_A129BarCod ;
   private byte[] P00232_A132BarCodReo ;
   private String[] P00232_A130BarCodPar ;
   private short[] P00232_A2804RecLinMaq ;
   private String[] P00232_A6039RecAcab ;
   private boolean[] P00232_n6039RecAcab ;
   private String[] P00233_A396EmprCod ;
   private int[] P00233_A129BarCod ;
   private byte[] P00233_A132BarCodReo ;
   private String[] P00233_A130BarCodPar ;
   private short[] P00233_A2804RecLinMaq ;
   private String[] P00233_A6039RecAcab ;
   private boolean[] P00233_n6039RecAcab ;
   private String[] P00234_A396EmprCod ;
   private int[] P00234_A129BarCod ;
   private byte[] P00234_A132BarCodReo ;
   private String[] P00234_A130BarCodPar ;
   private short[] P00234_A2804RecLinMaq ;
   private byte[] P00234_A1273RecLinPro ;
   private String[] P00234_A764ProForCod ;
   private String[] P00235_A396EmprCod ;
   private int[] P00235_A129BarCod ;
   private byte[] P00235_A132BarCodReo ;
   private String[] P00235_A130BarCodPar ;
   private short[] P00235_A2804RecLinMaq ;
   private byte[] P00235_A1273RecLinPro ;
   private java.math.BigDecimal[] P00235_A686PrdCant ;
   private String[] P00235_A719PrdNum ;
   private boolean[] P00235_n719PrdNum ;
   private short[] P00235_A811RecLin ;
   private String[] P002310_A396EmprCod ;
   private int[] P002310_A129BarCod ;
   private byte[] P002310_A132BarCodReo ;
   private String[] P002310_A130BarCodPar ;
   private String[] P002310_A212BarSer ;
   private byte[] P002310_A213BarSit ;
   private java.util.Date[] P002310_A3870BarFecLRe ;
   private String[] P002310_A4908BarMacPro ;
   private String[] P002312_A396EmprCod ;
   private int[] P002312_A129BarCod ;
   private byte[] P002312_A132BarCodReo ;
   private String[] P002312_A130BarCodPar ;
   private String[] P002312_A122BarAgrPar ;
   private byte[] P002312_A124BarAgrReo ;
   private int[] P002312_A119BarAgrCod ;
   private String[] P002313_A396EmprCod ;
   private int[] P002313_A129BarCod ;
   private byte[] P002313_A132BarCodReo ;
   private String[] P002313_A130BarCodPar ;
   private String[] P002313_A2792TermiCod ;
   private short[] P002313_A2793BarULinMaq ;
   private boolean[] P002313_n2793BarULinMaq ;
   private String[] P002314_A396EmprCod ;
   private String[] P002314_A2792TermiCod ;
   private int[] P002314_A129BarCod ;
   private byte[] P002314_A132BarCodReo ;
   private String[] P002314_A130BarCodPar ;
   private short[] P002314_A2794BarLinMaq ;
   private String[] P002314_A2795BarMaqPrf ;
   private boolean[] P002314_n2795BarMaqPrf ;
   private String[] P002319_A396EmprCod ;
   private String[] P002319_A688PrdComCod ;
   private java.math.BigDecimal[] P002319_A690PrdComFN ;
   private String[] P002319_A719PrdNum ;
   private boolean[] P002319_n719PrdNum ;
}

final  class pbajrec__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00232", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecAcab FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00233", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecAcab FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00234", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, ProForCod FROM TXPCRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00235", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, PrdCant, PrdNum, RecLin FROM TXPLRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? and RecLinPro = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00236", "DELETE FROM TXPLRECET  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? and RecLinPro = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLRECET")
         ,new UpdateCursor("P00237", "DELETE FROM TXPLANYAD  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMAL = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLANYAD")
         ,new UpdateCursor("P00238", "DELETE FROM TXPOBSREC  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOBSREC")
         ,new UpdateCursor("P00239", "DELETE FROM TXPRECMAQ  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECMAQ")
         ,new ForEachCursor("P002310", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarSer, BarSit, BarFecLRe, BarMacPro FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P002311", "UPDATE TXPBARCAD SET BarSit=?, BarFecLRe=?, BarMacPro=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P002312", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrPar, BarAgrReo, BarAgrCod FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P002313", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, TermiCod, BarULinMaq FROM TXPBARTER WHERE (EmprCod = ?) AND (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) ORDER BY EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P002314", "SELECT EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar, BarLinMaq, BarMaqPrf FROM TXPBARMAQ WHERE EmprCod = ? and TermiCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar, BarLinMaq ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P002315", "DELETE FROM TXPBARPR2  WHERE EmprCod = ? and TermiCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPR2")
         ,new UpdateCursor("P002316", "DELETE FROM TXPBARMAQ  WHERE EmprCod = ? AND TermiCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARMAQ")
         ,new UpdateCursor("P002317", "DELETE FROM TXPBARTER  WHERE EmprCod = ? AND TermiCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARTER")
         ,new UpdateCursor("P002318", "DELETE FROM TXPLANYAD  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMAL = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLANYAD")
         ,new ForEachCursor("P002319", "SELECT EmprCod, PrdComCod, PrdComFN, PrdNum FROM TXPLPRDCO WHERE (EmprCod = ?) AND (PrdComCod = ?) ORDER BY EmprCod, PrdNum, PrdComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,3);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 9 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

