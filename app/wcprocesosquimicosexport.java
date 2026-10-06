package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcprocesosquimicosexport extends GXProcedure
{
   public wcprocesosquimicosexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcprocesosquimicosexport.class ), "" );
   }

   public wcprocesosquimicosexport( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      wcprocesosquimicosexport.this.aP1 = new String[] {""};
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
      wcprocesosquimicosexport.this.aP0 = aP0;
      wcprocesosquimicosexport.this.aP1 = aP1;
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
      S191 ();
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
      S151 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S181 ();
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
      AV11Filename = "./PrivateTempStorage/" + "WCProcesosQuimicosExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      if ( ! ( (0==AV35TFHreLinPro) && (0==AV36TFHreLinPro_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), "#") ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcprocesosquimicosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV35TFHreLinPro );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcprocesosquimicosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV36TFHreLinPro_To );
      }
      if ( ! ( (GXutil.strcmp("", AV38TFHreProCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Proceso", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcprocesosquimicosexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFHreProCod_Sel, GXv_char5) ;
         wcprocesosquimicosexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV37TFHreProCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Proceso", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcprocesosquimicosexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFHreProCod, GXv_char5) ;
            wcprocesosquimicosexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV40TFHreProDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcprocesosquimicosexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFHreProDsc_Sel, GXv_char5) ;
         wcprocesosquimicosexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV39TFHreProDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcprocesosquimicosexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFHreProDsc, GXv_char5) ;
            wcprocesosquimicosexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV41TFHreProTie) && (0==AV42TFHreProTie_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tiempo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcprocesosquimicosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV41TFHreProTie );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcprocesosquimicosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV42TFHreProTie_To );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setText( "#" );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "Proceso", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setText( httpContext.getMessage( "Tiempo", "") );
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV61Wcprocesosquimicosds_1_tfhrelinpro = AV35TFHreLinPro ;
      AV62Wcprocesosquimicosds_2_tfhrelinpro_to = AV36TFHreLinPro_To ;
      AV63Wcprocesosquimicosds_3_tfhreprocod = AV37TFHreProCod ;
      AV64Wcprocesosquimicosds_4_tfhreprocod_sel = AV38TFHreProCod_Sel ;
      AV65Wcprocesosquimicosds_5_tfhreprodsc = AV39TFHreProDsc ;
      AV66Wcprocesosquimicosds_6_tfhreprodsc_sel = AV40TFHreProDsc_Sel ;
      AV67Wcprocesosquimicosds_7_tfhreprotie = AV41TFHreProTie ;
      AV68Wcprocesosquimicosds_8_tfhreprotie_to = AV42TFHreProTie_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(AV61Wcprocesosquimicosds_1_tfhrelinpro) ,
                                           Byte.valueOf(AV62Wcprocesosquimicosds_2_tfhrelinpro_to) ,
                                           AV64Wcprocesosquimicosds_4_tfhreprocod_sel ,
                                           AV63Wcprocesosquimicosds_3_tfhreprocod ,
                                           AV66Wcprocesosquimicosds_6_tfhreprodsc_sel ,
                                           AV65Wcprocesosquimicosds_5_tfhreprodsc ,
                                           Short.valueOf(AV67Wcprocesosquimicosds_7_tfhreprotie) ,
                                           Short.valueOf(AV68Wcprocesosquimicosds_8_tfhreprotie_to) ,
                                           Byte.valueOf(A4550HreLinPro) ,
                                           A4551HreProCod ,
                                           A4552HreProDsc ,
                                           Short.valueOf(A4553HreProTie) ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV44EmprCod ,
                                           Integer.valueOf(AV45HreBarCod) ,
                                           Byte.valueOf(AV46HreBarReo) ,
                                           AV47HreBarPar ,
                                           Byte.valueOf(AV48HreNumCie) ,
                                           Short.valueOf(AV49HreLinMaq) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           A4494HreBarPar ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Short.valueOf(A4545HreLinMaq) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT
                                           }
      });
      lV63Wcprocesosquimicosds_3_tfhreprocod = GXutil.padr( GXutil.rtrim( AV63Wcprocesosquimicosds_3_tfhreprocod), 6, "%") ;
      lV65Wcprocesosquimicosds_5_tfhreprodsc = GXutil.padr( GXutil.rtrim( AV65Wcprocesosquimicosds_5_tfhreprodsc), 30, "%") ;
      /* Using cursor P08Z22 */
      pr_default.execute(0, new Object[] {AV44EmprCod, Integer.valueOf(AV45HreBarCod), Byte.valueOf(AV46HreBarReo), AV47HreBarPar, Byte.valueOf(AV48HreNumCie), Short.valueOf(AV49HreLinMaq), Byte.valueOf(AV61Wcprocesosquimicosds_1_tfhrelinpro), Byte.valueOf(AV62Wcprocesosquimicosds_2_tfhrelinpro_to), lV63Wcprocesosquimicosds_3_tfhreprocod, AV64Wcprocesosquimicosds_4_tfhreprocod_sel, lV65Wcprocesosquimicosds_5_tfhreprodsc, AV66Wcprocesosquimicosds_6_tfhreprodsc_sel, Short.valueOf(AV67Wcprocesosquimicosds_7_tfhreprotie), Short.valueOf(AV68Wcprocesosquimicosds_8_tfhreprotie_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4545HreLinMaq = P08Z22_A4545HreLinMaq[0] ;
         A4495HreNumCie = P08Z22_A4495HreNumCie[0] ;
         A4494HreBarPar = P08Z22_A4494HreBarPar[0] ;
         A4493HreBarReo = P08Z22_A4493HreBarReo[0] ;
         A4492HreBarCod = P08Z22_A4492HreBarCod[0] ;
         A396EmprCod = P08Z22_A396EmprCod[0] ;
         A4553HreProTie = P08Z22_A4553HreProTie[0] ;
         A4552HreProDsc = P08Z22_A4552HreProDsc[0] ;
         A4551HreProCod = P08Z22_A4551HreProCod[0] ;
         A4550HreLinPro = P08Z22_A4550HreLinPro[0] ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S162 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setNumber( A4550HreLinPro );
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4551HreProCod, GXv_char5) ;
         wcprocesosquimicosexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4552HreProDsc, GXv_char5) ;
         wcprocesosquimicosexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setText( GXt_char4 );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( A4553HreProTie );
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S172 ();
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

   public void S181( )
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

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("WCProcesosQuimicosGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCProcesosQuimicosGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("WCProcesosQuimicosGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV69GXV1 = 1 ;
      while ( AV69GXV1 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV69GXV1));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELINPRO") == 0 )
         {
            AV35TFHreLinPro = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV36TFHreLinPro_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPROCOD") == 0 )
         {
            AV37TFHreProCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPROCOD_SEL") == 0 )
         {
            AV38TFHreProCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRODSC") == 0 )
         {
            AV39TFHreProDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRODSC_SEL") == 0 )
         {
            AV40TFHreProDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPROTIE") == 0 )
         {
            AV41TFHreProTie = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV42TFHreProTie_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV44EmprCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARCOD") == 0 )
         {
            AV45HreBarCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARREO") == 0 )
         {
            AV46HreBarReo = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARPAR") == 0 )
         {
            AV47HreBarPar = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRENUMCIE") == 0 )
         {
            AV48HreNumCie = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRELINMAQ") == 0 )
         {
            AV49HreLinMaq = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV69GXV1 = (int)(AV69GXV1+1) ;
      }
   }

   public void S162( )
   {
      /* 'BEFOREWRITELINE' Routine */
      returnInSub = false ;
   }

   public void S172( )
   {
      /* 'AFTERWRITELINE' Routine */
      returnInSub = false ;
   }

   protected void cleanup( )
   {
      this.aP0[0] = wcprocesosquimicosexport.this.AV11Filename;
      this.aP1[0] = wcprocesosquimicosexport.this.AV12ErrorMessage;
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
      AV38TFHreProCod_Sel = "" ;
      AV37TFHreProCod = "" ;
      AV40TFHreProDsc_Sel = "" ;
      AV39TFHreProDsc = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      A4551HreProCod = "" ;
      A4552HreProDsc = "" ;
      AV63Wcprocesosquimicosds_3_tfhreprocod = "" ;
      AV64Wcprocesosquimicosds_4_tfhreprocod_sel = "" ;
      AV65Wcprocesosquimicosds_5_tfhreprodsc = "" ;
      AV66Wcprocesosquimicosds_6_tfhreprodsc_sel = "" ;
      scmdbuf = "" ;
      lV63Wcprocesosquimicosds_3_tfhreprocod = "" ;
      lV65Wcprocesosquimicosds_5_tfhreprodsc = "" ;
      AV44EmprCod = "" ;
      AV47HreBarPar = "" ;
      A396EmprCod = "" ;
      A4494HreBarPar = "" ;
      P08Z22_A4545HreLinMaq = new short[1] ;
      P08Z22_A4495HreNumCie = new byte[1] ;
      P08Z22_A4494HreBarPar = new String[] {""} ;
      P08Z22_A4493HreBarReo = new byte[1] ;
      P08Z22_A4492HreBarCod = new int[1] ;
      P08Z22_A396EmprCod = new String[] {""} ;
      P08Z22_A4553HreProTie = new short[1] ;
      P08Z22_A4552HreProDsc = new String[] {""} ;
      P08Z22_A4551HreProCod = new String[] {""} ;
      P08Z22_A4550HreLinPro = new byte[1] ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV19Session = httpContext.getWebSession();
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcprocesosquimicosexport__default(),
         new Object[] {
             new Object[] {
            P08Z22_A4545HreLinMaq, P08Z22_A4495HreNumCie, P08Z22_A4494HreBarPar, P08Z22_A4493HreBarReo, P08Z22_A4492HreBarCod, P08Z22_A396EmprCod, P08Z22_A4553HreProTie, P08Z22_A4552HreProDsc, P08Z22_A4551HreProCod, P08Z22_A4550HreLinPro
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV35TFHreLinPro ;
   private byte AV36TFHreLinPro_To ;
   private byte A4550HreLinPro ;
   private byte AV61Wcprocesosquimicosds_1_tfhrelinpro ;
   private byte AV62Wcprocesosquimicosds_2_tfhrelinpro_to ;
   private byte AV46HreBarReo ;
   private byte AV48HreNumCie ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private short AV41TFHreProTie ;
   private short AV42TFHreProTie_To ;
   private short GXv_int3[] ;
   private short A4553HreProTie ;
   private short AV67Wcprocesosquimicosds_7_tfhreprotie ;
   private short AV68Wcprocesosquimicosds_8_tfhreprotie_to ;
   private short AV16OrderedBy ;
   private short AV49HreLinMaq ;
   private short A4545HreLinMaq ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV45HreBarCod ;
   private int A4492HreBarCod ;
   private int AV69GXV1 ;
   private String AV38TFHreProCod_Sel ;
   private String AV37TFHreProCod ;
   private String AV40TFHreProDsc_Sel ;
   private String AV39TFHreProDsc ;
   private String A4551HreProCod ;
   private String A4552HreProDsc ;
   private String AV63Wcprocesosquimicosds_3_tfhreprocod ;
   private String AV64Wcprocesosquimicosds_4_tfhreprocod_sel ;
   private String AV65Wcprocesosquimicosds_5_tfhreprodsc ;
   private String AV66Wcprocesosquimicosds_6_tfhreprodsc_sel ;
   private String scmdbuf ;
   private String lV63Wcprocesosquimicosds_3_tfhreprocod ;
   private String lV65Wcprocesosquimicosds_5_tfhreprodsc ;
   private String AV44EmprCod ;
   private String AV47HreBarPar ;
   private String A396EmprCod ;
   private String A4494HreBarPar ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private short[] P08Z22_A4545HreLinMaq ;
   private byte[] P08Z22_A4495HreNumCie ;
   private String[] P08Z22_A4494HreBarPar ;
   private byte[] P08Z22_A4493HreBarReo ;
   private int[] P08Z22_A4492HreBarCod ;
   private String[] P08Z22_A396EmprCod ;
   private short[] P08Z22_A4553HreProTie ;
   private String[] P08Z22_A4552HreProDsc ;
   private String[] P08Z22_A4551HreProCod ;
   private byte[] P08Z22_A4550HreLinPro ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
}

final  class wcprocesosquimicosexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08Z22( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV61Wcprocesosquimicosds_1_tfhrelinpro ,
                                          byte AV62Wcprocesosquimicosds_2_tfhrelinpro_to ,
                                          String AV64Wcprocesosquimicosds_4_tfhreprocod_sel ,
                                          String AV63Wcprocesosquimicosds_3_tfhreprocod ,
                                          String AV66Wcprocesosquimicosds_6_tfhreprodsc_sel ,
                                          String AV65Wcprocesosquimicosds_5_tfhreprodsc ,
                                          short AV67Wcprocesosquimicosds_7_tfhreprotie ,
                                          short AV68Wcprocesosquimicosds_8_tfhreprotie_to ,
                                          byte A4550HreLinPro ,
                                          String A4551HreProCod ,
                                          String A4552HreProDsc ,
                                          short A4553HreProTie ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV44EmprCod ,
                                          int AV45HreBarCod ,
                                          byte AV46HreBarReo ,
                                          String AV47HreBarPar ,
                                          byte AV48HreNumCie ,
                                          short AV49HreLinMaq ,
                                          String A396EmprCod ,
                                          int A4492HreBarCod ,
                                          byte A4493HreBarReo ,
                                          String A4494HreBarPar ,
                                          byte A4495HreNumCie ,
                                          short A4545HreLinMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[14];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT HreLinMaq, HreNumCie, HreBarPar, HreBarReo, HreBarCod, EmprCod, HreProTie, HreProDsc, HreProCod, HreLinPro FROM TXPHISREC" ;
      addWhere(sWhereString, "(EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMaq = ?)");
      if ( ! (0==AV61Wcprocesosquimicosds_1_tfhrelinpro) )
      {
         addWhere(sWhereString, "(HreLinPro >= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (0==AV62Wcprocesosquimicosds_2_tfhrelinpro_to) )
      {
         addWhere(sWhereString, "(HreLinPro <= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Wcprocesosquimicosds_4_tfhreprocod_sel)==0) && ( ! (GXutil.strcmp("", AV63Wcprocesosquimicosds_3_tfhreprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Wcprocesosquimicosds_4_tfhreprocod_sel)==0) )
      {
         addWhere(sWhereString, "(HreProCod = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Wcprocesosquimicosds_6_tfhreprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV65Wcprocesosquimicosds_5_tfhreprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Wcprocesosquimicosds_6_tfhreprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(HreProDsc = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV67Wcprocesosquimicosds_7_tfhreprotie) )
      {
         addWhere(sWhereString, "(HreProTie >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV68Wcprocesosquimicosds_8_tfhreprotie_to) )
      {
         addWhere(sWhereString, "(HreProTie <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY HreLinPro" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HreLinPro DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY HreProCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HreProCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY HreProDsc" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HreProDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY HreProTie" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HreProTie DESC" ;
      }
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
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
                  return conditional_P08Z22(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).byteValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Boolean) dynConstraints[13]).booleanValue() , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).byteValue() , (String)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).shortValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , ((Number) dynConstraints[25]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08Z22", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
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
                  stmt.setString(sIdx, (String)parms[14], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[16]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[18]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[19]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[20]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[21]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               return;
      }
   }

}

