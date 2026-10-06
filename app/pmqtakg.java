package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmqtakg extends GXProcedure
{
   public pmqtakg( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmqtakg.class ), "" );
   }

   public pmqtakg( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           short[] aP1 ,
                                           String[] aP2 ,
                                           java.math.BigDecimal[] aP3 ,
                                           java.math.BigDecimal[] aP4 )
   {
      pmqtakg.this.aP5 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        String[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 )
   {
      pmqtakg.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmqtakg.this.A4686MaqTipArt = aP1[0];
      this.aP1 = aP1;
      pmqtakg.this.AV8MaqCod = aP2[0];
      this.aP2 = aP2;
      pmqtakg.this.AV10MaqTakmd = aP3[0];
      this.aP3 = aP3;
      pmqtakg.this.AV11MaqTAKMm = aP4[0];
      this.aP4 = aP4;
      pmqtakg.this.AV9MaqTakMx = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      lV8MaqCod = GXutil.padr( GXutil.rtrim( AV8MaqCod), 6, "%") ;
      /* Using cursor P01BK2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A4686MaqTipArt), lV8MaqCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A602MaqCod = P01BK2_A602MaqCod[0] ;
         A4655MaqTAKMx = P01BK2_A4655MaqTAKMx[0] ;
         n4655MaqTAKMx = P01BK2_n4655MaqTAKMx[0] ;
         A4656MaqTAKMd = P01BK2_A4656MaqTAKMd[0] ;
         n4656MaqTAKMd = P01BK2_n4656MaqTAKMd[0] ;
         A4657MaqTAKMm = P01BK2_A4657MaqTAKMm[0] ;
         n4657MaqTAKMm = P01BK2_n4657MaqTAKMm[0] ;
         AV9MaqTakMx = A4655MaqTAKMx ;
         AV10MaqTakmd = A4656MaqTAKMd ;
         AV11MaqTAKMm = A4657MaqTAKMm ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmqtakg.this.A396EmprCod;
      this.aP1[0] = pmqtakg.this.A4686MaqTipArt;
      this.aP2[0] = pmqtakg.this.AV8MaqCod;
      this.aP3[0] = pmqtakg.this.AV10MaqTakmd;
      this.aP4[0] = pmqtakg.this.AV11MaqTAKMm;
      this.aP5[0] = pmqtakg.this.AV9MaqTakMx;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      lV8MaqCod = "" ;
      scmdbuf = "" ;
      P01BK2_A396EmprCod = new String[] {""} ;
      P01BK2_A4686MaqTipArt = new short[1] ;
      P01BK2_A602MaqCod = new String[] {""} ;
      P01BK2_A4655MaqTAKMx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01BK2_n4655MaqTAKMx = new boolean[] {false} ;
      P01BK2_A4656MaqTAKMd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01BK2_n4656MaqTAKMd = new boolean[] {false} ;
      P01BK2_A4657MaqTAKMm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01BK2_n4657MaqTAKMm = new boolean[] {false} ;
      A602MaqCod = "" ;
      A4655MaqTAKMx = DecimalUtil.ZERO ;
      A4656MaqTAKMd = DecimalUtil.ZERO ;
      A4657MaqTAKMm = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmqtakg__default(),
         new Object[] {
             new Object[] {
            P01BK2_A396EmprCod, P01BK2_A4686MaqTipArt, P01BK2_A602MaqCod, P01BK2_A4655MaqTAKMx, P01BK2_n4655MaqTAKMx, P01BK2_A4656MaqTAKMd, P01BK2_n4656MaqTAKMd, P01BK2_A4657MaqTAKMm, P01BK2_n4657MaqTAKMm
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A4686MaqTipArt ;
   private short Gx_err ;
   private java.math.BigDecimal AV10MaqTakmd ;
   private java.math.BigDecimal AV11MaqTAKMm ;
   private java.math.BigDecimal AV9MaqTakMx ;
   private java.math.BigDecimal A4655MaqTAKMx ;
   private java.math.BigDecimal A4656MaqTAKMd ;
   private java.math.BigDecimal A4657MaqTAKMm ;
   private String A396EmprCod ;
   private String AV8MaqCod ;
   private String lV8MaqCod ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private boolean n4655MaqTAKMx ;
   private boolean n4656MaqTAKMd ;
   private boolean n4657MaqTAKMm ;
   private java.math.BigDecimal[] aP5 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private String[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P01BK2_A396EmprCod ;
   private short[] P01BK2_A4686MaqTipArt ;
   private String[] P01BK2_A602MaqCod ;
   private java.math.BigDecimal[] P01BK2_A4655MaqTAKMx ;
   private boolean[] P01BK2_n4655MaqTAKMx ;
   private java.math.BigDecimal[] P01BK2_A4656MaqTAKMd ;
   private boolean[] P01BK2_n4656MaqTAKMd ;
   private java.math.BigDecimal[] P01BK2_A4657MaqTAKMm ;
   private boolean[] P01BK2_n4657MaqTAKMm ;
}

final  class pmqtakg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01BK2", "SELECT EmprCod, MaqTipArt, MaqCod, MaqTAKMx, MaqTAKMd, MaqTAKMm FROM TXPMAQTA1 WHERE (EmprCod = ? and MaqTipArt = ?) AND (MaqCod like ?) ORDER BY EmprCod, MaqTipArt, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

