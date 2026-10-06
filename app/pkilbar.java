package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pkilbar extends GXProcedure
{
   public pkilbar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pkilbar.class ), "" );
   }

   public pkilbar( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      pkilbar.this.aP3 = new String[] {""};
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
      pkilbar.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pkilbar.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pkilbar.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pkilbar.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P004S2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A228BarUniMed = P004S2_A228BarUniMed[0] ;
         A864BarPes = P004S2_A864BarPes[0] ;
         A205BarPieMet = P004S2_A205BarPieMet[0] ;
         A203BarPieKil = P004S2_A203BarPieKil[0] ;
         A200BarPieCod = P004S2_A200BarPieCod[0] ;
         A228BarUniMed = P004S2_A228BarUniMed[0] ;
         A864BarPes = P004S2_A864BarPes[0] ;
         if ( GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "M", "")) == 0 )
         {
            A203BarPieKil = A205BarPieMet.multiply(DecimalUtil.doubleToDec(A864BarPes)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         }
         /* Using cursor P004S3 */
         pr_default.execute(1, new Object[] {A203BarPieKil, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pkilbar.this.A396EmprCod;
      this.aP1[0] = pkilbar.this.A129BarCod;
      this.aP2[0] = pkilbar.this.A132BarCodReo;
      this.aP3[0] = pkilbar.this.A130BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pkilbar");
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
      P004S2_A396EmprCod = new String[] {""} ;
      P004S2_A129BarCod = new int[1] ;
      P004S2_A132BarCodReo = new byte[1] ;
      P004S2_A130BarCodPar = new String[] {""} ;
      P004S2_A228BarUniMed = new String[] {""} ;
      P004S2_A864BarPes = new short[1] ;
      P004S2_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004S2_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004S2_A200BarPieCod = new String[] {""} ;
      A228BarUniMed = "" ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pkilbar__default(),
         new Object[] {
             new Object[] {
            P004S2_A396EmprCod, P004S2_A129BarCod, P004S2_A132BarCodReo, P004S2_A130BarCodPar, P004S2_A228BarUniMed, P004S2_A864BarPes, P004S2_A205BarPieMet, P004S2_A203BarPieKil, P004S2_A200BarPieCod
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
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A203BarPieKil ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A228BarUniMed ;
   private String A200BarPieCod ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P004S2_A396EmprCod ;
   private int[] P004S2_A129BarCod ;
   private byte[] P004S2_A132BarCodReo ;
   private String[] P004S2_A130BarCodPar ;
   private String[] P004S2_A228BarUniMed ;
   private short[] P004S2_A864BarPes ;
   private java.math.BigDecimal[] P004S2_A205BarPieMet ;
   private java.math.BigDecimal[] P004S2_A203BarPieKil ;
   private String[] P004S2_A200BarPieCod ;
}

final  class pkilbar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P004S2", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.BarUniMed, T2.BarPes, T1.BarPieMet, T1.BarPieKil, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P004S3", "UPDATE TXPBARPIE SET BarPieKil=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
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
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 9);
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
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
      }
   }

}

