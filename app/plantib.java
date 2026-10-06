package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plantib extends GXProcedure
{
   public plantib( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plantib.class ), "" );
   }

   public plantib( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     int[] aP1 ,
                                     byte[] aP2 ,
                                     String[] aP3 )
   {
      plantib.this.aP4 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.util.Date[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.util.Date[] aP4 )
   {
      plantib.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      plantib.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      plantib.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      plantib.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      plantib.this.AV9FechaLan = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Realizando Lanzamiento de Fecha de Tinte", "") );
      /* Using cursor P00NH3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P00NH3_A361DisCod[0] ;
         A180BarMaqCod = P00NH3_A180BarMaqCod[0] ;
         A252CliCod = P00NH3_A252CliCod[0] ;
         n252CliCod = P00NH3_n252CliCod[0] ;
         A212BarSer = P00NH3_A212BarSer[0] ;
         A1500BarNMtr = P00NH3_A1500BarNMtr[0] ;
         A3311BarManCod1 = P00NH3_A3311BarManCod1[0] ;
         A1157TipConCod = P00NH3_A1157TipConCod[0] ;
         n1157TipConCod = P00NH3_n1157TipConCod[0] ;
         A217BarTipArt = P00NH3_A217BarTipArt[0] ;
         n217BarTipArt = P00NH3_n217BarTipArt[0] ;
         A159BarFecGen = P00NH3_A159BarFecGen[0] ;
         A2447BarFecEnE = P00NH3_A2447BarFecEnE[0] ;
         A142BarDiaP = P00NH3_A142BarDiaP[0] ;
         A158BarFecFpr = P00NH3_A158BarFecFpr[0] ;
         A1003BarFecLan = P00NH3_A1003BarFecLan[0] ;
         n1003BarFecLan = P00NH3_n1003BarFecLan[0] ;
         A146BarEst = P00NH3_A146BarEst[0] ;
         A2442BarBulEnE = P00NH3_A2442BarBulEnE[0] ;
         n2442BarBulEnE = P00NH3_n2442BarBulEnE[0] ;
         A2010BarTipDis = P00NH3_A2010BarTipDis[0] ;
         A898BarPieNDes = P00NH3_A898BarPieNDes[0] ;
         A166BarKgm = P00NH3_A166BarKgm[0] ;
         A1157TipConCod = P00NH3_A1157TipConCod[0] ;
         n1157TipConCod = P00NH3_n1157TipConCod[0] ;
         A898BarPieNDes = P00NH3_A898BarPieNDes[0] ;
         A166BarKgm = P00NH3_A166BarKgm[0] ;
         AV21MaxKilLan = DecimalUtil.ZERO ;
         AV22NParam = (short)(0) ;
         AV20LanBroDia = (short)(0) ;
         AV10EmprCod = A396EmprCod ;
         AV8MaqCod = A180BarMaqCod ;
         /* Execute user subroutine: 'MAQUIN' */
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
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A252CliCod ;
         GXv_char3[0] = A212BarSer ;
         GXv_char4[0] = A1500BarNMtr ;
         GXv_int5[0] = A3311BarManCod1 ;
         GXv_int6[0] = A1157TipConCod ;
         GXv_char7[0] = A180BarMaqCod ;
         GXv_int8[0] = AV23MaqNhd ;
         GXv_decimal9[0] = AV21MaxKilLan ;
         GXv_int10[0] = AV22NParam ;
         GXv_int11[0] = A217BarTipArt ;
         GXv_int12[0] = AV20LanBroDia ;
         GXv_int13[0] = AV24MaxConLan ;
         GXv_int14[0] = A898BarPieNDes ;
         new app.planbro(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3, GXv_char4, GXv_int5, GXv_int6, GXv_char7, GXv_int8, GXv_decimal9, GXv_int10, GXv_int11, GXv_int12, GXv_int13, GXv_int14) ;
         plantib.this.A396EmprCod = GXv_char1[0] ;
         plantib.this.A252CliCod = GXv_int2[0] ;
         plantib.this.A212BarSer = GXv_char3[0] ;
         plantib.this.A1500BarNMtr = GXv_char4[0] ;
         plantib.this.A3311BarManCod1 = GXv_int5[0] ;
         plantib.this.A1157TipConCod = GXv_int6[0] ;
         plantib.this.A180BarMaqCod = GXv_char7[0] ;
         plantib.this.AV23MaqNhd = GXv_int8[0] ;
         plantib.this.AV21MaxKilLan = GXv_decimal9[0] ;
         plantib.this.AV22NParam = GXv_int10[0] ;
         plantib.this.A217BarTipArt = GXv_int11[0] ;
         plantib.this.AV20LanBroDia = GXv_int12[0] ;
         plantib.this.AV24MaxConLan = GXv_int13[0] ;
         plantib.this.A898BarPieNDes = GXv_int14[0] ;
         if ( ! (0==AV20LanBroDia) && ( A898BarPieNDes >= AV24MaxConLan ) )
         {
            AV12Totdias = AV20LanBroDia ;
            AV13FecCC = A159BarFecGen ;
            A2447BarFecEnE = A159BarFecGen ;
         }
         else
         {
            AV12Totdias = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( A142BarDiaP, 0))) ;
            if ( GXutil.strcmp(GXutil.substring( A212BarSer, 1, 2), httpContext.getMessage( "CT", "")) == 0 )
            {
               AV12Totdias = (short)(AV12Totdias-3) ;
            }
            AV13FecCC = AV9FechaLan ;
            A2447BarFecEnE = AV9FechaLan ;
         }
         AV15NDias = (short)(0) ;
         if ( AV12Totdias < 0 )
         {
            AV12Totdias = (short)(0) ;
         }
         while ( AV15NDias != AV12Totdias )
         {
            GXv_char7[0] = A396EmprCod ;
            GXv_date15[0] = AV13FecCC ;
            GXv_date16[0] = AV11FecCompCli ;
            new app.pfeclan(remoteHandle, context).execute( GXv_char7, GXv_date15, GXv_date16) ;
            plantib.this.A396EmprCod = GXv_char7[0] ;
            plantib.this.AV13FecCC = GXv_date15[0] ;
            plantib.this.AV11FecCompCli = GXv_date16[0] ;
            AV15NDias = (short)(AV15NDias+1) ;
            AV13FecCC = AV11FecCompCli ;
         }
         A158BarFecFpr = AV11FecCompCli ;
         A1003BarFecLan = AV9FechaLan ;
         n1003BarFecLan = false ;
         A146BarEst = (byte)(0) ;
         A2442BarBulEnE = AV12Totdias ;
         n2442BarBulEnE = false ;
         /* Execute user subroutine: 'CARGAS' */
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
         AV8MaqCod = GXutil.substring( AV8MaqCod, 1, 4) ;
         /* Execute user subroutine: 'CARGAS' */
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
         GXv_char7[0] = A396EmprCod ;
         GXv_date16[0] = AV9FechaLan ;
         GXv_decimal9[0] = A166BarKgm ;
         GXv_int13[0] = (short)(A898BarPieNDes) ;
         GXv_char4[0] = A2010BarTipDis ;
         GXv_char3[0] = A180BarMaqCod ;
         GXv_int14[0] = A129BarCod ;
         GXv_int17[0] = A132BarCodReo ;
         GXv_char1[0] = A130BarCodPar ;
         new app.pnewkgl(remoteHandle, context).execute( GXv_char7, GXv_date16, GXv_decimal9, GXv_int13, GXv_char4, GXv_char3, GXv_int14, GXv_int17, GXv_char1) ;
         plantib.this.A396EmprCod = GXv_char7[0] ;
         plantib.this.AV9FechaLan = GXv_date16[0] ;
         plantib.this.A166BarKgm = GXv_decimal9[0] ;
         plantib.this.A898BarPieNDes = GXv_int13[0] ;
         plantib.this.A2010BarTipDis = GXv_char4[0] ;
         plantib.this.A180BarMaqCod = GXv_char3[0] ;
         plantib.this.A129BarCod = GXv_int14[0] ;
         plantib.this.A132BarCodReo = GXv_int17[0] ;
         plantib.this.A130BarCodPar = GXv_char1[0] ;
         /* Using cursor P00NH4 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A122BarAgrPar = P00NH4_A122BarAgrPar[0] ;
            A124BarAgrReo = P00NH4_A124BarAgrReo[0] ;
            A119BarAgrCod = P00NH4_A119BarAgrCod[0] ;
            AV17BarAgrCod = A119BarAgrCod ;
            AV18BarAgrReo = A124BarAgrReo ;
            AV19BarAgrPar = A122BarAgrPar ;
            GXv_char7[0] = A396EmprCod ;
            GXv_date16[0] = AV9FechaLan ;
            GXv_int14[0] = AV17BarAgrCod ;
            GXv_int17[0] = AV18BarAgrReo ;
            GXv_char4[0] = AV19BarAgrPar ;
            GXv_int13[0] = AV20LanBroDia ;
            GXv_int12[0] = AV24MaxConLan ;
            new app.pkgltib(remoteHandle, context).execute( GXv_char7, GXv_date16, GXv_int14, GXv_int17, GXv_char4, GXv_int13, GXv_int12) ;
            plantib.this.A396EmprCod = GXv_char7[0] ;
            plantib.this.AV9FechaLan = GXv_date16[0] ;
            plantib.this.AV17BarAgrCod = GXv_int14[0] ;
            plantib.this.AV18BarAgrReo = GXv_int17[0] ;
            plantib.this.AV19BarAgrPar = GXv_char4[0] ;
            plantib.this.AV20LanBroDia = GXv_int13[0] ;
            plantib.this.AV24MaxConLan = GXv_int12[0] ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor P00NH5 */
         pr_default.execute(2, new Object[] {A2447BarFecEnE, A158BarFecFpr, Boolean.valueOf(n1003BarFecLan), A1003BarFecLan, Byte.valueOf(A146BarEst), Boolean.valueOf(n2442BarBulEnE), Short.valueOf(A2442BarBulEnE), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "Proceso de Planificación Realizado", "") );
      cleanup();
   }

   public void S111( )
   {
      /* 'CARGAS' Routine */
      returnInSub = false ;
      n3000MaqNhd = false ;
      /* Optimized UPDATE. */
      /* Using cursor P00NH6 */
      pr_default.execute(3, new Object[] {AV10EmprCod, AV8MaqCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQUIN");
      /* End optimized UPDATE. */
   }

   public void S121( )
   {
      /* 'MAQUIN' Routine */
      returnInSub = false ;
      /* Using cursor P00NH7 */
      pr_default.execute(4, new Object[] {AV10EmprCod, AV8MaqCod});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A602MaqCod = P00NH7_A602MaqCod[0] ;
         A3000MaqNhd = P00NH7_A3000MaqNhd[0] ;
         n3000MaqNhd = P00NH7_n3000MaqNhd[0] ;
         AV23MaqNhd = A3000MaqNhd ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP0[0] = plantib.this.A396EmprCod;
      this.aP1[0] = plantib.this.A129BarCod;
      this.aP2[0] = plantib.this.A132BarCodReo;
      this.aP3[0] = plantib.this.A130BarCodPar;
      this.aP4[0] = plantib.this.AV9FechaLan;
      Application.commitDataStores(context, remoteHandle, pr_default, "plantib");
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
      P00NH3_A361DisCod = new int[1] ;
      P00NH3_A396EmprCod = new String[] {""} ;
      P00NH3_A129BarCod = new int[1] ;
      P00NH3_A132BarCodReo = new byte[1] ;
      P00NH3_A130BarCodPar = new String[] {""} ;
      P00NH3_A180BarMaqCod = new String[] {""} ;
      P00NH3_A252CliCod = new int[1] ;
      P00NH3_n252CliCod = new boolean[] {false} ;
      P00NH3_A212BarSer = new String[] {""} ;
      P00NH3_A1500BarNMtr = new String[] {""} ;
      P00NH3_A3311BarManCod1 = new short[1] ;
      P00NH3_A1157TipConCod = new short[1] ;
      P00NH3_n1157TipConCod = new boolean[] {false} ;
      P00NH3_A217BarTipArt = new short[1] ;
      P00NH3_n217BarTipArt = new boolean[] {false} ;
      P00NH3_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P00NH3_A2447BarFecEnE = new java.util.Date[] {GXutil.nullDate()} ;
      P00NH3_A142BarDiaP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00NH3_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P00NH3_A1003BarFecLan = new java.util.Date[] {GXutil.nullDate()} ;
      P00NH3_n1003BarFecLan = new boolean[] {false} ;
      P00NH3_A146BarEst = new byte[1] ;
      P00NH3_A2442BarBulEnE = new short[1] ;
      P00NH3_n2442BarBulEnE = new boolean[] {false} ;
      P00NH3_A2010BarTipDis = new String[] {""} ;
      P00NH3_A898BarPieNDes = new int[1] ;
      P00NH3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A180BarMaqCod = "" ;
      A212BarSer = "" ;
      A1500BarNMtr = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A2447BarFecEnE = GXutil.nullDate() ;
      A142BarDiaP = DecimalUtil.ZERO ;
      A158BarFecFpr = GXutil.nullDate() ;
      A1003BarFecLan = GXutil.nullDate() ;
      A2010BarTipDis = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      AV21MaxKilLan = DecimalUtil.ZERO ;
      AV10EmprCod = "" ;
      AV8MaqCod = "" ;
      GXv_int2 = new int[1] ;
      GXv_int5 = new short[1] ;
      GXv_int6 = new short[1] ;
      GXv_int8 = new short[1] ;
      GXv_int10 = new short[1] ;
      GXv_int11 = new short[1] ;
      AV13FecCC = GXutil.nullDate() ;
      GXv_date15 = new java.util.Date[1] ;
      AV11FecCompCli = GXutil.nullDate() ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_char3 = new String[1] ;
      GXv_char1 = new String[1] ;
      P00NH4_A396EmprCod = new String[] {""} ;
      P00NH4_A129BarCod = new int[1] ;
      P00NH4_A132BarCodReo = new byte[1] ;
      P00NH4_A130BarCodPar = new String[] {""} ;
      P00NH4_A122BarAgrPar = new String[] {""} ;
      P00NH4_A124BarAgrReo = new byte[1] ;
      P00NH4_A119BarAgrCod = new int[1] ;
      A122BarAgrPar = "" ;
      AV19BarAgrPar = "" ;
      GXv_char7 = new String[1] ;
      GXv_date16 = new java.util.Date[1] ;
      GXv_int14 = new int[1] ;
      GXv_int17 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_int13 = new short[1] ;
      GXv_int12 = new short[1] ;
      P00NH7_A602MaqCod = new String[] {""} ;
      P00NH7_A396EmprCod = new String[] {""} ;
      P00NH7_A3000MaqNhd = new short[1] ;
      P00NH7_n3000MaqNhd = new boolean[] {false} ;
      A602MaqCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plantib__default(),
         new Object[] {
             new Object[] {
            P00NH3_A361DisCod, P00NH3_A396EmprCod, P00NH3_A129BarCod, P00NH3_A132BarCodReo, P00NH3_A130BarCodPar, P00NH3_A180BarMaqCod, P00NH3_A252CliCod, P00NH3_n252CliCod, P00NH3_A212BarSer, P00NH3_A1500BarNMtr,
            P00NH3_A3311BarManCod1, P00NH3_A1157TipConCod, P00NH3_n1157TipConCod, P00NH3_A217BarTipArt, P00NH3_n217BarTipArt, P00NH3_A159BarFecGen, P00NH3_A2447BarFecEnE, P00NH3_A142BarDiaP, P00NH3_A158BarFecFpr, P00NH3_A1003BarFecLan,
            P00NH3_n1003BarFecLan, P00NH3_A146BarEst, P00NH3_A2442BarBulEnE, P00NH3_n2442BarBulEnE, P00NH3_A2010BarTipDis, P00NH3_A898BarPieNDes, P00NH3_A166BarKgm
            }
            , new Object[] {
            P00NH4_A396EmprCod, P00NH4_A129BarCod, P00NH4_A132BarCodReo, P00NH4_A130BarCodPar, P00NH4_A122BarAgrPar, P00NH4_A124BarAgrReo, P00NH4_A119BarAgrCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00NH7_A602MaqCod, P00NH7_A396EmprCod, P00NH7_A3000MaqNhd, P00NH7_n3000MaqNhd
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A146BarEst ;
   private byte A124BarAgrReo ;
   private byte AV18BarAgrReo ;
   private byte GXv_int17[] ;
   private short A3311BarManCod1 ;
   private short A1157TipConCod ;
   private short A217BarTipArt ;
   private short A2442BarBulEnE ;
   private short AV22NParam ;
   private short AV20LanBroDia ;
   private short GXv_int5[] ;
   private short GXv_int6[] ;
   private short AV23MaqNhd ;
   private short GXv_int8[] ;
   private short GXv_int10[] ;
   private short GXv_int11[] ;
   private short AV24MaxConLan ;
   private short AV12Totdias ;
   private short AV15NDias ;
   private short GXv_int13[] ;
   private short GXv_int12[] ;
   private short A3000MaqNhd ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A898BarPieNDes ;
   private int GXv_int2[] ;
   private int A119BarAgrCod ;
   private int AV17BarAgrCod ;
   private int GXv_int14[] ;
   private java.math.BigDecimal A142BarDiaP ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV21MaxKilLan ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A180BarMaqCod ;
   private String A212BarSer ;
   private String A1500BarNMtr ;
   private String A2010BarTipDis ;
   private String AV10EmprCod ;
   private String AV8MaqCod ;
   private String GXv_char3[] ;
   private String GXv_char1[] ;
   private String A122BarAgrPar ;
   private String AV19BarAgrPar ;
   private String GXv_char7[] ;
   private String GXv_char4[] ;
   private String A602MaqCod ;
   private java.util.Date AV9FechaLan ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A2447BarFecEnE ;
   private java.util.Date A158BarFecFpr ;
   private java.util.Date A1003BarFecLan ;
   private java.util.Date AV13FecCC ;
   private java.util.Date GXv_date15[] ;
   private java.util.Date AV11FecCompCli ;
   private java.util.Date GXv_date16[] ;
   private boolean n252CliCod ;
   private boolean n1157TipConCod ;
   private boolean n217BarTipArt ;
   private boolean n1003BarFecLan ;
   private boolean n2442BarBulEnE ;
   private boolean returnInSub ;
   private boolean n3000MaqNhd ;
   private java.util.Date[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private int[] P00NH3_A361DisCod ;
   private String[] P00NH3_A396EmprCod ;
   private int[] P00NH3_A129BarCod ;
   private byte[] P00NH3_A132BarCodReo ;
   private String[] P00NH3_A130BarCodPar ;
   private String[] P00NH3_A180BarMaqCod ;
   private int[] P00NH3_A252CliCod ;
   private boolean[] P00NH3_n252CliCod ;
   private String[] P00NH3_A212BarSer ;
   private String[] P00NH3_A1500BarNMtr ;
   private short[] P00NH3_A3311BarManCod1 ;
   private short[] P00NH3_A1157TipConCod ;
   private boolean[] P00NH3_n1157TipConCod ;
   private short[] P00NH3_A217BarTipArt ;
   private boolean[] P00NH3_n217BarTipArt ;
   private java.util.Date[] P00NH3_A159BarFecGen ;
   private java.util.Date[] P00NH3_A2447BarFecEnE ;
   private java.math.BigDecimal[] P00NH3_A142BarDiaP ;
   private java.util.Date[] P00NH3_A158BarFecFpr ;
   private java.util.Date[] P00NH3_A1003BarFecLan ;
   private boolean[] P00NH3_n1003BarFecLan ;
   private byte[] P00NH3_A146BarEst ;
   private short[] P00NH3_A2442BarBulEnE ;
   private boolean[] P00NH3_n2442BarBulEnE ;
   private String[] P00NH3_A2010BarTipDis ;
   private int[] P00NH3_A898BarPieNDes ;
   private java.math.BigDecimal[] P00NH3_A166BarKgm ;
   private String[] P00NH4_A396EmprCod ;
   private int[] P00NH4_A129BarCod ;
   private byte[] P00NH4_A132BarCodReo ;
   private String[] P00NH4_A130BarCodPar ;
   private String[] P00NH4_A122BarAgrPar ;
   private byte[] P00NH4_A124BarAgrReo ;
   private int[] P00NH4_A119BarAgrCod ;
   private String[] P00NH7_A602MaqCod ;
   private String[] P00NH7_A396EmprCod ;
   private short[] P00NH7_A3000MaqNhd ;
   private boolean[] P00NH7_n3000MaqNhd ;
}

final  class plantib__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00NH3", "SELECT T1.DisCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarMaqCod, T1.CliCod, T1.BarSer, T1.BarNMtr, T1.BarManCod1, T2.TipConCod, T1.BarTipArt, T1.BarFecGen, T1.BarFecEnE, T1.BarDiaP, T1.BarFecFpr, T1.BarFecLan, T1.BarEst, T1.BarBulEnE, T1.BarTipDis, COALESCE( T3.BarPieNDes, 0) AS BarPieNDes, COALESCE( T3.BarKgm, 0) AS BarKgm FROM ((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00NH4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrPar, BarAgrReo, BarAgrCod FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00NH5", "UPDATE TXPBARCAD SET BarFecEnE=?, BarFecFpr=?, BarFecLan=?, BarEst=?, BarBulEnE=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new UpdateCursor("P00NH6", "UPDATE TXPMAQUIN SET MaqNhd=MaqNhd + 1  WHERE EmprCod = ? and MaqCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMAQUIN")
         ,new ForEachCursor("P00NH7", "SELECT MaqCod, EmprCod, MaqNhd FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((String[]) buf[9])[0] = rslt.getString(9, 10);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(12);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(13);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(14);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(15,1);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(16);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(17);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(18);
               ((short[]) buf[22])[0] = rslt.getShort(19);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(20, 1);
               ((int[]) buf[25])[0] = rslt.getInt(21);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(22,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setDate(2, (java.util.Date)parms[1]);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[3]);
               }
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[6]).shortValue());
               }
               stmt.setString(6, (String)parms[7], 3);
               stmt.setInt(7, ((Number) parms[8]).intValue());
               stmt.setByte(8, ((Number) parms[9]).byteValue());
               stmt.setString(9, (String)parms[10], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

