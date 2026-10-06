package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdigbar extends GXProcedure
{
   public pdigbar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdigbar.class ), "" );
   }

   public pdigbar( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      pdigbar.this.aP3 = new String[] {""};
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
      pdigbar.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdigbar.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pdigbar.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pdigbar.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized DELETE. */
      /* Using cursor P05QP2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCOM");
      /* End optimized DELETE. */
      AV8DisDGLin = (byte)(1) ;
      /* Using cursor P05QP3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A13096BarDGComb = P05QP3_A13096BarDGComb[0] ;
         A13097BarDGFOndo = P05QP3_A13097BarDGFOndo[0] ;
         A13101BarDGAncho = P05QP3_A13101BarDGAncho[0] ;
         A13100BarDGMts = P05QP3_A13100BarDGMts[0] ;
         A13099BarDGPzs = P05QP3_A13099BarDGPzs[0] ;
         A13098BarDGObs = P05QP3_A13098BarDGObs[0] ;
         A13094BarDGDibCl = P05QP3_A13094BarDGDibCl[0] ;
         A13095BarDGDibIn = P05QP3_A13095BarDGDibIn[0] ;
         A13132BarDGEstad = P05QP3_A13132BarDGEstad[0] ;
         A13093BarDGLin = P05QP3_A13093BarDGLin[0] ;
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
         A2524DisComLin = AV8DisDGLin ;
         A1056DisComCod = A13096BarDGComb ;
         A1032FonCod = A13097BarDGFOndo ;
         A1539BarComAnh = A13101BarDGAncho ;
         n1539BarComAnh = false ;
         A1541BarComMtr = A13100BarDGMts ;
         n1541BarComMtr = false ;
         A1543BarComPie = A13099BarDGPzs ;
         n1543BarComPie = false ;
         A7734BarComObs = A13098BarDGObs ;
         n7734BarComObs = false ;
         A13074BarComDibC = A13094BarDGDibCl ;
         n13074BarComDibC = false ;
         A13075BarComDibI = A13095BarDGDibIn ;
         n13075BarComDibI = false ;
         A12893BarEstFima = A13132BarDGEstad ;
         n12893BarEstFima = false ;
         /* Using cursor P05QP4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Boolean.valueOf(n1539BarComAnh), Short.valueOf(A1539BarComAnh), Boolean.valueOf(n1541BarComMtr), A1541BarComMtr, Boolean.valueOf(n1543BarComPie), Short.valueOf(A1543BarComPie), Boolean.valueOf(n7734BarComObs), A7734BarComObs, Boolean.valueOf(n12893BarEstFima), Byte.valueOf(A12893BarEstFima), Boolean.valueOf(n13074BarComDibC), A13074BarComDibC, Boolean.valueOf(n13075BarComDibI), Integer.valueOf(A13075BarComDibI)});
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
         AV8DisDGLin = (byte)(AV8DisDGLin+1) ;
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      n13092BarDGUltLi = false ;
      /* Optimized UPDATE. */
      /* Using cursor P05QP5 */
      pr_default.execute(3, new Object[] {Byte.valueOf(AV8DisDGLin), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdigbar.this.A396EmprCod;
      this.aP1[0] = pdigbar.this.A129BarCod;
      this.aP2[0] = pdigbar.this.A132BarCodReo;
      this.aP3[0] = pdigbar.this.A130BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdigbar");
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
      P05QP3_A396EmprCod = new String[] {""} ;
      P05QP3_A129BarCod = new int[1] ;
      P05QP3_A132BarCodReo = new byte[1] ;
      P05QP3_A130BarCodPar = new String[] {""} ;
      P05QP3_A13096BarDGComb = new String[] {""} ;
      P05QP3_A13097BarDGFOndo = new String[] {""} ;
      P05QP3_A13101BarDGAncho = new short[1] ;
      P05QP3_A13100BarDGMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05QP3_A13099BarDGPzs = new short[1] ;
      P05QP3_A13098BarDGObs = new String[] {""} ;
      P05QP3_A13094BarDGDibCl = new String[] {""} ;
      P05QP3_A13095BarDGDibIn = new int[1] ;
      P05QP3_A13132BarDGEstad = new byte[1] ;
      P05QP3_A13093BarDGLin = new byte[1] ;
      A13096BarDGComb = "" ;
      A13097BarDGFOndo = "" ;
      A13100BarDGMts = DecimalUtil.ZERO ;
      A13098BarDGObs = "" ;
      A13094BarDGDibCl = "" ;
      W396EmprCod = "" ;
      W130BarCodPar = "" ;
      A1056DisComCod = "" ;
      A1032FonCod = "" ;
      A1541BarComMtr = DecimalUtil.ZERO ;
      A7734BarComObs = "" ;
      A13074BarComDibC = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdigbar__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P05QP3_A396EmprCod, P05QP3_A129BarCod, P05QP3_A132BarCodReo, P05QP3_A130BarCodPar, P05QP3_A13096BarDGComb, P05QP3_A13097BarDGFOndo, P05QP3_A13101BarDGAncho, P05QP3_A13100BarDGMts, P05QP3_A13099BarDGPzs, P05QP3_A13098BarDGObs,
            P05QP3_A13094BarDGDibCl, P05QP3_A13095BarDGDibIn, P05QP3_A13132BarDGEstad, P05QP3_A13093BarDGLin
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
   private byte AV8DisDGLin ;
   private byte A13132BarDGEstad ;
   private byte A13093BarDGLin ;
   private byte W132BarCodReo ;
   private byte A2524DisComLin ;
   private byte A12893BarEstFima ;
   private short A13101BarDGAncho ;
   private short A13099BarDGPzs ;
   private short A1539BarComAnh ;
   private short A1543BarComPie ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A13095BarDGDibIn ;
   private int W129BarCod ;
   private int GX_INS542 ;
   private int A13075BarComDibI ;
   private java.math.BigDecimal A13100BarDGMts ;
   private java.math.BigDecimal A1541BarComMtr ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A13096BarDGComb ;
   private String A13097BarDGFOndo ;
   private String A13098BarDGObs ;
   private String A13094BarDGDibCl ;
   private String W396EmprCod ;
   private String W130BarCodPar ;
   private String A1056DisComCod ;
   private String A1032FonCod ;
   private String A7734BarComObs ;
   private String A13074BarComDibC ;
   private String Gx_emsg ;
   private boolean n1539BarComAnh ;
   private boolean n1541BarComMtr ;
   private boolean n1543BarComPie ;
   private boolean n7734BarComObs ;
   private boolean n13074BarComDibC ;
   private boolean n13075BarComDibI ;
   private boolean n12893BarEstFima ;
   private boolean n13092BarDGUltLi ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P05QP3_A396EmprCod ;
   private int[] P05QP3_A129BarCod ;
   private byte[] P05QP3_A132BarCodReo ;
   private String[] P05QP3_A130BarCodPar ;
   private String[] P05QP3_A13096BarDGComb ;
   private String[] P05QP3_A13097BarDGFOndo ;
   private short[] P05QP3_A13101BarDGAncho ;
   private java.math.BigDecimal[] P05QP3_A13100BarDGMts ;
   private short[] P05QP3_A13099BarDGPzs ;
   private String[] P05QP3_A13098BarDGObs ;
   private String[] P05QP3_A13094BarDGDibCl ;
   private int[] P05QP3_A13095BarDGDibIn ;
   private byte[] P05QP3_A13132BarDGEstad ;
   private byte[] P05QP3_A13093BarDGLin ;
}

final  class pdigbar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P05QP2", "DELETE FROM TXPBARCOM  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCOM")
         ,new ForEachCursor("P05QP3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDGComb, BarDGFOndo, BarDGAncho, BarDGMts, BarDGPzs, BarDGObs, BarDGDibCl, BarDGDibIn, BarDGEstad, BarDGLin FROM TXPDIGBAR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarDGLin, BarDGDibCl, BarDGDibIn, BarDGComb, BarDGFOndo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05QP4", "INSERT INTO TXPBARCOM(EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, BarComAnh, BarComMtr, BarComPie, BarComObs, BarEstFima, BarComDibC, BarComDibI, BarComMLan, BarComPLan, BarComPEst, BarComEst, BarMtrRep, BarMtrEst, BarGasOpe, BarGasEst, BarGasEmp, BarGasAca, BarPrcMtr, BarFecEst, RecEstAnh, BarNumMol, RecEstTMaq, BarCodLan, BarComPri, BarComRep, RecObsULin, BarComFC, BarMaqPor, CodMaqEst, OpeREst, OeStatus, OeFecHis, OeKill, BarFecFima) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCOM")
         ,new UpdateCursor("P05QP5", "UPDATE TXPBARCAD SET BarDGUltLi=? - 1  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 70);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
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
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[14], 70);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(12, ((Number) parms[16]).byteValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[18], 16);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[20]).intValue());
               }
               return;
            case 3 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

