package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class maquinaestado_pr extends GXProcedure
{
   public maquinaestado_pr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( maquinaestado_pr.class ), "" );
   }

   public maquinaestado_pr( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 )
   {
      maquinaestado_pr.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String[] aP2 )
   {
      maquinaestado_pr.this.A396EmprCod = aP0;
      maquinaestado_pr.this.A602MaqCod = aP1;
      maquinaestado_pr.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8MaqEst = "" ;
      /* Using cursor P0A6F2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A602MaqCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A607MaqEst = P0A6F2_A607MaqEst[0] ;
         n607MaqEst = P0A6F2_n607MaqEst[0] ;
         AV8MaqEst = A607MaqEst ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = maquinaestado_pr.this.AV8MaqEst;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8MaqEst = "" ;
      scmdbuf = "" ;
      P0A6F2_A396EmprCod = new String[] {""} ;
      P0A6F2_A602MaqCod = new String[] {""} ;
      P0A6F2_A607MaqEst = new String[] {""} ;
      P0A6F2_n607MaqEst = new boolean[] {false} ;
      A607MaqEst = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.maquinaestado_pr__default(),
         new Object[] {
             new Object[] {
            P0A6F2_A396EmprCod, P0A6F2_A602MaqCod, P0A6F2_A607MaqEst, P0A6F2_n607MaqEst
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String AV8MaqEst ;
   private String scmdbuf ;
   private String A607MaqEst ;
   private boolean n607MaqEst ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A6F2_A396EmprCod ;
   private String[] P0A6F2_A602MaqCod ;
   private String[] P0A6F2_A607MaqEst ;
   private boolean[] P0A6F2_n607MaqEst ;
}

final  class maquinaestado_pr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A6F2", "SELECT EmprCod, MaqCod, MaqEst FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

