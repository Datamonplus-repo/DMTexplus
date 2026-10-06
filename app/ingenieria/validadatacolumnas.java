package app.ingenieria ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class validadatacolumnas extends GXProcedure
{
   public validadatacolumnas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( validadatacolumnas.class ), "" );
   }

   public validadatacolumnas( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.ingenieria.SdtMRec_DatoColumnaExisteSDT> executeUdp( GXBaseCollection<app.ingenieria.SdtMRec_AnalisisSDT> aP0 )
   {
      validadatacolumnas.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<app.ingenieria.SdtMRec_DatoColumnaExisteSDT>()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( GXBaseCollection<app.ingenieria.SdtMRec_AnalisisSDT> aP0 ,
                        GXBaseCollection<app.ingenieria.SdtMRec_DatoColumnaExisteSDT>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( GXBaseCollection<app.ingenieria.SdtMRec_AnalisisSDT> aP0 ,
                             GXBaseCollection<app.ingenieria.SdtMRec_DatoColumnaExisteSDT>[] aP1 )
   {
      validadatacolumnas.this.AV11Datos = aP0;
      validadatacolumnas.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "inicia valores columnas", ""), "", "", "", "", "", "", "", "", ""), AV15Pgmname) ;
      AV12MRec_DatoColumnaExisteSDT.clear();
      AV8Contador = (short)(0) ;
      AV8Contador = (short)(1) ;
      while ( AV8Contador <= 79 )
      {
         AV10Dato_Existe = (app.ingenieria.SdtMRec_DatoColumnaExisteSDT)new app.ingenieria.SdtMRec_DatoColumnaExisteSDT(remoteHandle, context);
         AV10Dato_Existe.setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( false );
         AV12MRec_DatoColumnaExisteSDT.add(AV10Dato_Existe, 0);
         AV8Contador = (short)(AV8Contador+1) ;
      }
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "inicia valores columnas:%1.", ""), AV12MRec_DatoColumnaExisteSDT.toJSonString(false), "", "", "", "", "", "", "", ""), AV15Pgmname) ;
      AV16GXV1 = 1 ;
      while ( AV16GXV1 <= AV11Datos.size() )
      {
         AV9Dato = (app.ingenieria.SdtMRec_AnalisisSDT)((app.ingenieria.SdtMRec_AnalisisSDT)AV11Datos.elementAt(-1+AV16GXV1));
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_1())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_1(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+1)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_2())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_2(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+2)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_3())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_3(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+3)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_4())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_4(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+4)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_5())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_5(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+5)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_6())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_6(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+6)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_7())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_7(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+7)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_8())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_8(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+8)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_9())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_9(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+9)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_10())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_10(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+10)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_11())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_11(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+11)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_12())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_12(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+12)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_13())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_13(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+13)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_14())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_14(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+14)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_15())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_15(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+15)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_16())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_16(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+16)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_17())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_17(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+17)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_18())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_18(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+18)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_19())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_19(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+19)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_20())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_20(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+20)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_21())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_21(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+21)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_22())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_22(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+22)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_23())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_23(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+23)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_24())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_24(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+24)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_25())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_25(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+25)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_26())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_26(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+26)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_27())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_27(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+27)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_28())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_28(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+28)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_29())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_29(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+29)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_30())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_30(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+30)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_31())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_31(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+31)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_32())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_32(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+32)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_33())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_33(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+33)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_34())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_34(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+34)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_35())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_35(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+35)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_36())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_36(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+36)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_37())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_37(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+37)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_38())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_38(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+38)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_39())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_39(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+39)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_40())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_40(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+40)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_41())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_41(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+41)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_42())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_42(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+42)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_43())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_43(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+43)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_44())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_44(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+44)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_45())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_45(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+45)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_46())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_46(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+46)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_47())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_47(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+47)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_48())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_48(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+48)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_49())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_49(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+49)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_50())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_50(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+50)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_51())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_51(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+51)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_52())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_52(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+52)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_53())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_53(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+53)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_54())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_54(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+54)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_55())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_55(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+55)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_56())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_56(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+56)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_57())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_57(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+57)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_58())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_58(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+58)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_59())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_59(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+59)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_60())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_60(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+60)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_61())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_61(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+61)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_62())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_62(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+62)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_63())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_63(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+63)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_64())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_64(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+64)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_65())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_65(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+65)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_66())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_66(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+66)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_67())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_67(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+66)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_68())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_68(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+68)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_69())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_69(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+69)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_70())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_70(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+70)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_71())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_71(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+71)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_72())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_72(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+72)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_73())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_73(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+73)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_74())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_74(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+74)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_75())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_75(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+75)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_76())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_76(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+76)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_77())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_77(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+77)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_78())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_78(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+78)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         if ( ( GXutil.len( GXutil.trim( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_79())) > 0 ) && ! ( CommonUtil.decimalVal( AV9Dato.getgxTv_SdtMRec_AnalisisSDT_Mprecplc_79(), ".").doubleValue() == 0 ) )
         {
            ((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV12MRec_DatoColumnaExisteSDT.elementAt(-1+79)).setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( true );
         }
         AV16GXV1 = (int)(AV16GXV1+1) ;
      }
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "final valores columnas:%1.", ""), AV12MRec_DatoColumnaExisteSDT.toJSonString(false), "", "", "", "", "", "", "", ""), AV15Pgmname) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = validadatacolumnas.this.AV12MRec_DatoColumnaExisteSDT;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12MRec_DatoColumnaExisteSDT = new GXBaseCollection<app.ingenieria.SdtMRec_DatoColumnaExisteSDT>(app.ingenieria.SdtMRec_DatoColumnaExisteSDT.class, "MRec_DatoColumnaExisteSDT", "TexplusNET", remoteHandle);
      AV15Pgmname = "" ;
      AV10Dato_Existe = new app.ingenieria.SdtMRec_DatoColumnaExisteSDT(remoteHandle, context);
      AV9Dato = new app.ingenieria.SdtMRec_AnalisisSDT(remoteHandle, context);
      AV15Pgmname = "Ingenieria.ValidaDataColumnas" ;
      /* GeneXus formulas. */
      AV15Pgmname = "Ingenieria.ValidaDataColumnas" ;
      Gx_err = (short)(0) ;
   }

   private short AV8Contador ;
   private short Gx_err ;
   private int AV16GXV1 ;
   private String AV15Pgmname ;
   private GXBaseCollection<app.ingenieria.SdtMRec_DatoColumnaExisteSDT>[] aP1 ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AnalisisSDT> AV11Datos ;
   private GXBaseCollection<app.ingenieria.SdtMRec_DatoColumnaExisteSDT> AV12MRec_DatoColumnaExisteSDT ;
   private app.ingenieria.SdtMRec_AnalisisSDT AV9Dato ;
   private app.ingenieria.SdtMRec_DatoColumnaExisteSDT AV10Dato_Existe ;
}

