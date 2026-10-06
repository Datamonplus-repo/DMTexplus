package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tclientwwexport extends GXProcedure
{
   public tclientwwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tclientwwexport.class ), "" );
   }

   public tclientwwexport( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      tclientwwexport.this.aP1 = new String[] {""};
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
      tclientwwexport.this.aP0 = aP0;
      tclientwwexport.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV105cliact = AV106WebSession.getValue("&CliAct") ;
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
      AV11Filename = "./PrivateTempStorage/" + "TCLIENTWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      tclientwwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV101FilterFullText, GXv_char5) ;
      tclientwwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV60TFCliCod) && (0==AV61TFCliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tclientwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV60TFCliCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tclientwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV61TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV65TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tclientwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV65TFCliNom_Sel, GXv_char5) ;
         tclientwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV64TFCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tclientwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV64TFCliNom, GXv_char5) ;
            tclientwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV63TFCliNif_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nif", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tclientwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV63TFCliNif_Sel, GXv_char5) ;
         tclientwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV62TFCliNif)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nif", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tclientwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV62TFCliNif, GXv_char5) ;
            tclientwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV67TFCliDom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Domicilio ", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tclientwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV67TFCliDom_Sel, GXv_char5) ;
         tclientwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV66TFCliDom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Domicilio ", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tclientwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV66TFCliDom, GXv_char5) ;
            tclientwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV69TFCliPob_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Poblacion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tclientwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV69TFCliPob_Sel, GXv_char5) ;
         tclientwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV68TFCliPob)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Poblacion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tclientwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV68TFCliPob, GXv_char5) ;
            tclientwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV71TFCliCp_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "C. Postal", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tclientwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV71TFCliCp_Sel, GXv_char5) ;
         tclientwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV70TFCliCp)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "C. Postal", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tclientwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV70TFCliCp, GXv_char5) ;
            tclientwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV103TFCliCp2_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "C. Postal(Cont)", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tclientwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV103TFCliCp2_Sel, GXv_char5) ;
         tclientwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV102TFCliCp2)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "C. Postal(Cont)", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tclientwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV102TFCliCp2, GXv_char5) ;
            tclientwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV75TFPrvDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Provincia", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tclientwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV75TFPrvDsc_Sel, GXv_char5) ;
         tclientwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV74TFPrvDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Provincia", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tclientwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV74TFPrvDsc, GXv_char5) ;
            tclientwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV57VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV45Session.getValue("TCLIENTWWColumnsSelector"), "") != 0 )
      {
         AV52ColumnsSelectorXML = AV45Session.getValue("TCLIENTWWColumnsSelector") ;
         AV49ColumnsSelector.fromxml(AV52ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV109GXV1 = 1 ;
      while ( AV109GXV1 <= AV49ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV51ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV49ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV109GXV1));
         if ( AV51ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV57VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV51ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV51ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV51ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV57VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV57VisibleColumnCount), 1, 1).setColor( 11 );
            AV57VisibleColumnCount = (long)(AV57VisibleColumnCount+1) ;
         }
         AV109GXV1 = (int)(AV109GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV111Tclientwwds_1_filterfulltext = AV101FilterFullText ;
      AV112Tclientwwds_2_tfclicod = AV60TFCliCod ;
      AV113Tclientwwds_3_tfclicod_to = AV61TFCliCod_To ;
      AV114Tclientwwds_4_tfclinom = AV64TFCliNom ;
      AV115Tclientwwds_5_tfclinom_sel = AV65TFCliNom_Sel ;
      AV116Tclientwwds_6_tfclinif = AV62TFCliNif ;
      AV117Tclientwwds_7_tfclinif_sel = AV63TFCliNif_Sel ;
      AV118Tclientwwds_8_tfclidom = AV66TFCliDom ;
      AV119Tclientwwds_9_tfclidom_sel = AV67TFCliDom_Sel ;
      AV120Tclientwwds_10_tfclipob = AV68TFCliPob ;
      AV121Tclientwwds_11_tfclipob_sel = AV69TFCliPob_Sel ;
      AV122Tclientwwds_12_tfclicp = AV70TFCliCp ;
      AV123Tclientwwds_13_tfclicp_sel = AV71TFCliCp_Sel ;
      AV124Tclientwwds_14_tfclicp2 = AV102TFCliCp2 ;
      AV125Tclientwwds_15_tfclicp2_sel = AV103TFCliCp2_Sel ;
      AV126Tclientwwds_16_tfprvdsc = AV74TFPrvDsc ;
      AV127Tclientwwds_17_tfprvdsc_sel = AV75TFPrvDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV111Tclientwwds_1_filterfulltext ,
                                           Integer.valueOf(AV112Tclientwwds_2_tfclicod) ,
                                           Integer.valueOf(AV113Tclientwwds_3_tfclicod_to) ,
                                           AV115Tclientwwds_5_tfclinom_sel ,
                                           AV114Tclientwwds_4_tfclinom ,
                                           AV117Tclientwwds_7_tfclinif_sel ,
                                           AV116Tclientwwds_6_tfclinif ,
                                           AV119Tclientwwds_9_tfclidom_sel ,
                                           AV118Tclientwwds_8_tfclidom ,
                                           AV121Tclientwwds_11_tfclipob_sel ,
                                           AV120Tclientwwds_10_tfclipob ,
                                           AV123Tclientwwds_13_tfclicp_sel ,
                                           AV122Tclientwwds_12_tfclicp ,
                                           AV125Tclientwwds_15_tfclicp2_sel ,
                                           AV124Tclientwwds_14_tfclicp2 ,
                                           AV127Tclientwwds_17_tfprvdsc_sel ,
                                           AV126Tclientwwds_16_tfprvdsc ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A278CliNif ,
                                           A260CliDom ,
                                           A295CliPob ,
                                           A256CliCp ,
                                           A4828CliCp2 ,
                                           A787PrvDsc ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           A10045CliAct ,
                                           AV105cliact } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV111Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV111Tclientwwds_1_filterfulltext), "%", "") ;
      lV111Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV111Tclientwwds_1_filterfulltext), "%", "") ;
      lV111Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV111Tclientwwds_1_filterfulltext), "%", "") ;
      lV111Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV111Tclientwwds_1_filterfulltext), "%", "") ;
      lV111Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV111Tclientwwds_1_filterfulltext), "%", "") ;
      lV111Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV111Tclientwwds_1_filterfulltext), "%", "") ;
      lV111Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV111Tclientwwds_1_filterfulltext), "%", "") ;
      lV111Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV111Tclientwwds_1_filterfulltext), "%", "") ;
      lV114Tclientwwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV114Tclientwwds_4_tfclinom), 30, "%") ;
      lV116Tclientwwds_6_tfclinif = GXutil.padr( GXutil.rtrim( AV116Tclientwwds_6_tfclinif), 20, "%") ;
      lV118Tclientwwds_8_tfclidom = GXutil.padr( GXutil.rtrim( AV118Tclientwwds_8_tfclidom), 34, "%") ;
      lV120Tclientwwds_10_tfclipob = GXutil.padr( GXutil.rtrim( AV120Tclientwwds_10_tfclipob), 30, "%") ;
      lV122Tclientwwds_12_tfclicp = GXutil.padr( GXutil.rtrim( AV122Tclientwwds_12_tfclicp), 6, "%") ;
      lV124Tclientwwds_14_tfclicp2 = GXutil.padr( GXutil.rtrim( AV124Tclientwwds_14_tfclicp2), 6, "%") ;
      lV126Tclientwwds_16_tfprvdsc = GXutil.padr( GXutil.rtrim( AV126Tclientwwds_16_tfprvdsc), 30, "%") ;
      /* Using cursor P082H2 */
      pr_default.execute(0, new Object[] {AV105cliact, lV111Tclientwwds_1_filterfulltext, lV111Tclientwwds_1_filterfulltext, lV111Tclientwwds_1_filterfulltext, lV111Tclientwwds_1_filterfulltext, lV111Tclientwwds_1_filterfulltext, lV111Tclientwwds_1_filterfulltext, lV111Tclientwwds_1_filterfulltext, lV111Tclientwwds_1_filterfulltext, Integer.valueOf(AV112Tclientwwds_2_tfclicod), Integer.valueOf(AV113Tclientwwds_3_tfclicod_to), lV114Tclientwwds_4_tfclinom, AV115Tclientwwds_5_tfclinom_sel, lV116Tclientwwds_6_tfclinif, AV117Tclientwwds_7_tfclinif_sel, lV118Tclientwwds_8_tfclidom, AV119Tclientwwds_9_tfclidom_sel, lV120Tclientwwds_10_tfclipob, AV121Tclientwwds_11_tfclipob_sel, lV122Tclientwwds_12_tfclicp, AV123Tclientwwds_13_tfclicp_sel, lV124Tclientwwds_14_tfclicp2, AV125Tclientwwds_15_tfclicp2_sel, lV126Tclientwwds_16_tfprvdsc, AV127Tclientwwds_17_tfprvdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A781PrvCod = P082H2_A781PrvCod[0] ;
         A10045CliAct = P082H2_A10045CliAct[0] ;
         A787PrvDsc = P082H2_A787PrvDsc[0] ;
         n787PrvDsc = P082H2_n787PrvDsc[0] ;
         A4828CliCp2 = P082H2_A4828CliCp2[0] ;
         A256CliCp = P082H2_A256CliCp[0] ;
         A295CliPob = P082H2_A295CliPob[0] ;
         A260CliDom = P082H2_A260CliDom[0] ;
         A278CliNif = P082H2_A278CliNif[0] ;
         A279CliNom = P082H2_A279CliNom[0] ;
         A252CliCod = P082H2_A252CliCod[0] ;
         A396EmprCod = P082H2_A396EmprCod[0] ;
         A787PrvDsc = P082H2_A787PrvDsc[0] ;
         n787PrvDsc = P082H2_n787PrvDsc[0] ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV57VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV49ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV57VisibleColumnCount), 1, 1).setNumber( A252CliCod );
            AV57VisibleColumnCount = (long)(AV57VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV49ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char5) ;
            tclientwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV57VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV57VisibleColumnCount = (long)(AV57VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV49ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A278CliNif, GXv_char5) ;
            tclientwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV57VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV57VisibleColumnCount = (long)(AV57VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV49ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A260CliDom, GXv_char5) ;
            tclientwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV57VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV57VisibleColumnCount = (long)(AV57VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV49ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A295CliPob, GXv_char5) ;
            tclientwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV57VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV57VisibleColumnCount = (long)(AV57VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV49ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A256CliCp, GXv_char5) ;
            tclientwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV57VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV57VisibleColumnCount = (long)(AV57VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV49ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4828CliCp2, GXv_char5) ;
            tclientwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV57VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV57VisibleColumnCount = (long)(AV57VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV49ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A787PrvDsc, GXv_char5) ;
            tclientwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV57VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV57VisibleColumnCount = (long)(AV57VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV49ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A10045CliAct, GXv_char5) ;
            tclientwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV57VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV57VisibleColumnCount = (long)(AV57VisibleColumnCount+1) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S182 ();
         if ( returnInSub )
         {
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
      AV49ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6[0] = AV49ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CliCod", "", "Cliente", true, "") ;
      AV49ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV49ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CliNom", "", "Nombre", true, "") ;
      AV49ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV49ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CliNif", "", "Nif", true, "") ;
      AV49ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV49ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CliDom", "", "Domicilio ", true, "") ;
      AV49ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV49ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CliPob", "", "Poblacion", true, "") ;
      AV49ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV49ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CliCp", "", "C. Postal", true, "") ;
      AV49ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV49ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CliCp2", "", "C. Postal(Cont)", true, "") ;
      AV49ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV49ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvDsc", "", "Provincia", true, "") ;
      AV49ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV49ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CliAct", "", "Activo?", true, "") ;
      AV49ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV53UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TCLIENTWWColumnsSelector", GXv_char5) ;
      tclientwwexport.this.GXt_char4 = GXv_char5[0] ;
      AV53UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV53UserCustomValue)==0) ) )
      {
         AV50ColumnsSelectorAux.fromxml(AV53UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV50ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV49ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV50ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV49ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV45Session.getValue("TCLIENTWWGridState"), "") == 0 )
      {
         AV47GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TCLIENTWWGridState"), null, null);
      }
      else
      {
         AV47GridState.fromxml(AV45Session.getValue("TCLIENTWWGridState"), null, null);
      }
      AV16OrderedBy = AV47GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV47GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV128GXV2 = 1 ;
      while ( AV128GXV2 <= AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV48GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV128GXV2));
         if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV101FilterFullText = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV60TFCliCod = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV61TFCliCod_To = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV64TFCliNom = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV65TFCliNom_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINIF") == 0 )
         {
            AV62TFCliNif = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINIF_SEL") == 0 )
         {
            AV63TFCliNif_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIDOM") == 0 )
         {
            AV66TFCliDom = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIDOM_SEL") == 0 )
         {
            AV67TFCliDom_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIPOB") == 0 )
         {
            AV68TFCliPob = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIPOB_SEL") == 0 )
         {
            AV69TFCliPob_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICP") == 0 )
         {
            AV70TFCliCp = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICP_SEL") == 0 )
         {
            AV71TFCliCp_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICP2") == 0 )
         {
            AV102TFCliCp2 = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICP2_SEL") == 0 )
         {
            AV103TFCliCp2_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDSC") == 0 )
         {
            AV74TFPrvDsc = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDSC_SEL") == 0 )
         {
            AV75TFPrvDsc_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV128GXV2 = (int)(AV128GXV2+1) ;
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
      this.aP0[0] = tclientwwexport.this.AV11Filename;
      this.aP1[0] = tclientwwexport.this.AV12ErrorMessage;
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
      AV105cliact = "" ;
      AV106WebSession = httpContext.getWebSession();
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV10ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV101FilterFullText = "" ;
      AV65TFCliNom_Sel = "" ;
      AV64TFCliNom = "" ;
      AV63TFCliNif_Sel = "" ;
      AV62TFCliNif = "" ;
      AV67TFCliDom_Sel = "" ;
      AV66TFCliDom = "" ;
      AV69TFCliPob_Sel = "" ;
      AV68TFCliPob = "" ;
      AV71TFCliCp_Sel = "" ;
      AV70TFCliCp = "" ;
      AV103TFCliCp2_Sel = "" ;
      AV102TFCliCp2 = "" ;
      AV75TFPrvDsc_Sel = "" ;
      AV74TFPrvDsc = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV45Session = httpContext.getWebSession();
      AV52ColumnsSelectorXML = "" ;
      AV49ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV51ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A279CliNom = "" ;
      A278CliNif = "" ;
      A260CliDom = "" ;
      A295CliPob = "" ;
      A256CliCp = "" ;
      A4828CliCp2 = "" ;
      A787PrvDsc = "" ;
      A10045CliAct = "" ;
      AV111Tclientwwds_1_filterfulltext = "" ;
      AV114Tclientwwds_4_tfclinom = "" ;
      AV115Tclientwwds_5_tfclinom_sel = "" ;
      AV116Tclientwwds_6_tfclinif = "" ;
      AV117Tclientwwds_7_tfclinif_sel = "" ;
      AV118Tclientwwds_8_tfclidom = "" ;
      AV119Tclientwwds_9_tfclidom_sel = "" ;
      AV120Tclientwwds_10_tfclipob = "" ;
      AV121Tclientwwds_11_tfclipob_sel = "" ;
      AV122Tclientwwds_12_tfclicp = "" ;
      AV123Tclientwwds_13_tfclicp_sel = "" ;
      AV124Tclientwwds_14_tfclicp2 = "" ;
      AV125Tclientwwds_15_tfclicp2_sel = "" ;
      AV126Tclientwwds_16_tfprvdsc = "" ;
      AV127Tclientwwds_17_tfprvdsc_sel = "" ;
      scmdbuf = "" ;
      lV111Tclientwwds_1_filterfulltext = "" ;
      lV114Tclientwwds_4_tfclinom = "" ;
      lV116Tclientwwds_6_tfclinif = "" ;
      lV118Tclientwwds_8_tfclidom = "" ;
      lV120Tclientwwds_10_tfclipob = "" ;
      lV122Tclientwwds_12_tfclicp = "" ;
      lV124Tclientwwds_14_tfclicp2 = "" ;
      lV126Tclientwwds_16_tfprvdsc = "" ;
      P082H2_A781PrvCod = new short[1] ;
      P082H2_A10045CliAct = new String[] {""} ;
      P082H2_A787PrvDsc = new String[] {""} ;
      P082H2_n787PrvDsc = new boolean[] {false} ;
      P082H2_A4828CliCp2 = new String[] {""} ;
      P082H2_A256CliCp = new String[] {""} ;
      P082H2_A295CliPob = new String[] {""} ;
      P082H2_A260CliDom = new String[] {""} ;
      P082H2_A278CliNif = new String[] {""} ;
      P082H2_A279CliNom = new String[] {""} ;
      P082H2_A252CliCod = new int[1] ;
      P082H2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV53UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV50ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV47GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV48GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tclientwwexport__default(),
         new Object[] {
             new Object[] {
            P082H2_A781PrvCod, P082H2_A10045CliAct, P082H2_A787PrvDsc, P082H2_n787PrvDsc, P082H2_A4828CliCp2, P082H2_A256CliCp, P082H2_A295CliPob, P082H2_A260CliDom, P082H2_A278CliNif, P082H2_A279CliNom,
            P082H2_A252CliCod, P082H2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short A781PrvCod ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV60TFCliCod ;
   private int AV61TFCliCod_To ;
   private int AV109GXV1 ;
   private int A252CliCod ;
   private int AV112Tclientwwds_2_tfclicod ;
   private int AV113Tclientwwds_3_tfclicod_to ;
   private int AV128GXV2 ;
   private long AV57VisibleColumnCount ;
   private String AV105cliact ;
   private String AV65TFCliNom_Sel ;
   private String AV64TFCliNom ;
   private String AV63TFCliNif_Sel ;
   private String AV62TFCliNif ;
   private String AV67TFCliDom_Sel ;
   private String AV66TFCliDom ;
   private String AV69TFCliPob_Sel ;
   private String AV68TFCliPob ;
   private String AV71TFCliCp_Sel ;
   private String AV70TFCliCp ;
   private String AV103TFCliCp2_Sel ;
   private String AV102TFCliCp2 ;
   private String AV75TFPrvDsc_Sel ;
   private String AV74TFPrvDsc ;
   private String A279CliNom ;
   private String A278CliNif ;
   private String A260CliDom ;
   private String A295CliPob ;
   private String A256CliCp ;
   private String A4828CliCp2 ;
   private String A787PrvDsc ;
   private String A10045CliAct ;
   private String AV114Tclientwwds_4_tfclinom ;
   private String AV115Tclientwwds_5_tfclinom_sel ;
   private String AV116Tclientwwds_6_tfclinif ;
   private String AV117Tclientwwds_7_tfclinif_sel ;
   private String AV118Tclientwwds_8_tfclidom ;
   private String AV119Tclientwwds_9_tfclidom_sel ;
   private String AV120Tclientwwds_10_tfclipob ;
   private String AV121Tclientwwds_11_tfclipob_sel ;
   private String AV122Tclientwwds_12_tfclicp ;
   private String AV123Tclientwwds_13_tfclicp_sel ;
   private String AV124Tclientwwds_14_tfclicp2 ;
   private String AV125Tclientwwds_15_tfclicp2_sel ;
   private String AV126Tclientwwds_16_tfprvdsc ;
   private String AV127Tclientwwds_17_tfprvdsc_sel ;
   private String scmdbuf ;
   private String lV114Tclientwwds_4_tfclinom ;
   private String lV116Tclientwwds_6_tfclinif ;
   private String lV118Tclientwwds_8_tfclidom ;
   private String lV120Tclientwwds_10_tfclipob ;
   private String lV122Tclientwwds_12_tfclicp ;
   private String lV124Tclientwwds_14_tfclicp2 ;
   private String lV126Tclientwwds_16_tfprvdsc ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n787PrvDsc ;
   private String AV52ColumnsSelectorXML ;
   private String AV53UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV101FilterFullText ;
   private String AV111Tclientwwds_1_filterfulltext ;
   private String lV111Tclientwwds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV106WebSession ;
   private com.genexus.webpanels.WebSession AV45Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private short[] P082H2_A781PrvCod ;
   private String[] P082H2_A10045CliAct ;
   private String[] P082H2_A787PrvDsc ;
   private boolean[] P082H2_n787PrvDsc ;
   private String[] P082H2_A4828CliCp2 ;
   private String[] P082H2_A256CliCp ;
   private String[] P082H2_A295CliPob ;
   private String[] P082H2_A260CliDom ;
   private String[] P082H2_A278CliNif ;
   private String[] P082H2_A279CliNom ;
   private int[] P082H2_A252CliCod ;
   private String[] P082H2_A396EmprCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV47GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV48GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV49ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV50ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV51ColumnsSelector_Column ;
}

final  class tclientwwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P082H2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV111Tclientwwds_1_filterfulltext ,
                                          int AV112Tclientwwds_2_tfclicod ,
                                          int AV113Tclientwwds_3_tfclicod_to ,
                                          String AV115Tclientwwds_5_tfclinom_sel ,
                                          String AV114Tclientwwds_4_tfclinom ,
                                          String AV117Tclientwwds_7_tfclinif_sel ,
                                          String AV116Tclientwwds_6_tfclinif ,
                                          String AV119Tclientwwds_9_tfclidom_sel ,
                                          String AV118Tclientwwds_8_tfclidom ,
                                          String AV121Tclientwwds_11_tfclipob_sel ,
                                          String AV120Tclientwwds_10_tfclipob ,
                                          String AV123Tclientwwds_13_tfclicp_sel ,
                                          String AV122Tclientwwds_12_tfclicp ,
                                          String AV125Tclientwwds_15_tfclicp2_sel ,
                                          String AV124Tclientwwds_14_tfclicp2 ,
                                          String AV127Tclientwwds_17_tfprvdsc_sel ,
                                          String AV126Tclientwwds_16_tfprvdsc ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A278CliNif ,
                                          String A260CliDom ,
                                          String A295CliPob ,
                                          String A256CliCp ,
                                          String A4828CliCp2 ,
                                          String A787PrvDsc ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String A10045CliAct ,
                                          String AV105cliact )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[25];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.PrvCod, T1.CliAct, T2.PrvDsc, T1.CliCp2, T1.CliCp, T1.CliPob, T1.CliDom, T1.CliNif, T1.CliNom, T1.CliCod, T1.EmprCod FROM (TXPCLIENT T1 INNER JOIN TXPPROVIN" ;
      scmdbuf += " T2 ON T2.PrvCod = T1.PrvCod)" ;
      addWhere(sWhereString, "(T1.CliAct = ?)");
      if ( ! (GXutil.strcmp("", AV111Tclientwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.CliNif) like '%' || UPPER(?)) or ( UPPER(T1.CliDom) like '%' || UPPER(?)) or ( UPPER(T1.CliPob) like '%' || UPPER(?)) or ( UPPER(T1.CliCp) like '%' || UPPER(?)) or ( UPPER(T1.CliCp2) like '%' || UPPER(?)) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV112Tclientwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (0==AV113Tclientwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Tclientwwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV114Tclientwwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Tclientwwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliNom = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tclientwwds_7_tfclinif_sel)==0) && ( ! (GXutil.strcmp("", AV116Tclientwwds_6_tfclinif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tclientwwds_7_tfclinif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliNif = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Tclientwwds_9_tfclidom_sel)==0) && ( ! (GXutil.strcmp("", AV118Tclientwwds_8_tfclidom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Tclientwwds_9_tfclidom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliDom = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Tclientwwds_11_tfclipob_sel)==0) && ( ! (GXutil.strcmp("", AV120Tclientwwds_10_tfclipob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Tclientwwds_11_tfclipob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliPob = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Tclientwwds_13_tfclicp_sel)==0) && ( ! (GXutil.strcmp("", AV122Tclientwwds_12_tfclicp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Tclientwwds_13_tfclicp_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliCp = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Tclientwwds_15_tfclicp2_sel)==0) && ( ! (GXutil.strcmp("", AV124Tclientwwds_14_tfclicp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Tclientwwds_15_tfclicp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliCp2 = ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Tclientwwds_17_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV126Tclientwwds_16_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Tclientwwds_17_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliNom" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliNif" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliNif DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliDom" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliDom DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliPob" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliPob DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCp" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCp DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCp2" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCp2 DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrvDsc" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrvDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliAct" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliAct DESC" ;
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
                  return conditional_P082H2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Boolean) dynConstraints[26]).booleanValue() , (String)dynConstraints[27] , (String)dynConstraints[28] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P082H2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((String[]) buf[7])[0] = rslt.getString(7, 34);
               ((String[]) buf[8])[0] = rslt.getString(8, 20);
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 3);
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
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 34);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 34);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               return;
      }
   }

}

