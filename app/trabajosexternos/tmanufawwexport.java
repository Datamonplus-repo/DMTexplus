package app.trabajosexternos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tmanufawwexport extends GXProcedure
{
   public tmanufawwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmanufawwexport.class ), "" );
   }

   public tmanufawwexport( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      tmanufawwexport.this.aP1 = new String[] {""};
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
      tmanufawwexport.this.aP0 = aP0;
      tmanufawwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "TMANUFAWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      tmanufawwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      tmanufawwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV34TFManCod) && (0==AV35TFManCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Manufacturador", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmanufawwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV34TFManCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmanufawwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV35TFManCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV58TFManNif_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nif", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmanufawwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV58TFManNif_Sel, GXv_char5) ;
         tmanufawwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV57TFManNif)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nif", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmanufawwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV57TFManNif, GXv_char5) ;
            tmanufawwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV37TFManNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmanufawwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFManNom_Sel, GXv_char5) ;
         tmanufawwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV36TFManNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmanufawwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFManNom, GXv_char5) ;
            tmanufawwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV39TFManDom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Domicilio", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmanufawwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFManDom_Sel, GXv_char5) ;
         tmanufawwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV38TFManDom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Domicilio", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmanufawwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFManDom, GXv_char5) ;
            tmanufawwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV41TFManPob_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Poblacion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmanufawwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFManPob_Sel, GXv_char5) ;
         tmanufawwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV40TFManPob)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Poblacion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmanufawwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFManPob, GXv_char5) ;
            tmanufawwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV43TFManCpo_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "C. Postal", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmanufawwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFManCpo_Sel, GXv_char5) ;
         tmanufawwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV42TFManCpo)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "C. Postal", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmanufawwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFManCpo, GXv_char5) ;
            tmanufawwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV45TFManCp2_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "C. Postal (cont)", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmanufawwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFManCp2_Sel, GXv_char5) ;
         tmanufawwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV44TFManCp2)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "C. Postal (cont)", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmanufawwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFManCp2, GXv_char5) ;
            tmanufawwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV46TFPrvCod) && (0==AV47TFPrvCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Provincia", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmanufawwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV46TFPrvCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmanufawwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV47TFPrvCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV49TFPrvDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmanufawwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFPrvDsc_Sel, GXv_char5) ;
         tmanufawwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV48TFPrvDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmanufawwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFPrvDsc, GXv_char5) ;
            tmanufawwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV51TFManTel1_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Telefono (1)", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmanufawwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV51TFManTel1_Sel, GXv_char5) ;
         tmanufawwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV50TFManTel1)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Telefono (1)", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmanufawwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFManTel1, GXv_char5) ;
            tmanufawwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV53TFManTel2_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Telefono (2)", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmanufawwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV53TFManTel2_Sel, GXv_char5) ;
         tmanufawwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV52TFManTel2)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Telefono (2)", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmanufawwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV52TFManTel2, GXv_char5) ;
            tmanufawwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV55TFManFax_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fax", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmanufawwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV55TFManFax_Sel, GXv_char5) ;
         tmanufawwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV54TFManFax)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fax", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmanufawwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV54TFManFax, GXv_char5) ;
            tmanufawwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFManDto)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60TFManDto_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Dto.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmanufawwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV59TFManDto)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmanufawwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV60TFManDto_To)) );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("TrabajosExternos.TMANUFAWWColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("TrabajosExternos.TMANUFAWWColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV63GXV1 = 1 ;
      while ( AV63GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV63GXV1));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV63GXV1 = (int)(AV63GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV65Trabajosexternos_tmanufawwds_1_filterfulltext = AV18FilterFullText ;
      AV66Trabajosexternos_tmanufawwds_2_tfmancod = AV34TFManCod ;
      AV67Trabajosexternos_tmanufawwds_3_tfmancod_to = AV35TFManCod_To ;
      AV68Trabajosexternos_tmanufawwds_4_tfmannif = AV57TFManNif ;
      AV69Trabajosexternos_tmanufawwds_5_tfmannif_sel = AV58TFManNif_Sel ;
      AV70Trabajosexternos_tmanufawwds_6_tfmannom = AV36TFManNom ;
      AV71Trabajosexternos_tmanufawwds_7_tfmannom_sel = AV37TFManNom_Sel ;
      AV72Trabajosexternos_tmanufawwds_8_tfmandom = AV38TFManDom ;
      AV73Trabajosexternos_tmanufawwds_9_tfmandom_sel = AV39TFManDom_Sel ;
      AV74Trabajosexternos_tmanufawwds_10_tfmanpob = AV40TFManPob ;
      AV75Trabajosexternos_tmanufawwds_11_tfmanpob_sel = AV41TFManPob_Sel ;
      AV76Trabajosexternos_tmanufawwds_12_tfmancpo = AV42TFManCpo ;
      AV77Trabajosexternos_tmanufawwds_13_tfmancpo_sel = AV43TFManCpo_Sel ;
      AV78Trabajosexternos_tmanufawwds_14_tfmancp2 = AV44TFManCp2 ;
      AV79Trabajosexternos_tmanufawwds_15_tfmancp2_sel = AV45TFManCp2_Sel ;
      AV80Trabajosexternos_tmanufawwds_16_tfprvcod = AV46TFPrvCod ;
      AV81Trabajosexternos_tmanufawwds_17_tfprvcod_to = AV47TFPrvCod_To ;
      AV82Trabajosexternos_tmanufawwds_18_tfprvdsc = AV48TFPrvDsc ;
      AV83Trabajosexternos_tmanufawwds_19_tfprvdsc_sel = AV49TFPrvDsc_Sel ;
      AV84Trabajosexternos_tmanufawwds_20_tfmantel1 = AV50TFManTel1 ;
      AV85Trabajosexternos_tmanufawwds_21_tfmantel1_sel = AV51TFManTel1_Sel ;
      AV86Trabajosexternos_tmanufawwds_22_tfmantel2 = AV52TFManTel2 ;
      AV87Trabajosexternos_tmanufawwds_23_tfmantel2_sel = AV53TFManTel2_Sel ;
      AV88Trabajosexternos_tmanufawwds_24_tfmanfax = AV54TFManFax ;
      AV89Trabajosexternos_tmanufawwds_25_tfmanfax_sel = AV55TFManFax_Sel ;
      AV90Trabajosexternos_tmanufawwds_26_tfmandto = AV59TFManDto ;
      AV91Trabajosexternos_tmanufawwds_27_tfmandto_to = AV60TFManDto_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV65Trabajosexternos_tmanufawwds_1_filterfulltext ,
                                           Short.valueOf(AV66Trabajosexternos_tmanufawwds_2_tfmancod) ,
                                           Short.valueOf(AV67Trabajosexternos_tmanufawwds_3_tfmancod_to) ,
                                           AV69Trabajosexternos_tmanufawwds_5_tfmannif_sel ,
                                           AV68Trabajosexternos_tmanufawwds_4_tfmannif ,
                                           AV71Trabajosexternos_tmanufawwds_7_tfmannom_sel ,
                                           AV70Trabajosexternos_tmanufawwds_6_tfmannom ,
                                           AV73Trabajosexternos_tmanufawwds_9_tfmandom_sel ,
                                           AV72Trabajosexternos_tmanufawwds_8_tfmandom ,
                                           AV75Trabajosexternos_tmanufawwds_11_tfmanpob_sel ,
                                           AV74Trabajosexternos_tmanufawwds_10_tfmanpob ,
                                           AV77Trabajosexternos_tmanufawwds_13_tfmancpo_sel ,
                                           AV76Trabajosexternos_tmanufawwds_12_tfmancpo ,
                                           AV79Trabajosexternos_tmanufawwds_15_tfmancp2_sel ,
                                           AV78Trabajosexternos_tmanufawwds_14_tfmancp2 ,
                                           Short.valueOf(AV80Trabajosexternos_tmanufawwds_16_tfprvcod) ,
                                           Short.valueOf(AV81Trabajosexternos_tmanufawwds_17_tfprvcod_to) ,
                                           AV83Trabajosexternos_tmanufawwds_19_tfprvdsc_sel ,
                                           AV82Trabajosexternos_tmanufawwds_18_tfprvdsc ,
                                           AV85Trabajosexternos_tmanufawwds_21_tfmantel1_sel ,
                                           AV84Trabajosexternos_tmanufawwds_20_tfmantel1 ,
                                           AV87Trabajosexternos_tmanufawwds_23_tfmantel2_sel ,
                                           AV86Trabajosexternos_tmanufawwds_22_tfmantel2 ,
                                           AV89Trabajosexternos_tmanufawwds_25_tfmanfax_sel ,
                                           AV88Trabajosexternos_tmanufawwds_24_tfmanfax ,
                                           AV90Trabajosexternos_tmanufawwds_26_tfmandto ,
                                           AV91Trabajosexternos_tmanufawwds_27_tfmandto_to ,
                                           Short.valueOf(A2248ManCod) ,
                                           A3302ManNif ,
                                           A2249ManNom ,
                                           A2250ManDom ,
                                           A2251ManPob ,
                                           A2252ManCpo ,
                                           A10743ManCp2 ,
                                           Short.valueOf(A781PrvCod) ,
                                           A787PrvDsc ,
                                           A3299ManTel1 ,
                                           A3300ManTel2 ,
                                           A3301ManFax ,
                                           A3409ManDto ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV65Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV65Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV65Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV65Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV65Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV65Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV65Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV65Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV65Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV65Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV65Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV65Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV65Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV68Trabajosexternos_tmanufawwds_4_tfmannif = GXutil.padr( GXutil.rtrim( AV68Trabajosexternos_tmanufawwds_4_tfmannif), 20, "%") ;
      lV70Trabajosexternos_tmanufawwds_6_tfmannom = GXutil.padr( GXutil.rtrim( AV70Trabajosexternos_tmanufawwds_6_tfmannom), 30, "%") ;
      lV72Trabajosexternos_tmanufawwds_8_tfmandom = GXutil.padr( GXutil.rtrim( AV72Trabajosexternos_tmanufawwds_8_tfmandom), 34, "%") ;
      lV74Trabajosexternos_tmanufawwds_10_tfmanpob = GXutil.padr( GXutil.rtrim( AV74Trabajosexternos_tmanufawwds_10_tfmanpob), 30, "%") ;
      lV76Trabajosexternos_tmanufawwds_12_tfmancpo = GXutil.padr( GXutil.rtrim( AV76Trabajosexternos_tmanufawwds_12_tfmancpo), 6, "%") ;
      lV78Trabajosexternos_tmanufawwds_14_tfmancp2 = GXutil.padr( GXutil.rtrim( AV78Trabajosexternos_tmanufawwds_14_tfmancp2), 6, "%") ;
      lV82Trabajosexternos_tmanufawwds_18_tfprvdsc = GXutil.padr( GXutil.rtrim( AV82Trabajosexternos_tmanufawwds_18_tfprvdsc), 30, "%") ;
      lV84Trabajosexternos_tmanufawwds_20_tfmantel1 = GXutil.padr( GXutil.rtrim( AV84Trabajosexternos_tmanufawwds_20_tfmantel1), 9, "%") ;
      lV86Trabajosexternos_tmanufawwds_22_tfmantel2 = GXutil.padr( GXutil.rtrim( AV86Trabajosexternos_tmanufawwds_22_tfmantel2), 9, "%") ;
      lV88Trabajosexternos_tmanufawwds_24_tfmanfax = GXutil.padr( GXutil.rtrim( AV88Trabajosexternos_tmanufawwds_24_tfmanfax), 10, "%") ;
      /* Using cursor P0AFM2 */
      pr_default.execute(0, new Object[] {lV65Trabajosexternos_tmanufawwds_1_filterfulltext, lV65Trabajosexternos_tmanufawwds_1_filterfulltext, lV65Trabajosexternos_tmanufawwds_1_filterfulltext, lV65Trabajosexternos_tmanufawwds_1_filterfulltext, lV65Trabajosexternos_tmanufawwds_1_filterfulltext, lV65Trabajosexternos_tmanufawwds_1_filterfulltext, lV65Trabajosexternos_tmanufawwds_1_filterfulltext, lV65Trabajosexternos_tmanufawwds_1_filterfulltext, lV65Trabajosexternos_tmanufawwds_1_filterfulltext, lV65Trabajosexternos_tmanufawwds_1_filterfulltext, lV65Trabajosexternos_tmanufawwds_1_filterfulltext, lV65Trabajosexternos_tmanufawwds_1_filterfulltext, lV65Trabajosexternos_tmanufawwds_1_filterfulltext, Short.valueOf(AV66Trabajosexternos_tmanufawwds_2_tfmancod), Short.valueOf(AV67Trabajosexternos_tmanufawwds_3_tfmancod_to), lV68Trabajosexternos_tmanufawwds_4_tfmannif, AV69Trabajosexternos_tmanufawwds_5_tfmannif_sel, lV70Trabajosexternos_tmanufawwds_6_tfmannom, AV71Trabajosexternos_tmanufawwds_7_tfmannom_sel, lV72Trabajosexternos_tmanufawwds_8_tfmandom, AV73Trabajosexternos_tmanufawwds_9_tfmandom_sel, lV74Trabajosexternos_tmanufawwds_10_tfmanpob, AV75Trabajosexternos_tmanufawwds_11_tfmanpob_sel, lV76Trabajosexternos_tmanufawwds_12_tfmancpo, AV77Trabajosexternos_tmanufawwds_13_tfmancpo_sel, lV78Trabajosexternos_tmanufawwds_14_tfmancp2, AV79Trabajosexternos_tmanufawwds_15_tfmancp2_sel, Short.valueOf(AV80Trabajosexternos_tmanufawwds_16_tfprvcod), Short.valueOf(AV81Trabajosexternos_tmanufawwds_17_tfprvcod_to), lV82Trabajosexternos_tmanufawwds_18_tfprvdsc, AV83Trabajosexternos_tmanufawwds_19_tfprvdsc_sel, lV84Trabajosexternos_tmanufawwds_20_tfmantel1, AV85Trabajosexternos_tmanufawwds_21_tfmantel1_sel, lV86Trabajosexternos_tmanufawwds_22_tfmantel2, AV87Trabajosexternos_tmanufawwds_23_tfmantel2_sel, lV88Trabajosexternos_tmanufawwds_24_tfmanfax, AV89Trabajosexternos_tmanufawwds_25_tfmanfax_sel, AV90Trabajosexternos_tmanufawwds_26_tfmandto, AV91Trabajosexternos_tmanufawwds_27_tfmandto_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3409ManDto = P0AFM2_A3409ManDto[0] ;
         n3409ManDto = P0AFM2_n3409ManDto[0] ;
         A3301ManFax = P0AFM2_A3301ManFax[0] ;
         n3301ManFax = P0AFM2_n3301ManFax[0] ;
         A3300ManTel2 = P0AFM2_A3300ManTel2[0] ;
         n3300ManTel2 = P0AFM2_n3300ManTel2[0] ;
         A3299ManTel1 = P0AFM2_A3299ManTel1[0] ;
         n3299ManTel1 = P0AFM2_n3299ManTel1[0] ;
         A787PrvDsc = P0AFM2_A787PrvDsc[0] ;
         n787PrvDsc = P0AFM2_n787PrvDsc[0] ;
         A781PrvCod = P0AFM2_A781PrvCod[0] ;
         n781PrvCod = P0AFM2_n781PrvCod[0] ;
         A10743ManCp2 = P0AFM2_A10743ManCp2[0] ;
         n10743ManCp2 = P0AFM2_n10743ManCp2[0] ;
         A2252ManCpo = P0AFM2_A2252ManCpo[0] ;
         n2252ManCpo = P0AFM2_n2252ManCpo[0] ;
         A2251ManPob = P0AFM2_A2251ManPob[0] ;
         n2251ManPob = P0AFM2_n2251ManPob[0] ;
         A2250ManDom = P0AFM2_A2250ManDom[0] ;
         n2250ManDom = P0AFM2_n2250ManDom[0] ;
         A2249ManNom = P0AFM2_A2249ManNom[0] ;
         n2249ManNom = P0AFM2_n2249ManNom[0] ;
         A3302ManNif = P0AFM2_A3302ManNif[0] ;
         n3302ManNif = P0AFM2_n3302ManNif[0] ;
         A2248ManCod = P0AFM2_A2248ManCod[0] ;
         A396EmprCod = P0AFM2_A396EmprCod[0] ;
         A787PrvDsc = P0AFM2_A787PrvDsc[0] ;
         n787PrvDsc = P0AFM2_n787PrvDsc[0] ;
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
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A2248ManCod );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A3302ManNif, GXv_char5) ;
            tmanufawwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A2249ManNom, GXv_char5) ;
            tmanufawwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A2250ManDom, GXv_char5) ;
            tmanufawwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A2251ManPob, GXv_char5) ;
            tmanufawwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A2252ManCpo, GXv_char5) ;
            tmanufawwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A10743ManCp2, GXv_char5) ;
            tmanufawwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A781PrvCod );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A787PrvDsc, GXv_char5) ;
            tmanufawwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A3299ManTel1, GXv_char5) ;
            tmanufawwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A3300ManTel2, GXv_char5) ;
            tmanufawwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A3301ManFax, GXv_char5) ;
            tmanufawwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A3409ManDto)) );
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ManCod", "", "Manufacturador", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ManNif", "", "Nif", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ManNom", "", "Nombre", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ManDom", "", "Domicilio", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ManPob", "", "Poblacion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ManCpo", "", "C. Postal", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ManCp2", "", "C. Postal (cont)", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvCod", "", "Provincia", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvDsc", "", "Descripcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ManTel1", "", "Telefono (1)", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ManTel2", "", "Telefono (2)", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ManFax", "", "Fax", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ManDto", "", "Dto.", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TrabajosExternos.TMANUFAWWColumnsSelector", GXv_char5) ;
      tmanufawwexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TrabajosExternos.TMANUFAWWGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TrabajosExternos.TMANUFAWWGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("TrabajosExternos.TMANUFAWWGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV92GXV2 = 1 ;
      while ( AV92GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV92GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANCOD") == 0 )
         {
            AV34TFManCod = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFManCod_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANNIF") == 0 )
         {
            AV57TFManNif = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANNIF_SEL") == 0 )
         {
            AV58TFManNif_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANNOM") == 0 )
         {
            AV36TFManNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANNOM_SEL") == 0 )
         {
            AV37TFManNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANDOM") == 0 )
         {
            AV38TFManDom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANDOM_SEL") == 0 )
         {
            AV39TFManDom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANPOB") == 0 )
         {
            AV40TFManPob = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANPOB_SEL") == 0 )
         {
            AV41TFManPob_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANCPO") == 0 )
         {
            AV42TFManCpo = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANCPO_SEL") == 0 )
         {
            AV43TFManCpo_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANCP2") == 0 )
         {
            AV44TFManCp2 = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANCP2_SEL") == 0 )
         {
            AV45TFManCp2_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCOD") == 0 )
         {
            AV46TFPrvCod = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV47TFPrvCod_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDSC") == 0 )
         {
            AV48TFPrvDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDSC_SEL") == 0 )
         {
            AV49TFPrvDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTEL1") == 0 )
         {
            AV50TFManTel1 = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTEL1_SEL") == 0 )
         {
            AV51TFManTel1_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTEL2") == 0 )
         {
            AV52TFManTel2 = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTEL2_SEL") == 0 )
         {
            AV53TFManTel2_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANFAX") == 0 )
         {
            AV54TFManFax = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANFAX_SEL") == 0 )
         {
            AV55TFManFax_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANDTO") == 0 )
         {
            AV59TFManDto = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV60TFManDto_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV92GXV2 = (int)(AV92GXV2+1) ;
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
      this.aP0[0] = tmanufawwexport.this.AV11Filename;
      this.aP1[0] = tmanufawwexport.this.AV12ErrorMessage;
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
      AV58TFManNif_Sel = "" ;
      AV57TFManNif = "" ;
      AV37TFManNom_Sel = "" ;
      AV36TFManNom = "" ;
      AV39TFManDom_Sel = "" ;
      AV38TFManDom = "" ;
      AV41TFManPob_Sel = "" ;
      AV40TFManPob = "" ;
      AV43TFManCpo_Sel = "" ;
      AV42TFManCpo = "" ;
      AV45TFManCp2_Sel = "" ;
      AV44TFManCp2 = "" ;
      AV49TFPrvDsc_Sel = "" ;
      AV48TFPrvDsc = "" ;
      AV51TFManTel1_Sel = "" ;
      AV50TFManTel1 = "" ;
      AV53TFManTel2_Sel = "" ;
      AV52TFManTel2 = "" ;
      AV55TFManFax_Sel = "" ;
      AV54TFManFax = "" ;
      AV59TFManDto = DecimalUtil.ZERO ;
      AV60TFManDto_To = DecimalUtil.ZERO ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A3302ManNif = "" ;
      A2249ManNom = "" ;
      A2250ManDom = "" ;
      A2251ManPob = "" ;
      A2252ManCpo = "" ;
      A10743ManCp2 = "" ;
      A787PrvDsc = "" ;
      A3299ManTel1 = "" ;
      A3300ManTel2 = "" ;
      A3301ManFax = "" ;
      A3409ManDto = DecimalUtil.ZERO ;
      AV65Trabajosexternos_tmanufawwds_1_filterfulltext = "" ;
      AV68Trabajosexternos_tmanufawwds_4_tfmannif = "" ;
      AV69Trabajosexternos_tmanufawwds_5_tfmannif_sel = "" ;
      AV70Trabajosexternos_tmanufawwds_6_tfmannom = "" ;
      AV71Trabajosexternos_tmanufawwds_7_tfmannom_sel = "" ;
      AV72Trabajosexternos_tmanufawwds_8_tfmandom = "" ;
      AV73Trabajosexternos_tmanufawwds_9_tfmandom_sel = "" ;
      AV74Trabajosexternos_tmanufawwds_10_tfmanpob = "" ;
      AV75Trabajosexternos_tmanufawwds_11_tfmanpob_sel = "" ;
      AV76Trabajosexternos_tmanufawwds_12_tfmancpo = "" ;
      AV77Trabajosexternos_tmanufawwds_13_tfmancpo_sel = "" ;
      AV78Trabajosexternos_tmanufawwds_14_tfmancp2 = "" ;
      AV79Trabajosexternos_tmanufawwds_15_tfmancp2_sel = "" ;
      AV82Trabajosexternos_tmanufawwds_18_tfprvdsc = "" ;
      AV83Trabajosexternos_tmanufawwds_19_tfprvdsc_sel = "" ;
      AV84Trabajosexternos_tmanufawwds_20_tfmantel1 = "" ;
      AV85Trabajosexternos_tmanufawwds_21_tfmantel1_sel = "" ;
      AV86Trabajosexternos_tmanufawwds_22_tfmantel2 = "" ;
      AV87Trabajosexternos_tmanufawwds_23_tfmantel2_sel = "" ;
      AV88Trabajosexternos_tmanufawwds_24_tfmanfax = "" ;
      AV89Trabajosexternos_tmanufawwds_25_tfmanfax_sel = "" ;
      AV90Trabajosexternos_tmanufawwds_26_tfmandto = DecimalUtil.ZERO ;
      AV91Trabajosexternos_tmanufawwds_27_tfmandto_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV65Trabajosexternos_tmanufawwds_1_filterfulltext = "" ;
      lV68Trabajosexternos_tmanufawwds_4_tfmannif = "" ;
      lV70Trabajosexternos_tmanufawwds_6_tfmannom = "" ;
      lV72Trabajosexternos_tmanufawwds_8_tfmandom = "" ;
      lV74Trabajosexternos_tmanufawwds_10_tfmanpob = "" ;
      lV76Trabajosexternos_tmanufawwds_12_tfmancpo = "" ;
      lV78Trabajosexternos_tmanufawwds_14_tfmancp2 = "" ;
      lV82Trabajosexternos_tmanufawwds_18_tfprvdsc = "" ;
      lV84Trabajosexternos_tmanufawwds_20_tfmantel1 = "" ;
      lV86Trabajosexternos_tmanufawwds_22_tfmantel2 = "" ;
      lV88Trabajosexternos_tmanufawwds_24_tfmanfax = "" ;
      P0AFM2_A3409ManDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AFM2_n3409ManDto = new boolean[] {false} ;
      P0AFM2_A3301ManFax = new String[] {""} ;
      P0AFM2_n3301ManFax = new boolean[] {false} ;
      P0AFM2_A3300ManTel2 = new String[] {""} ;
      P0AFM2_n3300ManTel2 = new boolean[] {false} ;
      P0AFM2_A3299ManTel1 = new String[] {""} ;
      P0AFM2_n3299ManTel1 = new boolean[] {false} ;
      P0AFM2_A787PrvDsc = new String[] {""} ;
      P0AFM2_n787PrvDsc = new boolean[] {false} ;
      P0AFM2_A781PrvCod = new short[1] ;
      P0AFM2_n781PrvCod = new boolean[] {false} ;
      P0AFM2_A10743ManCp2 = new String[] {""} ;
      P0AFM2_n10743ManCp2 = new boolean[] {false} ;
      P0AFM2_A2252ManCpo = new String[] {""} ;
      P0AFM2_n2252ManCpo = new boolean[] {false} ;
      P0AFM2_A2251ManPob = new String[] {""} ;
      P0AFM2_n2251ManPob = new boolean[] {false} ;
      P0AFM2_A2250ManDom = new String[] {""} ;
      P0AFM2_n2250ManDom = new boolean[] {false} ;
      P0AFM2_A2249ManNom = new String[] {""} ;
      P0AFM2_n2249ManNom = new boolean[] {false} ;
      P0AFM2_A3302ManNif = new String[] {""} ;
      P0AFM2_n3302ManNif = new boolean[] {false} ;
      P0AFM2_A2248ManCod = new short[1] ;
      P0AFM2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.tmanufawwexport__default(),
         new Object[] {
             new Object[] {
            P0AFM2_A3409ManDto, P0AFM2_n3409ManDto, P0AFM2_A3301ManFax, P0AFM2_n3301ManFax, P0AFM2_A3300ManTel2, P0AFM2_n3300ManTel2, P0AFM2_A3299ManTel1, P0AFM2_n3299ManTel1, P0AFM2_A787PrvDsc, P0AFM2_n787PrvDsc,
            P0AFM2_A781PrvCod, P0AFM2_n781PrvCod, P0AFM2_A10743ManCp2, P0AFM2_n10743ManCp2, P0AFM2_A2252ManCpo, P0AFM2_n2252ManCpo, P0AFM2_A2251ManPob, P0AFM2_n2251ManPob, P0AFM2_A2250ManDom, P0AFM2_n2250ManDom,
            P0AFM2_A2249ManNom, P0AFM2_n2249ManNom, P0AFM2_A3302ManNif, P0AFM2_n3302ManNif, P0AFM2_A2248ManCod, P0AFM2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV34TFManCod ;
   private short AV35TFManCod_To ;
   private short AV46TFPrvCod ;
   private short AV47TFPrvCod_To ;
   private short GXv_int3[] ;
   private short A2248ManCod ;
   private short A781PrvCod ;
   private short AV66Trabajosexternos_tmanufawwds_2_tfmancod ;
   private short AV67Trabajosexternos_tmanufawwds_3_tfmancod_to ;
   private short AV80Trabajosexternos_tmanufawwds_16_tfprvcod ;
   private short AV81Trabajosexternos_tmanufawwds_17_tfprvcod_to ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV63GXV1 ;
   private int AV92GXV2 ;
   private long AV31VisibleColumnCount ;
   private java.math.BigDecimal AV59TFManDto ;
   private java.math.BigDecimal AV60TFManDto_To ;
   private java.math.BigDecimal A3409ManDto ;
   private java.math.BigDecimal AV90Trabajosexternos_tmanufawwds_26_tfmandto ;
   private java.math.BigDecimal AV91Trabajosexternos_tmanufawwds_27_tfmandto_to ;
   private String AV58TFManNif_Sel ;
   private String AV57TFManNif ;
   private String AV37TFManNom_Sel ;
   private String AV36TFManNom ;
   private String AV39TFManDom_Sel ;
   private String AV38TFManDom ;
   private String AV41TFManPob_Sel ;
   private String AV40TFManPob ;
   private String AV43TFManCpo_Sel ;
   private String AV42TFManCpo ;
   private String AV45TFManCp2_Sel ;
   private String AV44TFManCp2 ;
   private String AV49TFPrvDsc_Sel ;
   private String AV48TFPrvDsc ;
   private String AV51TFManTel1_Sel ;
   private String AV50TFManTel1 ;
   private String AV53TFManTel2_Sel ;
   private String AV52TFManTel2 ;
   private String AV55TFManFax_Sel ;
   private String AV54TFManFax ;
   private String A3302ManNif ;
   private String A2249ManNom ;
   private String A2250ManDom ;
   private String A2251ManPob ;
   private String A2252ManCpo ;
   private String A10743ManCp2 ;
   private String A787PrvDsc ;
   private String A3299ManTel1 ;
   private String A3300ManTel2 ;
   private String A3301ManFax ;
   private String AV68Trabajosexternos_tmanufawwds_4_tfmannif ;
   private String AV69Trabajosexternos_tmanufawwds_5_tfmannif_sel ;
   private String AV70Trabajosexternos_tmanufawwds_6_tfmannom ;
   private String AV71Trabajosexternos_tmanufawwds_7_tfmannom_sel ;
   private String AV72Trabajosexternos_tmanufawwds_8_tfmandom ;
   private String AV73Trabajosexternos_tmanufawwds_9_tfmandom_sel ;
   private String AV74Trabajosexternos_tmanufawwds_10_tfmanpob ;
   private String AV75Trabajosexternos_tmanufawwds_11_tfmanpob_sel ;
   private String AV76Trabajosexternos_tmanufawwds_12_tfmancpo ;
   private String AV77Trabajosexternos_tmanufawwds_13_tfmancpo_sel ;
   private String AV78Trabajosexternos_tmanufawwds_14_tfmancp2 ;
   private String AV79Trabajosexternos_tmanufawwds_15_tfmancp2_sel ;
   private String AV82Trabajosexternos_tmanufawwds_18_tfprvdsc ;
   private String AV83Trabajosexternos_tmanufawwds_19_tfprvdsc_sel ;
   private String AV84Trabajosexternos_tmanufawwds_20_tfmantel1 ;
   private String AV85Trabajosexternos_tmanufawwds_21_tfmantel1_sel ;
   private String AV86Trabajosexternos_tmanufawwds_22_tfmantel2 ;
   private String AV87Trabajosexternos_tmanufawwds_23_tfmantel2_sel ;
   private String AV88Trabajosexternos_tmanufawwds_24_tfmanfax ;
   private String AV89Trabajosexternos_tmanufawwds_25_tfmanfax_sel ;
   private String scmdbuf ;
   private String lV68Trabajosexternos_tmanufawwds_4_tfmannif ;
   private String lV70Trabajosexternos_tmanufawwds_6_tfmannom ;
   private String lV72Trabajosexternos_tmanufawwds_8_tfmandom ;
   private String lV74Trabajosexternos_tmanufawwds_10_tfmanpob ;
   private String lV76Trabajosexternos_tmanufawwds_12_tfmancpo ;
   private String lV78Trabajosexternos_tmanufawwds_14_tfmancp2 ;
   private String lV82Trabajosexternos_tmanufawwds_18_tfprvdsc ;
   private String lV84Trabajosexternos_tmanufawwds_20_tfmantel1 ;
   private String lV86Trabajosexternos_tmanufawwds_22_tfmantel2 ;
   private String lV88Trabajosexternos_tmanufawwds_24_tfmanfax ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n3409ManDto ;
   private boolean n3301ManFax ;
   private boolean n3300ManTel2 ;
   private boolean n3299ManTel1 ;
   private boolean n787PrvDsc ;
   private boolean n781PrvCod ;
   private boolean n10743ManCp2 ;
   private boolean n2252ManCpo ;
   private boolean n2251ManPob ;
   private boolean n2250ManDom ;
   private boolean n2249ManNom ;
   private boolean n3302ManNif ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV65Trabajosexternos_tmanufawwds_1_filterfulltext ;
   private String lV65Trabajosexternos_tmanufawwds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P0AFM2_A3409ManDto ;
   private boolean[] P0AFM2_n3409ManDto ;
   private String[] P0AFM2_A3301ManFax ;
   private boolean[] P0AFM2_n3301ManFax ;
   private String[] P0AFM2_A3300ManTel2 ;
   private boolean[] P0AFM2_n3300ManTel2 ;
   private String[] P0AFM2_A3299ManTel1 ;
   private boolean[] P0AFM2_n3299ManTel1 ;
   private String[] P0AFM2_A787PrvDsc ;
   private boolean[] P0AFM2_n787PrvDsc ;
   private short[] P0AFM2_A781PrvCod ;
   private boolean[] P0AFM2_n781PrvCod ;
   private String[] P0AFM2_A10743ManCp2 ;
   private boolean[] P0AFM2_n10743ManCp2 ;
   private String[] P0AFM2_A2252ManCpo ;
   private boolean[] P0AFM2_n2252ManCpo ;
   private String[] P0AFM2_A2251ManPob ;
   private boolean[] P0AFM2_n2251ManPob ;
   private String[] P0AFM2_A2250ManDom ;
   private boolean[] P0AFM2_n2250ManDom ;
   private String[] P0AFM2_A2249ManNom ;
   private boolean[] P0AFM2_n2249ManNom ;
   private String[] P0AFM2_A3302ManNif ;
   private boolean[] P0AFM2_n3302ManNif ;
   private short[] P0AFM2_A2248ManCod ;
   private String[] P0AFM2_A396EmprCod ;
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

final  class tmanufawwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AFM2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV65Trabajosexternos_tmanufawwds_1_filterfulltext ,
                                          short AV66Trabajosexternos_tmanufawwds_2_tfmancod ,
                                          short AV67Trabajosexternos_tmanufawwds_3_tfmancod_to ,
                                          String AV69Trabajosexternos_tmanufawwds_5_tfmannif_sel ,
                                          String AV68Trabajosexternos_tmanufawwds_4_tfmannif ,
                                          String AV71Trabajosexternos_tmanufawwds_7_tfmannom_sel ,
                                          String AV70Trabajosexternos_tmanufawwds_6_tfmannom ,
                                          String AV73Trabajosexternos_tmanufawwds_9_tfmandom_sel ,
                                          String AV72Trabajosexternos_tmanufawwds_8_tfmandom ,
                                          String AV75Trabajosexternos_tmanufawwds_11_tfmanpob_sel ,
                                          String AV74Trabajosexternos_tmanufawwds_10_tfmanpob ,
                                          String AV77Trabajosexternos_tmanufawwds_13_tfmancpo_sel ,
                                          String AV76Trabajosexternos_tmanufawwds_12_tfmancpo ,
                                          String AV79Trabajosexternos_tmanufawwds_15_tfmancp2_sel ,
                                          String AV78Trabajosexternos_tmanufawwds_14_tfmancp2 ,
                                          short AV80Trabajosexternos_tmanufawwds_16_tfprvcod ,
                                          short AV81Trabajosexternos_tmanufawwds_17_tfprvcod_to ,
                                          String AV83Trabajosexternos_tmanufawwds_19_tfprvdsc_sel ,
                                          String AV82Trabajosexternos_tmanufawwds_18_tfprvdsc ,
                                          String AV85Trabajosexternos_tmanufawwds_21_tfmantel1_sel ,
                                          String AV84Trabajosexternos_tmanufawwds_20_tfmantel1 ,
                                          String AV87Trabajosexternos_tmanufawwds_23_tfmantel2_sel ,
                                          String AV86Trabajosexternos_tmanufawwds_22_tfmantel2 ,
                                          String AV89Trabajosexternos_tmanufawwds_25_tfmanfax_sel ,
                                          String AV88Trabajosexternos_tmanufawwds_24_tfmanfax ,
                                          java.math.BigDecimal AV90Trabajosexternos_tmanufawwds_26_tfmandto ,
                                          java.math.BigDecimal AV91Trabajosexternos_tmanufawwds_27_tfmandto_to ,
                                          short A2248ManCod ,
                                          String A3302ManNif ,
                                          String A2249ManNom ,
                                          String A2250ManDom ,
                                          String A2251ManPob ,
                                          String A2252ManCpo ,
                                          String A10743ManCp2 ,
                                          short A781PrvCod ,
                                          String A787PrvDsc ,
                                          String A3299ManTel1 ,
                                          String A3300ManTel2 ,
                                          String A3301ManFax ,
                                          java.math.BigDecimal A3409ManDto ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[39];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.ManDto, T1.ManFax, T1.ManTel2, T1.ManTel1, T2.PrvDsc, T1.PrvCod, T1.ManCp2, T1.ManCpo, T1.ManPob, T1.ManDom, T1.ManNom, T1.ManNif, T1.ManCod, T1.EmprCod" ;
      scmdbuf += " FROM (TXPMANUFA T1 LEFT JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod)" ;
      if ( ! (GXutil.strcmp("", AV65Trabajosexternos_tmanufawwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.ManCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ManNif) like '%' || UPPER(?)) or ( UPPER(T1.ManNom) like '%' || UPPER(?)) or ( UPPER(T1.ManDom) like '%' || UPPER(?)) or ( UPPER(T1.ManPob) like '%' || UPPER(?)) or ( UPPER(T1.ManCpo) like '%' || UPPER(?)) or ( UPPER(T1.ManCp2) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvCod,'990'), 2) like '%' || ?) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)) or ( UPPER(T1.ManTel1) like '%' || UPPER(?)) or ( UPPER(T1.ManTel2) like '%' || UPPER(?)) or ( UPPER(T1.ManFax) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ManDto,'90.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
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
      }
      if ( ! (0==AV66Trabajosexternos_tmanufawwds_2_tfmancod) )
      {
         addWhere(sWhereString, "(T1.ManCod >= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (0==AV67Trabajosexternos_tmanufawwds_3_tfmancod_to) )
      {
         addWhere(sWhereString, "(T1.ManCod <= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Trabajosexternos_tmanufawwds_5_tfmannif_sel)==0) && ( ! (GXutil.strcmp("", AV68Trabajosexternos_tmanufawwds_4_tfmannif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Trabajosexternos_tmanufawwds_5_tfmannif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManNif = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Trabajosexternos_tmanufawwds_7_tfmannom_sel)==0) && ( ! (GXutil.strcmp("", AV70Trabajosexternos_tmanufawwds_6_tfmannom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Trabajosexternos_tmanufawwds_7_tfmannom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManNom = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Trabajosexternos_tmanufawwds_9_tfmandom_sel)==0) && ( ! (GXutil.strcmp("", AV72Trabajosexternos_tmanufawwds_8_tfmandom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Trabajosexternos_tmanufawwds_9_tfmandom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManDom = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Trabajosexternos_tmanufawwds_11_tfmanpob_sel)==0) && ( ! (GXutil.strcmp("", AV74Trabajosexternos_tmanufawwds_10_tfmanpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Trabajosexternos_tmanufawwds_11_tfmanpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManPob = ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Trabajosexternos_tmanufawwds_13_tfmancpo_sel)==0) && ( ! (GXutil.strcmp("", AV76Trabajosexternos_tmanufawwds_12_tfmancpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Trabajosexternos_tmanufawwds_13_tfmancpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManCpo = ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Trabajosexternos_tmanufawwds_15_tfmancp2_sel)==0) && ( ! (GXutil.strcmp("", AV78Trabajosexternos_tmanufawwds_14_tfmancp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Trabajosexternos_tmanufawwds_15_tfmancp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManCp2 = ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (0==AV80Trabajosexternos_tmanufawwds_16_tfprvcod) )
      {
         addWhere(sWhereString, "(T1.PrvCod >= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (0==AV81Trabajosexternos_tmanufawwds_17_tfprvcod_to) )
      {
         addWhere(sWhereString, "(T1.PrvCod <= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Trabajosexternos_tmanufawwds_19_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV82Trabajosexternos_tmanufawwds_18_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Trabajosexternos_tmanufawwds_19_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Trabajosexternos_tmanufawwds_21_tfmantel1_sel)==0) && ( ! (GXutil.strcmp("", AV84Trabajosexternos_tmanufawwds_20_tfmantel1)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManTel1) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Trabajosexternos_tmanufawwds_21_tfmantel1_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManTel1 = ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Trabajosexternos_tmanufawwds_23_tfmantel2_sel)==0) && ( ! (GXutil.strcmp("", AV86Trabajosexternos_tmanufawwds_22_tfmantel2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManTel2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Trabajosexternos_tmanufawwds_23_tfmantel2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManTel2 = ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Trabajosexternos_tmanufawwds_25_tfmanfax_sel)==0) && ( ! (GXutil.strcmp("", AV88Trabajosexternos_tmanufawwds_24_tfmanfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Trabajosexternos_tmanufawwds_25_tfmanfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManFax = ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Trabajosexternos_tmanufawwds_26_tfmandto)==0) )
      {
         addWhere(sWhereString, "(T1.ManDto >= ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Trabajosexternos_tmanufawwds_27_tfmandto_to)==0) )
      {
         addWhere(sWhereString, "(T1.ManDto <= ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV16OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.ManCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ManCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ManCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ManNif" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ManNif DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ManNom" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ManNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ManDom" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ManDom DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ManPob" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ManPob DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ManCpo" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ManCpo DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ManCp2" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ManCp2 DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvCod" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrvDsc" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrvDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ManTel1" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ManTel1 DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ManTel2" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ManTel2 DESC" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ManFax" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ManFax DESC" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ManDto" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ManDto DESC" ;
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
                  return conditional_P0AFM2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).shortValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , ((Number) dynConstraints[40]).shortValue() , ((Boolean) dynConstraints[41]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AFM2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 10);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 9);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 9);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 34);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(12, 20);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(13);
               ((String[]) buf[25])[0] = rslt.getString(14, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 34);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 34);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 6);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 6);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 9);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 9);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 9);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 9);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 10);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               return;
      }
   }

}

