package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusrbta extends GXProcedure
{
   public pbusrbta( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusrbta.class ), "" );
   }

   public pbusrbta( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           short[] aP1 ,
                                           String[] aP2 )
   {
      pbusrbta.this.aP3 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        String[] aP2 ,
                        java.math.BigDecimal[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 )
   {
      pbusrbta.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbusrbta.this.A4686MaqTipArt = aP1[0];
      this.aP1 = aP1;
      pbusrbta.this.AV8MaqCod = aP2[0];
      this.aP2 = aP2;
      pbusrbta.this.AV9vRb = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9vRb = DecimalUtil.doubleToDec(0) ;
      lV8MaqCod = GXutil.padr( GXutil.rtrim( AV8MaqCod), 6, "%") ;
      /* Using cursor P01AN2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A4686MaqTipArt), lV8MaqCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A602MaqCod = P01AN2_A602MaqCod[0] ;
         A4690MaqTArMd = P01AN2_A4690MaqTArMd[0] ;
         n4690MaqTArMd = P01AN2_n4690MaqTArMd[0] ;
         AV9vRb = A4690MaqTArMd ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbusrbta.this.A396EmprCod;
      this.aP1[0] = pbusrbta.this.A4686MaqTipArt;
      this.aP2[0] = pbusrbta.this.AV8MaqCod;
      this.aP3[0] = pbusrbta.this.AV9vRb;
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
      P01AN2_A396EmprCod = new String[] {""} ;
      P01AN2_A4686MaqTipArt = new short[1] ;
      P01AN2_A602MaqCod = new String[] {""} ;
      P01AN2_A4690MaqTArMd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01AN2_n4690MaqTArMd = new boolean[] {false} ;
      A602MaqCod = "" ;
      A4690MaqTArMd = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusrbta__default(),
         new Object[] {
             new Object[] {
            P01AN2_A396EmprCod, P01AN2_A4686MaqTipArt, P01AN2_A602MaqCod, P01AN2_A4690MaqTArMd, P01AN2_n4690MaqTArMd
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A4686MaqTipArt ;
   private short Gx_err ;
   private java.math.BigDecimal AV9vRb ;
   private java.math.BigDecimal A4690MaqTArMd ;
   private String A396EmprCod ;
   private String AV8MaqCod ;
   private String lV8MaqCod ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private boolean n4690MaqTArMd ;
   private java.math.BigDecimal[] aP3 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P01AN2_A396EmprCod ;
   private short[] P01AN2_A4686MaqTipArt ;
   private String[] P01AN2_A602MaqCod ;
   private java.math.BigDecimal[] P01AN2_A4690MaqTArMd ;
   private boolean[] P01AN2_n4690MaqTArMd ;
}

final  class pbusrbta__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01AN2", "SELECT EmprCod, MaqTipArt, MaqCod, MaqTArMd FROM TXPMAQTA1 WHERE (EmprCod = ? and MaqTipArt = ?) AND (MaqCod like ?) ORDER BY EmprCod, MaqTipArt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

