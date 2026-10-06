package app.trabajosexternos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class trabajoexterno_get_atcud extends GXProcedure
{
   public trabajoexterno_get_atcud( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trabajoexterno_get_atcud.class ), "" );
   }

   public trabajoexterno_get_atcud( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      trabajoexterno_get_atcud.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      trabajoexterno_get_atcud.this.A396EmprCod = aP0;
      trabajoexterno_get_atcud.this.A2253SalExtAlb = aP1;
      trabajoexterno_get_atcud.this.aP2 = aP2;
      trabajoexterno_get_atcud.this.aP3 = aP3;
      trabajoexterno_get_atcud.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14SalExtATCUD = "" ;
      AV15SalExtSerAT = "" ;
      AV16SalExtTipAT = "" ;
      /* Using cursor P0AKS2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14348SalExtATCU = P0AKS2_A14348SalExtATCU[0] ;
         A14349SalExtSerA = P0AKS2_A14349SalExtSerA[0] ;
         A14350SalExtTipA = P0AKS2_A14350SalExtTipA[0] ;
         AV14SalExtATCUD = A14348SalExtATCU ;
         AV15SalExtSerAT = A14349SalExtSerA ;
         AV16SalExtTipAT = A14350SalExtTipA ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = trabajoexterno_get_atcud.this.AV14SalExtATCUD;
      this.aP3[0] = trabajoexterno_get_atcud.this.AV15SalExtSerAT;
      this.aP4[0] = trabajoexterno_get_atcud.this.AV16SalExtTipAT;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV14SalExtATCUD = "" ;
      AV15SalExtSerAT = "" ;
      AV16SalExtTipAT = "" ;
      scmdbuf = "" ;
      P0AKS2_A396EmprCod = new String[] {""} ;
      P0AKS2_A2253SalExtAlb = new int[1] ;
      P0AKS2_A14348SalExtATCU = new String[] {""} ;
      P0AKS2_A14349SalExtSerA = new String[] {""} ;
      P0AKS2_A14350SalExtTipA = new String[] {""} ;
      A14348SalExtATCU = "" ;
      A14349SalExtSerA = "" ;
      A14350SalExtTipA = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.trabajoexterno_get_atcud__default(),
         new Object[] {
             new Object[] {
            P0AKS2_A396EmprCod, P0AKS2_A2253SalExtAlb, P0AKS2_A14348SalExtATCU, P0AKS2_A14349SalExtSerA, P0AKS2_A14350SalExtTipA
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A2253SalExtAlb ;
   private String A396EmprCod ;
   private String AV14SalExtATCUD ;
   private String AV15SalExtSerAT ;
   private String AV16SalExtTipAT ;
   private String scmdbuf ;
   private String A14348SalExtATCU ;
   private String A14349SalExtSerA ;
   private String A14350SalExtTipA ;
   private String[] aP4 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AKS2_A396EmprCod ;
   private int[] P0AKS2_A2253SalExtAlb ;
   private String[] P0AKS2_A14348SalExtATCU ;
   private String[] P0AKS2_A14349SalExtSerA ;
   private String[] P0AKS2_A14350SalExtTipA ;
}

final  class trabajoexterno_get_atcud__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AKS2", "SELECT EmprCod, SalExtAlb, SalExtATCU, SalExtSerA, SalExtTipA FROM TXPCEXTSA WHERE EmprCod = ? and SalExtAlb = ? ORDER BY EmprCod, SalExtAlb ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
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
      }
   }

}

