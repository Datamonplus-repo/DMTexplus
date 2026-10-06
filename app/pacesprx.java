package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pacesprx extends GXProcedure
{
   public pacesprx( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pacesprx.class ), "" );
   }

   public pacesprx( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             java.util.Date[] aP4 ,
                             int[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 )
   {
      pacesprx.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        java.util.Date[] aP4 ,
                        int[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             java.util.Date[] aP4 ,
                             int[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             String[] aP8 )
   {
      pacesprx.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pacesprx.this.A795PrvNum = aP1[0];
      this.aP1 = aP1;
      pacesprx.this.AV24PrdNum = aP2[0];
      this.aP2 = aP2;
      pacesprx.this.AV25PrdNom = aP3[0];
      this.aP3 = aP3;
      pacesprx.this.AV17Fecha = aP4[0];
      this.aP4 = aP4;
      pacesprx.this.AV18PedCod = aP5[0];
      this.aP5 = aP5;
      pacesprx.this.AV16Unidades = aP6[0];
      this.aP6 = aP6;
      pacesprx.this.AV15Precio = aP7[0];
      this.aP7 = aP7;
      pacesprx.this.AV19Prior = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P029T2 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3915EmpNumDec = P029T2_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P029T2_n3915EmpNumDec[0] ;
         AV21EmpNumDec = A3915EmpNumDec ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV26PrvPAny = (short)(GXutil.year( AV17Fecha)) ;
      AV27PrvPNumL = (byte)(GXutil.month( AV17Fecha)) ;
      AV20FlagEsta = (byte)(0) ;
      /* Using cursor P029T3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum), AV24PrdNum, Short.valueOf(AV26PrvPAny), Byte.valueOf(AV27PrvPNumL)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A6146PrvPAny = P029T3_A6146PrvPAny[0] ;
         A6152PrvPNumL = P029T3_A6152PrvPNumL[0] ;
         A6147PrvPPr = P029T3_A6147PrvPPr[0] ;
         A6153PrvPEstCp0 = P029T3_A6153PrvPEstCp0[0] ;
         n6153PrvPEstCp0 = P029T3_n6153PrvPEstCp0[0] ;
         A6154PrvPEstCp1 = P029T3_A6154PrvPEstCp1[0] ;
         n6154PrvPEstCp1 = P029T3_n6154PrvPEstCp1[0] ;
         AV20FlagEsta = (byte)(1) ;
         if ( GXutil.strcmp(AV19Prior, "0") == 0 )
         {
            if ( AV21EmpNumDec == 0 )
            {
               A6153PrvPEstCp0 = A6153PrvPEstCp0.subtract((GXutil.roundDecimal( AV15Precio.multiply(AV16Unidades), 0))) ;
               n6153PrvPEstCp0 = false ;
            }
            else
            {
               if ( AV21EmpNumDec == 2 )
               {
                  A6153PrvPEstCp0 = A6153PrvPEstCp0.subtract((GXutil.roundDecimal( AV15Precio.multiply(AV16Unidades), 2))) ;
                  n6153PrvPEstCp0 = false ;
               }
            }
         }
         else
         {
            if ( AV21EmpNumDec == 0 )
            {
               A6154PrvPEstCp1 = A6154PrvPEstCp1.subtract((GXutil.roundDecimal( AV15Precio.multiply(AV16Unidades), 0))) ;
               n6154PrvPEstCp1 = false ;
            }
            else
            {
               if ( AV21EmpNumDec == 2 )
               {
                  A6154PrvPEstCp1 = A6154PrvPEstCp1.subtract((GXutil.roundDecimal( AV15Precio.multiply(AV16Unidades), 2))) ;
                  n6154PrvPEstCp1 = false ;
               }
            }
         }
         /* Using cursor P029T4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n6153PrvPEstCp0), A6153PrvPEstCp0, Boolean.valueOf(n6154PrvPEstCp1), A6154PrvPEstCp1, A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(A6146PrvPAny), A6147PrvPPr, Byte.valueOf(A6152PrvPNumL)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRVES1");
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Optimized UPDATE. */
      /* Using cursor P029T5 */
      pr_default.execute(3, new Object[] {AV15Precio, AV16Unidades, A396EmprCod, AV24PrdNum, Integer.valueOf(A795PrvNum), AV17Fecha, AV17Fecha});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINSES1");
      /* End optimized UPDATE. */
      if ( AV20FlagEsta == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPPRVESX

         */
         A6147PrvPPr = AV24PrdNum ;
         A6146PrvPAny = (short)(GXutil.year( AV17Fecha)) ;
         A6148PrvPNom = AV25PrdNom ;
         n6148PrvPNom = false ;
         /* Using cursor P029T6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(A6146PrvPAny), A6147PrvPPr, Boolean.valueOf(n6148PrvPNom), A6148PrvPNom});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRVESX");
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
         /*
            INSERT RECORD ON TABLE TXPPRVES1

         */
         A6152PrvPNumL = (byte)(GXutil.month( AV17Fecha)) ;
         if ( GXutil.strcmp(AV19Prior, "0") == 0 )
         {
            if ( AV21EmpNumDec == 0 )
            {
               A6153PrvPEstCp0 = A6153PrvPEstCp0.subtract((GXutil.roundDecimal( AV15Precio.multiply(AV16Unidades), 0))) ;
               n6153PrvPEstCp0 = false ;
            }
            else
            {
               if ( AV21EmpNumDec == 2 )
               {
                  A6153PrvPEstCp0 = A6153PrvPEstCp0.subtract((GXutil.roundDecimal( AV15Precio.multiply(AV16Unidades), 2))) ;
                  n6153PrvPEstCp0 = false ;
               }
            }
            A6154PrvPEstCp1 = DecimalUtil.doubleToDec(0) ;
            n6154PrvPEstCp1 = false ;
         }
         else
         {
            if ( AV21EmpNumDec == 0 )
            {
               A6154PrvPEstCp1 = A6154PrvPEstCp1.subtract((GXutil.roundDecimal( AV15Precio.multiply(AV16Unidades), 0))) ;
               n6154PrvPEstCp1 = false ;
            }
            else
            {
               if ( AV21EmpNumDec == 2 )
               {
                  A6154PrvPEstCp1 = A6154PrvPEstCp1.subtract((GXutil.roundDecimal( AV15Precio.multiply(AV16Unidades), 2))) ;
                  n6154PrvPEstCp1 = false ;
               }
            }
            A6153PrvPEstCp0 = DecimalUtil.doubleToDec(0) ;
            n6153PrvPEstCp0 = false ;
         }
         /* Using cursor P029T7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(A6146PrvPAny), A6147PrvPPr, Byte.valueOf(A6152PrvPNumL), Boolean.valueOf(n6153PrvPEstCp0), A6153PrvPEstCp0, Boolean.valueOf(n6154PrvPEstCp1), A6154PrvPEstCp1});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRVES1");
         if ( (pr_default.getStatus(5) == 1) )
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
            INSERT RECORD ON TABLE TXPINSEST

         */
         A719PrdNum = AV24PrdNum ;
         A8366PrdAnyo = (short)(GXutil.year( AV17Fecha)) ;
         A8360PrdProv = A795PrvNum ;
         /* Using cursor P029T8 */
         pr_default.execute(6, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A8366PrdAnyo), Integer.valueOf(A8360PrdProv)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINSEST");
         if ( (pr_default.getStatus(6) == 1) )
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
            INSERT RECORD ON TABLE TXPINSES1

         */
         A719PrdNum = AV24PrdNum ;
         A8366PrdAnyo = (short)(GXutil.year( AV17Fecha)) ;
         A8360PrdProv = A795PrvNum ;
         A8363PrdMesL = (byte)(GXutil.month( AV17Fecha)) ;
         A8365PrdUndCnM = A8365PrdUndCnM.subtract((GXutil.roundDecimal( AV15Precio.multiply(AV16Unidades), 2))) ;
         /* Using cursor P029T9 */
         pr_default.execute(7, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A8366PrdAnyo), Integer.valueOf(A8360PrdProv), Byte.valueOf(A8363PrdMesL), A8365PrdUndCnM});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINSES1");
         if ( (pr_default.getStatus(7) == 1) )
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
      this.aP0[0] = pacesprx.this.A396EmprCod;
      this.aP1[0] = pacesprx.this.A795PrvNum;
      this.aP2[0] = pacesprx.this.AV24PrdNum;
      this.aP3[0] = pacesprx.this.AV25PrdNom;
      this.aP4[0] = pacesprx.this.AV17Fecha;
      this.aP5[0] = pacesprx.this.AV18PedCod;
      this.aP6[0] = pacesprx.this.AV16Unidades;
      this.aP7[0] = pacesprx.this.AV15Precio;
      this.aP8[0] = pacesprx.this.AV19Prior;
      Application.commitDataStores(context, remoteHandle, pr_default, "pacesprx");
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
      P029T2_A396EmprCod = new String[] {""} ;
      P029T2_A3915EmpNumDec = new byte[1] ;
      P029T2_n3915EmpNumDec = new boolean[] {false} ;
      P029T3_A396EmprCod = new String[] {""} ;
      P029T3_A795PrvNum = new int[1] ;
      P029T3_A6146PrvPAny = new short[1] ;
      P029T3_A6152PrvPNumL = new byte[1] ;
      P029T3_A6147PrvPPr = new String[] {""} ;
      P029T3_A6153PrvPEstCp0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P029T3_n6153PrvPEstCp0 = new boolean[] {false} ;
      P029T3_A6154PrvPEstCp1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P029T3_n6154PrvPEstCp1 = new boolean[] {false} ;
      A6147PrvPPr = "" ;
      A6153PrvPEstCp0 = DecimalUtil.ZERO ;
      A6154PrvPEstCp1 = DecimalUtil.ZERO ;
      A6148PrvPNom = "" ;
      Gx_emsg = "" ;
      A719PrdNum = "" ;
      A8365PrdUndCnM = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pacesprx__default(),
         new Object[] {
             new Object[] {
            P029T2_A396EmprCod, P029T2_A3915EmpNumDec, P029T2_n3915EmpNumDec
            }
            , new Object[] {
            P029T3_A396EmprCod, P029T3_A795PrvNum, P029T3_A6146PrvPAny, P029T3_A6152PrvPNumL, P029T3_A6147PrvPPr, P029T3_A6153PrvPEstCp0, P029T3_n6153PrvPEstCp0, P029T3_A6154PrvPEstCp1, P029T3_n6154PrvPEstCp1
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
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
   private byte AV27PrvPNumL ;
   private byte AV20FlagEsta ;
   private byte A6152PrvPNumL ;
   private byte A8363PrdMesL ;
   private short AV26PrvPAny ;
   private short A6146PrvPAny ;
   private short Gx_err ;
   private short A8366PrdAnyo ;
   private int A795PrvNum ;
   private int AV18PedCod ;
   private int GX_INS896 ;
   private int GX_INS897 ;
   private int GX_INS1156 ;
   private int A8360PrdProv ;
   private int GX_INS1157 ;
   private java.math.BigDecimal AV16Unidades ;
   private java.math.BigDecimal AV15Precio ;
   private java.math.BigDecimal A6153PrvPEstCp0 ;
   private java.math.BigDecimal A6154PrvPEstCp1 ;
   private java.math.BigDecimal A8365PrdUndCnM ;
   private String A396EmprCod ;
   private String AV24PrdNum ;
   private String AV25PrdNom ;
   private String AV19Prior ;
   private String scmdbuf ;
   private String A6147PrvPPr ;
   private String A6148PrvPNom ;
   private String Gx_emsg ;
   private String A719PrdNum ;
   private java.util.Date AV17Fecha ;
   private boolean n3915EmpNumDec ;
   private boolean n6153PrvPEstCp0 ;
   private boolean n6154PrvPEstCp1 ;
   private boolean n6148PrvPNom ;
   private String[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private java.util.Date[] aP4 ;
   private int[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P029T2_A396EmprCod ;
   private byte[] P029T2_A3915EmpNumDec ;
   private boolean[] P029T2_n3915EmpNumDec ;
   private String[] P029T3_A396EmprCod ;
   private int[] P029T3_A795PrvNum ;
   private short[] P029T3_A6146PrvPAny ;
   private byte[] P029T3_A6152PrvPNumL ;
   private String[] P029T3_A6147PrvPPr ;
   private java.math.BigDecimal[] P029T3_A6153PrvPEstCp0 ;
   private boolean[] P029T3_n6153PrvPEstCp0 ;
   private java.math.BigDecimal[] P029T3_A6154PrvPEstCp1 ;
   private boolean[] P029T3_n6154PrvPEstCp1 ;
}

final  class pacesprx__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P029T2", "SELECT EmprCod, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P029T3", "SELECT EmprCod, PrvNum, PrvPAny, PrvPNumL, PrvPPr, PrvPEstCp0, PrvPEstCp1 FROM TXPPRVES1 WHERE EmprCod = ? and PrvNum = ? and PrvPPr = ? and PrvPAny = ? and PrvPNumL = ? ORDER BY EmprCod, PrvNum, PrvPPr, PrvPAny, PrvPNumL  FOR UPDATE OF PrvPEstCp0, PrvPEstCp1 NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P029T4", "UPDATE TXPPRVES1 SET PrvPEstCp0=?, PrvPEstCp1=?  WHERE EmprCod = ? AND PrvNum = ? AND PrvPAny = ? AND PrvPPr = ? AND PrvPNumL = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRVES1")
         ,new UpdateCursor("P029T5", "UPDATE TXPINSES1 SET PrdUndCnM=PrdUndCnM - ( ROUND(? * CAST(? AS NUMERIC(24,10)), 2))  WHERE (EmprCod = ? and PrdNum = ?) AND (PrdProv = ?) AND (PrdAnyo = EXTRACT(YEAR FROM ?)) AND (PrdMesL = EXTRACT(MONTH FROM ?))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPINSES1")
         ,new UpdateCursor("P029T6", "INSERT INTO TXPPRVESX(EmprCod, PrvNum, PrvPAny, PrvPPr, PrvPNom) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRVESX")
         ,new UpdateCursor("P029T7", "INSERT INTO TXPPRVES1(EmprCod, PrvNum, PrvPAny, PrvPPr, PrvPNumL, PrvPEstCp0, PrvPEstCp1, PrvPDvMes) VALUES(?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRVES1")
         ,new UpdateCursor("P029T8", "INSERT INTO TXPINSEST(EmprCod, PrdNum, PrdAnyo, PrdProv) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPINSEST")
         ,new UpdateCursor("P029T9", "INSERT INTO TXPINSES1(EmprCod, PrdNum, PrdAnyo, PrdProv, PrdMesL, PrdUndCnM, PrdUndCpM) VALUES(?, ?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPINSES1")
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
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
               stmt.setString(6, (String)parms[7], 6);
               stmt.setByte(7, ((Number) parms[8]).byteValue());
               return;
            case 3 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setDate(7, (java.util.Date)parms[6]);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 6);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 26);
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 6);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[6], 2);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[8], 2);
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               return;
      }
   }

}

