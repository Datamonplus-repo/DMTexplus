package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc24 extends GXProcedure
{
   public pprc24( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc24.class ), "" );
   }

   public pprc24( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           byte[] aP3 )
   {
      pprc24.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             byte[] aP4 )
   {
      pprc24.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprc24.this.AV15MacCod = aP1[0];
      this.aP1 = aP1;
      pprc24.this.Gx_msg = aP2[0];
      this.aP2 = aP2;
      pprc24.this.AV16RecMaq = aP3[0];
      this.aP3 = aP3;
      pprc24.this.AV21Lhipro = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV23Portugues ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, "100001", GXv_int2) ;
      pprc24.this.GXt_int1 = GXv_int2[0] ;
      AV23Portugues = GXt_int1 ;
      AV20Err_m = (byte)(0) ;
      Gx_msg = "" ;
      AV16RecMaq = (byte)(0) ;
      AV21Lhipro = (byte)(0) ;
      /* Using cursor P05CG2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15MacCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1199MacCod = P05CG2_A1199MacCod[0] ;
         A1203MacBarCod = P05CG2_A1203MacBarCod[0] ;
         A1204MacBarReo = P05CG2_A1204MacBarReo[0] ;
         A1205MacBarPar = P05CG2_A1205MacBarPar[0] ;
         A1201MacLin = P05CG2_A1201MacLin[0] ;
         AV17BarCodm = A1203MacBarCod ;
         AV18BarCodreom = A1204MacBarReo ;
         AV19BarCodParm = A1205MacBarPar ;
         new app.pminagr(remoteHandle, context).execute( A396EmprCod, AV17BarCodm, AV18BarCodreom, AV19BarCodParm) ;
         /* Execute user subroutine: 'RECMAQ' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV16RecMaq == 1 )
         {
            AV20Err_m = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV16RecMaq == 1 )
      {
         if ( AV23Portugues == 1 )
         {
            Gx_msg = httpContext.getMessage( "Erro Há receita de tintura.", "") + GXutil.newLine( ) ;
            Gx_msg += httpContext.getMessage( "Você deve eliminar, primeiro a Receita de tintura.", "") ;
         }
         else
         {
            Gx_msg = httpContext.getMessage( "Error.Existe Receta de Tinte", "") + GXutil.newLine( ) ;
            Gx_msg += httpContext.getMessage( "Se debe de eliminar, primero la Receta de Tinte.", "") ;
         }
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV21Lhipro = (byte)(0) ;
      /* Using cursor P05CG3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV15MacCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A1199MacCod = P05CG3_A1199MacCod[0] ;
         A1203MacBarCod = P05CG3_A1203MacBarCod[0] ;
         A1204MacBarReo = P05CG3_A1204MacBarReo[0] ;
         A1205MacBarPar = P05CG3_A1205MacBarPar[0] ;
         A1201MacLin = P05CG3_A1201MacLin[0] ;
         AV24BarCod = A1203MacBarCod ;
         AV25BarCodreo = A1204MacBarReo ;
         AV26BarCodPar = A1205MacBarPar ;
         /* Execute user subroutine: 'BARFAS' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV21Lhipro == 1 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      if ( AV21Lhipro == 1 )
      {
         if ( AV23Portugues == 1 )
         {
            Gx_msg = httpContext.getMessage( "Erro As produções que estão neste número de macro estão em processo de tintura.", "") ;
         }
         else
         {
            Gx_msg = httpContext.getMessage( "Error.Las HDRs que estan en este N de Macro, estan en Proceso de Tinte.", "") ;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'RECMAQ' Routine */
      returnInSub = false ;
      AV16RecMaq = (byte)(0) ;
      /* Using cursor P05CG4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV17BarCodm), Byte.valueOf(AV18BarCodreom), AV19BarCodParm});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A6039RecAcab = P05CG4_A6039RecAcab[0] ;
         n6039RecAcab = P05CG4_n6039RecAcab[0] ;
         A130BarCodPar = P05CG4_A130BarCodPar[0] ;
         A132BarCodReo = P05CG4_A132BarCodReo[0] ;
         A129BarCod = P05CG4_A129BarCod[0] ;
         A2805RecVolPrd = P05CG4_A2805RecVolPrd[0] ;
         A2804RecLinMaq = P05CG4_A2804RecLinMaq[0] ;
         if ( GXutil.strcmp(A6039RecAcab, httpContext.getMessage( "S", "")) != 0 )
         {
            AV16RecMaq = (byte)(1) ;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S121( )
   {
      /* 'BARFAS' Routine */
      returnInSub = false ;
      AV21Lhipro = (byte)(0) ;
      /* Using cursor P05CG5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV24BarCod), Byte.valueOf(AV25BarCodreo), AV26BarCodPar});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A130BarCodPar = P05CG5_A130BarCodPar[0] ;
         A132BarCodReo = P05CG5_A132BarCodReo[0] ;
         A129BarCod = P05CG5_A129BarCod[0] ;
         A153BarFasEst = P05CG5_A153BarFasEst[0] ;
         A150BarFacTin = P05CG5_A150BarFacTin[0] ;
         A194BarOrdLin = P05CG5_A194BarOrdLin[0] ;
         A758ProCod = P05CG5_A758ProCod[0] ;
         if ( GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", "")) == 0 )
         {
            AV22Barordlin = A194BarOrdLin ;
            /* Execute user subroutine: 'LHIPRO' */
            S135 ();
            if ( returnInSub )
            {
               pr_default.close(3);
               returnInSub = true;
               if (true) return;
            }
            if ( AV21Lhipro == 1 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void S135( )
   {
      /* 'LHIPRO' Routine */
      returnInSub = false ;
      /* Using cursor P05CG6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV24BarCod), Byte.valueOf(AV25BarCodreo), AV26BarCodPar, Short.valueOf(AV22Barordlin)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A129BarCod = P05CG6_A129BarCod[0] ;
         A132BarCodReo = P05CG6_A132BarCodReo[0] ;
         A130BarCodPar = P05CG6_A130BarCodPar[0] ;
         A194BarOrdLin = P05CG6_A194BarOrdLin[0] ;
         A656ParCod = P05CG6_A656ParCod[0] ;
         n656ParCod = P05CG6_n656ParCod[0] ;
         A557HisProF = P05CG6_A557HisProF[0] ;
         A602MaqCod = P05CG6_A602MaqCod[0] ;
         A558HisProFec = P05CG6_A558HisProFec[0] ;
         A561HisProLin = P05CG6_A561HisProLin[0] ;
         if ( GXutil.strcmp(A557HisProF, httpContext.getMessage( "N", "")) == 0 )
         {
            AV21Lhipro = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc24.this.A396EmprCod;
      this.aP1[0] = pprc24.this.AV15MacCod;
      this.aP2[0] = pprc24.this.Gx_msg;
      this.aP3[0] = pprc24.this.AV16RecMaq;
      this.aP4[0] = pprc24.this.AV21Lhipro;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P05CG2_A396EmprCod = new String[] {""} ;
      P05CG2_A1199MacCod = new int[1] ;
      P05CG2_A1203MacBarCod = new int[1] ;
      P05CG2_A1204MacBarReo = new byte[1] ;
      P05CG2_A1205MacBarPar = new String[] {""} ;
      P05CG2_A1201MacLin = new short[1] ;
      A1205MacBarPar = "" ;
      AV19BarCodParm = "" ;
      P05CG3_A396EmprCod = new String[] {""} ;
      P05CG3_A1199MacCod = new int[1] ;
      P05CG3_A1203MacBarCod = new int[1] ;
      P05CG3_A1204MacBarReo = new byte[1] ;
      P05CG3_A1205MacBarPar = new String[] {""} ;
      P05CG3_A1201MacLin = new short[1] ;
      AV26BarCodPar = "" ;
      P05CG4_A396EmprCod = new String[] {""} ;
      P05CG4_A6039RecAcab = new String[] {""} ;
      P05CG4_n6039RecAcab = new boolean[] {false} ;
      P05CG4_A130BarCodPar = new String[] {""} ;
      P05CG4_A132BarCodReo = new byte[1] ;
      P05CG4_A129BarCod = new int[1] ;
      P05CG4_A2805RecVolPrd = new int[1] ;
      P05CG4_A2804RecLinMaq = new short[1] ;
      A6039RecAcab = "" ;
      A130BarCodPar = "" ;
      P05CG5_A396EmprCod = new String[] {""} ;
      P05CG5_A130BarCodPar = new String[] {""} ;
      P05CG5_A132BarCodReo = new byte[1] ;
      P05CG5_A129BarCod = new int[1] ;
      P05CG5_A153BarFasEst = new byte[1] ;
      P05CG5_A150BarFacTin = new String[] {""} ;
      P05CG5_A194BarOrdLin = new short[1] ;
      P05CG5_A758ProCod = new String[] {""} ;
      A150BarFacTin = "" ;
      A758ProCod = "" ;
      P05CG6_A396EmprCod = new String[] {""} ;
      P05CG6_A129BarCod = new int[1] ;
      P05CG6_A132BarCodReo = new byte[1] ;
      P05CG6_A130BarCodPar = new String[] {""} ;
      P05CG6_A194BarOrdLin = new short[1] ;
      P05CG6_A656ParCod = new short[1] ;
      P05CG6_n656ParCod = new boolean[] {false} ;
      P05CG6_A557HisProF = new String[] {""} ;
      P05CG6_A602MaqCod = new String[] {""} ;
      P05CG6_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05CG6_A561HisProLin = new int[1] ;
      A557HisProF = "" ;
      A602MaqCod = "" ;
      A558HisProFec = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc24__default(),
         new Object[] {
             new Object[] {
            P05CG2_A396EmprCod, P05CG2_A1199MacCod, P05CG2_A1203MacBarCod, P05CG2_A1204MacBarReo, P05CG2_A1205MacBarPar, P05CG2_A1201MacLin
            }
            , new Object[] {
            P05CG3_A396EmprCod, P05CG3_A1199MacCod, P05CG3_A1203MacBarCod, P05CG3_A1204MacBarReo, P05CG3_A1205MacBarPar, P05CG3_A1201MacLin
            }
            , new Object[] {
            P05CG4_A396EmprCod, P05CG4_A6039RecAcab, P05CG4_n6039RecAcab, P05CG4_A130BarCodPar, P05CG4_A132BarCodReo, P05CG4_A129BarCod, P05CG4_A2805RecVolPrd, P05CG4_A2804RecLinMaq
            }
            , new Object[] {
            P05CG5_A396EmprCod, P05CG5_A130BarCodPar, P05CG5_A132BarCodReo, P05CG5_A129BarCod, P05CG5_A153BarFasEst, P05CG5_A150BarFacTin, P05CG5_A194BarOrdLin, P05CG5_A758ProCod
            }
            , new Object[] {
            P05CG6_A396EmprCod, P05CG6_A129BarCod, P05CG6_A132BarCodReo, P05CG6_A130BarCodPar, P05CG6_A194BarOrdLin, P05CG6_A656ParCod, P05CG6_n656ParCod, P05CG6_A557HisProF, P05CG6_A602MaqCod, P05CG6_A558HisProFec,
            P05CG6_A561HisProLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16RecMaq ;
   private byte AV21Lhipro ;
   private byte AV23Portugues ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV20Err_m ;
   private byte A1204MacBarReo ;
   private byte AV18BarCodreom ;
   private byte AV25BarCodreo ;
   private byte A132BarCodReo ;
   private byte A153BarFasEst ;
   private short A1201MacLin ;
   private short A2804RecLinMaq ;
   private short A194BarOrdLin ;
   private short AV22Barordlin ;
   private short A656ParCod ;
   private short Gx_err ;
   private int AV15MacCod ;
   private int A1199MacCod ;
   private int A1203MacBarCod ;
   private int AV17BarCodm ;
   private int AV24BarCod ;
   private int A129BarCod ;
   private int A2805RecVolPrd ;
   private int A561HisProLin ;
   private String A396EmprCod ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A1205MacBarPar ;
   private String AV19BarCodParm ;
   private String AV26BarCodPar ;
   private String A6039RecAcab ;
   private String A130BarCodPar ;
   private String A150BarFacTin ;
   private String A758ProCod ;
   private String A557HisProF ;
   private String A602MaqCod ;
   private java.util.Date A558HisProFec ;
   private boolean returnInSub ;
   private boolean n6039RecAcab ;
   private boolean n656ParCod ;
   private byte[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P05CG2_A396EmprCod ;
   private int[] P05CG2_A1199MacCod ;
   private int[] P05CG2_A1203MacBarCod ;
   private byte[] P05CG2_A1204MacBarReo ;
   private String[] P05CG2_A1205MacBarPar ;
   private short[] P05CG2_A1201MacLin ;
   private String[] P05CG3_A396EmprCod ;
   private int[] P05CG3_A1199MacCod ;
   private int[] P05CG3_A1203MacBarCod ;
   private byte[] P05CG3_A1204MacBarReo ;
   private String[] P05CG3_A1205MacBarPar ;
   private short[] P05CG3_A1201MacLin ;
   private String[] P05CG4_A396EmprCod ;
   private String[] P05CG4_A6039RecAcab ;
   private boolean[] P05CG4_n6039RecAcab ;
   private String[] P05CG4_A130BarCodPar ;
   private byte[] P05CG4_A132BarCodReo ;
   private int[] P05CG4_A129BarCod ;
   private int[] P05CG4_A2805RecVolPrd ;
   private short[] P05CG4_A2804RecLinMaq ;
   private String[] P05CG5_A396EmprCod ;
   private String[] P05CG5_A130BarCodPar ;
   private byte[] P05CG5_A132BarCodReo ;
   private int[] P05CG5_A129BarCod ;
   private byte[] P05CG5_A153BarFasEst ;
   private String[] P05CG5_A150BarFacTin ;
   private short[] P05CG5_A194BarOrdLin ;
   private String[] P05CG5_A758ProCod ;
   private String[] P05CG6_A396EmprCod ;
   private int[] P05CG6_A129BarCod ;
   private byte[] P05CG6_A132BarCodReo ;
   private String[] P05CG6_A130BarCodPar ;
   private short[] P05CG6_A194BarOrdLin ;
   private short[] P05CG6_A656ParCod ;
   private boolean[] P05CG6_n656ParCod ;
   private String[] P05CG6_A557HisProF ;
   private String[] P05CG6_A602MaqCod ;
   private java.util.Date[] P05CG6_A558HisProFec ;
   private int[] P05CG6_A561HisProLin ;
}

final  class pprc24__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05CG2", "SELECT EmprCod, MacCod, MacBarCod, MacBarReo, MacBarPar, MacLin FROM TXPLMACRO WHERE EmprCod = ? and MacCod = ? ORDER BY EmprCod, MacCod, MacLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05CG3", "SELECT EmprCod, MacCod, MacBarCod, MacBarReo, MacBarPar, MacLin FROM TXPLMACRO WHERE EmprCod = ? and MacCod = ? ORDER BY EmprCod, MacCod, MacLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05CG4", "SELECT EmprCod, RecAcab, BarCodPar, BarCodReo, BarCod, RecVolPrd, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05CG5", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarFasEst, BarFacTin, BarOrdLin, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05CG6", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, ParCod, HisProF, MaqCod, HisProFec, HisProLin FROM TXPLHIPRO WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ?) AND (ParCod = 0) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((int[]) buf[10])[0] = rslt.getInt(10);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

