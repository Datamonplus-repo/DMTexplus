package app.albaranes ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class albaran_enviomailalbaranproduccionsdp extends GXProcedure
{
   public albaran_enviomailalbaranproduccionsdp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( albaran_enviomailalbaranproduccionsdp.class ), "" );
   }

   public albaran_enviomailalbaranproduccionsdp( int remoteHandle ,
                                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        long aP1 ,
                        java.util.Date aP2 ,
                        String aP3 ,
                        boolean aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             long aP1 ,
                             java.util.Date aP2 ,
                             String aP3 ,
                             boolean aP4 )
   {
      albaran_enviomailalbaranproduccionsdp.this.AV15EmprCod = aP0;
      albaran_enviomailalbaranproduccionsdp.this.AV39AlbProCod = aP1;
      albaran_enviomailalbaranproduccionsdp.this.AV41AlbProFch = aP2;
      albaran_enviomailalbaranproduccionsdp.this.AV68ReportOutPut = aP3;
      albaran_enviomailalbaranproduccionsdp.this.AV18MostrarMail = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV27Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      albaran_enviomailalbaranproduccionsdp.this.GXt_char1 = GXv_char2[0] ;
      AV27Station = GXt_char1 ;
      GXv_char2[0] = AV15EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV31UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV27Station, GXv_char2, GXv_char3, GXv_char4) ;
      albaran_enviomailalbaranproduccionsdp.this.AV15EmprCod = GXv_char2[0] ;
      albaran_enviomailalbaranproduccionsdp.this.AV16EmprNom = GXv_char3[0] ;
      albaran_enviomailalbaranproduccionsdp.this.AV31UsurCod = GXv_char4[0] ;
      GXt_int5 = (byte)(AV43moda21) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int6) ;
      albaran_enviomailalbaranproduccionsdp.this.GXt_int5 = GXv_int6[0] ;
      AV43moda21 = GXt_int5 ;
      GXt_char1 = AV38PATHPDF ;
      GXv_char4[0] = GXt_char1 ;
      new app.pbusemplin(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "WEBPDF", ""), GXv_char4) ;
      albaran_enviomailalbaranproduccionsdp.this.GXt_char1 = GXv_char4[0] ;
      AV38PATHPDF = GXt_char1 ;
      GXt_int5 = (byte)(AV53marcadeagua) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "AGUA00", ""), GXv_int6) ;
      albaran_enviomailalbaranproduccionsdp.this.GXt_int5 = GXv_int6[0] ;
      AV53marcadeagua = GXt_int5 ;
      /* Using cursor P09P12 */
      pr_default.execute(0, new Object[] {Long.valueOf(AV39AlbProCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1253EmprGuiRem = P09P12_A1253EmprGuiRem[0] ;
         A30AlbProCod = P09P12_A30AlbProCod[0] ;
         A1244GuiRemCln = P09P12_A1244GuiRemCln[0] ;
         A3633CliEmail = P09P12_A3633CliEmail[0] ;
         n3633CliEmail = P09P12_n3633CliEmail[0] ;
         A11620CliMailGr = P09P12_A11620CliMailGr[0] ;
         n11620CliMailGr = P09P12_n11620CliMailGr[0] ;
         A11623CliMailPkE = P09P12_A11623CliMailPkE[0] ;
         n11623CliMailPkE = P09P12_n11623CliMailPkE[0] ;
         A11622CliMailGrE = P09P12_A11622CliMailGrE[0] ;
         n11622CliMailGrE = P09P12_n11622CliMailGrE[0] ;
         A10301Cod_pais = P09P12_A10301Cod_pais[0] ;
         n10301Cod_pais = P09P12_n10301Cod_pais[0] ;
         A34AlbProfch = P09P12_A34AlbProfch[0] ;
         A1243GuiRemCli = P09P12_A1243GuiRemCli[0] ;
         A396EmprCod = P09P12_A396EmprCod[0] ;
         A1244GuiRemCln = P09P12_A1244GuiRemCln[0] ;
         A3633CliEmail = P09P12_A3633CliEmail[0] ;
         n3633CliEmail = P09P12_n3633CliEmail[0] ;
         A11620CliMailGr = P09P12_A11620CliMailGr[0] ;
         n11620CliMailGr = P09P12_n11620CliMailGr[0] ;
         A11623CliMailPkE = P09P12_A11623CliMailPkE[0] ;
         n11623CliMailPkE = P09P12_n11623CliMailPkE[0] ;
         A11622CliMailGrE = P09P12_A11622CliMailGrE[0] ;
         n11622CliMailGrE = P09P12_n11622CliMailGrE[0] ;
         A10301Cod_pais = P09P12_A10301Cod_pais[0] ;
         n10301Cod_pais = P09P12_n10301Cod_pais[0] ;
         AV34CliNom = A1244GuiRemCln ;
         AV35CliEmail = GXutil.trim( A3633CliEmail) ;
         AV44CliMailGr = GXutil.trim( A11620CliMailGr) ;
         AV45CliMailPkE = GXutil.trim( A11623CliMailPkE) ;
         AV46CliMailGrE = GXutil.trim( A11622CliMailGrE) ;
         AV47Cod_pais = A10301Cod_pais ;
         AV41AlbProFch = A34AlbProfch ;
         AV52Clicod = A1243GuiRemCli ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P09P13 */
      pr_default.execute(1, new Object[] {AV31UsurCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A850UsurCod = P09P13_A850UsurCod[0] ;
         A10513UsuMail = P09P13_A10513UsuMail[0] ;
         AV30Usumail = GXutil.trim( A10513UsuMail) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      AV59Identify = GXutil.trim( GXutil.str( AV52Clicod, 6, 0)) + "_" + GXutil.trim( GXutil.str( AV39AlbProCod, 10, 0)) + "_" + GXutil.padl( GXutil.trim( GXutil.str( GXutil.year( AV41AlbProFch), 10, 0)), (short)(4), "0") + GXutil.padl( GXutil.trim( GXutil.str( GXutil.month( AV41AlbProFch), 10, 0)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.str( GXutil.day( AV41AlbProFch), 10, 0)), (short)(2), "0") ;
      AV58IdentifyRutaAdjuntoxls = GXutil.trim( AV38PATHPDF) + AV67Directory + httpContext.getMessage( "\\PackingList_", "") + AV59Identify ;
      AV50RutaAdjuntoxls = GXutil.format( httpContext.getMessage( "%1.xlsx", ""), GXutil.trim( AV58IdentifyRutaAdjuntoxls), "", "", "", "", "", "", "", "") ;
      AV26RutaAdjunto = GXutil.trim( AV68ReportOutPut) ;
      if ( AV43moda21 == 1 )
      {
         AV19NombresAdjuntos.add(AV26RutaAdjunto, 0);
         AV57File.setSource( AV50RutaAdjuntoxls );
         if ( AV57File.exists() )
         {
            AV19NombresAdjuntos.add(AV50RutaAdjuntoxls, 0);
            AV57File.close();
         }
         /* Execute user subroutine: 'GENERAR DATOS DEL CORREO' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV18MostrarMail )
         {
            /* Window Datatype Object Property */
            AV32window.setUrl( formatLink("app.sendmailattached2", new String[] {GXutil.URLEncode(GXutil.rtrim(AV29TextoSeparador)),GXutil.URLEncode(GXutil.rtrim(AV17ListaCorreosDestino.toJSonString(false))),GXutil.URLEncode(GXutil.rtrim(AV11ListaCorreosCopia.toJSonString(false))),GXutil.URLEncode(GXutil.rtrim(AV12ListaCorreosCopiaOculta.toJSonString(false))),GXutil.URLEncode(GXutil.rtrim(AV8Asunto)),GXutil.URLEncode(GXutil.rtrim(AV28TextoCorreo)),GXutil.URLEncode(GXutil.rtrim(AV19NombresAdjuntos.toJSonString(false))),GXutil.URLEncode(GXutil.booltostr(AV18MostrarMail)),GXutil.URLEncode(GXutil.ltrimstr(AV39AlbProCod,10,0)),GXutil.URLEncode(GXutil.rtrim("GUIA"))}, new String[] {"TextoSeparador","parametroCorreosDestinoJson","parametroCorreosCopiaJson","parametroCorreosCopiaOcultaJson","parametroAsunto","parametroTextoCorreo","NombresAdjuntosJson","MostrarMail","Numero_documento","Tipo_documento"})  );
            AV32window.setReturnParms(new Object[] {});
            httpContext.newWindow(AV32window);
         }
         else
         {
            GXt_char1 = AV55Response ;
            GXv_int7[0] = AV64CodigoErrorEnvio ;
            GXv_char4[0] = AV63DescripcionErrorEnvio ;
            new app.asyncattachmentmailservice(remoteHandle, context).execute( AV29TextoSeparador, AV17ListaCorreosDestino.toJSonString(false), AV11ListaCorreosCopia.toJSonString(false), AV12ListaCorreosCopiaOculta.toJSonString(false), AV8Asunto, AV28TextoCorreo, AV19NombresAdjuntos.toJSonString(false), AV18MostrarMail, AV39AlbProCod, "GUIA", AV15EmprCod, GXv_int7, GXv_char4) ;
            albaran_enviomailalbaranproduccionsdp.this.AV64CodigoErrorEnvio = (short)((short)(GXv_int7[0])) ;
            albaran_enviomailalbaranproduccionsdp.this.AV63DescripcionErrorEnvio = GXv_char4[0] ;
            AV55Response = GXt_char1 ;
            httpContext.GX_msglist.addItem(GXutil.format( "%1-%2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64CodigoErrorEnvio), 4, 0), AV63DescripcionErrorEnvio, "", "", "", "", "", "", ""));
         }
      }
      else
      {
         if ( AV20OpcionSeleccionada == 1 )
         {
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'GENERAR DATOS DEL CORREO' Routine */
      returnInSub = false ;
      AV29TextoSeparador = "|#@|" ;
      AV9CadenaRegistrar = AV44CliMailGr ;
      AV9CadenaRegistrar += AV29TextoSeparador + GXutil.trim( AV34CliNom) ;
      AV17ListaCorreosDestino.clear();
      AV17ListaCorreosDestino.add(AV9CadenaRegistrar, 0);
      AV11ListaCorreosCopia.clear();
      AV9CadenaRegistrar = AV30Usumail ;
      AV9CadenaRegistrar += AV29TextoSeparador + AV16EmprNom ;
      AV11ListaCorreosCopia.add(AV9CadenaRegistrar, 0);
      AV12ListaCorreosCopiaOculta.clear();
      AV12ListaCorreosCopiaOculta.add(AV9CadenaRegistrar, 0);
      AV66PackFile.setSource( AV50RutaAdjuntoxls );
      if ( ( GXutil.strcmp(AV45CliMailPkE, httpContext.getMessage( "S", "")) == 0 ) && AV66PackFile.exists() )
      {
         AV28TextoCorreo = httpContext.getMessage( "Envio GUIA e PACKING por e-mail", "") + "<br>" ;
         AV8Asunto = httpContext.getMessage( "Envio de GUIA e PACKING", "") ;
      }
      else
      {
         AV28TextoCorreo = httpContext.getMessage( "Envio GUIA por e-mail", "") + "<br>" ;
         AV8Asunto = httpContext.getMessage( "Envio de GUIA", "") ;
      }
      AV66PackFile.close();
      AV28TextoCorreo += httpContext.getMessage( "<p>Arquivos anexados</p>", "") ;
      AV28TextoCorreo += httpContext.getMessage( "<p>#ADJUNTO#</p><br>", "") ;
      AV28TextoCorreo += httpContext.getMessage( "Atenciosamente,", "") + "<br>" ;
      AV28TextoCorreo += AV16EmprNom + "<br>" ;
      AV28TextoCorreo += "<br>" + "<br>" ;
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV27Station = "" ;
      GXv_char2 = new String[1] ;
      AV16EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV31UsurCod = "" ;
      AV38PATHPDF = "" ;
      GXv_int6 = new byte[1] ;
      scmdbuf = "" ;
      P09P12_A1253EmprGuiRem = new String[] {""} ;
      P09P12_A30AlbProCod = new long[1] ;
      P09P12_A1244GuiRemCln = new String[] {""} ;
      P09P12_A3633CliEmail = new String[] {""} ;
      P09P12_n3633CliEmail = new boolean[] {false} ;
      P09P12_A11620CliMailGr = new String[] {""} ;
      P09P12_n11620CliMailGr = new boolean[] {false} ;
      P09P12_A11623CliMailPkE = new String[] {""} ;
      P09P12_n11623CliMailPkE = new boolean[] {false} ;
      P09P12_A11622CliMailGrE = new String[] {""} ;
      P09P12_n11622CliMailGrE = new boolean[] {false} ;
      P09P12_A10301Cod_pais = new short[1] ;
      P09P12_n10301Cod_pais = new boolean[] {false} ;
      P09P12_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P09P12_A1243GuiRemCli = new int[1] ;
      P09P12_A396EmprCod = new String[] {""} ;
      A1253EmprGuiRem = "" ;
      A1244GuiRemCln = "" ;
      A3633CliEmail = "" ;
      A11620CliMailGr = "" ;
      A11623CliMailPkE = "" ;
      A11622CliMailGrE = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A396EmprCod = "" ;
      AV34CliNom = "" ;
      AV35CliEmail = "" ;
      AV44CliMailGr = "" ;
      AV45CliMailPkE = "" ;
      AV46CliMailGrE = "" ;
      P09P13_A850UsurCod = new String[] {""} ;
      P09P13_A10513UsuMail = new String[] {""} ;
      A850UsurCod = "" ;
      A10513UsuMail = "" ;
      AV30Usumail = "" ;
      AV59Identify = "" ;
      AV58IdentifyRutaAdjuntoxls = "" ;
      AV67Directory = "" ;
      AV50RutaAdjuntoxls = "" ;
      AV26RutaAdjunto = "" ;
      AV19NombresAdjuntos = new GXSimpleCollection<String>(String.class, "internal", "");
      AV57File = new com.genexus.util.GXFile();
      AV32window = new com.genexus.webpanels.GXWindow();
      AV29TextoSeparador = "" ;
      AV17ListaCorreosDestino = new GXSimpleCollection<String>(String.class, "internal", "");
      AV11ListaCorreosCopia = new GXSimpleCollection<String>(String.class, "internal", "");
      AV12ListaCorreosCopiaOculta = new GXSimpleCollection<String>(String.class, "internal", "");
      AV8Asunto = "" ;
      AV28TextoCorreo = "" ;
      AV55Response = "" ;
      GXt_char1 = "" ;
      GXv_int7 = new long[1] ;
      AV63DescripcionErrorEnvio = "" ;
      GXv_char4 = new String[1] ;
      AV9CadenaRegistrar = "" ;
      AV66PackFile = new com.genexus.util.GXFile();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.albaranes.albaran_enviomailalbaranproduccionsdp__default(),
         new Object[] {
             new Object[] {
            P09P12_A1253EmprGuiRem, P09P12_A30AlbProCod, P09P12_A1244GuiRemCln, P09P12_A3633CliEmail, P09P12_n3633CliEmail, P09P12_A11620CliMailGr, P09P12_n11620CliMailGr, P09P12_A11623CliMailPkE, P09P12_n11623CliMailPkE, P09P12_A11622CliMailGrE,
            P09P12_n11622CliMailGrE, P09P12_A10301Cod_pais, P09P12_n10301Cod_pais, P09P12_A34AlbProfch, P09P12_A1243GuiRemCli, P09P12_A396EmprCod
            }
            , new Object[] {
            P09P13_A850UsurCod, P09P13_A10513UsuMail
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private short AV43moda21 ;
   private short AV53marcadeagua ;
   private short A10301Cod_pais ;
   private short AV47Cod_pais ;
   private short AV64CodigoErrorEnvio ;
   private short AV20OpcionSeleccionada ;
   private short Gx_err ;
   private int A1243GuiRemCli ;
   private int AV52Clicod ;
   private long AV39AlbProCod ;
   private long A30AlbProCod ;
   private long GXv_int7[] ;
   private String AV15EmprCod ;
   private String AV27Station ;
   private String GXv_char2[] ;
   private String AV16EmprNom ;
   private String GXv_char3[] ;
   private String AV31UsurCod ;
   private String scmdbuf ;
   private String A1253EmprGuiRem ;
   private String A1244GuiRemCln ;
   private String A3633CliEmail ;
   private String A11620CliMailGr ;
   private String A11623CliMailPkE ;
   private String A11622CliMailGrE ;
   private String A396EmprCod ;
   private String AV34CliNom ;
   private String AV35CliEmail ;
   private String AV44CliMailGr ;
   private String AV45CliMailPkE ;
   private String AV46CliMailGrE ;
   private String A850UsurCod ;
   private String A10513UsuMail ;
   private String AV30Usumail ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private java.util.Date AV41AlbProFch ;
   private java.util.Date A34AlbProfch ;
   private boolean AV18MostrarMail ;
   private boolean n3633CliEmail ;
   private boolean n11620CliMailGr ;
   private boolean n11623CliMailPkE ;
   private boolean n11622CliMailGrE ;
   private boolean n10301Cod_pais ;
   private boolean returnInSub ;
   private String AV68ReportOutPut ;
   private String AV38PATHPDF ;
   private String AV59Identify ;
   private String AV58IdentifyRutaAdjuntoxls ;
   private String AV67Directory ;
   private String AV50RutaAdjuntoxls ;
   private String AV26RutaAdjunto ;
   private String AV29TextoSeparador ;
   private String AV8Asunto ;
   private String AV28TextoCorreo ;
   private String AV55Response ;
   private String AV63DescripcionErrorEnvio ;
   private String AV9CadenaRegistrar ;
   private com.genexus.webpanels.GXWindow AV32window ;
   private com.genexus.util.GXFile AV57File ;
   private com.genexus.util.GXFile AV66PackFile ;
   private GXSimpleCollection<String> AV17ListaCorreosDestino ;
   private GXSimpleCollection<String> AV11ListaCorreosCopia ;
   private GXSimpleCollection<String> AV12ListaCorreosCopiaOculta ;
   private IDataStoreProvider pr_default ;
   private String[] P09P12_A1253EmprGuiRem ;
   private long[] P09P12_A30AlbProCod ;
   private String[] P09P12_A1244GuiRemCln ;
   private String[] P09P12_A3633CliEmail ;
   private boolean[] P09P12_n3633CliEmail ;
   private String[] P09P12_A11620CliMailGr ;
   private boolean[] P09P12_n11620CliMailGr ;
   private String[] P09P12_A11623CliMailPkE ;
   private boolean[] P09P12_n11623CliMailPkE ;
   private String[] P09P12_A11622CliMailGrE ;
   private boolean[] P09P12_n11622CliMailGrE ;
   private short[] P09P12_A10301Cod_pais ;
   private boolean[] P09P12_n10301Cod_pais ;
   private java.util.Date[] P09P12_A34AlbProfch ;
   private int[] P09P12_A1243GuiRemCli ;
   private String[] P09P12_A396EmprCod ;
   private String[] P09P13_A850UsurCod ;
   private String[] P09P13_A10513UsuMail ;
   private GXSimpleCollection<String> AV19NombresAdjuntos ;
}

final  class albaran_enviomailalbaranproduccionsdp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09P12", "SELECT T1.EmprGuiRem AS EmprGuiRem, T1.AlbProCod, T2.CliNom AS GuiRemCln, T2.CliEmail, T2.CliMailGr, T2.CliMailPkE, T2.CliMailGrE, T2.Cod_pais, T1.AlbProfch, T1.GuiRemCli AS GuiRemCli, T1.EmprCod FROM (TXPCALPRD T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli) WHERE T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09P13", "SELECT UsurCod, UsuMail FROM TXPUSUARI WHERE UsurCod = ? ORDER BY UsurCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 100);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(9);
               ((int[]) buf[14])[0] = rslt.getInt(10);
               ((String[]) buf[15])[0] = rslt.getString(11, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 8);
               return;
      }
   }

}

