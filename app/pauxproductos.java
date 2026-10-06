package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pauxproductos extends GXProcedure
{
   public pauxproductos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pauxproductos.class ), "" );
   }

   public pauxproductos( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           short[] aP1 ,
                           int[] aP2 ,
                           String[] aP3 ,
                           String[] aP4 ,
                           java.math.BigDecimal[] aP5 ,
                           byte[] aP6 ,
                           short[] aP7 )
   {
      pauxproductos.this.aP8 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        byte[] aP6 ,
                        short[] aP7 ,
                        byte[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             byte[] aP6 ,
                             short[] aP7 ,
                             byte[] aP8 )
   {
      pauxproductos.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pauxproductos.this.AV13PrdLin = aP1[0];
      this.aP1 = aP1;
      pauxproductos.this.AV14Lb_numero = aP2[0];
      this.aP2 = aP2;
      pauxproductos.this.AV15Lb_opcion = aP3[0];
      this.aP3 = aP3;
      pauxproductos.this.AV8PrdNum = aP4[0];
      this.aP4 = aP4;
      pauxproductos.this.AV9LB_TAAUXCT = aP5[0];
      this.aP5 = aP5;
      pauxproductos.this.AV10FORPRDUME = aP6[0];
      this.aP6 = aP6;
      pauxproductos.this.AV11lb_tauxord = aP7[0];
      this.aP7 = aP7;
      pauxproductos.this.AV17Fibra = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16PrdSolub = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P05ZR2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV8PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P05ZR2_A719PrdNum[0] ;
         A5590PrdSolub = P05ZR2_A5590PrdSolub[0] ;
         AV16PrdSolub = A5590PrdSolub ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /*
         INSERT RECORD ON TABLE TXPENS004

      */
      A5532Lb_numero = AV14Lb_numero ;
      A5555Lb_opcion = AV15Lb_opcion ;
      A5560Lb_LineaPr = AV13PrdLin ;
      A719PrdNum = AV8PrdNum ;
      A5561LB_CantP = AV9LB_TAAUXCT ;
      A490ForPrdUMe = AV10FORPRDUME ;
      A5562Lb_orden = AV11lb_tauxord ;
      A6059Lb_solup = (int)(DecimalUtil.decToDouble(AV16PrdSolub)) ;
      A6545Lb_PTinP = AV17Fibra ;
      /* Using cursor P05ZR3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion, Short.valueOf(A5560Lb_LineaPr), A719PrdNum, Byte.valueOf(A490ForPrdUMe), A5561LB_CantP, Short.valueOf(A5562Lb_orden), Integer.valueOf(A6059Lb_solup), Byte.valueOf(A6545Lb_PTinP)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS004");
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
      Application.commitDataStores(context, remoteHandle, pr_default, "pauxproductos");
      /* Optimized UPDATE. */
      /* Using cursor P05ZR4 */
      short AV13PrdLin5559Aux;
      AV13PrdLin5559Aux = AV13PrdLin ;
      pr_default.execute(2, new Object[] {Short.valueOf(AV13PrdLin5559Aux), A396EmprCod, Integer.valueOf(AV14Lb_numero), AV15Lb_opcion});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS002");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pauxproductos.this.A396EmprCod;
      this.aP1[0] = pauxproductos.this.AV13PrdLin;
      this.aP2[0] = pauxproductos.this.AV14Lb_numero;
      this.aP3[0] = pauxproductos.this.AV15Lb_opcion;
      this.aP4[0] = pauxproductos.this.AV8PrdNum;
      this.aP5[0] = pauxproductos.this.AV9LB_TAAUXCT;
      this.aP6[0] = pauxproductos.this.AV10FORPRDUME;
      this.aP7[0] = pauxproductos.this.AV11lb_tauxord;
      this.aP8[0] = pauxproductos.this.AV17Fibra;
      Application.commitDataStores(context, remoteHandle, pr_default, "pauxproductos");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16PrdSolub = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P05ZR2_A396EmprCod = new String[] {""} ;
      P05ZR2_A719PrdNum = new String[] {""} ;
      P05ZR2_A5590PrdSolub = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A719PrdNum = "" ;
      A5590PrdSolub = DecimalUtil.ZERO ;
      A5555Lb_opcion = "" ;
      A5561LB_CantP = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pauxproductos__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pauxproductos__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pauxproductos__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pauxproductos__default(),
         new Object[] {
             new Object[] {
            P05ZR2_A396EmprCod, P05ZR2_A719PrdNum, P05ZR2_A5590PrdSolub
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

   private byte AV10FORPRDUME ;
   private byte AV17Fibra ;
   private byte A490ForPrdUMe ;
   private byte A6545Lb_PTinP ;
   private short AV13PrdLin ;
   private short AV11lb_tauxord ;
   private short A5560Lb_LineaPr ;
   private short A5562Lb_orden ;
   private short Gx_err ;
   private short A5559Lb_UltlP ;
   private int AV14Lb_numero ;
   private int GX_INS821 ;
   private int A5532Lb_numero ;
   private int A6059Lb_solup ;
   private java.math.BigDecimal AV9LB_TAAUXCT ;
   private java.math.BigDecimal AV16PrdSolub ;
   private java.math.BigDecimal A5590PrdSolub ;
   private java.math.BigDecimal A5561LB_CantP ;
   private String A396EmprCod ;
   private String AV15Lb_opcion ;
   private String AV8PrdNum ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A5555Lb_opcion ;
   private String Gx_emsg ;
   private byte[] aP8 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private int[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private byte[] aP6 ;
   private short[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P05ZR2_A396EmprCod ;
   private String[] P05ZR2_A719PrdNum ;
   private java.math.BigDecimal[] P05ZR2_A5590PrdSolub ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pauxproductos__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class pauxproductos__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class pauxproductos__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class pauxproductos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05ZR2", "SELECT EmprCod, PrdNum, PrdSolub FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05ZR3", "INSERT INTO TXPENS004(EmprCod, Lb_numero, Lb_opcion, Lb_LineaPr, PrdNum, ForPrdUMe, LB_CantP, Lb_orden, Lb_solup, Lb_PTinP) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS004")
         ,new UpdateCursor("P05ZR4", "UPDATE TXPENS002 SET Lb_UltlP=?  WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS002")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 6);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 5);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               return;
            case 2 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

