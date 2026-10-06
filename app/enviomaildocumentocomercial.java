package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class enviomaildocumentocomercial extends GXProcedure
{
   public enviomaildocumentocomercial( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( enviomaildocumentocomercial.class ), "" );
   }

   public enviomaildocumentocomercial( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        java.util.Date aP2 ,
                        boolean aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             java.util.Date aP2 ,
                             boolean aP3 )
   {
      enviomaildocumentocomercial.this.A396EmprCod = aP0;
      enviomaildocumentocomercial.this.AV33AlbComCod = aP1;
      enviomaildocumentocomercial.this.AV36AlbComFch = aP2;
      enviomaildocumentocomercial.this.AV18MostrarMail = aP3;
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
      enviomaildocumentocomercial.this.GXt_char1 = GXv_char2[0] ;
      AV27Station = GXt_char1 ;
      GXv_char2[0] = AV15EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV31UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV27Station, GXv_char2, GXv_char3, GXv_char4) ;
      enviomaildocumentocomercial.this.AV15EmprCod = GXv_char2[0] ;
      enviomaildocumentocomercial.this.AV16EmprNom = GXv_char3[0] ;
      enviomaildocumentocomercial.this.AV31UsurCod = GXv_char4[0] ;
      /* Using cursor P090N2 */
      pr_default.execute(0, new Object[] {AV31UsurCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A850UsurCod = P090N2_A850UsurCod[0] ;
         A10513UsuMail = P090N2_A10513UsuMail[0] ;
         AV30Usumail = A10513UsuMail ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      GXt_int5 = (byte)(AV10carvitin) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, "CARVIT", GXv_int6) ;
      enviomaildocumentocomercial.this.GXt_int5 = GXv_int6[0] ;
      AV10carvitin = GXt_int5 ;
      GXt_char1 = AV39PATHPDF ;
      GXv_char4[0] = GXt_char1 ;
      new app.pbusemplin(remoteHandle, context).execute( AV15EmprCod, "WEBPDF", GXv_char4) ;
      enviomaildocumentocomercial.this.GXt_char1 = GXv_char4[0] ;
      AV39PATHPDF = GXt_char1 ;
      AV26RutaAdjunto = GXutil.trim( AV39PATHPDF) + GXutil.trim( GXutil.str( AV33AlbComCod, 8, 0)) + "_" + GXutil.padl( GXutil.trim( GXutil.str( GXutil.year( AV36AlbComFch), 10, 0)), (short)(4), "0") + GXutil.padl( GXutil.trim( GXutil.str( GXutil.month( AV36AlbComFch), 10, 0)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.str( GXutil.day( AV36AlbComFch), 10, 0)), (short)(2), "0") ;
      AV26RutaAdjunto = GXutil.trim( AV26RutaAdjunto) + ".pdf" ;
      if ( AV10carvitin == 1 )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int7[0] = AV33AlbComCod ;
         GXv_char3[0] = AV26RutaAdjunto ;
         new app.ppdftrdocument(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_char3) ;
         enviomaildocumentocomercial.this.A396EmprCod = GXv_char4[0] ;
         enviomaildocumentocomercial.this.AV33AlbComCod = GXv_int7[0] ;
         enviomaildocumentocomercial.this.AV26RutaAdjunto = GXv_char3[0] ;
         AV19NombresAdjuntos.add(AV26RutaAdjunto, 0);
         /* Execute user subroutine: 'GENERAR DATOS DEL CORREO' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Window Datatype Object Property */
         AV32window.setUrl( formatLink("app.enviarcorreoarchivosadjuntos", new String[] {GXutil.URLEncode(GXutil.rtrim(AV29TextoSeparador)),GXutil.URLEncode(GXutil.rtrim(AV17ListaCorreosDestino.toJSonString(false))),GXutil.URLEncode(GXutil.rtrim(AV11ListaCorreosCopia.toJSonString(false))),GXutil.URLEncode(GXutil.rtrim(AV12ListaCorreosCopiaOculta.toJSonString(false))),GXutil.URLEncode(GXutil.rtrim(AV8Asunto)),GXutil.URLEncode(GXutil.rtrim(AV28TextoCorreo)),GXutil.URLEncode(GXutil.rtrim(AV19NombresAdjuntos.toJSonString(false))),GXutil.URLEncode(GXutil.booltostr(AV18MostrarMail))}, new String[] {"TextoSeparador","parametroCorreosDestinoJson","parametroCorreosCopiaJson","parametroCorreosCopiaOcultaJson","parametroAsunto","parametroTextoCorreo","NombresAdjuntosJson","MostrarMail"})  );
         AV32window.setReturnParms(new Object[] {});
         httpContext.newWindow(AV32window);
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
      /* Using cursor P090N3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV33AlbComCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A252CliCod = P090N3_A252CliCod[0] ;
         A14AlbComCod = P090N3_A14AlbComCod[0] ;
         A279CliNom = P090N3_A279CliNom[0] ;
         A3633CliEmail = P090N3_A3633CliEmail[0] ;
         A279CliNom = P090N3_A279CliNom[0] ;
         A3633CliEmail = P090N3_A3633CliEmail[0] ;
         AV34CliNom = A279CliNom ;
         AV35CliEmail = A3633CliEmail ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      AV29TextoSeparador = "|#@|" ;
      AV9CadenaRegistrar = AV35CliEmail ;
      AV9CadenaRegistrar += AV29TextoSeparador + GXutil.trim( AV34CliNom) ;
      AV17ListaCorreosDestino.clear();
      AV17ListaCorreosDestino.add(AV9CadenaRegistrar, 0);
      AV11ListaCorreosCopia.clear();
      AV9CadenaRegistrar = AV30Usumail ;
      AV9CadenaRegistrar += AV29TextoSeparador + AV16EmprNom ;
      AV12ListaCorreosCopiaOculta.clear();
      AV12ListaCorreosCopiaOculta.add(AV9CadenaRegistrar, 0);
      AV8Asunto = httpContext.getMessage( "Guia de Transporte", "") ;
      AV28TextoCorreo = httpContext.getMessage( "Envio Guia de Transporte", "") + "<br>" ;
      AV28TextoCorreo += httpContext.getMessage( "No arquivo em anexo.", "") + "<br>" ;
      AV28TextoCorreo += httpContext.getMessage( "Atenciosamente,", "") + "<br>" ;
      AV28TextoCorreo += GXutil.trim( AV16EmprNom) + "<br>" ;
      AV28TextoCorreo += "<br>" + "<br>" ;
      AV28TextoCorreo += httpContext.getMessage( "PRUEBAS NEOTEX Se Enviaría a: ", "") + GXutil.trim( AV35CliEmail) + "<br>" ;
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
      AV15EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV16EmprNom = "" ;
      AV31UsurCod = "" ;
      scmdbuf = "" ;
      P090N2_A850UsurCod = new String[] {""} ;
      P090N2_A10513UsuMail = new String[] {""} ;
      A850UsurCod = "" ;
      A10513UsuMail = "" ;
      AV30Usumail = "" ;
      GXv_int6 = new byte[1] ;
      AV39PATHPDF = "" ;
      GXt_char1 = "" ;
      AV26RutaAdjunto = "" ;
      GXv_char4 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_char3 = new String[1] ;
      AV19NombresAdjuntos = new GXSimpleCollection<String>(String.class, "internal", "");
      AV32window = new com.genexus.webpanels.GXWindow();
      AV29TextoSeparador = "" ;
      AV17ListaCorreosDestino = new GXSimpleCollection<String>(String.class, "internal", "");
      AV11ListaCorreosCopia = new GXSimpleCollection<String>(String.class, "internal", "");
      AV12ListaCorreosCopiaOculta = new GXSimpleCollection<String>(String.class, "internal", "");
      AV8Asunto = "" ;
      AV28TextoCorreo = "" ;
      P090N3_A252CliCod = new int[1] ;
      P090N3_A396EmprCod = new String[] {""} ;
      P090N3_A14AlbComCod = new int[1] ;
      P090N3_A279CliNom = new String[] {""} ;
      P090N3_A3633CliEmail = new String[] {""} ;
      A279CliNom = "" ;
      A3633CliEmail = "" ;
      AV34CliNom = "" ;
      AV35CliEmail = "" ;
      AV9CadenaRegistrar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.enviomaildocumentocomercial__default(),
         new Object[] {
             new Object[] {
            P090N2_A850UsurCod, P090N2_A10513UsuMail
            }
            , new Object[] {
            P090N3_A252CliCod, P090N3_A396EmprCod, P090N3_A14AlbComCod, P090N3_A279CliNom, P090N3_A3633CliEmail
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private short AV10carvitin ;
   private short AV20OpcionSeleccionada ;
   private short Gx_err ;
   private int AV33AlbComCod ;
   private int GXv_int7[] ;
   private int A252CliCod ;
   private int A14AlbComCod ;
   private String A396EmprCod ;
   private String AV27Station ;
   private String AV15EmprCod ;
   private String GXv_char2[] ;
   private String AV16EmprNom ;
   private String AV31UsurCod ;
   private String scmdbuf ;
   private String A850UsurCod ;
   private String A10513UsuMail ;
   private String AV30Usumail ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String A279CliNom ;
   private String A3633CliEmail ;
   private String AV34CliNom ;
   private String AV35CliEmail ;
   private java.util.Date AV36AlbComFch ;
   private boolean AV18MostrarMail ;
   private boolean returnInSub ;
   private String AV39PATHPDF ;
   private String AV26RutaAdjunto ;
   private String AV29TextoSeparador ;
   private String AV8Asunto ;
   private String AV28TextoCorreo ;
   private String AV9CadenaRegistrar ;
   private com.genexus.webpanels.GXWindow AV32window ;
   private GXSimpleCollection<String> AV17ListaCorreosDestino ;
   private GXSimpleCollection<String> AV11ListaCorreosCopia ;
   private GXSimpleCollection<String> AV12ListaCorreosCopiaOculta ;
   private IDataStoreProvider pr_default ;
   private String[] P090N2_A850UsurCod ;
   private String[] P090N2_A10513UsuMail ;
   private int[] P090N3_A252CliCod ;
   private String[] P090N3_A396EmprCod ;
   private int[] P090N3_A14AlbComCod ;
   private String[] P090N3_A279CliNom ;
   private String[] P090N3_A3633CliEmail ;
   private GXSimpleCollection<String> AV19NombresAdjuntos ;
}

final  class enviomaildocumentocomercial__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P090N2", "SELECT UsurCod, UsuMail FROM TXPUSUARI WHERE UsurCod = ? ORDER BY UsurCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P090N3", "SELECT T1.CliCod, T1.EmprCod, T1.AlbComCod, T2.CliNom, T2.CliEmail FROM (TXPCALCOM T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.AlbComCod = ? ORDER BY T1.EmprCod, T1.AlbComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

