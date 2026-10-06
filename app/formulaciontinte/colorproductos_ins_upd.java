package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class colorproductos_ins_upd extends GXProcedure
{
   public colorproductos_ins_upd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( colorproductos_ins_upd.class ), "" );
   }

   public colorproductos_ins_upd( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        short aP2 ,
                        String aP3 ,
                        byte aP4 ,
                        java.math.BigDecimal aP5 ,
                        short aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             short aP2 ,
                             String aP3 ,
                             byte aP4 ,
                             java.math.BigDecimal aP5 ,
                             short aP6 )
   {
      colorproductos_ins_upd.this.AV8emprcod = aP0;
      colorproductos_ins_upd.this.AV9fornumcol = aP1;
      colorproductos_ins_upd.this.AV10Collin = aP2;
      colorproductos_ins_upd.this.AV11prdnum = aP3;
      colorproductos_ins_upd.this.AV12forprdume = aP4;
      colorproductos_ins_upd.this.AV13forcan = aP5;
      colorproductos_ins_upd.this.AV14ForPrdNor = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17GXLvl2 = (byte)(0) ;
      /* Optimized UPDATE. */
      /* Using cursor P0AG02 */
      pr_default.execute(0, new Object[] {Short.valueOf(AV14ForPrdNor), AV13forcan, Byte.valueOf(AV12forprdume), AV11prdnum, AV8emprcod, Integer.valueOf(AV9fornumcol), Short.valueOf(AV10Collin)});
      if ( (pr_default.getStatus(0) != 101) )
      {
         AV17GXLvl2 = (byte)(1) ;
      }
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRFOR");
      /* End optimized UPDATE. */
      if ( AV17GXLvl2 == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPLPRFOR

         */
         A396EmprCod = AV8emprcod ;
         A486ForNumCol = AV9fornumcol ;
         A715PrdLin = AV10Collin ;
         A719PrdNum = AV11prdnum ;
         A490ForPrdUMe = AV12forprdume ;
         A487ForPrdCan = AV13forcan ;
         A489ForPrdNor = AV14ForPrdNor ;
         /* Using cursor P0AG03 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A715PrdLin), A719PrdNum, A487ForPrdCan, Byte.valueOf(A490ForPrdUMe), Short.valueOf(A489ForPrdNor)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRFOR");
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
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.colorproductos_ins_upd");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A487ForPrdCan = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.colorproductos_ins_upd__default(),
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
   private byte AV17GXLvl2 ;
   private byte A490ForPrdUMe ;
   private short AV10Collin ;
   private short AV14ForPrdNor ;
   private short A489ForPrdNor ;
   private short A715PrdLin ;
   private short Gx_err ;
   private int AV9fornumcol ;
   private int GX_INS82 ;
   private int A486ForNumCol ;
   private java.math.BigDecimal AV13forcan ;
   private java.math.BigDecimal A487ForPrdCan ;
   private String AV8emprcod ;
   private String AV11prdnum ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private String Gx_emsg ;
   private IDataStoreProvider pr_default ;
}

final  class colorproductos_ins_upd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0AG02", "UPDATE TXPLPRFOR SET ForPrdNor=?, ForPrdCan=?, ForPrdUMe=?, PrdNum=?  WHERE EmprCod = ? and ForNumCol = ? and PrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRFOR")
         ,new UpdateCursor("P0AG03", "INSERT INTO TXPLPRFOR(EmprCod, ForNumCol, PrdLin, PrdNum, ForPrdCan, ForPrdUMe, ForPrdNor) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRFOR")
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 6);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 5);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
      }
   }

}

