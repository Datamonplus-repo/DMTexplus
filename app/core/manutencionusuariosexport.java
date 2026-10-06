package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class manutencionusuariosexport extends GXProcedure
{
   public manutencionusuariosexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( manutencionusuariosexport.class ), "" );
   }

   public manutencionusuariosexport( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      manutencionusuariosexport.this.aP1 = new String[] {""};
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
      manutencionusuariosexport.this.aP0 = aP0;
      manutencionusuariosexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "ManutencionUsuariosExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      manutencionusuariosexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      manutencionusuariosexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV35TFUsurNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         manutencionusuariosexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV35TFUsurNom_Sel, GXv_char5) ;
         manutencionusuariosexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV34TFUsurNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            manutencionusuariosexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV34TFUsurNom, GXv_char5) ;
            manutencionusuariosexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV38TFUsuMail_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "E-Mail", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         manutencionusuariosexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFUsuMail_Sel, GXv_char5) ;
         manutencionusuariosexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV37TFUsuMail)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "E-Mail", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            manutencionusuariosexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFUsuMail, GXv_char5) ;
            manutencionusuariosexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV40TFUsurPrint_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Printer", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         manutencionusuariosexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFUsurPrint_Sel, GXv_char5) ;
         manutencionusuariosexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV39TFUsurPrint)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Printer", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            manutencionusuariosexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFUsurPrint, GXv_char5) ;
            manutencionusuariosexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV43TFUsurSockt_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Sockt", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         manutencionusuariosexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFUsurSockt_Sel, GXv_char5) ;
         manutencionusuariosexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV42TFUsurSockt)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Sockt", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            manutencionusuariosexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFUsurSockt, GXv_char5) ;
            manutencionusuariosexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("Core.ManutencionUsuariosColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("Core.ManutencionUsuariosColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV46GXV1 = 1 ;
      while ( AV46GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV46GXV1));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV46GXV1 = (int)(AV46GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV48Core_manutencionusuariosds_1_filterfulltext = AV18FilterFullText ;
      AV49Core_manutencionusuariosds_2_tfusurnom = AV34TFUsurNom ;
      AV50Core_manutencionusuariosds_3_tfusurnom_sel = AV35TFUsurNom_Sel ;
      AV51Core_manutencionusuariosds_4_tfusumail = AV37TFUsuMail ;
      AV52Core_manutencionusuariosds_5_tfusumail_sel = AV38TFUsuMail_Sel ;
      AV53Core_manutencionusuariosds_6_tfusurprint = AV39TFUsurPrint ;
      AV54Core_manutencionusuariosds_7_tfusurprint_sel = AV40TFUsurPrint_Sel ;
      AV55Core_manutencionusuariosds_8_tfusursockt = AV42TFUsurSockt ;
      AV56Core_manutencionusuariosds_9_tfusursockt_sel = AV43TFUsurSockt_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV48Core_manutencionusuariosds_1_filterfulltext ,
                                           AV50Core_manutencionusuariosds_3_tfusurnom_sel ,
                                           AV49Core_manutencionusuariosds_2_tfusurnom ,
                                           AV52Core_manutencionusuariosds_5_tfusumail_sel ,
                                           AV51Core_manutencionusuariosds_4_tfusumail ,
                                           AV54Core_manutencionusuariosds_7_tfusurprint_sel ,
                                           AV53Core_manutencionusuariosds_6_tfusurprint ,
                                           AV56Core_manutencionusuariosds_9_tfusursockt_sel ,
                                           AV55Core_manutencionusuariosds_8_tfusursockt ,
                                           A854UsurNom ,
                                           A10513UsuMail ,
                                           A14415UsurPrint ,
                                           A14487UsurSockt ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV48Core_manutencionusuariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV48Core_manutencionusuariosds_1_filterfulltext), "%", "") ;
      lV48Core_manutencionusuariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV48Core_manutencionusuariosds_1_filterfulltext), "%", "") ;
      lV48Core_manutencionusuariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV48Core_manutencionusuariosds_1_filterfulltext), "%", "") ;
      lV48Core_manutencionusuariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV48Core_manutencionusuariosds_1_filterfulltext), "%", "") ;
      lV49Core_manutencionusuariosds_2_tfusurnom = GXutil.padr( GXutil.rtrim( AV49Core_manutencionusuariosds_2_tfusurnom), 35, "%") ;
      lV51Core_manutencionusuariosds_4_tfusumail = GXutil.padr( GXutil.rtrim( AV51Core_manutencionusuariosds_4_tfusumail), 40, "%") ;
      lV53Core_manutencionusuariosds_6_tfusurprint = GXutil.concat( GXutil.rtrim( AV53Core_manutencionusuariosds_6_tfusurprint), "%", "") ;
      lV55Core_manutencionusuariosds_8_tfusursockt = GXutil.concat( GXutil.rtrim( AV55Core_manutencionusuariosds_8_tfusursockt), "%", "") ;
      /* Using cursor P0ANA2 */
      pr_default.execute(0, new Object[] {lV48Core_manutencionusuariosds_1_filterfulltext, lV48Core_manutencionusuariosds_1_filterfulltext, lV48Core_manutencionusuariosds_1_filterfulltext, lV48Core_manutencionusuariosds_1_filterfulltext, lV49Core_manutencionusuariosds_2_tfusurnom, AV50Core_manutencionusuariosds_3_tfusurnom_sel, lV51Core_manutencionusuariosds_4_tfusumail, AV52Core_manutencionusuariosds_5_tfusumail_sel, lV53Core_manutencionusuariosds_6_tfusurprint, AV54Core_manutencionusuariosds_7_tfusurprint_sel, lV55Core_manutencionusuariosds_8_tfusursockt, AV56Core_manutencionusuariosds_9_tfusursockt_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14487UsurSockt = P0ANA2_A14487UsurSockt[0] ;
         n14487UsurSockt = P0ANA2_n14487UsurSockt[0] ;
         A14415UsurPrint = P0ANA2_A14415UsurPrint[0] ;
         n14415UsurPrint = P0ANA2_n14415UsurPrint[0] ;
         A10513UsuMail = P0ANA2_A10513UsuMail[0] ;
         A854UsurNom = P0ANA2_A854UsurNom[0] ;
         n854UsurNom = P0ANA2_n854UsurNom[0] ;
         A14371UsurGuid = P0ANA2_A14371UsurGuid[0] ;
         n14371UsurGuid = P0ANA2_n14371UsurGuid[0] ;
         A850UsurCod = P0ANA2_A850UsurCod[0] ;
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
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( A14371UsurGuid.toString() );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A854UsurNom, GXv_char5) ;
            manutencionusuariosexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A10513UsuMail, GXv_char5) ;
            manutencionusuariosexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14415UsurPrint, GXv_char5) ;
            manutencionusuariosexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14487UsurSockt, GXv_char5) ;
            manutencionusuariosexport.this.GXt_char4 = GXv_char5[0] ;
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "UsurGuid", "", "UUID", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "UsurNom", "", "Nombre", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "UsuMail", "", "E-Mail", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "UsurPrint", "", "Printer", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "UsurSockt", "", "Sockt", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Core.ManutencionUsuariosColumnsSelector", GXv_char5) ;
      manutencionusuariosexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("Core.ManutencionUsuariosGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Core.ManutencionUsuariosGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("Core.ManutencionUsuariosGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV57GXV2 = 1 ;
      while ( AV57GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV57GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFUSURNOM") == 0 )
         {
            AV34TFUsurNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFUSURNOM_SEL") == 0 )
         {
            AV35TFUsurNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFUSUMAIL") == 0 )
         {
            AV37TFUsuMail = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFUSUMAIL_SEL") == 0 )
         {
            AV38TFUsuMail_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFUSURPRINT") == 0 )
         {
            AV39TFUsurPrint = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFUSURPRINT_SEL") == 0 )
         {
            AV40TFUsurPrint_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFUSURSOCKT") == 0 )
         {
            AV42TFUsurSockt = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFUSURSOCKT_SEL") == 0 )
         {
            AV43TFUsurSockt_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV57GXV2 = (int)(AV57GXV2+1) ;
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
      this.aP0[0] = manutencionusuariosexport.this.AV11Filename;
      this.aP1[0] = manutencionusuariosexport.this.AV12ErrorMessage;
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
      AV35TFUsurNom_Sel = "" ;
      AV34TFUsurNom = "" ;
      AV38TFUsuMail_Sel = "" ;
      AV37TFUsuMail = "" ;
      AV40TFUsurPrint_Sel = "" ;
      AV39TFUsurPrint = "" ;
      AV43TFUsurSockt_Sel = "" ;
      AV42TFUsurSockt = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A14371UsurGuid = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      A854UsurNom = "" ;
      A10513UsuMail = "" ;
      A14415UsurPrint = "" ;
      A14487UsurSockt = "" ;
      AV48Core_manutencionusuariosds_1_filterfulltext = "" ;
      AV49Core_manutencionusuariosds_2_tfusurnom = "" ;
      AV50Core_manutencionusuariosds_3_tfusurnom_sel = "" ;
      AV51Core_manutencionusuariosds_4_tfusumail = "" ;
      AV52Core_manutencionusuariosds_5_tfusumail_sel = "" ;
      AV53Core_manutencionusuariosds_6_tfusurprint = "" ;
      AV54Core_manutencionusuariosds_7_tfusurprint_sel = "" ;
      AV55Core_manutencionusuariosds_8_tfusursockt = "" ;
      AV56Core_manutencionusuariosds_9_tfusursockt_sel = "" ;
      scmdbuf = "" ;
      lV48Core_manutencionusuariosds_1_filterfulltext = "" ;
      lV49Core_manutencionusuariosds_2_tfusurnom = "" ;
      lV51Core_manutencionusuariosds_4_tfusumail = "" ;
      lV53Core_manutencionusuariosds_6_tfusurprint = "" ;
      lV55Core_manutencionusuariosds_8_tfusursockt = "" ;
      P0ANA2_A14487UsurSockt = new String[] {""} ;
      P0ANA2_n14487UsurSockt = new boolean[] {false} ;
      P0ANA2_A14415UsurPrint = new String[] {""} ;
      P0ANA2_n14415UsurPrint = new boolean[] {false} ;
      P0ANA2_A10513UsuMail = new String[] {""} ;
      P0ANA2_A854UsurNom = new String[] {""} ;
      P0ANA2_n854UsurNom = new boolean[] {false} ;
      P0ANA2_A14371UsurGuid = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      P0ANA2_n14371UsurGuid = new boolean[] {false} ;
      P0ANA2_A850UsurCod = new String[] {""} ;
      A850UsurCod = "" ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.core.manutencionusuariosexport__default(),
         new Object[] {
             new Object[] {
            P0ANA2_A14487UsurSockt, P0ANA2_n14487UsurSockt, P0ANA2_A14415UsurPrint, P0ANA2_n14415UsurPrint, P0ANA2_A10513UsuMail, P0ANA2_A854UsurNom, P0ANA2_n854UsurNom, P0ANA2_A14371UsurGuid, P0ANA2_n14371UsurGuid, P0ANA2_A850UsurCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV46GXV1 ;
   private int AV57GXV2 ;
   private long AV31VisibleColumnCount ;
   private String AV35TFUsurNom_Sel ;
   private String AV34TFUsurNom ;
   private String AV38TFUsuMail_Sel ;
   private String AV37TFUsuMail ;
   private String A854UsurNom ;
   private String A10513UsuMail ;
   private String AV49Core_manutencionusuariosds_2_tfusurnom ;
   private String AV50Core_manutencionusuariosds_3_tfusurnom_sel ;
   private String AV51Core_manutencionusuariosds_4_tfusumail ;
   private String AV52Core_manutencionusuariosds_5_tfusumail_sel ;
   private String scmdbuf ;
   private String lV49Core_manutencionusuariosds_2_tfusurnom ;
   private String lV51Core_manutencionusuariosds_4_tfusumail ;
   private String A850UsurCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n14487UsurSockt ;
   private boolean n14415UsurPrint ;
   private boolean n854UsurNom ;
   private boolean n14371UsurGuid ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV40TFUsurPrint_Sel ;
   private String AV39TFUsurPrint ;
   private String AV43TFUsurSockt_Sel ;
   private String AV42TFUsurSockt ;
   private String A14415UsurPrint ;
   private String A14487UsurSockt ;
   private String AV48Core_manutencionusuariosds_1_filterfulltext ;
   private String AV53Core_manutencionusuariosds_6_tfusurprint ;
   private String AV54Core_manutencionusuariosds_7_tfusurprint_sel ;
   private String AV55Core_manutencionusuariosds_8_tfusursockt ;
   private String AV56Core_manutencionusuariosds_9_tfusursockt_sel ;
   private String lV48Core_manutencionusuariosds_1_filterfulltext ;
   private String lV53Core_manutencionusuariosds_6_tfusurprint ;
   private String lV55Core_manutencionusuariosds_8_tfusursockt ;
   private java.util.UUID A14371UsurGuid ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ANA2_A14487UsurSockt ;
   private boolean[] P0ANA2_n14487UsurSockt ;
   private String[] P0ANA2_A14415UsurPrint ;
   private boolean[] P0ANA2_n14415UsurPrint ;
   private String[] P0ANA2_A10513UsuMail ;
   private String[] P0ANA2_A854UsurNom ;
   private boolean[] P0ANA2_n854UsurNom ;
   private java.util.UUID[] P0ANA2_A14371UsurGuid ;
   private boolean[] P0ANA2_n14371UsurGuid ;
   private String[] P0ANA2_A850UsurCod ;
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

final  class manutencionusuariosexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0ANA2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV48Core_manutencionusuariosds_1_filterfulltext ,
                                          String AV50Core_manutencionusuariosds_3_tfusurnom_sel ,
                                          String AV49Core_manutencionusuariosds_2_tfusurnom ,
                                          String AV52Core_manutencionusuariosds_5_tfusumail_sel ,
                                          String AV51Core_manutencionusuariosds_4_tfusumail ,
                                          String AV54Core_manutencionusuariosds_7_tfusurprint_sel ,
                                          String AV53Core_manutencionusuariosds_6_tfusurprint ,
                                          String AV56Core_manutencionusuariosds_9_tfusursockt_sel ,
                                          String AV55Core_manutencionusuariosds_8_tfusursockt ,
                                          String A854UsurNom ,
                                          String A10513UsuMail ,
                                          String A14415UsurPrint ,
                                          String A14487UsurSockt ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[12];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT UsurSockt, UsurPrint, UsuMail, UsurNom, UsurGuid, UsurCod FROM TXPUSUARI" ;
      if ( ! (GXutil.strcmp("", AV48Core_manutencionusuariosds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(UsurNom) like '%' || UPPER(?)) or ( UPPER(UsuMail) like '%' || UPPER(?)) or ( UPPER(UsurPrint) like '%' || UPPER(?)) or ( UPPER(UsurSockt) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
         GXv_int8[1] = (byte)(1) ;
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50Core_manutencionusuariosds_3_tfusurnom_sel)==0) && ( ! (GXutil.strcmp("", AV49Core_manutencionusuariosds_2_tfusurnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(UsurNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50Core_manutencionusuariosds_3_tfusurnom_sel)==0) )
      {
         addWhere(sWhereString, "(UsurNom = ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Core_manutencionusuariosds_5_tfusumail_sel)==0) && ( ! (GXutil.strcmp("", AV51Core_manutencionusuariosds_4_tfusumail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(UsuMail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Core_manutencionusuariosds_5_tfusumail_sel)==0) )
      {
         addWhere(sWhereString, "(UsuMail = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Core_manutencionusuariosds_7_tfusurprint_sel)==0) && ( ! (GXutil.strcmp("", AV53Core_manutencionusuariosds_6_tfusurprint)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(UsurPrint) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Core_manutencionusuariosds_7_tfusurprint_sel)==0) )
      {
         addWhere(sWhereString, "(UsurPrint = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Core_manutencionusuariosds_9_tfusursockt_sel)==0) && ( ! (GXutil.strcmp("", AV55Core_manutencionusuariosds_8_tfusursockt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(UsurSockt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Core_manutencionusuariosds_9_tfusursockt_sel)==0) )
      {
         addWhere(sWhereString, "(UsurSockt = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY UsurNom" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY UsurNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY UsurGuid" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY UsurGuid DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY UsuMail" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY UsuMail DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY UsurPrint" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY UsurPrint DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY UsurSockt" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY UsurSockt DESC" ;
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
                  return conditional_P0ANA2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Boolean) dynConstraints[14]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ANA2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 40);
               ((String[]) buf[5])[0] = rslt.getString(4, 35);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.UUID[]) buf[7])[0] = rslt.getGUID(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 8);
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
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 35);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 35);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 40);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 40);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 150);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 150);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               return;
      }
   }

}

