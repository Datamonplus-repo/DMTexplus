package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pens038 extends GXProcedure
{
   public pens038( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pens038.class ), "" );
   }

   public pens038( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pens038.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pens038.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pens038.this.AV10Lb_numero = aP1[0];
      this.aP1 = aP1;
      pens038.this.AV11Lb_opcion = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Lb_lineac = (short)(0) ;
      /* Using cursor P028F2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV10Lb_numero), AV11Lb_opcion});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5532Lb_numero = P028F2_A5532Lb_numero[0] ;
         A5555Lb_opcion = P028F2_A5555Lb_opcion[0] ;
         A5557Lb_LineaC = P028F2_A5557Lb_LineaC[0] ;
         AV8Lb_lineac = A5557Lb_LineaC ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV9LB_LINEAPR = (short)(0) ;
      /* Using cursor P028F3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV10Lb_numero), AV11Lb_opcion});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A5532Lb_numero = P028F3_A5532Lb_numero[0] ;
         A5555Lb_opcion = P028F3_A5555Lb_opcion[0] ;
         A5560Lb_LineaPr = P028F3_A5560Lb_LineaPr[0] ;
         AV9LB_LINEAPR = A5560Lb_LineaPr ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Optimized UPDATE. */
      /* Using cursor P028F4 */
      pr_default.execute(2, new Object[] {Short.valueOf(AV8Lb_lineac), Short.valueOf(AV9LB_LINEAPR), A396EmprCod, Integer.valueOf(AV10Lb_numero), AV11Lb_opcion});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS002");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pens038.this.A396EmprCod;
      this.aP1[0] = pens038.this.AV10Lb_numero;
      this.aP2[0] = pens038.this.AV11Lb_opcion;
      Application.commitDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.pens038");
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
      P028F2_A396EmprCod = new String[] {""} ;
      P028F2_A5532Lb_numero = new int[1] ;
      P028F2_A5555Lb_opcion = new String[] {""} ;
      P028F2_A5557Lb_LineaC = new short[1] ;
      A5555Lb_opcion = "" ;
      P028F3_A396EmprCod = new String[] {""} ;
      P028F3_A5532Lb_numero = new int[1] ;
      P028F3_A5555Lb_opcion = new String[] {""} ;
      P028F3_A5560Lb_LineaPr = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.pens038__default(),
         new Object[] {
             new Object[] {
            P028F2_A396EmprCod, P028F2_A5532Lb_numero, P028F2_A5555Lb_opcion, P028F2_A5557Lb_LineaC
            }
            , new Object[] {
            P028F3_A396EmprCod, P028F3_A5532Lb_numero, P028F3_A5555Lb_opcion, P028F3_A5560Lb_LineaPr
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV8Lb_lineac ;
   private short A5557Lb_LineaC ;
   private short AV9LB_LINEAPR ;
   private short A5560Lb_LineaPr ;
   private short A5556Lb_UltLC ;
   private short A5559Lb_UltlP ;
   private short Gx_err ;
   private int AV10Lb_numero ;
   private int A5532Lb_numero ;
   private String A396EmprCod ;
   private String AV11Lb_opcion ;
   private String scmdbuf ;
   private String A5555Lb_opcion ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P028F2_A396EmprCod ;
   private int[] P028F2_A5532Lb_numero ;
   private String[] P028F2_A5555Lb_opcion ;
   private short[] P028F2_A5557Lb_LineaC ;
   private String[] P028F3_A396EmprCod ;
   private int[] P028F3_A5532Lb_numero ;
   private String[] P028F3_A5555Lb_opcion ;
   private short[] P028F3_A5560Lb_LineaPr ;
}

final  class pens038__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P028F2", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_LineaC FROM TXPENS003 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion, Lb_LineaC DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P028F3", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_LineaPr FROM TXPENS004 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion, Lb_LineaPr DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P028F4", "UPDATE TXPENS002 SET Lb_UltLC=?, Lb_UltlP=?  WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS002")
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
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
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
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 2 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

