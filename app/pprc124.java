package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc124 extends GXProcedure
{
   public pprc124( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc124.class ), "" );
   }

   public pprc124( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           String[] aP1 ,
                                           java.util.Date[] aP2 ,
                                           java.math.BigDecimal[] aP3 )
   {
      pprc124.this.aP4 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.util.Date[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.math.BigDecimal[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 )
   {
      pprc124.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprc124.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      pprc124.this.A3348CCStkFec = aP2[0];
      this.aP2 = aP2;
      pprc124.this.AV8ComprasInv = aP3[0];
      this.aP3 = aP3;
      pprc124.this.AV9ConsumosInv = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8ComprasInv = DecimalUtil.ZERO ;
      AV9ConsumosInv = DecimalUtil.ZERO ;
      /* Using cursor P05LL2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum, A3348CCStkFec});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3343CCStkCanE = P05LL2_A3343CCStkCanE[0] ;
         A3345TipMovCc = P05LL2_A3345TipMovCc[0] ;
         A3344CCStkCanS = P05LL2_A3344CCStkCanS[0] ;
         A3356CCStkHor = P05LL2_A3356CCStkHor[0] ;
         A3342CCStkLin = P05LL2_A3342CCStkLin[0] ;
         AV8ComprasInv = AV8ComprasInv.add((((GXutil.strcmp(A3345TipMovCc, "EN")==0) ? A3343CCStkCanE : DecimalUtil.doubleToDec(0)))) ;
         AV9ConsumosInv = AV9ConsumosInv.add((((GXutil.strcmp(A3345TipMovCc, "SC")==0)||(GXutil.strcmp(A3345TipMovCc, "SM")==0)||(GXutil.strcmp(A3345TipMovCc, "SD")==0) ? A3344CCStkCanS : DecimalUtil.doubleToDec(0)))) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc124.this.A396EmprCod;
      this.aP1[0] = pprc124.this.A719PrdNum;
      this.aP2[0] = pprc124.this.A3348CCStkFec;
      this.aP3[0] = pprc124.this.AV8ComprasInv;
      this.aP4[0] = pprc124.this.AV9ConsumosInv;
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
      P05LL2_A396EmprCod = new String[] {""} ;
      P05LL2_A719PrdNum = new String[] {""} ;
      P05LL2_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05LL2_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05LL2_A3345TipMovCc = new String[] {""} ;
      P05LL2_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05LL2_A3356CCStkHor = new String[] {""} ;
      P05LL2_A3342CCStkLin = new long[1] ;
      A3343CCStkCanE = DecimalUtil.ZERO ;
      A3345TipMovCc = "" ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      A3356CCStkHor = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc124__default(),
         new Object[] {
             new Object[] {
            P05LL2_A396EmprCod, P05LL2_A719PrdNum, P05LL2_A3348CCStkFec, P05LL2_A3343CCStkCanE, P05LL2_A3345TipMovCc, P05LL2_A3344CCStkCanS, P05LL2_A3356CCStkHor, P05LL2_A3342CCStkLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long A3342CCStkLin ;
   private java.math.BigDecimal AV8ComprasInv ;
   private java.math.BigDecimal AV9ConsumosInv ;
   private java.math.BigDecimal A3343CCStkCanE ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String scmdbuf ;
   private String A3345TipMovCc ;
   private String A3356CCStkHor ;
   private java.util.Date A3348CCStkFec ;
   private java.math.BigDecimal[] aP4 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.util.Date[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P05LL2_A396EmprCod ;
   private String[] P05LL2_A719PrdNum ;
   private java.util.Date[] P05LL2_A3348CCStkFec ;
   private java.math.BigDecimal[] P05LL2_A3343CCStkCanE ;
   private String[] P05LL2_A3345TipMovCc ;
   private java.math.BigDecimal[] P05LL2_A3344CCStkCanS ;
   private String[] P05LL2_A3356CCStkHor ;
   private long[] P05LL2_A3342CCStkLin ;
}

final  class pprc124__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05LL2", "SELECT EmprCod, PrdNum, CCStkFec, CCStkCanE, TipMovCc, CCStkCanS, CCStkHor, CCStkLin FROM TXPCCSTKS WHERE EmprCod = ? and PrdNum = ? and CCStkFec = ? ORDER BY EmprCod, PrdNum, CCStkFec, CCStkHor ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((String[]) buf[4])[0] = rslt.getString(5, 2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((long[]) buf[7])[0] = rslt.getLong(8);
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
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
      }
   }

}

