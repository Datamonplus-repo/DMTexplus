package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppralb2 extends GXProcedure
{
   public ppralb2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppralb2.class ), "" );
   }

   public ppralb2( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           String[] aP2 ,
                                           java.math.BigDecimal[] aP3 )
   {
      ppralb2.this.aP4 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.math.BigDecimal[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 )
   {
      ppralb2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppralb2.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      ppralb2.this.A457FasCod = aP2[0];
      this.aP2 = aP2;
      ppralb2.this.AV9FasPreKgm = aP3[0];
      this.aP3 = aP3;
      ppralb2.this.AV8FasPreMtr = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      n466FasPreKgm = false ;
      n467FasPreMtr = false ;
      /* Optimized UPDATE. */
      /* Using cursor P01FY2 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n466FasPreKgm), AV9FasPreKgm, Boolean.valueOf(n467FasPreMtr), AV8FasPreMtr, A396EmprCod, Integer.valueOf(A252CliCod), A457FasCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPREFAS");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppralb2.this.A396EmprCod;
      this.aP1[0] = ppralb2.this.A252CliCod;
      this.aP2[0] = ppralb2.this.A457FasCod;
      this.aP3[0] = ppralb2.this.AV9FasPreKgm;
      this.aP4[0] = ppralb2.this.AV8FasPreMtr;
      Application.commitDataStores(context, remoteHandle, pr_default, "ppralb2");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A466FasPreKgm = DecimalUtil.ZERO ;
      A467FasPreMtr = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppralb2__default(),
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
   private java.math.BigDecimal AV9FasPreKgm ;
   private java.math.BigDecimal AV8FasPreMtr ;
   private java.math.BigDecimal A466FasPreKgm ;
   private java.math.BigDecimal A467FasPreMtr ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private boolean n466FasPreKgm ;
   private boolean n467FasPreMtr ;
   private java.math.BigDecimal[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private IDataStoreProvider pr_default ;
}

final  class ppralb2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P01FY2", "UPDATE TXPPREFAS SET FasPreKgm=?, FasPreMtr=?  WHERE EmprCod = ? and CliCod = ? and FasCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPREFAS")
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 5);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 5);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setString(5, (String)parms[6], 8);
               return;
      }
   }

}

