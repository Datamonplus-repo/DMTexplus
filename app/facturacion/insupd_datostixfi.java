package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class insupd_datostixfi extends GXProcedure
{
   public insupd_datostixfi( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( insupd_datostixfi.class ), "" );
   }

   public insupd_datostixfi( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        short aP1 ,
                        short aP2 ,
                        java.math.BigDecimal aP3 ,
                        java.math.BigDecimal aP4 ,
                        short aP5 ,
                        java.math.BigDecimal aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             short aP1 ,
                             short aP2 ,
                             java.math.BigDecimal aP3 ,
                             java.math.BigDecimal aP4 ,
                             short aP5 ,
                             java.math.BigDecimal aP6 )
   {
      insupd_datostixfi.this.A396EmprCod = aP0;
      insupd_datostixfi.this.A4364GrdTipArt = aP1;
      insupd_datostixfi.this.AV8Tifi_l = aP2;
      insupd_datostixfi.this.AV9Tifi_vi = aP3;
      insupd_datostixfi.this.AV10Tifi_vf = aP4;
      insupd_datostixfi.this.AV11Tifi_t = aP5;
      insupd_datostixfi.this.AV12Tifi_f = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15GXLvl3 = (byte)(0) ;
      n5658Tifi_vi = false ;
      n5659Tifi_vf = false ;
      n5660Tifi_t = false ;
      n5661Tifi_f = false ;
      /* Optimized UPDATE. */
      /* Using cursor P0AM92 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n5658Tifi_vi), AV9Tifi_vi, Boolean.valueOf(n5659Tifi_vf), AV10Tifi_vf, Boolean.valueOf(n5660Tifi_t), Short.valueOf(AV11Tifi_t), Boolean.valueOf(n5661Tifi_f), AV12Tifi_f, A396EmprCod, Short.valueOf(A4364GrdTipArt), Short.valueOf(AV8Tifi_l)});
      if ( (pr_default.getStatus(0) != 101) )
      {
         AV15GXLvl3 = (byte)(1) ;
      }
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIxFI");
      /* End optimized UPDATE. */
      if ( AV15GXLvl3 == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPTIxFI

         */
         A5657Tifi_l = AV8Tifi_l ;
         A5661Tifi_f = AV12Tifi_f ;
         n5661Tifi_f = false ;
         A5660Tifi_t = AV11Tifi_t ;
         n5660Tifi_t = false ;
         A5659Tifi_vf = AV10Tifi_vf ;
         n5659Tifi_vf = false ;
         A5658Tifi_vi = AV9Tifi_vi ;
         n5658Tifi_vi = false ;
         /* Using cursor P0AM93 */
         pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt), Short.valueOf(A5657Tifi_l), Boolean.valueOf(n5658Tifi_vi), A5658Tifi_vi, Boolean.valueOf(n5659Tifi_vf), A5659Tifi_vf, Boolean.valueOf(n5660Tifi_t), Short.valueOf(A5660Tifi_t), Boolean.valueOf(n5661Tifi_f), A5661Tifi_f});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIxFI");
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
      Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.insupd_datostixfi");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A5658Tifi_vi = DecimalUtil.ZERO ;
      A5659Tifi_vf = DecimalUtil.ZERO ;
      A5661Tifi_f = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.insupd_datostixfi__default(),
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

   private byte AV15GXLvl3 ;
   private short A4364GrdTipArt ;
   private short AV8Tifi_l ;
   private short AV11Tifi_t ;
   private short A5660Tifi_t ;
   private short A5657Tifi_l ;
   private short Gx_err ;
   private int GX_INS836 ;
   private java.math.BigDecimal AV9Tifi_vi ;
   private java.math.BigDecimal AV10Tifi_vf ;
   private java.math.BigDecimal AV12Tifi_f ;
   private java.math.BigDecimal A5658Tifi_vi ;
   private java.math.BigDecimal A5659Tifi_vf ;
   private java.math.BigDecimal A5661Tifi_f ;
   private String A396EmprCod ;
   private String Gx_emsg ;
   private boolean n5658Tifi_vi ;
   private boolean n5659Tifi_vf ;
   private boolean n5660Tifi_t ;
   private boolean n5661Tifi_f ;
   private IDataStoreProvider pr_default ;
}

final  class insupd_datostixfi__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0AM92", "UPDATE TXPTIxFI SET Tifi_vi=?, Tifi_vf=?, Tifi_t=?, Tifi_f=?  WHERE EmprCod = ? and GrdTipArt = ? and Tifi_l = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTIxFI")
         ,new UpdateCursor("P0AM93", "INSERT INTO TXPTIxFI(EmprCod, GrdTipArt, Tifi_l, Tifi_vi, Tifi_vf, Tifi_t, Tifi_f) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTIxFI")
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
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 4);
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setShort(6, ((Number) parms[9]).shortValue());
               stmt.setShort(7, ((Number) parms[10]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 5);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[6], 5);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[8]).shortValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[10], 4);
               }
               return;
      }
   }

}

