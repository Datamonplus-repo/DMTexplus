package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class paltpi2 extends GXProcedure
{
   public paltpi2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( paltpi2.class ), "" );
   }

   public paltpi2( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             short[] aP7 ,
                             short[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             java.math.BigDecimal[] aP10 )
   {
      paltpi2.this.aP11 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        short[] aP7 ,
                        short[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        java.math.BigDecimal[] aP10 ,
                        String[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             short[] aP7 ,
                             short[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             String[] aP11 )
   {
      paltpi2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      paltpi2.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      paltpi2.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      paltpi2.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      paltpi2.this.AV14AlbRecCod = aP4[0];
      this.aP4 = aP4;
      paltpi2.this.A200BarPieCod = aP5[0];
      this.aP5 = aP5;
      paltpi2.this.AV15BarPieLoc = aP6[0];
      this.aP6 = aP6;
      paltpi2.this.AV16BarPieAnc = aP7[0];
      this.aP7 = aP7;
      paltpi2.this.AV19Pzas = aP8[0];
      this.aP8 = aP8;
      paltpi2.this.AV18Mts = aP9[0];
      this.aP9 = aP9;
      paltpi2.this.AV17Kilos = aP10[0];
      this.aP10 = aP10;
      paltpi2.this.Gx_mode = aP11[0];
      this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV22Artextil ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ARTEXT", ""), GXv_int2) ;
      paltpi2.this.GXt_int1 = GXv_int2[0] ;
      AV22Artextil = GXt_int1 ;
      GXt_int1 = AV23Er ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "EROTAT", ""), GXv_int2) ;
      paltpi2.this.GXt_int1 = GXv_int2[0] ;
      AV23Er = GXt_int1 ;
      AV24UsurCod = " " ;
      AV25Station = context.getWorkstationId( remoteHandle) ;
      GXv_char3[0] = A396EmprCod ;
      GXv_char4[0] = AV26EmprNom ;
      GXv_char5[0] = AV24UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV25Station, GXv_char3, GXv_char4, GXv_char5) ;
      paltpi2.this.A396EmprCod = GXv_char3[0] ;
      paltpi2.this.AV26EmprNom = GXv_char4[0] ;
      paltpi2.this.AV24UsurCod = GXv_char5[0] ;
      /* Using cursor P01922 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A864BarPes = P01922_A864BarPes[0] ;
         A228BarUniMed = P01922_A228BarUniMed[0] ;
         AV20BarPes = A864BarPes ;
         AV21BarUniMed = A228BarUniMed ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "INS", "")) == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPBARPIE

         */
         A44AlbRecCod = AV14AlbRecCod ;
         if ( AV22Artextil == 0 )
         {
            if ( GXutil.strcmp(AV21BarUniMed, httpContext.getMessage( "K", "")) == 0 )
            {
               A203BarPieKil = AV17Kilos ;
            }
            else
            {
               if ( AV23Er == 0 )
               {
                  A203BarPieKil = AV18Mts.multiply(DecimalUtil.doubleToDec(AV20BarPes)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
               }
               else
               {
                  A203BarPieKil = AV17Kilos ;
               }
            }
         }
         else
         {
            A203BarPieKil = AV17Kilos ;
         }
         A205BarPieMet = AV18Mts ;
         A2186BarPieLoc = AV15BarPieLoc ;
         n2186BarPieLoc = false ;
         A201BarPieEst = (byte)(0) ;
         A1501BarPiePie = AV19Pzas ;
         A1691BarPieAnc = AV16BarPieAnc ;
         n1691BarPieAnc = false ;
         AV27Inc_obs = httpContext.getMessage( "Alta BARPIE.", "") + GXutil.newLine( ) ;
         AV27Inc_obs += httpContext.getMessage( "Pieza ", "") + A200BarPieCod + GXutil.newLine( ) ;
         AV27Inc_obs += httpContext.getMessage( "Metros ", "") + GXutil.str( AV18Mts, 9, 2) + GXutil.newLine( ) ;
         AV27Inc_obs += httpContext.getMessage( "Kilos  ", "") + GXutil.str( A203BarPieKil, 9, 2) + GXutil.newLine( ) ;
         AV27Inc_obs += httpContext.getMessage( "Estado ", "") + GXutil.str( A201BarPieEst, 1, 0) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV32Pgmname, AV24UsurCod, AV25Station, AV27Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         /* Using cursor P01923 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Integer.valueOf(A44AlbRecCod), A203BarPieKil, A205BarPieMet, Byte.valueOf(A201BarPieEst), Integer.valueOf(A1501BarPiePie), Boolean.valueOf(n1691BarPieAnc), Short.valueOf(A1691BarPieAnc), Boolean.valueOf(n2186BarPieLoc), A2186BarPieLoc});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            /* Using cursor P01924 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A396EmprCod = P01924_A396EmprCod[0] ;
               A129BarCod = P01924_A129BarCod[0] ;
               A132BarCodReo = P01924_A132BarCodReo[0] ;
               A130BarCodPar = P01924_A130BarCodPar[0] ;
               A200BarPieCod = P01924_A200BarPieCod[0] ;
               A205BarPieMet = P01924_A205BarPieMet[0] ;
               A1501BarPiePie = P01924_A1501BarPiePie[0] ;
               A1691BarPieAnc = P01924_A1691BarPieAnc[0] ;
               n1691BarPieAnc = P01924_n1691BarPieAnc[0] ;
               A203BarPieKil = P01924_A203BarPieKil[0] ;
               A201BarPieEst = P01924_A201BarPieEst[0] ;
               A205BarPieMet = A205BarPieMet.add(AV18Mts) ;
               A1501BarPiePie = (int)(A1501BarPiePie+AV19Pzas) ;
               A1691BarPieAnc = AV16BarPieAnc ;
               n1691BarPieAnc = false ;
               if ( AV22Artextil == 0 )
               {
                  if ( GXutil.strcmp(AV21BarUniMed, httpContext.getMessage( "K", "")) == 0 )
                  {
                     A203BarPieKil = A203BarPieKil.add(AV17Kilos) ;
                  }
                  else
                  {
                     if ( AV23Er == 0 )
                     {
                        A203BarPieKil = A205BarPieMet.multiply(DecimalUtil.doubleToDec(AV20BarPes)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
                     }
                     else
                     {
                        A203BarPieKil = AV17Kilos ;
                     }
                  }
               }
               else
               {
                  A203BarPieKil = A203BarPieKil.add(AV17Kilos) ;
               }
               AV27Inc_obs = httpContext.getMessage( "Update BARPIE.", "") + GXutil.newLine( ) ;
               AV27Inc_obs += httpContext.getMessage( "Pieza ", "") + A200BarPieCod + GXutil.newLine( ) ;
               AV27Inc_obs += httpContext.getMessage( "Metros ", "") + GXutil.str( A205BarPieMet, 9, 2) + GXutil.newLine( ) ;
               AV27Inc_obs += httpContext.getMessage( "Kilos  ", "") + GXutil.str( A203BarPieKil, 9, 2) + GXutil.newLine( ) ;
               AV27Inc_obs += httpContext.getMessage( "Estado ", "") + GXutil.str( A201BarPieEst, 1, 0) ;
               new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV32Pgmname, AV24UsurCod, AV25Station, AV27Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
               /* Using cursor P01925 */
               pr_default.execute(3, new Object[] {A205BarPieMet, Integer.valueOf(A1501BarPiePie), Boolean.valueOf(n1691BarPieAnc), Short.valueOf(A1691BarPieAnc), A203BarPieKil, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(2);
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
      }
      else if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "DEL", "")) == 0 )
      {
         /* Using cursor P01926 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A205BarPieMet = P01926_A205BarPieMet[0] ;
            A203BarPieKil = P01926_A203BarPieKil[0] ;
            A201BarPieEst = P01926_A201BarPieEst[0] ;
            /* Optimized DELETE. */
            /* Using cursor P01927 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARTRO");
            /* End optimized DELETE. */
            /* Using cursor P01928 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
            AV27Inc_obs = httpContext.getMessage( "DELETE BARPIE.", "") + GXutil.newLine( ) ;
            AV27Inc_obs += httpContext.getMessage( "Pieza ", "") + A200BarPieCod + GXutil.newLine( ) ;
            AV27Inc_obs += httpContext.getMessage( "Metros ", "") + GXutil.str( A205BarPieMet, 9, 2) + GXutil.newLine( ) ;
            AV27Inc_obs += httpContext.getMessage( "Kilos  ", "") + GXutil.str( A203BarPieKil, 9, 2) + GXutil.newLine( ) ;
            AV27Inc_obs += httpContext.getMessage( "Estado ", "") + GXutil.str( A201BarPieEst, 1, 0) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV32Pgmname, AV24UsurCod, AV25Station, AV27Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(4);
      }
      else if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "UPD", "")) == 0 )
      {
         /* Using cursor P01929 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A205BarPieMet = P01929_A205BarPieMet[0] ;
            A1501BarPiePie = P01929_A1501BarPiePie[0] ;
            A1691BarPieAnc = P01929_A1691BarPieAnc[0] ;
            n1691BarPieAnc = P01929_n1691BarPieAnc[0] ;
            A203BarPieKil = P01929_A203BarPieKil[0] ;
            A201BarPieEst = P01929_A201BarPieEst[0] ;
            A205BarPieMet = AV18Mts ;
            A1501BarPiePie = AV19Pzas ;
            A1691BarPieAnc = AV16BarPieAnc ;
            n1691BarPieAnc = false ;
            if ( GXutil.strcmp(AV21BarUniMed, httpContext.getMessage( "K", "")) == 0 )
            {
               A203BarPieKil = AV17Kilos ;
            }
            else
            {
               if ( AV23Er == 0 )
               {
                  A203BarPieKil = A205BarPieMet.multiply(DecimalUtil.doubleToDec(AV20BarPes)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
               }
               else
               {
                  A203BarPieKil = AV17Kilos ;
               }
            }
            AV27Inc_obs = httpContext.getMessage( "UPD BARPIE.", "") + GXutil.newLine( ) ;
            AV27Inc_obs += httpContext.getMessage( "Pieza ", "") + A200BarPieCod + GXutil.newLine( ) ;
            AV27Inc_obs += httpContext.getMessage( "Metros ", "") + GXutil.str( A205BarPieMet, 9, 2) + GXutil.newLine( ) ;
            AV27Inc_obs += httpContext.getMessage( "Kilos  ", "") + GXutil.str( A203BarPieKil, 9, 2) + GXutil.newLine( ) ;
            AV27Inc_obs += httpContext.getMessage( "Estado ", "") + GXutil.str( A201BarPieEst, 1, 0) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV32Pgmname, AV24UsurCod, AV25Station, AV27Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
            /* Using cursor P019210 */
            pr_default.execute(8, new Object[] {A205BarPieMet, Integer.valueOf(A1501BarPiePie), Boolean.valueOf(n1691BarPieAnc), Short.valueOf(A1691BarPieAnc), A203BarPieKil, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(7);
      }
      else
      {
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = paltpi2.this.A396EmprCod;
      this.aP1[0] = paltpi2.this.A129BarCod;
      this.aP2[0] = paltpi2.this.A132BarCodReo;
      this.aP3[0] = paltpi2.this.A130BarCodPar;
      this.aP4[0] = paltpi2.this.AV14AlbRecCod;
      this.aP5[0] = paltpi2.this.A200BarPieCod;
      this.aP6[0] = paltpi2.this.AV15BarPieLoc;
      this.aP7[0] = paltpi2.this.AV16BarPieAnc;
      this.aP8[0] = paltpi2.this.AV19Pzas;
      this.aP9[0] = paltpi2.this.AV18Mts;
      this.aP10[0] = paltpi2.this.AV17Kilos;
      this.aP11[0] = paltpi2.this.Gx_mode;
      Application.commitDataStores(context, remoteHandle, pr_default, "paltpi2");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      AV24UsurCod = "" ;
      AV25Station = "" ;
      GXv_char3 = new String[1] ;
      AV26EmprNom = "" ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      scmdbuf = "" ;
      P01922_A396EmprCod = new String[] {""} ;
      P01922_A129BarCod = new int[1] ;
      P01922_A132BarCodReo = new byte[1] ;
      P01922_A130BarCodPar = new String[] {""} ;
      P01922_A864BarPes = new short[1] ;
      P01922_A228BarUniMed = new String[] {""} ;
      A228BarUniMed = "" ;
      AV21BarUniMed = "" ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A2186BarPieLoc = "" ;
      AV27Inc_obs = "" ;
      AV32Pgmname = "" ;
      Gx_emsg = "" ;
      P01924_A396EmprCod = new String[] {""} ;
      P01924_A129BarCod = new int[1] ;
      P01924_A132BarCodReo = new byte[1] ;
      P01924_A130BarCodPar = new String[] {""} ;
      P01924_A200BarPieCod = new String[] {""} ;
      P01924_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01924_A1501BarPiePie = new int[1] ;
      P01924_A1691BarPieAnc = new short[1] ;
      P01924_n1691BarPieAnc = new boolean[] {false} ;
      P01924_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01924_A201BarPieEst = new byte[1] ;
      P01926_A396EmprCod = new String[] {""} ;
      P01926_A129BarCod = new int[1] ;
      P01926_A132BarCodReo = new byte[1] ;
      P01926_A130BarCodPar = new String[] {""} ;
      P01926_A200BarPieCod = new String[] {""} ;
      P01926_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01926_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01926_A201BarPieEst = new byte[1] ;
      P01929_A396EmprCod = new String[] {""} ;
      P01929_A129BarCod = new int[1] ;
      P01929_A132BarCodReo = new byte[1] ;
      P01929_A130BarCodPar = new String[] {""} ;
      P01929_A200BarPieCod = new String[] {""} ;
      P01929_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01929_A1501BarPiePie = new int[1] ;
      P01929_A1691BarPieAnc = new short[1] ;
      P01929_n1691BarPieAnc = new boolean[] {false} ;
      P01929_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01929_A201BarPieEst = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.paltpi2__default(),
         new Object[] {
             new Object[] {
            P01922_A396EmprCod, P01922_A129BarCod, P01922_A132BarCodReo, P01922_A130BarCodPar, P01922_A864BarPes, P01922_A228BarUniMed
            }
            , new Object[] {
            }
            , new Object[] {
            P01924_A396EmprCod, P01924_A129BarCod, P01924_A132BarCodReo, P01924_A130BarCodPar, P01924_A200BarPieCod, P01924_A205BarPieMet, P01924_A1501BarPiePie, P01924_A1691BarPieAnc, P01924_n1691BarPieAnc, P01924_A203BarPieKil,
            P01924_A201BarPieEst
            }
            , new Object[] {
            }
            , new Object[] {
            P01926_A396EmprCod, P01926_A129BarCod, P01926_A132BarCodReo, P01926_A130BarCodPar, P01926_A200BarPieCod, P01926_A205BarPieMet, P01926_A203BarPieKil, P01926_A201BarPieEst
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01929_A396EmprCod, P01929_A129BarCod, P01929_A132BarCodReo, P01929_A130BarCodPar, P01929_A200BarPieCod, P01929_A205BarPieMet, P01929_A1501BarPiePie, P01929_A1691BarPieAnc, P01929_n1691BarPieAnc, P01929_A203BarPieKil,
            P01929_A201BarPieEst
            }
            , new Object[] {
            }
         }
      );
      AV32Pgmname = "PALTPI2" ;
      /* GeneXus formulas. */
      AV32Pgmname = "PALTPI2" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV22Artextil ;
   private byte AV23Er ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A201BarPieEst ;
   private short AV16BarPieAnc ;
   private short AV19Pzas ;
   private short A864BarPes ;
   private short AV20BarPes ;
   private short A1691BarPieAnc ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV14AlbRecCod ;
   private int GX_INS18 ;
   private int A44AlbRecCod ;
   private int A1501BarPiePie ;
   private java.math.BigDecimal AV18Mts ;
   private java.math.BigDecimal AV17Kilos ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A200BarPieCod ;
   private String AV15BarPieLoc ;
   private String Gx_mode ;
   private String AV24UsurCod ;
   private String AV25Station ;
   private String GXv_char3[] ;
   private String AV26EmprNom ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String scmdbuf ;
   private String A228BarUniMed ;
   private String AV21BarUniMed ;
   private String A2186BarPieLoc ;
   private String AV32Pgmname ;
   private String Gx_emsg ;
   private boolean n2186BarPieLoc ;
   private boolean n1691BarPieAnc ;
   private String AV27Inc_obs ;
   private String[] aP11 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private short[] aP7 ;
   private short[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private java.math.BigDecimal[] aP10 ;
   private IDataStoreProvider pr_default ;
   private String[] P01922_A396EmprCod ;
   private int[] P01922_A129BarCod ;
   private byte[] P01922_A132BarCodReo ;
   private String[] P01922_A130BarCodPar ;
   private short[] P01922_A864BarPes ;
   private String[] P01922_A228BarUniMed ;
   private String[] P01924_A396EmprCod ;
   private int[] P01924_A129BarCod ;
   private byte[] P01924_A132BarCodReo ;
   private String[] P01924_A130BarCodPar ;
   private String[] P01924_A200BarPieCod ;
   private java.math.BigDecimal[] P01924_A205BarPieMet ;
   private int[] P01924_A1501BarPiePie ;
   private short[] P01924_A1691BarPieAnc ;
   private boolean[] P01924_n1691BarPieAnc ;
   private java.math.BigDecimal[] P01924_A203BarPieKil ;
   private byte[] P01924_A201BarPieEst ;
   private String[] P01926_A396EmprCod ;
   private int[] P01926_A129BarCod ;
   private byte[] P01926_A132BarCodReo ;
   private String[] P01926_A130BarCodPar ;
   private String[] P01926_A200BarPieCod ;
   private java.math.BigDecimal[] P01926_A205BarPieMet ;
   private java.math.BigDecimal[] P01926_A203BarPieKil ;
   private byte[] P01926_A201BarPieEst ;
   private String[] P01929_A396EmprCod ;
   private int[] P01929_A129BarCod ;
   private byte[] P01929_A132BarCodReo ;
   private String[] P01929_A130BarCodPar ;
   private String[] P01929_A200BarPieCod ;
   private java.math.BigDecimal[] P01929_A205BarPieMet ;
   private int[] P01929_A1501BarPiePie ;
   private short[] P01929_A1691BarPieAnc ;
   private boolean[] P01929_n1691BarPieAnc ;
   private java.math.BigDecimal[] P01929_A203BarPieKil ;
   private byte[] P01929_A201BarPieEst ;
}

final  class paltpi2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01922", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPes, BarUniMed FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01923", "INSERT INTO TXPBARPIE(EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbRecCod, BarPieKil, BarPieMet, BarPieEst, BarPiePie, BarPieAnc, BarPieLoc, BarKilLan, BarMetLan, BarPConTro, PieOriCod, BarPieLzd, BarKgsAut, BarMtsAut, BarPieAut, BarPieImp, BarPieIdPz, BapieObs, CodBarPz, PzaB80, BarPieK1, BarPieK2, BarPz1, BarPz2, BarNPes, BarPieAncc, BarPiePda, BarPieObs, BarTara, BarUniB, BarPieOrd, BarPieCLd, BarPieFdv, BarPieUsu, BarPieFep, BarPieUltD, BarPieColD, BarPieColN, BarPieArtI, BarPieArtD, BarPieCliI, BarPieCliN, BarPieCoCI, BarPieCoCN, BarPieEncC, BarPieTono, BarPieSecu, BarPieOpe, BarPieDest, BarPieEmp, BarPieLote, BarPieST, BarPieTurn, BarPieMq, BarPieVtx) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, ' ', ' ', 0, ' ', ' ', 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new ForEachCursor("P01924", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarPieMet, BarPiePie, BarPieAnc, BarPieKil, BarPieEst FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01925", "UPDATE TXPBARPIE SET BarPieMet=?, BarPiePie=?, BarPieAnc=?, BarPieKil=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new ForEachCursor("P01926", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarPieMet, BarPieKil, BarPieEst FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01927", "DELETE FROM TXPBARTRO  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARTRO")
         ,new UpdateCursor("P01928", "DELETE FROM TXPBARPIE  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new ForEachCursor("P01929", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarPieMet, BarPiePie, BarPieAnc, BarPieKil, BarPieEst FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P019210", "UPDATE TXPBARPIE SET BarPieMet=?, BarPiePie=?, BarPieAnc=?, BarPieKil=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
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
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[13], 10);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 3 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               stmt.setString(5, (String)parms[5], 3);
               stmt.setInt(6, ((Number) parms[6]).intValue());
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               stmt.setString(8, (String)parms[8], 1);
               stmt.setString(9, (String)parms[9], 9);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 8 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               stmt.setString(5, (String)parms[5], 3);
               stmt.setInt(6, ((Number) parms[6]).intValue());
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               stmt.setString(8, (String)parms[8], 1);
               stmt.setString(9, (String)parms[9], 9);
               return;
      }
   }

}

