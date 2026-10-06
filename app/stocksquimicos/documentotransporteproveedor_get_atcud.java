package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentotransporteproveedor_get_atcud extends GXProcedure
{
   public documentotransporteproveedor_get_atcud( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentotransporteproveedor_get_atcud.class ), "" );
   }

   public documentotransporteproveedor_get_atcud( int remoteHandle ,
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
      documentotransporteproveedor_get_atcud.this.aP4 = new String[] {""};
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
      documentotransporteproveedor_get_atcud.this.A396EmprCod = aP0;
      documentotransporteproveedor_get_atcud.this.A13418AlbProID = aP1;
      documentotransporteproveedor_get_atcud.this.aP2 = aP2;
      documentotransporteproveedor_get_atcud.this.aP3 = aP3;
      documentotransporteproveedor_get_atcud.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17AlbProATCUD = "" ;
      AV18AlbProSerAT = "" ;
      AV19AlbProTipAT = "" ;
      /* Using cursor P0AKV2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14190AlbProATCU = P0AKV2_A14190AlbProATCU[0] ;
         n14190AlbProATCU = P0AKV2_n14190AlbProATCU[0] ;
         A14191AlbProSerA = P0AKV2_A14191AlbProSerA[0] ;
         n14191AlbProSerA = P0AKV2_n14191AlbProSerA[0] ;
         A14192AlbProTipA = P0AKV2_A14192AlbProTipA[0] ;
         n14192AlbProTipA = P0AKV2_n14192AlbProTipA[0] ;
         AV17AlbProATCUD = A14190AlbProATCU ;
         AV18AlbProSerAT = A14191AlbProSerA ;
         AV19AlbProTipAT = A14192AlbProTipA ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = documentotransporteproveedor_get_atcud.this.AV17AlbProATCUD;
      this.aP3[0] = documentotransporteproveedor_get_atcud.this.AV18AlbProSerAT;
      this.aP4[0] = documentotransporteproveedor_get_atcud.this.AV19AlbProTipAT;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV17AlbProATCUD = "" ;
      AV18AlbProSerAT = "" ;
      AV19AlbProTipAT = "" ;
      scmdbuf = "" ;
      P0AKV2_A396EmprCod = new String[] {""} ;
      P0AKV2_A13418AlbProID = new int[1] ;
      P0AKV2_A14190AlbProATCU = new String[] {""} ;
      P0AKV2_n14190AlbProATCU = new boolean[] {false} ;
      P0AKV2_A14191AlbProSerA = new String[] {""} ;
      P0AKV2_n14191AlbProSerA = new boolean[] {false} ;
      P0AKV2_A14192AlbProTipA = new String[] {""} ;
      P0AKV2_n14192AlbProTipA = new boolean[] {false} ;
      A14190AlbProATCU = "" ;
      A14191AlbProSerA = "" ;
      A14192AlbProTipA = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.documentotransporteproveedor_get_atcud__default(),
         new Object[] {
             new Object[] {
            P0AKV2_A396EmprCod, P0AKV2_A13418AlbProID, P0AKV2_A14190AlbProATCU, P0AKV2_n14190AlbProATCU, P0AKV2_A14191AlbProSerA, P0AKV2_n14191AlbProSerA, P0AKV2_A14192AlbProTipA, P0AKV2_n14192AlbProTipA
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A13418AlbProID ;
   private String A396EmprCod ;
   private String AV17AlbProATCUD ;
   private String AV18AlbProSerAT ;
   private String AV19AlbProTipAT ;
   private String scmdbuf ;
   private String A14190AlbProATCU ;
   private String A14191AlbProSerA ;
   private String A14192AlbProTipA ;
   private boolean n14190AlbProATCU ;
   private boolean n14191AlbProSerA ;
   private boolean n14192AlbProTipA ;
   private String[] aP4 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AKV2_A396EmprCod ;
   private int[] P0AKV2_A13418AlbProID ;
   private String[] P0AKV2_A14190AlbProATCU ;
   private boolean[] P0AKV2_n14190AlbProATCU ;
   private String[] P0AKV2_A14191AlbProSerA ;
   private boolean[] P0AKV2_n14191AlbProSerA ;
   private String[] P0AKV2_A14192AlbProTipA ;
   private boolean[] P0AKV2_n14192AlbProTipA ;
}

final  class documentotransporteproveedor_get_atcud__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AKV2", "SELECT EmprCod, AlbProID, AlbProATCU, AlbProSerA, AlbProTipA FROM TXPCALPRO WHERE EmprCod = ? and AlbProID = ? ORDER BY EmprCod, AlbProID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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

