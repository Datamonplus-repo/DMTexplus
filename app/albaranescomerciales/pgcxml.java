package app.albaranescomerciales ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pgcxml extends GXProcedure
{
   public pgcxml( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pgcxml.class ), "" );
   }

   public pgcxml( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( String[] aP0 ,
                              int[] aP1 ,
                              String[] aP2 ,
                              String[] aP3 ,
                              GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 )
   {
      pgcxml.this.aP5 = new boolean[] {false};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 ,
                        boolean[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 ,
                             boolean[] aP5 )
   {
      pgcxml.this.AV46Emprcod = aP0[0];
      this.aP0 = aP0;
      pgcxml.this.AV78AlbComCod = aP1[0];
      this.aP1 = aP1;
      pgcxml.this.AV81pathIN = aP2[0];
      this.aP2 = aP2;
      pgcxml.this.AV40Fichero = aP3[0];
      this.aP3 = aP3;
      pgcxml.this.aP4 = aP4;
      pgcxml.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV83ok = false ;
      GXt_int1 = AV80Numdoc ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV46Emprcod, httpContext.getMessage( "NUMDOC", ""), GXv_int2) ;
      pgcxml.this.GXt_int1 = GXv_int2[0] ;
      AV80Numdoc = GXt_int1 ;
      GXt_int1 = (byte)(AV88siatcud) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV46Emprcod, httpContext.getMessage( "SIATCU", ""), GXv_int2) ;
      pgcxml.this.GXt_int1 = GXv_int2[0] ;
      AV88siatcud = GXt_int1 ;
      GXt_int3 = AV89valorsiatcud ;
      GXv_char4[0] = AV46Emprcod ;
      GXv_char5[0] = httpContext.getMessage( "SIATCU", "") ;
      GXv_int6[0] = GXt_int3 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char4, GXv_char5, GXv_int6) ;
      pgcxml.this.AV46Emprcod = GXv_char4[0] ;
      pgcxml.this.GXt_int3 = GXv_int6[0] ;
      AV89valorsiatcud = (short)(GXt_int3) ;
      /* Using cursor P042F2 */
      pr_default.execute(0, new Object[] {AV46Emprcod, Integer.valueOf(AV78AlbComCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14AlbComCod = P042F2_A14AlbComCod[0] ;
         A396EmprCod = P042F2_A396EmprCod[0] ;
         A22AlbComPri = P042F2_A22AlbComPri[0] ;
         AV76ALbComPri = A22AlbComPri ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P042F3 */
      pr_default.execute(1, new Object[] {AV46Emprcod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A396EmprCod = P042F3_A396EmprCod[0] ;
         A395EmprCif = P042F3_A395EmprCif[0] ;
         n395EmprCif = P042F3_n395EmprCif[0] ;
         A407EmprNom = P042F3_A407EmprNom[0] ;
         n407EmprNom = P042F3_n407EmprNom[0] ;
         A404EmprDir = P042F3_A404EmprDir[0] ;
         n404EmprDir = P042F3_n404EmprDir[0] ;
         A408EmprPob = P042F3_A408EmprPob[0] ;
         n408EmprPob = P042F3_n408EmprPob[0] ;
         A403EmprCpo = P042F3_A403EmprCpo[0] ;
         n403EmprCpo = P042F3_n403EmprCpo[0] ;
         AV47Emprcif = A395EmprCif ;
         AV54EmprNom = A407EmprNom ;
         AV55EmprDir = A404EmprDir ;
         AV56EmprPob = A408EmprPob ;
         AV57Emprcp = A403EmprCpo ;
         AV73Cp4 = GXutil.substring( AV57Emprcp, 1, 4) ;
         AV74Cp3 = GXutil.substring( AV57Emprcp, 5, 3) ;
         AV75Cp8 = AV73Cp4 + "-" + AV74Cp3 ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      AV90path += GXutil.trim( AV81pathIN) + "\\" + GXutil.trim( AV40Fichero) + httpContext.getMessage( ".xml", "") ;
      AV39filexml.openURL(AV90path);
      if ( AV39filexml.getErrCode() > 0 )
      {
         AV84Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
         AV84Message.setgxTv_SdtMessages_Message_Id( GXutil.trim( GXutil.str( AV39filexml.getErrCode(), 10, 2)) );
         AV84Message.setgxTv_SdtMessages_Message_Description( AV39filexml.getErrDescription()+httpContext.getMessage( " Error Open Fichero XML", "") );
         AV84Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
         AV82messages.add(AV84Message, 0);
      }
      else
      {
         AV41Body = httpContext.getMessage( "S:Body", "") ;
         AV39filexml.writeStartElement(AV41Body);
         AV41Body = httpContext.getMessage( "envioDocumentoTransporteRequestElem ", "") ;
         AV39filexml.writeNSStartElement(AV41Body, httpContext.getMessage( "ns2", ""), httpContext.getMessage( "https://servicos.portaldasfinancas.gov.pt/sgdtws/documentosTransporte/", ""));
         /* Using cursor P042F4 */
         pr_default.execute(2, new Object[] {AV46Emprcod, Integer.valueOf(AV78AlbComCod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A14AlbComCod = P042F4_A14AlbComCod[0] ;
            A396EmprCod = P042F4_A396EmprCod[0] ;
            A252CliCod = P042F4_A252CliCod[0] ;
            A22AlbComPri = P042F4_A22AlbComPri[0] ;
            A14249AlbComSerA = P042F4_A14249AlbComSerA[0] ;
            A14250AlbComTipA = P042F4_A14250AlbComTipA[0] ;
            A14248AlbComATCU = P042F4_A14248AlbComATCU[0] ;
            A4829AlbComHor = P042F4_A4829AlbComHor[0] ;
            A4830AlbComMat = P042F4_A4830AlbComMat[0] ;
            AV50Clicod = A252CliCod ;
            /* Execute user subroutine: 'CLIENT' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV41Body = httpContext.getMessage( "TaxRegistrationNumber", "") ;
            AV39filexml.writeElement(AV41Body, AV47Emprcif);
            AV41Body = httpContext.getMessage( "CompanyName", "") ;
            AV39filexml.writeElement(AV41Body, AV54EmprNom);
            AV39filexml.writeStartElement(httpContext.getMessage( "CompanyAddress", ""));
            AV39filexml.writeElement(httpContext.getMessage( "Addressdetail", ""), AV55EmprDir);
            AV39filexml.writeElement(httpContext.getMessage( "City", ""), AV56EmprPob);
            AV39filexml.writeElement(httpContext.getMessage( "PostalCode", ""), AV75Cp8);
            AV39filexml.writeElement(httpContext.getMessage( "Country", ""), httpContext.getMessage( "PT", ""));
            AV39filexml.writeEndElement();
            if ( GXutil.strcmp(A22AlbComPri, "1") == 0 )
            {
               AV79Doc = "3" + GXutil.padl( GXutil.trim( GXutil.str( AV78AlbComCod, 8, 0)), (short)(8), "0") ;
            }
            else
            {
               AV79Doc = "4" + GXutil.padl( GXutil.trim( GXutil.str( AV78AlbComCod, 8, 0)), (short)(8), "0") ;
            }
            if ( ( AV88siatcud == 1 ) && ( AV89valorsiatcud == 1 ) )
            {
               AV86documentnumber = GXutil.trim( A14250AlbComTipA) + " " + GXutil.trim( A14249AlbComSerA) + "/" + GXutil.trim( GXutil.str( AV78AlbComCod, 8, 0)) ;
               AV39filexml.writeElement(httpContext.getMessage( "DocumentNumber", ""), GXutil.trim( AV86documentnumber));
            }
            else
            {
               if ( AV80Numdoc == 0 )
               {
                  AV39filexml.writeElement(httpContext.getMessage( "DocumentNumber", ""), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78AlbComCod), 8, 0));
               }
               else
               {
                  AV39filexml.writeElement(httpContext.getMessage( "DocumentNumber", ""), AV79Doc);
               }
            }
            AV85codValidacaoSerie = A14248AlbComATCU ;
            AV87atcud = ((GXutil.strcmp("", AV85codValidacaoSerie)==0) ? "" : GXutil.trim( AV85codValidacaoSerie)+"-"+GXutil.trim( GXutil.str( A14AlbComCod, 8, 0))) ;
            if ( ! (GXutil.strcmp("", AV85codValidacaoSerie)==0) && ( AV88siatcud == 1 ) )
            {
               AV39filexml.writeElement(httpContext.getMessage( "ATCUD", ""), GXutil.trim( AV87atcud));
            }
            AV39filexml.writeElement(httpContext.getMessage( "MovementStatus", ""), httpContext.getMessage( "N", ""));
            AV58VarAux = localUtil.ttoc( A4829AlbComHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            AV59HhSys = GXutil.substring( AV58VarAux, 12, 8) ;
            AV60FecSys = localUtil.ctod( GXutil.substring( AV58VarAux, 1, 10), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV61DateAux = GXutil.trim( GXutil.str( GXutil.year( AV60FecSys), 10, 0)) ;
            if ( GXutil.month( AV60FecSys) < 10 )
            {
               AV61DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.month( AV60FecSys), 10, 0)) ;
            }
            else
            {
               AV61DateAux += "-" + GXutil.trim( GXutil.str( GXutil.month( AV60FecSys), 10, 0)) ;
            }
            if ( GXutil.day( AV60FecSys) < 10 )
            {
               AV61DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.day( AV60FecSys), 10, 0)) ;
            }
            else
            {
               AV61DateAux += "-" + GXutil.trim( GXutil.str( GXutil.day( AV60FecSys), 10, 0)) ;
            }
            AV41Body = AV61DateAux ;
            AV39filexml.writeElement(httpContext.getMessage( "MovementDate", ""), AV41Body);
            if ( GXutil.strcmp(A22AlbComPri, "1") == 0 )
            {
               AV41Body = httpContext.getMessage( "GR", "") ;
            }
            else
            {
               AV41Body = httpContext.getMessage( "GT", "") ;
            }
            AV39filexml.writeElement(httpContext.getMessage( "MovementType", ""), GXutil.trim( AV41Body));
            AV39filexml.writeElement(httpContext.getMessage( "CustomerTaxID", ""), AV48CliNif);
            AV39filexml.writeStartElement(httpContext.getMessage( "CustomerAddress", ""));
            AV39filexml.writeElement(httpContext.getMessage( "Addressdetail", ""), AV51CliDom);
            AV39filexml.writeElement(httpContext.getMessage( "City", ""), AV52CliPob);
            AV39filexml.writeElement(httpContext.getMessage( "PostalCode", ""), AV53Cp);
            AV39filexml.writeElement(httpContext.getMessage( "Country", ""), httpContext.getMessage( "PT", ""));
            AV39filexml.writeEndElement();
            AV39filexml.writeStartElement(httpContext.getMessage( "AddressTo", ""));
            AV39filexml.writeElement(httpContext.getMessage( "Addressdetail", ""), AV51CliDom);
            AV39filexml.writeElement(httpContext.getMessage( "City", ""), AV52CliPob);
            AV39filexml.writeElement(httpContext.getMessage( "PostalCode", ""), AV53Cp);
            AV39filexml.writeElement(httpContext.getMessage( "Country", ""), httpContext.getMessage( "PT", ""));
            AV39filexml.writeEndElement();
            AV39filexml.writeStartElement(httpContext.getMessage( "AddressFrom", ""));
            AV39filexml.writeElement(httpContext.getMessage( "Addressdetail", ""), AV55EmprDir);
            AV39filexml.writeElement(httpContext.getMessage( "City", ""), AV56EmprPob);
            AV39filexml.writeElement(httpContext.getMessage( "PostalCode", ""), AV75Cp8);
            AV39filexml.writeElement(httpContext.getMessage( "Country", ""), httpContext.getMessage( "PT", ""));
            AV39filexml.writeEndElement();
            AV58VarAux = localUtil.ttoc( A4829AlbComHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            AV68FecHorSal = localUtil.ctot( AV58VarAux, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV67VarAux0 = AV68FecHorSal ;
            AV58VarAux = localUtil.ttoc( AV67VarAux0, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            AV59HhSys = GXutil.substring( AV58VarAux, 12, 8) ;
            AV60FecSys = localUtil.ctod( GXutil.substring( AV58VarAux, 1, 10), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV61DateAux = GXutil.trim( GXutil.str( GXutil.year( AV60FecSys), 10, 0)) ;
            if ( GXutil.month( AV60FecSys) < 10 )
            {
               AV61DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.month( AV60FecSys), 10, 0)) ;
            }
            else
            {
               AV61DateAux += "-" + GXutil.trim( GXutil.str( GXutil.month( AV60FecSys), 10, 0)) ;
            }
            if ( GXutil.day( AV60FecSys) < 10 )
            {
               AV61DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.day( AV60FecSys), 10, 0)) ;
            }
            else
            {
               AV61DateAux += "-" + GXutil.trim( GXutil.str( GXutil.day( AV60FecSys), 10, 0)) ;
            }
            AV41Body = AV61DateAux + httpContext.getMessage( "T", "") + AV59HhSys ;
            AV39filexml.writeElement(httpContext.getMessage( "MovementStartTime", ""), AV41Body);
            AV41Body = "0" ;
            if ( GXutil.strcmp(A4830AlbComMat, " ") != 0 )
            {
               AV41Body = A4830AlbComMat ;
            }
            AV39filexml.writeElement(httpContext.getMessage( "VehicleID", ""), AV41Body);
            /* Using cursor P042F5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A13AlbComCnt = P042F5_A13AlbComCnt[0] ;
               A15AlbComDsc = P042F5_A15AlbComDsc[0] ;
               A4717AlbComUni = P042F5_A4717AlbComUni[0] ;
               A13317AlbComPzas = P042F5_A13317AlbComPzas[0] ;
               A13318AlbComMts = P042F5_A13318AlbComMts[0] ;
               A13319AlbComKgs = P042F5_A13319AlbComKgs[0] ;
               A13321AlbComArtD = P042F5_A13321AlbComArtD[0] ;
               A13320AlbComArt = P042F5_A13320AlbComArt[0] ;
               A20AlbComLin = P042F5_A20AlbComLin[0] ;
               if ( A13AlbComCnt.doubleValue() > 0 )
               {
                  AV39filexml.writeStartElement(httpContext.getMessage( "Line", ""));
                  AV62Pd = A15AlbComDsc ;
                  AV39filexml.writeElement(httpContext.getMessage( "ProductDescription", ""), AV62Pd);
                  AV70VarKgs = GXutil.padl( GXutil.trim( GXutil.str( A13AlbComCnt, 9, 2)), (short)(9), " ") ;
                  AV71Vconv = GXutil.substring( AV70VarKgs, 1, 6) + "." + GXutil.substring( AV70VarKgs, 8, 9) ;
                  AV72Num9 = CommonUtil.decimalVal( AV71Vconv, ".") ;
                  AV39filexml.writeElement(httpContext.getMessage( "Quantity", ""), AV70VarKgs);
                  AV77Un = httpContext.getMessage( "UN", "") ;
                  if ( A4717AlbComUni == 2 )
                  {
                     AV77Un = httpContext.getMessage( "MT", "") ;
                  }
                  if ( A4717AlbComUni == 1 )
                  {
                     AV77Un = httpContext.getMessage( "KG", "") ;
                  }
                  AV39filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), AV77Un);
                  AV39filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), "0");
                  AV39filexml.writeEndElement();
               }
               if ( A13AlbComCnt.doubleValue() == 0 )
               {
                  if ( ( A13319AlbComKgs.doubleValue() > 0 ) || ( A13318AlbComMts.doubleValue() > 0 ) || ( A13317AlbComPzas > 0 ) )
                  {
                     AV62Pd = ((GXutil.strcmp("", A13320AlbComArt)==0)&&(GXutil.strcmp("", A13321AlbComArtD)==0) ? httpContext.getMessage( "Sem descripçao", "") : ((GXutil.strcmp(A13320AlbComArt, " ")!=0) ? A13320AlbComArt : A13321AlbComArtD)) ;
                     if ( A13319AlbComKgs.doubleValue() > 0 )
                     {
                        AV39filexml.writeStartElement(httpContext.getMessage( "Line", ""));
                        AV39filexml.writeElement(httpContext.getMessage( "ProductDescription", ""), AV62Pd);
                        AV70VarKgs = GXutil.padl( GXutil.trim( GXutil.str( A13319AlbComKgs, 9, 2)), (short)(9), " ") ;
                        AV71Vconv = GXutil.substring( AV70VarKgs, 1, 6) + "." + GXutil.substring( AV70VarKgs, 8, 9) ;
                        AV72Num9 = CommonUtil.decimalVal( AV71Vconv, ".") ;
                        AV39filexml.writeElement(httpContext.getMessage( "Quantity", ""), AV70VarKgs);
                        AV77Un = httpContext.getMessage( "KG", "") ;
                        AV39filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), AV77Un);
                        AV39filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), "0");
                        AV39filexml.writeEndElement();
                     }
                     if ( A13318AlbComMts.doubleValue() > 0 )
                     {
                        AV39filexml.writeStartElement(httpContext.getMessage( "Line", ""));
                        AV39filexml.writeElement(httpContext.getMessage( "ProductDescription", ""), AV62Pd);
                        AV70VarKgs = GXutil.padl( GXutil.trim( GXutil.str( A13318AlbComMts, 9, 2)), (short)(9), " ") ;
                        AV71Vconv = GXutil.substring( AV70VarKgs, 1, 6) + "." + GXutil.substring( AV70VarKgs, 8, 9) ;
                        AV72Num9 = CommonUtil.decimalVal( AV71Vconv, ".") ;
                        AV39filexml.writeElement(httpContext.getMessage( "Quantity", ""), AV70VarKgs);
                        AV77Un = httpContext.getMessage( "MT", "") ;
                        AV39filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), AV77Un);
                        AV39filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), "0");
                        AV39filexml.writeEndElement();
                     }
                     if ( A13317AlbComPzas > 0 )
                     {
                        AV39filexml.writeStartElement(httpContext.getMessage( "Line", ""));
                        AV39filexml.writeElement(httpContext.getMessage( "ProductDescription", ""), AV62Pd);
                        AV70VarKgs = GXutil.padl( GXutil.trim( GXutil.str( A13317AlbComPzas, 9, 2)), (short)(9), " ") ;
                        AV71Vconv = GXutil.substring( AV70VarKgs, 1, 6) + "." + GXutil.substring( AV70VarKgs, 8, 9) ;
                        AV72Num9 = CommonUtil.decimalVal( AV71Vconv, ".") ;
                        AV39filexml.writeElement(httpContext.getMessage( "Quantity", ""), AV70VarKgs);
                        AV77Un = httpContext.getMessage( "UN", "") ;
                        AV39filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), AV77Un);
                        AV39filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), "0");
                        AV39filexml.writeEndElement();
                     }
                  }
               }
               pr_default.readNext(3);
            }
            pr_default.close(3);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         AV39filexml.writeEndElement();
         AV39filexml.writeEndElement();
         AV39filexml.close();
         AV83ok = true ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'CLIENT' Routine */
      returnInSub = false ;
      AV49CliNom = " " ;
      AV51CliDom = " " ;
      AV52CliPob = " " ;
      AV53Cp = " " ;
      AV48CliNif = " " ;
      /* Using cursor P042F6 */
      pr_default.execute(4, new Object[] {AV46Emprcod, Integer.valueOf(AV50Clicod)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A252CliCod = P042F6_A252CliCod[0] ;
         A396EmprCod = P042F6_A396EmprCod[0] ;
         A279CliNom = P042F6_A279CliNom[0] ;
         A260CliDom = P042F6_A260CliDom[0] ;
         A295CliPob = P042F6_A295CliPob[0] ;
         A4828CliCp2 = P042F6_A4828CliCp2[0] ;
         A256CliCp = P042F6_A256CliCp[0] ;
         A278CliNif = P042F6_A278CliNif[0] ;
         AV49CliNom = A279CliNom ;
         AV51CliDom = A260CliDom ;
         AV52CliPob = A295CliPob ;
         AV53Cp = GXutil.trim( A256CliCp) + "-" + GXutil.trim( A4828CliCp2) ;
         AV48CliNif = A278CliNif ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pgcxml.this.AV46Emprcod;
      this.aP1[0] = pgcxml.this.AV78AlbComCod;
      this.aP2[0] = pgcxml.this.AV81pathIN;
      this.aP3[0] = pgcxml.this.AV40Fichero;
      this.aP4[0] = pgcxml.this.AV82messages;
      this.aP5[0] = pgcxml.this.AV83ok;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV82messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_int2 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new int[1] ;
      scmdbuf = "" ;
      P042F2_A14AlbComCod = new int[1] ;
      P042F2_A396EmprCod = new String[] {""} ;
      P042F2_A22AlbComPri = new String[] {""} ;
      A396EmprCod = "" ;
      A22AlbComPri = "" ;
      AV76ALbComPri = "" ;
      P042F3_A396EmprCod = new String[] {""} ;
      P042F3_A395EmprCif = new String[] {""} ;
      P042F3_n395EmprCif = new boolean[] {false} ;
      P042F3_A407EmprNom = new String[] {""} ;
      P042F3_n407EmprNom = new boolean[] {false} ;
      P042F3_A404EmprDir = new String[] {""} ;
      P042F3_n404EmprDir = new boolean[] {false} ;
      P042F3_A408EmprPob = new String[] {""} ;
      P042F3_n408EmprPob = new boolean[] {false} ;
      P042F3_A403EmprCpo = new String[] {""} ;
      P042F3_n403EmprCpo = new boolean[] {false} ;
      A395EmprCif = "" ;
      A407EmprNom = "" ;
      A404EmprDir = "" ;
      A408EmprPob = "" ;
      A403EmprCpo = "" ;
      AV47Emprcif = "" ;
      AV54EmprNom = "" ;
      AV55EmprDir = "" ;
      AV56EmprPob = "" ;
      AV57Emprcp = "" ;
      AV73Cp4 = "" ;
      AV74Cp3 = "" ;
      AV75Cp8 = "" ;
      AV90path = "" ;
      AV39filexml = new com.genexus.xml.XMLWriter();
      AV84Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV41Body = "" ;
      P042F4_A14AlbComCod = new int[1] ;
      P042F4_A396EmprCod = new String[] {""} ;
      P042F4_A252CliCod = new int[1] ;
      P042F4_A22AlbComPri = new String[] {""} ;
      P042F4_A14249AlbComSerA = new String[] {""} ;
      P042F4_A14250AlbComTipA = new String[] {""} ;
      P042F4_A14248AlbComATCU = new String[] {""} ;
      P042F4_A4829AlbComHor = new java.util.Date[] {GXutil.nullDate()} ;
      P042F4_A4830AlbComMat = new String[] {""} ;
      A14249AlbComSerA = "" ;
      A14250AlbComTipA = "" ;
      A14248AlbComATCU = "" ;
      A4829AlbComHor = GXutil.resetTime( GXutil.nullDate() );
      A4830AlbComMat = "" ;
      AV79Doc = "" ;
      AV86documentnumber = "" ;
      AV85codValidacaoSerie = "" ;
      AV87atcud = "" ;
      AV58VarAux = "" ;
      AV59HhSys = "" ;
      AV60FecSys = GXutil.nullDate() ;
      AV61DateAux = "" ;
      AV48CliNif = "" ;
      AV51CliDom = "" ;
      AV52CliPob = "" ;
      AV53Cp = "" ;
      AV68FecHorSal = GXutil.resetTime( GXutil.nullDate() );
      AV67VarAux0 = GXutil.resetTime( GXutil.nullDate() );
      P042F5_A396EmprCod = new String[] {""} ;
      P042F5_A14AlbComCod = new int[1] ;
      P042F5_A13AlbComCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P042F5_A15AlbComDsc = new String[] {""} ;
      P042F5_A4717AlbComUni = new byte[1] ;
      P042F5_A13317AlbComPzas = new int[1] ;
      P042F5_A13318AlbComMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P042F5_A13319AlbComKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P042F5_A13321AlbComArtD = new String[] {""} ;
      P042F5_A13320AlbComArt = new String[] {""} ;
      P042F5_A20AlbComLin = new short[1] ;
      A13AlbComCnt = DecimalUtil.ZERO ;
      A15AlbComDsc = "" ;
      A13318AlbComMts = DecimalUtil.ZERO ;
      A13319AlbComKgs = DecimalUtil.ZERO ;
      A13321AlbComArtD = "" ;
      A13320AlbComArt = "" ;
      AV62Pd = "" ;
      AV70VarKgs = "" ;
      AV71Vconv = "" ;
      AV72Num9 = DecimalUtil.ZERO ;
      AV77Un = "" ;
      AV49CliNom = "" ;
      P042F6_A252CliCod = new int[1] ;
      P042F6_A396EmprCod = new String[] {""} ;
      P042F6_A279CliNom = new String[] {""} ;
      P042F6_A260CliDom = new String[] {""} ;
      P042F6_A295CliPob = new String[] {""} ;
      P042F6_A4828CliCp2 = new String[] {""} ;
      P042F6_A256CliCp = new String[] {""} ;
      P042F6_A278CliNif = new String[] {""} ;
      A279CliNom = "" ;
      A260CliDom = "" ;
      A295CliPob = "" ;
      A4828CliCp2 = "" ;
      A256CliCp = "" ;
      A278CliNif = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.albaranescomerciales.pgcxml__default(),
         new Object[] {
             new Object[] {
            P042F2_A14AlbComCod, P042F2_A396EmprCod, P042F2_A22AlbComPri
            }
            , new Object[] {
            P042F3_A396EmprCod, P042F3_A395EmprCif, P042F3_n395EmprCif, P042F3_A407EmprNom, P042F3_n407EmprNom, P042F3_A404EmprDir, P042F3_n404EmprDir, P042F3_A408EmprPob, P042F3_n408EmprPob, P042F3_A403EmprCpo,
            P042F3_n403EmprCpo
            }
            , new Object[] {
            P042F4_A14AlbComCod, P042F4_A396EmprCod, P042F4_A252CliCod, P042F4_A22AlbComPri, P042F4_A14249AlbComSerA, P042F4_A14250AlbComTipA, P042F4_A14248AlbComATCU, P042F4_A4829AlbComHor, P042F4_A4830AlbComMat
            }
            , new Object[] {
            P042F5_A396EmprCod, P042F5_A14AlbComCod, P042F5_A13AlbComCnt, P042F5_A15AlbComDsc, P042F5_A4717AlbComUni, P042F5_A13317AlbComPzas, P042F5_A13318AlbComMts, P042F5_A13319AlbComKgs, P042F5_A13321AlbComArtD, P042F5_A13320AlbComArt,
            P042F5_A20AlbComLin
            }
            , new Object[] {
            P042F6_A252CliCod, P042F6_A396EmprCod, P042F6_A279CliNom, P042F6_A260CliDom, P042F6_A295CliPob, P042F6_A4828CliCp2, P042F6_A256CliCp, P042F6_A278CliNif
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV80Numdoc ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A4717AlbComUni ;
   private short AV88siatcud ;
   private short AV89valorsiatcud ;
   private short A20AlbComLin ;
   private short Gx_err ;
   private int AV78AlbComCod ;
   private int GXt_int3 ;
   private int GXv_int6[] ;
   private int A14AlbComCod ;
   private int A252CliCod ;
   private int AV50Clicod ;
   private int A13317AlbComPzas ;
   private java.math.BigDecimal A13AlbComCnt ;
   private java.math.BigDecimal A13318AlbComMts ;
   private java.math.BigDecimal A13319AlbComKgs ;
   private java.math.BigDecimal AV72Num9 ;
   private String AV46Emprcod ;
   private String AV81pathIN ;
   private String AV40Fichero ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A22AlbComPri ;
   private String AV76ALbComPri ;
   private String A395EmprCif ;
   private String A407EmprNom ;
   private String A404EmprDir ;
   private String A408EmprPob ;
   private String A403EmprCpo ;
   private String AV47Emprcif ;
   private String AV54EmprNom ;
   private String AV55EmprDir ;
   private String AV56EmprPob ;
   private String AV57Emprcp ;
   private String AV73Cp4 ;
   private String AV74Cp3 ;
   private String AV75Cp8 ;
   private String AV41Body ;
   private String A14249AlbComSerA ;
   private String A14250AlbComTipA ;
   private String A14248AlbComATCU ;
   private String A4830AlbComMat ;
   private String AV79Doc ;
   private String AV85codValidacaoSerie ;
   private String AV58VarAux ;
   private String AV59HhSys ;
   private String AV61DateAux ;
   private String AV48CliNif ;
   private String AV51CliDom ;
   private String AV52CliPob ;
   private String AV53Cp ;
   private String A15AlbComDsc ;
   private String A13321AlbComArtD ;
   private String A13320AlbComArt ;
   private String AV62Pd ;
   private String AV70VarKgs ;
   private String AV71Vconv ;
   private String AV77Un ;
   private String AV49CliNom ;
   private String A279CliNom ;
   private String A260CliDom ;
   private String A295CliPob ;
   private String A4828CliCp2 ;
   private String A256CliCp ;
   private String A278CliNif ;
   private java.util.Date A4829AlbComHor ;
   private java.util.Date AV68FecHorSal ;
   private java.util.Date AV67VarAux0 ;
   private java.util.Date AV60FecSys ;
   private boolean AV83ok ;
   private boolean n395EmprCif ;
   private boolean n407EmprNom ;
   private boolean n404EmprDir ;
   private boolean n408EmprPob ;
   private boolean n403EmprCpo ;
   private boolean returnInSub ;
   private String AV90path ;
   private String AV86documentnumber ;
   private String AV87atcud ;
   private boolean[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P042F2_A14AlbComCod ;
   private String[] P042F2_A396EmprCod ;
   private String[] P042F2_A22AlbComPri ;
   private String[] P042F3_A396EmprCod ;
   private String[] P042F3_A395EmprCif ;
   private boolean[] P042F3_n395EmprCif ;
   private String[] P042F3_A407EmprNom ;
   private boolean[] P042F3_n407EmprNom ;
   private String[] P042F3_A404EmprDir ;
   private boolean[] P042F3_n404EmprDir ;
   private String[] P042F3_A408EmprPob ;
   private boolean[] P042F3_n408EmprPob ;
   private String[] P042F3_A403EmprCpo ;
   private boolean[] P042F3_n403EmprCpo ;
   private int[] P042F4_A14AlbComCod ;
   private String[] P042F4_A396EmprCod ;
   private int[] P042F4_A252CliCod ;
   private String[] P042F4_A22AlbComPri ;
   private String[] P042F4_A14249AlbComSerA ;
   private String[] P042F4_A14250AlbComTipA ;
   private String[] P042F4_A14248AlbComATCU ;
   private java.util.Date[] P042F4_A4829AlbComHor ;
   private String[] P042F4_A4830AlbComMat ;
   private String[] P042F5_A396EmprCod ;
   private int[] P042F5_A14AlbComCod ;
   private java.math.BigDecimal[] P042F5_A13AlbComCnt ;
   private String[] P042F5_A15AlbComDsc ;
   private byte[] P042F5_A4717AlbComUni ;
   private int[] P042F5_A13317AlbComPzas ;
   private java.math.BigDecimal[] P042F5_A13318AlbComMts ;
   private java.math.BigDecimal[] P042F5_A13319AlbComKgs ;
   private String[] P042F5_A13321AlbComArtD ;
   private String[] P042F5_A13320AlbComArt ;
   private short[] P042F5_A20AlbComLin ;
   private int[] P042F6_A252CliCod ;
   private String[] P042F6_A396EmprCod ;
   private String[] P042F6_A279CliNom ;
   private String[] P042F6_A260CliDom ;
   private String[] P042F6_A295CliPob ;
   private String[] P042F6_A4828CliCp2 ;
   private String[] P042F6_A256CliCp ;
   private String[] P042F6_A278CliNif ;
   private com.genexus.xml.XMLWriter AV39filexml ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV82messages ;
   private com.genexus.SdtMessages_Message AV84Message ;
}

final  class pgcxml__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P042F2", "SELECT AlbComCod, EmprCod, AlbComPri FROM TXPCALCOM WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P042F3", "SELECT EmprCod, EmprCif, EmprNom, EmprDir, EmprPob, EmprCpo FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P042F4", "SELECT AlbComCod, EmprCod, CliCod, AlbComPri, AlbComSerA, AlbComTipA, AlbComATCU, AlbComHor, AlbComMat FROM TXPCALCOM WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P042F5", "SELECT EmprCod, AlbComCod, AlbComCnt, AlbComDsc, AlbComUni, AlbComPzas, AlbComMts, AlbComKgs, AlbComArtD, AlbComArt, AlbComLin FROM TXPLALCOM WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod, AlbComLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P042F6", "SELECT CliCod, EmprCod, CliNom, CliDom, CliPob, CliCp2, CliCp, CliNif FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 15);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 35);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 35);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 4);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 34);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
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
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

