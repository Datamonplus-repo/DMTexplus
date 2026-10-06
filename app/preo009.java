package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class preo009 extends GXProcedure
{
   public preo009( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( preo009.class ), "" );
   }

   public preo009( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             int[] aP6 ,
                             int[] aP7 ,
                             byte[] aP8 )
   {
      preo009.this.aP9 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        int[] aP6 ,
                        int[] aP7 ,
                        byte[] aP8 ,
                        String[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             int[] aP6 ,
                             int[] aP7 ,
                             byte[] aP8 ,
                             String[] aP9 )
   {
      preo009.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      preo009.this.AV11BarCod = aP1[0];
      this.aP1 = aP1;
      preo009.this.AV12BarCodReo = aP2[0];
      this.aP2 = aP2;
      preo009.this.AV13BarCodPar = aP3[0];
      this.aP3 = aP3;
      preo009.this.AV14ProCod = aP4[0];
      this.aP4 = aP4;
      preo009.this.AV15BarOrdLin = aP5[0];
      this.aP5 = aP5;
      preo009.this.AV16CCTCod = aP6[0];
      this.aP6 = aP6;
      preo009.this.AV8BarCod_d = aP7[0];
      this.aP7 = aP7;
      preo009.this.AV10CodReo_d = aP8[0];
      this.aP8 = aP8;
      preo009.this.AV9CodPar_d = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P09W62 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV11BarCod), Byte.valueOf(AV12BarCodReo), AV13BarCodPar, AV14ProCod, Short.valueOf(AV15BarOrdLin), Integer.valueOf(AV16CCTCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P09W62_A130BarCodPar[0] ;
         A132BarCodReo = P09W62_A132BarCodReo[0] ;
         A129BarCod = P09W62_A129BarCod[0] ;
         A11628CCobs2 = P09W62_A11628CCobs2[0] ;
         n11628CCobs2 = P09W62_n11628CCobs2[0] ;
         A11474CCOkUsu = P09W62_A11474CCOkUsu[0] ;
         A11473CCOkFch = P09W62_A11473CCOkFch[0] ;
         A11472CCOk = P09W62_A11472CCOk[0] ;
         A11293CcUltn = P09W62_A11293CcUltn[0] ;
         n11293CcUltn = P09W62_n11293CcUltn[0] ;
         A7691CCFchUti = P09W62_A7691CCFchUti[0] ;
         n7691CCFchUti = P09W62_n7691CCFchUti[0] ;
         A4405CcDisp = P09W62_A4405CcDisp[0] ;
         n4405CcDisp = P09W62_n4405CcDisp[0] ;
         A3281CcObs = P09W62_A3281CcObs[0] ;
         n3281CcObs = P09W62_n3281CcObs[0] ;
         A4033CCFch = P09W62_A4033CCFch[0] ;
         n4033CCFch = P09W62_n4033CCFch[0] ;
         A4032CCOpeCod = P09W62_A4032CCOpeCod[0] ;
         n4032CCOpeCod = P09W62_n4032CCOpeCod[0] ;
         A4031CCTCod = P09W62_A4031CCTCod[0] ;
         A194BarOrdLin = P09W62_A194BarOrdLin[0] ;
         A758ProCod = P09W62_A758ProCod[0] ;
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         W758ProCod = A758ProCod ;
         W194BarOrdLin = A194BarOrdLin ;
         W4031CCTCod = A4031CCTCod ;
         /*
            INSERT RECORD ON TABLE TXPCC

         */
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         W758ProCod = A758ProCod ;
         W194BarOrdLin = A194BarOrdLin ;
         W4031CCTCod = A4031CCTCod ;
         A129BarCod = AV8BarCod_d ;
         A132BarCodReo = AV10CodReo_d ;
         A130BarCodPar = AV9CodPar_d ;
         /* Using cursor P09W63 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Boolean.valueOf(n4032CCOpeCod), Integer.valueOf(A4032CCOpeCod), Boolean.valueOf(n4033CCFch), A4033CCFch, Boolean.valueOf(n3281CcObs), A3281CcObs, Boolean.valueOf(n4405CcDisp), A4405CcDisp, Boolean.valueOf(n7691CCFchUti), A7691CCFchUti, Boolean.valueOf(n11293CcUltn), Short.valueOf(A11293CcUltn), Byte.valueOf(A11472CCOk), A11473CCOkFch, A11474CCOkUsu, Boolean.valueOf(n11628CCobs2), A11628CCobs2});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCC");
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
      /* Using cursor P09W64 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV11BarCod), Byte.valueOf(AV12BarCodReo), AV13BarCodPar, AV14ProCod, Short.valueOf(AV15BarOrdLin), Integer.valueOf(AV16CCTCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A130BarCodPar = P09W64_A130BarCodPar[0] ;
         A132BarCodReo = P09W64_A132BarCodReo[0] ;
         A129BarCod = P09W64_A129BarCod[0] ;
         A14489CCEspecif2 = P09W64_A14489CCEspecif2[0] ;
         A13252CCEspecif = P09W64_A13252CCEspecif[0] ;
         A13251CCMetodo = P09W64_A13251CCMetodo[0] ;
         A12751CCOkDsc = P09W64_A12751CCOkDsc[0] ;
         A12750CCOkLin = P09W64_A12750CCOkLin[0] ;
         A4035CCVal = P09W64_A4035CCVal[0] ;
         A4034CCTLin = P09W64_A4034CCTLin[0] ;
         A4031CCTCod = P09W64_A4031CCTCod[0] ;
         A194BarOrdLin = P09W64_A194BarOrdLin[0] ;
         A758ProCod = P09W64_A758ProCod[0] ;
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         W758ProCod = A758ProCod ;
         W194BarOrdLin = A194BarOrdLin ;
         W4031CCTCod = A4031CCTCod ;
         /*
            INSERT RECORD ON TABLE TXPCC1

         */
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         W758ProCod = A758ProCod ;
         W194BarOrdLin = A194BarOrdLin ;
         W4031CCTCod = A4031CCTCod ;
         W4034CCTLin = A4034CCTLin ;
         A129BarCod = AV8BarCod_d ;
         A132BarCodReo = AV10CodReo_d ;
         A130BarCodPar = AV9CodPar_d ;
         /* Using cursor P09W65 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), A4035CCVal, Byte.valueOf(A12750CCOkLin), A12751CCOkDsc, A13251CCMetodo, A13252CCEspecif, A14489CCEspecif2});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCC1");
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
         A4034CCTLin = W4034CCTLin ;
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
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = preo009.this.A396EmprCod;
      this.aP1[0] = preo009.this.AV11BarCod;
      this.aP2[0] = preo009.this.AV12BarCodReo;
      this.aP3[0] = preo009.this.AV13BarCodPar;
      this.aP4[0] = preo009.this.AV14ProCod;
      this.aP5[0] = preo009.this.AV15BarOrdLin;
      this.aP6[0] = preo009.this.AV16CCTCod;
      this.aP7[0] = preo009.this.AV8BarCod_d;
      this.aP8[0] = preo009.this.AV10CodReo_d;
      this.aP9[0] = preo009.this.AV9CodPar_d;
      Application.commitDataStores(context, remoteHandle, pr_default, "preo009");
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
      P09W62_A396EmprCod = new String[] {""} ;
      P09W62_A130BarCodPar = new String[] {""} ;
      P09W62_A132BarCodReo = new byte[1] ;
      P09W62_A129BarCod = new int[1] ;
      P09W62_A11628CCobs2 = new String[] {""} ;
      P09W62_n11628CCobs2 = new boolean[] {false} ;
      P09W62_A11474CCOkUsu = new String[] {""} ;
      P09W62_A11473CCOkFch = new java.util.Date[] {GXutil.nullDate()} ;
      P09W62_A11472CCOk = new byte[1] ;
      P09W62_A11293CcUltn = new short[1] ;
      P09W62_n11293CcUltn = new boolean[] {false} ;
      P09W62_A7691CCFchUti = new java.util.Date[] {GXutil.nullDate()} ;
      P09W62_n7691CCFchUti = new boolean[] {false} ;
      P09W62_A4405CcDisp = new String[] {""} ;
      P09W62_n4405CcDisp = new boolean[] {false} ;
      P09W62_A3281CcObs = new String[] {""} ;
      P09W62_n3281CcObs = new boolean[] {false} ;
      P09W62_A4033CCFch = new java.util.Date[] {GXutil.nullDate()} ;
      P09W62_n4033CCFch = new boolean[] {false} ;
      P09W62_A4032CCOpeCod = new int[1] ;
      P09W62_n4032CCOpeCod = new boolean[] {false} ;
      P09W62_A4031CCTCod = new int[1] ;
      P09W62_A194BarOrdLin = new short[1] ;
      P09W62_A758ProCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A11628CCobs2 = "" ;
      A11474CCOkUsu = "" ;
      A11473CCOkFch = GXutil.resetTime( GXutil.nullDate() );
      A7691CCFchUti = GXutil.nullDate() ;
      A4405CcDisp = "" ;
      A3281CcObs = "" ;
      A4033CCFch = GXutil.nullDate() ;
      A758ProCod = "" ;
      W396EmprCod = "" ;
      W130BarCodPar = "" ;
      W758ProCod = "" ;
      Gx_emsg = "" ;
      P09W64_A396EmprCod = new String[] {""} ;
      P09W64_A130BarCodPar = new String[] {""} ;
      P09W64_A132BarCodReo = new byte[1] ;
      P09W64_A129BarCod = new int[1] ;
      P09W64_A14489CCEspecif2 = new String[] {""} ;
      P09W64_A13252CCEspecif = new String[] {""} ;
      P09W64_A13251CCMetodo = new String[] {""} ;
      P09W64_A12751CCOkDsc = new String[] {""} ;
      P09W64_A12750CCOkLin = new byte[1] ;
      P09W64_A4035CCVal = new String[] {""} ;
      P09W64_A4034CCTLin = new short[1] ;
      P09W64_A4031CCTCod = new int[1] ;
      P09W64_A194BarOrdLin = new short[1] ;
      P09W64_A758ProCod = new String[] {""} ;
      A14489CCEspecif2 = "" ;
      A13252CCEspecif = "" ;
      A13251CCMetodo = "" ;
      A12751CCOkDsc = "" ;
      A4035CCVal = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.preo009__default(),
         new Object[] {
             new Object[] {
            P09W62_A396EmprCod, P09W62_A130BarCodPar, P09W62_A132BarCodReo, P09W62_A129BarCod, P09W62_A11628CCobs2, P09W62_n11628CCobs2, P09W62_A11474CCOkUsu, P09W62_A11473CCOkFch, P09W62_A11472CCOk, P09W62_A11293CcUltn,
            P09W62_n11293CcUltn, P09W62_A7691CCFchUti, P09W62_n7691CCFchUti, P09W62_A4405CcDisp, P09W62_n4405CcDisp, P09W62_A3281CcObs, P09W62_n3281CcObs, P09W62_A4033CCFch, P09W62_n4033CCFch, P09W62_A4032CCOpeCod,
            P09W62_n4032CCOpeCod, P09W62_A4031CCTCod, P09W62_A194BarOrdLin, P09W62_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            P09W64_A396EmprCod, P09W64_A130BarCodPar, P09W64_A132BarCodReo, P09W64_A129BarCod, P09W64_A14489CCEspecif2, P09W64_A13252CCEspecif, P09W64_A13251CCMetodo, P09W64_A12751CCOkDsc, P09W64_A12750CCOkLin, P09W64_A4035CCVal,
            P09W64_A4034CCTLin, P09W64_A4031CCTCod, P09W64_A194BarOrdLin, P09W64_A758ProCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12BarCodReo ;
   private byte AV10CodReo_d ;
   private byte A132BarCodReo ;
   private byte A11472CCOk ;
   private byte W132BarCodReo ;
   private byte A12750CCOkLin ;
   private short AV15BarOrdLin ;
   private short A11293CcUltn ;
   private short A194BarOrdLin ;
   private short W194BarOrdLin ;
   private short Gx_err ;
   private short A4034CCTLin ;
   private short W4034CCTLin ;
   private int AV11BarCod ;
   private int AV16CCTCod ;
   private int AV8BarCod_d ;
   private int A129BarCod ;
   private int A4032CCOpeCod ;
   private int A4031CCTCod ;
   private int W129BarCod ;
   private int W4031CCTCod ;
   private int GX_INS619 ;
   private int GX_INS620 ;
   private String A396EmprCod ;
   private String AV13BarCodPar ;
   private String AV14ProCod ;
   private String AV9CodPar_d ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A11474CCOkUsu ;
   private String A4405CcDisp ;
   private String A758ProCod ;
   private String W396EmprCod ;
   private String W130BarCodPar ;
   private String W758ProCod ;
   private String Gx_emsg ;
   private String A13252CCEspecif ;
   private String A13251CCMetodo ;
   private String A4035CCVal ;
   private java.util.Date A11473CCOkFch ;
   private java.util.Date A7691CCFchUti ;
   private java.util.Date A4033CCFch ;
   private boolean n11628CCobs2 ;
   private boolean n11293CcUltn ;
   private boolean n7691CCFchUti ;
   private boolean n4405CcDisp ;
   private boolean n3281CcObs ;
   private boolean n4033CCFch ;
   private boolean n4032CCOpeCod ;
   private String A11628CCobs2 ;
   private String A3281CcObs ;
   private String A14489CCEspecif2 ;
   private String A12751CCOkDsc ;
   private String[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private int[] aP6 ;
   private int[] aP7 ;
   private byte[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P09W62_A396EmprCod ;
   private String[] P09W62_A130BarCodPar ;
   private byte[] P09W62_A132BarCodReo ;
   private int[] P09W62_A129BarCod ;
   private String[] P09W62_A11628CCobs2 ;
   private boolean[] P09W62_n11628CCobs2 ;
   private String[] P09W62_A11474CCOkUsu ;
   private java.util.Date[] P09W62_A11473CCOkFch ;
   private byte[] P09W62_A11472CCOk ;
   private short[] P09W62_A11293CcUltn ;
   private boolean[] P09W62_n11293CcUltn ;
   private java.util.Date[] P09W62_A7691CCFchUti ;
   private boolean[] P09W62_n7691CCFchUti ;
   private String[] P09W62_A4405CcDisp ;
   private boolean[] P09W62_n4405CcDisp ;
   private String[] P09W62_A3281CcObs ;
   private boolean[] P09W62_n3281CcObs ;
   private java.util.Date[] P09W62_A4033CCFch ;
   private boolean[] P09W62_n4033CCFch ;
   private int[] P09W62_A4032CCOpeCod ;
   private boolean[] P09W62_n4032CCOpeCod ;
   private int[] P09W62_A4031CCTCod ;
   private short[] P09W62_A194BarOrdLin ;
   private String[] P09W62_A758ProCod ;
   private String[] P09W64_A396EmprCod ;
   private String[] P09W64_A130BarCodPar ;
   private byte[] P09W64_A132BarCodReo ;
   private int[] P09W64_A129BarCod ;
   private String[] P09W64_A14489CCEspecif2 ;
   private String[] P09W64_A13252CCEspecif ;
   private String[] P09W64_A13251CCMetodo ;
   private String[] P09W64_A12751CCOkDsc ;
   private byte[] P09W64_A12750CCOkLin ;
   private String[] P09W64_A4035CCVal ;
   private short[] P09W64_A4034CCTLin ;
   private int[] P09W64_A4031CCTCod ;
   private short[] P09W64_A194BarOrdLin ;
   private String[] P09W64_A758ProCod ;
}

final  class preo009__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09W62", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, CCobs2, CCOkUsu, CCOkFch, CCOk, CcUltn, CCFchUti, CcDisp, CcObs, CCFch, CCOpeCod, CCTCod, BarOrdLin, ProCod FROM TXPCC WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and CCTCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P09W63", "INSERT INTO TXPCC(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CCOpeCod, CCFch, CcObs, CcDisp, CCFchUti, CcUltn, CCOk, CCOkFch, CCOkUsu, CCobs2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCC")
         ,new ForEachCursor("P09W64", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, CCEspecif2, CCEspecif, CCMetodo, CCOkDsc, CCOkLin, CCVal, CCTLin, CCTCod, BarOrdLin, ProCod FROM TXPCC1 WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and CCTCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P09W65", "INSERT INTO TXPCC1(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CCTLin, CCVal, CCOkLin, CCOkDsc, CCMetodo, CCEspecif, CCEspecif2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCC1")
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
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 10);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(13);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(14);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(15);
               ((short[]) buf[22])[0] = rslt.getShort(16);
               ((String[]) buf[23])[0] = rslt.getString(17, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 40);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 8);
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
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DATE );
               }
               else
               {
                  stmt.setDate(9, (java.util.Date)parms[10]);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[12], 400);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[14], 1);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DATE );
               }
               else
               {
                  stmt.setDate(12, (java.util.Date)parms[16]);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[18]).shortValue());
               }
               stmt.setByte(14, ((Number) parms[19]).byteValue());
               stmt.setDateTime(15, (java.util.Date)parms[20], false);
               stmt.setString(16, (String)parms[21], 10);
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[23], 300);
               }
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
               stmt.setString(9, (String)parms[8], 40);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setVarchar(11, (String)parms[10], 200, false);
               stmt.setString(12, (String)parms[11], 30);
               stmt.setString(13, (String)parms[12], 30);
               stmt.setVarchar(14, (String)parms[13], 300, false);
               return;
      }
   }

}

