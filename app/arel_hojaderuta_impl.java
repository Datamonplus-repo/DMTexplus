package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class arel_hojaderuta_impl extends GXWebReport
{
   public arel_hojaderuta_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
      }
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( ! entryPointCalled )
      {
         AV10EmprCod = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV8Barlis = (byte)(GXutil.lval( httpContext.GetPar( "Barlis"))) ;
            AV20Barlisto = (byte)(GXutil.lval( httpContext.GetPar( "Barlisto"))) ;
            AV13BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            AV16BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            AV14BarCodPar = httpContext.GetPar( "BarCodPar") ;
            AV18BarCodto = (int)(GXutil.lval( httpContext.GetPar( "BarCodto"))) ;
            AV17BarCodReoto = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReoto"))) ;
            AV15BarCodParto = httpContext.GetPar( "BarCodParto") ;
            AV21Cli350 = (short)(GXutil.lval( httpContext.GetPar( "Cli350"))) ;
            AV23Copias2 = (short)(GXutil.lval( httpContext.GetPar( "Copias2"))) ;
            AV27No_hdr = httpContext.GetPar( "No_hdr") ;
            AV25imp_bol = httpContext.GetPar( "imp_bol") ;
            AV29No_RegQua = httpContext.GetPar( "No_RegQua") ;
            AV28No_regcarlam = httpContext.GetPar( "No_regcarlam") ;
         }
      }
      if ( toggleJsOutput )
      {
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      M_top = 0 ;
      M_bot = 0 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      add_metrics( ) ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      getPrinter().GxSetDocName("") ;
      try
      {
         Gx_out = "FIL" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 256, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*0)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Integer.valueOf(AV13BarCod) ,
                                              Byte.valueOf(AV16BarCodReo) ,
                                              AV14BarCodPar ,
                                              Integer.valueOf(AV18BarCodto) ,
                                              Byte.valueOf(AV17BarCodReoto) ,
                                              AV15BarCodParto ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              AV10EmprCod ,
                                              Byte.valueOf(AV8Barlis) ,
                                              A396EmprCod ,
                                              Byte.valueOf(A178BarLis) ,
                                              Byte.valueOf(AV20Barlisto) } ,
                                              new int[]{
                                              TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE
                                              }
         });
         /* Using cursor P0ACW2 */
         pr_default.execute(0, new Object[] {AV10EmprCod, Byte.valueOf(AV8Barlis), Byte.valueOf(AV20Barlisto), Integer.valueOf(AV13BarCod), Byte.valueOf(AV16BarCodReo), AV14BarCodPar, Integer.valueOf(AV18BarCodto), Byte.valueOf(AV17BarCodReoto), AV15BarCodParto});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A396EmprCod = P0ACW2_A396EmprCod[0] ;
            A130BarCodPar = P0ACW2_A130BarCodPar[0] ;
            A132BarCodReo = P0ACW2_A132BarCodReo[0] ;
            A129BarCod = P0ACW2_A129BarCod[0] ;
            A178BarLis = P0ACW2_A178BarLis[0] ;
            A120BarAgrEst = P0ACW2_A120BarAgrEst[0] ;
            A252CliCod = P0ACW2_A252CliCod[0] ;
            n252CliCod = P0ACW2_n252CliCod[0] ;
            AV12BarAgrEst = A120BarAgrEst ;
            AV31Ok_f = "N" ;
            /* Using cursor P0ACW3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A457FasCod = P0ACW3_A457FasCod[0] ;
               A7057FasOpeIns = P0ACW3_A7057FasOpeIns[0] ;
               n7057FasOpeIns = P0ACW3_n7057FasOpeIns[0] ;
               A194BarOrdLin = P0ACW3_A194BarOrdLin[0] ;
               A758ProCod = P0ACW3_A758ProCod[0] ;
               A7057FasOpeIns = P0ACW3_A7057FasOpeIns[0] ;
               n7057FasOpeIns = P0ACW3_n7057FasOpeIns[0] ;
               AV31Ok_f = "S" ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            AV30Ok_cl = "N" ;
            /* Using cursor P0ACW4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A457FasCod = P0ACW4_A457FasCod[0] ;
               A13809FasCarda = P0ACW4_A13809FasCarda[0] ;
               A194BarOrdLin = P0ACW4_A194BarOrdLin[0] ;
               A758ProCod = P0ACW4_A758ProCod[0] ;
               A13809FasCarda = P0ACW4_A13809FasCarda[0] ;
               AV30Ok_cl = "S" ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            if ( ( AV21Cli350 == 1 ) && ( AV9ContVal == 1 ) && ( A252CliCod == 350 ) )
            {
            }
            else
            {
               AV22Copias = AV23Copias2 ;
               if ( GXutil.strcmp(AV27No_hdr, "N") == 0 )
               {
                  AV22Copias = AV23Copias2 ;
                  while ( AV22Copias > 0 )
                  {
                     hACW0( false, 0) ;
                     GXv_int1[0] = Gx_line ;
                     new app.rhdrmod_group(remoteHandle, context).execute( AV10EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV26ImpCod, GXv_int1, getPrinter()) ;
                     arel_hojaderuta_impl.this.Gx_line = GXv_int1[0] ;
                     AV22Copias = (short)(AV22Copias-1) ;
                  }
                  GXv_char2[0] = A396EmprCod ;
                  GXv_int1[0] = A129BarCod ;
                  GXv_char3[0] = A130BarCodPar ;
                  GXv_int4[0] = A132BarCodReo ;
                  new app.pbaredi_group(remoteHandle, context).execute( GXv_char2, GXv_int1, GXv_char3, GXv_int4) ;
                  arel_hojaderuta_impl.this.A396EmprCod = GXv_char2[0] ;
                  arel_hojaderuta_impl.this.A129BarCod = GXv_int1[0] ;
                  arel_hojaderuta_impl.this.A130BarCodPar = GXv_char3[0] ;
                  arel_hojaderuta_impl.this.A132BarCodReo = GXv_int4[0] ;
               }
               if ( GXutil.strcmp(AV25imp_bol, "S") == 0 )
               {
                  hACW0( false, 0) ;
                  GXv_int1[0] = Gx_line ;
                  new app.rhdrbnc_group(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV26ImpCod, GXv_int1, getPrinter()) ;
                  arel_hojaderuta_impl.this.Gx_line = GXv_int1[0] ;
               }
               AV34Princp = "S" ;
               if ( GXutil.strcmp(A120BarAgrEst, "S") == 0 )
               {
                  AV13BarCod = A129BarCod ;
                  AV16BarCodReo = A132BarCodReo ;
                  AV14BarCodPar = A130BarCodPar ;
                  new app.pminagr(remoteHandle, context).execute( A396EmprCod, AV13BarCod, AV16BarCodReo, AV14BarCodPar) ;
                  AV34Princp = httpContext.getMessage( "N", "") ;
                  if ( ( A129BarCod == AV13BarCod ) && ( A132BarCodReo == AV16BarCodReo ) && ( GXutil.strcmp(A130BarCodPar, AV14BarCodPar) == 0 ) )
                  {
                     AV34Princp = "S" ;
                  }
               }
               if ( GXutil.strcmp(AV29No_RegQua, "N") == 0 )
               {
                  if ( GXutil.strcmp(AV34Princp, "S") == 0 )
                  {
                     hACW0( false, 0) ;
                     GXv_int1[0] = Gx_line ;
                     new app.rregqua_group(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV26ImpCod, GXv_int1, getPrinter()) ;
                     arel_hojaderuta_impl.this.Gx_line = GXv_int1[0] ;
                     /* Eject command */
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(P_lines+1) ;
                  }
                  else
                  {
                     if ( ( GXutil.strcmp(AV12BarAgrEst, "S") == 0 ) && ( GXutil.strcmp(AV31Ok_f, "S") == 0 ) )
                     {
                        hACW0( false, 0) ;
                        GXv_int1[0] = Gx_line ;
                        new app.rregqua_group(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV26ImpCod, GXv_int1, getPrinter()) ;
                        arel_hojaderuta_impl.this.Gx_line = GXv_int1[0] ;
                        /* Eject command */
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(P_lines+1) ;
                     }
                  }
               }
               if ( GXutil.strcmp(AV28No_regcarlam, httpContext.getMessage( "N", "")) == 0 )
               {
                  if ( GXutil.strcmp(AV30Ok_cl, "S") == 0 )
                  {
                     if ( GXutil.strcmp(AV34Princp, "S") == 0 )
                     {
                        hACW0( false, 0) ;
                        GXv_int1[0] = Gx_line ;
                        new app.prgcarla_group(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV26ImpCod, GXv_int1, getPrinter()) ;
                        arel_hojaderuta_impl.this.Gx_line = GXv_int1[0] ;
                     }
                     else
                     {
                        if ( ( GXutil.strcmp(AV12BarAgrEst, "S") == 0 ) && ( GXutil.strcmp(AV30Ok_cl, "S") == 0 ) )
                        {
                           hACW0( false, 0) ;
                           GXv_int1[0] = Gx_line ;
                           new app.prgcarla_group(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV26ImpCod, GXv_int1, getPrinter()) ;
                           arel_hojaderuta_impl.this.Gx_line = GXv_int1[0] ;
                        }
                     }
                  }
               }
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
         if ( 1 == 2 )
         {
            hACW0( false, 2) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_line), "ZZZZZ9")), 0, Gx_line+0, 39, Gx_line+0, 2, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+2) ;
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         hACW0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      if ( httpContext.willRedirect( ) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void hACW0( boolean bFoot ,
                      int Inc )
   {
      /* Skip the required number of lines */
      while ( ( ToSkip > 0 ) || ( Gx_line + Inc > P_lines ) )
      {
         if ( Gx_line + Inc >= P_lines )
         {
            if ( Gx_page > 0 )
            {
               /* Print footers */
               Gx_line = P_lines ;
               getPrinter().GxEndPage() ;
               if ( bFoot )
               {
                  return  ;
               }
            }
            ToSkip = 0 ;
            Gx_line = 0 ;
            Gx_page = (int)(Gx_page+1) ;
            /* Skip Margin Top Lines */
            Gx_line = (int)(Gx_line+(M_top*lineHeight)) ;
            /* Print headers */
            getPrinter().GxStartPage() ;
            getPrinter().setPage(Gx_page);
            if (true) break;
         }
         else
         {
            PrtOffset = 0 ;
            Gx_line = (int)(Gx_line+1) ;
         }
         ToSkip = (int)(ToSkip-1) ;
      }
      getPrinter().setPage(Gx_page);
   }

   public void add_metrics( )
   {
      add_metrics0( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   protected int getOutputType( )
   {
      return OUTPUT_PDF;
   }

   protected java.io.OutputStream getOutputStream( )
   {
      return httpContext.getOutputStream();
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      super.cleanup();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXKey = "" ;
      gxfirstwebparm = "" ;
      AV10EmprCod = "" ;
      AV14BarCodPar = "" ;
      AV15BarCodParto = "" ;
      AV27No_hdr = "" ;
      AV25imp_bol = "" ;
      AV29No_RegQua = "" ;
      AV28No_regcarlam = "" ;
      scmdbuf = "" ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      P0ACW2_A396EmprCod = new String[] {""} ;
      P0ACW2_A130BarCodPar = new String[] {""} ;
      P0ACW2_A132BarCodReo = new byte[1] ;
      P0ACW2_A129BarCod = new int[1] ;
      P0ACW2_A178BarLis = new byte[1] ;
      P0ACW2_A120BarAgrEst = new String[] {""} ;
      P0ACW2_A252CliCod = new int[1] ;
      P0ACW2_n252CliCod = new boolean[] {false} ;
      A120BarAgrEst = "" ;
      AV12BarAgrEst = "" ;
      AV31Ok_f = "" ;
      P0ACW3_A457FasCod = new String[] {""} ;
      P0ACW3_A396EmprCod = new String[] {""} ;
      P0ACW3_A129BarCod = new int[1] ;
      P0ACW3_A132BarCodReo = new byte[1] ;
      P0ACW3_A130BarCodPar = new String[] {""} ;
      P0ACW3_A7057FasOpeIns = new String[] {""} ;
      P0ACW3_n7057FasOpeIns = new boolean[] {false} ;
      P0ACW3_A194BarOrdLin = new short[1] ;
      P0ACW3_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A7057FasOpeIns = "" ;
      A758ProCod = "" ;
      AV30Ok_cl = "" ;
      P0ACW4_A457FasCod = new String[] {""} ;
      P0ACW4_A396EmprCod = new String[] {""} ;
      P0ACW4_A129BarCod = new int[1] ;
      P0ACW4_A132BarCodReo = new byte[1] ;
      P0ACW4_A130BarCodPar = new String[] {""} ;
      P0ACW4_A13809FasCarda = new String[] {""} ;
      P0ACW4_A194BarOrdLin = new short[1] ;
      P0ACW4_A758ProCod = new String[] {""} ;
      A13809FasCarda = "" ;
      AV26ImpCod = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new byte[1] ;
      AV34Princp = "" ;
      GXv_int1 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.arel_hojaderuta__default(),
         new Object[] {
             new Object[] {
            P0ACW2_A396EmprCod, P0ACW2_A130BarCodPar, P0ACW2_A132BarCodReo, P0ACW2_A129BarCod, P0ACW2_A178BarLis, P0ACW2_A120BarAgrEst, P0ACW2_A252CliCod, P0ACW2_n252CliCod
            }
            , new Object[] {
            P0ACW3_A457FasCod, P0ACW3_A396EmprCod, P0ACW3_A129BarCod, P0ACW3_A132BarCodReo, P0ACW3_A130BarCodPar, P0ACW3_A7057FasOpeIns, P0ACW3_n7057FasOpeIns, P0ACW3_A194BarOrdLin, P0ACW3_A758ProCod
            }
            , new Object[] {
            P0ACW4_A457FasCod, P0ACW4_A396EmprCod, P0ACW4_A129BarCod, P0ACW4_A132BarCodReo, P0ACW4_A130BarCodPar, P0ACW4_A13809FasCarda, P0ACW4_A194BarOrdLin, P0ACW4_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV8Barlis ;
   private byte AV20Barlisto ;
   private byte AV16BarCodReo ;
   private byte AV17BarCodReoto ;
   private byte A132BarCodReo ;
   private byte A178BarLis ;
   private byte GXv_int4[] ;
   private short gxcookieaux ;
   private short AV21Cli350 ;
   private short AV23Copias2 ;
   private short A194BarOrdLin ;
   private short AV22Copias ;
   private short Gx_err ;
   private int AV13BarCod ;
   private int AV18BarCodto ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int AV9ContVal ;
   private int Gx_OldLine ;
   private int GXv_int1[] ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV10EmprCod ;
   private String AV14BarCodPar ;
   private String AV15BarCodParto ;
   private String AV27No_hdr ;
   private String AV25imp_bol ;
   private String AV29No_RegQua ;
   private String AV28No_regcarlam ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A120BarAgrEst ;
   private String AV12BarAgrEst ;
   private String AV31Ok_f ;
   private String A457FasCod ;
   private String A7057FasOpeIns ;
   private String A758ProCod ;
   private String AV30Ok_cl ;
   private String A13809FasCarda ;
   private String AV26ImpCod ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String AV34Princp ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n252CliCod ;
   private boolean n7057FasOpeIns ;
   private IDataStoreProvider pr_default ;
   private String[] P0ACW2_A396EmprCod ;
   private String[] P0ACW2_A130BarCodPar ;
   private byte[] P0ACW2_A132BarCodReo ;
   private int[] P0ACW2_A129BarCod ;
   private byte[] P0ACW2_A178BarLis ;
   private String[] P0ACW2_A120BarAgrEst ;
   private int[] P0ACW2_A252CliCod ;
   private boolean[] P0ACW2_n252CliCod ;
   private String[] P0ACW3_A457FasCod ;
   private String[] P0ACW3_A396EmprCod ;
   private int[] P0ACW3_A129BarCod ;
   private byte[] P0ACW3_A132BarCodReo ;
   private String[] P0ACW3_A130BarCodPar ;
   private String[] P0ACW3_A7057FasOpeIns ;
   private boolean[] P0ACW3_n7057FasOpeIns ;
   private short[] P0ACW3_A194BarOrdLin ;
   private String[] P0ACW3_A758ProCod ;
   private String[] P0ACW4_A457FasCod ;
   private String[] P0ACW4_A396EmprCod ;
   private int[] P0ACW4_A129BarCod ;
   private byte[] P0ACW4_A132BarCodReo ;
   private String[] P0ACW4_A130BarCodPar ;
   private String[] P0ACW4_A13809FasCarda ;
   private short[] P0ACW4_A194BarOrdLin ;
   private String[] P0ACW4_A758ProCod ;
}

final  class arel_hojaderuta__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0ACW2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV13BarCod ,
                                          byte AV16BarCodReo ,
                                          String AV14BarCodPar ,
                                          int AV18BarCodto ,
                                          byte AV17BarCodReoto ,
                                          String AV15BarCodParto ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV10EmprCod ,
                                          byte AV8Barlis ,
                                          String A396EmprCod ,
                                          byte A178BarLis ,
                                          byte AV20Barlisto )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[9];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarLis, BarAgrEst, CliCod FROM TXPBARCAD" ;
      addWhere(sWhereString, "(EmprCod = ? and BarLis >= ?)");
      addWhere(sWhereString, "(BarLis <= ?)");
      if ( ! (0==AV13BarCod) )
      {
         addWhere(sWhereString, "(BarCod >= ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( ! (0==AV16BarCodReo) )
      {
         addWhere(sWhereString, "(BarCodReo >= ?)");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV14BarCodPar)==0) )
      {
         addWhere(sWhereString, "(BarCodPar >= ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( ! (0==AV18BarCodto) )
      {
         addWhere(sWhereString, "(BarCod <= ?)");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! (0==AV17BarCodReoto) )
      {
         addWhere(sWhereString, "(BarCodReo <= ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15BarCodParto)==0) )
      {
         addWhere(sWhereString, "(BarCodPar <= ?)");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, BarLis, BarCod, BarCodReo, BarCodPar" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P0ACW2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ACW2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ACW3", "SELECT * FROM (SELECT T1.FasCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.FasOpeIns, T1.BarOrdLin, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?) AND (T2.FasOpeIns = 'S') ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ACW4", "SELECT * FROM (SELECT T1.FasCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.FasCarda, T1.BarOrdLin, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?) AND (T2.FasCarda = 'S') ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[10]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[11]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[13]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[16]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 1);
               }
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
               return;
      }
   }

}

