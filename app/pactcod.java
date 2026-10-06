package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pactcod extends GXProcedure
{
   public pactcod( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pactcod.class ), "" );
   }

   public pactcod( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 )
   {
      pactcod.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 )
   {
      pactcod.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pactcod.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pactcod.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pactcod.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pactcod.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01IF2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1261BarAlbKgmE = P01IF2_A1261BarAlbKgmE[0] ;
         /* Using cursor P01IF3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A2453BarEntAca = P01IF3_A2453BarEntAca[0] ;
         n2453BarEntAca = P01IF3_n2453BarEntAca[0] ;
         A217BarTipArt = P01IF3_A217BarTipArt[0] ;
         n217BarTipArt = P01IF3_n217BarTipArt[0] ;
         A252CliCod = P01IF3_A252CliCod[0] ;
         n252CliCod = P01IF3_n252CliCod[0] ;
         A212BarSer = P01IF3_A212BarSer[0] ;
         A218BarTipCol = P01IF3_A218BarTipCol[0] ;
         A2830BarIntPer = P01IF3_A2830BarIntPer[0] ;
         /* Using cursor P01IF4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (GXutil.strcmp("", A2453BarEntAca)==0) )
         {
            AV9Ceros2 = "00" ;
            AV21Var_n_2 = (byte)(A217BarTipArt) ;
            AV8Cod_art_a = GXutil.str( AV21Var_n_2, 2, 0) ;
            AV8Cod_art_a = GXutil.ltrim( GXutil.rtrim( AV8Cod_art_a)) ;
            AV10Lenvar = (byte)(GXutil.len( AV8Cod_art_a)) ;
            AV10Lenvar = (byte)(2-AV10Lenvar) ;
            AV11Cod_art2 = GXutil.substring( AV9Ceros2, 1, AV10Lenvar) + AV8Cod_art_a ;
            AV19CliCod = A252CliCod ;
            AV20ArtCod = A212BarSer ;
            /* Execute user subroutine: 'ARTICU' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               pr_default.close(1);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV21Var_n_2 = (byte)(AV17ClasCod) ;
            AV8Cod_art_a = GXutil.str( AV21Var_n_2, 2, 0) ;
            AV8Cod_art_a = GXutil.ltrim( GXutil.rtrim( AV8Cod_art_a)) ;
            AV10Lenvar = (byte)(GXutil.len( AV8Cod_art_a)) ;
            AV10Lenvar = (byte)(2-AV10Lenvar) ;
            AV12Cod_art3 = GXutil.substring( AV9Ceros2, 1, AV10Lenvar) + AV8Cod_art_a ;
            AV8Cod_art_a = GXutil.str( A218BarTipCol, 2, 0) ;
            AV8Cod_art_a = GXutil.ltrim( GXutil.rtrim( AV8Cod_art_a)) ;
            AV10Lenvar = (byte)(GXutil.len( AV8Cod_art_a)) ;
            AV10Lenvar = (byte)(2-AV10Lenvar) ;
            AV13Cod_art4 = GXutil.substring( AV9Ceros2, 1, AV10Lenvar) + AV8Cod_art_a ;
            AV8Cod_art_a = GXutil.str( A2830BarIntPer, 2, 0) ;
            AV8Cod_art_a = GXutil.ltrim( GXutil.rtrim( AV8Cod_art_a)) ;
            AV10Lenvar = (byte)(GXutil.len( AV8Cod_art_a)) ;
            AV10Lenvar = (byte)(2-AV10Lenvar) ;
            AV14Cod_art5 = GXutil.substring( AV9Ceros2, 1, AV10Lenvar) + AV8Cod_art_a ;
            /* Using cursor P01IF5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A761ProFasLin = P01IF5_A761ProFasLin[0] ;
               n761ProFasLin = P01IF5_n761ProFasLin[0] ;
               A758ProCod = P01IF5_A758ProCod[0] ;
               AV25TipAca = GXutil.substring( A758ProCod, 1, 3) ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(3);
            }
            pr_default.close(3);
            AV15Cod_art6 = AV25TipAca ;
            AV16Cod_art7 = "0" ;
            A2453BarEntAca = httpContext.getMessage( "*AM", "") + AV11Cod_art2 + AV12Cod_art3 + AV13Cod_art4 + AV14Cod_art5 + AV15Cod_art6 + AV16Cod_art7 ;
            n2453BarEntAca = false ;
         }
         else
         {
            AV18Cod_Art = A2453BarEntAca ;
            if ( GXutil.strcmp(GXutil.substring( AV18Cod_Art, 16, 1), httpContext.getMessage( "M", "")) == 0 )
            {
            }
            else
            {
               AV9Ceros2 = "00" ;
               AV8Cod_art_a = GXutil.str( A217BarTipArt, 2, 0) ;
               AV8Cod_art_a = GXutil.ltrim( GXutil.rtrim( AV8Cod_art_a)) ;
               AV10Lenvar = (byte)(GXutil.len( AV8Cod_art_a)) ;
               AV10Lenvar = (byte)(2-AV10Lenvar) ;
               AV11Cod_art2 = GXutil.substring( AV9Ceros2, 1, AV10Lenvar) + AV8Cod_art_a ;
               AV19CliCod = A252CliCod ;
               AV20ArtCod = A212BarSer ;
               /* Execute user subroutine: 'ARTICU' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(2);
                  pr_default.close(1);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               AV8Cod_art_a = GXutil.str( AV17ClasCod, 2, 0) ;
               AV8Cod_art_a = GXutil.ltrim( GXutil.rtrim( AV8Cod_art_a)) ;
               AV10Lenvar = (byte)(GXutil.len( AV8Cod_art_a)) ;
               AV10Lenvar = (byte)(2-AV10Lenvar) ;
               AV12Cod_art3 = GXutil.substring( AV9Ceros2, 1, AV10Lenvar) + AV8Cod_art_a ;
               AV8Cod_art_a = GXutil.str( A218BarTipCol, 2, 0) ;
               AV8Cod_art_a = GXutil.ltrim( GXutil.rtrim( AV8Cod_art_a)) ;
               AV10Lenvar = (byte)(GXutil.len( AV8Cod_art_a)) ;
               AV10Lenvar = (byte)(2-AV10Lenvar) ;
               AV13Cod_art4 = GXutil.substring( AV9Ceros2, 1, AV10Lenvar) + AV8Cod_art_a ;
               AV8Cod_art_a = GXutil.str( A2830BarIntPer, 2, 0) ;
               AV8Cod_art_a = GXutil.ltrim( GXutil.rtrim( AV8Cod_art_a)) ;
               AV10Lenvar = (byte)(GXutil.len( AV8Cod_art_a)) ;
               AV10Lenvar = (byte)(2-AV10Lenvar) ;
               AV14Cod_art5 = GXutil.substring( AV9Ceros2, 1, AV10Lenvar) + AV8Cod_art_a ;
               /* Using cursor P01IF6 */
               pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               while ( (pr_default.getStatus(4) != 101) )
               {
                  A761ProFasLin = P01IF6_A761ProFasLin[0] ;
                  n761ProFasLin = P01IF6_n761ProFasLin[0] ;
                  A758ProCod = P01IF6_A758ProCod[0] ;
                  AV25TipAca = GXutil.substring( A758ProCod, 1, 3) ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
                  pr_default.readNext(4);
               }
               pr_default.close(4);
               AV15Cod_art6 = AV25TipAca ;
               AV16Cod_art7 = "0" ;
               A2453BarEntAca = httpContext.getMessage( "*AM", "") + AV11Cod_art2 + AV12Cod_art3 + AV13Cod_art4 + AV14Cod_art5 + AV15Cod_art6 + AV16Cod_art7 ;
               n2453BarEntAca = false ;
            }
         }
         /* Using cursor P01IF7 */
         pr_default.execute(5, new Object[] {Boolean.valueOf(n2453BarEntAca), A2453BarEntAca, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      pr_default.close(1);
      pr_default.close(2);
      cleanup();
   }

   public void S111( )
   {
      /* 'ARTICU' Routine */
      returnInSub = false ;
      AV17ClasCod = (short)(0) ;
      /* Using cursor P01IF8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV19CliCod), AV20ArtCod});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A65ArtCod = P01IF8_A65ArtCod[0] ;
         A252CliCod = P01IF8_A252CliCod[0] ;
         n252CliCod = P01IF8_n252CliCod[0] ;
         A4295ClasCod = P01IF8_A4295ClasCod[0] ;
         n4295ClasCod = P01IF8_n4295ClasCod[0] ;
         AV17ClasCod = A4295ClasCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pactcod.this.A396EmprCod;
      this.aP1[0] = pactcod.this.A30AlbProCod;
      this.aP2[0] = pactcod.this.A129BarCod;
      this.aP3[0] = pactcod.this.A132BarCodReo;
      this.aP4[0] = pactcod.this.A130BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pactcod");
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
      P01IF2_A396EmprCod = new String[] {""} ;
      P01IF2_A30AlbProCod = new long[1] ;
      P01IF2_A129BarCod = new int[1] ;
      P01IF2_A132BarCodReo = new byte[1] ;
      P01IF2_A130BarCodPar = new String[] {""} ;
      P01IF2_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      P01IF3_A2453BarEntAca = new String[] {""} ;
      P01IF3_n2453BarEntAca = new boolean[] {false} ;
      P01IF3_A217BarTipArt = new short[1] ;
      P01IF3_n217BarTipArt = new boolean[] {false} ;
      P01IF3_A252CliCod = new int[1] ;
      P01IF3_n252CliCod = new boolean[] {false} ;
      P01IF3_A212BarSer = new String[] {""} ;
      P01IF3_A218BarTipCol = new byte[1] ;
      P01IF3_A2830BarIntPer = new byte[1] ;
      A2453BarEntAca = "" ;
      A212BarSer = "" ;
      P01IF4_A396EmprCod = new String[] {""} ;
      AV9Ceros2 = "" ;
      AV8Cod_art_a = "" ;
      AV11Cod_art2 = "" ;
      AV20ArtCod = "" ;
      AV12Cod_art3 = "" ;
      AV13Cod_art4 = "" ;
      AV14Cod_art5 = "" ;
      P01IF5_A396EmprCod = new String[] {""} ;
      P01IF5_A129BarCod = new int[1] ;
      P01IF5_A132BarCodReo = new byte[1] ;
      P01IF5_A130BarCodPar = new String[] {""} ;
      P01IF5_A761ProFasLin = new short[1] ;
      P01IF5_n761ProFasLin = new boolean[] {false} ;
      P01IF5_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      AV25TipAca = "" ;
      AV15Cod_art6 = "" ;
      AV16Cod_art7 = "" ;
      AV18Cod_Art = "" ;
      P01IF6_A396EmprCod = new String[] {""} ;
      P01IF6_A129BarCod = new int[1] ;
      P01IF6_A132BarCodReo = new byte[1] ;
      P01IF6_A130BarCodPar = new String[] {""} ;
      P01IF6_A761ProFasLin = new short[1] ;
      P01IF6_n761ProFasLin = new boolean[] {false} ;
      P01IF6_A758ProCod = new String[] {""} ;
      P01IF8_A396EmprCod = new String[] {""} ;
      P01IF8_A65ArtCod = new String[] {""} ;
      P01IF8_A252CliCod = new int[1] ;
      P01IF8_n252CliCod = new boolean[] {false} ;
      P01IF8_A4295ClasCod = new short[1] ;
      P01IF8_n4295ClasCod = new boolean[] {false} ;
      A65ArtCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pactcod__default(),
         new Object[] {
             new Object[] {
            P01IF2_A396EmprCod, P01IF2_A30AlbProCod, P01IF2_A129BarCod, P01IF2_A132BarCodReo, P01IF2_A130BarCodPar, P01IF2_A1261BarAlbKgmE
            }
            , new Object[] {
            P01IF3_A2453BarEntAca, P01IF3_n2453BarEntAca, P01IF3_A217BarTipArt, P01IF3_n217BarTipArt, P01IF3_A252CliCod, P01IF3_n252CliCod, P01IF3_A212BarSer, P01IF3_A218BarTipCol, P01IF3_A2830BarIntPer
            }
            , new Object[] {
            P01IF4_A396EmprCod
            }
            , new Object[] {
            P01IF5_A396EmprCod, P01IF5_A129BarCod, P01IF5_A132BarCodReo, P01IF5_A130BarCodPar, P01IF5_A761ProFasLin, P01IF5_n761ProFasLin, P01IF5_A758ProCod
            }
            , new Object[] {
            P01IF6_A396EmprCod, P01IF6_A129BarCod, P01IF6_A132BarCodReo, P01IF6_A130BarCodPar, P01IF6_A761ProFasLin, P01IF6_n761ProFasLin, P01IF6_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            P01IF8_A396EmprCod, P01IF8_A65ArtCod, P01IF8_A252CliCod, P01IF8_A4295ClasCod, P01IF8_n4295ClasCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte A2830BarIntPer ;
   private byte AV21Var_n_2 ;
   private byte AV10Lenvar ;
   private short A217BarTipArt ;
   private short AV17ClasCod ;
   private short A761ProFasLin ;
   private short A4295ClasCod ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int AV19CliCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A2453BarEntAca ;
   private String A212BarSer ;
   private String AV9Ceros2 ;
   private String AV8Cod_art_a ;
   private String AV11Cod_art2 ;
   private String AV20ArtCod ;
   private String AV12Cod_art3 ;
   private String AV13Cod_art4 ;
   private String AV14Cod_art5 ;
   private String A758ProCod ;
   private String AV25TipAca ;
   private String AV15Cod_art6 ;
   private String AV16Cod_art7 ;
   private String AV18Cod_Art ;
   private String A65ArtCod ;
   private boolean n2453BarEntAca ;
   private boolean n217BarTipArt ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n761ProFasLin ;
   private boolean n4295ClasCod ;
   private String[] aP4 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P01IF2_A396EmprCod ;
   private long[] P01IF2_A30AlbProCod ;
   private int[] P01IF2_A129BarCod ;
   private byte[] P01IF2_A132BarCodReo ;
   private String[] P01IF2_A130BarCodPar ;
   private java.math.BigDecimal[] P01IF2_A1261BarAlbKgmE ;
   private String[] P01IF3_A2453BarEntAca ;
   private boolean[] P01IF3_n2453BarEntAca ;
   private short[] P01IF3_A217BarTipArt ;
   private boolean[] P01IF3_n217BarTipArt ;
   private int[] P01IF3_A252CliCod ;
   private boolean[] P01IF3_n252CliCod ;
   private String[] P01IF3_A212BarSer ;
   private byte[] P01IF3_A218BarTipCol ;
   private byte[] P01IF3_A2830BarIntPer ;
   private String[] P01IF4_A396EmprCod ;
   private String[] P01IF5_A396EmprCod ;
   private int[] P01IF5_A129BarCod ;
   private byte[] P01IF5_A132BarCodReo ;
   private String[] P01IF5_A130BarCodPar ;
   private short[] P01IF5_A761ProFasLin ;
   private boolean[] P01IF5_n761ProFasLin ;
   private String[] P01IF5_A758ProCod ;
   private String[] P01IF6_A396EmprCod ;
   private int[] P01IF6_A129BarCod ;
   private byte[] P01IF6_A132BarCodReo ;
   private String[] P01IF6_A130BarCodPar ;
   private short[] P01IF6_A761ProFasLin ;
   private boolean[] P01IF6_n761ProFasLin ;
   private String[] P01IF6_A758ProCod ;
   private String[] P01IF8_A396EmprCod ;
   private String[] P01IF8_A65ArtCod ;
   private int[] P01IF8_A252CliCod ;
   private boolean[] P01IF8_n252CliCod ;
   private short[] P01IF8_A4295ClasCod ;
   private boolean[] P01IF8_n4295ClasCod ;
}

final  class pactcod__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01IF2", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarAlbKgmE FROM TXPALBBAR WHERE (EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) AND (EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01IF3", "SELECT BarEntAca, BarTipArt, CliCod, BarSer, BarTipCol, BarIntPer FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01IF4", "SELECT EmprCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01IF5", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProFasLin, ProCod FROM TXPBARPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01IF6", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProFasLin, ProCod FROM TXPBARPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01IF7", "UPDATE TXPBARCAD SET BarEntAca=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P01IF8", "SELECT EmprCod, ArtCod, CliCod, ClasCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 16);
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 20);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

