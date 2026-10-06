package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pactagr extends GXProcedure
{
   public pactagr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pactagr.class ), "" );
   }

   public pactagr( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      pactagr.this.aP3 = new String[] {""};
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
      pactagr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pactagr.this.AV15BarCod = aP1[0];
      this.aP1 = aP1;
      pactagr.this.AV16BarCodReo = aP2[0];
      this.aP2 = aP2;
      pactagr.this.AV17BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00AQ3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15BarCod), Byte.valueOf(AV16BarCodReo), AV17BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P00AQ3_A130BarCodPar[0] ;
         A132BarCodReo = P00AQ3_A132BarCodReo[0] ;
         A129BarCod = P00AQ3_A129BarCod[0] ;
         A166BarKgm = P00AQ3_A166BarKgm[0] ;
         A184BarMtr = P00AQ3_A184BarMtr[0] ;
         A199BarPie1 = P00AQ3_A199BarPie1[0] ;
         A365DisDes = P00AQ3_A365DisDes[0] ;
         A898BarPieNDes = P00AQ3_A898BarPieNDes[0] ;
         A166BarKgm = P00AQ3_A166BarKgm[0] ;
         A184BarMtr = P00AQ3_A184BarMtr[0] ;
         A199BarPie1 = P00AQ3_A199BarPie1[0] ;
         A898BarPieNDes = P00AQ3_A898BarPieNDes[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         AV18Kilos = A166BarKgm ;
         AV19Metros = A184BarMtr ;
         AV20Piezas = A198BarPie ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Optimized UPDATE. */
      /* Using cursor P00AQ4 */
      short AV20Piezas671Aux;
      AV20Piezas671Aux = (short)(AV20Piezas) ;
      pr_default.execute(1, new Object[] {Short.valueOf(AV20Piezas671Aux), AV19Metros, AV18Kilos, A396EmprCod, Integer.valueOf(AV15BarCod), Byte.valueOf(AV16BarCodReo), AV17BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAGR");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pactagr.this.A396EmprCod;
      this.aP1[0] = pactagr.this.AV15BarCod;
      this.aP2[0] = pactagr.this.AV16BarCodReo;
      this.aP3[0] = pactagr.this.AV17BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pactagr");
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
      P00AQ3_A396EmprCod = new String[] {""} ;
      P00AQ3_A130BarCodPar = new String[] {""} ;
      P00AQ3_A132BarCodReo = new byte[1] ;
      P00AQ3_A129BarCod = new int[1] ;
      P00AQ3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00AQ3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00AQ3_A199BarPie1 = new short[1] ;
      P00AQ3_A365DisDes = new String[] {""} ;
      P00AQ3_A898BarPieNDes = new int[1] ;
      A130BarCodPar = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      AV18Kilos = DecimalUtil.ZERO ;
      AV19Metros = DecimalUtil.ZERO ;
      A869MtrAgr = DecimalUtil.ZERO ;
      A590KgmAgr = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pactagr__default(),
         new Object[] {
             new Object[] {
            P00AQ3_A396EmprCod, P00AQ3_A130BarCodPar, P00AQ3_A132BarCodReo, P00AQ3_A129BarCod, P00AQ3_A166BarKgm, P00AQ3_A184BarMtr, P00AQ3_A199BarPie1, P00AQ3_A365DisDes, P00AQ3_A898BarPieNDes
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16BarCodReo ;
   private byte A132BarCodReo ;
   private short A199BarPie1 ;
   private short A671PieAgr ;
   private short Gx_err ;
   private int AV15BarCod ;
   private int A129BarCod ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int AV20Piezas ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV18Kilos ;
   private java.math.BigDecimal AV19Metros ;
   private java.math.BigDecimal A869MtrAgr ;
   private java.math.BigDecimal A590KgmAgr ;
   private String A396EmprCod ;
   private String AV17BarCodPar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A365DisDes ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P00AQ3_A396EmprCod ;
   private String[] P00AQ3_A130BarCodPar ;
   private byte[] P00AQ3_A132BarCodReo ;
   private int[] P00AQ3_A129BarCod ;
   private java.math.BigDecimal[] P00AQ3_A166BarKgm ;
   private java.math.BigDecimal[] P00AQ3_A184BarMtr ;
   private short[] P00AQ3_A199BarPie1 ;
   private String[] P00AQ3_A365DisDes ;
   private int[] P00AQ3_A898BarPieNDes ;
}

final  class pactagr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00AQ3", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00AQ4", "UPDATE TXPBARAGR SET PieAgr=?, MtrAgr=?, KgmAgr=?  WHERE (EmprCod = ?) AND (BarAgrCod = ?) AND (BarAgrReo = ?) AND (BarAgrPar = ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARAGR")
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
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((int[]) buf[8])[0] = rslt.getInt(9);
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
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
      }
   }

}

