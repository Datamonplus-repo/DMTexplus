package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pacespd extends GXProcedure
{
   public pacespd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pacespd.class ), "" );
   }

   public pacespd( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           String[] aP1 ,
                                           java.util.Date[] aP2 ,
                                           java.math.BigDecimal[] aP3 )
   {
      pacespd.this.aP4 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.util.Date[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.math.BigDecimal[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 )
   {
      pacespd.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pacespd.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      pacespd.this.AV17Fecha = aP2[0];
      this.aP2 = aP2;
      pacespd.this.AV16Unidades = aP3[0];
      this.aP3 = aP3;
      pacespd.this.AV15Precio = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P004K2 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3915EmpNumDec = P004K2_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P004K2_n3915EmpNumDec[0] ;
         AV19EmpNumDec = A3915EmpNumDec ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV18FlagEst = (byte)(0) ;
      AV20Prvany = (short)(GXutil.year( AV17Fecha)) ;
      AV21PrvNumlin = (byte)(GXutil.month( AV17Fecha)) ;
      /* Using cursor P004K3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(AV20Prvany), Byte.valueOf(AV21PrvNumlin)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A720PrdNumMes = P004K3_A720PrdNumMes[0] ;
         A681PrdAny = P004K3_A681PrdAny[0] ;
         A745PrdUniCprM = P004K3_A745PrdUniCprM[0] ;
         A749PrdValCprM = P004K3_A749PrdValCprM[0] ;
         AV18FlagEst = (byte)(1) ;
         A745PrdUniCprM = A745PrdUniCprM.subtract(AV16Unidades) ;
         if ( AV19EmpNumDec == 0 )
         {
            A749PrdValCprM = A749PrdValCprM.subtract(GXutil.roundDecimal( AV15Precio.multiply(AV16Unidades), 2)) ;
         }
         else
         {
            if ( AV19EmpNumDec == 2 )
            {
               A749PrdValCprM = A749PrdValCprM.subtract(GXutil.roundDecimal( AV15Precio.multiply(AV16Unidades), 2)) ;
            }
         }
         /* Using cursor P004K4 */
         pr_default.execute(2, new Object[] {A745PrdUniCprM, A749PrdValCprM, A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Byte.valueOf(A720PrdNumMes)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRDES");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( AV18FlagEst == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPCPRDES

         */
         A681PrdAny = (short)(GXutil.year( AV17Fecha)) ;
         A331DifValConA = DecimalUtil.doubleToDec(0) ;
         n331DifValConA = false ;
         /* Using cursor P004K5 */
         pr_default.execute(3, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Boolean.valueOf(n331DifValConA), A331DifValConA});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPRDES");
         if ( (pr_default.getStatus(3) == 1) )
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
         /*
            INSERT RECORD ON TABLE TXPLPRDES

         */
         A681PrdAny = (short)(GXutil.year( AV17Fecha)) ;
         A720PrdNumMes = (byte)(GXutil.month( AV17Fecha)) ;
         A745PrdUniCprM = AV16Unidades.negate() ;
         A744PrdUniConM = DecimalUtil.doubleToDec(0) ;
         if ( AV19EmpNumDec == 0 )
         {
            A749PrdValCprM = GXutil.roundDecimal( AV15Precio.multiply(AV16Unidades), 0).negate() ;
         }
         else
         {
            if ( AV19EmpNumDec == 2 )
            {
               A749PrdValCprM = GXutil.roundDecimal( AV15Precio.multiply(AV16Unidades), 2).negate() ;
            }
         }
         A747PrdValConM = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P004K6 */
         pr_default.execute(4, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Byte.valueOf(A720PrdNumMes), A745PrdUniCprM, A744PrdUniConM, A749PrdValCprM, A747PrdValConM});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRDES");
         if ( (pr_default.getStatus(4) == 1) )
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
      this.aP0[0] = pacespd.this.A396EmprCod;
      this.aP1[0] = pacespd.this.A719PrdNum;
      this.aP2[0] = pacespd.this.AV17Fecha;
      this.aP3[0] = pacespd.this.AV16Unidades;
      this.aP4[0] = pacespd.this.AV15Precio;
      Application.commitDataStores(context, remoteHandle, pr_default, "pacespd");
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
      P004K2_A396EmprCod = new String[] {""} ;
      P004K2_A3915EmpNumDec = new byte[1] ;
      P004K2_n3915EmpNumDec = new boolean[] {false} ;
      P004K3_A396EmprCod = new String[] {""} ;
      P004K3_A719PrdNum = new String[] {""} ;
      P004K3_A720PrdNumMes = new byte[1] ;
      P004K3_A681PrdAny = new short[1] ;
      P004K3_A745PrdUniCprM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004K3_A749PrdValCprM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A745PrdUniCprM = DecimalUtil.ZERO ;
      A749PrdValCprM = DecimalUtil.ZERO ;
      A331DifValConA = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      A744PrdUniConM = DecimalUtil.ZERO ;
      A747PrdValConM = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pacespd__default(),
         new Object[] {
             new Object[] {
            P004K2_A396EmprCod, P004K2_A3915EmpNumDec, P004K2_n3915EmpNumDec
            }
            , new Object[] {
            P004K3_A396EmprCod, P004K3_A719PrdNum, P004K3_A720PrdNumMes, P004K3_A681PrdAny, P004K3_A745PrdUniCprM, P004K3_A749PrdValCprM
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

   private byte A3915EmpNumDec ;
   private byte AV19EmpNumDec ;
   private byte AV18FlagEst ;
   private byte AV21PrvNumlin ;
   private byte A720PrdNumMes ;
   private short AV20Prvany ;
   private short A681PrdAny ;
   private short Gx_err ;
   private int GX_INS80 ;
   private int GX_INS81 ;
   private java.math.BigDecimal AV16Unidades ;
   private java.math.BigDecimal AV15Precio ;
   private java.math.BigDecimal A745PrdUniCprM ;
   private java.math.BigDecimal A749PrdValCprM ;
   private java.math.BigDecimal A331DifValConA ;
   private java.math.BigDecimal A744PrdUniConM ;
   private java.math.BigDecimal A747PrdValConM ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String scmdbuf ;
   private String Gx_emsg ;
   private java.util.Date AV17Fecha ;
   private boolean n3915EmpNumDec ;
   private boolean n331DifValConA ;
   private java.math.BigDecimal[] aP4 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.util.Date[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P004K2_A396EmprCod ;
   private byte[] P004K2_A3915EmpNumDec ;
   private boolean[] P004K2_n3915EmpNumDec ;
   private String[] P004K3_A396EmprCod ;
   private String[] P004K3_A719PrdNum ;
   private byte[] P004K3_A720PrdNumMes ;
   private short[] P004K3_A681PrdAny ;
   private java.math.BigDecimal[] P004K3_A745PrdUniCprM ;
   private java.math.BigDecimal[] P004K3_A749PrdValCprM ;
}

final  class pacespd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P004K2", "SELECT EmprCod, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P004K3", "SELECT EmprCod, PrdNum, PrdNumMes, PrdAny, PrdUniCprM, PrdValCprM FROM TXPLPRDES WHERE EmprCod = ? and PrdNum = ? and PrdAny = ? and PrdNumMes = ? ORDER BY EmprCod, PrdNum, PrdAny, PrdNumMes  FOR UPDATE OF PrdUniCprM, PrdValCprM NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P004K4", "UPDATE TXPLPRDES SET PrdUniCprM=?, PrdValCprM=?  WHERE EmprCod = ? AND PrdNum = ? AND PrdAny = ? AND PrdNumMes = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRDES")
         ,new UpdateCursor("P004K5", "INSERT INTO TXPCPRDES(EmprCod, PrdNum, PrdAny, DifValConA, PrdAcuConA) VALUES(?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPRDES")
         ,new UpdateCursor("P004K6", "INSERT INTO TXPLPRDES(EmprCod, PrdNum, PrdAny, PrdNumMes, PrdUniCprM, PrdUniConM, PrdValCprM, PrdValConM, PrdKilTin, PrdMtrTin) VALUES(?, ?, ?, ?, ?, ?, ?, ?, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRDES")
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 2 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 4);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               return;
      }
   }

}

