package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdepedt extends GXProcedure
{
   public pdepedt( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdepedt.class ), "" );
   }

   public pdepedt( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 )
   {
      pdepedt.this.aP1 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        java.util.Date[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             java.util.Date[] aP1 )
   {
      pdepedt.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdepedt.this.AV33AlbProFch = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV35Tab_albhdr[GX_I-1] = " " ;
         GX_I = (int)(GX_I+1) ;
      }
      AV36i = (short)(1) ;
      /* Using cursor P03902 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV33AlbProFch});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A30AlbProCod = P03902_A30AlbProCod[0] ;
         A1782AlbProEso = P03902_A1782AlbProEso[0] ;
         A33AlbProEst = P03902_A33AlbProEst[0] ;
         A34AlbProfch = P03902_A34AlbProfch[0] ;
         A1243GuiRemCli = P03902_A1243GuiRemCli[0] ;
         AV41Clicod = A1243GuiRemCli ;
         /* Using cursor P03903 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A130BarCodPar = P03903_A130BarCodPar[0] ;
            A132BarCodReo = P03903_A132BarCodReo[0] ;
            A129BarCod = P03903_A129BarCod[0] ;
            A2395BarAlbExt = P03903_A2395BarAlbExt[0] ;
            n2395BarAlbExt = P03903_n2395BarAlbExt[0] ;
            A2761AlbBarRec = P03903_A2761AlbBarRec[0] ;
            A2762AlbBarDto = P03903_A2762AlbBarDto[0] ;
            n2762AlbBarDto = P03903_n2762AlbBarDto[0] ;
            A2243BarKgsCli = P03903_A2243BarKgsCli[0] ;
            n2243BarKgsCli = P03903_n2243BarKgsCli[0] ;
            A1261BarAlbKgmE = P03903_A1261BarAlbKgmE[0] ;
            A1461BarAlbPN = P03903_A1461BarAlbPN[0] ;
            A1263BarAlbMtrE = P03903_A1263BarAlbMtrE[0] ;
            A5253BarAcc = P03903_A5253BarAcc[0] ;
            A5253BarAcc = P03903_A5253BarAcc[0] ;
            if ( ( A2762AlbBarDto.doubleValue() != 0 ) || ( A2761AlbBarRec.doubleValue() != 0 ) )
            {
               A2762AlbBarDto = DecimalUtil.doubleToDec(0) ;
               n2762AlbBarDto = false ;
               A2761AlbBarRec = DecimalUtil.doubleToDec(0) ;
            }
            A2395BarAlbExt = 0 ;
            n2395BarAlbExt = false ;
            if ( A2243BarKgsCli.doubleValue() != 0 )
            {
               A1261BarAlbKgmE = A2243BarKgsCli ;
               A2243BarKgsCli = DecimalUtil.doubleToDec(0) ;
               n2243BarKgsCli = false ;
            }
            if ( A1461BarAlbPN.doubleValue() != 0 )
            {
               A1263BarAlbMtrE = A1461BarAlbPN ;
               A1461BarAlbPN = DecimalUtil.doubleToDec(0) ;
            }
            if ( GXutil.strcmp(A5253BarAcc, httpContext.getMessage( "S", "")) == 0 )
            {
               if ( AV36i > 1000 )
               {
                  httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion. MAXIMO 1000 lineas¡¡¡", ""));
               }
               else
               {
                  AV35Tab_albhdr[AV36i-1] = GXutil.str( A30AlbProCod, 10, 0) + GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
                  AV36i = (short)(AV36i+1) ;
               }
            }
            /* Using cursor P03904 */
            pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A457FasCod = P03904_A457FasCod[0] ;
               A8194GuiFasPBK = P03904_A8194GuiFasPBK[0] ;
               n8194GuiFasPBK = P03904_n8194GuiFasPBK[0] ;
               A1275FasKgm = P03904_A1275FasKgm[0] ;
               A8195GuiFasPBM = P03904_A8195GuiFasPBM[0] ;
               n8195GuiFasPBM = P03904_n8195GuiFasPBM[0] ;
               A1276FasMtr = P03904_A1276FasMtr[0] ;
               A7752GuiFasRec = P03904_A7752GuiFasRec[0] ;
               n7752GuiFasRec = P03904_n7752GuiFasRec[0] ;
               A7751GuiFasDto = P03904_A7751GuiFasDto[0] ;
               n7751GuiFasDto = P03904_n7751GuiFasDto[0] ;
               A1240GuiFasLin = P03904_A1240GuiFasLin[0] ;
               AV42Fascod = A457FasCod ;
               /* Execute user subroutine: 'PREFAS' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(2);
                  pr_default.close(1);
                  pr_default.close(1);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               if ( AV43Precio_Acc == 0 )
               {
                  if ( A8194GuiFasPBK.doubleValue() != 0 )
                  {
                     A1275FasKgm = A8194GuiFasPBK ;
                     A8194GuiFasPBK = DecimalUtil.doubleToDec(0) ;
                     n8194GuiFasPBK = false ;
                  }
                  if ( A8195GuiFasPBM.doubleValue() != 0 )
                  {
                     A1276FasMtr = A8195GuiFasPBM ;
                     A8195GuiFasPBM = DecimalUtil.doubleToDec(0) ;
                     n8195GuiFasPBM = false ;
                  }
                  if ( ( A7751GuiFasDto.doubleValue() != 0 ) || ( A7752GuiFasRec.doubleValue() != 0 ) )
                  {
                     A7751GuiFasDto = DecimalUtil.doubleToDec(0) ;
                     n7751GuiFasDto = false ;
                     A7752GuiFasRec = DecimalUtil.doubleToDec(0) ;
                     n7752GuiFasRec = false ;
                  }
               }
               /* Using cursor P03905 */
               pr_default.execute(3, new Object[] {Boolean.valueOf(n8194GuiFasPBK), A8194GuiFasPBK, A1275FasKgm, Boolean.valueOf(n8195GuiFasPBM), A8195GuiFasPBM, A1276FasMtr, Boolean.valueOf(n7752GuiFasRec), A7752GuiFasRec, Boolean.valueOf(n7751GuiFasDto), A7751GuiFasDto, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
               pr_default.readNext(2);
            }
            pr_default.close(2);
            /* Using cursor P03906 */
            pr_default.execute(4, new Object[] {Boolean.valueOf(n2395BarAlbExt), Integer.valueOf(A2395BarAlbExt), A2761AlbBarRec, Boolean.valueOf(n2762AlbBarDto), A2762AlbBarDto, Boolean.valueOf(n2243BarKgsCli), A2243BarKgsCli, A1261BarAlbKgmE, A1461BarAlbPN, A1263BarAlbMtrE, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV36i = (short)(1) ;
      while ( AV36i <= 1000 )
      {
         if ( GXutil.strcmp(AV35Tab_albhdr[AV36i-1], " ") == 0 )
         {
            if (true) break;
         }
         AV37Albprocod = GXutil.lval( GXutil.substring( AV35Tab_albhdr[AV36i-1], 1, 10)) ;
         AV38Barcod = (int)(GXutil.lval( GXutil.substring( AV35Tab_albhdr[AV36i-1], 11, 8))) ;
         AV39Barcodreo = (byte)(GXutil.lval( GXutil.substring( AV35Tab_albhdr[AV36i-1], 19, 1))) ;
         AV40Barcodpar = GXutil.substring( AV35Tab_albhdr[AV36i-1], 20, 1) ;
         /* Using cursor P03907 */
         pr_default.execute(5, new Object[] {A396EmprCod, Long.valueOf(AV37Albprocod), Integer.valueOf(AV38Barcod), Byte.valueOf(AV39Barcodreo), AV40Barcodpar, A396EmprCod, Long.valueOf(AV37Albprocod), Integer.valueOf(AV38Barcod), Byte.valueOf(AV39Barcodreo), AV40Barcodpar});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A130BarCodPar = P03907_A130BarCodPar[0] ;
            A132BarCodReo = P03907_A132BarCodReo[0] ;
            A129BarCod = P03907_A129BarCod[0] ;
            A30AlbProCod = P03907_A30AlbProCod[0] ;
            A2395BarAlbExt = P03907_A2395BarAlbExt[0] ;
            n2395BarAlbExt = P03907_n2395BarAlbExt[0] ;
            A6815BarPreFKg = P03907_A6815BarPreFKg[0] ;
            n6815BarPreFKg = P03907_n6815BarPreFKg[0] ;
            A1262BarPreKgm = P03907_A1262BarPreKgm[0] ;
            /* Using cursor P03908 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            A361DisCod = P03908_A361DisCod[0] ;
            A5253BarAcc = P03908_A5253BarAcc[0] ;
            /* Using cursor P03909 */
            pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            A388DisPreKgm = P03909_A388DisPreKgm[0] ;
            A2395BarAlbExt = 0 ;
            n2395BarAlbExt = false ;
            A5253BarAcc = httpContext.getMessage( "N", "") ;
            A1262BarPreKgm = A6815BarPreFKg ;
            A6815BarPreFKg = DecimalUtil.doubleToDec(0) ;
            n6815BarPreFKg = false ;
            A388DisPreKgm = DecimalUtil.doubleToDec(0) ;
            /* Using cursor P039010 */
            pr_default.execute(8, new Object[] {A5253BarAcc, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
            /* Using cursor P039011 */
            pr_default.execute(9, new Object[] {A388DisPreKgm, A396EmprCod, Integer.valueOf(A361DisCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
            /* Using cursor P039012 */
            pr_default.execute(10, new Object[] {Boolean.valueOf(n2395BarAlbExt), Integer.valueOf(A2395BarAlbExt), Boolean.valueOf(n6815BarPreFKg), A6815BarPreFKg, A1262BarPreKgm, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(5);
         pr_default.close(6);
         pr_default.close(7);
         AV36i = (short)(AV36i+1) ;
      }
      Application.commitDataStores(context, remoteHandle, pr_default, "pdepedt");
      httpContext.GX_msglist.addItem("...");
      AV36i = (short)(1) ;
      while ( AV36i <= 1000 )
      {
         if ( GXutil.strcmp(AV35Tab_albhdr[AV36i-1], " ") == 0 )
         {
            if (true) break;
         }
         AV37Albprocod = GXutil.lval( GXutil.substring( AV35Tab_albhdr[AV36i-1], 1, 10)) ;
         AV38Barcod = (int)(GXutil.lval( GXutil.substring( AV35Tab_albhdr[AV36i-1], 11, 8))) ;
         AV39Barcodreo = (byte)(GXutil.lval( GXutil.substring( AV35Tab_albhdr[AV36i-1], 19, 1))) ;
         AV40Barcodpar = GXutil.substring( AV35Tab_albhdr[AV36i-1], 20, 1) ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = AV37Albprocod ;
         GXv_int3[0] = AV38Barcod ;
         GXv_int4[0] = AV39Barcodreo ;
         GXv_char5[0] = AV40Barcodpar ;
         new app.pcopfas(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_int4, GXv_char5) ;
         pdepedt.this.A396EmprCod = GXv_char1[0] ;
         pdepedt.this.AV37Albprocod = GXv_int2[0] ;
         pdepedt.this.AV38Barcod = GXv_int3[0] ;
         pdepedt.this.AV39Barcodreo = GXv_int4[0] ;
         pdepedt.this.AV40Barcodpar = GXv_char5[0] ;
         AV36i = (short)(AV36i+1) ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'PREFAS' Routine */
      returnInSub = false ;
      AV43Precio_Acc = (byte)(0) ;
      /* Using cursor P039013 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(AV41Clicod), AV42Fascod});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A457FasCod = P039013_A457FasCod[0] ;
         A252CliCod = P039013_A252CliCod[0] ;
         A10882FasPreU = P039013_A10882FasPreU[0] ;
         n10882FasPreU = P039013_n10882FasPreU[0] ;
         AV43Precio_Acc = A10882FasPreU ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(11);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdepedt.this.A396EmprCod;
      this.aP1[0] = pdepedt.this.AV33AlbProFch;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdepedt");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV35Tab_albhdr = new String[1000] ;
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV35Tab_albhdr[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      scmdbuf = "" ;
      P03902_A396EmprCod = new String[] {""} ;
      P03902_A30AlbProCod = new long[1] ;
      P03902_A1782AlbProEso = new byte[1] ;
      P03902_A33AlbProEst = new byte[1] ;
      P03902_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P03902_A1243GuiRemCli = new int[1] ;
      A34AlbProfch = GXutil.nullDate() ;
      P03903_A396EmprCod = new String[] {""} ;
      P03903_A30AlbProCod = new long[1] ;
      P03903_A130BarCodPar = new String[] {""} ;
      P03903_A132BarCodReo = new byte[1] ;
      P03903_A129BarCod = new int[1] ;
      P03903_A2395BarAlbExt = new int[1] ;
      P03903_n2395BarAlbExt = new boolean[] {false} ;
      P03903_A2761AlbBarRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03903_A2762AlbBarDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03903_n2762AlbBarDto = new boolean[] {false} ;
      P03903_A2243BarKgsCli = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03903_n2243BarKgsCli = new boolean[] {false} ;
      P03903_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03903_A1461BarAlbPN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03903_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03903_A5253BarAcc = new String[] {""} ;
      A130BarCodPar = "" ;
      A2761AlbBarRec = DecimalUtil.ZERO ;
      A2762AlbBarDto = DecimalUtil.ZERO ;
      A2243BarKgsCli = DecimalUtil.ZERO ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1461BarAlbPN = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A5253BarAcc = "" ;
      P03904_A396EmprCod = new String[] {""} ;
      P03904_A30AlbProCod = new long[1] ;
      P03904_A129BarCod = new int[1] ;
      P03904_A132BarCodReo = new byte[1] ;
      P03904_A130BarCodPar = new String[] {""} ;
      P03904_A457FasCod = new String[] {""} ;
      P03904_A8194GuiFasPBK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03904_n8194GuiFasPBK = new boolean[] {false} ;
      P03904_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03904_A8195GuiFasPBM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03904_n8195GuiFasPBM = new boolean[] {false} ;
      P03904_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03904_A7752GuiFasRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03904_n7752GuiFasRec = new boolean[] {false} ;
      P03904_A7751GuiFasDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03904_n7751GuiFasDto = new boolean[] {false} ;
      P03904_A1240GuiFasLin = new short[1] ;
      A457FasCod = "" ;
      A8194GuiFasPBK = DecimalUtil.ZERO ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A8195GuiFasPBM = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A7752GuiFasRec = DecimalUtil.ZERO ;
      A7751GuiFasDto = DecimalUtil.ZERO ;
      AV42Fascod = "" ;
      AV40Barcodpar = "" ;
      P03907_A396EmprCod = new String[] {""} ;
      P03907_A130BarCodPar = new String[] {""} ;
      P03907_A132BarCodReo = new byte[1] ;
      P03907_A129BarCod = new int[1] ;
      P03907_A30AlbProCod = new long[1] ;
      P03907_A2395BarAlbExt = new int[1] ;
      P03907_n2395BarAlbExt = new boolean[] {false} ;
      P03907_A6815BarPreFKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03907_n6815BarPreFKg = new boolean[] {false} ;
      P03907_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A6815BarPreFKg = DecimalUtil.ZERO ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      P03908_A361DisCod = new int[1] ;
      P03908_A5253BarAcc = new String[] {""} ;
      P03909_A388DisPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A388DisPreKgm = DecimalUtil.ZERO ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new long[1] ;
      GXv_int3 = new int[1] ;
      GXv_int4 = new byte[1] ;
      GXv_char5 = new String[1] ;
      P039013_A396EmprCod = new String[] {""} ;
      P039013_A457FasCod = new String[] {""} ;
      P039013_A252CliCod = new int[1] ;
      P039013_A10882FasPreU = new byte[1] ;
      P039013_n10882FasPreU = new boolean[] {false} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.pdepedt__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pdepedt__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pdepedt__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pdepedt__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdepedt__default(),
         new Object[] {
             new Object[] {
            P03902_A396EmprCod, P03902_A30AlbProCod, P03902_A1782AlbProEso, P03902_A33AlbProEst, P03902_A34AlbProfch, P03902_A1243GuiRemCli
            }
            , new Object[] {
            P03903_A396EmprCod, P03903_A30AlbProCod, P03903_A130BarCodPar, P03903_A132BarCodReo, P03903_A129BarCod, P03903_A2395BarAlbExt, P03903_n2395BarAlbExt, P03903_A2761AlbBarRec, P03903_A2762AlbBarDto, P03903_n2762AlbBarDto,
            P03903_A2243BarKgsCli, P03903_n2243BarKgsCli, P03903_A1261BarAlbKgmE, P03903_A1461BarAlbPN, P03903_A1263BarAlbMtrE, P03903_A5253BarAcc
            }
            , new Object[] {
            P03904_A396EmprCod, P03904_A30AlbProCod, P03904_A129BarCod, P03904_A132BarCodReo, P03904_A130BarCodPar, P03904_A457FasCod, P03904_A8194GuiFasPBK, P03904_n8194GuiFasPBK, P03904_A1275FasKgm, P03904_A8195GuiFasPBM,
            P03904_n8195GuiFasPBM, P03904_A1276FasMtr, P03904_A7752GuiFasRec, P03904_n7752GuiFasRec, P03904_A7751GuiFasDto, P03904_n7751GuiFasDto, P03904_A1240GuiFasLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P03907_A396EmprCod, P03907_A130BarCodPar, P03907_A132BarCodReo, P03907_A129BarCod, P03907_A30AlbProCod, P03907_A2395BarAlbExt, P03907_n2395BarAlbExt, P03907_A6815BarPreFKg, P03907_n6815BarPreFKg, P03907_A1262BarPreKgm
            }
            , new Object[] {
            P03908_A361DisCod, P03908_A5253BarAcc
            }
            , new Object[] {
            P03909_A388DisPreKgm
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P039013_A396EmprCod, P039013_A457FasCod, P039013_A252CliCod, P039013_A10882FasPreU, P039013_n10882FasPreU
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A1782AlbProEso ;
   private byte A33AlbProEst ;
   private byte A132BarCodReo ;
   private byte AV43Precio_Acc ;
   private byte AV39Barcodreo ;
   private byte GXv_int4[] ;
   private byte A10882FasPreU ;
   private short AV36i ;
   private short A1240GuiFasLin ;
   private short Gx_err ;
   private int GX_I ;
   private int A1243GuiRemCli ;
   private int AV41Clicod ;
   private int A129BarCod ;
   private int A2395BarAlbExt ;
   private int AV38Barcod ;
   private int A361DisCod ;
   private int GXv_int3[] ;
   private int A252CliCod ;
   private long A30AlbProCod ;
   private long AV37Albprocod ;
   private long GXv_int2[] ;
   private java.math.BigDecimal A2761AlbBarRec ;
   private java.math.BigDecimal A2762AlbBarDto ;
   private java.math.BigDecimal A2243BarKgsCli ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1461BarAlbPN ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A8194GuiFasPBK ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A8195GuiFasPBM ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A7752GuiFasRec ;
   private java.math.BigDecimal A7751GuiFasDto ;
   private java.math.BigDecimal A6815BarPreFKg ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A388DisPreKgm ;
   private String A396EmprCod ;
   private String AV35Tab_albhdr[] ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A5253BarAcc ;
   private String A457FasCod ;
   private String AV42Fascod ;
   private String AV40Barcodpar ;
   private String GXv_char1[] ;
   private String GXv_char5[] ;
   private java.util.Date AV33AlbProFch ;
   private java.util.Date A34AlbProfch ;
   private boolean n2395BarAlbExt ;
   private boolean n2762AlbBarDto ;
   private boolean n2243BarKgsCli ;
   private boolean n8194GuiFasPBK ;
   private boolean n8195GuiFasPBM ;
   private boolean n7752GuiFasRec ;
   private boolean n7751GuiFasDto ;
   private boolean returnInSub ;
   private boolean n6815BarPreFKg ;
   private boolean n10882FasPreU ;
   private java.util.Date[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P03902_A396EmprCod ;
   private long[] P03902_A30AlbProCod ;
   private byte[] P03902_A1782AlbProEso ;
   private byte[] P03902_A33AlbProEst ;
   private java.util.Date[] P03902_A34AlbProfch ;
   private int[] P03902_A1243GuiRemCli ;
   private String[] P03903_A396EmprCod ;
   private long[] P03903_A30AlbProCod ;
   private String[] P03903_A130BarCodPar ;
   private byte[] P03903_A132BarCodReo ;
   private int[] P03903_A129BarCod ;
   private int[] P03903_A2395BarAlbExt ;
   private boolean[] P03903_n2395BarAlbExt ;
   private java.math.BigDecimal[] P03903_A2761AlbBarRec ;
   private java.math.BigDecimal[] P03903_A2762AlbBarDto ;
   private boolean[] P03903_n2762AlbBarDto ;
   private java.math.BigDecimal[] P03903_A2243BarKgsCli ;
   private boolean[] P03903_n2243BarKgsCli ;
   private java.math.BigDecimal[] P03903_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P03903_A1461BarAlbPN ;
   private java.math.BigDecimal[] P03903_A1263BarAlbMtrE ;
   private String[] P03903_A5253BarAcc ;
   private String[] P03904_A396EmprCod ;
   private long[] P03904_A30AlbProCod ;
   private int[] P03904_A129BarCod ;
   private byte[] P03904_A132BarCodReo ;
   private String[] P03904_A130BarCodPar ;
   private String[] P03904_A457FasCod ;
   private java.math.BigDecimal[] P03904_A8194GuiFasPBK ;
   private boolean[] P03904_n8194GuiFasPBK ;
   private java.math.BigDecimal[] P03904_A1275FasKgm ;
   private java.math.BigDecimal[] P03904_A8195GuiFasPBM ;
   private boolean[] P03904_n8195GuiFasPBM ;
   private java.math.BigDecimal[] P03904_A1276FasMtr ;
   private java.math.BigDecimal[] P03904_A7752GuiFasRec ;
   private boolean[] P03904_n7752GuiFasRec ;
   private java.math.BigDecimal[] P03904_A7751GuiFasDto ;
   private boolean[] P03904_n7751GuiFasDto ;
   private short[] P03904_A1240GuiFasLin ;
   private String[] P03907_A396EmprCod ;
   private String[] P03907_A130BarCodPar ;
   private byte[] P03907_A132BarCodReo ;
   private int[] P03907_A129BarCod ;
   private long[] P03907_A30AlbProCod ;
   private int[] P03907_A2395BarAlbExt ;
   private boolean[] P03907_n2395BarAlbExt ;
   private java.math.BigDecimal[] P03907_A6815BarPreFKg ;
   private boolean[] P03907_n6815BarPreFKg ;
   private java.math.BigDecimal[] P03907_A1262BarPreKgm ;
   private int[] P03908_A361DisCod ;
   private String[] P03908_A5253BarAcc ;
   private java.math.BigDecimal[] P03909_A388DisPreKgm ;
   private String[] P039013_A396EmprCod ;
   private String[] P039013_A457FasCod ;
   private int[] P039013_A252CliCod ;
   private byte[] P039013_A10882FasPreU ;
   private boolean[] P039013_n10882FasPreU ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pdepedt__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "MODA21";
   }

}

final  class pdepedt__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class pdepedt__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class pdepedt__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class pdepedt__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03902", "SELECT EmprCod, AlbProCod, AlbProEso, AlbProEst, AlbProfch, GuiRemCli FROM TXPCALPRD WHERE (EmprCod = ?) AND (AlbProfch >= ?) AND (AlbProEst < 2) AND (AlbProEso < 2) ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03903", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarAlbExt, T1.AlbBarRec, T1.AlbBarDto, T1.BarKgsCli, T1.BarAlbKgmE, T1.BarAlbPN, T1.BarAlbMtrE, T2.BarAcc FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.AlbProCod = ?) AND (T1.BarAlbExt = 1) ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar  FOR UPDATE OF T1.BarAlbExt, T1.AlbBarRec, T1.AlbBarDto, T1.BarKgsCli, T1.BarAlbKgmE, T1.BarAlbPN, T1.BarAlbMtrE NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03904", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, FasCod, GuiFasPBK, FasKgm, GuiFasPBM, FasMtr, GuiFasRec, GuiFasDto, GuiFasLin FROM TXPALBFAS WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin  FOR UPDATE OF GuiFasPBK, FasKgm, GuiFasPBM, FasMtr, GuiFasRec, GuiFasDto NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03905", "UPDATE TXPALBFAS SET GuiFasPBK=?, FasKgm=?, GuiFasPBM=?, FasMtr=?, GuiFasRec=?, GuiFasDto=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND GuiFasLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
         ,new UpdateCursor("P03906", "UPDATE TXPALBBAR SET BarAlbExt=?, AlbBarRec=?, AlbBarDto=?, BarKgsCli=?, BarAlbKgmE=?, BarAlbPN=?, BarAlbMtrE=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
         ,new ForEachCursor("P03907", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, AlbProCod, BarAlbExt, BarPreFKg, BarPreKgm FROM TXPALBBAR WHERE (EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) AND (EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)  FOR UPDATE OF BarAlbExt, BarPreFKg, BarPreKgm NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03908", "SELECT DisCod, BarAcc FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF BarAcc NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03909", "SELECT DisPreKgm FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ?  FOR UPDATE OF DisPreKgm NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P039010", "UPDATE TXPBARCAD SET BarAcc=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new UpdateCursor("P039011", "UPDATE TXPDISPOS SET DisPreKgm=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
         ,new UpdateCursor("P039012", "UPDATE TXPALBBAR SET BarAlbExt=?, BarPreFKg=?, BarPreKgm=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
         ,new ForEachCursor("P039013", "SELECT EmprCod, FasCod, CliCod, FasPreU FROM TXPPREFAS WHERE EmprCod = ? and CliCod = ? and FasCod = ? ORDER BY EmprCod, CliCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[15])[0] = rslt.getString(13, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(13);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,5);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 7 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 5);
               }
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[2], 2);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 5);
               }
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[5], 2);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[9], 2);
               }
               stmt.setString(7, (String)parms[10], 3);
               stmt.setLong(8, ((Number) parms[11]).longValue());
               stmt.setInt(9, ((Number) parms[12]).intValue());
               stmt.setByte(10, ((Number) parms[13]).byteValue());
               stmt.setString(11, (String)parms[14], 1);
               stmt.setShort(12, ((Number) parms[15]).shortValue());
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[2], 2);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 2);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[6], 2);
               }
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[7], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[8], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[9], 2);
               stmt.setString(8, (String)parms[10], 3);
               stmt.setLong(9, ((Number) parms[11]).longValue());
               stmt.setInt(10, ((Number) parms[12]).intValue());
               stmt.setByte(11, ((Number) parms[13]).byteValue());
               stmt.setString(12, (String)parms[14], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 3);
               stmt.setLong(7, ((Number) parms[6]).longValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 1);
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
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 9 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 5);
               }
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 5);
               stmt.setString(4, (String)parms[5], 3);
               stmt.setLong(5, ((Number) parms[6]).longValue());
               stmt.setInt(6, ((Number) parms[7]).intValue());
               stmt.setByte(7, ((Number) parms[8]).byteValue());
               stmt.setString(8, (String)parms[9], 1);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
      }
   }

}

