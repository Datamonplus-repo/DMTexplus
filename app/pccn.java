package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pccn extends GXProcedure
{
   public pccn( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pccn.class ), "" );
   }

   public pccn( int remoteHandle ,
                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String[] executeUdp( String[] aP0 ,
                               int[] aP1 ,
                               byte[] aP2 ,
                               String[] aP3 ,
                               String[] aP4 ,
                               short[] aP5 ,
                               int[] aP6 ,
                               short[] AV13Tab_lin )
   {
      AV14Tab_val = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV14Tab_val[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, AV13Tab_lin, AV14Tab_val);
      return AV14Tab_val;
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        int[] aP6 ,
                        short[] AV13Tab_lin ,
                        String[] AV14Tab_val )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, AV13Tab_lin, AV14Tab_val);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             int[] aP6 ,
                             short[] AV13Tab_lin ,
                             String[] AV14Tab_val )
   {
      pccn.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pccn.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pccn.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pccn.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pccn.this.A758ProCod = aP4[0];
      this.aP4 = aP4;
      pccn.this.A194BarOrdLin = aP5[0];
      this.aP5 = aP5;
      pccn.this.A4031CCTCod = aP6[0];
      this.aP6 = aP6;
      pccn.this.AV13Tab_lin = AV13Tab_lin;
      pccn.this.AV14Tab_val = AV14Tab_val;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04HH2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11293CcUltn = P04HH2_A11293CcUltn[0] ;
         n11293CcUltn = P04HH2_n11293CcUltn[0] ;
         A4032CCOpeCod = P04HH2_A4032CCOpeCod[0] ;
         n4032CCOpeCod = P04HH2_n4032CCOpeCod[0] ;
         A4033CCFch = P04HH2_A4033CCFch[0] ;
         n4033CCFch = P04HH2_n4033CCFch[0] ;
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         W758ProCod = A758ProCod ;
         W194BarOrdLin = A194BarOrdLin ;
         W4031CCTCod = A4031CCTCod ;
         AV8CcUltn = (short)(A11293CcUltn+1) ;
         A11293CcUltn = AV8CcUltn ;
         n11293CcUltn = false ;
         AV10ccopecod = A4032CCOpeCod ;
         AV9CCFch = A4033CCFch ;
         A4033CCFch = GXutil.today( ) ;
         n4033CCFch = false ;
         /*
            INSERT RECORD ON TABLE TXPCCn

         */
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         W758ProCod = A758ProCod ;
         W194BarOrdLin = A194BarOrdLin ;
         W4031CCTCod = A4031CCTCod ;
         A11294CcLn = AV8CcUltn ;
         /* Using cursor P04HH3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A11294CcLn)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCn");
         if ( (pr_default.getStatus(1) == 1) )
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
         A758ProCod = W758ProCod ;
         A194BarOrdLin = W194BarOrdLin ;
         A4031CCTCod = W4031CCTCod ;
         /* End Insert */
         /* Using cursor P04HH4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A4034CCTLin = P04HH4_A4034CCTLin[0] ;
            A4035CCVal = P04HH4_A4035CCVal[0] ;
            W396EmprCod = A396EmprCod ;
            W129BarCod = A129BarCod ;
            W132BarCodReo = A132BarCodReo ;
            W130BarCodPar = A130BarCodPar ;
            W758ProCod = A758ProCod ;
            W194BarOrdLin = A194BarOrdLin ;
            W4031CCTCod = A4031CCTCod ;
            /*
               INSERT RECORD ON TABLE TXPCCnT

            */
            W396EmprCod = A396EmprCod ;
            W129BarCod = A129BarCod ;
            W132BarCodReo = A132BarCodReo ;
            W130BarCodPar = A130BarCodPar ;
            W758ProCod = A758ProCod ;
            W194BarOrdLin = A194BarOrdLin ;
            W4031CCTCod = A4031CCTCod ;
            A11294CcLn = AV8CcUltn ;
            A11295CcLnT = A4034CCTLin ;
            A11296CcLnV = A4035CCVal ;
            n11296CcLnV = false ;
            A11297CcLnFc = AV9CCFch ;
            n11297CcLnFc = false ;
            A11298CcLnOp = AV10ccopecod ;
            n11298CcLnOp = false ;
            /* Using cursor P04HH5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A11294CcLn), Short.valueOf(A11295CcLnT), Boolean.valueOf(n11296CcLnV), A11296CcLnV, Boolean.valueOf(n11297CcLnFc), A11297CcLnFc, Boolean.valueOf(n11298CcLnOp), Integer.valueOf(A11298CcLnOp)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCnT");
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
            A396EmprCod = W396EmprCod ;
            A129BarCod = W129BarCod ;
            A132BarCodReo = W132BarCodReo ;
            A130BarCodPar = W130BarCodPar ;
            A758ProCod = W758ProCod ;
            A194BarOrdLin = W194BarOrdLin ;
            A4031CCTCod = W4031CCTCod ;
            /* End Insert */
            A396EmprCod = W396EmprCod ;
            A129BarCod = W129BarCod ;
            A132BarCodReo = W132BarCodReo ;
            A130BarCodPar = W130BarCodPar ;
            A758ProCod = W758ProCod ;
            A194BarOrdLin = W194BarOrdLin ;
            A4031CCTCod = W4031CCTCod ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         /* Using cursor P04HH6 */
         pr_default.execute(4, new Object[] {Boolean.valueOf(n11293CcUltn), Short.valueOf(A11293CcUltn), Boolean.valueOf(n4033CCFch), A4033CCFch, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCC");
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         A758ProCod = W758ProCod ;
         A194BarOrdLin = W194BarOrdLin ;
         A4031CCTCod = W4031CCTCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV15i = (short)(1) ;
      while ( AV15i <= 100 )
      {
         if ( AV13Tab_lin[AV15i-1] == 0 )
         {
            if (true) break;
         }
         AV16CCTLin = AV13Tab_lin[AV15i-1] ;
         /* Using cursor P04HH7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(AV16CCTLin)});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A4034CCTLin = P04HH7_A4034CCTLin[0] ;
            A4035CCVal = P04HH7_A4035CCVal[0] ;
            A4035CCVal = AV14Tab_val[AV15i-1] ;
            /* Using cursor P04HH8 */
            pr_default.execute(6, new Object[] {A4035CCVal, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCC1");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(5);
         AV15i = (short)(AV15i+1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pccn.this.A396EmprCod;
      this.aP1[0] = pccn.this.A129BarCod;
      this.aP2[0] = pccn.this.A132BarCodReo;
      this.aP3[0] = pccn.this.A130BarCodPar;
      this.aP4[0] = pccn.this.A758ProCod;
      this.aP5[0] = pccn.this.A194BarOrdLin;
      this.aP6[0] = pccn.this.A4031CCTCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pccn");
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
      P04HH2_A396EmprCod = new String[] {""} ;
      P04HH2_A129BarCod = new int[1] ;
      P04HH2_A132BarCodReo = new byte[1] ;
      P04HH2_A130BarCodPar = new String[] {""} ;
      P04HH2_A758ProCod = new String[] {""} ;
      P04HH2_A194BarOrdLin = new short[1] ;
      P04HH2_A4031CCTCod = new int[1] ;
      P04HH2_A11293CcUltn = new short[1] ;
      P04HH2_n11293CcUltn = new boolean[] {false} ;
      P04HH2_A4032CCOpeCod = new int[1] ;
      P04HH2_n4032CCOpeCod = new boolean[] {false} ;
      P04HH2_A4033CCFch = new java.util.Date[] {GXutil.nullDate()} ;
      P04HH2_n4033CCFch = new boolean[] {false} ;
      A4033CCFch = GXutil.nullDate() ;
      W396EmprCod = "" ;
      W130BarCodPar = "" ;
      W758ProCod = "" ;
      AV9CCFch = GXutil.nullDate() ;
      Gx_emsg = "" ;
      P04HH4_A396EmprCod = new String[] {""} ;
      P04HH4_A129BarCod = new int[1] ;
      P04HH4_A132BarCodReo = new byte[1] ;
      P04HH4_A130BarCodPar = new String[] {""} ;
      P04HH4_A758ProCod = new String[] {""} ;
      P04HH4_A194BarOrdLin = new short[1] ;
      P04HH4_A4031CCTCod = new int[1] ;
      P04HH4_A4034CCTLin = new short[1] ;
      P04HH4_A4035CCVal = new String[] {""} ;
      A4035CCVal = "" ;
      A11296CcLnV = "" ;
      A11297CcLnFc = GXutil.nullDate() ;
      P04HH7_A396EmprCod = new String[] {""} ;
      P04HH7_A129BarCod = new int[1] ;
      P04HH7_A132BarCodReo = new byte[1] ;
      P04HH7_A130BarCodPar = new String[] {""} ;
      P04HH7_A758ProCod = new String[] {""} ;
      P04HH7_A194BarOrdLin = new short[1] ;
      P04HH7_A4031CCTCod = new int[1] ;
      P04HH7_A4034CCTLin = new short[1] ;
      P04HH7_A4035CCVal = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pccn__default(),
         new Object[] {
             new Object[] {
            P04HH2_A396EmprCod, P04HH2_A129BarCod, P04HH2_A132BarCodReo, P04HH2_A130BarCodPar, P04HH2_A758ProCod, P04HH2_A194BarOrdLin, P04HH2_A4031CCTCod, P04HH2_A11293CcUltn, P04HH2_n11293CcUltn, P04HH2_A4032CCOpeCod,
            P04HH2_n4032CCOpeCod, P04HH2_A4033CCFch, P04HH2_n4033CCFch
            }
            , new Object[] {
            }
            , new Object[] {
            P04HH4_A396EmprCod, P04HH4_A129BarCod, P04HH4_A132BarCodReo, P04HH4_A130BarCodPar, P04HH4_A758ProCod, P04HH4_A194BarOrdLin, P04HH4_A4031CCTCod, P04HH4_A4034CCTLin, P04HH4_A4035CCVal
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P04HH7_A396EmprCod, P04HH7_A129BarCod, P04HH7_A132BarCodReo, P04HH7_A130BarCodPar, P04HH7_A758ProCod, P04HH7_A194BarOrdLin, P04HH7_A4031CCTCod, P04HH7_A4034CCTLin, P04HH7_A4035CCVal
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte W132BarCodReo ;
   private short A194BarOrdLin ;
   private short AV13Tab_lin[] ;
   private short A11293CcUltn ;
   private short W194BarOrdLin ;
   private short AV8CcUltn ;
   private short A11294CcLn ;
   private short Gx_err ;
   private short A4034CCTLin ;
   private short A11295CcLnT ;
   private short AV15i ;
   private short AV16CCTLin ;
   private int GX_I ;
   private int A129BarCod ;
   private int A4031CCTCod ;
   private int A4032CCOpeCod ;
   private int W129BarCod ;
   private int W4031CCTCod ;
   private int AV10ccopecod ;
   private int GX_INS1508 ;
   private int GX_INS1509 ;
   private int A11298CcLnOp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String scmdbuf ;
   private String W396EmprCod ;
   private String W130BarCodPar ;
   private String W758ProCod ;
   private String Gx_emsg ;
   private String A4035CCVal ;
   private String A11296CcLnV ;
   private java.util.Date A4033CCFch ;
   private java.util.Date AV9CCFch ;
   private java.util.Date A11297CcLnFc ;
   private boolean n11293CcUltn ;
   private boolean n4032CCOpeCod ;
   private boolean n4033CCFch ;
   private boolean n11296CcLnV ;
   private boolean n11297CcLnFc ;
   private boolean n11298CcLnOp ;
   private String[] AV14Tab_val ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private int[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P04HH2_A396EmprCod ;
   private int[] P04HH2_A129BarCod ;
   private byte[] P04HH2_A132BarCodReo ;
   private String[] P04HH2_A130BarCodPar ;
   private String[] P04HH2_A758ProCod ;
   private short[] P04HH2_A194BarOrdLin ;
   private int[] P04HH2_A4031CCTCod ;
   private short[] P04HH2_A11293CcUltn ;
   private boolean[] P04HH2_n11293CcUltn ;
   private int[] P04HH2_A4032CCOpeCod ;
   private boolean[] P04HH2_n4032CCOpeCod ;
   private java.util.Date[] P04HH2_A4033CCFch ;
   private boolean[] P04HH2_n4033CCFch ;
   private String[] P04HH4_A396EmprCod ;
   private int[] P04HH4_A129BarCod ;
   private byte[] P04HH4_A132BarCodReo ;
   private String[] P04HH4_A130BarCodPar ;
   private String[] P04HH4_A758ProCod ;
   private short[] P04HH4_A194BarOrdLin ;
   private int[] P04HH4_A4031CCTCod ;
   private short[] P04HH4_A4034CCTLin ;
   private String[] P04HH4_A4035CCVal ;
   private String[] P04HH7_A396EmprCod ;
   private int[] P04HH7_A129BarCod ;
   private byte[] P04HH7_A132BarCodReo ;
   private String[] P04HH7_A130BarCodPar ;
   private String[] P04HH7_A758ProCod ;
   private short[] P04HH7_A194BarOrdLin ;
   private int[] P04HH7_A4031CCTCod ;
   private short[] P04HH7_A4034CCTLin ;
   private String[] P04HH7_A4035CCVal ;
}

final  class pccn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04HH2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CcUltn, CCOpeCod, CCFch FROM TXPCC WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and CCTCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04HH3", "INSERT INTO TXPCCn(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CcLn) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCn")
         ,new ForEachCursor("P04HH4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CCTLin, CCVal FROM TXPCC1 WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and CCTCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04HH5", "INSERT INTO TXPCCnT(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CcLn, CcLnT, CcLnV, CcLnFc, CcLnOp) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCnT")
         ,new UpdateCursor("P04HH6", "UPDATE TXPCC SET CcUltn=?, CCFch=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCC")
         ,new ForEachCursor("P04HH7", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CCTLin, CCVal FROM TXPCC1 WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and CCTCod = ? and CCTLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CCTLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04HH8", "UPDATE TXPCC1 SET CCVal=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? AND CCTLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCC1")
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
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 40);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 40);
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
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[10], 40);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DATE );
               }
               else
               {
                  stmt.setDate(11, (java.util.Date)parms[12]);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(12, ((Number) parms[14]).intValue());
               }
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DATE );
               }
               else
               {
                  stmt.setDate(2, (java.util.Date)parms[3]);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setByte(5, ((Number) parms[6]).byteValue());
               stmt.setString(6, (String)parms[7], 1);
               stmt.setString(7, (String)parms[8], 8);
               stmt.setShort(8, ((Number) parms[9]).shortValue());
               stmt.setInt(9, ((Number) parms[10]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 8);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
      }
   }

}

