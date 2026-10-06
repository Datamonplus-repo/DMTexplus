package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prcnc90 extends GXProcedure
{
   public prcnc90( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prcnc90.class ), "" );
   }

   public prcnc90( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 )
   {
      prcnc90.this.aP4 = new long[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        long[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             long[] aP4 )
   {
      prcnc90.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      prcnc90.this.AV8Barcod = aP1[0];
      this.aP1 = aP1;
      prcnc90.this.AV9Barcodreo = aP2[0];
      this.aP2 = aP2;
      prcnc90.this.AV10Barcodpar = aP3[0];
      this.aP3 = aP3;
      prcnc90.this.AV11AlbProcod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04472 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8Barcod), Byte.valueOf(AV9Barcodreo), AV10Barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10718RcNcHd = P04472_A10718RcNcHd[0] ;
         n10718RcNcHd = P04472_n10718RcNcHd[0] ;
         A10719RcNcR = P04472_A10719RcNcR[0] ;
         n10719RcNcR = P04472_n10719RcNcR[0] ;
         A10720RcNcP = P04472_A10720RcNcP[0] ;
         n10720RcNcP = P04472_n10720RcNcP[0] ;
         A10717RcNcLin = P04472_A10717RcNcLin[0] ;
         A10715RcNcFec = P04472_A10715RcNcFec[0] ;
         A10728RcNcGR = P04472_A10728RcNcGR[0] ;
         n10728RcNcGR = P04472_n10728RcNcGR[0] ;
         /* Optimized DELETE. */
         /* Using cursor P04473 */
         pr_default.execute(1, new Object[] {A396EmprCod, A10715RcNcFec, Integer.valueOf(A10717RcNcLin), Long.valueOf(AV11AlbProcod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRCNC02");
         /* End optimized DELETE. */
         A10728RcNcGR = 0 ;
         n10728RcNcGR = false ;
         /* Using cursor P04474 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n10728RcNcGR), Long.valueOf(A10728RcNcGR), A396EmprCod, A10715RcNcFec, Integer.valueOf(A10717RcNcLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRCNC01");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = prcnc90.this.A396EmprCod;
      this.aP1[0] = prcnc90.this.AV8Barcod;
      this.aP2[0] = prcnc90.this.AV9Barcodreo;
      this.aP3[0] = prcnc90.this.AV10Barcodpar;
      this.aP4[0] = prcnc90.this.AV11AlbProcod;
      Application.commitDataStores(context, remoteHandle, pr_default, "prcnc90");
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
      P04472_A396EmprCod = new String[] {""} ;
      P04472_A10718RcNcHd = new int[1] ;
      P04472_n10718RcNcHd = new boolean[] {false} ;
      P04472_A10719RcNcR = new byte[1] ;
      P04472_n10719RcNcR = new boolean[] {false} ;
      P04472_A10720RcNcP = new String[] {""} ;
      P04472_n10720RcNcP = new boolean[] {false} ;
      P04472_A10717RcNcLin = new int[1] ;
      P04472_A10715RcNcFec = new java.util.Date[] {GXutil.nullDate()} ;
      P04472_A10728RcNcGR = new long[1] ;
      P04472_n10728RcNcGR = new boolean[] {false} ;
      A10720RcNcP = "" ;
      A10715RcNcFec = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prcnc90__default(),
         new Object[] {
             new Object[] {
            P04472_A396EmprCod, P04472_A10718RcNcHd, P04472_n10718RcNcHd, P04472_A10719RcNcR, P04472_n10719RcNcR, P04472_A10720RcNcP, P04472_n10720RcNcP, P04472_A10717RcNcLin, P04472_A10715RcNcFec, P04472_A10728RcNcGR,
            P04472_n10728RcNcGR
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

   private byte AV9Barcodreo ;
   private byte A10719RcNcR ;
   private short Gx_err ;
   private int AV8Barcod ;
   private int A10718RcNcHd ;
   private int A10717RcNcLin ;
   private long AV11AlbProcod ;
   private long A10728RcNcGR ;
   private String A396EmprCod ;
   private String AV10Barcodpar ;
   private String scmdbuf ;
   private String A10720RcNcP ;
   private java.util.Date A10715RcNcFec ;
   private boolean n10718RcNcHd ;
   private boolean n10719RcNcR ;
   private boolean n10720RcNcP ;
   private boolean n10728RcNcGR ;
   private long[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P04472_A396EmprCod ;
   private int[] P04472_A10718RcNcHd ;
   private boolean[] P04472_n10718RcNcHd ;
   private byte[] P04472_A10719RcNcR ;
   private boolean[] P04472_n10719RcNcR ;
   private String[] P04472_A10720RcNcP ;
   private boolean[] P04472_n10720RcNcP ;
   private int[] P04472_A10717RcNcLin ;
   private java.util.Date[] P04472_A10715RcNcFec ;
   private long[] P04472_A10728RcNcGR ;
   private boolean[] P04472_n10728RcNcGR ;
}

final  class prcnc90__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04472", "SELECT EmprCod, RcNcHd, RcNcR, RcNcP, RcNcLin, RcNcFec, RcNcGR FROM TXPRCNC01 WHERE EmprCod = ? and RcNcHd = ? and RcNcR = ? and RcNcP = ? ORDER BY EmprCod, RcNcHd, RcNcR, RcNcP ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04473", "DELETE FROM TXPRCNC02  WHERE EmprCod = ? and RcNcFec = ? and RcNcLin = ? and RcNcGrn = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRCNC02")
         ,new UpdateCursor("P04474", "UPDATE TXPRCNC01 SET RcNcGR=?  WHERE EmprCod = ? AND RcNcFec = ? AND RcNcLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRCNC01")
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(6);
               ((long[]) buf[9])[0] = rslt.getLong(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setDate(3, (java.util.Date)parms[3]);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
      }
   }

}

