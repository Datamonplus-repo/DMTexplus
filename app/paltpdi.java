package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class paltpdi extends GXProcedure
{
   public paltpdi( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( paltpdi.class ), "" );
   }

   public paltpdi( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             int[] aP6 ,
                             String[] aP7 )
   {
      paltpdi.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        int[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             int[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 )
   {
      paltpdi.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      paltpdi.this.AV16DisCod = aP1[0];
      this.aP1 = aP1;
      paltpdi.this.AV17AlbRecCod = aP2[0];
      this.aP2 = aP2;
      paltpdi.this.AV18BarPieCod = aP3[0];
      this.aP3 = aP3;
      paltpdi.this.AV19BarPieKil = aP4[0];
      this.aP4 = aP4;
      paltpdi.this.AV20BarPieMet = aP5[0];
      this.aP5 = aP5;
      paltpdi.this.AV21BarPiePie = aP6[0];
      this.aP6 = aP6;
      paltpdi.this.AV22Desglose = aP7[0];
      this.aP7 = aP7;
      paltpdi.this.AV23BarUniMed = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV30FlagPzaR = (byte)(0) ;
      GXv_int1[0] = AV30FlagPzaR ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "PZAREF", ""), GXv_int1) ;
      paltpdi.this.AV30FlagPzaR = GXv_int1[0] ;
      AV25DisNumUniK = AV19BarPieKil ;
      AV26DisNumUniM = AV20BarPieMet ;
      if ( GXutil.strcmp(AV22Desglose, httpContext.getMessage( "S", "")) == 0 )
      {
         if ( AV33Sedamil == 0 )
         {
            /*
               INSERT RECORD ON TABLE TXPDISALB

            */
            A396EmprCod = AV15EmprCod ;
            A361DisCod = AV16DisCod ;
            A44AlbRecCod = AV17AlbRecCod ;
            /* Using cursor P00A62 */
            pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
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
            AV24NumPie = 1 ;
            /*
               INSERT RECORD ON TABLE TXPDISALD

            */
            A396EmprCod = AV15EmprCod ;
            A361DisCod = AV16DisCod ;
            A44AlbRecCod = AV17AlbRecCod ;
            A380DisPieCod = GXutil.substring( AV18BarPieCod, 1, 9) ;
            A382DisPieKil = AV19BarPieKil ;
            A384DisPieMet = AV20BarPieMet ;
            if ( AV30FlagPzaR == 1 )
            {
               GXv_char2[0] = AV15EmprCod ;
               GXv_int3[0] = AV17AlbRecCod ;
               GXv_char4[0] = AV18BarPieCod ;
               GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
               GXv_char7[0] = A2184DisPieLoc ;
               GXv_int1[0] = (byte)(0) ;
               new app.pchkpzr(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4, GXv_decimal5, GXv_decimal6, GXv_char7, GXv_int1) ;
               paltpdi.this.AV15EmprCod = GXv_char2[0] ;
               paltpdi.this.AV17AlbRecCod = GXv_int3[0] ;
               paltpdi.this.AV18BarPieCod = GXv_char4[0] ;
               paltpdi.this.A2184DisPieLoc = GXv_char7[0] ;
            }
            /* Using cursor P00A63 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), A380DisPieCod, A382DisPieKil, A384DisPieMet});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALD");
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
            /* End Insert */
         }
         /* Using cursor P00A64 */
         pr_default.execute(2, new Object[] {AV15EmprCod, Integer.valueOf(AV17AlbRecCod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A44AlbRecCod = P00A64_A44AlbRecCod[0] ;
            A396EmprCod = P00A64_A396EmprCod[0] ;
            A54AlbRPieUti = P00A64_A54AlbRPieUti[0] ;
            A60AlbRUniUti = P00A64_A60AlbRUniUti[0] ;
            A48AlbRFecUlt = P00A64_A48AlbRFecUlt[0] ;
            A54AlbRPieUti = (int)(A54AlbRPieUti+1) ;
            if ( GXutil.strcmp(AV23BarUniMed, httpContext.getMessage( "K", "")) == 0 )
            {
               A60AlbRUniUti = A60AlbRUniUti.add(AV19BarPieKil) ;
            }
            else
            {
               A60AlbRUniUti = A60AlbRUniUti.add(AV20BarPieMet) ;
            }
            A48AlbRFecUlt = GXutil.today( ) ;
            /* Using cursor P00A65 */
            pr_default.execute(3, new Object[] {Integer.valueOf(A54AlbRPieUti), A60AlbRUniUti, A48AlbRFecUlt, A396EmprCod, Integer.valueOf(A44AlbRecCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
      }
      else
      {
         AV24NumPie = AV21BarPiePie ;
         /*
            INSERT RECORD ON TABLE TXPDISALB

         */
         A396EmprCod = AV15EmprCod ;
         A361DisCod = AV16DisCod ;
         A44AlbRecCod = AV17AlbRecCod ;
         A673Piezas = AV21BarPiePie ;
         A595Kilos = AV19BarPieKil ;
         A631Metros = AV20BarPieMet ;
         /* Using cursor P00A66 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), Integer.valueOf(A673Piezas), A595Kilos, A631Metros});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
         if ( (pr_default.getStatus(4) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            /* Optimized UPDATE. */
            /* Using cursor P00A67 */
            pr_default.execute(5, new Object[] {AV20BarPieMet, AV19BarPieKil, Integer.valueOf(AV21BarPiePie), AV15EmprCod, Integer.valueOf(AV16DisCod), Integer.valueOf(AV17AlbRecCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
            /* End optimized UPDATE. */
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
         /* Using cursor P00A68 */
         pr_default.execute(6, new Object[] {AV15EmprCod, Integer.valueOf(AV17AlbRecCod)});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A44AlbRecCod = P00A68_A44AlbRecCod[0] ;
            A396EmprCod = P00A68_A396EmprCod[0] ;
            A54AlbRPieUti = P00A68_A54AlbRPieUti[0] ;
            A60AlbRUniUti = P00A68_A60AlbRUniUti[0] ;
            A54AlbRPieUti = (int)(A54AlbRPieUti+AV21BarPiePie) ;
            if ( GXutil.strcmp(AV23BarUniMed, httpContext.getMessage( "K", "")) == 0 )
            {
               A60AlbRUniUti = A60AlbRUniUti.add(AV19BarPieKil) ;
            }
            else
            {
               A60AlbRUniUti = A60AlbRUniUti.add(AV20BarPieMet) ;
            }
            /* Using cursor P00A69 */
            pr_default.execute(7, new Object[] {Integer.valueOf(A54AlbRPieUti), A60AlbRUniUti, A396EmprCod, Integer.valueOf(A44AlbRecCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(6);
         /* Using cursor P00A610 */
         pr_default.execute(8, new Object[] {AV15EmprCod, Integer.valueOf(AV17AlbRecCod)});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A44AlbRecCod = P00A610_A44AlbRecCod[0] ;
            A396EmprCod = P00A610_A396EmprCod[0] ;
            A60AlbRUniUti = P00A610_A60AlbRUniUti[0] ;
            A58AlbRUniEnt = P00A610_A58AlbRUniEnt[0] ;
            A47AlbREst = P00A610_A47AlbREst[0] ;
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() <= 0 )
            {
               A47AlbREst = (byte)(1) ;
            }
            /* Using cursor P00A611 */
            pr_default.execute(9, new Object[] {Byte.valueOf(A47AlbREst), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(8);
      }
      /* Using cursor P00A612 */
      pr_default.execute(10, new Object[] {AV15EmprCod, Integer.valueOf(AV16DisCod), Byte.valueOf(AV33Sedamil)});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A361DisCod = P00A612_A361DisCod[0] ;
         A396EmprCod = P00A612_A396EmprCod[0] ;
         A1013DibCli = P00A612_A1013DibCli[0] ;
         n1013DibCli = P00A612_n1013DibCli[0] ;
         A252CliCod = P00A612_A252CliCod[0] ;
         A1014DibInt = P00A612_A1014DibInt[0] ;
         n1014DibInt = P00A612_n1014DibInt[0] ;
         A374DisNumPie = P00A612_A374DisNumPie[0] ;
         A392DisUniMed = P00A612_A392DisUniMed[0] ;
         A375DisNumUni = P00A612_A375DisNumUni[0] ;
         if ( AV31PLinea == 1 )
         {
            AV32DisNumOld = DecimalUtil.doubleToDec(0) ;
            GXv_char7[0] = A396EmprCod ;
            GXv_char4[0] = A1013DibCli ;
            GXv_int3[0] = A252CliCod ;
            GXv_int8[0] = A1014DibInt ;
            GXv_decimal6[0] = AV26DisNumUniM ;
            GXv_decimal5[0] = AV32DisNumOld ;
            new app.psumtes(remoteHandle, context).execute( GXv_char7, GXv_char4, GXv_int3, GXv_int8, GXv_decimal6, GXv_decimal5) ;
            paltpdi.this.A396EmprCod = GXv_char7[0] ;
            paltpdi.this.A1013DibCli = GXv_char4[0] ;
            paltpdi.this.A252CliCod = GXv_int3[0] ;
            paltpdi.this.A1014DibInt = GXv_int8[0] ;
            paltpdi.this.AV26DisNumUniM = GXv_decimal6[0] ;
            paltpdi.this.AV32DisNumOld = GXv_decimal5[0] ;
         }
         A374DisNumPie = (short)(A374DisNumPie+AV24NumPie) ;
         if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "K", "")) == 0 )
         {
            A375DisNumUni = A375DisNumUni.add(AV25DisNumUniK) ;
         }
         else
         {
            A375DisNumUni = A375DisNumUni.add(AV26DisNumUniM) ;
         }
         /* Using cursor P00A613 */
         pr_default.execute(11, new Object[] {Short.valueOf(A374DisNumPie), A375DisNumUni, A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = paltpdi.this.AV15EmprCod;
      this.aP1[0] = paltpdi.this.AV16DisCod;
      this.aP2[0] = paltpdi.this.AV17AlbRecCod;
      this.aP3[0] = paltpdi.this.AV18BarPieCod;
      this.aP4[0] = paltpdi.this.AV19BarPieKil;
      this.aP5[0] = paltpdi.this.AV20BarPieMet;
      this.aP6[0] = paltpdi.this.AV21BarPiePie;
      this.aP7[0] = paltpdi.this.AV22Desglose;
      this.aP8[0] = paltpdi.this.AV23BarUniMed;
      Application.commitDataStores(context, remoteHandle, pr_default, "paltpdi");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV25DisNumUniK = DecimalUtil.ZERO ;
      AV26DisNumUniM = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      Gx_emsg = "" ;
      A380DisPieCod = "" ;
      A382DisPieKil = DecimalUtil.ZERO ;
      A384DisPieMet = DecimalUtil.ZERO ;
      GXv_char2 = new String[1] ;
      A2184DisPieLoc = "" ;
      GXv_int1 = new byte[1] ;
      scmdbuf = "" ;
      P00A64_A44AlbRecCod = new int[1] ;
      P00A64_A396EmprCod = new String[] {""} ;
      P00A64_A54AlbRPieUti = new int[1] ;
      P00A64_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00A64_A48AlbRFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A48AlbRFecUlt = GXutil.nullDate() ;
      A595Kilos = DecimalUtil.ZERO ;
      A631Metros = DecimalUtil.ZERO ;
      P00A68_A44AlbRecCod = new int[1] ;
      P00A68_A396EmprCod = new String[] {""} ;
      P00A68_A54AlbRPieUti = new int[1] ;
      P00A68_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00A610_A44AlbRecCod = new int[1] ;
      P00A610_A396EmprCod = new String[] {""} ;
      P00A610_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00A610_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00A610_A47AlbREst = new byte[1] ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      P00A612_A361DisCod = new int[1] ;
      P00A612_A396EmprCod = new String[] {""} ;
      P00A612_A1013DibCli = new String[] {""} ;
      P00A612_n1013DibCli = new boolean[] {false} ;
      P00A612_A252CliCod = new int[1] ;
      P00A612_A1014DibInt = new int[1] ;
      P00A612_n1014DibInt = new boolean[] {false} ;
      P00A612_A374DisNumPie = new short[1] ;
      P00A612_A392DisUniMed = new String[] {""} ;
      P00A612_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A1013DibCli = "" ;
      A392DisUniMed = "" ;
      A375DisNumUni = DecimalUtil.ZERO ;
      AV32DisNumOld = DecimalUtil.ZERO ;
      GXv_char7 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_int8 = new int[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.paltpdi__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00A64_A44AlbRecCod, P00A64_A396EmprCod, P00A64_A54AlbRPieUti, P00A64_A60AlbRUniUti, P00A64_A48AlbRFecUlt
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00A68_A44AlbRecCod, P00A68_A396EmprCod, P00A68_A54AlbRPieUti, P00A68_A60AlbRUniUti
            }
            , new Object[] {
            }
            , new Object[] {
            P00A610_A44AlbRecCod, P00A610_A396EmprCod, P00A610_A60AlbRUniUti, P00A610_A58AlbRUniEnt, P00A610_A47AlbREst
            }
            , new Object[] {
            }
            , new Object[] {
            P00A612_A361DisCod, P00A612_A396EmprCod, P00A612_A1013DibCli, P00A612_n1013DibCli, P00A612_A252CliCod, P00A612_A1014DibInt, P00A612_n1014DibInt, P00A612_A374DisNumPie, P00A612_A392DisUniMed, P00A612_A375DisNumUni
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV30FlagPzaR ;
   private byte AV33Sedamil ;
   private byte GXv_int1[] ;
   private byte A47AlbREst ;
   private byte AV31PLinea ;
   private short Gx_err ;
   private short A374DisNumPie ;
   private int AV16DisCod ;
   private int AV17AlbRecCod ;
   private int AV21BarPiePie ;
   private int GX_INS35 ;
   private int A361DisCod ;
   private int A44AlbRecCod ;
   private int AV24NumPie ;
   private int GX_INS36 ;
   private int A54AlbRPieUti ;
   private int A673Piezas ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private int GXv_int3[] ;
   private int GXv_int8[] ;
   private java.math.BigDecimal AV19BarPieKil ;
   private java.math.BigDecimal AV20BarPieMet ;
   private java.math.BigDecimal AV25DisNumUniK ;
   private java.math.BigDecimal AV26DisNumUniM ;
   private java.math.BigDecimal A382DisPieKil ;
   private java.math.BigDecimal A384DisPieMet ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A595Kilos ;
   private java.math.BigDecimal A631Metros ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A375DisNumUni ;
   private java.math.BigDecimal AV32DisNumOld ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private String AV15EmprCod ;
   private String AV18BarPieCod ;
   private String AV22Desglose ;
   private String AV23BarUniMed ;
   private String A396EmprCod ;
   private String Gx_emsg ;
   private String A380DisPieCod ;
   private String GXv_char2[] ;
   private String A2184DisPieLoc ;
   private String scmdbuf ;
   private String A1013DibCli ;
   private String A392DisUniMed ;
   private String GXv_char7[] ;
   private String GXv_char4[] ;
   private java.util.Date A48AlbRFecUlt ;
   private boolean n1013DibCli ;
   private boolean n1014DibInt ;
   private String[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private int[] aP6 ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
   private int[] P00A64_A44AlbRecCod ;
   private String[] P00A64_A396EmprCod ;
   private int[] P00A64_A54AlbRPieUti ;
   private java.math.BigDecimal[] P00A64_A60AlbRUniUti ;
   private java.util.Date[] P00A64_A48AlbRFecUlt ;
   private int[] P00A68_A44AlbRecCod ;
   private String[] P00A68_A396EmprCod ;
   private int[] P00A68_A54AlbRPieUti ;
   private java.math.BigDecimal[] P00A68_A60AlbRUniUti ;
   private int[] P00A610_A44AlbRecCod ;
   private String[] P00A610_A396EmprCod ;
   private java.math.BigDecimal[] P00A610_A60AlbRUniUti ;
   private java.math.BigDecimal[] P00A610_A58AlbRUniEnt ;
   private byte[] P00A610_A47AlbREst ;
   private int[] P00A612_A361DisCod ;
   private String[] P00A612_A396EmprCod ;
   private String[] P00A612_A1013DibCli ;
   private boolean[] P00A612_n1013DibCli ;
   private int[] P00A612_A252CliCod ;
   private int[] P00A612_A1014DibInt ;
   private boolean[] P00A612_n1014DibInt ;
   private short[] P00A612_A374DisNumPie ;
   private String[] P00A612_A392DisUniMed ;
   private java.math.BigDecimal[] P00A612_A375DisNumUni ;
}

final  class paltpdi__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P00A62", "INSERT INTO TXPDISALB(EmprCod, DisCod, AlbRecCod, Piezas, Kilos, Metros, KilosUti, MetrosUti, PiezasUti) VALUES(?, ?, ?, 0, 0, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
         ,new UpdateCursor("P00A63", "INSERT INTO TXPDISALD(EmprCod, DisCod, AlbRecCod, DisPieCod, DisPieKil, DisPieMet, DisPieLoc, DisPieAnc, DisPieEst, DisPieIdPz, DisPieCodB, DisPieAncc, DisPiePda) VALUES(?, ?, ?, ?, ?, ?, ' ', 0, 0, ' ', ' ', 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALD")
         ,new ForEachCursor("P00A64", "SELECT AlbRecCod, EmprCod, AlbRPieUti, AlbRUniUti, AlbRFecUlt FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00A65", "UPDATE TXPALBREC SET AlbRPieUti=?, AlbRUniUti=?, AlbRFecUlt=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
         ,new UpdateCursor("P00A66", "INSERT INTO TXPDISALB(EmprCod, DisCod, AlbRecCod, Piezas, Kilos, Metros, KilosUti, MetrosUti, PiezasUti) VALUES(?, ?, ?, ?, ?, ?, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
         ,new UpdateCursor("P00A67", "UPDATE TXPDISALB SET Metros=Metros + ?, Kilos=Kilos + ?, Piezas=Piezas + ?  WHERE EmprCod = ? and DisCod = ? and AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
         ,new ForEachCursor("P00A68", "SELECT AlbRecCod, EmprCod, AlbRPieUti, AlbRUniUti FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00A69", "UPDATE TXPALBREC SET AlbRPieUti=?, AlbRUniUti=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
         ,new ForEachCursor("P00A610", "SELECT AlbRecCod, EmprCod, AlbRUniUti, AlbRUniEnt, AlbREst FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00A611", "UPDATE TXPALBREC SET AlbREst=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
         ,new ForEachCursor("P00A612", "SELECT DisCod, EmprCod, DibCli, CliCod, DibInt, DisNumPie, DisUniMed, DisNumUni FROM TXPDISPOS WHERE (EmprCod = ? and DisCod = ?) AND (? = 0) ORDER BY EmprCod, DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00A613", "UPDATE TXPDISPOS SET DisNumPie=?, DisNumUni=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 10 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 9);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               return;
            case 5 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 11 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

