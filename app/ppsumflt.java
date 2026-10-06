package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppsumflt extends GXProcedure
{
   public ppsumflt( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppsumflt.class ), "" );
   }

   public ppsumflt( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String aP0 ,
                                           int aP1 )
   {
      ppsumflt.this.aP2 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        java.math.BigDecimal[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             java.math.BigDecimal[] aP2 )
   {
      ppsumflt.this.A396EmprCod = aP0;
      ppsumflt.this.A7275Sup_Num = aP1;
      ppsumflt.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Sup_SVal = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P02VG2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A7275Sup_Num)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7366Sup_Prec = P02VG2_A7366Sup_Prec[0] ;
         n7366Sup_Prec = P02VG2_n7366Sup_Prec[0] ;
         A7365Sup_Cant = P02VG2_A7365Sup_Cant[0] ;
         n7365Sup_Cant = P02VG2_n7365Sup_Cant[0] ;
         A7342Sup_Lnf = P02VG2_A7342Sup_Lnf[0] ;
         A7362Sup_Lp = P02VG2_A7362Sup_Lp[0] ;
         AV8Sup_SVal = AV8Sup_SVal.add(((A7365Sup_Cant.multiply(A7366Sup_Prec)))) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = ppsumflt.this.AV8Sup_SVal;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Sup_SVal = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P02VG2_A396EmprCod = new String[] {""} ;
      P02VG2_A7275Sup_Num = new int[1] ;
      P02VG2_A7366Sup_Prec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VG2_n7366Sup_Prec = new boolean[] {false} ;
      P02VG2_A7365Sup_Cant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VG2_n7365Sup_Cant = new boolean[] {false} ;
      P02VG2_A7342Sup_Lnf = new int[1] ;
      P02VG2_A7362Sup_Lp = new short[1] ;
      A7366Sup_Prec = DecimalUtil.ZERO ;
      A7365Sup_Cant = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppsumflt__default(),
         new Object[] {
             new Object[] {
            P02VG2_A396EmprCod, P02VG2_A7275Sup_Num, P02VG2_A7366Sup_Prec, P02VG2_n7366Sup_Prec, P02VG2_A7365Sup_Cant, P02VG2_n7365Sup_Cant, P02VG2_A7342Sup_Lnf, P02VG2_A7362Sup_Lp
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A7362Sup_Lp ;
   private short Gx_err ;
   private int A7275Sup_Num ;
   private int A7342Sup_Lnf ;
   private java.math.BigDecimal AV8Sup_SVal ;
   private java.math.BigDecimal A7366Sup_Prec ;
   private java.math.BigDecimal A7365Sup_Cant ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private boolean n7366Sup_Prec ;
   private boolean n7365Sup_Cant ;
   private java.math.BigDecimal[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P02VG2_A396EmprCod ;
   private int[] P02VG2_A7275Sup_Num ;
   private java.math.BigDecimal[] P02VG2_A7366Sup_Prec ;
   private boolean[] P02VG2_n7366Sup_Prec ;
   private java.math.BigDecimal[] P02VG2_A7365Sup_Cant ;
   private boolean[] P02VG2_n7365Sup_Cant ;
   private int[] P02VG2_A7342Sup_Lnf ;
   private short[] P02VG2_A7362Sup_Lp ;
}

final  class ppsumflt__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02VG2", "SELECT EmprCod, Sup_Num, Sup_Prec, Sup_Cant, Sup_Lnf, Sup_Lp FROM TXPCOST0p WHERE EmprCod = ? and Sup_Num = ? ORDER BY EmprCod, Sup_Num ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((short[]) buf[7])[0] = rslt.getShort(6);
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

