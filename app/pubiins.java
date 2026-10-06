package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pubiins extends GXProcedure
{
   public pubiins( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pubiins.class ), "" );
   }

   public pubiins( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           String[] aP2 ,
                                           short[] aP3 ,
                                           int[] aP4 ,
                                           java.math.BigDecimal[] aP5 ,
                                           int[] aP6 )
   {
      pubiins.this.aP7 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        short[] aP3 ,
                        int[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        int[] aP6 ,
                        java.math.BigDecimal[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             short[] aP3 ,
                             int[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             int[] aP6 ,
                             java.math.BigDecimal[] aP7 )
   {
      pubiins.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pubiins.this.A44AlbRecCod = aP1[0];
      this.aP1 = aP1;
      pubiins.this.A9743Emp_CUb = aP2[0];
      this.aP2 = aP2;
      pubiins.this.A5860Emp_Anp = aP3[0];
      this.aP3 = aP3;
      pubiins.this.AV10OldPz = aP4[0];
      this.aP4 = aP4;
      pubiins.this.AV11OldUn = aP5[0];
      this.aP5 = aP5;
      pubiins.this.AV8Emp_pzu = aP6[0];
      this.aP6 = aP6;
      pubiins.this.AV9Emp_unu = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      n9750Emp_UnU = false ;
      n9751Emp_PzU = false ;
      /* Optimized UPDATE. */
      /* Using cursor P03ST2 */
      pr_default.execute(0, new Object[] {AV11OldUn, AV9Emp_unu, Integer.valueOf(AV10OldPz), Integer.valueOf(AV8Emp_pzu), A396EmprCod, Integer.valueOf(A44AlbRecCod), A9743Emp_CUb, Short.valueOf(A5860Emp_Anp)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUBIIN");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pubiins.this.A396EmprCod;
      this.aP1[0] = pubiins.this.A44AlbRecCod;
      this.aP2[0] = pubiins.this.A9743Emp_CUb;
      this.aP3[0] = pubiins.this.A5860Emp_Anp;
      this.aP4[0] = pubiins.this.AV10OldPz;
      this.aP5[0] = pubiins.this.AV11OldUn;
      this.aP6[0] = pubiins.this.AV8Emp_pzu;
      this.aP7[0] = pubiins.this.AV9Emp_unu;
      Application.commitDataStores(context, remoteHandle, pr_default, "pubiins");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pubiins__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A5860Emp_Anp ;
   private short Gx_err ;
   private int A44AlbRecCod ;
   private int AV10OldPz ;
   private int AV8Emp_pzu ;
   private java.math.BigDecimal AV11OldUn ;
   private java.math.BigDecimal AV9Emp_unu ;
   private String A396EmprCod ;
   private String A9743Emp_CUb ;
   private boolean n9750Emp_UnU ;
   private boolean n9751Emp_PzU ;
   private java.math.BigDecimal[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private short[] aP3 ;
   private int[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private int[] aP6 ;
   private IDataStoreProvider pr_default ;
}

final  class pubiins__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P03ST2", "UPDATE TXPUBIIN SET Emp_UnU=Emp_UnU - ? + ?, Emp_PzU=Emp_PzU - ? + ?  WHERE EmprCod = ? and AlbRecCod = ? and Emp_CUb = ? and Emp_Anp = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPUBIIN")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setString(7, (String)parms[6], 10);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
      }
   }

}

