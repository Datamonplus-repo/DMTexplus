package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class listadodeproveedores_wcexport extends GXProcedure
{
   public listadodeproveedores_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( listadodeproveedores_wcexport.class ), "" );
   }

   public listadodeproveedores_wcexport( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      listadodeproveedores_wcexport.this.aP1 = new String[] {""};
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
      listadodeproveedores_wcexport.this.aP0 = aP0;
      listadodeproveedores_wcexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "ListadodeProveedores_WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      listadodeproveedores_wcexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      listadodeproveedores_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV34TFPrvNum) && (0==AV35TFPrvNum_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Proveedor", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproveedores_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV34TFPrvNum );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproveedores_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV35TFPrvNum_To );
      }
      if ( ! ( (GXutil.strcmp("", AV37TFPrvNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproveedores_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFPrvNom_Sel, GXv_char5) ;
         listadodeproveedores_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV36TFPrvNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeproveedores_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFPrvNom, GXv_char5) ;
            listadodeproveedores_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV39TFPrvDir_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Direccion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproveedores_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFPrvDir_Sel, GXv_char5) ;
         listadodeproveedores_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV38TFPrvDir)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Direccion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeproveedores_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFPrvDir, GXv_char5) ;
            listadodeproveedores_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV41TFPrvPob_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Poblacion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproveedores_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFPrvPob_Sel, GXv_char5) ;
         listadodeproveedores_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV40TFPrvPob)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Poblacion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeproveedores_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFPrvPob, GXv_char5) ;
            listadodeproveedores_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV43TFPrvCpo_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Postal", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproveedores_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFPrvCpo_Sel, GXv_char5) ;
         listadodeproveedores_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV42TFPrvCpo)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Postal", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeproveedores_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFPrvCpo, GXv_char5) ;
            listadodeproveedores_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV45TFPrvCp2_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "C. Postal 2", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproveedores_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFPrvCp2_Sel, GXv_char5) ;
         listadodeproveedores_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV44TFPrvCp2)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "C. Postal 2", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeproveedores_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFPrvCp2, GXv_char5) ;
            listadodeproveedores_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV47TFPrvNif_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N.I.F.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproveedores_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFPrvNif_Sel, GXv_char5) ;
         listadodeproveedores_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV46TFPrvNif)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N.I.F.", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeproveedores_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFPrvNif, GXv_char5) ;
            listadodeproveedores_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV49TFPrvTlf_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Telefonos", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproveedores_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFPrvTlf_Sel, GXv_char5) ;
         listadodeproveedores_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV48TFPrvTlf)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Telefonos", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeproveedores_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFPrvTlf, GXv_char5) ;
            listadodeproveedores_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV51TFPrvTlx_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Telex", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproveedores_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV51TFPrvTlx_Sel, GXv_char5) ;
         listadodeproveedores_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV50TFPrvTlx)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Telex", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeproveedores_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFPrvTlx, GXv_char5) ;
            listadodeproveedores_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV53TFPrvFax_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fax", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproveedores_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV53TFPrvFax_Sel, GXv_char5) ;
         listadodeproveedores_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV52TFPrvFax)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fax", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeproveedores_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV52TFPrvFax, GXv_char5) ;
            listadodeproveedores_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV55TFPrvMail_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Mail", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproveedores_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV55TFPrvMail_Sel, GXv_char5) ;
         listadodeproveedores_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV54TFPrvMail)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Mail", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeproveedores_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV54TFPrvMail, GXv_char5) ;
            listadodeproveedores_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV57TFFpgCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Forma Pago", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproveedores_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV57TFFpgCod_Sel, GXv_char5) ;
         listadodeproveedores_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV56TFFpgCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Forma Pago", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeproveedores_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV56TFFpgCod, GXv_char5) ;
            listadodeproveedores_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV59TFFpgDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproveedores_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV59TFFpgDsc_Sel, GXv_char5) ;
         listadodeproveedores_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV58TFFpgDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeproveedores_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV58TFFpgDsc, GXv_char5) ;
            listadodeproveedores_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV60TFPrvVto) && (0==AV61TFPrvVto_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº Vtos.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproveedores_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV60TFPrvVto );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproveedores_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV61TFPrvVto_To );
      }
      if ( ! ( (0==AV62TFPrvDiaPag) && (0==AV63TFPrvDiaPag_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Dias Pago", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproveedores_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV62TFPrvDiaPag );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproveedores_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV63TFPrvDiaPag_To );
      }
      if ( ! ( (0==AV64TFPrvPer) && (0==AV65TFPrvPer_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Periodicidad", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproveedores_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV64TFPrvPer );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproveedores_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV65TFPrvPer_To );
      }
      if ( ! ( (GXutil.strcmp("", AV67TFPrvRep_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Representante", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproveedores_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV67TFPrvRep_Sel, GXv_char5) ;
         listadodeproveedores_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV66TFPrvRep)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Representante", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeproveedores_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV66TFPrvRep, GXv_char5) ;
            listadodeproveedores_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV68TFPrvPlaEnt) && (0==AV69TFPrvPlaEnt_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Dias Plazo Entrega", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproveedores_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV68TFPrvPlaEnt );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproveedores_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV69TFPrvPlaEnt_To );
      }
      if ( ! ( ( AV71TFPrvMetTra_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Metodo Transporte", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproveedores_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV75i = 1 ;
         AV81GXV1 = 1 ;
         while ( AV81GXV1 <= AV71TFPrvMetTra_Sels.size() )
         {
            AV72TFPrvMetTra_Sel = (String)AV71TFPrvMetTra_Sels.elementAt(-1+AV81GXV1) ;
            if ( AV75i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV72TFPrvMetTra_Sel), httpContext.getMessage( "S", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Su Transporte", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV72TFPrvMetTra_Sel), httpContext.getMessage( "N", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Nuestro", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV72TFPrvMetTra_Sel), httpContext.getMessage( "A", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Agencia", "") );
            }
            AV75i = (long)(AV75i+1) ;
            AV81GXV1 = (int)(AV81GXV1+1) ;
         }
      }
      if ( ! ( (GXutil.strcmp("", AV74TFPrvCta_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cuenta Contable", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproveedores_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV74TFPrvCta_Sel, GXv_char5) ;
         listadodeproveedores_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV73TFPrvCta)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cuenta Contable", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeproveedores_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV73TFPrvCta, GXv_char5) ;
            listadodeproveedores_wcexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("StocksQuimicos.ListadodeProveedores_WCColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("StocksQuimicos.ListadodeProveedores_WCColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV82GXV2 = 1 ;
      while ( AV82GXV2 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV82GXV2));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV82GXV2 = (int)(AV82GXV2+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV84Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext = AV18FilterFullText ;
      AV85Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum = AV34TFPrvNum ;
      AV86Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to = AV35TFPrvNum_To ;
      AV87Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = AV36TFPrvNom ;
      AV88Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel = AV37TFPrvNom_Sel ;
      AV89Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = AV38TFPrvDir ;
      AV90Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel = AV39TFPrvDir_Sel ;
      AV91Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = AV40TFPrvPob ;
      AV92Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel = AV41TFPrvPob_Sel ;
      AV93Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = AV42TFPrvCpo ;
      AV94Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel = AV43TFPrvCpo_Sel ;
      AV95Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = AV44TFPrvCp2 ;
      AV96Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel = AV45TFPrvCp2_Sel ;
      AV97Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = AV46TFPrvNif ;
      AV98Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel = AV47TFPrvNif_Sel ;
      AV99Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = AV48TFPrvTlf ;
      AV100Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel = AV49TFPrvTlf_Sel ;
      AV101Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = AV50TFPrvTlx ;
      AV102Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel = AV51TFPrvTlx_Sel ;
      AV103Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = AV52TFPrvFax ;
      AV104Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel = AV53TFPrvFax_Sel ;
      AV105Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = AV54TFPrvMail ;
      AV106Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel = AV55TFPrvMail_Sel ;
      AV107Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = AV56TFFpgCod ;
      AV108Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel = AV57TFFpgCod_Sel ;
      AV109Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = AV58TFFpgDsc ;
      AV110Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel = AV59TFFpgDsc_Sel ;
      AV111Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto = AV60TFPrvVto ;
      AV112Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to = AV61TFPrvVto_To ;
      AV113Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag = AV62TFPrvDiaPag ;
      AV114Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to = AV63TFPrvDiaPag_To ;
      AV115Stocksquimicos_listadodeproveedores_wcds_32_tfprvper = AV64TFPrvPer ;
      AV116Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to = AV65TFPrvPer_To ;
      AV117Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = AV66TFPrvRep ;
      AV118Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel = AV67TFPrvRep_Sel ;
      AV119Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent = AV68TFPrvPlaEnt ;
      AV120Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to = AV69TFPrvPlaEnt_To ;
      AV121Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels = AV71TFPrvMetTra_Sels ;
      AV122Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = AV73TFPrvCta ;
      AV123Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel = AV74TFPrvCta_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A792PrvMetTra ,
                                           AV121Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels ,
                                           Integer.valueOf(AV85Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum) ,
                                           Integer.valueOf(AV86Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to) ,
                                           AV88Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel ,
                                           AV87Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ,
                                           AV90Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel ,
                                           AV89Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ,
                                           AV92Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel ,
                                           AV91Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ,
                                           AV94Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel ,
                                           AV93Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ,
                                           AV96Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel ,
                                           AV95Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ,
                                           AV98Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel ,
                                           AV97Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ,
                                           AV100Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel ,
                                           AV99Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ,
                                           AV102Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel ,
                                           AV101Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ,
                                           AV104Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel ,
                                           AV103Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ,
                                           AV106Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel ,
                                           AV105Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ,
                                           AV108Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel ,
                                           AV107Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ,
                                           AV110Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel ,
                                           AV109Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ,
                                           Byte.valueOf(AV111Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto) ,
                                           Byte.valueOf(AV112Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to) ,
                                           Integer.valueOf(AV113Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag) ,
                                           Integer.valueOf(AV114Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to) ,
                                           Integer.valueOf(AV115Stocksquimicos_listadodeproveedores_wcds_32_tfprvper) ,
                                           Integer.valueOf(AV116Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to) ,
                                           AV118Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel ,
                                           AV117Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ,
                                           Short.valueOf(AV119Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent) ,
                                           Short.valueOf(AV120Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to) ,
                                           Integer.valueOf(AV121Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels.size()) ,
                                           AV123Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel ,
                                           AV122Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ,
                                           Short.valueOf(AV77PrvNumFrom) ,
                                           Short.valueOf(AV78PrvNumTo) ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A786PrvDir ,
                                           A799PrvPob ,
                                           A782PrvCpo ,
                                           A6075PrvCp2 ,
                                           A793PrvNif ,
                                           A803PrvTlf ,
                                           A804PrvTlx ,
                                           A6076PrvFax ,
                                           A6077PrvMail ,
                                           A497FpgCod ,
                                           A498FpgDsc ,
                                           Byte.valueOf(A805PrvVto) ,
                                           Integer.valueOf(A785PrvDiaPag) ,
                                           Integer.valueOf(A797PrvPer) ,
                                           A801PrvRep ,
                                           Short.valueOf(A798PrvPlaEnt) ,
                                           A783PrvCta ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV84Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ,
                                           AV76Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV87Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = GXutil.padr( GXutil.rtrim( AV87Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom), 30, "%") ;
      lV89Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = GXutil.padr( GXutil.rtrim( AV89Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir), 30, "%") ;
      lV91Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = GXutil.padr( GXutil.rtrim( AV91Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob), 30, "%") ;
      lV93Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = GXutil.padr( GXutil.rtrim( AV93Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo), 6, "%") ;
      lV95Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = GXutil.padr( GXutil.rtrim( AV95Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2), 6, "%") ;
      lV97Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = GXutil.padr( GXutil.rtrim( AV97Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif), 20, "%") ;
      lV99Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = GXutil.padr( GXutil.rtrim( AV99Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf), 18, "%") ;
      lV101Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = GXutil.padr( GXutil.rtrim( AV101Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx), 14, "%") ;
      lV103Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = GXutil.padr( GXutil.rtrim( AV103Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax), 15, "%") ;
      lV105Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = GXutil.padr( GXutil.rtrim( AV105Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail), 40, "%") ;
      lV107Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = GXutil.padr( GXutil.rtrim( AV107Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod), 2, "%") ;
      lV109Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = GXutil.padr( GXutil.rtrim( AV109Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc), 30, "%") ;
      lV117Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = GXutil.padr( GXutil.rtrim( AV117Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep), 20, "%") ;
      lV122Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = GXutil.padr( GXutil.rtrim( AV122Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta), 12, "%") ;
      /* Using cursor P09L72 */
      pr_default.execute(0, new Object[] {AV76Emprcod, Integer.valueOf(AV85Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum), Integer.valueOf(AV86Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to), lV87Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom, AV88Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel, lV89Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir, AV90Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel, lV91Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob, AV92Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel, lV93Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo, AV94Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel, lV95Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2, AV96Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel, lV97Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif, AV98Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel, lV99Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf, AV100Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel, lV101Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx, AV102Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel, lV103Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax, AV104Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel, lV105Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail, AV106Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel, lV107Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod, AV108Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel, lV109Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc, AV110Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel, Byte.valueOf(AV111Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto), Byte.valueOf(AV112Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to), Integer.valueOf(AV113Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag), Integer.valueOf(AV114Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to), Integer.valueOf(AV115Stocksquimicos_listadodeproveedores_wcds_32_tfprvper), Integer.valueOf(AV116Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to), lV117Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep, AV118Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel, Short.valueOf(AV119Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent), Short.valueOf(AV120Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to), lV122Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta, AV123Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel, Short.valueOf(AV77PrvNumFrom), Short.valueOf(AV78PrvNumTo)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P09L72_A396EmprCod[0] ;
         A783PrvCta = P09L72_A783PrvCta[0] ;
         n783PrvCta = P09L72_n783PrvCta[0] ;
         A798PrvPlaEnt = P09L72_A798PrvPlaEnt[0] ;
         n798PrvPlaEnt = P09L72_n798PrvPlaEnt[0] ;
         A801PrvRep = P09L72_A801PrvRep[0] ;
         n801PrvRep = P09L72_n801PrvRep[0] ;
         A797PrvPer = P09L72_A797PrvPer[0] ;
         n797PrvPer = P09L72_n797PrvPer[0] ;
         A785PrvDiaPag = P09L72_A785PrvDiaPag[0] ;
         n785PrvDiaPag = P09L72_n785PrvDiaPag[0] ;
         A805PrvVto = P09L72_A805PrvVto[0] ;
         n805PrvVto = P09L72_n805PrvVto[0] ;
         A498FpgDsc = P09L72_A498FpgDsc[0] ;
         n498FpgDsc = P09L72_n498FpgDsc[0] ;
         A497FpgCod = P09L72_A497FpgCod[0] ;
         n497FpgCod = P09L72_n497FpgCod[0] ;
         A6077PrvMail = P09L72_A6077PrvMail[0] ;
         n6077PrvMail = P09L72_n6077PrvMail[0] ;
         A6076PrvFax = P09L72_A6076PrvFax[0] ;
         n6076PrvFax = P09L72_n6076PrvFax[0] ;
         A804PrvTlx = P09L72_A804PrvTlx[0] ;
         n804PrvTlx = P09L72_n804PrvTlx[0] ;
         A803PrvTlf = P09L72_A803PrvTlf[0] ;
         n803PrvTlf = P09L72_n803PrvTlf[0] ;
         A793PrvNif = P09L72_A793PrvNif[0] ;
         n793PrvNif = P09L72_n793PrvNif[0] ;
         A6075PrvCp2 = P09L72_A6075PrvCp2[0] ;
         n6075PrvCp2 = P09L72_n6075PrvCp2[0] ;
         A782PrvCpo = P09L72_A782PrvCpo[0] ;
         n782PrvCpo = P09L72_n782PrvCpo[0] ;
         A799PrvPob = P09L72_A799PrvPob[0] ;
         n799PrvPob = P09L72_n799PrvPob[0] ;
         A786PrvDir = P09L72_A786PrvDir[0] ;
         n786PrvDir = P09L72_n786PrvDir[0] ;
         A794PrvNom = P09L72_A794PrvNom[0] ;
         n794PrvNom = P09L72_n794PrvNom[0] ;
         A795PrvNum = P09L72_A795PrvNum[0] ;
         A792PrvMetTra = P09L72_A792PrvMetTra[0] ;
         n792PrvMetTra = P09L72_n792PrvMetTra[0] ;
         A498FpgDsc = P09L72_A498FpgDsc[0] ;
         n498FpgDsc = P09L72_n498FpgDsc[0] ;
         if ( (GXutil.strcmp("", AV84Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV84Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV84Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A786PrvDir) , GXutil.padr( "%" + GXutil.upper( AV84Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A799PrvPob) , GXutil.padr( "%" + GXutil.upper( AV84Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A782PrvCpo) , GXutil.padr( "%" + GXutil.upper( AV84Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6075PrvCp2) , GXutil.padr( "%" + GXutil.upper( AV84Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A793PrvNif) , GXutil.padr( "%" + GXutil.upper( AV84Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A803PrvTlf) , GXutil.padr( "%" + GXutil.upper( AV84Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A804PrvTlx) , GXutil.padr( "%" + GXutil.upper( AV84Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6076PrvFax) , GXutil.padr( "%" + GXutil.upper( AV84Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6077PrvMail) , GXutil.padr( "%" + GXutil.upper( AV84Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A497FpgCod) , GXutil.padr( "%" + GXutil.upper( AV84Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A498FpgDsc) , GXutil.padr( "%" + GXutil.upper( AV84Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A805PrvVto, 2, 0) , GXutil.padr( "%" + AV84Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A785PrvDiaPag, 6, 0) , GXutil.padr( "%" + AV84Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A797PrvPer, 6, 0) , GXutil.padr( "%" + AV84Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A801PrvRep) , GXutil.padr( "%" + GXutil.upper( AV84Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A798PrvPlaEnt, 3, 0) , GXutil.padr( "%" + AV84Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "su transporte", ""), "") , GXutil.padr( "%" + GXutil.lower( AV84Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nuestro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV84Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "agencia", ""), "") , GXutil.padr( "%" + GXutil.lower( AV84Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A783PrvCta) , GXutil.padr( "%" + GXutil.upper( AV84Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
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
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A795PrvNum );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A794PrvNom, GXv_char5) ;
               listadodeproveedores_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A786PrvDir, GXv_char5) ;
               listadodeproveedores_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A799PrvPob, GXv_char5) ;
               listadodeproveedores_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A782PrvCpo, GXv_char5) ;
               listadodeproveedores_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A6075PrvCp2, GXv_char5) ;
               listadodeproveedores_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A793PrvNif, GXv_char5) ;
               listadodeproveedores_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A803PrvTlf, GXv_char5) ;
               listadodeproveedores_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A804PrvTlx, GXv_char5) ;
               listadodeproveedores_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A6076PrvFax, GXv_char5) ;
               listadodeproveedores_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A6077PrvMail, GXv_char5) ;
               listadodeproveedores_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A497FpgCod, GXv_char5) ;
               listadodeproveedores_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A498FpgDsc, GXv_char5) ;
               listadodeproveedores_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A805PrvVto );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A785PrvDiaPag );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A797PrvPer );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A801PrvRep, GXv_char5) ;
               listadodeproveedores_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A798PrvPlaEnt );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( "" );
               if ( GXutil.strcmp(GXutil.trim( A792PrvMetTra), httpContext.getMessage( "S", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Su Transporte", "") );
               }
               else if ( GXutil.strcmp(GXutil.trim( A792PrvMetTra), httpContext.getMessage( "N", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Nuestro", "") );
               }
               else if ( GXutil.strcmp(GXutil.trim( A792PrvMetTra), httpContext.getMessage( "A", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Agencia", "") );
               }
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A783PrvCta, GXv_char5) ;
               listadodeproveedores_wcexport.this.GXt_char4 = GXv_char5[0] ;
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvNum", "", "Proveedor", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvNom", "", "Nombre", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvDir", "", "Direccion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvPob", "", "Poblacion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvCpo", "", "Codigo Postal", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvCp2", "", "C. Postal 2", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvNif", "", "N.I.F.", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvTlf", "", "Telefonos", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvTlx", "", "Telex", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvFax", "", "Fax", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvMail", "", "Mail", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "FpgCod", "", "Forma Pago", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "FpgDsc", "", "Descripcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvVto", "", "Nº Vtos.", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvDiaPag", "", "Dias Pago", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvPer", "", "Periodicidad", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvRep", "", "Representante", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvPlaEnt", "", "Dias Plazo Entrega", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvMetTra", "", "Metodo Transporte", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvCta", "", "Cuenta Contable", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "StocksQuimicos.ListadodeProveedores_WCColumnsSelector", GXv_char5) ;
      listadodeproveedores_wcexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("StocksQuimicos.ListadodeProveedores_WCGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "StocksQuimicos.ListadodeProveedores_WCGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("StocksQuimicos.ListadodeProveedores_WCGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV124GXV3 = 1 ;
      while ( AV124GXV3 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV124GXV3));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNUM") == 0 )
         {
            AV34TFPrvNum = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFPrvNum_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM") == 0 )
         {
            AV36TFPrvNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM_SEL") == 0 )
         {
            AV37TFPrvNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDIR") == 0 )
         {
            AV38TFPrvDir = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDIR_SEL") == 0 )
         {
            AV39TFPrvDir_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVPOB") == 0 )
         {
            AV40TFPrvPob = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVPOB_SEL") == 0 )
         {
            AV41TFPrvPob_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCPO") == 0 )
         {
            AV42TFPrvCpo = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCPO_SEL") == 0 )
         {
            AV43TFPrvCpo_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCP2") == 0 )
         {
            AV44TFPrvCp2 = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCP2_SEL") == 0 )
         {
            AV45TFPrvCp2_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNIF") == 0 )
         {
            AV46TFPrvNif = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNIF_SEL") == 0 )
         {
            AV47TFPrvNif_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVTLF") == 0 )
         {
            AV48TFPrvTlf = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVTLF_SEL") == 0 )
         {
            AV49TFPrvTlf_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVTLX") == 0 )
         {
            AV50TFPrvTlx = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVTLX_SEL") == 0 )
         {
            AV51TFPrvTlx_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVFAX") == 0 )
         {
            AV52TFPrvFax = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVFAX_SEL") == 0 )
         {
            AV53TFPrvFax_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVMAIL") == 0 )
         {
            AV54TFPrvMail = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVMAIL_SEL") == 0 )
         {
            AV55TFPrvMail_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFPGCOD") == 0 )
         {
            AV56TFFpgCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFPGCOD_SEL") == 0 )
         {
            AV57TFFpgCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFPGDSC") == 0 )
         {
            AV58TFFpgDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFPGDSC_SEL") == 0 )
         {
            AV59TFFpgDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVVTO") == 0 )
         {
            AV60TFPrvVto = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV61TFPrvVto_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDIAPAG") == 0 )
         {
            AV62TFPrvDiaPag = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV63TFPrvDiaPag_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVPER") == 0 )
         {
            AV64TFPrvPer = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV65TFPrvPer_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVREP") == 0 )
         {
            AV66TFPrvRep = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVREP_SEL") == 0 )
         {
            AV67TFPrvRep_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVPLAENT") == 0 )
         {
            AV68TFPrvPlaEnt = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV69TFPrvPlaEnt_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVMETTRA_SEL") == 0 )
         {
            AV70TFPrvMetTra_SelsJson = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV71TFPrvMetTra_Sels.fromJSonString(AV70TFPrvMetTra_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCTA") == 0 )
         {
            AV73TFPrvCta = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCTA_SEL") == 0 )
         {
            AV74TFPrvCta_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV76Emprcod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRVNUMFROM") == 0 )
         {
            AV77PrvNumFrom = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRVNUMTO") == 0 )
         {
            AV78PrvNumTo = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV124GXV3 = (int)(AV124GXV3+1) ;
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
      this.aP0[0] = listadodeproveedores_wcexport.this.AV11Filename;
      this.aP1[0] = listadodeproveedores_wcexport.this.AV12ErrorMessage;
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
      AV37TFPrvNom_Sel = "" ;
      AV36TFPrvNom = "" ;
      AV39TFPrvDir_Sel = "" ;
      AV38TFPrvDir = "" ;
      AV41TFPrvPob_Sel = "" ;
      AV40TFPrvPob = "" ;
      AV43TFPrvCpo_Sel = "" ;
      AV42TFPrvCpo = "" ;
      AV45TFPrvCp2_Sel = "" ;
      AV44TFPrvCp2 = "" ;
      AV47TFPrvNif_Sel = "" ;
      AV46TFPrvNif = "" ;
      AV49TFPrvTlf_Sel = "" ;
      AV48TFPrvTlf = "" ;
      AV51TFPrvTlx_Sel = "" ;
      AV50TFPrvTlx = "" ;
      AV53TFPrvFax_Sel = "" ;
      AV52TFPrvFax = "" ;
      AV55TFPrvMail_Sel = "" ;
      AV54TFPrvMail = "" ;
      AV57TFFpgCod_Sel = "" ;
      AV56TFFpgCod = "" ;
      AV59TFFpgDsc_Sel = "" ;
      AV58TFFpgDsc = "" ;
      AV67TFPrvRep_Sel = "" ;
      AV66TFPrvRep = "" ;
      AV71TFPrvMetTra_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV72TFPrvMetTra_Sel = "" ;
      AV74TFPrvCta_Sel = "" ;
      AV73TFPrvCta = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A794PrvNom = "" ;
      A786PrvDir = "" ;
      A799PrvPob = "" ;
      A782PrvCpo = "" ;
      A6075PrvCp2 = "" ;
      A793PrvNif = "" ;
      A803PrvTlf = "" ;
      A804PrvTlx = "" ;
      A6076PrvFax = "" ;
      A6077PrvMail = "" ;
      A497FpgCod = "" ;
      A498FpgDsc = "" ;
      A801PrvRep = "" ;
      A792PrvMetTra = "" ;
      A783PrvCta = "" ;
      AV84Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext = "" ;
      AV87Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = "" ;
      AV88Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel = "" ;
      AV89Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = "" ;
      AV90Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel = "" ;
      AV91Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = "" ;
      AV92Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel = "" ;
      AV93Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = "" ;
      AV94Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel = "" ;
      AV95Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = "" ;
      AV96Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel = "" ;
      AV97Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = "" ;
      AV98Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel = "" ;
      AV99Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = "" ;
      AV100Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel = "" ;
      AV101Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = "" ;
      AV102Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel = "" ;
      AV103Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = "" ;
      AV104Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel = "" ;
      AV105Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = "" ;
      AV106Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel = "" ;
      AV107Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = "" ;
      AV108Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel = "" ;
      AV109Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = "" ;
      AV110Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel = "" ;
      AV117Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = "" ;
      AV118Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel = "" ;
      AV121Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV122Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = "" ;
      AV123Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel = "" ;
      lV84Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV87Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = "" ;
      lV89Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = "" ;
      lV91Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = "" ;
      lV93Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = "" ;
      lV95Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = "" ;
      lV97Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = "" ;
      lV99Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = "" ;
      lV101Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = "" ;
      lV103Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = "" ;
      lV105Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = "" ;
      lV107Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = "" ;
      lV109Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = "" ;
      lV117Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = "" ;
      lV122Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = "" ;
      AV76Emprcod = "" ;
      A396EmprCod = "" ;
      P09L72_A396EmprCod = new String[] {""} ;
      P09L72_A783PrvCta = new String[] {""} ;
      P09L72_n783PrvCta = new boolean[] {false} ;
      P09L72_A798PrvPlaEnt = new short[1] ;
      P09L72_n798PrvPlaEnt = new boolean[] {false} ;
      P09L72_A801PrvRep = new String[] {""} ;
      P09L72_n801PrvRep = new boolean[] {false} ;
      P09L72_A797PrvPer = new int[1] ;
      P09L72_n797PrvPer = new boolean[] {false} ;
      P09L72_A785PrvDiaPag = new int[1] ;
      P09L72_n785PrvDiaPag = new boolean[] {false} ;
      P09L72_A805PrvVto = new byte[1] ;
      P09L72_n805PrvVto = new boolean[] {false} ;
      P09L72_A498FpgDsc = new String[] {""} ;
      P09L72_n498FpgDsc = new boolean[] {false} ;
      P09L72_A497FpgCod = new String[] {""} ;
      P09L72_n497FpgCod = new boolean[] {false} ;
      P09L72_A6077PrvMail = new String[] {""} ;
      P09L72_n6077PrvMail = new boolean[] {false} ;
      P09L72_A6076PrvFax = new String[] {""} ;
      P09L72_n6076PrvFax = new boolean[] {false} ;
      P09L72_A804PrvTlx = new String[] {""} ;
      P09L72_n804PrvTlx = new boolean[] {false} ;
      P09L72_A803PrvTlf = new String[] {""} ;
      P09L72_n803PrvTlf = new boolean[] {false} ;
      P09L72_A793PrvNif = new String[] {""} ;
      P09L72_n793PrvNif = new boolean[] {false} ;
      P09L72_A6075PrvCp2 = new String[] {""} ;
      P09L72_n6075PrvCp2 = new boolean[] {false} ;
      P09L72_A782PrvCpo = new String[] {""} ;
      P09L72_n782PrvCpo = new boolean[] {false} ;
      P09L72_A799PrvPob = new String[] {""} ;
      P09L72_n799PrvPob = new boolean[] {false} ;
      P09L72_A786PrvDir = new String[] {""} ;
      P09L72_n786PrvDir = new boolean[] {false} ;
      P09L72_A794PrvNom = new String[] {""} ;
      P09L72_n794PrvNom = new boolean[] {false} ;
      P09L72_A795PrvNum = new int[1] ;
      P09L72_A792PrvMetTra = new String[] {""} ;
      P09L72_n792PrvMetTra = new boolean[] {false} ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV70TFPrvMetTra_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.listadodeproveedores_wcexport__default(),
         new Object[] {
             new Object[] {
            P09L72_A396EmprCod, P09L72_A783PrvCta, P09L72_n783PrvCta, P09L72_A798PrvPlaEnt, P09L72_n798PrvPlaEnt, P09L72_A801PrvRep, P09L72_n801PrvRep, P09L72_A797PrvPer, P09L72_n797PrvPer, P09L72_A785PrvDiaPag,
            P09L72_n785PrvDiaPag, P09L72_A805PrvVto, P09L72_n805PrvVto, P09L72_A498FpgDsc, P09L72_n498FpgDsc, P09L72_A497FpgCod, P09L72_n497FpgCod, P09L72_A6077PrvMail, P09L72_n6077PrvMail, P09L72_A6076PrvFax,
            P09L72_n6076PrvFax, P09L72_A804PrvTlx, P09L72_n804PrvTlx, P09L72_A803PrvTlf, P09L72_n803PrvTlf, P09L72_A793PrvNif, P09L72_n793PrvNif, P09L72_A6075PrvCp2, P09L72_n6075PrvCp2, P09L72_A782PrvCpo,
            P09L72_n782PrvCpo, P09L72_A799PrvPob, P09L72_n799PrvPob, P09L72_A786PrvDir, P09L72_n786PrvDir, P09L72_A794PrvNom, P09L72_n794PrvNom, P09L72_A795PrvNum, P09L72_A792PrvMetTra, P09L72_n792PrvMetTra
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV60TFPrvVto ;
   private byte AV61TFPrvVto_To ;
   private byte A805PrvVto ;
   private byte AV111Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto ;
   private byte AV112Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to ;
   private short AV68TFPrvPlaEnt ;
   private short AV69TFPrvPlaEnt_To ;
   private short GXv_int3[] ;
   private short A798PrvPlaEnt ;
   private short AV119Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent ;
   private short AV120Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to ;
   private short AV77PrvNumFrom ;
   private short AV78PrvNumTo ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV34TFPrvNum ;
   private int AV35TFPrvNum_To ;
   private int AV62TFPrvDiaPag ;
   private int AV63TFPrvDiaPag_To ;
   private int AV64TFPrvPer ;
   private int AV65TFPrvPer_To ;
   private int AV81GXV1 ;
   private int AV82GXV2 ;
   private int A795PrvNum ;
   private int A785PrvDiaPag ;
   private int A797PrvPer ;
   private int AV85Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum ;
   private int AV86Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to ;
   private int AV113Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag ;
   private int AV114Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to ;
   private int AV115Stocksquimicos_listadodeproveedores_wcds_32_tfprvper ;
   private int AV116Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to ;
   private int AV121Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels_size ;
   private int AV124GXV3 ;
   private long AV75i ;
   private long AV31VisibleColumnCount ;
   private String AV37TFPrvNom_Sel ;
   private String AV36TFPrvNom ;
   private String AV39TFPrvDir_Sel ;
   private String AV38TFPrvDir ;
   private String AV41TFPrvPob_Sel ;
   private String AV40TFPrvPob ;
   private String AV43TFPrvCpo_Sel ;
   private String AV42TFPrvCpo ;
   private String AV45TFPrvCp2_Sel ;
   private String AV44TFPrvCp2 ;
   private String AV47TFPrvNif_Sel ;
   private String AV46TFPrvNif ;
   private String AV49TFPrvTlf_Sel ;
   private String AV48TFPrvTlf ;
   private String AV51TFPrvTlx_Sel ;
   private String AV50TFPrvTlx ;
   private String AV53TFPrvFax_Sel ;
   private String AV52TFPrvFax ;
   private String AV55TFPrvMail_Sel ;
   private String AV54TFPrvMail ;
   private String AV57TFFpgCod_Sel ;
   private String AV56TFFpgCod ;
   private String AV59TFFpgDsc_Sel ;
   private String AV58TFFpgDsc ;
   private String AV67TFPrvRep_Sel ;
   private String AV66TFPrvRep ;
   private String AV72TFPrvMetTra_Sel ;
   private String AV74TFPrvCta_Sel ;
   private String AV73TFPrvCta ;
   private String A794PrvNom ;
   private String A786PrvDir ;
   private String A799PrvPob ;
   private String A782PrvCpo ;
   private String A6075PrvCp2 ;
   private String A793PrvNif ;
   private String A803PrvTlf ;
   private String A804PrvTlx ;
   private String A6076PrvFax ;
   private String A6077PrvMail ;
   private String A497FpgCod ;
   private String A498FpgDsc ;
   private String A801PrvRep ;
   private String A792PrvMetTra ;
   private String A783PrvCta ;
   private String AV87Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ;
   private String AV88Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel ;
   private String AV89Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ;
   private String AV90Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel ;
   private String AV91Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ;
   private String AV92Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel ;
   private String AV93Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ;
   private String AV94Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel ;
   private String AV95Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ;
   private String AV96Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel ;
   private String AV97Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ;
   private String AV98Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel ;
   private String AV99Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ;
   private String AV100Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel ;
   private String AV101Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ;
   private String AV102Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel ;
   private String AV103Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ;
   private String AV104Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel ;
   private String AV105Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ;
   private String AV106Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel ;
   private String AV107Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ;
   private String AV108Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel ;
   private String AV109Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ;
   private String AV110Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel ;
   private String AV117Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ;
   private String AV118Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel ;
   private String AV122Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ;
   private String AV123Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel ;
   private String scmdbuf ;
   private String lV87Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ;
   private String lV89Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ;
   private String lV91Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ;
   private String lV93Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ;
   private String lV95Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ;
   private String lV97Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ;
   private String lV99Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ;
   private String lV101Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ;
   private String lV103Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ;
   private String lV105Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ;
   private String lV107Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ;
   private String lV109Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ;
   private String lV117Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ;
   private String lV122Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ;
   private String AV76Emprcod ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n783PrvCta ;
   private boolean n798PrvPlaEnt ;
   private boolean n801PrvRep ;
   private boolean n797PrvPer ;
   private boolean n785PrvDiaPag ;
   private boolean n805PrvVto ;
   private boolean n498FpgDsc ;
   private boolean n497FpgCod ;
   private boolean n6077PrvMail ;
   private boolean n6076PrvFax ;
   private boolean n804PrvTlx ;
   private boolean n803PrvTlf ;
   private boolean n793PrvNif ;
   private boolean n6075PrvCp2 ;
   private boolean n782PrvCpo ;
   private boolean n799PrvPob ;
   private boolean n786PrvDir ;
   private boolean n794PrvNom ;
   private boolean n792PrvMetTra ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV70TFPrvMetTra_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV84Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ;
   private String lV84Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private GXSimpleCollection<String> AV71TFPrvMetTra_Sels ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P09L72_A396EmprCod ;
   private String[] P09L72_A783PrvCta ;
   private boolean[] P09L72_n783PrvCta ;
   private short[] P09L72_A798PrvPlaEnt ;
   private boolean[] P09L72_n798PrvPlaEnt ;
   private String[] P09L72_A801PrvRep ;
   private boolean[] P09L72_n801PrvRep ;
   private int[] P09L72_A797PrvPer ;
   private boolean[] P09L72_n797PrvPer ;
   private int[] P09L72_A785PrvDiaPag ;
   private boolean[] P09L72_n785PrvDiaPag ;
   private byte[] P09L72_A805PrvVto ;
   private boolean[] P09L72_n805PrvVto ;
   private String[] P09L72_A498FpgDsc ;
   private boolean[] P09L72_n498FpgDsc ;
   private String[] P09L72_A497FpgCod ;
   private boolean[] P09L72_n497FpgCod ;
   private String[] P09L72_A6077PrvMail ;
   private boolean[] P09L72_n6077PrvMail ;
   private String[] P09L72_A6076PrvFax ;
   private boolean[] P09L72_n6076PrvFax ;
   private String[] P09L72_A804PrvTlx ;
   private boolean[] P09L72_n804PrvTlx ;
   private String[] P09L72_A803PrvTlf ;
   private boolean[] P09L72_n803PrvTlf ;
   private String[] P09L72_A793PrvNif ;
   private boolean[] P09L72_n793PrvNif ;
   private String[] P09L72_A6075PrvCp2 ;
   private boolean[] P09L72_n6075PrvCp2 ;
   private String[] P09L72_A782PrvCpo ;
   private boolean[] P09L72_n782PrvCpo ;
   private String[] P09L72_A799PrvPob ;
   private boolean[] P09L72_n799PrvPob ;
   private String[] P09L72_A786PrvDir ;
   private boolean[] P09L72_n786PrvDir ;
   private String[] P09L72_A794PrvNom ;
   private boolean[] P09L72_n794PrvNom ;
   private int[] P09L72_A795PrvNum ;
   private String[] P09L72_A792PrvMetTra ;
   private boolean[] P09L72_n792PrvMetTra ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private GXSimpleCollection<String> AV121Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels ;
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

final  class listadodeproveedores_wcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09L72( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A792PrvMetTra ,
                                          GXSimpleCollection<String> AV121Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels ,
                                          int AV85Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum ,
                                          int AV86Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to ,
                                          String AV88Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel ,
                                          String AV87Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ,
                                          String AV90Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel ,
                                          String AV89Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ,
                                          String AV92Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel ,
                                          String AV91Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ,
                                          String AV94Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel ,
                                          String AV93Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ,
                                          String AV96Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel ,
                                          String AV95Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ,
                                          String AV98Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel ,
                                          String AV97Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ,
                                          String AV100Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel ,
                                          String AV99Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ,
                                          String AV102Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel ,
                                          String AV101Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ,
                                          String AV104Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel ,
                                          String AV103Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ,
                                          String AV106Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel ,
                                          String AV105Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ,
                                          String AV108Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel ,
                                          String AV107Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ,
                                          String AV110Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel ,
                                          String AV109Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ,
                                          byte AV111Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto ,
                                          byte AV112Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to ,
                                          int AV113Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag ,
                                          int AV114Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to ,
                                          int AV115Stocksquimicos_listadodeproveedores_wcds_32_tfprvper ,
                                          int AV116Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to ,
                                          String AV118Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel ,
                                          String AV117Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ,
                                          short AV119Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent ,
                                          short AV120Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to ,
                                          int AV121Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels_size ,
                                          String AV123Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel ,
                                          String AV122Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ,
                                          short AV77PrvNumFrom ,
                                          short AV78PrvNumTo ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A786PrvDir ,
                                          String A799PrvPob ,
                                          String A782PrvCpo ,
                                          String A6075PrvCp2 ,
                                          String A793PrvNif ,
                                          String A803PrvTlf ,
                                          String A804PrvTlx ,
                                          String A6076PrvFax ,
                                          String A6077PrvMail ,
                                          String A497FpgCod ,
                                          String A498FpgDsc ,
                                          byte A805PrvVto ,
                                          int A785PrvDiaPag ,
                                          int A797PrvPer ,
                                          String A801PrvRep ,
                                          short A798PrvPlaEnt ,
                                          String A783PrvCta ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV84Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ,
                                          String AV76Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[41];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrvCta, T1.PrvPlaEnt, T1.PrvRep, T1.PrvPer, T1.PrvDiaPag, T1.PrvVto, T2.FpgDsc, T1.FpgCod, T1.PrvMail, T1.PrvFax, T1.PrvTlx, T1.PrvTlf, T1.PrvNif," ;
      scmdbuf += " T1.PrvCp2, T1.PrvCpo, T1.PrvPob, T1.PrvDir, T1.PrvNom, T1.PrvNum, T1.PrvMetTra FROM (TXPPRVGEN T1 LEFT JOIN TXPFORPAG T2 ON T2.EmprCod = T1.EmprCod AND T2.FpgCod" ;
      scmdbuf += " = T1.FpgCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV85Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( ! (0==AV86Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV87Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvNom = ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel)==0) && ( ! (GXutil.strcmp("", AV89Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvDir = ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel)==0) && ( ! (GXutil.strcmp("", AV91Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvPob = ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel)==0) && ( ! (GXutil.strcmp("", AV93Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCpo = ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel)==0) && ( ! (GXutil.strcmp("", AV95Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCp2 = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV97Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvNif = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel)==0) && ( ! (GXutil.strcmp("", AV99Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvTlf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvTlf = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel)==0) && ( ! (GXutil.strcmp("", AV101Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvTlx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvTlx = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel)==0) && ( ! (GXutil.strcmp("", AV103Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvFax = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel)==0) && ( ! (GXutil.strcmp("", AV105Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvMail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvMail = ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel)==0) && ( ! (GXutil.strcmp("", AV107Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FpgCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FpgCod = ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel)==0) && ( ! (GXutil.strcmp("", AV109Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FpgDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FpgDsc = ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (0==AV111Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto) )
      {
         addWhere(sWhereString, "(T1.PrvVto >= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (0==AV112Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to) )
      {
         addWhere(sWhereString, "(T1.PrvVto <= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (0==AV113Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag) )
      {
         addWhere(sWhereString, "(T1.PrvDiaPag >= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (0==AV114Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to) )
      {
         addWhere(sWhereString, "(T1.PrvDiaPag <= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (0==AV115Stocksquimicos_listadodeproveedores_wcds_32_tfprvper) )
      {
         addWhere(sWhereString, "(T1.PrvPer >= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (0==AV116Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to) )
      {
         addWhere(sWhereString, "(T1.PrvPer <= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel)==0) && ( ! (GXutil.strcmp("", AV117Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvRep) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvRep = ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (0==AV119Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent) )
      {
         addWhere(sWhereString, "(T1.PrvPlaEnt >= ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! (0==AV120Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to) )
      {
         addWhere(sWhereString, "(T1.PrvPlaEnt <= ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( AV121Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV121Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels, "T1.PrvMetTra IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV123Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel)==0) && ( ! (GXutil.strcmp("", AV122Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCta) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCta = ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( ! (0==AV77PrvNumFrom) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      if ( ! (0==AV78PrvNumTo) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvNom" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvNum" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvDir" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvDir DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvPob" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvPob DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvCpo" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvCpo DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvCp2" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvCp2 DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvNif" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvNif DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvTlf" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvTlf DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvTlx" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvTlx DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvFax" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvFax DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvMail" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvMail DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FpgCod" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FpgCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.FpgDsc" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.FpgDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvVto" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvVto DESC" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvDiaPag" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvDiaPag DESC" ;
      }
      else if ( ( AV16OrderedBy == 16 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvPer" ;
      }
      else if ( ( AV16OrderedBy == 16 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvPer DESC" ;
      }
      else if ( ( AV16OrderedBy == 17 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvRep" ;
      }
      else if ( ( AV16OrderedBy == 17 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvRep DESC" ;
      }
      else if ( ( AV16OrderedBy == 18 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvPlaEnt" ;
      }
      else if ( ( AV16OrderedBy == 18 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvPlaEnt DESC" ;
      }
      else if ( ( AV16OrderedBy == 19 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvMetTra" ;
      }
      else if ( ( AV16OrderedBy == 19 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvMetTra DESC" ;
      }
      else if ( ( AV16OrderedBy == 20 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvCta" ;
      }
      else if ( ( AV16OrderedBy == 20 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvCta DESC" ;
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
                  return conditional_P09L72(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , ((Number) dynConstraints[57]).intValue() , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , ((Number) dynConstraints[62]).shortValue() , ((Boolean) dynConstraints[63]).booleanValue() , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09L72", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 40);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 15);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 14);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 18);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 20);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 6);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((int[]) buf[37])[0] = rslt.getInt(20);
               ((String[]) buf[38])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 18);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 18);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 14);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 14);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 15);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 15);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 40);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 40);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 20);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[77]).shortValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 12);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 12);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               return;
      }
   }

}

