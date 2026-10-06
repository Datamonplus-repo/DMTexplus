package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcoddsc extends GXProcedure
{
   public pcoddsc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcoddsc.class ), "" );
   }

   public pcoddsc( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      pcoddsc.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      pcoddsc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcoddsc.this.A3153CodCod = aP1[0];
      this.aP1 = aP1;
      pcoddsc.this.AV8CodDsc = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00PO2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A3153CodCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3154CodDsc = P00PO2_A3154CodDsc[0] ;
         n3154CodDsc = P00PO2_n3154CodDsc[0] ;
         AV8CodDsc = GXutil.substring( A3154CodDsc, 1, 2) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcoddsc.this.A396EmprCod;
      this.aP1[0] = pcoddsc.this.A3153CodCod;
      this.aP2[0] = pcoddsc.this.AV8CodDsc;
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
      P00PO2_A396EmprCod = new String[] {""} ;
      P00PO2_A3153CodCod = new String[] {""} ;
      P00PO2_A3154CodDsc = new String[] {""} ;
      P00PO2_n3154CodDsc = new boolean[] {false} ;
      A3154CodDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcoddsc__default(),
         new Object[] {
             new Object[] {
            P00PO2_A396EmprCod, P00PO2_A3153CodCod, P00PO2_A3154CodDsc, P00PO2_n3154CodDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String A396EmprCod ;
   private String A3153CodCod ;
   private String AV8CodDsc ;
   private String scmdbuf ;
   private String A3154CodDsc ;
   private boolean n3154CodDsc ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P00PO2_A396EmprCod ;
   private String[] P00PO2_A3153CodCod ;
   private String[] P00PO2_A3154CodDsc ;
   private boolean[] P00PO2_n3154CodDsc ;
}

final  class pcoddsc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00PO2", "SELECT EmprCod, CodCod, CodDsc FROM TXPCODFAC WHERE EmprCod = ? and CodCod = ? ORDER BY EmprCod, CodCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

