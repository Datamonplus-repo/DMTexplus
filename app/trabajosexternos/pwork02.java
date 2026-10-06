package app.trabajosexternos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pwork02 extends GXProcedure
{
   public pwork02( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pwork02.class ), "" );
   }

   public pwork02( int remoteHandle ,
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
                          java.math.BigDecimal[] aP5 )
   {
      pwork02.this.aP6 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        int[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             int[] aP6 )
   {
      pwork02.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pwork02.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pwork02.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pwork02.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pwork02.this.AV8Barkgm = aP4[0];
      this.aP4 = aP4;
      pwork02.this.AV9BarMtr = aP5[0];
      this.aP5 = aP5;
      pwork02.this.AV10barpie = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Barkgm = DecimalUtil.doubleToDec(0) ;
      AV9BarMtr = DecimalUtil.doubleToDec(0) ;
      AV10barpie = 0 ;
      /* Using cursor P055I3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A166BarKgm = P055I3_A166BarKgm[0] ;
         A184BarMtr = P055I3_A184BarMtr[0] ;
         A199BarPie1 = P055I3_A199BarPie1[0] ;
         A365DisDes = P055I3_A365DisDes[0] ;
         A898BarPieNDes = P055I3_A898BarPieNDes[0] ;
         A166BarKgm = P055I3_A166BarKgm[0] ;
         A184BarMtr = P055I3_A184BarMtr[0] ;
         A199BarPie1 = P055I3_A199BarPie1[0] ;
         A898BarPieNDes = P055I3_A898BarPieNDes[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         AV8Barkgm = A166BarKgm ;
         AV9BarMtr = A184BarMtr ;
         AV10barpie = A198BarPie ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pwork02.this.A396EmprCod;
      this.aP1[0] = pwork02.this.A129BarCod;
      this.aP2[0] = pwork02.this.A132BarCodReo;
      this.aP3[0] = pwork02.this.A130BarCodPar;
      this.aP4[0] = pwork02.this.AV8Barkgm;
      this.aP5[0] = pwork02.this.AV9BarMtr;
      this.aP6[0] = pwork02.this.AV10barpie;
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
      P055I3_A396EmprCod = new String[] {""} ;
      P055I3_A129BarCod = new int[1] ;
      P055I3_A132BarCodReo = new byte[1] ;
      P055I3_A130BarCodPar = new String[] {""} ;
      P055I3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055I3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055I3_A199BarPie1 = new short[1] ;
      P055I3_A365DisDes = new String[] {""} ;
      P055I3_A898BarPieNDes = new int[1] ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.pwork02__default(),
         new Object[] {
             new Object[] {
            P055I3_A396EmprCod, P055I3_A129BarCod, P055I3_A132BarCodReo, P055I3_A130BarCodPar, P055I3_A166BarKgm, P055I3_A184BarMtr, P055I3_A199BarPie1, P055I3_A365DisDes, P055I3_A898BarPieNDes
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
   private int AV10barpie ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private java.math.BigDecimal AV8Barkgm ;
   private java.math.BigDecimal AV9BarMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A365DisDes ;
   private int[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P055I3_A396EmprCod ;
   private int[] P055I3_A129BarCod ;
   private byte[] P055I3_A132BarCodReo ;
   private String[] P055I3_A130BarCodPar ;
   private java.math.BigDecimal[] P055I3_A166BarKgm ;
   private java.math.BigDecimal[] P055I3_A184BarMtr ;
   private short[] P055I3_A199BarPie1 ;
   private String[] P055I3_A365DisDes ;
   private int[] P055I3_A898BarPieNDes ;
}

final  class pwork02__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P055I3", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
      }
   }

}

