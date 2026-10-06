package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbarkmlan extends GXProcedure
{
   public pbarkmlan( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbarkmlan.class ), "" );
   }

   public pbarkmlan( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 ,
                                           java.math.BigDecimal[] aP4 )
   {
      pbarkmlan.this.aP5 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 )
   {
      pbarkmlan.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbarkmlan.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pbarkmlan.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pbarkmlan.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pbarkmlan.this.AV8BarKgmLan = aP4[0];
      this.aP4 = aP4;
      pbarkmlan.this.AV9BarMtrLan = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized group. */
      /* Using cursor P018B2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      c170BarKilLan = P018B2_A170BarKilLan[0] ;
      c183BarMetLan = P018B2_A183BarMetLan[0] ;
      pr_default.close(0);
      AV8BarKgmLan = AV8BarKgmLan.add(c170BarKilLan) ;
      AV9BarMtrLan = AV9BarMtrLan.add(c183BarMetLan) ;
      /* End optimized group. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbarkmlan.this.A396EmprCod;
      this.aP1[0] = pbarkmlan.this.A129BarCod;
      this.aP2[0] = pbarkmlan.this.A132BarCodReo;
      this.aP3[0] = pbarkmlan.this.A130BarCodPar;
      this.aP4[0] = pbarkmlan.this.AV8BarKgmLan;
      this.aP5[0] = pbarkmlan.this.AV9BarMtrLan;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      c170BarKilLan = DecimalUtil.ZERO ;
      c183BarMetLan = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P018B2_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P018B2_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbarkmlan__default(),
         new Object[] {
             new Object[] {
            P018B2_A170BarKilLan, P018B2_A183BarMetLan
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private java.math.BigDecimal AV8BarKgmLan ;
   private java.math.BigDecimal AV9BarMtrLan ;
   private java.math.BigDecimal c170BarKilLan ;
   private java.math.BigDecimal c183BarMetLan ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private java.math.BigDecimal[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P018B2_A170BarKilLan ;
   private java.math.BigDecimal[] P018B2_A183BarMetLan ;
}

final  class pbarkmlan__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P018B2", "SELECT SUM(BarKilLan), SUM(BarMetLan) FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
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

