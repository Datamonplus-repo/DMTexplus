package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ensayosproductos_ins extends GXProcedure
{
   public ensayosproductos_ins( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ensayosproductos_ins.class ), "" );
   }

   public ensayosproductos_ins( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        short aP3 ,
                        String aP4 ,
                        byte aP5 ,
                        java.math.BigDecimal aP6 ,
                        short aP7 ,
                        byte aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             short aP3 ,
                             String aP4 ,
                             byte aP5 ,
                             java.math.BigDecimal aP6 ,
                             short aP7 ,
                             byte aP8 )
   {
      ensayosproductos_ins.this.AV8emprcod = aP0;
      ensayosproductos_ins.this.AV14lb_numero = aP1;
      ensayosproductos_ins.this.AV15lb_opcion = aP2;
      ensayosproductos_ins.this.AV20Lb_LineaPr = aP3;
      ensayosproductos_ins.this.AV11prdnum = aP4;
      ensayosproductos_ins.this.AV12forprdume = aP5;
      ensayosproductos_ins.this.AV21LB_CantP = aP6;
      ensayosproductos_ins.this.AV22Lb_orden = aP7;
      ensayosproductos_ins.this.AV23Lb_PTinP = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /*
         INSERT RECORD ON TABLE TXPENS004

      */
      A396EmprCod = AV8emprcod ;
      A5532Lb_numero = AV14lb_numero ;
      A5555Lb_opcion = AV15lb_opcion ;
      A5560Lb_LineaPr = AV20Lb_LineaPr ;
      A719PrdNum = AV11prdnum ;
      A490ForPrdUMe = AV12forprdume ;
      A5561LB_CantP = AV21LB_CantP ;
      A6059Lb_solup = 0 ;
      A6545Lb_PTinP = AV23Lb_PTinP ;
      A5562Lb_orden = AV22Lb_orden ;
      /* Using cursor P0AEV2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion, Short.valueOf(A5560Lb_LineaPr), A719PrdNum, Byte.valueOf(A490ForPrdUMe), A5561LB_CantP, Short.valueOf(A5562Lb_orden), Integer.valueOf(A6059Lb_solup), Byte.valueOf(A6545Lb_PTinP)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS004");
      if ( (pr_default.getStatus(0) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         /* Optimized UPDATE. */
         /* Using cursor P0AEV3 */
         pr_default.execute(1, new Object[] {Byte.valueOf(AV23Lb_PTinP), Short.valueOf(AV22Lb_orden), AV21LB_CantP, Byte.valueOf(AV12forprdume), AV11prdnum, AV8emprcod, Integer.valueOf(AV14lb_numero), AV15lb_opcion, Short.valueOf(AV20Lb_LineaPr)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS004");
         /* End optimized UPDATE. */
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.ensayosproductos_ins");
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
      A5555Lb_opcion = "" ;
      A719PrdNum = "" ;
      A5561LB_CantP = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.ensayosproductos_ins__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12forprdume ;
   private byte AV23Lb_PTinP ;
   private byte A490ForPrdUMe ;
   private byte A6545Lb_PTinP ;
   private short AV20Lb_LineaPr ;
   private short AV22Lb_orden ;
   private short A5560Lb_LineaPr ;
   private short A5562Lb_orden ;
   private short Gx_err ;
   private int AV14lb_numero ;
   private int GX_INS821 ;
   private int A5532Lb_numero ;
   private int A6059Lb_solup ;
   private java.math.BigDecimal AV21LB_CantP ;
   private java.math.BigDecimal A5561LB_CantP ;
   private String AV8emprcod ;
   private String AV15lb_opcion ;
   private String AV11prdnum ;
   private String A396EmprCod ;
   private String A5555Lb_opcion ;
   private String A719PrdNum ;
   private String Gx_emsg ;
   private IDataStoreProvider pr_default ;
}

final  class ensayosproductos_ins__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0AEV2", "INSERT INTO TXPENS004(EmprCod, Lb_numero, Lb_opcion, Lb_LineaPr, PrdNum, ForPrdUMe, LB_CantP, Lb_orden, Lb_solup, Lb_PTinP) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS004")
         ,new UpdateCursor("P0AEV3", "UPDATE TXPENS004 SET Lb_PTinP=?, Lb_orden=?, LB_CantP=?, ForPrdUMe=?, PrdNum=?  WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? and Lb_LineaPr = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS004")
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
            case 0 :
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
            case 1 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 6);
               stmt.setString(6, (String)parms[5], 3);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
      }
   }

}

