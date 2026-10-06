package app.documentotransporteproduccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class impresionguiasdirecto_impl extends GXWebReport
{
   public impresionguiasdirecto_impl( com.genexus.internet.HttpContext context )
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
      gxfirstwebparm = httpContext.GetFirstPar( "emprcod") ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( ! entryPointCalled )
      {
         AV24emprcod = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV10AlbProCodfrom = GXutil.lval( httpContext.GetPar( "AlbProCodfrom")) ;
            AV11AlbProCodto = GXutil.lval( httpContext.GetPar( "AlbProCodto")) ;
            AV13AlbProfchfrom = localUtil.parseDateParm( httpContext.GetPar( "AlbProfchfrom")) ;
            AV14AlbProfchto = localUtil.parseDateParm( httpContext.GetPar( "AlbProfchto")) ;
            AV16Clicodfrom = (int)(GXutil.lval( httpContext.GetPar( "Clicodfrom"))) ;
            AV17Clicodto = (int)(GXutil.lval( httpContext.GetPar( "Clicodto"))) ;
            AV29prio = httpContext.GetPar( "prio") ;
            AV27ManAut = httpContext.GetPar( "ManAut") ;
            AV36VerMail = GXutil.strtobool( httpContext.GetPar( "VerMail")) ;
            AV34Copias2 = (short)(GXutil.lval( httpContext.GetPar( "Copias2"))) ;
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
      M_bot = 6 ;
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
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_char1 = AV28PATHPDF ;
         GXv_char2[0] = GXt_char1 ;
         new app.pbusemplin(remoteHandle, context).execute( AV24emprcod, httpContext.getMessage( "WEBPDF", ""), GXv_char2) ;
         impresionguiasdirecto_impl.this.GXt_char1 = GXv_char2[0] ;
         AV28PATHPDF = GXt_char1 ;
         AV32Copia[1-1] = httpContext.getMessage( "Original", "") ;
         AV32Copia[2-1] = httpContext.getMessage( "Duplicado", "") ;
         AV32Copia[3-1] = httpContext.getMessage( "Triplicado", "") ;
         AV32Copia[4-1] = httpContext.getMessage( "Quadriplicado", "") ;
         if ( GXutil.strcmp(AV27ManAut, "M") == 0 )
         {
            pr_default.dynParam(0, new Object[]{ new Object[]{
                                                 Long.valueOf(AV10AlbProCodfrom) ,
                                                 Long.valueOf(AV11AlbProCodto) ,
                                                 AV13AlbProfchfrom ,
                                                 AV14AlbProfchto ,
                                                 Integer.valueOf(AV16Clicodfrom) ,
                                                 Integer.valueOf(AV17Clicodto) ,
                                                 Long.valueOf(A30AlbProCod) ,
                                                 A34AlbProfch ,
                                                 Integer.valueOf(A1243GuiRemCli) ,
                                                 A39AlbProPri ,
                                                 AV29prio ,
                                                 AV24emprcod ,
                                                 A396EmprCod } ,
                                                 new int[]{
                                                 TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING,
                                                 TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                                 }
            });
            /* Using cursor P0AFA2 */
            pr_default.execute(0, new Object[] {AV24emprcod, AV29prio, Long.valueOf(AV10AlbProCodfrom), Long.valueOf(AV11AlbProCodto), AV13AlbProfchfrom, AV14AlbProfchto, Integer.valueOf(AV16Clicodfrom), Integer.valueOf(AV17Clicodto)});
            while ( (pr_default.getStatus(0) != 101) )
            {
               A129BarCod = P0AFA2_A129BarCod[0] ;
               A132BarCodReo = P0AFA2_A132BarCodReo[0] ;
               A130BarCodPar = P0AFA2_A130BarCodPar[0] ;
               A252CliCod = P0AFA2_A252CliCod[0] ;
               n252CliCod = P0AFA2_n252CliCod[0] ;
               A39AlbProPri = P0AFA2_A39AlbProPri[0] ;
               A1243GuiRemCli = P0AFA2_A1243GuiRemCli[0] ;
               A34AlbProfch = P0AFA2_A34AlbProfch[0] ;
               A30AlbProCod = P0AFA2_A30AlbProCod[0] ;
               A396EmprCod = P0AFA2_A396EmprCod[0] ;
               A1902CliValA = P0AFA2_A1902CliValA[0] ;
               A11620CliMailGr = P0AFA2_A11620CliMailGr[0] ;
               A11621CliMailPk = P0AFA2_A11621CliMailPk[0] ;
               A11622CliMailGrE = P0AFA2_A11622CliMailGrE[0] ;
               A11623CliMailPkE = P0AFA2_A11623CliMailPkE[0] ;
               A5291BarTipCor = P0AFA2_A5291BarTipCor[0] ;
               A10301Cod_pais = P0AFA2_A10301Cod_pais[0] ;
               n10301Cod_pais = P0AFA2_n10301Cod_pais[0] ;
               A252CliCod = P0AFA2_A252CliCod[0] ;
               n252CliCod = P0AFA2_n252CliCod[0] ;
               A5291BarTipCor = P0AFA2_A5291BarTipCor[0] ;
               A39AlbProPri = P0AFA2_A39AlbProPri[0] ;
               A1243GuiRemCli = P0AFA2_A1243GuiRemCli[0] ;
               A34AlbProfch = P0AFA2_A34AlbProfch[0] ;
               A1902CliValA = P0AFA2_A1902CliValA[0] ;
               A11620CliMailGr = P0AFA2_A11620CliMailGr[0] ;
               A11621CliMailPk = P0AFA2_A11621CliMailPk[0] ;
               A11622CliMailGrE = P0AFA2_A11622CliMailGrE[0] ;
               A11623CliMailPkE = P0AFA2_A11623CliMailPkE[0] ;
               A10301Cod_pais = P0AFA2_A10301Cod_pais[0] ;
               n10301Cod_pais = P0AFA2_n10301Cod_pais[0] ;
               AV9albprocod = A30AlbProCod ;
               AV22CliValA = A1902CliValA ;
               AV18CliMailgr = A11620CliMailGr ;
               AV20CliMailpk = A11621CliMailPk ;
               AV8Guiremcli = A1243GuiRemCli ;
               AV19CliMailGrE = A11622CliMailGrE ;
               AV21CliMailPkE = A11623CliMailPkE ;
               AV12albprofch = A34AlbProfch ;
               AV15BarTipCor = A5291BarTipCor ;
               AV23Cod_pais = A10301Cod_pais ;
               /* Execute user subroutine: 'IMPRIMIR' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               pr_default.readNext(0);
            }
            pr_default.close(0);
         }
         else
         {
            /* Using cursor P0AFA3 */
            pr_default.execute(1, new Object[] {AV24emprcod, AV29prio});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A129BarCod = P0AFA3_A129BarCod[0] ;
               A132BarCodReo = P0AFA3_A132BarCodReo[0] ;
               A130BarCodPar = P0AFA3_A130BarCodPar[0] ;
               A252CliCod = P0AFA3_A252CliCod[0] ;
               n252CliCod = P0AFA3_n252CliCod[0] ;
               A39AlbProPri = P0AFA3_A39AlbProPri[0] ;
               A33AlbProEst = P0AFA3_A33AlbProEst[0] ;
               A396EmprCod = P0AFA3_A396EmprCod[0] ;
               A30AlbProCod = P0AFA3_A30AlbProCod[0] ;
               A1902CliValA = P0AFA3_A1902CliValA[0] ;
               A11620CliMailGr = P0AFA3_A11620CliMailGr[0] ;
               A11621CliMailPk = P0AFA3_A11621CliMailPk[0] ;
               A1243GuiRemCli = P0AFA3_A1243GuiRemCli[0] ;
               A11622CliMailGrE = P0AFA3_A11622CliMailGrE[0] ;
               A11623CliMailPkE = P0AFA3_A11623CliMailPkE[0] ;
               A34AlbProfch = P0AFA3_A34AlbProfch[0] ;
               A5291BarTipCor = P0AFA3_A5291BarTipCor[0] ;
               A10301Cod_pais = P0AFA3_A10301Cod_pais[0] ;
               n10301Cod_pais = P0AFA3_n10301Cod_pais[0] ;
               A252CliCod = P0AFA3_A252CliCod[0] ;
               n252CliCod = P0AFA3_n252CliCod[0] ;
               A5291BarTipCor = P0AFA3_A5291BarTipCor[0] ;
               A1902CliValA = P0AFA3_A1902CliValA[0] ;
               A11620CliMailGr = P0AFA3_A11620CliMailGr[0] ;
               A11621CliMailPk = P0AFA3_A11621CliMailPk[0] ;
               A11622CliMailGrE = P0AFA3_A11622CliMailGrE[0] ;
               A11623CliMailPkE = P0AFA3_A11623CliMailPkE[0] ;
               A10301Cod_pais = P0AFA3_A10301Cod_pais[0] ;
               n10301Cod_pais = P0AFA3_n10301Cod_pais[0] ;
               A39AlbProPri = P0AFA3_A39AlbProPri[0] ;
               A33AlbProEst = P0AFA3_A33AlbProEst[0] ;
               A1243GuiRemCli = P0AFA3_A1243GuiRemCli[0] ;
               A34AlbProfch = P0AFA3_A34AlbProfch[0] ;
               AV9albprocod = A30AlbProCod ;
               AV22CliValA = A1902CliValA ;
               AV18CliMailgr = A11620CliMailGr ;
               AV20CliMailpk = A11621CliMailPk ;
               AV8Guiremcli = A1243GuiRemCli ;
               AV19CliMailGrE = A11622CliMailGrE ;
               AV21CliMailPkE = A11623CliMailPkE ;
               AV12albprofch = A34AlbProfch ;
               AV15BarTipCor = A5291BarTipCor ;
               AV23Cod_pais = A10301Cod_pais ;
               /* Execute user subroutine: 'IMPRIMIR' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  pr_default.close(1);
                  pr_default.close(1);
                  pr_default.close(1);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               pr_default.readNext(1);
            }
            pr_default.close(1);
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         hAFA0( true, 0) ;
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

   public void S111( ) throws ProcessInterruptedException
   {
      /* 'IMPRIMIR' Routine */
      returnInSub = false ;
      AV33Copias = AV34Copias2 ;
      AV35i = (short)(1) ;
      while ( AV35i <= AV33Copias )
      {
         AV31TextoCopia = AV32Copia[AV35i-1] ;
         if ( GXutil.strcmp(AV22CliValA, httpContext.getMessage( "S", "")) == 0 )
         {
         }
         else
         {
         }
         AV35i = (short)(AV35i+1) ;
      }
      if ( 1 == 2 )
      {
         hAFA0( false, 4) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+4) ;
      }
   }

   public void hAFA0( boolean bFoot ,
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
      AV24emprcod = "" ;
      AV13AlbProfchfrom = GXutil.nullDate() ;
      AV14AlbProfchto = GXutil.nullDate() ;
      AV29prio = "" ;
      AV27ManAut = "" ;
      AV28PATHPDF = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV32Copia = new String[4] ;
      GX_I = 1 ;
      while ( GX_I <= 4 )
      {
         AV32Copia[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      scmdbuf = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A39AlbProPri = "" ;
      A396EmprCod = "" ;
      P0AFA2_A129BarCod = new int[1] ;
      P0AFA2_A132BarCodReo = new byte[1] ;
      P0AFA2_A130BarCodPar = new String[] {""} ;
      P0AFA2_A252CliCod = new int[1] ;
      P0AFA2_n252CliCod = new boolean[] {false} ;
      P0AFA2_A39AlbProPri = new String[] {""} ;
      P0AFA2_A1243GuiRemCli = new int[1] ;
      P0AFA2_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P0AFA2_A30AlbProCod = new long[1] ;
      P0AFA2_A396EmprCod = new String[] {""} ;
      P0AFA2_A1902CliValA = new String[] {""} ;
      P0AFA2_A11620CliMailGr = new String[] {""} ;
      P0AFA2_A11621CliMailPk = new String[] {""} ;
      P0AFA2_A11622CliMailGrE = new String[] {""} ;
      P0AFA2_A11623CliMailPkE = new String[] {""} ;
      P0AFA2_A5291BarTipCor = new String[] {""} ;
      P0AFA2_A10301Cod_pais = new short[1] ;
      P0AFA2_n10301Cod_pais = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A1902CliValA = "" ;
      A11620CliMailGr = "" ;
      A11621CliMailPk = "" ;
      A11622CliMailGrE = "" ;
      A11623CliMailPkE = "" ;
      A5291BarTipCor = "" ;
      AV22CliValA = "" ;
      AV18CliMailgr = "" ;
      AV20CliMailpk = "" ;
      AV19CliMailGrE = "" ;
      AV21CliMailPkE = "" ;
      AV12albprofch = GXutil.nullDate() ;
      AV15BarTipCor = "" ;
      P0AFA3_A129BarCod = new int[1] ;
      P0AFA3_A132BarCodReo = new byte[1] ;
      P0AFA3_A130BarCodPar = new String[] {""} ;
      P0AFA3_A252CliCod = new int[1] ;
      P0AFA3_n252CliCod = new boolean[] {false} ;
      P0AFA3_A39AlbProPri = new String[] {""} ;
      P0AFA3_A33AlbProEst = new byte[1] ;
      P0AFA3_A396EmprCod = new String[] {""} ;
      P0AFA3_A30AlbProCod = new long[1] ;
      P0AFA3_A1902CliValA = new String[] {""} ;
      P0AFA3_A11620CliMailGr = new String[] {""} ;
      P0AFA3_A11621CliMailPk = new String[] {""} ;
      P0AFA3_A1243GuiRemCli = new int[1] ;
      P0AFA3_A11622CliMailGrE = new String[] {""} ;
      P0AFA3_A11623CliMailPkE = new String[] {""} ;
      P0AFA3_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P0AFA3_A5291BarTipCor = new String[] {""} ;
      P0AFA3_A10301Cod_pais = new short[1] ;
      P0AFA3_n10301Cod_pais = new boolean[] {false} ;
      AV31TextoCopia = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.impresionguiasdirecto__default(),
         new Object[] {
             new Object[] {
            P0AFA2_A129BarCod, P0AFA2_A132BarCodReo, P0AFA2_A130BarCodPar, P0AFA2_A252CliCod, P0AFA2_n252CliCod, P0AFA2_A39AlbProPri, P0AFA2_A1243GuiRemCli, P0AFA2_A34AlbProfch, P0AFA2_A30AlbProCod, P0AFA2_A396EmprCod,
            P0AFA2_A1902CliValA, P0AFA2_A11620CliMailGr, P0AFA2_A11621CliMailPk, P0AFA2_A11622CliMailGrE, P0AFA2_A11623CliMailPkE, P0AFA2_A5291BarTipCor, P0AFA2_A10301Cod_pais, P0AFA2_n10301Cod_pais
            }
            , new Object[] {
            P0AFA3_A129BarCod, P0AFA3_A132BarCodReo, P0AFA3_A130BarCodPar, P0AFA3_A252CliCod, P0AFA3_n252CliCod, P0AFA3_A39AlbProPri, P0AFA3_A33AlbProEst, P0AFA3_A396EmprCod, P0AFA3_A30AlbProCod, P0AFA3_A1902CliValA,
            P0AFA3_A11620CliMailGr, P0AFA3_A11621CliMailPk, P0AFA3_A1243GuiRemCli, P0AFA3_A11622CliMailGrE, P0AFA3_A11623CliMailPkE, P0AFA3_A34AlbProfch, P0AFA3_A5291BarTipCor, P0AFA3_A10301Cod_pais, P0AFA3_n10301Cod_pais
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A33AlbProEst ;
   private short gxcookieaux ;
   private short AV34Copias2 ;
   private short A10301Cod_pais ;
   private short AV23Cod_pais ;
   private short AV33Copias ;
   private short AV35i ;
   private short Gx_err ;
   private int AV16Clicodfrom ;
   private int AV17Clicodto ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A1243GuiRemCli ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int AV8Guiremcli ;
   private int Gx_OldLine ;
   private int GX_I ;
   private long AV10AlbProCodfrom ;
   private long AV11AlbProCodto ;
   private long A30AlbProCod ;
   private long AV9albprocod ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV24emprcod ;
   private String AV29prio ;
   private String AV27ManAut ;
   private String AV28PATHPDF ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV32Copia[] ;
   private String scmdbuf ;
   private String A39AlbProPri ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A1902CliValA ;
   private String A11620CliMailGr ;
   private String A11621CliMailPk ;
   private String A11622CliMailGrE ;
   private String A11623CliMailPkE ;
   private String A5291BarTipCor ;
   private String AV22CliValA ;
   private String AV18CliMailgr ;
   private String AV20CliMailpk ;
   private String AV19CliMailGrE ;
   private String AV21CliMailPkE ;
   private String AV15BarTipCor ;
   private String AV31TextoCopia ;
   private java.util.Date AV13AlbProfchfrom ;
   private java.util.Date AV14AlbProfchto ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date AV12albprofch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV36VerMail ;
   private boolean n252CliCod ;
   private boolean n10301Cod_pais ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private int[] P0AFA2_A129BarCod ;
   private byte[] P0AFA2_A132BarCodReo ;
   private String[] P0AFA2_A130BarCodPar ;
   private int[] P0AFA2_A252CliCod ;
   private boolean[] P0AFA2_n252CliCod ;
   private String[] P0AFA2_A39AlbProPri ;
   private int[] P0AFA2_A1243GuiRemCli ;
   private java.util.Date[] P0AFA2_A34AlbProfch ;
   private long[] P0AFA2_A30AlbProCod ;
   private String[] P0AFA2_A396EmprCod ;
   private String[] P0AFA2_A1902CliValA ;
   private String[] P0AFA2_A11620CliMailGr ;
   private String[] P0AFA2_A11621CliMailPk ;
   private String[] P0AFA2_A11622CliMailGrE ;
   private String[] P0AFA2_A11623CliMailPkE ;
   private String[] P0AFA2_A5291BarTipCor ;
   private short[] P0AFA2_A10301Cod_pais ;
   private boolean[] P0AFA2_n10301Cod_pais ;
   private int[] P0AFA3_A129BarCod ;
   private byte[] P0AFA3_A132BarCodReo ;
   private String[] P0AFA3_A130BarCodPar ;
   private int[] P0AFA3_A252CliCod ;
   private boolean[] P0AFA3_n252CliCod ;
   private String[] P0AFA3_A39AlbProPri ;
   private byte[] P0AFA3_A33AlbProEst ;
   private String[] P0AFA3_A396EmprCod ;
   private long[] P0AFA3_A30AlbProCod ;
   private String[] P0AFA3_A1902CliValA ;
   private String[] P0AFA3_A11620CliMailGr ;
   private String[] P0AFA3_A11621CliMailPk ;
   private int[] P0AFA3_A1243GuiRemCli ;
   private String[] P0AFA3_A11622CliMailGrE ;
   private String[] P0AFA3_A11623CliMailPkE ;
   private java.util.Date[] P0AFA3_A34AlbProfch ;
   private String[] P0AFA3_A5291BarTipCor ;
   private short[] P0AFA3_A10301Cod_pais ;
   private boolean[] P0AFA3_n10301Cod_pais ;
}

final  class impresionguiasdirecto__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AFA2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          long AV10AlbProCodfrom ,
                                          long AV11AlbProCodto ,
                                          java.util.Date AV13AlbProfchfrom ,
                                          java.util.Date AV14AlbProfchto ,
                                          int AV16Clicodfrom ,
                                          int AV17Clicodto ,
                                          long A30AlbProCod ,
                                          java.util.Date A34AlbProfch ,
                                          int A1243GuiRemCli ,
                                          String A39AlbProPri ,
                                          String AV29prio ,
                                          String AV24emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int3 = new byte[8];
      Object[] GXv_Object4 = new Object[2];
      scmdbuf = "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.CliCod, T3.AlbProPri, T3.GuiRemCli, T3.AlbProfch, T1.AlbProCod, T1.EmprCod, T4.CliValA, T4.CliMailGr, T4.CliMailPk," ;
      scmdbuf += " T4.CliMailGrE, T4.CliMailPkE, T2.BarTipCor, T4.Cod_pais FROM (((TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T2.CliCod) INNER JOIN TXPCALPRD T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T3.AlbProPri = ?)");
      if ( ! (0==AV10AlbProCodfrom) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! (0==AV11AlbProCodto) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV13AlbProfchfrom)) )
      {
         addWhere(sWhereString, "(T3.AlbProfch >= ?)");
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV14AlbProfchto)) )
      {
         addWhere(sWhereString, "(T3.AlbProfch <= ?)");
      }
      else
      {
         GXv_int3[5] = (byte)(1) ;
      }
      if ( ! (0==AV16Clicodfrom) )
      {
         addWhere(sWhereString, "(T3.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int3[6] = (byte)(1) ;
      }
      if ( ! (0==AV17Clicodto) )
      {
         addWhere(sWhereString, "(T3.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int3[7] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object4[0] = scmdbuf ;
      GXv_Object4[1] = GXv_int3 ;
      return GXv_Object4 ;
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
                  return conditional_P0AFA2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , ((Number) dynConstraints[1]).longValue() , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).longValue() , (java.util.Date)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AFA2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AFA3", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.CliCod, T4.AlbProPri, T4.AlbProEst, T1.EmprCod, T1.AlbProCod, T3.CliValA, T3.CliMailGr, T3.CliMailPk, T4.GuiRemCli, T3.CliMailGrE, T3.CliMailPkE, T4.AlbProfch, T2.BarTipCor, T3.Cod_pais FROM (((TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) INNER JOIN TXPCALPRD T4 ON T4.EmprCod = T1.EmprCod AND T4.AlbProCod = T1.AlbProCod) WHERE (T1.EmprCod = ?) AND (T4.AlbProEst = 0) AND (T4.AlbProPri = ?) ORDER BY T1.EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((long[]) buf[8])[0] = rslt.getLong(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 3);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((String[]) buf[11])[0] = rslt.getString(11, 100);
               ((String[]) buf[12])[0] = rslt.getString(12, 100);
               ((String[]) buf[13])[0] = rslt.getString(13, 1);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((String[]) buf[15])[0] = rslt.getString(15, 2);
               ((short[]) buf[16])[0] = rslt.getShort(16);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               ((long[]) buf[8])[0] = rslt.getLong(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 100);
               ((String[]) buf[11])[0] = rslt.getString(11, 100);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 1);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 2);
               ((short[]) buf[17])[0] = rslt.getShort(17);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[8], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[10]).longValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[11]).longValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[12]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 1);
               return;
      }
   }

}

