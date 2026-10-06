package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phhmmx extends GXProcedure
{
   public phhmmx( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phhmmx.class ), "" );
   }

   public phhmmx( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           java.util.Date[] aP2 )
   {
      phhmmx.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        java.util.Date[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             java.util.Date[] aP2 ,
                             byte[] aP3 )
   {
      phhmmx.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      phhmmx.this.AV8AlbDoc = aP1[0];
      this.aP1 = aP1;
      phhmmx.this.AV12FecHh = aP2[0];
      this.aP2 = aP2;
      phhmmx.this.AV11TipoDoc = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( AV11TipoDoc == 2 )
      {
         /* Optimized UPDATE. */
         /* Using cursor P042U2 */
         pr_default.execute(0, new Object[] {AV12FecHh, A396EmprCod, Integer.valueOf(AV8AlbDoc)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALCOM");
         /* End optimized UPDATE. */
      }
      else if ( AV11TipoDoc == 3 )
      {
         n5348DevHorSal = false ;
         /* Optimized UPDATE. */
         /* Using cursor P042U3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n5348DevHorSal), AV12FecHh, A396EmprCod, Integer.valueOf(AV8AlbDoc)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVGEN");
         /* End optimized UPDATE. */
      }
      else if ( AV11TipoDoc == 4 )
      {
         /* Optimized UPDATE. */
         /* Using cursor P042U4 */
         pr_default.execute(2, new Object[] {AV12FecHh, A396EmprCod, Integer.valueOf(AV8AlbDoc)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVCRU");
         /* End optimized UPDATE. */
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = phhmmx.this.A396EmprCod;
      this.aP1[0] = phhmmx.this.AV8AlbDoc;
      this.aP2[0] = phhmmx.this.AV12FecHh;
      this.aP3[0] = phhmmx.this.AV11TipoDoc;
      Application.commitDataStores(context, remoteHandle, pr_default, "phhmmx");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A4829AlbComHor = GXutil.resetTime( GXutil.nullDate() );
      A5348DevHorSal = GXutil.resetTime( GXutil.nullDate() );
      A11673DevCruSal = GXutil.resetTime( GXutil.nullDate() );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.phhmmx__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11TipoDoc ;
   private short Gx_err ;
   private int AV8AlbDoc ;
   private String A396EmprCod ;
   private java.util.Date AV12FecHh ;
   private java.util.Date A4829AlbComHor ;
   private java.util.Date A5348DevHorSal ;
   private java.util.Date A11673DevCruSal ;
   private boolean n5348DevHorSal ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private java.util.Date[] aP2 ;
   private IDataStoreProvider pr_default ;
}

final  class phhmmx__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P042U2", "UPDATE TXPCALCOM SET AlbComHor=?  WHERE EmprCod = ? and AlbComCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALCOM")
         ,new UpdateCursor("P042U3", "UPDATE TXPDEVGEN SET DevHorSal=?  WHERE EmprCod = ? and DevGenCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDEVGEN")
         ,new UpdateCursor("P042U4", "UPDATE TXPDEVCRU SET DevCruSal=?  WHERE EmprCod = ? and DevCruId = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDEVCRU")
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
               stmt.setDateTime(1, (java.util.Date)parms[0], false);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(1, (java.util.Date)parms[1], false);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 2 :
               stmt.setDateTime(1, (java.util.Date)parms[0], false);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

