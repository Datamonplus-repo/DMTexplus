package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class colorcolorantes_prdultlin extends GXProcedure
{
   public colorcolorantes_prdultlin( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( colorcolorantes_prdultlin.class ), "" );
   }

   public colorcolorantes_prdultlin( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             int aP1 )
   {
      colorcolorantes_prdultlin.this.A396EmprCod = aP0;
      colorcolorantes_prdultlin.this.A486ForNumCol = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10Collin = (short)(0) ;
      /* Using cursor P0AEP2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A715PrdLin = P0AEP2_A715PrdLin[0] ;
         AV10Collin = A715PrdLin ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Optimized UPDATE. */
      /* Using cursor P0AEP3 */
      pr_default.execute(1, new Object[] {Short.valueOf(AV10Collin), A396EmprCod, Integer.valueOf(A486ForNumCol)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCDFORM");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.colorcolorantes_prdultlin");
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
      P0AEP2_A396EmprCod = new String[] {""} ;
      P0AEP2_A486ForNumCol = new int[1] ;
      P0AEP2_A715PrdLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.colorcolorantes_prdultlin__default(),
         new Object[] {
             new Object[] {
            P0AEP2_A396EmprCod, P0AEP2_A486ForNumCol, P0AEP2_A715PrdLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10Collin ;
   private short A715PrdLin ;
   private short A741PrdUltLin ;
   private short Gx_err ;
   private int A486ForNumCol ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private IDataStoreProvider pr_default ;
   private String[] P0AEP2_A396EmprCod ;
   private int[] P0AEP2_A486ForNumCol ;
   private short[] P0AEP2_A715PrdLin ;
}

final  class colorcolorantes_prdultlin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AEP2", "SELECT * FROM (SELECT EmprCod, ForNumCol, PrdLin FROM TXPLPRFOR WHERE EmprCod = ? and ForNumCol = ? ORDER BY EmprCod, ForNumCol, PrdLin DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0AEP3", "UPDATE TXPCDFORM SET PrdUltLin=?  WHERE EmprCod = ? and ForNumCol = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCDFORM")
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

