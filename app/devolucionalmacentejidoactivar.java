package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class devolucionalmacentejidoactivar extends GXProcedure
{
   public devolucionalmacentejidoactivar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( devolucionalmacentejidoactivar.class ), "" );
   }

   public devolucionalmacentejidoactivar( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      devolucionalmacentejidoactivar.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      devolucionalmacentejidoactivar.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      devolucionalmacentejidoactivar.this.A11669DevCruId = aP1[0];
      this.aP1 = aP1;
      devolucionalmacentejidoactivar.this.AV8Usurcod = aP2[0];
      this.aP2 = aP2;
      devolucionalmacentejidoactivar.this.AV9Station = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P090G2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11678DevCruStt = P090G2_A11678DevCruStt[0] ;
         A11678DevCruStt = "" ;
         AV10Inc_obs = httpContext.getMessage( "N Devolucion ", "") + GXutil.trim( GXutil.str( A11669DevCruId, 8, 0)) + httpContext.getMessage( " pasa de ANULADO a Activo", "") ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV14Pgmname, 1, 10), AV8Usurcod, AV9Station, AV10Inc_obs, A11669DevCruId, (byte)(0), "") ;
         /* Using cursor P090G3 */
         pr_default.execute(1, new Object[] {A11678DevCruStt, A396EmprCod, Integer.valueOf(A11669DevCruId)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVCRU");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = devolucionalmacentejidoactivar.this.A396EmprCod;
      this.aP1[0] = devolucionalmacentejidoactivar.this.A11669DevCruId;
      this.aP2[0] = devolucionalmacentejidoactivar.this.AV8Usurcod;
      this.aP3[0] = devolucionalmacentejidoactivar.this.AV9Station;
      Application.commitDataStores(context, remoteHandle, pr_default, "devolucionalmacentejidoactivar");
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
      P090G2_A396EmprCod = new String[] {""} ;
      P090G2_A11669DevCruId = new int[1] ;
      P090G2_A11678DevCruStt = new String[] {""} ;
      A11678DevCruStt = "" ;
      AV10Inc_obs = "" ;
      AV14Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.devolucionalmacentejidoactivar__default(),
         new Object[] {
             new Object[] {
            P090G2_A396EmprCod, P090G2_A11669DevCruId, P090G2_A11678DevCruStt
            }
            , new Object[] {
            }
         }
      );
      AV14Pgmname = "DevolucionAlmacentejidoActivar" ;
      /* GeneXus formulas. */
      AV14Pgmname = "DevolucionAlmacentejidoActivar" ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A11669DevCruId ;
   private String A396EmprCod ;
   private String AV8Usurcod ;
   private String AV9Station ;
   private String scmdbuf ;
   private String A11678DevCruStt ;
   private String AV14Pgmname ;
   private String AV10Inc_obs ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P090G2_A396EmprCod ;
   private int[] P090G2_A11669DevCruId ;
   private String[] P090G2_A11678DevCruStt ;
}

final  class devolucionalmacentejidoactivar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P090G2", "SELECT EmprCod, DevCruId, DevCruStt FROM TXPDEVCRU WHERE EmprCod = ? and DevCruId = ? ORDER BY EmprCod, DevCruId ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P090G3", "UPDATE TXPDEVCRU SET DevCruStt=?  WHERE EmprCod = ? AND DevCruId = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDEVCRU")
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
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

