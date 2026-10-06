package app.almacensindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class devoluciontejido_del extends GXProcedure
{
   public devoluciontejido_del( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( devoluciontejido_del.class ), "" );
   }

   public devoluciontejido_del( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int aP2 )
   {
      devoluciontejido_del.this.AV8Emprcod = aP0;
      devoluciontejido_del.this.AV9ALbreccod = aP1;
      devoluciontejido_del.this.AV15DevCruId = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P0AIE2 */
      pr_default.execute(0, new Object[] {AV8Emprcod, Integer.valueOf(AV15DevCruId), Integer.valueOf(AV9ALbreccod), AV8Emprcod, Integer.valueOf(AV15DevCruId), Integer.valueOf(AV9ALbreccod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A44AlbRecCod = P0AIE2_A44AlbRecCod[0] ;
         A11669DevCruId = P0AIE2_A11669DevCruId[0] ;
         A396EmprCod = P0AIE2_A396EmprCod[0] ;
         A11684DevCruPzs = P0AIE2_A11684DevCruPzs[0] ;
         A11683DevCruUnd = P0AIE2_A11683DevCruUnd[0] ;
         /* Using cursor P0AIE3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         A54AlbRPieUti = P0AIE3_A54AlbRPieUti[0] ;
         A60AlbRUniUti = P0AIE3_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = P0AIE3_A58AlbRUniEnt[0] ;
         A47AlbREst = P0AIE3_A47AlbREst[0] ;
         A54AlbRPieUti = (int)(A54AlbRPieUti-A11684DevCruPzs) ;
         A60AlbRUniUti = A60AlbRUniUti.subtract(A11683DevCruUnd) ;
         A47AlbREst = (byte)((((A58AlbRUniEnt.subtract(DecimalUtil.doubleToDec(A54AlbRPieUti))).doubleValue()<=0) ? 1 : 0)) ;
         /* Using cursor P0AIE4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId), Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVCR1");
         /* Using cursor P0AIE5 */
         pr_default.execute(3, new Object[] {Integer.valueOf(A54AlbRPieUti), A60AlbRUniUti, Byte.valueOf(A47AlbREst), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "almacensindetalle.devoluciontejido_del");
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
      P0AIE2_A44AlbRecCod = new int[1] ;
      P0AIE2_A11669DevCruId = new int[1] ;
      P0AIE2_A396EmprCod = new String[] {""} ;
      P0AIE2_A11684DevCruPzs = new int[1] ;
      P0AIE2_A11683DevCruUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A396EmprCod = "" ;
      A11683DevCruUnd = DecimalUtil.ZERO ;
      P0AIE3_A54AlbRPieUti = new int[1] ;
      P0AIE3_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AIE3_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AIE3_A47AlbREst = new byte[1] ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.devoluciontejido_del__default(),
         new Object[] {
             new Object[] {
            P0AIE2_A44AlbRecCod, P0AIE2_A11669DevCruId, P0AIE2_A396EmprCod, P0AIE2_A11684DevCruPzs, P0AIE2_A11683DevCruUnd
            }
            , new Object[] {
            P0AIE3_A54AlbRPieUti, P0AIE3_A60AlbRUniUti, P0AIE3_A58AlbRUniEnt, P0AIE3_A47AlbREst
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
   private int AV9ALbreccod ;
   private int AV15DevCruId ;
   private int A44AlbRecCod ;
   private int A11669DevCruId ;
   private int A11684DevCruPzs ;
   private int A54AlbRPieUti ;
   private java.math.BigDecimal A11683DevCruUnd ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private String AV8Emprcod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private IDataStoreProvider pr_default ;
   private int[] P0AIE2_A44AlbRecCod ;
   private int[] P0AIE2_A11669DevCruId ;
   private String[] P0AIE2_A396EmprCod ;
   private int[] P0AIE2_A11684DevCruPzs ;
   private java.math.BigDecimal[] P0AIE2_A11683DevCruUnd ;
   private int[] P0AIE3_A54AlbRPieUti ;
   private java.math.BigDecimal[] P0AIE3_A60AlbRUniUti ;
   private java.math.BigDecimal[] P0AIE3_A58AlbRUniEnt ;
   private byte[] P0AIE3_A47AlbREst ;
}

final  class devoluciontejido_del__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AIE2", "SELECT AlbRecCod, DevCruId, EmprCod, DevCruPzs, DevCruUnd FROM TXPDEVCR1 WHERE (EmprCod = ? AND DevCruId = ? AND AlbRecCod = ?) AND (EmprCod = ? and DevCruId = ? and AlbRecCod = ?) ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AIE3", "SELECT AlbRPieUti, AlbRUniUti, AlbRUniEnt, AlbREst FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0AIE4", "DELETE FROM TXPDEVCR1  WHERE EmprCod = ? AND DevCruId = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDEVCR1")
         ,new UpdateCursor("P0AIE5", "UPDATE TXPALBREC SET AlbRPieUti=?, AlbRUniUti=?, AlbREst=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 3 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
      }
   }

}

