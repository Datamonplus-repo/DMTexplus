package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ensayoscolorantes_del extends GXProcedure
{
   public ensayoscolorantes_del( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ensayoscolorantes_del.class ), "" );
   }

   public ensayoscolorantes_del( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        short aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             short aP3 )
   {
      ensayoscolorantes_del.this.AV8emprcod = aP0;
      ensayoscolorantes_del.this.AV14lb_numero = aP1;
      ensayoscolorantes_del.this.AV15lb_opcion = aP2;
      ensayoscolorantes_del.this.AV16lb_lineaC = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized DELETE. */
      /* Using cursor P0AF52 */
      pr_default.execute(0, new Object[] {AV8emprcod, Integer.valueOf(AV14lb_numero), AV15lb_opcion, Short.valueOf(AV16lb_lineaC)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS003");
      /* End optimized DELETE. */
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.ensayoscolorantes_del");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.ensayoscolorantes_del__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV16lb_lineaC ;
   private short Gx_err ;
   private int AV14lb_numero ;
   private String AV8emprcod ;
   private String AV15lb_opcion ;
   private IDataStoreProvider pr_default ;
}

final  class ensayoscolorantes_del__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0AF52", "DELETE FROM TXPENS003  WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? and Lb_LineaC = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS003")
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
      }
   }

}

