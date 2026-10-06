package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pplv005 extends GXProcedure
{
   public pplv005( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pplv005.class ), "" );
   }

   public pplv005( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          int[] aP2 )
   {
      pplv005.this.aP3 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 )
   {
      pplv005.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pplv005.this.A430FacCod = aP1[0];
      this.aP1 = aP1;
      pplv005.this.AV10LastFra = aP2[0];
      this.aP2 = aP2;
      pplv005.this.AV11FraAct = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02I62 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         /* Optimized DELETE. */
         /* Using cursor P02I63 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFAVEN");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P02I64 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFACVTO");
         /* End optimized DELETE. */
         /* Using cursor P02I65 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFAVEN");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV11FraAct = (int)(AV10LastFra-1) ;
      AV9ContCod = "040200" ;
      /* Optimized UPDATE. */
      /* Using cursor P02I66 */
      pr_default.execute(4, new Object[] {Integer.valueOf(AV10LastFra), A396EmprCod, AV9ContCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPLIN");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pplv005.this.A396EmprCod;
      this.aP1[0] = pplv005.this.A430FacCod;
      this.aP2[0] = pplv005.this.AV10LastFra;
      this.aP3[0] = pplv005.this.AV11FraAct;
      Application.commitDataStores(context, remoteHandle, pr_default, "pplv005");
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
      P02I62_A396EmprCod = new String[] {""} ;
      P02I62_A430FacCod = new int[1] ;
      AV9ContCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pplv005__default(),
         new Object[] {
             new Object[] {
            P02I62_A396EmprCod, P02I62_A430FacCod
            }
            , new Object[] {
            }
            , new Object[] {
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

   private short Gx_err ;
   private int A430FacCod ;
   private int AV10LastFra ;
   private int AV11FraAct ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String AV9ContCod ;
   private int[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P02I62_A396EmprCod ;
   private int[] P02I62_A430FacCod ;
}

final  class pplv005__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02I62", "SELECT EmprCod, FacCod FROM TXPCFAVEN WHERE EmprCod = ? and FacCod = ? ORDER BY EmprCod, FacCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02I63", "DELETE FROM TXPLFAVEN  WHERE EmprCod = ? and FacCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFAVEN")
         ,new UpdateCursor("P02I64", "DELETE FROM TXPFACVTO  WHERE EmprCod = ? and FacCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFACVTO")
         ,new UpdateCursor("P02I65", "DELETE FROM TXPCFAVEN  WHERE EmprCod = ? AND FacCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFAVEN")
         ,new UpdateCursor("P02I66", "UPDATE TXPEMPLIN SET ContVal=? - 1  WHERE EmprCod = ? and ContCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPEMPLIN")
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
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

