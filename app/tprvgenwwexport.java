package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tprvgenwwexport extends GXProcedure
{
   public tprvgenwwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tprvgenwwexport.class ), "" );
   }

   public tprvgenwwexport( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      tprvgenwwexport.this.aP1 = new String[] {""};
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
      tprvgenwwexport.this.aP0 = aP0;
      tprvgenwwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "TPRVGENWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      tprvgenwwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      tprvgenwwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV36TFPrvNum) && (0==AV37TFPrvNum_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprvgenwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV36TFPrvNum );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprvgenwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV37TFPrvNum_To );
      }
      if ( ! ( (GXutil.strcmp("", AV39TFPrvNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Proveedor", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprvgenwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFPrvNom_Sel, GXv_char5) ;
         tprvgenwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV38TFPrvNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Proveedor", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tprvgenwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFPrvNom, GXv_char5) ;
            tprvgenwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV43TFPrvDir_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Direccion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprvgenwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFPrvDir_Sel, GXv_char5) ;
         tprvgenwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV42TFPrvDir)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Direccion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tprvgenwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFPrvDir, GXv_char5) ;
            tprvgenwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV45TFPrvCpo_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Postal", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprvgenwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFPrvCpo_Sel, GXv_char5) ;
         tprvgenwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV44TFPrvCpo)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Postal", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tprvgenwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFPrvCpo, GXv_char5) ;
            tprvgenwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV47TFPrvPob_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Poblacion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprvgenwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFPrvPob_Sel, GXv_char5) ;
         tprvgenwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV46TFPrvPob)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Poblacion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tprvgenwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFPrvPob, GXv_char5) ;
            tprvgenwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV49TFPrvNif_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N.I.F.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprvgenwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFPrvNif_Sel, GXv_char5) ;
         tprvgenwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV48TFPrvNif)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N.I.F.", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tprvgenwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFPrvNif, GXv_char5) ;
            tprvgenwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV51TFPrvTlf_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Telefonos", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprvgenwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV51TFPrvTlf_Sel, GXv_char5) ;
         tprvgenwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV50TFPrvTlf)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Telefonos", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tprvgenwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFPrvTlf, GXv_char5) ;
            tprvgenwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV86TFPrvPri_Sel) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Prioridad", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprvgenwwexport.this.AV13CellRow = GXv_int3[0] ;
         if ( AV86TFPrvPri_Sel == 1 )
         {
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "WWP_TSChecked", "") );
         }
         else if ( AV86TFPrvPri_Sel == 2 )
         {
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "WWP_TSUnChecked", "") );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV55TFPrvTlx_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Telex", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprvgenwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV55TFPrvTlx_Sel, GXv_char5) ;
         tprvgenwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV54TFPrvTlx)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Telex", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tprvgenwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV54TFPrvTlx, GXv_char5) ;
            tprvgenwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( ( AV88TFPrvTip_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Proveedor o Acreador", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprvgenwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV85i = 1 ;
         AV96GXV1 = 1 ;
         while ( AV96GXV1 <= AV88TFPrvTip_Sels.size() )
         {
            AV57TFPrvTip_Sel = (String)AV88TFPrvTip_Sels.elementAt(-1+AV96GXV1) ;
            if ( AV85i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV57TFPrvTip_Sel), httpContext.getMessage( "P", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "P", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV57TFPrvTip_Sel), httpContext.getMessage( "A", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "A", "") );
            }
            AV85i = (long)(AV85i+1) ;
            AV96GXV1 = (int)(AV96GXV1+1) ;
         }
      }
      if ( ! ( (GXutil.strcmp("", AV59TFFpgCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Forma de Pago", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprvgenwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV59TFFpgCod_Sel, GXv_char5) ;
         tprvgenwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV58TFFpgCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Forma de Pago", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tprvgenwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV58TFFpgCod, GXv_char5) ;
            tprvgenwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV62TFPrvVto) && (0==AV63TFPrvVto_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "No.Vencimientos", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprvgenwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV62TFPrvVto );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprvgenwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV63TFPrvVto_To );
      }
      if ( ! ( (0==AV64TFPrvDiaPag) && (0==AV65TFPrvDiaPag_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Dias de Pago", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprvgenwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV64TFPrvDiaPag );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprvgenwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV65TFPrvDiaPag_To );
      }
      if ( ! ( (0==AV66TFPrvPer) && (0==AV67TFPrvPer_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Periodicidad", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprvgenwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV66TFPrvPer );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprvgenwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV67TFPrvPer_To );
      }
      if ( ! ( (0==AV68TFPrvBan) && (0==AV69TFPrvBan_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Banco", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprvgenwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV68TFPrvBan );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprvgenwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV69TFPrvBan_To );
      }
      if ( ! ( (GXutil.strcmp("", AV71TFPrvRep_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Representante", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprvgenwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV71TFPrvRep_Sel, GXv_char5) ;
         tprvgenwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV70TFPrvRep)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Representante", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tprvgenwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV70TFPrvRep, GXv_char5) ;
            tprvgenwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV72TFPrvPlaEnt) && (0==AV73TFPrvPlaEnt_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Dias Plazo Entrega", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprvgenwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV72TFPrvPlaEnt );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprvgenwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV73TFPrvPlaEnt_To );
      }
      if ( ! ( ( AV90TFPrvMetTra_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Metodo Transporte", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprvgenwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV85i = 1 ;
         AV97GXV2 = 1 ;
         while ( AV97GXV2 <= AV90TFPrvMetTra_Sels.size() )
         {
            AV75TFPrvMetTra_Sel = (String)AV90TFPrvMetTra_Sels.elementAt(-1+AV97GXV2) ;
            if ( AV85i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV75TFPrvMetTra_Sel), httpContext.getMessage( "S", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Su Transporte", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV75TFPrvMetTra_Sel), httpContext.getMessage( "N", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Nuestro", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV75TFPrvMetTra_Sel), httpContext.getMessage( "A", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Agencia", "") );
            }
            AV85i = (long)(AV85i+1) ;
            AV97GXV2 = (int)(AV97GXV2+1) ;
         }
      }
      if ( ! ( (GXutil.strcmp("", AV77TFPrvCta_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cuenta Contable", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprvgenwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV77TFPrvCta_Sel, GXv_char5) ;
         tprvgenwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV76TFPrvCta)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cuenta Contable", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tprvgenwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV76TFPrvCta, GXv_char5) ;
            tprvgenwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( ( AV79TFPrvDivCod_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Divisa Traspaso Contable", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprvgenwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV85i = 1 ;
         AV98GXV3 = 1 ;
         while ( AV98GXV3 <= AV79TFPrvDivCod_Sels.size() )
         {
            AV80TFPrvDivCod_Sel = (String)AV79TFPrvDivCod_Sels.elementAt(-1+AV98GXV3) ;
            if ( AV85i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV80TFPrvDivCod_Sel), httpContext.getMessage( "E", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "EURO", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV80TFPrvDivCod_Sel), httpContext.getMessage( "P", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "PESETA", "") );
            }
            AV85i = (long)(AV85i+1) ;
            AV98GXV3 = (int)(AV98GXV3+1) ;
         }
      }
      if ( ! ( (0==AV81TFPrvDivCo) && (0==AV82TFPrvDivCo_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Divisa", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprvgenwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV81TFPrvDivCo );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprvgenwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV82TFPrvDivCo_To );
      }
      if ( ! ( (GXutil.strcmp("", AV93TFPrvAct_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Activo?", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprvgenwwexport.this.AV13CellRow = GXv_int3[0] ;
         if ( GXutil.strcmp(AV93TFPrvAct_Sel, httpContext.getMessage( "S", "")) == 0 )
         {
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "WWP_TSChecked", "") );
         }
         else if ( GXutil.strcmp(AV93TFPrvAct_Sel, httpContext.getMessage( "N", "")) == 0 )
         {
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "WWP_TSUnChecked", "") );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("TPRVGENWWColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("TPRVGENWWColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV99GXV4 = 1 ;
      while ( AV99GXV4 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV99GXV4));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV99GXV4 = (int)(AV99GXV4+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV101Tprvgenwwds_1_filterfulltext = AV18FilterFullText ;
      AV102Tprvgenwwds_2_tfprvnum = AV36TFPrvNum ;
      AV103Tprvgenwwds_3_tfprvnum_to = AV37TFPrvNum_To ;
      AV104Tprvgenwwds_4_tfprvnom = AV38TFPrvNom ;
      AV105Tprvgenwwds_5_tfprvnom_sel = AV39TFPrvNom_Sel ;
      AV106Tprvgenwwds_6_tfprvdir = AV42TFPrvDir ;
      AV107Tprvgenwwds_7_tfprvdir_sel = AV43TFPrvDir_Sel ;
      AV108Tprvgenwwds_8_tfprvcpo = AV44TFPrvCpo ;
      AV109Tprvgenwwds_9_tfprvcpo_sel = AV45TFPrvCpo_Sel ;
      AV110Tprvgenwwds_10_tfprvpob = AV46TFPrvPob ;
      AV111Tprvgenwwds_11_tfprvpob_sel = AV47TFPrvPob_Sel ;
      AV112Tprvgenwwds_12_tfprvnif = AV48TFPrvNif ;
      AV113Tprvgenwwds_13_tfprvnif_sel = AV49TFPrvNif_Sel ;
      AV114Tprvgenwwds_14_tfprvtlf = AV50TFPrvTlf ;
      AV115Tprvgenwwds_15_tfprvtlf_sel = AV51TFPrvTlf_Sel ;
      AV116Tprvgenwwds_16_tfprvpri_sel = AV86TFPrvPri_Sel ;
      AV117Tprvgenwwds_17_tfprvtlx = AV54TFPrvTlx ;
      AV118Tprvgenwwds_18_tfprvtlx_sel = AV55TFPrvTlx_Sel ;
      AV119Tprvgenwwds_19_tfprvtip_sels = AV88TFPrvTip_Sels ;
      AV120Tprvgenwwds_20_tffpgcod = AV58TFFpgCod ;
      AV121Tprvgenwwds_21_tffpgcod_sel = AV59TFFpgCod_Sel ;
      AV122Tprvgenwwds_22_tfprvvto = AV62TFPrvVto ;
      AV123Tprvgenwwds_23_tfprvvto_to = AV63TFPrvVto_To ;
      AV124Tprvgenwwds_24_tfprvdiapag = AV64TFPrvDiaPag ;
      AV125Tprvgenwwds_25_tfprvdiapag_to = AV65TFPrvDiaPag_To ;
      AV126Tprvgenwwds_26_tfprvper = AV66TFPrvPer ;
      AV127Tprvgenwwds_27_tfprvper_to = AV67TFPrvPer_To ;
      AV128Tprvgenwwds_28_tfprvban = AV68TFPrvBan ;
      AV129Tprvgenwwds_29_tfprvban_to = AV69TFPrvBan_To ;
      AV130Tprvgenwwds_30_tfprvrep = AV70TFPrvRep ;
      AV131Tprvgenwwds_31_tfprvrep_sel = AV71TFPrvRep_Sel ;
      AV132Tprvgenwwds_32_tfprvplaent = AV72TFPrvPlaEnt ;
      AV133Tprvgenwwds_33_tfprvplaent_to = AV73TFPrvPlaEnt_To ;
      AV134Tprvgenwwds_34_tfprvmettra_sels = AV90TFPrvMetTra_Sels ;
      AV135Tprvgenwwds_35_tfprvcta = AV76TFPrvCta ;
      AV136Tprvgenwwds_36_tfprvcta_sel = AV77TFPrvCta_Sel ;
      AV137Tprvgenwwds_37_tfprvdivcod_sels = AV79TFPrvDivCod_Sels ;
      AV138Tprvgenwwds_38_tfprvdivco = AV81TFPrvDivCo ;
      AV139Tprvgenwwds_39_tfprvdivco_to = AV82TFPrvDivCo_To ;
      AV140Tprvgenwwds_40_tfprvact_sel = AV93TFPrvAct_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A802PrvTip ,
                                           AV119Tprvgenwwds_19_tfprvtip_sels ,
                                           A792PrvMetTra ,
                                           AV134Tprvgenwwds_34_tfprvmettra_sels ,
                                           A3092PrvDivCod ,
                                           AV137Tprvgenwwds_37_tfprvdivcod_sels ,
                                           Integer.valueOf(AV102Tprvgenwwds_2_tfprvnum) ,
                                           Integer.valueOf(AV103Tprvgenwwds_3_tfprvnum_to) ,
                                           AV105Tprvgenwwds_5_tfprvnom_sel ,
                                           AV104Tprvgenwwds_4_tfprvnom ,
                                           AV107Tprvgenwwds_7_tfprvdir_sel ,
                                           AV106Tprvgenwwds_6_tfprvdir ,
                                           AV109Tprvgenwwds_9_tfprvcpo_sel ,
                                           AV108Tprvgenwwds_8_tfprvcpo ,
                                           AV111Tprvgenwwds_11_tfprvpob_sel ,
                                           AV110Tprvgenwwds_10_tfprvpob ,
                                           AV113Tprvgenwwds_13_tfprvnif_sel ,
                                           AV112Tprvgenwwds_12_tfprvnif ,
                                           AV115Tprvgenwwds_15_tfprvtlf_sel ,
                                           AV114Tprvgenwwds_14_tfprvtlf ,
                                           Byte.valueOf(AV116Tprvgenwwds_16_tfprvpri_sel) ,
                                           AV118Tprvgenwwds_18_tfprvtlx_sel ,
                                           AV117Tprvgenwwds_17_tfprvtlx ,
                                           Integer.valueOf(AV119Tprvgenwwds_19_tfprvtip_sels.size()) ,
                                           AV121Tprvgenwwds_21_tffpgcod_sel ,
                                           AV120Tprvgenwwds_20_tffpgcod ,
                                           Byte.valueOf(AV122Tprvgenwwds_22_tfprvvto) ,
                                           Byte.valueOf(AV123Tprvgenwwds_23_tfprvvto_to) ,
                                           Integer.valueOf(AV124Tprvgenwwds_24_tfprvdiapag) ,
                                           Integer.valueOf(AV125Tprvgenwwds_25_tfprvdiapag_to) ,
                                           Integer.valueOf(AV126Tprvgenwwds_26_tfprvper) ,
                                           Integer.valueOf(AV127Tprvgenwwds_27_tfprvper_to) ,
                                           Integer.valueOf(AV128Tprvgenwwds_28_tfprvban) ,
                                           Integer.valueOf(AV129Tprvgenwwds_29_tfprvban_to) ,
                                           AV131Tprvgenwwds_31_tfprvrep_sel ,
                                           AV130Tprvgenwwds_30_tfprvrep ,
                                           Short.valueOf(AV132Tprvgenwwds_32_tfprvplaent) ,
                                           Short.valueOf(AV133Tprvgenwwds_33_tfprvplaent_to) ,
                                           Integer.valueOf(AV134Tprvgenwwds_34_tfprvmettra_sels.size()) ,
                                           AV136Tprvgenwwds_36_tfprvcta_sel ,
                                           AV135Tprvgenwwds_35_tfprvcta ,
                                           Integer.valueOf(AV137Tprvgenwwds_37_tfprvdivcod_sels.size()) ,
                                           Byte.valueOf(AV138Tprvgenwwds_38_tfprvdivco) ,
                                           Byte.valueOf(AV139Tprvgenwwds_39_tfprvdivco_to) ,
                                           AV140Tprvgenwwds_40_tfprvact_sel ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A786PrvDir ,
                                           A782PrvCpo ,
                                           A799PrvPob ,
                                           A793PrvNif ,
                                           A803PrvTlf ,
                                           Byte.valueOf(A800PrvPri) ,
                                           A804PrvTlx ,
                                           A497FpgCod ,
                                           Byte.valueOf(A805PrvVto) ,
                                           Integer.valueOf(A785PrvDiaPag) ,
                                           Integer.valueOf(A797PrvPer) ,
                                           Integer.valueOf(A780PrvBan) ,
                                           A801PrvRep ,
                                           Short.valueOf(A798PrvPlaEnt) ,
                                           A783PrvCta ,
                                           Byte.valueOf(A3143PrvDivCo) ,
                                           A14216PrvAct ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV101Tprvgenwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV104Tprvgenwwds_4_tfprvnom = GXutil.padr( GXutil.rtrim( AV104Tprvgenwwds_4_tfprvnom), 30, "%") ;
      lV106Tprvgenwwds_6_tfprvdir = GXutil.padr( GXutil.rtrim( AV106Tprvgenwwds_6_tfprvdir), 30, "%") ;
      lV108Tprvgenwwds_8_tfprvcpo = GXutil.padr( GXutil.rtrim( AV108Tprvgenwwds_8_tfprvcpo), 6, "%") ;
      lV110Tprvgenwwds_10_tfprvpob = GXutil.padr( GXutil.rtrim( AV110Tprvgenwwds_10_tfprvpob), 30, "%") ;
      lV112Tprvgenwwds_12_tfprvnif = GXutil.padr( GXutil.rtrim( AV112Tprvgenwwds_12_tfprvnif), 20, "%") ;
      lV114Tprvgenwwds_14_tfprvtlf = GXutil.padr( GXutil.rtrim( AV114Tprvgenwwds_14_tfprvtlf), 18, "%") ;
      lV117Tprvgenwwds_17_tfprvtlx = GXutil.padr( GXutil.rtrim( AV117Tprvgenwwds_17_tfprvtlx), 14, "%") ;
      lV120Tprvgenwwds_20_tffpgcod = GXutil.padr( GXutil.rtrim( AV120Tprvgenwwds_20_tffpgcod), 2, "%") ;
      lV130Tprvgenwwds_30_tfprvrep = GXutil.padr( GXutil.rtrim( AV130Tprvgenwwds_30_tfprvrep), 20, "%") ;
      lV135Tprvgenwwds_35_tfprvcta = GXutil.padr( GXutil.rtrim( AV135Tprvgenwwds_35_tfprvcta), 12, "%") ;
      /* Using cursor P08AJ2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV102Tprvgenwwds_2_tfprvnum), Integer.valueOf(AV103Tprvgenwwds_3_tfprvnum_to), lV104Tprvgenwwds_4_tfprvnom, AV105Tprvgenwwds_5_tfprvnom_sel, lV106Tprvgenwwds_6_tfprvdir, AV107Tprvgenwwds_7_tfprvdir_sel, lV108Tprvgenwwds_8_tfprvcpo, AV109Tprvgenwwds_9_tfprvcpo_sel, lV110Tprvgenwwds_10_tfprvpob, AV111Tprvgenwwds_11_tfprvpob_sel, lV112Tprvgenwwds_12_tfprvnif, AV113Tprvgenwwds_13_tfprvnif_sel, lV114Tprvgenwwds_14_tfprvtlf, AV115Tprvgenwwds_15_tfprvtlf_sel, lV117Tprvgenwwds_17_tfprvtlx, AV118Tprvgenwwds_18_tfprvtlx_sel, lV120Tprvgenwwds_20_tffpgcod, AV121Tprvgenwwds_21_tffpgcod_sel, Byte.valueOf(AV122Tprvgenwwds_22_tfprvvto), Byte.valueOf(AV123Tprvgenwwds_23_tfprvvto_to), Integer.valueOf(AV124Tprvgenwwds_24_tfprvdiapag), Integer.valueOf(AV125Tprvgenwwds_25_tfprvdiapag_to), Integer.valueOf(AV126Tprvgenwwds_26_tfprvper), Integer.valueOf(AV127Tprvgenwwds_27_tfprvper_to), Integer.valueOf(AV128Tprvgenwwds_28_tfprvban), Integer.valueOf(AV129Tprvgenwwds_29_tfprvban_to), lV130Tprvgenwwds_30_tfprvrep, AV131Tprvgenwwds_31_tfprvrep_sel, Short.valueOf(AV132Tprvgenwwds_32_tfprvplaent), Short.valueOf(AV133Tprvgenwwds_33_tfprvplaent_to), lV135Tprvgenwwds_35_tfprvcta, AV136Tprvgenwwds_36_tfprvcta_sel, Byte.valueOf(AV138Tprvgenwwds_38_tfprvdivco), Byte.valueOf(AV139Tprvgenwwds_39_tfprvdivco_to), AV140Tprvgenwwds_40_tfprvact_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14216PrvAct = P08AJ2_A14216PrvAct[0] ;
         A3143PrvDivCo = P08AJ2_A3143PrvDivCo[0] ;
         A783PrvCta = P08AJ2_A783PrvCta[0] ;
         n783PrvCta = P08AJ2_n783PrvCta[0] ;
         A798PrvPlaEnt = P08AJ2_A798PrvPlaEnt[0] ;
         n798PrvPlaEnt = P08AJ2_n798PrvPlaEnt[0] ;
         A801PrvRep = P08AJ2_A801PrvRep[0] ;
         n801PrvRep = P08AJ2_n801PrvRep[0] ;
         A780PrvBan = P08AJ2_A780PrvBan[0] ;
         n780PrvBan = P08AJ2_n780PrvBan[0] ;
         A797PrvPer = P08AJ2_A797PrvPer[0] ;
         n797PrvPer = P08AJ2_n797PrvPer[0] ;
         A785PrvDiaPag = P08AJ2_A785PrvDiaPag[0] ;
         n785PrvDiaPag = P08AJ2_n785PrvDiaPag[0] ;
         A805PrvVto = P08AJ2_A805PrvVto[0] ;
         n805PrvVto = P08AJ2_n805PrvVto[0] ;
         A497FpgCod = P08AJ2_A497FpgCod[0] ;
         n497FpgCod = P08AJ2_n497FpgCod[0] ;
         A804PrvTlx = P08AJ2_A804PrvTlx[0] ;
         n804PrvTlx = P08AJ2_n804PrvTlx[0] ;
         A800PrvPri = P08AJ2_A800PrvPri[0] ;
         n800PrvPri = P08AJ2_n800PrvPri[0] ;
         A803PrvTlf = P08AJ2_A803PrvTlf[0] ;
         n803PrvTlf = P08AJ2_n803PrvTlf[0] ;
         A793PrvNif = P08AJ2_A793PrvNif[0] ;
         n793PrvNif = P08AJ2_n793PrvNif[0] ;
         A799PrvPob = P08AJ2_A799PrvPob[0] ;
         n799PrvPob = P08AJ2_n799PrvPob[0] ;
         A782PrvCpo = P08AJ2_A782PrvCpo[0] ;
         n782PrvCpo = P08AJ2_n782PrvCpo[0] ;
         A786PrvDir = P08AJ2_A786PrvDir[0] ;
         n786PrvDir = P08AJ2_n786PrvDir[0] ;
         A794PrvNom = P08AJ2_A794PrvNom[0] ;
         n794PrvNom = P08AJ2_n794PrvNom[0] ;
         A795PrvNum = P08AJ2_A795PrvNum[0] ;
         A3092PrvDivCod = P08AJ2_A3092PrvDivCod[0] ;
         n3092PrvDivCod = P08AJ2_n3092PrvDivCod[0] ;
         A792PrvMetTra = P08AJ2_A792PrvMetTra[0] ;
         n792PrvMetTra = P08AJ2_n792PrvMetTra[0] ;
         A802PrvTip = P08AJ2_A802PrvTip[0] ;
         n802PrvTip = P08AJ2_n802PrvTip[0] ;
         A396EmprCod = P08AJ2_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV101Tprvgenwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV101Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV101Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A786PrvDir) , GXutil.padr( "%" + GXutil.upper( AV101Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A782PrvCpo) , GXutil.padr( "%" + GXutil.upper( AV101Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A799PrvPob) , GXutil.padr( "%" + GXutil.upper( AV101Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A793PrvNif) , GXutil.padr( "%" + GXutil.upper( AV101Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A803PrvTlf) , GXutil.padr( "%" + GXutil.upper( AV101Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A804PrvTlx) , GXutil.padr( "%" + GXutil.upper( AV101Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "p", ""), "") , GXutil.padr( "%" + GXutil.lower( AV101Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A802PrvTip, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "a", ""), "") , GXutil.padr( "%" + GXutil.lower( AV101Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A802PrvTip, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A497FpgCod) , GXutil.padr( "%" + GXutil.upper( AV101Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A805PrvVto, 2, 0) , GXutil.padr( "%" + AV101Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A785PrvDiaPag, 6, 0) , GXutil.padr( "%" + AV101Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A797PrvPer, 6, 0) , GXutil.padr( "%" + AV101Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A780PrvBan, 6, 0) , GXutil.padr( "%" + AV101Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A801PrvRep) , GXutil.padr( "%" + GXutil.upper( AV101Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A798PrvPlaEnt, 3, 0) , GXutil.padr( "%" + AV101Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "su transporte", ""), "") , GXutil.padr( "%" + GXutil.lower( AV101Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nuestro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV101Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "agencia", ""), "") , GXutil.padr( "%" + GXutil.lower( AV101Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A783PrvCta) , GXutil.padr( "%" + GXutil.upper( AV101Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "euro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV101Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3092PrvDivCod, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "peseta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV101Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3092PrvDivCod, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A3143PrvDivCo, 2, 0) , GXutil.padr( "%" + AV101Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV13CellRow = (int)(AV13CellRow+1) ;
            /* Execute user subroutine: 'BEFOREWRITELINE' */
            S172 ();
            if ( returnInSub )
            {
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
               tprvgenwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A786PrvDir, GXv_char5) ;
               tprvgenwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A782PrvCpo, GXv_char5) ;
               tprvgenwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A799PrvPob, GXv_char5) ;
               tprvgenwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A793PrvNif, GXv_char5) ;
               tprvgenwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A803PrvTlf, GXv_char5) ;
               tprvgenwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A800PrvPri );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A804PrvTlx, GXv_char5) ;
               tprvgenwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( "" );
               if ( GXutil.strcmp(GXutil.trim( A802PrvTip), httpContext.getMessage( "P", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "P", "") );
               }
               else if ( GXutil.strcmp(GXutil.trim( A802PrvTip), httpContext.getMessage( "A", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "A", "") );
               }
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A497FpgCod, GXv_char5) ;
               tprvgenwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A805PrvVto );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A785PrvDiaPag );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A797PrvPer );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A780PrvBan );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A801PrvRep, GXv_char5) ;
               tprvgenwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A798PrvPlaEnt );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
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
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A783PrvCta, GXv_char5) ;
               tprvgenwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( "" );
               if ( GXutil.strcmp(GXutil.trim( A3092PrvDivCod), httpContext.getMessage( "E", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "EURO", "") );
               }
               else if ( GXutil.strcmp(GXutil.trim( A3092PrvDivCod), httpContext.getMessage( "P", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "PESETA", "") );
               }
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A3143PrvDivCo );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14216PrvAct, GXv_char5) ;
               tprvgenwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            /* Execute user subroutine: 'AFTERWRITELINE' */
            S182 ();
            if ( returnInSub )
            {
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvNum", "", "Codigo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvNom", "", "Proveedor", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvDir", "", "Direccion", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvCpo", "", "Codigo Postal", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvPob", "", "Poblacion", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvNif", "", "N.I.F.", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvTlf", "", "Telefonos", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvPri", "", "Prioridad", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvTlx", "", "Telex", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvTip", "", "Proveedor o Acreador", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "FpgCod", "", "Forma de Pago", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvVto", "", "No.Vencimientos", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvDiaPag", "", "Dias de Pago", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvPer", "", "Periodicidad", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvBan", "", "Codigo Banco", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvRep", "", "Representante", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvPlaEnt", "", "Dias Plazo Entrega", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvMetTra", "", "Metodo Transporte", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvCta", "", "Cuenta Contable", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvDivCod", "", "Divisa Traspaso Contable", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvDivCo", "", "Divisa", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvAct", "", "Activo?", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TPRVGENWWColumnsSelector", GXv_char5) ;
      tprvgenwwexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TPRVGENWWGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TPRVGENWWGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("TPRVGENWWGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV141GXV5 = 1 ;
      while ( AV141GXV5 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV141GXV5));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNUM") == 0 )
         {
            AV36TFPrvNum = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV37TFPrvNum_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM") == 0 )
         {
            AV38TFPrvNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM_SEL") == 0 )
         {
            AV39TFPrvNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDIR") == 0 )
         {
            AV42TFPrvDir = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDIR_SEL") == 0 )
         {
            AV43TFPrvDir_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCPO") == 0 )
         {
            AV44TFPrvCpo = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCPO_SEL") == 0 )
         {
            AV45TFPrvCpo_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVPOB") == 0 )
         {
            AV46TFPrvPob = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVPOB_SEL") == 0 )
         {
            AV47TFPrvPob_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNIF") == 0 )
         {
            AV48TFPrvNif = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNIF_SEL") == 0 )
         {
            AV49TFPrvNif_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVTLF") == 0 )
         {
            AV50TFPrvTlf = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVTLF_SEL") == 0 )
         {
            AV51TFPrvTlf_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVPRI_SEL") == 0 )
         {
            AV86TFPrvPri_Sel = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVTLX") == 0 )
         {
            AV54TFPrvTlx = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVTLX_SEL") == 0 )
         {
            AV55TFPrvTlx_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVTIP_SEL") == 0 )
         {
            AV87TFPrvTip_SelsJson = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV88TFPrvTip_Sels.fromJSonString(AV87TFPrvTip_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFPGCOD") == 0 )
         {
            AV58TFFpgCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFPGCOD_SEL") == 0 )
         {
            AV59TFFpgCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVVTO") == 0 )
         {
            AV62TFPrvVto = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV63TFPrvVto_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDIAPAG") == 0 )
         {
            AV64TFPrvDiaPag = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV65TFPrvDiaPag_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVPER") == 0 )
         {
            AV66TFPrvPer = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV67TFPrvPer_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVBAN") == 0 )
         {
            AV68TFPrvBan = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV69TFPrvBan_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVREP") == 0 )
         {
            AV70TFPrvRep = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVREP_SEL") == 0 )
         {
            AV71TFPrvRep_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVPLAENT") == 0 )
         {
            AV72TFPrvPlaEnt = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV73TFPrvPlaEnt_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVMETTRA_SEL") == 0 )
         {
            AV89TFPrvMetTra_SelsJson = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV90TFPrvMetTra_Sels.fromJSonString(AV89TFPrvMetTra_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCTA") == 0 )
         {
            AV76TFPrvCta = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCTA_SEL") == 0 )
         {
            AV77TFPrvCta_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDIVCOD_SEL") == 0 )
         {
            AV78TFPrvDivCod_SelsJson = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV79TFPrvDivCod_Sels.fromJSonString(AV78TFPrvDivCod_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDIVCO") == 0 )
         {
            AV81TFPrvDivCo = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV82TFPrvDivCo_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVACT_SEL") == 0 )
         {
            AV93TFPrvAct_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV141GXV5 = (int)(AV141GXV5+1) ;
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
      this.aP0[0] = tprvgenwwexport.this.AV11Filename;
      this.aP1[0] = tprvgenwwexport.this.AV12ErrorMessage;
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
      AV39TFPrvNom_Sel = "" ;
      AV38TFPrvNom = "" ;
      AV43TFPrvDir_Sel = "" ;
      AV42TFPrvDir = "" ;
      AV45TFPrvCpo_Sel = "" ;
      AV44TFPrvCpo = "" ;
      AV47TFPrvPob_Sel = "" ;
      AV46TFPrvPob = "" ;
      AV49TFPrvNif_Sel = "" ;
      AV48TFPrvNif = "" ;
      AV51TFPrvTlf_Sel = "" ;
      AV50TFPrvTlf = "" ;
      AV55TFPrvTlx_Sel = "" ;
      AV54TFPrvTlx = "" ;
      AV88TFPrvTip_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV57TFPrvTip_Sel = "" ;
      AV59TFFpgCod_Sel = "" ;
      AV58TFFpgCod = "" ;
      AV71TFPrvRep_Sel = "" ;
      AV70TFPrvRep = "" ;
      AV90TFPrvMetTra_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV75TFPrvMetTra_Sel = "" ;
      AV77TFPrvCta_Sel = "" ;
      AV76TFPrvCta = "" ;
      AV79TFPrvDivCod_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV80TFPrvDivCod_Sel = "" ;
      AV93TFPrvAct_Sel = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A794PrvNom = "" ;
      A786PrvDir = "" ;
      A782PrvCpo = "" ;
      A799PrvPob = "" ;
      A793PrvNif = "" ;
      A803PrvTlf = "" ;
      A804PrvTlx = "" ;
      A802PrvTip = "" ;
      A497FpgCod = "" ;
      A801PrvRep = "" ;
      A792PrvMetTra = "" ;
      A783PrvCta = "" ;
      A3092PrvDivCod = "" ;
      A14216PrvAct = "" ;
      AV101Tprvgenwwds_1_filterfulltext = "" ;
      AV104Tprvgenwwds_4_tfprvnom = "" ;
      AV105Tprvgenwwds_5_tfprvnom_sel = "" ;
      AV106Tprvgenwwds_6_tfprvdir = "" ;
      AV107Tprvgenwwds_7_tfprvdir_sel = "" ;
      AV108Tprvgenwwds_8_tfprvcpo = "" ;
      AV109Tprvgenwwds_9_tfprvcpo_sel = "" ;
      AV110Tprvgenwwds_10_tfprvpob = "" ;
      AV111Tprvgenwwds_11_tfprvpob_sel = "" ;
      AV112Tprvgenwwds_12_tfprvnif = "" ;
      AV113Tprvgenwwds_13_tfprvnif_sel = "" ;
      AV114Tprvgenwwds_14_tfprvtlf = "" ;
      AV115Tprvgenwwds_15_tfprvtlf_sel = "" ;
      AV117Tprvgenwwds_17_tfprvtlx = "" ;
      AV118Tprvgenwwds_18_tfprvtlx_sel = "" ;
      AV119Tprvgenwwds_19_tfprvtip_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV120Tprvgenwwds_20_tffpgcod = "" ;
      AV121Tprvgenwwds_21_tffpgcod_sel = "" ;
      AV130Tprvgenwwds_30_tfprvrep = "" ;
      AV131Tprvgenwwds_31_tfprvrep_sel = "" ;
      AV134Tprvgenwwds_34_tfprvmettra_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV135Tprvgenwwds_35_tfprvcta = "" ;
      AV136Tprvgenwwds_36_tfprvcta_sel = "" ;
      AV137Tprvgenwwds_37_tfprvdivcod_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV140Tprvgenwwds_40_tfprvact_sel = "" ;
      lV101Tprvgenwwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV104Tprvgenwwds_4_tfprvnom = "" ;
      lV106Tprvgenwwds_6_tfprvdir = "" ;
      lV108Tprvgenwwds_8_tfprvcpo = "" ;
      lV110Tprvgenwwds_10_tfprvpob = "" ;
      lV112Tprvgenwwds_12_tfprvnif = "" ;
      lV114Tprvgenwwds_14_tfprvtlf = "" ;
      lV117Tprvgenwwds_17_tfprvtlx = "" ;
      lV120Tprvgenwwds_20_tffpgcod = "" ;
      lV130Tprvgenwwds_30_tfprvrep = "" ;
      lV135Tprvgenwwds_35_tfprvcta = "" ;
      P08AJ2_A14216PrvAct = new String[] {""} ;
      P08AJ2_A3143PrvDivCo = new byte[1] ;
      P08AJ2_A783PrvCta = new String[] {""} ;
      P08AJ2_n783PrvCta = new boolean[] {false} ;
      P08AJ2_A798PrvPlaEnt = new short[1] ;
      P08AJ2_n798PrvPlaEnt = new boolean[] {false} ;
      P08AJ2_A801PrvRep = new String[] {""} ;
      P08AJ2_n801PrvRep = new boolean[] {false} ;
      P08AJ2_A780PrvBan = new int[1] ;
      P08AJ2_n780PrvBan = new boolean[] {false} ;
      P08AJ2_A797PrvPer = new int[1] ;
      P08AJ2_n797PrvPer = new boolean[] {false} ;
      P08AJ2_A785PrvDiaPag = new int[1] ;
      P08AJ2_n785PrvDiaPag = new boolean[] {false} ;
      P08AJ2_A805PrvVto = new byte[1] ;
      P08AJ2_n805PrvVto = new boolean[] {false} ;
      P08AJ2_A497FpgCod = new String[] {""} ;
      P08AJ2_n497FpgCod = new boolean[] {false} ;
      P08AJ2_A804PrvTlx = new String[] {""} ;
      P08AJ2_n804PrvTlx = new boolean[] {false} ;
      P08AJ2_A800PrvPri = new byte[1] ;
      P08AJ2_n800PrvPri = new boolean[] {false} ;
      P08AJ2_A803PrvTlf = new String[] {""} ;
      P08AJ2_n803PrvTlf = new boolean[] {false} ;
      P08AJ2_A793PrvNif = new String[] {""} ;
      P08AJ2_n793PrvNif = new boolean[] {false} ;
      P08AJ2_A799PrvPob = new String[] {""} ;
      P08AJ2_n799PrvPob = new boolean[] {false} ;
      P08AJ2_A782PrvCpo = new String[] {""} ;
      P08AJ2_n782PrvCpo = new boolean[] {false} ;
      P08AJ2_A786PrvDir = new String[] {""} ;
      P08AJ2_n786PrvDir = new boolean[] {false} ;
      P08AJ2_A794PrvNom = new String[] {""} ;
      P08AJ2_n794PrvNom = new boolean[] {false} ;
      P08AJ2_A795PrvNum = new int[1] ;
      P08AJ2_A3092PrvDivCod = new String[] {""} ;
      P08AJ2_n3092PrvDivCod = new boolean[] {false} ;
      P08AJ2_A792PrvMetTra = new String[] {""} ;
      P08AJ2_n792PrvMetTra = new boolean[] {false} ;
      P08AJ2_A802PrvTip = new String[] {""} ;
      P08AJ2_n802PrvTip = new boolean[] {false} ;
      P08AJ2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV87TFPrvTip_SelsJson = "" ;
      AV89TFPrvMetTra_SelsJson = "" ;
      AV78TFPrvDivCod_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tprvgenwwexport__default(),
         new Object[] {
             new Object[] {
            P08AJ2_A14216PrvAct, P08AJ2_A3143PrvDivCo, P08AJ2_A783PrvCta, P08AJ2_n783PrvCta, P08AJ2_A798PrvPlaEnt, P08AJ2_n798PrvPlaEnt, P08AJ2_A801PrvRep, P08AJ2_n801PrvRep, P08AJ2_A780PrvBan, P08AJ2_n780PrvBan,
            P08AJ2_A797PrvPer, P08AJ2_n797PrvPer, P08AJ2_A785PrvDiaPag, P08AJ2_n785PrvDiaPag, P08AJ2_A805PrvVto, P08AJ2_n805PrvVto, P08AJ2_A497FpgCod, P08AJ2_n497FpgCod, P08AJ2_A804PrvTlx, P08AJ2_n804PrvTlx,
            P08AJ2_A800PrvPri, P08AJ2_n800PrvPri, P08AJ2_A803PrvTlf, P08AJ2_n803PrvTlf, P08AJ2_A793PrvNif, P08AJ2_n793PrvNif, P08AJ2_A799PrvPob, P08AJ2_n799PrvPob, P08AJ2_A782PrvCpo, P08AJ2_n782PrvCpo,
            P08AJ2_A786PrvDir, P08AJ2_n786PrvDir, P08AJ2_A794PrvNom, P08AJ2_n794PrvNom, P08AJ2_A795PrvNum, P08AJ2_A3092PrvDivCod, P08AJ2_n3092PrvDivCod, P08AJ2_A792PrvMetTra, P08AJ2_n792PrvMetTra, P08AJ2_A802PrvTip,
            P08AJ2_n802PrvTip, P08AJ2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV86TFPrvPri_Sel ;
   private byte AV62TFPrvVto ;
   private byte AV63TFPrvVto_To ;
   private byte AV81TFPrvDivCo ;
   private byte AV82TFPrvDivCo_To ;
   private byte A800PrvPri ;
   private byte A805PrvVto ;
   private byte A3143PrvDivCo ;
   private byte AV116Tprvgenwwds_16_tfprvpri_sel ;
   private byte AV122Tprvgenwwds_22_tfprvvto ;
   private byte AV123Tprvgenwwds_23_tfprvvto_to ;
   private byte AV138Tprvgenwwds_38_tfprvdivco ;
   private byte AV139Tprvgenwwds_39_tfprvdivco_to ;
   private short AV72TFPrvPlaEnt ;
   private short AV73TFPrvPlaEnt_To ;
   private short GXv_int3[] ;
   private short A798PrvPlaEnt ;
   private short AV132Tprvgenwwds_32_tfprvplaent ;
   private short AV133Tprvgenwwds_33_tfprvplaent_to ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV36TFPrvNum ;
   private int AV37TFPrvNum_To ;
   private int AV96GXV1 ;
   private int AV64TFPrvDiaPag ;
   private int AV65TFPrvDiaPag_To ;
   private int AV66TFPrvPer ;
   private int AV67TFPrvPer_To ;
   private int AV68TFPrvBan ;
   private int AV69TFPrvBan_To ;
   private int AV97GXV2 ;
   private int AV98GXV3 ;
   private int AV99GXV4 ;
   private int A795PrvNum ;
   private int A785PrvDiaPag ;
   private int A797PrvPer ;
   private int A780PrvBan ;
   private int AV102Tprvgenwwds_2_tfprvnum ;
   private int AV103Tprvgenwwds_3_tfprvnum_to ;
   private int AV124Tprvgenwwds_24_tfprvdiapag ;
   private int AV125Tprvgenwwds_25_tfprvdiapag_to ;
   private int AV126Tprvgenwwds_26_tfprvper ;
   private int AV127Tprvgenwwds_27_tfprvper_to ;
   private int AV128Tprvgenwwds_28_tfprvban ;
   private int AV129Tprvgenwwds_29_tfprvban_to ;
   private int AV119Tprvgenwwds_19_tfprvtip_sels_size ;
   private int AV134Tprvgenwwds_34_tfprvmettra_sels_size ;
   private int AV137Tprvgenwwds_37_tfprvdivcod_sels_size ;
   private int AV141GXV5 ;
   private long AV85i ;
   private long AV31VisibleColumnCount ;
   private String AV39TFPrvNom_Sel ;
   private String AV38TFPrvNom ;
   private String AV43TFPrvDir_Sel ;
   private String AV42TFPrvDir ;
   private String AV45TFPrvCpo_Sel ;
   private String AV44TFPrvCpo ;
   private String AV47TFPrvPob_Sel ;
   private String AV46TFPrvPob ;
   private String AV49TFPrvNif_Sel ;
   private String AV48TFPrvNif ;
   private String AV51TFPrvTlf_Sel ;
   private String AV50TFPrvTlf ;
   private String AV55TFPrvTlx_Sel ;
   private String AV54TFPrvTlx ;
   private String AV57TFPrvTip_Sel ;
   private String AV59TFFpgCod_Sel ;
   private String AV58TFFpgCod ;
   private String AV71TFPrvRep_Sel ;
   private String AV70TFPrvRep ;
   private String AV75TFPrvMetTra_Sel ;
   private String AV77TFPrvCta_Sel ;
   private String AV76TFPrvCta ;
   private String AV80TFPrvDivCod_Sel ;
   private String AV93TFPrvAct_Sel ;
   private String A794PrvNom ;
   private String A786PrvDir ;
   private String A782PrvCpo ;
   private String A799PrvPob ;
   private String A793PrvNif ;
   private String A803PrvTlf ;
   private String A804PrvTlx ;
   private String A802PrvTip ;
   private String A497FpgCod ;
   private String A801PrvRep ;
   private String A792PrvMetTra ;
   private String A783PrvCta ;
   private String A3092PrvDivCod ;
   private String A14216PrvAct ;
   private String AV104Tprvgenwwds_4_tfprvnom ;
   private String AV105Tprvgenwwds_5_tfprvnom_sel ;
   private String AV106Tprvgenwwds_6_tfprvdir ;
   private String AV107Tprvgenwwds_7_tfprvdir_sel ;
   private String AV108Tprvgenwwds_8_tfprvcpo ;
   private String AV109Tprvgenwwds_9_tfprvcpo_sel ;
   private String AV110Tprvgenwwds_10_tfprvpob ;
   private String AV111Tprvgenwwds_11_tfprvpob_sel ;
   private String AV112Tprvgenwwds_12_tfprvnif ;
   private String AV113Tprvgenwwds_13_tfprvnif_sel ;
   private String AV114Tprvgenwwds_14_tfprvtlf ;
   private String AV115Tprvgenwwds_15_tfprvtlf_sel ;
   private String AV117Tprvgenwwds_17_tfprvtlx ;
   private String AV118Tprvgenwwds_18_tfprvtlx_sel ;
   private String AV120Tprvgenwwds_20_tffpgcod ;
   private String AV121Tprvgenwwds_21_tffpgcod_sel ;
   private String AV130Tprvgenwwds_30_tfprvrep ;
   private String AV131Tprvgenwwds_31_tfprvrep_sel ;
   private String AV135Tprvgenwwds_35_tfprvcta ;
   private String AV136Tprvgenwwds_36_tfprvcta_sel ;
   private String AV140Tprvgenwwds_40_tfprvact_sel ;
   private String scmdbuf ;
   private String lV104Tprvgenwwds_4_tfprvnom ;
   private String lV106Tprvgenwwds_6_tfprvdir ;
   private String lV108Tprvgenwwds_8_tfprvcpo ;
   private String lV110Tprvgenwwds_10_tfprvpob ;
   private String lV112Tprvgenwwds_12_tfprvnif ;
   private String lV114Tprvgenwwds_14_tfprvtlf ;
   private String lV117Tprvgenwwds_17_tfprvtlx ;
   private String lV120Tprvgenwwds_20_tffpgcod ;
   private String lV130Tprvgenwwds_30_tfprvrep ;
   private String lV135Tprvgenwwds_35_tfprvcta ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n783PrvCta ;
   private boolean n798PrvPlaEnt ;
   private boolean n801PrvRep ;
   private boolean n780PrvBan ;
   private boolean n797PrvPer ;
   private boolean n785PrvDiaPag ;
   private boolean n805PrvVto ;
   private boolean n497FpgCod ;
   private boolean n804PrvTlx ;
   private boolean n800PrvPri ;
   private boolean n803PrvTlf ;
   private boolean n793PrvNif ;
   private boolean n799PrvPob ;
   private boolean n782PrvCpo ;
   private boolean n786PrvDir ;
   private boolean n794PrvNom ;
   private boolean n3092PrvDivCod ;
   private boolean n792PrvMetTra ;
   private boolean n802PrvTip ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV87TFPrvTip_SelsJson ;
   private String AV89TFPrvMetTra_SelsJson ;
   private String AV78TFPrvDivCod_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV101Tprvgenwwds_1_filterfulltext ;
   private String lV101Tprvgenwwds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private GXSimpleCollection<String> AV88TFPrvTip_Sels ;
   private GXSimpleCollection<String> AV90TFPrvMetTra_Sels ;
   private GXSimpleCollection<String> AV79TFPrvDivCod_Sels ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P08AJ2_A14216PrvAct ;
   private byte[] P08AJ2_A3143PrvDivCo ;
   private String[] P08AJ2_A783PrvCta ;
   private boolean[] P08AJ2_n783PrvCta ;
   private short[] P08AJ2_A798PrvPlaEnt ;
   private boolean[] P08AJ2_n798PrvPlaEnt ;
   private String[] P08AJ2_A801PrvRep ;
   private boolean[] P08AJ2_n801PrvRep ;
   private int[] P08AJ2_A780PrvBan ;
   private boolean[] P08AJ2_n780PrvBan ;
   private int[] P08AJ2_A797PrvPer ;
   private boolean[] P08AJ2_n797PrvPer ;
   private int[] P08AJ2_A785PrvDiaPag ;
   private boolean[] P08AJ2_n785PrvDiaPag ;
   private byte[] P08AJ2_A805PrvVto ;
   private boolean[] P08AJ2_n805PrvVto ;
   private String[] P08AJ2_A497FpgCod ;
   private boolean[] P08AJ2_n497FpgCod ;
   private String[] P08AJ2_A804PrvTlx ;
   private boolean[] P08AJ2_n804PrvTlx ;
   private byte[] P08AJ2_A800PrvPri ;
   private boolean[] P08AJ2_n800PrvPri ;
   private String[] P08AJ2_A803PrvTlf ;
   private boolean[] P08AJ2_n803PrvTlf ;
   private String[] P08AJ2_A793PrvNif ;
   private boolean[] P08AJ2_n793PrvNif ;
   private String[] P08AJ2_A799PrvPob ;
   private boolean[] P08AJ2_n799PrvPob ;
   private String[] P08AJ2_A782PrvCpo ;
   private boolean[] P08AJ2_n782PrvCpo ;
   private String[] P08AJ2_A786PrvDir ;
   private boolean[] P08AJ2_n786PrvDir ;
   private String[] P08AJ2_A794PrvNom ;
   private boolean[] P08AJ2_n794PrvNom ;
   private int[] P08AJ2_A795PrvNum ;
   private String[] P08AJ2_A3092PrvDivCod ;
   private boolean[] P08AJ2_n3092PrvDivCod ;
   private String[] P08AJ2_A792PrvMetTra ;
   private boolean[] P08AJ2_n792PrvMetTra ;
   private String[] P08AJ2_A802PrvTip ;
   private boolean[] P08AJ2_n802PrvTip ;
   private String[] P08AJ2_A396EmprCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private GXSimpleCollection<String> AV119Tprvgenwwds_19_tfprvtip_sels ;
   private GXSimpleCollection<String> AV134Tprvgenwwds_34_tfprvmettra_sels ;
   private GXSimpleCollection<String> AV137Tprvgenwwds_37_tfprvdivcod_sels ;
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

final  class tprvgenwwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08AJ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A802PrvTip ,
                                          GXSimpleCollection<String> AV119Tprvgenwwds_19_tfprvtip_sels ,
                                          String A792PrvMetTra ,
                                          GXSimpleCollection<String> AV134Tprvgenwwds_34_tfprvmettra_sels ,
                                          String A3092PrvDivCod ,
                                          GXSimpleCollection<String> AV137Tprvgenwwds_37_tfprvdivcod_sels ,
                                          int AV102Tprvgenwwds_2_tfprvnum ,
                                          int AV103Tprvgenwwds_3_tfprvnum_to ,
                                          String AV105Tprvgenwwds_5_tfprvnom_sel ,
                                          String AV104Tprvgenwwds_4_tfprvnom ,
                                          String AV107Tprvgenwwds_7_tfprvdir_sel ,
                                          String AV106Tprvgenwwds_6_tfprvdir ,
                                          String AV109Tprvgenwwds_9_tfprvcpo_sel ,
                                          String AV108Tprvgenwwds_8_tfprvcpo ,
                                          String AV111Tprvgenwwds_11_tfprvpob_sel ,
                                          String AV110Tprvgenwwds_10_tfprvpob ,
                                          String AV113Tprvgenwwds_13_tfprvnif_sel ,
                                          String AV112Tprvgenwwds_12_tfprvnif ,
                                          String AV115Tprvgenwwds_15_tfprvtlf_sel ,
                                          String AV114Tprvgenwwds_14_tfprvtlf ,
                                          byte AV116Tprvgenwwds_16_tfprvpri_sel ,
                                          String AV118Tprvgenwwds_18_tfprvtlx_sel ,
                                          String AV117Tprvgenwwds_17_tfprvtlx ,
                                          int AV119Tprvgenwwds_19_tfprvtip_sels_size ,
                                          String AV121Tprvgenwwds_21_tffpgcod_sel ,
                                          String AV120Tprvgenwwds_20_tffpgcod ,
                                          byte AV122Tprvgenwwds_22_tfprvvto ,
                                          byte AV123Tprvgenwwds_23_tfprvvto_to ,
                                          int AV124Tprvgenwwds_24_tfprvdiapag ,
                                          int AV125Tprvgenwwds_25_tfprvdiapag_to ,
                                          int AV126Tprvgenwwds_26_tfprvper ,
                                          int AV127Tprvgenwwds_27_tfprvper_to ,
                                          int AV128Tprvgenwwds_28_tfprvban ,
                                          int AV129Tprvgenwwds_29_tfprvban_to ,
                                          String AV131Tprvgenwwds_31_tfprvrep_sel ,
                                          String AV130Tprvgenwwds_30_tfprvrep ,
                                          short AV132Tprvgenwwds_32_tfprvplaent ,
                                          short AV133Tprvgenwwds_33_tfprvplaent_to ,
                                          int AV134Tprvgenwwds_34_tfprvmettra_sels_size ,
                                          String AV136Tprvgenwwds_36_tfprvcta_sel ,
                                          String AV135Tprvgenwwds_35_tfprvcta ,
                                          int AV137Tprvgenwwds_37_tfprvdivcod_sels_size ,
                                          byte AV138Tprvgenwwds_38_tfprvdivco ,
                                          byte AV139Tprvgenwwds_39_tfprvdivco_to ,
                                          String AV140Tprvgenwwds_40_tfprvact_sel ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A786PrvDir ,
                                          String A782PrvCpo ,
                                          String A799PrvPob ,
                                          String A793PrvNif ,
                                          String A803PrvTlf ,
                                          byte A800PrvPri ,
                                          String A804PrvTlx ,
                                          String A497FpgCod ,
                                          byte A805PrvVto ,
                                          int A785PrvDiaPag ,
                                          int A797PrvPer ,
                                          int A780PrvBan ,
                                          String A801PrvRep ,
                                          short A798PrvPlaEnt ,
                                          String A783PrvCta ,
                                          byte A3143PrvDivCo ,
                                          String A14216PrvAct ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV101Tprvgenwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[35];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT PrvAct, PrvDivCo, PrvCta, PrvPlaEnt, PrvRep, PrvBan, PrvPer, PrvDiaPag, PrvVto, FpgCod, PrvTlx, PrvPri, PrvTlf, PrvNif, PrvPob, PrvCpo, PrvDir, PrvNom, PrvNum," ;
      scmdbuf += " PrvDivCod, PrvMetTra, PrvTip, EmprCod FROM TXPPRVGEN" ;
      if ( ! (0==AV102Tprvgenwwds_2_tfprvnum) )
      {
         addWhere(sWhereString, "(PrvNum >= ?)");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! (0==AV103Tprvgenwwds_3_tfprvnum_to) )
      {
         addWhere(sWhereString, "(PrvNum <= ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tprvgenwwds_5_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV104Tprvgenwwds_4_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tprvgenwwds_5_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrvNom = ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tprvgenwwds_7_tfprvdir_sel)==0) && ( ! (GXutil.strcmp("", AV106Tprvgenwwds_6_tfprvdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tprvgenwwds_7_tfprvdir_sel)==0) )
      {
         addWhere(sWhereString, "(PrvDir = ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Tprvgenwwds_9_tfprvcpo_sel)==0) && ( ! (GXutil.strcmp("", AV108Tprvgenwwds_8_tfprvcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Tprvgenwwds_9_tfprvcpo_sel)==0) )
      {
         addWhere(sWhereString, "(PrvCpo = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Tprvgenwwds_11_tfprvpob_sel)==0) && ( ! (GXutil.strcmp("", AV110Tprvgenwwds_10_tfprvpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Tprvgenwwds_11_tfprvpob_sel)==0) )
      {
         addWhere(sWhereString, "(PrvPob = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Tprvgenwwds_13_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV112Tprvgenwwds_12_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Tprvgenwwds_13_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(PrvNif = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Tprvgenwwds_15_tfprvtlf_sel)==0) && ( ! (GXutil.strcmp("", AV114Tprvgenwwds_14_tfprvtlf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvTlf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Tprvgenwwds_15_tfprvtlf_sel)==0) )
      {
         addWhere(sWhereString, "(PrvTlf = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( AV116Tprvgenwwds_16_tfprvpri_sel == 1 )
      {
         addWhere(sWhereString, "(PrvPri = 1)");
      }
      if ( AV116Tprvgenwwds_16_tfprvpri_sel == 2 )
      {
         addWhere(sWhereString, "(PrvPri = 0)");
      }
      if ( (GXutil.strcmp("", AV118Tprvgenwwds_18_tfprvtlx_sel)==0) && ( ! (GXutil.strcmp("", AV117Tprvgenwwds_17_tfprvtlx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvTlx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Tprvgenwwds_18_tfprvtlx_sel)==0) )
      {
         addWhere(sWhereString, "(PrvTlx = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( AV119Tprvgenwwds_19_tfprvtip_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV119Tprvgenwwds_19_tfprvtip_sels, "PrvTip IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV121Tprvgenwwds_21_tffpgcod_sel)==0) && ( ! (GXutil.strcmp("", AV120Tprvgenwwds_20_tffpgcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FpgCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Tprvgenwwds_21_tffpgcod_sel)==0) )
      {
         addWhere(sWhereString, "(FpgCod = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (0==AV122Tprvgenwwds_22_tfprvvto) )
      {
         addWhere(sWhereString, "(PrvVto >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV123Tprvgenwwds_23_tfprvvto_to) )
      {
         addWhere(sWhereString, "(PrvVto <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV124Tprvgenwwds_24_tfprvdiapag) )
      {
         addWhere(sWhereString, "(PrvDiaPag >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV125Tprvgenwwds_25_tfprvdiapag_to) )
      {
         addWhere(sWhereString, "(PrvDiaPag <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV126Tprvgenwwds_26_tfprvper) )
      {
         addWhere(sWhereString, "(PrvPer >= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV127Tprvgenwwds_27_tfprvper_to) )
      {
         addWhere(sWhereString, "(PrvPer <= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV128Tprvgenwwds_28_tfprvban) )
      {
         addWhere(sWhereString, "(PrvBan >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV129Tprvgenwwds_29_tfprvban_to) )
      {
         addWhere(sWhereString, "(PrvBan <= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Tprvgenwwds_31_tfprvrep_sel)==0) && ( ! (GXutil.strcmp("", AV130Tprvgenwwds_30_tfprvrep)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvRep) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Tprvgenwwds_31_tfprvrep_sel)==0) )
      {
         addWhere(sWhereString, "(PrvRep = ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (0==AV132Tprvgenwwds_32_tfprvplaent) )
      {
         addWhere(sWhereString, "(PrvPlaEnt >= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (0==AV133Tprvgenwwds_33_tfprvplaent_to) )
      {
         addWhere(sWhereString, "(PrvPlaEnt <= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( AV134Tprvgenwwds_34_tfprvmettra_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV134Tprvgenwwds_34_tfprvmettra_sels, "PrvMetTra IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV136Tprvgenwwds_36_tfprvcta_sel)==0) && ( ! (GXutil.strcmp("", AV135Tprvgenwwds_35_tfprvcta)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvCta) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136Tprvgenwwds_36_tfprvcta_sel)==0) )
      {
         addWhere(sWhereString, "(PrvCta = ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( AV137Tprvgenwwds_37_tfprvdivcod_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV137Tprvgenwwds_37_tfprvdivcod_sels, "PrvDivCod IN (", ")")+")");
      }
      if ( ! (0==AV138Tprvgenwwds_38_tfprvdivco) )
      {
         addWhere(sWhereString, "(PrvDivCo >= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (0==AV139Tprvgenwwds_39_tfprvdivco_to) )
      {
         addWhere(sWhereString, "(PrvDivCo <= ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV140Tprvgenwwds_40_tfprvact_sel)==0) )
      {
         addWhere(sWhereString, "(PrvAct = ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvNom" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvNum" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvDir" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvDir DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvCpo" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvCpo DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvPob" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvPob DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvNif" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvNif DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvTlf" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvTlf DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvPri" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvPri DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvTlx" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvTlx DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvTip" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvTip DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY FpgCod" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY FpgCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvVto" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvVto DESC" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvDiaPag" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvDiaPag DESC" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvPer" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvPer DESC" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvBan" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvBan DESC" ;
      }
      else if ( ( AV16OrderedBy == 16 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvRep" ;
      }
      else if ( ( AV16OrderedBy == 16 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvRep DESC" ;
      }
      else if ( ( AV16OrderedBy == 17 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvPlaEnt" ;
      }
      else if ( ( AV16OrderedBy == 17 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvPlaEnt DESC" ;
      }
      else if ( ( AV16OrderedBy == 18 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvMetTra" ;
      }
      else if ( ( AV16OrderedBy == 18 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvMetTra DESC" ;
      }
      else if ( ( AV16OrderedBy == 19 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvCta" ;
      }
      else if ( ( AV16OrderedBy == 19 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvCta DESC" ;
      }
      else if ( ( AV16OrderedBy == 20 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvDivCod" ;
      }
      else if ( ( AV16OrderedBy == 20 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvDivCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 21 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvDivCo" ;
      }
      else if ( ( AV16OrderedBy == 21 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvDivCo DESC" ;
      }
      else if ( ( AV16OrderedBy == 22 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvAct" ;
      }
      else if ( ( AV16OrderedBy == 22 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvAct DESC" ;
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
                  return conditional_P08AJ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).byteValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).byteValue() , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).intValue() , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , ((Number) dynConstraints[64]).shortValue() , ((Boolean) dynConstraints[65]).booleanValue() , (String)dynConstraints[66] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08AJ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(10, 2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 14);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((byte[]) buf[20])[0] = rslt.getByte(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 18);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 20);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((int[]) buf[34])[0] = rslt.getInt(19);
               ((String[]) buf[35])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(23, 3);
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
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 18);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 18);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 14);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 14);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 12);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 12);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[67]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               return;
      }
   }

}

