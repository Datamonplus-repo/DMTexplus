package app.trabajosexternos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class trabajosexternos_xml_anulacion extends GXProcedure
{
   public trabajosexternos_xml_anulacion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trabajosexternos_xml_anulacion.class ), "" );
   }

   public trabajosexternos_xml_anulacion( int remoteHandle ,
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
      trabajosexternos_xml_anulacion.this.aP5 = new boolean[] {false};
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
      trabajosexternos_xml_anulacion.this.AV27Emprcod = aP0[0];
      this.aP0 = aP0;
      trabajosexternos_xml_anulacion.this.AV9AlbProcod = aP1[0];
      this.aP1 = aP1;
      trabajosexternos_xml_anulacion.this.AV57pathIN = aP2[0];
      this.aP2 = aP2;
      trabajosexternos_xml_anulacion.this.AV34Fichero = aP3[0];
      this.aP3 = aP3;
      trabajosexternos_xml_anulacion.this.aP4 = aP4;
      trabajosexternos_xml_anulacion.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV42ok = false ;
      GXt_int1 = AV41NumDoc ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV27Emprcod, httpContext.getMessage( "NUMDOC", ""), GXv_int2) ;
      trabajosexternos_xml_anulacion.this.GXt_int1 = GXv_int2[0] ;
      AV41NumDoc = GXt_int1 ;
      GXt_int1 = AV44siatcud ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV27Emprcod, httpContext.getMessage( "SIATCU", ""), GXv_int2) ;
      trabajosexternos_xml_anulacion.this.GXt_int1 = GXv_int2[0] ;
      AV44siatcud = GXt_int1 ;
      GXt_int3 = AV46valorsiatcud ;
      GXv_char4[0] = AV27Emprcod ;
      GXv_char5[0] = httpContext.getMessage( "SIATCU", "") ;
      GXv_int6[0] = GXt_int3 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char4, GXv_char5, GXv_int6) ;
      trabajosexternos_xml_anulacion.this.AV27Emprcod = GXv_char4[0] ;
      trabajosexternos_xml_anulacion.this.GXt_int3 = GXv_int6[0] ;
      AV46valorsiatcud = (byte)(GXt_int3) ;
      GXv_char5[0] = AV61contidsernew ;
      new app.trabajosexternos.obtengocodigoserieat(remoteHandle, context).execute( AV27Emprcod, httpContext.getMessage( "EXTHDR", ""), GXv_char5) ;
      trabajosexternos_xml_anulacion.this.AV61contidsernew = GXv_char5[0] ;
      /* Using cursor P0AK02 */
      pr_default.execute(0, new Object[] {AV27Emprcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P0AK02_A396EmprCod[0] ;
         A395EmprCif = P0AK02_A395EmprCif[0] ;
         n395EmprCif = P0AK02_n395EmprCif[0] ;
         A407EmprNom = P0AK02_A407EmprNom[0] ;
         n407EmprNom = P0AK02_n407EmprNom[0] ;
         A404EmprDir = P0AK02_A404EmprDir[0] ;
         n404EmprDir = P0AK02_n404EmprDir[0] ;
         A408EmprPob = P0AK02_A408EmprPob[0] ;
         n408EmprPob = P0AK02_n408EmprPob[0] ;
         A403EmprCpo = P0AK02_A403EmprCpo[0] ;
         n403EmprCpo = P0AK02_n403EmprCpo[0] ;
         AV26Emprcif = A395EmprCif ;
         AV30EmprNom = A407EmprNom ;
         AV29EmprDir = A404EmprDir ;
         AV31EmprPob = A408EmprPob ;
         AV28Emprcp = A403EmprCpo ;
         AV21Cp4 = GXutil.substring( AV28Emprcp, 1, 4) ;
         AV20Cp3 = GXutil.substring( AV28Emprcp, 5, 3) ;
         AV22Cp8 = AV21Cp4 + "-" + AV20Cp3 ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV60path += GXutil.trim( AV57pathIN) + "\\" + GXutil.trim( AV34Fichero) + httpContext.getMessage( ".xml", "") ;
      AV36filexml.openURL(AV60path);
      if ( AV36filexml.getErrCode() > 0 )
      {
         AV59Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
         AV59Message.setgxTv_SdtMessages_Message_Id( GXutil.trim( GXutil.str( AV36filexml.getErrCode(), 10, 2)) );
         AV59Message.setgxTv_SdtMessages_Message_Description( AV36filexml.getErrDescription()+httpContext.getMessage( " Error Open Fichero XML", "") );
         AV59Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
         AV58Messages.add(AV59Message, 0);
      }
      else
      {
         AV12Body = httpContext.getMessage( "S:Body", "") ;
         AV36filexml.writeStartElement(GXutil.trim( AV12Body));
         AV12Body = httpContext.getMessage( "envioDocumentoTransporteRequestElem ", "") ;
         AV36filexml.writeNSStartElement(GXutil.trim( AV12Body), httpContext.getMessage( "ns2", ""), httpContext.getMessage( "https://servicos.portaldasfinancas.gov.pt/sgdtws/documentosTransporte/", ""));
         AV66GXLvl40 = (byte)(0) ;
         /* Using cursor P0AK03 */
         pr_default.execute(1, new Object[] {AV27Emprcod, Integer.valueOf(AV9AlbProcod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A2253SalExtAlb = P0AK03_A2253SalExtAlb[0] ;
            A396EmprCod = P0AK03_A396EmprCod[0] ;
            A10741SalEnvAT = P0AK03_A10741SalEnvAT[0] ;
            A2248ManCod = P0AK03_A2248ManCod[0] ;
            A14349SalExtSerA = P0AK03_A14349SalExtSerA[0] ;
            A14350SalExtTipA = P0AK03_A14350SalExtTipA[0] ;
            A14348SalExtATCU = P0AK03_A14348SalExtATCU[0] ;
            A10742SalCodeID = P0AK03_A10742SalCodeID[0] ;
            A2256SalExtFec = P0AK03_A2256SalExtFec[0] ;
            A6396SalExtHor = P0AK03_A6396SalExtHor[0] ;
            A6397SalExtMat = P0AK03_A6397SalExtMat[0] ;
            AV66GXLvl40 = (byte)(1) ;
            AV62Mancod = A2248ManCod ;
            /* Execute user subroutine: 'MANUFA' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV12Body = httpContext.getMessage( "TaxRegistrationNumber", "") ;
            AV36filexml.writeElement(AV12Body, GXutil.trim( AV26Emprcif));
            AV12Body = httpContext.getMessage( "CompanyName", "") ;
            AV36filexml.writeElement(AV12Body, GXutil.trim( AV30EmprNom));
            AV36filexml.writeStartElement(httpContext.getMessage( "CompanyAddress", ""));
            AV36filexml.writeElement(httpContext.getMessage( "Addressdetail", ""), GXutil.trim( AV29EmprDir));
            AV36filexml.writeElement(httpContext.getMessage( "City", ""), GXutil.trim( AV31EmprPob));
            AV36filexml.writeElement(httpContext.getMessage( "PostalCode", ""), GXutil.trim( AV22Cp8));
            AV36filexml.writeElement(httpContext.getMessage( "Country", ""), httpContext.getMessage( "PT", ""));
            AV36filexml.writeEndElement();
            AV24Doc = "5" + GXutil.padl( GXutil.trim( GXutil.str( AV9AlbProcod, 8, 0)), (short)(8), "0") ;
            if ( ( AV44siatcud == 1 ) && ( AV46valorsiatcud == 1 ) )
            {
               AV25documentnumber = GXutil.trim( A14350SalExtTipA) + " " + GXutil.trim( A14349SalExtSerA) + "/" + GXutil.trim( GXutil.str( AV9AlbProcod, 8, 0)) ;
               AV36filexml.writeElement(httpContext.getMessage( "DocumentNumber", ""), GXutil.trim( AV25documentnumber));
            }
            else
            {
               if ( AV41NumDoc == 0 )
               {
                  AV36filexml.writeElement(httpContext.getMessage( "DocumentNumber", ""), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbProcod), 8, 0));
               }
               else
               {
                  AV36filexml.writeElement(httpContext.getMessage( "DocumentNumber", ""), AV24Doc);
               }
            }
            AV18codValidacaoSerie = A14348SalExtATCU ;
            AV10atcud = ((GXutil.strcmp("", AV18codValidacaoSerie)==0) ? "" : GXutil.trim( AV18codValidacaoSerie)+"-"+GXutil.trim( GXutil.str( AV9AlbProcod, 8, 0))) ;
            AV36filexml.writeElement(httpContext.getMessage( "ATCUD", ""), GXutil.trim( AV10atcud));
            AV36filexml.writeElement(httpContext.getMessage( "ATDocCodeID", ""), GXutil.trim( A10742SalCodeID));
            AV36filexml.writeElement(httpContext.getMessage( "MovementStatus", ""), httpContext.getMessage( "A", ""));
            AV23DateAux = GXutil.trim( GXutil.str( GXutil.year( A2256SalExtFec), 10, 0)) ;
            if ( GXutil.month( A2256SalExtFec) < 10 )
            {
               AV23DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.month( A2256SalExtFec), 10, 0)) ;
            }
            else
            {
               AV23DateAux += "-" + GXutil.trim( GXutil.str( GXutil.month( A2256SalExtFec), 10, 0)) ;
            }
            if ( GXutil.day( A2256SalExtFec) < 10 )
            {
               AV23DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.day( A2256SalExtFec), 10, 0)) ;
            }
            else
            {
               AV23DateAux += "-" + GXutil.trim( GXutil.str( GXutil.day( A2256SalExtFec), 10, 0)) ;
            }
            AV12Body = AV23DateAux ;
            AV36filexml.writeElement(httpContext.getMessage( "MovementDate", ""), GXutil.trim( AV12Body));
            AV36filexml.writeElement(httpContext.getMessage( "MovementType", ""), httpContext.getMessage( "GT", ""));
            AV36filexml.writeElement(httpContext.getMessage( "CustomerTaxID", ""), GXutil.trim( AV15CliNif));
            AV36filexml.writeStartElement(httpContext.getMessage( "CustomerAddress", ""));
            AV36filexml.writeElement(httpContext.getMessage( "Addressdetail", ""), GXutil.trim( AV14CliDom));
            AV36filexml.writeElement(httpContext.getMessage( "City", ""), GXutil.trim( AV17CliPob));
            AV36filexml.writeElement(httpContext.getMessage( "PostalCode", ""), GXutil.trim( AV19Cp));
            AV36filexml.writeElement(httpContext.getMessage( "Country", ""), httpContext.getMessage( "PT", ""));
            AV36filexml.writeEndElement();
            AV36filexml.writeStartElement(httpContext.getMessage( "AddressTo", ""));
            AV36filexml.writeElement(httpContext.getMessage( "Addressdetail", ""), GXutil.trim( AV14CliDom));
            AV36filexml.writeElement(httpContext.getMessage( "City", ""), GXutil.trim( AV17CliPob));
            AV36filexml.writeElement(httpContext.getMessage( "PostalCode", ""), GXutil.trim( AV19Cp));
            AV36filexml.writeElement(httpContext.getMessage( "Country", ""), httpContext.getMessage( "PT", ""));
            AV36filexml.writeEndElement();
            AV36filexml.writeStartElement(httpContext.getMessage( "AddressFrom", ""));
            AV36filexml.writeElement(httpContext.getMessage( "Addressdetail", ""), GXutil.trim( AV29EmprDir));
            AV36filexml.writeElement(httpContext.getMessage( "City", ""), GXutil.trim( AV31EmprPob));
            AV36filexml.writeElement(httpContext.getMessage( "PostalCode", ""), GXutil.trim( AV22Cp8));
            AV36filexml.writeElement(httpContext.getMessage( "Country", ""), httpContext.getMessage( "PT", ""));
            AV36filexml.writeEndElement();
            AV47VarAux = localUtil.dtoc( A2256SalExtFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + A6396SalExtHor ;
            AV32FecHorSal = localUtil.ctot( AV47VarAux, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV48VarAux0 = AV32FecHorSal ;
            AV47VarAux = localUtil.ttoc( AV48VarAux0, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            AV37HhSys = GXutil.substring( AV47VarAux, 12, 8) ;
            AV33FecSys = localUtil.ctod( GXutil.substring( AV47VarAux, 1, 10), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV23DateAux = GXutil.trim( GXutil.str( GXutil.year( AV33FecSys), 10, 0)) ;
            if ( GXutil.month( AV33FecSys) < 10 )
            {
               AV23DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.month( AV33FecSys), 10, 0)) ;
            }
            else
            {
               AV23DateAux += "-" + GXutil.trim( GXutil.str( GXutil.month( AV33FecSys), 10, 0)) ;
            }
            if ( GXutil.day( AV33FecSys) < 10 )
            {
               AV23DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.day( AV33FecSys), 10, 0)) ;
            }
            else
            {
               AV23DateAux += "-" + GXutil.trim( GXutil.str( GXutil.day( AV33FecSys), 10, 0)) ;
            }
            AV12Body = AV23DateAux + httpContext.getMessage( "T", "") + AV37HhSys ;
            AV36filexml.writeElement(httpContext.getMessage( "MovementStartTime", ""), GXutil.trim( AV12Body));
            AV12Body = "0" ;
            if ( GXutil.strcmp(A6397SalExtMat, " ") != 0 )
            {
               AV12Body = A6397SalExtMat ;
            }
            AV36filexml.writeElement(httpContext.getMessage( "VehicleID", ""), GXutil.trim( AV12Body));
            /* Using cursor P0AK04 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A6558FasCodn = P0AK04_A6558FasCodn[0] ;
               A1652BarSerDsc = P0AK04_A1652BarSerDsc[0] ;
               A212BarSer = P0AK04_A212BarSer[0] ;
               A6256SalExKgE = P0AK04_A6256SalExKgE[0] ;
               A130BarCodPar = P0AK04_A130BarCodPar[0] ;
               A132BarCodReo = P0AK04_A132BarCodReo[0] ;
               A129BarCod = P0AK04_A129BarCod[0] ;
               A6248SalExNln = P0AK04_A6248SalExNln[0] ;
               A1652BarSerDsc = P0AK04_A1652BarSerDsc[0] ;
               A212BarSer = P0AK04_A212BarSer[0] ;
               AV36filexml.writeStartElement(httpContext.getMessage( "Line", ""));
               AV43Pd = GXutil.trim( A212BarSer) + "-" + GXutil.trim( A1652BarSerDsc) + "-" + GXutil.trim( A6558FasCodn) ;
               AV36filexml.writeElement(httpContext.getMessage( "ProductDescription", ""), GXutil.trim( AV43Pd));
               AV49VarKgs = GXutil.padl( GXutil.trim( GXutil.str( A6256SalExKgE, 9, 2)), (short)(9), " ") ;
               AV50Vconv = GXutil.substring( AV49VarKgs, 1, 6) + "." + GXutil.substring( AV49VarKgs, 8, 9) ;
               AV40Num9 = CommonUtil.decimalVal( AV50Vconv, ".") ;
               AV36filexml.writeElement(httpContext.getMessage( "Quantity", ""), GXutil.trim( AV49VarKgs));
               AV36filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), httpContext.getMessage( "KG", ""));
               AV36filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), "0");
               AV36filexml.writeEndElement();
               pr_default.readNext(2);
            }
            pr_default.close(2);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         if ( AV66GXLvl40 == 0 )
         {
            AV59Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
            AV59Message.setgxTv_SdtMessages_Message_Id( "0" );
            AV59Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "NO existe Registro", "") );
            AV59Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
            AV58Messages.add(AV59Message, 0);
         }
         AV36filexml.writeEndElement();
         AV36filexml.writeEndElement();
         AV36filexml.close();
         AV42ok = true ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'MANUFA' Routine */
      returnInSub = false ;
      AV16CliNom = " " ;
      AV14CliDom = " " ;
      AV17CliPob = " " ;
      AV19Cp = " " ;
      AV15CliNif = " " ;
      /* Using cursor P0AK05 */
      pr_default.execute(3, new Object[] {AV27Emprcod, Short.valueOf(AV62Mancod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A2248ManCod = P0AK05_A2248ManCod[0] ;
         A396EmprCod = P0AK05_A396EmprCod[0] ;
         A2249ManNom = P0AK05_A2249ManNom[0] ;
         n2249ManNom = P0AK05_n2249ManNom[0] ;
         A2250ManDom = P0AK05_A2250ManDom[0] ;
         n2250ManDom = P0AK05_n2250ManDom[0] ;
         A2251ManPob = P0AK05_A2251ManPob[0] ;
         n2251ManPob = P0AK05_n2251ManPob[0] ;
         A10743ManCp2 = P0AK05_A10743ManCp2[0] ;
         n10743ManCp2 = P0AK05_n10743ManCp2[0] ;
         A2252ManCpo = P0AK05_A2252ManCpo[0] ;
         n2252ManCpo = P0AK05_n2252ManCpo[0] ;
         A3302ManNif = P0AK05_A3302ManNif[0] ;
         n3302ManNif = P0AK05_n3302ManNif[0] ;
         AV16CliNom = A2249ManNom ;
         AV14CliDom = A2250ManDom ;
         AV17CliPob = A2251ManPob ;
         AV19Cp = GXutil.trim( A2252ManCpo) + "-" + GXutil.trim( A10743ManCp2) ;
         AV15CliNif = A3302ManNif ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP0[0] = trabajosexternos_xml_anulacion.this.AV27Emprcod;
      this.aP1[0] = trabajosexternos_xml_anulacion.this.AV9AlbProcod;
      this.aP2[0] = trabajosexternos_xml_anulacion.this.AV57pathIN;
      this.aP3[0] = trabajosexternos_xml_anulacion.this.AV34Fichero;
      this.aP4[0] = trabajosexternos_xml_anulacion.this.AV58Messages;
      this.aP5[0] = trabajosexternos_xml_anulacion.this.AV42ok;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV58Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_int2 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new int[1] ;
      AV61contidsernew = "" ;
      GXv_char5 = new String[1] ;
      scmdbuf = "" ;
      P0AK02_A396EmprCod = new String[] {""} ;
      P0AK02_A395EmprCif = new String[] {""} ;
      P0AK02_n395EmprCif = new boolean[] {false} ;
      P0AK02_A407EmprNom = new String[] {""} ;
      P0AK02_n407EmprNom = new boolean[] {false} ;
      P0AK02_A404EmprDir = new String[] {""} ;
      P0AK02_n404EmprDir = new boolean[] {false} ;
      P0AK02_A408EmprPob = new String[] {""} ;
      P0AK02_n408EmprPob = new boolean[] {false} ;
      P0AK02_A403EmprCpo = new String[] {""} ;
      P0AK02_n403EmprCpo = new boolean[] {false} ;
      A396EmprCod = "" ;
      A395EmprCif = "" ;
      A407EmprNom = "" ;
      A404EmprDir = "" ;
      A408EmprPob = "" ;
      A403EmprCpo = "" ;
      AV26Emprcif = "" ;
      AV30EmprNom = "" ;
      AV29EmprDir = "" ;
      AV31EmprPob = "" ;
      AV28Emprcp = "" ;
      AV21Cp4 = "" ;
      AV20Cp3 = "" ;
      AV22Cp8 = "" ;
      AV60path = "" ;
      AV36filexml = new com.genexus.xml.XMLWriter();
      AV59Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV12Body = "" ;
      P0AK03_A2253SalExtAlb = new int[1] ;
      P0AK03_A396EmprCod = new String[] {""} ;
      P0AK03_A10741SalEnvAT = new byte[1] ;
      P0AK03_A2248ManCod = new short[1] ;
      P0AK03_A14349SalExtSerA = new String[] {""} ;
      P0AK03_A14350SalExtTipA = new String[] {""} ;
      P0AK03_A14348SalExtATCU = new String[] {""} ;
      P0AK03_A10742SalCodeID = new String[] {""} ;
      P0AK03_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0AK03_A6396SalExtHor = new String[] {""} ;
      P0AK03_A6397SalExtMat = new String[] {""} ;
      A14349SalExtSerA = "" ;
      A14350SalExtTipA = "" ;
      A14348SalExtATCU = "" ;
      A10742SalCodeID = "" ;
      A2256SalExtFec = GXutil.nullDate() ;
      A6396SalExtHor = "" ;
      A6397SalExtMat = "" ;
      AV24Doc = "" ;
      AV25documentnumber = "" ;
      AV18codValidacaoSerie = "" ;
      AV10atcud = "" ;
      AV23DateAux = "" ;
      AV15CliNif = "" ;
      AV14CliDom = "" ;
      AV17CliPob = "" ;
      AV19Cp = "" ;
      AV47VarAux = "" ;
      AV32FecHorSal = GXutil.resetTime( GXutil.nullDate() );
      AV48VarAux0 = GXutil.resetTime( GXutil.nullDate() );
      AV37HhSys = "" ;
      AV33FecSys = GXutil.nullDate() ;
      P0AK04_A396EmprCod = new String[] {""} ;
      P0AK04_A2253SalExtAlb = new int[1] ;
      P0AK04_A6558FasCodn = new String[] {""} ;
      P0AK04_A1652BarSerDsc = new String[] {""} ;
      P0AK04_A212BarSer = new String[] {""} ;
      P0AK04_A6256SalExKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AK04_A130BarCodPar = new String[] {""} ;
      P0AK04_A132BarCodReo = new byte[1] ;
      P0AK04_A129BarCod = new int[1] ;
      P0AK04_A6248SalExNln = new short[1] ;
      A6558FasCodn = "" ;
      A1652BarSerDsc = "" ;
      A212BarSer = "" ;
      A6256SalExKgE = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      AV43Pd = "" ;
      AV49VarKgs = "" ;
      AV50Vconv = "" ;
      AV40Num9 = DecimalUtil.ZERO ;
      AV16CliNom = "" ;
      P0AK05_A2248ManCod = new short[1] ;
      P0AK05_A396EmprCod = new String[] {""} ;
      P0AK05_A2249ManNom = new String[] {""} ;
      P0AK05_n2249ManNom = new boolean[] {false} ;
      P0AK05_A2250ManDom = new String[] {""} ;
      P0AK05_n2250ManDom = new boolean[] {false} ;
      P0AK05_A2251ManPob = new String[] {""} ;
      P0AK05_n2251ManPob = new boolean[] {false} ;
      P0AK05_A10743ManCp2 = new String[] {""} ;
      P0AK05_n10743ManCp2 = new boolean[] {false} ;
      P0AK05_A2252ManCpo = new String[] {""} ;
      P0AK05_n2252ManCpo = new boolean[] {false} ;
      P0AK05_A3302ManNif = new String[] {""} ;
      P0AK05_n3302ManNif = new boolean[] {false} ;
      A2249ManNom = "" ;
      A2250ManDom = "" ;
      A2251ManPob = "" ;
      A10743ManCp2 = "" ;
      A2252ManCpo = "" ;
      A3302ManNif = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.trabajosexternos_xml_anulacion__default(),
         new Object[] {
             new Object[] {
            P0AK02_A396EmprCod, P0AK02_A395EmprCif, P0AK02_n395EmprCif, P0AK02_A407EmprNom, P0AK02_n407EmprNom, P0AK02_A404EmprDir, P0AK02_n404EmprDir, P0AK02_A408EmprPob, P0AK02_n408EmprPob, P0AK02_A403EmprCpo,
            P0AK02_n403EmprCpo
            }
            , new Object[] {
            P0AK03_A2253SalExtAlb, P0AK03_A396EmprCod, P0AK03_A10741SalEnvAT, P0AK03_A2248ManCod, P0AK03_A14349SalExtSerA, P0AK03_A14350SalExtTipA, P0AK03_A14348SalExtATCU, P0AK03_A10742SalCodeID, P0AK03_A2256SalExtFec, P0AK03_A6396SalExtHor,
            P0AK03_A6397SalExtMat
            }
            , new Object[] {
            P0AK04_A396EmprCod, P0AK04_A2253SalExtAlb, P0AK04_A6558FasCodn, P0AK04_A1652BarSerDsc, P0AK04_A212BarSer, P0AK04_A6256SalExKgE, P0AK04_A130BarCodPar, P0AK04_A132BarCodReo, P0AK04_A129BarCod, P0AK04_A6248SalExNln
            }
            , new Object[] {
            P0AK05_A2248ManCod, P0AK05_A396EmprCod, P0AK05_A2249ManNom, P0AK05_n2249ManNom, P0AK05_A2250ManDom, P0AK05_n2250ManDom, P0AK05_A2251ManPob, P0AK05_n2251ManPob, P0AK05_A10743ManCp2, P0AK05_n10743ManCp2,
            P0AK05_A2252ManCpo, P0AK05_n2252ManCpo, P0AK05_A3302ManNif, P0AK05_n3302ManNif
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV41NumDoc ;
   private byte AV44siatcud ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV46valorsiatcud ;
   private byte AV66GXLvl40 ;
   private byte A10741SalEnvAT ;
   private byte A132BarCodReo ;
   private short A2248ManCod ;
   private short AV62Mancod ;
   private short A6248SalExNln ;
   private short Gx_err ;
   private int AV9AlbProcod ;
   private int GXt_int3 ;
   private int GXv_int6[] ;
   private int A2253SalExtAlb ;
   private int A129BarCod ;
   private java.math.BigDecimal A6256SalExKgE ;
   private java.math.BigDecimal AV40Num9 ;
   private String AV27Emprcod ;
   private String AV57pathIN ;
   private String AV34Fichero ;
   private String GXv_char4[] ;
   private String AV61contidsernew ;
   private String GXv_char5[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A395EmprCif ;
   private String A407EmprNom ;
   private String A404EmprDir ;
   private String A408EmprPob ;
   private String A403EmprCpo ;
   private String AV26Emprcif ;
   private String AV30EmprNom ;
   private String AV29EmprDir ;
   private String AV31EmprPob ;
   private String AV28Emprcp ;
   private String AV21Cp4 ;
   private String AV20Cp3 ;
   private String AV22Cp8 ;
   private String AV12Body ;
   private String A14349SalExtSerA ;
   private String A14350SalExtTipA ;
   private String A14348SalExtATCU ;
   private String A10742SalCodeID ;
   private String A6396SalExtHor ;
   private String A6397SalExtMat ;
   private String AV24Doc ;
   private String AV18codValidacaoSerie ;
   private String AV23DateAux ;
   private String AV15CliNif ;
   private String AV14CliDom ;
   private String AV17CliPob ;
   private String AV19Cp ;
   private String AV47VarAux ;
   private String AV37HhSys ;
   private String A6558FasCodn ;
   private String A1652BarSerDsc ;
   private String A212BarSer ;
   private String A130BarCodPar ;
   private String AV43Pd ;
   private String AV49VarKgs ;
   private String AV50Vconv ;
   private String AV16CliNom ;
   private String A2249ManNom ;
   private String A2250ManDom ;
   private String A2251ManPob ;
   private String A10743ManCp2 ;
   private String A2252ManCpo ;
   private String A3302ManNif ;
   private java.util.Date AV32FecHorSal ;
   private java.util.Date AV48VarAux0 ;
   private java.util.Date A2256SalExtFec ;
   private java.util.Date AV33FecSys ;
   private boolean AV42ok ;
   private boolean n395EmprCif ;
   private boolean n407EmprNom ;
   private boolean n404EmprDir ;
   private boolean n408EmprPob ;
   private boolean n403EmprCpo ;
   private boolean returnInSub ;
   private boolean n2249ManNom ;
   private boolean n2250ManDom ;
   private boolean n2251ManPob ;
   private boolean n10743ManCp2 ;
   private boolean n2252ManCpo ;
   private boolean n3302ManNif ;
   private String AV60path ;
   private String AV25documentnumber ;
   private String AV10atcud ;
   private boolean[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AK02_A396EmprCod ;
   private String[] P0AK02_A395EmprCif ;
   private boolean[] P0AK02_n395EmprCif ;
   private String[] P0AK02_A407EmprNom ;
   private boolean[] P0AK02_n407EmprNom ;
   private String[] P0AK02_A404EmprDir ;
   private boolean[] P0AK02_n404EmprDir ;
   private String[] P0AK02_A408EmprPob ;
   private boolean[] P0AK02_n408EmprPob ;
   private String[] P0AK02_A403EmprCpo ;
   private boolean[] P0AK02_n403EmprCpo ;
   private int[] P0AK03_A2253SalExtAlb ;
   private String[] P0AK03_A396EmprCod ;
   private byte[] P0AK03_A10741SalEnvAT ;
   private short[] P0AK03_A2248ManCod ;
   private String[] P0AK03_A14349SalExtSerA ;
   private String[] P0AK03_A14350SalExtTipA ;
   private String[] P0AK03_A14348SalExtATCU ;
   private String[] P0AK03_A10742SalCodeID ;
   private java.util.Date[] P0AK03_A2256SalExtFec ;
   private String[] P0AK03_A6396SalExtHor ;
   private String[] P0AK03_A6397SalExtMat ;
   private String[] P0AK04_A396EmprCod ;
   private int[] P0AK04_A2253SalExtAlb ;
   private String[] P0AK04_A6558FasCodn ;
   private String[] P0AK04_A1652BarSerDsc ;
   private String[] P0AK04_A212BarSer ;
   private java.math.BigDecimal[] P0AK04_A6256SalExKgE ;
   private String[] P0AK04_A130BarCodPar ;
   private byte[] P0AK04_A132BarCodReo ;
   private int[] P0AK04_A129BarCod ;
   private short[] P0AK04_A6248SalExNln ;
   private short[] P0AK05_A2248ManCod ;
   private String[] P0AK05_A396EmprCod ;
   private String[] P0AK05_A2249ManNom ;
   private boolean[] P0AK05_n2249ManNom ;
   private String[] P0AK05_A2250ManDom ;
   private boolean[] P0AK05_n2250ManDom ;
   private String[] P0AK05_A2251ManPob ;
   private boolean[] P0AK05_n2251ManPob ;
   private String[] P0AK05_A10743ManCp2 ;
   private boolean[] P0AK05_n10743ManCp2 ;
   private String[] P0AK05_A2252ManCpo ;
   private boolean[] P0AK05_n2252ManCpo ;
   private String[] P0AK05_A3302ManNif ;
   private boolean[] P0AK05_n3302ManNif ;
   private com.genexus.xml.XMLWriter AV36filexml ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV58Messages ;
   private com.genexus.SdtMessages_Message AV59Message ;
}

final  class trabajosexternos_xml_anulacion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AK02", "SELECT EmprCod, EmprCif, EmprNom, EmprDir, EmprPob, EmprCpo FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AK03", "SELECT SalExtAlb, EmprCod, SalEnvAT, ManCod, SalExtSerA, SalExtTipA, SalExtATCU, SalCodeID, SalExtFec, SalExtHor, SalExtMat FROM TXPCEXTSA WHERE EmprCod = ? and SalExtAlb = ? ORDER BY EmprCod, SalExtAlb ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AK04", "SELECT T1.EmprCod, T1.SalExtAlb, T1.FasCodn, T2.BarSerDsc, T2.BarSer, T1.SalExKgE, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.SalExNln FROM (TXPEXHDPZ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.SalExtAlb = ? ORDER BY T1.EmprCod, T1.SalExtAlb, T1.SalExNln, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AK05", "SELECT ManCod, EmprCod, ManNom, ManDom, ManPob, ManCp2, ManCpo, ManNif FROM TXPMANUFA WHERE EmprCod = ? and ManCod = ? ORDER BY EmprCod, ManCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 4);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 34);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 20);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

