package app.albaranes ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdelprbori extends GXProcedure
{
   public pdelprbori( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdelprbori.class ), "" );
   }

   public pdelprbori( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           long[] aP1 ,
                           java.util.Date[] aP2 ,
                           java.util.Date[] aP3 ,
                           byte[] aP4 ,
                           byte[] aP5 )
   {
      pdelprbori.this.aP6 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        java.util.Date[] aP2 ,
                        java.util.Date[] aP3 ,
                        byte[] aP4 ,
                        byte[] aP5 ,
                        byte[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             java.util.Date[] aP2 ,
                             java.util.Date[] aP3 ,
                             byte[] aP4 ,
                             byte[] aP5 ,
                             byte[] aP6 )
   {
      pdelprbori.this.AV41EmprCod = aP0[0];
      this.aP0 = aP0;
      pdelprbori.this.AV15FacCod = aP1[0];
      this.aP1 = aP1;
      pdelprbori.this.AV16FacFch = aP2[0];
      this.aP2 = aP2;
      pdelprbori.this.AV17FacHor = aP3[0];
      this.aP3 = aP3;
      pdelprbori.this.AV32Tablas = aP4[0];
      this.aP4 = aP4;
      pdelprbori.this.AV33Opcion = aP5[0];
      this.aP5 = aP5;
      pdelprbori.this.AV36NoCont = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV38Path = httpContext.getMessage( "C:\\TEMP\\PrivateKey", "") ;
      GXt_int1 = AV31FirmaD ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV41EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int2) ;
      pdelprbori.this.GXt_int1 = GXv_int2[0] ;
      AV31FirmaD = GXt_int1 ;
      GXt_char3 = AV29ddmmaaaa ;
      GXv_char4[0] = GXt_char3 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV41EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_char4) ;
      pdelprbori.this.GXt_char3 = GXv_char4[0] ;
      AV29ddmmaaaa = GXt_char3 ;
      GXv_char4[0] = AV41EmprCod ;
      GXv_char5[0] = httpContext.getMessage( "DPKEY", "") ;
      GXv_date6[0] = Gx_date ;
      GXv_char7[0] = AV37Msg_dpkey ;
      new app.pregpar(remoteHandle, context).execute( GXv_char4, GXv_char5, GXv_date6, GXv_char7) ;
      pdelprbori.this.AV41EmprCod = GXv_char4[0] ;
      pdelprbori.this.Gx_date = GXv_date6[0] ;
      pdelprbori.this.AV37Msg_dpkey = GXv_char7[0] ;
      if ( GXutil.strcmp(AV37Msg_dpkey, " ") != 0 )
      {
         AV31FirmaD = (byte)(0) ;
         AV36NoCont = (byte)(1) ;
      }
      if ( ( AV31FirmaD == 0 ) && ( AV36NoCont == 1 ) )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( GXutil.strcmp(AV29ddmmaaaa, " ") == 0 )
      {
         AV29ddmmaaaa = "02/04/12" ;
      }
      AV16FacFch = localUtil.ctod( AV29ddmmaaaa, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      Gx_msg = httpContext.getMessage( "&ddmmaaaa =", "") + AV29ddmmaaaa + httpContext.getMessage( "&FacFch =", "") + localUtil.dtoc( AV16FacFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
      if ( AV32Tablas == 1 )
      {
         AV55GXLvl30 = (byte)(0) ;
         /* Using cursor P09PD2 */
         pr_default.execute(0, new Object[] {AV41EmprCod, Long.valueOf(AV15FacCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A1253EmprGuiRem = P09PD2_A1253EmprGuiRem[0] ;
            A1243GuiRemCli = P09PD2_A1243GuiRemCli[0] ;
            A30AlbProCod = P09PD2_A30AlbProCod[0] ;
            A396EmprCod = P09PD2_A396EmprCod[0] ;
            A39AlbProPri = P09PD2_A39AlbProPri[0] ;
            A1902CliValA = P09PD2_A1902CliValA[0] ;
            n1902CliValA = P09PD2_n1902CliValA[0] ;
            A3865AlbHorSal = P09PD2_A3865AlbHorSal[0] ;
            A4023AlbFecSal = P09PD2_A4023AlbFecSal[0] ;
            A34AlbProfch = P09PD2_A34AlbProfch[0] ;
            A10019AlbHhfm = P09PD2_A10019AlbHhfm[0] ;
            A10020AlbGrossT = P09PD2_A10020AlbGrossT[0] ;
            A10018ALbFmdc = P09PD2_A10018ALbFmdc[0] ;
            A10017AlbFmd = P09PD2_A10017AlbFmd[0] ;
            n10017AlbFmd = P09PD2_n10017AlbFmd[0] ;
            A1902CliValA = P09PD2_A1902CliValA[0] ;
            n1902CliValA = P09PD2_n1902CliValA[0] ;
            AV55GXLvl30 = (byte)(1) ;
            AV28AlbProPri = A39AlbProPri ;
            AV34CliValA = A1902CliValA ;
            AV35GrossTotal = DecimalUtil.doubleToDec(0) ;
            if ( GXutil.strcmp(AV34CliValA, httpContext.getMessage( "S", "")) == 0 )
            {
               /* Using cursor P09PD3 */
               pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
               while ( (pr_default.getStatus(1) != 101) )
               {
                  A130BarCodPar = P09PD3_A130BarCodPar[0] ;
                  A132BarCodReo = P09PD3_A132BarCodReo[0] ;
                  A129BarCod = P09PD3_A129BarCod[0] ;
                  A1264BarPreMtr = P09PD3_A1264BarPreMtr[0] ;
                  A1263BarAlbMtrE = P09PD3_A1263BarAlbMtrE[0] ;
                  A1262BarPreKgm = P09PD3_A1262BarPreKgm[0] ;
                  A1261BarAlbKgmE = P09PD3_A1261BarAlbKgmE[0] ;
                  AV35GrossTotal = AV35GrossTotal.add((GXutil.roundDecimal( (A1261BarAlbKgmE.multiply(A1262BarPreKgm)).add((A1263BarAlbMtrE.multiply(A1264BarPreMtr))), 2))) ;
                  /* Using cursor P09PD4 */
                  pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  while ( (pr_default.getStatus(2) != 101) )
                  {
                     A1276FasMtr = P09PD4_A1276FasMtr[0] ;
                     A1242GuiFasPMt = P09PD4_A1242GuiFasPMt[0] ;
                     A1275FasKgm = P09PD4_A1275FasKgm[0] ;
                     A1241GuiFasPKg = P09PD4_A1241GuiFasPKg[0] ;
                     A1240GuiFasLin = P09PD4_A1240GuiFasLin[0] ;
                     AV35GrossTotal = AV35GrossTotal.add((GXutil.roundDecimal( (A1241GuiFasPKg.multiply(A1275FasKgm)).add((A1242GuiFasPMt.multiply(A1276FasMtr))), 2))) ;
                     pr_default.readNext(2);
                  }
                  pr_default.close(2);
                  pr_default.readNext(1);
               }
               pr_default.close(1);
            }
            AV23FacTot = AV35GrossTotal ;
            if ( AV33Opcion == 1 )
            {
               AV30VarAux = A3865AlbHorSal ;
               AV18Hhsys = A3865AlbHorSal ;
               if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A4023AlbFecSal)) )
               {
                  AV19FecSys = A34AlbProfch ;
               }
               else
               {
                  AV19FecSys = A4023AlbFecSal ;
               }
            }
            else
            {
               AV30VarAux = localUtil.ttoc( A10019AlbHhfm, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
               AV18Hhsys = GXutil.substring( AV30VarAux, 12, 8) ;
               AV19FecSys = localUtil.ctod( GXutil.substring( AV30VarAux, 1, 10), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            }
            AV20DateAux = GXutil.trim( GXutil.str( GXutil.year( AV19FecSys), 10, 0)) ;
            if ( GXutil.month( AV19FecSys) < 10 )
            {
               AV20DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.month( AV19FecSys), 10, 0)) ;
            }
            else
            {
               AV20DateAux += "-" + GXutil.trim( GXutil.str( GXutil.month( AV19FecSys), 10, 0)) ;
            }
            if ( GXutil.day( AV19FecSys) < 10 )
            {
               AV20DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.day( AV19FecSys), 10, 0)) ;
            }
            else
            {
               AV20DateAux += "-" + GXutil.trim( GXutil.str( GXutil.day( AV19FecSys), 10, 0)) ;
            }
            AV21Texto = AV20DateAux ;
            AV21Texto += ";" + AV20DateAux + httpContext.getMessage( "T", "") + AV18Hhsys ;
            if ( GXutil.strcmp(A39AlbProPri, "1") == 0 )
            {
               AV24FacTipFac = (byte)(1) ;
               AV21Texto += httpContext.getMessage( ";GR ", "") + GXutil.trim( GXutil.str( AV24FacTipFac, 1, 0)+"/"+GXutil.trim( GXutil.str( A30AlbProCod, 10, 0))) ;
            }
            else
            {
               AV24FacTipFac = (byte)(2) ;
               AV21Texto += httpContext.getMessage( ";GT ", "") + GXutil.trim( GXutil.str( AV24FacTipFac, 1, 0)+"/"+GXutil.trim( GXutil.str( A30AlbProCod, 10, 0))) ;
            }
            AV21Texto += ";" + GXutil.trim( GXutil.str( AV23FacTot, 13, 2)) + ";" ;
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
            A10020AlbGrossT = AV23FacTot ;
            A10018ALbFmdc = GXutil.trim( AV21Texto) ;
            A10018ALbFmdc += httpContext.getMessage( "FirmaLast=", "") + GXutil.trim( AV27FirmaLast) ;
            if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A4023AlbFecSal)) )
            {
               AV30VarAux = localUtil.dtoc( A34AlbProfch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + A3865AlbHorSal ;
            }
            else
            {
               AV30VarAux = localUtil.dtoc( A4023AlbFecSal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + A3865AlbHorSal ;
            }
            if ( AV33Opcion == 1 )
            {
               A10019AlbHhfm = localUtil.ctot( AV30VarAux, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            }
            if ( ! (GXutil.strcmp("", AV21Texto)==0) )
            {
               GXv_char7[0] = AV40Hash ;
               GXv_objcol_SdtMessages_Message8[0] = AV49Messages ;
               GXv_boolean9[0] = AV50OK ;
               new app.hash_obtener(remoteHandle, context).execute( AV21Texto, GXv_char7, GXv_objcol_SdtMessages_Message8, GXv_boolean9) ;
               pdelprbori.this.AV40Hash = GXv_char7[0] ;
               AV49Messages = GXv_objcol_SdtMessages_Message8[0] ;
               pdelprbori.this.AV50OK = GXv_boolean9[0] ;
               A10017AlbFmd = AV40Hash ;
               n10017AlbFmd = false ;
            }
            /* Using cursor P09PD5 */
            pr_default.execute(3, new Object[] {A10019AlbHhfm, A10020AlbGrossT, A10018ALbFmdc, Boolean.valueOf(n10017AlbFmd), A10017AlbFmd, A396EmprCod, Long.valueOf(A30AlbProCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( AV55GXLvl30 == 0 )
         {
            System.out.println( httpContext.getMessage( "For each 1 not found register", "") );
         }
      }
      else
      {
         AV58GXLvl127 = (byte)(0) ;
         /* Using cursor P09PD6 */
         pr_default.execute(4, new Object[] {Long.valueOf(AV15FacCod)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A14AlbComCod = P09PD6_A14AlbComCod[0] ;
            A22AlbComPri = P09PD6_A22AlbComPri[0] ;
            A4829AlbComHor = P09PD6_A4829AlbComHor[0] ;
            A10013AlbComFs = P09PD6_A10013AlbComFs[0] ;
            A10015AlbComFdD = P09PD6_A10015AlbComFdD[0] ;
            A396EmprCod = P09PD6_A396EmprCod[0] ;
            AV58GXLvl127 = (byte)(1) ;
            AV28AlbProPri = A22AlbComPri ;
            if ( AV33Opcion == 1 )
            {
               AV30VarAux = localUtil.ttoc( A4829AlbComHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            }
            else
            {
               AV30VarAux = localUtil.ttoc( A10013AlbComFs, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            }
            AV18Hhsys = GXutil.substring( AV30VarAux, 12, 8) ;
            AV19FecSys = localUtil.ctod( GXutil.substring( AV30VarAux, 1, 10), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV20DateAux = GXutil.trim( GXutil.str( GXutil.year( AV19FecSys), 10, 0)) ;
            if ( GXutil.month( AV19FecSys) < 10 )
            {
               AV20DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.month( AV19FecSys), 10, 0)) ;
            }
            else
            {
               AV20DateAux += "-" + GXutil.trim( GXutil.str( GXutil.month( AV19FecSys), 10, 0)) ;
            }
            if ( GXutil.day( AV19FecSys) < 10 )
            {
               AV20DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.day( AV19FecSys), 10, 0)) ;
            }
            else
            {
               AV20DateAux += "-" + GXutil.trim( GXutil.str( GXutil.day( AV19FecSys), 10, 0)) ;
            }
            AV21Texto = AV20DateAux ;
            AV21Texto += ";" + AV20DateAux + httpContext.getMessage( "T", "") + AV18Hhsys ;
            if ( GXutil.strcmp(A22AlbComPri, "1") == 0 )
            {
               AV24FacTipFac = (byte)(3) ;
               AV21Texto += httpContext.getMessage( ";GR ", "") + GXutil.str( AV24FacTipFac, 1, 0) + "/" + GXutil.trim( GXutil.str( A14AlbComCod, 10, 0)) ;
            }
            else
            {
               AV24FacTipFac = (byte)(4) ;
               AV21Texto += httpContext.getMessage( ";GT ", "") + GXutil.str( AV24FacTipFac, 1, 0) + "/" + GXutil.trim( GXutil.str( A14AlbComCod, 10, 0)) ;
            }
            AV23FacTot = DecimalUtil.doubleToDec(0) ;
            AV21Texto += ";" + GXutil.trim( GXutil.str( AV23FacTot, 13, 2)) + ";" ;
            /* Execute user subroutine: 'FIRMAANTERIORC' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(4);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            A10015AlbComFdD = AV21Texto ;
            A10015AlbComFdD += httpContext.getMessage( "FirmaLast=", "") + GXutil.trim( AV27FirmaLast) ;
            if ( AV33Opcion == 1 )
            {
               A10013AlbComFs = A4829AlbComHor ;
            }
            /* Using cursor P09PD7 */
            pr_default.execute(5, new Object[] {A10013AlbComFs, A10015AlbComFdD, A396EmprCod, Integer.valueOf(A14AlbComCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALCOM");
            pr_default.readNext(4);
         }
         pr_default.close(4);
         if ( AV58GXLvl127 == 0 )
         {
            System.out.println( httpContext.getMessage( "No entró al Foreach", "") );
         }
         GXv_char7[0] = AV40Hash ;
         GXv_objcol_SdtMessages_Message8[0] = AV49Messages ;
         GXv_boolean9[0] = AV50OK ;
         new app.hash_obtener(remoteHandle, context).execute( AV21Texto, GXv_char7, GXv_objcol_SdtMessages_Message8, GXv_boolean9) ;
         pdelprbori.this.AV40Hash = GXv_char7[0] ;
         AV49Messages = GXv_objcol_SdtMessages_Message8[0] ;
         pdelprbori.this.AV50OK = GXv_boolean9[0] ;
         /* Optimized UPDATE. */
         /* Using cursor P09PD8 */
         String AV40Hash10014Aux;
         AV40Hash10014Aux = AV40Hash ;
         pr_default.execute(6, new Object[] {AV40Hash10014Aux, Long.valueOf(AV15FacCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALCOM");
         /* End optimized UPDATE. */
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'FIRMAANTERIOR' Routine */
      returnInSub = false ;
      AV26FacFirma = "" ;
      AV27FirmaLast = "" ;
      /* Using cursor P09PD9 */
      pr_default.execute(7, new Object[] {AV16FacFch, AV28AlbProPri});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A39AlbProPri = P09PD9_A39AlbProPri[0] ;
         A34AlbProfch = P09PD9_A34AlbProfch[0] ;
         A10017AlbFmd = P09PD9_A10017AlbFmd[0] ;
         n10017AlbFmd = P09PD9_n10017AlbFmd[0] ;
         A30AlbProCod = P09PD9_A30AlbProCod[0] ;
         A396EmprCod = P09PD9_A396EmprCod[0] ;
         if ( A30AlbProCod != AV15FacCod )
         {
            AV26FacFirma = A10017AlbFmd ;
         }
         else
         {
            if ( ! (GXutil.strcmp("", AV26FacFirma)==0) )
            {
               AV21Texto += GXutil.trim( AV26FacFirma) ;
               AV27FirmaLast = AV26FacFirma ;
            }
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   public void S121( )
   {
      /* 'FIRMAANTERIORC' Routine */
      returnInSub = false ;
      AV26FacFirma = "" ;
      AV27FirmaLast = "" ;
      /* Using cursor P09PD10 */
      pr_default.execute(8, new Object[] {AV16FacFch, AV28AlbProPri});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A22AlbComPri = P09PD10_A22AlbComPri[0] ;
         A17AlbComFch = P09PD10_A17AlbComFch[0] ;
         A10014AlbComFd = P09PD10_A10014AlbComFd[0] ;
         A14AlbComCod = P09PD10_A14AlbComCod[0] ;
         A396EmprCod = P09PD10_A396EmprCod[0] ;
         if ( A14AlbComCod != AV15FacCod )
         {
            AV26FacFirma = A10014AlbComFd ;
         }
         else
         {
            if ( ! (GXutil.strcmp("", AV26FacFirma)==0) )
            {
               AV21Texto += GXutil.trim( AV26FacFirma) ;
               AV27FirmaLast = AV26FacFirma ;
            }
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(8);
      }
      pr_default.close(8);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdelprbori.this.AV41EmprCod;
      this.aP1[0] = pdelprbori.this.AV15FacCod;
      this.aP2[0] = pdelprbori.this.AV16FacFch;
      this.aP3[0] = pdelprbori.this.AV17FacHor;
      this.aP4[0] = pdelprbori.this.AV32Tablas;
      this.aP5[0] = pdelprbori.this.AV33Opcion;
      this.aP6[0] = pdelprbori.this.AV36NoCont;
      Application.commitDataStores(context, remoteHandle, pr_default, "albaranes.pdelprbori");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV38Path = "" ;
      GXv_int2 = new byte[1] ;
      AV29ddmmaaaa = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      Gx_date = GXutil.nullDate() ;
      GXv_date6 = new java.util.Date[1] ;
      AV37Msg_dpkey = "" ;
      Gx_msg = "" ;
      scmdbuf = "" ;
      P09PD2_A1253EmprGuiRem = new String[] {""} ;
      P09PD2_A1243GuiRemCli = new int[1] ;
      P09PD2_A30AlbProCod = new long[1] ;
      P09PD2_A396EmprCod = new String[] {""} ;
      P09PD2_A39AlbProPri = new String[] {""} ;
      P09PD2_A1902CliValA = new String[] {""} ;
      P09PD2_n1902CliValA = new boolean[] {false} ;
      P09PD2_A3865AlbHorSal = new String[] {""} ;
      P09PD2_A4023AlbFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P09PD2_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P09PD2_A10019AlbHhfm = new java.util.Date[] {GXutil.nullDate()} ;
      P09PD2_A10020AlbGrossT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09PD2_A10018ALbFmdc = new String[] {""} ;
      P09PD2_A10017AlbFmd = new String[] {""} ;
      P09PD2_n10017AlbFmd = new boolean[] {false} ;
      A1253EmprGuiRem = "" ;
      A396EmprCod = "" ;
      A39AlbProPri = "" ;
      A1902CliValA = "" ;
      A3865AlbHorSal = "" ;
      A4023AlbFecSal = GXutil.nullDate() ;
      A34AlbProfch = GXutil.nullDate() ;
      A10019AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      A10020AlbGrossT = DecimalUtil.ZERO ;
      A10018ALbFmdc = "" ;
      A10017AlbFmd = "" ;
      AV28AlbProPri = "" ;
      AV34CliValA = "" ;
      AV35GrossTotal = DecimalUtil.ZERO ;
      P09PD3_A396EmprCod = new String[] {""} ;
      P09PD3_A30AlbProCod = new long[1] ;
      P09PD3_A130BarCodPar = new String[] {""} ;
      P09PD3_A132BarCodReo = new byte[1] ;
      P09PD3_A129BarCod = new int[1] ;
      P09PD3_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09PD3_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09PD3_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09PD3_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      P09PD4_A396EmprCod = new String[] {""} ;
      P09PD4_A30AlbProCod = new long[1] ;
      P09PD4_A129BarCod = new int[1] ;
      P09PD4_A132BarCodReo = new byte[1] ;
      P09PD4_A130BarCodPar = new String[] {""} ;
      P09PD4_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09PD4_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09PD4_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09PD4_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09PD4_A1240GuiFasLin = new short[1] ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      AV23FacTot = DecimalUtil.ZERO ;
      AV30VarAux = "" ;
      AV18Hhsys = "" ;
      AV19FecSys = GXutil.nullDate() ;
      AV20DateAux = "" ;
      AV21Texto = "" ;
      AV27FirmaLast = "" ;
      AV40Hash = "" ;
      AV49Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      P09PD6_A14AlbComCod = new int[1] ;
      P09PD6_A22AlbComPri = new String[] {""} ;
      P09PD6_A4829AlbComHor = new java.util.Date[] {GXutil.nullDate()} ;
      P09PD6_A10013AlbComFs = new java.util.Date[] {GXutil.nullDate()} ;
      P09PD6_A10015AlbComFdD = new String[] {""} ;
      P09PD6_A396EmprCod = new String[] {""} ;
      A22AlbComPri = "" ;
      A4829AlbComHor = GXutil.resetTime( GXutil.nullDate() );
      A10013AlbComFs = GXutil.resetTime( GXutil.nullDate() );
      A10015AlbComFdD = "" ;
      GXv_char7 = new String[1] ;
      GXv_objcol_SdtMessages_Message8 = new GXBaseCollection[1] ;
      GXv_boolean9 = new boolean[1] ;
      A10014AlbComFd = "" ;
      AV26FacFirma = "" ;
      P09PD9_A39AlbProPri = new String[] {""} ;
      P09PD9_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P09PD9_A10017AlbFmd = new String[] {""} ;
      P09PD9_n10017AlbFmd = new boolean[] {false} ;
      P09PD9_A30AlbProCod = new long[1] ;
      P09PD9_A396EmprCod = new String[] {""} ;
      P09PD10_A22AlbComPri = new String[] {""} ;
      P09PD10_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P09PD10_A10014AlbComFd = new String[] {""} ;
      P09PD10_A14AlbComCod = new int[1] ;
      P09PD10_A396EmprCod = new String[] {""} ;
      A17AlbComFch = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.albaranes.pdelprbori__default(),
         new Object[] {
             new Object[] {
            P09PD2_A1253EmprGuiRem, P09PD2_A1243GuiRemCli, P09PD2_A30AlbProCod, P09PD2_A396EmprCod, P09PD2_A39AlbProPri, P09PD2_A1902CliValA, P09PD2_n1902CliValA, P09PD2_A3865AlbHorSal, P09PD2_A4023AlbFecSal, P09PD2_A34AlbProfch,
            P09PD2_A10019AlbHhfm, P09PD2_A10020AlbGrossT, P09PD2_A10018ALbFmdc, P09PD2_A10017AlbFmd, P09PD2_n10017AlbFmd
            }
            , new Object[] {
            P09PD3_A396EmprCod, P09PD3_A30AlbProCod, P09PD3_A130BarCodPar, P09PD3_A132BarCodReo, P09PD3_A129BarCod, P09PD3_A1264BarPreMtr, P09PD3_A1263BarAlbMtrE, P09PD3_A1262BarPreKgm, P09PD3_A1261BarAlbKgmE
            }
            , new Object[] {
            P09PD4_A396EmprCod, P09PD4_A30AlbProCod, P09PD4_A129BarCod, P09PD4_A132BarCodReo, P09PD4_A130BarCodPar, P09PD4_A1276FasMtr, P09PD4_A1242GuiFasPMt, P09PD4_A1275FasKgm, P09PD4_A1241GuiFasPKg, P09PD4_A1240GuiFasLin
            }
            , new Object[] {
            }
            , new Object[] {
            P09PD6_A14AlbComCod, P09PD6_A22AlbComPri, P09PD6_A4829AlbComHor, P09PD6_A10013AlbComFs, P09PD6_A10015AlbComFdD, P09PD6_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P09PD9_A39AlbProPri, P09PD9_A34AlbProfch, P09PD9_A10017AlbFmd, P09PD9_n10017AlbFmd, P09PD9_A30AlbProCod, P09PD9_A396EmprCod
            }
            , new Object[] {
            P09PD10_A22AlbComPri, P09PD10_A17AlbComFch, P09PD10_A10014AlbComFd, P09PD10_A14AlbComCod, P09PD10_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV32Tablas ;
   private byte AV33Opcion ;
   private byte AV36NoCont ;
   private byte AV31FirmaD ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV55GXLvl30 ;
   private byte A132BarCodReo ;
   private byte AV24FacTipFac ;
   private byte AV58GXLvl127 ;
   private short A1240GuiFasLin ;
   private short Gx_err ;
   private int A1243GuiRemCli ;
   private int A129BarCod ;
   private int A14AlbComCod ;
   private long AV15FacCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A10020AlbGrossT ;
   private java.math.BigDecimal AV35GrossTotal ;
   private java.math.BigDecimal A1264BarPreMtr ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal AV23FacTot ;
   private String AV41EmprCod ;
   private String AV29ddmmaaaa ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String AV37Msg_dpkey ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A1253EmprGuiRem ;
   private String A396EmprCod ;
   private String A39AlbProPri ;
   private String A1902CliValA ;
   private String A3865AlbHorSal ;
   private String A10018ALbFmdc ;
   private String AV28AlbProPri ;
   private String AV34CliValA ;
   private String A130BarCodPar ;
   private String AV30VarAux ;
   private String AV18Hhsys ;
   private String AV20DateAux ;
   private String A22AlbComPri ;
   private String A10015AlbComFdD ;
   private String GXv_char7[] ;
   private String A10014AlbComFd ;
   private String AV26FacFirma ;
   private java.util.Date AV17FacHor ;
   private java.util.Date A10019AlbHhfm ;
   private java.util.Date A4829AlbComHor ;
   private java.util.Date A10013AlbComFs ;
   private java.util.Date AV16FacFch ;
   private java.util.Date Gx_date ;
   private java.util.Date GXv_date6[] ;
   private java.util.Date A4023AlbFecSal ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date AV19FecSys ;
   private java.util.Date A17AlbComFch ;
   private boolean returnInSub ;
   private boolean n1902CliValA ;
   private boolean n10017AlbFmd ;
   private boolean AV50OK ;
   private boolean GXv_boolean9[] ;
   private String AV38Path ;
   private String A10017AlbFmd ;
   private String AV21Texto ;
   private String AV27FirmaLast ;
   private String AV40Hash ;
   private byte[] aP6 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private java.util.Date[] aP2 ;
   private java.util.Date[] aP3 ;
   private byte[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P09PD2_A1253EmprGuiRem ;
   private int[] P09PD2_A1243GuiRemCli ;
   private long[] P09PD2_A30AlbProCod ;
   private String[] P09PD2_A396EmprCod ;
   private String[] P09PD2_A39AlbProPri ;
   private String[] P09PD2_A1902CliValA ;
   private boolean[] P09PD2_n1902CliValA ;
   private String[] P09PD2_A3865AlbHorSal ;
   private java.util.Date[] P09PD2_A4023AlbFecSal ;
   private java.util.Date[] P09PD2_A34AlbProfch ;
   private java.util.Date[] P09PD2_A10019AlbHhfm ;
   private java.math.BigDecimal[] P09PD2_A10020AlbGrossT ;
   private String[] P09PD2_A10018ALbFmdc ;
   private String[] P09PD2_A10017AlbFmd ;
   private boolean[] P09PD2_n10017AlbFmd ;
   private String[] P09PD3_A396EmprCod ;
   private long[] P09PD3_A30AlbProCod ;
   private String[] P09PD3_A130BarCodPar ;
   private byte[] P09PD3_A132BarCodReo ;
   private int[] P09PD3_A129BarCod ;
   private java.math.BigDecimal[] P09PD3_A1264BarPreMtr ;
   private java.math.BigDecimal[] P09PD3_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P09PD3_A1262BarPreKgm ;
   private java.math.BigDecimal[] P09PD3_A1261BarAlbKgmE ;
   private String[] P09PD4_A396EmprCod ;
   private long[] P09PD4_A30AlbProCod ;
   private int[] P09PD4_A129BarCod ;
   private byte[] P09PD4_A132BarCodReo ;
   private String[] P09PD4_A130BarCodPar ;
   private java.math.BigDecimal[] P09PD4_A1276FasMtr ;
   private java.math.BigDecimal[] P09PD4_A1242GuiFasPMt ;
   private java.math.BigDecimal[] P09PD4_A1275FasKgm ;
   private java.math.BigDecimal[] P09PD4_A1241GuiFasPKg ;
   private short[] P09PD4_A1240GuiFasLin ;
   private int[] P09PD6_A14AlbComCod ;
   private String[] P09PD6_A22AlbComPri ;
   private java.util.Date[] P09PD6_A4829AlbComHor ;
   private java.util.Date[] P09PD6_A10013AlbComFs ;
   private String[] P09PD6_A10015AlbComFdD ;
   private String[] P09PD6_A396EmprCod ;
   private String[] P09PD9_A39AlbProPri ;
   private java.util.Date[] P09PD9_A34AlbProfch ;
   private String[] P09PD9_A10017AlbFmd ;
   private boolean[] P09PD9_n10017AlbFmd ;
   private long[] P09PD9_A30AlbProCod ;
   private String[] P09PD9_A396EmprCod ;
   private String[] P09PD10_A22AlbComPri ;
   private java.util.Date[] P09PD10_A17AlbComFch ;
   private String[] P09PD10_A10014AlbComFd ;
   private int[] P09PD10_A14AlbComCod ;
   private String[] P09PD10_A396EmprCod ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV49Messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message8[] ;
}

final  class pdelprbori__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09PD2", "SELECT T1.EmprGuiRem AS EmprGuiRem, T1.GuiRemCli AS GuiRemCli, T1.AlbProCod, T1.EmprCod, T1.AlbProPri, T2.CliValA, T1.AlbHorSal, T1.AlbFecSal, T1.AlbProfch, T1.AlbHhfm, T1.AlbGrossT, T1.ALbFmdc, T1.AlbFmd FROM (TXPCALPRD T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09PD3", "SELECT EmprCod, AlbProCod, BarCodPar, BarCodReo, BarCod, BarPreMtr, BarAlbMtrE, BarPreKgm, BarAlbKgmE FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09PD4", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, FasMtr, GuiFasPMt, FasKgm, GuiFasPKg, GuiFasLin FROM TXPALBFAS WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P09PD5", "UPDATE TXPCALPRD SET AlbHhfm=?, AlbGrossT=?, ALbFmdc=?, AlbFmd=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
         ,new ForEachCursor("P09PD6", "SELECT AlbComCod, AlbComPri, AlbComHor, AlbComFs, AlbComFdD, EmprCod FROM TXPCALCOM WHERE AlbComCod = ? ORDER BY EmprCod, AlbComCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P09PD7", "UPDATE TXPCALCOM SET AlbComFs=?, AlbComFdD=?  WHERE EmprCod = ? AND AlbComCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALCOM")
         ,new UpdateCursor("P09PD8", "UPDATE TXPCALCOM SET AlbComFd=?  WHERE AlbComCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALCOM")
         ,new ForEachCursor("P09PD9", "SELECT AlbProPri, AlbProfch, AlbFmd, AlbProCod, EmprCod FROM TXPCALPRD WHERE (AlbProfch >= ?) AND (AlbProPri = ?) ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09PD10", "SELECT AlbComPri, AlbComFch, AlbComFd, AlbComCod, EmprCod FROM TXPCALCOM WHERE (AlbComFch >= ?) AND (AlbComPri = ?) ORDER BY EmprCod, AlbComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(10);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[12])[0] = rslt.getString(12, 255);
               ((String[]) buf[13])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
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
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 200);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 200);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[4], 255);
               }
               stmt.setString(5, (String)parms[5], 3);
               stmt.setLong(6, ((Number) parms[6]).longValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 5 :
               stmt.setDateTime(1, (java.util.Date)parms[0], false);
               stmt.setString(2, (String)parms[1], 200);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 200);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 7 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setString(2, (String)parms[1], 1);
               return;
            case 8 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setString(2, (String)parms[1], 1);
               return;
      }
   }

}

