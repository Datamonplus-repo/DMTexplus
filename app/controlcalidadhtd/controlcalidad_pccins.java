package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controlcalidad_pccins extends GXProcedure
{
   public controlcalidad_pccins( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidad_pccins.class ), "" );
   }

   public controlcalidad_pccins( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             byte aP3 ,
                             String aP4 ,
                             short aP5 ,
                             int aP6 ,
                             int aP7 ,
                             String aP8 ,
                             byte[] aP9 )
   {
      controlcalidad_pccins.this.aP10 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        byte aP3 ,
                        String aP4 ,
                        short aP5 ,
                        int aP6 ,
                        int aP7 ,
                        String aP8 ,
                        byte[] aP9 ,
                        String[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             byte aP3 ,
                             String aP4 ,
                             short aP5 ,
                             int aP6 ,
                             int aP7 ,
                             String aP8 ,
                             byte[] aP9 ,
                             String[] aP10 )
   {
      controlcalidad_pccins.this.A396EmprCod = aP0;
      controlcalidad_pccins.this.A129BarCod = aP1;
      controlcalidad_pccins.this.A130BarCodPar = aP2;
      controlcalidad_pccins.this.A132BarCodReo = aP3;
      controlcalidad_pccins.this.A758ProCod = aP4;
      controlcalidad_pccins.this.A194BarOrdLin = aP5;
      controlcalidad_pccins.this.A4031CCTCod = aP6;
      controlcalidad_pccins.this.AV10CCOpeCod = aP7;
      controlcalidad_pccins.this.AV9IniFin = aP8;
      controlcalidad_pccins.this.aP9 = aP9;
      controlcalidad_pccins.this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV14CCCaderno ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ALLCDE", ""), GXv_int2) ;
      controlcalidad_pccins.this.GXt_int1 = GXv_int2[0] ;
      AV14CCCaderno = GXt_int1 ;
      AV8Ok = (byte)(1) ;
      Gx_msg = "" ;
      AV25GXLvl6 = (byte)(0) ;
      /* Using cursor P0AQ12 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         AV25GXLvl6 = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV25GXLvl6 == 0 )
      {
         Gx_msg = httpContext.getMessage( "No existe Empresa.", "") ;
         AV8Ok = (byte)(0) ;
      }
      System.out.println( httpContext.getMessage( "Empresa.&ok=", "")+GXutil.str( AV8Ok, 1, 0) );
      /* Using cursor P0AQ13 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A4466BarAcaAnh = P0AQ13_A4466BarAcaAnh[0] ;
         A252CliCod = P0AQ13_A252CliCod[0] ;
         n252CliCod = P0AQ13_n252CliCod[0] ;
         AV15Caderno = A4466BarAcaAnh ;
         AV18Clicod = A252CliCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      AV27GXLvl23 = (byte)(0) ;
      /* Using cursor P0AQ14 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         AV27GXLvl23 = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      if ( AV27GXLvl23 == 0 )
      {
         Gx_msg = httpContext.getMessage( "No existe BARFAS.", "") ;
         AV8Ok = (byte)(0) ;
      }
      System.out.println( httpContext.getMessage( "Barfas.&ok=", "")+GXutil.str( AV8Ok, 1, 0) );
      AV28GXLvl35 = (byte)(0) ;
      /* Using cursor P0AQ15 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         AV28GXLvl35 = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      if ( AV28GXLvl35 == 0 )
      {
         Gx_msg = httpContext.getMessage( "No existe Control de Calidad Tipo.", "") ;
         AV8Ok = (byte)(0) ;
      }
      System.out.println( httpContext.getMessage( "Ccdef.&ok=", "")+GXutil.str( AV8Ok, 1, 0) );
      if ( GXutil.strcmp(AV9IniFin, httpContext.getMessage( "D", "")) != 0 )
      {
         if ( AV8Ok == 1 )
         {
            /* Using cursor P0AQ16 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A4036CCTDsc = P0AQ16_A4036CCTDsc[0] ;
               Gx_msg = GXutil.trim( GXutil.str( A4031CCTCod, 10, 0)) + "-" + GXutil.trim( A4036CCTDsc) ;
               /*
                  INSERT RECORD ON TABLE TXPCC

               */
               A4033CCFch = GXutil.today( ) ;
               n4033CCFch = false ;
               A4032CCOpeCod = AV10CCOpeCod ;
               n4032CCOpeCod = false ;
               A4405CcDisp = AV9IniFin ;
               n4405CcDisp = false ;
               A7691CCFchUti = GXutil.today( ) ;
               n7691CCFchUti = false ;
               /* Using cursor P0AQ17 */
               pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Boolean.valueOf(n4032CCOpeCod), Integer.valueOf(A4032CCOpeCod), Boolean.valueOf(n4033CCFch), A4033CCFch, Boolean.valueOf(n4405CcDisp), A4405CcDisp, Boolean.valueOf(n7691CCFchUti), A7691CCFchUti});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCC");
               if ( (pr_default.getStatus(5) == 1) )
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
               /* Using cursor P0AQ18 */
               pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
               while ( (pr_default.getStatus(6) != 101) )
               {
                  A4034CCTLin = P0AQ18_A4034CCTLin[0] ;
                  A4048CCTLinTpoI = P0AQ18_A4048CCTLinTpoI[0] ;
                  A4043CCTLinDsc = P0AQ18_A4043CCTLinDsc[0] ;
                  A13249CCVNorma = P0AQ18_A13249CCVNorma[0] ;
                  A13250CCVEspecif = P0AQ18_A13250CCVEspecif[0] ;
                  A14345CCVEspe2 = P0AQ18_A14345CCVEspe2[0] ;
                  AV13CCTLinTpoIng = A4048CCTLinTpoI ;
                  Gx_msg = GXutil.trim( GXutil.str( A4031CCTCod, 10, 0)) + "-" + GXutil.trim( GXutil.str( A4034CCTLin, 10, 0)) + "-" + GXutil.trim( A4043CCTLinDsc) + ":" + A4048CCTLinTpoI + GXutil.newLine( ) ;
                  AV11CCVal = "" ;
                  AV16CCMetodo = A13249CCVNorma ;
                  AV17CCEspecif = A13250CCVEspecif ;
                  AV20CCEspecif2 = A14345CCVEspe2 ;
                  AV21CCSCCEsp = " " ;
                  /*
                     INSERT RECORD ON TABLE TXPCC1

                  */
                  A4035CCVal = AV11CCVal ;
                  A13251CCMetodo = AV16CCMetodo ;
                  A13252CCEspecif = AV17CCEspecif ;
                  A14489CCEspecif2 = AV20CCEspecif2 ;
                  Gx_msg += httpContext.getMessage( "Nuevo", "") ;
                  /* Using cursor P0AQ19 */
                  pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), A4035CCVal, A13251CCMetodo, A13252CCEspecif, A14489CCEspecif2});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCC1");
                  if ( (pr_default.getStatus(7) == 1) )
                  {
                     Gx_err = (short)(1) ;
                     Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                     Gx_msg += httpContext.getMessage( "Duplicado", "") ;
                     AV31GXLvl82 = (byte)(0) ;
                     /* Using cursor P0AQ110 */
                     pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
                     while ( (pr_default.getStatus(8) != 101) )
                     {
                        A396EmprCod = P0AQ110_A396EmprCod[0] ;
                        A129BarCod = P0AQ110_A129BarCod[0] ;
                        A132BarCodReo = P0AQ110_A132BarCodReo[0] ;
                        A130BarCodPar = P0AQ110_A130BarCodPar[0] ;
                        A758ProCod = P0AQ110_A758ProCod[0] ;
                        A194BarOrdLin = P0AQ110_A194BarOrdLin[0] ;
                        A4031CCTCod = P0AQ110_A4031CCTCod[0] ;
                        A4034CCTLin = P0AQ110_A4034CCTLin[0] ;
                        A4035CCVal = P0AQ110_A4035CCVal[0] ;
                        A13251CCMetodo = P0AQ110_A13251CCMetodo[0] ;
                        A13252CCEspecif = P0AQ110_A13252CCEspecif[0] ;
                        A14489CCEspecif2 = P0AQ110_A14489CCEspecif2[0] ;
                        AV31GXLvl82 = (byte)(1) ;
                        if ( GXutil.strcmp(AV13CCTLinTpoIng, httpContext.getMessage( "A", "")) == 0 )
                        {
                           A4035CCVal = AV11CCVal ;
                           Gx_msg += httpContext.getMessage( " -> encontrado", "") ;
                        }
                        else
                        {
                           Gx_msg += httpContext.getMessage( " -> no aplica", "") ;
                        }
                        A13251CCMetodo = AV16CCMetodo ;
                        A13252CCEspecif = AV17CCEspecif ;
                        A14489CCEspecif2 = AV20CCEspecif2 ;
                        /* Using cursor P0AQ111 */
                        pr_default.execute(9, new Object[] {A4035CCVal, A13251CCMetodo, A13252CCEspecif, A14489CCEspecif2, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
                        Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCC1");
                        /* Exiting from a For First loop. */
                        if (true) break;
                     }
                     pr_default.close(8);
                     if ( AV31GXLvl82 == 0 )
                     {
                        Gx_msg += httpContext.getMessage( " -> no encontrado", "") ;
                     }
                  }
                  else
                  {
                     Gx_err = (short)(0) ;
                     Gx_emsg = "" ;
                  }
                  /* End Insert */
                  Gx_msg += " = " + GXutil.trim( AV11CCVal) ;
                  pr_default.readNext(6);
               }
               pr_default.close(6);
               if ( AV8Ok == 0 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(4);
         }
      }
      System.out.println( httpContext.getMessage( "Fin.&ok=", "")+GXutil.str( AV8Ok, 1, 0)+httpContext.getMessage( "&msg=", "")+Gx_msg );
      if ( AV8Ok == 0 )
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.controlcalidad_pccins");
      }
      else
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.controlcalidad_pccins");
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP9[0] = controlcalidad_pccins.this.AV8Ok;
      this.aP10[0] = controlcalidad_pccins.this.Gx_msg;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gx_msg = "" ;
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P0AQ12_A396EmprCod = new String[] {""} ;
      P0AQ13_A396EmprCod = new String[] {""} ;
      P0AQ13_A129BarCod = new int[1] ;
      P0AQ13_A132BarCodReo = new byte[1] ;
      P0AQ13_A130BarCodPar = new String[] {""} ;
      P0AQ13_A4466BarAcaAnh = new short[1] ;
      P0AQ13_A252CliCod = new int[1] ;
      P0AQ13_n252CliCod = new boolean[] {false} ;
      P0AQ14_A396EmprCod = new String[] {""} ;
      P0AQ14_A129BarCod = new int[1] ;
      P0AQ14_A132BarCodReo = new byte[1] ;
      P0AQ14_A130BarCodPar = new String[] {""} ;
      P0AQ14_A758ProCod = new String[] {""} ;
      P0AQ14_A194BarOrdLin = new short[1] ;
      P0AQ15_A396EmprCod = new String[] {""} ;
      P0AQ15_A4031CCTCod = new int[1] ;
      P0AQ16_A396EmprCod = new String[] {""} ;
      P0AQ16_A4031CCTCod = new int[1] ;
      P0AQ16_A4036CCTDsc = new String[] {""} ;
      A4036CCTDsc = "" ;
      A4033CCFch = GXutil.nullDate() ;
      A4405CcDisp = "" ;
      A7691CCFchUti = GXutil.nullDate() ;
      Gx_emsg = "" ;
      P0AQ18_A396EmprCod = new String[] {""} ;
      P0AQ18_A4031CCTCod = new int[1] ;
      P0AQ18_A4034CCTLin = new short[1] ;
      P0AQ18_A4048CCTLinTpoI = new String[] {""} ;
      P0AQ18_A4043CCTLinDsc = new String[] {""} ;
      P0AQ18_A13249CCVNorma = new String[] {""} ;
      P0AQ18_A13250CCVEspecif = new String[] {""} ;
      P0AQ18_A14345CCVEspe2 = new String[] {""} ;
      A4048CCTLinTpoI = "" ;
      A4043CCTLinDsc = "" ;
      A13249CCVNorma = "" ;
      A13250CCVEspecif = "" ;
      A14345CCVEspe2 = "" ;
      AV13CCTLinTpoIng = "" ;
      AV11CCVal = "" ;
      AV16CCMetodo = "" ;
      AV17CCEspecif = "" ;
      AV20CCEspecif2 = "" ;
      AV21CCSCCEsp = "" ;
      A4035CCVal = "" ;
      A13251CCMetodo = "" ;
      A13252CCEspecif = "" ;
      A14489CCEspecif2 = "" ;
      P0AQ110_A396EmprCod = new String[] {""} ;
      P0AQ110_A129BarCod = new int[1] ;
      P0AQ110_A132BarCodReo = new byte[1] ;
      P0AQ110_A130BarCodPar = new String[] {""} ;
      P0AQ110_A758ProCod = new String[] {""} ;
      P0AQ110_A194BarOrdLin = new short[1] ;
      P0AQ110_A4031CCTCod = new int[1] ;
      P0AQ110_A4034CCTLin = new short[1] ;
      P0AQ110_A4035CCVal = new String[] {""} ;
      P0AQ110_A13251CCMetodo = new String[] {""} ;
      P0AQ110_A13252CCEspecif = new String[] {""} ;
      P0AQ110_A14489CCEspecif2 = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_pccins__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_pccins__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_pccins__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_pccins__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_pccins__default(),
         new Object[] {
             new Object[] {
            P0AQ12_A396EmprCod
            }
            , new Object[] {
            P0AQ13_A396EmprCod, P0AQ13_A129BarCod, P0AQ13_A132BarCodReo, P0AQ13_A130BarCodPar, P0AQ13_A4466BarAcaAnh, P0AQ13_A252CliCod, P0AQ13_n252CliCod
            }
            , new Object[] {
            P0AQ14_A396EmprCod, P0AQ14_A129BarCod, P0AQ14_A132BarCodReo, P0AQ14_A130BarCodPar, P0AQ14_A758ProCod, P0AQ14_A194BarOrdLin
            }
            , new Object[] {
            P0AQ15_A396EmprCod, P0AQ15_A4031CCTCod
            }
            , new Object[] {
            P0AQ16_A396EmprCod, P0AQ16_A4031CCTCod, P0AQ16_A4036CCTDsc
            }
            , new Object[] {
            }
            , new Object[] {
            P0AQ18_A396EmprCod, P0AQ18_A4031CCTCod, P0AQ18_A4034CCTLin, P0AQ18_A4048CCTLinTpoI, P0AQ18_A4043CCTLinDsc, P0AQ18_A13249CCVNorma, P0AQ18_A13250CCVEspecif, P0AQ18_A14345CCVEspe2
            }
            , new Object[] {
            }
            , new Object[] {
            P0AQ110_A396EmprCod, P0AQ110_A129BarCod, P0AQ110_A132BarCodReo, P0AQ110_A130BarCodPar, P0AQ110_A758ProCod, P0AQ110_A194BarOrdLin, P0AQ110_A4031CCTCod, P0AQ110_A4034CCTLin, P0AQ110_A4035CCVal, P0AQ110_A13251CCMetodo,
            P0AQ110_A13252CCEspecif, P0AQ110_A14489CCEspecif2
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV8Ok ;
   private byte AV14CCCaderno ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV25GXLvl6 ;
   private byte AV27GXLvl23 ;
   private byte AV28GXLvl35 ;
   private byte AV31GXLvl82 ;
   private short A194BarOrdLin ;
   private short A4466BarAcaAnh ;
   private short AV15Caderno ;
   private short Gx_err ;
   private short A4034CCTLin ;
   private int A129BarCod ;
   private int A4031CCTCod ;
   private int AV10CCOpeCod ;
   private int A252CliCod ;
   private int AV18Clicod ;
   private int GX_INS619 ;
   private int A4032CCOpeCod ;
   private int GX_INS620 ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String AV9IniFin ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A4036CCTDsc ;
   private String A4405CcDisp ;
   private String Gx_emsg ;
   private String A4048CCTLinTpoI ;
   private String A4043CCTLinDsc ;
   private String A13249CCVNorma ;
   private String A13250CCVEspecif ;
   private String AV13CCTLinTpoIng ;
   private String AV11CCVal ;
   private String AV16CCMetodo ;
   private String AV17CCEspecif ;
   private String A4035CCVal ;
   private String A13251CCMetodo ;
   private String A13252CCEspecif ;
   private java.util.Date A4033CCFch ;
   private java.util.Date A7691CCFchUti ;
   private boolean n252CliCod ;
   private boolean n4033CCFch ;
   private boolean n4032CCOpeCod ;
   private boolean n4405CcDisp ;
   private boolean n7691CCFchUti ;
   private String A14345CCVEspe2 ;
   private String AV20CCEspecif2 ;
   private String AV21CCSCCEsp ;
   private String A14489CCEspecif2 ;
   private String[] aP10 ;
   private byte[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AQ12_A396EmprCod ;
   private String[] P0AQ13_A396EmprCod ;
   private int[] P0AQ13_A129BarCod ;
   private byte[] P0AQ13_A132BarCodReo ;
   private String[] P0AQ13_A130BarCodPar ;
   private short[] P0AQ13_A4466BarAcaAnh ;
   private int[] P0AQ13_A252CliCod ;
   private boolean[] P0AQ13_n252CliCod ;
   private String[] P0AQ14_A396EmprCod ;
   private int[] P0AQ14_A129BarCod ;
   private byte[] P0AQ14_A132BarCodReo ;
   private String[] P0AQ14_A130BarCodPar ;
   private String[] P0AQ14_A758ProCod ;
   private short[] P0AQ14_A194BarOrdLin ;
   private String[] P0AQ15_A396EmprCod ;
   private int[] P0AQ15_A4031CCTCod ;
   private String[] P0AQ16_A396EmprCod ;
   private int[] P0AQ16_A4031CCTCod ;
   private String[] P0AQ16_A4036CCTDsc ;
   private String[] P0AQ18_A396EmprCod ;
   private int[] P0AQ18_A4031CCTCod ;
   private short[] P0AQ18_A4034CCTLin ;
   private String[] P0AQ18_A4048CCTLinTpoI ;
   private String[] P0AQ18_A4043CCTLinDsc ;
   private String[] P0AQ18_A13249CCVNorma ;
   private String[] P0AQ18_A13250CCVEspecif ;
   private String[] P0AQ18_A14345CCVEspe2 ;
   private String[] P0AQ110_A396EmprCod ;
   private int[] P0AQ110_A129BarCod ;
   private byte[] P0AQ110_A132BarCodReo ;
   private String[] P0AQ110_A130BarCodPar ;
   private String[] P0AQ110_A758ProCod ;
   private short[] P0AQ110_A194BarOrdLin ;
   private int[] P0AQ110_A4031CCTCod ;
   private short[] P0AQ110_A4034CCTLin ;
   private String[] P0AQ110_A4035CCVal ;
   private String[] P0AQ110_A13251CCMetodo ;
   private String[] P0AQ110_A13252CCEspecif ;
   private String[] P0AQ110_A14489CCEspecif2 ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class controlcalidad_pccins__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
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
      }
   }

   public String getDataStoreName( )
   {
      return "MODA21";
   }

}

final  class controlcalidad_pccins__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
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
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class controlcalidad_pccins__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
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
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class controlcalidad_pccins__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
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
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class controlcalidad_pccins__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AQ12", "SELECT EmprCod FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AQ13", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAcaAnh, CliCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AQ14", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AQ15", "SELECT EmprCod, CCTCod FROM TXPCCDef WHERE EmprCod = ? and CCTCod = ? ORDER BY EmprCod, CCTCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AQ16", "SELECT EmprCod, CCTCod, CCTDsc FROM TXPCCDef WHERE EmprCod = ? and CCTCod = ? ORDER BY EmprCod, CCTCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0AQ17", "INSERT INTO TXPCC(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CCOpeCod, CCFch, CcDisp, CCFchUti, CcObs, CcUltn, CCOk, CCOkFch, CCOkUsu, CCobs2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCC")
         ,new ForEachCursor("P0AQ18", "SELECT EmprCod, CCTCod, CCTLin, CCTLinTpoI, CCTLinDsc, CCVNorma, CCVEspecif, CCVEspe2 FROM TXPCCDef1 WHERE EmprCod = ? and CCTCod = ? ORDER BY EmprCod, CCTCod, CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0AQ19", "INSERT INTO TXPCC1(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CCTLin, CCVal, CCMetodo, CCEspecif, CCEspecif2, CCOkLin, CCOkDsc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCC1")
         ,new ForEachCursor("P0AQ110", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CCTLin, CCVal, CCMetodo, CCEspecif, CCEspecif2 FROM TXPCC1 WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and CCTCod = ? and CCTLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CCTLin  FOR UPDATE OF CCVal, CCMetodo, CCEspecif, CCEspecif2 NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0AQ111", "UPDATE TXPCC1 SET CCVal=?, CCMetodo=?, CCEspecif=?, CCEspecif2=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? AND CCTLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCC1")
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 40);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((String[]) buf[10])[0] = rslt.getString(11, 30);
               ((String[]) buf[11])[0] = rslt.getVarchar(12);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
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
                  stmt.setString(10, (String)parms[12], 1);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DATE );
               }
               else
               {
                  stmt.setDate(11, (java.util.Date)parms[14]);
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setString(9, (String)parms[8], 40);
               stmt.setString(10, (String)parms[9], 30);
               stmt.setString(11, (String)parms[10], 30);
               stmt.setVarchar(12, (String)parms[11], 300, false);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 30);
               stmt.setString(3, (String)parms[2], 30);
               stmt.setVarchar(4, (String)parms[3], 300, false);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setString(9, (String)parms[8], 8);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               return;
      }
   }

}

