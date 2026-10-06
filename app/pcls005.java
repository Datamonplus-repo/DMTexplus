package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcls005 extends GXProcedure
{
   public pcls005( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcls005.class ), "" );
   }

   public pcls005( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 )
   {
      pcls005.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             String[] aP3 )
   {
      pcls005.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcls005.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      pcls005.this.AV20Exis = aP2[0];
      this.aP2 = aP2;
      pcls005.this.AV19EntLotN = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV22FlagBros ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "BROS  ", ""), GXv_int2) ;
      pcls005.this.GXt_int1 = GXv_int2[0] ;
      AV22FlagBros = GXt_int1 ;
      GXt_int1 = AV23FlagPreMed ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PREMED", ""), GXv_int2) ;
      pcls005.this.GXt_int1 = GXv_int2[0] ;
      AV23FlagPreMed = GXt_int1 ;
      /* Using cursor P055O2 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3915EmpNumDec = P055O2_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P055O2_n3915EmpNumDec[0] ;
         AV18EmpNumDec = A3915EmpNumDec ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV21Exis2 = AV20Exis ;
      AV19EntLotN = " " ;
      /* Using cursor P055O3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A411EntCon = P055O3_A411EntCon[0] ;
         A419EntUniRem = P055O3_A419EntUniRem[0] ;
         A5686EntLotN = P055O3_A5686EntLotN[0] ;
         A415EntFecEnt = P055O3_A415EntFecEnt[0] ;
         A597LinEnt = P055O3_A597LinEnt[0] ;
         if ( DecimalUtil.compareTo(AV20Exis, A419EntUniRem) == 0 )
         {
            AV20Exis = DecimalUtil.doubleToDec(0) ;
            A419EntUniRem = DecimalUtil.doubleToDec(0) ;
            A411EntCon = (byte)(1) ;
            AV19EntLotN = A5686EntLotN ;
         }
         else
         {
            if ( DecimalUtil.compareTo(AV20Exis, A419EntUniRem) < 0 )
            {
               A419EntUniRem = A419EntUniRem.subtract(AV20Exis) ;
               AV20Exis = DecimalUtil.doubleToDec(0) ;
               AV19EntLotN = A5686EntLotN ;
            }
            else
            {
               A411EntCon = (byte)(1) ;
               AV20Exis = AV20Exis.subtract(A419EntUniRem) ;
               A419EntUniRem = DecimalUtil.doubleToDec(0) ;
               AV19EntLotN = A5686EntLotN ;
            }
         }
         if ( AV20Exis.doubleValue() == 0 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            /* Using cursor P055O4 */
            pr_default.execute(2, new Object[] {Byte.valueOf(A411EntCon), A419EntUniRem, A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENTALM");
            if (true) break;
         }
         /* Using cursor P055O5 */
         pr_default.execute(3, new Object[] {Byte.valueOf(A411EntCon), A419EntUniRem, A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENTALM");
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Using cursor P055O6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A719PrdNum});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A724PrdPreAct = P055O6_A724PrdPreAct[0] ;
         A726PrdPreMed = P055O6_A726PrdPreMed[0] ;
         AV25PrdPreAct = A724PrdPreAct ;
         if ( AV23FlagPreMed == 1 )
         {
            AV25PrdPreAct = A726PrdPreMed ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
      /*
         INSERT RECORD ON TABLE TXPCPRDES

      */
      A681PrdAny = (short)(GXutil.year( GXutil.today( ))) ;
      A331DifValConA = DecimalUtil.doubleToDec(0) ;
      n331DifValConA = false ;
      /* Using cursor P055O7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Boolean.valueOf(n331DifValConA), A331DifValConA});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPRDES");
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
         INSERT RECORD ON TABLE TXPLPRDES

      */
      A681PrdAny = (short)(GXutil.year( GXutil.today( ))) ;
      A720PrdNumMes = (byte)(GXutil.month( GXutil.today( ))) ;
      A744PrdUniConM = AV21Exis2 ;
      if ( AV18EmpNumDec == 0 )
      {
         A747PrdValConM = GXutil.roundDecimal( AV25PrdPreAct.multiply(AV21Exis2), 0) ;
      }
      else
      {
         if ( AV18EmpNumDec == 2 )
         {
            A747PrdValConM = GXutil.roundDecimal( AV25PrdPreAct.multiply(AV21Exis2), 2) ;
         }
      }
      /* Using cursor P055O8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Byte.valueOf(A720PrdNumMes), A744PrdUniConM, A747PrdValConM});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRDES");
      if ( (pr_default.getStatus(6) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         /* Using cursor P055O9 */
         pr_default.execute(7, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Byte.valueOf(A720PrdNumMes)});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A396EmprCod = P055O9_A396EmprCod[0] ;
            A719PrdNum = P055O9_A719PrdNum[0] ;
            A681PrdAny = P055O9_A681PrdAny[0] ;
            A720PrdNumMes = P055O9_A720PrdNumMes[0] ;
            A744PrdUniConM = P055O9_A744PrdUniConM[0] ;
            A747PrdValConM = P055O9_A747PrdValConM[0] ;
            A744PrdUniConM = A744PrdUniConM.add(AV21Exis2) ;
            if ( AV18EmpNumDec == 0 )
            {
               A747PrdValConM = A747PrdValConM.add(GXutil.roundDecimal( AV25PrdPreAct.multiply(AV21Exis2), 0)) ;
            }
            else
            {
               if ( AV18EmpNumDec == 2 )
               {
                  A747PrdValConM = A747PrdValConM.add(GXutil.roundDecimal( AV25PrdPreAct.multiply(AV21Exis2), 2)) ;
               }
            }
            /* Using cursor P055O10 */
            pr_default.execute(8, new Object[] {A744PrdUniConM, A747PrdValConM, A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Byte.valueOf(A720PrdNumMes)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRDES");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(7);
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
      this.aP0[0] = pcls005.this.A396EmprCod;
      this.aP1[0] = pcls005.this.A719PrdNum;
      this.aP2[0] = pcls005.this.AV20Exis;
      this.aP3[0] = pcls005.this.AV19EntLotN;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P055O2_A396EmprCod = new String[] {""} ;
      P055O2_A3915EmpNumDec = new byte[1] ;
      P055O2_n3915EmpNumDec = new boolean[] {false} ;
      AV21Exis2 = DecimalUtil.ZERO ;
      P055O3_A396EmprCod = new String[] {""} ;
      P055O3_A719PrdNum = new String[] {""} ;
      P055O3_A411EntCon = new byte[1] ;
      P055O3_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055O3_A5686EntLotN = new String[] {""} ;
      P055O3_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P055O3_A597LinEnt = new short[1] ;
      A419EntUniRem = DecimalUtil.ZERO ;
      A5686EntLotN = "" ;
      A415EntFecEnt = GXutil.nullDate() ;
      P055O6_A396EmprCod = new String[] {""} ;
      P055O6_A719PrdNum = new String[] {""} ;
      P055O6_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055O6_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      AV25PrdPreAct = DecimalUtil.ZERO ;
      A331DifValConA = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      A744PrdUniConM = DecimalUtil.ZERO ;
      A747PrdValConM = DecimalUtil.ZERO ;
      P055O9_A396EmprCod = new String[] {""} ;
      P055O9_A719PrdNum = new String[] {""} ;
      P055O9_A681PrdAny = new short[1] ;
      P055O9_A720PrdNumMes = new byte[1] ;
      P055O9_A744PrdUniConM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055O9_A747PrdValConM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcls005__default(),
         new Object[] {
             new Object[] {
            P055O2_A396EmprCod, P055O2_A3915EmpNumDec, P055O2_n3915EmpNumDec
            }
            , new Object[] {
            P055O3_A396EmprCod, P055O3_A719PrdNum, P055O3_A411EntCon, P055O3_A419EntUniRem, P055O3_A5686EntLotN, P055O3_A415EntFecEnt, P055O3_A597LinEnt
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P055O6_A396EmprCod, P055O6_A719PrdNum, P055O6_A724PrdPreAct, P055O6_A726PrdPreMed
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P055O9_A396EmprCod, P055O9_A719PrdNum, P055O9_A681PrdAny, P055O9_A720PrdNumMes, P055O9_A744PrdUniConM, P055O9_A747PrdValConM
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV22FlagBros ;
   private byte AV23FlagPreMed ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A3915EmpNumDec ;
   private byte AV18EmpNumDec ;
   private byte A411EntCon ;
   private byte A720PrdNumMes ;
   private short A597LinEnt ;
   private short A681PrdAny ;
   private short Gx_err ;
   private int GX_INS80 ;
   private int GX_INS81 ;
   private java.math.BigDecimal AV20Exis ;
   private java.math.BigDecimal AV21Exis2 ;
   private java.math.BigDecimal A419EntUniRem ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal AV25PrdPreAct ;
   private java.math.BigDecimal A331DifValConA ;
   private java.math.BigDecimal A744PrdUniConM ;
   private java.math.BigDecimal A747PrdValConM ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV19EntLotN ;
   private String scmdbuf ;
   private String A5686EntLotN ;
   private String Gx_emsg ;
   private java.util.Date A415EntFecEnt ;
   private boolean n3915EmpNumDec ;
   private boolean n331DifValConA ;
   private String[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P055O2_A396EmprCod ;
   private byte[] P055O2_A3915EmpNumDec ;
   private boolean[] P055O2_n3915EmpNumDec ;
   private String[] P055O3_A396EmprCod ;
   private String[] P055O3_A719PrdNum ;
   private byte[] P055O3_A411EntCon ;
   private java.math.BigDecimal[] P055O3_A419EntUniRem ;
   private String[] P055O3_A5686EntLotN ;
   private java.util.Date[] P055O3_A415EntFecEnt ;
   private short[] P055O3_A597LinEnt ;
   private String[] P055O6_A396EmprCod ;
   private String[] P055O6_A719PrdNum ;
   private java.math.BigDecimal[] P055O6_A724PrdPreAct ;
   private java.math.BigDecimal[] P055O6_A726PrdPreMed ;
   private String[] P055O9_A396EmprCod ;
   private String[] P055O9_A719PrdNum ;
   private short[] P055O9_A681PrdAny ;
   private byte[] P055O9_A720PrdNumMes ;
   private java.math.BigDecimal[] P055O9_A744PrdUniConM ;
   private java.math.BigDecimal[] P055O9_A747PrdValConM ;
}

final  class pcls005__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P055O2", "SELECT EmprCod, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P055O3", "SELECT EmprCod, PrdNum, EntCon, EntUniRem, EntLotN, EntFecEnt, LinEnt FROM TXPENTALM WHERE (EmprCod = ? and PrdNum = ?) AND (EntCon = 0) ORDER BY EmprCod, PrdNum, EntFecEnt  FOR UPDATE OF EntCon, EntUniRem NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P055O4", "UPDATE TXPENTALM SET EntCon=?, EntUniRem=?  WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENTALM")
         ,new UpdateCursor("P055O5", "UPDATE TXPENTALM SET EntCon=?, EntUniRem=?  WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENTALM")
         ,new ForEachCursor("P055O6", "SELECT EmprCod, PrdNum, PrdPreAct, PrdPreMed FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P055O7", "INSERT INTO TXPCPRDES(EmprCod, PrdNum, PrdAny, DifValConA, PrdAcuConA) VALUES(?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPRDES")
         ,new UpdateCursor("P055O8", "INSERT INTO TXPLPRDES(EmprCod, PrdNum, PrdAny, PrdNumMes, PrdUniConM, PrdValConM, PrdUniCprM, PrdValCprM, PrdKilTin, PrdMtrTin) VALUES(?, ?, ?, ?, ?, ?, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRDES")
         ,new ForEachCursor("P055O9", "SELECT EmprCod, PrdNum, PrdAny, PrdNumMes, PrdUniConM, PrdValConM FROM TXPLPRDES WHERE EmprCod = ? and PrdNum = ? and PrdAny = ? and PrdNumMes = ? ORDER BY EmprCod, PrdNum, PrdAny, PrdNumMes  FOR UPDATE OF PrdUniConM, PrdValConM NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P055O10", "UPDATE TXPLPRDES SET PrdUniConM=?, PrdValConM=?  WHERE EmprCod = ? AND PrdNum = ? AND PrdAny = ? AND PrdNumMes = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRDES")
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
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
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
               return;
            case 2 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 3 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 5 :
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
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 4);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 8 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

