package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptothdr extends GXProcedure
{
   public ptothdr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptothdr.class ), "" );
   }

   public ptothdr( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 )
   {
      ptothdr.this.aP2 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        java.math.BigDecimal[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             java.math.BigDecimal[] aP2 )
   {
      ptothdr.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      ptothdr.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      ptothdr.this.AV69TotUni = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV69TotUni = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P03793 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A129BarCod = P03793_A129BarCod[0] ;
         A396EmprCod = P03793_A396EmprCod[0] ;
         A228BarUniMed = P03793_A228BarUniMed[0] ;
         A130BarCodPar = P03793_A130BarCodPar[0] ;
         A132BarCodReo = P03793_A132BarCodReo[0] ;
         A184BarMtr = P03793_A184BarMtr[0] ;
         A166BarKgm = P03793_A166BarKgm[0] ;
         A184BarMtr = P03793_A184BarMtr[0] ;
         A166BarKgm = P03793_A166BarKgm[0] ;
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
      this.aP0[0] = ptothdr.this.AV15EmprCod;
      this.aP1[0] = ptothdr.this.AV16BarCod;
      this.aP2[0] = ptothdr.this.AV69TotUni;
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
      P03793_A129BarCod = new int[1] ;
      P03793_A396EmprCod = new String[] {""} ;
      P03793_A228BarUniMed = new String[] {""} ;
      P03793_A130BarCodPar = new String[] {""} ;
      P03793_A132BarCodReo = new byte[1] ;
      P03793_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03793_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A396EmprCod = "" ;
      A228BarUniMed = "" ;
      A130BarCodPar = "" ;
      A184BarMtr = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      AV44UniMed = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptothdr__default(),
         new Object[] {
             new Object[] {
            P03793_A129BarCod, P03793_A396EmprCod, P03793_A228BarUniMed, P03793_A130BarCodPar, P03793_A132BarCodReo, P03793_A184BarMtr, P03793_A166BarKgm
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int AV16BarCod ;
   private int A129BarCod ;
   private java.math.BigDecimal AV69TotUni ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private String AV15EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A228BarUniMed ;
   private String A130BarCodPar ;
   private String AV44UniMed ;
   private java.math.BigDecimal[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private int[] P03793_A129BarCod ;
   private String[] P03793_A396EmprCod ;
   private String[] P03793_A228BarUniMed ;
   private String[] P03793_A130BarCodPar ;
   private byte[] P03793_A132BarCodReo ;
   private java.math.BigDecimal[] P03793_A184BarMtr ;
   private java.math.BigDecimal[] P03793_A166BarKgm ;
}

final  class ptothdr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03793", "SELECT T1.BarCod, T1.EmprCod, T1.BarUniMed, T1.BarCodPar, T1.BarCodReo, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarKgm, 0) AS BarKgm FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
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
               return;
      }
   }

}

