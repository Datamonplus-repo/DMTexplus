package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class palbtep1 extends GXProcedure
{
   public palbtep1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( palbtep1.class ), "" );
   }

   public palbtep1( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      palbtep1.this.aP3 = new String[] {""};
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
      palbtep1.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      palbtep1.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      palbtep1.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      palbtep1.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV11EmprNom ;
      GXv_char3[0] = AV13Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char1, GXv_char2, GXv_char3) ;
      palbtep1.this.A396EmprCod = GXv_char1[0] ;
      palbtep1.this.AV11EmprNom = GXv_char2[0] ;
      palbtep1.this.AV13Usurcod = GXv_char3[0] ;
      AV8Variantes = 0 ;
      AV10Bartipdis = "X" ;
      /* Using cursor P02RM2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2010BarTipDis = P02RM2_A2010BarTipDis[0] ;
         A1032FonCod = P02RM2_A1032FonCod[0] ;
         A1056DisComCod = P02RM2_A1056DisComCod[0] ;
         A2524DisComLin = P02RM2_A2524DisComLin[0] ;
         A30AlbProCod = P02RM2_A30AlbProCod[0] ;
         A2010BarTipDis = P02RM2_A2010BarTipDis[0] ;
         AV8Variantes = (int)(AV8Variantes+1) ;
         AV10Bartipdis = A2010BarTipDis ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV8Variantes > 0 )
      {
         AV9Textoi = httpContext.getMessage( "Estoy en el procedimiento que crea un registro en BARCOM cuando la HDR esta marcada como Teñido", "") + GXutil.chr( (short)(13)) ;
         AV9Textoi += httpContext.getMessage( "Valor item &Bartipdis = ", "") + AV10Bartipdis + httpContext.getMessage( " pero resulta que he encontrado un registro en BARCOM ¡¡¡M", "") + GXutil.chr( (short)(13)) ;
         AV9Textoi += httpContext.getMessage( "Por tanto NO ejecuto la creacion del registro en BARCOM", "") ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV17Pgmname, AV13Usurcod, AV12Station, AV9Textoi, A129BarCod, A132BarCodReo, A130BarCodPar) ;
      }
      else
      {
         /* Using cursor P02RM4 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A135BarColNom = P02RM4_A135BarColNom[0] ;
            A125BarAncAca1 = P02RM4_A125BarAncAca1[0] ;
            A184BarMtr = P02RM4_A184BarMtr[0] ;
            A199BarPie1 = P02RM4_A199BarPie1[0] ;
            A365DisDes = P02RM4_A365DisDes[0] ;
            A898BarPieNDes = P02RM4_A898BarPieNDes[0] ;
            A184BarMtr = P02RM4_A184BarMtr[0] ;
            A199BarPie1 = P02RM4_A199BarPie1[0] ;
            A898BarPieNDes = P02RM4_A898BarPieNDes[0] ;
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A198BarPie = A898BarPieNDes ;
            }
            else
            {
               A198BarPie = A199BarPie1 ;
            }
            /*
               INSERT RECORD ON TABLE TXPBARCOM

            */
            A2524DisComLin = (byte)(1) ;
            A1056DisComCod = A135BarColNom ;
            A1032FonCod = A135BarColNom ;
            A1539BarComAnh = A125BarAncAca1 ;
            n1539BarComAnh = false ;
            A1541BarComMtr = A184BarMtr ;
            n1541BarComMtr = false ;
            A1543BarComPie = (short)(A198BarPie) ;
            n1543BarComPie = false ;
            A2117RecEstAnh = A125BarAncAca1 ;
            n2117RecEstAnh = false ;
            /* Using cursor P02RM5 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Boolean.valueOf(n1539BarComAnh), Short.valueOf(A1539BarComAnh), Boolean.valueOf(n1541BarComMtr), A1541BarComMtr, Boolean.valueOf(n1543BarComPie), Short.valueOf(A1543BarComPie), Boolean.valueOf(n2117RecEstAnh), Short.valueOf(A2117RecEstAnh)});
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
            /* End Insert */
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = palbtep1.this.A396EmprCod;
      this.aP1[0] = palbtep1.this.A129BarCod;
      this.aP2[0] = palbtep1.this.A132BarCodReo;
      this.aP3[0] = palbtep1.this.A130BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "palbtep1");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12Station = "" ;
      GXv_char1 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV13Usurcod = "" ;
      GXv_char3 = new String[1] ;
      AV10Bartipdis = "" ;
      scmdbuf = "" ;
      P02RM2_A396EmprCod = new String[] {""} ;
      P02RM2_A129BarCod = new int[1] ;
      P02RM2_A132BarCodReo = new byte[1] ;
      P02RM2_A130BarCodPar = new String[] {""} ;
      P02RM2_A2010BarTipDis = new String[] {""} ;
      P02RM2_A1032FonCod = new String[] {""} ;
      P02RM2_A1056DisComCod = new String[] {""} ;
      P02RM2_A2524DisComLin = new byte[1] ;
      P02RM2_A30AlbProCod = new long[1] ;
      A2010BarTipDis = "" ;
      A1032FonCod = "" ;
      A1056DisComCod = "" ;
      AV9Textoi = "" ;
      AV17Pgmname = "" ;
      P02RM4_A396EmprCod = new String[] {""} ;
      P02RM4_A129BarCod = new int[1] ;
      P02RM4_A132BarCodReo = new byte[1] ;
      P02RM4_A130BarCodPar = new String[] {""} ;
      P02RM4_A135BarColNom = new String[] {""} ;
      P02RM4_A125BarAncAca1 = new short[1] ;
      P02RM4_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02RM4_A199BarPie1 = new short[1] ;
      P02RM4_A365DisDes = new String[] {""} ;
      P02RM4_A898BarPieNDes = new int[1] ;
      A135BarColNom = "" ;
      A184BarMtr = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      A1541BarComMtr = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.palbtep1__default(),
         new Object[] {
             new Object[] {
            P02RM2_A396EmprCod, P02RM2_A129BarCod, P02RM2_A132BarCodReo, P02RM2_A130BarCodPar, P02RM2_A2010BarTipDis, P02RM2_A1032FonCod, P02RM2_A1056DisComCod, P02RM2_A2524DisComLin, P02RM2_A30AlbProCod
            }
            , new Object[] {
            P02RM4_A396EmprCod, P02RM4_A129BarCod, P02RM4_A132BarCodReo, P02RM4_A130BarCodPar, P02RM4_A135BarColNom, P02RM4_A125BarAncAca1, P02RM4_A184BarMtr, P02RM4_A199BarPie1, P02RM4_A365DisDes, P02RM4_A898BarPieNDes
            }
            , new Object[] {
            }
         }
      );
      AV17Pgmname = "PALBTEP1" ;
      /* GeneXus formulas. */
      AV17Pgmname = "PALBTEP1" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A2524DisComLin ;
   private short A125BarAncAca1 ;
   private short A199BarPie1 ;
   private short A1539BarComAnh ;
   private short A1543BarComPie ;
   private short A2117RecEstAnh ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV8Variantes ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int GX_INS542 ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A1541BarComMtr ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV12Station ;
   private String GXv_char1[] ;
   private String AV11EmprNom ;
   private String GXv_char2[] ;
   private String AV13Usurcod ;
   private String GXv_char3[] ;
   private String AV10Bartipdis ;
   private String scmdbuf ;
   private String A2010BarTipDis ;
   private String A1032FonCod ;
   private String A1056DisComCod ;
   private String AV17Pgmname ;
   private String A135BarColNom ;
   private String A365DisDes ;
   private String Gx_emsg ;
   private boolean n1539BarComAnh ;
   private boolean n1541BarComMtr ;
   private boolean n1543BarComPie ;
   private boolean n2117RecEstAnh ;
   private String AV9Textoi ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P02RM2_A396EmprCod ;
   private int[] P02RM2_A129BarCod ;
   private byte[] P02RM2_A132BarCodReo ;
   private String[] P02RM2_A130BarCodPar ;
   private String[] P02RM2_A2010BarTipDis ;
   private String[] P02RM2_A1032FonCod ;
   private String[] P02RM2_A1056DisComCod ;
   private byte[] P02RM2_A2524DisComLin ;
   private long[] P02RM2_A30AlbProCod ;
   private String[] P02RM4_A396EmprCod ;
   private int[] P02RM4_A129BarCod ;
   private byte[] P02RM4_A132BarCodReo ;
   private String[] P02RM4_A130BarCodPar ;
   private String[] P02RM4_A135BarColNom ;
   private short[] P02RM4_A125BarAncAca1 ;
   private java.math.BigDecimal[] P02RM4_A184BarMtr ;
   private short[] P02RM4_A199BarPie1 ;
   private String[] P02RM4_A365DisDes ;
   private int[] P02RM4_A898BarPieNDes ;
}

final  class palbtep1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02RM2", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.BarTipDis, T1.FonCod, T1.DisComCod, T1.DisComLin, T1.AlbProCod FROM (TXPALBEST T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisComLin, T1.DisComCod, T1.FonCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02RM4", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarColNom, T1.BarAncAca1, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02RM5", "INSERT INTO TXPBARCOM(EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, BarComAnh, BarComMtr, BarComPie, RecEstAnh, BarComMLan, BarComPLan, BarComPEst, BarComEst, BarMtrRep, BarMtrEst, BarGasOpe, BarGasEst, BarGasEmp, BarGasAca, BarPrcMtr, BarFecEst, BarNumMol, RecEstTMaq, BarCodLan, BarComPri, BarComRep, RecObsULin, BarComFC, BarComObs, BarMaqPor, CodMaqEst, OpeREst, OeStatus, OeFecHis, OeKill, BarFecFima, BarEstFima, BarComDibC, BarComDibI) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCOM")
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
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((long[]) buf[8])[0] = rslt.getLong(9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((int[]) buf[9])[0] = rslt.getInt(10);
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
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[14]).shortValue());
               }
               return;
      }
   }

}

