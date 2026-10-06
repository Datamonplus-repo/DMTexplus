package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class get_tmarcom extends GXProcedure
{
   public get_tmarcom( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( get_tmarcom.class ), "" );
   }

   public get_tmarcom( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String aP0 ,
                                           String aP1 ,
                                           short aP2 )
   {
      get_tmarcom.this.aP3 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        short aP2 ,
                        java.math.BigDecimal[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             short aP2 ,
                             java.math.BigDecimal[] aP3 )
   {
      get_tmarcom.this.A396EmprCod = aP0;
      get_tmarcom.this.A5654Mgen_com = aP1;
      get_tmarcom.this.A4364GrdTipArt = aP2;
      get_tmarcom.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9Mgen_val = DecimalUtil.ZERO ;
      /* Using cursor P0AMB2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A5654Mgen_com, Short.valueOf(A4364GrdTipArt)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5655Mgen_val = P0AMB2_A5655Mgen_val[0] ;
         n5655Mgen_val = P0AMB2_n5655Mgen_val[0] ;
         AV9Mgen_val = A5655Mgen_val ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = get_tmarcom.this.AV9Mgen_val;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9Mgen_val = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P0AMB2_A396EmprCod = new String[] {""} ;
      P0AMB2_A5654Mgen_com = new String[] {""} ;
      P0AMB2_A4364GrdTipArt = new short[1] ;
      P0AMB2_A5655Mgen_val = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AMB2_n5655Mgen_val = new boolean[] {false} ;
      A5655Mgen_val = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.get_tmarcom__default(),
         new Object[] {
             new Object[] {
            P0AMB2_A396EmprCod, P0AMB2_A5654Mgen_com, P0AMB2_A4364GrdTipArt, P0AMB2_A5655Mgen_val, P0AMB2_n5655Mgen_val
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A4364GrdTipArt ;
   private short Gx_err ;
   private java.math.BigDecimal AV9Mgen_val ;
   private java.math.BigDecimal A5655Mgen_val ;
   private String A396EmprCod ;
   private String A5654Mgen_com ;
   private String scmdbuf ;
   private boolean n5655Mgen_val ;
   private java.math.BigDecimal[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AMB2_A396EmprCod ;
   private String[] P0AMB2_A5654Mgen_com ;
   private short[] P0AMB2_A4364GrdTipArt ;
   private java.math.BigDecimal[] P0AMB2_A5655Mgen_val ;
   private boolean[] P0AMB2_n5655Mgen_val ;
}

final  class get_tmarcom__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AMB2", "SELECT EmprCod, Mgen_com, GrdTipArt, Mgen_val FROM TXPLMARCO WHERE EmprCod = ? and Mgen_com = ? and GrdTipArt = ? ORDER BY EmprCod, Mgen_com, GrdTipArt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 1);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

