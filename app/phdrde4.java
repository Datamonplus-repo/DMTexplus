package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phdrde4 extends GXProcedure
{
   public phdrde4( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phdrde4.class ), "" );
   }

   public phdrde4( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      phdrde4.this.aP3 = new String[] {""};
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
      phdrde4.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      phdrde4.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      phdrde4.this.AV17BarCodReo = aP2[0];
      this.aP2 = aP2;
      phdrde4.this.AV18BarCodPar = aP3[0];
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
      phdrde4.this.GXt_char1 = GXv_char2[0] ;
      AV22msg0 = GXt_char1 ;
      AV21Flag = (byte)(0) ;
      AV32FlagBros = (byte)(0) ;
      GXv_int3[0] = AV32FlagBros ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "BROS", ""), GXv_int3) ;
      phdrde4.this.AV32FlagBros = GXv_int3[0] ;
      AV39Pervaf = (byte)(0) ;
      GXv_int3[0] = AV39Pervaf ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PERVAF", ""), GXv_int3) ;
      phdrde4.this.AV39Pervaf = GXv_int3[0] ;
      GXt_int4 = AV35CliSKP ;
      GXv_int3[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "CLISKP", ""), GXv_int3) ;
      phdrde4.this.GXt_int4 = GXv_int3[0] ;
      AV35CliSKP = GXt_int4 ;
      if ( AV35CliSKP == 1 )
      {
         GXt_char1 = AV36Car6 ;
         GXv_char2[0] = AV15EmprCod ;
         GXv_char5[0] = httpContext.getMessage( "CLISKP", "") ;
         GXv_char6[0] = GXt_char1 ;
         new app.pbusdsc(remoteHandle, context).execute( GXv_char2, GXv_char5, GXv_char6) ;
         phdrde4.this.AV15EmprCod = GXv_char2[0] ;
         phdrde4.this.GXt_char1 = GXv_char6[0] ;
         AV36Car6 = GXutil.trim( GXt_char1) ;
         AV37CliProPio = (int)(GXutil.lval( AV36Car6)) ;
      }
      /* Using cursor P00CX3 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P00CX3_A130BarCodPar[0] ;
         A132BarCodReo = P00CX3_A132BarCodReo[0] ;
         A129BarCod = P00CX3_A129BarCod[0] ;
         A396EmprCod = P00CX3_A396EmprCod[0] ;
         A213BarSit = P00CX3_A213BarSit[0] ;
         A252CliCod = P00CX3_A252CliCod[0] ;
         n252CliCod = P00CX3_n252CliCod[0] ;
         A5253BarAcc = P00CX3_A5253BarAcc[0] ;
         A361DisCod = P00CX3_A361DisCod[0] ;
         A966PartCod = P00CX3_A966PartCod[0] ;
         n966PartCod = P00CX3_n966PartCod[0] ;
         A4937BarCtrPdas = P00CX3_A4937BarCtrPdas[0] ;
         n4937BarCtrPdas = P00CX3_n4937BarCtrPdas[0] ;
         A1003BarFecLan = P00CX3_A1003BarFecLan[0] ;
         n1003BarFecLan = P00CX3_n1003BarFecLan[0] ;
         A166BarKgm = P00CX3_A166BarKgm[0] ;
         A199BarPie1 = P00CX3_A199BarPie1[0] ;
         A365DisDes = P00CX3_A365DisDes[0] ;
         A898BarPieNDes = P00CX3_A898BarPieNDes[0] ;
         A166BarKgm = P00CX3_A166BarKgm[0] ;
         A199BarPie1 = P00CX3_A199BarPie1[0] ;
         A898BarPieNDes = P00CX3_A898BarPieNDes[0] ;
         A966PartCod = P00CX3_A966PartCod[0] ;
         n966PartCod = P00CX3_n966PartCod[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         if ( AV35CliSKP == 0 )
         {
            AV38CliPar = A252CliCod ;
         }
         else
         {
            if ( GXutil.strcmp(A5253BarAcc, httpContext.getMessage( "P", "")) == 0 )
            {
               AV38CliPar = AV37CliProPio ;
            }
            else
            {
               AV38CliPar = A252CliCod ;
            }
         }
         /* Using cursor P00CX4 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A194BarOrdLin = P00CX4_A194BarOrdLin[0] ;
            A153BarFasEst = P00CX4_A153BarFasEst[0] ;
            A758ProCod = P00CX4_A758ProCod[0] ;
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
            /* Using cursor P00CX5 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A758ProCod = P00CX5_A758ProCod[0] ;
               A761ProFasLin = P00CX5_A761ProFasLin[0] ;
               n761ProFasLin = P00CX5_n761ProFasLin[0] ;
               /* Optimized DELETE. */
               /* Using cursor P00CX6 */
               pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
               /* End optimized DELETE. */
               /* Using cursor P00CX7 */
               pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPRO");
               pr_default.readNext(2);
            }
            pr_default.close(2);
            /* Optimized DELETE. */
            /* Using cursor P00CX8 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARNOT");
            /* End optimized DELETE. */
            /* Optimized DELETE. */
            /* Using cursor P00CX9 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
            /* End optimized DELETE. */
            /* Optimized DELETE. */
            /* Using cursor P00CX10 */
            pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARENS");
            /* End optimized DELETE. */
            AV23DisCod = A361DisCod ;
            /* Optimized DELETE. */
            /* Using cursor P00CX11 */
            pr_default.execute(8, new Object[] {AV15EmprCod, Integer.valueOf(AV23DisCod), Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISBAR");
            /* End optimized DELETE. */
            AV26PartCod = A966PartCod ;
            AV27CliCod = A252CliCod ;
            AV24Kilos = A166BarKgm ;
            AV25Conos = A898BarPieNDes ;
            /* Execute user subroutine: 'ACTPDO' */
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
            if ( AV32FlagBros == 1 )
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
            if ( AV39Pervaf == 1 )
            {
               if ( A4937BarCtrPdas == 1 )
               {
                  System.out.println( httpContext.getMessage( "Atención. Se eliminan movimientos de Salida y descuenta Stock Planificado y Tinte Ok en Ubicaciones", "") );
                  GXv_char6[0] = A396EmprCod ;
                  GXv_char5[0] = A966PartCod ;
                  GXv_int7[0] = A252CliCod ;
                  GXv_int8[0] = AV16BarCod ;
                  GXv_char2[0] = httpContext.getMessage( "S", "") ;
                  GXv_int3[0] = AV40Ok_Baja ;
                  new app.pubibaj(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_int7, GXv_int8, GXv_char2, GXv_int3) ;
                  phdrde4.this.A396EmprCod = GXv_char6[0] ;
                  phdrde4.this.A966PartCod = GXv_char5[0] ;
                  phdrde4.this.A252CliCod = GXv_int7[0] ;
                  phdrde4.this.AV16BarCod = GXv_int8[0] ;
                  phdrde4.this.AV40Ok_Baja = GXv_int3[0] ;
               }
               else
               {
                  if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A1003BarFecLan)) )
                  {
                     System.out.println( httpContext.getMessage( "Atención. Se descuenta Stock Planificado en Ubicaciones", "") );
                     AV41UbiKil = A166BarKgm.multiply(DecimalUtil.doubleToDec((-1))) ;
                     AV42UbiCon = (short)(A198BarPie*(-1)) ;
                     GXv_char6[0] = AV15EmprCod ;
                     GXv_char5[0] = A966PartCod ;
                     GXv_int8[0] = A252CliCod ;
                     GXv_int7[0] = AV16BarCod ;
                     GXv_date9[0] = A1003BarFecLan ;
                     GXv_char2[0] = "999" ;
                     GXv_char10[0] = httpContext.getMessage( "PT", "") ;
                     GXv_char11[0] = httpContext.getMessage( "N", "") ;
                     GXv_decimal12[0] = AV41UbiKil ;
                     GXv_int13[0] = AV42UbiCon ;
                     GXv_decimal14[0] = DecimalUtil.doubleToDec(0) ;
                     GXv_int15[0] = (short)(0) ;
                     GXv_char16[0] = "" ;
                     new app.pubiplt(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_int8, GXv_int7, GXv_date9, GXv_char2, GXv_char10, GXv_char11, GXv_decimal12, GXv_int13, GXv_decimal14, GXv_int15, GXv_char16) ;
                     phdrde4.this.AV15EmprCod = GXv_char6[0] ;
                     phdrde4.this.A966PartCod = GXv_char5[0] ;
                     phdrde4.this.A252CliCod = GXv_int8[0] ;
                     phdrde4.this.AV16BarCod = GXv_int7[0] ;
                     phdrde4.this.A1003BarFecLan = GXv_date9[0] ;
                     phdrde4.this.AV41UbiKil = GXv_decimal12[0] ;
                     phdrde4.this.AV42UbiCon = GXv_int13[0] ;
                  }
               }
            }
            /* Optimized DELETE. */
            /* Using cursor P00CX12 */
            pr_default.execute(9, new Object[] {AV15EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPNOFART");
            /* End optimized DELETE. */
            /* Using cursor P00CX13 */
            pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
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
      /* 'ACTPDO' Routine */
      returnInSub = false ;
      AV33Contador = (byte)(0) ;
      /* Optimized group. */
      /* Using cursor P00CX14 */
      pr_default.execute(11, new Object[] {AV15EmprCod, Integer.valueOf(AV23DisCod)});
      cV33Contador = P00CX14_AV33Contador[0] ;
      pr_default.close(11);
      AV33Contador = (byte)(AV33Contador+cV33Contador*1) ;
      /* End optimized group. */
      if ( AV33Contador < 1 )
      {
         /* Using cursor P00CX15 */
         pr_default.execute(12, new Object[] {AV15EmprCod, Integer.valueOf(AV23DisCod)});
         while ( (pr_default.getStatus(12) != 101) )
         {
            A361DisCod = P00CX15_A361DisCod[0] ;
            A396EmprCod = P00CX15_A396EmprCod[0] ;
            A367DisEst = P00CX15_A367DisEst[0] ;
            A1968DisRes = P00CX15_A1968DisRes[0] ;
            n1968DisRes = P00CX15_n1968DisRes[0] ;
            A367DisEst = (byte)(1) ;
            A1968DisRes = httpContext.getMessage( "S", "") ;
            n1968DisRes = false ;
            /* Using cursor P00CX16 */
            pr_default.execute(13, new Object[] {Byte.valueOf(A367DisEst), Boolean.valueOf(n1968DisRes), A1968DisRes, A396EmprCod, Integer.valueOf(A361DisCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(12);
      }
      GXv_char16[0] = AV15EmprCod ;
      GXv_char11[0] = AV26PartCod ;
      GXv_int8[0] = AV38CliPar ;
      GXv_int7[0] = AV23DisCod ;
      GXv_decimal14[0] = AV24Kilos ;
      GXv_int17[0] = AV25Conos ;
      new app.pactpdo(remoteHandle, context).execute( GXv_char16, GXv_char11, GXv_int8, GXv_int7, GXv_decimal14, GXv_int17) ;
      phdrde4.this.AV15EmprCod = GXv_char16[0] ;
      phdrde4.this.AV26PartCod = GXv_char11[0] ;
      phdrde4.this.AV38CliPar = GXv_int8[0] ;
      phdrde4.this.AV23DisCod = GXv_int7[0] ;
      phdrde4.this.AV24Kilos = GXv_decimal14[0] ;
      phdrde4.this.AV25Conos = GXv_int17[0] ;
   }

   public void S121( )
   {
      /* 'LANZADO' Routine */
      returnInSub = false ;
      /* Optimized DELETE. */
      /* Using cursor P00CX17 */
      pr_default.execute(14, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLKGSLA");
      /* End optimized DELETE. */
   }

   protected void cleanup( )
   {
      this.aP0[0] = phdrde4.this.AV15EmprCod;
      this.aP1[0] = phdrde4.this.AV16BarCod;
      this.aP2[0] = phdrde4.this.AV17BarCodReo;
      this.aP3[0] = phdrde4.this.AV18BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "phdrde4");
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
      A396EmprCod = "" ;
      AV36Car6 = "" ;
      GXt_char1 = "" ;
      scmdbuf = "" ;
      P00CX3_A130BarCodPar = new String[] {""} ;
      P00CX3_A132BarCodReo = new byte[1] ;
      P00CX3_A129BarCod = new int[1] ;
      P00CX3_A396EmprCod = new String[] {""} ;
      P00CX3_A213BarSit = new byte[1] ;
      P00CX3_A252CliCod = new int[1] ;
      P00CX3_n252CliCod = new boolean[] {false} ;
      P00CX3_A5253BarAcc = new String[] {""} ;
      P00CX3_A361DisCod = new int[1] ;
      P00CX3_A966PartCod = new String[] {""} ;
      P00CX3_n966PartCod = new boolean[] {false} ;
      P00CX3_A4937BarCtrPdas = new byte[1] ;
      P00CX3_n4937BarCtrPdas = new boolean[] {false} ;
      P00CX3_A1003BarFecLan = new java.util.Date[] {GXutil.nullDate()} ;
      P00CX3_n1003BarFecLan = new boolean[] {false} ;
      P00CX3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00CX3_A199BarPie1 = new short[1] ;
      P00CX3_A365DisDes = new String[] {""} ;
      P00CX3_A898BarPieNDes = new int[1] ;
      A130BarCodPar = "" ;
      A5253BarAcc = "" ;
      A966PartCod = "" ;
      A1003BarFecLan = GXutil.nullDate() ;
      A166BarKgm = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      P00CX4_A396EmprCod = new String[] {""} ;
      P00CX4_A129BarCod = new int[1] ;
      P00CX4_A132BarCodReo = new byte[1] ;
      P00CX4_A130BarCodPar = new String[] {""} ;
      P00CX4_A194BarOrdLin = new short[1] ;
      P00CX4_A153BarFasEst = new byte[1] ;
      P00CX4_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      P00CX5_A396EmprCod = new String[] {""} ;
      P00CX5_A129BarCod = new int[1] ;
      P00CX5_A132BarCodReo = new byte[1] ;
      P00CX5_A130BarCodPar = new String[] {""} ;
      P00CX5_A758ProCod = new String[] {""} ;
      P00CX5_A761ProFasLin = new short[1] ;
      P00CX5_n761ProFasLin = new boolean[] {false} ;
      AV26PartCod = "" ;
      AV24Kilos = DecimalUtil.ZERO ;
      GXv_int3 = new byte[1] ;
      AV41UbiKil = DecimalUtil.ZERO ;
      GXv_char6 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_date9 = new java.util.Date[1] ;
      GXv_char2 = new String[1] ;
      GXv_char10 = new String[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_int13 = new short[1] ;
      GXv_int15 = new short[1] ;
      P00CX14_AV33Contador = new byte[1] ;
      P00CX15_A361DisCod = new int[1] ;
      P00CX15_A396EmprCod = new String[] {""} ;
      P00CX15_A367DisEst = new byte[1] ;
      P00CX15_A1968DisRes = new String[] {""} ;
      P00CX15_n1968DisRes = new boolean[] {false} ;
      A1968DisRes = "" ;
      GXv_char16 = new String[1] ;
      GXv_char11 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_int7 = new int[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_int17 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.phdrde4__default(),
         new Object[] {
             new Object[] {
            P00CX3_A130BarCodPar, P00CX3_A132BarCodReo, P00CX3_A129BarCod, P00CX3_A396EmprCod, P00CX3_A213BarSit, P00CX3_A252CliCod, P00CX3_n252CliCod, P00CX3_A5253BarAcc, P00CX3_A361DisCod, P00CX3_A966PartCod,
            P00CX3_n966PartCod, P00CX3_A4937BarCtrPdas, P00CX3_n4937BarCtrPdas, P00CX3_A1003BarFecLan, P00CX3_n1003BarFecLan, P00CX3_A166BarKgm, P00CX3_A199BarPie1, P00CX3_A365DisDes, P00CX3_A898BarPieNDes
            }
            , new Object[] {
            P00CX4_A396EmprCod, P00CX4_A129BarCod, P00CX4_A132BarCodReo, P00CX4_A130BarCodPar, P00CX4_A194BarOrdLin, P00CX4_A153BarFasEst, P00CX4_A758ProCod
            }
            , new Object[] {
            P00CX5_A396EmprCod, P00CX5_A129BarCod, P00CX5_A132BarCodReo, P00CX5_A130BarCodPar, P00CX5_A758ProCod, P00CX5_A761ProFasLin, P00CX5_n761ProFasLin
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
            }
            , new Object[] {
            }
            , new Object[] {
            P00CX14_AV33Contador
            }
            , new Object[] {
            P00CX15_A361DisCod, P00CX15_A396EmprCod, P00CX15_A367DisEst, P00CX15_A1968DisRes, P00CX15_n1968DisRes
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
   private byte AV32FlagBros ;
   private byte AV39Pervaf ;
   private byte AV35CliSKP ;
   private byte GXt_int4 ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte A4937BarCtrPdas ;
   private byte A153BarFasEst ;
   private byte AV40Ok_Baja ;
   private byte GXv_int3[] ;
   private byte AV33Contador ;
   private byte cV33Contador ;
   private byte A367DisEst ;
   private short A199BarPie1 ;
   private short A194BarOrdLin ;
   private short A761ProFasLin ;
   private short AV42UbiCon ;
   private short GXv_int13[] ;
   private short GXv_int15[] ;
   private short Gx_err ;
   private int AV16BarCod ;
   private int AV37CliProPio ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A361DisCod ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int AV38CliPar ;
   private int AV23DisCod ;
   private int AV27CliCod ;
   private int AV25Conos ;
   private int GXv_int8[] ;
   private int GXv_int7[] ;
   private int GXv_int17[] ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV24Kilos ;
   private java.math.BigDecimal AV41UbiKil ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private String AV15EmprCod ;
   private String AV18BarCodPar ;
   private String AV22msg0 ;
   private String A396EmprCod ;
   private String AV36Car6 ;
   private String GXt_char1 ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A5253BarAcc ;
   private String A966PartCod ;
   private String A365DisDes ;
   private String A758ProCod ;
   private String AV26PartCod ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char2[] ;
   private String GXv_char10[] ;
   private String A1968DisRes ;
   private String GXv_char16[] ;
   private String GXv_char11[] ;
   private java.util.Date A1003BarFecLan ;
   private java.util.Date GXv_date9[] ;
   private boolean n252CliCod ;
   private boolean n966PartCod ;
   private boolean n4937BarCtrPdas ;
   private boolean n1003BarFecLan ;
   private boolean n761ProFasLin ;
   private boolean returnInSub ;
   private boolean n1968DisRes ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P00CX3_A130BarCodPar ;
   private byte[] P00CX3_A132BarCodReo ;
   private int[] P00CX3_A129BarCod ;
   private String[] P00CX3_A396EmprCod ;
   private byte[] P00CX3_A213BarSit ;
   private int[] P00CX3_A252CliCod ;
   private boolean[] P00CX3_n252CliCod ;
   private String[] P00CX3_A5253BarAcc ;
   private int[] P00CX3_A361DisCod ;
   private String[] P00CX3_A966PartCod ;
   private boolean[] P00CX3_n966PartCod ;
   private byte[] P00CX3_A4937BarCtrPdas ;
   private boolean[] P00CX3_n4937BarCtrPdas ;
   private java.util.Date[] P00CX3_A1003BarFecLan ;
   private boolean[] P00CX3_n1003BarFecLan ;
   private java.math.BigDecimal[] P00CX3_A166BarKgm ;
   private short[] P00CX3_A199BarPie1 ;
   private String[] P00CX3_A365DisDes ;
   private int[] P00CX3_A898BarPieNDes ;
   private String[] P00CX4_A396EmprCod ;
   private int[] P00CX4_A129BarCod ;
   private byte[] P00CX4_A132BarCodReo ;
   private String[] P00CX4_A130BarCodPar ;
   private short[] P00CX4_A194BarOrdLin ;
   private byte[] P00CX4_A153BarFasEst ;
   private String[] P00CX4_A758ProCod ;
   private String[] P00CX5_A396EmprCod ;
   private int[] P00CX5_A129BarCod ;
   private byte[] P00CX5_A132BarCodReo ;
   private String[] P00CX5_A130BarCodPar ;
   private String[] P00CX5_A758ProCod ;
   private short[] P00CX5_A761ProFasLin ;
   private boolean[] P00CX5_n761ProFasLin ;
   private byte[] P00CX14_AV33Contador ;
   private int[] P00CX15_A361DisCod ;
   private String[] P00CX15_A396EmprCod ;
   private byte[] P00CX15_A367DisEst ;
   private String[] P00CX15_A1968DisRes ;
   private boolean[] P00CX15_n1968DisRes ;
}

final  class phdrde4__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00CX3", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.BarSit, T1.CliCod, T1.BarAcc, T1.DisCod, T3.PartCod, T1.BarCtrPdas, T1.BarFecLan, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM ((TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN TXPDISPOS T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00CX4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, BarFasEst, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00CX5", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, ProFasLin FROM TXPBARPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00CX6", "DELETE FROM TXPBARFAS  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new UpdateCursor("P00CX7", "DELETE FROM TXPBARPRO  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPRO")
         ,new UpdateCursor("P00CX8", "DELETE FROM TXPBARNOT  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARNOT")
         ,new UpdateCursor("P00CX9", "DELETE FROM TXPBARPIE  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P00CX10", "DELETE FROM TXPBARENS  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARENS")
         ,new UpdateCursor("P00CX11", "DELETE FROM TXPDISBAR  WHERE EmprCod = ? and DisDisCod = ? and DisBarCod = ? and DisBarReo = ? and DisBarPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISBAR")
         ,new UpdateCursor("P00CX12", "DELETE FROM TXPNOFART  WHERE EmprCod = ? and Nof_Hdr = ? and Nof_r = ? and Nof_p = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPNOFART")
         ,new UpdateCursor("P00CX13", "DELETE FROM TXPBARCAD  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P00CX14", "SELECT COUNT(*) FROM TXPDISBAR WHERE EmprCod = ? and DisDisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00CX15", "SELECT DisCod, EmprCod, DisEst, DisRes FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00CX16", "UPDATE TXPDISPOS SET DisEst=?, DisRes=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
         ,new UpdateCursor("P00CX17", "DELETE FROM TXPLKGSLA  WHERE (EmprCod = ?) AND (LzaBarCod = ?) AND (LzaBarReo = ?) AND (LzaBarPar = ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLKGSLA")
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
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 16);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(12,2);
               ((short[]) buf[16])[0] = rslt.getShort(13);
               ((String[]) buf[17])[0] = rslt.getString(14, 1);
               ((int[]) buf[18])[0] = rslt.getInt(15);
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
            case 11 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               return;
            case 12 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 1);
               }
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

