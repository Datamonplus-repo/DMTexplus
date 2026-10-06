package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class facturaenviomail extends GXProcedure
{
   public facturaenviomail( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( facturaenviomail.class ), "" );
   }

   public facturaenviomail( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        java.util.UUID aP1 ,
                        int aP2 ,
                        java.util.Date aP3 ,
                        int aP4 ,
                        String aP5 ,
                        String aP6 ,
                        boolean aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String aP0 ,
                             java.util.UUID aP1 ,
                             int aP2 ,
                             java.util.Date aP3 ,
                             int aP4 ,
                             String aP5 ,
                             String aP6 ,
                             boolean aP7 )
   {
      facturaenviomail.this.AV23EmprCod = aP0;
      facturaenviomail.this.AV64JobId = aP1;
      facturaenviomail.this.AV59Faccod = aP2;
      facturaenviomail.this.AV60Facfch = aP3;
      facturaenviomail.this.AV15Clicod = aP4;
      facturaenviomail.this.AV20CliNom = aP5;
      facturaenviomail.this.AV61Cliemf = aP6;
      facturaenviomail.this.AV33MostrarMail = aP7;
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
      facturaenviomail.this.GXt_char1 = GXv_char2[0] ;
      AV45Station = GXt_char1 ;
      GXv_char2[0] = AV23EmprCod ;
      GXv_char3[0] = AV24EmprNom ;
      GXv_char4[0] = AV49UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV45Station, GXv_char2, GXv_char3, GXv_char4) ;
      facturaenviomail.this.AV23EmprCod = GXv_char2[0] ;
      facturaenviomail.this.AV24EmprNom = GXv_char3[0] ;
      facturaenviomail.this.AV49UsurCod = GXv_char4[0] ;
      GXt_int5 = (byte)(AV32moda21) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV23EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int6) ;
      facturaenviomail.this.GXt_int5 = GXv_int6[0] ;
      AV32moda21 = GXt_int5 ;
      GXt_char1 = AV36PATHPDF ;
      GXv_char4[0] = GXt_char1 ;
      new app.pbusemplin(remoteHandle, context).execute( AV23EmprCod, httpContext.getMessage( "WEBPDF", ""), GXv_char4) ;
      facturaenviomail.this.GXt_char1 = GXv_char4[0] ;
      AV36PATHPDF = GXt_char1 ;
      /* Using cursor P0AOY2 */
      pr_default.execute(0, new Object[] {AV49UsurCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A850UsurCod = P0AOY2_A850UsurCod[0] ;
         A10513UsuMail = P0AOY2_A10513UsuMail[0] ;
         AV48Usumail = GXutil.trim( A10513UsuMail) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P0AOY3 */
      pr_default.execute(1, new Object[] {AV64JobId, Integer.valueOf(AV59Faccod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A14470DocId = P0AOY3_A14470DocId[0] ;
         n14470DocId = P0AOY3_n14470DocId[0] ;
         A14423JobId = P0AOY3_A14423JobId[0] ;
         A14474OutFile = P0AOY3_A14474OutFile[0] ;
         n14474OutFile = P0AOY3_n14474OutFile[0] ;
         A14468ItmId = P0AOY3_A14468ItmId[0] ;
         AV43RutaAdjunto = A14474OutFile ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
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
            AV50window.setUrl( formatLink("app.sendmailattached2", new String[] {GXutil.URLEncode(GXutil.rtrim(AV47TextoSeparador)),GXutil.URLEncode(GXutil.rtrim(AV30ListaCorreosDestino.toJSonString(false))),GXutil.URLEncode(GXutil.rtrim(AV28ListaCorreosCopia.toJSonString(false))),GXutil.URLEncode(GXutil.rtrim(AV29ListaCorreosCopiaOculta.toJSonString(false))),GXutil.URLEncode(GXutil.rtrim(AV12Asunto)),GXutil.URLEncode(GXutil.rtrim(AV46TextoCorreo)),GXutil.URLEncode(GXutil.rtrim(AV34NombresAdjuntos.toJSonString(false))),GXutil.URLEncode(GXutil.booltostr(AV33MostrarMail)),GXutil.URLEncode(GXutil.ltrimstr(AV59Faccod,8,0)),GXutil.URLEncode(GXutil.rtrim("FRA"))}, new String[] {"TextoSeparador","parametroCorreosDestinoJson","parametroCorreosCopiaJson","parametroCorreosCopiaOcultaJson","parametroAsunto","parametroTextoCorreo","NombresAdjuntosJson","MostrarMail","Numero_documento","Tipo_documento"})  );
            AV50window.setReturnParms(new Object[] {});
            httpContext.newWindow(AV50window);
         }
         else
         {
            AV63ret = GXutil.sleep( 3) ;
            GXt_char1 = AV42Response ;
            GXv_int7[0] = AV57CodigoErrorEnvio ;
            GXv_char4[0] = AV56DescripcionErrorEnvio ;
            new app.asyncattachmentmailservice(remoteHandle, context).execute( AV47TextoSeparador, AV30ListaCorreosDestino.toJSonString(false), AV28ListaCorreosCopia.toJSonString(false), AV29ListaCorreosCopiaOculta.toJSonString(false), AV12Asunto, AV46TextoCorreo, AV34NombresAdjuntos.toJSonString(false), AV33MostrarMail, AV59Faccod, "FRA", AV23EmprCod, GXv_int7, GXv_char4) ;
            facturaenviomail.this.AV57CodigoErrorEnvio = (short)((short)(GXv_int7[0])) ;
            facturaenviomail.this.AV56DescripcionErrorEnvio = GXv_char4[0] ;
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
      AV13CadenaRegistrar = GXutil.trim( AV61Cliemf) ;
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
      GXv_int6 = new byte[1] ;
      AV36PATHPDF = "" ;
      scmdbuf = "" ;
      P0AOY2_A850UsurCod = new String[] {""} ;
      P0AOY2_A10513UsuMail = new String[] {""} ;
      A850UsurCod = "" ;
      A10513UsuMail = "" ;
      AV48Usumail = "" ;
      P0AOY3_A14470DocId = new long[1] ;
      P0AOY3_n14470DocId = new boolean[] {false} ;
      P0AOY3_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      P0AOY3_A14474OutFile = new String[] {""} ;
      P0AOY3_n14474OutFile = new boolean[] {false} ;
      P0AOY3_A14468ItmId = new long[1] ;
      A14423JobId = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      A14474OutFile = "" ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.facturaenviomail__default(),
         new Object[] {
             new Object[] {
            P0AOY2_A850UsurCod, P0AOY2_A10513UsuMail
            }
            , new Object[] {
            P0AOY3_A14470DocId, P0AOY3_n14470DocId, P0AOY3_A14423JobId, P0AOY3_A14474OutFile, P0AOY3_n14474OutFile, P0AOY3_A14468ItmId
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private short AV32moda21 ;
   private short AV63ret ;
   private short AV57CodigoErrorEnvio ;
   private short AV35OpcionSeleccionada ;
   private short Gx_err ;
   private int AV59Faccod ;
   private int AV15Clicod ;
   private long A14470DocId ;
   private long A14468ItmId ;
   private long GXv_int7[] ;
   private String AV23EmprCod ;
   private String AV20CliNom ;
   private String AV61Cliemf ;
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
   private java.util.Date AV60Facfch ;
   private boolean AV33MostrarMail ;
   private boolean n14470DocId ;
   private boolean n14474OutFile ;
   private boolean returnInSub ;
   private String AV36PATHPDF ;
   private String A14474OutFile ;
   private String AV43RutaAdjunto ;
   private String AV47TextoSeparador ;
   private String AV12Asunto ;
   private String AV46TextoCorreo ;
   private String AV42Response ;
   private String AV56DescripcionErrorEnvio ;
   private String AV13CadenaRegistrar ;
   private java.util.UUID AV64JobId ;
   private java.util.UUID A14423JobId ;
   private com.genexus.webpanels.GXWindow AV50window ;
   private GXSimpleCollection<String> AV30ListaCorreosDestino ;
   private GXSimpleCollection<String> AV28ListaCorreosCopia ;
   private GXSimpleCollection<String> AV29ListaCorreosCopiaOculta ;
   private IDataStoreProvider pr_default ;
   private String[] P0AOY2_A850UsurCod ;
   private String[] P0AOY2_A10513UsuMail ;
   private long[] P0AOY3_A14470DocId ;
   private boolean[] P0AOY3_n14470DocId ;
   private java.util.UUID[] P0AOY3_A14423JobId ;
   private String[] P0AOY3_A14474OutFile ;
   private boolean[] P0AOY3_n14474OutFile ;
   private long[] P0AOY3_A14468ItmId ;
   private GXSimpleCollection<String> AV34NombresAdjuntos ;
}

final  class facturaenviomail__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AOY2", "SELECT UsurCod, UsuMail FROM TXPUSUARI WHERE UsurCod = ? ORDER BY UsurCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AOY3", "SELECT DocId, JobId, OutFile, ItmId FROM TXPJOBITE WHERE (JobId = ?) AND (DocId = ?) ORDER BY JobId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.UUID[]) buf[2])[0] = rslt.getGUID(2);
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((long[]) buf[5])[0] = rslt.getLong(4);
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
            case 1 :
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

