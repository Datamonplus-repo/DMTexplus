package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ensayoscolorantes_ins extends GXProcedure
{
   public ensayoscolorantes_ins( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ensayoscolorantes_ins.class ), "" );
   }

   public ensayoscolorantes_ins( int remoteHandle ,
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
                        byte aP7 ,
                        String aP8 )
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
                             byte aP7 ,
                             String aP8 )
   {
      ensayoscolorantes_ins.this.AV8emprcod = aP0;
      ensayoscolorantes_ins.this.AV14lb_numero = aP1;
      ensayoscolorantes_ins.this.AV15lb_opcion = aP2;
      ensayoscolorantes_ins.this.AV16lb_lineaC = aP3;
      ensayoscolorantes_ins.this.AV11prdnum = aP4;
      ensayoscolorantes_ins.this.AV12forprdume = aP5;
      ensayoscolorantes_ins.this.AV17LB_CantC = aP6;
      ensayoscolorantes_ins.this.AV18Lb_PTinC = aP7;
      ensayoscolorantes_ins.this.AV19Lb_fibra = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /*
         INSERT RECORD ON TABLE TXPENS003

      */
      A396EmprCod = AV8emprcod ;
      A5532Lb_numero = AV14lb_numero ;
      A5555Lb_opcion = AV15lb_opcion ;
      A5557Lb_LineaC = AV16lb_lineaC ;
      A719PrdNum = AV11prdnum ;
      A490ForPrdUMe = AV12forprdume ;
      A5558LB_CantC = AV17LB_CantC ;
      A6058Lb_soluc = 0 ;
      A6544Lb_PTinC = AV18Lb_PTinC ;
      A14096Lb_fibra = AV19Lb_fibra ;
      /* Using cursor P0AEG2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion, Short.valueOf(A5557Lb_LineaC), A719PrdNum, Byte.valueOf(A490ForPrdUMe), A5558LB_CantC, Integer.valueOf(A6058Lb_soluc), Byte.valueOf(A6544Lb_PTinC), A14096Lb_fibra});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS003");
      if ( (pr_default.getStatus(0) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         /* Optimized UPDATE. */
         /* Using cursor P0AEG3 */
         pr_default.execute(1, new Object[] {AV19Lb_fibra, Byte.valueOf(AV18Lb_PTinC), AV17LB_CantC, Byte.valueOf(AV12forprdume), AV11prdnum, AV8emprcod, Integer.valueOf(AV14lb_numero), AV15lb_opcion, Short.valueOf(AV16lb_lineaC)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS003");
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
      Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.ensayoscolorantes_ins");
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
      A5558LB_CantC = DecimalUtil.ZERO ;
      A14096Lb_fibra = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.ensayoscolorantes_ins__default(),
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
   private byte AV18Lb_PTinC ;
   private byte A490ForPrdUMe ;
   private byte A6544Lb_PTinC ;
   private short AV16lb_lineaC ;
   private short A5557Lb_LineaC ;
   private short Gx_err ;
   private int AV14lb_numero ;
   private int GX_INS820 ;
   private int A5532Lb_numero ;
   private int A6058Lb_soluc ;
   private java.math.BigDecimal AV17LB_CantC ;
   private java.math.BigDecimal A5558LB_CantC ;
   private String AV8emprcod ;
   private String AV15lb_opcion ;
   private String AV11prdnum ;
   private String AV19Lb_fibra ;
   private String A396EmprCod ;
   private String A5555Lb_opcion ;
   private String A719PrdNum ;
   private String A14096Lb_fibra ;
   private String Gx_emsg ;
   private IDataStoreProvider pr_default ;
}

final  class ensayoscolorantes_ins__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0AEG2", "INSERT INTO TXPENS003(EmprCod, Lb_numero, Lb_opcion, Lb_LineaC, PrdNum, ForPrdUMe, LB_CantC, Lb_soluc, Lb_PTinC, Lb_fibra) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS003")
         ,new UpdateCursor("P0AEG3", "UPDATE TXPENS003 SET Lb_fibra=?, Lb_PTinC=?, LB_CantC=?, ForPrdUMe=?, PrdNum=?  WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? and Lb_LineaC = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS003")
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
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 4);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 4);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
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

