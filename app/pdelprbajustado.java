package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdelprbajustado extends GXProcedure
{
   public pdelprbajustado( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdelprbajustado.class ), "" );
   }

   public pdelprbajustado( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 ,
                             java.util.Date[] aP2 ,
                             java.util.Date[] aP3 ,
                             byte[] aP4 ,
                             byte[] aP5 ,
                             byte[] aP6 ,
                             String[] aP7 )
   {
      pdelprbajustado.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        java.util.Date[] aP2 ,
                        java.util.Date[] aP3 ,
                        byte[] aP4 ,
                        byte[] aP5 ,
                        byte[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             java.util.Date[] aP2 ,
                             java.util.Date[] aP3 ,
                             byte[] aP4 ,
                             byte[] aP5 ,
                             byte[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 )
   {
      pdelprbajustado.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdelprbajustado.this.AV81FacCod = aP1[0];
      this.aP1 = aP1;
      pdelprbajustado.this.AV82FacFch = aP2[0];
      this.aP2 = aP2;
      pdelprbajustado.this.AV84FacHor = aP3[0];
      this.aP3 = aP3;
      pdelprbajustado.this.AV109Tablas = aP4[0];
      this.aP4 = aP4;
      pdelprbajustado.this.AV102Opcion = aP5[0];
      this.aP5 = aP5;
      pdelprbajustado.this.aP6 = aP6;
      pdelprbajustado.this.aP7 = aP7;
      pdelprbajustado.this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV78ddmmaaaa ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( A396EmprCod, "FIRDGG", GXv_char2) ;
      pdelprbajustado.this.GXt_char1 = GXv_char2[0] ;
      AV78ddmmaaaa = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = "DPKEY" ;
      GXv_date4[0] = Gx_date ;
      GXv_char5[0] = AV100Msg_dpkey ;
      new app.pregpar(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_date4, GXv_char5) ;
      pdelprbajustado.this.A396EmprCod = GXv_char2[0] ;
      pdelprbajustado.this.Gx_date = GXv_date4[0] ;
      pdelprbajustado.this.AV100Msg_dpkey = GXv_char5[0] ;
      if ( GXutil.strcmp(AV100Msg_dpkey, " ") != 0 )
      {
         AV99MensajeProcesamiento = GXutil.trim( AV100Msg_dpkey) ;
         AV101NoCont = (byte)(1) ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      else
      {
         if ( (GXutil.strcmp("", AV78ddmmaaaa)==0) )
         {
            AV78ddmmaaaa = "02/04/12" ;
         }
         AV82FacFch = localUtil.ctod( AV78ddmmaaaa, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         Gx_msg = "&ddmmaaaa =" + AV78ddmmaaaa + "&FacFch =" + localUtil.dtoc( AV82FacFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         System.out.println( Gx_msg );
         if ( AV109Tablas == 1 )
         {
            /* Using cursor P08AM2 */
            pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(AV81FacCod)});
            while ( (pr_default.getStatus(0) != 101) )
            {
               A1253EmprGuiRem = P08AM2_A1253EmprGuiRem[0] ;
               A1243GuiRemCli = P08AM2_A1243GuiRemCli[0] ;
               A30AlbProCod = P08AM2_A30AlbProCod[0] ;
               A39AlbProPri = P08AM2_A39AlbProPri[0] ;
               A1902CliValA = P08AM2_A1902CliValA[0] ;
               n1902CliValA = P08AM2_n1902CliValA[0] ;
               A10019AlbHhfm = P08AM2_A10019AlbHhfm[0] ;
               A3865AlbHorSal = P08AM2_A3865AlbHorSal[0] ;
               A34AlbProfch = P08AM2_A34AlbProfch[0] ;
               A4023AlbFecSal = P08AM2_A4023AlbFecSal[0] ;
               A10020AlbGrossT = P08AM2_A10020AlbGrossT[0] ;
               A10018ALbFmdc = P08AM2_A10018ALbFmdc[0] ;
               A1902CliValA = P08AM2_A1902CliValA[0] ;
               n1902CliValA = P08AM2_n1902CliValA[0] ;
               AV63AlbProPri = A39AlbProPri ;
               AV74CliValA = A1902CliValA ;
               AV93GrossTotal = DecimalUtil.doubleToDec(0) ;
               if ( GXutil.strcmp(AV74CliValA, "S") == 0 )
               {
                  /* Using cursor P08AM3 */
                  pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
                  while ( (pr_default.getStatus(1) != 101) )
                  {
                     A130BarCodPar = P08AM3_A130BarCodPar[0] ;
                     A132BarCodReo = P08AM3_A132BarCodReo[0] ;
                     A129BarCod = P08AM3_A129BarCod[0] ;
                     A1264BarPreMtr = P08AM3_A1264BarPreMtr[0] ;
                     A1263BarAlbMtrE = P08AM3_A1263BarAlbMtrE[0] ;
                     A1262BarPreKgm = P08AM3_A1262BarPreKgm[0] ;
                     A1261BarAlbKgmE = P08AM3_A1261BarAlbKgmE[0] ;
                     AV93GrossTotal = AV93GrossTotal.add((GXutil.roundDecimal( (A1261BarAlbKgmE.multiply(A1262BarPreKgm)).add((A1263BarAlbMtrE.multiply(A1264BarPreMtr))), 2))) ;
                     /* Using cursor P08AM4 */
                     pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                     while ( (pr_default.getStatus(2) != 101) )
                     {
                        A1276FasMtr = P08AM4_A1276FasMtr[0] ;
                        A1242GuiFasPMt = P08AM4_A1242GuiFasPMt[0] ;
                        A1275FasKgm = P08AM4_A1275FasKgm[0] ;
                        A1241GuiFasPKg = P08AM4_A1241GuiFasPKg[0] ;
                        A1240GuiFasLin = P08AM4_A1240GuiFasLin[0] ;
                        AV93GrossTotal = AV93GrossTotal.add((GXutil.roundDecimal( (A1241GuiFasPKg.multiply(A1275FasKgm)).add((A1242GuiFasPMt.multiply(A1276FasMtr))), 2))) ;
                        pr_default.readNext(2);
                     }
                     pr_default.close(2);
                     pr_default.readNext(1);
                  }
                  pr_default.close(1);
               }
               AV86FacTot = AV93GrossTotal ;
               AV112VarAux = ((AV102Opcion==1) ? A3865AlbHorSal : localUtil.ttoc( A10019AlbHhfm, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
               AV96Hhsys = ((AV102Opcion==1) ? A3865AlbHorSal : GXutil.substring( AV112VarAux, 12, 8)) ;
               AV88FecSys = ((AV102Opcion==1) ? (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A4023AlbFecSal)) ? A34AlbProfch : A4023AlbFecSal) : localUtil.ctod( GXutil.substring( AV112VarAux, 1, 10), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
               /* Execute user subroutine: '&DATEAUX CON BASE EN &FECSYS' */
               S151 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               AV110Texto = AV77DateAux ;
               AV110Texto += ";" + AV77DateAux + "T" + AV96Hhsys ;
               if ( GXutil.strcmp(A39AlbProPri, "1") == 0 )
               {
                  AV85FacTipFac = (byte)(1) ;
               }
               else
               {
                  AV85FacTipFac = (byte)(2) ;
               }
               AV110Texto += ((AV85FacTipFac==1) ? ";GR " : ";GT ") + GXutil.trim( GXutil.str( AV85FacTipFac, 1, 0)) + "/" + GXutil.trim( GXutil.str( A30AlbProCod, 10, 0)) ;
               AV110Texto += ";" + GXutil.trim( GXutil.str( AV86FacTot, 13, 2)) + ";" ;
               /* Execute user subroutine: 'FIRMAANTERIOR' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               A10020AlbGrossT = AV86FacTot ;
               AV62ALbFmdc = AV110Texto ;
               AV62ALbFmdc += "FirmaLast=" + GXutil.trim( AV92FirmaLast) ;
               A10018ALbFmdc = GXutil.substring( GXutil.trim( AV62ALbFmdc), 1, 200) ;
               AV112VarAux = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A4023AlbFecSal)) ? localUtil.dtoc( A34AlbProfch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") : localUtil.dtoc( A4023AlbFecSal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + " " + A3865AlbHorSal ;
               if ( AV102Opcion == 1 )
               {
                  A10019AlbHhfm = localUtil.ctot( AV112VarAux, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               }
               /* Using cursor P08AM5 */
               pr_default.execute(3, new Object[] {A10019AlbHhfm, A10020AlbGrossT, A10018ALbFmdc, A396EmprCod, Long.valueOf(A30AlbProCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(0);
            System.out.println( AV110Texto );
            /* Execute user subroutine: 'APLCAR USO DE RSA.EXE' */
            S131 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            n10017AlbFmd = false ;
            /* Optimized UPDATE. */
            /* Using cursor P08AM6 */
            pr_default.execute(4, new Object[] {AV89Firma, A396EmprCod, Long.valueOf(AV81FacCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
            /* End optimized UPDATE. */
         }
         else
         {
            AV86FacTot = DecimalUtil.ZERO ;
            /* Using cursor P08AM7 */
            pr_default.execute(5, new Object[] {A396EmprCod, Long.valueOf(AV81FacCod)});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A14AlbComCod = P08AM7_A14AlbComCod[0] ;
               A22AlbComPri = P08AM7_A22AlbComPri[0] ;
               A10013AlbComFs = P08AM7_A10013AlbComFs[0] ;
               A4829AlbComHor = P08AM7_A4829AlbComHor[0] ;
               A10015AlbComFdD = P08AM7_A10015AlbComFdD[0] ;
               AV63AlbProPri = A22AlbComPri ;
               AV112VarAux = ((AV102Opcion==1) ? localUtil.ttoc( A4829AlbComHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") : localUtil.ttoc( A10013AlbComFs, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
               AV96Hhsys = GXutil.substring( AV112VarAux, 12, 8) ;
               AV88FecSys = localUtil.ctod( GXutil.substring( AV112VarAux, 1, 10), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               /* Execute user subroutine: '&DATEAUX CON BASE EN &FECSYS' */
               S151 ();
               if ( returnInSub )
               {
                  pr_default.close(5);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               AV110Texto = AV77DateAux ;
               AV110Texto += ";" + AV77DateAux + "T" + AV96Hhsys ;
               AV85FacTipFac = (byte)(((GXutil.strcmp(A22AlbComPri, "1")==0) ? 3 : 4)) ;
               AV110Texto += ((AV85FacTipFac==3) ? ";GR " : ";GT ") + GXutil.trim( GXutil.str( AV85FacTipFac, 1, 0)) + "/" + GXutil.trim( GXutil.str( A14AlbComCod, 8, 0)) ;
               AV110Texto += ";" + GXutil.trim( GXutil.str( AV86FacTot, 13, 2)) + ";" ;
               /* Execute user subroutine: 'FIRMAANTERIORC' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(5);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               AV61AlbComFdD = GXutil.trim( AV110Texto) ;
               AV61AlbComFdD += "FirmaLast=" + GXutil.trim( AV92FirmaLast) ;
               A10015AlbComFdD = GXutil.substring( GXutil.trim( AV61AlbComFdD), 1, 200) ;
               if ( AV102Opcion == 1 )
               {
                  A10013AlbComFs = A4829AlbComHor ;
               }
               System.out.println( AV110Texto );
               /* Using cursor P08AM8 */
               pr_default.execute(6, new Object[] {A10013AlbComFs, A10015AlbComFdD, A396EmprCod, Integer.valueOf(A14AlbComCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALCOM");
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(5);
            /* Execute user subroutine: 'APLCAR USO DE RSA.EXE' */
            S131 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Optimized UPDATE. */
            /* Using cursor P08AM9 */
            pr_default.execute(7, new Object[] {AV89Firma, A396EmprCod, Long.valueOf(AV81FacCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALCOM");
            /* End optimized UPDATE. */
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'FIRMAANTERIOR' Routine */
      returnInSub = false ;
      AV83FacFirma = "" ;
      AV92FirmaLast = "" ;
      /* Using cursor P08AM10 */
      pr_default.execute(8, new Object[] {A396EmprCod, AV82FacFch, AV63AlbProPri});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A39AlbProPri = P08AM10_A39AlbProPri[0] ;
         A34AlbProfch = P08AM10_A34AlbProfch[0] ;
         A10017AlbFmd = P08AM10_A10017AlbFmd[0] ;
         n10017AlbFmd = P08AM10_n10017AlbFmd[0] ;
         A30AlbProCod = P08AM10_A30AlbProCod[0] ;
         if ( A30AlbProCod != AV81FacCod )
         {
            AV83FacFirma = A10017AlbFmd ;
         }
         else
         {
            if ( ! (GXutil.strcmp("", AV83FacFirma)==0) )
            {
               AV110Texto += GXutil.trim( AV83FacFirma) ;
               AV92FirmaLast = AV83FacFirma ;
            }
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(8);
      }
      pr_default.close(8);
   }

   public void S121( )
   {
      /* 'FIRMAANTERIORC' Routine */
      returnInSub = false ;
      AV83FacFirma = "" ;
      AV92FirmaLast = "" ;
      /* Using cursor P08AM11 */
      pr_default.execute(9, new Object[] {A396EmprCod, AV82FacFch, AV63AlbProPri});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A22AlbComPri = P08AM11_A22AlbComPri[0] ;
         A17AlbComFch = P08AM11_A17AlbComFch[0] ;
         A10014AlbComFd = P08AM11_A10014AlbComFd[0] ;
         A14AlbComCod = P08AM11_A14AlbComCod[0] ;
         if ( A14AlbComCod != AV81FacCod )
         {
            AV83FacFirma = A10014AlbComFd ;
         }
         else
         {
            if ( ! (GXutil.strcmp("", AV83FacFirma)==0) )
            {
               AV110Texto += GXutil.trim( AV83FacFirma) ;
               AV92FirmaLast = AV83FacFirma ;
            }
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(9);
      }
      pr_default.close(9);
   }

   public void S131( )
   {
      /* 'APLCAR USO DE RSA.EXE' Routine */
      returnInSub = false ;
      GXt_char1 = AV107RutaCertificado ;
      GXv_char5[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PFX", ""), GXv_char5) ;
      pdelprbajustado.this.GXt_char1 = GXv_char5[0] ;
      AV107RutaCertificado = GXt_char1 ;
      GXt_char1 = AV73Clave ;
      GXv_char5[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PASPFX", ""), GXv_char5) ;
      pdelprbajustado.this.GXt_char1 = GXv_char5[0] ;
      AV73Clave = GXt_char1 ;
      AV107RutaCertificado = GXutil.trim( AV107RutaCertificado) ;
      AV73Clave = GXutil.trim( AV73Clave) ;
      AV80errorCode = AV75CryptoCert.load(AV107RutaCertificado, AV73Clave) ;
      if ( AV75CryptoCert.getErrCode() == 0 )
      {
         if ( AV75CryptoCert.hasPrivateKey() )
         {
            AV76CryptoSign.setAlgorithm( "SHA1 RSA" );
            AV76CryptoSign.setCertificate( AV75CryptoCert );
            AV76CryptoSign.setValidateCertificate( true );
            AV110Texto = GXutil.trim( AV110Texto) ;
            AV89Firma = AV76CryptoSign.sign(AV110Texto, false) ;
            if ( ! (0==AV76CryptoSign.getErrCode()) )
            {
               AV99MensajeProcesamiento = "(PFirma) No se ha generado la firma. Error: " + GXutil.str( AV76CryptoSign.getErrCode(), 10, 2) + " " + AV76CryptoSign.getErrDescription() ;
               AV101NoCont = (byte)(1) ;
               returnInSub = true;
               if (true) return;
            }
         }
         else
         {
            AV99MensajeProcesamiento = "(PFirma) Certificado no cuenta con Llave Privada. " + GXutil.str( AV75CryptoCert.getErrCode(), 10, 2) + " " + AV75CryptoCert.getErrDescription() ;
            AV101NoCont = (byte)(1) ;
            returnInSub = true;
            if (true) return;
         }
      }
      else
      {
         AV99MensajeProcesamiento = "(PFirma) Certificado " + AV107RutaCertificado + " no se pudo cargar. " + GXutil.str( AV75CryptoCert.getErrCode(), 10, 2) + " " + AV75CryptoCert.getErrDescription() ;
         AV101NoCont = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      AV89Firma = GXutil.trim( AV89Firma) ;
      AV99MensajeProcesamiento += GXutil.newLine( ) + " Firma Entregada " + GXutil.trim( AV89Firma) ;
      /* Execute user subroutine: 'VALIDAR RSA GENERADO' */
      S141 ();
      if (returnInSub) return;
   }

   public void S151( )
   {
      /* '&DATEAUX CON BASE EN &FECSYS' Routine */
      returnInSub = false ;
      AV77DateAux = GXutil.trim( GXutil.str( GXutil.year( AV88FecSys), 10, 0)) ;
      AV77DateAux += ((GXutil.month( AV88FecSys)<10) ? "-0" : "") + GXutil.trim( GXutil.str( GXutil.month( AV88FecSys), 10, 0)) ;
      AV77DateAux += ((GXutil.day( AV88FecSys)<10) ? "-0" : "") + GXutil.trim( GXutil.str( GXutil.day( AV88FecSys), 10, 0)) ;
   }

   public void S141( )
   {
      /* 'VALIDAR RSA GENERADO' Routine */
      returnInSub = false ;
      AV113esValido = AV76CryptoSign.verify(AV89Firma, AV110Texto, false) ;
      if ( ! AV113esValido )
      {
         AV99MensajeProcesamiento += GXutil.newLine( ) + " Encriptamiento INVALIDO" ;
         AV101NoCont = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      else
      {
         AV99MensajeProcesamiento += GXutil.newLine( ) + " Encriptamiento Validado" ;
         AV89Firma = AV60BASE64eNCODER.tobase64(AV89Firma) ;
         AV99MensajeProcesamiento += GXutil.newLine( ) + " Firma Encriptada Base64 " + GXutil.trim( AV89Firma) ;
         AV99MensajeProcesamiento += GXutil.newLine( ) + " Firma Decriptada FromBase64 " + AV60BASE64eNCODER.toplaintext(AV89Firma) ;
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdelprbajustado.this.A396EmprCod;
      this.aP1[0] = pdelprbajustado.this.AV81FacCod;
      this.aP2[0] = pdelprbajustado.this.AV82FacFch;
      this.aP3[0] = pdelprbajustado.this.AV84FacHor;
      this.aP4[0] = pdelprbajustado.this.AV109Tablas;
      this.aP5[0] = pdelprbajustado.this.AV102Opcion;
      this.aP6[0] = pdelprbajustado.this.AV101NoCont;
      this.aP7[0] = pdelprbajustado.this.AV99MensajeProcesamiento;
      this.aP8[0] = pdelprbajustado.this.AV89Firma;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdelprbajustado");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV99MensajeProcesamiento = "" ;
      AV89Firma = "" ;
      AV78ddmmaaaa = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      Gx_date = GXutil.nullDate() ;
      GXv_date4 = new java.util.Date[1] ;
      AV100Msg_dpkey = "" ;
      Gx_msg = "" ;
      scmdbuf = "" ;
      P08AM2_A1253EmprGuiRem = new String[] {""} ;
      P08AM2_A1243GuiRemCli = new int[1] ;
      P08AM2_A396EmprCod = new String[] {""} ;
      P08AM2_A30AlbProCod = new long[1] ;
      P08AM2_A39AlbProPri = new String[] {""} ;
      P08AM2_A1902CliValA = new String[] {""} ;
      P08AM2_n1902CliValA = new boolean[] {false} ;
      P08AM2_A10019AlbHhfm = new java.util.Date[] {GXutil.nullDate()} ;
      P08AM2_A3865AlbHorSal = new String[] {""} ;
      P08AM2_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P08AM2_A4023AlbFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P08AM2_A10020AlbGrossT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08AM2_A10018ALbFmdc = new String[] {""} ;
      A1253EmprGuiRem = "" ;
      A39AlbProPri = "" ;
      A1902CliValA = "" ;
      A10019AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      A3865AlbHorSal = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A4023AlbFecSal = GXutil.nullDate() ;
      A10020AlbGrossT = DecimalUtil.ZERO ;
      A10018ALbFmdc = "" ;
      AV63AlbProPri = "" ;
      AV74CliValA = "" ;
      AV93GrossTotal = DecimalUtil.ZERO ;
      P08AM3_A396EmprCod = new String[] {""} ;
      P08AM3_A30AlbProCod = new long[1] ;
      P08AM3_A130BarCodPar = new String[] {""} ;
      P08AM3_A132BarCodReo = new byte[1] ;
      P08AM3_A129BarCod = new int[1] ;
      P08AM3_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08AM3_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08AM3_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08AM3_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      P08AM4_A396EmprCod = new String[] {""} ;
      P08AM4_A30AlbProCod = new long[1] ;
      P08AM4_A129BarCod = new int[1] ;
      P08AM4_A132BarCodReo = new byte[1] ;
      P08AM4_A130BarCodPar = new String[] {""} ;
      P08AM4_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08AM4_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08AM4_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08AM4_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08AM4_A1240GuiFasLin = new short[1] ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      AV86FacTot = DecimalUtil.ZERO ;
      AV112VarAux = "" ;
      AV96Hhsys = "" ;
      AV88FecSys = GXutil.nullDate() ;
      AV110Texto = "" ;
      AV77DateAux = "" ;
      AV62ALbFmdc = "" ;
      AV92FirmaLast = "" ;
      P08AM7_A396EmprCod = new String[] {""} ;
      P08AM7_A14AlbComCod = new int[1] ;
      P08AM7_A22AlbComPri = new String[] {""} ;
      P08AM7_A10013AlbComFs = new java.util.Date[] {GXutil.nullDate()} ;
      P08AM7_A4829AlbComHor = new java.util.Date[] {GXutil.nullDate()} ;
      P08AM7_A10015AlbComFdD = new String[] {""} ;
      A22AlbComPri = "" ;
      A10013AlbComFs = GXutil.resetTime( GXutil.nullDate() );
      A4829AlbComHor = GXutil.resetTime( GXutil.nullDate() );
      A10015AlbComFdD = "" ;
      AV61AlbComFdD = "" ;
      AV83FacFirma = "" ;
      P08AM10_A396EmprCod = new String[] {""} ;
      P08AM10_A39AlbProPri = new String[] {""} ;
      P08AM10_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P08AM10_A10017AlbFmd = new String[] {""} ;
      P08AM10_n10017AlbFmd = new boolean[] {false} ;
      P08AM10_A30AlbProCod = new long[1] ;
      A10017AlbFmd = "" ;
      P08AM11_A396EmprCod = new String[] {""} ;
      P08AM11_A22AlbComPri = new String[] {""} ;
      P08AM11_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08AM11_A10014AlbComFd = new String[] {""} ;
      P08AM11_A14AlbComCod = new int[1] ;
      A17AlbComFch = GXutil.nullDate() ;
      A10014AlbComFd = "" ;
      AV107RutaCertificado = "" ;
      AV73Clave = "" ;
      GXt_char1 = "" ;
      GXv_char5 = new String[1] ;
      AV75CryptoCert = new com.genexus.cryptography.GXCertificate();
      AV76CryptoSign = new com.genexus.cryptography.GXSigning();
      AV60BASE64eNCODER = new com.securityapi.securityapicommons.SdtBase64Encoder(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdelprbajustado__default(),
         new Object[] {
             new Object[] {
            P08AM2_A1253EmprGuiRem, P08AM2_A1243GuiRemCli, P08AM2_A396EmprCod, P08AM2_A30AlbProCod, P08AM2_A39AlbProPri, P08AM2_A1902CliValA, P08AM2_n1902CliValA, P08AM2_A10019AlbHhfm, P08AM2_A3865AlbHorSal, P08AM2_A34AlbProfch,
            P08AM2_A4023AlbFecSal, P08AM2_A10020AlbGrossT, P08AM2_A10018ALbFmdc
            }
            , new Object[] {
            P08AM3_A396EmprCod, P08AM3_A30AlbProCod, P08AM3_A130BarCodPar, P08AM3_A132BarCodReo, P08AM3_A129BarCod, P08AM3_A1264BarPreMtr, P08AM3_A1263BarAlbMtrE, P08AM3_A1262BarPreKgm, P08AM3_A1261BarAlbKgmE
            }
            , new Object[] {
            P08AM4_A396EmprCod, P08AM4_A30AlbProCod, P08AM4_A129BarCod, P08AM4_A132BarCodReo, P08AM4_A130BarCodPar, P08AM4_A1276FasMtr, P08AM4_A1242GuiFasPMt, P08AM4_A1275FasKgm, P08AM4_A1241GuiFasPKg, P08AM4_A1240GuiFasLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P08AM7_A396EmprCod, P08AM7_A14AlbComCod, P08AM7_A22AlbComPri, P08AM7_A10013AlbComFs, P08AM7_A4829AlbComHor, P08AM7_A10015AlbComFdD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P08AM10_A396EmprCod, P08AM10_A39AlbProPri, P08AM10_A34AlbProfch, P08AM10_A10017AlbFmd, P08AM10_n10017AlbFmd, P08AM10_A30AlbProCod
            }
            , new Object[] {
            P08AM11_A396EmprCod, P08AM11_A22AlbComPri, P08AM11_A17AlbComFch, P08AM11_A10014AlbComFd, P08AM11_A14AlbComCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV109Tablas ;
   private byte AV102Opcion ;
   private byte AV101NoCont ;
   private byte A132BarCodReo ;
   private byte AV85FacTipFac ;
   private short A1240GuiFasLin ;
   private short Gx_err ;
   private int A1243GuiRemCli ;
   private int A129BarCod ;
   private int A14AlbComCod ;
   private long AV81FacCod ;
   private long A30AlbProCod ;
   private long AV80errorCode ;
   private java.math.BigDecimal A10020AlbGrossT ;
   private java.math.BigDecimal AV93GrossTotal ;
   private java.math.BigDecimal A1264BarPreMtr ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal AV86FacTot ;
   private String A396EmprCod ;
   private String AV89Firma ;
   private String AV78ddmmaaaa ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String AV100Msg_dpkey ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A1253EmprGuiRem ;
   private String A39AlbProPri ;
   private String A1902CliValA ;
   private String A3865AlbHorSal ;
   private String A10018ALbFmdc ;
   private String AV63AlbProPri ;
   private String AV74CliValA ;
   private String A130BarCodPar ;
   private String AV112VarAux ;
   private String AV96Hhsys ;
   private String AV77DateAux ;
   private String AV62ALbFmdc ;
   private String AV92FirmaLast ;
   private String A22AlbComPri ;
   private String A10015AlbComFdD ;
   private String AV61AlbComFdD ;
   private String AV83FacFirma ;
   private String A10014AlbComFd ;
   private String GXt_char1 ;
   private String GXv_char5[] ;
   private java.util.Date AV84FacHor ;
   private java.util.Date A10019AlbHhfm ;
   private java.util.Date A10013AlbComFs ;
   private java.util.Date A4829AlbComHor ;
   private java.util.Date AV82FacFch ;
   private java.util.Date Gx_date ;
   private java.util.Date GXv_date4[] ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date A4023AlbFecSal ;
   private java.util.Date AV88FecSys ;
   private java.util.Date A17AlbComFch ;
   private boolean returnInSub ;
   private boolean n1902CliValA ;
   private boolean n10017AlbFmd ;
   private boolean AV113esValido ;
   private String AV99MensajeProcesamiento ;
   private String AV110Texto ;
   private String A10017AlbFmd ;
   private String AV107RutaCertificado ;
   private String AV73Clave ;
   private com.genexus.cryptography.GXCertificate AV75CryptoCert ;
   private com.genexus.cryptography.GXSigning AV76CryptoSign ;
   private com.securityapi.securityapicommons.SdtBase64Encoder AV60BASE64eNCODER ;
   private String[] aP8 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private java.util.Date[] aP2 ;
   private java.util.Date[] aP3 ;
   private byte[] aP4 ;
   private byte[] aP5 ;
   private byte[] aP6 ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P08AM2_A1253EmprGuiRem ;
   private int[] P08AM2_A1243GuiRemCli ;
   private String[] P08AM2_A396EmprCod ;
   private long[] P08AM2_A30AlbProCod ;
   private String[] P08AM2_A39AlbProPri ;
   private String[] P08AM2_A1902CliValA ;
   private boolean[] P08AM2_n1902CliValA ;
   private java.util.Date[] P08AM2_A10019AlbHhfm ;
   private String[] P08AM2_A3865AlbHorSal ;
   private java.util.Date[] P08AM2_A34AlbProfch ;
   private java.util.Date[] P08AM2_A4023AlbFecSal ;
   private java.math.BigDecimal[] P08AM2_A10020AlbGrossT ;
   private String[] P08AM2_A10018ALbFmdc ;
   private String[] P08AM3_A396EmprCod ;
   private long[] P08AM3_A30AlbProCod ;
   private String[] P08AM3_A130BarCodPar ;
   private byte[] P08AM3_A132BarCodReo ;
   private int[] P08AM3_A129BarCod ;
   private java.math.BigDecimal[] P08AM3_A1264BarPreMtr ;
   private java.math.BigDecimal[] P08AM3_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P08AM3_A1262BarPreKgm ;
   private java.math.BigDecimal[] P08AM3_A1261BarAlbKgmE ;
   private String[] P08AM4_A396EmprCod ;
   private long[] P08AM4_A30AlbProCod ;
   private int[] P08AM4_A129BarCod ;
   private byte[] P08AM4_A132BarCodReo ;
   private String[] P08AM4_A130BarCodPar ;
   private java.math.BigDecimal[] P08AM4_A1276FasMtr ;
   private java.math.BigDecimal[] P08AM4_A1242GuiFasPMt ;
   private java.math.BigDecimal[] P08AM4_A1275FasKgm ;
   private java.math.BigDecimal[] P08AM4_A1241GuiFasPKg ;
   private short[] P08AM4_A1240GuiFasLin ;
   private String[] P08AM7_A396EmprCod ;
   private int[] P08AM7_A14AlbComCod ;
   private String[] P08AM7_A22AlbComPri ;
   private java.util.Date[] P08AM7_A10013AlbComFs ;
   private java.util.Date[] P08AM7_A4829AlbComHor ;
   private String[] P08AM7_A10015AlbComFdD ;
   private String[] P08AM10_A396EmprCod ;
   private String[] P08AM10_A39AlbProPri ;
   private java.util.Date[] P08AM10_A34AlbProfch ;
   private String[] P08AM10_A10017AlbFmd ;
   private boolean[] P08AM10_n10017AlbFmd ;
   private long[] P08AM10_A30AlbProCod ;
   private String[] P08AM11_A396EmprCod ;
   private String[] P08AM11_A22AlbComPri ;
   private java.util.Date[] P08AM11_A17AlbComFch ;
   private String[] P08AM11_A10014AlbComFd ;
   private int[] P08AM11_A14AlbComCod ;
}

final  class pdelprbajustado__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08AM2", "SELECT T1.EmprGuiRem AS EmprGuiRem, T1.GuiRemCli AS GuiRemCli, T1.EmprCod, T1.AlbProCod, T1.AlbProPri, T2.CliValA, T1.AlbHhfm, T1.AlbHorSal, T1.AlbProfch, T1.AlbFecSal, T1.AlbGrossT, T1.ALbFmdc FROM (TXPCALPRD T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P08AM3", "SELECT EmprCod, AlbProCod, BarCodPar, BarCodReo, BarCod, BarPreMtr, BarAlbMtrE, BarPreKgm, BarAlbKgmE FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08AM4", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, FasMtr, GuiFasPMt, FasKgm, GuiFasPKg, GuiFasLin FROM TXPALBFAS WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P08AM5", "UPDATE TXPCALPRD SET AlbHhfm=?, AlbGrossT=?, ALbFmdc=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
         ,new UpdateCursor("P08AM6", "UPDATE TXPCALPRD SET AlbFmd=RTRIM(LTRIM(?))  WHERE EmprCod = ? and AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
         ,new ForEachCursor("P08AM7", "SELECT EmprCod, AlbComCod, AlbComPri, AlbComFs, AlbComHor, AlbComFdD FROM TXPCALCOM WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P08AM8", "UPDATE TXPCALCOM SET AlbComFs=?, AlbComFdD=?  WHERE EmprCod = ? AND AlbComCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALCOM")
         ,new UpdateCursor("P08AM9", "UPDATE TXPCALCOM SET AlbComFd=RTRIM(LTRIM(?))  WHERE EmprCod = ? and AlbComCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALCOM")
         ,new ForEachCursor("P08AM10", "SELECT EmprCod, AlbProPri, AlbProfch, AlbFmd, AlbProCod FROM TXPCALPRD WHERE (EmprCod = ?) AND (AlbProfch >= ?) AND (AlbProPri = ?) ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08AM11", "SELECT EmprCod, AlbComPri, AlbComFch, AlbComFd, AlbComCod FROM TXPCALCOM WHERE (EmprCod = ?) AND (AlbComFch >= ?) AND (AlbComPri = ?) ORDER BY EmprCod, AlbComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[12])[0] = rslt.getString(12, 255);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 200);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((long[]) buf[5])[0] = rslt.getLong(5);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 200);
               ((int[]) buf[4])[0] = rslt.getInt(5);
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 3 :
               stmt.setDateTime(1, (java.util.Date)parms[0], false);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 255);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 200);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 6 :
               stmt.setDateTime(1, (java.util.Date)parms[0], false);
               stmt.setString(2, (String)parms[1], 200);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 200);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 1);
               return;
      }
   }

}

