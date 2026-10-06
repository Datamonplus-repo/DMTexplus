package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdelaln extends GXProcedure
{
   public pdelaln( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdelaln.class ), "" );
   }

   public pdelaln( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           long[] aP1 )
   {
      pdelaln.this.aP2 = new byte[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        byte[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             byte[] aP2 )
   {
      pdelaln.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdelaln.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pdelaln.this.AV15Tipo = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV17HueAlb ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HUEALB", ""), GXv_int1) ;
      pdelaln.this.AV17HueAlb = GXv_int1[0] ;
      GXv_int1[0] = AV18F_albanu ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ALBANU", ""), GXv_int1) ;
      pdelaln.this.AV18F_albanu = GXv_int1[0] ;
      GXt_int2 = AV19Induyco ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "INDUYC", ""), GXv_int1) ;
      pdelaln.this.GXt_int2 = GXv_int1[0] ;
      AV19Induyco = GXt_int2 ;
      GXv_int1[0] = AV25Calvet ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CALVET", ""), GXv_int1) ;
      pdelaln.this.AV25Calvet = GXv_int1[0] ;
      GXt_int2 = AV26Firmad ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int1) ;
      pdelaln.this.GXt_int2 = GXv_int1[0] ;
      AV26Firmad = GXt_int2 ;
      GXt_int2 = AV31Tintex ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINTEX", ""), GXv_int1) ;
      pdelaln.this.GXt_int2 = GXv_int1[0] ;
      AV31Tintex = GXt_int2 ;
      GXt_int2 = AV32Tintutex ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINTUT", ""), GXv_int1) ;
      pdelaln.this.GXt_int2 = GXv_int1[0] ;
      AV32Tintutex = GXt_int2 ;
      if ( AV26Firmad == 1 )
      {
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = A30AlbProCod ;
         GXv_int1[0] = AV15Tipo ;
         new app.pdeldoc2(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int1) ;
         pdelaln.this.A396EmprCod = GXv_char3[0] ;
         pdelaln.this.A30AlbProCod = GXv_int4[0] ;
         pdelaln.this.AV15Tipo = GXv_int1[0] ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV27Station = context.getWorkstationId( remoteHandle) ;
      GXv_char3[0] = A396EmprCod ;
      GXv_char5[0] = AV29EmprNom ;
      GXv_char6[0] = AV28Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV27Station, GXv_char3, GXv_char5, GXv_char6) ;
      pdelaln.this.A396EmprCod = GXv_char3[0] ;
      pdelaln.this.AV29EmprNom = GXv_char5[0] ;
      pdelaln.this.AV28Usurcod = GXv_char6[0] ;
      /* Using cursor P008L2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A39AlbProPri = P008L2_A39AlbProPri[0] ;
         A5140AlbMarca = P008L2_A5140AlbMarca[0] ;
         AV20AlbProCod = A30AlbProCod ;
         AV23AlbProPri = A39AlbProPri ;
         /* Using cursor P008L3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1265BarAlbPie = P008L3_A1265BarAlbPie[0] ;
            A129BarCod = P008L3_A129BarCod[0] ;
            A132BarCodReo = P008L3_A132BarCodReo[0] ;
            A130BarCodPar = P008L3_A130BarCodPar[0] ;
            GXv_char6[0] = A396EmprCod ;
            GXv_int4[0] = A30AlbProCod ;
            GXv_int7[0] = A129BarCod ;
            GXv_int1[0] = A132BarCodReo ;
            GXv_char5[0] = A130BarCodPar ;
            GXv_int8[0] = AV15Tipo ;
            new app.pelihoj(remoteHandle, context).execute( GXv_char6, GXv_int4, GXv_int7, GXv_int1, GXv_char5, GXv_int8) ;
            pdelaln.this.A396EmprCod = GXv_char6[0] ;
            pdelaln.this.A30AlbProCod = GXv_int4[0] ;
            pdelaln.this.A129BarCod = GXv_int7[0] ;
            pdelaln.this.A132BarCodReo = GXv_int1[0] ;
            pdelaln.this.A130BarCodPar = GXv_char5[0] ;
            pdelaln.this.AV15Tipo = GXv_int8[0] ;
            if ( AV31Tintex == 1 )
            {
               GXv_char6[0] = A396EmprCod ;
               GXv_int7[0] = A129BarCod ;
               GXv_int8[0] = A132BarCodReo ;
               GXv_char5[0] = A130BarCodPar ;
               GXv_int4[0] = A30AlbProCod ;
               new app.prcnc90(remoteHandle, context).execute( GXv_char6, GXv_int7, GXv_int8, GXv_char5, GXv_int4) ;
               pdelaln.this.A396EmprCod = GXv_char6[0] ;
               pdelaln.this.A129BarCod = GXv_int7[0] ;
               pdelaln.this.A132BarCodReo = GXv_int8[0] ;
               pdelaln.this.A130BarCodPar = GXv_char5[0] ;
               pdelaln.this.A30AlbProCod = GXv_int4[0] ;
            }
            if ( AV19Induyco == 1 )
            {
               GXv_char6[0] = A396EmprCod ;
               GXv_int7[0] = A129BarCod ;
               GXv_int8[0] = A132BarCodReo ;
               GXv_char5[0] = A130BarCodPar ;
               new app.palbind6(remoteHandle, context).execute( GXv_char6, GXv_int7, GXv_int8, GXv_char5) ;
               pdelaln.this.A396EmprCod = GXv_char6[0] ;
               pdelaln.this.A129BarCod = GXv_int7[0] ;
               pdelaln.this.A132BarCodReo = GXv_int8[0] ;
               pdelaln.this.A130BarCodPar = GXv_char5[0] ;
            }
            Gx_msg = httpContext.getMessage( "Procesando Hdr ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
            System.out.println( Gx_msg );
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor P008L4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A916AlbPObs = P008L4_A916AlbPObs[0] ;
            A915AlbPObsLin = P008L4_A915AlbPObsLin[0] ;
            /* Using cursor P008L5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Byte.valueOf(A915AlbPObsLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSALB");
            Gx_msg = httpContext.getMessage( "delete Observaciones ", "") ;
            System.out.println( Gx_msg );
            pr_default.readNext(2);
         }
         pr_default.close(2);
         /* Using cursor P008L6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A27AlbPKilEnt = P008L6_A27AlbPKilEnt[0] ;
            A129BarCod = P008L6_A129BarCod[0] ;
            A132BarCodReo = P008L6_A132BarCodReo[0] ;
            A130BarCodPar = P008L6_A130BarCodPar[0] ;
            A200BarPieCod = P008L6_A200BarPieCod[0] ;
            /* Using cursor P008L7 */
            pr_default.execute(5, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALPRD");
            Gx_msg = httpContext.getMessage( "delete Piezas ", "") ;
            System.out.println( Gx_msg );
            pr_default.readNext(4);
         }
         pr_default.close(4);
         /* Using cursor P008L8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A6623AlbHdRKgi = P008L8_A6623AlbHdRKgi[0] ;
            n6623AlbHdRKgi = P008L8_n6623AlbHdRKgi[0] ;
            A129BarCod = P008L8_A129BarCod[0] ;
            A132BarCodReo = P008L8_A132BarCodReo[0] ;
            A130BarCodPar = P008L8_A130BarCodPar[0] ;
            A6622AlbHdRLn = P008L8_A6622AlbHdRLn[0] ;
            /* Using cursor P008L9 */
            pr_default.execute(7, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A6622AlbHdRLn)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREP");
            Gx_msg = httpContext.getMessage( "delete XX ", "") ;
            System.out.println( Gx_msg );
            pr_default.readNext(6);
         }
         pr_default.close(6);
         /* Using cursor P008L10 */
         pr_default.execute(8, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A7540Alb_NFisca = P008L10_A7540Alb_NFisca[0] ;
            /* Using cursor P008L11 */
            pr_default.execute(9, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), A7540Alb_NFisca});
            while ( (pr_default.getStatus(9) != 101) )
            {
               A7541Alb_Artigo = P008L11_A7541Alb_Artigo[0] ;
               /* Using cursor P008L12 */
               pr_default.execute(10, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), A7540Alb_NFisca, A7541Alb_Artigo});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLNOTRE");
               Gx_msg = httpContext.getMessage( "delete YY ", "") ;
               System.out.println( Gx_msg );
               pr_default.readNext(9);
            }
            pr_default.close(9);
            /* Using cursor P008L13 */
            pr_default.execute(11, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), A7540Alb_NFisca});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCNOTRE");
            Gx_msg = httpContext.getMessage( "delete TT ", "") ;
            System.out.println( Gx_msg );
            pr_default.readNext(8);
         }
         pr_default.close(8);
         if ( AV25Calvet == 1 )
         {
            /* Optimized DELETE. */
            /* Using cursor P008L14 */
            pr_default.execute(12, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMETCAL");
            /* End optimized DELETE. */
         }
         if ( AV17HueAlb == 1 )
         {
            /* Execute user subroutine: 'CTRL_NUMERO' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         if ( ( ( AV18F_albanu == 1 ) ) || ( ( AV26Firmad == 1 ) ) || ( ( AV32Tintutex == 1 ) ) )
         {
            A5140AlbMarca = httpContext.getMessage( "A", "") ;
            AV30Texto_ii = httpContext.getMessage( "PDELALN-ALBARAN COMO ANULADO", "") + GXutil.newLine( ) + httpContext.getMessage( "Albaran=", "") + GXutil.str( A30AlbProCod, 10, 0) + GXutil.newLine( ) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV44Pgmname, AV28Usurcod, AV27Station, AV30Texto_ii, (int)(A30AlbProCod), (byte)(0), "") ;
         }
         else
         {
            AV30Texto_ii = httpContext.getMessage( "PDELALN-ALBARAN ELIMINADO", "") + GXutil.newLine( ) + httpContext.getMessage( "Albaran=", "") + GXutil.str( A30AlbProCod, 10, 0) + GXutil.newLine( ) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV44Pgmname, AV28Usurcod, AV27Station, AV30Texto_ii, (int)(A30AlbProCod), (byte)(0), "") ;
            /* Using cursor P008L15 */
            pr_default.execute(13, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
         }
         /* Using cursor P008L16 */
         pr_default.execute(14, new Object[] {A5140AlbMarca, A396EmprCod, Long.valueOf(A30AlbProCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'CTRL_NUMERO' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV23AlbProPri, "0") == 0 )
      {
         AV16ContCod = "555555" ;
      }
      if ( GXutil.strcmp(AV23AlbProPri, "1") == 0 )
      {
         AV16ContCod = "666666" ;
      }
      AV21Dif_alb = 0 ;
      /* Using cursor P008L17 */
      pr_default.execute(15, new Object[] {A396EmprCod, AV16ContCod});
      while ( (pr_default.getStatus(15) != 101) )
      {
         A313ContCod = P008L17_A313ContCod[0] ;
         A316ContVal = P008L17_A316ContVal[0] ;
         AV21Dif_alb = (int)(A316ContVal-AV20AlbProCod) ;
         AV22ContVal = A316ContVal ;
         AV22ContVal = (int)(AV20AlbProCod-1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(15);
      AV24ExiAlb = (byte)(0) ;
      /* Using cursor P008L18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(AV22ContVal), AV23AlbProPri});
      while ( (pr_default.getStatus(16) != 101) )
      {
         A39AlbProPri = P008L18_A39AlbProPri[0] ;
         AV24ExiAlb = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(16);
      if ( AV24ExiAlb == 1 )
      {
         /* Optimized UPDATE. */
         /* Using cursor P008L19 */
         pr_default.execute(17, new Object[] {Long.valueOf(AV20AlbProCod), A396EmprCod, AV16ContCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPLIN");
         /* End optimized UPDATE. */
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdelaln.this.A396EmprCod;
      this.aP1[0] = pdelaln.this.A30AlbProCod;
      this.aP2[0] = pdelaln.this.AV15Tipo;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdelaln");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV27Station = "" ;
      GXv_char3 = new String[1] ;
      AV29EmprNom = "" ;
      AV28Usurcod = "" ;
      scmdbuf = "" ;
      P008L2_A396EmprCod = new String[] {""} ;
      P008L2_A30AlbProCod = new long[1] ;
      P008L2_A39AlbProPri = new String[] {""} ;
      P008L2_A5140AlbMarca = new String[] {""} ;
      A39AlbProPri = "" ;
      A5140AlbMarca = "" ;
      AV23AlbProPri = "" ;
      P008L3_A396EmprCod = new String[] {""} ;
      P008L3_A30AlbProCod = new long[1] ;
      P008L3_A1265BarAlbPie = new int[1] ;
      P008L3_A129BarCod = new int[1] ;
      P008L3_A132BarCodReo = new byte[1] ;
      P008L3_A130BarCodPar = new String[] {""} ;
      A130BarCodPar = "" ;
      GXv_int1 = new byte[1] ;
      GXv_int4 = new long[1] ;
      GXv_char6 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int8 = new byte[1] ;
      GXv_char5 = new String[1] ;
      Gx_msg = "" ;
      P008L4_A396EmprCod = new String[] {""} ;
      P008L4_A30AlbProCod = new long[1] ;
      P008L4_A916AlbPObs = new String[] {""} ;
      P008L4_A915AlbPObsLin = new byte[1] ;
      A916AlbPObs = "" ;
      P008L6_A396EmprCod = new String[] {""} ;
      P008L6_A30AlbProCod = new long[1] ;
      P008L6_A27AlbPKilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008L6_A129BarCod = new int[1] ;
      P008L6_A132BarCodReo = new byte[1] ;
      P008L6_A130BarCodPar = new String[] {""} ;
      P008L6_A200BarPieCod = new String[] {""} ;
      A27AlbPKilEnt = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      P008L8_A396EmprCod = new String[] {""} ;
      P008L8_A30AlbProCod = new long[1] ;
      P008L8_A6623AlbHdRKgi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008L8_n6623AlbHdRKgi = new boolean[] {false} ;
      P008L8_A129BarCod = new int[1] ;
      P008L8_A132BarCodReo = new byte[1] ;
      P008L8_A130BarCodPar = new String[] {""} ;
      P008L8_A6622AlbHdRLn = new short[1] ;
      A6623AlbHdRKgi = DecimalUtil.ZERO ;
      P008L10_A396EmprCod = new String[] {""} ;
      P008L10_A30AlbProCod = new long[1] ;
      P008L10_A7540Alb_NFisca = new String[] {""} ;
      A7540Alb_NFisca = "" ;
      P008L11_A396EmprCod = new String[] {""} ;
      P008L11_A30AlbProCod = new long[1] ;
      P008L11_A7540Alb_NFisca = new String[] {""} ;
      P008L11_A7541Alb_Artigo = new String[] {""} ;
      A7541Alb_Artigo = "" ;
      AV30Texto_ii = "" ;
      AV44Pgmname = "" ;
      AV16ContCod = "" ;
      P008L17_A396EmprCod = new String[] {""} ;
      P008L17_A313ContCod = new String[] {""} ;
      P008L17_A316ContVal = new int[1] ;
      A313ContCod = "" ;
      P008L18_A396EmprCod = new String[] {""} ;
      P008L18_A39AlbProPri = new String[] {""} ;
      P008L18_A30AlbProCod = new long[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdelaln__default(),
         new Object[] {
             new Object[] {
            P008L2_A396EmprCod, P008L2_A30AlbProCod, P008L2_A39AlbProPri, P008L2_A5140AlbMarca
            }
            , new Object[] {
            P008L3_A396EmprCod, P008L3_A30AlbProCod, P008L3_A1265BarAlbPie, P008L3_A129BarCod, P008L3_A132BarCodReo, P008L3_A130BarCodPar
            }
            , new Object[] {
            P008L4_A396EmprCod, P008L4_A30AlbProCod, P008L4_A916AlbPObs, P008L4_A915AlbPObsLin
            }
            , new Object[] {
            }
            , new Object[] {
            P008L6_A396EmprCod, P008L6_A30AlbProCod, P008L6_A27AlbPKilEnt, P008L6_A129BarCod, P008L6_A132BarCodReo, P008L6_A130BarCodPar, P008L6_A200BarPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            P008L8_A396EmprCod, P008L8_A30AlbProCod, P008L8_A6623AlbHdRKgi, P008L8_n6623AlbHdRKgi, P008L8_A129BarCod, P008L8_A132BarCodReo, P008L8_A130BarCodPar, P008L8_A6622AlbHdRLn
            }
            , new Object[] {
            }
            , new Object[] {
            P008L10_A396EmprCod, P008L10_A30AlbProCod, P008L10_A7540Alb_NFisca
            }
            , new Object[] {
            P008L11_A396EmprCod, P008L11_A30AlbProCod, P008L11_A7540Alb_NFisca, P008L11_A7541Alb_Artigo
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
            }
            , new Object[] {
            P008L17_A396EmprCod, P008L17_A313ContCod, P008L17_A316ContVal
            }
            , new Object[] {
            P008L18_A396EmprCod, P008L18_A39AlbProPri, P008L18_A30AlbProCod
            }
            , new Object[] {
            }
         }
      );
      AV44Pgmname = "PDELALN" ;
      /* GeneXus formulas. */
      AV44Pgmname = "PDELALN" ;
      Gx_err = (short)(0) ;
   }

   private byte AV15Tipo ;
   private byte AV17HueAlb ;
   private byte AV18F_albanu ;
   private byte AV19Induyco ;
   private byte AV25Calvet ;
   private byte AV26Firmad ;
   private byte AV31Tintex ;
   private byte AV32Tintutex ;
   private byte GXt_int2 ;
   private byte A132BarCodReo ;
   private byte GXv_int1[] ;
   private byte GXv_int8[] ;
   private byte A915AlbPObsLin ;
   private byte AV24ExiAlb ;
   private short A6622AlbHdRLn ;
   private short Gx_err ;
   private int A1265BarAlbPie ;
   private int A129BarCod ;
   private int GXv_int7[] ;
   private int AV21Dif_alb ;
   private int A316ContVal ;
   private int AV22ContVal ;
   private long A30AlbProCod ;
   private long AV20AlbProCod ;
   private long GXv_int4[] ;
   private java.math.BigDecimal A27AlbPKilEnt ;
   private java.math.BigDecimal A6623AlbHdRKgi ;
   private String A396EmprCod ;
   private String AV27Station ;
   private String GXv_char3[] ;
   private String AV29EmprNom ;
   private String AV28Usurcod ;
   private String scmdbuf ;
   private String A39AlbProPri ;
   private String A5140AlbMarca ;
   private String AV23AlbProPri ;
   private String A130BarCodPar ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String Gx_msg ;
   private String A916AlbPObs ;
   private String A200BarPieCod ;
   private String A7540Alb_NFisca ;
   private String A7541Alb_Artigo ;
   private String AV44Pgmname ;
   private String AV16ContCod ;
   private String A313ContCod ;
   private boolean returnInSub ;
   private boolean n6623AlbHdRKgi ;
   private String AV30Texto_ii ;
   private byte[] aP2 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P008L2_A396EmprCod ;
   private long[] P008L2_A30AlbProCod ;
   private String[] P008L2_A39AlbProPri ;
   private String[] P008L2_A5140AlbMarca ;
   private String[] P008L3_A396EmprCod ;
   private long[] P008L3_A30AlbProCod ;
   private int[] P008L3_A1265BarAlbPie ;
   private int[] P008L3_A129BarCod ;
   private byte[] P008L3_A132BarCodReo ;
   private String[] P008L3_A130BarCodPar ;
   private String[] P008L4_A396EmprCod ;
   private long[] P008L4_A30AlbProCod ;
   private String[] P008L4_A916AlbPObs ;
   private byte[] P008L4_A915AlbPObsLin ;
   private String[] P008L6_A396EmprCod ;
   private long[] P008L6_A30AlbProCod ;
   private java.math.BigDecimal[] P008L6_A27AlbPKilEnt ;
   private int[] P008L6_A129BarCod ;
   private byte[] P008L6_A132BarCodReo ;
   private String[] P008L6_A130BarCodPar ;
   private String[] P008L6_A200BarPieCod ;
   private String[] P008L8_A396EmprCod ;
   private long[] P008L8_A30AlbProCod ;
   private java.math.BigDecimal[] P008L8_A6623AlbHdRKgi ;
   private boolean[] P008L8_n6623AlbHdRKgi ;
   private int[] P008L8_A129BarCod ;
   private byte[] P008L8_A132BarCodReo ;
   private String[] P008L8_A130BarCodPar ;
   private short[] P008L8_A6622AlbHdRLn ;
   private String[] P008L10_A396EmprCod ;
   private long[] P008L10_A30AlbProCod ;
   private String[] P008L10_A7540Alb_NFisca ;
   private String[] P008L11_A396EmprCod ;
   private long[] P008L11_A30AlbProCod ;
   private String[] P008L11_A7540Alb_NFisca ;
   private String[] P008L11_A7541Alb_Artigo ;
   private String[] P008L17_A396EmprCod ;
   private String[] P008L17_A313ContCod ;
   private int[] P008L17_A316ContVal ;
   private String[] P008L18_A396EmprCod ;
   private String[] P008L18_A39AlbProPri ;
   private long[] P008L18_A30AlbProCod ;
}

final  class pdelaln__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P008L2", "SELECT EmprCod, AlbProCod, AlbProPri, AlbMarca FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P008L3", "SELECT EmprCod, AlbProCod, BarAlbPie, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P008L4", "SELECT EmprCod, AlbProCod, AlbPObs, AlbPObsLin FROM TXPOBSALB WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P008L5", "DELETE FROM TXPOBSALB  WHERE EmprCod = ? AND AlbProCod = ? AND AlbPObsLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOBSALB")
         ,new ForEachCursor("P008L6", "SELECT EmprCod, AlbProCod, AlbPKilEnt, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPLALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P008L7", "DELETE FROM TXPLALPRD  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALPRD")
         ,new ForEachCursor("P008L8", "SELECT EmprCod, AlbProCod, AlbHdRKgi, BarCod, BarCodReo, BarCodPar, AlbHdRLn FROM TXPALBREP WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P008L9", "DELETE FROM TXPALBREP  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND AlbHdRLn = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREP")
         ,new ForEachCursor("P008L10", "SELECT EmprCod, AlbProCod, Alb_NFisca FROM TXPCNOTRE WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod, Alb_NFisca ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P008L11", "SELECT EmprCod, AlbProCod, Alb_NFisca, Alb_Artigo FROM TXPLNOTRE WHERE EmprCod = ? and AlbProCod = ? and Alb_NFisca = ? ORDER BY EmprCod, AlbProCod, Alb_NFisca, Alb_Artigo ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P008L12", "DELETE FROM TXPLNOTRE  WHERE EmprCod = ? AND AlbProCod = ? AND Alb_NFisca = ? AND Alb_Artigo = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLNOTRE")
         ,new UpdateCursor("P008L13", "DELETE FROM TXPCNOTRE  WHERE EmprCod = ? AND AlbProCod = ? AND Alb_NFisca = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCNOTRE")
         ,new UpdateCursor("P008L14", "DELETE FROM TXPMETCAL  WHERE EmprCod = ? and AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMETCAL")
         ,new UpdateCursor("P008L15", "DELETE FROM TXPCALPRD  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
         ,new UpdateCursor("P008L16", "UPDATE TXPCALPRD SET AlbMarca=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
         ,new ForEachCursor("P008L17", "SELECT EmprCod, ContCod, ContVal FROM TXPEMPLIN WHERE EmprCod = ? and ContCod = ? ORDER BY EmprCod, ContCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P008L18", "SELECT EmprCod, AlbProPri, AlbProCod FROM TXPCALPRD WHERE (EmprCod = ? and AlbProCod = ?) AND (AlbProPri = ?) ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P008L19", "UPDATE TXPEMPLIN SET ContVal=? - 1  WHERE EmprCod = ? and ContCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPEMPLIN")
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 50);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 9);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((long[]) buf[2])[0] = rslt.getLong(3);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 17 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

