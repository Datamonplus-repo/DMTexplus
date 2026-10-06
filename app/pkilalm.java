package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pkilalm extends GXProcedure
{
   public pkilalm( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pkilalm.class ), "" );
   }

   public pkilalm( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pkilalm.this.aP1 = new int[] {0};
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
      pkilalm.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pkilalm.this.AV8Albreccod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02IA2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8Albreccod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A44AlbRecCod = P02IA2_A44AlbRecCod[0] ;
         A1211TipEntCod = P02IA2_A1211TipEntCod[0] ;
         n1211TipEntCod = P02IA2_n1211TipEntCod[0] ;
         if ( A1211TipEntCod == 9999 )
         {
            /* Using cursor P02IA3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pkilalm.this.A396EmprCod;
      this.aP1[0] = pkilalm.this.AV8Albreccod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pkilalm");
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
      P02IA2_A396EmprCod = new String[] {""} ;
      P02IA2_A44AlbRecCod = new int[1] ;
      P02IA2_A1211TipEntCod = new short[1] ;
      P02IA2_n1211TipEntCod = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pkilalm__default(),
         new Object[] {
             new Object[] {
            P02IA2_A396EmprCod, P02IA2_A44AlbRecCod, P02IA2_A1211TipEntCod, P02IA2_n1211TipEntCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A1211TipEntCod ;
   private short Gx_err ;
   private int AV8Albreccod ;
   private int A44AlbRecCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private boolean n1211TipEntCod ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P02IA2_A396EmprCod ;
   private int[] P02IA2_A44AlbRecCod ;
   private short[] P02IA2_A1211TipEntCod ;
   private boolean[] P02IA2_n1211TipEntCod ;
}

final  class pkilalm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02IA2", "SELECT EmprCod, AlbRecCod, TipEntCod FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02IA3", "DELETE FROM TXPALBREC  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

