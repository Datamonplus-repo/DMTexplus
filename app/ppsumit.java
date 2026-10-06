package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppsumit extends GXProcedure
{
   public ppsumit( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppsumit.class ), "" );
   }

   public ppsumit( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String aP0 ,
                                           int aP1 ,
                                           int aP2 )
   {
      ppsumit.this.aP3 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int aP2 ,
                        java.math.BigDecimal[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             java.math.BigDecimal[] aP3 )
   {
      ppsumit.this.A396EmprCod = aP0;
      ppsumit.this.AV18Sup_num = aP1;
      ppsumit.this.AV19Sup_lnf = aP2;
      ppsumit.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17Sup_SVal = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P02ZD2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV18Sup_num), Integer.valueOf(AV19Sup_lnf)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7342Sup_Lnf = P02ZD2_A7342Sup_Lnf[0] ;
         A7275Sup_Num = P02ZD2_A7275Sup_Num[0] ;
         A7363Sup_Prdc = P02ZD2_A7363Sup_Prdc[0] ;
         n7363Sup_Prdc = P02ZD2_n7363Sup_Prdc[0] ;
         A7366Sup_Prec = P02ZD2_A7366Sup_Prec[0] ;
         n7366Sup_Prec = P02ZD2_n7366Sup_Prec[0] ;
         A7365Sup_Cant = P02ZD2_A7365Sup_Cant[0] ;
         n7365Sup_Cant = P02ZD2_n7365Sup_Cant[0] ;
         A7362Sup_Lp = P02ZD2_A7362Sup_Lp[0] ;
         if ( GXutil.strcmp(GXutil.substring( A7363Sup_Prdc, 1, 3), httpContext.getMessage( "OTR", "")) == 0 )
         {
            AV17Sup_SVal = AV17Sup_SVal.add(((A7365Sup_Cant.multiply(A7366Sup_Prec)))) ;
         }
         else
         {
            AV17Sup_SVal = AV17Sup_SVal.add(((A7365Sup_Cant.multiply(A7366Sup_Prec)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN))) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = ppsumit.this.AV17Sup_SVal;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV17Sup_SVal = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P02ZD2_A396EmprCod = new String[] {""} ;
      P02ZD2_A7342Sup_Lnf = new int[1] ;
      P02ZD2_A7275Sup_Num = new int[1] ;
      P02ZD2_A7363Sup_Prdc = new String[] {""} ;
      P02ZD2_n7363Sup_Prdc = new boolean[] {false} ;
      P02ZD2_A7366Sup_Prec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02ZD2_n7366Sup_Prec = new boolean[] {false} ;
      P02ZD2_A7365Sup_Cant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02ZD2_n7365Sup_Cant = new boolean[] {false} ;
      P02ZD2_A7362Sup_Lp = new short[1] ;
      A7363Sup_Prdc = "" ;
      A7366Sup_Prec = DecimalUtil.ZERO ;
      A7365Sup_Cant = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppsumit__default(),
         new Object[] {
             new Object[] {
            P02ZD2_A396EmprCod, P02ZD2_A7342Sup_Lnf, P02ZD2_A7275Sup_Num, P02ZD2_A7363Sup_Prdc, P02ZD2_n7363Sup_Prdc, P02ZD2_A7366Sup_Prec, P02ZD2_n7366Sup_Prec, P02ZD2_A7365Sup_Cant, P02ZD2_n7365Sup_Cant, P02ZD2_A7362Sup_Lp
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A7362Sup_Lp ;
   private short Gx_err ;
   private int AV18Sup_num ;
   private int AV19Sup_lnf ;
   private int A7342Sup_Lnf ;
   private int A7275Sup_Num ;
   private java.math.BigDecimal AV17Sup_SVal ;
   private java.math.BigDecimal A7366Sup_Prec ;
   private java.math.BigDecimal A7365Sup_Cant ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A7363Sup_Prdc ;
   private boolean n7363Sup_Prdc ;
   private boolean n7366Sup_Prec ;
   private boolean n7365Sup_Cant ;
   private java.math.BigDecimal[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P02ZD2_A396EmprCod ;
   private int[] P02ZD2_A7342Sup_Lnf ;
   private int[] P02ZD2_A7275Sup_Num ;
   private String[] P02ZD2_A7363Sup_Prdc ;
   private boolean[] P02ZD2_n7363Sup_Prdc ;
   private java.math.BigDecimal[] P02ZD2_A7366Sup_Prec ;
   private boolean[] P02ZD2_n7366Sup_Prec ;
   private java.math.BigDecimal[] P02ZD2_A7365Sup_Cant ;
   private boolean[] P02ZD2_n7365Sup_Cant ;
   private short[] P02ZD2_A7362Sup_Lp ;
}

final  class ppsumit__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02ZD2", "SELECT EmprCod, Sup_Lnf, Sup_Num, Sup_Prdc, Sup_Prec, Sup_Cant, Sup_Lp FROM TXPCOST0p WHERE EmprCod = ? and Sup_Num = ? and Sup_Lnf = ? ORDER BY EmprCod, Sup_Num, Sup_Lnf, Sup_Lp ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

