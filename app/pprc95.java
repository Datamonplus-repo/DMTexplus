package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc95 extends GXProcedure
{
   public pprc95( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc95.class ), "" );
   }

   public pprc95( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      pprc95.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      pprc95.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprc95.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pprc95.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pprc95.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pprc95.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      pprc95.this.AV30BarPieCod = aP5[0];
      this.aP5 = aP5;
      pprc95.this.AV23UsurCod = aP6[0];
      this.aP6 = aP6;
      pprc95.this.AV24Station = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05HT2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, AV30BarPieCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A200BarPieCod = P05HT2_A200BarPieCod[0] ;
         A27AlbPKilEnt = P05HT2_A27AlbPKilEnt[0] ;
         A1270AlbPMtrEnt = P05HT2_A1270AlbPMtrEnt[0] ;
         AV19ALBPKILENT = DecimalUtil.doubleToDec(0) ;
         AV20ALBPMTRENT = DecimalUtil.doubleToDec(0) ;
         /* Optimized group. */
         /* Using cursor P05HT3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         c5303AlbPTroKil = P05HT3_A5303AlbPTroKil[0] ;
         c43AlbPTroMet = P05HT3_A43AlbPTroMet[0] ;
         pr_default.close(1);
         AV19ALBPKILENT = AV19ALBPKILENT.add(c5303AlbPTroKil) ;
         AV20ALBPMTRENT = AV20ALBPMTRENT.add(c43AlbPTroMet) ;
         /* End optimized group. */
         A27AlbPKilEnt = ((AV19ALBPKILENT.doubleValue()>0) ? AV19ALBPKILENT : A27AlbPKilEnt) ;
         A1270AlbPMtrEnt = ((AV20ALBPMTRENT.doubleValue()>0) ? AV20ALBPMTRENT : A1270AlbPMtrEnt) ;
         /* Using cursor P05HT4 */
         pr_default.execute(2, new Object[] {A27AlbPKilEnt, A1270AlbPMtrEnt, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALPRD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      Application.commitDataStores(context, remoteHandle, pr_default, "pprc95");
      /* Using cursor P05HT5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A1262BarPreKgm = P05HT5_A1262BarPreKgm[0] ;
         A1261BarAlbKgmE = P05HT5_A1261BarAlbKgmE[0] ;
         A1263BarAlbMtrE = P05HT5_A1263BarAlbMtrE[0] ;
         AV21BARALBKGME = DecimalUtil.doubleToDec(0) ;
         AV22BARALBMTRE = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P05HT6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A200BarPieCod = P05HT6_A200BarPieCod[0] ;
            A27AlbPKilEnt = P05HT6_A27AlbPKilEnt[0] ;
            A1270AlbPMtrEnt = P05HT6_A1270AlbPMtrEnt[0] ;
            AV19ALBPKILENT = DecimalUtil.doubleToDec(0) ;
            AV20ALBPMTRENT = DecimalUtil.doubleToDec(0) ;
            /* Optimized group. */
            /* Using cursor P05HT7 */
            pr_default.execute(5, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
            c5303AlbPTroKil = P05HT7_A5303AlbPTroKil[0] ;
            c43AlbPTroMet = P05HT7_A43AlbPTroMet[0] ;
            pr_default.close(5);
            AV19ALBPKILENT = AV19ALBPKILENT.add(c5303AlbPTroKil) ;
            AV20ALBPMTRENT = AV20ALBPMTRENT.add(c43AlbPTroMet) ;
            /* End optimized group. */
            AV21BARALBKGME = AV21BARALBKGME.add((((AV19ALBPKILENT.doubleValue()>0) ? AV19ALBPKILENT : A27AlbPKilEnt))) ;
            AV22BARALBMTRE = AV22BARALBMTRE.add((((AV20ALBPMTRENT.doubleValue()>0) ? AV20ALBPMTRENT : A1270AlbPMtrEnt))) ;
            pr_default.readNext(4);
         }
         pr_default.close(4);
         AV29Inc_obs = httpContext.getMessage( "Actualizo ALBBAR", "") + GXutil.newLine( ) ;
         AV29Inc_obs += httpContext.getMessage( "Albaran N ", "") + GXutil.str( A30AlbProCod, 10, 0) + GXutil.newLine( ) ;
         AV29Inc_obs += httpContext.getMessage( "Kilos Ini ", "") + GXutil.str( A1261BarAlbKgmE, 9, 2) + GXutil.newLine( ) ;
         AV29Inc_obs += httpContext.getMessage( "Metros Ini", "") + GXutil.str( A1263BarAlbMtrE, 9, 2) + GXutil.newLine( ) ;
         A1261BarAlbKgmE = ((AV21BARALBKGME.doubleValue()>0) ? AV21BARALBKGME : A1261BarAlbKgmE) ;
         A1263BarAlbMtrE = ((AV22BARALBMTRE.doubleValue()>0) ? AV22BARALBMTRE : A1263BarAlbMtrE) ;
         if ( AV21BARALBKGME.doubleValue() > 0 )
         {
            AV29Inc_obs += httpContext.getMessage( "Kilos Fin ", "") + GXutil.str( AV21BARALBKGME, 9, 2) + GXutil.newLine( ) ;
         }
         else
         {
            AV29Inc_obs += httpContext.getMessage( "Kilos Fin ", "") + GXutil.str( A1261BarAlbKgmE, 9, 2) + GXutil.newLine( ) ;
         }
         if ( AV22BARALBMTRE.doubleValue() > 0 )
         {
            AV29Inc_obs += httpContext.getMessage( "Metros Fin", "") + GXutil.str( AV22BARALBMTRE, 9, 2) + GXutil.newLine( ) ;
         }
         else
         {
            AV29Inc_obs += httpContext.getMessage( "Metros Fin", "") + GXutil.str( A1263BarAlbMtrE, 9, 2) + GXutil.newLine( ) ;
         }
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV38Pgmname, AV23UsurCod, AV24Station, AV29Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         /* Using cursor P05HT8 */
         pr_default.execute(6, new Object[] {A1261BarAlbKgmE, A1263BarAlbMtrE, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc95.this.A396EmprCod;
      this.aP1[0] = pprc95.this.A30AlbProCod;
      this.aP2[0] = pprc95.this.A129BarCod;
      this.aP3[0] = pprc95.this.A132BarCodReo;
      this.aP4[0] = pprc95.this.A130BarCodPar;
      this.aP5[0] = pprc95.this.AV30BarPieCod;
      this.aP6[0] = pprc95.this.AV23UsurCod;
      this.aP7[0] = pprc95.this.AV24Station;
      Application.commitDataStores(context, remoteHandle, pr_default, "pprc95");
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
      P05HT2_A396EmprCod = new String[] {""} ;
      P05HT2_A30AlbProCod = new long[1] ;
      P05HT2_A129BarCod = new int[1] ;
      P05HT2_A132BarCodReo = new byte[1] ;
      P05HT2_A130BarCodPar = new String[] {""} ;
      P05HT2_A200BarPieCod = new String[] {""} ;
      P05HT2_A27AlbPKilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05HT2_A1270AlbPMtrEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A200BarPieCod = "" ;
      A27AlbPKilEnt = DecimalUtil.ZERO ;
      A1270AlbPMtrEnt = DecimalUtil.ZERO ;
      AV19ALBPKILENT = DecimalUtil.ZERO ;
      AV20ALBPMTRENT = DecimalUtil.ZERO ;
      c5303AlbPTroKil = DecimalUtil.ZERO ;
      c43AlbPTroMet = DecimalUtil.ZERO ;
      P05HT3_A5303AlbPTroKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05HT3_A43AlbPTroMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05HT5_A396EmprCod = new String[] {""} ;
      P05HT5_A30AlbProCod = new long[1] ;
      P05HT5_A129BarCod = new int[1] ;
      P05HT5_A132BarCodReo = new byte[1] ;
      P05HT5_A130BarCodPar = new String[] {""} ;
      P05HT5_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05HT5_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05HT5_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      AV21BARALBKGME = DecimalUtil.ZERO ;
      AV22BARALBMTRE = DecimalUtil.ZERO ;
      P05HT6_A396EmprCod = new String[] {""} ;
      P05HT6_A30AlbProCod = new long[1] ;
      P05HT6_A129BarCod = new int[1] ;
      P05HT6_A132BarCodReo = new byte[1] ;
      P05HT6_A130BarCodPar = new String[] {""} ;
      P05HT6_A200BarPieCod = new String[] {""} ;
      P05HT6_A27AlbPKilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05HT6_A1270AlbPMtrEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05HT7_A5303AlbPTroKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05HT7_A43AlbPTroMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV29Inc_obs = "" ;
      AV38Pgmname = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pprc95__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pprc95__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pprc95__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc95__default(),
         new Object[] {
             new Object[] {
            P05HT2_A396EmprCod, P05HT2_A30AlbProCod, P05HT2_A129BarCod, P05HT2_A132BarCodReo, P05HT2_A130BarCodPar, P05HT2_A200BarPieCod, P05HT2_A27AlbPKilEnt, P05HT2_A1270AlbPMtrEnt
            }
            , new Object[] {
            P05HT3_A5303AlbPTroKil, P05HT3_A43AlbPTroMet
            }
            , new Object[] {
            }
            , new Object[] {
            P05HT5_A396EmprCod, P05HT5_A30AlbProCod, P05HT5_A129BarCod, P05HT5_A132BarCodReo, P05HT5_A130BarCodPar, P05HT5_A1262BarPreKgm, P05HT5_A1261BarAlbKgmE, P05HT5_A1263BarAlbMtrE
            }
            , new Object[] {
            P05HT6_A396EmprCod, P05HT6_A30AlbProCod, P05HT6_A129BarCod, P05HT6_A132BarCodReo, P05HT6_A130BarCodPar, P05HT6_A200BarPieCod, P05HT6_A27AlbPKilEnt, P05HT6_A1270AlbPMtrEnt
            }
            , new Object[] {
            P05HT7_A5303AlbPTroKil, P05HT7_A43AlbPTroMet
            }
            , new Object[] {
            }
         }
      );
      AV38Pgmname = "PPrc95" ;
      /* GeneXus formulas. */
      AV38Pgmname = "PPrc95" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A27AlbPKilEnt ;
   private java.math.BigDecimal A1270AlbPMtrEnt ;
   private java.math.BigDecimal AV19ALBPKILENT ;
   private java.math.BigDecimal AV20ALBPMTRENT ;
   private java.math.BigDecimal c5303AlbPTroKil ;
   private java.math.BigDecimal c43AlbPTroMet ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal AV21BARALBKGME ;
   private java.math.BigDecimal AV22BARALBMTRE ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV30BarPieCod ;
   private String AV23UsurCod ;
   private String AV24Station ;
   private String scmdbuf ;
   private String A200BarPieCod ;
   private String AV38Pgmname ;
   private String AV29Inc_obs ;
   private String[] aP7 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P05HT2_A396EmprCod ;
   private long[] P05HT2_A30AlbProCod ;
   private int[] P05HT2_A129BarCod ;
   private byte[] P05HT2_A132BarCodReo ;
   private String[] P05HT2_A130BarCodPar ;
   private String[] P05HT2_A200BarPieCod ;
   private java.math.BigDecimal[] P05HT2_A27AlbPKilEnt ;
   private java.math.BigDecimal[] P05HT2_A1270AlbPMtrEnt ;
   private java.math.BigDecimal[] P05HT3_A5303AlbPTroKil ;
   private java.math.BigDecimal[] P05HT3_A43AlbPTroMet ;
   private String[] P05HT5_A396EmprCod ;
   private long[] P05HT5_A30AlbProCod ;
   private int[] P05HT5_A129BarCod ;
   private byte[] P05HT5_A132BarCodReo ;
   private String[] P05HT5_A130BarCodPar ;
   private java.math.BigDecimal[] P05HT5_A1262BarPreKgm ;
   private java.math.BigDecimal[] P05HT5_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P05HT5_A1263BarAlbMtrE ;
   private String[] P05HT6_A396EmprCod ;
   private long[] P05HT6_A30AlbProCod ;
   private int[] P05HT6_A129BarCod ;
   private byte[] P05HT6_A132BarCodReo ;
   private String[] P05HT6_A130BarCodPar ;
   private String[] P05HT6_A200BarPieCod ;
   private java.math.BigDecimal[] P05HT6_A27AlbPKilEnt ;
   private java.math.BigDecimal[] P05HT6_A1270AlbPMtrEnt ;
   private java.math.BigDecimal[] P05HT7_A5303AlbPTroKil ;
   private java.math.BigDecimal[] P05HT7_A43AlbPTroMet ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pprc95__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pprc95__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pprc95__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pprc95__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05HT2", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbPKilEnt, AlbPMtrEnt FROM TXPLALPRD WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05HT3", "SELECT SUM(AlbPTroKil), SUM(AlbPTroMet) FROM TXPLALTRZ WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05HT4", "UPDATE TXPLALPRD SET AlbPKilEnt=?, AlbPMtrEnt=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALPRD")
         ,new ForEachCursor("P05HT5", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPreKgm, BarAlbKgmE, BarAlbMtrE FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05HT6", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbPKilEnt, AlbPMtrEnt FROM TXPLALPRD WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05HT7", "SELECT SUM(AlbPTroKil), SUM(AlbPTroMet) FROM TXPLALTRZ WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05HT8", "UPDATE TXPALBBAR SET BarAlbKgmE=?, BarAlbMtrE=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
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
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               return;
            case 5 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
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
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 2 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 9);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
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
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
      }
   }

}

