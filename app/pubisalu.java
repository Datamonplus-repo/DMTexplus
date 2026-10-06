package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pubisalu extends GXProcedure
{
   public pubisalu( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pubisalu.class ), "" );
   }

   public pubisalu( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           String[] aP2 ,
                                           short[] aP3 )
   {
      pubisalu.this.aP4 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        short[] aP3 ,
                        java.math.BigDecimal[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             short[] aP3 ,
                             java.math.BigDecimal[] aP4 )
   {
      pubisalu.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pubisalu.this.A44AlbRecCod = aP1[0];
      this.aP1 = aP1;
      pubisalu.this.A9743Emp_CUb = aP2[0];
      this.aP2 = aP2;
      pubisalu.this.A5860Emp_Anp = aP3[0];
      this.aP3 = aP3;
      pubisalu.this.AV9Emp_und = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03SV2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A9743Emp_CUb, Short.valueOf(A5860Emp_Anp)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9750Emp_UnU = P03SV2_A9750Emp_UnU[0] ;
         n9750Emp_UnU = P03SV2_n9750Emp_UnU[0] ;
         A9746Emp_UnE = P03SV2_A9746Emp_UnE[0] ;
         n9746Emp_UnE = P03SV2_n9746Emp_UnE[0] ;
         AV9Emp_und = A9746Emp_UnE.subtract(A9750Emp_UnU) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pubisalu.this.A396EmprCod;
      this.aP1[0] = pubisalu.this.A44AlbRecCod;
      this.aP2[0] = pubisalu.this.A9743Emp_CUb;
      this.aP3[0] = pubisalu.this.A5860Emp_Anp;
      this.aP4[0] = pubisalu.this.AV9Emp_und;
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
      P03SV2_A396EmprCod = new String[] {""} ;
      P03SV2_A44AlbRecCod = new int[1] ;
      P03SV2_A9743Emp_CUb = new String[] {""} ;
      P03SV2_A5860Emp_Anp = new short[1] ;
      P03SV2_A9750Emp_UnU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03SV2_n9750Emp_UnU = new boolean[] {false} ;
      P03SV2_A9746Emp_UnE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03SV2_n9746Emp_UnE = new boolean[] {false} ;
      A9750Emp_UnU = DecimalUtil.ZERO ;
      A9746Emp_UnE = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pubisalu__default(),
         new Object[] {
             new Object[] {
            P03SV2_A396EmprCod, P03SV2_A44AlbRecCod, P03SV2_A9743Emp_CUb, P03SV2_A5860Emp_Anp, P03SV2_A9750Emp_UnU, P03SV2_n9750Emp_UnU, P03SV2_A9746Emp_UnE, P03SV2_n9746Emp_UnE
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A5860Emp_Anp ;
   private short Gx_err ;
   private int A44AlbRecCod ;
   private java.math.BigDecimal AV9Emp_und ;
   private java.math.BigDecimal A9750Emp_UnU ;
   private java.math.BigDecimal A9746Emp_UnE ;
   private String A396EmprCod ;
   private String A9743Emp_CUb ;
   private String scmdbuf ;
   private boolean n9750Emp_UnU ;
   private boolean n9746Emp_UnE ;
   private java.math.BigDecimal[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private short[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P03SV2_A396EmprCod ;
   private int[] P03SV2_A44AlbRecCod ;
   private String[] P03SV2_A9743Emp_CUb ;
   private short[] P03SV2_A5860Emp_Anp ;
   private java.math.BigDecimal[] P03SV2_A9750Emp_UnU ;
   private boolean[] P03SV2_n9750Emp_UnU ;
   private java.math.BigDecimal[] P03SV2_A9746Emp_UnE ;
   private boolean[] P03SV2_n9746Emp_UnE ;
}

final  class pubisalu__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03SV2", "SELECT EmprCod, AlbRecCod, Emp_CUb, Emp_Anp, Emp_UnU, Emp_UnE FROM TXPUBIIN WHERE EmprCod = ? and AlbRecCod = ? and Emp_CUb = ? and Emp_Anp = ? ORDER BY EmprCod, AlbRecCod, Emp_CUb, Emp_Anp ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
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
               stmt.setString(3, (String)parms[2], 10);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
      }
   }

}

