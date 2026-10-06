package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ensayoscolorantes_lb_ultlc extends GXProcedure
{
   public ensayoscolorantes_lb_ultlc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ensayoscolorantes_lb_ultlc.class ), "" );
   }

   public ensayoscolorantes_lb_ultlc( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 )
   {
      ensayoscolorantes_lb_ultlc.this.A396EmprCod = aP0;
      ensayoscolorantes_lb_ultlc.this.A5532Lb_numero = aP1;
      ensayoscolorantes_lb_ultlc.this.A5555Lb_opcion = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14Lb_UltLC = (short)(0) ;
      /* Using cursor P0AEH2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5557Lb_LineaC = P0AEH2_A5557Lb_LineaC[0] ;
         AV14Lb_UltLC = A5557Lb_LineaC ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Optimized UPDATE. */
      /* Using cursor P0AEH3 */
      pr_default.execute(1, new Object[] {Short.valueOf(AV14Lb_UltLC), A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS002");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.ensayoscolorantes_lb_ultlc");
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
      P0AEH2_A396EmprCod = new String[] {""} ;
      P0AEH2_A5532Lb_numero = new int[1] ;
      P0AEH2_A5555Lb_opcion = new String[] {""} ;
      P0AEH2_A5557Lb_LineaC = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.ensayoscolorantes_lb_ultlc__default(),
         new Object[] {
             new Object[] {
            P0AEH2_A396EmprCod, P0AEH2_A5532Lb_numero, P0AEH2_A5555Lb_opcion, P0AEH2_A5557Lb_LineaC
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV14Lb_UltLC ;
   private short A5557Lb_LineaC ;
   private short A5556Lb_UltLC ;
   private short Gx_err ;
   private int A5532Lb_numero ;
   private String A396EmprCod ;
   private String A5555Lb_opcion ;
   private String scmdbuf ;
   private IDataStoreProvider pr_default ;
   private String[] P0AEH2_A396EmprCod ;
   private int[] P0AEH2_A5532Lb_numero ;
   private String[] P0AEH2_A5555Lb_opcion ;
   private short[] P0AEH2_A5557Lb_LineaC ;
}

final  class ensayoscolorantes_lb_ultlc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AEH2", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_LineaC FROM TXPENS003 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion, Lb_LineaC DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0AEH3", "UPDATE TXPENS002 SET Lb_UltLC=?  WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS002")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 1 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

