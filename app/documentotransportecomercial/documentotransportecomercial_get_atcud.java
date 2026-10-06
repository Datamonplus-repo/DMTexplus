package app.documentotransportecomercial ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentotransportecomercial_get_atcud extends GXProcedure
{
   public documentotransportecomercial_get_atcud( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentotransportecomercial_get_atcud.class ), "" );
   }

   public documentotransportecomercial_get_atcud( int remoteHandle ,
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
      documentotransportecomercial_get_atcud.this.aP4 = new String[] {""};
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
      documentotransportecomercial_get_atcud.this.A396EmprCod = aP0;
      documentotransportecomercial_get_atcud.this.A14AlbComCod = aP1;
      documentotransportecomercial_get_atcud.this.aP2 = aP2;
      documentotransportecomercial_get_atcud.this.aP3 = aP3;
      documentotransportecomercial_get_atcud.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15AlbComATCUD = "" ;
      AV14AlbComSerAt = "" ;
      AV16AlbComTipAT = "" ;
      /* Using cursor P0AKQ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14248AlbComATCU = P0AKQ2_A14248AlbComATCU[0] ;
         A14249AlbComSerA = P0AKQ2_A14249AlbComSerA[0] ;
         A14250AlbComTipA = P0AKQ2_A14250AlbComTipA[0] ;
         AV15AlbComATCUD = A14248AlbComATCU ;
         AV14AlbComSerAt = A14249AlbComSerA ;
         AV16AlbComTipAT = A14250AlbComTipA ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = documentotransportecomercial_get_atcud.this.AV15AlbComATCUD;
      this.aP3[0] = documentotransportecomercial_get_atcud.this.AV14AlbComSerAt;
      this.aP4[0] = documentotransportecomercial_get_atcud.this.AV16AlbComTipAT;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15AlbComATCUD = "" ;
      AV14AlbComSerAt = "" ;
      AV16AlbComTipAT = "" ;
      scmdbuf = "" ;
      P0AKQ2_A396EmprCod = new String[] {""} ;
      P0AKQ2_A14AlbComCod = new int[1] ;
      P0AKQ2_A14248AlbComATCU = new String[] {""} ;
      P0AKQ2_A14249AlbComSerA = new String[] {""} ;
      P0AKQ2_A14250AlbComTipA = new String[] {""} ;
      A14248AlbComATCU = "" ;
      A14249AlbComSerA = "" ;
      A14250AlbComTipA = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransportecomercial.documentotransportecomercial_get_atcud__default(),
         new Object[] {
             new Object[] {
            P0AKQ2_A396EmprCod, P0AKQ2_A14AlbComCod, P0AKQ2_A14248AlbComATCU, P0AKQ2_A14249AlbComSerA, P0AKQ2_A14250AlbComTipA
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A14AlbComCod ;
   private String A396EmprCod ;
   private String AV15AlbComATCUD ;
   private String AV14AlbComSerAt ;
   private String AV16AlbComTipAT ;
   private String scmdbuf ;
   private String A14248AlbComATCU ;
   private String A14249AlbComSerA ;
   private String A14250AlbComTipA ;
   private String[] aP4 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AKQ2_A396EmprCod ;
   private int[] P0AKQ2_A14AlbComCod ;
   private String[] P0AKQ2_A14248AlbComATCU ;
   private String[] P0AKQ2_A14249AlbComSerA ;
   private String[] P0AKQ2_A14250AlbComTipA ;
}

final  class documentotransportecomercial_get_atcud__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AKQ2", "SELECT EmprCod, AlbComCod, AlbComATCU, AlbComSerA, AlbComTipA FROM TXPCALCOM WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

