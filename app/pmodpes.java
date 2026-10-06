package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmodpes extends GXProcedure
{
   public pmodpes( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmodpes.class ), "" );
   }

   public pmodpes( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      pmodpes.this.aP3 = new String[] {""};
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
      pmodpes.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmodpes.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pmodpes.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pmodpes.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00AT3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A864BarPes = P00AT3_A864BarPes[0] ;
         A184BarMtr = P00AT3_A184BarMtr[0] ;
         A166BarKgm = P00AT3_A166BarKgm[0] ;
         A184BarMtr = P00AT3_A184BarMtr[0] ;
         A166BarKgm = P00AT3_A166BarKgm[0] ;
         A864BarPes = (short)(DecimalUtil.decToDouble(A166BarKgm.multiply(DecimalUtil.doubleToDec(1000)).divide(A184BarMtr, 18, java.math.RoundingMode.DOWN))) ;
         /* Using cursor P00AT4 */
         pr_default.execute(1, new Object[] {Short.valueOf(A864BarPes), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmodpes.this.A396EmprCod;
      this.aP1[0] = pmodpes.this.A129BarCod;
      this.aP2[0] = pmodpes.this.A132BarCodReo;
      this.aP3[0] = pmodpes.this.A130BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmodpes");
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
      P00AT3_A396EmprCod = new String[] {""} ;
      P00AT3_A129BarCod = new int[1] ;
      P00AT3_A132BarCodReo = new byte[1] ;
      P00AT3_A130BarCodPar = new String[] {""} ;
      P00AT3_A864BarPes = new short[1] ;
      P00AT3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00AT3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A184BarMtr = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmodpes__default(),
         new Object[] {
             new Object[] {
            P00AT3_A396EmprCod, P00AT3_A129BarCod, P00AT3_A132BarCodReo, P00AT3_A130BarCodPar, P00AT3_A864BarPes, P00AT3_A184BarMtr, P00AT3_A166BarKgm
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A864BarPes ;
   private short Gx_err ;
   private int A129BarCod ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P00AT3_A396EmprCod ;
   private int[] P00AT3_A129BarCod ;
   private byte[] P00AT3_A132BarCodReo ;
   private String[] P00AT3_A130BarCodPar ;
   private short[] P00AT3_A864BarPes ;
   private java.math.BigDecimal[] P00AT3_A184BarMtr ;
   private java.math.BigDecimal[] P00AT3_A166BarKgm ;
}

final  class pmodpes__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00AT3", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPes, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarKgm, 0) AS BarKgm FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00AT4", "UPDATE TXPBARCAD SET BarPes=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

