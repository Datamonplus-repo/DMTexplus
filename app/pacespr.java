package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pacespr extends GXProcedure
{
   public pacespr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pacespr.class ), "" );
   }

   public pacespr( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             java.util.Date[] aP2 ,
                             int[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 )
   {
      pacespr.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        java.util.Date[] aP2 ,
                        int[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             java.util.Date[] aP2 ,
                             int[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             String[] aP6 )
   {
      pacespr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pacespr.this.A795PrvNum = aP1[0];
      this.aP1 = aP1;
      pacespr.this.AV17Fecha = aP2[0];
      this.aP2 = aP2;
      pacespr.this.AV18PedCod = aP3[0];
      this.aP3 = aP3;
      pacespr.this.AV16Unidades = aP4[0];
      this.aP4 = aP4;
      pacespr.this.AV15Precio = aP5[0];
      this.aP5 = aP5;
      pacespr.this.AV19Prior = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P004J2 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3915EmpNumDec = P004J2_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P004J2_n3915EmpNumDec[0] ;
         AV21EmpNumDec = A3915EmpNumDec ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV20FlagEsta = (byte)(0) ;
      AV23PrvAny = (short)(GXutil.year( AV17Fecha)) ;
      AV24PrvNUmlin = (byte)(GXutil.month( AV17Fecha)) ;
      /* Using cursor P004J3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(AV23PrvAny), Byte.valueOf(AV24PrvNUmlin)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A796PrvNumLin = P004J3_A796PrvNumLin[0] ;
         A779PrvAny = P004J3_A779PrvAny[0] ;
         A790PrvEstCm0 = P004J3_A790PrvEstCm0[0] ;
         n790PrvEstCm0 = P004J3_n790PrvEstCm0[0] ;
         A791PrvEstCm1 = P004J3_A791PrvEstCm1[0] ;
         n791PrvEstCm1 = P004J3_n791PrvEstCm1[0] ;
         AV20FlagEsta = (byte)(1) ;
         if ( GXutil.strcmp(AV19Prior, "0") == 0 )
         {
            if ( AV21EmpNumDec == 0 )
            {
               A790PrvEstCm0 = A790PrvEstCm0.subtract(GXutil.roundDecimal( AV15Precio.multiply(AV16Unidades), 0)) ;
               n790PrvEstCm0 = false ;
            }
            else
            {
               if ( AV21EmpNumDec == 2 )
               {
                  A790PrvEstCm0 = A790PrvEstCm0.subtract(GXutil.roundDecimal( AV15Precio.multiply(AV16Unidades), 2)) ;
                  n790PrvEstCm0 = false ;
               }
            }
         }
         else
         {
            if ( AV21EmpNumDec == 0 )
            {
               A791PrvEstCm1 = A791PrvEstCm1.subtract(GXutil.roundDecimal( AV15Precio.multiply(AV16Unidades), 0)) ;
               n791PrvEstCm1 = false ;
            }
            else
            {
               if ( AV21EmpNumDec == 2 )
               {
                  A791PrvEstCm1 = A791PrvEstCm1.subtract(GXutil.roundDecimal( AV15Precio.multiply(AV16Unidades), 2)) ;
                  n791PrvEstCm1 = false ;
               }
            }
         }
         /* Using cursor P004J4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n790PrvEstCm0), A790PrvEstCm0, Boolean.valueOf(n791PrvEstCm1), A791PrvEstCm1, A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(A779PrvAny), Byte.valueOf(A796PrvNumLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRVES");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      System.out.println( "2" );
      if ( AV20FlagEsta == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPCPRVES

         */
         A779PrvAny = (short)(GXutil.year( AV17Fecha)) ;
         A330DifEstCa1 = DecimalUtil.doubleToDec(0) ;
         n330DifEstCa1 = false ;
         /* Using cursor P004J5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(A779PrvAny), Boolean.valueOf(n330DifEstCa1), A330DifEstCa1});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPRVES");
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
            INSERT RECORD ON TABLE TXPLPRVES

         */
         A796PrvNumLin = (byte)(GXutil.month( AV17Fecha)) ;
         if ( GXutil.strcmp(AV19Prior, "0") == 0 )
         {
            if ( AV21EmpNumDec == 0 )
            {
               A790PrvEstCm0 = GXutil.roundDecimal( AV15Precio.multiply(AV16Unidades), 0).negate() ;
               n790PrvEstCm0 = false ;
            }
            else
            {
               if ( AV21EmpNumDec == 2 )
               {
                  A790PrvEstCm0 = GXutil.roundDecimal( AV15Precio.multiply(AV16Unidades), 2).negate() ;
                  n790PrvEstCm0 = false ;
               }
            }
            A791PrvEstCm1 = DecimalUtil.doubleToDec(0) ;
            n791PrvEstCm1 = false ;
         }
         else
         {
            if ( AV21EmpNumDec == 0 )
            {
               A791PrvEstCm1 = GXutil.roundDecimal( AV15Precio.multiply(AV16Unidades), 0).negate() ;
               n791PrvEstCm1 = false ;
            }
            else
            {
               if ( AV21EmpNumDec == 2 )
               {
                  A791PrvEstCm1 = GXutil.roundDecimal( AV15Precio.multiply(AV16Unidades), 2).negate() ;
                  n791PrvEstCm1 = false ;
               }
            }
            A790PrvEstCm0 = DecimalUtil.doubleToDec(0) ;
            n790PrvEstCm0 = false ;
         }
         /* Using cursor P004J6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(A779PrvAny), Byte.valueOf(A796PrvNumLin), Boolean.valueOf(n790PrvEstCm0), A790PrvEstCm0, Boolean.valueOf(n791PrvEstCm1), A791PrvEstCm1});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRVES");
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
      this.aP0[0] = pacespr.this.A396EmprCod;
      this.aP1[0] = pacespr.this.A795PrvNum;
      this.aP2[0] = pacespr.this.AV17Fecha;
      this.aP3[0] = pacespr.this.AV18PedCod;
      this.aP4[0] = pacespr.this.AV16Unidades;
      this.aP5[0] = pacespr.this.AV15Precio;
      this.aP6[0] = pacespr.this.AV19Prior;
      Application.commitDataStores(context, remoteHandle, pr_default, "pacespr");
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
      P004J2_A396EmprCod = new String[] {""} ;
      P004J2_A3915EmpNumDec = new byte[1] ;
      P004J2_n3915EmpNumDec = new boolean[] {false} ;
      P004J3_A396EmprCod = new String[] {""} ;
      P004J3_A795PrvNum = new int[1] ;
      P004J3_A796PrvNumLin = new byte[1] ;
      P004J3_A779PrvAny = new short[1] ;
      P004J3_A790PrvEstCm0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004J3_n790PrvEstCm0 = new boolean[] {false} ;
      P004J3_A791PrvEstCm1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004J3_n791PrvEstCm1 = new boolean[] {false} ;
      A790PrvEstCm0 = DecimalUtil.ZERO ;
      A791PrvEstCm1 = DecimalUtil.ZERO ;
      A330DifEstCa1 = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pacespr__default(),
         new Object[] {
             new Object[] {
            P004J2_A396EmprCod, P004J2_A3915EmpNumDec, P004J2_n3915EmpNumDec
            }
            , new Object[] {
            P004J3_A396EmprCod, P004J3_A795PrvNum, P004J3_A796PrvNumLin, P004J3_A779PrvAny, P004J3_A790PrvEstCm0, P004J3_n790PrvEstCm0, P004J3_A791PrvEstCm1, P004J3_n791PrvEstCm1
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
   private byte AV21EmpNumDec ;
   private byte AV20FlagEsta ;
   private byte AV24PrvNUmlin ;
   private byte A796PrvNumLin ;
   private short AV23PrvAny ;
   private short A779PrvAny ;
   private short Gx_err ;
   private int A795PrvNum ;
   private int AV18PedCod ;
   private int GX_INS92 ;
   private int GX_INS93 ;
   private java.math.BigDecimal AV16Unidades ;
   private java.math.BigDecimal AV15Precio ;
   private java.math.BigDecimal A790PrvEstCm0 ;
   private java.math.BigDecimal A791PrvEstCm1 ;
   private java.math.BigDecimal A330DifEstCa1 ;
   private String A396EmprCod ;
   private String AV19Prior ;
   private String scmdbuf ;
   private String Gx_emsg ;
   private java.util.Date AV17Fecha ;
   private boolean n3915EmpNumDec ;
   private boolean n790PrvEstCm0 ;
   private boolean n791PrvEstCm1 ;
   private boolean n330DifEstCa1 ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private java.util.Date[] aP2 ;
   private int[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P004J2_A396EmprCod ;
   private byte[] P004J2_A3915EmpNumDec ;
   private boolean[] P004J2_n3915EmpNumDec ;
   private String[] P004J3_A396EmprCod ;
   private int[] P004J3_A795PrvNum ;
   private byte[] P004J3_A796PrvNumLin ;
   private short[] P004J3_A779PrvAny ;
   private java.math.BigDecimal[] P004J3_A790PrvEstCm0 ;
   private boolean[] P004J3_n790PrvEstCm0 ;
   private java.math.BigDecimal[] P004J3_A791PrvEstCm1 ;
   private boolean[] P004J3_n791PrvEstCm1 ;
}

final  class pacespr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P004J2", "SELECT EmprCod, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P004J3", "SELECT EmprCod, PrvNum, PrvNumLin, PrvAny, PrvEstCm0, PrvEstCm1 FROM TXPLPRVES WHERE EmprCod = ? and PrvNum = ? and PrvAny = ? and PrvNumLin = ? ORDER BY EmprCod, PrvNum, PrvAny, PrvNumLin  FOR UPDATE OF PrvEstCm0, PrvEstCm1 NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P004J4", "UPDATE TXPLPRVES SET PrvEstCm0=?, PrvEstCm1=?  WHERE EmprCod = ? AND PrvNum = ? AND PrvAny = ? AND PrvNumLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRVES")
         ,new UpdateCursor("P004J5", "INSERT INTO TXPCPRVES(EmprCod, PrvNum, PrvAny, DifEstCa1) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPRVES")
         ,new UpdateCursor("P004J6", "INSERT INTO TXPLPRVES(EmprCod, PrvNum, PrvAny, PrvNumLin, PrvEstCm0, PrvEstCm1, PrvDevMes) VALUES(?, ?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRVES")
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setShort(5, ((Number) parms[6]).shortValue());
               stmt.setByte(6, ((Number) parms[7]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[7], 2);
               }
               return;
      }
   }

}

