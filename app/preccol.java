package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class preccol extends GXProcedure
{
   public preccol( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( preccol.class ), "" );
   }

   public preccol( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            String[] aP2 ,
                            String[] aP3 ,
                            int[] aP4 ,
                            byte[] aP5 ,
                            byte[] aP6 ,
                            short[] aP7 ,
                            short[] aP8 ,
                            int[] aP9 ,
                            byte[] aP10 ,
                            String[] aP11 )
   {
      preccol.this.aP12 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        byte[] aP6 ,
                        short[] aP7 ,
                        short[] aP8 ,
                        int[] aP9 ,
                        byte[] aP10 ,
                        String[] aP11 ,
                        short[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             byte[] aP6 ,
                             short[] aP7 ,
                             short[] aP8 ,
                             int[] aP9 ,
                             byte[] aP10 ,
                             String[] aP11 ,
                             short[] aP12 )
   {
      preccol.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      preccol.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      preccol.this.A494ForSer = aP2[0];
      this.aP2 = aP2;
      preccol.this.A482ForColNom = aP3[0];
      this.aP3 = aP3;
      preccol.this.A483ForColNum = aP4[0];
      this.aP4 = aP4;
      preccol.this.A831TipColCod = aP5[0];
      this.aP5 = aP5;
      preccol.this.AV8IntCod = aP6[0];
      this.aP6 = aP6;
      preccol.this.AV9MatCod = aP7[0];
      this.aP7 = aP7;
      preccol.this.AV10LineaC = aP8[0];
      this.aP8 = aP8;
      preccol.this.AV11BarCod = aP9[0];
      this.aP9 = aP9;
      preccol.this.AV12BarCodReo = aP10[0];
      this.aP10 = aP10;
      preccol.this.AV13BarCodPar = aP11[0];
      this.aP11 = aP11;
      preccol.this.AV14RecLinMaq = aP12[0];
      this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15ForNumCol = 0 ;
      AV8IntCod = (byte)(0) ;
      AV9MatCod = (short)(0) ;
      /* Using cursor P01RH2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A486ForNumCol = P01RH2_A486ForNumCol[0] ;
         A583IntCod = P01RH2_A583IntCod[0] ;
         A626MatCod = P01RH2_A626MatCod[0] ;
         AV15ForNumCol = A486ForNumCol ;
         AV8IntCod = A583IntCod ;
         AV9MatCod = A626MatCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV10LineaC = (short)(1) ;
      /* Using cursor P01RH3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV15ForNumCol)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A486ForNumCol = P01RH3_A486ForNumCol[0] ;
         A719PrdNum = P01RH3_A719PrdNum[0] ;
         A481ForCan = P01RH3_A481ForCan[0] ;
         A490ForPrdUMe = P01RH3_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P01RH3_n490ForPrdUMe[0] ;
         A3004PrdRev = P01RH3_A3004PrdRev[0] ;
         A309ColLin = P01RH3_A309ColLin[0] ;
         A3004PrdRev = P01RH3_A3004PrdRev[0] ;
         AV16PrdNum = A719PrdNum ;
         AV18ForCan = A481ForCan ;
         AV20ForPrdUMe = A490ForPrdUMe ;
         if ( GXutil.strcmp(A3004PrdRev, httpContext.getMessage( "S", "")) == 0 )
         {
            /* Execute user subroutine: 'SUSTITUTO' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         else
         {
            AV17PrdSusNum = AV16PrdNum ;
            AV21ForCan2 = DecimalUtil.doubleToDec(1) ;
            /* Execute user subroutine: 'NEW_RECCOL' */
            S124 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      Application.commitDataStores(context, remoteHandle, pr_default, "preccol");
      cleanup();
   }

   public void S111( )
   {
      /* 'SUSTITUTO' Routine */
      returnInSub = false ;
      AV17PrdSusNum = "" ;
      AV19Flag_Sus = (byte)(0) ;
      /* Using cursor P01RH4 */
      pr_default.execute(2, new Object[] {A396EmprCod, AV16PrdNum});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A719PrdNum = P01RH4_A719PrdNum[0] ;
         A5976PrdSusCan = P01RH4_A5976PrdSusCan[0] ;
         n5976PrdSusCan = P01RH4_n5976PrdSusCan[0] ;
         A490ForPrdUMe = P01RH4_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P01RH4_n490ForPrdUMe[0] ;
         A5973PrdSusNum = P01RH4_A5973PrdSusNum[0] ;
         AV17PrdSusNum = A5973PrdSusNum ;
         AV21ForCan2 = A5976PrdSusCan ;
         AV20ForPrdUMe = A490ForPrdUMe ;
         /* Execute user subroutine: 'NEW_RECCOL' */
         S124 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            returnInSub = true;
            if (true) return;
         }
         AV19Flag_Sus = (byte)(1) ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( (0==AV19Flag_Sus) )
      {
         AV17PrdSusNum = AV16PrdNum ;
         AV21ForCan2 = DecimalUtil.doubleToDec(1) ;
         /* Execute user subroutine: 'NEW_RECCOL' */
         S124 ();
         if (returnInSub) return;
      }
   }

   public void S124( )
   {
      /* 'NEW_RECCOL' Routine */
      returnInSub = false ;
      /*
         INSERT RECORD ON TABLE TXPRECCOL

      */
      A129BarCod = AV11BarCod ;
      A132BarCodReo = AV12BarCodReo ;
      A130BarCodPar = AV13BarCodPar ;
      A2804RecLinMaq = AV14RecLinMaq ;
      A5408RecLinCol = AV10LineaC ;
      A5409RecPrdCol = AV17PrdSusNum ;
      n5409RecPrdCol = false ;
      A5411RecCantCol = AV18ForCan.multiply(AV21ForCan2) ;
      n5411RecCantCol = false ;
      A490ForPrdUMe = AV20ForPrdUMe ;
      n490ForPrdUMe = false ;
      /* Using cursor P01RH5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Short.valueOf(A5408RecLinCol), Boolean.valueOf(n5409RecPrdCol), A5409RecPrdCol, Boolean.valueOf(n5411RecCantCol), A5411RecCantCol, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECCOL");
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
      AV10LineaC = (short)(AV10LineaC+1) ;
   }

   protected void cleanup( )
   {
      this.aP0[0] = preccol.this.A396EmprCod;
      this.aP1[0] = preccol.this.A252CliCod;
      this.aP2[0] = preccol.this.A494ForSer;
      this.aP3[0] = preccol.this.A482ForColNom;
      this.aP4[0] = preccol.this.A483ForColNum;
      this.aP5[0] = preccol.this.A831TipColCod;
      this.aP6[0] = preccol.this.AV8IntCod;
      this.aP7[0] = preccol.this.AV9MatCod;
      this.aP8[0] = preccol.this.AV10LineaC;
      this.aP9[0] = preccol.this.AV11BarCod;
      this.aP10[0] = preccol.this.AV12BarCodReo;
      this.aP11[0] = preccol.this.AV13BarCodPar;
      this.aP12[0] = preccol.this.AV14RecLinMaq;
      Application.commitDataStores(context, remoteHandle, pr_default, "preccol");
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
      P01RH2_A396EmprCod = new String[] {""} ;
      P01RH2_A252CliCod = new int[1] ;
      P01RH2_A494ForSer = new String[] {""} ;
      P01RH2_A482ForColNom = new String[] {""} ;
      P01RH2_A483ForColNum = new int[1] ;
      P01RH2_A831TipColCod = new byte[1] ;
      P01RH2_A486ForNumCol = new int[1] ;
      P01RH2_A583IntCod = new byte[1] ;
      P01RH2_A626MatCod = new short[1] ;
      P01RH3_A396EmprCod = new String[] {""} ;
      P01RH3_A486ForNumCol = new int[1] ;
      P01RH3_A719PrdNum = new String[] {""} ;
      P01RH3_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01RH3_A490ForPrdUMe = new byte[1] ;
      P01RH3_n490ForPrdUMe = new boolean[] {false} ;
      P01RH3_A3004PrdRev = new String[] {""} ;
      P01RH3_A309ColLin = new short[1] ;
      A719PrdNum = "" ;
      A481ForCan = DecimalUtil.ZERO ;
      A3004PrdRev = "" ;
      AV16PrdNum = "" ;
      AV18ForCan = DecimalUtil.ZERO ;
      AV17PrdSusNum = "" ;
      AV21ForCan2 = DecimalUtil.ZERO ;
      P01RH4_A396EmprCod = new String[] {""} ;
      P01RH4_A719PrdNum = new String[] {""} ;
      P01RH4_A5976PrdSusCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01RH4_n5976PrdSusCan = new boolean[] {false} ;
      P01RH4_A490ForPrdUMe = new byte[1] ;
      P01RH4_n490ForPrdUMe = new boolean[] {false} ;
      P01RH4_A5973PrdSusNum = new String[] {""} ;
      A5976PrdSusCan = DecimalUtil.ZERO ;
      A5973PrdSusNum = "" ;
      A130BarCodPar = "" ;
      A5409RecPrdCol = "" ;
      A5411RecCantCol = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.preccol__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.preccol__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.preccol__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.preccol__default(),
         new Object[] {
             new Object[] {
            P01RH2_A396EmprCod, P01RH2_A252CliCod, P01RH2_A494ForSer, P01RH2_A482ForColNom, P01RH2_A483ForColNum, P01RH2_A831TipColCod, P01RH2_A486ForNumCol, P01RH2_A583IntCod, P01RH2_A626MatCod
            }
            , new Object[] {
            P01RH3_A396EmprCod, P01RH3_A486ForNumCol, P01RH3_A719PrdNum, P01RH3_A481ForCan, P01RH3_A490ForPrdUMe, P01RH3_A3004PrdRev, P01RH3_A309ColLin
            }
            , new Object[] {
            P01RH4_A396EmprCod, P01RH4_A719PrdNum, P01RH4_A5976PrdSusCan, P01RH4_n5976PrdSusCan, P01RH4_A490ForPrdUMe, P01RH4_n490ForPrdUMe, P01RH4_A5973PrdSusNum
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private byte AV8IntCod ;
   private byte AV12BarCodReo ;
   private byte A583IntCod ;
   private byte A490ForPrdUMe ;
   private byte AV20ForPrdUMe ;
   private byte AV19Flag_Sus ;
   private byte A132BarCodReo ;
   private short AV9MatCod ;
   private short AV10LineaC ;
   private short AV14RecLinMaq ;
   private short A626MatCod ;
   private short A309ColLin ;
   private short A2804RecLinMaq ;
   private short A5408RecLinCol ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int AV11BarCod ;
   private int AV15ForNumCol ;
   private int A486ForNumCol ;
   private int GX_INS785 ;
   private int A129BarCod ;
   private java.math.BigDecimal A481ForCan ;
   private java.math.BigDecimal AV18ForCan ;
   private java.math.BigDecimal AV21ForCan2 ;
   private java.math.BigDecimal A5976PrdSusCan ;
   private java.math.BigDecimal A5411RecCantCol ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String AV13BarCodPar ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A3004PrdRev ;
   private String AV16PrdNum ;
   private String AV17PrdSusNum ;
   private String A5973PrdSusNum ;
   private String A130BarCodPar ;
   private String A5409RecPrdCol ;
   private String Gx_emsg ;
   private boolean n490ForPrdUMe ;
   private boolean returnInSub ;
   private boolean n5976PrdSusCan ;
   private boolean n5409RecPrdCol ;
   private boolean n5411RecCantCol ;
   private short[] aP12 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private byte[] aP6 ;
   private short[] aP7 ;
   private short[] aP8 ;
   private int[] aP9 ;
   private byte[] aP10 ;
   private String[] aP11 ;
   private IDataStoreProvider pr_default ;
   private String[] P01RH2_A396EmprCod ;
   private int[] P01RH2_A252CliCod ;
   private String[] P01RH2_A494ForSer ;
   private String[] P01RH2_A482ForColNom ;
   private int[] P01RH2_A483ForColNum ;
   private byte[] P01RH2_A831TipColCod ;
   private int[] P01RH2_A486ForNumCol ;
   private byte[] P01RH2_A583IntCod ;
   private short[] P01RH2_A626MatCod ;
   private String[] P01RH3_A396EmprCod ;
   private int[] P01RH3_A486ForNumCol ;
   private String[] P01RH3_A719PrdNum ;
   private java.math.BigDecimal[] P01RH3_A481ForCan ;
   private byte[] P01RH3_A490ForPrdUMe ;
   private boolean[] P01RH3_n490ForPrdUMe ;
   private String[] P01RH3_A3004PrdRev ;
   private short[] P01RH3_A309ColLin ;
   private String[] P01RH4_A396EmprCod ;
   private String[] P01RH4_A719PrdNum ;
   private java.math.BigDecimal[] P01RH4_A5976PrdSusCan ;
   private boolean[] P01RH4_n5976PrdSusCan ;
   private byte[] P01RH4_A490ForPrdUMe ;
   private boolean[] P01RH4_n490ForPrdUMe ;
   private String[] P01RH4_A5973PrdSusNum ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class preccol__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class preccol__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class preccol__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class preccol__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01RH2", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForNumCol, IntCod, MatCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01RH3", "SELECT T1.EmprCod, T1.ForNumCol, T1.PrdNum, T1.ForCan, T1.ForPrdUMe, T2.PrdRev, T1.ColLin FROM (TXPLDFORM T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.ForNumCol = ? ORDER BY T1.EmprCod, T1.ForNumCol, T1.ColLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01RH4", "SELECT EmprCod, PrdNum, PrdSusCan, ForPrdUMe, PrdSusNum FROM TXPPRDSUS WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum, PrdSusNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01RH5", "INSERT INTO TXPRECCOL(EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinCol, RecPrdCol, RecCantCol, ForPrdUMe) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECCOL")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 6);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[7], 6);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[9], 5);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[11]).byteValue());
               }
               return;
      }
   }

}

