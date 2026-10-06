package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class patws01 extends GXReport
{
   public patws01( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( patws01.class ), "" );
   }

   public patws01( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           int[] aP2 ,
                           byte[] aP3 )
   {
      patws01.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             byte[] aP4 )
   {
      patws01.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      patws01.this.AV27Path1 = aP1[0];
      this.aP1 = aP1;
      patws01.this.AV31Alb = aP2[0];
      this.aP2 = aP2;
      patws01.this.AV28OkAT = aP3[0];
      this.aP3 = aP3;
      patws01.this.AV25ErrM = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 6 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      try
      {
         Gx_out = "SCR" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 2, 9, 11909, 16834, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("LECTURA FICHERO RESPUESTA GC") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         AV25ErrM = (byte)(0) ;
         GXt_char1 = AV32station ;
         GXv_char2[0] = GXt_char1 ;
         new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
         patws01.this.GXt_char1 = GXv_char2[0] ;
         AV32station = GXt_char1 ;
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = AV34emprnom ;
         GXv_char4[0] = AV33usurcod ;
         new app.pbusemp(remoteHandle, context).execute( AV32station, GXv_char2, GXv_char3, GXv_char4) ;
         patws01.this.A396EmprCod = GXv_char2[0] ;
         patws01.this.AV34emprnom = GXv_char3[0] ;
         patws01.this.AV33usurcod = GXv_char4[0] ;
         h42G0( false, 54) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Document Number", ""), 14, Gx_line+14, 123, Gx_line+28, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Guia Nº", ""), 203, Gx_line+14, 250, Gx_line+28, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "ErrorMessage", ""), 14, Gx_line+0, 95, Gx_line+14, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(14, Gx_line+27, 1071, Gx_line+27, 1, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "https://servicos.portaldasfinancas.gov.pt/sgdtpf/fileProcessingResult", ""), 650, Gx_line+0, 1065, Gx_line+14, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+54) ;
         AV19readfile.open(AV27Path1);
         if ( AV19readfile.getErrCode() > 0 )
         {
            Gx_msg = httpContext.getMessage( "Error Open Fichero XML -> ", "") + GXutil.trim( AV27Path1) + GXutil.chr( (short)(13)) ;
            Gx_msg += httpContext.getMessage( "ErrCode= ", "") + GXutil.str( AV19readfile.getErrCode(), 4, 0) + " " + AV19readfile.getErrDescription() + GXutil.chr( (short)(13)) ;
            httpContext.GX_msglist.addItem(Gx_msg);
         }
         else
         {
            AV19readfile.readType((short)(1), httpContext.getMessage( "SOAP-ENV:Fault", ""));
            AV29success = AV19readfile.readType((short)(1), httpContext.getMessage( "faultcode", "")) ;
            if ( AV29success == 0 )
            {
               AV19readfile.close();
            }
            else
            {
               AV19readfile.close();
               AV19readfile.open(AV27Path1);
               AV19readfile.readType((short)(1), httpContext.getMessage( "SOAP-ENV:Fault", ""));
               AV19readfile.read();
               AV30Verr = 0 ;
               AV24ErrorMsg = " " ;
               while ( GXutil.strcmp(AV19readfile.getName(), httpContext.getMessage( "SOAP-ENV:Fault", "")) != 0 )
               {
                  if ( GXutil.strcmp(AV19readfile.getName(), httpContext.getMessage( "faultcode", "")) == 0 )
                  {
                     AV20DocumentNumber = AV19readfile.getValue() ;
                     AV30Verr = (int)(GXutil.lval( GXutil.substring( AV20DocumentNumber, 1, 6))) ;
                     AV25ErrM = (byte)(1) ;
                  }
                  if ( GXutil.strcmp(AV19readfile.getName(), httpContext.getMessage( "faultstring", "")) == 0 )
                  {
                     AV24ErrorMsg = AV19readfile.getValue() ;
                     AV25ErrM = (byte)(1) ;
                  }
                  AV19readfile.read();
               }
               if ( AV25ErrM == 1 )
               {
                  AV35inc_obs = httpContext.getMessage( "Incidencia AT, Documento= ", "") + GXutil.str( AV21Albprocod, 8, 0) + GXutil.newLine( ) + httpContext.getMessage( "faultcode=", "") + GXutil.str( AV30Verr, 6, 0) + " " + httpContext.getMessage( "faultstring=", "") + AV24ErrorMsg + GXutil.newLine( ) ;
                  new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV40Pgmname, AV33usurcod, AV32station, AV35inc_obs, AV21Albprocod, (byte)(0), "") ;
                  h42G0( false, 95) ;
                  getPrinter().GxAttris("Courier New", 9, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24ErrorMsg, "")), 68, Gx_line+0, 798, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30Verr), "ZZZZZ9")), 14, Gx_line+0, 59, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Errmsg2, "")), 68, Gx_line+54, 798, Gx_line+72, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+95) ;
               }
               AV19readfile.close();
            }
         }
         if ( AV25ErrM == 1 )
         {
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV28OkAT = (byte)(0) ;
         AV23ATDocCodeID = " " ;
         AV22LeoGuia = (byte)(0) ;
         AV19readfile.open(AV27Path1);
         if ( AV19readfile.getErrCode() > 0 )
         {
            Gx_msg = httpContext.getMessage( "Error Open Fichero XML -> ", "") + GXutil.trim( AV27Path1) + GXutil.chr( (short)(13)) ;
            Gx_msg += httpContext.getMessage( "ErrCode= ", "") + GXutil.str( AV19readfile.getErrCode(), 4, 0) + " " + AV19readfile.getErrDescription() + GXutil.chr( (short)(13)) ;
            httpContext.GX_msglist.addItem(Gx_msg);
         }
         else
         {
            AV25ErrM = (byte)(0) ;
            AV35inc_obs = " " ;
            AV28OkAT = (byte)(0) ;
            AV23ATDocCodeID = " " ;
            AV22LeoGuia = (byte)(0) ;
            AV19readfile.readType((short)(1), httpContext.getMessage( "S:Body", ""));
            AV29success = AV19readfile.readType((short)(1), httpContext.getMessage( "ReturnMessage", "")) ;
            if ( AV29success == 0 )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "No hay ReturnMessage ¡¡¡", ""));
               AV19readfile.close();
            }
            else
            {
               AV19readfile.close();
               AV19readfile.open(AV27Path1);
               AV19readfile.readType((short)(1), httpContext.getMessage( "S:Body", ""));
               AV19readfile.read();
               while ( GXutil.strcmp(AV19readfile.getName(), httpContext.getMessage( "S:Body", "")) != 0 )
               {
                  if ( GXutil.strcmp(AV19readfile.getName(), httpContext.getMessage( "ReturnCode", "")) == 0 )
                  {
                     AV20DocumentNumber = AV19readfile.getValue() ;
                     AV30Verr = (int)(GXutil.lval( GXutil.substring( AV20DocumentNumber, 1, 6))) ;
                     if ( ( AV30Verr == 0 ) || ( AV30Verr == -100 ) || ( AV30Verr == -3 ) )
                     {
                        AV28OkAT = (byte)(1) ;
                     }
                     else
                     {
                        AV25ErrM = (byte)(1) ;
                     }
                     AV35inc_obs = httpContext.getMessage( "ReturnCode=", "") + GXutil.str( AV30Verr, 6, 0) ;
                  }
                  if ( GXutil.strcmp(AV19readfile.getName(), httpContext.getMessage( "ReturnMessage", "")) == 0 )
                  {
                     AV24ErrorMsg = AV19readfile.getValue() ;
                     if ( ( GXutil.strcmp(AV24ErrorMsg, httpContext.getMessage( "OK", "")) == 0 ) || ( ( AV30Verr == -100 ) ) || ( ( AV30Verr == -3 ) ) )
                     {
                        AV28OkAT = (byte)(1) ;
                        AV25ErrM = (byte)(0) ;
                     }
                     else
                     {
                        AV25ErrM = (byte)(1) ;
                     }
                     AV35inc_obs += httpContext.getMessage( "ReturnMessage=", "") + AV24ErrorMsg ;
                  }
                  if ( GXutil.strcmp(AV19readfile.getName(), httpContext.getMessage( "DocumentNumber", "")) == 0 )
                  {
                     AV20DocumentNumber = AV19readfile.getValue() ;
                     AV21Albprocod = (int)(GXutil.lval( GXutil.substring( AV20DocumentNumber, 1, 8))) ;
                     AV22LeoGuia = (byte)(1) ;
                     AV35inc_obs += httpContext.getMessage( "Confirmacion AT. DocumentNumber= ", "") + GXutil.str( AV21Albprocod, 8, 0) + " " ;
                  }
                  if ( ( AV28OkAT == 1 ) && ( GXutil.strcmp(AV19readfile.getName(), httpContext.getMessage( "ATDocCodeID", "")) == 0 ) )
                  {
                     AV23ATDocCodeID = AV19readfile.getValue() ;
                     h42G0( false, 27) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23ATDocCodeID, "")), 14, Gx_line+0, 161, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV21Albprocod), "ZZZZZZZ9")), 203, Gx_line+0, 262, Gx_line+17, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+27) ;
                     /* Execute user subroutine: 'CALCOM' */
                     S111 ();
                     if ( returnInSub )
                     {
                        getPrinter().GxEndPage() ;
                        /* Close printer file */
                        getPrinter().GxEndDocument() ;
                        endPrinter();
                        returnInSub = true;
                        cleanup();
                        if (true) return;
                     }
                     AV22LeoGuia = (byte)(0) ;
                     AV35inc_obs += httpContext.getMessage( "ATDocCodeID= ", "") + AV23ATDocCodeID ;
                  }
                  AV19readfile.read();
               }
               AV19readfile.close();
               if ( ( AV28OkAT == 1 ) && ( AV30Verr == -100 ) )
               {
                  AV36Errmsg2 = httpContext.getMessage( "Erro=-100. O sistema não devolve o código AT", "") ;
                  AV35inc_obs = httpContext.getMessage( "Incidencia AT, Documento= ", "") + GXutil.str( AV31Alb, 8, 0) + GXutil.newLine( ) + httpContext.getMessage( "Erro=-100. O sistema não devolve o código AT", "") + GXutil.newLine( ) + httpContext.getMessage( "ReturnCode=", "") + GXutil.str( AV30Verr, 6, 0) + " " + httpContext.getMessage( "ReturnMessage=", "") + AV24ErrorMsg + GXutil.newLine( ) ;
                  new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV40Pgmname, AV33usurcod, AV32station, AV35inc_obs, AV31Alb, (byte)(0), "") ;
                  /* Execute user subroutine: 'CALCOM2' */
                  S121 ();
                  if ( returnInSub )
                  {
                     getPrinter().GxEndPage() ;
                     /* Close printer file */
                     getPrinter().GxEndDocument() ;
                     endPrinter();
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  h42G0( false, 95) ;
                  getPrinter().GxAttris("Courier New", 9, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24ErrorMsg, "")), 68, Gx_line+0, 798, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30Verr), "ZZZZZ9")), 14, Gx_line+0, 59, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Errmsg2, "")), 68, Gx_line+54, 798, Gx_line+72, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+95) ;
               }
               if ( ( AV28OkAT == 1 ) && ( AV30Verr == -3 ) )
               {
                  AV36Errmsg2 = httpContext.getMessage( "Erro=-3. O sistema não devolve o código AT", "") ;
                  AV35inc_obs = httpContext.getMessage( "Incidencia AT, Documento= ", "") + GXutil.str( AV31Alb, 8, 0) + GXutil.newLine( ) + httpContext.getMessage( "Erro=-3. O sistema não devolve o código AT", "") + GXutil.newLine( ) + httpContext.getMessage( "ReturnCode=", "") + GXutil.str( AV30Verr, 6, 0) + " " + httpContext.getMessage( "ReturnMessage=", "") + AV24ErrorMsg + GXutil.newLine( ) ;
                  new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV40Pgmname, AV33usurcod, AV32station, AV35inc_obs, AV31Alb, (byte)(0), "") ;
                  /* Execute user subroutine: 'CALCOM2' */
                  S121 ();
                  if ( returnInSub )
                  {
                     getPrinter().GxEndPage() ;
                     /* Close printer file */
                     getPrinter().GxEndDocument() ;
                     endPrinter();
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  h42G0( false, 95) ;
                  getPrinter().GxAttris("Courier New", 9, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24ErrorMsg, "")), 68, Gx_line+0, 798, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30Verr), "ZZZZZ9")), 14, Gx_line+0, 59, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Errmsg2, "")), 68, Gx_line+54, 798, Gx_line+72, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+95) ;
               }
               if ( AV25ErrM == 1 )
               {
                  AV35inc_obs = httpContext.getMessage( "Incidencia AT, Documento= ", "") + GXutil.str( AV31Alb, 8, 0) + GXutil.newLine( ) + httpContext.getMessage( "faultcode=", "") + GXutil.str( AV30Verr, 6, 0) + " " + httpContext.getMessage( "faultstring=", "") + AV24ErrorMsg + GXutil.newLine( ) ;
                  new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV40Pgmname, AV33usurcod, AV32station, AV35inc_obs, AV31Alb, (byte)(0), "") ;
                  h42G0( false, 95) ;
                  getPrinter().GxAttris("Courier New", 9, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24ErrorMsg, "")), 68, Gx_line+0, 798, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30Verr), "ZZZZZ9")), 14, Gx_line+0, 59, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Errmsg2, "")), 68, Gx_line+54, 798, Gx_line+72, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+95) ;
               }
            }
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h42G0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void S111( ) throws ProcessInterruptedException
   {
      /* 'CALCOM' Routine */
      returnInSub = false ;
      Gx_msg = httpContext.getMessage( "O documento Nº= ", "") + GXutil.str( AV31Alb, 8, 0) + GXutil.chr( (short)(13)) ;
      Gx_msg += httpContext.getMessage( "foi atualizado com o código AT= ", "") + AV23ATDocCodeID + GXutil.chr( (short)(13)) ;
      httpContext.GX_msglist.addItem(Gx_msg);
      /* Using cursor P042G2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV31Alb)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14AlbComCod = P042G2_A14AlbComCod[0] ;
         A10739AlbComEAT = P042G2_A10739AlbComEAT[0] ;
         A10740AlbComID = P042G2_A10740AlbComID[0] ;
         A10764AlbComAT = P042G2_A10764AlbComAT[0] ;
         A10739AlbComEAT = (byte)(3) ;
         A10740AlbComID = AV23ATDocCodeID ;
         A10764AlbComAT = httpContext.getMessage( "A", "") ;
         /* Using cursor P042G3 */
         pr_default.execute(1, new Object[] {Byte.valueOf(A10739AlbComEAT), A10740AlbComID, A10764AlbComAT, A396EmprCod, Integer.valueOf(A14AlbComCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALCOM");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV40Pgmname, AV33usurcod, AV32station, AV35inc_obs, AV31Alb, (byte)(0), "") ;
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'CALCOM2' Routine */
      returnInSub = false ;
      /* Using cursor P042G4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV31Alb)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A14AlbComCod = P042G4_A14AlbComCod[0] ;
         A10739AlbComEAT = P042G4_A10739AlbComEAT[0] ;
         A10740AlbComID = P042G4_A10740AlbComID[0] ;
         A10764AlbComAT = P042G4_A10764AlbComAT[0] ;
         A10739AlbComEAT = (byte)(3) ;
         A10740AlbComID = " " ;
         A10764AlbComAT = httpContext.getMessage( "A", "") ;
         /* Using cursor P042G5 */
         pr_default.execute(3, new Object[] {Byte.valueOf(A10739AlbComEAT), A10740AlbComID, A10764AlbComAT, A396EmprCod, Integer.valueOf(A14AlbComCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALCOM");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV40Pgmname, AV33usurcod, AV32station, AV35inc_obs, AV31Alb, (byte)(0), "") ;
   }

   public void h42G0( boolean bFoot ,
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

   protected void cleanup( )
   {
      this.aP0[0] = patws01.this.A396EmprCod;
      this.aP1[0] = patws01.this.AV27Path1;
      this.aP2[0] = patws01.this.AV31Alb;
      this.aP3[0] = patws01.this.AV28OkAT;
      this.aP4[0] = patws01.this.AV25ErrM;
      Application.commitDataStores(context, remoteHandle, pr_default, "patws01");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV32station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV34emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV33usurcod = "" ;
      GXv_char4 = new String[1] ;
      AV19readfile = new com.genexus.xml.XMLReader();
      Gx_msg = "" ;
      AV24ErrorMsg = "" ;
      AV20DocumentNumber = "" ;
      AV35inc_obs = "" ;
      AV40Pgmname = "" ;
      AV36Errmsg2 = "" ;
      AV23ATDocCodeID = "" ;
      scmdbuf = "" ;
      P042G2_A396EmprCod = new String[] {""} ;
      P042G2_A14AlbComCod = new int[1] ;
      P042G2_A10739AlbComEAT = new byte[1] ;
      P042G2_A10740AlbComID = new String[] {""} ;
      P042G2_A10764AlbComAT = new String[] {""} ;
      A10740AlbComID = "" ;
      A10764AlbComAT = "" ;
      P042G4_A396EmprCod = new String[] {""} ;
      P042G4_A14AlbComCod = new int[1] ;
      P042G4_A10739AlbComEAT = new byte[1] ;
      P042G4_A10740AlbComID = new String[] {""} ;
      P042G4_A10764AlbComAT = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.patws01__default(),
         new Object[] {
             new Object[] {
            P042G2_A396EmprCod, P042G2_A14AlbComCod, P042G2_A10739AlbComEAT, P042G2_A10740AlbComID, P042G2_A10764AlbComAT
            }
            , new Object[] {
            }
            , new Object[] {
            P042G4_A396EmprCod, P042G4_A14AlbComCod, P042G4_A10739AlbComEAT, P042G4_A10740AlbComID, P042G4_A10764AlbComAT
            }
            , new Object[] {
            }
         }
      );
      AV40Pgmname = "PATWS01" ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV40Pgmname = "PATWS01" ;
      Gx_err = (short)(0) ;
   }

   private byte AV28OkAT ;
   private byte AV25ErrM ;
   private byte AV22LeoGuia ;
   private byte A10739AlbComEAT ;
   private short AV29success ;
   private short Gx_err ;
   private int AV31Alb ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV30Verr ;
   private int AV21Albprocod ;
   private int A14AlbComCod ;
   private String A396EmprCod ;
   private String AV27Path1 ;
   private String AV32station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV34emprnom ;
   private String GXv_char3[] ;
   private String AV33usurcod ;
   private String GXv_char4[] ;
   private String Gx_msg ;
   private String AV24ErrorMsg ;
   private String AV20DocumentNumber ;
   private String AV40Pgmname ;
   private String AV36Errmsg2 ;
   private String AV23ATDocCodeID ;
   private String scmdbuf ;
   private String A10740AlbComID ;
   private String A10764AlbComAT ;
   private boolean returnInSub ;
   private String AV35inc_obs ;
   private byte[] aP4 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P042G2_A396EmprCod ;
   private int[] P042G2_A14AlbComCod ;
   private byte[] P042G2_A10739AlbComEAT ;
   private String[] P042G2_A10740AlbComID ;
   private String[] P042G2_A10764AlbComAT ;
   private String[] P042G4_A396EmprCod ;
   private int[] P042G4_A14AlbComCod ;
   private byte[] P042G4_A10739AlbComEAT ;
   private String[] P042G4_A10740AlbComID ;
   private String[] P042G4_A10764AlbComAT ;
   private com.genexus.xml.XMLReader AV19readfile ;
}

final  class patws01__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P042G2", "SELECT EmprCod, AlbComCod, AlbComEAT, AlbComID, AlbComAT FROM TXPCALCOM WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P042G3", "UPDATE TXPCALCOM SET AlbComEAT=?, AlbComID=?, AlbComAT=?  WHERE EmprCod = ? AND AlbComCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALCOM")
         ,new ForEachCursor("P042G4", "SELECT EmprCod, AlbComCod, AlbComEAT, AlbComID, AlbComAT FROM TXPCALCOM WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P042G5", "UPDATE TXPCALCOM SET AlbComEAT=?, AlbComID=?, AlbComAT=?  WHERE EmprCod = ? AND AlbComCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALCOM")
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 20);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 20);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
      }
   }

}

