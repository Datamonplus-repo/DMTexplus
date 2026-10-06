package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plock25 extends GXProcedure
{
   public plock25( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plock25.class ), "" );
   }

   public plock25( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      plock25.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 )
   {
      plock25.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      plock25.this.A3733AlbTar = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04AY2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A3733AlbTar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3812AlbTarDsc = P04AY2_A3812AlbTarDsc[0] ;
         n3812AlbTarDsc = P04AY2_n3812AlbTarDsc[0] ;
         AV22AlbTarDsc = A3812AlbTarDsc ;
         A3812AlbTarDsc = AV22AlbTarDsc ;
         n3812AlbTarDsc = false ;
         /* Using cursor P04AY3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n3812AlbTarDsc), A3812AlbTarDsc, A396EmprCod, A3733AlbTar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBTAR");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plock25.this.A396EmprCod;
      this.aP1[0] = plock25.this.A3733AlbTar;
      Application.commitDataStores(context, remoteHandle, pr_default, "plock25");
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
      P04AY2_A396EmprCod = new String[] {""} ;
      P04AY2_A3733AlbTar = new String[] {""} ;
      P04AY2_A3812AlbTarDsc = new String[] {""} ;
      P04AY2_n3812AlbTarDsc = new boolean[] {false} ;
      A3812AlbTarDsc = "" ;
      AV22AlbTarDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plock25__default(),
         new Object[] {
             new Object[] {
            P04AY2_A396EmprCod, P04AY2_A3733AlbTar, P04AY2_A3812AlbTarDsc, P04AY2_n3812AlbTarDsc
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String A396EmprCod ;
   private String A3733AlbTar ;
   private String scmdbuf ;
   private String A3812AlbTarDsc ;
   private String AV22AlbTarDsc ;
   private boolean n3812AlbTarDsc ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P04AY2_A396EmprCod ;
   private String[] P04AY2_A3733AlbTar ;
   private String[] P04AY2_A3812AlbTarDsc ;
   private boolean[] P04AY2_n3812AlbTarDsc ;
}

final  class plock25__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04AY2", "SELECT EmprCod, AlbTar, AlbTarDsc FROM TXPALBTAR WHERE EmprCod = ? and AlbTar = ? ORDER BY EmprCod, AlbTar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04AY3", "UPDATE TXPALBTAR SET AlbTarDsc=?  WHERE EmprCod = ? AND AlbTar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBTAR")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 2);
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 2);
               return;
      }
   }

}

