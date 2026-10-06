package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pgrxml extends GXProcedure
{
   public pgrxml( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pgrxml.class ), "" );
   }

   public pgrxml( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( String[] aP0 ,
                              long[] aP1 ,
                              String[] aP2 ,
                              String[] aP3 ,
                              GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 )
   {
      pgrxml.this.aP5 = new boolean[] {false};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 ,
                        boolean[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 ,
                             boolean[] aP5 )
   {
      pgrxml.this.AV46Emprcod = aP0[0];
      this.aP0 = aP0;
      pgrxml.this.AV37AlbProcod = aP1[0];
      this.aP1 = aP1;
      pgrxml.this.AV93pathIN = aP2[0];
      this.aP2 = aP2;
      pgrxml.this.AV40Fichero = aP3[0];
      this.aP3 = aP3;
      pgrxml.this.aP4 = aP4;
      pgrxml.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV91ok = false ;
      GXt_int1 = AV84NumDoc ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV46Emprcod, httpContext.getMessage( "NUMDOC", ""), GXv_int2) ;
      pgrxml.this.GXt_int1 = GXv_int2[0] ;
      AV84NumDoc = GXt_int1 ;
      GXt_int1 = AV85NoMtsAt ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV46Emprcod, httpContext.getMessage( "NOMTAT", ""), GXv_int2) ;
      pgrxml.this.GXt_int1 = GXv_int2[0] ;
      AV85NoMtsAt = GXt_int1 ;
      GXt_int1 = AV88siatcud ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV46Emprcod, httpContext.getMessage( "SIATCU", ""), GXv_int2) ;
      pgrxml.this.GXt_int1 = GXv_int2[0] ;
      AV88siatcud = GXt_int1 ;
      GXt_int3 = AV89valorsiatcud ;
      GXv_char4[0] = AV46Emprcod ;
      GXv_char5[0] = httpContext.getMessage( "SIATCU", "") ;
      GXv_int6[0] = GXt_int3 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char4, GXv_char5, GXv_int6) ;
      pgrxml.this.AV46Emprcod = GXv_char4[0] ;
      pgrxml.this.GXt_int3 = GXv_int6[0] ;
      AV89valorsiatcud = (byte)(GXt_int3) ;
      /* Using cursor P042C2 */
      pr_default.execute(0, new Object[] {AV46Emprcod, Long.valueOf(AV37AlbProcod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A30AlbProCod = P042C2_A30AlbProCod[0] ;
         A396EmprCod = P042C2_A396EmprCod[0] ;
         A39AlbProPri = P042C2_A39AlbProPri[0] ;
         A5140AlbMarca = P042C2_A5140AlbMarca[0] ;
         AV76AlbProPri = A39AlbProPri ;
         AV77AlbMarca = A5140AlbMarca ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P042C3 */
      pr_default.execute(1, new Object[] {AV46Emprcod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A396EmprCod = P042C3_A396EmprCod[0] ;
         A395EmprCif = P042C3_A395EmprCif[0] ;
         n395EmprCif = P042C3_n395EmprCif[0] ;
         A407EmprNom = P042C3_A407EmprNom[0] ;
         n407EmprNom = P042C3_n407EmprNom[0] ;
         A404EmprDir = P042C3_A404EmprDir[0] ;
         n404EmprDir = P042C3_n404EmprDir[0] ;
         A408EmprPob = P042C3_A408EmprPob[0] ;
         n408EmprPob = P042C3_n408EmprPob[0] ;
         A403EmprCpo = P042C3_A403EmprCpo[0] ;
         n403EmprCpo = P042C3_n403EmprCpo[0] ;
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
      AV95path += GXutil.trim( AV93pathIN) + "\\" + GXutil.trim( AV40Fichero) + httpContext.getMessage( ".xml", "") ;
      AV39filexml.openURL(AV95path);
      if ( AV39filexml.getErrCode() > 0 )
      {
         AV94Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
         AV94Message.setgxTv_SdtMessages_Message_Id( GXutil.trim( GXutil.str( AV39filexml.getErrCode(), 10, 2)) );
         AV94Message.setgxTv_SdtMessages_Message_Description( AV39filexml.getErrDescription()+httpContext.getMessage( " Error Open Fichero XML", "") );
         AV94Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
         AV92messages.add(AV94Message, 0);
      }
      else
      {
         AV41Body = httpContext.getMessage( "S:Body", "") ;
         AV39filexml.writeStartElement(AV41Body);
         AV41Body = httpContext.getMessage( "envioDocumentoTransporteRequestElem ", "") ;
         AV39filexml.writeNSStartElement(AV41Body, httpContext.getMessage( "ns2", ""), httpContext.getMessage( "https://servicos.portaldasfinancas.gov.pt/sgdtws/documentosTransporte/", ""));
         AV101GXLvl50 = (byte)(0) ;
         /* Using cursor P042C4 */
         pr_default.execute(2, new Object[] {AV46Emprcod, Long.valueOf(AV37AlbProcod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A30AlbProCod = P042C4_A30AlbProCod[0] ;
            A396EmprCod = P042C4_A396EmprCod[0] ;
            A1259AlbDomEnv = P042C4_A1259AlbDomEnv[0] ;
            n1259AlbDomEnv = P042C4_n1259AlbDomEnv[0] ;
            A1243GuiRemCli = P042C4_A1243GuiRemCli[0] ;
            A39AlbProPri = P042C4_A39AlbProPri[0] ;
            A14073AlbPdSerAT = P042C4_A14073AlbPdSerAT[0] ;
            A14074AlbPdTipAT = P042C4_A14074AlbPdTipAT[0] ;
            A14069AlbPdATCUD = P042C4_A14069AlbPdATCUD[0] ;
            A4023AlbFecSal = P042C4_A4023AlbFecSal[0] ;
            A3865AlbHorSal = P042C4_A3865AlbHorSal[0] ;
            A3868AlbMat = P042C4_A3868AlbMat[0] ;
            AV101GXLvl50 = (byte)(1) ;
            AV82AlbDomenv = A1259AlbDomEnv ;
            AV50Clicod = A1243GuiRemCli ;
            /* Execute user subroutine: 'CLIENT' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( AV82AlbDomenv > 0 )
            {
               /* Execute user subroutine: 'CLIENV' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(2);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            AV41Body = httpContext.getMessage( "TaxRegistrationNumber", "") ;
            AV39filexml.writeElement(AV41Body, GXutil.trim( AV47Emprcif));
            AV41Body = httpContext.getMessage( "CompanyName", "") ;
            AV39filexml.writeElement(AV41Body, AV54EmprNom);
            AV39filexml.writeStartElement(httpContext.getMessage( "CompanyAddress", ""));
            AV39filexml.writeElement(httpContext.getMessage( "Addressdetail", ""), GXutil.trim( AV55EmprDir));
            AV39filexml.writeElement(httpContext.getMessage( "City", ""), GXutil.trim( AV56EmprPob));
            AV39filexml.writeElement(httpContext.getMessage( "PostalCode", ""), GXutil.trim( AV75Cp8));
            AV39filexml.writeElement(httpContext.getMessage( "Country", ""), httpContext.getMessage( "PT", ""));
            AV39filexml.writeEndElement();
            if ( GXutil.strcmp(A39AlbProPri, "1") == 0 )
            {
               AV83Doc = "1" + GXutil.padl( GXutil.trim( GXutil.str( AV37AlbProcod, 10, 0)), (short)(10), "0") ;
            }
            else
            {
               AV83Doc = "2" + GXutil.padl( GXutil.trim( GXutil.str( AV37AlbProcod, 10, 0)), (short)(10), "0") ;
            }
            if ( ( AV88siatcud == 1 ) && ( AV89valorsiatcud == 1 ) )
            {
               AV90documentnumber = GXutil.trim( A14074AlbPdTipAT) + " " + GXutil.trim( A14073AlbPdSerAT) + "/" + GXutil.trim( GXutil.str( AV37AlbProcod, 10, 0)) ;
               AV39filexml.writeElement(httpContext.getMessage( "DocumentNumber", ""), GXutil.trim( AV90documentnumber));
            }
            else
            {
               if ( AV84NumDoc == 0 )
               {
                  AV39filexml.writeElement(httpContext.getMessage( "DocumentNumber", ""), GXutil.trim( GXutil.str( AV37AlbProcod, 10, 0)));
               }
               else
               {
                  AV39filexml.writeElement(httpContext.getMessage( "DocumentNumber", ""), GXutil.trim( AV83Doc));
               }
            }
            AV86codValidacaoSerie = A14069AlbPdATCUD ;
            AV87atcud = ((GXutil.strcmp("", AV86codValidacaoSerie)==0) ? "" : GXutil.trim( AV86codValidacaoSerie)+"-"+GXutil.trim( GXutil.str( A30AlbProCod, 10, 0))) ;
            if ( ! (GXutil.strcmp("", AV86codValidacaoSerie)==0) && ( AV88siatcud == 1 ) )
            {
               AV39filexml.writeElement(httpContext.getMessage( "ATCUD", ""), GXutil.trim( AV87atcud));
            }
            AV39filexml.writeElement(httpContext.getMessage( "MovementStatus", ""), httpContext.getMessage( "N", ""));
            AV61DateAux = GXutil.trim( GXutil.str( GXutil.year( A4023AlbFecSal), 10, 0)) ;
            if ( GXutil.month( A4023AlbFecSal) < 10 )
            {
               AV61DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.month( A4023AlbFecSal), 10, 0)) ;
            }
            else
            {
               AV61DateAux += "-" + GXutil.trim( GXutil.str( GXutil.month( A4023AlbFecSal), 10, 0)) ;
            }
            if ( GXutil.day( A4023AlbFecSal) < 10 )
            {
               AV61DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.day( A4023AlbFecSal), 10, 0)) ;
            }
            else
            {
               AV61DateAux += "-" + GXutil.trim( GXutil.str( GXutil.day( A4023AlbFecSal), 10, 0)) ;
            }
            AV41Body = AV61DateAux ;
            AV39filexml.writeElement(httpContext.getMessage( "MovementDate", ""), GXutil.trim( AV41Body));
            if ( GXutil.strcmp(AV76AlbProPri, "1") == 0 )
            {
               AV41Body = httpContext.getMessage( "GR", "") ;
            }
            else
            {
               AV41Body = httpContext.getMessage( "GT", "") ;
            }
            AV39filexml.writeElement(httpContext.getMessage( "MovementType", ""), GXutil.trim( AV41Body));
            AV39filexml.writeElement(httpContext.getMessage( "CustomerTaxID", ""), GXutil.trim( AV48CliNif));
            AV39filexml.writeStartElement(httpContext.getMessage( "CustomerAddress", ""));
            AV39filexml.writeElement(httpContext.getMessage( "Addressdetail", ""), GXutil.trim( AV51CliDom));
            AV39filexml.writeElement(httpContext.getMessage( "City", ""), GXutil.trim( AV52CliPob));
            AV39filexml.writeElement(httpContext.getMessage( "PostalCode", ""), GXutil.trim( AV53Cp));
            AV39filexml.writeElement(httpContext.getMessage( "Country", ""), httpContext.getMessage( "PT", ""));
            AV39filexml.writeEndElement();
            AV39filexml.writeStartElement(httpContext.getMessage( "AddressTo", ""));
            AV39filexml.writeElement(httpContext.getMessage( "Addressdetail", ""), GXutil.trim( AV79CliEnvDom));
            AV39filexml.writeElement(httpContext.getMessage( "City", ""), GXutil.trim( AV80CliEnvPob));
            AV39filexml.writeElement(httpContext.getMessage( "PostalCode", ""), GXutil.trim( AV81CpE));
            AV39filexml.writeElement(httpContext.getMessage( "Country", ""), httpContext.getMessage( "PT", ""));
            AV39filexml.writeEndElement();
            AV39filexml.writeStartElement(httpContext.getMessage( "AddressFrom", ""));
            AV39filexml.writeElement(httpContext.getMessage( "Addressdetail", ""), GXutil.trim( AV55EmprDir));
            AV39filexml.writeElement(httpContext.getMessage( "City", ""), GXutil.trim( AV56EmprPob));
            AV39filexml.writeElement(httpContext.getMessage( "PostalCode", ""), GXutil.trim( AV75Cp8));
            AV39filexml.writeElement(httpContext.getMessage( "Country", ""), httpContext.getMessage( "PT", ""));
            AV39filexml.writeEndElement();
            AV58VarAux = localUtil.dtoc( A4023AlbFecSal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + A3865AlbHorSal ;
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
            AV39filexml.writeElement(httpContext.getMessage( "MovementStartTime", ""), GXutil.trim( AV41Body));
            AV41Body = "0" ;
            if ( GXutil.strcmp(A3868AlbMat, " ") != 0 )
            {
               AV41Body = A3868AlbMat ;
            }
            AV39filexml.writeElement(httpContext.getMessage( "VehicleID", ""), GXutil.trim( AV41Body));
            /* Using cursor P042C5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A130BarCodPar = P042C5_A130BarCodPar[0] ;
               A132BarCodReo = P042C5_A132BarCodReo[0] ;
               A129BarCod = P042C5_A129BarCod[0] ;
               A2010BarTipDis = P042C5_A2010BarTipDis[0] ;
               A1263BarAlbMtrE = P042C5_A1263BarAlbMtrE[0] ;
               A1261BarAlbKgmE = P042C5_A1261BarAlbKgmE[0] ;
               A12195BarAlbUnd = P042C5_A12195BarAlbUnd[0] ;
               A1652BarSerDsc = P042C5_A1652BarSerDsc[0] ;
               A212BarSer = P042C5_A212BarSer[0] ;
               A2010BarTipDis = P042C5_A2010BarTipDis[0] ;
               A1652BarSerDsc = P042C5_A1652BarSerDsc[0] ;
               A212BarSer = P042C5_A212BarSer[0] ;
               AV96BartipDis = A2010BarTipDis ;
               if ( ( A1261BarAlbKgmE.doubleValue() == 0 ) && ( A1263BarAlbMtrE.doubleValue() == 0 ) )
               {
                  /* Using cursor P042C6 */
                  pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  while ( (pr_default.getStatus(4) != 101) )
                  {
                     A460FasDsc = P042C6_A460FasDsc[0] ;
                     A457FasCod = P042C6_A457FasCod[0] ;
                     A1276FasMtr = P042C6_A1276FasMtr[0] ;
                     A1275FasKgm = P042C6_A1275FasKgm[0] ;
                     A1240GuiFasLin = P042C6_A1240GuiFasLin[0] ;
                     A460FasDsc = P042C6_A460FasDsc[0] ;
                     AV39filexml.writeStartElement(httpContext.getMessage( "Line", ""));
                     AV62Pd = GXutil.trim( A457FasCod) + "-" + GXutil.trim( A460FasDsc) ;
                     AV39filexml.writeElement(httpContext.getMessage( "ProductDescription", ""), GXutil.trim( AV62Pd));
                     if ( ( A1275FasKgm.doubleValue() > 0 ) && ( A1276FasMtr.doubleValue() > 0 ) )
                     {
                        AV70VarKgs = GXutil.padl( GXutil.trim( GXutil.str( A1275FasKgm, 9, 2)), (short)(9), " ") ;
                        AV71Vconv = GXutil.substring( AV70VarKgs, 1, 6) + "." + GXutil.substring( AV70VarKgs, 8, 9) ;
                        AV72Num9 = CommonUtil.decimalVal( AV71Vconv, ".") ;
                        AV39filexml.writeElement(httpContext.getMessage( "Quantity", ""), GXutil.trim( AV70VarKgs));
                        AV39filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), httpContext.getMessage( "KG", ""));
                        AV39filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), "0");
                     }
                     if ( ( A1275FasKgm.doubleValue() > 0 ) && ( A1276FasMtr.doubleValue() == 0 ) )
                     {
                        AV70VarKgs = GXutil.padl( GXutil.trim( GXutil.str( A1275FasKgm, 9, 2)), (short)(9), " ") ;
                        AV71Vconv = GXutil.substring( AV70VarKgs, 1, 6) + "." + GXutil.substring( AV70VarKgs, 8, 9) ;
                        AV72Num9 = CommonUtil.decimalVal( AV71Vconv, ".") ;
                        AV39filexml.writeElement(httpContext.getMessage( "Quantity", ""), GXutil.trim( AV70VarKgs));
                        AV39filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), httpContext.getMessage( "KG", ""));
                        AV39filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), "0");
                     }
                     if ( ( A1276FasMtr.doubleValue() > 0 ) && ( A1275FasKgm.doubleValue() == 0 ) )
                     {
                        AV70VarKgs = GXutil.padl( GXutil.trim( GXutil.str( A1276FasMtr, 9, 2)), (short)(9), " ") ;
                        AV71Vconv = GXutil.substring( AV70VarKgs, 1, 6) + "." + GXutil.substring( AV70VarKgs, 8, 9) ;
                        AV72Num9 = CommonUtil.decimalVal( AV71Vconv, ".") ;
                        AV39filexml.writeElement(httpContext.getMessage( "Quantity", ""), GXutil.trim( AV70VarKgs));
                        AV39filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), httpContext.getMessage( "MT", ""));
                        AV39filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), "0");
                     }
                     AV39filexml.writeEndElement();
                     pr_default.readNext(4);
                  }
                  pr_default.close(4);
               }
               else
               {
                  if ( ( A12195BarAlbUnd > 0 ) && ( GXutil.strcmp(AV96BartipDis, "L") == 0 ) )
                  {
                     AV39filexml.writeStartElement(httpContext.getMessage( "Line", ""));
                     AV62Pd = GXutil.trim( A212BarSer) + "-" + GXutil.trim( A1652BarSerDsc) ;
                     AV39filexml.writeElement(httpContext.getMessage( "ProductDescription", ""), GXutil.trim( AV62Pd));
                     AV70VarKgs = GXutil.padl( GXutil.trim( GXutil.str( A12195BarAlbUnd, 6, 0)), (short)(6), " ") ;
                     AV71Vconv = GXutil.substring( AV70VarKgs, 1, 6) + "." + GXutil.substring( AV70VarKgs, 8, 9) ;
                     AV72Num9 = CommonUtil.decimalVal( AV71Vconv, ".") ;
                     AV39filexml.writeElement(httpContext.getMessage( "Quantity", ""), GXutil.trim( AV70VarKgs));
                     AV39filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), httpContext.getMessage( "UN", ""));
                     AV39filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), "0");
                     AV39filexml.writeEndElement();
                  }
                  if ( ( A1261BarAlbKgmE.doubleValue() > 0 ) && ( GXutil.strcmp(AV96BartipDis, "L") != 0 ) )
                  {
                     AV39filexml.writeStartElement(httpContext.getMessage( "Line", ""));
                     AV62Pd = GXutil.trim( A212BarSer) + "-" + GXutil.trim( A1652BarSerDsc) ;
                     AV39filexml.writeElement(httpContext.getMessage( "ProductDescription", ""), GXutil.trim( AV62Pd));
                     AV70VarKgs = GXutil.padl( GXutil.trim( GXutil.str( A1261BarAlbKgmE, 9, 2)), (short)(9), " ") ;
                     AV71Vconv = GXutil.substring( AV70VarKgs, 1, 6) + "." + GXutil.substring( AV70VarKgs, 8, 9) ;
                     AV72Num9 = CommonUtil.decimalVal( AV71Vconv, ".") ;
                     AV39filexml.writeElement(httpContext.getMessage( "Quantity", ""), GXutil.trim( AV70VarKgs));
                     AV39filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), httpContext.getMessage( "KG", ""));
                     AV39filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), "0");
                     AV39filexml.writeEndElement();
                  }
                  if ( ( A1263BarAlbMtrE.doubleValue() > 0 ) && ( AV85NoMtsAt == 0 ) && ( GXutil.strcmp(AV96BartipDis, "L") != 0 ) )
                  {
                     AV39filexml.writeStartElement(httpContext.getMessage( "Line", ""));
                     AV62Pd = GXutil.trim( A212BarSer) + "-" + GXutil.trim( A1652BarSerDsc) ;
                     AV39filexml.writeElement(httpContext.getMessage( "ProductDescription", ""), GXutil.trim( AV62Pd));
                     AV70VarKgs = GXutil.padl( GXutil.trim( GXutil.str( A1263BarAlbMtrE, 9, 2)), (short)(9), " ") ;
                     AV71Vconv = GXutil.substring( AV70VarKgs, 1, 6) + "." + GXutil.substring( AV70VarKgs, 8, 9) ;
                     AV72Num9 = CommonUtil.decimalVal( AV71Vconv, ".") ;
                     AV39filexml.writeElement(httpContext.getMessage( "Quantity", ""), GXutil.trim( AV70VarKgs));
                     AV39filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), httpContext.getMessage( "MT", ""));
                     AV39filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), "0");
                     AV39filexml.writeEndElement();
                  }
               }
               pr_default.readNext(3);
            }
            pr_default.close(3);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         if ( AV101GXLvl50 == 0 )
         {
            System.out.println( httpContext.getMessage( "NO existe CALPRD", "") );
         }
         AV39filexml.writeEndElement();
         AV39filexml.writeEndElement();
         AV39filexml.close();
         AV91ok = true ;
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
      /* Using cursor P042C7 */
      pr_default.execute(5, new Object[] {AV46Emprcod, Integer.valueOf(AV50Clicod)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A252CliCod = P042C7_A252CliCod[0] ;
         A396EmprCod = P042C7_A396EmprCod[0] ;
         A279CliNom = P042C7_A279CliNom[0] ;
         A260CliDom = P042C7_A260CliDom[0] ;
         A295CliPob = P042C7_A295CliPob[0] ;
         A4828CliCp2 = P042C7_A4828CliCp2[0] ;
         A256CliCp = P042C7_A256CliCp[0] ;
         A278CliNif = P042C7_A278CliNif[0] ;
         AV49CliNom = A279CliNom ;
         AV51CliDom = A260CliDom ;
         AV52CliPob = A295CliPob ;
         AV53Cp = GXutil.trim( A256CliCp) + "-" + GXutil.trim( A4828CliCp2) ;
         AV48CliNif = A278CliNif ;
         AV78CliEnvNom = A279CliNom ;
         AV79CliEnvDom = A260CliDom ;
         AV81CpE = GXutil.trim( A256CliCp) + "-" + GXutil.trim( A4828CliCp2) ;
         AV80CliEnvPob = A295CliPob ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   public void S121( )
   {
      /* 'CLIENV' Routine */
      returnInSub = false ;
      /* Using cursor P042C8 */
      pr_default.execute(6, new Object[] {AV46Emprcod, Integer.valueOf(AV50Clicod), Byte.valueOf(AV82AlbDomenv)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A266CliEnvLin = P042C8_A266CliEnvLin[0] ;
         A252CliCod = P042C8_A252CliCod[0] ;
         A396EmprCod = P042C8_A396EmprCod[0] ;
         A267CliEnvNom = P042C8_A267CliEnvNom[0] ;
         A265CliEnvDom = P042C8_A265CliEnvDom[0] ;
         A10775CliEnvCp2 = P042C8_A10775CliEnvCp2[0] ;
         A264CliEnvCp = P042C8_A264CliEnvCp[0] ;
         A268CliEnvPob = P042C8_A268CliEnvPob[0] ;
         AV78CliEnvNom = A267CliEnvNom ;
         AV79CliEnvDom = A265CliEnvDom ;
         AV81CpE = GXutil.trim( A264CliEnvCp) + "-" + GXutil.trim( A10775CliEnvCp2) ;
         AV80CliEnvPob = A268CliEnvPob ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pgrxml.this.AV46Emprcod;
      this.aP1[0] = pgrxml.this.AV37AlbProcod;
      this.aP2[0] = pgrxml.this.AV93pathIN;
      this.aP3[0] = pgrxml.this.AV40Fichero;
      this.aP4[0] = pgrxml.this.AV92messages;
      this.aP5[0] = pgrxml.this.AV91ok;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV92messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_int2 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new int[1] ;
      scmdbuf = "" ;
      P042C2_A30AlbProCod = new long[1] ;
      P042C2_A396EmprCod = new String[] {""} ;
      P042C2_A39AlbProPri = new String[] {""} ;
      P042C2_A5140AlbMarca = new String[] {""} ;
      A396EmprCod = "" ;
      A39AlbProPri = "" ;
      A5140AlbMarca = "" ;
      AV76AlbProPri = "" ;
      AV77AlbMarca = "" ;
      P042C3_A396EmprCod = new String[] {""} ;
      P042C3_A395EmprCif = new String[] {""} ;
      P042C3_n395EmprCif = new boolean[] {false} ;
      P042C3_A407EmprNom = new String[] {""} ;
      P042C3_n407EmprNom = new boolean[] {false} ;
      P042C3_A404EmprDir = new String[] {""} ;
      P042C3_n404EmprDir = new boolean[] {false} ;
      P042C3_A408EmprPob = new String[] {""} ;
      P042C3_n408EmprPob = new boolean[] {false} ;
      P042C3_A403EmprCpo = new String[] {""} ;
      P042C3_n403EmprCpo = new boolean[] {false} ;
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
      AV95path = "" ;
      AV39filexml = new com.genexus.xml.XMLWriter();
      AV94Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV41Body = "" ;
      P042C4_A30AlbProCod = new long[1] ;
      P042C4_A396EmprCod = new String[] {""} ;
      P042C4_A1259AlbDomEnv = new byte[1] ;
      P042C4_n1259AlbDomEnv = new boolean[] {false} ;
      P042C4_A1243GuiRemCli = new int[1] ;
      P042C4_A39AlbProPri = new String[] {""} ;
      P042C4_A14073AlbPdSerAT = new String[] {""} ;
      P042C4_A14074AlbPdTipAT = new String[] {""} ;
      P042C4_A14069AlbPdATCUD = new String[] {""} ;
      P042C4_A4023AlbFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P042C4_A3865AlbHorSal = new String[] {""} ;
      P042C4_A3868AlbMat = new String[] {""} ;
      A14073AlbPdSerAT = "" ;
      A14074AlbPdTipAT = "" ;
      A14069AlbPdATCUD = "" ;
      A4023AlbFecSal = GXutil.nullDate() ;
      A3865AlbHorSal = "" ;
      A3868AlbMat = "" ;
      AV83Doc = "" ;
      AV90documentnumber = "" ;
      AV86codValidacaoSerie = "" ;
      AV87atcud = "" ;
      AV61DateAux = "" ;
      AV48CliNif = "" ;
      AV51CliDom = "" ;
      AV52CliPob = "" ;
      AV53Cp = "" ;
      AV79CliEnvDom = "" ;
      AV80CliEnvPob = "" ;
      AV81CpE = "" ;
      AV58VarAux = "" ;
      AV68FecHorSal = GXutil.resetTime( GXutil.nullDate() );
      AV67VarAux0 = GXutil.resetTime( GXutil.nullDate() );
      AV59HhSys = "" ;
      AV60FecSys = GXutil.nullDate() ;
      P042C5_A396EmprCod = new String[] {""} ;
      P042C5_A30AlbProCod = new long[1] ;
      P042C5_A130BarCodPar = new String[] {""} ;
      P042C5_A132BarCodReo = new byte[1] ;
      P042C5_A129BarCod = new int[1] ;
      P042C5_A2010BarTipDis = new String[] {""} ;
      P042C5_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P042C5_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P042C5_A12195BarAlbUnd = new int[1] ;
      P042C5_A1652BarSerDsc = new String[] {""} ;
      P042C5_A212BarSer = new String[] {""} ;
      A130BarCodPar = "" ;
      A2010BarTipDis = "" ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1652BarSerDsc = "" ;
      A212BarSer = "" ;
      AV96BartipDis = "" ;
      P042C6_A396EmprCod = new String[] {""} ;
      P042C6_A30AlbProCod = new long[1] ;
      P042C6_A129BarCod = new int[1] ;
      P042C6_A132BarCodReo = new byte[1] ;
      P042C6_A130BarCodPar = new String[] {""} ;
      P042C6_A460FasDsc = new String[] {""} ;
      P042C6_A457FasCod = new String[] {""} ;
      P042C6_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P042C6_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P042C6_A1240GuiFasLin = new short[1] ;
      A460FasDsc = "" ;
      A457FasCod = "" ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A1275FasKgm = DecimalUtil.ZERO ;
      AV62Pd = "" ;
      AV70VarKgs = "" ;
      AV71Vconv = "" ;
      AV72Num9 = DecimalUtil.ZERO ;
      AV49CliNom = "" ;
      P042C7_A252CliCod = new int[1] ;
      P042C7_A396EmprCod = new String[] {""} ;
      P042C7_A279CliNom = new String[] {""} ;
      P042C7_A260CliDom = new String[] {""} ;
      P042C7_A295CliPob = new String[] {""} ;
      P042C7_A4828CliCp2 = new String[] {""} ;
      P042C7_A256CliCp = new String[] {""} ;
      P042C7_A278CliNif = new String[] {""} ;
      A279CliNom = "" ;
      A260CliDom = "" ;
      A295CliPob = "" ;
      A4828CliCp2 = "" ;
      A256CliCp = "" ;
      A278CliNif = "" ;
      AV78CliEnvNom = "" ;
      P042C8_A266CliEnvLin = new byte[1] ;
      P042C8_A252CliCod = new int[1] ;
      P042C8_A396EmprCod = new String[] {""} ;
      P042C8_A267CliEnvNom = new String[] {""} ;
      P042C8_A265CliEnvDom = new String[] {""} ;
      P042C8_A10775CliEnvCp2 = new String[] {""} ;
      P042C8_A264CliEnvCp = new String[] {""} ;
      P042C8_A268CliEnvPob = new String[] {""} ;
      A267CliEnvNom = "" ;
      A265CliEnvDom = "" ;
      A10775CliEnvCp2 = "" ;
      A264CliEnvCp = "" ;
      A268CliEnvPob = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pgrxml__default(),
         new Object[] {
             new Object[] {
            P042C2_A30AlbProCod, P042C2_A396EmprCod, P042C2_A39AlbProPri, P042C2_A5140AlbMarca
            }
            , new Object[] {
            P042C3_A396EmprCod, P042C3_A395EmprCif, P042C3_n395EmprCif, P042C3_A407EmprNom, P042C3_n407EmprNom, P042C3_A404EmprDir, P042C3_n404EmprDir, P042C3_A408EmprPob, P042C3_n408EmprPob, P042C3_A403EmprCpo,
            P042C3_n403EmprCpo
            }
            , new Object[] {
            P042C4_A30AlbProCod, P042C4_A396EmprCod, P042C4_A1259AlbDomEnv, P042C4_n1259AlbDomEnv, P042C4_A1243GuiRemCli, P042C4_A39AlbProPri, P042C4_A14073AlbPdSerAT, P042C4_A14074AlbPdTipAT, P042C4_A14069AlbPdATCUD, P042C4_A4023AlbFecSal,
            P042C4_A3865AlbHorSal, P042C4_A3868AlbMat
            }
            , new Object[] {
            P042C5_A396EmprCod, P042C5_A30AlbProCod, P042C5_A130BarCodPar, P042C5_A132BarCodReo, P042C5_A129BarCod, P042C5_A2010BarTipDis, P042C5_A1263BarAlbMtrE, P042C5_A1261BarAlbKgmE, P042C5_A12195BarAlbUnd, P042C5_A1652BarSerDsc,
            P042C5_A212BarSer
            }
            , new Object[] {
            P042C6_A396EmprCod, P042C6_A30AlbProCod, P042C6_A129BarCod, P042C6_A132BarCodReo, P042C6_A130BarCodPar, P042C6_A460FasDsc, P042C6_A457FasCod, P042C6_A1276FasMtr, P042C6_A1275FasKgm, P042C6_A1240GuiFasLin
            }
            , new Object[] {
            P042C7_A252CliCod, P042C7_A396EmprCod, P042C7_A279CliNom, P042C7_A260CliDom, P042C7_A295CliPob, P042C7_A4828CliCp2, P042C7_A256CliCp, P042C7_A278CliNif
            }
            , new Object[] {
            P042C8_A266CliEnvLin, P042C8_A252CliCod, P042C8_A396EmprCod, P042C8_A267CliEnvNom, P042C8_A265CliEnvDom, P042C8_A10775CliEnvCp2, P042C8_A264CliEnvCp, P042C8_A268CliEnvPob
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV84NumDoc ;
   private byte AV85NoMtsAt ;
   private byte AV88siatcud ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV89valorsiatcud ;
   private byte AV101GXLvl50 ;
   private byte A1259AlbDomEnv ;
   private byte AV82AlbDomenv ;
   private byte A132BarCodReo ;
   private byte A266CliEnvLin ;
   private short A1240GuiFasLin ;
   private short Gx_err ;
   private int GXt_int3 ;
   private int GXv_int6[] ;
   private int A1243GuiRemCli ;
   private int AV50Clicod ;
   private int A129BarCod ;
   private int A12195BarAlbUnd ;
   private int A252CliCod ;
   private long AV37AlbProcod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal AV72Num9 ;
   private String AV46Emprcod ;
   private String AV93pathIN ;
   private String AV40Fichero ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A39AlbProPri ;
   private String A5140AlbMarca ;
   private String AV76AlbProPri ;
   private String AV77AlbMarca ;
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
   private String A14073AlbPdSerAT ;
   private String A14074AlbPdTipAT ;
   private String A14069AlbPdATCUD ;
   private String A3865AlbHorSal ;
   private String A3868AlbMat ;
   private String AV83Doc ;
   private String AV86codValidacaoSerie ;
   private String AV87atcud ;
   private String AV61DateAux ;
   private String AV48CliNif ;
   private String AV51CliDom ;
   private String AV52CliPob ;
   private String AV53Cp ;
   private String AV79CliEnvDom ;
   private String AV80CliEnvPob ;
   private String AV81CpE ;
   private String AV58VarAux ;
   private String AV59HhSys ;
   private String A130BarCodPar ;
   private String A2010BarTipDis ;
   private String A1652BarSerDsc ;
   private String A212BarSer ;
   private String AV96BartipDis ;
   private String A460FasDsc ;
   private String A457FasCod ;
   private String AV62Pd ;
   private String AV70VarKgs ;
   private String AV71Vconv ;
   private String AV49CliNom ;
   private String A279CliNom ;
   private String A260CliDom ;
   private String A295CliPob ;
   private String A4828CliCp2 ;
   private String A256CliCp ;
   private String A278CliNif ;
   private String AV78CliEnvNom ;
   private String A267CliEnvNom ;
   private String A265CliEnvDom ;
   private String A10775CliEnvCp2 ;
   private String A264CliEnvCp ;
   private String A268CliEnvPob ;
   private java.util.Date AV68FecHorSal ;
   private java.util.Date AV67VarAux0 ;
   private java.util.Date A4023AlbFecSal ;
   private java.util.Date AV60FecSys ;
   private boolean AV91ok ;
   private boolean n395EmprCif ;
   private boolean n407EmprNom ;
   private boolean n404EmprDir ;
   private boolean n408EmprPob ;
   private boolean n403EmprCpo ;
   private boolean n1259AlbDomEnv ;
   private boolean returnInSub ;
   private String AV95path ;
   private String AV90documentnumber ;
   private boolean[] aP5 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 ;
   private IDataStoreProvider pr_default ;
   private long[] P042C2_A30AlbProCod ;
   private String[] P042C2_A396EmprCod ;
   private String[] P042C2_A39AlbProPri ;
   private String[] P042C2_A5140AlbMarca ;
   private String[] P042C3_A396EmprCod ;
   private String[] P042C3_A395EmprCif ;
   private boolean[] P042C3_n395EmprCif ;
   private String[] P042C3_A407EmprNom ;
   private boolean[] P042C3_n407EmprNom ;
   private String[] P042C3_A404EmprDir ;
   private boolean[] P042C3_n404EmprDir ;
   private String[] P042C3_A408EmprPob ;
   private boolean[] P042C3_n408EmprPob ;
   private String[] P042C3_A403EmprCpo ;
   private boolean[] P042C3_n403EmprCpo ;
   private long[] P042C4_A30AlbProCod ;
   private String[] P042C4_A396EmprCod ;
   private byte[] P042C4_A1259AlbDomEnv ;
   private boolean[] P042C4_n1259AlbDomEnv ;
   private int[] P042C4_A1243GuiRemCli ;
   private String[] P042C4_A39AlbProPri ;
   private String[] P042C4_A14073AlbPdSerAT ;
   private String[] P042C4_A14074AlbPdTipAT ;
   private String[] P042C4_A14069AlbPdATCUD ;
   private java.util.Date[] P042C4_A4023AlbFecSal ;
   private String[] P042C4_A3865AlbHorSal ;
   private String[] P042C4_A3868AlbMat ;
   private String[] P042C5_A396EmprCod ;
   private long[] P042C5_A30AlbProCod ;
   private String[] P042C5_A130BarCodPar ;
   private byte[] P042C5_A132BarCodReo ;
   private int[] P042C5_A129BarCod ;
   private String[] P042C5_A2010BarTipDis ;
   private java.math.BigDecimal[] P042C5_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P042C5_A1261BarAlbKgmE ;
   private int[] P042C5_A12195BarAlbUnd ;
   private String[] P042C5_A1652BarSerDsc ;
   private String[] P042C5_A212BarSer ;
   private String[] P042C6_A396EmprCod ;
   private long[] P042C6_A30AlbProCod ;
   private int[] P042C6_A129BarCod ;
   private byte[] P042C6_A132BarCodReo ;
   private String[] P042C6_A130BarCodPar ;
   private String[] P042C6_A460FasDsc ;
   private String[] P042C6_A457FasCod ;
   private java.math.BigDecimal[] P042C6_A1276FasMtr ;
   private java.math.BigDecimal[] P042C6_A1275FasKgm ;
   private short[] P042C6_A1240GuiFasLin ;
   private int[] P042C7_A252CliCod ;
   private String[] P042C7_A396EmprCod ;
   private String[] P042C7_A279CliNom ;
   private String[] P042C7_A260CliDom ;
   private String[] P042C7_A295CliPob ;
   private String[] P042C7_A4828CliCp2 ;
   private String[] P042C7_A256CliCp ;
   private String[] P042C7_A278CliNif ;
   private byte[] P042C8_A266CliEnvLin ;
   private int[] P042C8_A252CliCod ;
   private String[] P042C8_A396EmprCod ;
   private String[] P042C8_A267CliEnvNom ;
   private String[] P042C8_A265CliEnvDom ;
   private String[] P042C8_A10775CliEnvCp2 ;
   private String[] P042C8_A264CliEnvCp ;
   private String[] P042C8_A268CliEnvPob ;
   private com.genexus.xml.XMLWriter AV39filexml ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV92messages ;
   private com.genexus.SdtMessages_Message AV94Message ;
}

final  class pgrxml__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P042C2", "SELECT AlbProCod, EmprCod, AlbProPri, AlbMarca FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P042C3", "SELECT EmprCod, EmprCif, EmprNom, EmprDir, EmprPob, EmprCpo FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P042C4", "SELECT AlbProCod, EmprCod, AlbDomEnv, GuiRemCli, AlbProPri, AlbPdSerAT, AlbPdTipAT, AlbPdATCUD, AlbFecSal, AlbHorSal, AlbMat FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P042C5", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.BarTipDis, T1.BarAlbMtrE, T1.BarAlbKgmE, T1.BarAlbUnd, T2.BarSerDsc, T2.BarSer FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P042C6", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.FasDsc, T1.FasCod, T1.FasMtr, T1.FasKgm, T1.GuiFasLin FROM (TXPALBFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.GuiFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P042C7", "SELECT CliCod, EmprCod, CliNom, CliDom, CliPob, CliCp2, CliCp, CliNif FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P042C8", "SELECT CliEnvLin, CliCod, EmprCod, CliEnvNom, CliEnvDom, CliEnvCp2, CliEnvCp, CliEnvPob FROM TXPCLIENV WHERE EmprCod = ? and CliCod = ? and CliEnvLin = ? ORDER BY EmprCod, CliCod, CliEnvLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
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
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 20);
               ((String[]) buf[7])[0] = rslt.getString(7, 4);
               ((String[]) buf[8])[0] = rslt.getString(8, 20);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 8);
               ((String[]) buf[11])[0] = rslt.getString(11, 20);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 28);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 34);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               return;
            case 6 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 34);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
      }
   }

}

