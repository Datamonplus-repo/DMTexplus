package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class factura_enviomailsdp extends GXProcedure
{
   public factura_enviomailsdp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( factura_enviomailsdp.class ), "" );
   }

   public factura_enviomailsdp( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        java.util.Date aP2 ,
                        int aP3 ,
                        String aP4 ,
                        String aP5 ,
                        boolean aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             java.util.Date aP2 ,
                             int aP3 ,
                             String aP4 ,
                             String aP5 ,
                             boolean aP6 )
   {
      factura_enviomailsdp.this.AV23EmprCod = aP0;
      factura_enviomailsdp.this.AV60Faccod = aP1;
      factura_enviomailsdp.this.AV61Facfch = aP2;
      factura_enviomailsdp.this.AV15Clicod = aP3;
      factura_enviomailsdp.this.AV20CliNom = aP4;
      factura_enviomailsdp.this.AV62Cliemf = aP5;
      factura_enviomailsdp.this.AV33MostrarMail = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV45Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      factura_enviomailsdp.this.GXt_char1 = GXv_char2[0] ;
      AV45Station = GXt_char1 ;
      GXv_char2[0] = AV23EmprCod ;
      GXv_char3[0] = AV24EmprNom ;
      GXv_char4[0] = AV49UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV45Station, GXv_char2, GXv_char3, GXv_char4) ;
      factura_enviomailsdp.this.AV23EmprCod = GXv_char2[0] ;
      factura_enviomailsdp.this.AV24EmprNom = GXv_char3[0] ;
      factura_enviomailsdp.this.AV49UsurCod = GXv_char4[0] ;
      /* Using cursor P0AO02 */
      pr_default.execute(0, new Object[] {AV49UsurCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A850UsurCod = P0AO02_A850UsurCod[0] ;
         A10513UsuMail = P0AO02_A10513UsuMail[0] ;
         AV48Usumail = GXutil.trim( A10513UsuMail) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      GXt_int5 = (byte)(AV32moda21) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV23EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int6) ;
      factura_enviomailsdp.this.GXt_int5 = GXv_int6[0] ;
      AV32moda21 = GXt_int5 ;
      GXt_char1 = AV36PATHPDF ;
      GXv_char4[0] = GXt_char1 ;
      new app.pbusemplin(remoteHandle, context).execute( AV23EmprCod, httpContext.getMessage( "WEBPDF", ""), GXv_char4) ;
      factura_enviomailsdp.this.GXt_char1 = GXv_char4[0] ;
      AV36PATHPDF = GXt_char1 ;
      AV54Identify = GXutil.trim( GXutil.str( AV15Clicod, 6, 0)) + "_" + GXutil.trim( GXutil.str( AV60Faccod, 8, 0)) + "_" + GXutil.padl( GXutil.trim( GXutil.str( GXutil.year( AV61Facfch), 10, 0)), (short)(4), "0") + GXutil.padl( GXutil.trim( GXutil.str( GXutil.month( AV61Facfch), 10, 0)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.str( GXutil.day( AV61Facfch), 10, 0)), (short)(2), "0") ;
      AV43RutaAdjunto = GXutil.trim( AV36PATHPDF) + AV54Identify ;
      AV43RutaAdjunto = GXutil.trim( AV43RutaAdjunto) + httpContext.getMessage( ".pdf", "") ;
      if ( AV32moda21 == 1 )
      {
         AV34NombresAdjuntos.add(AV43RutaAdjunto, 0);
         /* Execute user subroutine: 'GENERAR DATOS DEL CORREO' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV33MostrarMail )
         {
            /* Window Datatype Object Property */
            AV50window.setUrl( formatLink("app.sendmailattached2", new String[] {GXutil.URLEncode(GXutil.rtrim(AV47TextoSeparador)),GXutil.URLEncode(GXutil.rtrim(AV30ListaCorreosDestino.toJSonString(false))),GXutil.URLEncode(GXutil.rtrim(AV28ListaCorreosCopia.toJSonString(false))),GXutil.URLEncode(GXutil.rtrim(AV29ListaCorreosCopiaOculta.toJSonString(false))),GXutil.URLEncode(GXutil.rtrim(AV12Asunto)),GXutil.URLEncode(GXutil.rtrim(AV46TextoCorreo)),GXutil.URLEncode(GXutil.rtrim(AV34NombresAdjuntos.toJSonString(false))),GXutil.URLEncode(GXutil.booltostr(AV33MostrarMail)),GXutil.URLEncode(GXutil.ltrimstr(AV60Faccod,8,0)),GXutil.URLEncode(GXutil.rtrim("FRA"))}, new String[] {"TextoSeparador","parametroCorreosDestinoJson","parametroCorreosCopiaJson","parametroCorreosCopiaOcultaJson","parametroAsunto","parametroTextoCorreo","NombresAdjuntosJson","MostrarMail","Numero_documento","Tipo_documento"})  );
            AV50window.setReturnParms(new Object[] {});
            httpContext.newWindow(AV50window);
         }
         else
         {
            AV64ret = GXutil.sleep( 3) ;
            GXt_char1 = AV42Response ;
            GXv_int7[0] = AV57CodigoErrorEnvio ;
            GXv_char4[0] = AV56DescripcionErrorEnvio ;
            new app.asyncattachmentmailservice(remoteHandle, context).execute( AV47TextoSeparador, AV30ListaCorreosDestino.toJSonString(false), AV28ListaCorreosCopia.toJSonString(false), AV29ListaCorreosCopiaOculta.toJSonString(false), AV12Asunto, AV46TextoCorreo, AV34NombresAdjuntos.toJSonString(false), AV33MostrarMail, AV60Faccod, "FRA", AV23EmprCod, GXv_int7, GXv_char4) ;
            factura_enviomailsdp.this.AV57CodigoErrorEnvio = (short)((short)(GXv_int7[0])) ;
            factura_enviomailsdp.this.AV56DescripcionErrorEnvio = GXv_char4[0] ;
            AV42Response = GXt_char1 ;
            httpContext.GX_msglist.addItem(GXutil.format( "%1-%2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57CodigoErrorEnvio), 4, 0), AV56DescripcionErrorEnvio, "", "", "", "", "", "", ""));
         }
      }
      else
      {
         if ( AV35OpcionSeleccionada == 1 )
         {
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'GENERAR DATOS DEL CORREO' Routine */
      returnInSub = false ;
      AV47TextoSeparador = "|#@|" ;
      AV13CadenaRegistrar = GXutil.trim( AV62Cliemf) ;
      AV13CadenaRegistrar += AV47TextoSeparador + GXutil.trim( AV20CliNom) ;
      AV30ListaCorreosDestino.clear();
      AV30ListaCorreosDestino.add(AV13CadenaRegistrar, 0);
      AV28ListaCorreosCopia.clear();
      AV13CadenaRegistrar = GXutil.trim( AV48Usumail) ;
      AV13CadenaRegistrar += AV47TextoSeparador + AV24EmprNom ;
      AV28ListaCorreosCopia.add(AV13CadenaRegistrar, 0);
      AV29ListaCorreosCopiaOculta.clear();
      AV29ListaCorreosCopiaOculta.add(AV13CadenaRegistrar, 0);
      AV46TextoCorreo = httpContext.getMessage( "Envio FATURA por e-mail", "") + "<br>" ;
      AV12Asunto = httpContext.getMessage( "Envio de FATURA", "") ;
      AV46TextoCorreo += httpContext.getMessage( "<p>Arquivos anexados</p>", "") ;
      AV46TextoCorreo += httpContext.getMessage( "<p>#ADJUNTO#</p><br>", "") ;
      AV46TextoCorreo += httpContext.getMessage( "Atenciosamente,", "") + "<br>" ;
      AV46TextoCorreo += AV24EmprNom + "<br>" ;
      AV46TextoCorreo += "<br>" + "<br>" ;
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
      AV45Station = "" ;
      GXv_char2 = new String[1] ;
      AV24EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV49UsurCod = "" ;
      scmdbuf = "" ;
      P0AO02_A850UsurCod = new String[] {""} ;
      P0AO02_A10513UsuMail = new String[] {""} ;
      A850UsurCod = "" ;
      A10513UsuMail = "" ;
      AV48Usumail = "" ;
      GXv_int6 = new byte[1] ;
      AV36PATHPDF = "" ;
      AV54Identify = "" ;
      AV43RutaAdjunto = "" ;
      AV34NombresAdjuntos = new GXSimpleCollection<String>(String.class, "internal", "");
      AV50window = new com.genexus.webpanels.GXWindow();
      AV47TextoSeparador = "" ;
      AV30ListaCorreosDestino = new GXSimpleCollection<String>(String.class, "internal", "");
      AV28ListaCorreosCopia = new GXSimpleCollection<String>(String.class, "internal", "");
      AV29ListaCorreosCopiaOculta = new GXSimpleCollection<String>(String.class, "internal", "");
      AV12Asunto = "" ;
      AV46TextoCorreo = "" ;
      AV42Response = "" ;
      GXt_char1 = "" ;
      GXv_int7 = new long[1] ;
      AV56DescripcionErrorEnvio = "" ;
      GXv_char4 = new String[1] ;
      AV13CadenaRegistrar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.factura_enviomailsdp__default(),
         new Object[] {
             new Object[] {
            P0AO02_A850UsurCod, P0AO02_A10513UsuMail
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private short AV32moda21 ;
   private short AV64ret ;
   private short AV57CodigoErrorEnvio ;
   private short AV35OpcionSeleccionada ;
   private short Gx_err ;
   private int AV60Faccod ;
   private int AV15Clicod ;
   private long GXv_int7[] ;
   private String AV23EmprCod ;
   private String AV20CliNom ;
   private String AV62Cliemf ;
   private String AV45Station ;
   private String GXv_char2[] ;
   private String AV24EmprNom ;
   private String GXv_char3[] ;
   private String AV49UsurCod ;
   private String scmdbuf ;
   private String A850UsurCod ;
   private String A10513UsuMail ;
   private String AV48Usumail ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private java.util.Date AV61Facfch ;
   private boolean AV33MostrarMail ;
   private boolean returnInSub ;
   private String AV36PATHPDF ;
   private String AV54Identify ;
   private String AV43RutaAdjunto ;
   private String AV47TextoSeparador ;
   private String AV12Asunto ;
   private String AV46TextoCorreo ;
   private String AV42Response ;
   private String AV56DescripcionErrorEnvio ;
   private String AV13CadenaRegistrar ;
   private com.genexus.webpanels.GXWindow AV50window ;
   private GXSimpleCollection<String> AV30ListaCorreosDestino ;
   private GXSimpleCollection<String> AV28ListaCorreosCopia ;
   private GXSimpleCollection<String> AV29ListaCorreosCopiaOculta ;
   private IDataStoreProvider pr_default ;
   private String[] P0AO02_A850UsurCod ;
   private String[] P0AO02_A10513UsuMail ;
   private GXSimpleCollection<String> AV34NombresAdjuntos ;
}

final  class factura_enviomailsdp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AO02", "SELECT UsurCod, UsuMail FROM TXPUSUARI WHERE UsurCod = ? ORDER BY UsurCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

