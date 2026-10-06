package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class colorcolorantes_ins extends GXProcedure
{
   public colorcolorantes_ins( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( colorcolorantes_ins.class ), "" );
   }

   public colorcolorantes_ins( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        short aP2 ,
                        String aP3 ,
                        byte aP4 ,
                        java.math.BigDecimal aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             short aP2 ,
                             String aP3 ,
                             byte aP4 ,
                             java.math.BigDecimal aP5 )
   {
      colorcolorantes_ins.this.AV8emprcod = aP0;
      colorcolorantes_ins.this.AV9fornumcol = aP1;
      colorcolorantes_ins.this.AV10Collin = aP2;
      colorcolorantes_ins.this.AV11prdnum = aP3;
      colorcolorantes_ins.this.AV12forprdume = aP4;
      colorcolorantes_ins.this.AV13forcan = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /*
         INSERT RECORD ON TABLE TXPLDFORM

      */
      A396EmprCod = AV8emprcod ;
      A486ForNumCol = AV9fornumcol ;
      A309ColLin = AV10Collin ;
      A719PrdNum = AV11prdnum ;
      A490ForPrdUMe = AV12forprdume ;
      A481ForCan = AV13forcan ;
      A838TotLinCol = DecimalUtil.ZERO ;
      A6193ForClaCol = "" ;
      A13926ColFibra = "" ;
      n13926ColFibra = false ;
      /* Using cursor P0AE72 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A309ColLin), A719PrdNum, Byte.valueOf(A490ForPrdUMe), A481ForCan, A838TotLinCol, A6193ForClaCol, Boolean.valueOf(n13926ColFibra), A13926ColFibra});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDFORM");
      if ( (pr_default.getStatus(0) == 1) )
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
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.colorcolorantes_ins");
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
      A719PrdNum = "" ;
      A481ForCan = DecimalUtil.ZERO ;
      A838TotLinCol = DecimalUtil.ZERO ;
      A6193ForClaCol = "" ;
      A13926ColFibra = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.colorcolorantes_ins__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12forprdume ;
   private byte A490ForPrdUMe ;
   private short AV10Collin ;
   private short A309ColLin ;
   private short Gx_err ;
   private int AV9fornumcol ;
   private int GX_INS33 ;
   private int A486ForNumCol ;
   private java.math.BigDecimal AV13forcan ;
   private java.math.BigDecimal A481ForCan ;
   private java.math.BigDecimal A838TotLinCol ;
   private String AV8emprcod ;
   private String AV11prdnum ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A6193ForClaCol ;
   private String A13926ColFibra ;
   private String Gx_emsg ;
   private boolean n13926ColFibra ;
   private IDataStoreProvider pr_default ;
}

final  class colorcolorantes_ins__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0AE72", "INSERT INTO TXPLDFORM(EmprCod, ForNumCol, ColLin, PrdNum, ForPrdUMe, ForCan, TotLinCol, ForClaCol, ColFibra) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLDFORM")
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 6);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 5);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setString(8, (String)parms[7], 16);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[9], 4);
               }
               return;
      }
   }

}

