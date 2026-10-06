package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcomgenh extends GXProcedure
{
   public pcomgenh( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcomgenh.class ), "" );
   }

   public pcomgenh( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      pcomgenh.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pcomgenh.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcomgenh.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pcomgenh.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pcomgenh.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Creo Barcom....", "") );
      /* Optimized DELETE. */
      /* Using cursor P034J2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBEST");
      /* End optimized DELETE. */
      Application.commitDataStores(context, remoteHandle, pr_default, "pcomgenh");
      /* Using cursor P034J4 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A135BarColNom = P034J4_A135BarColNom[0] ;
         A125BarAncAca1 = P034J4_A125BarAncAca1[0] ;
         A191BarNumPie = P034J4_A191BarNumPie[0] ;
         A2512BarComULin = P034J4_A2512BarComULin[0] ;
         n2512BarComULin = P034J4_n2512BarComULin[0] ;
         A184BarMtr = P034J4_A184BarMtr[0] ;
         n184BarMtr = P034J4_n184BarMtr[0] ;
         A184BarMtr = P034J4_A184BarMtr[0] ;
         n184BarMtr = P034J4_n184BarMtr[0] ;
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         /*
            INSERT RECORD ON TABLE TXPBARCOM

         */
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         A2524DisComLin = (byte)(1) ;
         A1056DisComCod = A135BarColNom ;
         A1032FonCod = A135BarColNom ;
         A1539BarComAnh = A125BarAncAca1 ;
         n1539BarComAnh = false ;
         A1541BarComMtr = A184BarMtr ;
         n1541BarComMtr = false ;
         A1543BarComPie = A191BarNumPie ;
         n1543BarComPie = false ;
         A1540BarComMLan = DecimalUtil.ZERO ;
         n1540BarComMLan = false ;
         A1544BarComPLan = (short)(0) ;
         n1544BarComPLan = false ;
         A1542BarComPEst = (byte)(0) ;
         n1542BarComPEst = false ;
         A2069BarComEst = httpContext.getMessage( "N", "") ;
         n2069BarComEst = false ;
         A2117RecEstAnh = (short)(0) ;
         n2117RecEstAnh = false ;
         A2072BarMtrRep = DecimalUtil.ZERO ;
         n2072BarMtrRep = false ;
         A2073BarNumMol = (short)(0) ;
         n2073BarNumMol = false ;
         A2509BarCodLan = 0 ;
         n2509BarCodLan = false ;
         A2510BarComPri = "" ;
         n2510BarComPri = false ;
         A2131RecObsULin = (byte)(0) ;
         n2131RecObsULin = false ;
         A2071BarMtrEst = DecimalUtil.ZERO ;
         n2071BarMtrEst = false ;
         /* Using cursor P034J5 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Boolean.valueOf(n1539BarComAnh), Short.valueOf(A1539BarComAnh), Boolean.valueOf(n1541BarComMtr), A1541BarComMtr, Boolean.valueOf(n1543BarComPie), Short.valueOf(A1543BarComPie), Boolean.valueOf(n1540BarComMLan), A1540BarComMLan, Boolean.valueOf(n1544BarComPLan), Short.valueOf(A1544BarComPLan), Boolean.valueOf(n1542BarComPEst), Byte.valueOf(A1542BarComPEst), Boolean.valueOf(n2069BarComEst), A2069BarComEst, Boolean.valueOf(n2072BarMtrRep), A2072BarMtrRep, Boolean.valueOf(n2071BarMtrEst), A2071BarMtrEst, Boolean.valueOf(n2117RecEstAnh), Short.valueOf(A2117RecEstAnh), Boolean.valueOf(n2073BarNumMol), Short.valueOf(A2073BarNumMol), Boolean.valueOf(n2509BarCodLan), Integer.valueOf(A2509BarCodLan), Boolean.valueOf(n2510BarComPri), A2510BarComPri, Boolean.valueOf(n2131RecObsULin), Byte.valueOf(A2131RecObsULin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCOM");
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
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         /* End Insert */
         A2512BarComULin = (byte)(1) ;
         n2512BarComULin = false ;
         /* Using cursor P034J6 */
         pr_default.execute(3, new Object[] {Boolean.valueOf(n2512BarComULin), Byte.valueOf(A2512BarComULin), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcomgenh.this.A396EmprCod;
      this.aP1[0] = pcomgenh.this.A129BarCod;
      this.aP2[0] = pcomgenh.this.A132BarCodReo;
      this.aP3[0] = pcomgenh.this.A130BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcomgenh");
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
      P034J4_A396EmprCod = new String[] {""} ;
      P034J4_A129BarCod = new int[1] ;
      P034J4_A132BarCodReo = new byte[1] ;
      P034J4_A130BarCodPar = new String[] {""} ;
      P034J4_A135BarColNom = new String[] {""} ;
      P034J4_A125BarAncAca1 = new short[1] ;
      P034J4_A191BarNumPie = new short[1] ;
      P034J4_A2512BarComULin = new byte[1] ;
      P034J4_n2512BarComULin = new boolean[] {false} ;
      P034J4_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P034J4_n184BarMtr = new boolean[] {false} ;
      A135BarColNom = "" ;
      A184BarMtr = DecimalUtil.ZERO ;
      W396EmprCod = "" ;
      W130BarCodPar = "" ;
      A1056DisComCod = "" ;
      A1032FonCod = "" ;
      A1541BarComMtr = DecimalUtil.ZERO ;
      A1540BarComMLan = DecimalUtil.ZERO ;
      A2069BarComEst = "" ;
      A2072BarMtrRep = DecimalUtil.ZERO ;
      A2510BarComPri = "" ;
      A2071BarMtrEst = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pcomgenh__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pcomgenh__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pcomgenh__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcomgenh__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P034J4_A396EmprCod, P034J4_A129BarCod, P034J4_A132BarCodReo, P034J4_A130BarCodPar, P034J4_A135BarColNom, P034J4_A125BarAncAca1, P034J4_A191BarNumPie, P034J4_A2512BarComULin, P034J4_n2512BarComULin, P034J4_A184BarMtr,
            P034J4_n184BarMtr
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

   private byte A132BarCodReo ;
   private byte A2512BarComULin ;
   private byte W132BarCodReo ;
   private byte A2524DisComLin ;
   private byte A1542BarComPEst ;
   private byte A2131RecObsULin ;
   private short A125BarAncAca1 ;
   private short A191BarNumPie ;
   private short A1539BarComAnh ;
   private short A1543BarComPie ;
   private short A1544BarComPLan ;
   private short A2117RecEstAnh ;
   private short A2073BarNumMol ;
   private short Gx_err ;
   private int A129BarCod ;
   private int W129BarCod ;
   private int GX_INS542 ;
   private int A2509BarCodLan ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A1541BarComMtr ;
   private java.math.BigDecimal A1540BarComMLan ;
   private java.math.BigDecimal A2072BarMtrRep ;
   private java.math.BigDecimal A2071BarMtrEst ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A135BarColNom ;
   private String W396EmprCod ;
   private String W130BarCodPar ;
   private String A1056DisComCod ;
   private String A1032FonCod ;
   private String A2069BarComEst ;
   private String A2510BarComPri ;
   private String Gx_emsg ;
   private boolean n2512BarComULin ;
   private boolean n184BarMtr ;
   private boolean n1539BarComAnh ;
   private boolean n1541BarComMtr ;
   private boolean n1543BarComPie ;
   private boolean n1540BarComMLan ;
   private boolean n1544BarComPLan ;
   private boolean n1542BarComPEst ;
   private boolean n2069BarComEst ;
   private boolean n2117RecEstAnh ;
   private boolean n2072BarMtrRep ;
   private boolean n2073BarNumMol ;
   private boolean n2509BarCodLan ;
   private boolean n2510BarComPri ;
   private boolean n2131RecObsULin ;
   private boolean n2071BarMtrEst ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P034J4_A396EmprCod ;
   private int[] P034J4_A129BarCod ;
   private byte[] P034J4_A132BarCodReo ;
   private String[] P034J4_A130BarCodPar ;
   private String[] P034J4_A135BarColNom ;
   private short[] P034J4_A125BarAncAca1 ;
   private short[] P034J4_A191BarNumPie ;
   private byte[] P034J4_A2512BarComULin ;
   private boolean[] P034J4_n2512BarComULin ;
   private java.math.BigDecimal[] P034J4_A184BarMtr ;
   private boolean[] P034J4_n184BarMtr ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pcomgenh__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pcomgenh__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pcomgenh__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pcomgenh__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P034J2", "DELETE FROM TXPALBEST  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBEST")
         ,new ForEachCursor("P034J4", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarColNom, T1.BarAncAca1, T1.BarNumPie, T1.BarComULin, COALESCE( T2.BarMtr, 0) AS BarMtr FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P034J5", "INSERT INTO TXPBARCOM(EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, BarComAnh, BarComMtr, BarComPie, BarComMLan, BarComPLan, BarComPEst, BarComEst, BarMtrRep, BarMtrEst, RecEstAnh, BarNumMol, BarCodLan, BarComPri, RecObsULin, BarGasOpe, BarGasEst, BarGasEmp, BarGasAca, BarPrcMtr, BarFecEst, RecEstTMaq, BarComRep, BarComFC, BarComObs, BarMaqPor, CodMaqEst, OpeREst, OeStatus, OeFecHis, OeKill, BarFecFima, BarEstFima, BarComDibC, BarComDibI) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCOM")
         ,new UpdateCursor("P034J6", "UPDATE TXPBARCAD SET BarComULin=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[8]).shortValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[12]).shortValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[16]).shortValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[18]).byteValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[20], 1);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[26]).shortValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[28]).shortValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(19, ((Number) parms[30]).intValue());
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[32], 1);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(21, ((Number) parms[34]).byteValue());
               }
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               return;
      }
   }

}

