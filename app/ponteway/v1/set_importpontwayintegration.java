package app.ponteway.v1 ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class set_importpontwayintegration extends GXProcedure
{
   public set_importpontwayintegration( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( set_importpontwayintegration.class ), "" );
   }

   public set_importpontwayintegration( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public com.genexus.SdtMessages_Message executeUdp( GXBaseCollection<app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas> aP0 )
   {
      set_importpontwayintegration.this.aP1 = new com.genexus.SdtMessages_Message[] {new com.genexus.SdtMessages_Message()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( GXBaseCollection<app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas> aP0 ,
                        com.genexus.SdtMessages_Message[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( GXBaseCollection<app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas> aP0 ,
                             com.genexus.SdtMessages_Message[] aP1 )
   {
      set_importpontwayintegration.this.AV8GuiaRemessaLinhaItemDTO = aP0;
      set_importpontwayintegration.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV26Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      set_importpontwayintegration.this.GXt_char1 = GXv_char2[0] ;
      AV26Station = GXt_char1 ;
      GXv_char2[0] = AV23EmprCod ;
      GXv_char3[0] = AV24EmprNom ;
      GXv_char4[0] = AV25UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV26Station, GXv_char2, GXv_char3, GXv_char4) ;
      set_importpontwayintegration.this.AV23EmprCod = GXv_char2[0] ;
      set_importpontwayintegration.this.AV24EmprNom = GXv_char3[0] ;
      set_importpontwayintegration.this.AV25UsurCod = GXv_char4[0] ;
      AV95GXV1 = 1 ;
      while ( AV95GXV1 <= AV8GuiaRemessaLinhaItemDTO.size() )
      {
         AV9GuiaRemessaLinhaItemDTO_Item = (app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV8GuiaRemessaLinhaItemDTO.elementAt(-1+AV95GXV1));
         if ( AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Selected() && ( GXutil.len( AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Entrada()) <= 1 ) )
         {
            AV10OgGuiaImport = (app.ponteway.v1.SdtOgGuiaImport)new app.ponteway.v1.SdtOgGuiaImport( remoteHandle, context);
            AV10OgGuiaImport.setgxTv_SdtOgGuiaImport_Oglinha( AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Linha() );
            AV10OgGuiaImport.setgxTv_SdtOgGuiaImport_Ogemprcod( AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Emprcod() );
            AV10OgGuiaImport.setgxTv_SdtOgGuiaImport_Ogclicod( AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codfornecedor() );
            AV10OgGuiaImport.setgxTv_SdtOgGuiaImport_Ogfecha( AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fecha() );
            AV10OgGuiaImport.setgxTv_SdtOgGuiaImport_Ogreferen( AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Referencia() );
            AV10OgGuiaImport.setgxTv_SdtOgGuiaImport_Ogcodart( GXutil.trim( AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Referencia()) );
            AV10OgGuiaImport.setgxTv_SdtOgGuiaImport_Ogrolos( AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos() );
            AV10OgGuiaImport.setgxTv_SdtOgGuiaImport_Ogrolos_( AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos_anterior() );
            AV10OgGuiaImport.setgxTv_SdtOgGuiaImport_Ogquant( AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade() );
            AV10OgGuiaImport.setgxTv_SdtOgGuiaImport_Ogquant_( AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade_anterior() );
            AV10OgGuiaImport.setgxTv_SdtOgGuiaImport_Ogunidad( AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Unidade() );
            AV10OgGuiaImport.setgxTv_SdtOgGuiaImport_Ogunidad_( AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Unidade_anterior() );
            AV10OgGuiaImport.setgxTv_SdtOgGuiaImport_Ogreclam( AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Reclamacion() );
            AV10OgGuiaImport.setgxTv_SdtOgGuiaImport_Oglote( AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lote() );
            AV10OgGuiaImport.setgxTv_SdtOgGuiaImport_Ogjogo( AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Jogo() );
            AV10OgGuiaImport.setgxTv_SdtOgGuiaImport_Ogpoleg( AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Polegadas() );
            AV10OgGuiaImport.setgxTv_SdtOgGuiaImport_Ogfio( AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio() );
            AV10OgGuiaImport.setgxTv_SdtOgGuiaImport_Ogfio_( AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio_anterior() );
            AV10OgGuiaImport.setgxTv_SdtOgGuiaImport_Ogmaqui( AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Maquina() );
            AV10OgGuiaImport.setgxTv_SdtOgGuiaImport_Ogvossar( AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Vossarequisicao() );
            AV10OgGuiaImport.setgxTv_SdtOgGuiaImport_Ogarticr( AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigoclientecr() );
            AV10OgGuiaImport.setgxTv_SdtOgGuiaImport_Ogartiac( AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigoclienteac() );
            AV10OgGuiaImport.setgxTv_SdtOgGuiaImport_Ogentrada( "IMPORTED" );
            AV10OgGuiaImport.setgxTv_SdtOgGuiaImport_Ognmrguia( AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Nmrgui() );
            AV10OgGuiaImport.setgxTv_SdtOgGuiaImport_Ogserie( AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Serie() );
            AV10OgGuiaImport.setgxTv_SdtOgGuiaImport_Oglocalizc_( AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localizacao_anterior() );
            AV10OgGuiaImport.setgxTv_SdtOgGuiaImport_Oglocalizac( AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localizacao() );
            AV10OgGuiaImport.Save();
            if ( AV10OgGuiaImport.Success() )
            {
               AV13Message.setgxTv_SdtMessages_Message_Id( "200" );
               AV13Message.setgxTv_SdtMessages_Message_Type( (byte)(2) );
               AV13Message.setgxTv_SdtMessages_Message_Description( GXutil.format( httpContext.getMessage( "Importa %1,%2,%3 Realizado con éxito!", ""), AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Vossarequisicao(), GXutil.ltrimstr( AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codfornecedor(), 10, 0), GXutil.ltrimstr( AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Linha(), 10, 0), "", "", "", "", "", "") );
               AV72Linha = AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Linha() ;
               AV68AlbREnt = AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Serienmrguia() ;
               AV27CliCod = (int)(AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codfornecedor()) ;
               AV79EmpreCod = AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Emprcod() ;
               AV18AlbRTam = AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Afn() ;
               AV17ALBRloc = AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localizacao() ;
               AV76AlbRTelar = AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio() ;
               AV44AlbMaqTej = AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Tear() ;
               AV81Albrdiscli = AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Ordemtingimento() ;
               AV28AlbRef = GXutil.trim( AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Referencia()) ;
               AV87ALBRREO = AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Reclamacion() ;
               AV89AlbRObs = AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Observacoes() ;
               AV49AlbNumB = AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Relatoriocomposicao() ;
               AV88AlbRLot2 = AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lote() ;
               AV40AlbRLote = GXutil.substring( AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lote(), 1, 20) ;
               AV69AlbRUni = AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Unidade() ;
               AV91AlbrUniC = AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade_anterior() ;
               AV47AlbRUniEnt = AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade() ;
               AV80AlbrPieC = AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos_anterior() ;
               AV41AlbRPieEnt = AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos() ;
               AV35TipEntCod = (short)(1) ;
               AV42AlbRLu = CommonUtil.decimalVal( AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Polegadas(), ".") ;
               AV82AlbRMdlCod = AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Jogo() ;
               AV43AlbGalga = (short)(0) ;
               AV34AlbREst = (byte)(0) ;
               AV19AlbOpsT = "IMPORTED" ;
               AV86AlbRTara = AV9GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lfa() ;
               Application.commitDataStores(context, remoteHandle, pr_default, "ponteway.v1.set_importpontwayintegration");
               AV73ogLinha = AV72Linha ;
               AV74ogEmprCod = AV79EmpreCod ;
               AV75ogCliCod = AV27CliCod ;
               /* Execute user subroutine: 'SET_ALBREC' */
               S111 ();
               if ( returnInSub )
               {
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            else
            {
               AV13Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)(AV10OgGuiaImport.GetMessages().currentItem()));
               new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).error(httpContext.getMessage( "SET_ImportPontWayIntegration : ", "")+AV13Message.toJSonString(false, true), AV96Pgmdesc) ;
               Application.rollbackDataStores(context, remoteHandle, pr_default, "ponteway.v1.set_importpontwayintegration");
            }
         }
         AV95GXV1 = (int)(AV95GXV1+1) ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SET_ALBREC' Routine */
      returnInSub = false ;
      AV78BC_ALBREC = (app.SdtBC_ALBREC)new app.SdtBC_ALBREC( remoteHandle, context);
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Emprcod( AV23EmprCod );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Clicod( AV27CliCod );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albref( AV28AlbRef );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Trncod( (short)(0) );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albrent( GXutil.trim( GXutil.substring( AV68AlbREnt, 3, GXutil.len( AV68AlbREnt))) );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Tipentcod( AV35TipEntCod );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albruni( ((GXutil.strcmp(AV69AlbRUni, "KG")==0) ? "K" : "M") );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albrtam( AV18AlbRTam );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albrpieuti( 0 );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albrpiereb( 0 );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albruniuti( DecimalUtil.doubleToDec(0) );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albrunireb( DecimalUtil.doubleToDec(0) );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albrreo( AV87ALBRREO );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albrloc( GXutil.trim( GXutil.trim( AV17ALBRloc)) );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albrfen( AV33AlbRFen );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albrest( AV34AlbREst );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albrdes( AV67AlbRDes );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albnumeti( AV65AlbNumEti );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Procecod( AV64ProceCod );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albpmppza( AV59AlbPmPPza );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albrgrm2( (short)(0) );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albranc( (short)(0) );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albpml( (short)(0) );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albrpre( DecimalUtil.doubleToDec(0) );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albraju( DecimalUtil.doubleToDec(0) );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albrrep( (byte)(0) );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albrtara( AV86AlbRTara );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albrunib( DecimalUtil.doubleToDec(0) );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albrudas( DecimalUtil.doubleToDec(0) );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albrusu( AV25UsurCod );
      GXt_dtime5 = GXutil.resetDate(GXutil.now( )) ;
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albrhor( GXt_dtime5 );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albrunient( AV47AlbRUniEnt );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albrunic( AV91AlbrUniC );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albrpieent( AV41AlbRPieEnt );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albrpiec( AV80AlbrPieC );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albrnf( "" );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albrcfop( "" );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albrimp( "" );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albrlot2( AV88AlbRLot2 );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albrlote( AV40AlbRLote );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albrtelar( AV76AlbRTelar );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albrlu( AV42AlbRLu );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albgalga( AV43AlbGalga );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albmaqtej( GXutil.trim( AV44AlbMaqTej) );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albrmdlcod( AV82AlbRMdlCod );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albcolor( AV45AlbColor );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albrdiscli( AV81Albrdiscli );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albrtartc( (short)(0) );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albdocprv( AV56AlbDocPrv );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Almcod( AV77AlmCod );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albopst( AV19AlbOpsT );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albopsc( "" );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Alboc( AV48AlbOC );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albhdri( "" );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albnumb( AV49AlbNumB );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albnumm( "" );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albancc( DecimalUtil.doubleToDec(0) );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albdndc( (short)(0) );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albanccr( DecimalUtil.doubleToDec(0) );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albdndcr( (short)(0) );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albdmt( (short)(0) );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albpdac( "" );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albostj( "" );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albstlot( (byte)(0) );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Albturno( (byte)(0) );
      AV78BC_ALBREC.setgxTv_SdtBC_ALBREC_Alboekotex( "" );
      if ( ! (GXutil.strcmp("", AV89AlbRObs)==0) )
      {
         AV90BC_ALBREC_Line = (app.SdtBC_ALBREC_Level1Item)new app.SdtBC_ALBREC_Level1Item( remoteHandle, context);
         AV90BC_ALBREC_Line.setgxTv_SdtBC_ALBREC_Level1Item_Albrlin( (byte)(1) );
         AV90BC_ALBREC_Line.setgxTv_SdtBC_ALBREC_Level1Item_Albrobs( GXutil.substring( AV89AlbRObs, 1, 59) );
         AV78BC_ALBREC.getgxTv_SdtBC_ALBREC_Level1().add(AV90BC_ALBREC_Line, 0);
      }
      AV78BC_ALBREC.Save();
      if ( AV78BC_ALBREC.Success() )
      {
         AV54ogARecCod = AV78BC_ALBREC.getgxTv_SdtBC_ALBREC_Albreccod() ;
         /* Execute user subroutine: 'UPDATEOGARECCOD' */
         S121 ();
         if (returnInSub) return;
      }
      else
      {
         AV13Message.setgxTv_SdtMessages_Message_Id( "302" );
         AV13Message.setgxTv_SdtMessages_Message_Type( (byte)(2) );
         AV13Message.setgxTv_SdtMessages_Message_Description( GXutil.format( "Error al generar ALBREC : ", AV78BC_ALBREC.GetMessages().toJSonString(false), "", "", "", "", "", "", "", "") );
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).error(httpContext.getMessage( "SET_ImportPontWayIntegration:Set_AlbRec : ", "")+AV78BC_ALBREC.GetMessages().toJSonString(false), AV96Pgmdesc) ;
      }
   }

   public void S121( )
   {
      /* 'UPDATEOGARECCOD' Routine */
      returnInSub = false ;
      if ( ! (0==AV54ogARecCod) )
      {
         AV10OgGuiaImport.Load(AV73ogLinha, AV74ogEmprCod, AV75ogCliCod);
         AV10OgGuiaImport.setgxTv_SdtOgGuiaImport_Ogareccod( AV54ogARecCod );
         AV10OgGuiaImport.Save();
         if ( AV10OgGuiaImport.Success() )
         {
            new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).info(httpContext.getMessage( "Success update ALBREC code in OgGuiaImpor : ", "")+AV10OgGuiaImport.GetMessages().toJSonString(false), AV96Pgmdesc) ;
            Application.commitDataStores(context, remoteHandle, pr_default, "ponteway.v1.set_importpontwayintegration");
         }
         else
         {
            new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).error(httpContext.getMessage( "SET_ImportPontWayIntegrationUpdateOgARecCod : ", "")+AV10OgGuiaImport.GetMessages().toJSonString(false), AV96Pgmdesc) ;
         }
      }
      else
      {
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).error(httpContext.getMessage( "ogARecCod not found !", ""), AV97Pgmname) ;
      }
   }

   protected void cleanup( )
   {
      this.aP1[0] = set_importpontwayintegration.this.AV13Message;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV26Station = "" ;
      GXt_char1 = "" ;
      AV23EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV24EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV25UsurCod = "" ;
      GXv_char4 = new String[1] ;
      AV9GuiaRemessaLinhaItemDTO_Item = new app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas(remoteHandle, context);
      AV10OgGuiaImport = new app.ponteway.v1.SdtOgGuiaImport(remoteHandle);
      AV68AlbREnt = "" ;
      AV79EmpreCod = "" ;
      AV18AlbRTam = "" ;
      AV17ALBRloc = "" ;
      AV76AlbRTelar = "" ;
      AV44AlbMaqTej = "" ;
      AV81Albrdiscli = "" ;
      AV28AlbRef = "" ;
      AV87ALBRREO = "" ;
      AV89AlbRObs = "" ;
      AV49AlbNumB = "" ;
      AV88AlbRLot2 = "" ;
      AV40AlbRLote = "" ;
      AV69AlbRUni = "" ;
      AV91AlbrUniC = DecimalUtil.ZERO ;
      AV47AlbRUniEnt = DecimalUtil.ZERO ;
      AV42AlbRLu = DecimalUtil.ZERO ;
      AV82AlbRMdlCod = "" ;
      AV19AlbOpsT = "" ;
      AV86AlbRTara = DecimalUtil.ZERO ;
      AV74ogEmprCod = "" ;
      AV96Pgmdesc = "" ;
      AV78BC_ALBREC = new app.SdtBC_ALBREC(remoteHandle);
      AV33AlbRFen = GXutil.nullDate() ;
      AV67AlbRDes = "" ;
      AV59AlbPmPPza = DecimalUtil.ZERO ;
      GXt_dtime5 = GXutil.resetTime( GXutil.nullDate() );
      AV45AlbColor = "" ;
      AV56AlbDocPrv = "" ;
      AV48AlbOC = "" ;
      AV90BC_ALBREC_Line = new app.SdtBC_ALBREC_Level1Item(remoteHandle);
      AV97Pgmname = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ponteway.v1.set_importpontwayintegration__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ponteway.v1.set_importpontwayintegration__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ponteway.v1.set_importpontwayintegration__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ponteway.v1.set_importpontwayintegration__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ponteway.v1.set_importpontwayintegration__default(),
         new Object[] {
         }
      );
      AV97Pgmname = "PonteWay.v1.SET_ImportPontWayIntegration" ;
      AV96Pgmdesc = httpContext.getMessage( "SET_Import Pont Way Integration", "") ;
      /* GeneXus formulas. */
      AV97Pgmname = "PonteWay.v1.SET_ImportPontWayIntegration" ;
      AV96Pgmdesc = httpContext.getMessage( "SET_Import Pont Way Integration", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV34AlbREst ;
   private byte AV77AlmCod ;
   private short AV35TipEntCod ;
   private short AV43AlbGalga ;
   private short AV65AlbNumEti ;
   private short AV64ProceCod ;
   private short Gx_err ;
   private int AV95GXV1 ;
   private int AV27CliCod ;
   private int AV80AlbrPieC ;
   private int AV41AlbRPieEnt ;
   private int AV54ogARecCod ;
   private long AV72Linha ;
   private long AV73ogLinha ;
   private long AV75ogCliCod ;
   private java.math.BigDecimal AV91AlbrUniC ;
   private java.math.BigDecimal AV47AlbRUniEnt ;
   private java.math.BigDecimal AV42AlbRLu ;
   private java.math.BigDecimal AV86AlbRTara ;
   private java.math.BigDecimal AV59AlbPmPPza ;
   private String AV26Station ;
   private String GXt_char1 ;
   private String AV23EmprCod ;
   private String GXv_char2[] ;
   private String AV24EmprNom ;
   private String GXv_char3[] ;
   private String AV25UsurCod ;
   private String GXv_char4[] ;
   private String AV68AlbREnt ;
   private String AV18AlbRTam ;
   private String AV17ALBRloc ;
   private String AV76AlbRTelar ;
   private String AV44AlbMaqTej ;
   private String AV81Albrdiscli ;
   private String AV28AlbRef ;
   private String AV87ALBRREO ;
   private String AV89AlbRObs ;
   private String AV49AlbNumB ;
   private String AV40AlbRLote ;
   private String AV69AlbRUni ;
   private String AV82AlbRMdlCod ;
   private String AV19AlbOpsT ;
   private String AV96Pgmdesc ;
   private String AV67AlbRDes ;
   private String AV45AlbColor ;
   private String AV56AlbDocPrv ;
   private String AV48AlbOC ;
   private String AV97Pgmname ;
   private java.util.Date GXt_dtime5 ;
   private java.util.Date AV33AlbRFen ;
   private boolean returnInSub ;
   private String AV79EmpreCod ;
   private String AV88AlbRLot2 ;
   private String AV74ogEmprCod ;
   private com.genexus.SdtMessages_Message[] aP1 ;
   private IDataStoreProvider pr_default ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private GXBaseCollection<app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas> AV8GuiaRemessaLinhaItemDTO ;
   private com.genexus.SdtMessages_Message AV13Message ;
   private app.SdtBC_ALBREC AV78BC_ALBREC ;
   private app.SdtBC_ALBREC_Level1Item AV90BC_ALBREC_Line ;
   private app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas AV9GuiaRemessaLinhaItemDTO_Item ;
   private app.ponteway.v1.SdtOgGuiaImport AV10OgGuiaImport ;
}

final  class set_importpontwayintegration__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "MODA21";
   }

}

final  class set_importpontwayintegration__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class set_importpontwayintegration__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class set_importpontwayintegration__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class set_importpontwayintegration__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

