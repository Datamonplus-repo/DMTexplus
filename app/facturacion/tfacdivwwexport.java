package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tfacdivwwexport extends GXProcedure
{
   public tfacdivwwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tfacdivwwexport.class ), "" );
   }

   public tfacdivwwexport( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      tfacdivwwexport.this.aP1 = new String[] {""};
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
      tfacdivwwexport.this.aP0 = aP0;
      tfacdivwwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "TFACDIVWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      tfacdivwwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      tfacdivwwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV35TFEmprCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Empresa", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tfacdivwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV35TFEmprCod_Sel, GXv_char5) ;
         tfacdivwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV34TFEmprCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Empresa", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tfacdivwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV34TFEmprCod, GXv_char5) ;
            tfacdivwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV36TFFacCod) && (0==AV37TFFacCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Numero Factura", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tfacdivwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV36TFFacCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tfacdivwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV37TFFacCod_To );
      }
      if ( ! ( (0==AV38TFCliCod) && (0==AV39TFCliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tfacdivwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV38TFCliCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tfacdivwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV39TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV41TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tfacdivwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFCliNom_Sel, GXv_char5) ;
         tfacdivwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV40TFCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tfacdivwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFCliNom, GXv_char5) ;
            tfacdivwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( ( AV43TFFacDivTCod_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Divisa Traspaso Contable", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tfacdivwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV55i = 1 ;
         AV58GXV1 = 1 ;
         while ( AV58GXV1 <= AV43TFFacDivTCod_Sels.size() )
         {
            AV44TFFacDivTCod_Sel = (String)AV43TFFacDivTCod_Sels.elementAt(-1+AV58GXV1) ;
            if ( AV55i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV44TFFacDivTCod_Sel), httpContext.getMessage( "P", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "PESETA", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV44TFFacDivTCod_Sel), httpContext.getMessage( "E", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "EURO", "") );
            }
            AV55i = (long)(AV55i+1) ;
            AV58GXV1 = (int)(AV58GXV1+1) ;
         }
      }
      if ( ! ( (0==AV45TFFacDivCod) && (0==AV46TFFacDivCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Divisa", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tfacdivwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV45TFFacDivCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tfacdivwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV46TFFacDivCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV48TFFacDivAbr_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Abreviatura", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tfacdivwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFFacDivAbr_Sel, GXv_char5) ;
         tfacdivwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV47TFFacDivAbr)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Abreviatura", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tfacdivwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFFacDivAbr, GXv_char5) ;
            tfacdivwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV50TFFacRepCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Representante", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tfacdivwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFFacRepCod_Sel, GXv_char5) ;
         tfacdivwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV49TFFacRepCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Representante", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tfacdivwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFFacRepCod, GXv_char5) ;
            tfacdivwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV52TFFacRepNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Representante", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tfacdivwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV52TFFacRepNom_Sel, GXv_char5) ;
         tfacdivwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV51TFFacRepNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Representante", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tfacdivwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV51TFFacRepNom, GXv_char5) ;
            tfacdivwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV54TFEmprNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tfacdivwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV54TFEmprNom_Sel, GXv_char5) ;
         tfacdivwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV53TFEmprNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tfacdivwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV53TFEmprNom, GXv_char5) ;
            tfacdivwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("Facturacion.TFACDIVWWColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("Facturacion.TFACDIVWWColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV59GXV2 = 1 ;
      while ( AV59GXV2 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV59GXV2));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV59GXV2 = (int)(AV59GXV2+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV61Facturacion_tfacdivwwds_1_filterfulltext = AV18FilterFullText ;
      AV62Facturacion_tfacdivwwds_2_tfemprcod = AV34TFEmprCod ;
      AV63Facturacion_tfacdivwwds_3_tfemprcod_sel = AV35TFEmprCod_Sel ;
      AV64Facturacion_tfacdivwwds_4_tffaccod = AV36TFFacCod ;
      AV65Facturacion_tfacdivwwds_5_tffaccod_to = AV37TFFacCod_To ;
      AV66Facturacion_tfacdivwwds_6_tfclicod = AV38TFCliCod ;
      AV67Facturacion_tfacdivwwds_7_tfclicod_to = AV39TFCliCod_To ;
      AV68Facturacion_tfacdivwwds_8_tfclinom = AV40TFCliNom ;
      AV69Facturacion_tfacdivwwds_9_tfclinom_sel = AV41TFCliNom_Sel ;
      AV70Facturacion_tfacdivwwds_10_tffacdivtcod_sels = AV43TFFacDivTCod_Sels ;
      AV71Facturacion_tfacdivwwds_11_tffacdivcod = AV45TFFacDivCod ;
      AV72Facturacion_tfacdivwwds_12_tffacdivcod_to = AV46TFFacDivCod_To ;
      AV73Facturacion_tfacdivwwds_13_tffacdivabr = AV47TFFacDivAbr ;
      AV74Facturacion_tfacdivwwds_14_tffacdivabr_sel = AV48TFFacDivAbr_Sel ;
      AV75Facturacion_tfacdivwwds_15_tffacrepcod = AV49TFFacRepCod ;
      AV76Facturacion_tfacdivwwds_16_tffacrepcod_sel = AV50TFFacRepCod_Sel ;
      AV77Facturacion_tfacdivwwds_17_tffacrepnom = AV51TFFacRepNom ;
      AV78Facturacion_tfacdivwwds_18_tffacrepnom_sel = AV52TFFacRepNom_Sel ;
      AV79Facturacion_tfacdivwwds_19_tfemprnom = AV53TFEmprNom ;
      AV80Facturacion_tfacdivwwds_20_tfemprnom_sel = AV54TFEmprNom_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A3096FacDivTCod ,
                                           AV70Facturacion_tfacdivwwds_10_tffacdivtcod_sels ,
                                           AV63Facturacion_tfacdivwwds_3_tfemprcod_sel ,
                                           AV62Facturacion_tfacdivwwds_2_tfemprcod ,
                                           Integer.valueOf(AV64Facturacion_tfacdivwwds_4_tffaccod) ,
                                           Integer.valueOf(AV65Facturacion_tfacdivwwds_5_tffaccod_to) ,
                                           Integer.valueOf(AV66Facturacion_tfacdivwwds_6_tfclicod) ,
                                           Integer.valueOf(AV67Facturacion_tfacdivwwds_7_tfclicod_to) ,
                                           AV69Facturacion_tfacdivwwds_9_tfclinom_sel ,
                                           AV68Facturacion_tfacdivwwds_8_tfclinom ,
                                           Integer.valueOf(AV70Facturacion_tfacdivwwds_10_tffacdivtcod_sels.size()) ,
                                           Byte.valueOf(AV71Facturacion_tfacdivwwds_11_tffacdivcod) ,
                                           Byte.valueOf(AV72Facturacion_tfacdivwwds_12_tffacdivcod_to) ,
                                           AV74Facturacion_tfacdivwwds_14_tffacdivabr_sel ,
                                           AV73Facturacion_tfacdivwwds_13_tffacdivabr ,
                                           AV76Facturacion_tfacdivwwds_16_tffacrepcod_sel ,
                                           AV75Facturacion_tfacdivwwds_15_tffacrepcod ,
                                           AV78Facturacion_tfacdivwwds_18_tffacrepnom_sel ,
                                           AV77Facturacion_tfacdivwwds_17_tffacrepnom ,
                                           AV80Facturacion_tfacdivwwds_20_tfemprnom_sel ,
                                           AV79Facturacion_tfacdivwwds_19_tfemprnom ,
                                           A396EmprCod ,
                                           Integer.valueOf(A430FacCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Byte.valueOf(A3115FacDivCod) ,
                                           A3116FacDivAbr ,
                                           A3119FacRepCod ,
                                           A3120FacRepNom ,
                                           A407EmprNom ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV61Facturacion_tfacdivwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV62Facturacion_tfacdivwwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV62Facturacion_tfacdivwwds_2_tfemprcod), 3, "%") ;
      lV68Facturacion_tfacdivwwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV68Facturacion_tfacdivwwds_8_tfclinom), 30, "%") ;
      lV73Facturacion_tfacdivwwds_13_tffacdivabr = GXutil.padr( GXutil.rtrim( AV73Facturacion_tfacdivwwds_13_tffacdivabr), 6, "%") ;
      lV75Facturacion_tfacdivwwds_15_tffacrepcod = GXutil.padr( GXutil.rtrim( AV75Facturacion_tfacdivwwds_15_tffacrepcod), 6, "%") ;
      lV77Facturacion_tfacdivwwds_17_tffacrepnom = GXutil.padr( GXutil.rtrim( AV77Facturacion_tfacdivwwds_17_tffacrepnom), 34, "%") ;
      lV79Facturacion_tfacdivwwds_19_tfemprnom = GXutil.padr( GXutil.rtrim( AV79Facturacion_tfacdivwwds_19_tfemprnom), 30, "%") ;
      /* Using cursor P0AVU2 */
      pr_default.execute(0, new Object[] {lV62Facturacion_tfacdivwwds_2_tfemprcod, AV63Facturacion_tfacdivwwds_3_tfemprcod_sel, Integer.valueOf(AV64Facturacion_tfacdivwwds_4_tffaccod), Integer.valueOf(AV65Facturacion_tfacdivwwds_5_tffaccod_to), Integer.valueOf(AV66Facturacion_tfacdivwwds_6_tfclicod), Integer.valueOf(AV67Facturacion_tfacdivwwds_7_tfclicod_to), lV68Facturacion_tfacdivwwds_8_tfclinom, AV69Facturacion_tfacdivwwds_9_tfclinom_sel, Byte.valueOf(AV71Facturacion_tfacdivwwds_11_tffacdivcod), Byte.valueOf(AV72Facturacion_tfacdivwwds_12_tffacdivcod_to), lV73Facturacion_tfacdivwwds_13_tffacdivabr, AV74Facturacion_tfacdivwwds_14_tffacdivabr_sel, lV75Facturacion_tfacdivwwds_15_tffacrepcod, AV76Facturacion_tfacdivwwds_16_tffacrepcod_sel, lV77Facturacion_tfacdivwwds_17_tffacrepnom, AV78Facturacion_tfacdivwwds_18_tffacrepnom_sel, lV79Facturacion_tfacdivwwds_19_tfemprnom, AV80Facturacion_tfacdivwwds_20_tfemprnom_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A407EmprNom = P0AVU2_A407EmprNom[0] ;
         n407EmprNom = P0AVU2_n407EmprNom[0] ;
         A3120FacRepNom = P0AVU2_A3120FacRepNom[0] ;
         n3120FacRepNom = P0AVU2_n3120FacRepNom[0] ;
         A3119FacRepCod = P0AVU2_A3119FacRepCod[0] ;
         n3119FacRepCod = P0AVU2_n3119FacRepCod[0] ;
         A3116FacDivAbr = P0AVU2_A3116FacDivAbr[0] ;
         n3116FacDivAbr = P0AVU2_n3116FacDivAbr[0] ;
         A3115FacDivCod = P0AVU2_A3115FacDivCod[0] ;
         n3115FacDivCod = P0AVU2_n3115FacDivCod[0] ;
         A279CliNom = P0AVU2_A279CliNom[0] ;
         A252CliCod = P0AVU2_A252CliCod[0] ;
         A430FacCod = P0AVU2_A430FacCod[0] ;
         A396EmprCod = P0AVU2_A396EmprCod[0] ;
         A3096FacDivTCod = P0AVU2_A3096FacDivTCod[0] ;
         n3096FacDivTCod = P0AVU2_n3096FacDivTCod[0] ;
         A3116FacDivAbr = P0AVU2_A3116FacDivAbr[0] ;
         n3116FacDivAbr = P0AVU2_n3116FacDivAbr[0] ;
         A407EmprNom = P0AVU2_A407EmprNom[0] ;
         n407EmprNom = P0AVU2_n407EmprNom[0] ;
         A3120FacRepNom = P0AVU2_A3120FacRepNom[0] ;
         n3120FacRepNom = P0AVU2_n3120FacRepNom[0] ;
         A279CliNom = P0AVU2_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV61Facturacion_tfacdivwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A396EmprCod) , GXutil.padr( "%" + GXutil.upper( AV61Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A430FacCod, 8, 0) , GXutil.padr( "%" + AV61Facturacion_tfacdivwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV61Facturacion_tfacdivwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV61Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "peseta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV61Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3096FacDivTCod, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "euro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV61Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3096FacDivTCod, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A3115FacDivCod, 2, 0) , GXutil.padr( "%" + AV61Facturacion_tfacdivwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3116FacDivAbr) , GXutil.padr( "%" + GXutil.upper( AV61Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3119FacRepCod) , GXutil.padr( "%" + GXutil.upper( AV61Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3120FacRepNom) , GXutil.padr( "%" + GXutil.upper( AV61Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A407EmprNom) , GXutil.padr( "%" + GXutil.upper( AV61Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV13CellRow = (int)(AV13CellRow+1) ;
            /* Execute user subroutine: 'BEFOREWRITELINE' */
            S172 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               if (true) return;
            }
            AV31VisibleColumnCount = 0 ;
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A396EmprCod, GXv_char5) ;
               tfacdivwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A430FacCod );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A252CliCod );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char5) ;
               tfacdivwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( "" );
               if ( GXutil.strcmp(GXutil.trim( A3096FacDivTCod), httpContext.getMessage( "P", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "PESETA", "") );
               }
               else if ( GXutil.strcmp(GXutil.trim( A3096FacDivTCod), httpContext.getMessage( "E", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "EURO", "") );
               }
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A3115FacDivCod );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A3116FacDivAbr, GXv_char5) ;
               tfacdivwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A3119FacRepCod, GXv_char5) ;
               tfacdivwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A3120FacRepNom, GXv_char5) ;
               tfacdivwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A407EmprNom, GXv_char5) ;
               tfacdivwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            /* Execute user subroutine: 'AFTERWRITELINE' */
            S182 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               if (true) return;
            }
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
      AV23ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "EmprCod", "", "Empresa", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "FacCod", "", "Numero Factura", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CliCod", "", "Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CliNom", "", "Nombre Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "FacDivTCod", "", "Divisa Traspaso Contable", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "FacDivCod", "", "Divisa", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "FacDivAbr", "", "Abreviatura", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "FacRepCod", "", "Representante", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "FacRepNom", "", "Nombre Representante", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "EmprNom", "", "Nombre", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Facturacion.TFACDIVWWColumnsSelector", GXv_char5) ;
      tfacdivwwexport.this.GXt_char4 = GXv_char5[0] ;
      AV27UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV27UserCustomValue)==0) ) )
      {
         AV24ColumnsSelectorAux.fromxml(AV27UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV24ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV24ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("Facturacion.TFACDIVWWGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Facturacion.TFACDIVWWGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("Facturacion.TFACDIVWWGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV81GXV3 = 1 ;
      while ( AV81GXV3 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV81GXV3));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV34TFEmprCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV35TFEmprCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACCOD") == 0 )
         {
            AV36TFFacCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV37TFFacCod_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV38TFCliCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFCliCod_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV40TFCliNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV41TFCliNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACDIVTCOD_SEL") == 0 )
         {
            AV42TFFacDivTCod_SelsJson = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV43TFFacDivTCod_Sels.fromJSonString(AV42TFFacDivTCod_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACDIVCOD") == 0 )
         {
            AV45TFFacDivCod = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV46TFFacDivCod_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACDIVABR") == 0 )
         {
            AV47TFFacDivAbr = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACDIVABR_SEL") == 0 )
         {
            AV48TFFacDivAbr_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACREPCOD") == 0 )
         {
            AV49TFFacRepCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACREPCOD_SEL") == 0 )
         {
            AV50TFFacRepCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACREPNOM") == 0 )
         {
            AV51TFFacRepNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACREPNOM_SEL") == 0 )
         {
            AV52TFFacRepNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM") == 0 )
         {
            AV53TFEmprNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM_SEL") == 0 )
         {
            AV54TFEmprNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV81GXV3 = (int)(AV81GXV3+1) ;
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
      this.aP0[0] = tfacdivwwexport.this.AV11Filename;
      this.aP1[0] = tfacdivwwexport.this.AV12ErrorMessage;
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
      AV18FilterFullText = "" ;
      AV35TFEmprCod_Sel = "" ;
      AV34TFEmprCod = "" ;
      AV41TFCliNom_Sel = "" ;
      AV40TFCliNom = "" ;
      AV43TFFacDivTCod_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV44TFFacDivTCod_Sel = "" ;
      AV48TFFacDivAbr_Sel = "" ;
      AV47TFFacDivAbr = "" ;
      AV50TFFacRepCod_Sel = "" ;
      AV49TFFacRepCod = "" ;
      AV52TFFacRepNom_Sel = "" ;
      AV51TFFacRepNom = "" ;
      AV54TFEmprNom_Sel = "" ;
      AV53TFEmprNom = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A396EmprCod = "" ;
      A279CliNom = "" ;
      A3096FacDivTCod = "" ;
      A3116FacDivAbr = "" ;
      A3119FacRepCod = "" ;
      A3120FacRepNom = "" ;
      A407EmprNom = "" ;
      AV61Facturacion_tfacdivwwds_1_filterfulltext = "" ;
      AV62Facturacion_tfacdivwwds_2_tfemprcod = "" ;
      AV63Facturacion_tfacdivwwds_3_tfemprcod_sel = "" ;
      AV68Facturacion_tfacdivwwds_8_tfclinom = "" ;
      AV69Facturacion_tfacdivwwds_9_tfclinom_sel = "" ;
      AV70Facturacion_tfacdivwwds_10_tffacdivtcod_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV73Facturacion_tfacdivwwds_13_tffacdivabr = "" ;
      AV74Facturacion_tfacdivwwds_14_tffacdivabr_sel = "" ;
      AV75Facturacion_tfacdivwwds_15_tffacrepcod = "" ;
      AV76Facturacion_tfacdivwwds_16_tffacrepcod_sel = "" ;
      AV77Facturacion_tfacdivwwds_17_tffacrepnom = "" ;
      AV78Facturacion_tfacdivwwds_18_tffacrepnom_sel = "" ;
      AV79Facturacion_tfacdivwwds_19_tfemprnom = "" ;
      AV80Facturacion_tfacdivwwds_20_tfemprnom_sel = "" ;
      lV61Facturacion_tfacdivwwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV62Facturacion_tfacdivwwds_2_tfemprcod = "" ;
      lV68Facturacion_tfacdivwwds_8_tfclinom = "" ;
      lV73Facturacion_tfacdivwwds_13_tffacdivabr = "" ;
      lV75Facturacion_tfacdivwwds_15_tffacrepcod = "" ;
      lV77Facturacion_tfacdivwwds_17_tffacrepnom = "" ;
      lV79Facturacion_tfacdivwwds_19_tfemprnom = "" ;
      P0AVU2_A407EmprNom = new String[] {""} ;
      P0AVU2_n407EmprNom = new boolean[] {false} ;
      P0AVU2_A3120FacRepNom = new String[] {""} ;
      P0AVU2_n3120FacRepNom = new boolean[] {false} ;
      P0AVU2_A3119FacRepCod = new String[] {""} ;
      P0AVU2_n3119FacRepCod = new boolean[] {false} ;
      P0AVU2_A3116FacDivAbr = new String[] {""} ;
      P0AVU2_n3116FacDivAbr = new boolean[] {false} ;
      P0AVU2_A3115FacDivCod = new byte[1] ;
      P0AVU2_n3115FacDivCod = new boolean[] {false} ;
      P0AVU2_A279CliNom = new String[] {""} ;
      P0AVU2_A252CliCod = new int[1] ;
      P0AVU2_A430FacCod = new int[1] ;
      P0AVU2_A396EmprCod = new String[] {""} ;
      P0AVU2_A3096FacDivTCod = new String[] {""} ;
      P0AVU2_n3096FacDivTCod = new boolean[] {false} ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV42TFFacDivTCod_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.tfacdivwwexport__default(),
         new Object[] {
             new Object[] {
            P0AVU2_A407EmprNom, P0AVU2_n407EmprNom, P0AVU2_A3120FacRepNom, P0AVU2_n3120FacRepNom, P0AVU2_A3119FacRepCod, P0AVU2_n3119FacRepCod, P0AVU2_A3116FacDivAbr, P0AVU2_n3116FacDivAbr, P0AVU2_A3115FacDivCod, P0AVU2_n3115FacDivCod,
            P0AVU2_A279CliNom, P0AVU2_A252CliCod, P0AVU2_A430FacCod, P0AVU2_A396EmprCod, P0AVU2_A3096FacDivTCod, P0AVU2_n3096FacDivTCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV45TFFacDivCod ;
   private byte AV46TFFacDivCod_To ;
   private byte A3115FacDivCod ;
   private byte AV71Facturacion_tfacdivwwds_11_tffacdivcod ;
   private byte AV72Facturacion_tfacdivwwds_12_tffacdivcod_to ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV36TFFacCod ;
   private int AV37TFFacCod_To ;
   private int AV38TFCliCod ;
   private int AV39TFCliCod_To ;
   private int AV58GXV1 ;
   private int AV59GXV2 ;
   private int A430FacCod ;
   private int A252CliCod ;
   private int AV64Facturacion_tfacdivwwds_4_tffaccod ;
   private int AV65Facturacion_tfacdivwwds_5_tffaccod_to ;
   private int AV66Facturacion_tfacdivwwds_6_tfclicod ;
   private int AV67Facturacion_tfacdivwwds_7_tfclicod_to ;
   private int AV70Facturacion_tfacdivwwds_10_tffacdivtcod_sels_size ;
   private int AV81GXV3 ;
   private long AV55i ;
   private long AV31VisibleColumnCount ;
   private String AV35TFEmprCod_Sel ;
   private String AV34TFEmprCod ;
   private String AV41TFCliNom_Sel ;
   private String AV40TFCliNom ;
   private String AV44TFFacDivTCod_Sel ;
   private String AV48TFFacDivAbr_Sel ;
   private String AV47TFFacDivAbr ;
   private String AV50TFFacRepCod_Sel ;
   private String AV49TFFacRepCod ;
   private String AV52TFFacRepNom_Sel ;
   private String AV51TFFacRepNom ;
   private String AV54TFEmprNom_Sel ;
   private String AV53TFEmprNom ;
   private String A396EmprCod ;
   private String A279CliNom ;
   private String A3096FacDivTCod ;
   private String A3116FacDivAbr ;
   private String A3119FacRepCod ;
   private String A3120FacRepNom ;
   private String A407EmprNom ;
   private String AV62Facturacion_tfacdivwwds_2_tfemprcod ;
   private String AV63Facturacion_tfacdivwwds_3_tfemprcod_sel ;
   private String AV68Facturacion_tfacdivwwds_8_tfclinom ;
   private String AV69Facturacion_tfacdivwwds_9_tfclinom_sel ;
   private String AV73Facturacion_tfacdivwwds_13_tffacdivabr ;
   private String AV74Facturacion_tfacdivwwds_14_tffacdivabr_sel ;
   private String AV75Facturacion_tfacdivwwds_15_tffacrepcod ;
   private String AV76Facturacion_tfacdivwwds_16_tffacrepcod_sel ;
   private String AV77Facturacion_tfacdivwwds_17_tffacrepnom ;
   private String AV78Facturacion_tfacdivwwds_18_tffacrepnom_sel ;
   private String AV79Facturacion_tfacdivwwds_19_tfemprnom ;
   private String AV80Facturacion_tfacdivwwds_20_tfemprnom_sel ;
   private String scmdbuf ;
   private String lV62Facturacion_tfacdivwwds_2_tfemprcod ;
   private String lV68Facturacion_tfacdivwwds_8_tfclinom ;
   private String lV73Facturacion_tfacdivwwds_13_tffacdivabr ;
   private String lV75Facturacion_tfacdivwwds_15_tffacrepcod ;
   private String lV77Facturacion_tfacdivwwds_17_tffacrepnom ;
   private String lV79Facturacion_tfacdivwwds_19_tfemprnom ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n407EmprNom ;
   private boolean n3120FacRepNom ;
   private boolean n3119FacRepCod ;
   private boolean n3116FacDivAbr ;
   private boolean n3115FacDivCod ;
   private boolean n3096FacDivTCod ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV42TFFacDivTCod_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV61Facturacion_tfacdivwwds_1_filterfulltext ;
   private String lV61Facturacion_tfacdivwwds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private GXSimpleCollection<String> AV43TFFacDivTCod_Sels ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AVU2_A407EmprNom ;
   private boolean[] P0AVU2_n407EmprNom ;
   private String[] P0AVU2_A3120FacRepNom ;
   private boolean[] P0AVU2_n3120FacRepNom ;
   private String[] P0AVU2_A3119FacRepCod ;
   private boolean[] P0AVU2_n3119FacRepCod ;
   private String[] P0AVU2_A3116FacDivAbr ;
   private boolean[] P0AVU2_n3116FacDivAbr ;
   private byte[] P0AVU2_A3115FacDivCod ;
   private boolean[] P0AVU2_n3115FacDivCod ;
   private String[] P0AVU2_A279CliNom ;
   private int[] P0AVU2_A252CliCod ;
   private int[] P0AVU2_A430FacCod ;
   private String[] P0AVU2_A396EmprCod ;
   private String[] P0AVU2_A3096FacDivTCod ;
   private boolean[] P0AVU2_n3096FacDivTCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private GXSimpleCollection<String> AV70Facturacion_tfacdivwwds_10_tffacdivtcod_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV25ColumnsSelector_Column ;
}

final  class tfacdivwwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AVU2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A3096FacDivTCod ,
                                          GXSimpleCollection<String> AV70Facturacion_tfacdivwwds_10_tffacdivtcod_sels ,
                                          String AV63Facturacion_tfacdivwwds_3_tfemprcod_sel ,
                                          String AV62Facturacion_tfacdivwwds_2_tfemprcod ,
                                          int AV64Facturacion_tfacdivwwds_4_tffaccod ,
                                          int AV65Facturacion_tfacdivwwds_5_tffaccod_to ,
                                          int AV66Facturacion_tfacdivwwds_6_tfclicod ,
                                          int AV67Facturacion_tfacdivwwds_7_tfclicod_to ,
                                          String AV69Facturacion_tfacdivwwds_9_tfclinom_sel ,
                                          String AV68Facturacion_tfacdivwwds_8_tfclinom ,
                                          int AV70Facturacion_tfacdivwwds_10_tffacdivtcod_sels_size ,
                                          byte AV71Facturacion_tfacdivwwds_11_tffacdivcod ,
                                          byte AV72Facturacion_tfacdivwwds_12_tffacdivcod_to ,
                                          String AV74Facturacion_tfacdivwwds_14_tffacdivabr_sel ,
                                          String AV73Facturacion_tfacdivwwds_13_tffacdivabr ,
                                          String AV76Facturacion_tfacdivwwds_16_tffacrepcod_sel ,
                                          String AV75Facturacion_tfacdivwwds_15_tffacrepcod ,
                                          String AV78Facturacion_tfacdivwwds_18_tffacrepnom_sel ,
                                          String AV77Facturacion_tfacdivwwds_17_tffacrepnom ,
                                          String AV80Facturacion_tfacdivwwds_20_tfemprnom_sel ,
                                          String AV79Facturacion_tfacdivwwds_19_tfemprnom ,
                                          String A396EmprCod ,
                                          int A430FacCod ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          byte A3115FacDivCod ,
                                          String A3116FacDivAbr ,
                                          String A3119FacRepCod ,
                                          String A3120FacRepNom ,
                                          String A407EmprNom ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV61Facturacion_tfacdivwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[18];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T3.EmprNom, T4.RepNom AS FacRepNom, T1.FacRepCod AS FacRepCod, T2.DivAbr AS FacDivAbr, T1.FacDivCod AS FacDivCod, T5.CliNom, T1.CliCod, T1.FacCod, T1.EmprCod," ;
      scmdbuf += " T1.FacDivTCod FROM ((((TXPCFAVEN T1 LEFT JOIN TXPDIVISA T2 ON T2.DivCod = T1.FacDivCod) INNER JOIN TXPEMPRES T3 ON T3.EmprCod = T1.EmprCod) LEFT JOIN TXPREPRES" ;
      scmdbuf += " T4 ON T4.EmprCod = T1.EmprCod AND T4.RepCod = T1.FacRepCod) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod)" ;
      if ( (GXutil.strcmp("", AV63Facturacion_tfacdivwwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV62Facturacion_tfacdivwwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Facturacion_tfacdivwwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( ! (0==AV64Facturacion_tfacdivwwds_4_tffaccod) )
      {
         addWhere(sWhereString, "(T1.FacCod >= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (0==AV65Facturacion_tfacdivwwds_5_tffaccod_to) )
      {
         addWhere(sWhereString, "(T1.FacCod <= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (0==AV66Facturacion_tfacdivwwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (0==AV67Facturacion_tfacdivwwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Facturacion_tfacdivwwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV68Facturacion_tfacdivwwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Facturacion_tfacdivwwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CliNom = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( AV70Facturacion_tfacdivwwds_10_tffacdivtcod_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV70Facturacion_tfacdivwwds_10_tffacdivtcod_sels, "T1.FacDivTCod IN (", ")")+")");
      }
      if ( ! (0==AV71Facturacion_tfacdivwwds_11_tffacdivcod) )
      {
         addWhere(sWhereString, "(T1.FacDivCod >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV72Facturacion_tfacdivwwds_12_tffacdivcod_to) )
      {
         addWhere(sWhereString, "(T1.FacDivCod <= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Facturacion_tfacdivwwds_14_tffacdivabr_sel)==0) && ( ! (GXutil.strcmp("", AV73Facturacion_tfacdivwwds_13_tffacdivabr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.DivAbr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Facturacion_tfacdivwwds_14_tffacdivabr_sel)==0) )
      {
         addWhere(sWhereString, "(T2.DivAbr = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Facturacion_tfacdivwwds_16_tffacrepcod_sel)==0) && ( ! (GXutil.strcmp("", AV75Facturacion_tfacdivwwds_15_tffacrepcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FacRepCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Facturacion_tfacdivwwds_16_tffacrepcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FacRepCod = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Facturacion_tfacdivwwds_18_tffacrepnom_sel)==0) && ( ! (GXutil.strcmp("", AV77Facturacion_tfacdivwwds_17_tffacrepnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.RepNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Facturacion_tfacdivwwds_18_tffacrepnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.RepNom = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Facturacion_tfacdivwwds_20_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV79Facturacion_tfacdivwwds_19_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Facturacion_tfacdivwwds_20_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.EmprNom = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacDivTCod" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacDivTCod DESC" ;
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
         scmdbuf += " ORDER BY T1.FacCod" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.CliNom" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.CliNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacDivCod" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacDivCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.DivAbr" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.DivAbr DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacRepCod" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacRepCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.RepNom" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.RepNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.EmprNom" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.EmprNom DESC" ;
      }
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
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
                  return conditional_P0AVU2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() , (String)dynConstraints[32] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AVU2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 34);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 30);
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((String[]) buf[13])[0] = rslt.getString(9, 3);
               ((String[]) buf[14])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[18], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[26]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[27]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 34);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 34);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               return;
      }
   }

}

