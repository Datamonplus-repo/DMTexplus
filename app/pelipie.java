package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pelipie extends GXProcedure
{
   public pelipie( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pelipie.class ), "" );
   }

   public pelipie( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 )
   {
      pelipie.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pelipie.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pelipie.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pelipie.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pelipie.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pelipie.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      pelipie.this.A200BarPieCod = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV15VertexRmto ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VTXRTO", ""), GXv_int2) ;
      pelipie.this.GXt_int1 = GXv_int2[0] ;
      AV15VertexRmto = GXt_int1 ;
      GXt_int1 = AV16SiRemito ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SIREMI", ""), GXv_int2) ;
      pelipie.this.GXt_int1 = GXv_int2[0] ;
      AV16SiRemito = GXt_int1 ;
      /* Using cursor P008X2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1270AlbPMtrEnt = P008X2_A1270AlbPMtrEnt[0] ;
         A27AlbPKilEnt = P008X2_A27AlbPKilEnt[0] ;
         /* Using cursor P008X3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A213BarSit = P008X3_A213BarSit[0] ;
         /* Using cursor P008X4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         A183BarMetLan = P008X4_A183BarMetLan[0] ;
         A170BarKilLan = P008X4_A170BarKilLan[0] ;
         A201BarPieEst = P008X4_A201BarPieEst[0] ;
         /* Using cursor P008X5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         /* Using cursor P008X6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A1261BarAlbKgmE = P008X6_A1261BarAlbKgmE[0] ;
         A1263BarAlbMtrE = P008X6_A1263BarAlbMtrE[0] ;
         A1265BarAlbPie = P008X6_A1265BarAlbPie[0] ;
         W396EmprCod = A396EmprCod ;
         W30AlbProCod = A30AlbProCod ;
         /* Using cursor P008X7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A42AlbPTroCod = P008X7_A42AlbPTroCod[0] ;
            A5303AlbPTroKil = P008X7_A5303AlbPTroKil[0] ;
            A43AlbPTroMet = P008X7_A43AlbPTroMet[0] ;
            W396EmprCod = A396EmprCod ;
            W30AlbProCod = A30AlbProCod ;
            if ( AV16SiRemito == 1 )
            {
               /*
                  INSERT RECORD ON TABLE TXPDLT003

               */
               W396EmprCod = A396EmprCod ;
               W30AlbProCod = A30AlbProCod ;
               A12176DltHdr = A129BarCod ;
               A12177DltR = A132BarCodReo ;
               A12178DltP = A130BarCodPar ;
               A12180DltNPieza = A200BarPieCod ;
               A12181DltNTrozo = A42AlbPTroCod ;
               A12169DltKgsTrz = A5303AlbPTroKil ;
               n12169DltKgsTrz = false ;
               A12170DltMtsTrz = A43AlbPTroMet ;
               n12170DltMtsTrz = false ;
               /* Using cursor P008X8 */
               pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP, A12180DltNPieza, Short.valueOf(A12181DltNTrozo), Boolean.valueOf(n12169DltKgsTrz), A12169DltKgsTrz, Boolean.valueOf(n12170DltMtsTrz), A12170DltMtsTrz});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDLT003");
               if ( (pr_default.getStatus(6) == 1) )
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
               A30AlbProCod = W30AlbProCod ;
               /* End Insert */
            }
            /* Using cursor P008X9 */
            pr_default.execute(7, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A42AlbPTroCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALTRZ");
            A396EmprCod = W396EmprCod ;
            A30AlbProCod = W30AlbProCod ;
            pr_default.readNext(5);
         }
         pr_default.close(5);
         A183BarMetLan = A183BarMetLan.subtract(A1270AlbPMtrEnt) ;
         A170BarKilLan = A170BarKilLan.subtract(A27AlbPKilEnt) ;
         A201BarPieEst = (byte)(0) ;
         A1261BarAlbKgmE = A1261BarAlbKgmE.subtract(A27AlbPKilEnt) ;
         A1263BarAlbMtrE = A1263BarAlbMtrE.subtract(A1270AlbPMtrEnt) ;
         A1265BarAlbPie = (int)(A1265BarAlbPie-1) ;
         if ( A213BarSit == 9 )
         {
            A213BarSit = (byte)(6) ;
         }
         /* Using cursor P008X10 */
         pr_default.execute(8, new Object[] {Byte.valueOf(A213BarSit), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Using cursor P008X11 */
         pr_default.execute(9, new Object[] {A183BarMetLan, A170BarKilLan, Byte.valueOf(A201BarPieEst), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
         /* Using cursor P008X12 */
         pr_default.execute(10, new Object[] {A1261BarAlbKgmE, A1263BarAlbMtrE, Integer.valueOf(A1265BarAlbPie), A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
         A396EmprCod = W396EmprCod ;
         A30AlbProCod = W30AlbProCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      pr_default.close(1);
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(4);
      /* Using cursor P008X13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A27AlbPKilEnt = P008X13_A27AlbPKilEnt[0] ;
         A1270AlbPMtrEnt = P008X13_A1270AlbPMtrEnt[0] ;
         A3117AlbPreAnc = P008X13_A3117AlbPreAnc[0] ;
         n3117AlbPreAnc = P008X13_n3117AlbPreAnc[0] ;
         W396EmprCod = A396EmprCod ;
         W30AlbProCod = A30AlbProCod ;
         if ( AV16SiRemito == 1 )
         {
            /*
               INSERT RECORD ON TABLE TXPDLT002

            */
            W396EmprCod = A396EmprCod ;
            W30AlbProCod = A30AlbProCod ;
            A12176DltHdr = A129BarCod ;
            A12177DltR = A132BarCodReo ;
            A12178DltP = A130BarCodPar ;
            A12180DltNPieza = A200BarPieCod ;
            A12166DltKgsPz = A27AlbPKilEnt ;
            n12166DltKgsPz = false ;
            A12167DltMtsPz = A1270AlbPMtrEnt ;
            n12167DltMtsPz = false ;
            A12168DltAncPz = A3117AlbPreAnc ;
            n12168DltAncPz = false ;
            /* Using cursor P008X14 */
            pr_default.execute(12, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP, A12180DltNPieza, Boolean.valueOf(n12166DltKgsPz), A12166DltKgsPz, Boolean.valueOf(n12167DltMtsPz), A12167DltMtsPz, Boolean.valueOf(n12168DltAncPz), Short.valueOf(A12168DltAncPz)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDLT002");
            if ( (pr_default.getStatus(12) == 1) )
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
            A30AlbProCod = W30AlbProCod ;
            /* End Insert */
         }
         /* Using cursor P008X15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALPRD");
         if ( AV15VertexRmto == 1 )
         {
            GXv_char3[0] = A396EmprCod ;
            GXv_int4[0] = A129BarCod ;
            GXv_int2[0] = A132BarCodReo ;
            GXv_char5[0] = A130BarCodPar ;
            GXv_char6[0] = A200BarPieCod ;
            GXv_char7[0] = "" ;
            GXv_char8[0] = httpContext.getMessage( "PZV", "") ;
            new app.pvxgrain(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int2, GXv_char5, GXv_char6, GXv_char7, GXv_char8) ;
            pelipie.this.A396EmprCod = GXv_char3[0] ;
            pelipie.this.A129BarCod = GXv_int4[0] ;
            pelipie.this.A132BarCodReo = GXv_int2[0] ;
            pelipie.this.A130BarCodPar = GXv_char5[0] ;
            pelipie.this.A200BarPieCod = GXv_char6[0] ;
         }
         A396EmprCod = W396EmprCod ;
         A30AlbProCod = W30AlbProCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(11);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pelipie.this.A396EmprCod;
      this.aP1[0] = pelipie.this.A30AlbProCod;
      this.aP2[0] = pelipie.this.A129BarCod;
      this.aP3[0] = pelipie.this.A132BarCodReo;
      this.aP4[0] = pelipie.this.A130BarCodPar;
      this.aP5[0] = pelipie.this.A200BarPieCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pelipie");
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
      P008X2_A396EmprCod = new String[] {""} ;
      P008X2_A30AlbProCod = new long[1] ;
      P008X2_A129BarCod = new int[1] ;
      P008X2_A132BarCodReo = new byte[1] ;
      P008X2_A130BarCodPar = new String[] {""} ;
      P008X2_A200BarPieCod = new String[] {""} ;
      P008X2_A1270AlbPMtrEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008X2_A27AlbPKilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A1270AlbPMtrEnt = DecimalUtil.ZERO ;
      A27AlbPKilEnt = DecimalUtil.ZERO ;
      P008X3_A213BarSit = new byte[1] ;
      P008X4_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008X4_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008X4_A201BarPieEst = new byte[1] ;
      A183BarMetLan = DecimalUtil.ZERO ;
      A170BarKilLan = DecimalUtil.ZERO ;
      P008X5_A396EmprCod = new String[] {""} ;
      P008X6_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008X6_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008X6_A1265BarAlbPie = new int[1] ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      W396EmprCod = "" ;
      P008X7_A396EmprCod = new String[] {""} ;
      P008X7_A30AlbProCod = new long[1] ;
      P008X7_A129BarCod = new int[1] ;
      P008X7_A132BarCodReo = new byte[1] ;
      P008X7_A130BarCodPar = new String[] {""} ;
      P008X7_A200BarPieCod = new String[] {""} ;
      P008X7_A42AlbPTroCod = new short[1] ;
      P008X7_A5303AlbPTroKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008X7_A43AlbPTroMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A5303AlbPTroKil = DecimalUtil.ZERO ;
      A43AlbPTroMet = DecimalUtil.ZERO ;
      A12178DltP = "" ;
      A12180DltNPieza = "" ;
      A12169DltKgsTrz = DecimalUtil.ZERO ;
      A12170DltMtsTrz = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      P008X13_A396EmprCod = new String[] {""} ;
      P008X13_A30AlbProCod = new long[1] ;
      P008X13_A129BarCod = new int[1] ;
      P008X13_A132BarCodReo = new byte[1] ;
      P008X13_A130BarCodPar = new String[] {""} ;
      P008X13_A200BarPieCod = new String[] {""} ;
      P008X13_A27AlbPKilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008X13_A1270AlbPMtrEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008X13_A3117AlbPreAnc = new short[1] ;
      P008X13_n3117AlbPreAnc = new boolean[] {false} ;
      A12166DltKgsPz = DecimalUtil.ZERO ;
      A12167DltMtsPz = DecimalUtil.ZERO ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_int2 = new byte[1] ;
      GXv_char5 = new String[1] ;
      GXv_char6 = new String[1] ;
      GXv_char7 = new String[1] ;
      GXv_char8 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pelipie__default(),
         new Object[] {
             new Object[] {
            P008X2_A396EmprCod, P008X2_A30AlbProCod, P008X2_A129BarCod, P008X2_A132BarCodReo, P008X2_A130BarCodPar, P008X2_A200BarPieCod, P008X2_A1270AlbPMtrEnt, P008X2_A27AlbPKilEnt
            }
            , new Object[] {
            P008X3_A213BarSit
            }
            , new Object[] {
            P008X4_A183BarMetLan, P008X4_A170BarKilLan, P008X4_A201BarPieEst
            }
            , new Object[] {
            P008X5_A396EmprCod
            }
            , new Object[] {
            P008X6_A1261BarAlbKgmE, P008X6_A1263BarAlbMtrE, P008X6_A1265BarAlbPie
            }
            , new Object[] {
            P008X7_A396EmprCod, P008X7_A30AlbProCod, P008X7_A129BarCod, P008X7_A132BarCodReo, P008X7_A130BarCodPar, P008X7_A200BarPieCod, P008X7_A42AlbPTroCod, P008X7_A5303AlbPTroKil, P008X7_A43AlbPTroMet
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P008X13_A396EmprCod, P008X13_A30AlbProCod, P008X13_A129BarCod, P008X13_A132BarCodReo, P008X13_A130BarCodPar, P008X13_A200BarPieCod, P008X13_A27AlbPKilEnt, P008X13_A1270AlbPMtrEnt, P008X13_A3117AlbPreAnc, P008X13_n3117AlbPreAnc
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

   private byte A132BarCodReo ;
   private byte AV15VertexRmto ;
   private byte AV16SiRemito ;
   private byte GXt_int1 ;
   private byte A213BarSit ;
   private byte A201BarPieEst ;
   private byte A12177DltR ;
   private byte GXv_int2[] ;
   private short A42AlbPTroCod ;
   private short A12181DltNTrozo ;
   private short Gx_err ;
   private short A3117AlbPreAnc ;
   private short A12168DltAncPz ;
   private int A129BarCod ;
   private int A1265BarAlbPie ;
   private int GX_INS1691 ;
   private int A12176DltHdr ;
   private int GX_INS1690 ;
   private int GXv_int4[] ;
   private long A30AlbProCod ;
   private long W30AlbProCod ;
   private java.math.BigDecimal A1270AlbPMtrEnt ;
   private java.math.BigDecimal A27AlbPKilEnt ;
   private java.math.BigDecimal A183BarMetLan ;
   private java.math.BigDecimal A170BarKilLan ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A5303AlbPTroKil ;
   private java.math.BigDecimal A43AlbPTroMet ;
   private java.math.BigDecimal A12169DltKgsTrz ;
   private java.math.BigDecimal A12170DltMtsTrz ;
   private java.math.BigDecimal A12166DltKgsPz ;
   private java.math.BigDecimal A12167DltMtsPz ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A200BarPieCod ;
   private String scmdbuf ;
   private String W396EmprCod ;
   private String A12178DltP ;
   private String A12180DltNPieza ;
   private String Gx_emsg ;
   private String GXv_char3[] ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private String GXv_char7[] ;
   private String GXv_char8[] ;
   private boolean n12169DltKgsTrz ;
   private boolean n12170DltMtsTrz ;
   private boolean n3117AlbPreAnc ;
   private boolean n12166DltKgsPz ;
   private boolean n12167DltMtsPz ;
   private boolean n12168DltAncPz ;
   private String[] aP5 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P008X2_A396EmprCod ;
   private long[] P008X2_A30AlbProCod ;
   private int[] P008X2_A129BarCod ;
   private byte[] P008X2_A132BarCodReo ;
   private String[] P008X2_A130BarCodPar ;
   private String[] P008X2_A200BarPieCod ;
   private java.math.BigDecimal[] P008X2_A1270AlbPMtrEnt ;
   private java.math.BigDecimal[] P008X2_A27AlbPKilEnt ;
   private byte[] P008X3_A213BarSit ;
   private java.math.BigDecimal[] P008X4_A183BarMetLan ;
   private java.math.BigDecimal[] P008X4_A170BarKilLan ;
   private byte[] P008X4_A201BarPieEst ;
   private String[] P008X5_A396EmprCod ;
   private java.math.BigDecimal[] P008X6_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P008X6_A1263BarAlbMtrE ;
   private int[] P008X6_A1265BarAlbPie ;
   private String[] P008X7_A396EmprCod ;
   private long[] P008X7_A30AlbProCod ;
   private int[] P008X7_A129BarCod ;
   private byte[] P008X7_A132BarCodReo ;
   private String[] P008X7_A130BarCodPar ;
   private String[] P008X7_A200BarPieCod ;
   private short[] P008X7_A42AlbPTroCod ;
   private java.math.BigDecimal[] P008X7_A5303AlbPTroKil ;
   private java.math.BigDecimal[] P008X7_A43AlbPTroMet ;
   private String[] P008X13_A396EmprCod ;
   private long[] P008X13_A30AlbProCod ;
   private int[] P008X13_A129BarCod ;
   private byte[] P008X13_A132BarCodReo ;
   private String[] P008X13_A130BarCodPar ;
   private String[] P008X13_A200BarPieCod ;
   private java.math.BigDecimal[] P008X13_A27AlbPKilEnt ;
   private java.math.BigDecimal[] P008X13_A1270AlbPMtrEnt ;
   private short[] P008X13_A3117AlbPreAnc ;
   private boolean[] P008X13_n3117AlbPreAnc ;
}

final  class pelipie__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P008X2", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbPMtrEnt, AlbPKilEnt FROM TXPLALPRD WHERE (EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?) AND (EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P008X3", "SELECT BarSit FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P008X4", "SELECT BarMetLan, BarKilLan, BarPieEst FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P008X5", "SELECT EmprCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P008X6", "SELECT BarAlbKgmE, BarAlbMtrE, BarAlbPie FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P008X7", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbPTroCod, AlbPTroKil, AlbPTroMet FROM TXPLALTRZ WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P008X8", "INSERT INTO TXPDLT003(EmprCod, AlbProCod, DltHdr, DltR, DltP, DltNPieza, DltNTrozo, DltKgsTrz, DltMtsTrz, DltAncTrz) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDLT003")
         ,new UpdateCursor("P008X9", "DELETE FROM TXPLALTRZ  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND AlbPTroCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALTRZ")
         ,new UpdateCursor("P008X10", "UPDATE TXPBARCAD SET BarSit=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new UpdateCursor("P008X11", "UPDATE TXPBARPIE SET BarMetLan=?, BarKilLan=?, BarPieEst=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P008X12", "UPDATE TXPALBBAR SET BarAlbKgmE=?, BarAlbMtrE=?, BarAlbPie=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
         ,new ForEachCursor("P008X13", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbPKilEnt, AlbPMtrEnt, AlbPreAnc FROM TXPLALPRD WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P008X14", "INSERT INTO TXPDLT002(EmprCod, AlbProCod, DltHdr, DltR, DltP, DltNPieza, DltKgsPz, DltMtsPz, DltAncPz) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDLT002")
         ,new UpdateCursor("P008X15", "DELETE FROM TXPLALPRD  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALPRD")
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
               stmt.setString(6, (String)parms[5], 9);
               stmt.setString(7, (String)parms[6], 3);
               stmt.setLong(8, ((Number) parms[7]).longValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setString(11, (String)parms[10], 1);
               stmt.setString(12, (String)parms[11], 9);
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
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[10], 2);
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 8 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 9 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 9);
               return;
            case 10 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[11]).shortValue());
               }
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
      }
   }

}

