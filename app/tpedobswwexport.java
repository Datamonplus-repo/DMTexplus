package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tpedobswwexport extends GXProcedure
{
   public tpedobswwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpedobswwexport.class ), "" );
   }

   public tpedobswwexport( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      tpedobswwexport.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 )
   {
      tpedobswwexport.this.aP0 = aP0;
      tpedobswwexport.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_SdtWWPContext1[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV9WWPContext = GXv_SdtWWPContext1[0] ;
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV13CellRow = 1 ;
      AV14FirstColumn = 1 ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S201 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEFILTERS' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEDATA' */
      S161 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S191 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV15Random = (int)(GXutil.random( )*10000) ;
      AV11Filename = "./PrivateTempStorage/" + "TPEDOBSWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
      AV10ExcelDocument.Open(AV11Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV10ExcelDocument.Clear();
   }

   public void S131( )
   {
      /* 'WRITEFILTERS' Routine */
      returnInSub = false ;
      GXv_exceldoc2[0] = AV10ExcelDocument ;
      GXv_int3[0] = (short)(AV13CellRow) ;
      new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Filter", "")) ;
      AV10ExcelDocument = GXv_exceldoc2[0] ;
      tpedobswwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV64FilterFullText, GXv_char5) ;
      tpedobswwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV46TFEmprCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Empresa", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tpedobswwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFEmprCod_Sel, GXv_char5) ;
         tpedobswwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV45TFEmprCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Empresa", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tpedobswwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFEmprCod, GXv_char5) ;
            tpedobswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV47TFPedCod) && (0==AV48TFPedCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº Pedido", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tpedobswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV47TFPedCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tpedobswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV48TFPedCod_To );
      }
      if ( ! ( (0==AV49TFPedObsUL) && (0==AV50TFPedObsUL_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Ultima Linea Observaciones", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tpedobswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV49TFPedObsUL );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tpedobswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV50TFPedObsUL_To );
      }
      if ( ! ( (GXutil.strcmp("", AV52TFEmprNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tpedobswwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV52TFEmprNom_Sel, GXv_char5) ;
         tpedobswwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV51TFEmprNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tpedobswwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV51TFEmprNom, GXv_char5) ;
            tpedobswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV53TFPedConLin) && (0==AV54TFPedConLin_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Contador de lineas", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tpedobswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV53TFPedConLin );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tpedobswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV54TFPedConLin_To );
      }
      if ( ! ( (GXutil.strcmp("", AV56TFPedPerDes_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Destinatario Pedido Compras", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tpedobswwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV56TFPedPerDes_Sel, GXv_char5) ;
         tpedobswwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV55TFPedPerDes)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Destinatario Pedido Compras", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tpedobswwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV55TFPedPerDes, GXv_char5) ;
            tpedobswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV58TFPedPerPet_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Peticionario Pedido Compras", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tpedobswwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV58TFPedPerPet_Sel, GXv_char5) ;
         tpedobswwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV57TFPedPerPet)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Peticionario Pedido Compras", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tpedobswwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV57TFPedPerPet, GXv_char5) ;
            tpedobswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV59TFPedFecEnt)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha Entrega Prevista", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tpedobswwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV59TFPedFecEnt );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV61TFPedFec)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha Pedido", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tpedobswwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV61TFPedFec );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV42VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV30Session.getValue("TPEDOBSWWColumnsSelector"), "") != 0 )
      {
         AV37ColumnsSelectorXML = AV30Session.getValue("TPEDOBSWWColumnsSelector") ;
         AV34ColumnsSelector.fromxml(AV37ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV67GXV1 = 1 ;
      while ( AV67GXV1 <= AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV36ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV67GXV1));
         if ( AV36ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV36ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV36ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV36ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setColor( 11 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         AV67GXV1 = (int)(AV67GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV69Tpedobswwds_1_filterfulltext = AV64FilterFullText ;
      AV70Tpedobswwds_2_tfemprcod = AV45TFEmprCod ;
      AV71Tpedobswwds_3_tfemprcod_sel = AV46TFEmprCod_Sel ;
      AV72Tpedobswwds_4_tfpedcod = AV47TFPedCod ;
      AV73Tpedobswwds_5_tfpedcod_to = AV48TFPedCod_To ;
      AV74Tpedobswwds_6_tfpedobsul = AV49TFPedObsUL ;
      AV75Tpedobswwds_7_tfpedobsul_to = AV50TFPedObsUL_To ;
      AV76Tpedobswwds_8_tfemprnom = AV51TFEmprNom ;
      AV77Tpedobswwds_9_tfemprnom_sel = AV52TFEmprNom_Sel ;
      AV78Tpedobswwds_10_tfpedconlin = AV53TFPedConLin ;
      AV79Tpedobswwds_11_tfpedconlin_to = AV54TFPedConLin_To ;
      AV80Tpedobswwds_12_tfpedperdes = AV55TFPedPerDes ;
      AV81Tpedobswwds_13_tfpedperdes_sel = AV56TFPedPerDes_Sel ;
      AV82Tpedobswwds_14_tfpedperpet = AV57TFPedPerPet ;
      AV83Tpedobswwds_15_tfpedperpet_sel = AV58TFPedPerPet_Sel ;
      AV84Tpedobswwds_16_tfpedfecent = AV59TFPedFecEnt ;
      AV85Tpedobswwds_17_tfpedfec = AV61TFPedFec ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV69Tpedobswwds_1_filterfulltext ,
                                           AV71Tpedobswwds_3_tfemprcod_sel ,
                                           AV70Tpedobswwds_2_tfemprcod ,
                                           Integer.valueOf(AV72Tpedobswwds_4_tfpedcod) ,
                                           Integer.valueOf(AV73Tpedobswwds_5_tfpedcod_to) ,
                                           Byte.valueOf(AV74Tpedobswwds_6_tfpedobsul) ,
                                           Byte.valueOf(AV75Tpedobswwds_7_tfpedobsul_to) ,
                                           AV77Tpedobswwds_9_tfemprnom_sel ,
                                           AV76Tpedobswwds_8_tfemprnom ,
                                           Byte.valueOf(AV78Tpedobswwds_10_tfpedconlin) ,
                                           Byte.valueOf(AV79Tpedobswwds_11_tfpedconlin_to) ,
                                           AV81Tpedobswwds_13_tfpedperdes_sel ,
                                           AV80Tpedobswwds_12_tfpedperdes ,
                                           AV83Tpedobswwds_15_tfpedperpet_sel ,
                                           AV82Tpedobswwds_14_tfpedperpet ,
                                           AV84Tpedobswwds_16_tfpedfecent ,
                                           AV85Tpedobswwds_17_tfpedfec ,
                                           A396EmprCod ,
                                           Integer.valueOf(A658PedCod) ,
                                           Byte.valueOf(A2503PedObsUL) ,
                                           A407EmprNom ,
                                           Byte.valueOf(A5049PedConLin) ,
                                           A8154PedPerDes ,
                                           A8155PedPerPet ,
                                           A662PedFecEnt ,
                                           A661PedFec ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN
                                           }
      });
      lV69Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Tpedobswwds_1_filterfulltext), "%", "") ;
      lV69Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Tpedobswwds_1_filterfulltext), "%", "") ;
      lV69Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Tpedobswwds_1_filterfulltext), "%", "") ;
      lV69Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Tpedobswwds_1_filterfulltext), "%", "") ;
      lV69Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Tpedobswwds_1_filterfulltext), "%", "") ;
      lV69Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Tpedobswwds_1_filterfulltext), "%", "") ;
      lV69Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Tpedobswwds_1_filterfulltext), "%", "") ;
      lV70Tpedobswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV70Tpedobswwds_2_tfemprcod), 3, "%") ;
      lV76Tpedobswwds_8_tfemprnom = GXutil.padr( GXutil.rtrim( AV76Tpedobswwds_8_tfemprnom), 30, "%") ;
      lV80Tpedobswwds_12_tfpedperdes = GXutil.padr( GXutil.rtrim( AV80Tpedobswwds_12_tfpedperdes), 30, "%") ;
      lV82Tpedobswwds_14_tfpedperpet = GXutil.padr( GXutil.rtrim( AV82Tpedobswwds_14_tfpedperpet), 30, "%") ;
      /* Using cursor P08PD3 */
      pr_default.execute(0, new Object[] {lV69Tpedobswwds_1_filterfulltext, lV69Tpedobswwds_1_filterfulltext, lV69Tpedobswwds_1_filterfulltext, lV69Tpedobswwds_1_filterfulltext, lV69Tpedobswwds_1_filterfulltext, lV69Tpedobswwds_1_filterfulltext, lV69Tpedobswwds_1_filterfulltext, lV70Tpedobswwds_2_tfemprcod, AV71Tpedobswwds_3_tfemprcod_sel, Integer.valueOf(AV72Tpedobswwds_4_tfpedcod), Integer.valueOf(AV73Tpedobswwds_5_tfpedcod_to), Byte.valueOf(AV74Tpedobswwds_6_tfpedobsul), Byte.valueOf(AV75Tpedobswwds_7_tfpedobsul_to), lV76Tpedobswwds_8_tfemprnom, AV77Tpedobswwds_9_tfemprnom_sel, Byte.valueOf(AV78Tpedobswwds_10_tfpedconlin), Byte.valueOf(AV79Tpedobswwds_11_tfpedconlin_to), lV80Tpedobswwds_12_tfpedperdes, AV81Tpedobswwds_13_tfpedperdes_sel, lV82Tpedobswwds_14_tfpedperpet, AV83Tpedobswwds_15_tfpedperpet_sel, AV84Tpedobswwds_16_tfpedfecent, AV85Tpedobswwds_17_tfpedfec});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A661PedFec = P08PD3_A661PedFec[0] ;
         A662PedFecEnt = P08PD3_A662PedFecEnt[0] ;
         A8155PedPerPet = P08PD3_A8155PedPerPet[0] ;
         A8154PedPerDes = P08PD3_A8154PedPerDes[0] ;
         A407EmprNom = P08PD3_A407EmprNom[0] ;
         n407EmprNom = P08PD3_n407EmprNom[0] ;
         A2503PedObsUL = P08PD3_A2503PedObsUL[0] ;
         n2503PedObsUL = P08PD3_n2503PedObsUL[0] ;
         A658PedCod = P08PD3_A658PedCod[0] ;
         A396EmprCod = P08PD3_A396EmprCod[0] ;
         A5049PedConLin = P08PD3_A5049PedConLin[0] ;
         n5049PedConLin = P08PD3_n5049PedConLin[0] ;
         A407EmprNom = P08PD3_A407EmprNom[0] ;
         n407EmprNom = P08PD3_n407EmprNom[0] ;
         A5049PedConLin = P08PD3_A5049PedConLin[0] ;
         n5049PedConLin = P08PD3_n5049PedConLin[0] ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV42VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A396EmprCod, GXv_char5) ;
            tpedobswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setNumber( A658PedCod );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setNumber( A2503PedObsUL );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A407EmprNom, GXv_char5) ;
            tpedobswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setNumber( A5049PedConLin );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A8154PedPerDes, GXv_char5) ;
            tpedobswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A8155PedPerPet, GXv_char5) ;
            tpedobswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A662PedFecEnt );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A661PedFec );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S182 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S191( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV10ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV10ExcelDocument.Close();
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV10ExcelDocument.getErrCode() != 0 )
      {
         AV11Filename = "" ;
         AV12ErrorMessage = AV10ExcelDocument.getErrDescription() ;
         AV10ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   public void S151( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV34ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "EmprCod", "", "Código Empresa", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PedCod", "", "Nº Pedido", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PedObsUL", "", "Ultima Linea Observaciones", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "EmprNom", "", "Nombre", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PedConLin", "", "Contador de lineas", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PedPerDes", "", "Destinatario Pedido Compras", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PedPerPet", "", "Peticionario Pedido Compras", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PedFecEnt", "", "Fecha Entrega Prevista", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PedFec", "", "Fecha Pedido", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV38UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TPEDOBSWWColumnsSelector", GXv_char5) ;
      tpedobswwexport.this.GXt_char4 = GXv_char5[0] ;
      AV38UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV38UserCustomValue)==0) ) )
      {
         AV35ColumnsSelectorAux.fromxml(AV38UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV35ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV34ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV35ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV34ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV30Session.getValue("TPEDOBSWWGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TPEDOBSWWGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV30Session.getValue("TPEDOBSWWGridState"), null, null);
      }
      AV16OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV86GXV2 = 1 ;
      while ( AV86GXV2 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV86GXV2));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV64FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV45TFEmprCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV46TFEmprCod_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDCOD") == 0 )
         {
            AV47TFPedCod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV48TFPedCod_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDOBSUL") == 0 )
         {
            AV49TFPedObsUL = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV50TFPedObsUL_To = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM") == 0 )
         {
            AV51TFEmprNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM_SEL") == 0 )
         {
            AV52TFEmprNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDCONLIN") == 0 )
         {
            AV53TFPedConLin = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV54TFPedConLin_To = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDPERDES") == 0 )
         {
            AV55TFPedPerDes = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDPERDES_SEL") == 0 )
         {
            AV56TFPedPerDes_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDPERPET") == 0 )
         {
            AV57TFPedPerPet = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDPERPET_SEL") == 0 )
         {
            AV58TFPedPerPet_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDFECENT") == 0 )
         {
            AV59TFPedFecEnt = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDFEC") == 0 )
         {
            AV61TFPedFec = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV86GXV2 = (int)(AV86GXV2+1) ;
      }
   }

   public void S172( )
   {
      /* 'BEFOREWRITELINE' Routine */
      returnInSub = false ;
   }

   public void S182( )
   {
      /* 'AFTERWRITELINE' Routine */
      returnInSub = false ;
   }

   protected void cleanup( )
   {
      this.aP0[0] = tpedobswwexport.this.AV11Filename;
      this.aP1[0] = tpedobswwexport.this.AV12ErrorMessage;
      CloseOpenCursors();
      AV10ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11Filename = "" ;
      AV12ErrorMessage = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV10ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV64FilterFullText = "" ;
      AV46TFEmprCod_Sel = "" ;
      AV45TFEmprCod = "" ;
      AV52TFEmprNom_Sel = "" ;
      AV51TFEmprNom = "" ;
      AV56TFPedPerDes_Sel = "" ;
      AV55TFPedPerDes = "" ;
      AV58TFPedPerPet_Sel = "" ;
      AV57TFPedPerPet = "" ;
      AV59TFPedFecEnt = GXutil.nullDate() ;
      AV61TFPedFec = GXutil.nullDate() ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV30Session = httpContext.getWebSession();
      AV37ColumnsSelectorXML = "" ;
      AV34ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV36ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      A8154PedPerDes = "" ;
      A8155PedPerPet = "" ;
      A662PedFecEnt = GXutil.nullDate() ;
      A661PedFec = GXutil.nullDate() ;
      AV69Tpedobswwds_1_filterfulltext = "" ;
      AV70Tpedobswwds_2_tfemprcod = "" ;
      AV71Tpedobswwds_3_tfemprcod_sel = "" ;
      AV76Tpedobswwds_8_tfemprnom = "" ;
      AV77Tpedobswwds_9_tfemprnom_sel = "" ;
      AV80Tpedobswwds_12_tfpedperdes = "" ;
      AV81Tpedobswwds_13_tfpedperdes_sel = "" ;
      AV82Tpedobswwds_14_tfpedperpet = "" ;
      AV83Tpedobswwds_15_tfpedperpet_sel = "" ;
      AV84Tpedobswwds_16_tfpedfecent = GXutil.nullDate() ;
      AV85Tpedobswwds_17_tfpedfec = GXutil.nullDate() ;
      scmdbuf = "" ;
      lV69Tpedobswwds_1_filterfulltext = "" ;
      lV70Tpedobswwds_2_tfemprcod = "" ;
      lV76Tpedobswwds_8_tfemprnom = "" ;
      lV80Tpedobswwds_12_tfpedperdes = "" ;
      lV82Tpedobswwds_14_tfpedperpet = "" ;
      P08PD3_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08PD3_A662PedFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P08PD3_A8155PedPerPet = new String[] {""} ;
      P08PD3_A8154PedPerDes = new String[] {""} ;
      P08PD3_A407EmprNom = new String[] {""} ;
      P08PD3_n407EmprNom = new boolean[] {false} ;
      P08PD3_A2503PedObsUL = new byte[1] ;
      P08PD3_n2503PedObsUL = new boolean[] {false} ;
      P08PD3_A658PedCod = new int[1] ;
      P08PD3_A396EmprCod = new String[] {""} ;
      P08PD3_A5049PedConLin = new byte[1] ;
      P08PD3_n5049PedConLin = new boolean[] {false} ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV38UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV35ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV32GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV33GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tpedobswwexport__default(),
         new Object[] {
             new Object[] {
            P08PD3_A661PedFec, P08PD3_A662PedFecEnt, P08PD3_A8155PedPerPet, P08PD3_A8154PedPerDes, P08PD3_A407EmprNom, P08PD3_n407EmprNom, P08PD3_A2503PedObsUL, P08PD3_n2503PedObsUL, P08PD3_A658PedCod, P08PD3_A396EmprCod,
            P08PD3_A5049PedConLin, P08PD3_n5049PedConLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV49TFPedObsUL ;
   private byte AV50TFPedObsUL_To ;
   private byte AV53TFPedConLin ;
   private byte AV54TFPedConLin_To ;
   private byte A2503PedObsUL ;
   private byte A5049PedConLin ;
   private byte AV74Tpedobswwds_6_tfpedobsul ;
   private byte AV75Tpedobswwds_7_tfpedobsul_to ;
   private byte AV78Tpedobswwds_10_tfpedconlin ;
   private byte AV79Tpedobswwds_11_tfpedconlin_to ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV47TFPedCod ;
   private int AV48TFPedCod_To ;
   private int AV67GXV1 ;
   private int A658PedCod ;
   private int AV72Tpedobswwds_4_tfpedcod ;
   private int AV73Tpedobswwds_5_tfpedcod_to ;
   private int AV86GXV2 ;
   private long AV42VisibleColumnCount ;
   private String AV46TFEmprCod_Sel ;
   private String AV45TFEmprCod ;
   private String AV52TFEmprNom_Sel ;
   private String AV51TFEmprNom ;
   private String AV56TFPedPerDes_Sel ;
   private String AV55TFPedPerDes ;
   private String AV58TFPedPerPet_Sel ;
   private String AV57TFPedPerPet ;
   private String A396EmprCod ;
   private String A407EmprNom ;
   private String A8154PedPerDes ;
   private String A8155PedPerPet ;
   private String AV70Tpedobswwds_2_tfemprcod ;
   private String AV71Tpedobswwds_3_tfemprcod_sel ;
   private String AV76Tpedobswwds_8_tfemprnom ;
   private String AV77Tpedobswwds_9_tfemprnom_sel ;
   private String AV80Tpedobswwds_12_tfpedperdes ;
   private String AV81Tpedobswwds_13_tfpedperdes_sel ;
   private String AV82Tpedobswwds_14_tfpedperpet ;
   private String AV83Tpedobswwds_15_tfpedperpet_sel ;
   private String scmdbuf ;
   private String lV70Tpedobswwds_2_tfemprcod ;
   private String lV76Tpedobswwds_8_tfemprnom ;
   private String lV80Tpedobswwds_12_tfpedperdes ;
   private String lV82Tpedobswwds_14_tfpedperpet ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV59TFPedFecEnt ;
   private java.util.Date AV61TFPedFec ;
   private java.util.Date A662PedFecEnt ;
   private java.util.Date A661PedFec ;
   private java.util.Date AV84Tpedobswwds_16_tfpedfecent ;
   private java.util.Date AV85Tpedobswwds_17_tfpedfec ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n407EmprNom ;
   private boolean n2503PedObsUL ;
   private boolean n5049PedConLin ;
   private String AV37ColumnsSelectorXML ;
   private String AV38UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV64FilterFullText ;
   private String AV69Tpedobswwds_1_filterfulltext ;
   private String lV69Tpedobswwds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV30Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P08PD3_A661PedFec ;
   private java.util.Date[] P08PD3_A662PedFecEnt ;
   private String[] P08PD3_A8155PedPerPet ;
   private String[] P08PD3_A8154PedPerDes ;
   private String[] P08PD3_A407EmprNom ;
   private boolean[] P08PD3_n407EmprNom ;
   private byte[] P08PD3_A2503PedObsUL ;
   private boolean[] P08PD3_n2503PedObsUL ;
   private int[] P08PD3_A658PedCod ;
   private String[] P08PD3_A396EmprCod ;
   private byte[] P08PD3_A5049PedConLin ;
   private boolean[] P08PD3_n5049PedConLin ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV34ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV35ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV36ColumnsSelector_Column ;
}

final  class tpedobswwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08PD3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV69Tpedobswwds_1_filterfulltext ,
                                          String AV71Tpedobswwds_3_tfemprcod_sel ,
                                          String AV70Tpedobswwds_2_tfemprcod ,
                                          int AV72Tpedobswwds_4_tfpedcod ,
                                          int AV73Tpedobswwds_5_tfpedcod_to ,
                                          byte AV74Tpedobswwds_6_tfpedobsul ,
                                          byte AV75Tpedobswwds_7_tfpedobsul_to ,
                                          String AV77Tpedobswwds_9_tfemprnom_sel ,
                                          String AV76Tpedobswwds_8_tfemprnom ,
                                          byte AV78Tpedobswwds_10_tfpedconlin ,
                                          byte AV79Tpedobswwds_11_tfpedconlin_to ,
                                          String AV81Tpedobswwds_13_tfpedperdes_sel ,
                                          String AV80Tpedobswwds_12_tfpedperdes ,
                                          String AV83Tpedobswwds_15_tfpedperpet_sel ,
                                          String AV82Tpedobswwds_14_tfpedperpet ,
                                          java.util.Date AV84Tpedobswwds_16_tfpedfecent ,
                                          java.util.Date AV85Tpedobswwds_17_tfpedfec ,
                                          String A396EmprCod ,
                                          int A658PedCod ,
                                          byte A2503PedObsUL ,
                                          String A407EmprNom ,
                                          byte A5049PedConLin ,
                                          String A8154PedPerDes ,
                                          String A8155PedPerPet ,
                                          java.util.Date A662PedFecEnt ,
                                          java.util.Date A661PedFec ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[23];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.PedFec, T1.PedFecEnt, T1.PedPerPet, T1.PedPerDes, T2.EmprNom, T1.PedObsUL, T1.PedCod, T1.EmprCod, COALESCE( T3.PedConLin, 0) AS PedConLin FROM ((TXPCPEDID" ;
      scmdbuf += " T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) LEFT JOIN (SELECT COUNT(*) AS PedConLin, EmprCod, PedCod FROM TXPOBSPED GROUP BY EmprCod, PedCod ) T3 ON" ;
      scmdbuf += " T3.EmprCod = T1.EmprCod AND T3.PedCod = T1.PedCod)" ;
      if ( ! (GXutil.strcmp("", AV69Tpedobswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PedCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PedObsUL,'90'), 2) like '%' || ?) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.PedConLin, 0),'90'), 2) like '%' || ?) or ( UPPER(T1.PedPerDes) like '%' || UPPER(?)) or ( UPPER(T1.PedPerPet) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int9[0] = (byte)(1) ;
         GXv_int9[1] = (byte)(1) ;
         GXv_int9[2] = (byte)(1) ;
         GXv_int9[3] = (byte)(1) ;
         GXv_int9[4] = (byte)(1) ;
         GXv_int9[5] = (byte)(1) ;
         GXv_int9[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Tpedobswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV70Tpedobswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Tpedobswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int9[8] = (byte)(1) ;
      }
      if ( ! (0==AV72Tpedobswwds_4_tfpedcod) )
      {
         addWhere(sWhereString, "(T1.PedCod >= ?)");
      }
      else
      {
         GXv_int9[9] = (byte)(1) ;
      }
      if ( ! (0==AV73Tpedobswwds_5_tfpedcod_to) )
      {
         addWhere(sWhereString, "(T1.PedCod <= ?)");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( ! (0==AV74Tpedobswwds_6_tfpedobsul) )
      {
         addWhere(sWhereString, "(T1.PedObsUL >= ?)");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( ! (0==AV75Tpedobswwds_7_tfpedobsul_to) )
      {
         addWhere(sWhereString, "(T1.PedObsUL <= ?)");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Tpedobswwds_9_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV76Tpedobswwds_8_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Tpedobswwds_9_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( ! (0==AV78Tpedobswwds_10_tfpedconlin) )
      {
         addWhere(sWhereString, "(COALESCE( T3.PedConLin, 0) >= ?)");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( ! (0==AV79Tpedobswwds_11_tfpedconlin_to) )
      {
         addWhere(sWhereString, "(COALESCE( T3.PedConLin, 0) <= ?)");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Tpedobswwds_13_tfpedperdes_sel)==0) && ( ! (GXutil.strcmp("", AV80Tpedobswwds_12_tfpedperdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PedPerDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Tpedobswwds_13_tfpedperdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PedPerDes = ?)");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Tpedobswwds_15_tfpedperpet_sel)==0) && ( ! (GXutil.strcmp("", AV82Tpedobswwds_14_tfpedperpet)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PedPerPet) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Tpedobswwds_15_tfpedperpet_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PedPerPet = ?)");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV84Tpedobswwds_16_tfpedfecent)) )
      {
         addWhere(sWhereString, "(T1.PedFecEnt >= ?)");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV85Tpedobswwds_17_tfpedfec)) )
      {
         addWhere(sWhereString, "(T1.PedFec >= ?)");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PedObsUL" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PedObsUL DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PedCod" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PedCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.EmprNom" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.EmprNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PedPerDes" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PedPerDes DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PedPerPet" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PedPerPet DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PedFecEnt" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PedFecEnt DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PedFec" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PedFec DESC" ;
      }
      GXv_Object10[0] = scmdbuf ;
      GXv_Object10[1] = GXv_int9 ;
      return GXv_Object10 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P08PD3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Boolean) dynConstraints[27]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08PD3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 3);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 3);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[35]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[44]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[45]);
               }
               return;
      }
   }

}

