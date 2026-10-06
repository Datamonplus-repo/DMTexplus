package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class precios_cliente_informe_enviomail extends GXProcedure
{
   public precios_cliente_informe_enviomail( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( precios_cliente_informe_enviomail.class ), "" );
   }

   public precios_cliente_informe_enviomail( int remoteHandle ,
                                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        java.util.Date aP2 ,
                        boolean aP3 ,
                        String aP4 ,
                        String aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             java.util.Date aP2 ,
                             boolean aP3 ,
                             String aP4 ,
                             String aP5 )
   {
      precios_cliente_informe_enviomail.this.AV25EmprCod = aP0;
      precios_cliente_informe_enviomail.this.AV17Clicod = aP1;
      precios_cliente_informe_enviomail.this.AV9AlbProFch = aP2;
      precios_cliente_informe_enviomail.this.AV35MostrarMail = aP3;
      precios_cliente_informe_enviomail.this.AV19CliMailGr = aP4;
      precios_cliente_informe_enviomail.this.AV22CliNom = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV47Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      precios_cliente_informe_enviomail.this.GXt_char1 = GXv_char2[0] ;
      AV47Station = GXt_char1 ;
      GXv_char2[0] = AV25EmprCod ;
      GXv_char3[0] = AV26EmprNom ;
      GXv_char4[0] = AV51UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV47Station, GXv_char2, GXv_char3, GXv_char4) ;
      precios_cliente_informe_enviomail.this.AV25EmprCod = GXv_char2[0] ;
      precios_cliente_informe_enviomail.this.AV26EmprNom = GXv_char3[0] ;
      precios_cliente_informe_enviomail.this.AV51UsurCod = GXv_char4[0] ;
      /* Using cursor P0ANJ2 */
      pr_default.execute(0, new Object[] {AV51UsurCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A850UsurCod = P0ANJ2_A850UsurCod[0] ;
         A10513UsuMail = P0ANJ2_A10513UsuMail[0] ;
         AV50Usumail = GXutil.trim( A10513UsuMail) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      GXt_int5 = (byte)(AV34moda21) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV25EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int6) ;
      precios_cliente_informe_enviomail.this.GXt_int5 = GXv_int6[0] ;
      AV34moda21 = GXt_int5 ;
      GXt_char1 = AV38PATHPDF ;
      GXv_char4[0] = GXt_char1 ;
      new app.pbusemplin(remoteHandle, context).execute( AV25EmprCod, httpContext.getMessage( "WEBPDF", ""), GXv_char4) ;
      precios_cliente_informe_enviomail.this.GXt_char1 = GXv_char4[0] ;
      AV38PATHPDF = GXt_char1 ;
      AV56Identify = GXutil.trim( GXutil.str( AV17Clicod, 6, 0)) + "_" + GXutil.padl( GXutil.trim( GXutil.str( GXutil.year( AV9AlbProFch), 10, 0)), (short)(4), "0") + GXutil.padl( GXutil.trim( GXutil.str( GXutil.month( AV9AlbProFch), 10, 0)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.str( GXutil.day( AV9AlbProFch), 10, 0)), (short)(2), "0") ;
      AV45RutaAdjunto = GXutil.trim( AV38PATHPDF) + AV56Identify ;
      AV45RutaAdjunto = GXutil.trim( AV45RutaAdjunto) + httpContext.getMessage( ".pdf", "") ;
      if ( AV34moda21 == 1 )
      {
         AV36NombresAdjuntos.add(AV45RutaAdjunto, 0);
         /* Execute user subroutine: 'GENERAR DATOS DEL CORREO' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV35MostrarMail )
         {
            /* Window Datatype Object Property */
            AV52window.setUrl( formatLink("app.sendmailattached2", new String[] {GXutil.URLEncode(GXutil.rtrim(AV49TextoSeparador)),GXutil.URLEncode(GXutil.rtrim(AV32ListaCorreosDestino.toJSonString(false))),GXutil.URLEncode(GXutil.rtrim(AV30ListaCorreosCopia.toJSonString(false))),GXutil.URLEncode(GXutil.rtrim(AV31ListaCorreosCopiaOculta.toJSonString(false))),GXutil.URLEncode(GXutil.rtrim(AV14Asunto)),GXutil.URLEncode(GXutil.rtrim(AV48TextoCorreo)),GXutil.URLEncode(GXutil.rtrim(AV36NombresAdjuntos.toJSonString(false))),GXutil.URLEncode(GXutil.booltostr(AV35MostrarMail)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(" "))}, new String[] {"TextoSeparador","parametroCorreosDestinoJson","parametroCorreosCopiaJson","parametroCorreosCopiaOcultaJson","parametroAsunto","parametroTextoCorreo","NombresAdjuntosJson","MostrarMail","Numero_documento","Tipo_documento"})  );
            AV52window.setReturnParms(new Object[] {});
            httpContext.newWindow(AV52window);
         }
         else
         {
            GXt_char1 = AV44Response ;
            GXv_int7[0] = AV59CodigoErrorEnvio ;
            GXv_char4[0] = AV58DescripcionErrorEnvio ;
            new app.asyncattachmentmailservice(remoteHandle, context).execute( AV49TextoSeparador, AV32ListaCorreosDestino.toJSonString(false), AV30ListaCorreosCopia.toJSonString(false), AV31ListaCorreosCopiaOculta.toJSonString(false), AV14Asunto, AV48TextoCorreo, AV36NombresAdjuntos.toJSonString(false), AV35MostrarMail, 0, " ", AV25EmprCod, GXv_int7, GXv_char4) ;
            precios_cliente_informe_enviomail.this.AV59CodigoErrorEnvio = (short)((short)(GXv_int7[0])) ;
            precios_cliente_informe_enviomail.this.AV58DescripcionErrorEnvio = GXv_char4[0] ;
            AV44Response = GXt_char1 ;
            httpContext.GX_msglist.addItem(GXutil.format( "%1-%2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59CodigoErrorEnvio), 4, 0), AV58DescripcionErrorEnvio, "", "", "", "", "", "", ""));
         }
      }
      else
      {
         if ( AV37OpcionSeleccionada == 1 )
         {
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'GENERAR DATOS DEL CORREO' Routine */
      returnInSub = false ;
      AV49TextoSeparador = "|#@|" ;
      AV15CadenaRegistrar = AV19CliMailGr ;
      AV15CadenaRegistrar += AV49TextoSeparador + GXutil.trim( AV22CliNom) ;
      AV32ListaCorreosDestino.clear();
      AV32ListaCorreosDestino.add(AV15CadenaRegistrar, 0);
      AV30ListaCorreosCopia.clear();
      AV15CadenaRegistrar = AV50Usumail ;
      AV15CadenaRegistrar += AV49TextoSeparador + AV26EmprNom ;
      AV30ListaCorreosCopia.add(AV15CadenaRegistrar, 0);
      AV31ListaCorreosCopiaOculta.clear();
      AV31ListaCorreosCopiaOculta.add(AV15CadenaRegistrar, 0);
      AV48TextoCorreo = httpContext.getMessage( "Relatorio sobre os precos por correio", "") + "<br>" ;
      AV14Asunto = httpContext.getMessage( "Envio relatorio sobre os precos", "") ;
      AV61PackFile.close();
      AV48TextoCorreo += httpContext.getMessage( "<p>Arquivos anexados</p>", "") ;
      AV48TextoCorreo += httpContext.getMessage( "<p>#ADJUNTO#</p><br>", "") ;
      AV48TextoCorreo += httpContext.getMessage( "Atenciosamente,", "") + "<br>" ;
      AV48TextoCorreo += AV26EmprNom + "<br>" ;
      AV48TextoCorreo += "<br>" + "<br>" ;
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
      AV47Station = "" ;
      GXv_char2 = new String[1] ;
      AV26EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV51UsurCod = "" ;
      scmdbuf = "" ;
      P0ANJ2_A850UsurCod = new String[] {""} ;
      P0ANJ2_A10513UsuMail = new String[] {""} ;
      A850UsurCod = "" ;
      A10513UsuMail = "" ;
      AV50Usumail = "" ;
      GXv_int6 = new byte[1] ;
      AV38PATHPDF = "" ;
      AV56Identify = "" ;
      AV45RutaAdjunto = "" ;
      AV36NombresAdjuntos = new GXSimpleCollection<String>(String.class, "internal", "");
      AV52window = new com.genexus.webpanels.GXWindow();
      AV49TextoSeparador = "" ;
      AV32ListaCorreosDestino = new GXSimpleCollection<String>(String.class, "internal", "");
      AV30ListaCorreosCopia = new GXSimpleCollection<String>(String.class, "internal", "");
      AV31ListaCorreosCopiaOculta = new GXSimpleCollection<String>(String.class, "internal", "");
      AV14Asunto = "" ;
      AV48TextoCorreo = "" ;
      AV44Response = "" ;
      GXt_char1 = "" ;
      GXv_int7 = new long[1] ;
      AV58DescripcionErrorEnvio = "" ;
      GXv_char4 = new String[1] ;
      AV15CadenaRegistrar = "" ;
      AV61PackFile = new com.genexus.util.GXFile();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.precios_cliente_informe_enviomail__default(),
         new Object[] {
             new Object[] {
            P0ANJ2_A850UsurCod, P0ANJ2_A10513UsuMail
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private short AV34moda21 ;
   private short AV59CodigoErrorEnvio ;
   private short AV37OpcionSeleccionada ;
   private short Gx_err ;
   private int AV17Clicod ;
   private long GXv_int7[] ;
   private String AV25EmprCod ;
   private String AV19CliMailGr ;
   private String AV22CliNom ;
   private String AV47Station ;
   private String GXv_char2[] ;
   private String AV26EmprNom ;
   private String GXv_char3[] ;
   private String AV51UsurCod ;
   private String scmdbuf ;
   private String A850UsurCod ;
   private String A10513UsuMail ;
   private String AV50Usumail ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private java.util.Date AV9AlbProFch ;
   private boolean AV35MostrarMail ;
   private boolean returnInSub ;
   private String AV38PATHPDF ;
   private String AV56Identify ;
   private String AV45RutaAdjunto ;
   private String AV49TextoSeparador ;
   private String AV14Asunto ;
   private String AV48TextoCorreo ;
   private String AV44Response ;
   private String AV58DescripcionErrorEnvio ;
   private String AV15CadenaRegistrar ;
   private com.genexus.webpanels.GXWindow AV52window ;
   private GXSimpleCollection<String> AV32ListaCorreosDestino ;
   private GXSimpleCollection<String> AV30ListaCorreosCopia ;
   private GXSimpleCollection<String> AV31ListaCorreosCopiaOculta ;
   private IDataStoreProvider pr_default ;
   private String[] P0ANJ2_A850UsurCod ;
   private String[] P0ANJ2_A10513UsuMail ;
   private com.genexus.util.GXFile AV61PackFile ;
   private GXSimpleCollection<String> AV36NombresAdjuntos ;
}

final  class precios_cliente_informe_enviomail__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ANJ2", "SELECT UsurCod, UsuMail FROM TXPUSUARI WHERE UsurCod = ? ORDER BY UsurCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
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
               stmt.setString(1, (String)parms[0], 8);
               return;
      }
   }

}

