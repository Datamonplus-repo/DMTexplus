package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdeldevcru extends GXProcedure
{
   public pdeldevcru( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdeldevcru.class ), "" );
   }

   public pdeldevcru( int remoteHandle ,
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
      pdeldevcru.this.A396EmprCod = aP0;
      pdeldevcru.this.AV31DevCruId = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04PY2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV31DevCruId)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11669DevCruId = P04PY2_A11669DevCruId[0] ;
         /* Using cursor P04PY3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId), A396EmprCod, Integer.valueOf(A11669DevCruId)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A11683DevCruUnd = P04PY3_A11683DevCruUnd[0] ;
            A11684DevCruPzs = P04PY3_A11684DevCruPzs[0] ;
            A44AlbRecCod = P04PY3_A44AlbRecCod[0] ;
            /* Using cursor P04PY4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
            A60AlbRUniUti = P04PY4_A60AlbRUniUti[0] ;
            A54AlbRPieUti = P04PY4_A54AlbRPieUti[0] ;
            A47AlbREst = P04PY4_A47AlbREst[0] ;
            A60AlbRUniUti = A60AlbRUniUti.subtract(A11683DevCruUnd) ;
            A54AlbRPieUti = (int)(A54AlbRPieUti-A11684DevCruPzs) ;
            A47AlbREst = (byte)(0) ;
            /* Using cursor P04PY5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId), Integer.valueOf(A44AlbRecCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVCR1");
            /* Using cursor P04PY6 */
            pr_default.execute(4, new Object[] {A60AlbRUniUti, Integer.valueOf(A54AlbRPieUti), Byte.valueOf(A47AlbREst), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         pr_default.close(2);
         Gx_msg = httpContext.getMessage( "Lineas del documento, Eliminado ¡¡¡", "") ;
         httpContext.GX_msglist.addItem(Gx_msg);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "pdeldevcru");
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
      P04PY2_A396EmprCod = new String[] {""} ;
      P04PY2_A11669DevCruId = new int[1] ;
      P04PY3_A396EmprCod = new String[] {""} ;
      P04PY3_A11669DevCruId = new int[1] ;
      P04PY3_A11683DevCruUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04PY3_A11684DevCruPzs = new int[1] ;
      P04PY3_A44AlbRecCod = new int[1] ;
      A11683DevCruUnd = DecimalUtil.ZERO ;
      P04PY4_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04PY4_A54AlbRPieUti = new int[1] ;
      P04PY4_A47AlbREst = new byte[1] ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdeldevcru__default(),
         new Object[] {
             new Object[] {
            P04PY2_A396EmprCod, P04PY2_A11669DevCruId
            }
            , new Object[] {
            P04PY3_A396EmprCod, P04PY3_A11669DevCruId, P04PY3_A11683DevCruUnd, P04PY3_A11684DevCruPzs, P04PY3_A44AlbRecCod
            }
            , new Object[] {
            P04PY4_A60AlbRUniUti, P04PY4_A54AlbRPieUti, P04PY4_A47AlbREst
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A47AlbREst ;
   private short Gx_err ;
   private int AV31DevCruId ;
   private int A11669DevCruId ;
   private int A11684DevCruPzs ;
   private int A44AlbRecCod ;
   private int A54AlbRPieUti ;
   private java.math.BigDecimal A11683DevCruUnd ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String Gx_msg ;
   private IDataStoreProvider pr_default ;
   private String[] P04PY2_A396EmprCod ;
   private int[] P04PY2_A11669DevCruId ;
   private String[] P04PY3_A396EmprCod ;
   private int[] P04PY3_A11669DevCruId ;
   private java.math.BigDecimal[] P04PY3_A11683DevCruUnd ;
   private int[] P04PY3_A11684DevCruPzs ;
   private int[] P04PY3_A44AlbRecCod ;
   private java.math.BigDecimal[] P04PY4_A60AlbRUniUti ;
   private int[] P04PY4_A54AlbRPieUti ;
   private byte[] P04PY4_A47AlbREst ;
}

final  class pdeldevcru__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04PY2", "SELECT EmprCod, DevCruId FROM TXPDEVCRU WHERE EmprCod = ? and DevCruId = ? ORDER BY EmprCod, DevCruId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04PY3", "SELECT EmprCod, DevCruId, DevCruUnd, DevCruPzs, AlbRecCod FROM TXPDEVCR1 WHERE (EmprCod = ? AND DevCruId = ?) AND (EmprCod = ? and DevCruId = ?) ORDER BY EmprCod, DevCruId, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04PY4", "SELECT AlbRUniUti, AlbRPieUti, AlbREst FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04PY5", "DELETE FROM TXPDEVCR1  WHERE EmprCod = ? AND DevCruId = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDEVCR1")
         ,new UpdateCursor("P04PY6", "UPDATE TXPALBREC SET AlbRUniUti=?, AlbRPieUti=?, AlbREst=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
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
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 4 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
      }
   }

}

