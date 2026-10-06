package app.almacensindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class devoluciontejido_ins_upd extends GXProcedure
{
   public devoluciontejido_ins_upd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( devoluciontejido_ins_upd.class ), "" );
   }

   public devoluciontejido_ins_upd( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int aP2 ,
                        int aP3 ,
                        java.math.BigDecimal aP4 ,
                        int aP5 ,
                        java.math.BigDecimal aP6 ,
                        short aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             int aP3 ,
                             java.math.BigDecimal aP4 ,
                             int aP5 ,
                             java.math.BigDecimal aP6 ,
                             short aP7 )
   {
      devoluciontejido_ins_upd.this.AV8Emprcod = aP0;
      devoluciontejido_ins_upd.this.AV9ALbreccod = aP1;
      devoluciontejido_ins_upd.this.AV15DevCruId = aP2;
      devoluciontejido_ins_upd.this.AV16DevCruPzs = aP3;
      devoluciontejido_ins_upd.this.AV17DevCruUnd = aP4;
      devoluciontejido_ins_upd.this.AV27DevCruPzsold = aP5;
      devoluciontejido_ins_upd.this.AV28DevCruUndold = aP6;
      devoluciontejido_ins_upd.this.AV18devcru = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV31GXLvl2 = (byte)(0) ;
      /* Optimized UPDATE. */
      /* Using cursor P0AID2 */
      pr_default.execute(0, new Object[] {AV28DevCruUndold, AV17DevCruUnd, Integer.valueOf(AV27DevCruPzsold), Integer.valueOf(AV16DevCruPzs), AV8Emprcod, Integer.valueOf(AV15DevCruId), Integer.valueOf(AV9ALbreccod)});
      if ( (pr_default.getStatus(0) != 101) )
      {
         AV31GXLvl2 = (byte)(1) ;
      }
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVCR1");
      /* End optimized UPDATE. */
      if ( AV31GXLvl2 == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPDEVCR1

         */
         A396EmprCod = AV8Emprcod ;
         A11669DevCruId = AV15DevCruId ;
         A44AlbRecCod = AV9ALbreccod ;
         A11684DevCruPzs = AV16DevCruPzs ;
         A11683DevCruUnd = AV17DevCruUnd ;
         /* Using cursor P0AID3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId), Integer.valueOf(A44AlbRecCod), A11683DevCruUnd, Integer.valueOf(A11684DevCruPzs)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVCR1");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
      }
      /* Using cursor P0AID4 */
      pr_default.execute(2, new Object[] {AV8Emprcod, Integer.valueOf(AV9ALbreccod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A44AlbRecCod = P0AID4_A44AlbRecCod[0] ;
         A396EmprCod = P0AID4_A396EmprCod[0] ;
         A54AlbRPieUti = P0AID4_A54AlbRPieUti[0] ;
         A60AlbRUniUti = P0AID4_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = P0AID4_A58AlbRUniEnt[0] ;
         A47AlbREst = P0AID4_A47AlbREst[0] ;
         A54AlbRPieUti = (int)(A54AlbRPieUti+AV16DevCruPzs-AV27DevCruPzsold) ;
         A60AlbRUniUti = A60AlbRUniUti.add(AV17DevCruUnd).subtract(AV28DevCruUndold) ;
         A47AlbREst = (byte)((((A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue()<=0) ? 1 : 0)) ;
         /* Using cursor P0AID5 */
         pr_default.execute(3, new Object[] {Integer.valueOf(A54AlbRPieUti), A60AlbRUniUti, Byte.valueOf(A47AlbREst), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "almacensindetalle.devoluciontejido_ins_upd");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A396EmprCod = "" ;
      A11683DevCruUnd = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      scmdbuf = "" ;
      P0AID4_A44AlbRecCod = new int[1] ;
      P0AID4_A396EmprCod = new String[] {""} ;
      P0AID4_A54AlbRPieUti = new int[1] ;
      P0AID4_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AID4_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AID4_A47AlbREst = new byte[1] ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.devoluciontejido_ins_upd__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P0AID4_A44AlbRecCod, P0AID4_A396EmprCod, P0AID4_A54AlbRPieUti, P0AID4_A60AlbRUniUti, P0AID4_A58AlbRUniEnt, P0AID4_A47AlbREst
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV31GXLvl2 ;
   private byte A47AlbREst ;
   private short AV18devcru ;
   private short Gx_err ;
   private int AV9ALbreccod ;
   private int AV15DevCruId ;
   private int AV16DevCruPzs ;
   private int AV27DevCruPzsold ;
   private int GX_INS1634 ;
   private int A11669DevCruId ;
   private int A44AlbRecCod ;
   private int A11684DevCruPzs ;
   private int A54AlbRPieUti ;
   private java.math.BigDecimal AV17DevCruUnd ;
   private java.math.BigDecimal AV28DevCruUndold ;
   private java.math.BigDecimal A11683DevCruUnd ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private String AV8Emprcod ;
   private String A396EmprCod ;
   private String Gx_emsg ;
   private String scmdbuf ;
   private IDataStoreProvider pr_default ;
   private int[] P0AID4_A44AlbRecCod ;
   private String[] P0AID4_A396EmprCod ;
   private int[] P0AID4_A54AlbRPieUti ;
   private java.math.BigDecimal[] P0AID4_A60AlbRUniUti ;
   private java.math.BigDecimal[] P0AID4_A58AlbRUniEnt ;
   private byte[] P0AID4_A47AlbREst ;
}

final  class devoluciontejido_ins_upd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0AID2", "UPDATE TXPDEVCR1 SET DevCruUnd=DevCruUnd - ? + ?, DevCruPzs=DevCruPzs - ? + ?  WHERE EmprCod = ? and DevCruId = ? and AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDEVCR1")
         ,new UpdateCursor("P0AID3", "INSERT INTO TXPDEVCR1(EmprCod, DevCruId, AlbRecCod, DevCruUnd, DevCruPzs) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDEVCR1")
         ,new ForEachCursor("P0AID4", "SELECT AlbRecCod, EmprCod, AlbRPieUti, AlbRUniUti, AlbRUniEnt, AlbREst FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0AID5", "UPDATE TXPALBREC SET AlbRPieUti=?, AlbRUniUti=?, AlbREst=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
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
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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

