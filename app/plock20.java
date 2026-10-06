package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plock20 extends GXProcedure
{
   public plock20( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plock20.class ), "" );
   }

   public plock20( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 )
   {
      plock20.this.aP1 = new short[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 )
   {
      plock20.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      plock20.this.A833TipDefCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04AT2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A833TipDefCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6870TipDefDs2 = P04AT2_A6870TipDefDs2[0] ;
         n6870TipDefDs2 = P04AT2_n6870TipDefDs2[0] ;
         AV18TipDefDs2 = A6870TipDefDs2 ;
         A6870TipDefDs2 = AV18TipDefDs2 ;
         n6870TipDefDs2 = false ;
         /* Using cursor P04AT3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n6870TipDefDs2), A6870TipDefDs2, A396EmprCod, Short.valueOf(A833TipDefCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIPDEF");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plock20.this.A396EmprCod;
      this.aP1[0] = plock20.this.A833TipDefCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "plock20");
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
      P04AT2_A396EmprCod = new String[] {""} ;
      P04AT2_A833TipDefCod = new short[1] ;
      P04AT2_A6870TipDefDs2 = new String[] {""} ;
      P04AT2_n6870TipDefDs2 = new boolean[] {false} ;
      A6870TipDefDs2 = "" ;
      AV18TipDefDs2 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plock20__default(),
         new Object[] {
             new Object[] {
            P04AT2_A396EmprCod, P04AT2_A833TipDefCod, P04AT2_A6870TipDefDs2, P04AT2_n6870TipDefDs2
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A833TipDefCod ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A6870TipDefDs2 ;
   private String AV18TipDefDs2 ;
   private boolean n6870TipDefDs2 ;
   private short[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P04AT2_A396EmprCod ;
   private short[] P04AT2_A833TipDefCod ;
   private String[] P04AT2_A6870TipDefDs2 ;
   private boolean[] P04AT2_n6870TipDefDs2 ;
}

final  class plock20__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04AT2", "SELECT EmprCod, TipDefCod, TipDefDs2 FROM TXPTIPDEF WHERE EmprCod = ? and TipDefCod = ? ORDER BY EmprCod, TipDefCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04AT3", "UPDATE TXPTIPDEF SET TipDefDs2=?  WHERE EmprCod = ? AND TipDefCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTIPDEF")
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
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
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
      }
   }

}

