package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pccins extends GXProcedure
{
   public pccins( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pccins.class ), "" );
   }

   public pccins( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String aP0 ,
                           int aP1 ,
                           String aP2 ,
                           byte aP3 ,
                           String aP4 ,
                           short aP5 ,
                           int aP6 ,
                           int aP7 ,
                           String aP8 )
   {
      pccins.this.aP9 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
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
                        byte[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
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
                             byte[] aP9 )
   {
      pccins.this.A396EmprCod = aP0;
      pccins.this.A129BarCod = aP1;
      pccins.this.A130BarCodPar = aP2;
      pccins.this.A132BarCodReo = aP3;
      pccins.this.A758ProCod = aP4;
      pccins.this.A194BarOrdLin = aP5;
      pccins.this.A4031CCTCod = aP6;
      pccins.this.AV17CCOpeCod = aP7;
      pccins.this.AV16IniFin = aP8;
      pccins.this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV21CCCaderno ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ALLCDE", ""), GXv_int2) ;
      pccins.this.GXt_int1 = GXv_int2[0] ;
      AV21CCCaderno = GXt_int1 ;
      AV15Ok = (byte)(1) ;
      AV31GXLvl4 = (byte)(0) ;
      /* Using cursor P013E2 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         AV31GXLvl4 = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV31GXLvl4 == 0 )
      {
         Gx_msg = httpContext.getMessage( "No existe Empresa.", "") ;
         AV15Ok = (byte)(0) ;
      }
      /* Using cursor P013E3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A4466BarAcaAnh = P013E3_A4466BarAcaAnh[0] ;
         A252CliCod = P013E3_A252CliCod[0] ;
         n252CliCod = P013E3_n252CliCod[0] ;
         AV22Caderno = A4466BarAcaAnh ;
         AV25Clicod = A252CliCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      AV34GXLvl20 = (byte)(0) ;
      /* Using cursor P013E4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         AV34GXLvl20 = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      if ( AV34GXLvl20 == 0 )
      {
         Gx_msg = httpContext.getMessage( "No existe BARFAS.", "") ;
         AV15Ok = (byte)(0) ;
      }
      AV35GXLvl31 = (byte)(0) ;
      /* Using cursor P013E5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         AV35GXLvl31 = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      if ( AV35GXLvl31 == 0 )
      {
         Gx_msg = httpContext.getMessage( "No existe Control de Calidad Tipo.", "") ;
         AV15Ok = (byte)(0) ;
      }
      if ( GXutil.strcmp(AV16IniFin, httpContext.getMessage( "D", "")) != 0 )
      {
         if ( AV15Ok == 1 )
         {
            /* Using cursor P013E6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A4036CCTDsc = P013E6_A4036CCTDsc[0] ;
               Gx_msg = GXutil.trim( GXutil.str( A4031CCTCod, 10, 0)) + "-" + GXutil.trim( A4036CCTDsc) ;
               /*
                  INSERT RECORD ON TABLE TXPCC

               */
               A4033CCFch = GXutil.today( ) ;
               n4033CCFch = false ;
               A4032CCOpeCod = AV17CCOpeCod ;
               n4032CCOpeCod = false ;
               A4405CcDisp = AV16IniFin ;
               n4405CcDisp = false ;
               A7691CCFchUti = GXutil.today( ) ;
               n7691CCFchUti = false ;
               /* Using cursor P013E7 */
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
               /* Using cursor P013E8 */
               pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
               while ( (pr_default.getStatus(6) != 101) )
               {
                  A4034CCTLin = P013E8_A4034CCTLin[0] ;
                  A4048CCTLinTpoI = P013E8_A4048CCTLinTpoI[0] ;
                  A4043CCTLinDsc = P013E8_A4043CCTLinDsc[0] ;
                  A13249CCVNorma = P013E8_A13249CCVNorma[0] ;
                  A13250CCVEspecif = P013E8_A13250CCVEspecif[0] ;
                  A14345CCVEspe2 = P013E8_A14345CCVEspe2[0] ;
                  AV20CCTLinTpoIng = A4048CCTLinTpoI ;
                  Gx_msg = GXutil.trim( GXutil.str( A4031CCTCod, 10, 0)) + "-" + GXutil.trim( GXutil.str( A4034CCTLin, 10, 0)) + "-" + GXutil.trim( A4043CCTLinDsc) + ":" + A4048CCTLinTpoI + GXutil.newLine( ) ;
                  AV18CCVal = "" ;
                  AV23CCMetodo = A13249CCVNorma ;
                  AV24CCEspecif = A13250CCVEspecif ;
                  AV27CCEspecif2 = A14345CCVEspe2 ;
                  AV28CCSCCEsp = " " ;
                  /*
                     INSERT RECORD ON TABLE TXPCC1

                  */
                  A4035CCVal = AV18CCVal ;
                  A13251CCMetodo = AV23CCMetodo ;
                  A13252CCEspecif = AV24CCEspecif ;
                  A14489CCEspecif2 = AV27CCEspecif2 ;
                  Gx_msg += httpContext.getMessage( "Nuevo", "") ;
                  /* Using cursor P013E9 */
                  pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), A4035CCVal, A13251CCMetodo, A13252CCEspecif, A14489CCEspecif2});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCC1");
                  if ( (pr_default.getStatus(7) == 1) )
                  {
                     Gx_err = (short)(1) ;
                     Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                     Gx_msg += httpContext.getMessage( "Duplicado", "") ;
                     AV38GXLvl77 = (byte)(0) ;
                     /* Using cursor P013E10 */
                     pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
                     while ( (pr_default.getStatus(8) != 101) )
                     {
                        A396EmprCod = P013E10_A396EmprCod[0] ;
                        A129BarCod = P013E10_A129BarCod[0] ;
                        A132BarCodReo = P013E10_A132BarCodReo[0] ;
                        A130BarCodPar = P013E10_A130BarCodPar[0] ;
                        A758ProCod = P013E10_A758ProCod[0] ;
                        A194BarOrdLin = P013E10_A194BarOrdLin[0] ;
                        A4031CCTCod = P013E10_A4031CCTCod[0] ;
                        A4034CCTLin = P013E10_A4034CCTLin[0] ;
                        A4035CCVal = P013E10_A4035CCVal[0] ;
                        A13251CCMetodo = P013E10_A13251CCMetodo[0] ;
                        A13252CCEspecif = P013E10_A13252CCEspecif[0] ;
                        A14489CCEspecif2 = P013E10_A14489CCEspecif2[0] ;
                        AV38GXLvl77 = (byte)(1) ;
                        if ( GXutil.strcmp(AV20CCTLinTpoIng, httpContext.getMessage( "A", "")) == 0 )
                        {
                           A4035CCVal = AV18CCVal ;
                           Gx_msg += httpContext.getMessage( " -> encontrado", "") ;
                        }
                        else
                        {
                           Gx_msg += httpContext.getMessage( " -> no aplica", "") ;
                        }
                        A13251CCMetodo = AV23CCMetodo ;
                        A13252CCEspecif = AV24CCEspecif ;
                        A14489CCEspecif2 = AV27CCEspecif2 ;
                        /* Using cursor P013E11 */
                        pr_default.execute(9, new Object[] {A4035CCVal, A13251CCMetodo, A13252CCEspecif, A14489CCEspecif2, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
                        Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCC1");
                        /* Exiting from a For First loop. */
                        if (true) break;
                     }
                     pr_default.close(8);
                     if ( AV38GXLvl77 == 0 )
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
                  Gx_msg += " = " + GXutil.trim( AV18CCVal) ;
                  pr_default.readNext(6);
               }
               pr_default.close(6);
               if ( AV15Ok == 0 )
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
      if ( AV15Ok == 0 )
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.pccins");
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP9[0] = pccins.this.AV26varOk;
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
      P013E2_A396EmprCod = new String[] {""} ;
      Gx_msg = "" ;
      P013E3_A396EmprCod = new String[] {""} ;
      P013E3_A129BarCod = new int[1] ;
      P013E3_A132BarCodReo = new byte[1] ;
      P013E3_A130BarCodPar = new String[] {""} ;
      P013E3_A4466BarAcaAnh = new short[1] ;
      P013E3_A252CliCod = new int[1] ;
      P013E3_n252CliCod = new boolean[] {false} ;
      P013E4_A396EmprCod = new String[] {""} ;
      P013E4_A129BarCod = new int[1] ;
      P013E4_A132BarCodReo = new byte[1] ;
      P013E4_A130BarCodPar = new String[] {""} ;
      P013E4_A758ProCod = new String[] {""} ;
      P013E4_A194BarOrdLin = new short[1] ;
      P013E5_A396EmprCod = new String[] {""} ;
      P013E5_A4031CCTCod = new int[1] ;
      P013E6_A396EmprCod = new String[] {""} ;
      P013E6_A4031CCTCod = new int[1] ;
      P013E6_A4036CCTDsc = new String[] {""} ;
      A4036CCTDsc = "" ;
      A4033CCFch = GXutil.nullDate() ;
      A4405CcDisp = "" ;
      A7691CCFchUti = GXutil.nullDate() ;
      Gx_emsg = "" ;
      P013E8_A396EmprCod = new String[] {""} ;
      P013E8_A4031CCTCod = new int[1] ;
      P013E8_A4034CCTLin = new short[1] ;
      P013E8_A4048CCTLinTpoI = new String[] {""} ;
      P013E8_A4043CCTLinDsc = new String[] {""} ;
      P013E8_A13249CCVNorma = new String[] {""} ;
      P013E8_A13250CCVEspecif = new String[] {""} ;
      P013E8_A14345CCVEspe2 = new String[] {""} ;
      A4048CCTLinTpoI = "" ;
      A4043CCTLinDsc = "" ;
      A13249CCVNorma = "" ;
      A13250CCVEspecif = "" ;
      A14345CCVEspe2 = "" ;
      AV20CCTLinTpoIng = "" ;
      AV18CCVal = "" ;
      AV23CCMetodo = "" ;
      AV24CCEspecif = "" ;
      AV27CCEspecif2 = "" ;
      AV28CCSCCEsp = "" ;
      A4035CCVal = "" ;
      A13251CCMetodo = "" ;
      A13252CCEspecif = "" ;
      A14489CCEspecif2 = "" ;
      P013E10_A396EmprCod = new String[] {""} ;
      P013E10_A129BarCod = new int[1] ;
      P013E10_A132BarCodReo = new byte[1] ;
      P013E10_A130BarCodPar = new String[] {""} ;
      P013E10_A758ProCod = new String[] {""} ;
      P013E10_A194BarOrdLin = new short[1] ;
      P013E10_A4031CCTCod = new int[1] ;
      P013E10_A4034CCTLin = new short[1] ;
      P013E10_A4035CCVal = new String[] {""} ;
      P013E10_A13251CCMetodo = new String[] {""} ;
      P013E10_A13252CCEspecif = new String[] {""} ;
      P013E10_A14489CCEspecif2 = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.pccins__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.pccins__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.pccins__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.pccins__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.pccins__default(),
         new Object[] {
             new Object[] {
            P013E2_A396EmprCod
            }
            , new Object[] {
            P013E3_A396EmprCod, P013E3_A129BarCod, P013E3_A132BarCodReo, P013E3_A130BarCodPar, P013E3_A4466BarAcaAnh, P013E3_A252CliCod, P013E3_n252CliCod
            }
            , new Object[] {
            P013E4_A396EmprCod, P013E4_A129BarCod, P013E4_A132BarCodReo, P013E4_A130BarCodPar, P013E4_A758ProCod, P013E4_A194BarOrdLin
            }
            , new Object[] {
            P013E5_A396EmprCod, P013E5_A4031CCTCod
            }
            , new Object[] {
            P013E6_A396EmprCod, P013E6_A4031CCTCod, P013E6_A4036CCTDsc
            }
            , new Object[] {
            }
            , new Object[] {
            P013E8_A396EmprCod, P013E8_A4031CCTCod, P013E8_A4034CCTLin, P013E8_A4048CCTLinTpoI, P013E8_A4043CCTLinDsc, P013E8_A13249CCVNorma, P013E8_A13250CCVEspecif, P013E8_A14345CCVEspe2
            }
            , new Object[] {
            }
            , new Object[] {
            P013E10_A396EmprCod, P013E10_A129BarCod, P013E10_A132BarCodReo, P013E10_A130BarCodPar, P013E10_A758ProCod, P013E10_A194BarOrdLin, P013E10_A4031CCTCod, P013E10_A4034CCTLin, P013E10_A4035CCVal, P013E10_A13251CCMetodo,
            P013E10_A13252CCEspecif, P013E10_A14489CCEspecif2
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV26varOk ;
   private byte AV21CCCaderno ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV15Ok ;
   private byte AV31GXLvl4 ;
   private byte AV34GXLvl20 ;
   private byte AV35GXLvl31 ;
   private byte AV38GXLvl77 ;
   private short A194BarOrdLin ;
   private short A4466BarAcaAnh ;
   private short AV22Caderno ;
   private short Gx_err ;
   private short A4034CCTLin ;
   private int A129BarCod ;
   private int A4031CCTCod ;
   private int AV17CCOpeCod ;
   private int A252CliCod ;
   private int AV25Clicod ;
   private int GX_INS619 ;
   private int A4032CCOpeCod ;
   private int GX_INS620 ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String AV16IniFin ;
   private String scmdbuf ;
   private String Gx_msg ;
   private String A4036CCTDsc ;
   private String A4405CcDisp ;
   private String Gx_emsg ;
   private String A4048CCTLinTpoI ;
   private String A4043CCTLinDsc ;
   private String A13249CCVNorma ;
   private String A13250CCVEspecif ;
   private String AV20CCTLinTpoIng ;
   private String AV18CCVal ;
   private String AV23CCMetodo ;
   private String AV24CCEspecif ;
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
   private String AV27CCEspecif2 ;
   private String AV28CCSCCEsp ;
   private String A14489CCEspecif2 ;
   private byte[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P013E2_A396EmprCod ;
   private String[] P013E3_A396EmprCod ;
   private int[] P013E3_A129BarCod ;
   private byte[] P013E3_A132BarCodReo ;
   private String[] P013E3_A130BarCodPar ;
   private short[] P013E3_A4466BarAcaAnh ;
   private int[] P013E3_A252CliCod ;
   private boolean[] P013E3_n252CliCod ;
   private String[] P013E4_A396EmprCod ;
   private int[] P013E4_A129BarCod ;
   private byte[] P013E4_A132BarCodReo ;
   private String[] P013E4_A130BarCodPar ;
   private String[] P013E4_A758ProCod ;
   private short[] P013E4_A194BarOrdLin ;
   private String[] P013E5_A396EmprCod ;
   private int[] P013E5_A4031CCTCod ;
   private String[] P013E6_A396EmprCod ;
   private int[] P013E6_A4031CCTCod ;
   private String[] P013E6_A4036CCTDsc ;
   private String[] P013E8_A396EmprCod ;
   private int[] P013E8_A4031CCTCod ;
   private short[] P013E8_A4034CCTLin ;
   private String[] P013E8_A4048CCTLinTpoI ;
   private String[] P013E8_A4043CCTLinDsc ;
   private String[] P013E8_A13249CCVNorma ;
   private String[] P013E8_A13250CCVEspecif ;
   private String[] P013E8_A14345CCVEspe2 ;
   private String[] P013E10_A396EmprCod ;
   private int[] P013E10_A129BarCod ;
   private byte[] P013E10_A132BarCodReo ;
   private String[] P013E10_A130BarCodPar ;
   private String[] P013E10_A758ProCod ;
   private short[] P013E10_A194BarOrdLin ;
   private int[] P013E10_A4031CCTCod ;
   private short[] P013E10_A4034CCTLin ;
   private String[] P013E10_A4035CCVal ;
   private String[] P013E10_A13251CCMetodo ;
   private String[] P013E10_A13252CCEspecif ;
   private String[] P013E10_A14489CCEspecif2 ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pccins__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pccins__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pccins__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pccins__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pccins__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P013E2", "SELECT EmprCod FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P013E3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAcaAnh, CliCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P013E4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P013E5", "SELECT EmprCod, CCTCod FROM TXPCCDef WHERE EmprCod = ? and CCTCod = ? ORDER BY EmprCod, CCTCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P013E6", "SELECT EmprCod, CCTCod, CCTDsc FROM TXPCCDef WHERE EmprCod = ? and CCTCod = ? ORDER BY EmprCod, CCTCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P013E7", "INSERT INTO TXPCC(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CCOpeCod, CCFch, CcDisp, CCFchUti, CcObs, CcUltn, CCOk, CCOkFch, CCOkUsu, CCobs2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCC")
         ,new ForEachCursor("P013E8", "SELECT EmprCod, CCTCod, CCTLin, CCTLinTpoI, CCTLinDsc, CCVNorma, CCVEspecif, CCVEspe2 FROM TXPCCDef1 WHERE EmprCod = ? and CCTCod = ? ORDER BY EmprCod, CCTCod, CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P013E9", "INSERT INTO TXPCC1(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CCTLin, CCVal, CCMetodo, CCEspecif, CCEspecif2, CCOkLin, CCOkDsc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCC1")
         ,new ForEachCursor("P013E10", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CCTLin, CCVal, CCMetodo, CCEspecif, CCEspecif2 FROM TXPCC1 WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and CCTCod = ? and CCTLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CCTLin  FOR UPDATE OF CCVal, CCMetodo, CCEspecif, CCEspecif2 NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P013E11", "UPDATE TXPCC1 SET CCVal=?, CCMetodo=?, CCEspecif=?, CCEspecif2=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? AND CCTLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCC1")
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

