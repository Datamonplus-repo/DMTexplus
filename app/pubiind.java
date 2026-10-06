package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pubiind extends GXProcedure
{
   public pubiind( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pubiind.class ), "" );
   }

   public pubiind( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pubiind.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      pubiind.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pubiind.this.AV8Albreccod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03T12 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8Albreccod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A44AlbRecCod = P03T12_A44AlbRecCod[0] ;
         A9743Emp_CUb = P03T12_A9743Emp_CUb[0] ;
         A5860Emp_Anp = P03T12_A5860Emp_Anp[0] ;
         A9745Emp_PzE = P03T12_A9745Emp_PzE[0] ;
         n9745Emp_PzE = P03T12_n9745Emp_PzE[0] ;
         A9746Emp_UnE = P03T12_A9746Emp_UnE[0] ;
         n9746Emp_UnE = P03T12_n9746Emp_UnE[0] ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A44AlbRecCod ;
         GXv_char3[0] = A9743Emp_CUb ;
         GXv_int4[0] = A5860Emp_Anp ;
         GXv_int5[0] = A9745Emp_PzE ;
         GXv_decimal6[0] = A9746Emp_UnE ;
         GXv_int7[0] = 0 ;
         GXv_decimal8[0] = DecimalUtil.doubleToDec(0) ;
         new app.pubiins(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3, GXv_int4, GXv_int5, GXv_decimal6, GXv_int7, GXv_decimal8) ;
         pubiind.this.A396EmprCod = GXv_char1[0] ;
         pubiind.this.A44AlbRecCod = GXv_int2[0] ;
         pubiind.this.A9743Emp_CUb = GXv_char3[0] ;
         pubiind.this.A5860Emp_Anp = GXv_int4[0] ;
         pubiind.this.A9745Emp_PzE = GXv_int5[0] ;
         pubiind.this.A9746Emp_UnE = GXv_decimal6[0] ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pubiind.this.A396EmprCod;
      this.aP1[0] = pubiind.this.AV8Albreccod;
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
      P03T12_A396EmprCod = new String[] {""} ;
      P03T12_A44AlbRecCod = new int[1] ;
      P03T12_A9743Emp_CUb = new String[] {""} ;
      P03T12_A5860Emp_Anp = new short[1] ;
      P03T12_A9745Emp_PzE = new int[1] ;
      P03T12_n9745Emp_PzE = new boolean[] {false} ;
      P03T12_A9746Emp_UnE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03T12_n9746Emp_UnE = new boolean[] {false} ;
      A9743Emp_CUb = "" ;
      A9746Emp_UnE = DecimalUtil.ZERO ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new short[1] ;
      GXv_int5 = new int[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_int7 = new int[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pubiind__default(),
         new Object[] {
             new Object[] {
            P03T12_A396EmprCod, P03T12_A44AlbRecCod, P03T12_A9743Emp_CUb, P03T12_A5860Emp_Anp, P03T12_A9745Emp_PzE, P03T12_n9745Emp_PzE, P03T12_A9746Emp_UnE, P03T12_n9746Emp_UnE
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A5860Emp_Anp ;
   private short GXv_int4[] ;
   private short Gx_err ;
   private int AV8Albreccod ;
   private int A44AlbRecCod ;
   private int A9745Emp_PzE ;
   private int GXv_int2[] ;
   private int GXv_int5[] ;
   private int GXv_int7[] ;
   private java.math.BigDecimal A9746Emp_UnE ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A9743Emp_CUb ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private boolean n9745Emp_PzE ;
   private boolean n9746Emp_UnE ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P03T12_A396EmprCod ;
   private int[] P03T12_A44AlbRecCod ;
   private String[] P03T12_A9743Emp_CUb ;
   private short[] P03T12_A5860Emp_Anp ;
   private int[] P03T12_A9745Emp_PzE ;
   private boolean[] P03T12_n9745Emp_PzE ;
   private java.math.BigDecimal[] P03T12_A9746Emp_UnE ;
   private boolean[] P03T12_n9746Emp_UnE ;
}

final  class pubiind__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03T12", "SELECT EmprCod, AlbRecCod, Emp_CUb, Emp_Anp, Emp_PzE, Emp_UnE FROM TXPUBIIN WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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

