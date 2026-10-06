package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class next_tifi_l extends GXProcedure
{
   public next_tifi_l( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( next_tifi_l.class ), "" );
   }

   public next_tifi_l( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            short aP1 )
   {
      next_tifi_l.this.aP2 = new short[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        short aP1 ,
                        short[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             short aP1 ,
                             short[] aP2 )
   {
      next_tifi_l.this.A396EmprCod = aP0;
      next_tifi_l.this.A4364GrdTipArt = aP1;
      next_tifi_l.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Tifi_l = (short)(0) ;
      /* Using cursor P0AM62 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5657Tifi_l = P0AM62_A5657Tifi_l[0] ;
         AV8Tifi_l = A5657Tifi_l ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV8Tifi_l = (short)(AV8Tifi_l+1) ;
      n5656Tifi_Ul = false ;
      /* Optimized UPDATE. */
      /* Using cursor P0AM63 */
      pr_default.execute(1, new Object[] {Boolean.valueOf(n5656Tifi_Ul), Short.valueOf(AV8Tifi_l), A396EmprCod, Short.valueOf(A4364GrdTipArt)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPGRDTIP");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = next_tifi_l.this.AV8Tifi_l;
      Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.next_tifi_l");
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
      P0AM62_A396EmprCod = new String[] {""} ;
      P0AM62_A4364GrdTipArt = new short[1] ;
      P0AM62_A5657Tifi_l = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.next_tifi_l__default(),
         new Object[] {
             new Object[] {
            P0AM62_A396EmprCod, P0AM62_A4364GrdTipArt, P0AM62_A5657Tifi_l
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A4364GrdTipArt ;
   private short AV8Tifi_l ;
   private short A5657Tifi_l ;
   private short A5656Tifi_Ul ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private boolean n5656Tifi_Ul ;
   private short[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AM62_A396EmprCod ;
   private short[] P0AM62_A4364GrdTipArt ;
   private short[] P0AM62_A5657Tifi_l ;
}

final  class next_tifi_l__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AM62", "SELECT * FROM (SELECT EmprCod, GrdTipArt, Tifi_l FROM TXPTIxFI WHERE EmprCod = ? and GrdTipArt = ? ORDER BY EmprCod, GrdTipArt, Tifi_l DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0AM63", "UPDATE TXPGRDTIP SET Tifi_Ul=?  WHERE EmprCod = ? and GrdTipArt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPGRDTIP")
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
      }
   }

}

