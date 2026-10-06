package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprdcop extends GXProcedure
{
   public pprdcop( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprdcop.class ), "" );
   }

   public pprdcop( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 )
   {
      pprdcop.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 )
   {
      pprdcop.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprdcop.this.AV15AlbProCod = aP1[0];
      this.aP1 = aP1;
      pprdcop.this.AV16BarCod = aP2[0];
      this.aP2 = aP2;
      pprdcop.this.AV17BarCodReo = aP3[0];
      this.aP3 = aP3;
      pprdcop.this.AV18BarCodPar = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01PP2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(AV15AlbProCod), Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P01PP2_A130BarCodPar[0] ;
         A132BarCodReo = P01PP2_A132BarCodReo[0] ;
         A129BarCod = P01PP2_A129BarCod[0] ;
         A30AlbProCod = P01PP2_A30AlbProCod[0] ;
         A1261BarAlbKgmE = P01PP2_A1261BarAlbKgmE[0] ;
         A1265BarAlbPie = P01PP2_A1265BarAlbPie[0] ;
         AV50FasKgm = A1261BarAlbKgmE ;
         AV51FasMtr = DecimalUtil.doubleToDec(A1265BarAlbPie) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV20LinPro = (short)(0) ;
      /* Using cursor P01PP3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A130BarCodPar = P01PP3_A130BarCodPar[0] ;
         A132BarCodReo = P01PP3_A132BarCodReo[0] ;
         A129BarCod = P01PP3_A129BarCod[0] ;
         A758ProCod = P01PP3_A758ProCod[0] ;
         n758ProCod = P01PP3_n758ProCod[0] ;
         /* Execute user subroutine: 'PRECIOS' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      n1467AlbPrdULin = false ;
      /* Optimized UPDATE. */
      /* Using cursor P01PP4 */
      pr_default.execute(2, new Object[] {Boolean.valueOf(n1467AlbPrdULin), Short.valueOf(AV20LinPro), A396EmprCod, Long.valueOf(AV15AlbProCod), Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
      /* End optimized UPDATE. */
      cleanup();
   }

   public void S111( )
   {
      /* 'PRECIOS' Routine */
      returnInSub = false ;
      /* Using cursor P01PP5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV25CliCod), AV24ProCod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A5401Cli_ProPK = P01PP5_A5401Cli_ProPK[0] ;
         n5401Cli_ProPK = P01PP5_n5401Cli_ProPK[0] ;
         A5403Cli_ProPP = P01PP5_A5403Cli_ProPP[0] ;
         n5403Cli_ProPP = P01PP5_n5403Cli_ProPP[0] ;
         A5398Cli_Proc = P01PP5_A5398Cli_Proc[0] ;
         A252CliCod = P01PP5_A252CliCod[0] ;
         AV20LinPro = (short)(AV20LinPro+1) ;
         /*
            INSERT RECORD ON TABLE TXPALBPRD

         */
         A30AlbProCod = AV15AlbProCod ;
         A129BarCod = AV16BarCod ;
         A132BarCodReo = AV17BarCodReo ;
         A130BarCodPar = AV18BarCodPar ;
         A1468AlbPrdLin = AV20LinPro ;
         A758ProCod = AV24ProCod ;
         n758ProCod = false ;
         A1471PrdKgm = AV50FasKgm ;
         n1471PrdKgm = false ;
         A1472PrdMtr = AV51FasMtr ;
         n1472PrdMtr = false ;
         A1469AlbPrdPKg = A5401Cli_ProPK ;
         n1469AlbPrdPKg = false ;
         A1470AlbPrdPMt = A5403Cli_ProPP ;
         n1470AlbPrdPMt = false ;
         A4332ProPreRec = DecimalUtil.doubleToDec(0) ;
         n4332ProPreRec = false ;
         A4333ProPorRec = DecimalUtil.doubleToDec(0) ;
         n4333ProPorRec = false ;
         A3887AlbPrdCli = 0 ;
         n3887AlbPrdCli = false ;
         A4356AlbPrdDcK = " " ;
         n4356AlbPrdDcK = false ;
         A4357AlbPrdDcM = " " ;
         n4357AlbPrdDcM = false ;
         /* Using cursor P01PP6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1468AlbPrdLin), Boolean.valueOf(n1469AlbPrdPKg), A1469AlbPrdPKg, Boolean.valueOf(n1470AlbPrdPMt), A1470AlbPrdPMt, Boolean.valueOf(n1471PrdKgm), A1471PrdKgm, Boolean.valueOf(n1472PrdMtr), A1472PrdMtr, Boolean.valueOf(n758ProCod), A758ProCod, Boolean.valueOf(n4332ProPreRec), A4332ProPreRec, Boolean.valueOf(n4333ProPorRec), A4333ProPorRec, Boolean.valueOf(n4356AlbPrdDcK), A4356AlbPrdDcK, Boolean.valueOf(n4357AlbPrdDcM), A4357AlbPrdDcM, Boolean.valueOf(n3887AlbPrdCli), Integer.valueOf(A3887AlbPrdCli)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBPRD");
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
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprdcop.this.A396EmprCod;
      this.aP1[0] = pprdcop.this.AV15AlbProCod;
      this.aP2[0] = pprdcop.this.AV16BarCod;
      this.aP3[0] = pprdcop.this.AV17BarCodReo;
      this.aP4[0] = pprdcop.this.AV18BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pprdcop");
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
      P01PP2_A396EmprCod = new String[] {""} ;
      P01PP2_A130BarCodPar = new String[] {""} ;
      P01PP2_A132BarCodReo = new byte[1] ;
      P01PP2_A129BarCod = new int[1] ;
      P01PP2_A30AlbProCod = new long[1] ;
      P01PP2_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01PP2_A1265BarAlbPie = new int[1] ;
      A130BarCodPar = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      AV50FasKgm = DecimalUtil.ZERO ;
      AV51FasMtr = DecimalUtil.ZERO ;
      P01PP3_A396EmprCod = new String[] {""} ;
      P01PP3_A130BarCodPar = new String[] {""} ;
      P01PP3_A132BarCodReo = new byte[1] ;
      P01PP3_A129BarCod = new int[1] ;
      P01PP3_A758ProCod = new String[] {""} ;
      P01PP3_n758ProCod = new boolean[] {false} ;
      A758ProCod = "" ;
      AV24ProCod = "" ;
      P01PP5_A396EmprCod = new String[] {""} ;
      P01PP5_A5401Cli_ProPK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01PP5_n5401Cli_ProPK = new boolean[] {false} ;
      P01PP5_A5403Cli_ProPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01PP5_n5403Cli_ProPP = new boolean[] {false} ;
      P01PP5_A5398Cli_Proc = new String[] {""} ;
      P01PP5_A252CliCod = new int[1] ;
      A5401Cli_ProPK = DecimalUtil.ZERO ;
      A5403Cli_ProPP = DecimalUtil.ZERO ;
      A5398Cli_Proc = "" ;
      A1471PrdKgm = DecimalUtil.ZERO ;
      A1472PrdMtr = DecimalUtil.ZERO ;
      A1469AlbPrdPKg = DecimalUtil.ZERO ;
      A1470AlbPrdPMt = DecimalUtil.ZERO ;
      A4332ProPreRec = DecimalUtil.ZERO ;
      A4333ProPorRec = DecimalUtil.ZERO ;
      A4356AlbPrdDcK = "" ;
      A4357AlbPrdDcM = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprdcop__default(),
         new Object[] {
             new Object[] {
            P01PP2_A396EmprCod, P01PP2_A130BarCodPar, P01PP2_A132BarCodReo, P01PP2_A129BarCod, P01PP2_A30AlbProCod, P01PP2_A1261BarAlbKgmE, P01PP2_A1265BarAlbPie
            }
            , new Object[] {
            P01PP3_A396EmprCod, P01PP3_A130BarCodPar, P01PP3_A132BarCodReo, P01PP3_A129BarCod, P01PP3_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            P01PP5_A396EmprCod, P01PP5_A5401Cli_ProPK, P01PP5_n5401Cli_ProPK, P01PP5_A5403Cli_ProPP, P01PP5_n5403Cli_ProPP, P01PP5_A5398Cli_Proc, P01PP5_A252CliCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17BarCodReo ;
   private byte A132BarCodReo ;
   private short AV20LinPro ;
   private short A1467AlbPrdULin ;
   private short A1468AlbPrdLin ;
   private short Gx_err ;
   private int AV16BarCod ;
   private int A129BarCod ;
   private int A1265BarAlbPie ;
   private int AV25CliCod ;
   private int A252CliCod ;
   private int GX_INS210 ;
   private int A3887AlbPrdCli ;
   private long AV15AlbProCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal AV50FasKgm ;
   private java.math.BigDecimal AV51FasMtr ;
   private java.math.BigDecimal A5401Cli_ProPK ;
   private java.math.BigDecimal A5403Cli_ProPP ;
   private java.math.BigDecimal A1471PrdKgm ;
   private java.math.BigDecimal A1472PrdMtr ;
   private java.math.BigDecimal A1469AlbPrdPKg ;
   private java.math.BigDecimal A1470AlbPrdPMt ;
   private java.math.BigDecimal A4332ProPreRec ;
   private java.math.BigDecimal A4333ProPorRec ;
   private String A396EmprCod ;
   private String AV18BarCodPar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String AV24ProCod ;
   private String A5398Cli_Proc ;
   private String A4356AlbPrdDcK ;
   private String A4357AlbPrdDcM ;
   private String Gx_emsg ;
   private boolean n758ProCod ;
   private boolean returnInSub ;
   private boolean n1467AlbPrdULin ;
   private boolean n5401Cli_ProPK ;
   private boolean n5403Cli_ProPP ;
   private boolean n1471PrdKgm ;
   private boolean n1472PrdMtr ;
   private boolean n1469AlbPrdPKg ;
   private boolean n1470AlbPrdPMt ;
   private boolean n4332ProPreRec ;
   private boolean n4333ProPorRec ;
   private boolean n3887AlbPrdCli ;
   private boolean n4356AlbPrdDcK ;
   private boolean n4357AlbPrdDcM ;
   private String[] aP4 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P01PP2_A396EmprCod ;
   private String[] P01PP2_A130BarCodPar ;
   private byte[] P01PP2_A132BarCodReo ;
   private int[] P01PP2_A129BarCod ;
   private long[] P01PP2_A30AlbProCod ;
   private java.math.BigDecimal[] P01PP2_A1261BarAlbKgmE ;
   private int[] P01PP2_A1265BarAlbPie ;
   private String[] P01PP3_A396EmprCod ;
   private String[] P01PP3_A130BarCodPar ;
   private byte[] P01PP3_A132BarCodReo ;
   private int[] P01PP3_A129BarCod ;
   private String[] P01PP3_A758ProCod ;
   private boolean[] P01PP3_n758ProCod ;
   private String[] P01PP5_A396EmprCod ;
   private java.math.BigDecimal[] P01PP5_A5401Cli_ProPK ;
   private boolean[] P01PP5_n5401Cli_ProPK ;
   private java.math.BigDecimal[] P01PP5_A5403Cli_ProPP ;
   private boolean[] P01PP5_n5403Cli_ProPP ;
   private String[] P01PP5_A5398Cli_Proc ;
   private int[] P01PP5_A252CliCod ;
}

final  class pprdcop__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01PP2", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, AlbProCod, BarAlbKgmE, BarAlbPie FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01PP3", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, ProCod FROM TXPBARPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01PP4", "UPDATE TXPALBBAR SET AlbPrdULin=?  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
         ,new ForEachCursor("P01PP5", "SELECT EmprCod, Cli_ProPK, Cli_ProPP, Cli_Proc, CliCod FROM TXPCLIPRL WHERE EmprCod = ? and CliCod = ? and Cli_Proc = ? ORDER BY EmprCod, CliCod, Cli_Proc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01PP6", "INSERT INTO TXPALBPRD(EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPrdLin, AlbPrdPKg, AlbPrdPMt, PrdKgm, PrdMtr, ProCod, ProPreRec, ProPorRec, AlbPrdDcK, AlbPrdDcM, AlbPrdCli) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBPRD")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 8);
               ((int[]) buf[6])[0] = rslt.getInt(5);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setLong(3, ((Number) parms[3]).longValue());
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[7], 5);
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
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[15], 8);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[17], 5);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[19], 2);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[21], 40);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[23], 40);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(16, ((Number) parms[25]).intValue());
               }
               return;
      }
   }

}

