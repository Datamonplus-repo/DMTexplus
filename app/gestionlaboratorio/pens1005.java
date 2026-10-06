package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pens1005 extends GXProcedure
{
   public pens1005( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pens1005.class ), "" );
   }

   public pens1005( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pens1005.this.aP1 = new int[] {0};
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
      pens1005.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pens1005.this.A5532Lb_numero = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Actualizo ultima opcion en Ens001..", "") );
      /* Using cursor P02LW2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5549Lb_UltOp = P02LW2_A5549Lb_UltOp[0] ;
         A5717Lb_numopu = P02LW2_A5717Lb_numopu[0] ;
         AV8LB_ULTOP = " " ;
         AV9Lb_numopu = (byte)(0) ;
         /* Using cursor P02LW3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A5718Lb_numop = P02LW3_A5718Lb_numop[0] ;
            A5555Lb_opcion = P02LW3_A5555Lb_opcion[0] ;
            AV8LB_ULTOP = A5555Lb_opcion ;
            AV9Lb_numopu = A5718Lb_numop ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         A5549Lb_UltOp = AV8LB_ULTOP ;
         A5717Lb_numopu = AV9Lb_numopu ;
         /* Using cursor P02LW4 */
         pr_default.execute(2, new Object[] {A5549Lb_UltOp, Byte.valueOf(A5717Lb_numopu), A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS001");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pens1005.this.A396EmprCod;
      this.aP1[0] = pens1005.this.A5532Lb_numero;
      Application.commitDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.pens1005");
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
      P02LW2_A396EmprCod = new String[] {""} ;
      P02LW2_A5532Lb_numero = new int[1] ;
      P02LW2_A5549Lb_UltOp = new String[] {""} ;
      P02LW2_A5717Lb_numopu = new byte[1] ;
      A5549Lb_UltOp = "" ;
      AV8LB_ULTOP = "" ;
      P02LW3_A396EmprCod = new String[] {""} ;
      P02LW3_A5532Lb_numero = new int[1] ;
      P02LW3_A5718Lb_numop = new byte[1] ;
      P02LW3_A5555Lb_opcion = new String[] {""} ;
      A5555Lb_opcion = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.pens1005__default(),
         new Object[] {
             new Object[] {
            P02LW2_A396EmprCod, P02LW2_A5532Lb_numero, P02LW2_A5549Lb_UltOp, P02LW2_A5717Lb_numopu
            }
            , new Object[] {
            P02LW3_A396EmprCod, P02LW3_A5532Lb_numero, P02LW3_A5718Lb_numop, P02LW3_A5555Lb_opcion
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A5717Lb_numopu ;
   private byte AV9Lb_numopu ;
   private byte A5718Lb_numop ;
   private short Gx_err ;
   private int A5532Lb_numero ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A5549Lb_UltOp ;
   private String AV8LB_ULTOP ;
   private String A5555Lb_opcion ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P02LW2_A396EmprCod ;
   private int[] P02LW2_A5532Lb_numero ;
   private String[] P02LW2_A5549Lb_UltOp ;
   private byte[] P02LW2_A5717Lb_numopu ;
   private String[] P02LW3_A396EmprCod ;
   private int[] P02LW3_A5532Lb_numero ;
   private byte[] P02LW3_A5718Lb_numop ;
   private String[] P02LW3_A5555Lb_opcion ;
}

final  class pens1005__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02LW2", "SELECT EmprCod, Lb_numero, Lb_UltOp, Lb_numopu FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02LW3", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_numop, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_opcion DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02LW4", "UPDATE TXPENS001 SET Lb_UltOp=?, Lb_numopu=?  WHERE EmprCod = ? AND Lb_numero = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS001")
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
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

