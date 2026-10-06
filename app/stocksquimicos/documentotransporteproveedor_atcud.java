package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentotransporteproveedor_atcud extends GXProcedure
{
   public documentotransporteproveedor_atcud( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentotransporteproveedor_atcud.class ), "" );
   }

   public documentotransporteproveedor_atcud( int remoteHandle ,
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
      documentotransporteproveedor_atcud.this.A396EmprCod = aP0;
      documentotransporteproveedor_atcud.this.A13418AlbProID = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P0AKU2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14190AlbProATCU = P0AKU2_A14190AlbProATCU[0] ;
         n14190AlbProATCU = P0AKU2_n14190AlbProATCU[0] ;
         A14191AlbProSerA = P0AKU2_A14191AlbProSerA[0] ;
         n14191AlbProSerA = P0AKU2_n14191AlbProSerA[0] ;
         A14192AlbProTipA = P0AKU2_A14192AlbProTipA[0] ;
         n14192AlbProTipA = P0AKU2_n14192AlbProTipA[0] ;
         GXv_char1[0] = AV24AlbProATCUD ;
         GXv_char2[0] = AV22AlbProSerAT ;
         GXv_char3[0] = AV23AlbProTipAT ;
         new app.patcud(remoteHandle, context).execute( A396EmprCod, "REMTRA", GXv_char1, GXv_char2, GXv_char3, GXutil.trim( AV28Pgmname)+"."+GXutil.trim( AV29Pgmdesc)) ;
         documentotransporteproveedor_atcud.this.AV24AlbProATCUD = GXv_char1[0] ;
         documentotransporteproveedor_atcud.this.AV22AlbProSerAT = GXv_char2[0] ;
         documentotransporteproveedor_atcud.this.AV23AlbProTipAT = GXv_char3[0] ;
         A14190AlbProATCU = AV24AlbProATCUD ;
         n14190AlbProATCU = false ;
         A14191AlbProSerA = AV22AlbProSerAT ;
         n14191AlbProSerA = false ;
         A14192AlbProTipA = AV23AlbProTipAT ;
         n14192AlbProTipA = false ;
         /* Using cursor P0AKU3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n14190AlbProATCU), A14190AlbProATCU, Boolean.valueOf(n14191AlbProSerA), A14191AlbProSerA, Boolean.valueOf(n14192AlbProTipA), A14192AlbProTipA, A396EmprCod, Integer.valueOf(A13418AlbProID)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRO");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "stocksquimicos.documentotransporteproveedor_atcud");
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
      P0AKU2_A396EmprCod = new String[] {""} ;
      P0AKU2_A13418AlbProID = new int[1] ;
      P0AKU2_A14190AlbProATCU = new String[] {""} ;
      P0AKU2_n14190AlbProATCU = new boolean[] {false} ;
      P0AKU2_A14191AlbProSerA = new String[] {""} ;
      P0AKU2_n14191AlbProSerA = new boolean[] {false} ;
      P0AKU2_A14192AlbProTipA = new String[] {""} ;
      P0AKU2_n14192AlbProTipA = new boolean[] {false} ;
      A14190AlbProATCU = "" ;
      A14191AlbProSerA = "" ;
      A14192AlbProTipA = "" ;
      AV24AlbProATCUD = "" ;
      GXv_char1 = new String[1] ;
      AV22AlbProSerAT = "" ;
      GXv_char2 = new String[1] ;
      AV23AlbProTipAT = "" ;
      GXv_char3 = new String[1] ;
      AV28Pgmname = "" ;
      AV29Pgmdesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.documentotransporteproveedor_atcud__default(),
         new Object[] {
             new Object[] {
            P0AKU2_A396EmprCod, P0AKU2_A13418AlbProID, P0AKU2_A14190AlbProATCU, P0AKU2_n14190AlbProATCU, P0AKU2_A14191AlbProSerA, P0AKU2_n14191AlbProSerA, P0AKU2_A14192AlbProTipA, P0AKU2_n14192AlbProTipA
            }
            , new Object[] {
            }
         }
      );
      AV29Pgmdesc = httpContext.getMessage( "Documento Transporte Proveedor_ATCUD", "") ;
      AV28Pgmname = "StocksQuimicos.DocumentoTransporteProveedor_ATCUD" ;
      /* GeneXus formulas. */
      AV29Pgmdesc = httpContext.getMessage( "Documento Transporte Proveedor_ATCUD", "") ;
      AV28Pgmname = "StocksQuimicos.DocumentoTransporteProveedor_ATCUD" ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A13418AlbProID ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A14190AlbProATCU ;
   private String A14191AlbProSerA ;
   private String A14192AlbProTipA ;
   private String AV24AlbProATCUD ;
   private String GXv_char1[] ;
   private String AV22AlbProSerAT ;
   private String GXv_char2[] ;
   private String AV23AlbProTipAT ;
   private String GXv_char3[] ;
   private String AV28Pgmname ;
   private String AV29Pgmdesc ;
   private boolean n14190AlbProATCU ;
   private boolean n14191AlbProSerA ;
   private boolean n14192AlbProTipA ;
   private IDataStoreProvider pr_default ;
   private String[] P0AKU2_A396EmprCod ;
   private int[] P0AKU2_A13418AlbProID ;
   private String[] P0AKU2_A14190AlbProATCU ;
   private boolean[] P0AKU2_n14190AlbProATCU ;
   private String[] P0AKU2_A14191AlbProSerA ;
   private boolean[] P0AKU2_n14191AlbProSerA ;
   private String[] P0AKU2_A14192AlbProTipA ;
   private boolean[] P0AKU2_n14192AlbProTipA ;
}

final  class documentotransporteproveedor_atcud__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AKU2", "SELECT EmprCod, AlbProID, AlbProATCU, AlbProSerA, AlbProTipA FROM TXPCALPRO WHERE EmprCod = ? and AlbProID = ? ORDER BY EmprCod, AlbProID ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0AKU3", "UPDATE TXPCALPRO SET AlbProATCU=?, AlbProSerA=?, AlbProTipA=?  WHERE EmprCod = ? AND AlbProID = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRO")
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
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 20);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 20);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 4);
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setInt(5, ((Number) parms[7]).intValue());
               return;
      }
   }

}

