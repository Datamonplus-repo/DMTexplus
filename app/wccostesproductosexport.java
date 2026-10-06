package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wccostesproductosexport extends GXProcedure
{
   public wccostesproductosexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wccostesproductosexport.class ), "" );
   }

   public wccostesproductosexport( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      wccostesproductosexport.this.aP1 = new String[] {""};
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
      wccostesproductosexport.this.aP0 = aP0;
      wccostesproductosexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "WCCostesProductosExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      if ( ! ( (GXutil.strcmp("", AV46TFHrePrdNum_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wccostesproductosexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFHrePrdNum_Sel, GXv_char5) ;
         wccostesproductosexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV45TFHrePrdNum)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wccostesproductosexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFHrePrdNum, GXv_char5) ;
            wccostesproductosexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV48TFHrePrdDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wccostesproductosexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFHrePrdDsc_Sel, GXv_char5) ;
         wccostesproductosexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV47TFHrePrdDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wccostesproductosexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFHrePrdDsc, GXv_char5) ;
            wccostesproductosexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV49TFHrePrdCant)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFHrePrdCant_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cantidad", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wccostesproductosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV49TFHrePrdCant)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wccostesproductosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV50TFHrePrdCant_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV52TFHrePrdUDs_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Und", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wccostesproductosexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV52TFHrePrdUDs_Sel, GXv_char5) ;
         wccostesproductosexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV51TFHrePrdUDs)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Und", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wccostesproductosexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV51TFHrePrdUDs, GXv_char5) ;
            wccostesproductosexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFHrePrePrd)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFHrePrePrd_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Precio", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wccostesproductosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV53TFHrePrePrd)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wccostesproductosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV54TFHrePrePrd_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55TFPrdFacCon)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56TFPrdFacCon_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Factor", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wccostesproductosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV55TFPrdFacCon)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wccostesproductosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV56TFPrdFacCon_To)) );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setText( httpContext.getMessage( "Producto", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setText( httpContext.getMessage( "Cantidad", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setText( httpContext.getMessage( "Cant Ad", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+4, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+4, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+4, 1, 1).setText( httpContext.getMessage( "Und", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+5, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+5, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+5, 1, 1).setText( httpContext.getMessage( "Coste", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+6, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+6, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+6, 1, 1).setText( httpContext.getMessage( "Precio", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+7, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+7, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+7, 1, 1).setText( httpContext.getMessage( "Factor", "") );
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV62Wccostesproductosds_1_tfhreprdnum = AV45TFHrePrdNum ;
      AV63Wccostesproductosds_2_tfhreprdnum_sel = AV46TFHrePrdNum_Sel ;
      AV64Wccostesproductosds_3_tfhreprddsc = AV47TFHrePrdDsc ;
      AV65Wccostesproductosds_4_tfhreprddsc_sel = AV48TFHrePrdDsc_Sel ;
      AV66Wccostesproductosds_5_tfhreprdcant = AV49TFHrePrdCant ;
      AV67Wccostesproductosds_6_tfhreprdcant_to = AV50TFHrePrdCant_To ;
      AV68Wccostesproductosds_7_tfhreprduds = AV51TFHrePrdUDs ;
      AV69Wccostesproductosds_8_tfhreprduds_sel = AV52TFHrePrdUDs_Sel ;
      AV70Wccostesproductosds_9_tfhrepreprd = AV53TFHrePrePrd ;
      AV71Wccostesproductosds_10_tfhrepreprd_to = AV54TFHrePrePrd_To ;
      AV72Wccostesproductosds_11_tfprdfaccon = AV55TFPrdFacCon ;
      AV73Wccostesproductosds_12_tfprdfaccon_to = AV56TFPrdFacCon_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV63Wccostesproductosds_2_tfhreprdnum_sel ,
                                           AV62Wccostesproductosds_1_tfhreprdnum ,
                                           AV65Wccostesproductosds_4_tfhreprddsc_sel ,
                                           AV64Wccostesproductosds_3_tfhreprddsc ,
                                           AV66Wccostesproductosds_5_tfhreprdcant ,
                                           AV67Wccostesproductosds_6_tfhreprdcant_to ,
                                           AV69Wccostesproductosds_8_tfhreprduds_sel ,
                                           AV68Wccostesproductosds_7_tfhreprduds ,
                                           AV70Wccostesproductosds_9_tfhrepreprd ,
                                           AV71Wccostesproductosds_10_tfhrepreprd_to ,
                                           AV72Wccostesproductosds_11_tfprdfaccon ,
                                           AV73Wccostesproductosds_12_tfprdfaccon_to ,
                                           A4558HrePrdNum ,
                                           A4559HrePrdDsc ,
                                           A4563HrePrdCant ,
                                           A4561HrePrdUDs ,
                                           A4967HrePrePrd ,
                                           A707PrdFacCon ,
                                           Short.valueOf(AV22OrderedBy) ,
                                           Boolean.valueOf(AV23OrderedDsc) ,
                                           A719PrdNum ,
                                           AV16Emprcod ,
                                           Integer.valueOf(AV17HreBarCod) ,
                                           Byte.valueOf(AV18HreBarReo) ,
                                           AV19HreBarpar ,
                                           Byte.valueOf(AV20HreNumCie) ,
                                           Short.valueOf(AV21HreLinMaq) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           A4494HreBarPar ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Short.valueOf(A4545HreLinMaq) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT
                                           }
      });
      lV62Wccostesproductosds_1_tfhreprdnum = GXutil.padr( GXutil.rtrim( AV62Wccostesproductosds_1_tfhreprdnum), 6, "%") ;
      lV64Wccostesproductosds_3_tfhreprddsc = GXutil.padr( GXutil.rtrim( AV64Wccostesproductosds_3_tfhreprddsc), 26, "%") ;
      lV68Wccostesproductosds_7_tfhreprduds = GXutil.padr( GXutil.rtrim( AV68Wccostesproductosds_7_tfhreprduds), 5, "%") ;
      /* Using cursor P08L42 */
      pr_default.execute(0, new Object[] {AV16Emprcod, Integer.valueOf(AV17HreBarCod), Byte.valueOf(AV18HreBarReo), AV19HreBarpar, Byte.valueOf(AV20HreNumCie), Short.valueOf(AV21HreLinMaq), lV62Wccostesproductosds_1_tfhreprdnum, AV63Wccostesproductosds_2_tfhreprdnum_sel, lV64Wccostesproductosds_3_tfhreprddsc, AV65Wccostesproductosds_4_tfhreprddsc_sel, AV66Wccostesproductosds_5_tfhreprdcant, AV67Wccostesproductosds_6_tfhreprdcant_to, lV68Wccostesproductosds_7_tfhreprduds, AV69Wccostesproductosds_8_tfhreprduds_sel, AV70Wccostesproductosds_9_tfhrepreprd, AV71Wccostesproductosds_10_tfhrepreprd_to, AV72Wccostesproductosds_11_tfprdfaccon, AV73Wccostesproductosds_12_tfprdfaccon_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P08L42_A719PrdNum[0] ;
         n719PrdNum = P08L42_n719PrdNum[0] ;
         A4545HreLinMaq = P08L42_A4545HreLinMaq[0] ;
         A4495HreNumCie = P08L42_A4495HreNumCie[0] ;
         A4494HreBarPar = P08L42_A4494HreBarPar[0] ;
         A4493HreBarReo = P08L42_A4493HreBarReo[0] ;
         A4492HreBarCod = P08L42_A4492HreBarCod[0] ;
         A396EmprCod = P08L42_A396EmprCod[0] ;
         A707PrdFacCon = P08L42_A707PrdFacCon[0] ;
         A4967HrePrePrd = P08L42_A4967HrePrePrd[0] ;
         n4967HrePrePrd = P08L42_n4967HrePrePrd[0] ;
         A4561HrePrdUDs = P08L42_A4561HrePrdUDs[0] ;
         n4561HrePrdUDs = P08L42_n4561HrePrdUDs[0] ;
         A4563HrePrdCant = P08L42_A4563HrePrdCant[0] ;
         n4563HrePrdCant = P08L42_n4563HrePrdCant[0] ;
         A4559HrePrdDsc = P08L42_A4559HrePrdDsc[0] ;
         n4559HrePrdDsc = P08L42_n4559HrePrdDsc[0] ;
         A4558HrePrdNum = P08L42_A4558HrePrdNum[0] ;
         n4558HrePrdNum = P08L42_n4558HrePrdNum[0] ;
         A4565HreCanAny = P08L42_A4565HreCanAny[0] ;
         n4565HreCanAny = P08L42_n4565HreCanAny[0] ;
         A4557HreRecLin = P08L42_A4557HreRecLin[0] ;
         A4550HreLinPro = P08L42_A4550HreLinPro[0] ;
         A707PrdFacCon = P08L42_A707PrdFacCon[0] ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S162 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4558HrePrdNum, GXv_char5) ;
         wccostesproductosexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setText( GXt_char4 );
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4559HrePrdDsc, GXv_char5) ;
         wccostesproductosexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A4563HrePrdCant)) );
         AV28HrePrdCant = ((A4565HreCanAny.doubleValue()>0) ? A4565HreCanAny : DecimalUtil.doubleToDec(0)) ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV28HrePrdCant)) );
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4561HrePrdUDs, GXv_char5) ;
         wccostesproductosexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+4, 1, 1).setText( GXt_char4 );
         AV29Costelinea = GXutil.roundDecimal( (A4563HrePrdCant.add(AV74Cantad)).multiply(A707PrdFacCon).multiply(A4967HrePrePrd).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2) ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV29Costelinea)) );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A4967HrePrePrd)) );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+7, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A707PrdFacCon)) );
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S172 ();
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
      if ( GXutil.strcmp(AV24Session.getValue("WCCostesProductosGridState"), "") == 0 )
      {
         AV26GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCCostesProductosGridState"), null, null);
      }
      else
      {
         AV26GridState.fromxml(AV24Session.getValue("WCCostesProductosGridState"), null, null);
      }
      AV22OrderedBy = AV26GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV23OrderedDsc = AV26GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV75GXV1 = 1 ;
      while ( AV75GXV1 <= AV26GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV27GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV26GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV75GXV1));
         if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDNUM") == 0 )
         {
            AV45TFHrePrdNum = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDNUM_SEL") == 0 )
         {
            AV46TFHrePrdNum_Sel = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDDSC") == 0 )
         {
            AV47TFHrePrdDsc = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDDSC_SEL") == 0 )
         {
            AV48TFHrePrdDsc_Sel = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDCANT") == 0 )
         {
            AV49TFHrePrdCant = CommonUtil.decimalVal( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV50TFHrePrdCant_To = CommonUtil.decimalVal( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDUDS") == 0 )
         {
            AV51TFHrePrdUDs = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDUDS_SEL") == 0 )
         {
            AV52TFHrePrdUDs_Sel = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPREPRD") == 0 )
         {
            AV53TFHrePrePrd = CommonUtil.decimalVal( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV54TFHrePrePrd_To = CommonUtil.decimalVal( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFACCON") == 0 )
         {
            AV55TFPrdFacCon = CommonUtil.decimalVal( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV56TFPrdFacCon_To = CommonUtil.decimalVal( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV16Emprcod = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARCOD") == 0 )
         {
            AV17HreBarCod = (int)(GXutil.lval( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARREO") == 0 )
         {
            AV18HreBarReo = (byte)(GXutil.lval( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARPAR") == 0 )
         {
            AV19HreBarpar = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRENUMCIE") == 0 )
         {
            AV20HreNumCie = (byte)(GXutil.lval( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRELINMAQ") == 0 )
         {
            AV21HreLinMaq = (short)(GXutil.lval( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV75GXV1 = (int)(AV75GXV1+1) ;
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
      this.aP0[0] = wccostesproductosexport.this.AV11Filename;
      this.aP1[0] = wccostesproductosexport.this.AV12ErrorMessage;
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
      AV46TFHrePrdNum_Sel = "" ;
      AV45TFHrePrdNum = "" ;
      AV48TFHrePrdDsc_Sel = "" ;
      AV47TFHrePrdDsc = "" ;
      AV49TFHrePrdCant = DecimalUtil.ZERO ;
      AV50TFHrePrdCant_To = DecimalUtil.ZERO ;
      AV52TFHrePrdUDs_Sel = "" ;
      AV51TFHrePrdUDs = "" ;
      AV53TFHrePrePrd = DecimalUtil.ZERO ;
      AV54TFHrePrePrd_To = DecimalUtil.ZERO ;
      AV55TFPrdFacCon = DecimalUtil.ZERO ;
      AV56TFPrdFacCon_To = DecimalUtil.ZERO ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      A4558HrePrdNum = "" ;
      A4559HrePrdDsc = "" ;
      A4563HrePrdCant = DecimalUtil.ZERO ;
      A4565HreCanAny = DecimalUtil.ZERO ;
      A4561HrePrdUDs = "" ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A4967HrePrePrd = DecimalUtil.ZERO ;
      AV62Wccostesproductosds_1_tfhreprdnum = "" ;
      AV63Wccostesproductosds_2_tfhreprdnum_sel = "" ;
      AV64Wccostesproductosds_3_tfhreprddsc = "" ;
      AV65Wccostesproductosds_4_tfhreprddsc_sel = "" ;
      AV66Wccostesproductosds_5_tfhreprdcant = DecimalUtil.ZERO ;
      AV67Wccostesproductosds_6_tfhreprdcant_to = DecimalUtil.ZERO ;
      AV68Wccostesproductosds_7_tfhreprduds = "" ;
      AV69Wccostesproductosds_8_tfhreprduds_sel = "" ;
      AV70Wccostesproductosds_9_tfhrepreprd = DecimalUtil.ZERO ;
      AV71Wccostesproductosds_10_tfhrepreprd_to = DecimalUtil.ZERO ;
      AV72Wccostesproductosds_11_tfprdfaccon = DecimalUtil.ZERO ;
      AV73Wccostesproductosds_12_tfprdfaccon_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV62Wccostesproductosds_1_tfhreprdnum = "" ;
      lV64Wccostesproductosds_3_tfhreprddsc = "" ;
      lV68Wccostesproductosds_7_tfhreprduds = "" ;
      A719PrdNum = "" ;
      AV16Emprcod = "" ;
      AV19HreBarpar = "" ;
      A396EmprCod = "" ;
      A4494HreBarPar = "" ;
      P08L42_A719PrdNum = new String[] {""} ;
      P08L42_n719PrdNum = new boolean[] {false} ;
      P08L42_A4545HreLinMaq = new short[1] ;
      P08L42_A4495HreNumCie = new byte[1] ;
      P08L42_A4494HreBarPar = new String[] {""} ;
      P08L42_A4493HreBarReo = new byte[1] ;
      P08L42_A4492HreBarCod = new int[1] ;
      P08L42_A396EmprCod = new String[] {""} ;
      P08L42_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08L42_A4967HrePrePrd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08L42_n4967HrePrePrd = new boolean[] {false} ;
      P08L42_A4561HrePrdUDs = new String[] {""} ;
      P08L42_n4561HrePrdUDs = new boolean[] {false} ;
      P08L42_A4563HrePrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08L42_n4563HrePrdCant = new boolean[] {false} ;
      P08L42_A4559HrePrdDsc = new String[] {""} ;
      P08L42_n4559HrePrdDsc = new boolean[] {false} ;
      P08L42_A4558HrePrdNum = new String[] {""} ;
      P08L42_n4558HrePrdNum = new boolean[] {false} ;
      P08L42_A4565HreCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08L42_n4565HreCanAny = new boolean[] {false} ;
      P08L42_A4557HreRecLin = new short[1] ;
      P08L42_A4550HreLinPro = new byte[1] ;
      AV28HrePrdCant = DecimalUtil.ZERO ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV29Costelinea = DecimalUtil.ZERO ;
      AV74Cantad = DecimalUtil.ZERO ;
      AV24Session = httpContext.getWebSession();
      AV26GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV27GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wccostesproductosexport__default(),
         new Object[] {
             new Object[] {
            P08L42_A719PrdNum, P08L42_n719PrdNum, P08L42_A4545HreLinMaq, P08L42_A4495HreNumCie, P08L42_A4494HreBarPar, P08L42_A4493HreBarReo, P08L42_A4492HreBarCod, P08L42_A396EmprCod, P08L42_A707PrdFacCon, P08L42_A4967HrePrePrd,
            P08L42_n4967HrePrePrd, P08L42_A4561HrePrdUDs, P08L42_n4561HrePrdUDs, P08L42_A4563HrePrdCant, P08L42_n4563HrePrdCant, P08L42_A4559HrePrdDsc, P08L42_n4559HrePrdDsc, P08L42_A4558HrePrdNum, P08L42_n4558HrePrdNum, P08L42_A4565HreCanAny,
            P08L42_n4565HreCanAny, P08L42_A4557HreRecLin, P08L42_A4550HreLinPro
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18HreBarReo ;
   private byte AV20HreNumCie ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte A4550HreLinPro ;
   private short GXv_int3[] ;
   private short AV22OrderedBy ;
   private short AV21HreLinMaq ;
   private short A4545HreLinMaq ;
   private short A4557HreRecLin ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV17HreBarCod ;
   private int A4492HreBarCod ;
   private int AV75GXV1 ;
   private java.math.BigDecimal AV49TFHrePrdCant ;
   private java.math.BigDecimal AV50TFHrePrdCant_To ;
   private java.math.BigDecimal AV53TFHrePrePrd ;
   private java.math.BigDecimal AV54TFHrePrePrd_To ;
   private java.math.BigDecimal AV55TFPrdFacCon ;
   private java.math.BigDecimal AV56TFPrdFacCon_To ;
   private java.math.BigDecimal A4563HrePrdCant ;
   private java.math.BigDecimal A4565HreCanAny ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A4967HrePrePrd ;
   private java.math.BigDecimal AV66Wccostesproductosds_5_tfhreprdcant ;
   private java.math.BigDecimal AV67Wccostesproductosds_6_tfhreprdcant_to ;
   private java.math.BigDecimal AV70Wccostesproductosds_9_tfhrepreprd ;
   private java.math.BigDecimal AV71Wccostesproductosds_10_tfhrepreprd_to ;
   private java.math.BigDecimal AV72Wccostesproductosds_11_tfprdfaccon ;
   private java.math.BigDecimal AV73Wccostesproductosds_12_tfprdfaccon_to ;
   private java.math.BigDecimal AV28HrePrdCant ;
   private java.math.BigDecimal AV29Costelinea ;
   private java.math.BigDecimal AV74Cantad ;
   private String AV46TFHrePrdNum_Sel ;
   private String AV45TFHrePrdNum ;
   private String AV48TFHrePrdDsc_Sel ;
   private String AV47TFHrePrdDsc ;
   private String AV52TFHrePrdUDs_Sel ;
   private String AV51TFHrePrdUDs ;
   private String A4558HrePrdNum ;
   private String A4559HrePrdDsc ;
   private String A4561HrePrdUDs ;
   private String AV62Wccostesproductosds_1_tfhreprdnum ;
   private String AV63Wccostesproductosds_2_tfhreprdnum_sel ;
   private String AV64Wccostesproductosds_3_tfhreprddsc ;
   private String AV65Wccostesproductosds_4_tfhreprddsc_sel ;
   private String AV68Wccostesproductosds_7_tfhreprduds ;
   private String AV69Wccostesproductosds_8_tfhreprduds_sel ;
   private String scmdbuf ;
   private String lV62Wccostesproductosds_1_tfhreprdnum ;
   private String lV64Wccostesproductosds_3_tfhreprddsc ;
   private String lV68Wccostesproductosds_7_tfhreprduds ;
   private String A719PrdNum ;
   private String AV16Emprcod ;
   private String AV19HreBarpar ;
   private String A396EmprCod ;
   private String A4494HreBarPar ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV23OrderedDsc ;
   private boolean n719PrdNum ;
   private boolean n4967HrePrePrd ;
   private boolean n4561HrePrdUDs ;
   private boolean n4563HrePrdCant ;
   private boolean n4559HrePrdDsc ;
   private boolean n4558HrePrdNum ;
   private boolean n4565HreCanAny ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV24Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P08L42_A719PrdNum ;
   private boolean[] P08L42_n719PrdNum ;
   private short[] P08L42_A4545HreLinMaq ;
   private byte[] P08L42_A4495HreNumCie ;
   private String[] P08L42_A4494HreBarPar ;
   private byte[] P08L42_A4493HreBarReo ;
   private int[] P08L42_A4492HreBarCod ;
   private String[] P08L42_A396EmprCod ;
   private java.math.BigDecimal[] P08L42_A707PrdFacCon ;
   private java.math.BigDecimal[] P08L42_A4967HrePrePrd ;
   private boolean[] P08L42_n4967HrePrePrd ;
   private String[] P08L42_A4561HrePrdUDs ;
   private boolean[] P08L42_n4561HrePrdUDs ;
   private java.math.BigDecimal[] P08L42_A4563HrePrdCant ;
   private boolean[] P08L42_n4563HrePrdCant ;
   private String[] P08L42_A4559HrePrdDsc ;
   private boolean[] P08L42_n4559HrePrdDsc ;
   private String[] P08L42_A4558HrePrdNum ;
   private boolean[] P08L42_n4558HrePrdNum ;
   private java.math.BigDecimal[] P08L42_A4565HreCanAny ;
   private boolean[] P08L42_n4565HreCanAny ;
   private short[] P08L42_A4557HreRecLin ;
   private byte[] P08L42_A4550HreLinPro ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV26GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV27GridStateFilterValue ;
}

final  class wccostesproductosexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08L42( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV63Wccostesproductosds_2_tfhreprdnum_sel ,
                                          String AV62Wccostesproductosds_1_tfhreprdnum ,
                                          String AV65Wccostesproductosds_4_tfhreprddsc_sel ,
                                          String AV64Wccostesproductosds_3_tfhreprddsc ,
                                          java.math.BigDecimal AV66Wccostesproductosds_5_tfhreprdcant ,
                                          java.math.BigDecimal AV67Wccostesproductosds_6_tfhreprdcant_to ,
                                          String AV69Wccostesproductosds_8_tfhreprduds_sel ,
                                          String AV68Wccostesproductosds_7_tfhreprduds ,
                                          java.math.BigDecimal AV70Wccostesproductosds_9_tfhrepreprd ,
                                          java.math.BigDecimal AV71Wccostesproductosds_10_tfhrepreprd_to ,
                                          java.math.BigDecimal AV72Wccostesproductosds_11_tfprdfaccon ,
                                          java.math.BigDecimal AV73Wccostesproductosds_12_tfprdfaccon_to ,
                                          String A4558HrePrdNum ,
                                          String A4559HrePrdDsc ,
                                          java.math.BigDecimal A4563HrePrdCant ,
                                          String A4561HrePrdUDs ,
                                          java.math.BigDecimal A4967HrePrePrd ,
                                          java.math.BigDecimal A707PrdFacCon ,
                                          short AV22OrderedBy ,
                                          boolean AV23OrderedDsc ,
                                          String A719PrdNum ,
                                          String AV16Emprcod ,
                                          int AV17HreBarCod ,
                                          byte AV18HreBarReo ,
                                          String AV19HreBarpar ,
                                          byte AV20HreNumCie ,
                                          short AV21HreLinMaq ,
                                          String A396EmprCod ,
                                          int A4492HreBarCod ,
                                          byte A4493HreBarReo ,
                                          String A4494HreBarPar ,
                                          byte A4495HreNumCie ,
                                          short A4545HreLinMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[18];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.PrdNum, T1.HreLinMaq, T1.HreNumCie, T1.HreBarPar, T1.HreBarReo, T1.HreBarCod, T1.EmprCod, T2.PrdFacCon, T1.HrePrePrd, T1.HrePrdUDs, T1.HrePrdCant, T1.HrePrdDsc," ;
      scmdbuf += " T1.HrePrdNum, T1.HreCanAny, T1.HreRecLin, T1.HreLinPro FROM (TXPHISLRE T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.HreBarCod = ? and T1.HreBarReo = ? and T1.HreBarPar = ? and T1.HreNumCie = ? and T1.HreLinMaq = ?)");
      addWhere(sWhereString, "(Not (rtrim(T1.PrdNum) IS NULL AND NOT(T1.PrdNum IS NULL)))");
      addWhere(sWhereString, "(SUBSTR(T1.PrdNum, 1, 1) <> 'C')");
      if ( (GXutil.strcmp("", AV63Wccostesproductosds_2_tfhreprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV62Wccostesproductosds_1_tfhreprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrePrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Wccostesproductosds_2_tfhreprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdNum = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Wccostesproductosds_4_tfhreprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV64Wccostesproductosds_3_tfhreprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrePrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Wccostesproductosds_4_tfhreprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdDsc = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Wccostesproductosds_5_tfhreprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdCant >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67Wccostesproductosds_6_tfhreprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdCant <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Wccostesproductosds_8_tfhreprduds_sel)==0) && ( ! (GXutil.strcmp("", AV68Wccostesproductosds_7_tfhreprduds)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrePrdUDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Wccostesproductosds_8_tfhreprduds_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdUDs = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Wccostesproductosds_9_tfhrepreprd)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrePrd >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Wccostesproductosds_10_tfhrepreprd_to)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrePrd <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Wccostesproductosds_11_tfprdfaccon)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFacCon >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Wccostesproductosds_12_tfprdfaccon_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFacCon <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV22OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.HreLinPro" ;
      }
      else if ( AV22OrderedBy == 2 )
      {
         scmdbuf += " ORDER BY T1.HreRecLin" ;
      }
      else if ( ( AV22OrderedBy == 3 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HrePrdNum" ;
      }
      else if ( ( AV22OrderedBy == 3 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HrePrdNum DESC" ;
      }
      else if ( ( AV22OrderedBy == 4 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HrePrdDsc" ;
      }
      else if ( ( AV22OrderedBy == 4 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HrePrdDsc DESC" ;
      }
      else if ( ( AV22OrderedBy == 5 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HrePrdCant" ;
      }
      else if ( ( AV22OrderedBy == 5 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HrePrdCant DESC" ;
      }
      else if ( ( AV22OrderedBy == 6 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HrePrdUDs" ;
      }
      else if ( ( AV22OrderedBy == 6 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HrePrdUDs DESC" ;
      }
      else if ( ( AV22OrderedBy == 7 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HrePrePrd" ;
      }
      else if ( ( AV22OrderedBy == 7 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HrePrePrd DESC" ;
      }
      else if ( ( AV22OrderedBy == 8 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdFacCon" ;
      }
      else if ( ( AV22OrderedBy == 8 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdFacCon DESC" ;
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
                  return conditional_P08L42(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Boolean) dynConstraints[19]).booleanValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).byteValue() , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08L42", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,3);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 26);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(14,3);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(15);
               ((byte[]) buf[22])[0] = rslt.getByte(16);
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
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[20]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[22]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 5);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 4);
               }
               return;
      }
   }

}

