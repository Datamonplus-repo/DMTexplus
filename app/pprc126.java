package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc126 extends GXProcedure
{
   public pprc126( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc126.class ), "" );
   }

   public pprc126( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           String[] aP1 ,
                                           java.util.Date[] aP2 ,
                                           String[] aP3 ,
                                           java.math.BigDecimal[] aP4 )
   {
      pprc126.this.aP5 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.util.Date[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 )
   {
      pprc126.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprc126.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      pprc126.this.A3348CCStkFec = aP2[0];
      this.aP2 = aP2;
      pprc126.this.AV10CCStkLot = aP3[0];
      this.aP3 = aP3;
      pprc126.this.AV8ComprasInv = aP4[0];
      this.aP4 = aP4;
      pprc126.this.AV9ConsumosInv = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8ComprasInv = DecimalUtil.doubleToDec(0) ;
      AV9ConsumosInv = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P05LN2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum, A3348CCStkFec, AV10CCStkLot});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5722CCStkLot = P05LN2_A5722CCStkLot[0] ;
         A3343CCStkCanE = P05LN2_A3343CCStkCanE[0] ;
         A3345TipMovCc = P05LN2_A3345TipMovCc[0] ;
         A3344CCStkCanS = P05LN2_A3344CCStkCanS[0] ;
         A3356CCStkHor = P05LN2_A3356CCStkHor[0] ;
         A3342CCStkLin = P05LN2_A3342CCStkLin[0] ;
         AV8ComprasInv = AV8ComprasInv.add((((GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "EN", ""))==0) ? A3343CCStkCanE : DecimalUtil.doubleToDec(0)))) ;
         AV9ConsumosInv = AV9ConsumosInv.add((((GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SC", ""))==0)||(GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SM", ""))==0)||(GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SD", ""))==0) ? A3344CCStkCanS : DecimalUtil.doubleToDec(0)))) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc126.this.A396EmprCod;
      this.aP1[0] = pprc126.this.A719PrdNum;
      this.aP2[0] = pprc126.this.A3348CCStkFec;
      this.aP3[0] = pprc126.this.AV10CCStkLot;
      this.aP4[0] = pprc126.this.AV8ComprasInv;
      this.aP5[0] = pprc126.this.AV9ConsumosInv;
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
      P05LN2_A396EmprCod = new String[] {""} ;
      P05LN2_A719PrdNum = new String[] {""} ;
      P05LN2_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05LN2_A5722CCStkLot = new String[] {""} ;
      P05LN2_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05LN2_A3345TipMovCc = new String[] {""} ;
      P05LN2_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05LN2_A3356CCStkHor = new String[] {""} ;
      P05LN2_A3342CCStkLin = new long[1] ;
      A5722CCStkLot = "" ;
      A3343CCStkCanE = DecimalUtil.ZERO ;
      A3345TipMovCc = "" ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      A3356CCStkHor = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc126__default(),
         new Object[] {
             new Object[] {
            P05LN2_A396EmprCod, P05LN2_A719PrdNum, P05LN2_A3348CCStkFec, P05LN2_A5722CCStkLot, P05LN2_A3343CCStkCanE, P05LN2_A3345TipMovCc, P05LN2_A3344CCStkCanS, P05LN2_A3356CCStkHor, P05LN2_A3342CCStkLin
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
   private String AV10CCStkLot ;
   private String scmdbuf ;
   private String A5722CCStkLot ;
   private String A3345TipMovCc ;
   private String A3356CCStkHor ;
   private java.util.Date A3348CCStkFec ;
   private java.math.BigDecimal[] aP5 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.util.Date[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P05LN2_A396EmprCod ;
   private String[] P05LN2_A719PrdNum ;
   private java.util.Date[] P05LN2_A3348CCStkFec ;
   private String[] P05LN2_A5722CCStkLot ;
   private java.math.BigDecimal[] P05LN2_A3343CCStkCanE ;
   private String[] P05LN2_A3345TipMovCc ;
   private java.math.BigDecimal[] P05LN2_A3344CCStkCanS ;
   private String[] P05LN2_A3356CCStkHor ;
   private long[] P05LN2_A3342CCStkLin ;
}

final  class pprc126__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05LN2", "SELECT EmprCod, PrdNum, CCStkFec, CCStkLot, CCStkCanE, TipMovCc, CCStkCanS, CCStkHor, CCStkLin FROM TXPCCSTKS WHERE (EmprCod = ? and PrdNum = ? and CCStkFec = ?) AND (CCStkLot = ?) ORDER BY EmprCod, PrdNum, CCStkFec, CCStkHor ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((String[]) buf[5])[0] = rslt.getString(6, 2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((long[]) buf[8])[0] = rslt.getLong(9);
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
               stmt.setString(4, (String)parms[3], 26);
               return;
      }
   }

}

