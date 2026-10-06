package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprofs02 extends GXProcedure
{
   public pprofs02( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprofs02.class ), "" );
   }

   public pprofs02( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pprofs02.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pprofs02.this.AV8EmprCod = aP0[0];
      this.aP0 = aP0;
      pprofs02.this.AV9BarCod = aP1[0];
      this.aP1 = aP1;
      pprofs02.this.AV10BarCodReo = aP2[0];
      this.aP2 = aP2;
      pprofs02.this.AV11BarCodPar = aP3[0];
      this.aP3 = aP3;
      pprofs02.this.AV12ProCod = aP4[0];
      this.aP4 = aP4;
      pprofs02.this.AV13Modo = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04VI2 */
      pr_default.execute(0, new Object[] {AV8EmprCod, Integer.valueOf(AV9BarCod), Byte.valueOf(AV10BarCodReo), AV11BarCodPar, AV12ProCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A758ProCod = P04VI2_A758ProCod[0] ;
         A130BarCodPar = P04VI2_A130BarCodPar[0] ;
         A132BarCodReo = P04VI2_A132BarCodReo[0] ;
         A129BarCod = P04VI2_A129BarCod[0] ;
         A396EmprCod = P04VI2_A396EmprCod[0] ;
         A761ProFasLin = P04VI2_A761ProFasLin[0] ;
         n761ProFasLin = P04VI2_n761ProFasLin[0] ;
         /* Using cursor P04VI3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A194BarOrdLin = P04VI3_A194BarOrdLin[0] ;
            A152BarFasCon = P04VI3_A152BarFasCon[0] ;
            /* Optimized DELETE. */
            /* Using cursor P04VI4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBarPar");
            /* End optimized DELETE. */
            /* Using cursor P04VI5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A4643BarFasLot = P04VI5_A4643BarFasLot[0] ;
               A4303BarFasEst1 = P04VI5_A4303BarFasEst1[0] ;
               n4303BarFasEst1 = P04VI5_n4303BarFasEst1[0] ;
               /* Using cursor P04VI6 */
               pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
               while ( (pr_default.getStatus(4) != 101) )
               {
                  A10084BarPFcod = P04VI6_A10084BarPFcod[0] ;
                  pr_default.readNext(4);
               }
               pr_default.close(4);
               /* Using cursor P04VI7 */
               pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASMAQ");
               pr_default.readNext(3);
            }
            pr_default.close(3);
            /* Optimized DELETE. */
            /* Using cursor P04VI8 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASQUI");
            /* End optimized DELETE. */
            /* Using cursor P04VI9 */
            pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
            while ( (pr_default.getStatus(7) != 101) )
            {
               A7934Dtb_Ordl = P04VI9_A7934Dtb_Ordl[0] ;
               /* Optimized DELETE. */
               /* Using cursor P04VI10 */
               pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A7934Dtb_Ordl)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT0051");
               /* End optimized DELETE. */
               /* Using cursor P04VI11 */
               pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A7934Dtb_Ordl)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT005");
               pr_default.readNext(7);
            }
            pr_default.close(7);
            /* Using cursor P04VI12 */
            pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor P04VI13 */
         pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPRO");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprofs02.this.AV8EmprCod;
      this.aP1[0] = pprofs02.this.AV9BarCod;
      this.aP2[0] = pprofs02.this.AV10BarCodReo;
      this.aP3[0] = pprofs02.this.AV11BarCodPar;
      this.aP4[0] = pprofs02.this.AV12ProCod;
      this.aP5[0] = pprofs02.this.AV13Modo;
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
      P04VI2_A758ProCod = new String[] {""} ;
      P04VI2_A130BarCodPar = new String[] {""} ;
      P04VI2_A132BarCodReo = new byte[1] ;
      P04VI2_A129BarCod = new int[1] ;
      P04VI2_A396EmprCod = new String[] {""} ;
      P04VI2_A761ProFasLin = new short[1] ;
      P04VI2_n761ProFasLin = new boolean[] {false} ;
      A758ProCod = "" ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      P04VI3_A396EmprCod = new String[] {""} ;
      P04VI3_A129BarCod = new int[1] ;
      P04VI3_A132BarCodReo = new byte[1] ;
      P04VI3_A130BarCodPar = new String[] {""} ;
      P04VI3_A758ProCod = new String[] {""} ;
      P04VI3_A194BarOrdLin = new short[1] ;
      P04VI3_A152BarFasCon = new String[] {""} ;
      A152BarFasCon = "" ;
      P04VI5_A396EmprCod = new String[] {""} ;
      P04VI5_A129BarCod = new int[1] ;
      P04VI5_A132BarCodReo = new byte[1] ;
      P04VI5_A130BarCodPar = new String[] {""} ;
      P04VI5_A758ProCod = new String[] {""} ;
      P04VI5_A194BarOrdLin = new short[1] ;
      P04VI5_A4643BarFasLot = new int[1] ;
      P04VI5_A4303BarFasEst1 = new byte[1] ;
      P04VI5_n4303BarFasEst1 = new boolean[] {false} ;
      P04VI6_A396EmprCod = new String[] {""} ;
      P04VI6_A129BarCod = new int[1] ;
      P04VI6_A132BarCodReo = new byte[1] ;
      P04VI6_A130BarCodPar = new String[] {""} ;
      P04VI6_A758ProCod = new String[] {""} ;
      P04VI6_A194BarOrdLin = new short[1] ;
      P04VI6_A4643BarFasLot = new int[1] ;
      P04VI6_A10084BarPFcod = new short[1] ;
      P04VI9_A396EmprCod = new String[] {""} ;
      P04VI9_A129BarCod = new int[1] ;
      P04VI9_A132BarCodReo = new byte[1] ;
      P04VI9_A130BarCodPar = new String[] {""} ;
      P04VI9_A758ProCod = new String[] {""} ;
      P04VI9_A194BarOrdLin = new short[1] ;
      P04VI9_A7934Dtb_Ordl = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprofs02__default(),
         new Object[] {
             new Object[] {
            P04VI2_A758ProCod, P04VI2_A130BarCodPar, P04VI2_A132BarCodReo, P04VI2_A129BarCod, P04VI2_A396EmprCod, P04VI2_A761ProFasLin, P04VI2_n761ProFasLin
            }
            , new Object[] {
            P04VI3_A396EmprCod, P04VI3_A129BarCod, P04VI3_A132BarCodReo, P04VI3_A130BarCodPar, P04VI3_A758ProCod, P04VI3_A194BarOrdLin, P04VI3_A152BarFasCon
            }
            , new Object[] {
            }
            , new Object[] {
            P04VI5_A396EmprCod, P04VI5_A129BarCod, P04VI5_A132BarCodReo, P04VI5_A130BarCodPar, P04VI5_A758ProCod, P04VI5_A194BarOrdLin, P04VI5_A4643BarFasLot, P04VI5_A4303BarFasEst1, P04VI5_n4303BarFasEst1
            }
            , new Object[] {
            P04VI6_A396EmprCod, P04VI6_A129BarCod, P04VI6_A132BarCodReo, P04VI6_A130BarCodPar, P04VI6_A758ProCod, P04VI6_A194BarOrdLin, P04VI6_A4643BarFasLot, P04VI6_A10084BarPFcod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P04VI9_A396EmprCod, P04VI9_A129BarCod, P04VI9_A132BarCodReo, P04VI9_A130BarCodPar, P04VI9_A758ProCod, P04VI9_A194BarOrdLin, P04VI9_A7934Dtb_Ordl
            }
            , new Object[] {
            }
            , new Object[] {
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

   private byte AV10BarCodReo ;
   private byte A132BarCodReo ;
   private byte A4303BarFasEst1 ;
   private short A761ProFasLin ;
   private short A194BarOrdLin ;
   private short A10084BarPFcod ;
   private short A7934Dtb_Ordl ;
   private short Gx_err ;
   private int AV9BarCod ;
   private int A129BarCod ;
   private int A4643BarFasLot ;
   private String AV8EmprCod ;
   private String AV11BarCodPar ;
   private String AV12ProCod ;
   private String AV13Modo ;
   private String scmdbuf ;
   private String A758ProCod ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A152BarFasCon ;
   private boolean n761ProFasLin ;
   private boolean n4303BarFasEst1 ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P04VI2_A758ProCod ;
   private String[] P04VI2_A130BarCodPar ;
   private byte[] P04VI2_A132BarCodReo ;
   private int[] P04VI2_A129BarCod ;
   private String[] P04VI2_A396EmprCod ;
   private short[] P04VI2_A761ProFasLin ;
   private boolean[] P04VI2_n761ProFasLin ;
   private String[] P04VI3_A396EmprCod ;
   private int[] P04VI3_A129BarCod ;
   private byte[] P04VI3_A132BarCodReo ;
   private String[] P04VI3_A130BarCodPar ;
   private String[] P04VI3_A758ProCod ;
   private short[] P04VI3_A194BarOrdLin ;
   private String[] P04VI3_A152BarFasCon ;
   private String[] P04VI5_A396EmprCod ;
   private int[] P04VI5_A129BarCod ;
   private byte[] P04VI5_A132BarCodReo ;
   private String[] P04VI5_A130BarCodPar ;
   private String[] P04VI5_A758ProCod ;
   private short[] P04VI5_A194BarOrdLin ;
   private int[] P04VI5_A4643BarFasLot ;
   private byte[] P04VI5_A4303BarFasEst1 ;
   private boolean[] P04VI5_n4303BarFasEst1 ;
   private String[] P04VI6_A396EmprCod ;
   private int[] P04VI6_A129BarCod ;
   private byte[] P04VI6_A132BarCodReo ;
   private String[] P04VI6_A130BarCodPar ;
   private String[] P04VI6_A758ProCod ;
   private short[] P04VI6_A194BarOrdLin ;
   private int[] P04VI6_A4643BarFasLot ;
   private short[] P04VI6_A10084BarPFcod ;
   private String[] P04VI9_A396EmprCod ;
   private int[] P04VI9_A129BarCod ;
   private byte[] P04VI9_A132BarCodReo ;
   private String[] P04VI9_A130BarCodPar ;
   private String[] P04VI9_A758ProCod ;
   private short[] P04VI9_A194BarOrdLin ;
   private short[] P04VI9_A7934Dtb_Ordl ;
}

final  class pprofs02__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04VI2", "SELECT ProCod, BarCodPar, BarCodReo, BarCod, EmprCod, ProFasLin FROM TXPBARPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04VI3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasCon FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04VI4", "DELETE FROM TXPBarPar  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBarPar")
         ,new ForEachCursor("P04VI5", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot, BarFasEst1 FROM TXPFASMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04VI6", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot, BarPFcod FROM TXPFASPFA WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and BarFasLot = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot, BarPFcod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04VI7", "DELETE FROM TXPFASMAQ  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND BarFasLot = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASMAQ")
         ,new UpdateCursor("P04VI8", "DELETE FROM TXPFASQUI  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASQUI")
         ,new ForEachCursor("P04VI9", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Dtb_Ordl FROM TXPDT005 WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Dtb_Ordl ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04VI10", "DELETE FROM TXPDT0051  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and Dtb_Ordl = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDT0051")
         ,new UpdateCursor("P04VI11", "DELETE FROM TXPDT005  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND Dtb_Ordl = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDT005")
         ,new UpdateCursor("P04VI12", "DELETE FROM TXPBARFAS  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new UpdateCursor("P04VI13", "DELETE FROM TXPBARPRO  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPRO")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
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
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
      }
   }

}

