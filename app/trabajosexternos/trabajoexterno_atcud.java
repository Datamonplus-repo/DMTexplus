package app.trabajosexternos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class trabajoexterno_atcud extends GXProcedure
{
   public trabajoexterno_atcud( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trabajoexterno_atcud.class ), "" );
   }

   public trabajoexterno_atcud( int remoteHandle ,
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
      trabajoexterno_atcud.this.A396EmprCod = aP0;
      trabajoexterno_atcud.this.A2253SalExtAlb = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P0AKT2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14348SalExtATCU = P0AKT2_A14348SalExtATCU[0] ;
         A14349SalExtSerA = P0AKT2_A14349SalExtSerA[0] ;
         A14350SalExtTipA = P0AKT2_A14350SalExtTipA[0] ;
         GXv_char1[0] = AV19SalExtATCUD ;
         GXv_char2[0] = AV18SalExtSerAT ;
         GXv_char3[0] = AV20SalExtTipAT ;
         new app.patcud(remoteHandle, context).execute( A396EmprCod, "EXTHDR", GXv_char1, GXv_char2, GXv_char3, GXutil.trim( AV24Pgmname)+"."+GXutil.trim( AV25Pgmdesc)) ;
         trabajoexterno_atcud.this.AV19SalExtATCUD = GXv_char1[0] ;
         trabajoexterno_atcud.this.AV18SalExtSerAT = GXv_char2[0] ;
         trabajoexterno_atcud.this.AV20SalExtTipAT = GXv_char3[0] ;
         A14348SalExtATCU = AV19SalExtATCUD ;
         A14349SalExtSerA = AV18SalExtSerAT ;
         A14350SalExtTipA = AV20SalExtTipAT ;
         /* Using cursor P0AKT3 */
         pr_default.execute(1, new Object[] {A14348SalExtATCU, A14349SalExtSerA, A14350SalExtTipA, A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXTSA");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "trabajosexternos.trabajoexterno_atcud");
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
      P0AKT2_A396EmprCod = new String[] {""} ;
      P0AKT2_A2253SalExtAlb = new int[1] ;
      P0AKT2_A14348SalExtATCU = new String[] {""} ;
      P0AKT2_A14349SalExtSerA = new String[] {""} ;
      P0AKT2_A14350SalExtTipA = new String[] {""} ;
      A14348SalExtATCU = "" ;
      A14349SalExtSerA = "" ;
      A14350SalExtTipA = "" ;
      AV19SalExtATCUD = "" ;
      GXv_char1 = new String[1] ;
      AV18SalExtSerAT = "" ;
      GXv_char2 = new String[1] ;
      AV20SalExtTipAT = "" ;
      GXv_char3 = new String[1] ;
      AV24Pgmname = "" ;
      AV25Pgmdesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.trabajoexterno_atcud__default(),
         new Object[] {
             new Object[] {
            P0AKT2_A396EmprCod, P0AKT2_A2253SalExtAlb, P0AKT2_A14348SalExtATCU, P0AKT2_A14349SalExtSerA, P0AKT2_A14350SalExtTipA
            }
            , new Object[] {
            }
         }
      );
      AV25Pgmdesc = httpContext.getMessage( "Trabajo Externo_ATCUD", "") ;
      AV24Pgmname = "TrabajosExternos.TrabajoExterno_ATCUD" ;
      /* GeneXus formulas. */
      AV25Pgmdesc = httpContext.getMessage( "Trabajo Externo_ATCUD", "") ;
      AV24Pgmname = "TrabajosExternos.TrabajoExterno_ATCUD" ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A2253SalExtAlb ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A14348SalExtATCU ;
   private String A14349SalExtSerA ;
   private String A14350SalExtTipA ;
   private String AV19SalExtATCUD ;
   private String GXv_char1[] ;
   private String AV18SalExtSerAT ;
   private String GXv_char2[] ;
   private String AV20SalExtTipAT ;
   private String GXv_char3[] ;
   private String AV24Pgmname ;
   private String AV25Pgmdesc ;
   private IDataStoreProvider pr_default ;
   private String[] P0AKT2_A396EmprCod ;
   private int[] P0AKT2_A2253SalExtAlb ;
   private String[] P0AKT2_A14348SalExtATCU ;
   private String[] P0AKT2_A14349SalExtSerA ;
   private String[] P0AKT2_A14350SalExtTipA ;
}

final  class trabajoexterno_atcud__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AKT2", "SELECT EmprCod, SalExtAlb, SalExtATCU, SalExtSerA, SalExtTipA FROM TXPCEXTSA WHERE EmprCod = ? and SalExtAlb = ? ORDER BY EmprCod, SalExtAlb ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0AKT3", "UPDATE TXPCEXTSA SET SalExtATCU=?, SalExtSerA=?, SalExtTipA=?  WHERE EmprCod = ? AND SalExtAlb = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCEXTSA")
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
            case 1 :
               stmt.setString(1, (String)parms[0], 20);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setString(3, (String)parms[2], 4);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
      }
   }

}

