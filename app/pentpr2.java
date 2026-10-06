package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pentpr2 extends GXProcedure
{
   public pentpr2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pentpr2.class ), "" );
   }

   public pentpr2( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        short aP2 ,
                        byte aP3 ,
                        java.math.BigDecimal aP4 ,
                        java.math.BigDecimal aP5 ,
                        java.math.BigDecimal aP6 ,
                        java.util.Date aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             short aP2 ,
                             byte aP3 ,
                             java.math.BigDecimal aP4 ,
                             java.math.BigDecimal aP5 ,
                             java.math.BigDecimal aP6 ,
                             java.util.Date aP7 )
   {
      pentpr2.this.A396EmprCod = aP0;
      pentpr2.this.A719PrdNum = aP1;
      pentpr2.this.A681PrdAny = aP2;
      pentpr2.this.A720PrdNumMes = aP3;
      pentpr2.this.AV17Unidades = aP4;
      pentpr2.this.AV15UniOld = aP5;
      pentpr2.this.AV16Precio = aP6;
      pentpr2.this.AV22FecAct = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV19Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN325_", ""), (byte)(99), GXv_char2) ;
      pentpr2.this.GXt_char1 = GXv_char2[0] ;
      AV19Lit0 = GXt_char1 ;
      GXt_char1 = AV20Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN366_", ""), (byte)(99), GXv_char2) ;
      pentpr2.this.GXt_char1 = GXv_char2[0] ;
      AV20Lit1 = GXt_char1 ;
      GXt_char1 = AV21Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN461_", ""), (byte)(99), GXv_char2) ;
      pentpr2.this.GXt_char1 = GXv_char2[0] ;
      AV21Lit2 = GXt_char1 ;
      System.out.println( httpContext.getMessage( "In pENTPR2", "") );
      /*
         INSERT RECORD ON TABLE TXPCPRDES

      */
      A331DifValConA = DecimalUtil.doubleToDec(0) ;
      n331DifValConA = false ;
      A676PrdAcuConA = AV17Unidades ;
      /* Using cursor P004L2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), A676PrdAcuConA, Boolean.valueOf(n331DifValConA), A331DifValConA});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPRDES");
      if ( (pr_default.getStatus(0) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         /* Optimized UPDATE. */
         /* Using cursor P004L3 */
         pr_default.execute(1, new Object[] {AV17Unidades, AV15UniOld, A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPRDES");
         /* End optimized UPDATE. */
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      /*
         INSERT RECORD ON TABLE TXPLPRDES

      */
      A745PrdUniCprM = DecimalUtil.doubleToDec(0) ;
      A744PrdUniConM = AV17Unidades ;
      A749PrdValCprM = DecimalUtil.doubleToDec(0) ;
      A747PrdValConM = AV16Precio.multiply(AV17Unidades) ;
      /* Using cursor P004L4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Byte.valueOf(A720PrdNumMes), A745PrdUniCprM, A744PrdUniConM, A749PrdValCprM, A747PrdValConM});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRDES");
      if ( (pr_default.getStatus(2) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         /* Optimized UPDATE. */
         /* Using cursor P004L5 */
         pr_default.execute(3, new Object[] {AV16Precio, AV17Unidades, AV15UniOld, AV17Unidades, AV15UniOld, A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Byte.valueOf(A720PrdNumMes)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRDES");
         /* End optimized UPDATE. */
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      AV18Difer = AV17Unidades.subtract(AV15UniOld) ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = A719PrdNum ;
      GXv_decimal4[0] = AV18Difer ;
      GXv_date5[0] = AV22FecAct ;
      new app.pmodrem(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_decimal4, GXv_date5) ;
      pentpr2.this.A396EmprCod = GXv_char2[0] ;
      pentpr2.this.A719PrdNum = GXv_char3[0] ;
      pentpr2.this.AV18Difer = GXv_decimal4[0] ;
      pentpr2.this.AV22FecAct = GXv_date5[0] ;
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "pentpr2");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV19Lit0 = "" ;
      AV20Lit1 = "" ;
      AV21Lit2 = "" ;
      GXt_char1 = "" ;
      A331DifValConA = DecimalUtil.ZERO ;
      A676PrdAcuConA = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      A745PrdUniCprM = DecimalUtil.ZERO ;
      A744PrdUniConM = DecimalUtil.ZERO ;
      A749PrdValCprM = DecimalUtil.ZERO ;
      A747PrdValConM = DecimalUtil.ZERO ;
      AV18Difer = DecimalUtil.ZERO ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_decimal4 = new java.math.BigDecimal[1] ;
      GXv_date5 = new java.util.Date[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pentpr2__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
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

   private byte A720PrdNumMes ;
   private short A681PrdAny ;
   private short Gx_err ;
   private int GX_INS80 ;
   private int GX_INS81 ;
   private java.math.BigDecimal AV17Unidades ;
   private java.math.BigDecimal AV15UniOld ;
   private java.math.BigDecimal AV16Precio ;
   private java.math.BigDecimal A331DifValConA ;
   private java.math.BigDecimal A676PrdAcuConA ;
   private java.math.BigDecimal A745PrdUniCprM ;
   private java.math.BigDecimal A744PrdUniConM ;
   private java.math.BigDecimal A749PrdValCprM ;
   private java.math.BigDecimal A747PrdValConM ;
   private java.math.BigDecimal AV18Difer ;
   private java.math.BigDecimal GXv_decimal4[] ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV19Lit0 ;
   private String AV20Lit1 ;
   private String AV21Lit2 ;
   private String GXt_char1 ;
   private String Gx_emsg ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private java.util.Date AV22FecAct ;
   private java.util.Date GXv_date5[] ;
   private boolean n331DifValConA ;
   private IDataStoreProvider pr_default ;
}

final  class pentpr2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P004L2", "INSERT INTO TXPCPRDES(EmprCod, PrdNum, PrdAny, PrdAcuConA, DifValConA) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPRDES")
         ,new UpdateCursor("P004L3", "UPDATE TXPCPRDES SET PrdAcuConA=PrdAcuConA + ( ? - ?)  WHERE EmprCod = ? and PrdNum = ? and PrdAny = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPRDES")
         ,new UpdateCursor("P004L4", "INSERT INTO TXPLPRDES(EmprCod, PrdNum, PrdAny, PrdNumMes, PrdUniCprM, PrdUniConM, PrdValCprM, PrdValConM, PrdKilTin, PrdMtrTin) VALUES(?, ?, ?, ?, ?, ?, ?, ?, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRDES")
         ,new UpdateCursor("P004L5", "UPDATE TXPLPRDES SET PrdValConM=PrdValConM + ( ? * CAST(( ? - ?) AS NUMERIC(24,10))), PrdUniConM=PrdUniConM + ( ? - ?)  WHERE EmprCod = ? and PrdNum = ? and PrdAny = ? and PrdNumMes = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRDES")
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 4);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
               }
               return;
            case 1 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 4);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               return;
            case 3 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 4);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setString(6, (String)parms[5], 3);
               stmt.setString(7, (String)parms[6], 6);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               return;
      }
   }

}

