package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdispq11 extends GXProcedure
{
   public pdispq11( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdispq11.class ), "" );
   }

   public pdispq11( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           String[] aP1 ,
                                           java.math.BigDecimal[] aP2 ,
                                           java.math.BigDecimal[] aP3 ,
                                           java.math.BigDecimal[] aP4 ,
                                           java.math.BigDecimal[] aP5 )
   {
      pdispq11.this.aP6 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 )
   {
      pdispq11.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdispq11.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      pdispq11.this.AV11CntDisQ = aP2[0];
      this.aP2 = aP2;
      pdispq11.this.AV13CntDisQ2 = aP3[0];
      this.aP3 = aP3;
      pdispq11.this.AV12CntDisQu = aP4[0];
      this.aP4 = aP4;
      pdispq11.this.AV15TotCntR = aP5[0];
      this.aP5 = aP5;
      pdispq11.this.AV10ValDisqu = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9PorDisQu = ((AV11CntDisQ.doubleValue()>0) ? (AV13CntDisQ2.add(AV12CntDisQu)).multiply(DecimalUtil.doubleToDec(100)).divide((AV11CntDisQ.add(AV15TotCntR)), 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) ;
      AV9PorDisQu = GXutil.roundDecimal( AV9PorDisQu, 2) ;
      AV10ValDisqu = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P05172 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A724PrdPreAct = P05172_A724PrdPreAct[0] ;
         AV10ValDisqu = GXutil.roundDecimal( A724PrdPreAct.multiply(AV9PorDisQu).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdispq11.this.A396EmprCod;
      this.aP1[0] = pdispq11.this.A719PrdNum;
      this.aP2[0] = pdispq11.this.AV11CntDisQ;
      this.aP3[0] = pdispq11.this.AV13CntDisQ2;
      this.aP4[0] = pdispq11.this.AV12CntDisQu;
      this.aP5[0] = pdispq11.this.AV15TotCntR;
      this.aP6[0] = pdispq11.this.AV10ValDisqu;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9PorDisQu = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P05172_A396EmprCod = new String[] {""} ;
      P05172_A719PrdNum = new String[] {""} ;
      P05172_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdispq11__default(),
         new Object[] {
             new Object[] {
            P05172_A396EmprCod, P05172_A719PrdNum, P05172_A724PrdPreAct
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private java.math.BigDecimal AV11CntDisQ ;
   private java.math.BigDecimal AV13CntDisQ2 ;
   private java.math.BigDecimal AV12CntDisQu ;
   private java.math.BigDecimal AV15TotCntR ;
   private java.math.BigDecimal AV10ValDisqu ;
   private java.math.BigDecimal AV9PorDisQu ;
   private java.math.BigDecimal A724PrdPreAct ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String scmdbuf ;
   private java.math.BigDecimal[] aP6 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P05172_A396EmprCod ;
   private String[] P05172_A719PrdNum ;
   private java.math.BigDecimal[] P05172_A724PrdPreAct ;
}

final  class pdispq11__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05172", "SELECT EmprCod, PrdNum, PrdPreAct FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

