package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdventalm extends GXProcedure
{
   public pdventalm( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdventalm.class ), "" );
   }

   public pdventalm( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 ,
                          java.math.BigDecimal[] aP2 ,
                          long[] aP3 ,
                          java.util.Date[] aP4 ,
                          String[] aP5 ,
                          String[] aP6 ,
                          short[] aP7 ,
                          java.math.BigDecimal[] aP8 )
   {
      pdventalm.this.aP9 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        long[] aP3 ,
                        java.util.Date[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        short[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        int[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             long[] aP3 ,
                             java.util.Date[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             short[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             int[] aP9 )
   {
      pdventalm.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdventalm.this.AV22PrdNum = aP1[0];
      this.aP1 = aP1;
      pdventalm.this.AV21EntUnient = aP2[0];
      this.aP2 = aP2;
      pdventalm.this.AV24Pet_cod = aP3[0];
      this.aP3 = aP3;
      pdventalm.this.AV25Pet_fecha = aP4[0];
      this.aP4 = aP4;
      pdventalm.this.AV26ENtObs = aP5[0];
      this.aP5 = aP5;
      pdventalm.this.AV30CCStkDsc = aP6[0];
      this.aP6 = aP6;
      pdventalm.this.AV23DVUltLinEnt = aP7[0];
      this.aP7 = aP7;
      pdventalm.this.AV31DVPrdPreAct = aP8[0];
      this.aP8 = aP8;
      pdventalm.this.AV32DVPrvNum = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV27Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pdventalm.this.GXt_char1 = GXv_char2[0] ;
      AV27Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV28EmprNom ;
      GXv_char4[0] = AV29UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV27Station, GXv_char2, GXv_char3, GXv_char4) ;
      pdventalm.this.A396EmprCod = GXv_char2[0] ;
      pdventalm.this.AV28EmprNom = GXv_char3[0] ;
      pdventalm.this.AV29UsurCod = GXv_char4[0] ;
      /*
         INSERT RECORD ON TABLE LVNENTALM

      */
      A11935DVPrdNum = AV22PrdNum ;
      A11972DVLinEnt = AV23DVUltLinEnt ;
      A11973DVAlbaran = GXutil.str( AV24Pet_cod, 10, 0) ;
      n11973DVAlbaran = false ;
      A11974DVPedCod = 0 ;
      n11974DVPedCod = false ;
      A11975DVEntUniEn = AV21EntUnient ;
      n11975DVEntUniEn = false ;
      A11976DVEntPre = AV31DVPrdPreAct ;
      n11976DVEntPre = false ;
      A11977DVEntNumCo = (short)(0) ;
      n11977DVEntNumCo = false ;
      A11978DVEntUniRe = AV21EntUnient ;
      n11978DVEntUniRe = false ;
      A11979DVEntEti = (byte)(0) ;
      n11979DVEntEti = false ;
      A11980DVEntCon = (byte)(0) ;
      n11980DVEntCon = false ;
      A11981DVEntFecEn = AV25Pet_fecha ;
      n11981DVEntFecEn = false ;
      A11982DVEntConIn = 0 ;
      n11982DVEntConIn = false ;
      A11983DVEntConFi = 0 ;
      n11983DVEntConFi = false ;
      A11984DVEntPedCu = (byte)(0) ;
      n11984DVEntPedCu = false ;
      A11985DVEntNro = 0 ;
      n11985DVEntNro = false ;
      A11986DVEntFVal = GXutil.nullDate() ;
      n11986DVEntFVal = false ;
      A11987DVEntLotN = " " ;
      n11987DVEntLotN = false ;
      A11988DVEntFiCon = GXutil.nullDate() ;
      n11988DVEntFiCon = false ;
      A11989DVEntHiCon = GXutil.resetTime( GXutil.nullDate() );
      n11989DVEntHiCon = false ;
      A11990DVEntFfCon = GXutil.nullDate() ;
      n11990DVEntFfCon = false ;
      A11991DVEntHfCon = GXutil.resetTime( GXutil.nullDate() );
      n11991DVEntHfCon = false ;
      A11992DVEntBnc = " " ;
      n11992DVEntBnc = false ;
      A11993DVEntPrvNu = AV32DVPrvNum ;
      n11993DVEntPrvNu = false ;
      A11994DVEntCC = " " ;
      n11994DVEntCC = false ;
      A11995DVEntCCoCo = (short)(0) ;
      n11995DVEntCCoCo = false ;
      A11996DVEntRemTp = " " ;
      n11996DVEntRemTp = false ;
      A11997DVEntRemSu = " " ;
      n11997DVEntRemSu = false ;
      A11998DVEntRemFc = GXutil.nullDate() ;
      n11998DVEntRemFc = false ;
      A11999DVEntRemNr = " " ;
      n11999DVEntRemNr = false ;
      A12000DVEntUniAl = DecimalUtil.doubleToDec(0) ;
      n12000DVEntUniAl = false ;
      A12001DVEntObs = AV26ENtObs ;
      n12001DVEntObs = false ;
      /* Using cursor P04XL2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A11935DVPrdNum, Short.valueOf(A11972DVLinEnt), Boolean.valueOf(n11973DVAlbaran), A11973DVAlbaran, Boolean.valueOf(n11974DVPedCod), Integer.valueOf(A11974DVPedCod), Boolean.valueOf(n11975DVEntUniEn), A11975DVEntUniEn, Boolean.valueOf(n11976DVEntPre), A11976DVEntPre, Boolean.valueOf(n11977DVEntNumCo), Short.valueOf(A11977DVEntNumCo), Boolean.valueOf(n11978DVEntUniRe), A11978DVEntUniRe, Boolean.valueOf(n11979DVEntEti), Byte.valueOf(A11979DVEntEti), Boolean.valueOf(n11980DVEntCon), Byte.valueOf(A11980DVEntCon), Boolean.valueOf(n11981DVEntFecEn), A11981DVEntFecEn, Boolean.valueOf(n11982DVEntConIn), Integer.valueOf(A11982DVEntConIn), Boolean.valueOf(n11983DVEntConFi), Integer.valueOf(A11983DVEntConFi), Boolean.valueOf(n11984DVEntPedCu), Byte.valueOf(A11984DVEntPedCu), Boolean.valueOf(n11985DVEntNro), Integer.valueOf(A11985DVEntNro), Boolean.valueOf(n11986DVEntFVal), A11986DVEntFVal, Boolean.valueOf(n11987DVEntLotN), A11987DVEntLotN, Boolean.valueOf(n11988DVEntFiCon), A11988DVEntFiCon, Boolean.valueOf(n11989DVEntHiCon), A11989DVEntHiCon, Boolean.valueOf(n11990DVEntFfCon), A11990DVEntFfCon, Boolean.valueOf(n11991DVEntHfCon), A11991DVEntHfCon, Boolean.valueOf(n11992DVEntBnc), A11992DVEntBnc, Boolean.valueOf(n11993DVEntPrvNu), Integer.valueOf(A11993DVEntPrvNu), Boolean.valueOf(n11994DVEntCC), A11994DVEntCC, Boolean.valueOf(n11995DVEntCCoCo), Short.valueOf(A11995DVEntCCoCo), Boolean.valueOf(n11996DVEntRemTp), A11996DVEntRemTp, Boolean.valueOf(n11997DVEntRemSu), A11997DVEntRemSu, Boolean.valueOf(n11998DVEntRemFc), A11998DVEntRemFc, Boolean.valueOf(n11999DVEntRemNr), A11999DVEntRemNr, Boolean.valueOf(n12000DVEntUniAl), A12000DVEntUniAl, Boolean.valueOf(n12001DVEntObs), A12001DVEntObs});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("LVNENTALM");
      if ( (pr_default.getStatus(0) == 1) )
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
      n12005DVPrdExiAl = false ;
      n12007DVUltLinEn = false ;
      /* Optimized UPDATE. */
      /* Using cursor P04XL3 */
      pr_default.execute(1, new Object[] {AV21EntUnient, Boolean.valueOf(n12007DVUltLinEn), Short.valueOf(AV23DVUltLinEnt), A396EmprCod, AV22PrdNum});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("LVNDVPRODUC");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdventalm.this.A396EmprCod;
      this.aP1[0] = pdventalm.this.AV22PrdNum;
      this.aP2[0] = pdventalm.this.AV21EntUnient;
      this.aP3[0] = pdventalm.this.AV24Pet_cod;
      this.aP4[0] = pdventalm.this.AV25Pet_fecha;
      this.aP5[0] = pdventalm.this.AV26ENtObs;
      this.aP6[0] = pdventalm.this.AV30CCStkDsc;
      this.aP7[0] = pdventalm.this.AV23DVUltLinEnt;
      this.aP8[0] = pdventalm.this.AV31DVPrdPreAct;
      this.aP9[0] = pdventalm.this.AV32DVPrvNum;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdventalm");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV27Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV28EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV29UsurCod = "" ;
      GXv_char4 = new String[1] ;
      A11935DVPrdNum = "" ;
      A11973DVAlbaran = "" ;
      A11975DVEntUniEn = DecimalUtil.ZERO ;
      A11976DVEntPre = DecimalUtil.ZERO ;
      A11978DVEntUniRe = DecimalUtil.ZERO ;
      A11981DVEntFecEn = GXutil.nullDate() ;
      A11986DVEntFVal = GXutil.nullDate() ;
      A11987DVEntLotN = "" ;
      A11988DVEntFiCon = GXutil.nullDate() ;
      A11989DVEntHiCon = GXutil.resetTime( GXutil.nullDate() );
      A11990DVEntFfCon = GXutil.nullDate() ;
      A11991DVEntHfCon = GXutil.resetTime( GXutil.nullDate() );
      A11992DVEntBnc = "" ;
      A11994DVEntCC = "" ;
      A11996DVEntRemTp = "" ;
      A11997DVEntRemSu = "" ;
      A11998DVEntRemFc = GXutil.nullDate() ;
      A11999DVEntRemNr = "" ;
      A12000DVEntUniAl = DecimalUtil.ZERO ;
      A12001DVEntObs = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdventalm__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A11979DVEntEti ;
   private byte A11980DVEntCon ;
   private byte A11984DVEntPedCu ;
   private short AV23DVUltLinEnt ;
   private short A11972DVLinEnt ;
   private short A11977DVEntNumCo ;
   private short A11995DVEntCCoCo ;
   private short Gx_err ;
   private short A12007DVUltLinEn ;
   private int AV32DVPrvNum ;
   private int GX_INS1676 ;
   private int A11974DVPedCod ;
   private int A11982DVEntConIn ;
   private int A11983DVEntConFi ;
   private int A11985DVEntNro ;
   private int A11993DVEntPrvNu ;
   private long AV24Pet_cod ;
   private java.math.BigDecimal AV21EntUnient ;
   private java.math.BigDecimal AV31DVPrdPreAct ;
   private java.math.BigDecimal A11975DVEntUniEn ;
   private java.math.BigDecimal A11976DVEntPre ;
   private java.math.BigDecimal A11978DVEntUniRe ;
   private java.math.BigDecimal A12000DVEntUniAl ;
   private String A396EmprCod ;
   private String AV22PrdNum ;
   private String AV26ENtObs ;
   private String AV30CCStkDsc ;
   private String AV27Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV28EmprNom ;
   private String GXv_char3[] ;
   private String AV29UsurCod ;
   private String GXv_char4[] ;
   private String A11935DVPrdNum ;
   private String A11973DVAlbaran ;
   private String A11987DVEntLotN ;
   private String A11992DVEntBnc ;
   private String A11994DVEntCC ;
   private String A11996DVEntRemTp ;
   private String A11997DVEntRemSu ;
   private String A11999DVEntRemNr ;
   private String A12001DVEntObs ;
   private String Gx_emsg ;
   private java.util.Date A11989DVEntHiCon ;
   private java.util.Date A11991DVEntHfCon ;
   private java.util.Date AV25Pet_fecha ;
   private java.util.Date A11981DVEntFecEn ;
   private java.util.Date A11986DVEntFVal ;
   private java.util.Date A11988DVEntFiCon ;
   private java.util.Date A11990DVEntFfCon ;
   private java.util.Date A11998DVEntRemFc ;
   private boolean n11973DVAlbaran ;
   private boolean n11974DVPedCod ;
   private boolean n11975DVEntUniEn ;
   private boolean n11976DVEntPre ;
   private boolean n11977DVEntNumCo ;
   private boolean n11978DVEntUniRe ;
   private boolean n11979DVEntEti ;
   private boolean n11980DVEntCon ;
   private boolean n11981DVEntFecEn ;
   private boolean n11982DVEntConIn ;
   private boolean n11983DVEntConFi ;
   private boolean n11984DVEntPedCu ;
   private boolean n11985DVEntNro ;
   private boolean n11986DVEntFVal ;
   private boolean n11987DVEntLotN ;
   private boolean n11988DVEntFiCon ;
   private boolean n11989DVEntHiCon ;
   private boolean n11990DVEntFfCon ;
   private boolean n11991DVEntHfCon ;
   private boolean n11992DVEntBnc ;
   private boolean n11993DVEntPrvNu ;
   private boolean n11994DVEntCC ;
   private boolean n11995DVEntCCoCo ;
   private boolean n11996DVEntRemTp ;
   private boolean n11997DVEntRemSu ;
   private boolean n11998DVEntRemFc ;
   private boolean n11999DVEntRemNr ;
   private boolean n12000DVEntUniAl ;
   private boolean n12001DVEntObs ;
   private boolean n12005DVPrdExiAl ;
   private boolean n12007DVUltLinEn ;
   private int[] aP9 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private long[] aP3 ;
   private java.util.Date[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private short[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private IDataStoreProvider pr_default ;
}

final  class pdventalm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P04XL2", "INSERT INTO LVNENTALM(Emprcod, Prdnum, LinEnt, Albaran, PedCod, EntUniEnt, EntPre, EntNumCon, EntUniRem, EntEti, EntCon, EntFecEnt, EntConIni, EntConFin, EntPedCum, EntNro, EntFVal, EntLotN, EntFiCon, EntHiCon, EntFfCon, EntHfCon, EntBnc, EntPrvNum, EntCC, EntCCoCod, EntRemTpo, EntRemSuc, EntRemFch, EntRemNro, EntUniAlB, EntObs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "LVNENTALM")
         ,new UpdateCursor("P04XL3", "UPDATE LVNDVPRODUC SET PrdExiAlm=PrdExiAlm + ?, UltLinEnt=?  WHERE Emprcod = ? and Prdnum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "LVNDVPRODUC")
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
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 10);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[6]).intValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[10], 5);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[12]).shortValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[14], 4);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[16]).byteValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[18]).byteValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DATE );
               }
               else
               {
                  stmt.setDate(12, (java.util.Date)parms[20]);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(13, ((Number) parms[22]).intValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[24]).intValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[26]).byteValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(16, ((Number) parms[28]).intValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DATE );
               }
               else
               {
                  stmt.setDate(17, (java.util.Date)parms[30]);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[32], 26);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DATE );
               }
               else
               {
                  stmt.setDate(19, (java.util.Date)parms[34]);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(20, (java.util.Date)parms[36], false);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DATE );
               }
               else
               {
                  stmt.setDate(21, (java.util.Date)parms[38]);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(22, (java.util.Date)parms[40], false);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[42], 10);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(24, ((Number) parms[44]).intValue());
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[46], 1);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(26, ((Number) parms[48]).shortValue());
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[50], 4);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[52], 4);
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.DATE );
               }
               else
               {
                  stmt.setDate(29, (java.util.Date)parms[54]);
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[56], 12);
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(31, (java.math.BigDecimal)parms[58], 4);
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(32, (String)parms[60], 100);
               }
               return;
            case 1 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               stmt.setString(3, (String)parms[3], 3);
               stmt.setString(4, (String)parms[4], 6);
               return;
      }
   }

}

