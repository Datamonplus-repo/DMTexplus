package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class insupd_tgrdtar extends GXProcedure
{
   public insupd_tgrdtar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( insupd_tgrdtar.class ), "" );
   }

   public insupd_tgrdtar( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        short aP1 ,
                        java.math.BigDecimal aP2 ,
                        java.math.BigDecimal aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             short aP1 ,
                             java.math.BigDecimal aP2 ,
                             java.math.BigDecimal aP3 )
   {
      insupd_tgrdtar.this.A396EmprCod = aP0;
      insupd_tgrdtar.this.A4364GrdTipArt = aP1;
      insupd_tgrdtar.this.AV8GrdTipVal = aP2;
      insupd_tgrdtar.this.AV9GrdTipCos = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12GXLvl3 = (byte)(0) ;
      /* Optimized UPDATE. */
      /* Using cursor P0AMG2 */
      pr_default.execute(0, new Object[] {AV9GrdTipCos, A396EmprCod, Short.valueOf(A4364GrdTipArt), AV8GrdTipVal});
      if ( (pr_default.getStatus(0) != 101) )
      {
         AV12GXLvl3 = (byte)(1) ;
      }
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPGRDTAR");
      /* End optimized UPDATE. */
      if ( AV12GXLvl3 == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPGRDTAR

         */
         A4376GrdTipVal = AV8GrdTipVal ;
         A4377GrdTipCos = AV9GrdTipCos ;
         /* Using cursor P0AMG3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt), A4376GrdTipVal, A4377GrdTipCos});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPGRDTAR");
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
      Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.insupd_tgrdtar");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A4377GrdTipCos = DecimalUtil.ZERO ;
      A4376GrdTipVal = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.insupd_tgrdtar__default(),
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
   private short A4364GrdTipArt ;
   private short Gx_err ;
   private int GX_INS661 ;
   private java.math.BigDecimal AV8GrdTipVal ;
   private java.math.BigDecimal AV9GrdTipCos ;
   private java.math.BigDecimal A4377GrdTipCos ;
   private java.math.BigDecimal A4376GrdTipVal ;
   private String A396EmprCod ;
   private String Gx_emsg ;
   private IDataStoreProvider pr_default ;
}

final  class insupd_tgrdtar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0AMG2", "UPDATE TXPGRDTAR SET GrdTipCos=?  WHERE EmprCod = ? and GrdTipArt = ? and GrdTipVal = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPGRDTAR")
         ,new UpdateCursor("P0AMG3", "INSERT INTO TXPGRDTAR(EmprCod, GrdTipArt, GrdTipVal, GrdTipCos) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPGRDTAR")
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
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               return;
      }
   }

}

