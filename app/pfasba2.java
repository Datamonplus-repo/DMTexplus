package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfasba2 extends GXProcedure
{
   public pfasba2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfasba2.class ), "" );
   }

   public pfasba2( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 )
   {
      pfasba2.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 )
   {
      pfasba2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfasba2.this.AV12DisCod = aP1[0];
      this.aP1 = aP1;
      pfasba2.this.AV13BarCodNew = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV20Refugio ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "REFUGI", ""), GXv_int1) ;
      pfasba2.this.AV20Refugio = GXv_int1[0] ;
      AV24GXLvl4 = (byte)(0) ;
      /* Using cursor P01FE2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV12DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P01FE2_A361DisCod[0] ;
         A3403DisRefPie = P01FE2_A3403DisRefPie[0] ;
         n3403DisRefPie = P01FE2_n3403DisRefPie[0] ;
         A3398DisRefBarC = P01FE2_A3398DisRefBarC[0] ;
         A3399DisRefBCRe = P01FE2_A3399DisRefBCRe[0] ;
         A3400DisRefBCPa = P01FE2_A3400DisRefBCPa[0] ;
         A3607DisRefBPie = P01FE2_A3607DisRefBPie[0] ;
         AV24GXLvl4 = (byte)(1) ;
         AV16BarCodStI = A3398DisRefBarC ;
         AV14BarReoStI = A3399DisRefBCRe ;
         AV15BarParStI = A3400DisRefBCPa ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV24GXLvl4 == 0 )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Using cursor P01FE3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV16BarCodStI), Byte.valueOf(AV14BarReoStI), AV15BarParStI});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A130BarCodPar = P01FE3_A130BarCodPar[0] ;
         A132BarCodReo = P01FE3_A132BarCodReo[0] ;
         A129BarCod = P01FE3_A129BarCod[0] ;
         A153BarFasEst = P01FE3_A153BarFasEst[0] ;
         A758ProCod = P01FE3_A758ProCod[0] ;
         A457FasCod = P01FE3_A457FasCod[0] ;
         A160BarFecRea = P01FE3_A160BarFecRea[0] ;
         A4022BarNumBot = P01FE3_A4022BarNumBot[0] ;
         A194BarOrdLin = P01FE3_A194BarOrdLin[0] ;
         if ( A153BarFasEst == 2 )
         {
            AV17ProCod = A758ProCod ;
            AV18FasCod = A457FasCod ;
            AV19BarFecRea = A160BarFecRea ;
            AV21BarNumBot = A4022BarNumBot ;
            /* Execute user subroutine: 'CAMBIA' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      cleanup();
   }

   public void S111( )
   {
      /* 'CAMBIA' Routine */
      returnInSub = false ;
      if ( AV20Refugio == 1 )
      {
         /* Using cursor P01FE4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV13BarCodNew), AV18FasCod});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A457FasCod = P01FE4_A457FasCod[0] ;
            A130BarCodPar = P01FE4_A130BarCodPar[0] ;
            A132BarCodReo = P01FE4_A132BarCodReo[0] ;
            A129BarCod = P01FE4_A129BarCod[0] ;
            A153BarFasEst = P01FE4_A153BarFasEst[0] ;
            A160BarFecRea = P01FE4_A160BarFecRea[0] ;
            A4022BarNumBot = P01FE4_A4022BarNumBot[0] ;
            A758ProCod = P01FE4_A758ProCod[0] ;
            A194BarOrdLin = P01FE4_A194BarOrdLin[0] ;
            if ( A153BarFasEst == 0 )
            {
               A153BarFasEst = (byte)(2) ;
               A160BarFecRea = AV19BarFecRea ;
               A4022BarNumBot = AV21BarNumBot ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               /* Using cursor P01FE5 */
               pr_default.execute(3, new Object[] {Byte.valueOf(A153BarFasEst), A160BarFecRea, Integer.valueOf(A4022BarNumBot), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
               if (true) break;
            }
            /* Using cursor P01FE6 */
            pr_default.execute(4, new Object[] {Byte.valueOf(A153BarFasEst), A160BarFecRea, Integer.valueOf(A4022BarNumBot), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
            pr_default.readNext(2);
         }
         pr_default.close(2);
      }
      else
      {
         /* Using cursor P01FE7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV13BarCodNew), AV17ProCod, AV18FasCod});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A457FasCod = P01FE7_A457FasCod[0] ;
            A758ProCod = P01FE7_A758ProCod[0] ;
            A130BarCodPar = P01FE7_A130BarCodPar[0] ;
            A132BarCodReo = P01FE7_A132BarCodReo[0] ;
            A129BarCod = P01FE7_A129BarCod[0] ;
            A153BarFasEst = P01FE7_A153BarFasEst[0] ;
            A160BarFecRea = P01FE7_A160BarFecRea[0] ;
            A194BarOrdLin = P01FE7_A194BarOrdLin[0] ;
            if ( A153BarFasEst == 0 )
            {
               A153BarFasEst = (byte)(2) ;
               A160BarFecRea = AV19BarFecRea ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               /* Using cursor P01FE8 */
               pr_default.execute(6, new Object[] {Byte.valueOf(A153BarFasEst), A160BarFecRea, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
               if (true) break;
            }
            /* Using cursor P01FE9 */
            pr_default.execute(7, new Object[] {Byte.valueOf(A153BarFasEst), A160BarFecRea, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
            pr_default.readNext(5);
         }
         pr_default.close(5);
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfasba2.this.A396EmprCod;
      this.aP1[0] = pfasba2.this.AV12DisCod;
      this.aP2[0] = pfasba2.this.AV13BarCodNew;
      Application.commitDataStores(context, remoteHandle, pr_default, "pfasba2");
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
      P01FE2_A396EmprCod = new String[] {""} ;
      P01FE2_A361DisCod = new int[1] ;
      P01FE2_A3403DisRefPie = new short[1] ;
      P01FE2_n3403DisRefPie = new boolean[] {false} ;
      P01FE2_A3398DisRefBarC = new int[1] ;
      P01FE2_A3399DisRefBCRe = new byte[1] ;
      P01FE2_A3400DisRefBCPa = new String[] {""} ;
      P01FE2_A3607DisRefBPie = new String[] {""} ;
      A3400DisRefBCPa = "" ;
      A3607DisRefBPie = "" ;
      AV15BarParStI = "" ;
      P01FE3_A396EmprCod = new String[] {""} ;
      P01FE3_A130BarCodPar = new String[] {""} ;
      P01FE3_A132BarCodReo = new byte[1] ;
      P01FE3_A129BarCod = new int[1] ;
      P01FE3_A153BarFasEst = new byte[1] ;
      P01FE3_A758ProCod = new String[] {""} ;
      P01FE3_A457FasCod = new String[] {""} ;
      P01FE3_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P01FE3_A4022BarNumBot = new int[1] ;
      P01FE3_A194BarOrdLin = new short[1] ;
      A130BarCodPar = "" ;
      A758ProCod = "" ;
      A457FasCod = "" ;
      A160BarFecRea = GXutil.nullDate() ;
      AV17ProCod = "" ;
      AV18FasCod = "" ;
      AV19BarFecRea = GXutil.nullDate() ;
      P01FE4_A396EmprCod = new String[] {""} ;
      P01FE4_A457FasCod = new String[] {""} ;
      P01FE4_A130BarCodPar = new String[] {""} ;
      P01FE4_A132BarCodReo = new byte[1] ;
      P01FE4_A129BarCod = new int[1] ;
      P01FE4_A153BarFasEst = new byte[1] ;
      P01FE4_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P01FE4_A4022BarNumBot = new int[1] ;
      P01FE4_A758ProCod = new String[] {""} ;
      P01FE4_A194BarOrdLin = new short[1] ;
      P01FE7_A396EmprCod = new String[] {""} ;
      P01FE7_A457FasCod = new String[] {""} ;
      P01FE7_A758ProCod = new String[] {""} ;
      P01FE7_A130BarCodPar = new String[] {""} ;
      P01FE7_A132BarCodReo = new byte[1] ;
      P01FE7_A129BarCod = new int[1] ;
      P01FE7_A153BarFasEst = new byte[1] ;
      P01FE7_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P01FE7_A194BarOrdLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfasba2__default(),
         new Object[] {
             new Object[] {
            P01FE2_A396EmprCod, P01FE2_A361DisCod, P01FE2_A3403DisRefPie, P01FE2_n3403DisRefPie, P01FE2_A3398DisRefBarC, P01FE2_A3399DisRefBCRe, P01FE2_A3400DisRefBCPa, P01FE2_A3607DisRefBPie
            }
            , new Object[] {
            P01FE3_A396EmprCod, P01FE3_A130BarCodPar, P01FE3_A132BarCodReo, P01FE3_A129BarCod, P01FE3_A153BarFasEst, P01FE3_A758ProCod, P01FE3_A457FasCod, P01FE3_A160BarFecRea, P01FE3_A4022BarNumBot, P01FE3_A194BarOrdLin
            }
            , new Object[] {
            P01FE4_A396EmprCod, P01FE4_A457FasCod, P01FE4_A130BarCodPar, P01FE4_A132BarCodReo, P01FE4_A129BarCod, P01FE4_A153BarFasEst, P01FE4_A160BarFecRea, P01FE4_A4022BarNumBot, P01FE4_A758ProCod, P01FE4_A194BarOrdLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01FE7_A396EmprCod, P01FE7_A457FasCod, P01FE7_A758ProCod, P01FE7_A130BarCodPar, P01FE7_A132BarCodReo, P01FE7_A129BarCod, P01FE7_A153BarFasEst, P01FE7_A160BarFecRea, P01FE7_A194BarOrdLin
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

   private byte AV20Refugio ;
   private byte GXv_int1[] ;
   private byte AV24GXLvl4 ;
   private byte A3399DisRefBCRe ;
   private byte AV14BarReoStI ;
   private byte A132BarCodReo ;
   private byte A153BarFasEst ;
   private short A3403DisRefPie ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int AV12DisCod ;
   private int AV13BarCodNew ;
   private int A361DisCod ;
   private int A3398DisRefBarC ;
   private int AV16BarCodStI ;
   private int A129BarCod ;
   private int A4022BarNumBot ;
   private int AV21BarNumBot ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A3400DisRefBCPa ;
   private String A3607DisRefBPie ;
   private String AV15BarParStI ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String A457FasCod ;
   private String AV17ProCod ;
   private String AV18FasCod ;
   private java.util.Date A160BarFecRea ;
   private java.util.Date AV19BarFecRea ;
   private boolean n3403DisRefPie ;
   private boolean returnInSub ;
   private int[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P01FE2_A396EmprCod ;
   private int[] P01FE2_A361DisCod ;
   private short[] P01FE2_A3403DisRefPie ;
   private boolean[] P01FE2_n3403DisRefPie ;
   private int[] P01FE2_A3398DisRefBarC ;
   private byte[] P01FE2_A3399DisRefBCRe ;
   private String[] P01FE2_A3400DisRefBCPa ;
   private String[] P01FE2_A3607DisRefBPie ;
   private String[] P01FE3_A396EmprCod ;
   private String[] P01FE3_A130BarCodPar ;
   private byte[] P01FE3_A132BarCodReo ;
   private int[] P01FE3_A129BarCod ;
   private byte[] P01FE3_A153BarFasEst ;
   private String[] P01FE3_A758ProCod ;
   private String[] P01FE3_A457FasCod ;
   private java.util.Date[] P01FE3_A160BarFecRea ;
   private int[] P01FE3_A4022BarNumBot ;
   private short[] P01FE3_A194BarOrdLin ;
   private String[] P01FE4_A396EmprCod ;
   private String[] P01FE4_A457FasCod ;
   private String[] P01FE4_A130BarCodPar ;
   private byte[] P01FE4_A132BarCodReo ;
   private int[] P01FE4_A129BarCod ;
   private byte[] P01FE4_A153BarFasEst ;
   private java.util.Date[] P01FE4_A160BarFecRea ;
   private int[] P01FE4_A4022BarNumBot ;
   private String[] P01FE4_A758ProCod ;
   private short[] P01FE4_A194BarOrdLin ;
   private String[] P01FE7_A396EmprCod ;
   private String[] P01FE7_A457FasCod ;
   private String[] P01FE7_A758ProCod ;
   private String[] P01FE7_A130BarCodPar ;
   private byte[] P01FE7_A132BarCodReo ;
   private int[] P01FE7_A129BarCod ;
   private byte[] P01FE7_A153BarFasEst ;
   private java.util.Date[] P01FE7_A160BarFecRea ;
   private short[] P01FE7_A194BarOrdLin ;
}

final  class pfasba2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01FE2", "SELECT EmprCod, DisCod, DisRefPie, DisRefBarC, DisRefBCRe, DisRefBCPa, DisRefBPie FROM TXPDISREF WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01FE3", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarFasEst, ProCod, FasCod, BarFecRea, BarNumBot, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01FE4", "SELECT EmprCod, FasCod, BarCodPar, BarCodReo, BarCod, BarFasEst, BarFecRea, BarNumBot, ProCod, BarOrdLin FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = 0 and BarCodPar = ' ') AND (FasCod = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01FE5", "UPDATE TXPBARFAS SET BarFasEst=?, BarFecRea=?, BarNumBot=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new UpdateCursor("P01FE6", "UPDATE TXPBARFAS SET BarFasEst=?, BarFecRea=?, BarNumBot=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new ForEachCursor("P01FE7", "SELECT EmprCod, FasCod, ProCod, BarCodPar, BarCodReo, BarCod, BarFasEst, BarFecRea, BarOrdLin FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = 0 and BarCodPar = ' ' and ProCod = ?) AND (FasCod = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01FE8", "UPDATE TXPBARFAS SET BarFasEst=?, BarFecRea=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new UpdateCursor("P01FE9", "UPDATE TXPBARFAS SET BarFasEst=?, BarFecRea=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
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
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 3 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 8);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 4 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 8);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 6 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 8);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 7 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 8);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
      }
   }

}

