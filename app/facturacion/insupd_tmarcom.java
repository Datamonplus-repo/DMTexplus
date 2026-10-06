package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class insupd_tmarcom extends GXProcedure
{
   public insupd_tmarcom( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( insupd_tmarcom.class ), "" );
   }

   public insupd_tmarcom( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        short aP2 ,
                        java.math.BigDecimal aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             short aP2 ,
                             java.math.BigDecimal aP3 )
   {
      insupd_tmarcom.this.A396EmprCod = aP0;
      insupd_tmarcom.this.A5654Mgen_com = aP1;
      insupd_tmarcom.this.AV8GrdTipArt = aP2;
      insupd_tmarcom.this.AV9Mgen_val = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12GXLvl3 = (byte)(0) ;
      n5655Mgen_val = false ;
      /* Optimized UPDATE. */
      /* Using cursor P0AMC2 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n5655Mgen_val), AV9Mgen_val, A396EmprCod, A5654Mgen_com, Short.valueOf(AV8GrdTipArt)});
      if ( (pr_default.getStatus(0) != 101) )
      {
         AV12GXLvl3 = (byte)(1) ;
      }
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMARCO");
      /* End optimized UPDATE. */
      if ( AV12GXLvl3 == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPLMARCO

         */
         A4364GrdTipArt = AV8GrdTipArt ;
         A5655Mgen_val = AV9Mgen_val ;
         n5655Mgen_val = false ;
         /* Using cursor P0AMC3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A5654Mgen_com, Short.valueOf(A4364GrdTipArt), Boolean.valueOf(n5655Mgen_val), A5655Mgen_val});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMARCO");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
      }
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.insupd_tmarcom");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A5655Mgen_val = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.insupd_tmarcom__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12GXLvl3 ;
   private short AV8GrdTipArt ;
   private short A4364GrdTipArt ;
   private short Gx_err ;
   private int GX_INS835 ;
   private java.math.BigDecimal AV9Mgen_val ;
   private java.math.BigDecimal A5655Mgen_val ;
   private String A396EmprCod ;
   private String A5654Mgen_com ;
   private String Gx_emsg ;
   private boolean n5655Mgen_val ;
   private IDataStoreProvider pr_default ;
}

final  class insupd_tmarcom__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0AMC2", "UPDATE TXPLMARCO SET Mgen_val=?  WHERE EmprCod = ? and Mgen_com = ? and GrdTipArt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMARCO")
         ,new UpdateCursor("P0AMC3", "INSERT INTO TXPLMARCO(EmprCod, Mgen_com, GrdTipArt, Mgen_val) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMARCO")
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
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 3);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 1);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 3);
               }
               return;
      }
   }

}

