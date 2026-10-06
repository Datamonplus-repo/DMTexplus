package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptotpar extends GXProcedure
{
   public ptotpar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptotpar.class ), "" );
   }

   public ptotpar( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 )
   {
      ptotpar.this.aP3 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        java.math.BigDecimal[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             java.math.BigDecimal[] aP3 )
   {
      ptotpar.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      ptotpar.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      ptotpar.this.AV17BarReo = aP2[0];
      this.aP2 = aP2;
      ptotpar.this.AV69TotUni = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV69TotUni = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P01233 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarReo)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P01233_A130BarCodPar[0] ;
         A132BarCodReo = P01233_A132BarCodReo[0] ;
         A129BarCod = P01233_A129BarCod[0] ;
         A396EmprCod = P01233_A396EmprCod[0] ;
         A228BarUniMed = P01233_A228BarUniMed[0] ;
         A184BarMtr = P01233_A184BarMtr[0] ;
         A166BarKgm = P01233_A166BarKgm[0] ;
         A184BarMtr = P01233_A184BarMtr[0] ;
         A166BarKgm = P01233_A166BarKgm[0] ;
         if ( GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "M", "")) == 0 )
         {
            AV69TotUni = AV69TotUni.add(GXutil.roundDecimal( A184BarMtr, 0)) ;
            AV44UniMed = httpContext.getMessage( "M", "") ;
         }
         else
         {
            AV69TotUni = AV69TotUni.add(GXutil.roundDecimal( A166BarKgm, 0)) ;
            AV44UniMed = httpContext.getMessage( "K", "") ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptotpar.this.AV15EmprCod;
      this.aP1[0] = ptotpar.this.AV16BarCod;
      this.aP2[0] = ptotpar.this.AV17BarReo;
      this.aP3[0] = ptotpar.this.AV69TotUni;
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
      P01233_A130BarCodPar = new String[] {""} ;
      P01233_A132BarCodReo = new byte[1] ;
      P01233_A129BarCod = new int[1] ;
      P01233_A396EmprCod = new String[] {""} ;
      P01233_A228BarUniMed = new String[] {""} ;
      P01233_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01233_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A228BarUniMed = "" ;
      A184BarMtr = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      AV44UniMed = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptotpar__default(),
         new Object[] {
             new Object[] {
            P01233_A130BarCodPar, P01233_A132BarCodReo, P01233_A129BarCod, P01233_A396EmprCod, P01233_A228BarUniMed, P01233_A184BarMtr, P01233_A166BarKgm
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17BarReo ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int AV16BarCod ;
   private int A129BarCod ;
   private java.math.BigDecimal AV69TotUni ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private String AV15EmprCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A228BarUniMed ;
   private String AV44UniMed ;
   private java.math.BigDecimal[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P01233_A130BarCodPar ;
   private byte[] P01233_A132BarCodReo ;
   private int[] P01233_A129BarCod ;
   private String[] P01233_A396EmprCod ;
   private String[] P01233_A228BarUniMed ;
   private java.math.BigDecimal[] P01233_A184BarMtr ;
   private java.math.BigDecimal[] P01233_A166BarKgm ;
}

final  class ptotpar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01233", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.BarUniMed, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarKgm, 0) AS BarKgm FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
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
               return;
      }
   }

}

