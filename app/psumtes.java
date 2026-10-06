package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psumtes extends GXProcedure
{
   public psumtes( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psumtes.class ), "" );
   }

   public psumtes( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           String[] aP1 ,
                                           int[] aP2 ,
                                           int[] aP3 ,
                                           java.math.BigDecimal[] aP4 )
   {
      psumtes.this.aP5 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 )
   {
      psumtes.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      psumtes.this.A1013DibCli = aP1[0];
      this.aP1 = aP1;
      psumtes.this.A252CliCod = aP2[0];
      this.aP2 = aP2;
      psumtes.this.A1014DibInt = aP3[0];
      this.aP3 = aP3;
      psumtes.this.AV8Metros = aP4[0];
      this.aP4 = aP4;
      psumtes.this.AV9Metrosold = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      n1018DibMetRea = false ;
      /* Optimized UPDATE. */
      /* Using cursor P026C2 */
      pr_default.execute(0, new Object[] {AV9Metrosold, AV8Metros, A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCDIBUJ");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = psumtes.this.A396EmprCod;
      this.aP1[0] = psumtes.this.A1013DibCli;
      this.aP2[0] = psumtes.this.A252CliCod;
      this.aP3[0] = psumtes.this.A1014DibInt;
      this.aP4[0] = psumtes.this.AV8Metros;
      this.aP5[0] = psumtes.this.AV9Metrosold;
      Application.commitDataStores(context, remoteHandle, pr_default, "psumtes");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.psumtes__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private java.math.BigDecimal AV8Metros ;
   private java.math.BigDecimal AV9Metrosold ;
   private String A396EmprCod ;
   private String A1013DibCli ;
   private boolean n1018DibMetRea ;
   private java.math.BigDecimal[] aP5 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private int[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private IDataStoreProvider pr_default ;
}

final  class psumtes__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P026C2", "UPDATE TXPCDIBUJ SET DibMetRea=DibMetRea - ? + ?  WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCDIBUJ")
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
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
      }
   }

}

