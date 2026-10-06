package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbordih extends GXProcedure
{
   public pbordih( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbordih.class ), "" );
   }

   public pbordih( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      pbordih.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pbordih.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pbordih.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      pbordih.this.AV17BarCodReo = aP2[0];
      this.aP2 = aP2;
      pbordih.this.AV18BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV22msg0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG249_", ""), (byte)(99), GXv_char2) ;
      pbordih.this.GXt_char1 = GXv_char2[0] ;
      AV22msg0 = GXt_char1 ;
      AV21Flag = (byte)(0) ;
      GXt_int3 = AV26CliSKP ;
      GXv_int4[0] = GXt_int3 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "CLISKP", ""), GXv_int4) ;
      pbordih.this.GXt_int3 = GXv_int4[0] ;
      AV26CliSKP = GXt_int3 ;
      if ( AV26CliSKP == 1 )
      {
         GXt_char1 = AV27Car6 ;
         GXv_char2[0] = AV15EmprCod ;
         GXv_char5[0] = httpContext.getMessage( "CLISKP", "") ;
         GXv_char6[0] = GXt_char1 ;
         new app.pbusdsc(remoteHandle, context).execute( GXv_char2, GXv_char5, GXv_char6) ;
         pbordih.this.AV15EmprCod = GXv_char2[0] ;
         pbordih.this.GXt_char1 = GXv_char6[0] ;
         AV27Car6 = GXutil.trim( GXt_char1) ;
         AV28cliPropio = (int)(GXutil.lval( AV27Car6)) ;
      }
      AV24FlagBros = (byte)(0) ;
      GXv_int4[0] = AV24FlagBros ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "BROS", ""), GXv_int4) ;
      pbordih.this.AV24FlagBros = GXv_int4[0] ;
      AV29Pervaf = (byte)(0) ;
      GXv_int4[0] = AV29Pervaf ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "PERVAF", ""), GXv_int4) ;
      pbordih.this.AV29Pervaf = GXv_int4[0] ;
      /* Using cursor P006K3 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P006K3_A130BarCodPar[0] ;
         A132BarCodReo = P006K3_A132BarCodReo[0] ;
         A129BarCod = P006K3_A129BarCod[0] ;
         A396EmprCod = P006K3_A396EmprCod[0] ;
         A213BarSit = P006K3_A213BarSit[0] ;
         A361DisCod = P006K3_A361DisCod[0] ;
         A1003BarFecLan = P006K3_A1003BarFecLan[0] ;
         n1003BarFecLan = P006K3_n1003BarFecLan[0] ;
         A966PartCod = P006K3_A966PartCod[0] ;
         n966PartCod = P006K3_n966PartCod[0] ;
         A252CliCod = P006K3_A252CliCod[0] ;
         n252CliCod = P006K3_n252CliCod[0] ;
         A4937BarCtrPdas = P006K3_A4937BarCtrPdas[0] ;
         n4937BarCtrPdas = P006K3_n4937BarCtrPdas[0] ;
         A166BarKgm = P006K3_A166BarKgm[0] ;
         A199BarPie1 = P006K3_A199BarPie1[0] ;
         A365DisDes = P006K3_A365DisDes[0] ;
         A898BarPieNDes = P006K3_A898BarPieNDes[0] ;
         A166BarKgm = P006K3_A166BarKgm[0] ;
         A199BarPie1 = P006K3_A199BarPie1[0] ;
         A898BarPieNDes = P006K3_A898BarPieNDes[0] ;
         A966PartCod = P006K3_A966PartCod[0] ;
         n966PartCod = P006K3_n966PartCod[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         /* Using cursor P006K4 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A194BarOrdLin = P006K4_A194BarOrdLin[0] ;
            A153BarFasEst = P006K4_A153BarFasEst[0] ;
            A758ProCod = P006K4_A758ProCod[0] ;
            if ( A153BarFasEst == 1 )
            {
               AV21Flag = (byte)(1) ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV21Flag == 0 )
         {
            /* Using cursor P006K5 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A758ProCod = P006K5_A758ProCod[0] ;
               A761ProFasLin = P006K5_A761ProFasLin[0] ;
               n761ProFasLin = P006K5_n761ProFasLin[0] ;
               /* Optimized DELETE. */
               /* Using cursor P006K6 */
               pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
               /* End optimized DELETE. */
               /* Using cursor P006K7 */
               pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPRO");
               pr_default.readNext(2);
            }
            pr_default.close(2);
            /* Optimized DELETE. */
            /* Using cursor P006K8 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARNOT");
            /* End optimized DELETE. */
            /* Optimized DELETE. */
            /* Using cursor P006K9 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
            /* End optimized DELETE. */
            /* Optimized DELETE. */
            /* Using cursor P006K10 */
            pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARENS");
            /* End optimized DELETE. */
            AV23DisCod = A361DisCod ;
            /* Execute user subroutine: 'BORDIS' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( AV24FlagBros == 1 )
            {
               /* Execute user subroutine: 'LANZADO' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            if ( AV29Pervaf == 1 )
            {
               if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A1003BarFecLan)) )
               {
                  System.out.println( httpContext.getMessage( "Atención. Se descuenta Stock Planificado en Ubicaciones", "") );
                  AV31UbiKil = A166BarKgm.multiply(DecimalUtil.doubleToDec((-1))) ;
                  AV32UbiCon = (short)(A198BarPie*(-1)) ;
                  GXv_char6[0] = AV15EmprCod ;
                  GXv_char5[0] = A966PartCod ;
                  GXv_int7[0] = A252CliCod ;
                  GXv_int8[0] = AV16BarCod ;
                  GXv_date9[0] = A1003BarFecLan ;
                  GXv_char2[0] = "999" ;
                  GXv_char10[0] = httpContext.getMessage( "PT", "") ;
                  GXv_char11[0] = httpContext.getMessage( "N", "") ;
                  GXv_decimal12[0] = AV31UbiKil ;
                  GXv_int13[0] = AV32UbiCon ;
                  GXv_decimal14[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_int15[0] = (short)(0) ;
                  GXv_char16[0] = "" ;
                  new app.pubiplt(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_int7, GXv_int8, GXv_date9, GXv_char2, GXv_char10, GXv_char11, GXv_decimal12, GXv_int13, GXv_decimal14, GXv_int15, GXv_char16) ;
                  pbordih.this.AV15EmprCod = GXv_char6[0] ;
                  pbordih.this.A966PartCod = GXv_char5[0] ;
                  pbordih.this.A252CliCod = GXv_int7[0] ;
                  pbordih.this.AV16BarCod = GXv_int8[0] ;
                  pbordih.this.A1003BarFecLan = GXv_date9[0] ;
                  pbordih.this.AV31UbiKil = GXv_decimal12[0] ;
                  pbordih.this.AV32UbiCon = GXv_int13[0] ;
               }
               if ( A4937BarCtrPdas == 1 )
               {
                  System.out.println( httpContext.getMessage( "Atención. Se eliminan movimientos de Salida y descuenta Stock Planificado y Tinte Ok en Ubicaciones", "") );
                  GXv_char16[0] = A396EmprCod ;
                  GXv_char11[0] = A966PartCod ;
                  GXv_int8[0] = A252CliCod ;
                  GXv_int7[0] = AV16BarCod ;
                  GXv_char10[0] = httpContext.getMessage( "S", "") ;
                  GXv_int4[0] = AV33Ok_Baja ;
                  new app.pubibaj(remoteHandle, context).execute( GXv_char16, GXv_char11, GXv_int8, GXv_int7, GXv_char10, GXv_int4) ;
                  pbordih.this.A396EmprCod = GXv_char16[0] ;
                  pbordih.this.A966PartCod = GXv_char11[0] ;
                  pbordih.this.A252CliCod = GXv_int8[0] ;
                  pbordih.this.AV16BarCod = GXv_int7[0] ;
                  pbordih.this.AV33Ok_Baja = GXv_int4[0] ;
               }
            }
            /* Using cursor P006K11 */
            pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         }
         else
         {
            httpContext.GX_msglist.addItem(AV22msg0);
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'BORDIS' Routine */
      returnInSub = false ;
      /* Using cursor P006K12 */
      pr_default.execute(9, new Object[] {AV15EmprCod, Integer.valueOf(AV23DisCod)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A361DisCod = P006K12_A361DisCod[0] ;
         A396EmprCod = P006K12_A396EmprCod[0] ;
         A252CliCod = P006K12_A252CliCod[0] ;
         n252CliCod = P006K12_n252CliCod[0] ;
         A5252DisAcc = P006K12_A5252DisAcc[0] ;
         A966PartCod = P006K12_A966PartCod[0] ;
         n966PartCod = P006K12_n966PartCod[0] ;
         /* Using cursor P006K13 */
         pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(10) != 101) )
         {
            A758ProCod = P006K13_A758ProCod[0] ;
            A846UltFasLin = P006K13_A846UltFasLin[0] ;
            /* Optimized DELETE. */
            /* Using cursor P006K14 */
            pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
            /* End optimized DELETE. */
            /* Using cursor P006K15 */
            pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISLIN");
            pr_default.readNext(10);
         }
         pr_default.close(10);
         /* Optimized DELETE. */
         /* Using cursor P006K16 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSERV");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P006K17 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISDEF");
         /* End optimized DELETE. */
         if ( AV26CliSKP == 0 )
         {
            AV25CliPar = A252CliCod ;
         }
         else
         {
            if ( GXutil.strcmp(A5252DisAcc, httpContext.getMessage( "P", "")) == 0 )
            {
               AV25CliPar = AV28cliPropio ;
            }
            else
            {
               AV25CliPar = A252CliCod ;
            }
         }
         GXv_char16[0] = A396EmprCod ;
         GXv_char11[0] = A966PartCod ;
         GXv_int8[0] = AV25CliPar ;
         GXv_int7[0] = A361DisCod ;
         new app.pcampar(remoteHandle, context).execute( GXv_char16, GXv_char11, GXv_int8, GXv_int7) ;
         pbordih.this.A396EmprCod = GXv_char16[0] ;
         pbordih.this.A966PartCod = GXv_char11[0] ;
         pbordih.this.AV25CliPar = GXv_int8[0] ;
         pbordih.this.A361DisCod = GXv_int7[0] ;
         /* Using cursor P006K18 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
   }

   public void S121( )
   {
      /* 'LANZADO' Routine */
      returnInSub = false ;
      /* Optimized DELETE. */
      /* Using cursor P006K19 */
      pr_default.execute(16, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLKGSLA");
      /* End optimized DELETE. */
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbordih.this.AV15EmprCod;
      this.aP1[0] = pbordih.this.AV16BarCod;
      this.aP2[0] = pbordih.this.AV17BarCodReo;
      this.aP3[0] = pbordih.this.AV18BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pbordih");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV22msg0 = "" ;
      AV27Car6 = "" ;
      GXt_char1 = "" ;
      scmdbuf = "" ;
      P006K3_A130BarCodPar = new String[] {""} ;
      P006K3_A132BarCodReo = new byte[1] ;
      P006K3_A129BarCod = new int[1] ;
      P006K3_A396EmprCod = new String[] {""} ;
      P006K3_A213BarSit = new byte[1] ;
      P006K3_A361DisCod = new int[1] ;
      P006K3_A1003BarFecLan = new java.util.Date[] {GXutil.nullDate()} ;
      P006K3_n1003BarFecLan = new boolean[] {false} ;
      P006K3_A966PartCod = new String[] {""} ;
      P006K3_n966PartCod = new boolean[] {false} ;
      P006K3_A252CliCod = new int[1] ;
      P006K3_n252CliCod = new boolean[] {false} ;
      P006K3_A4937BarCtrPdas = new byte[1] ;
      P006K3_n4937BarCtrPdas = new boolean[] {false} ;
      P006K3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006K3_A199BarPie1 = new short[1] ;
      P006K3_A365DisDes = new String[] {""} ;
      P006K3_A898BarPieNDes = new int[1] ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A1003BarFecLan = GXutil.nullDate() ;
      A966PartCod = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      P006K4_A396EmprCod = new String[] {""} ;
      P006K4_A129BarCod = new int[1] ;
      P006K4_A132BarCodReo = new byte[1] ;
      P006K4_A130BarCodPar = new String[] {""} ;
      P006K4_A194BarOrdLin = new short[1] ;
      P006K4_A153BarFasEst = new byte[1] ;
      P006K4_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      P006K5_A396EmprCod = new String[] {""} ;
      P006K5_A129BarCod = new int[1] ;
      P006K5_A132BarCodReo = new byte[1] ;
      P006K5_A130BarCodPar = new String[] {""} ;
      P006K5_A758ProCod = new String[] {""} ;
      P006K5_A761ProFasLin = new short[1] ;
      P006K5_n761ProFasLin = new boolean[] {false} ;
      AV31UbiKil = DecimalUtil.ZERO ;
      GXv_char6 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_date9 = new java.util.Date[1] ;
      GXv_char2 = new String[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_int13 = new short[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_int15 = new short[1] ;
      GXv_char10 = new String[1] ;
      GXv_int4 = new byte[1] ;
      P006K12_A361DisCod = new int[1] ;
      P006K12_A396EmprCod = new String[] {""} ;
      P006K12_A252CliCod = new int[1] ;
      P006K12_n252CliCod = new boolean[] {false} ;
      P006K12_A5252DisAcc = new String[] {""} ;
      P006K12_A966PartCod = new String[] {""} ;
      P006K12_n966PartCod = new boolean[] {false} ;
      A5252DisAcc = "" ;
      P006K13_A396EmprCod = new String[] {""} ;
      P006K13_A361DisCod = new int[1] ;
      P006K13_A758ProCod = new String[] {""} ;
      P006K13_A846UltFasLin = new short[1] ;
      GXv_char16 = new String[1] ;
      GXv_char11 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_int7 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbordih__default(),
         new Object[] {
             new Object[] {
            P006K3_A130BarCodPar, P006K3_A132BarCodReo, P006K3_A129BarCod, P006K3_A396EmprCod, P006K3_A213BarSit, P006K3_A361DisCod, P006K3_A1003BarFecLan, P006K3_n1003BarFecLan, P006K3_A966PartCod, P006K3_n966PartCod,
            P006K3_A252CliCod, P006K3_n252CliCod, P006K3_A4937BarCtrPdas, P006K3_n4937BarCtrPdas, P006K3_A166BarKgm, P006K3_A199BarPie1, P006K3_A365DisDes, P006K3_A898BarPieNDes
            }
            , new Object[] {
            P006K4_A396EmprCod, P006K4_A129BarCod, P006K4_A132BarCodReo, P006K4_A130BarCodPar, P006K4_A194BarOrdLin, P006K4_A153BarFasEst, P006K4_A758ProCod
            }
            , new Object[] {
            P006K5_A396EmprCod, P006K5_A129BarCod, P006K5_A132BarCodReo, P006K5_A130BarCodPar, P006K5_A758ProCod, P006K5_A761ProFasLin, P006K5_n761ProFasLin
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
            }
            , new Object[] {
            P006K12_A361DisCod, P006K12_A396EmprCod, P006K12_A252CliCod, P006K12_A5252DisAcc, P006K12_A966PartCod, P006K12_n966PartCod
            }
            , new Object[] {
            P006K13_A396EmprCod, P006K13_A361DisCod, P006K13_A758ProCod, P006K13_A846UltFasLin
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
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17BarCodReo ;
   private byte AV21Flag ;
   private byte AV26CliSKP ;
   private byte GXt_int3 ;
   private byte AV24FlagBros ;
   private byte AV29Pervaf ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte A4937BarCtrPdas ;
   private byte A153BarFasEst ;
   private byte AV33Ok_Baja ;
   private byte GXv_int4[] ;
   private short A199BarPie1 ;
   private short A194BarOrdLin ;
   private short A761ProFasLin ;
   private short AV32UbiCon ;
   private short GXv_int13[] ;
   private short GXv_int15[] ;
   private short A846UltFasLin ;
   private short Gx_err ;
   private int AV16BarCod ;
   private int AV28cliPropio ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int AV23DisCod ;
   private int AV25CliPar ;
   private int GXv_int8[] ;
   private int GXv_int7[] ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV31UbiKil ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private String AV15EmprCod ;
   private String AV18BarCodPar ;
   private String AV22msg0 ;
   private String AV27Car6 ;
   private String GXt_char1 ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A966PartCod ;
   private String A365DisDes ;
   private String A758ProCod ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char2[] ;
   private String GXv_char10[] ;
   private String A5252DisAcc ;
   private String GXv_char16[] ;
   private String GXv_char11[] ;
   private java.util.Date A1003BarFecLan ;
   private java.util.Date GXv_date9[] ;
   private boolean n1003BarFecLan ;
   private boolean n966PartCod ;
   private boolean n252CliCod ;
   private boolean n4937BarCtrPdas ;
   private boolean n761ProFasLin ;
   private boolean returnInSub ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P006K3_A130BarCodPar ;
   private byte[] P006K3_A132BarCodReo ;
   private int[] P006K3_A129BarCod ;
   private String[] P006K3_A396EmprCod ;
   private byte[] P006K3_A213BarSit ;
   private int[] P006K3_A361DisCod ;
   private java.util.Date[] P006K3_A1003BarFecLan ;
   private boolean[] P006K3_n1003BarFecLan ;
   private String[] P006K3_A966PartCod ;
   private boolean[] P006K3_n966PartCod ;
   private int[] P006K3_A252CliCod ;
   private boolean[] P006K3_n252CliCod ;
   private byte[] P006K3_A4937BarCtrPdas ;
   private boolean[] P006K3_n4937BarCtrPdas ;
   private java.math.BigDecimal[] P006K3_A166BarKgm ;
   private short[] P006K3_A199BarPie1 ;
   private String[] P006K3_A365DisDes ;
   private int[] P006K3_A898BarPieNDes ;
   private String[] P006K4_A396EmprCod ;
   private int[] P006K4_A129BarCod ;
   private byte[] P006K4_A132BarCodReo ;
   private String[] P006K4_A130BarCodPar ;
   private short[] P006K4_A194BarOrdLin ;
   private byte[] P006K4_A153BarFasEst ;
   private String[] P006K4_A758ProCod ;
   private String[] P006K5_A396EmprCod ;
   private int[] P006K5_A129BarCod ;
   private byte[] P006K5_A132BarCodReo ;
   private String[] P006K5_A130BarCodPar ;
   private String[] P006K5_A758ProCod ;
   private short[] P006K5_A761ProFasLin ;
   private boolean[] P006K5_n761ProFasLin ;
   private int[] P006K12_A361DisCod ;
   private String[] P006K12_A396EmprCod ;
   private int[] P006K12_A252CliCod ;
   private boolean[] P006K12_n252CliCod ;
   private String[] P006K12_A5252DisAcc ;
   private String[] P006K12_A966PartCod ;
   private boolean[] P006K12_n966PartCod ;
   private String[] P006K13_A396EmprCod ;
   private int[] P006K13_A361DisCod ;
   private String[] P006K13_A758ProCod ;
   private short[] P006K13_A846UltFasLin ;
}

final  class pbordih__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P006K3", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.BarSit, T1.DisCod, T1.BarFecLan, T3.PartCod, T1.CliCod, T1.BarCtrPdas, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM ((TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN TXPDISPOS T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P006K4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, BarFasEst, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P006K5", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, ProFasLin FROM TXPBARPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P006K6", "DELETE FROM TXPBARFAS  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new UpdateCursor("P006K7", "DELETE FROM TXPBARPRO  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPRO")
         ,new UpdateCursor("P006K8", "DELETE FROM TXPBARNOT  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARNOT")
         ,new UpdateCursor("P006K9", "DELETE FROM TXPBARPIE  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P006K10", "DELETE FROM TXPBARENS  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARENS")
         ,new UpdateCursor("P006K11", "DELETE FROM TXPBARCAD  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P006K12", "SELECT DisCod, EmprCod, CliCod, DisAcc, PartCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P006K13", "SELECT EmprCod, DisCod, ProCod, UltFasLin FROM TXPDISLIN WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P006K14", "DELETE FROM TXPDISFAS  WHERE EmprCod = ? and DisCod = ? and ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISFAS")
         ,new UpdateCursor("P006K15", "DELETE FROM TXPDISLIN  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISLIN")
         ,new UpdateCursor("P006K16", "DELETE FROM TXPOBSERV  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOBSERV")
         ,new UpdateCursor("P006K17", "DELETE FROM TXPDISDEF  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISDEF")
         ,new UpdateCursor("P006K18", "DELETE FROM TXPDISPOS  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
         ,new UpdateCursor("P006K19", "DELETE FROM TXPLKGSLA  WHERE (EmprCod = ?) AND (LzaBarCod = ?) AND (LzaBarReo = ?) AND (LzaBarPar = ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLKGSLA")
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
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(11,2);
               ((short[]) buf[15])[0] = rslt.getShort(12);
               ((String[]) buf[16])[0] = rslt.getString(13, 1);
               ((int[]) buf[17])[0] = rslt.getInt(14);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 9 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

