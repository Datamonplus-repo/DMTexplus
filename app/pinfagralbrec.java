package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pinfagralbrec extends GXProcedure
{
   public pinfagralbrec( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pinfagralbrec.class ), "" );
   }

   public pinfagralbrec( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 ,
                          java.math.BigDecimal[] aP4 ,
                          String[] aP5 ,
                          int[] aP6 ,
                          String[] aP7 )
   {
      pinfagralbrec.this.aP8 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        String[] aP5 ,
                        int[] aP6 ,
                        String[] aP7 ,
                        int[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 ,
                             String[] aP7 ,
                             int[] aP8 )
   {
      pinfagralbrec.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pinfagralbrec.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pinfagralbrec.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pinfagralbrec.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pinfagralbrec.this.AV9KgsAgr = aP4[0];
      this.aP4 = aP4;
      pinfagralbrec.this.AV10BarSerDsc = aP5[0];
      this.aP5 = aP5;
      pinfagralbrec.this.AV13Albreccod = aP6[0];
      this.aP6 = aP6;
      pinfagralbrec.this.AV14AlbRLoc = aP7[0];
      this.aP7 = aP7;
      pinfagralbrec.this.AV11BarPie = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13Albreccod = 0 ;
      AV14AlbRLoc = "" ;
      /* Using cursor P05DB3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1652BarSerDsc = P05DB3_A1652BarSerDsc[0] ;
         A166BarKgm = P05DB3_A166BarKgm[0] ;
         A199BarPie1 = P05DB3_A199BarPie1[0] ;
         A365DisDes = P05DB3_A365DisDes[0] ;
         A898BarPieNDes = P05DB3_A898BarPieNDes[0] ;
         A166BarKgm = P05DB3_A166BarKgm[0] ;
         A199BarPie1 = P05DB3_A199BarPie1[0] ;
         A898BarPieNDes = P05DB3_A898BarPieNDes[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         AV9KgsAgr = A166BarKgm ;
         AV11BarPie = A198BarPie ;
         AV10BarSerDsc = A1652BarSerDsc ;
         /* Using cursor P05DB4 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A44AlbRecCod = P05DB4_A44AlbRecCod[0] ;
            A50AlbRLoc = P05DB4_A50AlbRLoc[0] ;
            A200BarPieCod = P05DB4_A200BarPieCod[0] ;
            A50AlbRLoc = P05DB4_A50AlbRLoc[0] ;
            AV13Albreccod = A44AlbRecCod ;
            AV14AlbRLoc = A50AlbRLoc ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pinfagralbrec.this.A396EmprCod;
      this.aP1[0] = pinfagralbrec.this.A129BarCod;
      this.aP2[0] = pinfagralbrec.this.A132BarCodReo;
      this.aP3[0] = pinfagralbrec.this.A130BarCodPar;
      this.aP4[0] = pinfagralbrec.this.AV9KgsAgr;
      this.aP5[0] = pinfagralbrec.this.AV10BarSerDsc;
      this.aP6[0] = pinfagralbrec.this.AV13Albreccod;
      this.aP7[0] = pinfagralbrec.this.AV14AlbRLoc;
      this.aP8[0] = pinfagralbrec.this.AV11BarPie;
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
      P05DB3_A396EmprCod = new String[] {""} ;
      P05DB3_A129BarCod = new int[1] ;
      P05DB3_A132BarCodReo = new byte[1] ;
      P05DB3_A130BarCodPar = new String[] {""} ;
      P05DB3_A1652BarSerDsc = new String[] {""} ;
      P05DB3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05DB3_A199BarPie1 = new short[1] ;
      P05DB3_A365DisDes = new String[] {""} ;
      P05DB3_A898BarPieNDes = new int[1] ;
      A1652BarSerDsc = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      P05DB4_A396EmprCod = new String[] {""} ;
      P05DB4_A129BarCod = new int[1] ;
      P05DB4_A132BarCodReo = new byte[1] ;
      P05DB4_A130BarCodPar = new String[] {""} ;
      P05DB4_A44AlbRecCod = new int[1] ;
      P05DB4_A50AlbRLoc = new String[] {""} ;
      P05DB4_A200BarPieCod = new String[] {""} ;
      A50AlbRLoc = "" ;
      A200BarPieCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pinfagralbrec__default(),
         new Object[] {
             new Object[] {
            P05DB3_A396EmprCod, P05DB3_A129BarCod, P05DB3_A132BarCodReo, P05DB3_A130BarCodPar, P05DB3_A1652BarSerDsc, P05DB3_A166BarKgm, P05DB3_A199BarPie1, P05DB3_A365DisDes, P05DB3_A898BarPieNDes
            }
            , new Object[] {
            P05DB4_A396EmprCod, P05DB4_A129BarCod, P05DB4_A132BarCodReo, P05DB4_A130BarCodPar, P05DB4_A44AlbRecCod, P05DB4_A50AlbRLoc, P05DB4_A200BarPieCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A199BarPie1 ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV13Albreccod ;
   private int AV11BarPie ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int A44AlbRecCod ;
   private java.math.BigDecimal AV9KgsAgr ;
   private java.math.BigDecimal A166BarKgm ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV10BarSerDsc ;
   private String AV14AlbRLoc ;
   private String scmdbuf ;
   private String A1652BarSerDsc ;
   private String A365DisDes ;
   private String A50AlbRLoc ;
   private String A200BarPieCod ;
   private int[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private String[] aP5 ;
   private int[] aP6 ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P05DB3_A396EmprCod ;
   private int[] P05DB3_A129BarCod ;
   private byte[] P05DB3_A132BarCodReo ;
   private String[] P05DB3_A130BarCodPar ;
   private String[] P05DB3_A1652BarSerDsc ;
   private java.math.BigDecimal[] P05DB3_A166BarKgm ;
   private short[] P05DB3_A199BarPie1 ;
   private String[] P05DB3_A365DisDes ;
   private int[] P05DB3_A898BarPieNDes ;
   private String[] P05DB4_A396EmprCod ;
   private int[] P05DB4_A129BarCod ;
   private byte[] P05DB4_A132BarCodReo ;
   private String[] P05DB4_A130BarCodPar ;
   private int[] P05DB4_A44AlbRecCod ;
   private String[] P05DB4_A50AlbRLoc ;
   private String[] P05DB4_A200BarPieCod ;
}

final  class pinfagralbrec__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05DB3", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarSerDsc, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05DB4", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.AlbRecCod, T2.AlbRLoc, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((String[]) buf[6])[0] = rslt.getString(7, 9);
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
      }
   }

}

