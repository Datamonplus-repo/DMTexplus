package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbarmod extends GXProcedure
{
   public pbarmod( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbarmod.class ), "" );
   }

   public pbarmod( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           String[] aP4 ,
                           String[] aP5 ,
                           String[] aP6 ,
                           String[] aP7 ,
                           String[] aP8 ,
                           String[] aP9 ,
                           String[] aP10 ,
                           java.math.BigDecimal[] aP11 ,
                           java.math.BigDecimal[] aP12 )
   {
      pbarmod.this.aP13 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
      return aP13[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 ,
                        java.math.BigDecimal[] aP11 ,
                        java.math.BigDecimal[] aP12 ,
                        byte[] aP13 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             java.math.BigDecimal[] aP11 ,
                             java.math.BigDecimal[] aP12 ,
                             byte[] aP13 )
   {
      pbarmod.this.A5632VEmprCod = aP0[0];
      this.aP0 = aP0;
      pbarmod.this.AV8VBarCod = aP1[0];
      this.aP1 = aP1;
      pbarmod.this.AV10VBarCodReo = aP2[0];
      this.aP2 = aP2;
      pbarmod.this.AV9VBarCodPar = aP3[0];
      this.aP3 = aP3;
      pbarmod.this.AV11VBarDisNum = aP4[0];
      this.aP4 = aP4;
      pbarmod.this.AV12VBarProOri = aP5[0];
      this.aP5 = aP5;
      pbarmod.this.AV13VBarProMod = aP6[0];
      this.aP6 = aP6;
      pbarmod.this.AV14VBarFasOri = aP7[0];
      this.aP7 = aP7;
      pbarmod.this.AV15VBarFasMod = aP8[0];
      this.aP8 = aP8;
      pbarmod.this.AV16VBarPzaOri = aP9[0];
      this.aP9 = aP9;
      pbarmod.this.AV17VBarPzaMod = aP10[0];
      this.aP10 = aP10;
      pbarmod.this.AV18VBarKilos = aP11[0];
      this.aP11 = aP11;
      pbarmod.this.AV19VBarMetros = aP12[0];
      this.aP12 = aP12;
      pbarmod.this.AV20Opcion = aP13[0];
      this.aP13 = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01XP2 */
      pr_default.execute(0, new Object[] {A5632VEmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5647VFecTras = P01XP2_A5647VFecTras[0] ;
         n5647VFecTras = P01XP2_n5647VFecTras[0] ;
         A5644VBarMetros = P01XP2_A5644VBarMetros[0] ;
         n5644VBarMetros = P01XP2_n5644VBarMetros[0] ;
         A5643VBarKilos = P01XP2_A5643VBarKilos[0] ;
         n5643VBarKilos = P01XP2_n5643VBarKilos[0] ;
         A5642VBarPzaMod = P01XP2_A5642VBarPzaMod[0] ;
         n5642VBarPzaMod = P01XP2_n5642VBarPzaMod[0] ;
         A5641VBarPzaOri = P01XP2_A5641VBarPzaOri[0] ;
         n5641VBarPzaOri = P01XP2_n5641VBarPzaOri[0] ;
         A5640VBarFasMod = P01XP2_A5640VBarFasMod[0] ;
         n5640VBarFasMod = P01XP2_n5640VBarFasMod[0] ;
         A5639VBarFasOri = P01XP2_A5639VBarFasOri[0] ;
         n5639VBarFasOri = P01XP2_n5639VBarFasOri[0] ;
         A5638VBarProMod = P01XP2_A5638VBarProMod[0] ;
         n5638VBarProMod = P01XP2_n5638VBarProMod[0] ;
         A5637VBarProOri = P01XP2_A5637VBarProOri[0] ;
         n5637VBarProOri = P01XP2_n5637VBarProOri[0] ;
         A5636VBarDisNum = P01XP2_A5636VBarDisNum[0] ;
         n5636VBarDisNum = P01XP2_n5636VBarDisNum[0] ;
         A5635VBarCodPar = P01XP2_A5635VBarCodPar[0] ;
         n5635VBarCodPar = P01XP2_n5635VBarCodPar[0] ;
         A5634VBarCodReo = P01XP2_A5634VBarCodReo[0] ;
         n5634VBarCodReo = P01XP2_n5634VBarCodReo[0] ;
         A5633VBarCod = P01XP2_A5633VBarCod[0] ;
         n5633VBarCod = P01XP2_n5633VBarCod[0] ;
         A5646VBarAncho = P01XP2_A5646VBarAncho[0] ;
         n5646VBarAncho = P01XP2_n5646VBarAncho[0] ;
         A5645VBarColor = P01XP2_A5645VBarColor[0] ;
         n5645VBarColor = P01XP2_n5645VBarColor[0] ;
         /*
            INSERT RECORD ON TABLE TXPBARMOD

         */
         W5633VBarCod = A5633VBarCod ;
         n5633VBarCod = false ;
         W5634VBarCodReo = A5634VBarCodReo ;
         n5634VBarCodReo = false ;
         W5635VBarCodPar = A5635VBarCodPar ;
         n5635VBarCodPar = false ;
         W5636VBarDisNum = A5636VBarDisNum ;
         n5636VBarDisNum = false ;
         W5640VBarFasMod = A5640VBarFasMod ;
         n5640VBarFasMod = false ;
         W5639VBarFasOri = A5639VBarFasOri ;
         n5639VBarFasOri = false ;
         W5643VBarKilos = A5643VBarKilos ;
         n5643VBarKilos = false ;
         W5644VBarMetros = A5644VBarMetros ;
         n5644VBarMetros = false ;
         W5638VBarProMod = A5638VBarProMod ;
         n5638VBarProMod = false ;
         W5637VBarProOri = A5637VBarProOri ;
         n5637VBarProOri = false ;
         W5642VBarPzaMod = A5642VBarPzaMod ;
         n5642VBarPzaMod = false ;
         W5641VBarPzaOri = A5641VBarPzaOri ;
         n5641VBarPzaOri = false ;
         W5647VFecTras = A5647VFecTras ;
         n5647VFecTras = false ;
         A5633VBarCod = AV8VBarCod ;
         n5633VBarCod = false ;
         A5634VBarCodReo = AV10VBarCodReo ;
         n5634VBarCodReo = false ;
         A5635VBarCodPar = AV9VBarCodPar ;
         n5635VBarCodPar = false ;
         A5636VBarDisNum = AV11VBarDisNum ;
         n5636VBarDisNum = false ;
         A5640VBarFasMod = AV15VBarFasMod ;
         n5640VBarFasMod = false ;
         A5639VBarFasOri = AV14VBarFasOri ;
         n5639VBarFasOri = false ;
         A5643VBarKilos = AV18VBarKilos ;
         n5643VBarKilos = false ;
         A5644VBarMetros = AV19VBarMetros ;
         n5644VBarMetros = false ;
         A5638VBarProMod = AV13VBarProMod ;
         n5638VBarProMod = false ;
         A5637VBarProOri = AV12VBarProOri ;
         n5637VBarProOri = false ;
         A5642VBarPzaMod = AV17VBarPzaMod ;
         n5642VBarPzaMod = false ;
         A5641VBarPzaOri = AV16VBarPzaOri ;
         n5641VBarPzaOri = false ;
         A5647VFecTras = GXutil.resetTime(GXutil.serverNow( context, remoteHandle, pr_default)) ;
         n5647VFecTras = false ;
         /* Using cursor P01XP3 */
         pr_default.execute(1, new Object[] {A5632VEmprCod, Boolean.valueOf(n5633VBarCod), Integer.valueOf(A5633VBarCod), Boolean.valueOf(n5634VBarCodReo), Byte.valueOf(A5634VBarCodReo), Boolean.valueOf(n5635VBarCodPar), A5635VBarCodPar, Boolean.valueOf(n5636VBarDisNum), A5636VBarDisNum, Boolean.valueOf(n5637VBarProOri), A5637VBarProOri, Boolean.valueOf(n5638VBarProMod), A5638VBarProMod, Boolean.valueOf(n5639VBarFasOri), A5639VBarFasOri, Boolean.valueOf(n5640VBarFasMod), A5640VBarFasMod, Boolean.valueOf(n5641VBarPzaOri), A5641VBarPzaOri, Boolean.valueOf(n5642VBarPzaMod), A5642VBarPzaMod, Boolean.valueOf(n5643VBarKilos), A5643VBarKilos, Boolean.valueOf(n5644VBarMetros), A5644VBarMetros, Boolean.valueOf(n5645VBarColor), Integer.valueOf(A5645VBarColor), Boolean.valueOf(n5646VBarAncho), Short.valueOf(A5646VBarAncho), Boolean.valueOf(n5647VFecTras), A5647VFecTras});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARMOD");
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
         A5633VBarCod = W5633VBarCod ;
         n5633VBarCod = false ;
         A5634VBarCodReo = W5634VBarCodReo ;
         n5634VBarCodReo = false ;
         A5635VBarCodPar = W5635VBarCodPar ;
         n5635VBarCodPar = false ;
         A5636VBarDisNum = W5636VBarDisNum ;
         n5636VBarDisNum = false ;
         A5640VBarFasMod = W5640VBarFasMod ;
         n5640VBarFasMod = false ;
         A5639VBarFasOri = W5639VBarFasOri ;
         n5639VBarFasOri = false ;
         A5643VBarKilos = W5643VBarKilos ;
         n5643VBarKilos = false ;
         A5644VBarMetros = W5644VBarMetros ;
         n5644VBarMetros = false ;
         A5638VBarProMod = W5638VBarProMod ;
         n5638VBarProMod = false ;
         A5637VBarProOri = W5637VBarProOri ;
         n5637VBarProOri = false ;
         A5642VBarPzaMod = W5642VBarPzaMod ;
         n5642VBarPzaMod = false ;
         A5641VBarPzaOri = W5641VBarPzaOri ;
         n5641VBarPzaOri = false ;
         A5647VFecTras = W5647VFecTras ;
         n5647VFecTras = false ;
         /* End Insert */
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbarmod.this.A5632VEmprCod;
      this.aP1[0] = pbarmod.this.AV8VBarCod;
      this.aP2[0] = pbarmod.this.AV10VBarCodReo;
      this.aP3[0] = pbarmod.this.AV9VBarCodPar;
      this.aP4[0] = pbarmod.this.AV11VBarDisNum;
      this.aP5[0] = pbarmod.this.AV12VBarProOri;
      this.aP6[0] = pbarmod.this.AV13VBarProMod;
      this.aP7[0] = pbarmod.this.AV14VBarFasOri;
      this.aP8[0] = pbarmod.this.AV15VBarFasMod;
      this.aP9[0] = pbarmod.this.AV16VBarPzaOri;
      this.aP10[0] = pbarmod.this.AV17VBarPzaMod;
      this.aP11[0] = pbarmod.this.AV18VBarKilos;
      this.aP12[0] = pbarmod.this.AV19VBarMetros;
      this.aP13[0] = pbarmod.this.AV20Opcion;
      Application.commitDataStores(context, remoteHandle, pr_default, "pbarmod");
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
      P01XP2_A5632VEmprCod = new String[] {""} ;
      P01XP2_A5647VFecTras = new java.util.Date[] {GXutil.nullDate()} ;
      P01XP2_n5647VFecTras = new boolean[] {false} ;
      P01XP2_A5644VBarMetros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01XP2_n5644VBarMetros = new boolean[] {false} ;
      P01XP2_A5643VBarKilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01XP2_n5643VBarKilos = new boolean[] {false} ;
      P01XP2_A5642VBarPzaMod = new String[] {""} ;
      P01XP2_n5642VBarPzaMod = new boolean[] {false} ;
      P01XP2_A5641VBarPzaOri = new String[] {""} ;
      P01XP2_n5641VBarPzaOri = new boolean[] {false} ;
      P01XP2_A5640VBarFasMod = new String[] {""} ;
      P01XP2_n5640VBarFasMod = new boolean[] {false} ;
      P01XP2_A5639VBarFasOri = new String[] {""} ;
      P01XP2_n5639VBarFasOri = new boolean[] {false} ;
      P01XP2_A5638VBarProMod = new String[] {""} ;
      P01XP2_n5638VBarProMod = new boolean[] {false} ;
      P01XP2_A5637VBarProOri = new String[] {""} ;
      P01XP2_n5637VBarProOri = new boolean[] {false} ;
      P01XP2_A5636VBarDisNum = new String[] {""} ;
      P01XP2_n5636VBarDisNum = new boolean[] {false} ;
      P01XP2_A5635VBarCodPar = new String[] {""} ;
      P01XP2_n5635VBarCodPar = new boolean[] {false} ;
      P01XP2_A5634VBarCodReo = new byte[1] ;
      P01XP2_n5634VBarCodReo = new boolean[] {false} ;
      P01XP2_A5633VBarCod = new int[1] ;
      P01XP2_n5633VBarCod = new boolean[] {false} ;
      P01XP2_A5646VBarAncho = new short[1] ;
      P01XP2_n5646VBarAncho = new boolean[] {false} ;
      P01XP2_A5645VBarColor = new int[1] ;
      P01XP2_n5645VBarColor = new boolean[] {false} ;
      A5647VFecTras = GXutil.nullDate() ;
      A5644VBarMetros = DecimalUtil.ZERO ;
      A5643VBarKilos = DecimalUtil.ZERO ;
      A5642VBarPzaMod = "" ;
      A5641VBarPzaOri = "" ;
      A5640VBarFasMod = "" ;
      A5639VBarFasOri = "" ;
      A5638VBarProMod = "" ;
      A5637VBarProOri = "" ;
      A5636VBarDisNum = "" ;
      A5635VBarCodPar = "" ;
      W5635VBarCodPar = "" ;
      W5636VBarDisNum = "" ;
      W5640VBarFasMod = "" ;
      W5639VBarFasOri = "" ;
      W5643VBarKilos = DecimalUtil.ZERO ;
      W5644VBarMetros = DecimalUtil.ZERO ;
      W5638VBarProMod = "" ;
      W5637VBarProOri = "" ;
      W5642VBarPzaMod = "" ;
      W5641VBarPzaOri = "" ;
      W5647VFecTras = GXutil.nullDate() ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbarmod__default(),
         new Object[] {
             new Object[] {
            P01XP2_A5632VEmprCod, P01XP2_A5647VFecTras, P01XP2_n5647VFecTras, P01XP2_A5644VBarMetros, P01XP2_n5644VBarMetros, P01XP2_A5643VBarKilos, P01XP2_n5643VBarKilos, P01XP2_A5642VBarPzaMod, P01XP2_n5642VBarPzaMod, P01XP2_A5641VBarPzaOri,
            P01XP2_n5641VBarPzaOri, P01XP2_A5640VBarFasMod, P01XP2_n5640VBarFasMod, P01XP2_A5639VBarFasOri, P01XP2_n5639VBarFasOri, P01XP2_A5638VBarProMod, P01XP2_n5638VBarProMod, P01XP2_A5637VBarProOri, P01XP2_n5637VBarProOri, P01XP2_A5636VBarDisNum,
            P01XP2_n5636VBarDisNum, P01XP2_A5635VBarCodPar, P01XP2_n5635VBarCodPar, P01XP2_A5634VBarCodReo, P01XP2_n5634VBarCodReo, P01XP2_A5633VBarCod, P01XP2_n5633VBarCod, P01XP2_A5646VBarAncho, P01XP2_n5646VBarAncho, P01XP2_A5645VBarColor,
            P01XP2_n5645VBarColor
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10VBarCodReo ;
   private byte AV20Opcion ;
   private byte A5634VBarCodReo ;
   private byte W5634VBarCodReo ;
   private short A5646VBarAncho ;
   private short Gx_err ;
   private int AV8VBarCod ;
   private int A5633VBarCod ;
   private int A5645VBarColor ;
   private int GX_INS833 ;
   private int W5633VBarCod ;
   private java.math.BigDecimal AV18VBarKilos ;
   private java.math.BigDecimal AV19VBarMetros ;
   private java.math.BigDecimal A5644VBarMetros ;
   private java.math.BigDecimal A5643VBarKilos ;
   private java.math.BigDecimal W5643VBarKilos ;
   private java.math.BigDecimal W5644VBarMetros ;
   private String A5632VEmprCod ;
   private String AV9VBarCodPar ;
   private String AV11VBarDisNum ;
   private String AV12VBarProOri ;
   private String AV13VBarProMod ;
   private String AV14VBarFasOri ;
   private String AV15VBarFasMod ;
   private String AV16VBarPzaOri ;
   private String AV17VBarPzaMod ;
   private String scmdbuf ;
   private String A5642VBarPzaMod ;
   private String A5641VBarPzaOri ;
   private String A5640VBarFasMod ;
   private String A5639VBarFasOri ;
   private String A5638VBarProMod ;
   private String A5637VBarProOri ;
   private String A5636VBarDisNum ;
   private String A5635VBarCodPar ;
   private String W5635VBarCodPar ;
   private String W5636VBarDisNum ;
   private String W5640VBarFasMod ;
   private String W5639VBarFasOri ;
   private String W5638VBarProMod ;
   private String W5637VBarProOri ;
   private String W5642VBarPzaMod ;
   private String W5641VBarPzaOri ;
   private String Gx_emsg ;
   private java.util.Date A5647VFecTras ;
   private java.util.Date W5647VFecTras ;
   private boolean n5647VFecTras ;
   private boolean n5644VBarMetros ;
   private boolean n5643VBarKilos ;
   private boolean n5642VBarPzaMod ;
   private boolean n5641VBarPzaOri ;
   private boolean n5640VBarFasMod ;
   private boolean n5639VBarFasOri ;
   private boolean n5638VBarProMod ;
   private boolean n5637VBarProOri ;
   private boolean n5636VBarDisNum ;
   private boolean n5635VBarCodPar ;
   private boolean n5634VBarCodReo ;
   private boolean n5633VBarCod ;
   private boolean n5646VBarAncho ;
   private boolean n5645VBarColor ;
   private byte[] aP13 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private String[] aP10 ;
   private java.math.BigDecimal[] aP11 ;
   private java.math.BigDecimal[] aP12 ;
   private IDataStoreProvider pr_default ;
   private String[] P01XP2_A5632VEmprCod ;
   private java.util.Date[] P01XP2_A5647VFecTras ;
   private boolean[] P01XP2_n5647VFecTras ;
   private java.math.BigDecimal[] P01XP2_A5644VBarMetros ;
   private boolean[] P01XP2_n5644VBarMetros ;
   private java.math.BigDecimal[] P01XP2_A5643VBarKilos ;
   private boolean[] P01XP2_n5643VBarKilos ;
   private String[] P01XP2_A5642VBarPzaMod ;
   private boolean[] P01XP2_n5642VBarPzaMod ;
   private String[] P01XP2_A5641VBarPzaOri ;
   private boolean[] P01XP2_n5641VBarPzaOri ;
   private String[] P01XP2_A5640VBarFasMod ;
   private boolean[] P01XP2_n5640VBarFasMod ;
   private String[] P01XP2_A5639VBarFasOri ;
   private boolean[] P01XP2_n5639VBarFasOri ;
   private String[] P01XP2_A5638VBarProMod ;
   private boolean[] P01XP2_n5638VBarProMod ;
   private String[] P01XP2_A5637VBarProOri ;
   private boolean[] P01XP2_n5637VBarProOri ;
   private String[] P01XP2_A5636VBarDisNum ;
   private boolean[] P01XP2_n5636VBarDisNum ;
   private String[] P01XP2_A5635VBarCodPar ;
   private boolean[] P01XP2_n5635VBarCodPar ;
   private byte[] P01XP2_A5634VBarCodReo ;
   private boolean[] P01XP2_n5634VBarCodReo ;
   private int[] P01XP2_A5633VBarCod ;
   private boolean[] P01XP2_n5633VBarCod ;
   private short[] P01XP2_A5646VBarAncho ;
   private boolean[] P01XP2_n5646VBarAncho ;
   private int[] P01XP2_A5645VBarColor ;
   private boolean[] P01XP2_n5645VBarColor ;
}

final  class pbarmod__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01XP2", "SELECT VEmprCod, VFecTras, VBarMetros, VBarKilos, VBarPzaMod, VBarPzaOri, VBarFasMod, VBarFasOri, VBarProMod, VBarProOri, VBarDisNum, VBarCodPar, VBarCodReo, VBarCod, VBarAncho, VBarColor FROM TXPBARMOD WHERE VEmprCod = ? ORDER BY VEmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01XP3", "INSERT INTO TXPBARMOD(VEmprCod, VBarCod, VBarCodReo, VBarCodPar, VBarDisNum, VBarProOri, VBarProMod, VBarFasOri, VBarFasMod, VBarPzaOri, VBarPzaMod, VBarKilos, VBarMetros, VBarColor, VBarAncho, VFecTras) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARMOD")
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 9);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 8);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 8);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((byte[]) buf[23])[0] = rslt.getByte(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 8);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 8);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 8);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[14], 8);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[16], 8);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[18], 9);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[20], 9);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[26]).intValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[28]).shortValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DATE );
               }
               else
               {
                  stmt.setDate(16, (java.util.Date)parms[30]);
               }
               return;
      }
   }

}

