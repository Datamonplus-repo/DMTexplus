package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ttrn06dinamicacalls extends GXProcedure
{
   public ttrn06dinamicacalls( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrn06dinamicacalls.class ), "" );
   }

   public ttrn06dinamicacalls( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        long aP2 ,
                        String aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             long aP2 ,
                             String aP3 )
   {
      ttrn06dinamicacalls.this.AV29NombreDinamica = aP0;
      ttrn06dinamicacalls.this.AV21EmprCod = aP1;
      ttrn06dinamicacalls.this.AV15AlbProCod = aP2;
      ttrn06dinamicacalls.this.AV38SdtParametroCallsJson = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: 'CARGAR PARÁMETROS RECIBIDOS' */
      S191 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( ( GXutil.strcmp(AV41ModoTRN, "INS") == 0 ) || ( GXutil.strcmp(AV41ModoTRN, "UPD") == 0 ) )
      {
         /* Execute user subroutine: 'DATOS CALPRD' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( GXutil.strcmp(AV29NombreDinamica, "TTrn06_Calls_000") == 0 )
         {
            AV30NombreDinamicaAnterior = "TTrn06_Calls_000" ;
            AV31NombreDinamicaSiguiente = "TTrn06_Calls_001" ;
            /* Execute user subroutine: 'AJUSTAR PARÁMETROS PARA REGISTRO WEBSESSION' */
            S181 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Execute user subroutine: 'DINAMICA 000 DE CALL EMULAR COMPORTAMIENTO GX9' */
            S111 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         else if ( GXutil.strcmp(AV29NombreDinamica, "TTrn06_Calls_001") == 0 )
         {
            AV30NombreDinamicaAnterior = "TTrn06_Calls_000" ;
            AV31NombreDinamicaSiguiente = "TTrn06_Calls_002" ;
            /* Execute user subroutine: 'AJUSTAR PARÁMETROS PARA REGISTRO WEBSESSION' */
            S181 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Execute user subroutine: 'DINAMICA 001 DE CALL EMULAR COMPORTAMIENTO GX9' */
            S121 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         else if ( GXutil.strcmp(AV29NombreDinamica, "TTrn06_Calls_002") == 0 )
         {
            AV30NombreDinamicaAnterior = "TTrn06_Calls_001" ;
            AV31NombreDinamicaSiguiente = "TTrn06_Calls_003" ;
            /* Execute user subroutine: 'AJUSTAR PARÁMETROS PARA REGISTRO WEBSESSION' */
            S181 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Execute user subroutine: 'DINAMICA 002 DE CALL EMULAR COMPORTAMIENTO GX9' */
            S131 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         else if ( GXutil.strcmp(AV29NombreDinamica, "TTrn06_Calls_003") == 0 )
         {
            AV30NombreDinamicaAnterior = "TTrn06_Calls_002" ;
            AV31NombreDinamicaSiguiente = "TTrn06_Calls_004" ;
            /* Execute user subroutine: 'AJUSTAR PARÁMETROS PARA REGISTRO WEBSESSION' */
            S181 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Execute user subroutine: 'DINAMICA 003 DE CALL EMULAR COMPORTAMIENTO GX9' */
            S141 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         else if ( GXutil.strcmp(AV29NombreDinamica, "TTrn06_Calls_004") == 0 )
         {
            AV30NombreDinamicaAnterior = "TTrn06_Calls_002" ;
            AV31NombreDinamicaSiguiente = "TTrn06_Calls_005" ;
            /* Execute user subroutine: 'AJUSTAR PARÁMETROS PARA REGISTRO WEBSESSION' */
            S181 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Execute user subroutine: 'DINAMICA 004 DE CALL EMULAR COMPORTAMIENTO GX9' */
            S151 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         else if ( GXutil.strcmp(AV29NombreDinamica, "TTrn06_Calls_005") == 0 )
         {
            AV30NombreDinamicaAnterior = "TTrn06_Calls_004" ;
            AV31NombreDinamicaSiguiente = "TTrn06_Calls_006" ;
            /* Execute user subroutine: 'AJUSTAR PARÁMETROS PARA REGISTRO WEBSESSION' */
            S181 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Execute user subroutine: 'DINAMICA 005 DE CALL EMULAR COMPORTAMIENTO GX9' */
            S161 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'DINAMICA 000 DE CALL EMULAR COMPORTAMIENTO GX9' Routine */
      returnInSub = false ;
      AV9WebSession.setValue(AV29NombreDinamica, AV37SdtParametroCallsCollection.toJSonString(false));
      new app.ttrn06controlactualizar(remoteHandle, context).execute( AV29NombreDinamica, AV15AlbProCod, AV37SdtParametroCallsCollection.toJSonString(false), false) ;
      AV40Window.setWidth( 1600 );
      AV40Window.setHeight( 800 );
      AV40Window.setUrl( "URL" );
      /* Window Datatype Object Property */
      AV40Window.setUrl( formatLink("app.ttrn07", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV21EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV15AlbProCod,10,0))}, new String[] {"Mode","EmprCod","AlbProCod"})  );
      AV40Window.setReturnParms(new Object[] {});
      httpContext.newWindow(AV40Window);
   }

   public void S121( )
   {
      /* 'DINAMICA 001 DE CALL EMULAR COMPORTAMIENTO GX9' Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(AV41ModoTRN, "INS") == 0 ) && ( AV22F_carvema == 1 ) && ( A1243GuiRemCli == 211331 ) )
      {
         GXv_char1[0] = AV21EmprCod ;
         GXv_int2[0] = AV15AlbProCod ;
         GXv_int3[0] = AV24GuiRemCli ;
         new app.pobsalb(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3) ;
         ttrn06dinamicacalls.this.AV21EmprCod = GXv_char1[0] ;
         ttrn06dinamicacalls.this.AV15AlbProCod = GXv_int2[0] ;
         ttrn06dinamicacalls.this.AV24GuiRemCli = GXv_int3[0] ;
      }
      AV9WebSession.setValue(AV29NombreDinamica, AV37SdtParametroCallsCollection.toJSonString(false));
      new app.ttrn06controlactualizar(remoteHandle, context).execute( AV29NombreDinamica, AV15AlbProCod, AV37SdtParametroCallsCollection.toJSonString(false), false) ;
      AV40Window.setUrl( "URL" );
      /* Window Datatype Object Property */
      AV40Window.setUrl( formatLink("app.ttrn12", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV21EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV15AlbProCod,10,0))}, new String[] {"Mode","EmprCod","AlbProCod"})  );
      AV40Window.setReturnParms(new Object[] {});
      httpContext.newWindow(AV40Window);
   }

   public void S131( )
   {
      /* 'DINAMICA 002 DE CALL EMULAR COMPORTAMIENTO GX9' Routine */
      returnInSub = false ;
      AV42LlamadaDinamica = false ;
      GXv_char1[0] = AV21EmprCod ;
      GXv_int2[0] = AV15AlbProCod ;
      new app.pchgdat(remoteHandle, context).execute( GXv_char1, GXv_int2) ;
      ttrn06dinamicacalls.this.AV21EmprCod = GXv_char1[0] ;
      ttrn06dinamicacalls.this.AV15AlbProCod = GXv_int2[0] ;
      if ( ( AV23FirmaD == 1 ) && ( AV16AlbProEst <= 1 ) )
      {
         GXv_char1[0] = AV21EmprCod ;
         GXv_int2[0] = AV15AlbProCod ;
         GXv_date4[0] = AV17AlbProFch ;
         GXv_dtime5[0] = AV12AlbHhfm ;
         GXv_int6[0] = (byte)(1) ;
         GXv_int7[0] = (byte)(3) ;
         GXv_int8[0] = (byte)(1) ;
         GXv_char9[0] = "" ;
         GXv_char10[0] = "" ;
         new app.pdelprbajustado(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_date4, GXv_dtime5, GXv_int6, GXv_int7, GXv_int8, GXv_char9, GXv_char10) ;
         ttrn06dinamicacalls.this.AV21EmprCod = GXv_char1[0] ;
         ttrn06dinamicacalls.this.AV15AlbProCod = GXv_int2[0] ;
         ttrn06dinamicacalls.this.AV17AlbProFch = GXv_date4[0] ;
         ttrn06dinamicacalls.this.AV12AlbHhfm = GXv_dtime5[0] ;
         if ( AV8AlbGrossT.doubleValue() > 0 )
         {
            AV28NextGuia = (long)(AV15AlbProCod+1) ;
            GXv_char10[0] = AV21EmprCod ;
            GXv_int2[0] = AV28NextGuia ;
            new app.pbusprs(remoteHandle, context).execute( GXv_char10, GXv_int2) ;
            ttrn06dinamicacalls.this.AV21EmprCod = GXv_char10[0] ;
            ttrn06dinamicacalls.this.AV28NextGuia = GXv_int2[0] ;
         }
      }
      if ( AV39Ws == 1 )
      {
         if ( ( AV32Nows == 1 ) && ( GXutil.strcmp(A39AlbProPri, "0") == 0 ) )
         {
         }
         else
         {
            if ( ( GXutil.strcmp(AV41ModoTRN, "INS") == 0 ) || ( A5805AlbEnvFtp != 3 ) )
            {
               GXv_char10[0] = A396EmprCod ;
               GXv_int2[0] = A30AlbProCod ;
               GXv_char9[0] = A5140AlbMarca ;
               new app.pws0007(remoteHandle, context).execute( GXv_char10, GXv_int2, GXv_char9) ;
               ttrn06dinamicacalls.this.A396EmprCod = GXv_char10[0] ;
               ttrn06dinamicacalls.this.A30AlbProCod = GXv_int2[0] ;
               ttrn06dinamicacalls.this.A5140AlbMarca = GXv_char9[0] ;
               if ( GXutil.strcmp(A5140AlbMarca, " ") == 0 )
               {
                  AV42LlamadaDinamica = true ;
                  AV9WebSession.setValue(AV29NombreDinamica, AV37SdtParametroCallsCollection.toJSonString(false));
                  new app.ttrn06controlactualizar(remoteHandle, context).execute( AV29NombreDinamica, AV15AlbProCod, AV37SdtParametroCallsCollection.toJSonString(false), false) ;
                  AV40Window.setUrl( "URL" );
                  /* Window Datatype Object Property */
                  AV40Window.setUrl( formatLink("app.webenvioatalbaranproduccion", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.formatDateParm(A4023AlbFecSal)),GXutil.URLEncode(GXutil.rtrim(A10017AlbFmd)),GXutil.URLEncode(GXutil.ltrimstr(1,9,0))}, new String[] {"EmprCod","AlbProcod","FecSal","Albfmd","TipoDoc"})  );
                  AV40Window.setReturnParms(new Object[] {"A396EmprCod","A30AlbProCod","A4023AlbFecSal","A10017AlbFmd","",});
                  httpContext.newWindow(AV40Window);
               }
            }
         }
      }
      if ( ! AV42LlamadaDinamica )
      {
         new app.ttrn06dinamicacalls(remoteHandle, context).execute( "TTrn06_Calls_004", AV21EmprCod, AV15AlbProCod, AV38SdtParametroCallsJson) ;
      }
   }

   public void S141( )
   {
      /* 'DINAMICA 003 DE CALL EMULAR COMPORTAMIENTO GX9' Routine */
      returnInSub = false ;
      new app.ttrn06dinamicacalls(remoteHandle, context).execute( "TTrn06_Calls_004", AV21EmprCod, AV15AlbProCod, AV38SdtParametroCallsJson) ;
   }

   public void S151( )
   {
      /* 'DINAMICA 004 DE CALL EMULAR COMPORTAMIENTO GX9' Routine */
      returnInSub = false ;
      AV42LlamadaDinamica = false ;
      new app.pelcalb(remoteHandle, context).execute( A396EmprCod, A30AlbProCod) ;
      if ( ( AV23FirmaD == 1 ) && ( A33AlbProEst <= 1 ) )
      {
         GXv_char10[0] = AV21EmprCod ;
         GXv_int2[0] = AV15AlbProCod ;
         GXv_date4[0] = AV17AlbProFch ;
         GXv_dtime5[0] = AV12AlbHhfm ;
         GXv_int8[0] = (byte)(1) ;
         GXv_int7[0] = (byte)(3) ;
         GXv_int6[0] = (byte)(1) ;
         GXv_char9[0] = "" ;
         GXv_char1[0] = "" ;
         new app.pdelprbajustado(remoteHandle, context).execute( GXv_char10, GXv_int2, GXv_date4, GXv_dtime5, GXv_int8, GXv_int7, GXv_int6, GXv_char9, GXv_char1) ;
         ttrn06dinamicacalls.this.AV21EmprCod = GXv_char10[0] ;
         ttrn06dinamicacalls.this.AV15AlbProCod = GXv_int2[0] ;
         ttrn06dinamicacalls.this.AV17AlbProFch = GXv_date4[0] ;
         ttrn06dinamicacalls.this.AV12AlbHhfm = GXv_dtime5[0] ;
         if ( AV8AlbGrossT.doubleValue() > 0 )
         {
            AV28NextGuia = (long)(AV15AlbProCod+1) ;
            GXv_char10[0] = A396EmprCod ;
            GXv_int2[0] = AV28NextGuia ;
            new app.pbusprs(remoteHandle, context).execute( GXv_char10, GXv_int2) ;
            ttrn06dinamicacalls.this.A396EmprCod = GXv_char10[0] ;
            ttrn06dinamicacalls.this.AV28NextGuia = GXv_int2[0] ;
         }
         if ( AV34PrnAlb == 1 )
         {
            AV42LlamadaDinamica = true ;
            AV9WebSession.setValue(AV29NombreDinamica, AV37SdtParametroCallsCollection.toJSonString(false));
            new app.ttrn06controlactualizar(remoteHandle, context).execute( AV29NombreDinamica, AV15AlbProCod, AV37SdtParametroCallsCollection.toJSonString(false), false) ;
            AV40Window.setUrl( "URL" );
            /* Window Datatype Object Property */
            AV40Window.setUrl( formatLink("app.webwprnalb", new String[] {GXutil.URLEncode(GXutil.rtrim(AV21EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV15AlbProCod,10,0))}, new String[] {"EmprCod","AlbCod"})  );
            AV40Window.setReturnParms(new Object[] {"AV21EmprCod","AV15AlbProCod",});
            httpContext.newWindow(AV40Window);
         }
      }
      if ( ( AV34PrnAlb == 1 ) && ( AV23FirmaD == 0 ) && ( A33AlbProEst <= 1 ) )
      {
         if ( ( A5805AlbEnvFtp == 3 ) && ( AV35PrnAT == 1 ) )
         {
         }
         else
         {
            AV42LlamadaDinamica = true ;
            AV9WebSession.setValue(AV29NombreDinamica, AV37SdtParametroCallsCollection.toJSonString(false));
            new app.ttrn06controlactualizar(remoteHandle, context).execute( AV29NombreDinamica, AV15AlbProCod, AV37SdtParametroCallsCollection.toJSonString(false), false) ;
            AV40Window.setUrl( "URL" );
            /* Window Datatype Object Property */
            AV40Window.setUrl( formatLink("app.webwprnalb", new String[] {GXutil.URLEncode(GXutil.rtrim(AV21EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV15AlbProCod,10,0))}, new String[] {"EmprCod","AlbCod"})  );
            AV40Window.setReturnParms(new Object[] {"AV21EmprCod","AV15AlbProCod",});
            httpContext.newWindow(AV40Window);
         }
      }
      if ( ! AV42LlamadaDinamica )
      {
         new app.ttrn06dinamicacalls(remoteHandle, context).execute( AV31NombreDinamicaSiguiente, AV21EmprCod, AV15AlbProCod, AV38SdtParametroCallsJson) ;
      }
   }

   public void S161( )
   {
      /* 'DINAMICA 005 DE CALL EMULAR COMPORTAMIENTO GX9' Routine */
      returnInSub = false ;
      new app.ttrn06controlactualizar(remoteHandle, context).execute( AV29NombreDinamica, AV15AlbProCod, AV37SdtParametroCallsCollection.toJSonString(false), true) ;
      returnInSub = true;
      if (true) return;
   }

   public void S171( )
   {
      /* 'DATOS CALPRD' Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(AV41ModoTRN, "INS") == 0 ) || ( GXutil.strcmp(AV41ModoTRN, "UPD") == 0 ) )
      {
         AV45GXLvl156 = (byte)(0) ;
         /* Using cursor P08OD2 */
         pr_default.execute(0, new Object[] {AV21EmprCod, Long.valueOf(AV15AlbProCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A1253EmprGuiRem = P08OD2_A1253EmprGuiRem[0] ;
            A30AlbProCod = P08OD2_A30AlbProCod[0] ;
            A396EmprCod = P08OD2_A396EmprCod[0] ;
            A1243GuiRemCli = P08OD2_A1243GuiRemCli[0] ;
            A1244GuiRemCln = P08OD2_A1244GuiRemCln[0] ;
            A34AlbProfch = P08OD2_A34AlbProfch[0] ;
            A2242AlbSec = P08OD2_A2242AlbSec[0] ;
            A39AlbProPri = P08OD2_A39AlbProPri[0] ;
            A5805AlbEnvFtp = P08OD2_A5805AlbEnvFtp[0] ;
            A7101AlbLic = P08OD2_A7101AlbLic[0] ;
            A33AlbProEst = P08OD2_A33AlbProEst[0] ;
            A10019AlbHhfm = P08OD2_A10019AlbHhfm[0] ;
            A10020AlbGrossT = P08OD2_A10020AlbGrossT[0] ;
            A5140AlbMarca = P08OD2_A5140AlbMarca[0] ;
            A4023AlbFecSal = P08OD2_A4023AlbFecSal[0] ;
            A1244GuiRemCln = P08OD2_A1244GuiRemCln[0] ;
            AV45GXLvl156 = (byte)(1) ;
            AV24GuiRemCli = A1243GuiRemCli ;
            AV25GuiRemCln = A1244GuiRemCln ;
            AV17AlbProFch = A34AlbProfch ;
            AV19AlbSec = A2242AlbSec ;
            AV18AlbProPri = A39AlbProPri ;
            AV10AlbEnvFtp = A5805AlbEnvFtp ;
            AV13AlbLic = A7101AlbLic ;
            AV16AlbProEst = A33AlbProEst ;
            AV17AlbProFch = A34AlbProfch ;
            AV12AlbHhfm = A10019AlbHhfm ;
            AV8AlbGrossT = A10020AlbGrossT ;
            AV18AlbProPri = A39AlbProPri ;
            AV14AlbMarca = A5140AlbMarca ;
            AV11AlbFecSal = A4023AlbFecSal ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( AV45GXLvl156 == 0 )
         {
            returnInSub = true;
            if (true) return;
         }
      }
      else
      {
         returnInSub = true;
         if (true) return;
      }
   }

   public void S181( )
   {
      /* 'AJUSTAR PARÁMETROS PARA REGISTRO WEBSESSION' Routine */
      returnInSub = false ;
      AV33ParametroEncontrado = false ;
      AV46GXV1 = 1 ;
      while ( AV46GXV1 <= AV37SdtParametroCallsCollection.size() )
      {
         AV36SdtParametroCalls = (app.SdtSdtParametroCalls)((app.SdtSdtParametroCalls)AV37SdtParametroCallsCollection.elementAt(-1+AV46GXV1));
         if ( GXutil.strcmp(AV36SdtParametroCalls.getgxTv_SdtSdtParametroCalls_Nombreparametro(), "NombreDinamicaSiguiente") == 0 )
         {
            AV36SdtParametroCalls.setgxTv_SdtSdtParametroCalls_Valorparametro( AV31NombreDinamicaSiguiente );
            ((app.SdtSdtParametroCalls)(AV37SdtParametroCallsCollection.currentItem())).fromJSonString(AV36SdtParametroCalls.toJSonString(false, true), null);
            AV33ParametroEncontrado = true ;
            if (true) break;
         }
         AV46GXV1 = (int)(AV46GXV1+1) ;
      }
      if ( ! AV33ParametroEncontrado )
      {
         AV36SdtParametroCalls = (app.SdtSdtParametroCalls)new app.SdtSdtParametroCalls(remoteHandle, context);
         AV36SdtParametroCalls.setgxTv_SdtSdtParametroCalls_Nombreparametro( "NombreDinamicaSiguiente" );
         AV36SdtParametroCalls.setgxTv_SdtSdtParametroCalls_Valorparametro( AV31NombreDinamicaSiguiente );
         AV37SdtParametroCallsCollection.add(AV36SdtParametroCalls, 0);
      }
      AV33ParametroEncontrado = false ;
      AV47GXV2 = 1 ;
      while ( AV47GXV2 <= AV37SdtParametroCallsCollection.size() )
      {
         AV36SdtParametroCalls = (app.SdtSdtParametroCalls)((app.SdtSdtParametroCalls)AV37SdtParametroCallsCollection.elementAt(-1+AV47GXV2));
         if ( GXutil.strcmp(AV36SdtParametroCalls.getgxTv_SdtSdtParametroCalls_Nombreparametro(), "NombreDinamicaAnterior") == 0 )
         {
            AV36SdtParametroCalls.setgxTv_SdtSdtParametroCalls_Valorparametro( AV30NombreDinamicaAnterior );
            ((app.SdtSdtParametroCalls)(AV37SdtParametroCallsCollection.currentItem())).fromJSonString(AV36SdtParametroCalls.toJSonString(false, true), null);
            AV33ParametroEncontrado = true ;
            if (true) break;
         }
         AV47GXV2 = (int)(AV47GXV2+1) ;
      }
      if ( ! AV33ParametroEncontrado )
      {
         AV36SdtParametroCalls = (app.SdtSdtParametroCalls)new app.SdtSdtParametroCalls(remoteHandle, context);
         AV36SdtParametroCalls.setgxTv_SdtSdtParametroCalls_Nombreparametro( "NombreDinamicaAnterior" );
         AV36SdtParametroCalls.setgxTv_SdtSdtParametroCalls_Valorparametro( AV30NombreDinamicaAnterior );
         AV37SdtParametroCallsCollection.add(AV36SdtParametroCalls, 0);
      }
   }

   public void S191( )
   {
      /* 'CARGAR PARÁMETROS RECIBIDOS' Routine */
      returnInSub = false ;
      AV37SdtParametroCallsCollection.clear();
      AV37SdtParametroCallsCollection.fromJSonString(AV38SdtParametroCallsJson, null);
      AV48GXV3 = 1 ;
      while ( AV48GXV3 <= AV37SdtParametroCallsCollection.size() )
      {
         AV36SdtParametroCalls = (app.SdtSdtParametroCalls)((app.SdtSdtParametroCalls)AV37SdtParametroCallsCollection.elementAt(-1+AV48GXV3));
         if ( GXutil.strcmp(AV36SdtParametroCalls.getgxTv_SdtSdtParametroCalls_Nombreparametro(), "F_carvema") == 0 )
         {
            AV22F_carvema = (byte)(GXutil.lval( AV36SdtParametroCalls.getgxTv_SdtSdtParametroCalls_Valorparametro())) ;
         }
         else if ( GXutil.strcmp(AV36SdtParametroCalls.getgxTv_SdtSdtParametroCalls_Nombreparametro(), "FirmaD") == 0 )
         {
            AV23FirmaD = (short)(GXutil.lval( AV36SdtParametroCalls.getgxTv_SdtSdtParametroCalls_Valorparametro())) ;
         }
         else if ( GXutil.strcmp(AV36SdtParametroCalls.getgxTv_SdtSdtParametroCalls_Nombreparametro(), "Ws") == 0 )
         {
            AV39Ws = (short)(GXutil.lval( AV36SdtParametroCalls.getgxTv_SdtSdtParametroCalls_Valorparametro())) ;
         }
         else if ( GXutil.strcmp(AV36SdtParametroCalls.getgxTv_SdtSdtParametroCalls_Nombreparametro(), "Nows") == 0 )
         {
            AV32Nows = (short)(GXutil.lval( AV36SdtParametroCalls.getgxTv_SdtSdtParametroCalls_Valorparametro())) ;
         }
         else if ( GXutil.strcmp(AV36SdtParametroCalls.getgxTv_SdtSdtParametroCalls_Nombreparametro(), "Modhh") == 0 )
         {
            AV26Modhh = (byte)(GXutil.lval( AV36SdtParametroCalls.getgxTv_SdtSdtParametroCalls_Valorparametro())) ;
         }
         else if ( GXutil.strcmp(AV36SdtParametroCalls.getgxTv_SdtSdtParametroCalls_Nombreparametro(), "ModoTRN") == 0 )
         {
            AV41ModoTRN = AV36SdtParametroCalls.getgxTv_SdtSdtParametroCalls_Valorparametro() ;
         }
         else
         {
         }
         AV48GXV3 = (int)(AV48GXV3+1) ;
      }
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
      AV41ModoTRN = "" ;
      AV30NombreDinamicaAnterior = "" ;
      AV31NombreDinamicaSiguiente = "" ;
      AV9WebSession = httpContext.getWebSession();
      AV37SdtParametroCallsCollection = new GXBaseCollection<app.SdtSdtParametroCalls>(app.SdtSdtParametroCalls.class, "SdtParametroCalls", "TexplusNET", remoteHandle);
      AV40Window = new com.genexus.webpanels.GXWindow();
      GXv_int3 = new int[1] ;
      A39AlbProPri = "" ;
      A396EmprCod = "" ;
      A5140AlbMarca = "" ;
      A4023AlbFecSal = GXutil.nullDate() ;
      A10017AlbFmd = "" ;
      AV17AlbProFch = GXutil.nullDate() ;
      AV12AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      AV8AlbGrossT = DecimalUtil.ZERO ;
      GXv_date4 = new java.util.Date[1] ;
      GXv_dtime5 = new java.util.Date[1] ;
      GXv_int8 = new byte[1] ;
      GXv_int7 = new byte[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char9 = new String[1] ;
      GXv_char1 = new String[1] ;
      GXv_char10 = new String[1] ;
      GXv_int2 = new long[1] ;
      A1244GuiRemCln = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A2242AlbSec = "" ;
      A7101AlbLic = "" ;
      A10019AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      A10020AlbGrossT = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P08OD2_A1253EmprGuiRem = new String[] {""} ;
      P08OD2_A30AlbProCod = new long[1] ;
      P08OD2_A396EmprCod = new String[] {""} ;
      P08OD2_A1243GuiRemCli = new int[1] ;
      P08OD2_A1244GuiRemCln = new String[] {""} ;
      P08OD2_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P08OD2_A2242AlbSec = new String[] {""} ;
      P08OD2_A39AlbProPri = new String[] {""} ;
      P08OD2_A5805AlbEnvFtp = new byte[1] ;
      P08OD2_A7101AlbLic = new String[] {""} ;
      P08OD2_A33AlbProEst = new byte[1] ;
      P08OD2_A10019AlbHhfm = new java.util.Date[] {GXutil.nullDate()} ;
      P08OD2_A10020AlbGrossT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08OD2_A5140AlbMarca = new String[] {""} ;
      P08OD2_A4023AlbFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      A1253EmprGuiRem = "" ;
      AV25GuiRemCln = "" ;
      AV19AlbSec = "" ;
      AV18AlbProPri = "" ;
      AV13AlbLic = "" ;
      AV14AlbMarca = "" ;
      AV11AlbFecSal = GXutil.nullDate() ;
      AV36SdtParametroCalls = new app.SdtSdtParametroCalls(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrn06dinamicacalls__default(),
         new Object[] {
             new Object[] {
            P08OD2_A1253EmprGuiRem, P08OD2_A30AlbProCod, P08OD2_A396EmprCod, P08OD2_A1243GuiRemCli, P08OD2_A1244GuiRemCln, P08OD2_A34AlbProfch, P08OD2_A2242AlbSec, P08OD2_A39AlbProPri, P08OD2_A5805AlbEnvFtp, P08OD2_A7101AlbLic,
            P08OD2_A33AlbProEst, P08OD2_A10019AlbHhfm, P08OD2_A10020AlbGrossT, P08OD2_A5140AlbMarca, P08OD2_A4023AlbFecSal
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV22F_carvema ;
   private byte A5805AlbEnvFtp ;
   private byte AV16AlbProEst ;
   private byte A33AlbProEst ;
   private byte GXv_int8[] ;
   private byte GXv_int7[] ;
   private byte GXv_int6[] ;
   private byte AV45GXLvl156 ;
   private byte AV10AlbEnvFtp ;
   private byte AV26Modhh ;
   private short AV23FirmaD ;
   private short AV39Ws ;
   private short AV32Nows ;
   private short AV34PrnAlb ;
   private short AV35PrnAT ;
   private short Gx_err ;
   private int A1243GuiRemCli ;
   private int AV24GuiRemCli ;
   private int GXv_int3[] ;
   private int AV46GXV1 ;
   private int AV47GXV2 ;
   private int AV48GXV3 ;
   private long AV15AlbProCod ;
   private long A30AlbProCod ;
   private long AV28NextGuia ;
   private long GXv_int2[] ;
   private java.math.BigDecimal AV8AlbGrossT ;
   private java.math.BigDecimal A10020AlbGrossT ;
   private String AV21EmprCod ;
   private String AV41ModoTRN ;
   private String A39AlbProPri ;
   private String A396EmprCod ;
   private String A5140AlbMarca ;
   private String GXv_char9[] ;
   private String GXv_char1[] ;
   private String GXv_char10[] ;
   private String A1244GuiRemCln ;
   private String A2242AlbSec ;
   private String A7101AlbLic ;
   private String scmdbuf ;
   private String A1253EmprGuiRem ;
   private String AV25GuiRemCln ;
   private String AV19AlbSec ;
   private String AV18AlbProPri ;
   private String AV13AlbLic ;
   private String AV14AlbMarca ;
   private java.util.Date AV12AlbHhfm ;
   private java.util.Date GXv_dtime5[] ;
   private java.util.Date A10019AlbHhfm ;
   private java.util.Date A4023AlbFecSal ;
   private java.util.Date AV17AlbProFch ;
   private java.util.Date GXv_date4[] ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date AV11AlbFecSal ;
   private boolean returnInSub ;
   private boolean AV42LlamadaDinamica ;
   private boolean AV33ParametroEncontrado ;
   private String AV29NombreDinamica ;
   private String AV38SdtParametroCallsJson ;
   private String AV30NombreDinamicaAnterior ;
   private String AV31NombreDinamicaSiguiente ;
   private String A10017AlbFmd ;
   private com.genexus.webpanels.GXWindow AV40Window ;
   private GXBaseCollection<app.SdtSdtParametroCalls> AV37SdtParametroCallsCollection ;
   private IDataStoreProvider pr_default ;
   private String[] P08OD2_A1253EmprGuiRem ;
   private long[] P08OD2_A30AlbProCod ;
   private String[] P08OD2_A396EmprCod ;
   private int[] P08OD2_A1243GuiRemCli ;
   private String[] P08OD2_A1244GuiRemCln ;
   private java.util.Date[] P08OD2_A34AlbProfch ;
   private String[] P08OD2_A2242AlbSec ;
   private String[] P08OD2_A39AlbProPri ;
   private byte[] P08OD2_A5805AlbEnvFtp ;
   private String[] P08OD2_A7101AlbLic ;
   private byte[] P08OD2_A33AlbProEst ;
   private java.util.Date[] P08OD2_A10019AlbHhfm ;
   private java.math.BigDecimal[] P08OD2_A10020AlbGrossT ;
   private String[] P08OD2_A5140AlbMarca ;
   private java.util.Date[] P08OD2_A4023AlbFecSal ;
   private com.genexus.webpanels.WebSession AV9WebSession ;
   private app.SdtSdtParametroCalls AV36SdtParametroCalls ;
}

final  class ttrn06dinamicacalls__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08OD2", "SELECT T1.EmprGuiRem AS EmprGuiRem, T1.AlbProCod, T1.EmprCod, T1.GuiRemCli AS GuiRemCli, T2.CliNom AS GuiRemCln, T1.AlbProfch, T1.AlbSec, T1.AlbProPri, T1.AlbEnvFtp, T1.AlbLic, T1.AlbProEst, T1.AlbHhfm, T1.AlbGrossT, T1.AlbMarca, T1.AlbFecSal FROM (TXPCALPRD T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(15);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

