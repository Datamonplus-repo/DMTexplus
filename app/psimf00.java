package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psimf00 extends GXProcedure
{
   public psimf00( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psimf00.class ), "" );
   }

   public psimf00( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           String[] aP2 ,
                                           String[] aP3 ,
                                           int[] aP4 ,
                                           byte[] aP5 )
   {
      psimf00.this.aP6 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        java.math.BigDecimal[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             java.math.BigDecimal[] aP6 )
   {
      psimf00.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      psimf00.this.AV8Clicod = aP1[0];
      this.aP1 = aP1;
      psimf00.this.AV9Forser = aP2[0];
      this.aP2 = aP2;
      psimf00.this.AV10Forcolnom = aP3[0];
      this.aP3 = aP3;
      psimf00.this.AV11Forcolnum = aP4[0];
      this.aP4 = aP4;
      psimf00.this.AV12Tipcolcod = aP5[0];
      this.aP5 = aP5;
      psimf00.this.AV13ForRelBan = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Empieza la creacion ficha simulacion", "") );
      /* Optimized DELETE. */
      /* Using cursor P030Y2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8Clicod), AV9Forser, AV10Forcolnom, Integer.valueOf(AV11Forcolnum), Byte.valueOf(AV12Tipcolcod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFORLIS");
      /* End optimized DELETE. */
      Application.commitDataStores(context, remoteHandle, pr_default, "psimf00");
      AV14Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = A396EmprCod ;
      GXv_int2[0] = AV8Clicod ;
      GXv_char3[0] = AV9Forser ;
      GXv_char4[0] = AV10Forcolnom ;
      GXv_int5[0] = AV11Forcolnum ;
      GXv_int6[0] = AV12Tipcolcod ;
      GXv_decimal7[0] = DecimalUtil.doubleToDec(1) ;
      GXv_int8[0] = (int)(DecimalUtil.decToDouble(AV13ForRelBan)) ;
      GXv_char9[0] = "" ;
      GXv_decimal10[0] = DecimalUtil.doubleToDec(0) ;
      new app.psimulax(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3, GXv_char4, GXv_int5, GXv_int6, GXv_decimal7, GXv_int8, GXv_char9, GXv_decimal10) ;
      psimf00.this.A396EmprCod = GXv_char1[0] ;
      psimf00.this.AV8Clicod = GXv_int2[0] ;
      psimf00.this.AV9Forser = GXv_char3[0] ;
      psimf00.this.AV10Forcolnom = GXv_char4[0] ;
      psimf00.this.AV11Forcolnum = GXv_int5[0] ;
      psimf00.this.AV12Tipcolcod = GXv_int6[0] ;
      psimf00.this.AV13ForRelBan = DecimalUtil.doubleToDec(GXv_int8[0]) ;
      AV15Sim_lin = (short)(1) ;
      /* Using cursor P030Y3 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV14Station});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A764ProForCod = P030Y3_A764ProForCod[0] ;
         A4712EscMFacCon = P030Y3_A4712EscMFacCon[0] ;
         A890EscMCan = P030Y3_A890EscMCan[0] ;
         A724PrdPreAct = P030Y3_A724PrdPreAct[0] ;
         A490ForPrdUMe = P030Y3_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P030Y3_n490ForPrdUMe[0] ;
         A719PrdNum = P030Y3_A719PrdNum[0] ;
         n719PrdNum = P030Y3_n719PrdNum[0] ;
         A910Workstat = P030Y3_A910Workstat[0] ;
         A887EscMLin = P030Y3_A887EscMLin[0] ;
         A724PrdPreAct = P030Y3_A724PrdPreAct[0] ;
         W396EmprCod = A396EmprCod ;
         if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), httpContext.getMessage( "C", "")) == 0 )
         {
         }
         else
         {
            /*
               INSERT RECORD ON TABLE TXPFORLIS

            */
            W396EmprCod = A396EmprCod ;
            W719PrdNum = A719PrdNum ;
            n719PrdNum = false ;
            W490ForPrdUMe = A490ForPrdUMe ;
            n490ForPrdUMe = false ;
            A252CliCod = AV8Clicod ;
            A494ForSer = AV9Forser ;
            A482ForColNom = AV10Forcolnom ;
            A483ForColNum = AV11Forcolnum ;
            A831TipColCod = AV12Tipcolcod ;
            A7797Sim_lin = AV15Sim_lin ;
            A7798Sim_Prof = A764ProForCod ;
            n7798Sim_Prof = false ;
            n719PrdNum = false ;
            A7799Sim_Fact = A4712EscMFacCon ;
            n7799Sim_Fact = false ;
            n490ForPrdUMe = false ;
            A7800Sim_Cant = A890EscMCan ;
            n7800Sim_Cant = false ;
            A9720Sum_Precio = A724PrdPreAct ;
            n9720Sum_Precio = false ;
            /* Using cursor P030Y4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), Short.valueOf(A7797Sim_lin), Boolean.valueOf(n7798Sim_Prof), A7798Sim_Prof, Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n7799Sim_Fact), A7799Sim_Fact, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe), Boolean.valueOf(n7800Sim_Cant), A7800Sim_Cant, Boolean.valueOf(n9720Sum_Precio), A9720Sum_Precio});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFORLIS");
            if ( (pr_default.getStatus(2) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A396EmprCod = W396EmprCod ;
            A719PrdNum = W719PrdNum ;
            n719PrdNum = false ;
            A490ForPrdUMe = W490ForPrdUMe ;
            n490ForPrdUMe = false ;
            /* End Insert */
            AV15Sim_lin = (short)(AV15Sim_lin+1) ;
         }
         A396EmprCod = W396EmprCod ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Optimized DELETE. */
      /* Using cursor P030Y5 */
      pr_default.execute(3, new Object[] {A396EmprCod, AV14Station});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPESCMAN");
      /* End optimized DELETE. */
      System.out.println( httpContext.getMessage( "Fin de la creacion ficha simulacion", "") );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = psimf00.this.A396EmprCod;
      this.aP1[0] = psimf00.this.AV8Clicod;
      this.aP2[0] = psimf00.this.AV9Forser;
      this.aP3[0] = psimf00.this.AV10Forcolnom;
      this.aP4[0] = psimf00.this.AV11Forcolnum;
      this.aP5[0] = psimf00.this.AV12Tipcolcod;
      this.aP6[0] = psimf00.this.AV13ForRelBan;
      Application.commitDataStores(context, remoteHandle, pr_default, "psimf00");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV14Station = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_int8 = new int[1] ;
      GXv_char9 = new String[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      scmdbuf = "" ;
      P030Y3_A396EmprCod = new String[] {""} ;
      P030Y3_A764ProForCod = new String[] {""} ;
      P030Y3_A4712EscMFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P030Y3_A890EscMCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P030Y3_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P030Y3_A490ForPrdUMe = new byte[1] ;
      P030Y3_n490ForPrdUMe = new boolean[] {false} ;
      P030Y3_A719PrdNum = new String[] {""} ;
      P030Y3_n719PrdNum = new boolean[] {false} ;
      P030Y3_A910Workstat = new String[] {""} ;
      P030Y3_A887EscMLin = new int[1] ;
      A764ProForCod = "" ;
      A4712EscMFacCon = DecimalUtil.ZERO ;
      A890EscMCan = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      A910Workstat = "" ;
      W396EmprCod = "" ;
      W719PrdNum = "" ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
      A7798Sim_Prof = "" ;
      A7799Sim_Fact = DecimalUtil.ZERO ;
      A7800Sim_Cant = DecimalUtil.ZERO ;
      A9720Sum_Precio = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.psimf00__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.psimf00__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.psimf00__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.psimf00__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P030Y3_A396EmprCod, P030Y3_A764ProForCod, P030Y3_A4712EscMFacCon, P030Y3_A890EscMCan, P030Y3_A724PrdPreAct, P030Y3_A490ForPrdUMe, P030Y3_A719PrdNum, P030Y3_A910Workstat, P030Y3_A887EscMLin
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

   private byte AV12Tipcolcod ;
   private byte GXv_int6[] ;
   private byte A490ForPrdUMe ;
   private byte W490ForPrdUMe ;
   private byte A831TipColCod ;
   private short AV15Sim_lin ;
   private short A7797Sim_lin ;
   private short Gx_err ;
   private int AV8Clicod ;
   private int AV11Forcolnum ;
   private int GXv_int2[] ;
   private int GXv_int5[] ;
   private int GXv_int8[] ;
   private int A887EscMLin ;
   private int GX_INS1090 ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private java.math.BigDecimal AV13ForRelBan ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal A4712EscMFacCon ;
   private java.math.BigDecimal A890EscMCan ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A7799Sim_Fact ;
   private java.math.BigDecimal A7800Sim_Cant ;
   private java.math.BigDecimal A9720Sum_Precio ;
   private String A396EmprCod ;
   private String AV9Forser ;
   private String AV10Forcolnom ;
   private String AV14Station ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String GXv_char9[] ;
   private String scmdbuf ;
   private String A764ProForCod ;
   private String A719PrdNum ;
   private String A910Workstat ;
   private String W396EmprCod ;
   private String W719PrdNum ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String A7798Sim_Prof ;
   private String Gx_emsg ;
   private boolean n490ForPrdUMe ;
   private boolean n719PrdNum ;
   private boolean n7798Sim_Prof ;
   private boolean n7799Sim_Fact ;
   private boolean n7800Sim_Cant ;
   private boolean n9720Sum_Precio ;
   private java.math.BigDecimal[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P030Y3_A396EmprCod ;
   private String[] P030Y3_A764ProForCod ;
   private java.math.BigDecimal[] P030Y3_A4712EscMFacCon ;
   private java.math.BigDecimal[] P030Y3_A890EscMCan ;
   private java.math.BigDecimal[] P030Y3_A724PrdPreAct ;
   private byte[] P030Y3_A490ForPrdUMe ;
   private boolean[] P030Y3_n490ForPrdUMe ;
   private String[] P030Y3_A719PrdNum ;
   private boolean[] P030Y3_n719PrdNum ;
   private String[] P030Y3_A910Workstat ;
   private int[] P030Y3_A887EscMLin ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class psimf00__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class psimf00__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class psimf00__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class psimf00__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P030Y2", "DELETE FROM TXPFORLIS  WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFORLIS")
         ,new ForEachCursor("P030Y3", "SELECT T1.EmprCod, T1.ProForCod, T1.EscMFacCon, T1.EscMCan, T2.PrdPreAct, T1.ForPrdUMe, T1.PrdNum, T1.Workstat, T1.EscMLin FROM (TXPESCMAN T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.Workstat = ? ORDER BY T1.EmprCod, T1.Workstat, T1.EscMLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P030Y4", "INSERT INTO TXPFORLIS(EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Sim_lin, Sim_Prof, PrdNum, Sim_Fact, ForPrdUMe, Sim_Cant, Sum_Precio) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFORLIS")
         ,new UpdateCursor("P030Y5", "DELETE FROM TXPESCMAN  WHERE EmprCod = ? and Workstat = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPESCMAN")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 10);
               ((int[]) buf[8])[0] = rslt.getInt(9);
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
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[8], 6);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[10], 6);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[12], 5);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[14]).byteValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[16], 5);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[18], 5);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
      }
   }

}

