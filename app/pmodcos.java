package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmodcos extends GXProcedure
{
   public pmodcos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmodcos.class ), "" );
   }

   public pmodcos( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             String[] aP6 ,
                             short[] aP7 )
   {
      pmodcos.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        String[] aP6 ,
                        short[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             String[] aP6 ,
                             short[] aP7 ,
                             String[] aP8 )
   {
      pmodcos.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmodcos.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pmodcos.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pmodcos.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pmodcos.this.AV15CosPro = aP4[0];
      this.aP4 = aP4;
      pmodcos.this.AV16CosAny = aP5[0];
      this.aP5 = aP5;
      pmodcos.this.AV17MaqCod = aP6[0];
      this.aP6 = aP6;
      pmodcos.this.AV18Anyadi = aP7[0];
      this.aP7 = aP7;
      pmodcos.this.AV19CieCerAny = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = (byte)(DecimalUtil.decToDouble(AV24Nclec)) ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCLEC", ""), GXv_int1) ;
      pmodcos.this.AV24Nclec = DecimalUtil.doubleToDec(GXv_int1[0]) ;
      GXv_int1[0] = AV20FlagFT ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FECTIN", ""), GXv_int1) ;
      pmodcos.this.AV20FlagFT = GXv_int1[0] ;
      GXv_int1[0] = AV21FlagMB ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MABERA", ""), GXv_int1) ;
      pmodcos.this.AV21FlagMB = GXv_int1[0] ;
      /* Using cursor P004B2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A148BarEstReo = P004B2_A148BarEstReo[0] ;
         A141BarCosPro = P004B2_A141BarCosPro[0] ;
         A140BarCosAny = P004B2_A140BarCosAny[0] ;
         A213BarSit = P004B2_A213BarSit[0] ;
         A180BarMaqCod = P004B2_A180BarMaqCod[0] ;
         A189BarNumAny = P004B2_A189BarNumAny[0] ;
         A2448BarFecEnR = P004B2_A2448BarFecEnR[0] ;
         n2448BarFecEnR = P004B2_n2448BarFecEnR[0] ;
         A3871BarFecCRe = P004B2_A3871BarFecCRe[0] ;
         /* Using cursor P004B3 */
         pr_default.execute(1, new Object[] {A396EmprCod});
         A3915EmpNumDec = P004B3_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P004B3_n3915EmpNumDec[0] ;
         /* Using cursor P004B5 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(2) != 101) )
         {
            A219BarTotAgr = P004B5_A219BarTotAgr[0] ;
            n219BarTotAgr = P004B5_n219BarTotAgr[0] ;
         }
         else
         {
            A219BarTotAgr = DecimalUtil.doubleToDec(0) ;
            n219BarTotAgr = false ;
         }
         /* Using cursor P004B7 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(3) != 101) )
         {
            A166BarKgm = P004B7_A166BarKgm[0] ;
            n166BarKgm = P004B7_n166BarKgm[0] ;
         }
         else
         {
            A166BarKgm = DecimalUtil.doubleToDec(0) ;
            n166BarKgm = false ;
         }
         if ( A219BarTotAgr.doubleValue() != 0 )
         {
            A812RecTotKgm = A219BarTotAgr.add(A166BarKgm) ;
         }
         else
         {
            A812RecTotKgm = A166BarKgm ;
         }
         if ( ( A148BarEstReo == 1 ) || ( GXutil.strcmp(AV19CieCerAny, httpContext.getMessage( "S", "")) == 0 ) )
         {
            if ( A3915EmpNumDec == 0 )
            {
               if ( A812RecTotKgm.doubleValue() > 0 )
               {
                  A141BarCosPro = A141BarCosPro.add((A166BarKgm.multiply(AV15CosPro).divide(A812RecTotKgm, 18, java.math.RoundingMode.DOWN))) ;
                  A140BarCosAny = A140BarCosAny.add((A166BarKgm.multiply(AV16CosAny).divide(A812RecTotKgm, 18, java.math.RoundingMode.DOWN))) ;
               }
               else
               {
                  A141BarCosPro = DecimalUtil.doubleToDec(0) ;
                  A140BarCosAny = DecimalUtil.doubleToDec(0) ;
               }
            }
            else
            {
               if ( A3915EmpNumDec == 2 )
               {
                  if ( A812RecTotKgm.doubleValue() > 0 )
                  {
                     A141BarCosPro = A141BarCosPro.add(GXutil.roundDecimal( (A166BarKgm.multiply(AV15CosPro).divide(A812RecTotKgm, 18, java.math.RoundingMode.DOWN)), 2)) ;
                     A140BarCosAny = A140BarCosAny.add(GXutil.roundDecimal( (A166BarKgm.multiply(AV16CosAny).divide(A812RecTotKgm, 18, java.math.RoundingMode.DOWN)), 2)) ;
                  }
                  else
                  {
                     A141BarCosPro = DecimalUtil.doubleToDec(0) ;
                     A140BarCosAny = DecimalUtil.doubleToDec(0) ;
                  }
               }
            }
         }
         else
         {
            if ( A3915EmpNumDec == 0 )
            {
               if ( A812RecTotKgm.doubleValue() > 0 )
               {
                  A141BarCosPro = A166BarKgm.multiply(AV15CosPro).divide(A812RecTotKgm, 18, java.math.RoundingMode.DOWN) ;
                  A140BarCosAny = A166BarKgm.multiply(AV16CosAny).divide(A812RecTotKgm, 18, java.math.RoundingMode.DOWN) ;
               }
               else
               {
                  A141BarCosPro = DecimalUtil.doubleToDec(0) ;
                  A140BarCosAny = DecimalUtil.doubleToDec(0) ;
               }
            }
            else
            {
               if ( A3915EmpNumDec == 2 )
               {
                  if ( A812RecTotKgm.doubleValue() > 0 )
                  {
                     A141BarCosPro = GXutil.roundDecimal( A166BarKgm.multiply(AV15CosPro).divide(A812RecTotKgm, 18, java.math.RoundingMode.DOWN), 2) ;
                     A140BarCosAny = GXutil.roundDecimal( A166BarKgm.multiply(AV16CosAny).divide(A812RecTotKgm, 18, java.math.RoundingMode.DOWN), 2) ;
                  }
                  else
                  {
                     A141BarCosPro = DecimalUtil.doubleToDec(0) ;
                     A140BarCosAny = DecimalUtil.doubleToDec(0) ;
                  }
               }
            }
         }
         if ( A213BarSit < 5 )
         {
            A213BarSit = (byte)(5) ;
         }
         A180BarMaqCod = AV17MaqCod ;
         A189BarNumAny = AV18Anyadi ;
         if ( AV20FlagFT == 1 )
         {
            A2448BarFecEnR = Gx_date ;
            n2448BarFecEnR = false ;
         }
         if ( AV21FlagMB == 1 )
         {
            A3871BarFecCRe = Gx_date ;
         }
         /* Using cursor P004B8 */
         pr_default.execute(4, new Object[] {A141BarCosPro, A140BarCosAny, Byte.valueOf(A213BarSit), A180BarMaqCod, Short.valueOf(A189BarNumAny), Boolean.valueOf(n2448BarFecEnR), A2448BarFecEnR, A3871BarFecCRe, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      pr_default.close(1);
      pr_default.close(2);
      pr_default.close(3);
      if ( AV24Nclec.doubleValue() == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pmodcos");
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmodcos.this.A396EmprCod;
      this.aP1[0] = pmodcos.this.A129BarCod;
      this.aP2[0] = pmodcos.this.A132BarCodReo;
      this.aP3[0] = pmodcos.this.A130BarCodPar;
      this.aP4[0] = pmodcos.this.AV15CosPro;
      this.aP5[0] = pmodcos.this.AV16CosAny;
      this.aP6[0] = pmodcos.this.AV17MaqCod;
      this.aP7[0] = pmodcos.this.AV18Anyadi;
      this.aP8[0] = pmodcos.this.AV19CieCerAny;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV24Nclec = DecimalUtil.ZERO ;
      GXv_int1 = new byte[1] ;
      scmdbuf = "" ;
      P004B2_A396EmprCod = new String[] {""} ;
      P004B2_A129BarCod = new int[1] ;
      P004B2_A132BarCodReo = new byte[1] ;
      P004B2_A130BarCodPar = new String[] {""} ;
      P004B2_A148BarEstReo = new byte[1] ;
      P004B2_A141BarCosPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004B2_A140BarCosAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004B2_A213BarSit = new byte[1] ;
      P004B2_A180BarMaqCod = new String[] {""} ;
      P004B2_A189BarNumAny = new short[1] ;
      P004B2_A2448BarFecEnR = new java.util.Date[] {GXutil.nullDate()} ;
      P004B2_n2448BarFecEnR = new boolean[] {false} ;
      P004B2_A3871BarFecCRe = new java.util.Date[] {GXutil.nullDate()} ;
      A141BarCosPro = DecimalUtil.ZERO ;
      A140BarCosAny = DecimalUtil.ZERO ;
      A180BarMaqCod = "" ;
      A2448BarFecEnR = GXutil.nullDate() ;
      A3871BarFecCRe = GXutil.nullDate() ;
      P004B3_A3915EmpNumDec = new byte[1] ;
      P004B3_n3915EmpNumDec = new boolean[] {false} ;
      P004B5_A219BarTotAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004B5_n219BarTotAgr = new boolean[] {false} ;
      A219BarTotAgr = DecimalUtil.ZERO ;
      P004B7_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004B7_n166BarKgm = new boolean[] {false} ;
      A166BarKgm = DecimalUtil.ZERO ;
      A812RecTotKgm = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.pmodcos__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pmodcos__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pmodcos__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pmodcos__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmodcos__default(),
         new Object[] {
             new Object[] {
            P004B2_A396EmprCod, P004B2_A129BarCod, P004B2_A132BarCodReo, P004B2_A130BarCodPar, P004B2_A148BarEstReo, P004B2_A141BarCosPro, P004B2_A140BarCosAny, P004B2_A213BarSit, P004B2_A180BarMaqCod, P004B2_A189BarNumAny,
            P004B2_A2448BarFecEnR, P004B2_n2448BarFecEnR, P004B2_A3871BarFecCRe
            }
            , new Object[] {
            P004B3_A3915EmpNumDec, P004B3_n3915EmpNumDec
            }
            , new Object[] {
            P004B5_A219BarTotAgr, P004B5_n219BarTotAgr
            }
            , new Object[] {
            P004B7_A166BarKgm, P004B7_n166BarKgm
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

   private byte A132BarCodReo ;
   private byte AV20FlagFT ;
   private byte AV21FlagMB ;
   private byte GXv_int1[] ;
   private byte A148BarEstReo ;
   private byte A213BarSit ;
   private byte A3915EmpNumDec ;
   private short AV18Anyadi ;
   private short A189BarNumAny ;
   private short Gx_err ;
   private int A129BarCod ;
   private java.math.BigDecimal AV15CosPro ;
   private java.math.BigDecimal AV16CosAny ;
   private java.math.BigDecimal AV24Nclec ;
   private java.math.BigDecimal A141BarCosPro ;
   private java.math.BigDecimal A140BarCosAny ;
   private java.math.BigDecimal A219BarTotAgr ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A812RecTotKgm ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV17MaqCod ;
   private String AV19CieCerAny ;
   private String scmdbuf ;
   private String A180BarMaqCod ;
   private java.util.Date A2448BarFecEnR ;
   private java.util.Date A3871BarFecCRe ;
   private java.util.Date Gx_date ;
   private boolean n2448BarFecEnR ;
   private boolean n3915EmpNumDec ;
   private boolean n219BarTotAgr ;
   private boolean n166BarKgm ;
   private String[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private String[] aP6 ;
   private short[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P004B2_A396EmprCod ;
   private int[] P004B2_A129BarCod ;
   private byte[] P004B2_A132BarCodReo ;
   private String[] P004B2_A130BarCodPar ;
   private byte[] P004B2_A148BarEstReo ;
   private java.math.BigDecimal[] P004B2_A141BarCosPro ;
   private java.math.BigDecimal[] P004B2_A140BarCosAny ;
   private byte[] P004B2_A213BarSit ;
   private String[] P004B2_A180BarMaqCod ;
   private short[] P004B2_A189BarNumAny ;
   private java.util.Date[] P004B2_A2448BarFecEnR ;
   private boolean[] P004B2_n2448BarFecEnR ;
   private java.util.Date[] P004B2_A3871BarFecCRe ;
   private byte[] P004B3_A3915EmpNumDec ;
   private boolean[] P004B3_n3915EmpNumDec ;
   private java.math.BigDecimal[] P004B5_A219BarTotAgr ;
   private boolean[] P004B5_n219BarTotAgr ;
   private java.math.BigDecimal[] P004B7_A166BarKgm ;
   private boolean[] P004B7_n166BarKgm ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pmodcos__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pmodcos__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pmodcos__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pmodcos__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pmodcos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P004B2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarEstReo, BarCosPro, BarCosAny, BarSit, BarMaqCod, BarNumAny, BarFecEnR, BarFecCRe FROM TXPBARCAD WHERE (EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) AND (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)  FOR UPDATE OF BarCosPro, BarCosAny, BarSit, BarMaqCod, BarNumAny, BarFecEnR, BarFecCRe NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P004B3", "SELECT EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P004B5", "SELECT COALESCE( T1.BarTotAgr, 0) AS BarTotAgr FROM (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P004B7", "SELECT COALESCE( T1.BarKgm, 0) AS BarKgm FROM (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P004B8", "UPDATE TXPBARCAD SET BarCosPro=?, BarCosAny=?, BarSit=?, BarMaqCod=?, BarNumAny=?, BarFecEnR=?, BarFecCRe=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(12);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[6]);
               }
               stmt.setDate(7, (java.util.Date)parms[7]);
               stmt.setString(8, (String)parms[8], 3);
               stmt.setInt(9, ((Number) parms[9]).intValue());
               stmt.setByte(10, ((Number) parms[10]).byteValue());
               stmt.setString(11, (String)parms[11], 1);
               return;
      }
   }

}

