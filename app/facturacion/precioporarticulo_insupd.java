package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class precioporarticulo_insupd extends GXProcedure
{
   public precioporarticulo_insupd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( precioporarticulo_insupd.class ), "" );
   }

   public precioporarticulo_insupd( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        byte aP3 ,
                        byte aP4 ,
                        java.math.BigDecimal aP5 ,
                        java.math.BigDecimal aP6 ,
                        String aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             byte aP3 ,
                             byte aP4 ,
                             java.math.BigDecimal aP5 ,
                             java.math.BigDecimal aP6 ,
                             String aP7 )
   {
      precioporarticulo_insupd.this.A396EmprCod = aP0;
      precioporarticulo_insupd.this.A252CliCod = aP1;
      precioporarticulo_insupd.this.A65ArtCod = aP2;
      precioporarticulo_insupd.this.A831TipColCod = aP3;
      precioporarticulo_insupd.this.AV12intcod = aP4;
      precioporarticulo_insupd.this.AV8IntPreKgm = aP5;
      precioporarticulo_insupd.this.AV9IntPreMtr = aP6;
      precioporarticulo_insupd.this.AV10IntPreDef = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16GXLvl3 = (byte)(0) ;
      n587IntPreMtr = false ;
      n586IntPreKgm = false ;
      n585IntPreDef = false ;
      /* Optimized UPDATE. */
      /* Using cursor P0APH2 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n587IntPreMtr), AV9IntPreMtr, Boolean.valueOf(n586IntPreKgm), AV8IntPreKgm, Boolean.valueOf(n585IntPreDef), AV10IntPreDef, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(AV12intcod)});
      if ( (pr_default.getStatus(0) != 101) )
      {
         AV16GXLvl3 = (byte)(1) ;
      }
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRETIN");
      /* End optimized UPDATE. */
      if ( AV16GXLvl3 == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPPRETIN

         */
         A583IntCod = AV12intcod ;
         A585IntPreDef = AV10IntPreDef ;
         n585IntPreDef = false ;
         A586IntPreKgm = AV8IntPreKgm ;
         n586IntPreKgm = false ;
         A587IntPreMtr = AV9IntPreMtr ;
         n587IntPreMtr = false ;
         A3616PreFacCod = "" ;
         n3616PreFacCod = false ;
         /* Using cursor P0APH3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod), Boolean.valueOf(n586IntPreKgm), A586IntPreKgm, Boolean.valueOf(n587IntPreMtr), A587IntPreMtr, Boolean.valueOf(n585IntPreDef), A585IntPreDef, Boolean.valueOf(n3616PreFacCod), A3616PreFacCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRETIN");
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
      Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.precioporarticulo_insupd");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A587IntPreMtr = DecimalUtil.ZERO ;
      A586IntPreKgm = DecimalUtil.ZERO ;
      A585IntPreDef = "" ;
      A3616PreFacCod = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.precioporarticulo_insupd__default(),
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

   private byte A831TipColCod ;
   private byte AV12intcod ;
   private byte AV16GXLvl3 ;
   private byte A583IntCod ;
   private short Gx_err ;
   private int A252CliCod ;
   private int GX_INS84 ;
   private java.math.BigDecimal AV8IntPreKgm ;
   private java.math.BigDecimal AV9IntPreMtr ;
   private java.math.BigDecimal A587IntPreMtr ;
   private java.math.BigDecimal A586IntPreKgm ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String AV10IntPreDef ;
   private String A585IntPreDef ;
   private String A3616PreFacCod ;
   private String Gx_emsg ;
   private boolean n587IntPreMtr ;
   private boolean n586IntPreKgm ;
   private boolean n585IntPreDef ;
   private boolean n3616PreFacCod ;
   private IDataStoreProvider pr_default ;
}

final  class precioporarticulo_insupd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0APH2", "UPDATE TXPPRETIN SET IntPreMtr=?, IntPreKgm=?, IntPreDef=?  WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and TipColCod = ? and IntCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRETIN")
         ,new UpdateCursor("P0APH3", "INSERT INTO TXPPRETIN(EmprCod, CliCod, ArtCod, TipColCod, IntCod, IntPreKgm, IntPreMtr, IntPreDef, PreFacCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRETIN")
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 1);
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setInt(5, ((Number) parms[7]).intValue());
               stmt.setString(6, (String)parms[8], 16);
               stmt.setByte(7, ((Number) parms[9]).byteValue());
               stmt.setByte(8, ((Number) parms[10]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[6], 5);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[8], 5);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[10], 1);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[12], 6);
               }
               return;
      }
   }

}

