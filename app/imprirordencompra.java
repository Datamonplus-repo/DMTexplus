package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class imprirordencompra extends GXProcedure
{
   public imprirordencompra( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( imprirordencompra.class ), "" );
   }

   public imprirordencompra( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        short aP3 ,
                        boolean aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             int[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             short aP3 ,
                             boolean aP4 )
   {
      imprirordencompra.this.A396EmprCod = aP0;
      imprirordencompra.this.AV8Pedcod = aP1[0];
      this.aP1 = aP1;
      imprirordencompra.this.AV10PedTot = aP2[0];
      this.aP2 = aP2;
      imprirordencompra.this.AV27OpcionSeleccionada = aP3;
      imprirordencompra.this.AV25MostrarMail = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV32Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      imprirordencompra.this.GXt_char1 = GXv_char2[0] ;
      AV32Station = GXt_char1 ;
      GXv_char2[0] = AV22EmprCod ;
      GXv_char3[0] = AV23EmprNom ;
      GXv_char4[0] = AV36UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV32Station, GXv_char2, GXv_char3, GXv_char4) ;
      imprirordencompra.this.AV22EmprCod = GXv_char2[0] ;
      imprirordencompra.this.AV23EmprNom = GXv_char3[0] ;
      imprirordencompra.this.AV36UsurCod = GXv_char4[0] ;
      /* Using cursor P08OS2 */
      pr_default.execute(0, new Object[] {AV36UsurCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A850UsurCod = P08OS2_A850UsurCod[0] ;
         A10513UsuMail = P08OS2_A10513UsuMail[0] ;
         AV35Usumail = A10513UsuMail ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      GXt_int5 = (byte)(AV9carvitin) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVIT", ""), GXv_int6) ;
      imprirordencompra.this.GXt_int5 = GXv_int6[0] ;
      AV9carvitin = GXt_int5 ;
      GXt_int5 = (byte)(AV37moda21) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int6) ;
      imprirordencompra.this.GXt_int5 = GXv_int6[0] ;
      AV37moda21 = GXt_int5 ;
      AV31RutaAdjunto = "Orden_de_compra.pdf" ;
      if ( AV9carvitin == 1 )
      {
         if ( AV27OpcionSeleccionada == 1 )
         {
            new app.poccarvitinpdf(remoteHandle, context).execute( A396EmprCod, AV8Pedcod, AV31RutaAdjunto) ;
            AV26NombresAdjuntos.add(AV31RutaAdjunto, 0);
            /* Execute user subroutine: 'GENERAR DATOS DEL CORREO' */
            S111 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Window Datatype Object Property */
            AV12window.setUrl( formatLink("app.enviarcorreoarchivosadjuntos", new String[] {GXutil.URLEncode(GXutil.rtrim(AV34TextoSeparador)),GXutil.URLEncode(GXutil.rtrim(AV24ListaCorreosDestino.toJSonString(false))),GXutil.URLEncode(GXutil.rtrim(AV18ListaCorreosCopia.toJSonString(false))),GXutil.URLEncode(GXutil.rtrim(AV19ListaCorreosCopiaOculta.toJSonString(false))),GXutil.URLEncode(GXutil.rtrim(AV16Asunto)),GXutil.URLEncode(GXutil.rtrim(AV33TextoCorreo)),GXutil.URLEncode(GXutil.rtrim(AV26NombresAdjuntos.toJSonString(false))),GXutil.URLEncode(GXutil.booltostr(AV25MostrarMail))}, new String[] {"TextoSeparador","parametroCorreosDestinoJson","parametroCorreosCopiaJson","parametroCorreosCopiaOcultaJson","parametroAsunto","parametroTextoCorreo","NombresAdjuntosJson","MostrarMail"})  );
            AV12window.setReturnParms(new Object[] {});
            httpContext.newWindow(AV12window);
         }
         else if ( AV27OpcionSeleccionada == 2 )
         {
            Gx_out = "FIL" ;
            /* Window Datatype Object Property */
            AV12window.setUrl( formatLink("app.poccarvitin", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8Pedcod,8,0)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(DecimalUtil.decToString(AV10PedTot)),GXutil.URLEncode(GXutil.rtrim(Gx_out))}, new String[] {"EmprCod","PedCod","ImpCod","TotPed","Output"})  );
            AV12window.setReturnParms(new Object[] {"A396EmprCod","AV8Pedcod","","AV10PedTot","Gx_out",});
            httpContext.newWindow(AV12window);
         }
         else if ( AV27OpcionSeleccionada == 3 )
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_int7[0] = AV8Pedcod ;
            new app.poccarvitinprinter(remoteHandle, context).execute( GXv_char4, GXv_int7, AV31RutaAdjunto) ;
            imprirordencompra.this.A396EmprCod = GXv_char4[0] ;
            imprirordencompra.this.AV8Pedcod = GXv_int7[0] ;
         }
      }
      else if ( AV37moda21 == 1 )
      {
         if ( AV27OpcionSeleccionada == 1 )
         {
            new app.rmod001pdf(remoteHandle, context).execute( A396EmprCod, AV8Pedcod, "", AV10PedTot, AV31RutaAdjunto) ;
            AV26NombresAdjuntos.add(AV31RutaAdjunto, 0);
            /* Execute user subroutine: 'GENERAR DATOS DEL CORREO' */
            S111 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Window Datatype Object Property */
            AV12window.setUrl( formatLink("app.enviarcorreoarchivosadjuntos", new String[] {GXutil.URLEncode(GXutil.rtrim(AV34TextoSeparador)),GXutil.URLEncode(GXutil.rtrim(AV24ListaCorreosDestino.toJSonString(false))),GXutil.URLEncode(GXutil.rtrim(AV18ListaCorreosCopia.toJSonString(false))),GXutil.URLEncode(GXutil.rtrim(AV19ListaCorreosCopiaOculta.toJSonString(false))),GXutil.URLEncode(GXutil.rtrim(AV16Asunto)),GXutil.URLEncode(GXutil.rtrim(AV33TextoCorreo)),GXutil.URLEncode(GXutil.rtrim(AV26NombresAdjuntos.toJSonString(false))),GXutil.URLEncode(GXutil.booltostr(AV25MostrarMail))}, new String[] {"TextoSeparador","parametroCorreosDestinoJson","parametroCorreosCopiaJson","parametroCorreosCopiaOcultaJson","parametroAsunto","parametroTextoCorreo","NombresAdjuntosJson","MostrarMail"})  );
            AV12window.setReturnParms(new Object[] {});
            httpContext.newWindow(AV12window);
         }
         else if ( AV27OpcionSeleccionada == 2 )
         {
            Gx_out = "FIL" ;
            /* Window Datatype Object Property */
            AV12window.setUrl( formatLink("app.rmod001", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8Pedcod,8,0)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(DecimalUtil.decToString(AV10PedTot))}, new String[] {"EmprCod","PedCod","ImpCod","TotPed"})  );
            AV12window.setReturnParms(new Object[] {"","AV10PedTot",});
            httpContext.newWindow(AV12window);
         }
         else if ( AV27OpcionSeleccionada == 3 )
         {
            new app.rmod001printer(remoteHandle, context).execute( A396EmprCod, AV8Pedcod, "", AV10PedTot, AV31RutaAdjunto) ;
         }
      }
      else
      {
         if ( AV27OpcionSeleccionada == 1 )
         {
         }
         else if ( AV27OpcionSeleccionada == 2 )
         {
         }
         else if ( AV27OpcionSeleccionada == 3 )
         {
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'GENERAR DATOS DEL CORREO' Routine */
      returnInSub = false ;
      /* Using cursor P08OS3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV8Pedcod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A795PrvNum = P08OS3_A795PrvNum[0] ;
         A658PedCod = P08OS3_A658PedCod[0] ;
         A794PrvNom = P08OS3_A794PrvNom[0] ;
         n794PrvNom = P08OS3_n794PrvNom[0] ;
         A6077PrvMail = P08OS3_A6077PrvMail[0] ;
         n6077PrvMail = P08OS3_n6077PrvMail[0] ;
         A661PedFec = P08OS3_A661PedFec[0] ;
         A794PrvNom = P08OS3_A794PrvNom[0] ;
         n794PrvNom = P08OS3_n794PrvNom[0] ;
         A6077PrvMail = P08OS3_A6077PrvMail[0] ;
         n6077PrvMail = P08OS3_n6077PrvMail[0] ;
         AV30PrvNom = A794PrvNom ;
         AV29PrvMail = A6077PrvMail ;
         AV28Pedfec = A661PedFec ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      AV34TextoSeparador = "|#@|" ;
      AV17CadenaRegistrar = AV30PrvNom ;
      AV17CadenaRegistrar += AV34TextoSeparador + GXutil.trim( AV29PrvMail) ;
      AV24ListaCorreosDestino.clear();
      AV24ListaCorreosDestino.add(AV17CadenaRegistrar, 0);
      AV18ListaCorreosCopia.clear();
      AV17CadenaRegistrar = AV23EmprNom ;
      AV17CadenaRegistrar += AV34TextoSeparador + AV35Usumail ;
      AV19ListaCorreosCopiaOculta.clear();
      AV19ListaCorreosCopiaOculta.add(AV17CadenaRegistrar, 0);
      AV16Asunto = httpContext.getMessage( "Envio Fichero PDF N° Pedido ", "") + GXutil.str( AV8Pedcod, 8, 0) + httpContext.getMessage( " del ", "") + localUtil.dtoc( AV28Pedfec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
      AV33TextoCorreo = httpContext.getMessage( "Envio Ordem Compra por e-mail", "") + "<br>" ;
      AV33TextoCorreo += httpContext.getMessage( "No arquivo em anexo.", "") + "<br>" ;
      AV33TextoCorreo += httpContext.getMessage( "Atenciosamente,", "") + "<br>" ;
      AV33TextoCorreo += GXutil.trim( AV23EmprNom) + "<br>" ;
      AV33TextoCorreo += "<br>" + "<br>" ;
      AV33TextoCorreo += httpContext.getMessage( "PRUEBAS NEOTEX Se Enviaría a: ", "") + GXutil.trim( AV29PrvMail) + "<br>" ;
   }

   protected void cleanup( )
   {
      this.aP1[0] = imprirordencompra.this.AV8Pedcod;
      this.aP2[0] = imprirordencompra.this.AV10PedTot;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV32Station = "" ;
      GXt_char1 = "" ;
      AV22EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV23EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV36UsurCod = "" ;
      scmdbuf = "" ;
      P08OS2_A850UsurCod = new String[] {""} ;
      P08OS2_A10513UsuMail = new String[] {""} ;
      A850UsurCod = "" ;
      A10513UsuMail = "" ;
      AV35Usumail = "" ;
      GXv_int6 = new byte[1] ;
      AV31RutaAdjunto = "" ;
      AV26NombresAdjuntos = new GXSimpleCollection<String>(String.class, "internal", "");
      AV12window = new com.genexus.webpanels.GXWindow();
      AV34TextoSeparador = "" ;
      AV24ListaCorreosDestino = new GXSimpleCollection<String>(String.class, "internal", "");
      AV18ListaCorreosCopia = new GXSimpleCollection<String>(String.class, "internal", "");
      AV19ListaCorreosCopiaOculta = new GXSimpleCollection<String>(String.class, "internal", "");
      AV16Asunto = "" ;
      AV33TextoCorreo = "" ;
      Gx_out = "" ;
      GXv_char4 = new String[1] ;
      GXv_int7 = new int[1] ;
      P08OS3_A795PrvNum = new int[1] ;
      P08OS3_A396EmprCod = new String[] {""} ;
      P08OS3_A658PedCod = new int[1] ;
      P08OS3_A794PrvNom = new String[] {""} ;
      P08OS3_n794PrvNom = new boolean[] {false} ;
      P08OS3_A6077PrvMail = new String[] {""} ;
      P08OS3_n6077PrvMail = new boolean[] {false} ;
      P08OS3_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      A794PrvNom = "" ;
      A6077PrvMail = "" ;
      A661PedFec = GXutil.nullDate() ;
      AV30PrvNom = "" ;
      AV29PrvMail = "" ;
      AV28Pedfec = GXutil.nullDate() ;
      AV17CadenaRegistrar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.imprirordencompra__default(),
         new Object[] {
             new Object[] {
            P08OS2_A850UsurCod, P08OS2_A10513UsuMail
            }
            , new Object[] {
            P08OS3_A795PrvNum, P08OS3_A396EmprCod, P08OS3_A658PedCod, P08OS3_A794PrvNom, P08OS3_n794PrvNom, P08OS3_A6077PrvMail, P08OS3_n6077PrvMail, P08OS3_A661PedFec
            }
         }
      );
      Gx_out = "FIL" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private short AV27OpcionSeleccionada ;
   private short AV9carvitin ;
   private short AV37moda21 ;
   private short Gx_err ;
   private int AV8Pedcod ;
   private int GXv_int7[] ;
   private int A795PrvNum ;
   private int A658PedCod ;
   private java.math.BigDecimal AV10PedTot ;
   private String A396EmprCod ;
   private String AV32Station ;
   private String GXt_char1 ;
   private String AV22EmprCod ;
   private String GXv_char2[] ;
   private String AV23EmprNom ;
   private String GXv_char3[] ;
   private String AV36UsurCod ;
   private String scmdbuf ;
   private String A850UsurCod ;
   private String A10513UsuMail ;
   private String AV35Usumail ;
   private String Gx_out ;
   private String GXv_char4[] ;
   private String A794PrvNom ;
   private String A6077PrvMail ;
   private String AV30PrvNom ;
   private String AV29PrvMail ;
   private java.util.Date A661PedFec ;
   private java.util.Date AV28Pedfec ;
   private boolean AV25MostrarMail ;
   private boolean returnInSub ;
   private boolean n794PrvNom ;
   private boolean n6077PrvMail ;
   private String AV31RutaAdjunto ;
   private String AV34TextoSeparador ;
   private String AV16Asunto ;
   private String AV33TextoCorreo ;
   private String AV17CadenaRegistrar ;
   private com.genexus.webpanels.GXWindow AV12window ;
   private GXSimpleCollection<String> AV24ListaCorreosDestino ;
   private GXSimpleCollection<String> AV18ListaCorreosCopia ;
   private GXSimpleCollection<String> AV19ListaCorreosCopiaOculta ;
   private int[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P08OS2_A850UsurCod ;
   private String[] P08OS2_A10513UsuMail ;
   private int[] P08OS3_A795PrvNum ;
   private String[] P08OS3_A396EmprCod ;
   private int[] P08OS3_A658PedCod ;
   private String[] P08OS3_A794PrvNom ;
   private boolean[] P08OS3_n794PrvNom ;
   private String[] P08OS3_A6077PrvMail ;
   private boolean[] P08OS3_n6077PrvMail ;
   private java.util.Date[] P08OS3_A661PedFec ;
   private GXSimpleCollection<String> AV26NombresAdjuntos ;
}

final  class imprirordencompra__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08OS2", "SELECT UsurCod, UsuMail FROM TXPUSUARI WHERE UsurCod = ? ORDER BY UsurCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P08OS3", "SELECT T1.PrvNum, T1.EmprCod, T1.PedCod, T2.PrvNom, T2.PrvMail, T1.PedFec FROM (TXPCPEDID T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum) WHERE T1.EmprCod = ? and T1.PedCod = ? ORDER BY T1.EmprCod, T1.PedCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 40);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
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

