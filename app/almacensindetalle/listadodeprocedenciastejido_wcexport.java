package app.almacensindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class listadodeprocedenciastejido_wcexport extends GXProcedure
{
   public listadodeprocedenciastejido_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( listadodeprocedenciastejido_wcexport.class ), "" );
   }

   public listadodeprocedenciastejido_wcexport( int remoteHandle ,
                                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      listadodeprocedenciastejido_wcexport.this.aP1 = new String[] {""};
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
      listadodeprocedenciastejido_wcexport.this.aP0 = aP0;
      listadodeprocedenciastejido_wcexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "ListadodeProcedenciasTejido_WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      listadodeprocedenciastejido_wcexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      listadodeprocedenciastejido_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV34TFProceCod) && (0==AV35TFProceCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeprocedenciastejido_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV34TFProceCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeprocedenciastejido_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV35TFProceCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV37TFProceNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeprocedenciastejido_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFProceNom_Sel, GXv_char5) ;
         listadodeprocedenciastejido_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV36TFProceNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeprocedenciastejido_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFProceNom, GXv_char5) ;
            listadodeprocedenciastejido_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV39TFProceNif_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nif", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeprocedenciastejido_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFProceNif_Sel, GXv_char5) ;
         listadodeprocedenciastejido_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV38TFProceNif)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nif", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeprocedenciastejido_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFProceNif, GXv_char5) ;
            listadodeprocedenciastejido_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV41TFProceDom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Domicilio", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeprocedenciastejido_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFProceDom_Sel, GXv_char5) ;
         listadodeprocedenciastejido_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV40TFProceDom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Domicilio", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeprocedenciastejido_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFProceDom, GXv_char5) ;
            listadodeprocedenciastejido_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV43TFProcePob_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Población", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeprocedenciastejido_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFProcePob_Sel, GXv_char5) ;
         listadodeprocedenciastejido_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV42TFProcePob)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Población", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeprocedenciastejido_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFProcePob, GXv_char5) ;
            listadodeprocedenciastejido_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV44TFPrvCod) && (0==AV45TFPrvCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeprocedenciastejido_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV44TFPrvCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeprocedenciastejido_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV45TFPrvCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV47TFPrvDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Provincia", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeprocedenciastejido_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFPrvDsc_Sel, GXv_char5) ;
         listadodeprocedenciastejido_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV46TFPrvDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Provincia", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeprocedenciastejido_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFPrvDsc, GXv_char5) ;
            listadodeprocedenciastejido_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV49TFPoceCp_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Postal", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeprocedenciastejido_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFPoceCp_Sel, GXv_char5) ;
         listadodeprocedenciastejido_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV48TFPoceCp)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Postal", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeprocedenciastejido_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFPoceCp, GXv_char5) ;
            listadodeprocedenciastejido_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV65TFPoceCp2_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Postal (PT)", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeprocedenciastejido_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV65TFPoceCp2_Sel, GXv_char5) ;
         listadodeprocedenciastejido_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV64TFPoceCp2)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Postal (PT)", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeprocedenciastejido_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV64TFPoceCp2, GXv_char5) ;
            listadodeprocedenciastejido_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV51TFProceTel1_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Teléfono", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeprocedenciastejido_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV51TFProceTel1_Sel, GXv_char5) ;
         listadodeprocedenciastejido_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV50TFProceTel1)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Teléfono", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeprocedenciastejido_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFProceTel1, GXv_char5) ;
            listadodeprocedenciastejido_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV53TFProceTel2_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Teléfono", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeprocedenciastejido_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV53TFProceTel2_Sel, GXv_char5) ;
         listadodeprocedenciastejido_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV52TFProceTel2)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Teléfono", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeprocedenciastejido_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV52TFProceTel2, GXv_char5) ;
            listadodeprocedenciastejido_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV55TFProceTelex_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Telex", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeprocedenciastejido_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV55TFProceTelex_Sel, GXv_char5) ;
         listadodeprocedenciastejido_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV54TFProceTelex)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Telex", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeprocedenciastejido_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV54TFProceTelex, GXv_char5) ;
            listadodeprocedenciastejido_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV57TFProPers_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Persona Contacto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeprocedenciastejido_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV57TFProPers_Sel, GXv_char5) ;
         listadodeprocedenciastejido_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV56TFProPers)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Persona Contacto", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeprocedenciastejido_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV56TFProPers, GXv_char5) ;
            listadodeprocedenciastejido_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV59TFProEmail_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Email", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeprocedenciastejido_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV59TFProEmail_Sel, GXv_char5) ;
         listadodeprocedenciastejido_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV58TFProEmail)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Email", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeprocedenciastejido_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV58TFProEmail, GXv_char5) ;
            listadodeprocedenciastejido_wcexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("AlmacenSinDetalle.ListadodeProcedenciasTejido_WCColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("AlmacenSinDetalle.ListadodeProcedenciasTejido_WCColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV68GXV1 = 1 ;
      while ( AV68GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV68GXV1));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV68GXV1 = (int)(AV68GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV70Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod = AV61Emprcod ;
      AV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = AV18FilterFullText ;
      AV72Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod = AV34TFProceCod ;
      AV73Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to = AV35TFProceCod_To ;
      AV74Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom = AV36TFProceNom ;
      AV75Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel = AV37TFProceNom_Sel ;
      AV76Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif = AV38TFProceNif ;
      AV77Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel = AV39TFProceNif_Sel ;
      AV78Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom = AV40TFProceDom ;
      AV79Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel = AV41TFProceDom_Sel ;
      AV80Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob = AV42TFProcePob ;
      AV81Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel = AV43TFProcePob_Sel ;
      AV82Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod = AV44TFPrvCod ;
      AV83Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to = AV45TFPrvCod_To ;
      AV84Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc = AV46TFPrvDsc ;
      AV85Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel = AV47TFPrvDsc_Sel ;
      AV86Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp = AV48TFPoceCp ;
      AV87Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel = AV49TFPoceCp_Sel ;
      AV88Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 = AV64TFPoceCp2 ;
      AV89Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel = AV65TFPoceCp2_Sel ;
      AV90Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 = AV50TFProceTel1 ;
      AV91Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel = AV51TFProceTel1_Sel ;
      AV92Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 = AV52TFProceTel2 ;
      AV93Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel = AV53TFProceTel2_Sel ;
      AV94Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex = AV54TFProceTelex ;
      AV95Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel = AV55TFProceTelex_Sel ;
      AV96Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers = AV56TFProPers ;
      AV97Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel = AV57TFProPers_Sel ;
      AV98Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail = AV58TFProEmail ;
      AV99Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel = AV59TFProEmail_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext ,
                                           Short.valueOf(AV72Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod) ,
                                           Short.valueOf(AV73Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to) ,
                                           AV75Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel ,
                                           AV74Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom ,
                                           AV77Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel ,
                                           AV76Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif ,
                                           AV79Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel ,
                                           AV78Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom ,
                                           AV81Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel ,
                                           AV80Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob ,
                                           Short.valueOf(AV82Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod) ,
                                           Short.valueOf(AV83Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to) ,
                                           AV85Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel ,
                                           AV84Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc ,
                                           AV87Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel ,
                                           AV86Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp ,
                                           AV89Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel ,
                                           AV88Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 ,
                                           AV91Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel ,
                                           AV90Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 ,
                                           AV93Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel ,
                                           AV92Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 ,
                                           AV95Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel ,
                                           AV94Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex ,
                                           AV97Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel ,
                                           AV96Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers ,
                                           AV99Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel ,
                                           AV98Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail ,
                                           Short.valueOf(AV62Procecodfrom) ,
                                           Short.valueOf(AV63Procecodto) ,
                                           Short.valueOf(A970ProceCod) ,
                                           A971ProceNom ,
                                           A993ProceNif ,
                                           A994ProceDom ,
                                           A988ProcePob ,
                                           Short.valueOf(A781PrvCod) ,
                                           A787PrvDsc ,
                                           A989PoceCp ,
                                           A14029PoceCp2 ,
                                           A990ProceTel1 ,
                                           A991ProceTel2 ,
                                           A992ProceTelex ,
                                           A10390ProPers ,
                                           A10391ProEmail ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV70Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV74Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom = GXutil.padr( GXutil.rtrim( AV74Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom), 30, "%") ;
      lV76Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif = GXutil.padr( GXutil.rtrim( AV76Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif), 20, "%") ;
      lV78Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom = GXutil.padr( GXutil.rtrim( AV78Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom), 34, "%") ;
      lV80Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob = GXutil.padr( GXutil.rtrim( AV80Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob), 30, "%") ;
      lV84Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc = GXutil.padr( GXutil.rtrim( AV84Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc), 30, "%") ;
      lV86Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp = GXutil.padr( GXutil.rtrim( AV86Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp), 6, "%") ;
      lV88Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 = GXutil.padr( GXutil.rtrim( AV88Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2), 6, "%") ;
      lV90Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 = GXutil.padr( GXutil.rtrim( AV90Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1), 9, "%") ;
      lV92Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 = GXutil.padr( GXutil.rtrim( AV92Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2), 9, "%") ;
      lV94Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex = GXutil.padr( GXutil.rtrim( AV94Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex), 14, "%") ;
      lV96Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers = GXutil.padr( GXutil.rtrim( AV96Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers), 40, "%") ;
      lV98Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail = GXutil.padr( GXutil.rtrim( AV98Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail), 40, "%") ;
      /* Using cursor P09HE2 */
      pr_default.execute(0, new Object[] {AV70Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod, lV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, Short.valueOf(AV72Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod), Short.valueOf(AV73Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to), lV74Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom, AV75Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel, lV76Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif, AV77Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel, lV78Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom, AV79Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel, lV80Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob, AV81Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel, Short.valueOf(AV82Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod), Short.valueOf(AV83Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to), lV84Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc, AV85Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel, lV86Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp, AV87Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel, lV88Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2, AV89Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel, lV90Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1, AV91Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel, lV92Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2, AV93Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel, lV94Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex, AV95Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel, lV96Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers, AV97Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel, lV98Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail, AV99Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel, Short.valueOf(AV62Procecodfrom), Short.valueOf(AV63Procecodto)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10391ProEmail = P09HE2_A10391ProEmail[0] ;
         n10391ProEmail = P09HE2_n10391ProEmail[0] ;
         A10390ProPers = P09HE2_A10390ProPers[0] ;
         n10390ProPers = P09HE2_n10390ProPers[0] ;
         A992ProceTelex = P09HE2_A992ProceTelex[0] ;
         n992ProceTelex = P09HE2_n992ProceTelex[0] ;
         A991ProceTel2 = P09HE2_A991ProceTel2[0] ;
         n991ProceTel2 = P09HE2_n991ProceTel2[0] ;
         A990ProceTel1 = P09HE2_A990ProceTel1[0] ;
         n990ProceTel1 = P09HE2_n990ProceTel1[0] ;
         A14029PoceCp2 = P09HE2_A14029PoceCp2[0] ;
         n14029PoceCp2 = P09HE2_n14029PoceCp2[0] ;
         A989PoceCp = P09HE2_A989PoceCp[0] ;
         n989PoceCp = P09HE2_n989PoceCp[0] ;
         A787PrvDsc = P09HE2_A787PrvDsc[0] ;
         n787PrvDsc = P09HE2_n787PrvDsc[0] ;
         A781PrvCod = P09HE2_A781PrvCod[0] ;
         n781PrvCod = P09HE2_n781PrvCod[0] ;
         A988ProcePob = P09HE2_A988ProcePob[0] ;
         n988ProcePob = P09HE2_n988ProcePob[0] ;
         A994ProceDom = P09HE2_A994ProceDom[0] ;
         n994ProceDom = P09HE2_n994ProceDom[0] ;
         A993ProceNif = P09HE2_A993ProceNif[0] ;
         n993ProceNif = P09HE2_n993ProceNif[0] ;
         A971ProceNom = P09HE2_A971ProceNom[0] ;
         n971ProceNom = P09HE2_n971ProceNom[0] ;
         A970ProceCod = P09HE2_A970ProceCod[0] ;
         A396EmprCod = P09HE2_A396EmprCod[0] ;
         A787PrvDsc = P09HE2_A787PrvDsc[0] ;
         n787PrvDsc = P09HE2_n787PrvDsc[0] ;
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
         AV31VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A970ProceCod );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A971ProceNom, GXv_char5) ;
            listadodeprocedenciastejido_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A993ProceNif, GXv_char5) ;
            listadodeprocedenciastejido_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A994ProceDom, GXv_char5) ;
            listadodeprocedenciastejido_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A988ProcePob, GXv_char5) ;
            listadodeprocedenciastejido_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A781PrvCod );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A787PrvDsc, GXv_char5) ;
            listadodeprocedenciastejido_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A989PoceCp, GXv_char5) ;
            listadodeprocedenciastejido_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14029PoceCp2, GXv_char5) ;
            listadodeprocedenciastejido_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A990ProceTel1, GXv_char5) ;
            listadodeprocedenciastejido_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A991ProceTel2, GXv_char5) ;
            listadodeprocedenciastejido_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A992ProceTelex, GXv_char5) ;
            listadodeprocedenciastejido_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A10390ProPers, GXv_char5) ;
            listadodeprocedenciastejido_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A10391ProEmail, GXv_char5) ;
            listadodeprocedenciastejido_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
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
      AV23ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ProceCod", "", "Codigo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ProceNom", "", "Nombre", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ProceNif", "", "Nif", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ProceDom", "", "Domicilio", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ProcePob", "", "Población", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvCod", "", "Codigo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvDsc", "", "Provincia", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PoceCp", "", "Código Postal", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PoceCp2", "", "Postal (PT)", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ProceTel1", "", "Teléfono", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ProceTel2", "", "Teléfono", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ProceTelex", "", "Telex", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ProPers", "", "Persona Contacto", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ProEmail", "", "Email", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "AlmacenSinDetalle.ListadodeProcedenciasTejido_WCColumnsSelector", GXv_char5) ;
      listadodeprocedenciastejido_wcexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("AlmacenSinDetalle.ListadodeProcedenciasTejido_WCGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "AlmacenSinDetalle.ListadodeProcedenciasTejido_WCGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("AlmacenSinDetalle.ListadodeProcedenciasTejido_WCGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV100GXV2 = 1 ;
      while ( AV100GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV100GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCECOD") == 0 )
         {
            AV34TFProceCod = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFProceCod_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM") == 0 )
         {
            AV36TFProceNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM_SEL") == 0 )
         {
            AV37TFProceNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENIF") == 0 )
         {
            AV38TFProceNif = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENIF_SEL") == 0 )
         {
            AV39TFProceNif_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCEDOM") == 0 )
         {
            AV40TFProceDom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCEDOM_SEL") == 0 )
         {
            AV41TFProceDom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCEPOB") == 0 )
         {
            AV42TFProcePob = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCEPOB_SEL") == 0 )
         {
            AV43TFProcePob_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCOD") == 0 )
         {
            AV44TFPrvCod = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFPrvCod_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDSC") == 0 )
         {
            AV46TFPrvDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDSC_SEL") == 0 )
         {
            AV47TFPrvDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPOCECP") == 0 )
         {
            AV48TFPoceCp = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPOCECP_SEL") == 0 )
         {
            AV49TFPoceCp_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPOCECP2") == 0 )
         {
            AV64TFPoceCp2 = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPOCECP2_SEL") == 0 )
         {
            AV65TFPoceCp2_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETEL1") == 0 )
         {
            AV50TFProceTel1 = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETEL1_SEL") == 0 )
         {
            AV51TFProceTel1_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETEL2") == 0 )
         {
            AV52TFProceTel2 = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETEL2_SEL") == 0 )
         {
            AV53TFProceTel2_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETELEX") == 0 )
         {
            AV54TFProceTelex = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETELEX_SEL") == 0 )
         {
            AV55TFProceTelex_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROPERS") == 0 )
         {
            AV56TFProPers = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROPERS_SEL") == 0 )
         {
            AV57TFProPers_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROEMAIL") == 0 )
         {
            AV58TFProEmail = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROEMAIL_SEL") == 0 )
         {
            AV59TFProEmail_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV61Emprcod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROCECODFROM") == 0 )
         {
            AV62Procecodfrom = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROCECODTO") == 0 )
         {
            AV63Procecodto = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV100GXV2 = (int)(AV100GXV2+1) ;
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
      this.aP0[0] = listadodeprocedenciastejido_wcexport.this.AV11Filename;
      this.aP1[0] = listadodeprocedenciastejido_wcexport.this.AV12ErrorMessage;
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
      AV37TFProceNom_Sel = "" ;
      AV36TFProceNom = "" ;
      AV39TFProceNif_Sel = "" ;
      AV38TFProceNif = "" ;
      AV41TFProceDom_Sel = "" ;
      AV40TFProceDom = "" ;
      AV43TFProcePob_Sel = "" ;
      AV42TFProcePob = "" ;
      AV47TFPrvDsc_Sel = "" ;
      AV46TFPrvDsc = "" ;
      AV49TFPoceCp_Sel = "" ;
      AV48TFPoceCp = "" ;
      AV65TFPoceCp2_Sel = "" ;
      AV64TFPoceCp2 = "" ;
      AV51TFProceTel1_Sel = "" ;
      AV50TFProceTel1 = "" ;
      AV53TFProceTel2_Sel = "" ;
      AV52TFProceTel2 = "" ;
      AV55TFProceTelex_Sel = "" ;
      AV54TFProceTelex = "" ;
      AV57TFProPers_Sel = "" ;
      AV56TFProPers = "" ;
      AV59TFProEmail_Sel = "" ;
      AV58TFProEmail = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A971ProceNom = "" ;
      A993ProceNif = "" ;
      A994ProceDom = "" ;
      A988ProcePob = "" ;
      A787PrvDsc = "" ;
      A989PoceCp = "" ;
      A14029PoceCp2 = "" ;
      A990ProceTel1 = "" ;
      A991ProceTel2 = "" ;
      A992ProceTelex = "" ;
      A10390ProPers = "" ;
      A10391ProEmail = "" ;
      AV70Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod = "" ;
      AV61Emprcod = "" ;
      AV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = "" ;
      AV74Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom = "" ;
      AV75Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel = "" ;
      AV76Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif = "" ;
      AV77Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel = "" ;
      AV78Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom = "" ;
      AV79Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel = "" ;
      AV80Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob = "" ;
      AV81Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel = "" ;
      AV84Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc = "" ;
      AV85Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel = "" ;
      AV86Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp = "" ;
      AV87Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel = "" ;
      AV88Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 = "" ;
      AV89Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel = "" ;
      AV90Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 = "" ;
      AV91Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel = "" ;
      AV92Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 = "" ;
      AV93Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel = "" ;
      AV94Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex = "" ;
      AV95Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel = "" ;
      AV96Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers = "" ;
      AV97Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel = "" ;
      AV98Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail = "" ;
      AV99Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel = "" ;
      scmdbuf = "" ;
      lV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = "" ;
      lV74Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom = "" ;
      lV76Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif = "" ;
      lV78Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom = "" ;
      lV80Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob = "" ;
      lV84Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc = "" ;
      lV86Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp = "" ;
      lV88Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 = "" ;
      lV90Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 = "" ;
      lV92Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 = "" ;
      lV94Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex = "" ;
      lV96Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers = "" ;
      lV98Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail = "" ;
      A396EmprCod = "" ;
      P09HE2_A10391ProEmail = new String[] {""} ;
      P09HE2_n10391ProEmail = new boolean[] {false} ;
      P09HE2_A10390ProPers = new String[] {""} ;
      P09HE2_n10390ProPers = new boolean[] {false} ;
      P09HE2_A992ProceTelex = new String[] {""} ;
      P09HE2_n992ProceTelex = new boolean[] {false} ;
      P09HE2_A991ProceTel2 = new String[] {""} ;
      P09HE2_n991ProceTel2 = new boolean[] {false} ;
      P09HE2_A990ProceTel1 = new String[] {""} ;
      P09HE2_n990ProceTel1 = new boolean[] {false} ;
      P09HE2_A14029PoceCp2 = new String[] {""} ;
      P09HE2_n14029PoceCp2 = new boolean[] {false} ;
      P09HE2_A989PoceCp = new String[] {""} ;
      P09HE2_n989PoceCp = new boolean[] {false} ;
      P09HE2_A787PrvDsc = new String[] {""} ;
      P09HE2_n787PrvDsc = new boolean[] {false} ;
      P09HE2_A781PrvCod = new short[1] ;
      P09HE2_n781PrvCod = new boolean[] {false} ;
      P09HE2_A988ProcePob = new String[] {""} ;
      P09HE2_n988ProcePob = new boolean[] {false} ;
      P09HE2_A994ProceDom = new String[] {""} ;
      P09HE2_n994ProceDom = new boolean[] {false} ;
      P09HE2_A993ProceNif = new String[] {""} ;
      P09HE2_n993ProceNif = new boolean[] {false} ;
      P09HE2_A971ProceNom = new String[] {""} ;
      P09HE2_n971ProceNom = new boolean[] {false} ;
      P09HE2_A970ProceCod = new short[1] ;
      P09HE2_A396EmprCod = new String[] {""} ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.listadodeprocedenciastejido_wcexport__default(),
         new Object[] {
             new Object[] {
            P09HE2_A10391ProEmail, P09HE2_n10391ProEmail, P09HE2_A10390ProPers, P09HE2_n10390ProPers, P09HE2_A992ProceTelex, P09HE2_n992ProceTelex, P09HE2_A991ProceTel2, P09HE2_n991ProceTel2, P09HE2_A990ProceTel1, P09HE2_n990ProceTel1,
            P09HE2_A14029PoceCp2, P09HE2_n14029PoceCp2, P09HE2_A989PoceCp, P09HE2_n989PoceCp, P09HE2_A787PrvDsc, P09HE2_n787PrvDsc, P09HE2_A781PrvCod, P09HE2_n781PrvCod, P09HE2_A988ProcePob, P09HE2_n988ProcePob,
            P09HE2_A994ProceDom, P09HE2_n994ProceDom, P09HE2_A993ProceNif, P09HE2_n993ProceNif, P09HE2_A971ProceNom, P09HE2_n971ProceNom, P09HE2_A970ProceCod, P09HE2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV34TFProceCod ;
   private short AV35TFProceCod_To ;
   private short AV44TFPrvCod ;
   private short AV45TFPrvCod_To ;
   private short GXv_int3[] ;
   private short A970ProceCod ;
   private short A781PrvCod ;
   private short AV72Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod ;
   private short AV73Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to ;
   private short AV82Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod ;
   private short AV83Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to ;
   private short AV62Procecodfrom ;
   private short AV63Procecodto ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV68GXV1 ;
   private int AV100GXV2 ;
   private long AV31VisibleColumnCount ;
   private String AV37TFProceNom_Sel ;
   private String AV36TFProceNom ;
   private String AV39TFProceNif_Sel ;
   private String AV38TFProceNif ;
   private String AV41TFProceDom_Sel ;
   private String AV40TFProceDom ;
   private String AV43TFProcePob_Sel ;
   private String AV42TFProcePob ;
   private String AV47TFPrvDsc_Sel ;
   private String AV46TFPrvDsc ;
   private String AV49TFPoceCp_Sel ;
   private String AV48TFPoceCp ;
   private String AV65TFPoceCp2_Sel ;
   private String AV64TFPoceCp2 ;
   private String AV51TFProceTel1_Sel ;
   private String AV50TFProceTel1 ;
   private String AV53TFProceTel2_Sel ;
   private String AV52TFProceTel2 ;
   private String AV55TFProceTelex_Sel ;
   private String AV54TFProceTelex ;
   private String AV57TFProPers_Sel ;
   private String AV56TFProPers ;
   private String AV59TFProEmail_Sel ;
   private String AV58TFProEmail ;
   private String A971ProceNom ;
   private String A993ProceNif ;
   private String A994ProceDom ;
   private String A988ProcePob ;
   private String A787PrvDsc ;
   private String A989PoceCp ;
   private String A14029PoceCp2 ;
   private String A990ProceTel1 ;
   private String A991ProceTel2 ;
   private String A992ProceTelex ;
   private String A10390ProPers ;
   private String A10391ProEmail ;
   private String AV70Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod ;
   private String AV61Emprcod ;
   private String AV74Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom ;
   private String AV75Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel ;
   private String AV76Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif ;
   private String AV77Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel ;
   private String AV78Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom ;
   private String AV79Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel ;
   private String AV80Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob ;
   private String AV81Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel ;
   private String AV84Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc ;
   private String AV85Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel ;
   private String AV86Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp ;
   private String AV87Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel ;
   private String AV88Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 ;
   private String AV89Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel ;
   private String AV90Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 ;
   private String AV91Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel ;
   private String AV92Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 ;
   private String AV93Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel ;
   private String AV94Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex ;
   private String AV95Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel ;
   private String AV96Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers ;
   private String AV97Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel ;
   private String AV98Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail ;
   private String AV99Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel ;
   private String scmdbuf ;
   private String lV74Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom ;
   private String lV76Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif ;
   private String lV78Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom ;
   private String lV80Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob ;
   private String lV84Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc ;
   private String lV86Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp ;
   private String lV88Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 ;
   private String lV90Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 ;
   private String lV92Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 ;
   private String lV94Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex ;
   private String lV96Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers ;
   private String lV98Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n10391ProEmail ;
   private boolean n10390ProPers ;
   private boolean n992ProceTelex ;
   private boolean n991ProceTel2 ;
   private boolean n990ProceTel1 ;
   private boolean n14029PoceCp2 ;
   private boolean n989PoceCp ;
   private boolean n787PrvDsc ;
   private boolean n781PrvCod ;
   private boolean n988ProcePob ;
   private boolean n994ProceDom ;
   private boolean n993ProceNif ;
   private boolean n971ProceNom ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext ;
   private String lV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P09HE2_A10391ProEmail ;
   private boolean[] P09HE2_n10391ProEmail ;
   private String[] P09HE2_A10390ProPers ;
   private boolean[] P09HE2_n10390ProPers ;
   private String[] P09HE2_A992ProceTelex ;
   private boolean[] P09HE2_n992ProceTelex ;
   private String[] P09HE2_A991ProceTel2 ;
   private boolean[] P09HE2_n991ProceTel2 ;
   private String[] P09HE2_A990ProceTel1 ;
   private boolean[] P09HE2_n990ProceTel1 ;
   private String[] P09HE2_A14029PoceCp2 ;
   private boolean[] P09HE2_n14029PoceCp2 ;
   private String[] P09HE2_A989PoceCp ;
   private boolean[] P09HE2_n989PoceCp ;
   private String[] P09HE2_A787PrvDsc ;
   private boolean[] P09HE2_n787PrvDsc ;
   private short[] P09HE2_A781PrvCod ;
   private boolean[] P09HE2_n781PrvCod ;
   private String[] P09HE2_A988ProcePob ;
   private boolean[] P09HE2_n988ProcePob ;
   private String[] P09HE2_A994ProceDom ;
   private boolean[] P09HE2_n994ProceDom ;
   private String[] P09HE2_A993ProceNif ;
   private boolean[] P09HE2_n993ProceNif ;
   private String[] P09HE2_A971ProceNom ;
   private boolean[] P09HE2_n971ProceNom ;
   private short[] P09HE2_A970ProceCod ;
   private String[] P09HE2_A396EmprCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
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

final  class listadodeprocedenciastejido_wcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09HE2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext ,
                                          short AV72Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod ,
                                          short AV73Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to ,
                                          String AV75Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel ,
                                          String AV74Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom ,
                                          String AV77Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel ,
                                          String AV76Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif ,
                                          String AV79Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel ,
                                          String AV78Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom ,
                                          String AV81Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel ,
                                          String AV80Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob ,
                                          short AV82Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod ,
                                          short AV83Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to ,
                                          String AV85Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel ,
                                          String AV84Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc ,
                                          String AV87Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel ,
                                          String AV86Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp ,
                                          String AV89Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel ,
                                          String AV88Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 ,
                                          String AV91Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel ,
                                          String AV90Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 ,
                                          String AV93Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel ,
                                          String AV92Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 ,
                                          String AV95Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel ,
                                          String AV94Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex ,
                                          String AV97Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel ,
                                          String AV96Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers ,
                                          String AV99Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel ,
                                          String AV98Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail ,
                                          short AV62Procecodfrom ,
                                          short AV63Procecodto ,
                                          short A970ProceCod ,
                                          String A971ProceNom ,
                                          String A993ProceNif ,
                                          String A994ProceDom ,
                                          String A988ProcePob ,
                                          short A781PrvCod ,
                                          String A787PrvDsc ,
                                          String A989PoceCp ,
                                          String A14029PoceCp2 ,
                                          String A990ProceTel1 ,
                                          String A991ProceTel2 ,
                                          String A992ProceTelex ,
                                          String A10390ProPers ,
                                          String A10391ProEmail ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV70Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[45];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.ProEmail, T1.ProPers, T1.ProceTelex, T1.ProceTel2, T1.ProceTel1, T1.PoceCp2, T1.PoceCp, T2.PrvDsc, T1.PrvCod, T1.ProcePob, T1.ProceDom, T1.ProceNif, T1.ProceNom," ;
      scmdbuf += " T1.ProceCod, T1.EmprCod FROM (TXPPROCED T1 LEFT JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV71Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.ProceCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ProceNom) like '%' || UPPER(?)) or ( UPPER(T1.ProceNif) like '%' || UPPER(?)) or ( UPPER(T1.ProceDom) like '%' || UPPER(?)) or ( UPPER(T1.ProcePob) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvCod,'990'), 2) like '%' || ?) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel1) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTelex) like '%' || UPPER(?)) or ( UPPER(T1.ProPers) like '%' || UPPER(?)) or ( UPPER(T1.ProEmail) like '%' || UPPER(?)))");
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
         GXv_int8[9] = (byte)(1) ;
         GXv_int8[10] = (byte)(1) ;
         GXv_int8[11] = (byte)(1) ;
         GXv_int8[12] = (byte)(1) ;
         GXv_int8[13] = (byte)(1) ;
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (0==AV72Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (0==AV73Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV74Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNom = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel)==0) && ( ! (GXutil.strcmp("", AV76Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNif = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel)==0) && ( ! (GXutil.strcmp("", AV78Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceDom = ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel)==0) && ( ! (GXutil.strcmp("", AV80Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProcePob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProcePob = ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV82Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod) )
      {
         addWhere(sWhereString, "(T1.PrvCod >= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (0==AV83Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to) )
      {
         addWhere(sWhereString, "(T1.PrvCod <= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV84Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel)==0) && ( ! (GXutil.strcmp("", AV86Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp = ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel)==0) && ( ! (GXutil.strcmp("", AV88Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp2 = ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel)==0) && ( ! (GXutil.strcmp("", AV90Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel1) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel1 = ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel)==0) && ( ! (GXutil.strcmp("", AV92Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel2 = ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel)==0) && ( ! (GXutil.strcmp("", AV94Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTelex) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTelex = ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel)==0) && ( ! (GXutil.strcmp("", AV96Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProPers) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProPers = ?)");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel)==0) && ( ! (GXutil.strcmp("", AV98Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProEmail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProEmail = ?)");
      }
      else
      {
         GXv_int8[42] = (byte)(1) ;
      }
      if ( ! (0==AV62Procecodfrom) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int8[43] = (byte)(1) ;
      }
      if ( ! (0==AV63Procecodto) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int8[44] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.ProceNom" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.ProceNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.ProceCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.ProceCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.ProceNif" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.ProceNif DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.ProceDom" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.ProceDom DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.ProcePob" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.ProcePob DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.PrvCod" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.PrvCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T2.PrvDsc" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T2.PrvDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.PoceCp" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.PoceCp DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.PoceCp2" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.PoceCp2 DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.ProceTel1" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.ProceTel1 DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.ProceTel2" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.ProceTel2 DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.ProceTelex" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.ProceTelex DESC" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.ProPers" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.ProPers DESC" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.ProEmail" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.ProEmail DESC" ;
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
                  return conditional_P09HE2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , ((Boolean) dynConstraints[46]).booleanValue() , (String)dynConstraints[47] , (String)dynConstraints[48] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09HE2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 40);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 14);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 9);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(9);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 34);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(12, 20);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(14);
               ((String[]) buf[27])[0] = rslt.getString(15, 3);
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
                  stmt.setString(sIdx, (String)parms[45], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 20);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 20);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 34);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 34);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 6);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 6);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 6);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 6);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 9);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 9);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 9);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 9);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 14);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 14);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 40);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 40);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 40);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 40);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[88]).shortValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[89]).shortValue());
               }
               return;
      }
   }

}

