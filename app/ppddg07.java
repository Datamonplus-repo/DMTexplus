package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppddg07 extends GXProcedure
{
   public ppddg07( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppddg07.class ), "" );
   }

   public ppddg07( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 )
   {
      ppddg07.this.aP2 = new byte[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      ppddg07.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppddg07.this.A13026PedDGId = aP1[0];
      this.aP1 = aP1;
      ppddg07.this.AV16LinObs = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05P52 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A13026PedDGId)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13043PedDGObsUl = P05P52_A13043PedDGObsUl[0] ;
         n13043PedDGObsUl = P05P52_n13043PedDGObsUl[0] ;
         if ( A13043PedDGObsUl <= 8 )
         {
            AV16LinObs = (byte)(A13043PedDGObsUl+1) ;
            A13043PedDGObsUl = (short)(A13043PedDGObsUl+1) ;
            n13043PedDGObsUl = false ;
         }
         else
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Se ha superado el numero de linea de observacion", ""));
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            /* Using cursor P05P53 */
            pr_default.execute(1, new Object[] {Boolean.valueOf(n13043PedDGObsUl), Short.valueOf(A13043PedDGObsUl), A396EmprCod, Integer.valueOf(A13026PedDGId)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPEDDG1");
            if (true) break;
         }
         /* Using cursor P05P54 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n13043PedDGObsUl), Short.valueOf(A13043PedDGObsUl), A396EmprCod, Integer.valueOf(A13026PedDGId)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPEDDG1");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppddg07.this.A396EmprCod;
      this.aP1[0] = ppddg07.this.A13026PedDGId;
      this.aP2[0] = ppddg07.this.AV16LinObs;
      Application.commitDataStores(context, remoteHandle, pr_default, "ppddg07");
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
      P05P52_A396EmprCod = new String[] {""} ;
      P05P52_A13026PedDGId = new int[1] ;
      P05P52_A13043PedDGObsUl = new short[1] ;
      P05P52_n13043PedDGObsUl = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppddg07__default(),
         new Object[] {
             new Object[] {
            P05P52_A396EmprCod, P05P52_A13026PedDGId, P05P52_A13043PedDGObsUl, P05P52_n13043PedDGObsUl
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

   private byte AV16LinObs ;
   private short A13043PedDGObsUl ;
   private short Gx_err ;
   private int A13026PedDGId ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private boolean n13043PedDGObsUl ;
   private byte[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P05P52_A396EmprCod ;
   private int[] P05P52_A13026PedDGId ;
   private short[] P05P52_A13043PedDGObsUl ;
   private boolean[] P05P52_n13043PedDGObsUl ;
}

final  class ppddg07__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05P52", "SELECT EmprCod, PedDGId, PedDGObsUl FROM TXPPEDDG1 WHERE EmprCod = ? and PedDGId = ? ORDER BY EmprCod, PedDGId ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05P53", "UPDATE TXPPEDDG1 SET PedDGObsUl=?  WHERE EmprCod = ? AND PedDGId = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPEDDG1")
         ,new UpdateCursor("P05P54", "UPDATE TXPPEDDG1 SET PedDGObsUl=?  WHERE EmprCod = ? AND PedDGId = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPEDDG1")
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
      }
   }

}

