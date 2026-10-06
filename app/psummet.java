package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psummet extends GXProcedure
{
   public psummet( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psummet.class ), "" );
   }

   public psummet( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 ,
                                           java.math.BigDecimal[] aP4 ,
                                           java.math.BigDecimal[] aP5 ,
                                           java.math.BigDecimal[] aP6 )
   {
      psummet.this.aP7 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 )
   {
      psummet.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      psummet.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      psummet.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      psummet.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      psummet.this.AV15Metros = aP4[0];
      this.aP4 = aP4;
      psummet.this.AV16Metros2 = aP5[0];
      this.aP5 = aP5;
      psummet.this.AV17BarKgm = aP6[0];
      this.aP6 = aP6;
      psummet.this.AV18BarKgm2 = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Metros = DecimalUtil.ZERO ;
      AV17BarKgm = DecimalUtil.ZERO ;
      /* Using cursor P008M3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A184BarMtr = P008M3_A184BarMtr[0] ;
         A166BarKgm = P008M3_A166BarKgm[0] ;
         A184BarMtr = P008M3_A184BarMtr[0] ;
         A166BarKgm = P008M3_A166BarKgm[0] ;
         AV19Metros1 = A184BarMtr ;
         AV20BarKgm1 = A166BarKgm ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV15Metros = AV19Metros1.subtract(AV16Metros2) ;
      AV17BarKgm = AV20BarKgm1.subtract(AV18BarKgm2) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = psummet.this.A396EmprCod;
      this.aP1[0] = psummet.this.A129BarCod;
      this.aP2[0] = psummet.this.A132BarCodReo;
      this.aP3[0] = psummet.this.A130BarCodPar;
      this.aP4[0] = psummet.this.AV15Metros;
      this.aP5[0] = psummet.this.AV16Metros2;
      this.aP6[0] = psummet.this.AV17BarKgm;
      this.aP7[0] = psummet.this.AV18BarKgm2;
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
      P008M3_A396EmprCod = new String[] {""} ;
      P008M3_A129BarCod = new int[1] ;
      P008M3_A132BarCodReo = new byte[1] ;
      P008M3_A130BarCodPar = new String[] {""} ;
      P008M3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008M3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A184BarMtr = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      AV19Metros1 = DecimalUtil.ZERO ;
      AV20BarKgm1 = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.psummet__default(),
         new Object[] {
             new Object[] {
            P008M3_A396EmprCod, P008M3_A129BarCod, P008M3_A132BarCodReo, P008M3_A130BarCodPar, P008M3_A184BarMtr, P008M3_A166BarKgm
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private java.math.BigDecimal AV15Metros ;
   private java.math.BigDecimal AV16Metros2 ;
   private java.math.BigDecimal AV17BarKgm ;
   private java.math.BigDecimal AV18BarKgm2 ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV19Metros1 ;
   private java.math.BigDecimal AV20BarKgm1 ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private java.math.BigDecimal[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P008M3_A396EmprCod ;
   private int[] P008M3_A129BarCod ;
   private byte[] P008M3_A132BarCodReo ;
   private String[] P008M3_A130BarCodPar ;
   private java.math.BigDecimal[] P008M3_A184BarMtr ;
   private java.math.BigDecimal[] P008M3_A166BarKgm ;
}

final  class psummet__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P008M3", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarKgm, 0) AS BarKgm FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

