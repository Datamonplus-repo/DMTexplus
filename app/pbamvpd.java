package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbamvpd extends GXProcedure
{
   public pbamvpd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbamvpd.class ), "" );
   }

   public pbamvpd( int remoteHandle ,
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
                             int[] aP6 )
   {
      pbamvpd.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        int[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 ,
                             String[] aP7 )
   {
      pbamvpd.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pbamvpd.this.AV16ManCod = aP1[0];
      this.aP1 = aP1;
      pbamvpd.this.AV17ExMvpFas = aP2[0];
      this.aP2 = aP2;
      pbamvpd.this.AV18ExMvpTip = aP3[0];
      this.aP3 = aP3;
      pbamvpd.this.AV19ExMvpAlb = aP4[0];
      this.aP4 = aP4;
      pbamvpd.this.AV20PartCod = aP5[0];
      this.aP5 = aP5;
      pbamvpd.this.AV21CliCod = aP6[0];
      this.aP6 = aP6;
      pbamvpd.this.AV22ExtPdoLoc = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized DELETE. */
      /* Using cursor P00DQ2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Short.valueOf(AV16ManCod), AV17ExMvpFas, AV18ExMvpTip, Integer.valueOf(AV19ExMvpAlb), AV20PartCod, Integer.valueOf(AV21CliCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEXMVP");
      /* End optimized DELETE. */
      /* Using cursor P00DQ3 */
      pr_default.execute(1, new Object[] {AV15EmprCod, AV20PartCod, Integer.valueOf(AV21CliCod), AV22ExtPdoLoc, Integer.valueOf(AV19ExMvpAlb)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A1877PartLoc = P00DQ3_A1877PartLoc[0] ;
         n1877PartLoc = P00DQ3_n1877PartLoc[0] ;
         A982PartSitDis = P00DQ3_A982PartSitDis[0] ;
         n982PartSitDis = P00DQ3_n982PartSitDis[0] ;
         A980PartLinTip = P00DQ3_A980PartLinTip[0] ;
         n980PartLinTip = P00DQ3_n980PartLinTip[0] ;
         A981PartAlbDis = P00DQ3_A981PartAlbDis[0] ;
         n981PartAlbDis = P00DQ3_n981PartAlbDis[0] ;
         A252CliCod = P00DQ3_A252CliCod[0] ;
         n252CliCod = P00DQ3_n252CliCod[0] ;
         A966PartCod = P00DQ3_A966PartCod[0] ;
         n966PartCod = P00DQ3_n966PartCod[0] ;
         A396EmprCod = P00DQ3_A396EmprCod[0] ;
         A979PartLin = P00DQ3_A979PartLin[0] ;
         if ( ( GXutil.strcmp(A980PartLinTip, httpContext.getMessage( "D", "")) == 0 ) || ( GXutil.strcmp(A980PartLinTip, httpContext.getMessage( "S", "")) == 0 ) )
         {
            if ( GXutil.strcmp(A982PartSitDis, httpContext.getMessage( "SALIDA EXTERIOR", "")) == 0 )
            {
               /* Using cursor P00DQ4 */
               pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n966PartCod), A966PartCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A979PartLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPARTI");
            }
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Using cursor P00DQ5 */
      pr_default.execute(3, new Object[] {AV15EmprCod, AV20PartCod, Integer.valueOf(AV21CliCod), Integer.valueOf(AV19ExMvpAlb), AV22ExtPdoLoc});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A2285MovParLoc = P00DQ5_A2285MovParLoc[0] ;
         n2285MovParLoc = P00DQ5_n2285MovParLoc[0] ;
         A2279MovParSit = P00DQ5_A2279MovParSit[0] ;
         n2279MovParSit = P00DQ5_n2279MovParSit[0] ;
         A2277MovParLiT = P00DQ5_A2277MovParLiT[0] ;
         n2277MovParLiT = P00DQ5_n2277MovParLiT[0] ;
         A2278MovParAlb = P00DQ5_A2278MovParAlb[0] ;
         n2278MovParAlb = P00DQ5_n2278MovParAlb[0] ;
         A252CliCod = P00DQ5_A252CliCod[0] ;
         n252CliCod = P00DQ5_n252CliCod[0] ;
         A2268MovParCod = P00DQ5_A2268MovParCod[0] ;
         A396EmprCod = P00DQ5_A396EmprCod[0] ;
         A2276MovParLin = P00DQ5_A2276MovParLin[0] ;
         if ( ( GXutil.strcmp(A2277MovParLiT, httpContext.getMessage( "D", "")) == 0 ) && ( GXutil.strcmp(A2279MovParSit, httpContext.getMessage( "SALIDA EXTERIOR", "")) == 0 ) )
         {
            /* Using cursor P00DQ6 */
            pr_default.execute(4, new Object[] {A396EmprCod, A2268MovParCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A2276MovParLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMOVPD");
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbamvpd.this.AV15EmprCod;
      this.aP1[0] = pbamvpd.this.AV16ManCod;
      this.aP2[0] = pbamvpd.this.AV17ExMvpFas;
      this.aP3[0] = pbamvpd.this.AV18ExMvpTip;
      this.aP4[0] = pbamvpd.this.AV19ExMvpAlb;
      this.aP5[0] = pbamvpd.this.AV20PartCod;
      this.aP6[0] = pbamvpd.this.AV21CliCod;
      this.aP7[0] = pbamvpd.this.AV22ExtPdoLoc;
      Application.commitDataStores(context, remoteHandle, pr_default, "pbamvpd");
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
      P00DQ3_A1877PartLoc = new String[] {""} ;
      P00DQ3_n1877PartLoc = new boolean[] {false} ;
      P00DQ3_A982PartSitDis = new String[] {""} ;
      P00DQ3_n982PartSitDis = new boolean[] {false} ;
      P00DQ3_A980PartLinTip = new String[] {""} ;
      P00DQ3_n980PartLinTip = new boolean[] {false} ;
      P00DQ3_A981PartAlbDis = new int[1] ;
      P00DQ3_n981PartAlbDis = new boolean[] {false} ;
      P00DQ3_A252CliCod = new int[1] ;
      P00DQ3_n252CliCod = new boolean[] {false} ;
      P00DQ3_A966PartCod = new String[] {""} ;
      P00DQ3_n966PartCod = new boolean[] {false} ;
      P00DQ3_A396EmprCod = new String[] {""} ;
      P00DQ3_A979PartLin = new int[1] ;
      A1877PartLoc = "" ;
      A982PartSitDis = "" ;
      A980PartLinTip = "" ;
      A966PartCod = "" ;
      A396EmprCod = "" ;
      P00DQ5_A2285MovParLoc = new String[] {""} ;
      P00DQ5_n2285MovParLoc = new boolean[] {false} ;
      P00DQ5_A2279MovParSit = new String[] {""} ;
      P00DQ5_n2279MovParSit = new boolean[] {false} ;
      P00DQ5_A2277MovParLiT = new String[] {""} ;
      P00DQ5_n2277MovParLiT = new boolean[] {false} ;
      P00DQ5_A2278MovParAlb = new int[1] ;
      P00DQ5_n2278MovParAlb = new boolean[] {false} ;
      P00DQ5_A252CliCod = new int[1] ;
      P00DQ5_n252CliCod = new boolean[] {false} ;
      P00DQ5_A2268MovParCod = new String[] {""} ;
      P00DQ5_A396EmprCod = new String[] {""} ;
      P00DQ5_A2276MovParLin = new short[1] ;
      A2285MovParLoc = "" ;
      A2279MovParSit = "" ;
      A2277MovParLiT = "" ;
      A2268MovParCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbamvpd__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P00DQ3_A1877PartLoc, P00DQ3_n1877PartLoc, P00DQ3_A982PartSitDis, P00DQ3_n982PartSitDis, P00DQ3_A980PartLinTip, P00DQ3_n980PartLinTip, P00DQ3_A981PartAlbDis, P00DQ3_n981PartAlbDis, P00DQ3_A252CliCod, P00DQ3_A966PartCod,
            P00DQ3_A396EmprCod, P00DQ3_A979PartLin
            }
            , new Object[] {
            }
            , new Object[] {
            P00DQ5_A2285MovParLoc, P00DQ5_n2285MovParLoc, P00DQ5_A2279MovParSit, P00DQ5_n2279MovParSit, P00DQ5_A2277MovParLiT, P00DQ5_n2277MovParLiT, P00DQ5_A2278MovParAlb, P00DQ5_n2278MovParAlb, P00DQ5_A252CliCod, P00DQ5_A2268MovParCod,
            P00DQ5_A396EmprCod, P00DQ5_A2276MovParLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV16ManCod ;
   private short A2276MovParLin ;
   private short Gx_err ;
   private int AV19ExMvpAlb ;
   private int AV21CliCod ;
   private int A981PartAlbDis ;
   private int A252CliCod ;
   private int A979PartLin ;
   private int A2278MovParAlb ;
   private String AV15EmprCod ;
   private String AV17ExMvpFas ;
   private String AV18ExMvpTip ;
   private String AV20PartCod ;
   private String AV22ExtPdoLoc ;
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
   private boolean n1877PartLoc ;
   private boolean n982PartSitDis ;
   private boolean n980PartLinTip ;
   private boolean n981PartAlbDis ;
   private boolean n252CliCod ;
   private boolean n966PartCod ;
   private boolean n2285MovParLoc ;
   private boolean n2279MovParSit ;
   private boolean n2277MovParLiT ;
   private boolean n2278MovParAlb ;
   private String[] aP7 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private int[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P00DQ3_A1877PartLoc ;
   private boolean[] P00DQ3_n1877PartLoc ;
   private String[] P00DQ3_A982PartSitDis ;
   private boolean[] P00DQ3_n982PartSitDis ;
   private String[] P00DQ3_A980PartLinTip ;
   private boolean[] P00DQ3_n980PartLinTip ;
   private int[] P00DQ3_A981PartAlbDis ;
   private boolean[] P00DQ3_n981PartAlbDis ;
   private int[] P00DQ3_A252CliCod ;
   private boolean[] P00DQ3_n252CliCod ;
   private String[] P00DQ3_A966PartCod ;
   private boolean[] P00DQ3_n966PartCod ;
   private String[] P00DQ3_A396EmprCod ;
   private int[] P00DQ3_A979PartLin ;
   private String[] P00DQ5_A2285MovParLoc ;
   private boolean[] P00DQ5_n2285MovParLoc ;
   private String[] P00DQ5_A2279MovParSit ;
   private boolean[] P00DQ5_n2279MovParSit ;
   private String[] P00DQ5_A2277MovParLiT ;
   private boolean[] P00DQ5_n2277MovParLiT ;
   private int[] P00DQ5_A2278MovParAlb ;
   private boolean[] P00DQ5_n2278MovParAlb ;
   private int[] P00DQ5_A252CliCod ;
   private boolean[] P00DQ5_n252CliCod ;
   private String[] P00DQ5_A2268MovParCod ;
   private String[] P00DQ5_A396EmprCod ;
   private short[] P00DQ5_A2276MovParLin ;
}

final  class pbamvpd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P00DQ2", "DELETE FROM TXPLEXMVP  WHERE (EmprCod = ? and ManCod = ? and ExMvpFas = ?) AND (ExMvpTip = ?) AND (ExMvpAlb = ?) AND (PartCod = ?) AND (CliCod = ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLEXMVP")
         ,new ForEachCursor("P00DQ3", "SELECT PartLoc, PartSitDis, PartLinTip, PartAlbDis, CliCod, PartCod, EmprCod, PartLin FROM TXPLPARTI WHERE (EmprCod = ? and PartCod = ? and CliCod = ? and PartLoc = ?) AND (PartAlbDis = ?) ORDER BY EmprCod, PartCod, CliCod, PartLoc ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00DQ4", "DELETE FROM TXPLPARTI  WHERE EmprCod = ? AND PartCod = ? AND CliCod = ? AND PartLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPARTI")
         ,new ForEachCursor("P00DQ5", "SELECT MovParLoc, MovParSit, MovParLiT, MovParAlb, CliCod, MovParCod, EmprCod, MovParLin FROM TXPLMOVPD WHERE (EmprCod = ? and MovParCod = ? and CliCod = ?) AND (MovParAlb = ?) AND (MovParLoc = ?) ORDER BY EmprCod, MovParCod, CliCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00DQ6", "DELETE FROM TXPLMOVPD  WHERE EmprCod = ? AND MovParCod = ? AND CliCod = ? AND MovParLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMOVPD")
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
               ((int[]) buf[11])[0] = rslt.getInt(8);
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
               ((short[]) buf[11])[0] = rslt.getShort(8);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 16);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 10);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               stmt.setInt(4, ((Number) parms[5]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 10);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

