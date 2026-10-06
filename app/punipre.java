package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class punipre extends GXProcedure
{
   public punipre( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( punipre.class ), "" );
   }

   public punipre( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 )
   {
      punipre.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      punipre.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      punipre.this.AV8AlbProcod = aP1[0];
      this.aP1 = aP1;
      punipre.this.AV9BarCod = aP2[0];
      this.aP2 = aP2;
      punipre.this.AV10BarCodReo = aP3[0];
      this.aP3 = aP3;
      punipre.this.AV11BarCodPar = aP4[0];
      this.aP4 = aP4;
      punipre.this.AV17PreUni = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02D62 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV9BarCod), Byte.valueOf(AV10BarCodReo), AV11BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P02D62_A130BarCodPar[0] ;
         A132BarCodReo = P02D62_A132BarCodReo[0] ;
         A129BarCod = P02D62_A129BarCod[0] ;
         A361DisCod = P02D62_A361DisCod[0] ;
         AV12DisCod = A361DisCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV16Ok, httpContext.getMessage( "S", "")) == 0 )
      {
         httpContext.wjLoc = formatLink("app.tpreenc", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim(AV15Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV12DisCod,8,0))}, new String[] {"Mode","EmprCod","DisCod"})  ;
         Application.commitDataStores(context, remoteHandle, pr_default, "punipre");
         GXv_char1[0] = AV15Emprcod ;
         GXv_int2[0] = AV12DisCod ;
         new app.ppreuni3(remoteHandle, context).execute( GXv_char1, GXv_int2) ;
         punipre.this.AV15Emprcod = GXv_char1[0] ;
         punipre.this.AV12DisCod = GXv_int2[0] ;
         Application.commitDataStores(context, remoteHandle, pr_default, "punipre");
         if ( GXutil.strcmp(AV17PreUni, httpContext.getMessage( "S", "")) == 0 )
         {
            /* Using cursor P02D63 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV12DisCod)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A361DisCod = P02D63_A361DisCod[0] ;
               A388DisPreKgm = P02D63_A388DisPreKgm[0] ;
               A389DisPreMtr = P02D63_A389DisPreMtr[0] ;
               AV13DisPreKgm = A388DisPreKgm ;
               AV14DisPreMtr = A389DisPreMtr ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(1);
            /* Using cursor P02D64 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV9BarCod), Byte.valueOf(AV10BarCodReo), AV11BarCodPar});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A30AlbProCod = P02D64_A30AlbProCod[0] ;
               A129BarCod = P02D64_A129BarCod[0] ;
               A132BarCodReo = P02D64_A132BarCodReo[0] ;
               A130BarCodPar = P02D64_A130BarCodPar[0] ;
               A33AlbProEst = P02D64_A33AlbProEst[0] ;
               A1240GuiFasLin = P02D64_A1240GuiFasLin[0] ;
               A33AlbProEst = P02D64_A33AlbProEst[0] ;
               if ( A33AlbProEst != 2 )
               {
                  /* Using cursor P02D65 */
                  pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            /* Using cursor P02D66 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV9BarCod), Byte.valueOf(AV10BarCodReo), AV11BarCodPar});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A30AlbProCod = P02D66_A30AlbProCod[0] ;
               A130BarCodPar = P02D66_A130BarCodPar[0] ;
               A132BarCodReo = P02D66_A132BarCodReo[0] ;
               A129BarCod = P02D66_A129BarCod[0] ;
               A33AlbProEst = P02D66_A33AlbProEst[0] ;
               A1262BarPreKgm = P02D66_A1262BarPreKgm[0] ;
               A1264BarPreMtr = P02D66_A1264BarPreMtr[0] ;
               A32AlbProEsp = P02D66_A32AlbProEsp[0] ;
               A40AlbProRec = P02D66_A40AlbProRec[0] ;
               A33AlbProEst = P02D66_A33AlbProEst[0] ;
               if ( A33AlbProEst != 2 )
               {
                  A1262BarPreKgm = AV13DisPreKgm ;
                  A1264BarPreMtr = AV14DisPreMtr ;
                  A32AlbProEsp = (byte)(10) ;
                  A40AlbProRec = DecimalUtil.doubleToDec(0) ;
               }
               /* Using cursor P02D67 */
               pr_default.execute(5, new Object[] {A1262BarPreKgm, A1264BarPreMtr, Byte.valueOf(A32AlbProEsp), A40AlbProRec, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
               pr_default.readNext(4);
            }
            pr_default.close(4);
         }
         if ( GXutil.strcmp(AV17PreUni, httpContext.getMessage( "N", "")) == 0 )
         {
            /* Using cursor P02D68 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV12DisCod)});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A361DisCod = P02D68_A361DisCod[0] ;
               A388DisPreKgm = P02D68_A388DisPreKgm[0] ;
               A389DisPreMtr = P02D68_A389DisPreMtr[0] ;
               A5252DisAcc = P02D68_A5252DisAcc[0] ;
               A388DisPreKgm = DecimalUtil.doubleToDec(0) ;
               A389DisPreMtr = DecimalUtil.doubleToDec(0) ;
               A5252DisAcc = httpContext.getMessage( "N", "") ;
               /* Using cursor P02D69 */
               pr_default.execute(7, new Object[] {A388DisPreKgm, A389DisPreMtr, A5252DisAcc, A396EmprCod, Integer.valueOf(A361DisCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(6);
            Application.commitDataStores(context, remoteHandle, pr_default, "punipre");
            GXv_char1[0] = AV15Emprcod ;
            GXv_int2[0] = AV12DisCod ;
            new app.ppreuni3(remoteHandle, context).execute( GXv_char1, GXv_int2) ;
            punipre.this.AV15Emprcod = GXv_char1[0] ;
            punipre.this.AV12DisCod = GXv_int2[0] ;
            Application.commitDataStores(context, remoteHandle, pr_default, "punipre");
            /* Using cursor P02D610 */
            pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(AV9BarCod), Byte.valueOf(AV10BarCodReo), AV11BarCodPar});
            while ( (pr_default.getStatus(8) != 101) )
            {
               A130BarCodPar = P02D610_A130BarCodPar[0] ;
               A132BarCodReo = P02D610_A132BarCodReo[0] ;
               A129BarCod = P02D610_A129BarCod[0] ;
               A33AlbProEst = P02D610_A33AlbProEst[0] ;
               A30AlbProCod = P02D610_A30AlbProCod[0] ;
               A33AlbProEst = P02D610_A33AlbProEst[0] ;
               if ( A33AlbProEst != 2 )
               {
                  AV22AlbProduc = A30AlbProCod ;
                  GXv_char1[0] = A396EmprCod ;
                  GXv_int3[0] = AV22AlbProduc ;
                  GXv_int2[0] = AV9BarCod ;
                  GXv_int4[0] = AV10BarCodReo ;
                  GXv_char5[0] = AV11BarCodPar ;
                  new app.pcopfas(remoteHandle, context).execute( GXv_char1, GXv_int3, GXv_int2, GXv_int4, GXv_char5) ;
                  punipre.this.A396EmprCod = GXv_char1[0] ;
                  punipre.this.AV22AlbProduc = GXv_int3[0] ;
                  punipre.this.AV9BarCod = GXv_int2[0] ;
                  punipre.this.AV10BarCodReo = GXv_int4[0] ;
                  punipre.this.AV11BarCodPar = GXv_char5[0] ;
               }
               pr_default.readNext(8);
            }
            pr_default.close(8);
            Application.commitDataStores(context, remoteHandle, pr_default, "punipre");
            /* Using cursor P02D611 */
            pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(AV9BarCod), Byte.valueOf(AV10BarCodReo), AV11BarCodPar, A396EmprCod, Integer.valueOf(AV9BarCod), Byte.valueOf(AV10BarCodReo), AV11BarCodPar});
            while ( (pr_default.getStatus(9) != 101) )
            {
               A30AlbProCod = P02D611_A30AlbProCod[0] ;
               A130BarCodPar = P02D611_A130BarCodPar[0] ;
               A132BarCodReo = P02D611_A132BarCodReo[0] ;
               A129BarCod = P02D611_A129BarCod[0] ;
               A1262BarPreKgm = P02D611_A1262BarPreKgm[0] ;
               A1264BarPreMtr = P02D611_A1264BarPreMtr[0] ;
               A32AlbProEsp = P02D611_A32AlbProEsp[0] ;
               A40AlbProRec = P02D611_A40AlbProRec[0] ;
               /* Using cursor P02D612 */
               pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               A5253BarAcc = P02D612_A5253BarAcc[0] ;
               /* Using cursor P02D613 */
               pr_default.execute(11, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
               A33AlbProEst = P02D613_A33AlbProEst[0] ;
               if ( A33AlbProEst != 2 )
               {
                  GXv_char5[0] = A396EmprCod ;
                  GXv_int2[0] = A129BarCod ;
                  GXv_int4[0] = A132BarCodReo ;
                  GXv_char1[0] = A130BarCodPar ;
                  GXv_decimal6[0] = AV20BarPreKgm ;
                  GXv_decimal7[0] = AV21BarPreMtr ;
                  GXv_int8[0] = AV18AlbProEsp ;
                  GXv_decimal9[0] = AV19AlbProRec ;
                  new app.pbusprem(remoteHandle, context).execute( GXv_char5, GXv_int2, GXv_int4, GXv_char1, GXv_decimal6, GXv_decimal7, GXv_int8, GXv_decimal9) ;
                  punipre.this.A396EmprCod = GXv_char5[0] ;
                  punipre.this.A129BarCod = GXv_int2[0] ;
                  punipre.this.A132BarCodReo = GXv_int4[0] ;
                  punipre.this.A130BarCodPar = GXv_char1[0] ;
                  punipre.this.AV20BarPreKgm = GXv_decimal6[0] ;
                  punipre.this.AV21BarPreMtr = GXv_decimal7[0] ;
                  punipre.this.AV18AlbProEsp = GXv_int8[0] ;
                  punipre.this.AV19AlbProRec = GXv_decimal9[0] ;
                  A1262BarPreKgm = AV20BarPreKgm ;
                  A1264BarPreMtr = AV21BarPreMtr ;
                  A32AlbProEsp = (byte)(10) ;
                  A40AlbProRec = DecimalUtil.doubleToDec(0) ;
                  A5253BarAcc = AV17PreUni ;
               }
               /* Using cursor P02D614 */
               pr_default.execute(12, new Object[] {A5253BarAcc, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
               /* Using cursor P02D615 */
               pr_default.execute(13, new Object[] {A1262BarPreKgm, A1264BarPreMtr, Byte.valueOf(A32AlbProEsp), A40AlbProRec, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
               pr_default.readNext(9);
            }
            pr_default.close(9);
            pr_default.close(10);
            pr_default.close(11);
            Application.commitDataStores(context, remoteHandle, pr_default, "punipre");
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = punipre.this.A396EmprCod;
      this.aP1[0] = punipre.this.AV8AlbProcod;
      this.aP2[0] = punipre.this.AV9BarCod;
      this.aP3[0] = punipre.this.AV10BarCodReo;
      this.aP4[0] = punipre.this.AV11BarCodPar;
      this.aP5[0] = punipre.this.AV17PreUni;
      Application.commitDataStores(context, remoteHandle, pr_default, "punipre");
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
      P02D62_A396EmprCod = new String[] {""} ;
      P02D62_A130BarCodPar = new String[] {""} ;
      P02D62_A132BarCodReo = new byte[1] ;
      P02D62_A129BarCod = new int[1] ;
      P02D62_A361DisCod = new int[1] ;
      A130BarCodPar = "" ;
      AV16Ok = "" ;
      AV15Emprcod = "" ;
      P02D63_A396EmprCod = new String[] {""} ;
      P02D63_A361DisCod = new int[1] ;
      P02D63_A388DisPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02D63_A389DisPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A388DisPreKgm = DecimalUtil.ZERO ;
      A389DisPreMtr = DecimalUtil.ZERO ;
      AV13DisPreKgm = DecimalUtil.ZERO ;
      AV14DisPreMtr = DecimalUtil.ZERO ;
      P02D64_A30AlbProCod = new long[1] ;
      P02D64_A396EmprCod = new String[] {""} ;
      P02D64_A129BarCod = new int[1] ;
      P02D64_A132BarCodReo = new byte[1] ;
      P02D64_A130BarCodPar = new String[] {""} ;
      P02D64_A33AlbProEst = new byte[1] ;
      P02D64_A1240GuiFasLin = new short[1] ;
      P02D66_A30AlbProCod = new long[1] ;
      P02D66_A396EmprCod = new String[] {""} ;
      P02D66_A130BarCodPar = new String[] {""} ;
      P02D66_A132BarCodReo = new byte[1] ;
      P02D66_A129BarCod = new int[1] ;
      P02D66_A33AlbProEst = new byte[1] ;
      P02D66_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02D66_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02D66_A32AlbProEsp = new byte[1] ;
      P02D66_A40AlbProRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      A40AlbProRec = DecimalUtil.ZERO ;
      P02D68_A396EmprCod = new String[] {""} ;
      P02D68_A361DisCod = new int[1] ;
      P02D68_A388DisPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02D68_A389DisPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02D68_A5252DisAcc = new String[] {""} ;
      A5252DisAcc = "" ;
      P02D610_A396EmprCod = new String[] {""} ;
      P02D610_A130BarCodPar = new String[] {""} ;
      P02D610_A132BarCodReo = new byte[1] ;
      P02D610_A129BarCod = new int[1] ;
      P02D610_A33AlbProEst = new byte[1] ;
      P02D610_A30AlbProCod = new long[1] ;
      GXv_int3 = new long[1] ;
      P02D611_A30AlbProCod = new long[1] ;
      P02D611_A396EmprCod = new String[] {""} ;
      P02D611_A130BarCodPar = new String[] {""} ;
      P02D611_A132BarCodReo = new byte[1] ;
      P02D611_A129BarCod = new int[1] ;
      P02D611_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02D611_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02D611_A32AlbProEsp = new byte[1] ;
      P02D611_A40AlbProRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02D612_A5253BarAcc = new String[] {""} ;
      A5253BarAcc = "" ;
      P02D613_A33AlbProEst = new byte[1] ;
      GXv_char5 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int4 = new byte[1] ;
      GXv_char1 = new String[1] ;
      AV20BarPreKgm = DecimalUtil.ZERO ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      AV21BarPreMtr = DecimalUtil.ZERO ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_int8 = new byte[1] ;
      AV19AlbProRec = DecimalUtil.ZERO ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.punipre__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.punipre__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.punipre__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.punipre__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.punipre__default(),
         new Object[] {
             new Object[] {
            P02D62_A396EmprCod, P02D62_A130BarCodPar, P02D62_A132BarCodReo, P02D62_A129BarCod, P02D62_A361DisCod
            }
            , new Object[] {
            P02D63_A396EmprCod, P02D63_A361DisCod, P02D63_A388DisPreKgm, P02D63_A389DisPreMtr
            }
            , new Object[] {
            P02D64_A30AlbProCod, P02D64_A396EmprCod, P02D64_A129BarCod, P02D64_A132BarCodReo, P02D64_A130BarCodPar, P02D64_A33AlbProEst, P02D64_A1240GuiFasLin
            }
            , new Object[] {
            }
            , new Object[] {
            P02D66_A30AlbProCod, P02D66_A396EmprCod, P02D66_A130BarCodPar, P02D66_A132BarCodReo, P02D66_A129BarCod, P02D66_A33AlbProEst, P02D66_A1262BarPreKgm, P02D66_A1264BarPreMtr, P02D66_A32AlbProEsp, P02D66_A40AlbProRec
            }
            , new Object[] {
            }
            , new Object[] {
            P02D68_A396EmprCod, P02D68_A361DisCod, P02D68_A388DisPreKgm, P02D68_A389DisPreMtr, P02D68_A5252DisAcc
            }
            , new Object[] {
            }
            , new Object[] {
            P02D610_A396EmprCod, P02D610_A130BarCodPar, P02D610_A132BarCodReo, P02D610_A129BarCod, P02D610_A33AlbProEst, P02D610_A30AlbProCod
            }
            , new Object[] {
            P02D611_A30AlbProCod, P02D611_A396EmprCod, P02D611_A130BarCodPar, P02D611_A132BarCodReo, P02D611_A129BarCod, P02D611_A1262BarPreKgm, P02D611_A1264BarPreMtr, P02D611_A32AlbProEsp, P02D611_A40AlbProRec
            }
            , new Object[] {
            P02D612_A5253BarAcc
            }
            , new Object[] {
            P02D613_A33AlbProEst
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

   private byte AV10BarCodReo ;
   private byte A132BarCodReo ;
   private byte A33AlbProEst ;
   private byte A32AlbProEsp ;
   private byte GXv_int4[] ;
   private byte AV18AlbProEsp ;
   private byte GXv_int8[] ;
   private short A1240GuiFasLin ;
   private short Gx_err ;
   private int AV9BarCod ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int AV12DisCod ;
   private int GXv_int2[] ;
   private long AV8AlbProcod ;
   private long A30AlbProCod ;
   private long AV22AlbProduc ;
   private long GXv_int3[] ;
   private java.math.BigDecimal A388DisPreKgm ;
   private java.math.BigDecimal A389DisPreMtr ;
   private java.math.BigDecimal AV13DisPreKgm ;
   private java.math.BigDecimal AV14DisPreMtr ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A1264BarPreMtr ;
   private java.math.BigDecimal A40AlbProRec ;
   private java.math.BigDecimal AV20BarPreKgm ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal AV21BarPreMtr ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal AV19AlbProRec ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private String A396EmprCod ;
   private String AV11BarCodPar ;
   private String AV17PreUni ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String AV16Ok ;
   private String AV15Emprcod ;
   private String A5252DisAcc ;
   private String A5253BarAcc ;
   private String GXv_char5[] ;
   private String GXv_char1[] ;
   private String[] aP5 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P02D62_A396EmprCod ;
   private String[] P02D62_A130BarCodPar ;
   private byte[] P02D62_A132BarCodReo ;
   private int[] P02D62_A129BarCod ;
   private int[] P02D62_A361DisCod ;
   private String[] P02D63_A396EmprCod ;
   private int[] P02D63_A361DisCod ;
   private java.math.BigDecimal[] P02D63_A388DisPreKgm ;
   private java.math.BigDecimal[] P02D63_A389DisPreMtr ;
   private long[] P02D64_A30AlbProCod ;
   private String[] P02D64_A396EmprCod ;
   private int[] P02D64_A129BarCod ;
   private byte[] P02D64_A132BarCodReo ;
   private String[] P02D64_A130BarCodPar ;
   private byte[] P02D64_A33AlbProEst ;
   private short[] P02D64_A1240GuiFasLin ;
   private long[] P02D66_A30AlbProCod ;
   private String[] P02D66_A396EmprCod ;
   private String[] P02D66_A130BarCodPar ;
   private byte[] P02D66_A132BarCodReo ;
   private int[] P02D66_A129BarCod ;
   private byte[] P02D66_A33AlbProEst ;
   private java.math.BigDecimal[] P02D66_A1262BarPreKgm ;
   private java.math.BigDecimal[] P02D66_A1264BarPreMtr ;
   private byte[] P02D66_A32AlbProEsp ;
   private java.math.BigDecimal[] P02D66_A40AlbProRec ;
   private String[] P02D68_A396EmprCod ;
   private int[] P02D68_A361DisCod ;
   private java.math.BigDecimal[] P02D68_A388DisPreKgm ;
   private java.math.BigDecimal[] P02D68_A389DisPreMtr ;
   private String[] P02D68_A5252DisAcc ;
   private String[] P02D610_A396EmprCod ;
   private String[] P02D610_A130BarCodPar ;
   private byte[] P02D610_A132BarCodReo ;
   private int[] P02D610_A129BarCod ;
   private byte[] P02D610_A33AlbProEst ;
   private long[] P02D610_A30AlbProCod ;
   private long[] P02D611_A30AlbProCod ;
   private String[] P02D611_A396EmprCod ;
   private String[] P02D611_A130BarCodPar ;
   private byte[] P02D611_A132BarCodReo ;
   private int[] P02D611_A129BarCod ;
   private java.math.BigDecimal[] P02D611_A1262BarPreKgm ;
   private java.math.BigDecimal[] P02D611_A1264BarPreMtr ;
   private byte[] P02D611_A32AlbProEsp ;
   private java.math.BigDecimal[] P02D611_A40AlbProRec ;
   private String[] P02D612_A5253BarAcc ;
   private byte[] P02D613_A33AlbProEst ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class punipre__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class punipre__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class punipre__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class punipre__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class punipre__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02D62", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, DisCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02D63", "SELECT EmprCod, DisCod, DisPreKgm, DisPreMtr FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02D64", "SELECT T1.AlbProCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.AlbProEst, T1.GuiFasLin FROM (TXPALBFAS T1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.GuiFasLin  FOR UPDATE OF T1.AlbProCod NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02D65", "DELETE FROM TXPALBFAS  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND GuiFasLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
         ,new ForEachCursor("P02D66", "SELECT T1.AlbProCod, T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.AlbProEst, T1.BarPreKgm, T1.BarPreMtr, T1.AlbProEsp, T1.AlbProRec FROM (TXPALBBAR T1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar  FOR UPDATE OF T1.BarPreKgm, T1.BarPreMtr, T1.AlbProEsp, T1.AlbProRec NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02D67", "UPDATE TXPALBBAR SET BarPreKgm=?, BarPreMtr=?, AlbProEsp=?, AlbProRec=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
         ,new ForEachCursor("P02D68", "SELECT EmprCod, DisCod, DisPreKgm, DisPreMtr, DisAcc FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod  FOR UPDATE OF DisPreKgm, DisPreMtr, DisAcc NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02D69", "UPDATE TXPDISPOS SET DisPreKgm=?, DisPreMtr=?, DisAcc=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
         ,new ForEachCursor("P02D610", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.AlbProEst, T1.AlbProCod FROM (TXPALBBAR T1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02D611", "SELECT AlbProCod, EmprCod, BarCodPar, BarCodReo, BarCod, BarPreKgm, BarPreMtr, AlbProEsp, AlbProRec FROM TXPALBBAR WHERE (EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) AND (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar  FOR UPDATE OF BarPreKgm, BarPreMtr, AlbProEsp, AlbProRec NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02D612", "SELECT BarAcc FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF BarAcc NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02D613", "SELECT AlbProEst FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02D614", "UPDATE TXPBARCAD SET BarAcc=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new UpdateCursor("P02D615", "UPDATE TXPALBBAR SET BarPreKgm=?, BarPreMtr=?, AlbProEsp=?, AlbProRec=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               return;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               return;
            case 11 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 13 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 1);
               return;
      }
   }

}

