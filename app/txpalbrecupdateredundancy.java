package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class txpalbrecupdateredundancy extends GXProcedure
{
   public txpalbrecupdateredundancy( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( txpalbrecupdateredundancy.class ), "" );
   }

   public txpalbrecupdateredundancy( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      txpalbrecupdateredundancy.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      txpalbrecupdateredundancy.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      txpalbrecupdateredundancy.this.A44AlbRecCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor TXPALBRECU2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = TXPALBRECU2_A252CliCod[0] ;
         n252CliCod = TXPALBRECU2_n252CliCod[0] ;
         AV2GXV252 = A252CliCod ;
         n252CliCod = false ;
         /* Optimized UPDATE. */
         /* Using cursor TXPALBRECU3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(AV2GXV252), A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVGEN");
         /* End optimized UPDATE. */
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = txpalbrecupdateredundancy.this.A396EmprCod;
      this.aP1[0] = txpalbrecupdateredundancy.this.A44AlbRecCod;
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
      TXPALBRECU2_A396EmprCod = new String[] {""} ;
      TXPALBRECU2_A44AlbRecCod = new int[1] ;
      TXPALBRECU2_n44AlbRecCod = new boolean[] {false} ;
      TXPALBRECU2_A252CliCod = new int[1] ;
      TXPALBRECU2_n252CliCod = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.txpalbrecupdateredundancy__default(),
         new Object[] {
             new Object[] {
            TXPALBRECU2_A396EmprCod, TXPALBRECU2_A44AlbRecCod, TXPALBRECU2_A252CliCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int AV2GXV252 ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private boolean n44AlbRecCod ;
   private boolean n252CliCod ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] TXPALBRECU2_A396EmprCod ;
   private int[] TXPALBRECU2_A44AlbRecCod ;
   private boolean[] TXPALBRECU2_n44AlbRecCod ;
   private int[] TXPALBRECU2_A252CliCod ;
   private boolean[] TXPALBRECU2_n252CliCod ;
}

final  class txpalbrecupdateredundancy__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("TXPALBRECU2", "SELECT EmprCod, AlbRecCod, CliCod FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("TXPALBRECU3", "UPDATE TXPDEVGEN SET CliCod=?  WHERE EmprCod = ? and AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDEVGEN")
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               return;
      }
   }

}

