package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class palmtin extends GXProcedure
{
   public palmtin( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( palmtin.class ), "" );
   }

   public palmtin( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 )
   {
      palmtin.this.aP3 = new String[] {""};
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
      palmtin.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      palmtin.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      palmtin.this.AV15Exis = aP2[0];
      this.aP2 = aP2;
      palmtin.this.AV24EntLotN = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17FlagBros = (byte)(0) ;
      GXv_int1[0] = AV17FlagBros ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "BROS  ", ""), GXv_int1) ;
      palmtin.this.AV17FlagBros = GXv_int1[0] ;
      AV21FlagPreMed = (byte)(0) ;
      GXv_int1[0] = AV21FlagPreMed ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PREMED", ""), GXv_int1) ;
      palmtin.this.AV21FlagPreMed = GXv_int1[0] ;
      GXv_int1[0] = AV23NCLec ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCLEC", ""), GXv_int1) ;
      palmtin.this.AV23NCLec = GXv_int1[0] ;
      /* Using cursor P004A2 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3915EmpNumDec = P004A2_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P004A2_n3915EmpNumDec[0] ;
         AV22EmpNumDec = A3915EmpNumDec ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV16Exis2 = AV15Exis ;
      AV24EntLotN = " " ;
      /* Using cursor P004A3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A411EntCon = P004A3_A411EntCon[0] ;
         A419EntUniRem = P004A3_A419EntUniRem[0] ;
         A5686EntLotN = P004A3_A5686EntLotN[0] ;
         A415EntFecEnt = P004A3_A415EntFecEnt[0] ;
         A597LinEnt = P004A3_A597LinEnt[0] ;
         if ( DecimalUtil.compareTo(AV15Exis, A419EntUniRem) == 0 )
         {
            AV15Exis = DecimalUtil.doubleToDec(0) ;
            A419EntUniRem = DecimalUtil.doubleToDec(0) ;
            A411EntCon = (byte)(1) ;
            AV24EntLotN = A5686EntLotN ;
         }
         else
         {
            if ( DecimalUtil.compareTo(AV15Exis, A419EntUniRem) < 0 )
            {
               A419EntUniRem = A419EntUniRem.subtract(AV15Exis) ;
               AV15Exis = DecimalUtil.doubleToDec(0) ;
               AV24EntLotN = A5686EntLotN ;
            }
            else
            {
               A411EntCon = (byte)(1) ;
               AV15Exis = AV15Exis.subtract(A419EntUniRem) ;
               A419EntUniRem = DecimalUtil.doubleToDec(0) ;
               AV24EntLotN = A5686EntLotN ;
            }
         }
         if ( AV15Exis.doubleValue() == 0 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            /* Using cursor P004A4 */
            pr_default.execute(2, new Object[] {Byte.valueOf(A411EntCon), A419EntUniRem, A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENTALM");
            if (true) break;
         }
         /* Using cursor P004A5 */
         pr_default.execute(3, new Object[] {Byte.valueOf(A411EntCon), A419EntUniRem, A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENTALM");
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Using cursor P004A6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A719PrdNum});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A724PrdPreAct = P004A6_A724PrdPreAct[0] ;
         A726PrdPreMed = P004A6_A726PrdPreMed[0] ;
         AV20PrdPreAct = A724PrdPreAct ;
         if ( AV21FlagPreMed == 1 )
         {
            AV20PrdPreAct = A726PrdPreMed ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
      if ( ( AV17FlagBros == 1 ) && ( AV15Exis.doubleValue() != 0 ) )
      {
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_int4[0] = AV18LinEnt ;
         new app.plinent(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_int4) ;
         palmtin.this.A396EmprCod = GXv_char2[0] ;
         palmtin.this.A719PrdNum = GXv_char3[0] ;
         palmtin.this.AV18LinEnt = GXv_int4[0] ;
         GXv_char3[0] = A396EmprCod ;
         GXv_char2[0] = A719PrdNum ;
         GXv_int4[0] = AV18LinEnt ;
         GXv_date5[0] = Gx_date ;
         GXv_decimal6[0] = AV15Exis ;
         new app.paltrem(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_int4, GXv_date5, GXv_decimal6) ;
         palmtin.this.A396EmprCod = GXv_char3[0] ;
         palmtin.this.A719PrdNum = GXv_char2[0] ;
         palmtin.this.AV18LinEnt = GXv_int4[0] ;
         palmtin.this.Gx_date = GXv_date5[0] ;
         palmtin.this.AV15Exis = GXv_decimal6[0] ;
      }
      /*
         INSERT RECORD ON TABLE TXPCPRDES

      */
      A681PrdAny = (short)(GXutil.year( GXutil.today( ))) ;
      A331DifValConA = DecimalUtil.doubleToDec(0) ;
      n331DifValConA = false ;
      /* Using cursor P004A7 */
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
      A744PrdUniConM = AV16Exis2 ;
      if ( AV22EmpNumDec == 0 )
      {
         A747PrdValConM = GXutil.roundDecimal( AV20PrdPreAct.multiply(AV16Exis2), 0) ;
      }
      else
      {
         if ( AV22EmpNumDec == 2 )
         {
            A747PrdValConM = GXutil.roundDecimal( AV20PrdPreAct.multiply(AV16Exis2), 2) ;
         }
      }
      /* Using cursor P004A8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Byte.valueOf(A720PrdNumMes), A744PrdUniConM, A747PrdValConM});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRDES");
      if ( (pr_default.getStatus(6) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         /* Using cursor P004A9 */
         pr_default.execute(7, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Byte.valueOf(A720PrdNumMes)});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A396EmprCod = P004A9_A396EmprCod[0] ;
            A719PrdNum = P004A9_A719PrdNum[0] ;
            A681PrdAny = P004A9_A681PrdAny[0] ;
            A720PrdNumMes = P004A9_A720PrdNumMes[0] ;
            A744PrdUniConM = P004A9_A744PrdUniConM[0] ;
            A747PrdValConM = P004A9_A747PrdValConM[0] ;
            A744PrdUniConM = A744PrdUniConM.add(AV16Exis2) ;
            if ( AV22EmpNumDec == 0 )
            {
               A747PrdValConM = A747PrdValConM.add(GXutil.roundDecimal( AV20PrdPreAct.multiply(AV16Exis2), 0)) ;
            }
            else
            {
               if ( AV22EmpNumDec == 2 )
               {
                  A747PrdValConM = A747PrdValConM.add(GXutil.roundDecimal( AV20PrdPreAct.multiply(AV16Exis2), 2)) ;
               }
            }
            /* Using cursor P004A10 */
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
      if ( AV23NCLec == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "palmtin");
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = palmtin.this.A396EmprCod;
      this.aP1[0] = palmtin.this.A719PrdNum;
      this.aP2[0] = palmtin.this.AV15Exis;
      this.aP3[0] = palmtin.this.AV24EntLotN;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      scmdbuf = "" ;
      P004A2_A396EmprCod = new String[] {""} ;
      P004A2_A3915EmpNumDec = new byte[1] ;
      P004A2_n3915EmpNumDec = new boolean[] {false} ;
      AV16Exis2 = DecimalUtil.ZERO ;
      P004A3_A396EmprCod = new String[] {""} ;
      P004A3_A719PrdNum = new String[] {""} ;
      P004A3_A411EntCon = new byte[1] ;
      P004A3_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004A3_A5686EntLotN = new String[] {""} ;
      P004A3_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P004A3_A597LinEnt = new short[1] ;
      A419EntUniRem = DecimalUtil.ZERO ;
      A5686EntLotN = "" ;
      A415EntFecEnt = GXutil.nullDate() ;
      P004A6_A396EmprCod = new String[] {""} ;
      P004A6_A719PrdNum = new String[] {""} ;
      P004A6_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004A6_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      AV20PrdPreAct = DecimalUtil.ZERO ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int4 = new short[1] ;
      Gx_date = GXutil.nullDate() ;
      GXv_date5 = new java.util.Date[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      A331DifValConA = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      A744PrdUniConM = DecimalUtil.ZERO ;
      A747PrdValConM = DecimalUtil.ZERO ;
      P004A9_A396EmprCod = new String[] {""} ;
      P004A9_A719PrdNum = new String[] {""} ;
      P004A9_A681PrdAny = new short[1] ;
      P004A9_A720PrdNumMes = new byte[1] ;
      P004A9_A744PrdUniConM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004A9_A747PrdValConM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.palmtin__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.palmtin__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.palmtin__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.palmtin__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.palmtin__default(),
         new Object[] {
             new Object[] {
            P004A2_A396EmprCod, P004A2_A3915EmpNumDec, P004A2_n3915EmpNumDec
            }
            , new Object[] {
            P004A3_A396EmprCod, P004A3_A719PrdNum, P004A3_A411EntCon, P004A3_A419EntUniRem, P004A3_A5686EntLotN, P004A3_A415EntFecEnt, P004A3_A597LinEnt
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P004A6_A396EmprCod, P004A6_A719PrdNum, P004A6_A724PrdPreAct, P004A6_A726PrdPreMed
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P004A9_A396EmprCod, P004A9_A719PrdNum, P004A9_A681PrdAny, P004A9_A720PrdNumMes, P004A9_A744PrdUniConM, P004A9_A747PrdValConM
            }
            , new Object[] {
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV17FlagBros ;
   private byte AV21FlagPreMed ;
   private byte AV23NCLec ;
   private byte GXv_int1[] ;
   private byte A3915EmpNumDec ;
   private byte AV22EmpNumDec ;
   private byte A411EntCon ;
   private byte A720PrdNumMes ;
   private short A597LinEnt ;
   private short AV18LinEnt ;
   private short GXv_int4[] ;
   private short A681PrdAny ;
   private short Gx_err ;
   private int GX_INS80 ;
   private int GX_INS81 ;
   private java.math.BigDecimal AV15Exis ;
   private java.math.BigDecimal AV16Exis2 ;
   private java.math.BigDecimal A419EntUniRem ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal AV20PrdPreAct ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal A331DifValConA ;
   private java.math.BigDecimal A744PrdUniConM ;
   private java.math.BigDecimal A747PrdValConM ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV24EntLotN ;
   private String scmdbuf ;
   private String A5686EntLotN ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private java.util.Date A415EntFecEnt ;
   private java.util.Date Gx_date ;
   private java.util.Date GXv_date5[] ;
   private boolean n3915EmpNumDec ;
   private boolean n331DifValConA ;
   private String[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P004A2_A396EmprCod ;
   private byte[] P004A2_A3915EmpNumDec ;
   private boolean[] P004A2_n3915EmpNumDec ;
   private String[] P004A3_A396EmprCod ;
   private String[] P004A3_A719PrdNum ;
   private byte[] P004A3_A411EntCon ;
   private java.math.BigDecimal[] P004A3_A419EntUniRem ;
   private String[] P004A3_A5686EntLotN ;
   private java.util.Date[] P004A3_A415EntFecEnt ;
   private short[] P004A3_A597LinEnt ;
   private String[] P004A6_A396EmprCod ;
   private String[] P004A6_A719PrdNum ;
   private java.math.BigDecimal[] P004A6_A724PrdPreAct ;
   private java.math.BigDecimal[] P004A6_A726PrdPreMed ;
   private String[] P004A9_A396EmprCod ;
   private String[] P004A9_A719PrdNum ;
   private short[] P004A9_A681PrdAny ;
   private byte[] P004A9_A720PrdNumMes ;
   private java.math.BigDecimal[] P004A9_A744PrdUniConM ;
   private java.math.BigDecimal[] P004A9_A747PrdValConM ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class palmtin__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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
      return "MODA21";
   }

}

final  class palmtin__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class palmtin__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class palmtin__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class palmtin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P004A2", "SELECT EmprCod, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P004A3", "SELECT EmprCod, PrdNum, EntCon, EntUniRem, EntLotN, EntFecEnt, LinEnt FROM TXPENTALM WHERE (EmprCod = ? and PrdNum = ?) AND (EntCon = 0) ORDER BY EmprCod, PrdNum, EntFecEnt  FOR UPDATE OF EntCon, EntUniRem NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P004A4", "UPDATE TXPENTALM SET EntCon=?, EntUniRem=?  WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENTALM")
         ,new UpdateCursor("P004A5", "UPDATE TXPENTALM SET EntCon=?, EntUniRem=?  WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENTALM")
         ,new ForEachCursor("P004A6", "SELECT EmprCod, PrdNum, PrdPreAct, PrdPreMed FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P004A7", "INSERT INTO TXPCPRDES(EmprCod, PrdNum, PrdAny, DifValConA, PrdAcuConA) VALUES(?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPRDES")
         ,new UpdateCursor("P004A8", "INSERT INTO TXPLPRDES(EmprCod, PrdNum, PrdAny, PrdNumMes, PrdUniConM, PrdValConM, PrdUniCprM, PrdValCprM, PrdKilTin, PrdMtrTin) VALUES(?, ?, ?, ?, ?, ?, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRDES")
         ,new ForEachCursor("P004A9", "SELECT EmprCod, PrdNum, PrdAny, PrdNumMes, PrdUniConM, PrdValConM FROM TXPLPRDES WHERE EmprCod = ? and PrdNum = ? and PrdAny = ? and PrdNumMes = ? ORDER BY EmprCod, PrdNum, PrdAny, PrdNumMes  FOR UPDATE OF PrdUniConM, PrdValConM NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P004A10", "UPDATE TXPLPRDES SET PrdUniConM=?, PrdValConM=?  WHERE EmprCod = ? AND PrdNum = ? AND PrdAny = ? AND PrdNumMes = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRDES")
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

