package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmomvpd extends GXProcedure
{
   public pmomvpd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmomvpd.class ), "" );
   }

   public pmomvpd( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             short[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             short[] aP9 ,
                             short[] aP10 ,
                             java.util.Date[] aP11 )
   {
      pmomvpd.this.aP12 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        int[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        short[] aP9 ,
                        short[] aP10 ,
                        java.util.Date[] aP11 ,
                        String[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             short[] aP9 ,
                             short[] aP10 ,
                             java.util.Date[] aP11 ,
                             String[] aP12 )
   {
      pmomvpd.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pmomvpd.this.AV16ManCod = aP1[0];
      this.aP1 = aP1;
      pmomvpd.this.AV17ExMvpFas = aP2[0];
      this.aP2 = aP2;
      pmomvpd.this.AV18ExMvpTip = aP3[0];
      this.aP3 = aP3;
      pmomvpd.this.AV19ExMvpAlb = aP4[0];
      this.aP4 = aP4;
      pmomvpd.this.AV20PartCod = aP5[0];
      this.aP5 = aP5;
      pmomvpd.this.AV21CliCod = aP6[0];
      this.aP6 = aP6;
      pmomvpd.this.AV22Kgs = aP7[0];
      this.aP7 = aP7;
      pmomvpd.this.AV23KgsOld = aP8[0];
      this.aP8 = aP8;
      pmomvpd.this.AV24Conos = aP9[0];
      this.aP9 = aP9;
      pmomvpd.this.AV25ConosOld = aP10[0];
      this.aP10 = aP10;
      pmomvpd.this.AV26FecMov = aP11[0];
      this.aP11 = aP11;
      pmomvpd.this.AV27ExtPdoLoc = aP12[0];
      this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      n2352ExMvpFeE = false ;
      n2351ExMvpCnE = false ;
      n2350ExMvpKgE = false ;
      /* Optimized UPDATE. */
      /* Using cursor P00DR2 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n2352ExMvpFeE), AV26FecMov, Short.valueOf(AV25ConosOld), Short.valueOf(AV24Conos), AV23KgsOld, AV22Kgs, AV15EmprCod, Short.valueOf(AV16ManCod), AV17ExMvpFas, AV18ExMvpTip, Integer.valueOf(AV19ExMvpAlb), AV20PartCod, Integer.valueOf(AV21CliCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEXMVP");
      /* End optimized UPDATE. */
      /* Using cursor P00DR3 */
      pr_default.execute(1, new Object[] {AV15EmprCod, AV20PartCod, Integer.valueOf(AV21CliCod), AV27ExtPdoLoc, Integer.valueOf(AV19ExMvpAlb)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A1877PartLoc = P00DR3_A1877PartLoc[0] ;
         n1877PartLoc = P00DR3_n1877PartLoc[0] ;
         A982PartSitDis = P00DR3_A982PartSitDis[0] ;
         n982PartSitDis = P00DR3_n982PartSitDis[0] ;
         A980PartLinTip = P00DR3_A980PartLinTip[0] ;
         n980PartLinTip = P00DR3_n980PartLinTip[0] ;
         A981PartAlbDis = P00DR3_A981PartAlbDis[0] ;
         n981PartAlbDis = P00DR3_n981PartAlbDis[0] ;
         A252CliCod = P00DR3_A252CliCod[0] ;
         n252CliCod = P00DR3_n252CliCod[0] ;
         A966PartCod = P00DR3_A966PartCod[0] ;
         n966PartCod = P00DR3_n966PartCod[0] ;
         A396EmprCod = P00DR3_A396EmprCod[0] ;
         A986KilUti = P00DR3_A986KilUti[0] ;
         n986KilUti = P00DR3_n986KilUti[0] ;
         A987ConUti = P00DR3_A987ConUti[0] ;
         n987ConUti = P00DR3_n987ConUti[0] ;
         A983PartFecMov = P00DR3_A983PartFecMov[0] ;
         n983PartFecMov = P00DR3_n983PartFecMov[0] ;
         A979PartLin = P00DR3_A979PartLin[0] ;
         if ( ( GXutil.strcmp(A980PartLinTip, httpContext.getMessage( "D", "")) == 0 ) || ( GXutil.strcmp(A980PartLinTip, httpContext.getMessage( "S", "")) == 0 ) )
         {
            if ( GXutil.strcmp(A982PartSitDis, httpContext.getMessage( "SALIDA EXTERIOR", "")) == 0 )
            {
               A986KilUti = A986KilUti.subtract(AV23KgsOld).add(AV22Kgs) ;
               n986KilUti = false ;
               A987ConUti = (short)(A987ConUti-AV25ConosOld+AV24Conos) ;
               n987ConUti = false ;
               A983PartFecMov = AV26FecMov ;
               n983PartFecMov = false ;
               /* Using cursor P00DR4 */
               pr_default.execute(2, new Object[] {Boolean.valueOf(n986KilUti), A986KilUti, Boolean.valueOf(n987ConUti), Short.valueOf(A987ConUti), Boolean.valueOf(n983PartFecMov), A983PartFecMov, A396EmprCod, Boolean.valueOf(n966PartCod), A966PartCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A979PartLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPARTI");
            }
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Using cursor P00DR5 */
      pr_default.execute(3, new Object[] {AV15EmprCod, AV20PartCod, Integer.valueOf(AV21CliCod), Integer.valueOf(AV19ExMvpAlb), AV27ExtPdoLoc});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A2285MovParLoc = P00DR5_A2285MovParLoc[0] ;
         n2285MovParLoc = P00DR5_n2285MovParLoc[0] ;
         A2279MovParSit = P00DR5_A2279MovParSit[0] ;
         n2279MovParSit = P00DR5_n2279MovParSit[0] ;
         A2277MovParLiT = P00DR5_A2277MovParLiT[0] ;
         n2277MovParLiT = P00DR5_n2277MovParLiT[0] ;
         A2278MovParAlb = P00DR5_A2278MovParAlb[0] ;
         n2278MovParAlb = P00DR5_n2278MovParAlb[0] ;
         A252CliCod = P00DR5_A252CliCod[0] ;
         n252CliCod = P00DR5_n252CliCod[0] ;
         A2268MovParCod = P00DR5_A2268MovParCod[0] ;
         A396EmprCod = P00DR5_A396EmprCod[0] ;
         A2283MovParKU = P00DR5_A2283MovParKU[0] ;
         n2283MovParKU = P00DR5_n2283MovParKU[0] ;
         A2284MovParCU = P00DR5_A2284MovParCU[0] ;
         n2284MovParCU = P00DR5_n2284MovParCU[0] ;
         A2280MovParFec = P00DR5_A2280MovParFec[0] ;
         n2280MovParFec = P00DR5_n2280MovParFec[0] ;
         A2276MovParLin = P00DR5_A2276MovParLin[0] ;
         if ( ( GXutil.strcmp(A2277MovParLiT, httpContext.getMessage( "D", "")) == 0 ) && ( GXutil.strcmp(A2279MovParSit, httpContext.getMessage( "SALIDA EXTERIOR", "")) == 0 ) )
         {
            A2283MovParKU = A2283MovParKU.subtract(AV23KgsOld).add(AV22Kgs) ;
            n2283MovParKU = false ;
            A2284MovParCU = (short)(A2284MovParCU-AV25ConosOld+AV24Conos) ;
            n2284MovParCU = false ;
            A2280MovParFec = AV26FecMov ;
            n2280MovParFec = false ;
            /* Using cursor P00DR6 */
            pr_default.execute(4, new Object[] {Boolean.valueOf(n2283MovParKU), A2283MovParKU, Boolean.valueOf(n2284MovParCU), Short.valueOf(A2284MovParCU), Boolean.valueOf(n2280MovParFec), A2280MovParFec, A396EmprCod, A2268MovParCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A2276MovParLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMOVPD");
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmomvpd.this.AV15EmprCod;
      this.aP1[0] = pmomvpd.this.AV16ManCod;
      this.aP2[0] = pmomvpd.this.AV17ExMvpFas;
      this.aP3[0] = pmomvpd.this.AV18ExMvpTip;
      this.aP4[0] = pmomvpd.this.AV19ExMvpAlb;
      this.aP5[0] = pmomvpd.this.AV20PartCod;
      this.aP6[0] = pmomvpd.this.AV21CliCod;
      this.aP7[0] = pmomvpd.this.AV22Kgs;
      this.aP8[0] = pmomvpd.this.AV23KgsOld;
      this.aP9[0] = pmomvpd.this.AV24Conos;
      this.aP10[0] = pmomvpd.this.AV25ConosOld;
      this.aP11[0] = pmomvpd.this.AV26FecMov;
      this.aP12[0] = pmomvpd.this.AV27ExtPdoLoc;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmomvpd");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A2352ExMvpFeE = GXutil.nullDate() ;
      scmdbuf = "" ;
      P00DR3_A1877PartLoc = new String[] {""} ;
      P00DR3_n1877PartLoc = new boolean[] {false} ;
      P00DR3_A982PartSitDis = new String[] {""} ;
      P00DR3_n982PartSitDis = new boolean[] {false} ;
      P00DR3_A980PartLinTip = new String[] {""} ;
      P00DR3_n980PartLinTip = new boolean[] {false} ;
      P00DR3_A981PartAlbDis = new int[1] ;
      P00DR3_n981PartAlbDis = new boolean[] {false} ;
      P00DR3_A252CliCod = new int[1] ;
      P00DR3_n252CliCod = new boolean[] {false} ;
      P00DR3_A966PartCod = new String[] {""} ;
      P00DR3_n966PartCod = new boolean[] {false} ;
      P00DR3_A396EmprCod = new String[] {""} ;
      P00DR3_A986KilUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00DR3_n986KilUti = new boolean[] {false} ;
      P00DR3_A987ConUti = new short[1] ;
      P00DR3_n987ConUti = new boolean[] {false} ;
      P00DR3_A983PartFecMov = new java.util.Date[] {GXutil.nullDate()} ;
      P00DR3_n983PartFecMov = new boolean[] {false} ;
      P00DR3_A979PartLin = new int[1] ;
      A1877PartLoc = "" ;
      A982PartSitDis = "" ;
      A980PartLinTip = "" ;
      A966PartCod = "" ;
      A396EmprCod = "" ;
      A986KilUti = DecimalUtil.ZERO ;
      A983PartFecMov = GXutil.nullDate() ;
      P00DR5_A2285MovParLoc = new String[] {""} ;
      P00DR5_n2285MovParLoc = new boolean[] {false} ;
      P00DR5_A2279MovParSit = new String[] {""} ;
      P00DR5_n2279MovParSit = new boolean[] {false} ;
      P00DR5_A2277MovParLiT = new String[] {""} ;
      P00DR5_n2277MovParLiT = new boolean[] {false} ;
      P00DR5_A2278MovParAlb = new int[1] ;
      P00DR5_n2278MovParAlb = new boolean[] {false} ;
      P00DR5_A252CliCod = new int[1] ;
      P00DR5_n252CliCod = new boolean[] {false} ;
      P00DR5_A2268MovParCod = new String[] {""} ;
      P00DR5_A396EmprCod = new String[] {""} ;
      P00DR5_A2283MovParKU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00DR5_n2283MovParKU = new boolean[] {false} ;
      P00DR5_A2284MovParCU = new short[1] ;
      P00DR5_n2284MovParCU = new boolean[] {false} ;
      P00DR5_A2280MovParFec = new java.util.Date[] {GXutil.nullDate()} ;
      P00DR5_n2280MovParFec = new boolean[] {false} ;
      P00DR5_A2276MovParLin = new short[1] ;
      A2285MovParLoc = "" ;
      A2279MovParSit = "" ;
      A2277MovParLiT = "" ;
      A2268MovParCod = "" ;
      A2283MovParKU = DecimalUtil.ZERO ;
      A2280MovParFec = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmomvpd__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P00DR3_A1877PartLoc, P00DR3_n1877PartLoc, P00DR3_A982PartSitDis, P00DR3_n982PartSitDis, P00DR3_A980PartLinTip, P00DR3_n980PartLinTip, P00DR3_A981PartAlbDis, P00DR3_n981PartAlbDis, P00DR3_A252CliCod, P00DR3_A966PartCod,
            P00DR3_A396EmprCod, P00DR3_A986KilUti, P00DR3_n986KilUti, P00DR3_A987ConUti, P00DR3_n987ConUti, P00DR3_A983PartFecMov, P00DR3_n983PartFecMov, P00DR3_A979PartLin
            }
            , new Object[] {
            }
            , new Object[] {
            P00DR5_A2285MovParLoc, P00DR5_n2285MovParLoc, P00DR5_A2279MovParSit, P00DR5_n2279MovParSit, P00DR5_A2277MovParLiT, P00DR5_n2277MovParLiT, P00DR5_A2278MovParAlb, P00DR5_n2278MovParAlb, P00DR5_A252CliCod, P00DR5_A2268MovParCod,
            P00DR5_A396EmprCod, P00DR5_A2283MovParKU, P00DR5_n2283MovParKU, P00DR5_A2284MovParCU, P00DR5_n2284MovParCU, P00DR5_A2280MovParFec, P00DR5_n2280MovParFec, P00DR5_A2276MovParLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV16ManCod ;
   private short AV24Conos ;
   private short AV25ConosOld ;
   private short A987ConUti ;
   private short A2284MovParCU ;
   private short A2276MovParLin ;
   private short Gx_err ;
   private int AV19ExMvpAlb ;
   private int AV21CliCod ;
   private int A981PartAlbDis ;
   private int A252CliCod ;
   private int A979PartLin ;
   private int A2278MovParAlb ;
   private java.math.BigDecimal AV22Kgs ;
   private java.math.BigDecimal AV23KgsOld ;
   private java.math.BigDecimal A986KilUti ;
   private java.math.BigDecimal A2283MovParKU ;
   private String AV15EmprCod ;
   private String AV17ExMvpFas ;
   private String AV18ExMvpTip ;
   private String AV20PartCod ;
   private String AV27ExtPdoLoc ;
   private String scmdbuf ;
   private String A1877PartLoc ;
   private String A982PartSitDis ;
   private String A980PartLinTip ;
   private String A966PartCod ;
   private String A396EmprCod ;
   private String A2285MovParLoc ;
   private String A2279MovParSit ;
   private String A2277MovParLiT ;
   private String A2268MovParCod ;
   private java.util.Date AV26FecMov ;
   private java.util.Date A2352ExMvpFeE ;
   private java.util.Date A983PartFecMov ;
   private java.util.Date A2280MovParFec ;
   private boolean n2352ExMvpFeE ;
   private boolean n2351ExMvpCnE ;
   private boolean n2350ExMvpKgE ;
   private boolean n1877PartLoc ;
   private boolean n982PartSitDis ;
   private boolean n980PartLinTip ;
   private boolean n981PartAlbDis ;
   private boolean n252CliCod ;
   private boolean n966PartCod ;
   private boolean n986KilUti ;
   private boolean n987ConUti ;
   private boolean n983PartFecMov ;
   private boolean n2285MovParLoc ;
   private boolean n2279MovParSit ;
   private boolean n2277MovParLiT ;
   private boolean n2278MovParAlb ;
   private boolean n2283MovParKU ;
   private boolean n2284MovParCU ;
   private boolean n2280MovParFec ;
   private String[] aP12 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private int[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private short[] aP9 ;
   private short[] aP10 ;
   private java.util.Date[] aP11 ;
   private IDataStoreProvider pr_default ;
   private String[] P00DR3_A1877PartLoc ;
   private boolean[] P00DR3_n1877PartLoc ;
   private String[] P00DR3_A982PartSitDis ;
   private boolean[] P00DR3_n982PartSitDis ;
   private String[] P00DR3_A980PartLinTip ;
   private boolean[] P00DR3_n980PartLinTip ;
   private int[] P00DR3_A981PartAlbDis ;
   private boolean[] P00DR3_n981PartAlbDis ;
   private int[] P00DR3_A252CliCod ;
   private boolean[] P00DR3_n252CliCod ;
   private String[] P00DR3_A966PartCod ;
   private boolean[] P00DR3_n966PartCod ;
   private String[] P00DR3_A396EmprCod ;
   private java.math.BigDecimal[] P00DR3_A986KilUti ;
   private boolean[] P00DR3_n986KilUti ;
   private short[] P00DR3_A987ConUti ;
   private boolean[] P00DR3_n987ConUti ;
   private java.util.Date[] P00DR3_A983PartFecMov ;
   private boolean[] P00DR3_n983PartFecMov ;
   private int[] P00DR3_A979PartLin ;
   private String[] P00DR5_A2285MovParLoc ;
   private boolean[] P00DR5_n2285MovParLoc ;
   private String[] P00DR5_A2279MovParSit ;
   private boolean[] P00DR5_n2279MovParSit ;
   private String[] P00DR5_A2277MovParLiT ;
   private boolean[] P00DR5_n2277MovParLiT ;
   private int[] P00DR5_A2278MovParAlb ;
   private boolean[] P00DR5_n2278MovParAlb ;
   private int[] P00DR5_A252CliCod ;
   private boolean[] P00DR5_n252CliCod ;
   private String[] P00DR5_A2268MovParCod ;
   private String[] P00DR5_A396EmprCod ;
   private java.math.BigDecimal[] P00DR5_A2283MovParKU ;
   private boolean[] P00DR5_n2283MovParKU ;
   private short[] P00DR5_A2284MovParCU ;
   private boolean[] P00DR5_n2284MovParCU ;
   private java.util.Date[] P00DR5_A2280MovParFec ;
   private boolean[] P00DR5_n2280MovParFec ;
   private short[] P00DR5_A2276MovParLin ;
}

final  class pmomvpd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P00DR2", "UPDATE TXPLEXMVP SET ExMvpFeE=?, ExMvpCnE=ExMvpCnE - ? + ?, ExMvpKgE=ExMvpKgE - ? + ?  WHERE (EmprCod = ? and ManCod = ? and ExMvpFas = ?) AND (ExMvpTip = ?) AND (ExMvpAlb = ?) AND (PartCod = ?) AND (CliCod = ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLEXMVP")
         ,new ForEachCursor("P00DR3", "SELECT PartLoc, PartSitDis, PartLinTip, PartAlbDis, CliCod, PartCod, EmprCod, KilUti, ConUti, PartFecMov, PartLin FROM TXPLPARTI WHERE (EmprCod = ? and PartCod = ? and CliCod = ? and PartLoc = ?) AND (PartAlbDis = ?) ORDER BY EmprCod, PartCod, CliCod, PartLoc ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00DR4", "UPDATE TXPLPARTI SET KilUti=?, ConUti=?, PartFecMov=?  WHERE EmprCod = ? AND PartCod = ? AND CliCod = ? AND PartLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPARTI")
         ,new ForEachCursor("P00DR5", "SELECT MovParLoc, MovParSit, MovParLiT, MovParAlb, CliCod, MovParCod, EmprCod, MovParKU, MovParCU, MovParFec, MovParLin FROM TXPLMOVPD WHERE (EmprCod = ? and MovParCod = ? and CliCod = ?) AND (MovParAlb = ?) AND (MovParLoc = ?) ORDER BY EmprCod, MovParCod, CliCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00DR6", "UPDATE TXPLMOVPD SET MovParKU=?, MovParCU=?, MovParFec=?  WHERE EmprCod = ? AND MovParCod = ? AND CliCod = ? AND MovParLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMOVPD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(5);
               ((String[]) buf[9])[0] = rslt.getString(6, 16);
               ((String[]) buf[10])[0] = rslt.getString(7, 3);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(11);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(5);
               ((String[]) buf[9])[0] = rslt.getString(6, 16);
               ((String[]) buf[10])[0] = rslt.getString(7, 3);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(11);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DATE );
               }
               else
               {
                  stmt.setDate(1, (java.util.Date)parms[1]);
               }
               stmt.setShort(2, ((Number) parms[2]).shortValue());
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
               stmt.setString(6, (String)parms[6], 3);
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               stmt.setString(8, (String)parms[8], 8);
               stmt.setString(9, (String)parms[9], 1);
               stmt.setInt(10, ((Number) parms[10]).intValue());
               stmt.setString(11, (String)parms[11], 16);
               stmt.setInt(12, ((Number) parms[12]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 10);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[5]);
               }
               stmt.setString(4, (String)parms[6], 3);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 16);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[10]).intValue());
               }
               stmt.setInt(7, ((Number) parms[11]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 10);
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[5]);
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setString(5, (String)parms[7], 16);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[9]).intValue());
               }
               stmt.setShort(7, ((Number) parms[10]).shortValue());
               return;
      }
   }

}

