package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdelmacroprocesos extends GXProcedure
{
   public pdelmacroprocesos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdelmacroprocesos.class ), "" );
   }

   public pdelmacroprocesos( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pdelmacroprocesos.this.aP1 = new int[] {0};
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
      pdelmacroprocesos.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdelmacroprocesos.this.A5532Lb_numero = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV9EmprNom ;
      GXv_char3[0] = AV10UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV8Station, GXv_char1, GXv_char2, GXv_char3) ;
      pdelmacroprocesos.this.A396EmprCod = GXv_char1[0] ;
      pdelmacroprocesos.this.AV9EmprNom = GXv_char2[0] ;
      pdelmacroprocesos.this.AV10UsurCod = GXv_char3[0] ;
      /* Using cursor P04LT2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5553Lb_ForCod = P04LT2_A5553Lb_ForCod[0] ;
         A5551Lb_lineaPq = P04LT2_A5551Lb_lineaPq[0] ;
         AV11Inc_obs = httpContext.getMessage( "Eliminacion procesos en Ensayos.", "") + GXutil.newLine( ) ;
         AV11Inc_obs += httpContext.getMessage( "Linea-Proceso", "") + GXutil.str( A5551Lb_lineaPq, 4, 0) + " " + A5553Lb_ForCod ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV15Pgmname, AV10UsurCod, AV8Station, AV11Inc_obs, 0, (byte)(0), " ") ;
         /* Using cursor P04LT3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), Short.valueOf(A5551Lb_lineaPq)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS000");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdelmacroprocesos.this.A396EmprCod;
      this.aP1[0] = pdelmacroprocesos.this.A5532Lb_numero;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdelmacroprocesos");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Station = "" ;
      GXv_char1 = new String[1] ;
      AV9EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV10UsurCod = "" ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P04LT2_A396EmprCod = new String[] {""} ;
      P04LT2_A5532Lb_numero = new int[1] ;
      P04LT2_A5553Lb_ForCod = new String[] {""} ;
      P04LT2_A5551Lb_lineaPq = new short[1] ;
      A5553Lb_ForCod = "" ;
      AV11Inc_obs = "" ;
      AV15Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdelmacroprocesos__default(),
         new Object[] {
             new Object[] {
            P04LT2_A396EmprCod, P04LT2_A5532Lb_numero, P04LT2_A5553Lb_ForCod, P04LT2_A5551Lb_lineaPq
            }
            , new Object[] {
            }
         }
      );
      AV15Pgmname = "PdelMacroprocesos" ;
      /* GeneXus formulas. */
      AV15Pgmname = "PdelMacroprocesos" ;
      Gx_err = (short)(0) ;
   }

   private short A5551Lb_lineaPq ;
   private short Gx_err ;
   private int A5532Lb_numero ;
   private String A396EmprCod ;
   private String AV8Station ;
   private String GXv_char1[] ;
   private String AV9EmprNom ;
   private String GXv_char2[] ;
   private String AV10UsurCod ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A5553Lb_ForCod ;
   private String AV15Pgmname ;
   private String AV11Inc_obs ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P04LT2_A396EmprCod ;
   private int[] P04LT2_A5532Lb_numero ;
   private String[] P04LT2_A5553Lb_ForCod ;
   private short[] P04LT2_A5551Lb_lineaPq ;
}

final  class pdelmacroprocesos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04LT2", "SELECT EmprCod, Lb_numero, Lb_ForCod, Lb_lineaPq FROM TXPENS000 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_lineaPq ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04LT3", "DELETE FROM TXPENS000  WHERE EmprCod = ? AND Lb_numero = ? AND Lb_lineaPq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS000")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

