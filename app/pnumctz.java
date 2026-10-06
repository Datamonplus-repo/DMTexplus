package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnumctz extends GXProcedure
{
   public pnumctz( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnumctz.class ), "" );
   }

   public pnumctz( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pnumctz.this.aP1 = new int[] {0};
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
      pnumctz.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnumctz.this.A5532Lb_numero = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV11ContVal ;
      GXv_int2[0] = GXt_int1 ;
      new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NUMCTZ", ""), GXv_int2) ;
      pnumctz.this.GXt_int1 = GXv_int2[0] ;
      AV11ContVal = GXt_int1 ;
      AV12Lb_cartaz = GXutil.trim( GXutil.str( AV11ContVal, 8, 0)) ;
      /* Using cursor P03IP2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5540Lb_Cartaz = P03IP2_A5540Lb_Cartaz[0] ;
         A5540Lb_Cartaz = AV12Lb_cartaz ;
         Gx_msg = httpContext.getMessage( "Coleccion Actualizada=", "") + AV12Lb_cartaz ;
         System.out.println( Gx_msg );
         /* Using cursor P03IP3 */
         pr_default.execute(1, new Object[] {A5540Lb_Cartaz, A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS001");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnumctz.this.A396EmprCod;
      this.aP1[0] = pnumctz.this.A5532Lb_numero;
      Application.commitDataStores(context, remoteHandle, pr_default, "pnumctz");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new int[1] ;
      AV12Lb_cartaz = "" ;
      scmdbuf = "" ;
      P03IP2_A396EmprCod = new String[] {""} ;
      P03IP2_A5532Lb_numero = new int[1] ;
      P03IP2_A5540Lb_Cartaz = new String[] {""} ;
      A5540Lb_Cartaz = "" ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnumctz__default(),
         new Object[] {
             new Object[] {
            P03IP2_A396EmprCod, P03IP2_A5532Lb_numero, P03IP2_A5540Lb_Cartaz
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A5532Lb_numero ;
   private int AV11ContVal ;
   private int GXt_int1 ;
   private int GXv_int2[] ;
   private String A396EmprCod ;
   private String AV12Lb_cartaz ;
   private String scmdbuf ;
   private String A5540Lb_Cartaz ;
   private String Gx_msg ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P03IP2_A396EmprCod ;
   private int[] P03IP2_A5532Lb_numero ;
   private String[] P03IP2_A5540Lb_Cartaz ;
}

final  class pnumctz__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03IP2", "SELECT EmprCod, Lb_numero, Lb_Cartaz FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03IP3", "UPDATE TXPENS001 SET Lb_Cartaz=?  WHERE EmprCod = ? AND Lb_numero = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS001")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
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
               stmt.setString(1, (String)parms[0], 20);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

