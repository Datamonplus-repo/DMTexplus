package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pvarsedo extends GXProcedure
{
   public pvarsedo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pvarsedo.class ), "" );
   }

   public pvarsedo( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        short aP4 ,
                        short aP5 ,
                        java.math.BigDecimal aP6 ,
                        short aP7 ,
                        short aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             short aP4 ,
                             short aP5 ,
                             java.math.BigDecimal aP6 ,
                             short aP7 ,
                             short aP8 )
   {
      pvarsedo.this.A396EmprCod = aP0;
      pvarsedo.this.AV15BarCod = aP1;
      pvarsedo.this.AV16BarCodReo = aP2;
      pvarsedo.this.AV17BarCodPar = aP3;
      pvarsedo.this.AV21BarBp12 = aP4;
      pvarsedo.this.AV22BarBp13 = aP5;
      pvarsedo.this.AV23BarBp14 = aP6;
      pvarsedo.this.AV24BarBp15 = aP7;
      pvarsedo.this.AV25BarBp14Bis = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV26Etm ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ETM", ""), GXv_int2) ;
      pvarsedo.this.GXt_int1 = GXv_int2[0] ;
      AV26Etm = GXt_int1 ;
      n5056BarBp15 = false ;
      n5055BarBp14 = false ;
      n5054BarBp13 = false ;
      n5053BarBp12 = false ;
      /* Optimized UPDATE. */
      /* Using cursor P04JT2 */
      pr_default.execute(0, new Object[] {Short.valueOf(AV25BarBp14Bis), Byte.valueOf(AV26Etm), Boolean.valueOf(n5056BarBp15), Short.valueOf(AV24BarBp15), Boolean.valueOf(n5055BarBp14), AV23BarBp14, Boolean.valueOf(n5054BarBp13), Short.valueOf(AV22BarBp13), Boolean.valueOf(n5053BarBp12), Short.valueOf(AV21BarBp12), A396EmprCod, Integer.valueOf(AV15BarCod), Byte.valueOf(AV16BarCodReo), AV17BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "pvarsedo");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      A5055BarBp14 = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pvarsedo__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16BarCodReo ;
   private byte AV26Etm ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short AV21BarBp12 ;
   private short AV22BarBp13 ;
   private short AV24BarBp15 ;
   private short AV25BarBp14Bis ;
   private short A5056BarBp15 ;
   private short A5054BarBp13 ;
   private short A5053BarBp12 ;
   private short Gx_err ;
   private int AV15BarCod ;
   private java.math.BigDecimal AV23BarBp14 ;
   private java.math.BigDecimal A5055BarBp14 ;
   private String A396EmprCod ;
   private String AV17BarCodPar ;
   private boolean n5056BarBp15 ;
   private boolean n5055BarBp14 ;
   private boolean n5054BarBp13 ;
   private boolean n5053BarBp12 ;
   private IDataStoreProvider pr_default ;
}

final  class pvarsedo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P04JT2", "UPDATE TXPBARCAD SET BarPiePrv=CASE  WHEN ? = 1 THEN ? ELSE BarPiePrv END, BarBp15=?, BarBp14=?, BarBp13=?, BarBp12=?  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[5], 3);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[9]).shortValue());
               }
               stmt.setString(7, (String)parms[10], 3);
               stmt.setInt(8, ((Number) parms[11]).intValue());
               stmt.setByte(9, ((Number) parms[12]).byteValue());
               stmt.setString(10, (String)parms[13], 1);
               return;
      }
   }

}

