package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class consultadeproduccion_wcgetfilterdata extends GXProcedure
{
   public consultadeproduccion_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultadeproduccion_wcgetfilterdata.class ), "" );
   }

   public consultadeproduccion_wcgetfilterdata( int remoteHandle ,
                                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      consultadeproduccion_wcgetfilterdata.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      consultadeproduccion_wcgetfilterdata.this.AV442DDOName = aP0;
      consultadeproduccion_wcgetfilterdata.this.AV440SearchTxt = aP1;
      consultadeproduccion_wcgetfilterdata.this.AV441SearchTxtTo = aP2;
      consultadeproduccion_wcgetfilterdata.this.aP3 = aP3;
      consultadeproduccion_wcgetfilterdata.this.aP4 = aP4;
      consultadeproduccion_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV445Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV448OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV450OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
      GXv_SdtWWPContext1[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV9WWPContext = GXv_SdtWWPContext1[0] ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( GXutil.strcmp(GXutil.upper( AV442DDOName), "DDO_CLINOM") == 0 )
      {
         /* Execute user subroutine: 'LOADCLINOMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV442DDOName), "DDO_BARNHDR") == 0 )
      {
         /* Execute user subroutine: 'LOADBARNHDROPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV442DDOName), "DDO_BARAGREST") == 0 )
      {
         /* Execute user subroutine: 'LOADBARAGRESTOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV442DDOName), "DDO_BARSER") == 0 )
      {
         /* Execute user subroutine: 'LOADBARSEROPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV442DDOName), "DDO_BARSERDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADBARSERDSCOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV442DDOName), "DDO_BARTIPARTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADBARTIPARTDSCOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV442DDOName), "DDO_BARCOLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADBARCOLNOMOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV442DDOName), "DDO_BARNOMCLI") == 0 )
      {
         /* Execute user subroutine: 'LOADBARNOMCLIOPTIONS' */
         S191 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV442DDOName), "DDO_BARFASSIG") == 0 )
      {
         /* Execute user subroutine: 'LOADBARFASSIGOPTIONS' */
         S201 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV442DDOName), "DDO_BARGIRAR") == 0 )
      {
         /* Execute user subroutine: 'LOADBARGIRAROPTIONS' */
         S211 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV442DDOName), "DDO_BARPROPER") == 0 )
      {
         /* Execute user subroutine: 'LOADBARPROPEROPTIONS' */
         S221 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV442DDOName), "DDO_BARNORMAS") == 0 )
      {
         /* Execute user subroutine: 'LOADBARNORMASOPTIONS' */
         S231 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV442DDOName), "DDO_DISUSRCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADDISUSRCODOPTIONS' */
         S241 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV446OptionsJson = AV445Options.toJSonString(false) ;
      AV449OptionsDescJson = AV448OptionsDesc.toJSonString(false) ;
      AV451OptionIndexesJson = AV450OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV453Session.getValue("Produccion.ConsultadeProduccion_WCGridState"), "") == 0 )
      {
         AV455GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Produccion.ConsultadeProduccion_WCGridState"), null, null);
      }
      else
      {
         AV455GridState.fromxml(AV453Session.getValue("Produccion.ConsultadeProduccion_WCGridState"), null, null);
      }
      AV516GXV1 = 1 ;
      while ( AV516GXV1 <= AV455GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV456GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV455GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV516GXV1));
         if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV24TFCliCod = (int)(GXutil.lval( AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV25TFCliCod_To = (int)(GXutil.lval( AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV26TFCliNom = AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV27TFCliNom_Sel = AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV16TFBarNHdr = AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV17TFBarNHdr_Sel = AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGREST") == 0 )
         {
            AV156TFBarAgrEst = AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGREST_SEL") == 0 )
         {
            AV157TFBarAgrEst_Sel = AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV28TFBarSer = AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV29TFBarSer_Sel = AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV30TFBarSerDsc = AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV31TFBarSerDsc_Sel = AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPART") == 0 )
         {
            AV32TFBarTipArt = (short)(GXutil.lval( AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV33TFBarTipArt_To = (short)(GXutil.lval( AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPARTDSC") == 0 )
         {
            AV34TFBarTipArtDsc = AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPARTDSC_SEL") == 0 )
         {
            AV35TFBarTipArtDsc_Sel = AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV36TFBarColNom = AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV37TFBarColNom_Sel = AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV38TFBarColNum = (int)(GXutil.lval( AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFBarColNum_To = (int)(GXutil.lval( AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV200TFBarNomCli = AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV201TFBarNomCli_Sel = AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV124TFBarSit = (byte)(GXutil.lval( AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV125TFBarSit_To = (byte)(GXutil.lval( AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECGEN") == 0 )
         {
            AV40TFBarFecGen = localUtil.ctod( AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECCLI") == 0 )
         {
            AV42TFBarFecCli = localUtil.ctod( AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECFPR") == 0 )
         {
            AV144TFBarFecFpr = localUtil.ctod( AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECSAL") == 0 )
         {
            AV46TFBarFecSal = localUtil.ctod( AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASSIG") == 0 )
         {
            AV64TFBarFasSig = AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASSIG_SEL") == 0 )
         {
            AV65TFBarFasSig_Sel = AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBULTIMO") == 0 )
         {
            AV468TFBarAlbUltimo = GXutil.lval( AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV469TFBarAlbUltimo_To = GXutil.lval( AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBFACT") == 0 )
         {
            AV480TFBarAlbFact = (int)(GXutil.lval( AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV481TFBarAlbFact_To = (int)(GXutil.lval( AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARGIRAR") == 0 )
         {
            AV324TFBarGirar = AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARGIRAR_SEL") == 0 )
         {
            AV325TFBarGirar_Sel = AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARACAANH") == 0 )
         {
            AV372TFBarAcaAnh = (short)(GXutil.lval( AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV373TFBarAcaAnh_To = (short)(GXutil.lval( AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPROPER") == 0 )
         {
            AV246TFBarProPer = AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPROPER_SEL") == 0 )
         {
            AV247TFBarProPer_Sel = AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNORMAS") == 0 )
         {
            AV476TFBarNormas = AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNORMAS_SEL") == 0 )
         {
            AV477TFBarNormas_Sel = AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUSRCOD") == 0 )
         {
            AV478TFDisUsrCod = AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUSRCOD_SEL") == 0 )
         {
            AV479TFDisUsrCod_Sel = AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV459Emprcod = AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICODFROM") == 0 )
         {
            AV460clicodfrom = (int)(GXutil.lval( AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICODTO") == 0 )
         {
            AV461clicodto = (int)(GXutil.lval( AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARDISNUMFROM") == 0 )
         {
            AV462bardisnumfrom = AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARDISNUMTO") == 0 )
         {
            AV463bardisnumto = AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECGENFROM") == 0 )
         {
            AV464barfecgenfrom = localUtil.ctod( AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECGENTO") == 0 )
         {
            AV465barfecgento = localUtil.ctod( AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSITFROM") == 0 )
         {
            AV466barsitfrom = (byte)(GXutil.lval( AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSITTO") == 0 )
         {
            AV467barsitto = (byte)(GXutil.lval( AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECCLIFROM") == 0 )
         {
            AV482barfecclifrom = localUtil.ctod( AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECCLITO") == 0 )
         {
            AV483barfecclito = localUtil.ctod( AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECFPRFROM") == 0 )
         {
            AV484BarFecFprfrom = localUtil.ctod( AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECFPRTO") == 0 )
         {
            AV485BarFecFprto = localUtil.ctod( AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECSALFROM") == 0 )
         {
            AV486barfecsalfrom = localUtil.ctod( AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECSALTO") == 0 )
         {
            AV487barfecsalto = localUtil.ctod( AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSERFROM") == 0 )
         {
            AV488barserfrom = AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSERTO") == 0 )
         {
            AV489barserto = AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARTIPARTFROM") == 0 )
         {
            AV490bartipartfrom = (short)(GXutil.lval( AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARTIPARTTO") == 0 )
         {
            AV491bartipartto = (short)(GXutil.lval( AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNOMFROM") == 0 )
         {
            AV492BarColNomfrom = AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNOMTO") == 0 )
         {
            AV493BarColNomto = AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNUMFROM") == 0 )
         {
            AV494BarColNumfrom = (int)(GXutil.lval( AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNUMTO") == 0 )
         {
            AV495BarColNumto = (int)(GXutil.lval( AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARNOMCLIFROM") == 0 )
         {
            AV496BarNomClifrom = AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARNOMCLITO") == 0 )
         {
            AV497BarNomClito = AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARNUMCLIFROM") == 0 )
         {
            AV498BarNumclifrom = (int)(GXutil.lval( AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARNUMCLITO") == 0 )
         {
            AV499barnumclito = (int)(GXutil.lval( AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARTIPARTFROM") == 0 )
         {
            AV490bartipartfrom = (short)(GXutil.lval( AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARTIPARTTO") == 0 )
         {
            AV491bartipartto = (short)(GXutil.lval( AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MUESTRAS") == 0 )
         {
            AV501muestras = AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODFROM") == 0 )
         {
            AV502barcodfrom = (int)(GXutil.lval( AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODTO") == 0 )
         {
            AV503barcodto = (int)(GXutil.lval( AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREOFROM") == 0 )
         {
            AV504barcodreofrom = (byte)(GXutil.lval( AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREOTO") == 0 )
         {
            AV505barcodreoto = (byte)(GXutil.lval( AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPARFROM") == 0 )
         {
            AV506barcodparfrom = AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPARTO") == 0 )
         {
            AV507barcodparto = AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&COD_IDTX") == 0 )
         {
            AV510Cod_idtx = AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARGIRAR") == 0 )
         {
            AV513BarGirar = AV456GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV516GXV1 = (int)(AV516GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV26TFCliNom = AV440SearchTxt ;
      AV27TFCliNom_Sel = "" ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV24TFCliCod) ,
                                           Integer.valueOf(AV25TFCliCod_To) ,
                                           AV27TFCliNom_Sel ,
                                           AV26TFCliNom ,
                                           AV17TFBarNHdr_Sel ,
                                           AV16TFBarNHdr ,
                                           AV157TFBarAgrEst_Sel ,
                                           AV156TFBarAgrEst ,
                                           AV29TFBarSer_Sel ,
                                           AV28TFBarSer ,
                                           AV31TFBarSerDsc_Sel ,
                                           AV30TFBarSerDsc ,
                                           Short.valueOf(AV32TFBarTipArt) ,
                                           Short.valueOf(AV33TFBarTipArt_To) ,
                                           AV35TFBarTipArtDsc_Sel ,
                                           AV34TFBarTipArtDsc ,
                                           AV37TFBarColNom_Sel ,
                                           AV36TFBarColNom ,
                                           Integer.valueOf(AV38TFBarColNum) ,
                                           Integer.valueOf(AV39TFBarColNum_To) ,
                                           AV201TFBarNomCli_Sel ,
                                           AV200TFBarNomCli ,
                                           Byte.valueOf(AV124TFBarSit) ,
                                           Byte.valueOf(AV125TFBarSit_To) ,
                                           AV40TFBarFecGen ,
                                           AV42TFBarFecCli ,
                                           AV144TFBarFecFpr ,
                                           AV46TFBarFecSal ,
                                           AV325TFBarGirar_Sel ,
                                           AV324TFBarGirar ,
                                           Short.valueOf(AV372TFBarAcaAnh) ,
                                           Short.valueOf(AV373TFBarAcaAnh_To) ,
                                           AV247TFBarProPer_Sel ,
                                           AV246TFBarProPer ,
                                           AV479TFDisUsrCod_Sel ,
                                           AV478TFDisUsrCod ,
                                           Integer.valueOf(AV460clicodfrom) ,
                                           Integer.valueOf(AV461clicodto) ,
                                           AV464barfecgenfrom ,
                                           AV465barfecgento ,
                                           AV486barfecsalfrom ,
                                           AV487barfecsalto ,
                                           AV482barfecclifrom ,
                                           AV483barfecclito ,
                                           AV484BarFecFprfrom ,
                                           AV485BarFecFprto ,
                                           AV488barserfrom ,
                                           AV489barserto ,
                                           AV492BarColNomfrom ,
                                           AV493BarColNomto ,
                                           Integer.valueOf(AV494BarColNumfrom) ,
                                           Integer.valueOf(AV495BarColNumto) ,
                                           AV496BarNomClifrom ,
                                           AV497BarNomClito ,
                                           Integer.valueOf(AV498BarNumclifrom) ,
                                           Integer.valueOf(AV499barnumclito) ,
                                           Short.valueOf(AV490bartipartfrom) ,
                                           Short.valueOf(AV491bartipartto) ,
                                           AV501muestras ,
                                           Integer.valueOf(AV502barcodfrom) ,
                                           Integer.valueOf(AV503barcodto) ,
                                           Byte.valueOf(AV504barcodreofrom) ,
                                           Byte.valueOf(AV505barcodreoto) ,
                                           AV506barcodparfrom ,
                                           AV507barcodparto ,
                                           AV510Cod_idtx ,
                                           AV513BarGirar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A120BarAgrEst ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A13711BarTipArtD ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Byte.valueOf(A213BarSit) ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A161BarFecSal ,
                                           A2454BarGirar ,
                                           Short.valueOf(A4466BarAcaAnh) ,
                                           A2829BarProPer ,
                                           A4348DisUsrCod ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A3030BarPlf ,
                                           AV65TFBarFasSig_Sel ,
                                           AV64TFBarFasSig ,
                                           A1955BarFasSig ,
                                           Long.valueOf(AV468TFBarAlbUltimo) ,
                                           Long.valueOf(A13930BarAlbUlti) ,
                                           Long.valueOf(AV469TFBarAlbUltimo_To) ,
                                           Integer.valueOf(AV480TFBarAlbFact) ,
                                           Integer.valueOf(A13935BarAlbFact) ,
                                           Integer.valueOf(AV481TFBarAlbFact_To) ,
                                           AV477TFBarNormas_Sel ,
                                           AV476TFBarNormas ,
                                           A13934BarNormas ,
                                           AV462bardisnumfrom ,
                                           A13878PedidoClie ,
                                           AV463bardisnumto ,
                                           Byte.valueOf(AV466barsitfrom) ,
                                           Byte.valueOf(AV467barsitto) ,
                                           A396EmprCod ,
                                           AV459Emprcod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV64TFBarFasSig = GXutil.padr( GXutil.rtrim( AV64TFBarFasSig), 8, "%") ;
      lV26TFCliNom = GXutil.padr( GXutil.rtrim( AV26TFCliNom), 30, "%") ;
      lV16TFBarNHdr = GXutil.padr( GXutil.rtrim( AV16TFBarNHdr), 11, "%") ;
      lV156TFBarAgrEst = GXutil.padr( GXutil.rtrim( AV156TFBarAgrEst), 1, "%") ;
      lV28TFBarSer = GXutil.padr( GXutil.rtrim( AV28TFBarSer), 16, "%") ;
      lV30TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV30TFBarSerDsc), 26, "%") ;
      lV34TFBarTipArtDsc = GXutil.padr( GXutil.rtrim( AV34TFBarTipArtDsc), 30, "%") ;
      lV36TFBarColNom = GXutil.padr( GXutil.rtrim( AV36TFBarColNom), 13, "%") ;
      lV200TFBarNomCli = GXutil.padr( GXutil.rtrim( AV200TFBarNomCli), 13, "%") ;
      lV324TFBarGirar = GXutil.padr( GXutil.rtrim( AV324TFBarGirar), 20, "%") ;
      lV246TFBarProPer = GXutil.padr( GXutil.rtrim( AV246TFBarProPer), 8, "%") ;
      lV478TFDisUsrCod = GXutil.padr( GXutil.rtrim( AV478TFDisUsrCod), 8, "%") ;
      /* Using cursor P09DR6 */
      pr_default.execute(0, new Object[] {AV65TFBarFasSig_Sel, AV64TFBarFasSig, lV64TFBarFasSig, AV65TFBarFasSig_Sel, AV65TFBarFasSig_Sel, Byte.valueOf(AV466barsitfrom), Byte.valueOf(AV467barsitto), AV459Emprcod, Integer.valueOf(AV24TFCliCod), Integer.valueOf(AV25TFCliCod_To), lV26TFCliNom, AV27TFCliNom_Sel, lV16TFBarNHdr, AV17TFBarNHdr_Sel, lV156TFBarAgrEst, AV157TFBarAgrEst_Sel, lV28TFBarSer, AV29TFBarSer_Sel, lV30TFBarSerDsc, AV31TFBarSerDsc_Sel, Short.valueOf(AV32TFBarTipArt), Short.valueOf(AV33TFBarTipArt_To), lV34TFBarTipArtDsc, AV35TFBarTipArtDsc_Sel, lV36TFBarColNom, AV37TFBarColNom_Sel, Integer.valueOf(AV38TFBarColNum), Integer.valueOf(AV39TFBarColNum_To), lV200TFBarNomCli, AV201TFBarNomCli_Sel, Byte.valueOf(AV124TFBarSit), Byte.valueOf(AV125TFBarSit_To), AV40TFBarFecGen, AV42TFBarFecCli, AV144TFBarFecFpr, AV46TFBarFecSal, lV324TFBarGirar, AV325TFBarGirar_Sel, Short.valueOf(AV372TFBarAcaAnh), Short.valueOf(AV373TFBarAcaAnh_To), lV246TFBarProPer, AV247TFBarProPer_Sel, lV478TFDisUsrCod, AV479TFDisUsrCod_Sel, Integer.valueOf(AV460clicodfrom), Integer.valueOf(AV461clicodto), AV464barfecgenfrom, AV465barfecgento, AV486barfecsalfrom, AV487barfecsalto, AV482barfecclifrom, AV483barfecclito, AV484BarFecFprfrom, AV485BarFecFprto, AV488barserfrom, AV489barserto, AV492BarColNomfrom, AV493BarColNomto, Integer.valueOf(AV494BarColNumfrom), Integer.valueOf(AV495BarColNumto), AV496BarNomClifrom, AV497BarNomClito, Integer.valueOf(AV498BarNumclifrom), Integer.valueOf(AV499barnumclito), Short.valueOf(AV490bartipartfrom), Short.valueOf(AV491bartipartto), AV501muestras, Integer.valueOf(AV502barcodfrom), Integer.valueOf(AV503barcodto), Byte.valueOf(AV504barcodreofrom), Byte.valueOf(AV505barcodreoto), AV506barcodparfrom, AV507barcodparto, AV510Cod_idtx, AV513BarGirar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9DR2 = false ;
         A279CliNom = P09DR6_A279CliNom[0] ;
         A3030BarPlf = P09DR6_A3030BarPlf[0] ;
         A1235BarNumCli = P09DR6_A1235BarNumCli[0] ;
         A4348DisUsrCod = P09DR6_A4348DisUsrCod[0] ;
         A2829BarProPer = P09DR6_A2829BarProPer[0] ;
         A4466BarAcaAnh = P09DR6_A4466BarAcaAnh[0] ;
         A2454BarGirar = P09DR6_A2454BarGirar[0] ;
         A161BarFecSal = P09DR6_A161BarFecSal[0] ;
         A158BarFecFpr = P09DR6_A158BarFecFpr[0] ;
         A155BarFecCli = P09DR6_A155BarFecCli[0] ;
         A159BarFecGen = P09DR6_A159BarFecGen[0] ;
         A213BarSit = P09DR6_A213BarSit[0] ;
         A1234BarNomCli = P09DR6_A1234BarNomCli[0] ;
         A136BarColNum = P09DR6_A136BarColNum[0] ;
         A135BarColNom = P09DR6_A135BarColNom[0] ;
         A13711BarTipArtD = P09DR6_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P09DR6_n13711BarTipArtD[0] ;
         A217BarTipArt = P09DR6_A217BarTipArt[0] ;
         n217BarTipArt = P09DR6_n217BarTipArt[0] ;
         A1652BarSerDsc = P09DR6_A1652BarSerDsc[0] ;
         A212BarSer = P09DR6_A212BarSer[0] ;
         A120BarAgrEst = P09DR6_A120BarAgrEst[0] ;
         A252CliCod = P09DR6_A252CliCod[0] ;
         n252CliCod = P09DR6_n252CliCod[0] ;
         A1955BarFasSig = P09DR6_A1955BarFasSig[0] ;
         n1955BarFasSig = P09DR6_n1955BarFasSig[0] ;
         A130BarCodPar = P09DR6_A130BarCodPar[0] ;
         A132BarCodReo = P09DR6_A132BarCodReo[0] ;
         A129BarCod = P09DR6_A129BarCod[0] ;
         A361DisCod = P09DR6_A361DisCod[0] ;
         A143BarDisNum = P09DR6_A143BarDisNum[0] ;
         A4812BarEncCli = P09DR6_A4812BarEncCli[0] ;
         A396EmprCod = P09DR6_A396EmprCod[0] ;
         A4348DisUsrCod = P09DR6_A4348DisUsrCod[0] ;
         A13711BarTipArtD = P09DR6_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P09DR6_n13711BarTipArtD[0] ;
         A279CliNom = P09DR6_A279CliNom[0] ;
         A1955BarFasSig = P09DR6_A1955BarFasSig[0] ;
         n1955BarFasSig = P09DR6_n1955BarFasSig[0] ;
         GXt_int2 = A13930BarAlbUlti ;
         GXv_int3[0] = GXt_int2 ;
         new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int3) ;
         consultadeproduccion_wcgetfilterdata.this.GXt_int2 = GXv_int3[0] ;
         A13930BarAlbUlti = GXt_int2 ;
         if ( (0==AV468TFBarAlbUltimo) || ( ( A13930BarAlbUlti >= AV468TFBarAlbUltimo ) ) )
         {
            if ( (0==AV469TFBarAlbUltimo_To) || ( ( A13930BarAlbUlti <= AV469TFBarAlbUltimo_To ) ) )
            {
               GXt_int4 = A13935BarAlbFact ;
               GXv_int5[0] = GXt_int4 ;
               new app.produccion.consultadeproduccion_factura(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int5) ;
               consultadeproduccion_wcgetfilterdata.this.GXt_int4 = GXv_int5[0] ;
               A13935BarAlbFact = GXt_int4 ;
               if ( (0==AV480TFBarAlbFact) || ( ( A13935BarAlbFact >= AV480TFBarAlbFact ) ) )
               {
                  if ( (0==AV481TFBarAlbFact_To) || ( ( A13935BarAlbFact <= AV481TFBarAlbFact_To ) ) )
                  {
                     GXt_char6 = A13934BarNormas ;
                     GXv_char7[0] = GXt_char6 ;
                     new app.produccion.consultadeproduccion_normasestandarstextiles(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char7) ;
                     consultadeproduccion_wcgetfilterdata.this.GXt_char6 = GXv_char7[0] ;
                     A13934BarNormas = GXt_char6 ;
                     if ( ! ( (GXutil.strcmp("", AV477TFBarNormas_Sel)==0) && ( ! (GXutil.strcmp("", AV476TFBarNormas)==0) ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV476TFBarNormas) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV477TFBarNormas_Sel)==0) || ( ( GXutil.strcmp(A13934BarNormas, AV477TFBarNormas_Sel) == 0 ) ) )
                        {
                           GXt_char6 = A13878PedidoClie ;
                           GXv_char7[0] = A396EmprCod ;
                           GXv_char8[0] = A4812BarEncCli ;
                           GXv_char9[0] = A143BarDisNum ;
                           GXv_char10[0] = GXt_char6 ;
                           new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char7, GXv_char8, GXv_char9, GXv_char10) ;
                           consultadeproduccion_wcgetfilterdata.this.A396EmprCod = GXv_char7[0] ;
                           consultadeproduccion_wcgetfilterdata.this.A4812BarEncCli = GXv_char8[0] ;
                           consultadeproduccion_wcgetfilterdata.this.A143BarDisNum = GXv_char9[0] ;
                           consultadeproduccion_wcgetfilterdata.this.GXt_char6 = GXv_char10[0] ;
                           A13878PedidoClie = GXt_char6 ;
                           if ( (GXutil.strcmp("", AV462bardisnumfrom)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV462bardisnumfrom) >= 0 ) ) )
                           {
                              if ( (GXutil.strcmp("", AV463bardisnumto)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV463bardisnumto) <= 0 ) ) )
                              {
                                 A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
                                 AV452count = 0 ;
                                 while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09DR6_A279CliNom[0], A279CliNom) == 0 ) )
                                 {
                                    brk9DR2 = false ;
                                    A252CliCod = P09DR6_A252CliCod[0] ;
                                    n252CliCod = P09DR6_n252CliCod[0] ;
                                    A130BarCodPar = P09DR6_A130BarCodPar[0] ;
                                    A132BarCodReo = P09DR6_A132BarCodReo[0] ;
                                    A129BarCod = P09DR6_A129BarCod[0] ;
                                    A396EmprCod = P09DR6_A396EmprCod[0] ;
                                    AV452count = (long)(AV452count+1) ;
                                    brk9DR2 = true ;
                                    pr_default.readNext(0);
                                 }
                                 if ( ! (GXutil.strcmp("", A279CliNom)==0) )
                                 {
                                    AV444Option = A279CliNom ;
                                    AV445Options.add(AV444Option, 0);
                                    AV450OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV452count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                                 }
                                 if ( AV445Options.size() == 50 )
                                 {
                                    /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                    if (true) break;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk9DR2 )
         {
            brk9DR2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADBARNHDROPTIONS' Routine */
      returnInSub = false ;
      AV16TFBarNHdr = AV440SearchTxt ;
      AV17TFBarNHdr_Sel = "" ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Integer.valueOf(AV24TFCliCod) ,
                                           Integer.valueOf(AV25TFCliCod_To) ,
                                           AV27TFCliNom_Sel ,
                                           AV26TFCliNom ,
                                           AV17TFBarNHdr_Sel ,
                                           AV16TFBarNHdr ,
                                           AV157TFBarAgrEst_Sel ,
                                           AV156TFBarAgrEst ,
                                           AV29TFBarSer_Sel ,
                                           AV28TFBarSer ,
                                           AV31TFBarSerDsc_Sel ,
                                           AV30TFBarSerDsc ,
                                           Short.valueOf(AV32TFBarTipArt) ,
                                           Short.valueOf(AV33TFBarTipArt_To) ,
                                           AV35TFBarTipArtDsc_Sel ,
                                           AV34TFBarTipArtDsc ,
                                           AV37TFBarColNom_Sel ,
                                           AV36TFBarColNom ,
                                           Integer.valueOf(AV38TFBarColNum) ,
                                           Integer.valueOf(AV39TFBarColNum_To) ,
                                           AV201TFBarNomCli_Sel ,
                                           AV200TFBarNomCli ,
                                           Byte.valueOf(AV124TFBarSit) ,
                                           Byte.valueOf(AV125TFBarSit_To) ,
                                           AV40TFBarFecGen ,
                                           AV42TFBarFecCli ,
                                           AV144TFBarFecFpr ,
                                           AV46TFBarFecSal ,
                                           AV325TFBarGirar_Sel ,
                                           AV324TFBarGirar ,
                                           Short.valueOf(AV372TFBarAcaAnh) ,
                                           Short.valueOf(AV373TFBarAcaAnh_To) ,
                                           AV247TFBarProPer_Sel ,
                                           AV246TFBarProPer ,
                                           AV479TFDisUsrCod_Sel ,
                                           AV478TFDisUsrCod ,
                                           Integer.valueOf(AV460clicodfrom) ,
                                           Integer.valueOf(AV461clicodto) ,
                                           AV464barfecgenfrom ,
                                           AV465barfecgento ,
                                           AV486barfecsalfrom ,
                                           AV487barfecsalto ,
                                           AV482barfecclifrom ,
                                           AV483barfecclito ,
                                           AV484BarFecFprfrom ,
                                           AV485BarFecFprto ,
                                           AV488barserfrom ,
                                           AV489barserto ,
                                           AV492BarColNomfrom ,
                                           AV493BarColNomto ,
                                           Integer.valueOf(AV494BarColNumfrom) ,
                                           Integer.valueOf(AV495BarColNumto) ,
                                           AV496BarNomClifrom ,
                                           AV497BarNomClito ,
                                           Integer.valueOf(AV498BarNumclifrom) ,
                                           Integer.valueOf(AV499barnumclito) ,
                                           Short.valueOf(AV490bartipartfrom) ,
                                           Short.valueOf(AV491bartipartto) ,
                                           AV501muestras ,
                                           Integer.valueOf(AV502barcodfrom) ,
                                           Integer.valueOf(AV503barcodto) ,
                                           Byte.valueOf(AV504barcodreofrom) ,
                                           Byte.valueOf(AV505barcodreoto) ,
                                           AV506barcodparfrom ,
                                           AV507barcodparto ,
                                           AV510Cod_idtx ,
                                           AV513BarGirar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A120BarAgrEst ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A13711BarTipArtD ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Byte.valueOf(A213BarSit) ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A161BarFecSal ,
                                           A2454BarGirar ,
                                           Short.valueOf(A4466BarAcaAnh) ,
                                           A2829BarProPer ,
                                           A4348DisUsrCod ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A3030BarPlf ,
                                           AV65TFBarFasSig_Sel ,
                                           AV64TFBarFasSig ,
                                           A1955BarFasSig ,
                                           Long.valueOf(AV468TFBarAlbUltimo) ,
                                           Long.valueOf(A13930BarAlbUlti) ,
                                           Long.valueOf(AV469TFBarAlbUltimo_To) ,
                                           Integer.valueOf(AV480TFBarAlbFact) ,
                                           Integer.valueOf(A13935BarAlbFact) ,
                                           Integer.valueOf(AV481TFBarAlbFact_To) ,
                                           AV477TFBarNormas_Sel ,
                                           AV476TFBarNormas ,
                                           A13934BarNormas ,
                                           AV462bardisnumfrom ,
                                           A13878PedidoClie ,
                                           AV463bardisnumto ,
                                           Byte.valueOf(AV466barsitfrom) ,
                                           Byte.valueOf(AV467barsitto) ,
                                           AV459Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV64TFBarFasSig = GXutil.padr( GXutil.rtrim( AV64TFBarFasSig), 8, "%") ;
      lV26TFCliNom = GXutil.padr( GXutil.rtrim( AV26TFCliNom), 30, "%") ;
      lV16TFBarNHdr = GXutil.padr( GXutil.rtrim( AV16TFBarNHdr), 11, "%") ;
      lV156TFBarAgrEst = GXutil.padr( GXutil.rtrim( AV156TFBarAgrEst), 1, "%") ;
      lV28TFBarSer = GXutil.padr( GXutil.rtrim( AV28TFBarSer), 16, "%") ;
      lV30TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV30TFBarSerDsc), 26, "%") ;
      lV34TFBarTipArtDsc = GXutil.padr( GXutil.rtrim( AV34TFBarTipArtDsc), 30, "%") ;
      lV36TFBarColNom = GXutil.padr( GXutil.rtrim( AV36TFBarColNom), 13, "%") ;
      lV200TFBarNomCli = GXutil.padr( GXutil.rtrim( AV200TFBarNomCli), 13, "%") ;
      lV324TFBarGirar = GXutil.padr( GXutil.rtrim( AV324TFBarGirar), 20, "%") ;
      lV246TFBarProPer = GXutil.padr( GXutil.rtrim( AV246TFBarProPer), 8, "%") ;
      lV478TFDisUsrCod = GXutil.padr( GXutil.rtrim( AV478TFDisUsrCod), 8, "%") ;
      /* Using cursor P09DR11 */
      pr_default.execute(1, new Object[] {AV459Emprcod, AV65TFBarFasSig_Sel, AV64TFBarFasSig, lV64TFBarFasSig, AV65TFBarFasSig_Sel, AV65TFBarFasSig_Sel, Byte.valueOf(AV466barsitfrom), Byte.valueOf(AV467barsitto), Integer.valueOf(AV24TFCliCod), Integer.valueOf(AV25TFCliCod_To), lV26TFCliNom, AV27TFCliNom_Sel, lV16TFBarNHdr, AV17TFBarNHdr_Sel, lV156TFBarAgrEst, AV157TFBarAgrEst_Sel, lV28TFBarSer, AV29TFBarSer_Sel, lV30TFBarSerDsc, AV31TFBarSerDsc_Sel, Short.valueOf(AV32TFBarTipArt), Short.valueOf(AV33TFBarTipArt_To), lV34TFBarTipArtDsc, AV35TFBarTipArtDsc_Sel, lV36TFBarColNom, AV37TFBarColNom_Sel, Integer.valueOf(AV38TFBarColNum), Integer.valueOf(AV39TFBarColNum_To), lV200TFBarNomCli, AV201TFBarNomCli_Sel, Byte.valueOf(AV124TFBarSit), Byte.valueOf(AV125TFBarSit_To), AV40TFBarFecGen, AV42TFBarFecCli, AV144TFBarFecFpr, AV46TFBarFecSal, lV324TFBarGirar, AV325TFBarGirar_Sel, Short.valueOf(AV372TFBarAcaAnh), Short.valueOf(AV373TFBarAcaAnh_To), lV246TFBarProPer, AV247TFBarProPer_Sel, lV478TFDisUsrCod, AV479TFDisUsrCod_Sel, Integer.valueOf(AV460clicodfrom), Integer.valueOf(AV461clicodto), AV464barfecgenfrom, AV465barfecgento, AV486barfecsalfrom, AV487barfecsalto, AV482barfecclifrom, AV483barfecclito, AV484BarFecFprfrom, AV485BarFecFprto, AV488barserfrom, AV489barserto, AV492BarColNomfrom, AV493BarColNomto, Integer.valueOf(AV494BarColNumfrom), Integer.valueOf(AV495BarColNumto), AV496BarNomClifrom, AV497BarNomClito, Integer.valueOf(AV498BarNumclifrom), Integer.valueOf(AV499barnumclito), Short.valueOf(AV490bartipartfrom), Short.valueOf(AV491bartipartto), AV501muestras, Integer.valueOf(AV502barcodfrom), Integer.valueOf(AV503barcodto), Byte.valueOf(AV504barcodreofrom), Byte.valueOf(AV505barcodreoto), AV506barcodparfrom, AV507barcodparto, AV510Cod_idtx, AV513BarGirar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A3030BarPlf = P09DR11_A3030BarPlf[0] ;
         A1235BarNumCli = P09DR11_A1235BarNumCli[0] ;
         A4348DisUsrCod = P09DR11_A4348DisUsrCod[0] ;
         A2829BarProPer = P09DR11_A2829BarProPer[0] ;
         A4466BarAcaAnh = P09DR11_A4466BarAcaAnh[0] ;
         A2454BarGirar = P09DR11_A2454BarGirar[0] ;
         A161BarFecSal = P09DR11_A161BarFecSal[0] ;
         A158BarFecFpr = P09DR11_A158BarFecFpr[0] ;
         A155BarFecCli = P09DR11_A155BarFecCli[0] ;
         A159BarFecGen = P09DR11_A159BarFecGen[0] ;
         A213BarSit = P09DR11_A213BarSit[0] ;
         A1234BarNomCli = P09DR11_A1234BarNomCli[0] ;
         A136BarColNum = P09DR11_A136BarColNum[0] ;
         A135BarColNom = P09DR11_A135BarColNom[0] ;
         A13711BarTipArtD = P09DR11_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P09DR11_n13711BarTipArtD[0] ;
         A217BarTipArt = P09DR11_A217BarTipArt[0] ;
         n217BarTipArt = P09DR11_n217BarTipArt[0] ;
         A1652BarSerDsc = P09DR11_A1652BarSerDsc[0] ;
         A212BarSer = P09DR11_A212BarSer[0] ;
         A120BarAgrEst = P09DR11_A120BarAgrEst[0] ;
         A279CliNom = P09DR11_A279CliNom[0] ;
         A252CliCod = P09DR11_A252CliCod[0] ;
         n252CliCod = P09DR11_n252CliCod[0] ;
         A1955BarFasSig = P09DR11_A1955BarFasSig[0] ;
         n1955BarFasSig = P09DR11_n1955BarFasSig[0] ;
         A130BarCodPar = P09DR11_A130BarCodPar[0] ;
         A132BarCodReo = P09DR11_A132BarCodReo[0] ;
         A129BarCod = P09DR11_A129BarCod[0] ;
         A361DisCod = P09DR11_A361DisCod[0] ;
         A143BarDisNum = P09DR11_A143BarDisNum[0] ;
         A4812BarEncCli = P09DR11_A4812BarEncCli[0] ;
         A396EmprCod = P09DR11_A396EmprCod[0] ;
         A4348DisUsrCod = P09DR11_A4348DisUsrCod[0] ;
         A13711BarTipArtD = P09DR11_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P09DR11_n13711BarTipArtD[0] ;
         A279CliNom = P09DR11_A279CliNom[0] ;
         A1955BarFasSig = P09DR11_A1955BarFasSig[0] ;
         n1955BarFasSig = P09DR11_n1955BarFasSig[0] ;
         GXt_int2 = A13930BarAlbUlti ;
         GXv_int3[0] = GXt_int2 ;
         new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int3) ;
         consultadeproduccion_wcgetfilterdata.this.GXt_int2 = GXv_int3[0] ;
         A13930BarAlbUlti = GXt_int2 ;
         if ( (0==AV468TFBarAlbUltimo) || ( ( A13930BarAlbUlti >= AV468TFBarAlbUltimo ) ) )
         {
            if ( (0==AV469TFBarAlbUltimo_To) || ( ( A13930BarAlbUlti <= AV469TFBarAlbUltimo_To ) ) )
            {
               GXt_int4 = A13935BarAlbFact ;
               GXv_int5[0] = GXt_int4 ;
               new app.produccion.consultadeproduccion_factura(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int5) ;
               consultadeproduccion_wcgetfilterdata.this.GXt_int4 = GXv_int5[0] ;
               A13935BarAlbFact = GXt_int4 ;
               if ( (0==AV480TFBarAlbFact) || ( ( A13935BarAlbFact >= AV480TFBarAlbFact ) ) )
               {
                  if ( (0==AV481TFBarAlbFact_To) || ( ( A13935BarAlbFact <= AV481TFBarAlbFact_To ) ) )
                  {
                     GXt_char6 = A13934BarNormas ;
                     GXv_char10[0] = GXt_char6 ;
                     new app.produccion.consultadeproduccion_normasestandarstextiles(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char10) ;
                     consultadeproduccion_wcgetfilterdata.this.GXt_char6 = GXv_char10[0] ;
                     A13934BarNormas = GXt_char6 ;
                     if ( ! ( (GXutil.strcmp("", AV477TFBarNormas_Sel)==0) && ( ! (GXutil.strcmp("", AV476TFBarNormas)==0) ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV476TFBarNormas) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV477TFBarNormas_Sel)==0) || ( ( GXutil.strcmp(A13934BarNormas, AV477TFBarNormas_Sel) == 0 ) ) )
                        {
                           GXt_char6 = A13878PedidoClie ;
                           GXv_char10[0] = A396EmprCod ;
                           GXv_char9[0] = A4812BarEncCli ;
                           GXv_char8[0] = A143BarDisNum ;
                           GXv_char7[0] = GXt_char6 ;
                           new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char10, GXv_char9, GXv_char8, GXv_char7) ;
                           consultadeproduccion_wcgetfilterdata.this.A396EmprCod = GXv_char10[0] ;
                           consultadeproduccion_wcgetfilterdata.this.A4812BarEncCli = GXv_char9[0] ;
                           consultadeproduccion_wcgetfilterdata.this.A143BarDisNum = GXv_char8[0] ;
                           consultadeproduccion_wcgetfilterdata.this.GXt_char6 = GXv_char7[0] ;
                           A13878PedidoClie = GXt_char6 ;
                           if ( (GXutil.strcmp("", AV462bardisnumfrom)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV462bardisnumfrom) >= 0 ) ) )
                           {
                              if ( (GXutil.strcmp("", AV463bardisnumto)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV463bardisnumto) <= 0 ) ) )
                              {
                                 A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
                                 if ( ! (GXutil.strcmp("", A13696BarNHdr)==0) )
                                 {
                                    AV444Option = A13696BarNHdr ;
                                    AV443InsertIndex = 1 ;
                                    while ( ( AV443InsertIndex <= AV445Options.size() ) && ( GXutil.strcmp((String)AV445Options.elementAt(-1+AV443InsertIndex), AV444Option) < 0 ) )
                                    {
                                       AV443InsertIndex = (int)(AV443InsertIndex+1) ;
                                    }
                                    if ( ( AV443InsertIndex <= AV445Options.size() ) && ( GXutil.strcmp((String)AV445Options.elementAt(-1+AV443InsertIndex), AV444Option) == 0 ) )
                                    {
                                       AV452count = GXutil.lval( (String)AV450OptionIndexes.elementAt(-1+AV443InsertIndex)) ;
                                       AV452count = (long)(AV452count+1) ;
                                       AV450OptionIndexes.removeItem(AV443InsertIndex);
                                       AV450OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV452count), "Z,ZZZ,ZZZ,ZZ9")), AV443InsertIndex);
                                    }
                                    else
                                    {
                                       AV445Options.add(AV444Option, AV443InsertIndex);
                                       AV450OptionIndexes.add("1", AV443InsertIndex);
                                    }
                                 }
                                 if ( AV445Options.size() == 50 )
                                 {
                                    /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                    if (true) break;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADBARAGRESTOPTIONS' Routine */
      returnInSub = false ;
      AV156TFBarAgrEst = AV440SearchTxt ;
      AV157TFBarAgrEst_Sel = "" ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Integer.valueOf(AV24TFCliCod) ,
                                           Integer.valueOf(AV25TFCliCod_To) ,
                                           AV27TFCliNom_Sel ,
                                           AV26TFCliNom ,
                                           AV17TFBarNHdr_Sel ,
                                           AV16TFBarNHdr ,
                                           AV157TFBarAgrEst_Sel ,
                                           AV156TFBarAgrEst ,
                                           AV29TFBarSer_Sel ,
                                           AV28TFBarSer ,
                                           AV31TFBarSerDsc_Sel ,
                                           AV30TFBarSerDsc ,
                                           Short.valueOf(AV32TFBarTipArt) ,
                                           Short.valueOf(AV33TFBarTipArt_To) ,
                                           AV35TFBarTipArtDsc_Sel ,
                                           AV34TFBarTipArtDsc ,
                                           AV37TFBarColNom_Sel ,
                                           AV36TFBarColNom ,
                                           Integer.valueOf(AV38TFBarColNum) ,
                                           Integer.valueOf(AV39TFBarColNum_To) ,
                                           AV201TFBarNomCli_Sel ,
                                           AV200TFBarNomCli ,
                                           Byte.valueOf(AV124TFBarSit) ,
                                           Byte.valueOf(AV125TFBarSit_To) ,
                                           AV40TFBarFecGen ,
                                           AV42TFBarFecCli ,
                                           AV144TFBarFecFpr ,
                                           AV46TFBarFecSal ,
                                           AV325TFBarGirar_Sel ,
                                           AV324TFBarGirar ,
                                           Short.valueOf(AV372TFBarAcaAnh) ,
                                           Short.valueOf(AV373TFBarAcaAnh_To) ,
                                           AV247TFBarProPer_Sel ,
                                           AV246TFBarProPer ,
                                           AV479TFDisUsrCod_Sel ,
                                           AV478TFDisUsrCod ,
                                           Integer.valueOf(AV460clicodfrom) ,
                                           Integer.valueOf(AV461clicodto) ,
                                           AV464barfecgenfrom ,
                                           AV465barfecgento ,
                                           AV486barfecsalfrom ,
                                           AV487barfecsalto ,
                                           AV482barfecclifrom ,
                                           AV483barfecclito ,
                                           AV484BarFecFprfrom ,
                                           AV485BarFecFprto ,
                                           AV488barserfrom ,
                                           AV489barserto ,
                                           AV492BarColNomfrom ,
                                           AV493BarColNomto ,
                                           Integer.valueOf(AV494BarColNumfrom) ,
                                           Integer.valueOf(AV495BarColNumto) ,
                                           AV496BarNomClifrom ,
                                           AV497BarNomClito ,
                                           Integer.valueOf(AV498BarNumclifrom) ,
                                           Integer.valueOf(AV499barnumclito) ,
                                           Short.valueOf(AV490bartipartfrom) ,
                                           Short.valueOf(AV491bartipartto) ,
                                           AV501muestras ,
                                           Integer.valueOf(AV502barcodfrom) ,
                                           Integer.valueOf(AV503barcodto) ,
                                           Byte.valueOf(AV504barcodreofrom) ,
                                           Byte.valueOf(AV505barcodreoto) ,
                                           AV506barcodparfrom ,
                                           AV507barcodparto ,
                                           AV510Cod_idtx ,
                                           AV513BarGirar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A120BarAgrEst ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A13711BarTipArtD ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Byte.valueOf(A213BarSit) ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A161BarFecSal ,
                                           A2454BarGirar ,
                                           Short.valueOf(A4466BarAcaAnh) ,
                                           A2829BarProPer ,
                                           A4348DisUsrCod ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A3030BarPlf ,
                                           AV65TFBarFasSig_Sel ,
                                           AV64TFBarFasSig ,
                                           A1955BarFasSig ,
                                           Long.valueOf(AV468TFBarAlbUltimo) ,
                                           Long.valueOf(A13930BarAlbUlti) ,
                                           Long.valueOf(AV469TFBarAlbUltimo_To) ,
                                           Integer.valueOf(AV480TFBarAlbFact) ,
                                           Integer.valueOf(A13935BarAlbFact) ,
                                           Integer.valueOf(AV481TFBarAlbFact_To) ,
                                           AV477TFBarNormas_Sel ,
                                           AV476TFBarNormas ,
                                           A13934BarNormas ,
                                           AV462bardisnumfrom ,
                                           A13878PedidoClie ,
                                           AV463bardisnumto ,
                                           Byte.valueOf(AV466barsitfrom) ,
                                           Byte.valueOf(AV467barsitto) ,
                                           A396EmprCod ,
                                           AV459Emprcod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV64TFBarFasSig = GXutil.padr( GXutil.rtrim( AV64TFBarFasSig), 8, "%") ;
      lV26TFCliNom = GXutil.padr( GXutil.rtrim( AV26TFCliNom), 30, "%") ;
      lV16TFBarNHdr = GXutil.padr( GXutil.rtrim( AV16TFBarNHdr), 11, "%") ;
      lV156TFBarAgrEst = GXutil.padr( GXutil.rtrim( AV156TFBarAgrEst), 1, "%") ;
      lV28TFBarSer = GXutil.padr( GXutil.rtrim( AV28TFBarSer), 16, "%") ;
      lV30TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV30TFBarSerDsc), 26, "%") ;
      lV34TFBarTipArtDsc = GXutil.padr( GXutil.rtrim( AV34TFBarTipArtDsc), 30, "%") ;
      lV36TFBarColNom = GXutil.padr( GXutil.rtrim( AV36TFBarColNom), 13, "%") ;
      lV200TFBarNomCli = GXutil.padr( GXutil.rtrim( AV200TFBarNomCli), 13, "%") ;
      lV324TFBarGirar = GXutil.padr( GXutil.rtrim( AV324TFBarGirar), 20, "%") ;
      lV246TFBarProPer = GXutil.padr( GXutil.rtrim( AV246TFBarProPer), 8, "%") ;
      lV478TFDisUsrCod = GXutil.padr( GXutil.rtrim( AV478TFDisUsrCod), 8, "%") ;
      /* Using cursor P09DR16 */
      pr_default.execute(2, new Object[] {AV65TFBarFasSig_Sel, AV64TFBarFasSig, lV64TFBarFasSig, AV65TFBarFasSig_Sel, AV65TFBarFasSig_Sel, Byte.valueOf(AV466barsitfrom), Byte.valueOf(AV467barsitto), AV459Emprcod, Integer.valueOf(AV24TFCliCod), Integer.valueOf(AV25TFCliCod_To), lV26TFCliNom, AV27TFCliNom_Sel, lV16TFBarNHdr, AV17TFBarNHdr_Sel, lV156TFBarAgrEst, AV157TFBarAgrEst_Sel, lV28TFBarSer, AV29TFBarSer_Sel, lV30TFBarSerDsc, AV31TFBarSerDsc_Sel, Short.valueOf(AV32TFBarTipArt), Short.valueOf(AV33TFBarTipArt_To), lV34TFBarTipArtDsc, AV35TFBarTipArtDsc_Sel, lV36TFBarColNom, AV37TFBarColNom_Sel, Integer.valueOf(AV38TFBarColNum), Integer.valueOf(AV39TFBarColNum_To), lV200TFBarNomCli, AV201TFBarNomCli_Sel, Byte.valueOf(AV124TFBarSit), Byte.valueOf(AV125TFBarSit_To), AV40TFBarFecGen, AV42TFBarFecCli, AV144TFBarFecFpr, AV46TFBarFecSal, lV324TFBarGirar, AV325TFBarGirar_Sel, Short.valueOf(AV372TFBarAcaAnh), Short.valueOf(AV373TFBarAcaAnh_To), lV246TFBarProPer, AV247TFBarProPer_Sel, lV478TFDisUsrCod, AV479TFDisUsrCod_Sel, Integer.valueOf(AV460clicodfrom), Integer.valueOf(AV461clicodto), AV464barfecgenfrom, AV465barfecgento, AV486barfecsalfrom, AV487barfecsalto, AV482barfecclifrom, AV483barfecclito, AV484BarFecFprfrom, AV485BarFecFprto, AV488barserfrom, AV489barserto, AV492BarColNomfrom, AV493BarColNomto, Integer.valueOf(AV494BarColNumfrom), Integer.valueOf(AV495BarColNumto), AV496BarNomClifrom, AV497BarNomClito, Integer.valueOf(AV498BarNumclifrom), Integer.valueOf(AV499barnumclito), Short.valueOf(AV490bartipartfrom), Short.valueOf(AV491bartipartto), AV501muestras, Integer.valueOf(AV502barcodfrom), Integer.valueOf(AV503barcodto), Byte.valueOf(AV504barcodreofrom), Byte.valueOf(AV505barcodreoto), AV506barcodparfrom, AV507barcodparto, AV510Cod_idtx, AV513BarGirar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9DR5 = false ;
         A120BarAgrEst = P09DR16_A120BarAgrEst[0] ;
         A3030BarPlf = P09DR16_A3030BarPlf[0] ;
         A1235BarNumCli = P09DR16_A1235BarNumCli[0] ;
         A4348DisUsrCod = P09DR16_A4348DisUsrCod[0] ;
         A2829BarProPer = P09DR16_A2829BarProPer[0] ;
         A4466BarAcaAnh = P09DR16_A4466BarAcaAnh[0] ;
         A2454BarGirar = P09DR16_A2454BarGirar[0] ;
         A161BarFecSal = P09DR16_A161BarFecSal[0] ;
         A158BarFecFpr = P09DR16_A158BarFecFpr[0] ;
         A155BarFecCli = P09DR16_A155BarFecCli[0] ;
         A159BarFecGen = P09DR16_A159BarFecGen[0] ;
         A213BarSit = P09DR16_A213BarSit[0] ;
         A1234BarNomCli = P09DR16_A1234BarNomCli[0] ;
         A136BarColNum = P09DR16_A136BarColNum[0] ;
         A135BarColNom = P09DR16_A135BarColNom[0] ;
         A13711BarTipArtD = P09DR16_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P09DR16_n13711BarTipArtD[0] ;
         A217BarTipArt = P09DR16_A217BarTipArt[0] ;
         n217BarTipArt = P09DR16_n217BarTipArt[0] ;
         A1652BarSerDsc = P09DR16_A1652BarSerDsc[0] ;
         A212BarSer = P09DR16_A212BarSer[0] ;
         A279CliNom = P09DR16_A279CliNom[0] ;
         A252CliCod = P09DR16_A252CliCod[0] ;
         n252CliCod = P09DR16_n252CliCod[0] ;
         A1955BarFasSig = P09DR16_A1955BarFasSig[0] ;
         n1955BarFasSig = P09DR16_n1955BarFasSig[0] ;
         A130BarCodPar = P09DR16_A130BarCodPar[0] ;
         A132BarCodReo = P09DR16_A132BarCodReo[0] ;
         A129BarCod = P09DR16_A129BarCod[0] ;
         A361DisCod = P09DR16_A361DisCod[0] ;
         A143BarDisNum = P09DR16_A143BarDisNum[0] ;
         A4812BarEncCli = P09DR16_A4812BarEncCli[0] ;
         A396EmprCod = P09DR16_A396EmprCod[0] ;
         A4348DisUsrCod = P09DR16_A4348DisUsrCod[0] ;
         A13711BarTipArtD = P09DR16_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P09DR16_n13711BarTipArtD[0] ;
         A279CliNom = P09DR16_A279CliNom[0] ;
         A1955BarFasSig = P09DR16_A1955BarFasSig[0] ;
         n1955BarFasSig = P09DR16_n1955BarFasSig[0] ;
         GXt_int2 = A13930BarAlbUlti ;
         GXv_int3[0] = GXt_int2 ;
         new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int3) ;
         consultadeproduccion_wcgetfilterdata.this.GXt_int2 = GXv_int3[0] ;
         A13930BarAlbUlti = GXt_int2 ;
         if ( (0==AV468TFBarAlbUltimo) || ( ( A13930BarAlbUlti >= AV468TFBarAlbUltimo ) ) )
         {
            if ( (0==AV469TFBarAlbUltimo_To) || ( ( A13930BarAlbUlti <= AV469TFBarAlbUltimo_To ) ) )
            {
               GXt_int4 = A13935BarAlbFact ;
               GXv_int5[0] = GXt_int4 ;
               new app.produccion.consultadeproduccion_factura(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int5) ;
               consultadeproduccion_wcgetfilterdata.this.GXt_int4 = GXv_int5[0] ;
               A13935BarAlbFact = GXt_int4 ;
               if ( (0==AV480TFBarAlbFact) || ( ( A13935BarAlbFact >= AV480TFBarAlbFact ) ) )
               {
                  if ( (0==AV481TFBarAlbFact_To) || ( ( A13935BarAlbFact <= AV481TFBarAlbFact_To ) ) )
                  {
                     GXt_char6 = A13934BarNormas ;
                     GXv_char10[0] = GXt_char6 ;
                     new app.produccion.consultadeproduccion_normasestandarstextiles(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char10) ;
                     consultadeproduccion_wcgetfilterdata.this.GXt_char6 = GXv_char10[0] ;
                     A13934BarNormas = GXt_char6 ;
                     if ( ! ( (GXutil.strcmp("", AV477TFBarNormas_Sel)==0) && ( ! (GXutil.strcmp("", AV476TFBarNormas)==0) ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV476TFBarNormas) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV477TFBarNormas_Sel)==0) || ( ( GXutil.strcmp(A13934BarNormas, AV477TFBarNormas_Sel) == 0 ) ) )
                        {
                           GXt_char6 = A13878PedidoClie ;
                           GXv_char10[0] = A396EmprCod ;
                           GXv_char9[0] = A4812BarEncCli ;
                           GXv_char8[0] = A143BarDisNum ;
                           GXv_char7[0] = GXt_char6 ;
                           new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char10, GXv_char9, GXv_char8, GXv_char7) ;
                           consultadeproduccion_wcgetfilterdata.this.A396EmprCod = GXv_char10[0] ;
                           consultadeproduccion_wcgetfilterdata.this.A4812BarEncCli = GXv_char9[0] ;
                           consultadeproduccion_wcgetfilterdata.this.A143BarDisNum = GXv_char8[0] ;
                           consultadeproduccion_wcgetfilterdata.this.GXt_char6 = GXv_char7[0] ;
                           A13878PedidoClie = GXt_char6 ;
                           if ( (GXutil.strcmp("", AV462bardisnumfrom)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV462bardisnumfrom) >= 0 ) ) )
                           {
                              if ( (GXutil.strcmp("", AV463bardisnumto)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV463bardisnumto) <= 0 ) ) )
                              {
                                 A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
                                 AV452count = 0 ;
                                 while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09DR16_A120BarAgrEst[0], A120BarAgrEst) == 0 ) )
                                 {
                                    brk9DR5 = false ;
                                    A130BarCodPar = P09DR16_A130BarCodPar[0] ;
                                    A132BarCodReo = P09DR16_A132BarCodReo[0] ;
                                    A129BarCod = P09DR16_A129BarCod[0] ;
                                    A396EmprCod = P09DR16_A396EmprCod[0] ;
                                    AV452count = (long)(AV452count+1) ;
                                    brk9DR5 = true ;
                                    pr_default.readNext(2);
                                 }
                                 if ( ! (GXutil.strcmp("", A120BarAgrEst)==0) )
                                 {
                                    AV444Option = A120BarAgrEst ;
                                    AV447OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A120BarAgrEst, "@!"))) ;
                                    AV445Options.add(AV444Option, 0);
                                    AV448OptionsDesc.add(AV447OptionDesc, 0);
                                    AV450OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV452count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                                 }
                                 if ( AV445Options.size() == 50 )
                                 {
                                    /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                    if (true) break;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk9DR5 )
         {
            brk9DR5 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADBARSEROPTIONS' Routine */
      returnInSub = false ;
      AV28TFBarSer = AV440SearchTxt ;
      AV29TFBarSer_Sel = "" ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Integer.valueOf(AV24TFCliCod) ,
                                           Integer.valueOf(AV25TFCliCod_To) ,
                                           AV27TFCliNom_Sel ,
                                           AV26TFCliNom ,
                                           AV17TFBarNHdr_Sel ,
                                           AV16TFBarNHdr ,
                                           AV157TFBarAgrEst_Sel ,
                                           AV156TFBarAgrEst ,
                                           AV29TFBarSer_Sel ,
                                           AV28TFBarSer ,
                                           AV31TFBarSerDsc_Sel ,
                                           AV30TFBarSerDsc ,
                                           Short.valueOf(AV32TFBarTipArt) ,
                                           Short.valueOf(AV33TFBarTipArt_To) ,
                                           AV35TFBarTipArtDsc_Sel ,
                                           AV34TFBarTipArtDsc ,
                                           AV37TFBarColNom_Sel ,
                                           AV36TFBarColNom ,
                                           Integer.valueOf(AV38TFBarColNum) ,
                                           Integer.valueOf(AV39TFBarColNum_To) ,
                                           AV201TFBarNomCli_Sel ,
                                           AV200TFBarNomCli ,
                                           Byte.valueOf(AV124TFBarSit) ,
                                           Byte.valueOf(AV125TFBarSit_To) ,
                                           AV40TFBarFecGen ,
                                           AV42TFBarFecCli ,
                                           AV144TFBarFecFpr ,
                                           AV46TFBarFecSal ,
                                           AV325TFBarGirar_Sel ,
                                           AV324TFBarGirar ,
                                           Short.valueOf(AV372TFBarAcaAnh) ,
                                           Short.valueOf(AV373TFBarAcaAnh_To) ,
                                           AV247TFBarProPer_Sel ,
                                           AV246TFBarProPer ,
                                           AV479TFDisUsrCod_Sel ,
                                           AV478TFDisUsrCod ,
                                           Integer.valueOf(AV460clicodfrom) ,
                                           Integer.valueOf(AV461clicodto) ,
                                           AV464barfecgenfrom ,
                                           AV465barfecgento ,
                                           AV486barfecsalfrom ,
                                           AV487barfecsalto ,
                                           AV482barfecclifrom ,
                                           AV483barfecclito ,
                                           AV484BarFecFprfrom ,
                                           AV485BarFecFprto ,
                                           AV488barserfrom ,
                                           AV489barserto ,
                                           AV492BarColNomfrom ,
                                           AV493BarColNomto ,
                                           Integer.valueOf(AV494BarColNumfrom) ,
                                           Integer.valueOf(AV495BarColNumto) ,
                                           AV496BarNomClifrom ,
                                           AV497BarNomClito ,
                                           Integer.valueOf(AV498BarNumclifrom) ,
                                           Integer.valueOf(AV499barnumclito) ,
                                           Short.valueOf(AV490bartipartfrom) ,
                                           Short.valueOf(AV491bartipartto) ,
                                           AV501muestras ,
                                           Integer.valueOf(AV502barcodfrom) ,
                                           Integer.valueOf(AV503barcodto) ,
                                           Byte.valueOf(AV504barcodreofrom) ,
                                           Byte.valueOf(AV505barcodreoto) ,
                                           AV506barcodparfrom ,
                                           AV507barcodparto ,
                                           AV510Cod_idtx ,
                                           AV513BarGirar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A120BarAgrEst ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A13711BarTipArtD ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Byte.valueOf(A213BarSit) ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A161BarFecSal ,
                                           A2454BarGirar ,
                                           Short.valueOf(A4466BarAcaAnh) ,
                                           A2829BarProPer ,
                                           A4348DisUsrCod ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A3030BarPlf ,
                                           AV65TFBarFasSig_Sel ,
                                           AV64TFBarFasSig ,
                                           A1955BarFasSig ,
                                           Long.valueOf(AV468TFBarAlbUltimo) ,
                                           Long.valueOf(A13930BarAlbUlti) ,
                                           Long.valueOf(AV469TFBarAlbUltimo_To) ,
                                           Integer.valueOf(AV480TFBarAlbFact) ,
                                           Integer.valueOf(A13935BarAlbFact) ,
                                           Integer.valueOf(AV481TFBarAlbFact_To) ,
                                           AV477TFBarNormas_Sel ,
                                           AV476TFBarNormas ,
                                           A13934BarNormas ,
                                           AV462bardisnumfrom ,
                                           A13878PedidoClie ,
                                           AV463bardisnumto ,
                                           Byte.valueOf(AV466barsitfrom) ,
                                           Byte.valueOf(AV467barsitto) ,
                                           AV459Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV64TFBarFasSig = GXutil.padr( GXutil.rtrim( AV64TFBarFasSig), 8, "%") ;
      lV26TFCliNom = GXutil.padr( GXutil.rtrim( AV26TFCliNom), 30, "%") ;
      lV16TFBarNHdr = GXutil.padr( GXutil.rtrim( AV16TFBarNHdr), 11, "%") ;
      lV156TFBarAgrEst = GXutil.padr( GXutil.rtrim( AV156TFBarAgrEst), 1, "%") ;
      lV28TFBarSer = GXutil.padr( GXutil.rtrim( AV28TFBarSer), 16, "%") ;
      lV30TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV30TFBarSerDsc), 26, "%") ;
      lV34TFBarTipArtDsc = GXutil.padr( GXutil.rtrim( AV34TFBarTipArtDsc), 30, "%") ;
      lV36TFBarColNom = GXutil.padr( GXutil.rtrim( AV36TFBarColNom), 13, "%") ;
      lV200TFBarNomCli = GXutil.padr( GXutil.rtrim( AV200TFBarNomCli), 13, "%") ;
      lV324TFBarGirar = GXutil.padr( GXutil.rtrim( AV324TFBarGirar), 20, "%") ;
      lV246TFBarProPer = GXutil.padr( GXutil.rtrim( AV246TFBarProPer), 8, "%") ;
      lV478TFDisUsrCod = GXutil.padr( GXutil.rtrim( AV478TFDisUsrCod), 8, "%") ;
      /* Using cursor P09DR21 */
      pr_default.execute(3, new Object[] {AV459Emprcod, AV65TFBarFasSig_Sel, AV64TFBarFasSig, lV64TFBarFasSig, AV65TFBarFasSig_Sel, AV65TFBarFasSig_Sel, Byte.valueOf(AV466barsitfrom), Byte.valueOf(AV467barsitto), Integer.valueOf(AV24TFCliCod), Integer.valueOf(AV25TFCliCod_To), lV26TFCliNom, AV27TFCliNom_Sel, lV16TFBarNHdr, AV17TFBarNHdr_Sel, lV156TFBarAgrEst, AV157TFBarAgrEst_Sel, lV28TFBarSer, AV29TFBarSer_Sel, lV30TFBarSerDsc, AV31TFBarSerDsc_Sel, Short.valueOf(AV32TFBarTipArt), Short.valueOf(AV33TFBarTipArt_To), lV34TFBarTipArtDsc, AV35TFBarTipArtDsc_Sel, lV36TFBarColNom, AV37TFBarColNom_Sel, Integer.valueOf(AV38TFBarColNum), Integer.valueOf(AV39TFBarColNum_To), lV200TFBarNomCli, AV201TFBarNomCli_Sel, Byte.valueOf(AV124TFBarSit), Byte.valueOf(AV125TFBarSit_To), AV40TFBarFecGen, AV42TFBarFecCli, AV144TFBarFecFpr, AV46TFBarFecSal, lV324TFBarGirar, AV325TFBarGirar_Sel, Short.valueOf(AV372TFBarAcaAnh), Short.valueOf(AV373TFBarAcaAnh_To), lV246TFBarProPer, AV247TFBarProPer_Sel, lV478TFDisUsrCod, AV479TFDisUsrCod_Sel, Integer.valueOf(AV460clicodfrom), Integer.valueOf(AV461clicodto), AV464barfecgenfrom, AV465barfecgento, AV486barfecsalfrom, AV487barfecsalto, AV482barfecclifrom, AV483barfecclito, AV484BarFecFprfrom, AV485BarFecFprto, AV488barserfrom, AV489barserto, AV492BarColNomfrom, AV493BarColNomto, Integer.valueOf(AV494BarColNumfrom), Integer.valueOf(AV495BarColNumto), AV496BarNomClifrom, AV497BarNomClito, Integer.valueOf(AV498BarNumclifrom), Integer.valueOf(AV499barnumclito), Short.valueOf(AV490bartipartfrom), Short.valueOf(AV491bartipartto), AV501muestras, Integer.valueOf(AV502barcodfrom), Integer.valueOf(AV503barcodto), Byte.valueOf(AV504barcodreofrom), Byte.valueOf(AV505barcodreoto), AV506barcodparfrom, AV507barcodparto, AV510Cod_idtx, AV513BarGirar});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9DR7 = false ;
         A212BarSer = P09DR21_A212BarSer[0] ;
         A3030BarPlf = P09DR21_A3030BarPlf[0] ;
         A1235BarNumCli = P09DR21_A1235BarNumCli[0] ;
         A4348DisUsrCod = P09DR21_A4348DisUsrCod[0] ;
         A2829BarProPer = P09DR21_A2829BarProPer[0] ;
         A4466BarAcaAnh = P09DR21_A4466BarAcaAnh[0] ;
         A2454BarGirar = P09DR21_A2454BarGirar[0] ;
         A161BarFecSal = P09DR21_A161BarFecSal[0] ;
         A158BarFecFpr = P09DR21_A158BarFecFpr[0] ;
         A155BarFecCli = P09DR21_A155BarFecCli[0] ;
         A159BarFecGen = P09DR21_A159BarFecGen[0] ;
         A213BarSit = P09DR21_A213BarSit[0] ;
         A1234BarNomCli = P09DR21_A1234BarNomCli[0] ;
         A136BarColNum = P09DR21_A136BarColNum[0] ;
         A135BarColNom = P09DR21_A135BarColNom[0] ;
         A13711BarTipArtD = P09DR21_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P09DR21_n13711BarTipArtD[0] ;
         A217BarTipArt = P09DR21_A217BarTipArt[0] ;
         n217BarTipArt = P09DR21_n217BarTipArt[0] ;
         A1652BarSerDsc = P09DR21_A1652BarSerDsc[0] ;
         A120BarAgrEst = P09DR21_A120BarAgrEst[0] ;
         A279CliNom = P09DR21_A279CliNom[0] ;
         A252CliCod = P09DR21_A252CliCod[0] ;
         n252CliCod = P09DR21_n252CliCod[0] ;
         A1955BarFasSig = P09DR21_A1955BarFasSig[0] ;
         n1955BarFasSig = P09DR21_n1955BarFasSig[0] ;
         A130BarCodPar = P09DR21_A130BarCodPar[0] ;
         A132BarCodReo = P09DR21_A132BarCodReo[0] ;
         A129BarCod = P09DR21_A129BarCod[0] ;
         A361DisCod = P09DR21_A361DisCod[0] ;
         A143BarDisNum = P09DR21_A143BarDisNum[0] ;
         A4812BarEncCli = P09DR21_A4812BarEncCli[0] ;
         A396EmprCod = P09DR21_A396EmprCod[0] ;
         A4348DisUsrCod = P09DR21_A4348DisUsrCod[0] ;
         A13711BarTipArtD = P09DR21_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P09DR21_n13711BarTipArtD[0] ;
         A279CliNom = P09DR21_A279CliNom[0] ;
         A1955BarFasSig = P09DR21_A1955BarFasSig[0] ;
         n1955BarFasSig = P09DR21_n1955BarFasSig[0] ;
         GXt_int2 = A13930BarAlbUlti ;
         GXv_int3[0] = GXt_int2 ;
         new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int3) ;
         consultadeproduccion_wcgetfilterdata.this.GXt_int2 = GXv_int3[0] ;
         A13930BarAlbUlti = GXt_int2 ;
         if ( (0==AV468TFBarAlbUltimo) || ( ( A13930BarAlbUlti >= AV468TFBarAlbUltimo ) ) )
         {
            if ( (0==AV469TFBarAlbUltimo_To) || ( ( A13930BarAlbUlti <= AV469TFBarAlbUltimo_To ) ) )
            {
               GXt_int4 = A13935BarAlbFact ;
               GXv_int5[0] = GXt_int4 ;
               new app.produccion.consultadeproduccion_factura(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int5) ;
               consultadeproduccion_wcgetfilterdata.this.GXt_int4 = GXv_int5[0] ;
               A13935BarAlbFact = GXt_int4 ;
               if ( (0==AV480TFBarAlbFact) || ( ( A13935BarAlbFact >= AV480TFBarAlbFact ) ) )
               {
                  if ( (0==AV481TFBarAlbFact_To) || ( ( A13935BarAlbFact <= AV481TFBarAlbFact_To ) ) )
                  {
                     GXt_char6 = A13934BarNormas ;
                     GXv_char10[0] = GXt_char6 ;
                     new app.produccion.consultadeproduccion_normasestandarstextiles(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char10) ;
                     consultadeproduccion_wcgetfilterdata.this.GXt_char6 = GXv_char10[0] ;
                     A13934BarNormas = GXt_char6 ;
                     if ( ! ( (GXutil.strcmp("", AV477TFBarNormas_Sel)==0) && ( ! (GXutil.strcmp("", AV476TFBarNormas)==0) ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV476TFBarNormas) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV477TFBarNormas_Sel)==0) || ( ( GXutil.strcmp(A13934BarNormas, AV477TFBarNormas_Sel) == 0 ) ) )
                        {
                           GXt_char6 = A13878PedidoClie ;
                           GXv_char10[0] = A396EmprCod ;
                           GXv_char9[0] = A4812BarEncCli ;
                           GXv_char8[0] = A143BarDisNum ;
                           GXv_char7[0] = GXt_char6 ;
                           new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char10, GXv_char9, GXv_char8, GXv_char7) ;
                           consultadeproduccion_wcgetfilterdata.this.A396EmprCod = GXv_char10[0] ;
                           consultadeproduccion_wcgetfilterdata.this.A4812BarEncCli = GXv_char9[0] ;
                           consultadeproduccion_wcgetfilterdata.this.A143BarDisNum = GXv_char8[0] ;
                           consultadeproduccion_wcgetfilterdata.this.GXt_char6 = GXv_char7[0] ;
                           A13878PedidoClie = GXt_char6 ;
                           if ( (GXutil.strcmp("", AV462bardisnumfrom)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV462bardisnumfrom) >= 0 ) ) )
                           {
                              if ( (GXutil.strcmp("", AV463bardisnumto)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV463bardisnumto) <= 0 ) ) )
                              {
                                 A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
                                 AV452count = 0 ;
                                 while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09DR21_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09DR21_A212BarSer[0], A212BarSer) == 0 ) )
                                 {
                                    brk9DR7 = false ;
                                    A130BarCodPar = P09DR21_A130BarCodPar[0] ;
                                    A132BarCodReo = P09DR21_A132BarCodReo[0] ;
                                    A129BarCod = P09DR21_A129BarCod[0] ;
                                    AV452count = (long)(AV452count+1) ;
                                    brk9DR7 = true ;
                                    pr_default.readNext(3);
                                 }
                                 if ( ! (GXutil.strcmp("", A212BarSer)==0) )
                                 {
                                    AV444Option = A212BarSer ;
                                    AV445Options.add(AV444Option, 0);
                                    AV450OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV452count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                                 }
                                 if ( AV445Options.size() == 50 )
                                 {
                                    /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                    if (true) break;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk9DR7 )
         {
            brk9DR7 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADBARSERDSCOPTIONS' Routine */
      returnInSub = false ;
      AV30TFBarSerDsc = AV440SearchTxt ;
      AV31TFBarSerDsc_Sel = "" ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Integer.valueOf(AV24TFCliCod) ,
                                           Integer.valueOf(AV25TFCliCod_To) ,
                                           AV27TFCliNom_Sel ,
                                           AV26TFCliNom ,
                                           AV17TFBarNHdr_Sel ,
                                           AV16TFBarNHdr ,
                                           AV157TFBarAgrEst_Sel ,
                                           AV156TFBarAgrEst ,
                                           AV29TFBarSer_Sel ,
                                           AV28TFBarSer ,
                                           AV31TFBarSerDsc_Sel ,
                                           AV30TFBarSerDsc ,
                                           Short.valueOf(AV32TFBarTipArt) ,
                                           Short.valueOf(AV33TFBarTipArt_To) ,
                                           AV35TFBarTipArtDsc_Sel ,
                                           AV34TFBarTipArtDsc ,
                                           AV37TFBarColNom_Sel ,
                                           AV36TFBarColNom ,
                                           Integer.valueOf(AV38TFBarColNum) ,
                                           Integer.valueOf(AV39TFBarColNum_To) ,
                                           AV201TFBarNomCli_Sel ,
                                           AV200TFBarNomCli ,
                                           Byte.valueOf(AV124TFBarSit) ,
                                           Byte.valueOf(AV125TFBarSit_To) ,
                                           AV40TFBarFecGen ,
                                           AV42TFBarFecCli ,
                                           AV144TFBarFecFpr ,
                                           AV46TFBarFecSal ,
                                           AV325TFBarGirar_Sel ,
                                           AV324TFBarGirar ,
                                           Short.valueOf(AV372TFBarAcaAnh) ,
                                           Short.valueOf(AV373TFBarAcaAnh_To) ,
                                           AV247TFBarProPer_Sel ,
                                           AV246TFBarProPer ,
                                           AV479TFDisUsrCod_Sel ,
                                           AV478TFDisUsrCod ,
                                           Integer.valueOf(AV460clicodfrom) ,
                                           Integer.valueOf(AV461clicodto) ,
                                           AV464barfecgenfrom ,
                                           AV465barfecgento ,
                                           AV486barfecsalfrom ,
                                           AV487barfecsalto ,
                                           AV482barfecclifrom ,
                                           AV483barfecclito ,
                                           AV484BarFecFprfrom ,
                                           AV485BarFecFprto ,
                                           AV488barserfrom ,
                                           AV489barserto ,
                                           AV492BarColNomfrom ,
                                           AV493BarColNomto ,
                                           Integer.valueOf(AV494BarColNumfrom) ,
                                           Integer.valueOf(AV495BarColNumto) ,
                                           AV496BarNomClifrom ,
                                           AV497BarNomClito ,
                                           Integer.valueOf(AV498BarNumclifrom) ,
                                           Integer.valueOf(AV499barnumclito) ,
                                           Short.valueOf(AV490bartipartfrom) ,
                                           Short.valueOf(AV491bartipartto) ,
                                           AV501muestras ,
                                           Integer.valueOf(AV502barcodfrom) ,
                                           Integer.valueOf(AV503barcodto) ,
                                           Byte.valueOf(AV504barcodreofrom) ,
                                           Byte.valueOf(AV505barcodreoto) ,
                                           AV506barcodparfrom ,
                                           AV507barcodparto ,
                                           AV510Cod_idtx ,
                                           AV513BarGirar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A120BarAgrEst ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A13711BarTipArtD ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Byte.valueOf(A213BarSit) ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A161BarFecSal ,
                                           A2454BarGirar ,
                                           Short.valueOf(A4466BarAcaAnh) ,
                                           A2829BarProPer ,
                                           A4348DisUsrCod ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A3030BarPlf ,
                                           AV65TFBarFasSig_Sel ,
                                           AV64TFBarFasSig ,
                                           A1955BarFasSig ,
                                           Long.valueOf(AV468TFBarAlbUltimo) ,
                                           Long.valueOf(A13930BarAlbUlti) ,
                                           Long.valueOf(AV469TFBarAlbUltimo_To) ,
                                           Integer.valueOf(AV480TFBarAlbFact) ,
                                           Integer.valueOf(A13935BarAlbFact) ,
                                           Integer.valueOf(AV481TFBarAlbFact_To) ,
                                           AV477TFBarNormas_Sel ,
                                           AV476TFBarNormas ,
                                           A13934BarNormas ,
                                           AV462bardisnumfrom ,
                                           A13878PedidoClie ,
                                           AV463bardisnumto ,
                                           Byte.valueOf(AV466barsitfrom) ,
                                           Byte.valueOf(AV467barsitto) ,
                                           A396EmprCod ,
                                           AV459Emprcod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV64TFBarFasSig = GXutil.padr( GXutil.rtrim( AV64TFBarFasSig), 8, "%") ;
      lV26TFCliNom = GXutil.padr( GXutil.rtrim( AV26TFCliNom), 30, "%") ;
      lV16TFBarNHdr = GXutil.padr( GXutil.rtrim( AV16TFBarNHdr), 11, "%") ;
      lV156TFBarAgrEst = GXutil.padr( GXutil.rtrim( AV156TFBarAgrEst), 1, "%") ;
      lV28TFBarSer = GXutil.padr( GXutil.rtrim( AV28TFBarSer), 16, "%") ;
      lV30TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV30TFBarSerDsc), 26, "%") ;
      lV34TFBarTipArtDsc = GXutil.padr( GXutil.rtrim( AV34TFBarTipArtDsc), 30, "%") ;
      lV36TFBarColNom = GXutil.padr( GXutil.rtrim( AV36TFBarColNom), 13, "%") ;
      lV200TFBarNomCli = GXutil.padr( GXutil.rtrim( AV200TFBarNomCli), 13, "%") ;
      lV324TFBarGirar = GXutil.padr( GXutil.rtrim( AV324TFBarGirar), 20, "%") ;
      lV246TFBarProPer = GXutil.padr( GXutil.rtrim( AV246TFBarProPer), 8, "%") ;
      lV478TFDisUsrCod = GXutil.padr( GXutil.rtrim( AV478TFDisUsrCod), 8, "%") ;
      /* Using cursor P09DR26 */
      pr_default.execute(4, new Object[] {AV65TFBarFasSig_Sel, AV64TFBarFasSig, lV64TFBarFasSig, AV65TFBarFasSig_Sel, AV65TFBarFasSig_Sel, Byte.valueOf(AV466barsitfrom), Byte.valueOf(AV467barsitto), AV459Emprcod, Integer.valueOf(AV24TFCliCod), Integer.valueOf(AV25TFCliCod_To), lV26TFCliNom, AV27TFCliNom_Sel, lV16TFBarNHdr, AV17TFBarNHdr_Sel, lV156TFBarAgrEst, AV157TFBarAgrEst_Sel, lV28TFBarSer, AV29TFBarSer_Sel, lV30TFBarSerDsc, AV31TFBarSerDsc_Sel, Short.valueOf(AV32TFBarTipArt), Short.valueOf(AV33TFBarTipArt_To), lV34TFBarTipArtDsc, AV35TFBarTipArtDsc_Sel, lV36TFBarColNom, AV37TFBarColNom_Sel, Integer.valueOf(AV38TFBarColNum), Integer.valueOf(AV39TFBarColNum_To), lV200TFBarNomCli, AV201TFBarNomCli_Sel, Byte.valueOf(AV124TFBarSit), Byte.valueOf(AV125TFBarSit_To), AV40TFBarFecGen, AV42TFBarFecCli, AV144TFBarFecFpr, AV46TFBarFecSal, lV324TFBarGirar, AV325TFBarGirar_Sel, Short.valueOf(AV372TFBarAcaAnh), Short.valueOf(AV373TFBarAcaAnh_To), lV246TFBarProPer, AV247TFBarProPer_Sel, lV478TFDisUsrCod, AV479TFDisUsrCod_Sel, Integer.valueOf(AV460clicodfrom), Integer.valueOf(AV461clicodto), AV464barfecgenfrom, AV465barfecgento, AV486barfecsalfrom, AV487barfecsalto, AV482barfecclifrom, AV483barfecclito, AV484BarFecFprfrom, AV485BarFecFprto, AV488barserfrom, AV489barserto, AV492BarColNomfrom, AV493BarColNomto, Integer.valueOf(AV494BarColNumfrom), Integer.valueOf(AV495BarColNumto), AV496BarNomClifrom, AV497BarNomClito, Integer.valueOf(AV498BarNumclifrom), Integer.valueOf(AV499barnumclito), Short.valueOf(AV490bartipartfrom), Short.valueOf(AV491bartipartto), AV501muestras, Integer.valueOf(AV502barcodfrom), Integer.valueOf(AV503barcodto), Byte.valueOf(AV504barcodreofrom), Byte.valueOf(AV505barcodreoto), AV506barcodparfrom, AV507barcodparto, AV510Cod_idtx, AV513BarGirar});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk9DR9 = false ;
         A1652BarSerDsc = P09DR26_A1652BarSerDsc[0] ;
         A3030BarPlf = P09DR26_A3030BarPlf[0] ;
         A1235BarNumCli = P09DR26_A1235BarNumCli[0] ;
         A4348DisUsrCod = P09DR26_A4348DisUsrCod[0] ;
         A2829BarProPer = P09DR26_A2829BarProPer[0] ;
         A4466BarAcaAnh = P09DR26_A4466BarAcaAnh[0] ;
         A2454BarGirar = P09DR26_A2454BarGirar[0] ;
         A161BarFecSal = P09DR26_A161BarFecSal[0] ;
         A158BarFecFpr = P09DR26_A158BarFecFpr[0] ;
         A155BarFecCli = P09DR26_A155BarFecCli[0] ;
         A159BarFecGen = P09DR26_A159BarFecGen[0] ;
         A213BarSit = P09DR26_A213BarSit[0] ;
         A1234BarNomCli = P09DR26_A1234BarNomCli[0] ;
         A136BarColNum = P09DR26_A136BarColNum[0] ;
         A135BarColNom = P09DR26_A135BarColNom[0] ;
         A13711BarTipArtD = P09DR26_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P09DR26_n13711BarTipArtD[0] ;
         A217BarTipArt = P09DR26_A217BarTipArt[0] ;
         n217BarTipArt = P09DR26_n217BarTipArt[0] ;
         A212BarSer = P09DR26_A212BarSer[0] ;
         A120BarAgrEst = P09DR26_A120BarAgrEst[0] ;
         A279CliNom = P09DR26_A279CliNom[0] ;
         A252CliCod = P09DR26_A252CliCod[0] ;
         n252CliCod = P09DR26_n252CliCod[0] ;
         A1955BarFasSig = P09DR26_A1955BarFasSig[0] ;
         n1955BarFasSig = P09DR26_n1955BarFasSig[0] ;
         A130BarCodPar = P09DR26_A130BarCodPar[0] ;
         A132BarCodReo = P09DR26_A132BarCodReo[0] ;
         A129BarCod = P09DR26_A129BarCod[0] ;
         A361DisCod = P09DR26_A361DisCod[0] ;
         A143BarDisNum = P09DR26_A143BarDisNum[0] ;
         A4812BarEncCli = P09DR26_A4812BarEncCli[0] ;
         A396EmprCod = P09DR26_A396EmprCod[0] ;
         A4348DisUsrCod = P09DR26_A4348DisUsrCod[0] ;
         A13711BarTipArtD = P09DR26_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P09DR26_n13711BarTipArtD[0] ;
         A279CliNom = P09DR26_A279CliNom[0] ;
         A1955BarFasSig = P09DR26_A1955BarFasSig[0] ;
         n1955BarFasSig = P09DR26_n1955BarFasSig[0] ;
         GXt_int2 = A13930BarAlbUlti ;
         GXv_int3[0] = GXt_int2 ;
         new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int3) ;
         consultadeproduccion_wcgetfilterdata.this.GXt_int2 = GXv_int3[0] ;
         A13930BarAlbUlti = GXt_int2 ;
         if ( (0==AV468TFBarAlbUltimo) || ( ( A13930BarAlbUlti >= AV468TFBarAlbUltimo ) ) )
         {
            if ( (0==AV469TFBarAlbUltimo_To) || ( ( A13930BarAlbUlti <= AV469TFBarAlbUltimo_To ) ) )
            {
               GXt_int4 = A13935BarAlbFact ;
               GXv_int5[0] = GXt_int4 ;
               new app.produccion.consultadeproduccion_factura(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int5) ;
               consultadeproduccion_wcgetfilterdata.this.GXt_int4 = GXv_int5[0] ;
               A13935BarAlbFact = GXt_int4 ;
               if ( (0==AV480TFBarAlbFact) || ( ( A13935BarAlbFact >= AV480TFBarAlbFact ) ) )
               {
                  if ( (0==AV481TFBarAlbFact_To) || ( ( A13935BarAlbFact <= AV481TFBarAlbFact_To ) ) )
                  {
                     GXt_char6 = A13934BarNormas ;
                     GXv_char10[0] = GXt_char6 ;
                     new app.produccion.consultadeproduccion_normasestandarstextiles(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char10) ;
                     consultadeproduccion_wcgetfilterdata.this.GXt_char6 = GXv_char10[0] ;
                     A13934BarNormas = GXt_char6 ;
                     if ( ! ( (GXutil.strcmp("", AV477TFBarNormas_Sel)==0) && ( ! (GXutil.strcmp("", AV476TFBarNormas)==0) ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV476TFBarNormas) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV477TFBarNormas_Sel)==0) || ( ( GXutil.strcmp(A13934BarNormas, AV477TFBarNormas_Sel) == 0 ) ) )
                        {
                           GXt_char6 = A13878PedidoClie ;
                           GXv_char10[0] = A396EmprCod ;
                           GXv_char9[0] = A4812BarEncCli ;
                           GXv_char8[0] = A143BarDisNum ;
                           GXv_char7[0] = GXt_char6 ;
                           new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char10, GXv_char9, GXv_char8, GXv_char7) ;
                           consultadeproduccion_wcgetfilterdata.this.A396EmprCod = GXv_char10[0] ;
                           consultadeproduccion_wcgetfilterdata.this.A4812BarEncCli = GXv_char9[0] ;
                           consultadeproduccion_wcgetfilterdata.this.A143BarDisNum = GXv_char8[0] ;
                           consultadeproduccion_wcgetfilterdata.this.GXt_char6 = GXv_char7[0] ;
                           A13878PedidoClie = GXt_char6 ;
                           if ( (GXutil.strcmp("", AV462bardisnumfrom)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV462bardisnumfrom) >= 0 ) ) )
                           {
                              if ( (GXutil.strcmp("", AV463bardisnumto)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV463bardisnumto) <= 0 ) ) )
                              {
                                 A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
                                 AV452count = 0 ;
                                 while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P09DR26_A1652BarSerDsc[0], A1652BarSerDsc) == 0 ) )
                                 {
                                    brk9DR9 = false ;
                                    A130BarCodPar = P09DR26_A130BarCodPar[0] ;
                                    A132BarCodReo = P09DR26_A132BarCodReo[0] ;
                                    A129BarCod = P09DR26_A129BarCod[0] ;
                                    A396EmprCod = P09DR26_A396EmprCod[0] ;
                                    AV452count = (long)(AV452count+1) ;
                                    brk9DR9 = true ;
                                    pr_default.readNext(4);
                                 }
                                 if ( ! (GXutil.strcmp("", A1652BarSerDsc)==0) )
                                 {
                                    AV444Option = A1652BarSerDsc ;
                                    AV445Options.add(AV444Option, 0);
                                    AV450OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV452count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                                 }
                                 if ( AV445Options.size() == 50 )
                                 {
                                    /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                    if (true) break;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk9DR9 )
         {
            brk9DR9 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADBARTIPARTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV34TFBarTipArtDsc = AV440SearchTxt ;
      AV35TFBarTipArtDsc_Sel = "" ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           Integer.valueOf(AV24TFCliCod) ,
                                           Integer.valueOf(AV25TFCliCod_To) ,
                                           AV27TFCliNom_Sel ,
                                           AV26TFCliNom ,
                                           AV17TFBarNHdr_Sel ,
                                           AV16TFBarNHdr ,
                                           AV157TFBarAgrEst_Sel ,
                                           AV156TFBarAgrEst ,
                                           AV29TFBarSer_Sel ,
                                           AV28TFBarSer ,
                                           AV31TFBarSerDsc_Sel ,
                                           AV30TFBarSerDsc ,
                                           Short.valueOf(AV32TFBarTipArt) ,
                                           Short.valueOf(AV33TFBarTipArt_To) ,
                                           AV35TFBarTipArtDsc_Sel ,
                                           AV34TFBarTipArtDsc ,
                                           AV37TFBarColNom_Sel ,
                                           AV36TFBarColNom ,
                                           Integer.valueOf(AV38TFBarColNum) ,
                                           Integer.valueOf(AV39TFBarColNum_To) ,
                                           AV201TFBarNomCli_Sel ,
                                           AV200TFBarNomCli ,
                                           Byte.valueOf(AV124TFBarSit) ,
                                           Byte.valueOf(AV125TFBarSit_To) ,
                                           AV40TFBarFecGen ,
                                           AV42TFBarFecCli ,
                                           AV144TFBarFecFpr ,
                                           AV46TFBarFecSal ,
                                           AV325TFBarGirar_Sel ,
                                           AV324TFBarGirar ,
                                           Short.valueOf(AV372TFBarAcaAnh) ,
                                           Short.valueOf(AV373TFBarAcaAnh_To) ,
                                           AV247TFBarProPer_Sel ,
                                           AV246TFBarProPer ,
                                           AV479TFDisUsrCod_Sel ,
                                           AV478TFDisUsrCod ,
                                           Integer.valueOf(AV460clicodfrom) ,
                                           Integer.valueOf(AV461clicodto) ,
                                           AV464barfecgenfrom ,
                                           AV465barfecgento ,
                                           AV486barfecsalfrom ,
                                           AV487barfecsalto ,
                                           AV482barfecclifrom ,
                                           AV483barfecclito ,
                                           AV484BarFecFprfrom ,
                                           AV485BarFecFprto ,
                                           AV488barserfrom ,
                                           AV489barserto ,
                                           AV492BarColNomfrom ,
                                           AV493BarColNomto ,
                                           Integer.valueOf(AV494BarColNumfrom) ,
                                           Integer.valueOf(AV495BarColNumto) ,
                                           AV496BarNomClifrom ,
                                           AV497BarNomClito ,
                                           Integer.valueOf(AV498BarNumclifrom) ,
                                           Integer.valueOf(AV499barnumclito) ,
                                           Short.valueOf(AV490bartipartfrom) ,
                                           Short.valueOf(AV491bartipartto) ,
                                           AV501muestras ,
                                           Integer.valueOf(AV502barcodfrom) ,
                                           Integer.valueOf(AV503barcodto) ,
                                           Byte.valueOf(AV504barcodreofrom) ,
                                           Byte.valueOf(AV505barcodreoto) ,
                                           AV506barcodparfrom ,
                                           AV507barcodparto ,
                                           AV510Cod_idtx ,
                                           AV513BarGirar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A120BarAgrEst ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A13711BarTipArtD ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Byte.valueOf(A213BarSit) ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A161BarFecSal ,
                                           A2454BarGirar ,
                                           Short.valueOf(A4466BarAcaAnh) ,
                                           A2829BarProPer ,
                                           A4348DisUsrCod ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A3030BarPlf ,
                                           AV65TFBarFasSig_Sel ,
                                           AV64TFBarFasSig ,
                                           A1955BarFasSig ,
                                           Long.valueOf(AV468TFBarAlbUltimo) ,
                                           Long.valueOf(A13930BarAlbUlti) ,
                                           Long.valueOf(AV469TFBarAlbUltimo_To) ,
                                           Integer.valueOf(AV480TFBarAlbFact) ,
                                           Integer.valueOf(A13935BarAlbFact) ,
                                           Integer.valueOf(AV481TFBarAlbFact_To) ,
                                           AV477TFBarNormas_Sel ,
                                           AV476TFBarNormas ,
                                           A13934BarNormas ,
                                           AV462bardisnumfrom ,
                                           A13878PedidoClie ,
                                           AV463bardisnumto ,
                                           Byte.valueOf(AV466barsitfrom) ,
                                           Byte.valueOf(AV467barsitto) ,
                                           AV459Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV64TFBarFasSig = GXutil.padr( GXutil.rtrim( AV64TFBarFasSig), 8, "%") ;
      lV26TFCliNom = GXutil.padr( GXutil.rtrim( AV26TFCliNom), 30, "%") ;
      lV16TFBarNHdr = GXutil.padr( GXutil.rtrim( AV16TFBarNHdr), 11, "%") ;
      lV156TFBarAgrEst = GXutil.padr( GXutil.rtrim( AV156TFBarAgrEst), 1, "%") ;
      lV28TFBarSer = GXutil.padr( GXutil.rtrim( AV28TFBarSer), 16, "%") ;
      lV30TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV30TFBarSerDsc), 26, "%") ;
      lV34TFBarTipArtDsc = GXutil.padr( GXutil.rtrim( AV34TFBarTipArtDsc), 30, "%") ;
      lV36TFBarColNom = GXutil.padr( GXutil.rtrim( AV36TFBarColNom), 13, "%") ;
      lV200TFBarNomCli = GXutil.padr( GXutil.rtrim( AV200TFBarNomCli), 13, "%") ;
      lV324TFBarGirar = GXutil.padr( GXutil.rtrim( AV324TFBarGirar), 20, "%") ;
      lV246TFBarProPer = GXutil.padr( GXutil.rtrim( AV246TFBarProPer), 8, "%") ;
      lV478TFDisUsrCod = GXutil.padr( GXutil.rtrim( AV478TFDisUsrCod), 8, "%") ;
      /* Using cursor P09DR31 */
      pr_default.execute(5, new Object[] {AV459Emprcod, AV65TFBarFasSig_Sel, AV64TFBarFasSig, lV64TFBarFasSig, AV65TFBarFasSig_Sel, AV65TFBarFasSig_Sel, Byte.valueOf(AV466barsitfrom), Byte.valueOf(AV467barsitto), Integer.valueOf(AV24TFCliCod), Integer.valueOf(AV25TFCliCod_To), lV26TFCliNom, AV27TFCliNom_Sel, lV16TFBarNHdr, AV17TFBarNHdr_Sel, lV156TFBarAgrEst, AV157TFBarAgrEst_Sel, lV28TFBarSer, AV29TFBarSer_Sel, lV30TFBarSerDsc, AV31TFBarSerDsc_Sel, Short.valueOf(AV32TFBarTipArt), Short.valueOf(AV33TFBarTipArt_To), lV34TFBarTipArtDsc, AV35TFBarTipArtDsc_Sel, lV36TFBarColNom, AV37TFBarColNom_Sel, Integer.valueOf(AV38TFBarColNum), Integer.valueOf(AV39TFBarColNum_To), lV200TFBarNomCli, AV201TFBarNomCli_Sel, Byte.valueOf(AV124TFBarSit), Byte.valueOf(AV125TFBarSit_To), AV40TFBarFecGen, AV42TFBarFecCli, AV144TFBarFecFpr, AV46TFBarFecSal, lV324TFBarGirar, AV325TFBarGirar_Sel, Short.valueOf(AV372TFBarAcaAnh), Short.valueOf(AV373TFBarAcaAnh_To), lV246TFBarProPer, AV247TFBarProPer_Sel, lV478TFDisUsrCod, AV479TFDisUsrCod_Sel, Integer.valueOf(AV460clicodfrom), Integer.valueOf(AV461clicodto), AV464barfecgenfrom, AV465barfecgento, AV486barfecsalfrom, AV487barfecsalto, AV482barfecclifrom, AV483barfecclito, AV484BarFecFprfrom, AV485BarFecFprto, AV488barserfrom, AV489barserto, AV492BarColNomfrom, AV493BarColNomto, Integer.valueOf(AV494BarColNumfrom), Integer.valueOf(AV495BarColNumto), AV496BarNomClifrom, AV497BarNomClito, Integer.valueOf(AV498BarNumclifrom), Integer.valueOf(AV499barnumclito), Short.valueOf(AV490bartipartfrom), Short.valueOf(AV491bartipartto), AV501muestras, Integer.valueOf(AV502barcodfrom), Integer.valueOf(AV503barcodto), Byte.valueOf(AV504barcodreofrom), Byte.valueOf(AV505barcodreoto), AV506barcodparfrom, AV507barcodparto, AV510Cod_idtx, AV513BarGirar});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk9DR11 = false ;
         A217BarTipArt = P09DR31_A217BarTipArt[0] ;
         n217BarTipArt = P09DR31_n217BarTipArt[0] ;
         A3030BarPlf = P09DR31_A3030BarPlf[0] ;
         A1235BarNumCli = P09DR31_A1235BarNumCli[0] ;
         A4348DisUsrCod = P09DR31_A4348DisUsrCod[0] ;
         A2829BarProPer = P09DR31_A2829BarProPer[0] ;
         A4466BarAcaAnh = P09DR31_A4466BarAcaAnh[0] ;
         A2454BarGirar = P09DR31_A2454BarGirar[0] ;
         A161BarFecSal = P09DR31_A161BarFecSal[0] ;
         A158BarFecFpr = P09DR31_A158BarFecFpr[0] ;
         A155BarFecCli = P09DR31_A155BarFecCli[0] ;
         A159BarFecGen = P09DR31_A159BarFecGen[0] ;
         A213BarSit = P09DR31_A213BarSit[0] ;
         A1234BarNomCli = P09DR31_A1234BarNomCli[0] ;
         A136BarColNum = P09DR31_A136BarColNum[0] ;
         A135BarColNom = P09DR31_A135BarColNom[0] ;
         A13711BarTipArtD = P09DR31_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P09DR31_n13711BarTipArtD[0] ;
         A1652BarSerDsc = P09DR31_A1652BarSerDsc[0] ;
         A212BarSer = P09DR31_A212BarSer[0] ;
         A120BarAgrEst = P09DR31_A120BarAgrEst[0] ;
         A279CliNom = P09DR31_A279CliNom[0] ;
         A252CliCod = P09DR31_A252CliCod[0] ;
         n252CliCod = P09DR31_n252CliCod[0] ;
         A1955BarFasSig = P09DR31_A1955BarFasSig[0] ;
         n1955BarFasSig = P09DR31_n1955BarFasSig[0] ;
         A130BarCodPar = P09DR31_A130BarCodPar[0] ;
         A132BarCodReo = P09DR31_A132BarCodReo[0] ;
         A129BarCod = P09DR31_A129BarCod[0] ;
         A361DisCod = P09DR31_A361DisCod[0] ;
         A143BarDisNum = P09DR31_A143BarDisNum[0] ;
         A4812BarEncCli = P09DR31_A4812BarEncCli[0] ;
         A396EmprCod = P09DR31_A396EmprCod[0] ;
         A4348DisUsrCod = P09DR31_A4348DisUsrCod[0] ;
         A13711BarTipArtD = P09DR31_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P09DR31_n13711BarTipArtD[0] ;
         A279CliNom = P09DR31_A279CliNom[0] ;
         A1955BarFasSig = P09DR31_A1955BarFasSig[0] ;
         n1955BarFasSig = P09DR31_n1955BarFasSig[0] ;
         GXt_int2 = A13930BarAlbUlti ;
         GXv_int3[0] = GXt_int2 ;
         new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int3) ;
         consultadeproduccion_wcgetfilterdata.this.GXt_int2 = GXv_int3[0] ;
         A13930BarAlbUlti = GXt_int2 ;
         if ( (0==AV468TFBarAlbUltimo) || ( ( A13930BarAlbUlti >= AV468TFBarAlbUltimo ) ) )
         {
            if ( (0==AV469TFBarAlbUltimo_To) || ( ( A13930BarAlbUlti <= AV469TFBarAlbUltimo_To ) ) )
            {
               GXt_int4 = A13935BarAlbFact ;
               GXv_int5[0] = GXt_int4 ;
               new app.produccion.consultadeproduccion_factura(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int5) ;
               consultadeproduccion_wcgetfilterdata.this.GXt_int4 = GXv_int5[0] ;
               A13935BarAlbFact = GXt_int4 ;
               if ( (0==AV480TFBarAlbFact) || ( ( A13935BarAlbFact >= AV480TFBarAlbFact ) ) )
               {
                  if ( (0==AV481TFBarAlbFact_To) || ( ( A13935BarAlbFact <= AV481TFBarAlbFact_To ) ) )
                  {
                     GXt_char6 = A13934BarNormas ;
                     GXv_char10[0] = GXt_char6 ;
                     new app.produccion.consultadeproduccion_normasestandarstextiles(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char10) ;
                     consultadeproduccion_wcgetfilterdata.this.GXt_char6 = GXv_char10[0] ;
                     A13934BarNormas = GXt_char6 ;
                     if ( ! ( (GXutil.strcmp("", AV477TFBarNormas_Sel)==0) && ( ! (GXutil.strcmp("", AV476TFBarNormas)==0) ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV476TFBarNormas) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV477TFBarNormas_Sel)==0) || ( ( GXutil.strcmp(A13934BarNormas, AV477TFBarNormas_Sel) == 0 ) ) )
                        {
                           GXt_char6 = A13878PedidoClie ;
                           GXv_char10[0] = A396EmprCod ;
                           GXv_char9[0] = A4812BarEncCli ;
                           GXv_char8[0] = A143BarDisNum ;
                           GXv_char7[0] = GXt_char6 ;
                           new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char10, GXv_char9, GXv_char8, GXv_char7) ;
                           consultadeproduccion_wcgetfilterdata.this.A396EmprCod = GXv_char10[0] ;
                           consultadeproduccion_wcgetfilterdata.this.A4812BarEncCli = GXv_char9[0] ;
                           consultadeproduccion_wcgetfilterdata.this.A143BarDisNum = GXv_char8[0] ;
                           consultadeproduccion_wcgetfilterdata.this.GXt_char6 = GXv_char7[0] ;
                           A13878PedidoClie = GXt_char6 ;
                           if ( (GXutil.strcmp("", AV462bardisnumfrom)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV462bardisnumfrom) >= 0 ) ) )
                           {
                              if ( (GXutil.strcmp("", AV463bardisnumto)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV463bardisnumto) <= 0 ) ) )
                              {
                                 A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
                                 AV452count = 0 ;
                                 while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P09DR31_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09DR31_A217BarTipArt[0] == A217BarTipArt ) )
                                 {
                                    brk9DR11 = false ;
                                    A130BarCodPar = P09DR31_A130BarCodPar[0] ;
                                    A132BarCodReo = P09DR31_A132BarCodReo[0] ;
                                    A129BarCod = P09DR31_A129BarCod[0] ;
                                    AV452count = (long)(AV452count+1) ;
                                    brk9DR11 = true ;
                                    pr_default.readNext(5);
                                 }
                                 if ( ! (GXutil.strcmp("", A13711BarTipArtD)==0) )
                                 {
                                    AV444Option = A13711BarTipArtD ;
                                    AV443InsertIndex = 1 ;
                                    while ( ( AV443InsertIndex <= AV445Options.size() ) && ( GXutil.strcmp((String)AV445Options.elementAt(-1+AV443InsertIndex), AV444Option) < 0 ) )
                                    {
                                       AV443InsertIndex = (int)(AV443InsertIndex+1) ;
                                    }
                                    AV445Options.add(AV444Option, AV443InsertIndex);
                                    AV450OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV452count), "Z,ZZZ,ZZZ,ZZ9")), AV443InsertIndex);
                                 }
                                 if ( AV445Options.size() == 50 )
                                 {
                                    /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                    if (true) break;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk9DR11 )
         {
            brk9DR11 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADBARCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV36TFBarColNom = AV440SearchTxt ;
      AV37TFBarColNom_Sel = "" ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           Integer.valueOf(AV24TFCliCod) ,
                                           Integer.valueOf(AV25TFCliCod_To) ,
                                           AV27TFCliNom_Sel ,
                                           AV26TFCliNom ,
                                           AV17TFBarNHdr_Sel ,
                                           AV16TFBarNHdr ,
                                           AV157TFBarAgrEst_Sel ,
                                           AV156TFBarAgrEst ,
                                           AV29TFBarSer_Sel ,
                                           AV28TFBarSer ,
                                           AV31TFBarSerDsc_Sel ,
                                           AV30TFBarSerDsc ,
                                           Short.valueOf(AV32TFBarTipArt) ,
                                           Short.valueOf(AV33TFBarTipArt_To) ,
                                           AV35TFBarTipArtDsc_Sel ,
                                           AV34TFBarTipArtDsc ,
                                           AV37TFBarColNom_Sel ,
                                           AV36TFBarColNom ,
                                           Integer.valueOf(AV38TFBarColNum) ,
                                           Integer.valueOf(AV39TFBarColNum_To) ,
                                           AV201TFBarNomCli_Sel ,
                                           AV200TFBarNomCli ,
                                           Byte.valueOf(AV124TFBarSit) ,
                                           Byte.valueOf(AV125TFBarSit_To) ,
                                           AV40TFBarFecGen ,
                                           AV42TFBarFecCli ,
                                           AV144TFBarFecFpr ,
                                           AV46TFBarFecSal ,
                                           AV325TFBarGirar_Sel ,
                                           AV324TFBarGirar ,
                                           Short.valueOf(AV372TFBarAcaAnh) ,
                                           Short.valueOf(AV373TFBarAcaAnh_To) ,
                                           AV247TFBarProPer_Sel ,
                                           AV246TFBarProPer ,
                                           AV479TFDisUsrCod_Sel ,
                                           AV478TFDisUsrCod ,
                                           Integer.valueOf(AV460clicodfrom) ,
                                           Integer.valueOf(AV461clicodto) ,
                                           AV464barfecgenfrom ,
                                           AV465barfecgento ,
                                           AV486barfecsalfrom ,
                                           AV487barfecsalto ,
                                           AV482barfecclifrom ,
                                           AV483barfecclito ,
                                           AV484BarFecFprfrom ,
                                           AV485BarFecFprto ,
                                           AV488barserfrom ,
                                           AV489barserto ,
                                           AV492BarColNomfrom ,
                                           AV493BarColNomto ,
                                           Integer.valueOf(AV494BarColNumfrom) ,
                                           Integer.valueOf(AV495BarColNumto) ,
                                           AV496BarNomClifrom ,
                                           AV497BarNomClito ,
                                           Integer.valueOf(AV498BarNumclifrom) ,
                                           Integer.valueOf(AV499barnumclito) ,
                                           Short.valueOf(AV490bartipartfrom) ,
                                           Short.valueOf(AV491bartipartto) ,
                                           AV501muestras ,
                                           Integer.valueOf(AV502barcodfrom) ,
                                           Integer.valueOf(AV503barcodto) ,
                                           Byte.valueOf(AV504barcodreofrom) ,
                                           Byte.valueOf(AV505barcodreoto) ,
                                           AV506barcodparfrom ,
                                           AV507barcodparto ,
                                           AV510Cod_idtx ,
                                           AV513BarGirar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A120BarAgrEst ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A13711BarTipArtD ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Byte.valueOf(A213BarSit) ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A161BarFecSal ,
                                           A2454BarGirar ,
                                           Short.valueOf(A4466BarAcaAnh) ,
                                           A2829BarProPer ,
                                           A4348DisUsrCod ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A3030BarPlf ,
                                           AV65TFBarFasSig_Sel ,
                                           AV64TFBarFasSig ,
                                           A1955BarFasSig ,
                                           Long.valueOf(AV468TFBarAlbUltimo) ,
                                           Long.valueOf(A13930BarAlbUlti) ,
                                           Long.valueOf(AV469TFBarAlbUltimo_To) ,
                                           Integer.valueOf(AV480TFBarAlbFact) ,
                                           Integer.valueOf(A13935BarAlbFact) ,
                                           Integer.valueOf(AV481TFBarAlbFact_To) ,
                                           AV477TFBarNormas_Sel ,
                                           AV476TFBarNormas ,
                                           A13934BarNormas ,
                                           AV462bardisnumfrom ,
                                           A13878PedidoClie ,
                                           AV463bardisnumto ,
                                           Byte.valueOf(AV466barsitfrom) ,
                                           Byte.valueOf(AV467barsitto) ,
                                           A396EmprCod ,
                                           AV459Emprcod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV64TFBarFasSig = GXutil.padr( GXutil.rtrim( AV64TFBarFasSig), 8, "%") ;
      lV26TFCliNom = GXutil.padr( GXutil.rtrim( AV26TFCliNom), 30, "%") ;
      lV16TFBarNHdr = GXutil.padr( GXutil.rtrim( AV16TFBarNHdr), 11, "%") ;
      lV156TFBarAgrEst = GXutil.padr( GXutil.rtrim( AV156TFBarAgrEst), 1, "%") ;
      lV28TFBarSer = GXutil.padr( GXutil.rtrim( AV28TFBarSer), 16, "%") ;
      lV30TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV30TFBarSerDsc), 26, "%") ;
      lV34TFBarTipArtDsc = GXutil.padr( GXutil.rtrim( AV34TFBarTipArtDsc), 30, "%") ;
      lV36TFBarColNom = GXutil.padr( GXutil.rtrim( AV36TFBarColNom), 13, "%") ;
      lV200TFBarNomCli = GXutil.padr( GXutil.rtrim( AV200TFBarNomCli), 13, "%") ;
      lV324TFBarGirar = GXutil.padr( GXutil.rtrim( AV324TFBarGirar), 20, "%") ;
      lV246TFBarProPer = GXutil.padr( GXutil.rtrim( AV246TFBarProPer), 8, "%") ;
      lV478TFDisUsrCod = GXutil.padr( GXutil.rtrim( AV478TFDisUsrCod), 8, "%") ;
      /* Using cursor P09DR36 */
      pr_default.execute(6, new Object[] {AV65TFBarFasSig_Sel, AV64TFBarFasSig, lV64TFBarFasSig, AV65TFBarFasSig_Sel, AV65TFBarFasSig_Sel, Byte.valueOf(AV466barsitfrom), Byte.valueOf(AV467barsitto), AV459Emprcod, Integer.valueOf(AV24TFCliCod), Integer.valueOf(AV25TFCliCod_To), lV26TFCliNom, AV27TFCliNom_Sel, lV16TFBarNHdr, AV17TFBarNHdr_Sel, lV156TFBarAgrEst, AV157TFBarAgrEst_Sel, lV28TFBarSer, AV29TFBarSer_Sel, lV30TFBarSerDsc, AV31TFBarSerDsc_Sel, Short.valueOf(AV32TFBarTipArt), Short.valueOf(AV33TFBarTipArt_To), lV34TFBarTipArtDsc, AV35TFBarTipArtDsc_Sel, lV36TFBarColNom, AV37TFBarColNom_Sel, Integer.valueOf(AV38TFBarColNum), Integer.valueOf(AV39TFBarColNum_To), lV200TFBarNomCli, AV201TFBarNomCli_Sel, Byte.valueOf(AV124TFBarSit), Byte.valueOf(AV125TFBarSit_To), AV40TFBarFecGen, AV42TFBarFecCli, AV144TFBarFecFpr, AV46TFBarFecSal, lV324TFBarGirar, AV325TFBarGirar_Sel, Short.valueOf(AV372TFBarAcaAnh), Short.valueOf(AV373TFBarAcaAnh_To), lV246TFBarProPer, AV247TFBarProPer_Sel, lV478TFDisUsrCod, AV479TFDisUsrCod_Sel, Integer.valueOf(AV460clicodfrom), Integer.valueOf(AV461clicodto), AV464barfecgenfrom, AV465barfecgento, AV486barfecsalfrom, AV487barfecsalto, AV482barfecclifrom, AV483barfecclito, AV484BarFecFprfrom, AV485BarFecFprto, AV488barserfrom, AV489barserto, AV492BarColNomfrom, AV493BarColNomto, Integer.valueOf(AV494BarColNumfrom), Integer.valueOf(AV495BarColNumto), AV496BarNomClifrom, AV497BarNomClito, Integer.valueOf(AV498BarNumclifrom), Integer.valueOf(AV499barnumclito), Short.valueOf(AV490bartipartfrom), Short.valueOf(AV491bartipartto), AV501muestras, Integer.valueOf(AV502barcodfrom), Integer.valueOf(AV503barcodto), Byte.valueOf(AV504barcodreofrom), Byte.valueOf(AV505barcodreoto), AV506barcodparfrom, AV507barcodparto, AV510Cod_idtx, AV513BarGirar});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk9DR13 = false ;
         A135BarColNom = P09DR36_A135BarColNom[0] ;
         A3030BarPlf = P09DR36_A3030BarPlf[0] ;
         A1235BarNumCli = P09DR36_A1235BarNumCli[0] ;
         A4348DisUsrCod = P09DR36_A4348DisUsrCod[0] ;
         A2829BarProPer = P09DR36_A2829BarProPer[0] ;
         A4466BarAcaAnh = P09DR36_A4466BarAcaAnh[0] ;
         A2454BarGirar = P09DR36_A2454BarGirar[0] ;
         A161BarFecSal = P09DR36_A161BarFecSal[0] ;
         A158BarFecFpr = P09DR36_A158BarFecFpr[0] ;
         A155BarFecCli = P09DR36_A155BarFecCli[0] ;
         A159BarFecGen = P09DR36_A159BarFecGen[0] ;
         A213BarSit = P09DR36_A213BarSit[0] ;
         A1234BarNomCli = P09DR36_A1234BarNomCli[0] ;
         A136BarColNum = P09DR36_A136BarColNum[0] ;
         A13711BarTipArtD = P09DR36_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P09DR36_n13711BarTipArtD[0] ;
         A217BarTipArt = P09DR36_A217BarTipArt[0] ;
         n217BarTipArt = P09DR36_n217BarTipArt[0] ;
         A1652BarSerDsc = P09DR36_A1652BarSerDsc[0] ;
         A212BarSer = P09DR36_A212BarSer[0] ;
         A120BarAgrEst = P09DR36_A120BarAgrEst[0] ;
         A279CliNom = P09DR36_A279CliNom[0] ;
         A252CliCod = P09DR36_A252CliCod[0] ;
         n252CliCod = P09DR36_n252CliCod[0] ;
         A1955BarFasSig = P09DR36_A1955BarFasSig[0] ;
         n1955BarFasSig = P09DR36_n1955BarFasSig[0] ;
         A130BarCodPar = P09DR36_A130BarCodPar[0] ;
         A132BarCodReo = P09DR36_A132BarCodReo[0] ;
         A129BarCod = P09DR36_A129BarCod[0] ;
         A361DisCod = P09DR36_A361DisCod[0] ;
         A143BarDisNum = P09DR36_A143BarDisNum[0] ;
         A4812BarEncCli = P09DR36_A4812BarEncCli[0] ;
         A396EmprCod = P09DR36_A396EmprCod[0] ;
         A4348DisUsrCod = P09DR36_A4348DisUsrCod[0] ;
         A13711BarTipArtD = P09DR36_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P09DR36_n13711BarTipArtD[0] ;
         A279CliNom = P09DR36_A279CliNom[0] ;
         A1955BarFasSig = P09DR36_A1955BarFasSig[0] ;
         n1955BarFasSig = P09DR36_n1955BarFasSig[0] ;
         GXt_int2 = A13930BarAlbUlti ;
         GXv_int3[0] = GXt_int2 ;
         new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int3) ;
         consultadeproduccion_wcgetfilterdata.this.GXt_int2 = GXv_int3[0] ;
         A13930BarAlbUlti = GXt_int2 ;
         if ( (0==AV468TFBarAlbUltimo) || ( ( A13930BarAlbUlti >= AV468TFBarAlbUltimo ) ) )
         {
            if ( (0==AV469TFBarAlbUltimo_To) || ( ( A13930BarAlbUlti <= AV469TFBarAlbUltimo_To ) ) )
            {
               GXt_int4 = A13935BarAlbFact ;
               GXv_int5[0] = GXt_int4 ;
               new app.produccion.consultadeproduccion_factura(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int5) ;
               consultadeproduccion_wcgetfilterdata.this.GXt_int4 = GXv_int5[0] ;
               A13935BarAlbFact = GXt_int4 ;
               if ( (0==AV480TFBarAlbFact) || ( ( A13935BarAlbFact >= AV480TFBarAlbFact ) ) )
               {
                  if ( (0==AV481TFBarAlbFact_To) || ( ( A13935BarAlbFact <= AV481TFBarAlbFact_To ) ) )
                  {
                     GXt_char6 = A13934BarNormas ;
                     GXv_char10[0] = GXt_char6 ;
                     new app.produccion.consultadeproduccion_normasestandarstextiles(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char10) ;
                     consultadeproduccion_wcgetfilterdata.this.GXt_char6 = GXv_char10[0] ;
                     A13934BarNormas = GXt_char6 ;
                     if ( ! ( (GXutil.strcmp("", AV477TFBarNormas_Sel)==0) && ( ! (GXutil.strcmp("", AV476TFBarNormas)==0) ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV476TFBarNormas) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV477TFBarNormas_Sel)==0) || ( ( GXutil.strcmp(A13934BarNormas, AV477TFBarNormas_Sel) == 0 ) ) )
                        {
                           GXt_char6 = A13878PedidoClie ;
                           GXv_char10[0] = A396EmprCod ;
                           GXv_char9[0] = A4812BarEncCli ;
                           GXv_char8[0] = A143BarDisNum ;
                           GXv_char7[0] = GXt_char6 ;
                           new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char10, GXv_char9, GXv_char8, GXv_char7) ;
                           consultadeproduccion_wcgetfilterdata.this.A396EmprCod = GXv_char10[0] ;
                           consultadeproduccion_wcgetfilterdata.this.A4812BarEncCli = GXv_char9[0] ;
                           consultadeproduccion_wcgetfilterdata.this.A143BarDisNum = GXv_char8[0] ;
                           consultadeproduccion_wcgetfilterdata.this.GXt_char6 = GXv_char7[0] ;
                           A13878PedidoClie = GXt_char6 ;
                           if ( (GXutil.strcmp("", AV462bardisnumfrom)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV462bardisnumfrom) >= 0 ) ) )
                           {
                              if ( (GXutil.strcmp("", AV463bardisnumto)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV463bardisnumto) <= 0 ) ) )
                              {
                                 A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
                                 AV452count = 0 ;
                                 while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P09DR36_A135BarColNom[0], A135BarColNom) == 0 ) )
                                 {
                                    brk9DR13 = false ;
                                    A130BarCodPar = P09DR36_A130BarCodPar[0] ;
                                    A132BarCodReo = P09DR36_A132BarCodReo[0] ;
                                    A129BarCod = P09DR36_A129BarCod[0] ;
                                    A396EmprCod = P09DR36_A396EmprCod[0] ;
                                    AV452count = (long)(AV452count+1) ;
                                    brk9DR13 = true ;
                                    pr_default.readNext(6);
                                 }
                                 if ( ! (GXutil.strcmp("", A135BarColNom)==0) )
                                 {
                                    AV444Option = A135BarColNom ;
                                    AV445Options.add(AV444Option, 0);
                                    AV450OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV452count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                                 }
                                 if ( AV445Options.size() == 50 )
                                 {
                                    /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                    if (true) break;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk9DR13 )
         {
            brk9DR13 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   public void S191( )
   {
      /* 'LOADBARNOMCLIOPTIONS' Routine */
      returnInSub = false ;
      AV200TFBarNomCli = AV440SearchTxt ;
      AV201TFBarNomCli_Sel = "" ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           Integer.valueOf(AV24TFCliCod) ,
                                           Integer.valueOf(AV25TFCliCod_To) ,
                                           AV27TFCliNom_Sel ,
                                           AV26TFCliNom ,
                                           AV17TFBarNHdr_Sel ,
                                           AV16TFBarNHdr ,
                                           AV157TFBarAgrEst_Sel ,
                                           AV156TFBarAgrEst ,
                                           AV29TFBarSer_Sel ,
                                           AV28TFBarSer ,
                                           AV31TFBarSerDsc_Sel ,
                                           AV30TFBarSerDsc ,
                                           Short.valueOf(AV32TFBarTipArt) ,
                                           Short.valueOf(AV33TFBarTipArt_To) ,
                                           AV35TFBarTipArtDsc_Sel ,
                                           AV34TFBarTipArtDsc ,
                                           AV37TFBarColNom_Sel ,
                                           AV36TFBarColNom ,
                                           Integer.valueOf(AV38TFBarColNum) ,
                                           Integer.valueOf(AV39TFBarColNum_To) ,
                                           AV201TFBarNomCli_Sel ,
                                           AV200TFBarNomCli ,
                                           Byte.valueOf(AV124TFBarSit) ,
                                           Byte.valueOf(AV125TFBarSit_To) ,
                                           AV40TFBarFecGen ,
                                           AV42TFBarFecCli ,
                                           AV144TFBarFecFpr ,
                                           AV46TFBarFecSal ,
                                           AV325TFBarGirar_Sel ,
                                           AV324TFBarGirar ,
                                           Short.valueOf(AV372TFBarAcaAnh) ,
                                           Short.valueOf(AV373TFBarAcaAnh_To) ,
                                           AV247TFBarProPer_Sel ,
                                           AV246TFBarProPer ,
                                           AV479TFDisUsrCod_Sel ,
                                           AV478TFDisUsrCod ,
                                           Integer.valueOf(AV460clicodfrom) ,
                                           Integer.valueOf(AV461clicodto) ,
                                           AV464barfecgenfrom ,
                                           AV465barfecgento ,
                                           AV486barfecsalfrom ,
                                           AV487barfecsalto ,
                                           AV482barfecclifrom ,
                                           AV483barfecclito ,
                                           AV484BarFecFprfrom ,
                                           AV485BarFecFprto ,
                                           AV488barserfrom ,
                                           AV489barserto ,
                                           AV492BarColNomfrom ,
                                           AV493BarColNomto ,
                                           Integer.valueOf(AV494BarColNumfrom) ,
                                           Integer.valueOf(AV495BarColNumto) ,
                                           AV496BarNomClifrom ,
                                           AV497BarNomClito ,
                                           Integer.valueOf(AV498BarNumclifrom) ,
                                           Integer.valueOf(AV499barnumclito) ,
                                           Short.valueOf(AV490bartipartfrom) ,
                                           Short.valueOf(AV491bartipartto) ,
                                           AV501muestras ,
                                           Integer.valueOf(AV502barcodfrom) ,
                                           Integer.valueOf(AV503barcodto) ,
                                           Byte.valueOf(AV504barcodreofrom) ,
                                           Byte.valueOf(AV505barcodreoto) ,
                                           AV506barcodparfrom ,
                                           AV507barcodparto ,
                                           AV510Cod_idtx ,
                                           AV513BarGirar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A120BarAgrEst ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A13711BarTipArtD ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Byte.valueOf(A213BarSit) ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A161BarFecSal ,
                                           A2454BarGirar ,
                                           Short.valueOf(A4466BarAcaAnh) ,
                                           A2829BarProPer ,
                                           A4348DisUsrCod ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A3030BarPlf ,
                                           AV65TFBarFasSig_Sel ,
                                           AV64TFBarFasSig ,
                                           A1955BarFasSig ,
                                           Long.valueOf(AV468TFBarAlbUltimo) ,
                                           Long.valueOf(A13930BarAlbUlti) ,
                                           Long.valueOf(AV469TFBarAlbUltimo_To) ,
                                           Integer.valueOf(AV480TFBarAlbFact) ,
                                           Integer.valueOf(A13935BarAlbFact) ,
                                           Integer.valueOf(AV481TFBarAlbFact_To) ,
                                           AV477TFBarNormas_Sel ,
                                           AV476TFBarNormas ,
                                           A13934BarNormas ,
                                           AV462bardisnumfrom ,
                                           A13878PedidoClie ,
                                           AV463bardisnumto ,
                                           Byte.valueOf(AV466barsitfrom) ,
                                           Byte.valueOf(AV467barsitto) ,
                                           A396EmprCod ,
                                           AV459Emprcod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV64TFBarFasSig = GXutil.padr( GXutil.rtrim( AV64TFBarFasSig), 8, "%") ;
      lV26TFCliNom = GXutil.padr( GXutil.rtrim( AV26TFCliNom), 30, "%") ;
      lV16TFBarNHdr = GXutil.padr( GXutil.rtrim( AV16TFBarNHdr), 11, "%") ;
      lV156TFBarAgrEst = GXutil.padr( GXutil.rtrim( AV156TFBarAgrEst), 1, "%") ;
      lV28TFBarSer = GXutil.padr( GXutil.rtrim( AV28TFBarSer), 16, "%") ;
      lV30TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV30TFBarSerDsc), 26, "%") ;
      lV34TFBarTipArtDsc = GXutil.padr( GXutil.rtrim( AV34TFBarTipArtDsc), 30, "%") ;
      lV36TFBarColNom = GXutil.padr( GXutil.rtrim( AV36TFBarColNom), 13, "%") ;
      lV200TFBarNomCli = GXutil.padr( GXutil.rtrim( AV200TFBarNomCli), 13, "%") ;
      lV324TFBarGirar = GXutil.padr( GXutil.rtrim( AV324TFBarGirar), 20, "%") ;
      lV246TFBarProPer = GXutil.padr( GXutil.rtrim( AV246TFBarProPer), 8, "%") ;
      lV478TFDisUsrCod = GXutil.padr( GXutil.rtrim( AV478TFDisUsrCod), 8, "%") ;
      /* Using cursor P09DR41 */
      pr_default.execute(7, new Object[] {AV65TFBarFasSig_Sel, AV64TFBarFasSig, lV64TFBarFasSig, AV65TFBarFasSig_Sel, AV65TFBarFasSig_Sel, Byte.valueOf(AV466barsitfrom), Byte.valueOf(AV467barsitto), AV459Emprcod, Integer.valueOf(AV24TFCliCod), Integer.valueOf(AV25TFCliCod_To), lV26TFCliNom, AV27TFCliNom_Sel, lV16TFBarNHdr, AV17TFBarNHdr_Sel, lV156TFBarAgrEst, AV157TFBarAgrEst_Sel, lV28TFBarSer, AV29TFBarSer_Sel, lV30TFBarSerDsc, AV31TFBarSerDsc_Sel, Short.valueOf(AV32TFBarTipArt), Short.valueOf(AV33TFBarTipArt_To), lV34TFBarTipArtDsc, AV35TFBarTipArtDsc_Sel, lV36TFBarColNom, AV37TFBarColNom_Sel, Integer.valueOf(AV38TFBarColNum), Integer.valueOf(AV39TFBarColNum_To), lV200TFBarNomCli, AV201TFBarNomCli_Sel, Byte.valueOf(AV124TFBarSit), Byte.valueOf(AV125TFBarSit_To), AV40TFBarFecGen, AV42TFBarFecCli, AV144TFBarFecFpr, AV46TFBarFecSal, lV324TFBarGirar, AV325TFBarGirar_Sel, Short.valueOf(AV372TFBarAcaAnh), Short.valueOf(AV373TFBarAcaAnh_To), lV246TFBarProPer, AV247TFBarProPer_Sel, lV478TFDisUsrCod, AV479TFDisUsrCod_Sel, Integer.valueOf(AV460clicodfrom), Integer.valueOf(AV461clicodto), AV464barfecgenfrom, AV465barfecgento, AV486barfecsalfrom, AV487barfecsalto, AV482barfecclifrom, AV483barfecclito, AV484BarFecFprfrom, AV485BarFecFprto, AV488barserfrom, AV489barserto, AV492BarColNomfrom, AV493BarColNomto, Integer.valueOf(AV494BarColNumfrom), Integer.valueOf(AV495BarColNumto), AV496BarNomClifrom, AV497BarNomClito, Integer.valueOf(AV498BarNumclifrom), Integer.valueOf(AV499barnumclito), Short.valueOf(AV490bartipartfrom), Short.valueOf(AV491bartipartto), AV501muestras, Integer.valueOf(AV502barcodfrom), Integer.valueOf(AV503barcodto), Byte.valueOf(AV504barcodreofrom), Byte.valueOf(AV505barcodreoto), AV506barcodparfrom, AV507barcodparto, AV510Cod_idtx, AV513BarGirar});
      while ( (pr_default.getStatus(7) != 101) )
      {
         brk9DR15 = false ;
         A1234BarNomCli = P09DR41_A1234BarNomCli[0] ;
         A3030BarPlf = P09DR41_A3030BarPlf[0] ;
         A1235BarNumCli = P09DR41_A1235BarNumCli[0] ;
         A4348DisUsrCod = P09DR41_A4348DisUsrCod[0] ;
         A2829BarProPer = P09DR41_A2829BarProPer[0] ;
         A4466BarAcaAnh = P09DR41_A4466BarAcaAnh[0] ;
         A2454BarGirar = P09DR41_A2454BarGirar[0] ;
         A161BarFecSal = P09DR41_A161BarFecSal[0] ;
         A158BarFecFpr = P09DR41_A158BarFecFpr[0] ;
         A155BarFecCli = P09DR41_A155BarFecCli[0] ;
         A159BarFecGen = P09DR41_A159BarFecGen[0] ;
         A213BarSit = P09DR41_A213BarSit[0] ;
         A136BarColNum = P09DR41_A136BarColNum[0] ;
         A135BarColNom = P09DR41_A135BarColNom[0] ;
         A13711BarTipArtD = P09DR41_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P09DR41_n13711BarTipArtD[0] ;
         A217BarTipArt = P09DR41_A217BarTipArt[0] ;
         n217BarTipArt = P09DR41_n217BarTipArt[0] ;
         A1652BarSerDsc = P09DR41_A1652BarSerDsc[0] ;
         A212BarSer = P09DR41_A212BarSer[0] ;
         A120BarAgrEst = P09DR41_A120BarAgrEst[0] ;
         A279CliNom = P09DR41_A279CliNom[0] ;
         A252CliCod = P09DR41_A252CliCod[0] ;
         n252CliCod = P09DR41_n252CliCod[0] ;
         A1955BarFasSig = P09DR41_A1955BarFasSig[0] ;
         n1955BarFasSig = P09DR41_n1955BarFasSig[0] ;
         A130BarCodPar = P09DR41_A130BarCodPar[0] ;
         A132BarCodReo = P09DR41_A132BarCodReo[0] ;
         A129BarCod = P09DR41_A129BarCod[0] ;
         A361DisCod = P09DR41_A361DisCod[0] ;
         A143BarDisNum = P09DR41_A143BarDisNum[0] ;
         A4812BarEncCli = P09DR41_A4812BarEncCli[0] ;
         A396EmprCod = P09DR41_A396EmprCod[0] ;
         A4348DisUsrCod = P09DR41_A4348DisUsrCod[0] ;
         A13711BarTipArtD = P09DR41_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P09DR41_n13711BarTipArtD[0] ;
         A279CliNom = P09DR41_A279CliNom[0] ;
         A1955BarFasSig = P09DR41_A1955BarFasSig[0] ;
         n1955BarFasSig = P09DR41_n1955BarFasSig[0] ;
         GXt_int2 = A13930BarAlbUlti ;
         GXv_int3[0] = GXt_int2 ;
         new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int3) ;
         consultadeproduccion_wcgetfilterdata.this.GXt_int2 = GXv_int3[0] ;
         A13930BarAlbUlti = GXt_int2 ;
         if ( (0==AV468TFBarAlbUltimo) || ( ( A13930BarAlbUlti >= AV468TFBarAlbUltimo ) ) )
         {
            if ( (0==AV469TFBarAlbUltimo_To) || ( ( A13930BarAlbUlti <= AV469TFBarAlbUltimo_To ) ) )
            {
               GXt_int4 = A13935BarAlbFact ;
               GXv_int5[0] = GXt_int4 ;
               new app.produccion.consultadeproduccion_factura(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int5) ;
               consultadeproduccion_wcgetfilterdata.this.GXt_int4 = GXv_int5[0] ;
               A13935BarAlbFact = GXt_int4 ;
               if ( (0==AV480TFBarAlbFact) || ( ( A13935BarAlbFact >= AV480TFBarAlbFact ) ) )
               {
                  if ( (0==AV481TFBarAlbFact_To) || ( ( A13935BarAlbFact <= AV481TFBarAlbFact_To ) ) )
                  {
                     GXt_char6 = A13934BarNormas ;
                     GXv_char10[0] = GXt_char6 ;
                     new app.produccion.consultadeproduccion_normasestandarstextiles(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char10) ;
                     consultadeproduccion_wcgetfilterdata.this.GXt_char6 = GXv_char10[0] ;
                     A13934BarNormas = GXt_char6 ;
                     if ( ! ( (GXutil.strcmp("", AV477TFBarNormas_Sel)==0) && ( ! (GXutil.strcmp("", AV476TFBarNormas)==0) ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV476TFBarNormas) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV477TFBarNormas_Sel)==0) || ( ( GXutil.strcmp(A13934BarNormas, AV477TFBarNormas_Sel) == 0 ) ) )
                        {
                           GXt_char6 = A13878PedidoClie ;
                           GXv_char10[0] = A396EmprCod ;
                           GXv_char9[0] = A4812BarEncCli ;
                           GXv_char8[0] = A143BarDisNum ;
                           GXv_char7[0] = GXt_char6 ;
                           new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char10, GXv_char9, GXv_char8, GXv_char7) ;
                           consultadeproduccion_wcgetfilterdata.this.A396EmprCod = GXv_char10[0] ;
                           consultadeproduccion_wcgetfilterdata.this.A4812BarEncCli = GXv_char9[0] ;
                           consultadeproduccion_wcgetfilterdata.this.A143BarDisNum = GXv_char8[0] ;
                           consultadeproduccion_wcgetfilterdata.this.GXt_char6 = GXv_char7[0] ;
                           A13878PedidoClie = GXt_char6 ;
                           if ( (GXutil.strcmp("", AV462bardisnumfrom)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV462bardisnumfrom) >= 0 ) ) )
                           {
                              if ( (GXutil.strcmp("", AV463bardisnumto)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV463bardisnumto) <= 0 ) ) )
                              {
                                 A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
                                 AV452count = 0 ;
                                 while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(P09DR41_A1234BarNomCli[0], A1234BarNomCli) == 0 ) )
                                 {
                                    brk9DR15 = false ;
                                    A130BarCodPar = P09DR41_A130BarCodPar[0] ;
                                    A132BarCodReo = P09DR41_A132BarCodReo[0] ;
                                    A129BarCod = P09DR41_A129BarCod[0] ;
                                    A396EmprCod = P09DR41_A396EmprCod[0] ;
                                    AV452count = (long)(AV452count+1) ;
                                    brk9DR15 = true ;
                                    pr_default.readNext(7);
                                 }
                                 if ( ! (GXutil.strcmp("", A1234BarNomCli)==0) )
                                 {
                                    AV444Option = A1234BarNomCli ;
                                    AV445Options.add(AV444Option, 0);
                                    AV450OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV452count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                                 }
                                 if ( AV445Options.size() == 50 )
                                 {
                                    /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                    if (true) break;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk9DR15 )
         {
            brk9DR15 = true ;
            pr_default.readNext(7);
         }
      }
      pr_default.close(7);
   }

   public void S201( )
   {
      /* 'LOADBARFASSIGOPTIONS' Routine */
      returnInSub = false ;
      AV64TFBarFasSig = AV440SearchTxt ;
      AV65TFBarFasSig_Sel = "" ;
      pr_default.dynParam(8, new Object[]{ new Object[]{
                                           Integer.valueOf(AV24TFCliCod) ,
                                           Integer.valueOf(AV25TFCliCod_To) ,
                                           AV27TFCliNom_Sel ,
                                           AV26TFCliNom ,
                                           AV17TFBarNHdr_Sel ,
                                           AV16TFBarNHdr ,
                                           AV157TFBarAgrEst_Sel ,
                                           AV156TFBarAgrEst ,
                                           AV29TFBarSer_Sel ,
                                           AV28TFBarSer ,
                                           AV31TFBarSerDsc_Sel ,
                                           AV30TFBarSerDsc ,
                                           Short.valueOf(AV32TFBarTipArt) ,
                                           Short.valueOf(AV33TFBarTipArt_To) ,
                                           AV35TFBarTipArtDsc_Sel ,
                                           AV34TFBarTipArtDsc ,
                                           AV37TFBarColNom_Sel ,
                                           AV36TFBarColNom ,
                                           Integer.valueOf(AV38TFBarColNum) ,
                                           Integer.valueOf(AV39TFBarColNum_To) ,
                                           AV201TFBarNomCli_Sel ,
                                           AV200TFBarNomCli ,
                                           Byte.valueOf(AV124TFBarSit) ,
                                           Byte.valueOf(AV125TFBarSit_To) ,
                                           AV40TFBarFecGen ,
                                           AV42TFBarFecCli ,
                                           AV144TFBarFecFpr ,
                                           AV46TFBarFecSal ,
                                           AV325TFBarGirar_Sel ,
                                           AV324TFBarGirar ,
                                           Short.valueOf(AV372TFBarAcaAnh) ,
                                           Short.valueOf(AV373TFBarAcaAnh_To) ,
                                           AV247TFBarProPer_Sel ,
                                           AV246TFBarProPer ,
                                           AV479TFDisUsrCod_Sel ,
                                           AV478TFDisUsrCod ,
                                           Integer.valueOf(AV460clicodfrom) ,
                                           Integer.valueOf(AV461clicodto) ,
                                           AV464barfecgenfrom ,
                                           AV465barfecgento ,
                                           AV486barfecsalfrom ,
                                           AV487barfecsalto ,
                                           AV482barfecclifrom ,
                                           AV483barfecclito ,
                                           AV484BarFecFprfrom ,
                                           AV485BarFecFprto ,
                                           AV488barserfrom ,
                                           AV489barserto ,
                                           AV492BarColNomfrom ,
                                           AV493BarColNomto ,
                                           Integer.valueOf(AV494BarColNumfrom) ,
                                           Integer.valueOf(AV495BarColNumto) ,
                                           AV496BarNomClifrom ,
                                           AV497BarNomClito ,
                                           Integer.valueOf(AV498BarNumclifrom) ,
                                           Integer.valueOf(AV499barnumclito) ,
                                           Short.valueOf(AV490bartipartfrom) ,
                                           Short.valueOf(AV491bartipartto) ,
                                           AV501muestras ,
                                           Integer.valueOf(AV502barcodfrom) ,
                                           Integer.valueOf(AV503barcodto) ,
                                           Byte.valueOf(AV504barcodreofrom) ,
                                           Byte.valueOf(AV505barcodreoto) ,
                                           AV506barcodparfrom ,
                                           AV507barcodparto ,
                                           AV510Cod_idtx ,
                                           AV513BarGirar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A120BarAgrEst ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A13711BarTipArtD ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Byte.valueOf(A213BarSit) ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A161BarFecSal ,
                                           A2454BarGirar ,
                                           Short.valueOf(A4466BarAcaAnh) ,
                                           A2829BarProPer ,
                                           A4348DisUsrCod ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A3030BarPlf ,
                                           AV65TFBarFasSig_Sel ,
                                           AV64TFBarFasSig ,
                                           A1955BarFasSig ,
                                           Long.valueOf(AV468TFBarAlbUltimo) ,
                                           Long.valueOf(A13930BarAlbUlti) ,
                                           Long.valueOf(AV469TFBarAlbUltimo_To) ,
                                           Integer.valueOf(AV480TFBarAlbFact) ,
                                           Integer.valueOf(A13935BarAlbFact) ,
                                           Integer.valueOf(AV481TFBarAlbFact_To) ,
                                           AV477TFBarNormas_Sel ,
                                           AV476TFBarNormas ,
                                           A13934BarNormas ,
                                           AV462bardisnumfrom ,
                                           A13878PedidoClie ,
                                           AV463bardisnumto ,
                                           Byte.valueOf(AV466barsitfrom) ,
                                           Byte.valueOf(AV467barsitto) ,
                                           AV459Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV64TFBarFasSig = GXutil.padr( GXutil.rtrim( AV64TFBarFasSig), 8, "%") ;
      lV26TFCliNom = GXutil.padr( GXutil.rtrim( AV26TFCliNom), 30, "%") ;
      lV16TFBarNHdr = GXutil.padr( GXutil.rtrim( AV16TFBarNHdr), 11, "%") ;
      lV156TFBarAgrEst = GXutil.padr( GXutil.rtrim( AV156TFBarAgrEst), 1, "%") ;
      lV28TFBarSer = GXutil.padr( GXutil.rtrim( AV28TFBarSer), 16, "%") ;
      lV30TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV30TFBarSerDsc), 26, "%") ;
      lV34TFBarTipArtDsc = GXutil.padr( GXutil.rtrim( AV34TFBarTipArtDsc), 30, "%") ;
      lV36TFBarColNom = GXutil.padr( GXutil.rtrim( AV36TFBarColNom), 13, "%") ;
      lV200TFBarNomCli = GXutil.padr( GXutil.rtrim( AV200TFBarNomCli), 13, "%") ;
      lV324TFBarGirar = GXutil.padr( GXutil.rtrim( AV324TFBarGirar), 20, "%") ;
      lV246TFBarProPer = GXutil.padr( GXutil.rtrim( AV246TFBarProPer), 8, "%") ;
      lV478TFDisUsrCod = GXutil.padr( GXutil.rtrim( AV478TFDisUsrCod), 8, "%") ;
      /* Using cursor P09DR46 */
      pr_default.execute(8, new Object[] {AV459Emprcod, AV65TFBarFasSig_Sel, AV64TFBarFasSig, lV64TFBarFasSig, AV65TFBarFasSig_Sel, AV65TFBarFasSig_Sel, Byte.valueOf(AV466barsitfrom), Byte.valueOf(AV467barsitto), Integer.valueOf(AV24TFCliCod), Integer.valueOf(AV25TFCliCod_To), lV26TFCliNom, AV27TFCliNom_Sel, lV16TFBarNHdr, AV17TFBarNHdr_Sel, lV156TFBarAgrEst, AV157TFBarAgrEst_Sel, lV28TFBarSer, AV29TFBarSer_Sel, lV30TFBarSerDsc, AV31TFBarSerDsc_Sel, Short.valueOf(AV32TFBarTipArt), Short.valueOf(AV33TFBarTipArt_To), lV34TFBarTipArtDsc, AV35TFBarTipArtDsc_Sel, lV36TFBarColNom, AV37TFBarColNom_Sel, Integer.valueOf(AV38TFBarColNum), Integer.valueOf(AV39TFBarColNum_To), lV200TFBarNomCli, AV201TFBarNomCli_Sel, Byte.valueOf(AV124TFBarSit), Byte.valueOf(AV125TFBarSit_To), AV40TFBarFecGen, AV42TFBarFecCli, AV144TFBarFecFpr, AV46TFBarFecSal, lV324TFBarGirar, AV325TFBarGirar_Sel, Short.valueOf(AV372TFBarAcaAnh), Short.valueOf(AV373TFBarAcaAnh_To), lV246TFBarProPer, AV247TFBarProPer_Sel, lV478TFDisUsrCod, AV479TFDisUsrCod_Sel, Integer.valueOf(AV460clicodfrom), Integer.valueOf(AV461clicodto), AV464barfecgenfrom, AV465barfecgento, AV486barfecsalfrom, AV487barfecsalto, AV482barfecclifrom, AV483barfecclito, AV484BarFecFprfrom, AV485BarFecFprto, AV488barserfrom, AV489barserto, AV492BarColNomfrom, AV493BarColNomto, Integer.valueOf(AV494BarColNumfrom), Integer.valueOf(AV495BarColNumto), AV496BarNomClifrom, AV497BarNomClito, Integer.valueOf(AV498BarNumclifrom), Integer.valueOf(AV499barnumclito), Short.valueOf(AV490bartipartfrom), Short.valueOf(AV491bartipartto), AV501muestras, Integer.valueOf(AV502barcodfrom), Integer.valueOf(AV503barcodto), Byte.valueOf(AV504barcodreofrom), Byte.valueOf(AV505barcodreoto), AV506barcodparfrom, AV507barcodparto, AV510Cod_idtx, AV513BarGirar});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A3030BarPlf = P09DR46_A3030BarPlf[0] ;
         A1235BarNumCli = P09DR46_A1235BarNumCli[0] ;
         A4348DisUsrCod = P09DR46_A4348DisUsrCod[0] ;
         A2829BarProPer = P09DR46_A2829BarProPer[0] ;
         A4466BarAcaAnh = P09DR46_A4466BarAcaAnh[0] ;
         A2454BarGirar = P09DR46_A2454BarGirar[0] ;
         A161BarFecSal = P09DR46_A161BarFecSal[0] ;
         A158BarFecFpr = P09DR46_A158BarFecFpr[0] ;
         A155BarFecCli = P09DR46_A155BarFecCli[0] ;
         A159BarFecGen = P09DR46_A159BarFecGen[0] ;
         A213BarSit = P09DR46_A213BarSit[0] ;
         A1234BarNomCli = P09DR46_A1234BarNomCli[0] ;
         A136BarColNum = P09DR46_A136BarColNum[0] ;
         A135BarColNom = P09DR46_A135BarColNom[0] ;
         A13711BarTipArtD = P09DR46_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P09DR46_n13711BarTipArtD[0] ;
         A217BarTipArt = P09DR46_A217BarTipArt[0] ;
         n217BarTipArt = P09DR46_n217BarTipArt[0] ;
         A1652BarSerDsc = P09DR46_A1652BarSerDsc[0] ;
         A212BarSer = P09DR46_A212BarSer[0] ;
         A120BarAgrEst = P09DR46_A120BarAgrEst[0] ;
         A279CliNom = P09DR46_A279CliNom[0] ;
         A252CliCod = P09DR46_A252CliCod[0] ;
         n252CliCod = P09DR46_n252CliCod[0] ;
         A1955BarFasSig = P09DR46_A1955BarFasSig[0] ;
         n1955BarFasSig = P09DR46_n1955BarFasSig[0] ;
         A130BarCodPar = P09DR46_A130BarCodPar[0] ;
         A132BarCodReo = P09DR46_A132BarCodReo[0] ;
         A129BarCod = P09DR46_A129BarCod[0] ;
         A361DisCod = P09DR46_A361DisCod[0] ;
         A143BarDisNum = P09DR46_A143BarDisNum[0] ;
         A4812BarEncCli = P09DR46_A4812BarEncCli[0] ;
         A396EmprCod = P09DR46_A396EmprCod[0] ;
         A4348DisUsrCod = P09DR46_A4348DisUsrCod[0] ;
         A13711BarTipArtD = P09DR46_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P09DR46_n13711BarTipArtD[0] ;
         A279CliNom = P09DR46_A279CliNom[0] ;
         A1955BarFasSig = P09DR46_A1955BarFasSig[0] ;
         n1955BarFasSig = P09DR46_n1955BarFasSig[0] ;
         GXt_int2 = A13930BarAlbUlti ;
         GXv_int3[0] = GXt_int2 ;
         new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int3) ;
         consultadeproduccion_wcgetfilterdata.this.GXt_int2 = GXv_int3[0] ;
         A13930BarAlbUlti = GXt_int2 ;
         if ( (0==AV468TFBarAlbUltimo) || ( ( A13930BarAlbUlti >= AV468TFBarAlbUltimo ) ) )
         {
            if ( (0==AV469TFBarAlbUltimo_To) || ( ( A13930BarAlbUlti <= AV469TFBarAlbUltimo_To ) ) )
            {
               GXt_int4 = A13935BarAlbFact ;
               GXv_int5[0] = GXt_int4 ;
               new app.produccion.consultadeproduccion_factura(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int5) ;
               consultadeproduccion_wcgetfilterdata.this.GXt_int4 = GXv_int5[0] ;
               A13935BarAlbFact = GXt_int4 ;
               if ( (0==AV480TFBarAlbFact) || ( ( A13935BarAlbFact >= AV480TFBarAlbFact ) ) )
               {
                  if ( (0==AV481TFBarAlbFact_To) || ( ( A13935BarAlbFact <= AV481TFBarAlbFact_To ) ) )
                  {
                     GXt_char6 = A13934BarNormas ;
                     GXv_char10[0] = GXt_char6 ;
                     new app.produccion.consultadeproduccion_normasestandarstextiles(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char10) ;
                     consultadeproduccion_wcgetfilterdata.this.GXt_char6 = GXv_char10[0] ;
                     A13934BarNormas = GXt_char6 ;
                     if ( ! ( (GXutil.strcmp("", AV477TFBarNormas_Sel)==0) && ( ! (GXutil.strcmp("", AV476TFBarNormas)==0) ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV476TFBarNormas) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV477TFBarNormas_Sel)==0) || ( ( GXutil.strcmp(A13934BarNormas, AV477TFBarNormas_Sel) == 0 ) ) )
                        {
                           GXt_char6 = A13878PedidoClie ;
                           GXv_char10[0] = A396EmprCod ;
                           GXv_char9[0] = A4812BarEncCli ;
                           GXv_char8[0] = A143BarDisNum ;
                           GXv_char7[0] = GXt_char6 ;
                           new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char10, GXv_char9, GXv_char8, GXv_char7) ;
                           consultadeproduccion_wcgetfilterdata.this.A396EmprCod = GXv_char10[0] ;
                           consultadeproduccion_wcgetfilterdata.this.A4812BarEncCli = GXv_char9[0] ;
                           consultadeproduccion_wcgetfilterdata.this.A143BarDisNum = GXv_char8[0] ;
                           consultadeproduccion_wcgetfilterdata.this.GXt_char6 = GXv_char7[0] ;
                           A13878PedidoClie = GXt_char6 ;
                           if ( (GXutil.strcmp("", AV462bardisnumfrom)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV462bardisnumfrom) >= 0 ) ) )
                           {
                              if ( (GXutil.strcmp("", AV463bardisnumto)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV463bardisnumto) <= 0 ) ) )
                              {
                                 A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
                                 if ( ! (GXutil.strcmp("", A1955BarFasSig)==0) )
                                 {
                                    AV444Option = A1955BarFasSig ;
                                    AV443InsertIndex = 1 ;
                                    while ( ( AV443InsertIndex <= AV445Options.size() ) && ( GXutil.strcmp((String)AV445Options.elementAt(-1+AV443InsertIndex), AV444Option) < 0 ) )
                                    {
                                       AV443InsertIndex = (int)(AV443InsertIndex+1) ;
                                    }
                                    if ( ( AV443InsertIndex <= AV445Options.size() ) && ( GXutil.strcmp((String)AV445Options.elementAt(-1+AV443InsertIndex), AV444Option) == 0 ) )
                                    {
                                       AV452count = GXutil.lval( (String)AV450OptionIndexes.elementAt(-1+AV443InsertIndex)) ;
                                       AV452count = (long)(AV452count+1) ;
                                       AV450OptionIndexes.removeItem(AV443InsertIndex);
                                       AV450OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV452count), "Z,ZZZ,ZZZ,ZZ9")), AV443InsertIndex);
                                    }
                                    else
                                    {
                                       AV445Options.add(AV444Option, AV443InsertIndex);
                                       AV450OptionIndexes.add("1", AV443InsertIndex);
                                    }
                                 }
                                 if ( AV445Options.size() == 50 )
                                 {
                                    /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                    if (true) break;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(8);
      }
      pr_default.close(8);
   }

   public void S211( )
   {
      /* 'LOADBARGIRAROPTIONS' Routine */
      returnInSub = false ;
      AV324TFBarGirar = AV440SearchTxt ;
      AV325TFBarGirar_Sel = "" ;
      pr_default.dynParam(9, new Object[]{ new Object[]{
                                           Integer.valueOf(AV24TFCliCod) ,
                                           Integer.valueOf(AV25TFCliCod_To) ,
                                           AV27TFCliNom_Sel ,
                                           AV26TFCliNom ,
                                           AV17TFBarNHdr_Sel ,
                                           AV16TFBarNHdr ,
                                           AV157TFBarAgrEst_Sel ,
                                           AV156TFBarAgrEst ,
                                           AV29TFBarSer_Sel ,
                                           AV28TFBarSer ,
                                           AV31TFBarSerDsc_Sel ,
                                           AV30TFBarSerDsc ,
                                           Short.valueOf(AV32TFBarTipArt) ,
                                           Short.valueOf(AV33TFBarTipArt_To) ,
                                           AV35TFBarTipArtDsc_Sel ,
                                           AV34TFBarTipArtDsc ,
                                           AV37TFBarColNom_Sel ,
                                           AV36TFBarColNom ,
                                           Integer.valueOf(AV38TFBarColNum) ,
                                           Integer.valueOf(AV39TFBarColNum_To) ,
                                           AV201TFBarNomCli_Sel ,
                                           AV200TFBarNomCli ,
                                           Byte.valueOf(AV124TFBarSit) ,
                                           Byte.valueOf(AV125TFBarSit_To) ,
                                           AV40TFBarFecGen ,
                                           AV42TFBarFecCli ,
                                           AV144TFBarFecFpr ,
                                           AV46TFBarFecSal ,
                                           AV325TFBarGirar_Sel ,
                                           AV324TFBarGirar ,
                                           Short.valueOf(AV372TFBarAcaAnh) ,
                                           Short.valueOf(AV373TFBarAcaAnh_To) ,
                                           AV247TFBarProPer_Sel ,
                                           AV246TFBarProPer ,
                                           AV479TFDisUsrCod_Sel ,
                                           AV478TFDisUsrCod ,
                                           Integer.valueOf(AV460clicodfrom) ,
                                           Integer.valueOf(AV461clicodto) ,
                                           AV464barfecgenfrom ,
                                           AV465barfecgento ,
                                           AV486barfecsalfrom ,
                                           AV487barfecsalto ,
                                           AV482barfecclifrom ,
                                           AV483barfecclito ,
                                           AV484BarFecFprfrom ,
                                           AV485BarFecFprto ,
                                           AV488barserfrom ,
                                           AV489barserto ,
                                           AV492BarColNomfrom ,
                                           AV493BarColNomto ,
                                           Integer.valueOf(AV494BarColNumfrom) ,
                                           Integer.valueOf(AV495BarColNumto) ,
                                           AV496BarNomClifrom ,
                                           AV497BarNomClito ,
                                           Integer.valueOf(AV498BarNumclifrom) ,
                                           Integer.valueOf(AV499barnumclito) ,
                                           Short.valueOf(AV490bartipartfrom) ,
                                           Short.valueOf(AV491bartipartto) ,
                                           AV501muestras ,
                                           Integer.valueOf(AV502barcodfrom) ,
                                           Integer.valueOf(AV503barcodto) ,
                                           Byte.valueOf(AV504barcodreofrom) ,
                                           Byte.valueOf(AV505barcodreoto) ,
                                           AV506barcodparfrom ,
                                           AV507barcodparto ,
                                           AV510Cod_idtx ,
                                           AV513BarGirar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A120BarAgrEst ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A13711BarTipArtD ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Byte.valueOf(A213BarSit) ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A161BarFecSal ,
                                           A2454BarGirar ,
                                           Short.valueOf(A4466BarAcaAnh) ,
                                           A2829BarProPer ,
                                           A4348DisUsrCod ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A3030BarPlf ,
                                           AV65TFBarFasSig_Sel ,
                                           AV64TFBarFasSig ,
                                           A1955BarFasSig ,
                                           Long.valueOf(AV468TFBarAlbUltimo) ,
                                           Long.valueOf(A13930BarAlbUlti) ,
                                           Long.valueOf(AV469TFBarAlbUltimo_To) ,
                                           Integer.valueOf(AV480TFBarAlbFact) ,
                                           Integer.valueOf(A13935BarAlbFact) ,
                                           Integer.valueOf(AV481TFBarAlbFact_To) ,
                                           AV477TFBarNormas_Sel ,
                                           AV476TFBarNormas ,
                                           A13934BarNormas ,
                                           AV462bardisnumfrom ,
                                           A13878PedidoClie ,
                                           AV463bardisnumto ,
                                           Byte.valueOf(AV466barsitfrom) ,
                                           Byte.valueOf(AV467barsitto) ,
                                           A396EmprCod ,
                                           AV459Emprcod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV64TFBarFasSig = GXutil.padr( GXutil.rtrim( AV64TFBarFasSig), 8, "%") ;
      lV26TFCliNom = GXutil.padr( GXutil.rtrim( AV26TFCliNom), 30, "%") ;
      lV16TFBarNHdr = GXutil.padr( GXutil.rtrim( AV16TFBarNHdr), 11, "%") ;
      lV156TFBarAgrEst = GXutil.padr( GXutil.rtrim( AV156TFBarAgrEst), 1, "%") ;
      lV28TFBarSer = GXutil.padr( GXutil.rtrim( AV28TFBarSer), 16, "%") ;
      lV30TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV30TFBarSerDsc), 26, "%") ;
      lV34TFBarTipArtDsc = GXutil.padr( GXutil.rtrim( AV34TFBarTipArtDsc), 30, "%") ;
      lV36TFBarColNom = GXutil.padr( GXutil.rtrim( AV36TFBarColNom), 13, "%") ;
      lV200TFBarNomCli = GXutil.padr( GXutil.rtrim( AV200TFBarNomCli), 13, "%") ;
      lV324TFBarGirar = GXutil.padr( GXutil.rtrim( AV324TFBarGirar), 20, "%") ;
      lV246TFBarProPer = GXutil.padr( GXutil.rtrim( AV246TFBarProPer), 8, "%") ;
      lV478TFDisUsrCod = GXutil.padr( GXutil.rtrim( AV478TFDisUsrCod), 8, "%") ;
      /* Using cursor P09DR51 */
      pr_default.execute(9, new Object[] {AV65TFBarFasSig_Sel, AV64TFBarFasSig, lV64TFBarFasSig, AV65TFBarFasSig_Sel, AV65TFBarFasSig_Sel, Byte.valueOf(AV466barsitfrom), Byte.valueOf(AV467barsitto), AV459Emprcod, Integer.valueOf(AV24TFCliCod), Integer.valueOf(AV25TFCliCod_To), lV26TFCliNom, AV27TFCliNom_Sel, lV16TFBarNHdr, AV17TFBarNHdr_Sel, lV156TFBarAgrEst, AV157TFBarAgrEst_Sel, lV28TFBarSer, AV29TFBarSer_Sel, lV30TFBarSerDsc, AV31TFBarSerDsc_Sel, Short.valueOf(AV32TFBarTipArt), Short.valueOf(AV33TFBarTipArt_To), lV34TFBarTipArtDsc, AV35TFBarTipArtDsc_Sel, lV36TFBarColNom, AV37TFBarColNom_Sel, Integer.valueOf(AV38TFBarColNum), Integer.valueOf(AV39TFBarColNum_To), lV200TFBarNomCli, AV201TFBarNomCli_Sel, Byte.valueOf(AV124TFBarSit), Byte.valueOf(AV125TFBarSit_To), AV40TFBarFecGen, AV42TFBarFecCli, AV144TFBarFecFpr, AV46TFBarFecSal, lV324TFBarGirar, AV325TFBarGirar_Sel, Short.valueOf(AV372TFBarAcaAnh), Short.valueOf(AV373TFBarAcaAnh_To), lV246TFBarProPer, AV247TFBarProPer_Sel, lV478TFDisUsrCod, AV479TFDisUsrCod_Sel, Integer.valueOf(AV460clicodfrom), Integer.valueOf(AV461clicodto), AV464barfecgenfrom, AV465barfecgento, AV486barfecsalfrom, AV487barfecsalto, AV482barfecclifrom, AV483barfecclito, AV484BarFecFprfrom, AV485BarFecFprto, AV488barserfrom, AV489barserto, AV492BarColNomfrom, AV493BarColNomto, Integer.valueOf(AV494BarColNumfrom), Integer.valueOf(AV495BarColNumto), AV496BarNomClifrom, AV497BarNomClito, Integer.valueOf(AV498BarNumclifrom), Integer.valueOf(AV499barnumclito), Short.valueOf(AV490bartipartfrom), Short.valueOf(AV491bartipartto), AV501muestras, Integer.valueOf(AV502barcodfrom), Integer.valueOf(AV503barcodto), Byte.valueOf(AV504barcodreofrom), Byte.valueOf(AV505barcodreoto), AV506barcodparfrom, AV507barcodparto, AV510Cod_idtx, AV513BarGirar});
      while ( (pr_default.getStatus(9) != 101) )
      {
         brk9DR18 = false ;
         A2454BarGirar = P09DR51_A2454BarGirar[0] ;
         A3030BarPlf = P09DR51_A3030BarPlf[0] ;
         A1235BarNumCli = P09DR51_A1235BarNumCli[0] ;
         A4348DisUsrCod = P09DR51_A4348DisUsrCod[0] ;
         A2829BarProPer = P09DR51_A2829BarProPer[0] ;
         A4466BarAcaAnh = P09DR51_A4466BarAcaAnh[0] ;
         A161BarFecSal = P09DR51_A161BarFecSal[0] ;
         A158BarFecFpr = P09DR51_A158BarFecFpr[0] ;
         A155BarFecCli = P09DR51_A155BarFecCli[0] ;
         A159BarFecGen = P09DR51_A159BarFecGen[0] ;
         A213BarSit = P09DR51_A213BarSit[0] ;
         A1234BarNomCli = P09DR51_A1234BarNomCli[0] ;
         A136BarColNum = P09DR51_A136BarColNum[0] ;
         A135BarColNom = P09DR51_A135BarColNom[0] ;
         A13711BarTipArtD = P09DR51_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P09DR51_n13711BarTipArtD[0] ;
         A217BarTipArt = P09DR51_A217BarTipArt[0] ;
         n217BarTipArt = P09DR51_n217BarTipArt[0] ;
         A1652BarSerDsc = P09DR51_A1652BarSerDsc[0] ;
         A212BarSer = P09DR51_A212BarSer[0] ;
         A120BarAgrEst = P09DR51_A120BarAgrEst[0] ;
         A279CliNom = P09DR51_A279CliNom[0] ;
         A252CliCod = P09DR51_A252CliCod[0] ;
         n252CliCod = P09DR51_n252CliCod[0] ;
         A1955BarFasSig = P09DR51_A1955BarFasSig[0] ;
         n1955BarFasSig = P09DR51_n1955BarFasSig[0] ;
         A130BarCodPar = P09DR51_A130BarCodPar[0] ;
         A132BarCodReo = P09DR51_A132BarCodReo[0] ;
         A129BarCod = P09DR51_A129BarCod[0] ;
         A361DisCod = P09DR51_A361DisCod[0] ;
         A143BarDisNum = P09DR51_A143BarDisNum[0] ;
         A4812BarEncCli = P09DR51_A4812BarEncCli[0] ;
         A396EmprCod = P09DR51_A396EmprCod[0] ;
         A4348DisUsrCod = P09DR51_A4348DisUsrCod[0] ;
         A13711BarTipArtD = P09DR51_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P09DR51_n13711BarTipArtD[0] ;
         A279CliNom = P09DR51_A279CliNom[0] ;
         A1955BarFasSig = P09DR51_A1955BarFasSig[0] ;
         n1955BarFasSig = P09DR51_n1955BarFasSig[0] ;
         GXt_int2 = A13930BarAlbUlti ;
         GXv_int3[0] = GXt_int2 ;
         new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int3) ;
         consultadeproduccion_wcgetfilterdata.this.GXt_int2 = GXv_int3[0] ;
         A13930BarAlbUlti = GXt_int2 ;
         if ( (0==AV468TFBarAlbUltimo) || ( ( A13930BarAlbUlti >= AV468TFBarAlbUltimo ) ) )
         {
            if ( (0==AV469TFBarAlbUltimo_To) || ( ( A13930BarAlbUlti <= AV469TFBarAlbUltimo_To ) ) )
            {
               GXt_int4 = A13935BarAlbFact ;
               GXv_int5[0] = GXt_int4 ;
               new app.produccion.consultadeproduccion_factura(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int5) ;
               consultadeproduccion_wcgetfilterdata.this.GXt_int4 = GXv_int5[0] ;
               A13935BarAlbFact = GXt_int4 ;
               if ( (0==AV480TFBarAlbFact) || ( ( A13935BarAlbFact >= AV480TFBarAlbFact ) ) )
               {
                  if ( (0==AV481TFBarAlbFact_To) || ( ( A13935BarAlbFact <= AV481TFBarAlbFact_To ) ) )
                  {
                     GXt_char6 = A13934BarNormas ;
                     GXv_char10[0] = GXt_char6 ;
                     new app.produccion.consultadeproduccion_normasestandarstextiles(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char10) ;
                     consultadeproduccion_wcgetfilterdata.this.GXt_char6 = GXv_char10[0] ;
                     A13934BarNormas = GXt_char6 ;
                     if ( ! ( (GXutil.strcmp("", AV477TFBarNormas_Sel)==0) && ( ! (GXutil.strcmp("", AV476TFBarNormas)==0) ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV476TFBarNormas) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV477TFBarNormas_Sel)==0) || ( ( GXutil.strcmp(A13934BarNormas, AV477TFBarNormas_Sel) == 0 ) ) )
                        {
                           GXt_char6 = A13878PedidoClie ;
                           GXv_char10[0] = A396EmprCod ;
                           GXv_char9[0] = A4812BarEncCli ;
                           GXv_char8[0] = A143BarDisNum ;
                           GXv_char7[0] = GXt_char6 ;
                           new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char10, GXv_char9, GXv_char8, GXv_char7) ;
                           consultadeproduccion_wcgetfilterdata.this.A396EmprCod = GXv_char10[0] ;
                           consultadeproduccion_wcgetfilterdata.this.A4812BarEncCli = GXv_char9[0] ;
                           consultadeproduccion_wcgetfilterdata.this.A143BarDisNum = GXv_char8[0] ;
                           consultadeproduccion_wcgetfilterdata.this.GXt_char6 = GXv_char7[0] ;
                           A13878PedidoClie = GXt_char6 ;
                           if ( (GXutil.strcmp("", AV462bardisnumfrom)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV462bardisnumfrom) >= 0 ) ) )
                           {
                              if ( (GXutil.strcmp("", AV463bardisnumto)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV463bardisnumto) <= 0 ) ) )
                              {
                                 A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
                                 AV452count = 0 ;
                                 while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(P09DR51_A2454BarGirar[0], A2454BarGirar) == 0 ) )
                                 {
                                    brk9DR18 = false ;
                                    A130BarCodPar = P09DR51_A130BarCodPar[0] ;
                                    A132BarCodReo = P09DR51_A132BarCodReo[0] ;
                                    A129BarCod = P09DR51_A129BarCod[0] ;
                                    A396EmprCod = P09DR51_A396EmprCod[0] ;
                                    AV452count = (long)(AV452count+1) ;
                                    brk9DR18 = true ;
                                    pr_default.readNext(9);
                                 }
                                 if ( ! (GXutil.strcmp("", A2454BarGirar)==0) )
                                 {
                                    AV444Option = A2454BarGirar ;
                                    AV445Options.add(AV444Option, 0);
                                    AV450OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV452count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                                 }
                                 if ( AV445Options.size() == 50 )
                                 {
                                    /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                    if (true) break;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk9DR18 )
         {
            brk9DR18 = true ;
            pr_default.readNext(9);
         }
      }
      pr_default.close(9);
   }

   public void S221( )
   {
      /* 'LOADBARPROPEROPTIONS' Routine */
      returnInSub = false ;
      AV246TFBarProPer = AV440SearchTxt ;
      AV247TFBarProPer_Sel = "" ;
      pr_default.dynParam(10, new Object[]{ new Object[]{
                                           Integer.valueOf(AV24TFCliCod) ,
                                           Integer.valueOf(AV25TFCliCod_To) ,
                                           AV27TFCliNom_Sel ,
                                           AV26TFCliNom ,
                                           AV17TFBarNHdr_Sel ,
                                           AV16TFBarNHdr ,
                                           AV157TFBarAgrEst_Sel ,
                                           AV156TFBarAgrEst ,
                                           AV29TFBarSer_Sel ,
                                           AV28TFBarSer ,
                                           AV31TFBarSerDsc_Sel ,
                                           AV30TFBarSerDsc ,
                                           Short.valueOf(AV32TFBarTipArt) ,
                                           Short.valueOf(AV33TFBarTipArt_To) ,
                                           AV35TFBarTipArtDsc_Sel ,
                                           AV34TFBarTipArtDsc ,
                                           AV37TFBarColNom_Sel ,
                                           AV36TFBarColNom ,
                                           Integer.valueOf(AV38TFBarColNum) ,
                                           Integer.valueOf(AV39TFBarColNum_To) ,
                                           AV201TFBarNomCli_Sel ,
                                           AV200TFBarNomCli ,
                                           Byte.valueOf(AV124TFBarSit) ,
                                           Byte.valueOf(AV125TFBarSit_To) ,
                                           AV40TFBarFecGen ,
                                           AV42TFBarFecCli ,
                                           AV144TFBarFecFpr ,
                                           AV46TFBarFecSal ,
                                           AV325TFBarGirar_Sel ,
                                           AV324TFBarGirar ,
                                           Short.valueOf(AV372TFBarAcaAnh) ,
                                           Short.valueOf(AV373TFBarAcaAnh_To) ,
                                           AV247TFBarProPer_Sel ,
                                           AV246TFBarProPer ,
                                           AV479TFDisUsrCod_Sel ,
                                           AV478TFDisUsrCod ,
                                           Integer.valueOf(AV460clicodfrom) ,
                                           Integer.valueOf(AV461clicodto) ,
                                           AV464barfecgenfrom ,
                                           AV465barfecgento ,
                                           AV486barfecsalfrom ,
                                           AV487barfecsalto ,
                                           AV482barfecclifrom ,
                                           AV483barfecclito ,
                                           AV484BarFecFprfrom ,
                                           AV485BarFecFprto ,
                                           AV488barserfrom ,
                                           AV489barserto ,
                                           AV492BarColNomfrom ,
                                           AV493BarColNomto ,
                                           Integer.valueOf(AV494BarColNumfrom) ,
                                           Integer.valueOf(AV495BarColNumto) ,
                                           AV496BarNomClifrom ,
                                           AV497BarNomClito ,
                                           Integer.valueOf(AV498BarNumclifrom) ,
                                           Integer.valueOf(AV499barnumclito) ,
                                           Short.valueOf(AV490bartipartfrom) ,
                                           Short.valueOf(AV491bartipartto) ,
                                           AV501muestras ,
                                           Integer.valueOf(AV502barcodfrom) ,
                                           Integer.valueOf(AV503barcodto) ,
                                           Byte.valueOf(AV504barcodreofrom) ,
                                           Byte.valueOf(AV505barcodreoto) ,
                                           AV506barcodparfrom ,
                                           AV507barcodparto ,
                                           AV510Cod_idtx ,
                                           AV513BarGirar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A120BarAgrEst ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A13711BarTipArtD ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Byte.valueOf(A213BarSit) ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A161BarFecSal ,
                                           A2454BarGirar ,
                                           Short.valueOf(A4466BarAcaAnh) ,
                                           A2829BarProPer ,
                                           A4348DisUsrCod ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A3030BarPlf ,
                                           AV65TFBarFasSig_Sel ,
                                           AV64TFBarFasSig ,
                                           A1955BarFasSig ,
                                           Long.valueOf(AV468TFBarAlbUltimo) ,
                                           Long.valueOf(A13930BarAlbUlti) ,
                                           Long.valueOf(AV469TFBarAlbUltimo_To) ,
                                           Integer.valueOf(AV480TFBarAlbFact) ,
                                           Integer.valueOf(A13935BarAlbFact) ,
                                           Integer.valueOf(AV481TFBarAlbFact_To) ,
                                           AV477TFBarNormas_Sel ,
                                           AV476TFBarNormas ,
                                           A13934BarNormas ,
                                           AV462bardisnumfrom ,
                                           A13878PedidoClie ,
                                           AV463bardisnumto ,
                                           Byte.valueOf(AV466barsitfrom) ,
                                           Byte.valueOf(AV467barsitto) ,
                                           A396EmprCod ,
                                           AV459Emprcod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV64TFBarFasSig = GXutil.padr( GXutil.rtrim( AV64TFBarFasSig), 8, "%") ;
      lV26TFCliNom = GXutil.padr( GXutil.rtrim( AV26TFCliNom), 30, "%") ;
      lV16TFBarNHdr = GXutil.padr( GXutil.rtrim( AV16TFBarNHdr), 11, "%") ;
      lV156TFBarAgrEst = GXutil.padr( GXutil.rtrim( AV156TFBarAgrEst), 1, "%") ;
      lV28TFBarSer = GXutil.padr( GXutil.rtrim( AV28TFBarSer), 16, "%") ;
      lV30TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV30TFBarSerDsc), 26, "%") ;
      lV34TFBarTipArtDsc = GXutil.padr( GXutil.rtrim( AV34TFBarTipArtDsc), 30, "%") ;
      lV36TFBarColNom = GXutil.padr( GXutil.rtrim( AV36TFBarColNom), 13, "%") ;
      lV200TFBarNomCli = GXutil.padr( GXutil.rtrim( AV200TFBarNomCli), 13, "%") ;
      lV324TFBarGirar = GXutil.padr( GXutil.rtrim( AV324TFBarGirar), 20, "%") ;
      lV246TFBarProPer = GXutil.padr( GXutil.rtrim( AV246TFBarProPer), 8, "%") ;
      lV478TFDisUsrCod = GXutil.padr( GXutil.rtrim( AV478TFDisUsrCod), 8, "%") ;
      /* Using cursor P09DR56 */
      pr_default.execute(10, new Object[] {AV65TFBarFasSig_Sel, AV64TFBarFasSig, lV64TFBarFasSig, AV65TFBarFasSig_Sel, AV65TFBarFasSig_Sel, Byte.valueOf(AV466barsitfrom), Byte.valueOf(AV467barsitto), AV459Emprcod, Integer.valueOf(AV24TFCliCod), Integer.valueOf(AV25TFCliCod_To), lV26TFCliNom, AV27TFCliNom_Sel, lV16TFBarNHdr, AV17TFBarNHdr_Sel, lV156TFBarAgrEst, AV157TFBarAgrEst_Sel, lV28TFBarSer, AV29TFBarSer_Sel, lV30TFBarSerDsc, AV31TFBarSerDsc_Sel, Short.valueOf(AV32TFBarTipArt), Short.valueOf(AV33TFBarTipArt_To), lV34TFBarTipArtDsc, AV35TFBarTipArtDsc_Sel, lV36TFBarColNom, AV37TFBarColNom_Sel, Integer.valueOf(AV38TFBarColNum), Integer.valueOf(AV39TFBarColNum_To), lV200TFBarNomCli, AV201TFBarNomCli_Sel, Byte.valueOf(AV124TFBarSit), Byte.valueOf(AV125TFBarSit_To), AV40TFBarFecGen, AV42TFBarFecCli, AV144TFBarFecFpr, AV46TFBarFecSal, lV324TFBarGirar, AV325TFBarGirar_Sel, Short.valueOf(AV372TFBarAcaAnh), Short.valueOf(AV373TFBarAcaAnh_To), lV246TFBarProPer, AV247TFBarProPer_Sel, lV478TFDisUsrCod, AV479TFDisUsrCod_Sel, Integer.valueOf(AV460clicodfrom), Integer.valueOf(AV461clicodto), AV464barfecgenfrom, AV465barfecgento, AV486barfecsalfrom, AV487barfecsalto, AV482barfecclifrom, AV483barfecclito, AV484BarFecFprfrom, AV485BarFecFprto, AV488barserfrom, AV489barserto, AV492BarColNomfrom, AV493BarColNomto, Integer.valueOf(AV494BarColNumfrom), Integer.valueOf(AV495BarColNumto), AV496BarNomClifrom, AV497BarNomClito, Integer.valueOf(AV498BarNumclifrom), Integer.valueOf(AV499barnumclito), Short.valueOf(AV490bartipartfrom), Short.valueOf(AV491bartipartto), AV501muestras, Integer.valueOf(AV502barcodfrom), Integer.valueOf(AV503barcodto), Byte.valueOf(AV504barcodreofrom), Byte.valueOf(AV505barcodreoto), AV506barcodparfrom, AV507barcodparto, AV510Cod_idtx, AV513BarGirar});
      while ( (pr_default.getStatus(10) != 101) )
      {
         brk9DR20 = false ;
         A2829BarProPer = P09DR56_A2829BarProPer[0] ;
         A3030BarPlf = P09DR56_A3030BarPlf[0] ;
         A1235BarNumCli = P09DR56_A1235BarNumCli[0] ;
         A4348DisUsrCod = P09DR56_A4348DisUsrCod[0] ;
         A4466BarAcaAnh = P09DR56_A4466BarAcaAnh[0] ;
         A2454BarGirar = P09DR56_A2454BarGirar[0] ;
         A161BarFecSal = P09DR56_A161BarFecSal[0] ;
         A158BarFecFpr = P09DR56_A158BarFecFpr[0] ;
         A155BarFecCli = P09DR56_A155BarFecCli[0] ;
         A159BarFecGen = P09DR56_A159BarFecGen[0] ;
         A213BarSit = P09DR56_A213BarSit[0] ;
         A1234BarNomCli = P09DR56_A1234BarNomCli[0] ;
         A136BarColNum = P09DR56_A136BarColNum[0] ;
         A135BarColNom = P09DR56_A135BarColNom[0] ;
         A13711BarTipArtD = P09DR56_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P09DR56_n13711BarTipArtD[0] ;
         A217BarTipArt = P09DR56_A217BarTipArt[0] ;
         n217BarTipArt = P09DR56_n217BarTipArt[0] ;
         A1652BarSerDsc = P09DR56_A1652BarSerDsc[0] ;
         A212BarSer = P09DR56_A212BarSer[0] ;
         A120BarAgrEst = P09DR56_A120BarAgrEst[0] ;
         A279CliNom = P09DR56_A279CliNom[0] ;
         A252CliCod = P09DR56_A252CliCod[0] ;
         n252CliCod = P09DR56_n252CliCod[0] ;
         A1955BarFasSig = P09DR56_A1955BarFasSig[0] ;
         n1955BarFasSig = P09DR56_n1955BarFasSig[0] ;
         A130BarCodPar = P09DR56_A130BarCodPar[0] ;
         A132BarCodReo = P09DR56_A132BarCodReo[0] ;
         A129BarCod = P09DR56_A129BarCod[0] ;
         A361DisCod = P09DR56_A361DisCod[0] ;
         A143BarDisNum = P09DR56_A143BarDisNum[0] ;
         A4812BarEncCli = P09DR56_A4812BarEncCli[0] ;
         A396EmprCod = P09DR56_A396EmprCod[0] ;
         A4348DisUsrCod = P09DR56_A4348DisUsrCod[0] ;
         A13711BarTipArtD = P09DR56_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P09DR56_n13711BarTipArtD[0] ;
         A279CliNom = P09DR56_A279CliNom[0] ;
         A1955BarFasSig = P09DR56_A1955BarFasSig[0] ;
         n1955BarFasSig = P09DR56_n1955BarFasSig[0] ;
         GXt_int2 = A13930BarAlbUlti ;
         GXv_int3[0] = GXt_int2 ;
         new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int3) ;
         consultadeproduccion_wcgetfilterdata.this.GXt_int2 = GXv_int3[0] ;
         A13930BarAlbUlti = GXt_int2 ;
         if ( (0==AV468TFBarAlbUltimo) || ( ( A13930BarAlbUlti >= AV468TFBarAlbUltimo ) ) )
         {
            if ( (0==AV469TFBarAlbUltimo_To) || ( ( A13930BarAlbUlti <= AV469TFBarAlbUltimo_To ) ) )
            {
               GXt_int4 = A13935BarAlbFact ;
               GXv_int5[0] = GXt_int4 ;
               new app.produccion.consultadeproduccion_factura(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int5) ;
               consultadeproduccion_wcgetfilterdata.this.GXt_int4 = GXv_int5[0] ;
               A13935BarAlbFact = GXt_int4 ;
               if ( (0==AV480TFBarAlbFact) || ( ( A13935BarAlbFact >= AV480TFBarAlbFact ) ) )
               {
                  if ( (0==AV481TFBarAlbFact_To) || ( ( A13935BarAlbFact <= AV481TFBarAlbFact_To ) ) )
                  {
                     GXt_char6 = A13934BarNormas ;
                     GXv_char10[0] = GXt_char6 ;
                     new app.produccion.consultadeproduccion_normasestandarstextiles(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char10) ;
                     consultadeproduccion_wcgetfilterdata.this.GXt_char6 = GXv_char10[0] ;
                     A13934BarNormas = GXt_char6 ;
                     if ( ! ( (GXutil.strcmp("", AV477TFBarNormas_Sel)==0) && ( ! (GXutil.strcmp("", AV476TFBarNormas)==0) ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV476TFBarNormas) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV477TFBarNormas_Sel)==0) || ( ( GXutil.strcmp(A13934BarNormas, AV477TFBarNormas_Sel) == 0 ) ) )
                        {
                           GXt_char6 = A13878PedidoClie ;
                           GXv_char10[0] = A396EmprCod ;
                           GXv_char9[0] = A4812BarEncCli ;
                           GXv_char8[0] = A143BarDisNum ;
                           GXv_char7[0] = GXt_char6 ;
                           new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char10, GXv_char9, GXv_char8, GXv_char7) ;
                           consultadeproduccion_wcgetfilterdata.this.A396EmprCod = GXv_char10[0] ;
                           consultadeproduccion_wcgetfilterdata.this.A4812BarEncCli = GXv_char9[0] ;
                           consultadeproduccion_wcgetfilterdata.this.A143BarDisNum = GXv_char8[0] ;
                           consultadeproduccion_wcgetfilterdata.this.GXt_char6 = GXv_char7[0] ;
                           A13878PedidoClie = GXt_char6 ;
                           if ( (GXutil.strcmp("", AV462bardisnumfrom)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV462bardisnumfrom) >= 0 ) ) )
                           {
                              if ( (GXutil.strcmp("", AV463bardisnumto)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV463bardisnumto) <= 0 ) ) )
                              {
                                 A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
                                 AV452count = 0 ;
                                 while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(P09DR56_A2829BarProPer[0], A2829BarProPer) == 0 ) )
                                 {
                                    brk9DR20 = false ;
                                    A130BarCodPar = P09DR56_A130BarCodPar[0] ;
                                    A132BarCodReo = P09DR56_A132BarCodReo[0] ;
                                    A129BarCod = P09DR56_A129BarCod[0] ;
                                    A396EmprCod = P09DR56_A396EmprCod[0] ;
                                    AV452count = (long)(AV452count+1) ;
                                    brk9DR20 = true ;
                                    pr_default.readNext(10);
                                 }
                                 if ( ! (GXutil.strcmp("", A2829BarProPer)==0) )
                                 {
                                    AV444Option = A2829BarProPer ;
                                    AV445Options.add(AV444Option, 0);
                                    AV450OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV452count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                                 }
                                 if ( AV445Options.size() == 50 )
                                 {
                                    /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                    if (true) break;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk9DR20 )
         {
            brk9DR20 = true ;
            pr_default.readNext(10);
         }
      }
      pr_default.close(10);
   }

   public void S231( )
   {
      /* 'LOADBARNORMASOPTIONS' Routine */
      returnInSub = false ;
      AV476TFBarNormas = AV440SearchTxt ;
      AV477TFBarNormas_Sel = "" ;
      pr_default.dynParam(11, new Object[]{ new Object[]{
                                           Integer.valueOf(AV24TFCliCod) ,
                                           Integer.valueOf(AV25TFCliCod_To) ,
                                           AV27TFCliNom_Sel ,
                                           AV26TFCliNom ,
                                           AV17TFBarNHdr_Sel ,
                                           AV16TFBarNHdr ,
                                           AV157TFBarAgrEst_Sel ,
                                           AV156TFBarAgrEst ,
                                           AV29TFBarSer_Sel ,
                                           AV28TFBarSer ,
                                           AV31TFBarSerDsc_Sel ,
                                           AV30TFBarSerDsc ,
                                           Short.valueOf(AV32TFBarTipArt) ,
                                           Short.valueOf(AV33TFBarTipArt_To) ,
                                           AV35TFBarTipArtDsc_Sel ,
                                           AV34TFBarTipArtDsc ,
                                           AV37TFBarColNom_Sel ,
                                           AV36TFBarColNom ,
                                           Integer.valueOf(AV38TFBarColNum) ,
                                           Integer.valueOf(AV39TFBarColNum_To) ,
                                           AV201TFBarNomCli_Sel ,
                                           AV200TFBarNomCli ,
                                           Byte.valueOf(AV124TFBarSit) ,
                                           Byte.valueOf(AV125TFBarSit_To) ,
                                           AV40TFBarFecGen ,
                                           AV42TFBarFecCli ,
                                           AV144TFBarFecFpr ,
                                           AV46TFBarFecSal ,
                                           AV325TFBarGirar_Sel ,
                                           AV324TFBarGirar ,
                                           Short.valueOf(AV372TFBarAcaAnh) ,
                                           Short.valueOf(AV373TFBarAcaAnh_To) ,
                                           AV247TFBarProPer_Sel ,
                                           AV246TFBarProPer ,
                                           AV479TFDisUsrCod_Sel ,
                                           AV478TFDisUsrCod ,
                                           Integer.valueOf(AV460clicodfrom) ,
                                           Integer.valueOf(AV461clicodto) ,
                                           AV464barfecgenfrom ,
                                           AV465barfecgento ,
                                           AV486barfecsalfrom ,
                                           AV487barfecsalto ,
                                           AV482barfecclifrom ,
                                           AV483barfecclito ,
                                           AV484BarFecFprfrom ,
                                           AV485BarFecFprto ,
                                           AV488barserfrom ,
                                           AV489barserto ,
                                           AV492BarColNomfrom ,
                                           AV493BarColNomto ,
                                           Integer.valueOf(AV494BarColNumfrom) ,
                                           Integer.valueOf(AV495BarColNumto) ,
                                           AV496BarNomClifrom ,
                                           AV497BarNomClito ,
                                           Integer.valueOf(AV498BarNumclifrom) ,
                                           Integer.valueOf(AV499barnumclito) ,
                                           Short.valueOf(AV490bartipartfrom) ,
                                           Short.valueOf(AV491bartipartto) ,
                                           AV501muestras ,
                                           Integer.valueOf(AV502barcodfrom) ,
                                           Integer.valueOf(AV503barcodto) ,
                                           Byte.valueOf(AV504barcodreofrom) ,
                                           Byte.valueOf(AV505barcodreoto) ,
                                           AV506barcodparfrom ,
                                           AV507barcodparto ,
                                           AV510Cod_idtx ,
                                           AV513BarGirar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A120BarAgrEst ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A13711BarTipArtD ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Byte.valueOf(A213BarSit) ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A161BarFecSal ,
                                           A2454BarGirar ,
                                           Short.valueOf(A4466BarAcaAnh) ,
                                           A2829BarProPer ,
                                           A4348DisUsrCod ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A3030BarPlf ,
                                           AV65TFBarFasSig_Sel ,
                                           AV64TFBarFasSig ,
                                           A1955BarFasSig ,
                                           Long.valueOf(AV468TFBarAlbUltimo) ,
                                           Long.valueOf(A13930BarAlbUlti) ,
                                           Long.valueOf(AV469TFBarAlbUltimo_To) ,
                                           Integer.valueOf(AV480TFBarAlbFact) ,
                                           Integer.valueOf(A13935BarAlbFact) ,
                                           Integer.valueOf(AV481TFBarAlbFact_To) ,
                                           AV477TFBarNormas_Sel ,
                                           AV476TFBarNormas ,
                                           A13934BarNormas ,
                                           AV462bardisnumfrom ,
                                           A13878PedidoClie ,
                                           AV463bardisnumto ,
                                           Byte.valueOf(AV466barsitfrom) ,
                                           Byte.valueOf(AV467barsitto) ,
                                           AV459Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV64TFBarFasSig = GXutil.padr( GXutil.rtrim( AV64TFBarFasSig), 8, "%") ;
      lV26TFCliNom = GXutil.padr( GXutil.rtrim( AV26TFCliNom), 30, "%") ;
      lV16TFBarNHdr = GXutil.padr( GXutil.rtrim( AV16TFBarNHdr), 11, "%") ;
      lV156TFBarAgrEst = GXutil.padr( GXutil.rtrim( AV156TFBarAgrEst), 1, "%") ;
      lV28TFBarSer = GXutil.padr( GXutil.rtrim( AV28TFBarSer), 16, "%") ;
      lV30TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV30TFBarSerDsc), 26, "%") ;
      lV34TFBarTipArtDsc = GXutil.padr( GXutil.rtrim( AV34TFBarTipArtDsc), 30, "%") ;
      lV36TFBarColNom = GXutil.padr( GXutil.rtrim( AV36TFBarColNom), 13, "%") ;
      lV200TFBarNomCli = GXutil.padr( GXutil.rtrim( AV200TFBarNomCli), 13, "%") ;
      lV324TFBarGirar = GXutil.padr( GXutil.rtrim( AV324TFBarGirar), 20, "%") ;
      lV246TFBarProPer = GXutil.padr( GXutil.rtrim( AV246TFBarProPer), 8, "%") ;
      lV478TFDisUsrCod = GXutil.padr( GXutil.rtrim( AV478TFDisUsrCod), 8, "%") ;
      /* Using cursor P09DR61 */
      pr_default.execute(11, new Object[] {AV459Emprcod, AV65TFBarFasSig_Sel, AV64TFBarFasSig, lV64TFBarFasSig, AV65TFBarFasSig_Sel, AV65TFBarFasSig_Sel, Byte.valueOf(AV466barsitfrom), Byte.valueOf(AV467barsitto), Integer.valueOf(AV24TFCliCod), Integer.valueOf(AV25TFCliCod_To), lV26TFCliNom, AV27TFCliNom_Sel, lV16TFBarNHdr, AV17TFBarNHdr_Sel, lV156TFBarAgrEst, AV157TFBarAgrEst_Sel, lV28TFBarSer, AV29TFBarSer_Sel, lV30TFBarSerDsc, AV31TFBarSerDsc_Sel, Short.valueOf(AV32TFBarTipArt), Short.valueOf(AV33TFBarTipArt_To), lV34TFBarTipArtDsc, AV35TFBarTipArtDsc_Sel, lV36TFBarColNom, AV37TFBarColNom_Sel, Integer.valueOf(AV38TFBarColNum), Integer.valueOf(AV39TFBarColNum_To), lV200TFBarNomCli, AV201TFBarNomCli_Sel, Byte.valueOf(AV124TFBarSit), Byte.valueOf(AV125TFBarSit_To), AV40TFBarFecGen, AV42TFBarFecCli, AV144TFBarFecFpr, AV46TFBarFecSal, lV324TFBarGirar, AV325TFBarGirar_Sel, Short.valueOf(AV372TFBarAcaAnh), Short.valueOf(AV373TFBarAcaAnh_To), lV246TFBarProPer, AV247TFBarProPer_Sel, lV478TFDisUsrCod, AV479TFDisUsrCod_Sel, Integer.valueOf(AV460clicodfrom), Integer.valueOf(AV461clicodto), AV464barfecgenfrom, AV465barfecgento, AV486barfecsalfrom, AV487barfecsalto, AV482barfecclifrom, AV483barfecclito, AV484BarFecFprfrom, AV485BarFecFprto, AV488barserfrom, AV489barserto, AV492BarColNomfrom, AV493BarColNomto, Integer.valueOf(AV494BarColNumfrom), Integer.valueOf(AV495BarColNumto), AV496BarNomClifrom, AV497BarNomClito, Integer.valueOf(AV498BarNumclifrom), Integer.valueOf(AV499barnumclito), Short.valueOf(AV490bartipartfrom), Short.valueOf(AV491bartipartto), AV501muestras, Integer.valueOf(AV502barcodfrom), Integer.valueOf(AV503barcodto), Byte.valueOf(AV504barcodreofrom), Byte.valueOf(AV505barcodreoto), AV506barcodparfrom, AV507barcodparto, AV510Cod_idtx, AV513BarGirar});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A3030BarPlf = P09DR61_A3030BarPlf[0] ;
         A1235BarNumCli = P09DR61_A1235BarNumCli[0] ;
         A4348DisUsrCod = P09DR61_A4348DisUsrCod[0] ;
         A2829BarProPer = P09DR61_A2829BarProPer[0] ;
         A4466BarAcaAnh = P09DR61_A4466BarAcaAnh[0] ;
         A2454BarGirar = P09DR61_A2454BarGirar[0] ;
         A161BarFecSal = P09DR61_A161BarFecSal[0] ;
         A158BarFecFpr = P09DR61_A158BarFecFpr[0] ;
         A155BarFecCli = P09DR61_A155BarFecCli[0] ;
         A159BarFecGen = P09DR61_A159BarFecGen[0] ;
         A213BarSit = P09DR61_A213BarSit[0] ;
         A1234BarNomCli = P09DR61_A1234BarNomCli[0] ;
         A136BarColNum = P09DR61_A136BarColNum[0] ;
         A135BarColNom = P09DR61_A135BarColNom[0] ;
         A13711BarTipArtD = P09DR61_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P09DR61_n13711BarTipArtD[0] ;
         A217BarTipArt = P09DR61_A217BarTipArt[0] ;
         n217BarTipArt = P09DR61_n217BarTipArt[0] ;
         A1652BarSerDsc = P09DR61_A1652BarSerDsc[0] ;
         A212BarSer = P09DR61_A212BarSer[0] ;
         A120BarAgrEst = P09DR61_A120BarAgrEst[0] ;
         A279CliNom = P09DR61_A279CliNom[0] ;
         A252CliCod = P09DR61_A252CliCod[0] ;
         n252CliCod = P09DR61_n252CliCod[0] ;
         A1955BarFasSig = P09DR61_A1955BarFasSig[0] ;
         n1955BarFasSig = P09DR61_n1955BarFasSig[0] ;
         A130BarCodPar = P09DR61_A130BarCodPar[0] ;
         A132BarCodReo = P09DR61_A132BarCodReo[0] ;
         A129BarCod = P09DR61_A129BarCod[0] ;
         A361DisCod = P09DR61_A361DisCod[0] ;
         A143BarDisNum = P09DR61_A143BarDisNum[0] ;
         A4812BarEncCli = P09DR61_A4812BarEncCli[0] ;
         A396EmprCod = P09DR61_A396EmprCod[0] ;
         A4348DisUsrCod = P09DR61_A4348DisUsrCod[0] ;
         A13711BarTipArtD = P09DR61_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P09DR61_n13711BarTipArtD[0] ;
         A279CliNom = P09DR61_A279CliNom[0] ;
         A1955BarFasSig = P09DR61_A1955BarFasSig[0] ;
         n1955BarFasSig = P09DR61_n1955BarFasSig[0] ;
         GXt_int2 = A13930BarAlbUlti ;
         GXv_int3[0] = GXt_int2 ;
         new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int3) ;
         consultadeproduccion_wcgetfilterdata.this.GXt_int2 = GXv_int3[0] ;
         A13930BarAlbUlti = GXt_int2 ;
         if ( (0==AV468TFBarAlbUltimo) || ( ( A13930BarAlbUlti >= AV468TFBarAlbUltimo ) ) )
         {
            if ( (0==AV469TFBarAlbUltimo_To) || ( ( A13930BarAlbUlti <= AV469TFBarAlbUltimo_To ) ) )
            {
               GXt_int4 = A13935BarAlbFact ;
               GXv_int5[0] = GXt_int4 ;
               new app.produccion.consultadeproduccion_factura(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int5) ;
               consultadeproduccion_wcgetfilterdata.this.GXt_int4 = GXv_int5[0] ;
               A13935BarAlbFact = GXt_int4 ;
               if ( (0==AV480TFBarAlbFact) || ( ( A13935BarAlbFact >= AV480TFBarAlbFact ) ) )
               {
                  if ( (0==AV481TFBarAlbFact_To) || ( ( A13935BarAlbFact <= AV481TFBarAlbFact_To ) ) )
                  {
                     GXt_char6 = A13934BarNormas ;
                     GXv_char10[0] = GXt_char6 ;
                     new app.produccion.consultadeproduccion_normasestandarstextiles(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char10) ;
                     consultadeproduccion_wcgetfilterdata.this.GXt_char6 = GXv_char10[0] ;
                     A13934BarNormas = GXt_char6 ;
                     if ( ! ( (GXutil.strcmp("", AV477TFBarNormas_Sel)==0) && ( ! (GXutil.strcmp("", AV476TFBarNormas)==0) ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV476TFBarNormas) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV477TFBarNormas_Sel)==0) || ( ( GXutil.strcmp(A13934BarNormas, AV477TFBarNormas_Sel) == 0 ) ) )
                        {
                           GXt_char6 = A13878PedidoClie ;
                           GXv_char10[0] = A396EmprCod ;
                           GXv_char9[0] = A4812BarEncCli ;
                           GXv_char8[0] = A143BarDisNum ;
                           GXv_char7[0] = GXt_char6 ;
                           new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char10, GXv_char9, GXv_char8, GXv_char7) ;
                           consultadeproduccion_wcgetfilterdata.this.A396EmprCod = GXv_char10[0] ;
                           consultadeproduccion_wcgetfilterdata.this.A4812BarEncCli = GXv_char9[0] ;
                           consultadeproduccion_wcgetfilterdata.this.A143BarDisNum = GXv_char8[0] ;
                           consultadeproduccion_wcgetfilterdata.this.GXt_char6 = GXv_char7[0] ;
                           A13878PedidoClie = GXt_char6 ;
                           if ( (GXutil.strcmp("", AV462bardisnumfrom)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV462bardisnumfrom) >= 0 ) ) )
                           {
                              if ( (GXutil.strcmp("", AV463bardisnumto)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV463bardisnumto) <= 0 ) ) )
                              {
                                 A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
                                 if ( ! (GXutil.strcmp("", A13934BarNormas)==0) )
                                 {
                                    AV444Option = A13934BarNormas ;
                                    AV443InsertIndex = 1 ;
                                    while ( ( AV443InsertIndex <= AV445Options.size() ) && ( GXutil.strcmp((String)AV445Options.elementAt(-1+AV443InsertIndex), AV444Option) < 0 ) )
                                    {
                                       AV443InsertIndex = (int)(AV443InsertIndex+1) ;
                                    }
                                    if ( ( AV443InsertIndex <= AV445Options.size() ) && ( GXutil.strcmp((String)AV445Options.elementAt(-1+AV443InsertIndex), AV444Option) == 0 ) )
                                    {
                                       AV452count = GXutil.lval( (String)AV450OptionIndexes.elementAt(-1+AV443InsertIndex)) ;
                                       AV452count = (long)(AV452count+1) ;
                                       AV450OptionIndexes.removeItem(AV443InsertIndex);
                                       AV450OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV452count), "Z,ZZZ,ZZZ,ZZ9")), AV443InsertIndex);
                                    }
                                    else
                                    {
                                       AV445Options.add(AV444Option, AV443InsertIndex);
                                       AV450OptionIndexes.add("1", AV443InsertIndex);
                                    }
                                 }
                                 if ( AV445Options.size() == 50 )
                                 {
                                    /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                    if (true) break;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(11);
      }
      pr_default.close(11);
   }

   public void S241( )
   {
      /* 'LOADDISUSRCODOPTIONS' Routine */
      returnInSub = false ;
      AV478TFDisUsrCod = AV440SearchTxt ;
      AV479TFDisUsrCod_Sel = "" ;
      pr_default.dynParam(12, new Object[]{ new Object[]{
                                           Integer.valueOf(AV24TFCliCod) ,
                                           Integer.valueOf(AV25TFCliCod_To) ,
                                           AV27TFCliNom_Sel ,
                                           AV26TFCliNom ,
                                           AV17TFBarNHdr_Sel ,
                                           AV16TFBarNHdr ,
                                           AV157TFBarAgrEst_Sel ,
                                           AV156TFBarAgrEst ,
                                           AV29TFBarSer_Sel ,
                                           AV28TFBarSer ,
                                           AV31TFBarSerDsc_Sel ,
                                           AV30TFBarSerDsc ,
                                           Short.valueOf(AV32TFBarTipArt) ,
                                           Short.valueOf(AV33TFBarTipArt_To) ,
                                           AV35TFBarTipArtDsc_Sel ,
                                           AV34TFBarTipArtDsc ,
                                           AV37TFBarColNom_Sel ,
                                           AV36TFBarColNom ,
                                           Integer.valueOf(AV38TFBarColNum) ,
                                           Integer.valueOf(AV39TFBarColNum_To) ,
                                           AV201TFBarNomCli_Sel ,
                                           AV200TFBarNomCli ,
                                           Byte.valueOf(AV124TFBarSit) ,
                                           Byte.valueOf(AV125TFBarSit_To) ,
                                           AV40TFBarFecGen ,
                                           AV42TFBarFecCli ,
                                           AV144TFBarFecFpr ,
                                           AV46TFBarFecSal ,
                                           AV325TFBarGirar_Sel ,
                                           AV324TFBarGirar ,
                                           Short.valueOf(AV372TFBarAcaAnh) ,
                                           Short.valueOf(AV373TFBarAcaAnh_To) ,
                                           AV247TFBarProPer_Sel ,
                                           AV246TFBarProPer ,
                                           AV479TFDisUsrCod_Sel ,
                                           AV478TFDisUsrCod ,
                                           Integer.valueOf(AV460clicodfrom) ,
                                           Integer.valueOf(AV461clicodto) ,
                                           AV464barfecgenfrom ,
                                           AV465barfecgento ,
                                           AV486barfecsalfrom ,
                                           AV487barfecsalto ,
                                           AV482barfecclifrom ,
                                           AV483barfecclito ,
                                           AV484BarFecFprfrom ,
                                           AV485BarFecFprto ,
                                           AV488barserfrom ,
                                           AV489barserto ,
                                           AV492BarColNomfrom ,
                                           AV493BarColNomto ,
                                           Integer.valueOf(AV494BarColNumfrom) ,
                                           Integer.valueOf(AV495BarColNumto) ,
                                           AV496BarNomClifrom ,
                                           AV497BarNomClito ,
                                           Integer.valueOf(AV498BarNumclifrom) ,
                                           Integer.valueOf(AV499barnumclito) ,
                                           Short.valueOf(AV490bartipartfrom) ,
                                           Short.valueOf(AV491bartipartto) ,
                                           AV501muestras ,
                                           Integer.valueOf(AV502barcodfrom) ,
                                           Integer.valueOf(AV503barcodto) ,
                                           Byte.valueOf(AV504barcodreofrom) ,
                                           Byte.valueOf(AV505barcodreoto) ,
                                           AV506barcodparfrom ,
                                           AV507barcodparto ,
                                           AV510Cod_idtx ,
                                           AV513BarGirar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A120BarAgrEst ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A13711BarTipArtD ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Byte.valueOf(A213BarSit) ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A161BarFecSal ,
                                           A2454BarGirar ,
                                           Short.valueOf(A4466BarAcaAnh) ,
                                           A2829BarProPer ,
                                           A4348DisUsrCod ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A3030BarPlf ,
                                           AV65TFBarFasSig_Sel ,
                                           AV64TFBarFasSig ,
                                           A1955BarFasSig ,
                                           Long.valueOf(AV468TFBarAlbUltimo) ,
                                           Long.valueOf(A13930BarAlbUlti) ,
                                           Long.valueOf(AV469TFBarAlbUltimo_To) ,
                                           Integer.valueOf(AV480TFBarAlbFact) ,
                                           Integer.valueOf(A13935BarAlbFact) ,
                                           Integer.valueOf(AV481TFBarAlbFact_To) ,
                                           AV477TFBarNormas_Sel ,
                                           AV476TFBarNormas ,
                                           A13934BarNormas ,
                                           AV462bardisnumfrom ,
                                           A13878PedidoClie ,
                                           AV463bardisnumto ,
                                           Byte.valueOf(AV466barsitfrom) ,
                                           Byte.valueOf(AV467barsitto) ,
                                           A396EmprCod ,
                                           AV459Emprcod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV64TFBarFasSig = GXutil.padr( GXutil.rtrim( AV64TFBarFasSig), 8, "%") ;
      lV26TFCliNom = GXutil.padr( GXutil.rtrim( AV26TFCliNom), 30, "%") ;
      lV16TFBarNHdr = GXutil.padr( GXutil.rtrim( AV16TFBarNHdr), 11, "%") ;
      lV156TFBarAgrEst = GXutil.padr( GXutil.rtrim( AV156TFBarAgrEst), 1, "%") ;
      lV28TFBarSer = GXutil.padr( GXutil.rtrim( AV28TFBarSer), 16, "%") ;
      lV30TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV30TFBarSerDsc), 26, "%") ;
      lV34TFBarTipArtDsc = GXutil.padr( GXutil.rtrim( AV34TFBarTipArtDsc), 30, "%") ;
      lV36TFBarColNom = GXutil.padr( GXutil.rtrim( AV36TFBarColNom), 13, "%") ;
      lV200TFBarNomCli = GXutil.padr( GXutil.rtrim( AV200TFBarNomCli), 13, "%") ;
      lV324TFBarGirar = GXutil.padr( GXutil.rtrim( AV324TFBarGirar), 20, "%") ;
      lV246TFBarProPer = GXutil.padr( GXutil.rtrim( AV246TFBarProPer), 8, "%") ;
      lV478TFDisUsrCod = GXutil.padr( GXutil.rtrim( AV478TFDisUsrCod), 8, "%") ;
      /* Using cursor P09DR66 */
      pr_default.execute(12, new Object[] {AV65TFBarFasSig_Sel, AV64TFBarFasSig, lV64TFBarFasSig, AV65TFBarFasSig_Sel, AV65TFBarFasSig_Sel, Byte.valueOf(AV466barsitfrom), Byte.valueOf(AV467barsitto), AV459Emprcod, Integer.valueOf(AV24TFCliCod), Integer.valueOf(AV25TFCliCod_To), lV26TFCliNom, AV27TFCliNom_Sel, lV16TFBarNHdr, AV17TFBarNHdr_Sel, lV156TFBarAgrEst, AV157TFBarAgrEst_Sel, lV28TFBarSer, AV29TFBarSer_Sel, lV30TFBarSerDsc, AV31TFBarSerDsc_Sel, Short.valueOf(AV32TFBarTipArt), Short.valueOf(AV33TFBarTipArt_To), lV34TFBarTipArtDsc, AV35TFBarTipArtDsc_Sel, lV36TFBarColNom, AV37TFBarColNom_Sel, Integer.valueOf(AV38TFBarColNum), Integer.valueOf(AV39TFBarColNum_To), lV200TFBarNomCli, AV201TFBarNomCli_Sel, Byte.valueOf(AV124TFBarSit), Byte.valueOf(AV125TFBarSit_To), AV40TFBarFecGen, AV42TFBarFecCli, AV144TFBarFecFpr, AV46TFBarFecSal, lV324TFBarGirar, AV325TFBarGirar_Sel, Short.valueOf(AV372TFBarAcaAnh), Short.valueOf(AV373TFBarAcaAnh_To), lV246TFBarProPer, AV247TFBarProPer_Sel, lV478TFDisUsrCod, AV479TFDisUsrCod_Sel, Integer.valueOf(AV460clicodfrom), Integer.valueOf(AV461clicodto), AV464barfecgenfrom, AV465barfecgento, AV486barfecsalfrom, AV487barfecsalto, AV482barfecclifrom, AV483barfecclito, AV484BarFecFprfrom, AV485BarFecFprto, AV488barserfrom, AV489barserto, AV492BarColNomfrom, AV493BarColNomto, Integer.valueOf(AV494BarColNumfrom), Integer.valueOf(AV495BarColNumto), AV496BarNomClifrom, AV497BarNomClito, Integer.valueOf(AV498BarNumclifrom), Integer.valueOf(AV499barnumclito), Short.valueOf(AV490bartipartfrom), Short.valueOf(AV491bartipartto), AV501muestras, Integer.valueOf(AV502barcodfrom), Integer.valueOf(AV503barcodto), Byte.valueOf(AV504barcodreofrom), Byte.valueOf(AV505barcodreoto), AV506barcodparfrom, AV507barcodparto, AV510Cod_idtx, AV513BarGirar});
      while ( (pr_default.getStatus(12) != 101) )
      {
         brk9DR23 = false ;
         A4348DisUsrCod = P09DR66_A4348DisUsrCod[0] ;
         A3030BarPlf = P09DR66_A3030BarPlf[0] ;
         A1235BarNumCli = P09DR66_A1235BarNumCli[0] ;
         A2829BarProPer = P09DR66_A2829BarProPer[0] ;
         A4466BarAcaAnh = P09DR66_A4466BarAcaAnh[0] ;
         A2454BarGirar = P09DR66_A2454BarGirar[0] ;
         A161BarFecSal = P09DR66_A161BarFecSal[0] ;
         A158BarFecFpr = P09DR66_A158BarFecFpr[0] ;
         A155BarFecCli = P09DR66_A155BarFecCli[0] ;
         A159BarFecGen = P09DR66_A159BarFecGen[0] ;
         A213BarSit = P09DR66_A213BarSit[0] ;
         A1234BarNomCli = P09DR66_A1234BarNomCli[0] ;
         A136BarColNum = P09DR66_A136BarColNum[0] ;
         A135BarColNom = P09DR66_A135BarColNom[0] ;
         A13711BarTipArtD = P09DR66_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P09DR66_n13711BarTipArtD[0] ;
         A217BarTipArt = P09DR66_A217BarTipArt[0] ;
         n217BarTipArt = P09DR66_n217BarTipArt[0] ;
         A1652BarSerDsc = P09DR66_A1652BarSerDsc[0] ;
         A212BarSer = P09DR66_A212BarSer[0] ;
         A120BarAgrEst = P09DR66_A120BarAgrEst[0] ;
         A279CliNom = P09DR66_A279CliNom[0] ;
         A252CliCod = P09DR66_A252CliCod[0] ;
         n252CliCod = P09DR66_n252CliCod[0] ;
         A1955BarFasSig = P09DR66_A1955BarFasSig[0] ;
         n1955BarFasSig = P09DR66_n1955BarFasSig[0] ;
         A130BarCodPar = P09DR66_A130BarCodPar[0] ;
         A132BarCodReo = P09DR66_A132BarCodReo[0] ;
         A129BarCod = P09DR66_A129BarCod[0] ;
         A361DisCod = P09DR66_A361DisCod[0] ;
         A143BarDisNum = P09DR66_A143BarDisNum[0] ;
         A4812BarEncCli = P09DR66_A4812BarEncCli[0] ;
         A396EmprCod = P09DR66_A396EmprCod[0] ;
         A4348DisUsrCod = P09DR66_A4348DisUsrCod[0] ;
         A13711BarTipArtD = P09DR66_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P09DR66_n13711BarTipArtD[0] ;
         A279CliNom = P09DR66_A279CliNom[0] ;
         A1955BarFasSig = P09DR66_A1955BarFasSig[0] ;
         n1955BarFasSig = P09DR66_n1955BarFasSig[0] ;
         GXt_int2 = A13930BarAlbUlti ;
         GXv_int3[0] = GXt_int2 ;
         new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int3) ;
         consultadeproduccion_wcgetfilterdata.this.GXt_int2 = GXv_int3[0] ;
         A13930BarAlbUlti = GXt_int2 ;
         if ( (0==AV468TFBarAlbUltimo) || ( ( A13930BarAlbUlti >= AV468TFBarAlbUltimo ) ) )
         {
            if ( (0==AV469TFBarAlbUltimo_To) || ( ( A13930BarAlbUlti <= AV469TFBarAlbUltimo_To ) ) )
            {
               GXt_int4 = A13935BarAlbFact ;
               GXv_int5[0] = GXt_int4 ;
               new app.produccion.consultadeproduccion_factura(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int5) ;
               consultadeproduccion_wcgetfilterdata.this.GXt_int4 = GXv_int5[0] ;
               A13935BarAlbFact = GXt_int4 ;
               if ( (0==AV480TFBarAlbFact) || ( ( A13935BarAlbFact >= AV480TFBarAlbFact ) ) )
               {
                  if ( (0==AV481TFBarAlbFact_To) || ( ( A13935BarAlbFact <= AV481TFBarAlbFact_To ) ) )
                  {
                     GXt_char6 = A13934BarNormas ;
                     GXv_char10[0] = GXt_char6 ;
                     new app.produccion.consultadeproduccion_normasestandarstextiles(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char10) ;
                     consultadeproduccion_wcgetfilterdata.this.GXt_char6 = GXv_char10[0] ;
                     A13934BarNormas = GXt_char6 ;
                     if ( ! ( (GXutil.strcmp("", AV477TFBarNormas_Sel)==0) && ( ! (GXutil.strcmp("", AV476TFBarNormas)==0) ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV476TFBarNormas) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV477TFBarNormas_Sel)==0) || ( ( GXutil.strcmp(A13934BarNormas, AV477TFBarNormas_Sel) == 0 ) ) )
                        {
                           GXt_char6 = A13878PedidoClie ;
                           GXv_char10[0] = A396EmprCod ;
                           GXv_char9[0] = A4812BarEncCli ;
                           GXv_char8[0] = A143BarDisNum ;
                           GXv_char7[0] = GXt_char6 ;
                           new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char10, GXv_char9, GXv_char8, GXv_char7) ;
                           consultadeproduccion_wcgetfilterdata.this.A396EmprCod = GXv_char10[0] ;
                           consultadeproduccion_wcgetfilterdata.this.A4812BarEncCli = GXv_char9[0] ;
                           consultadeproduccion_wcgetfilterdata.this.A143BarDisNum = GXv_char8[0] ;
                           consultadeproduccion_wcgetfilterdata.this.GXt_char6 = GXv_char7[0] ;
                           A13878PedidoClie = GXt_char6 ;
                           if ( (GXutil.strcmp("", AV462bardisnumfrom)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV462bardisnumfrom) >= 0 ) ) )
                           {
                              if ( (GXutil.strcmp("", AV463bardisnumto)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV463bardisnumto) <= 0 ) ) )
                              {
                                 A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
                                 AV452count = 0 ;
                                 while ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(P09DR66_A4348DisUsrCod[0], A4348DisUsrCod) == 0 ) )
                                 {
                                    brk9DR23 = false ;
                                    A130BarCodPar = P09DR66_A130BarCodPar[0] ;
                                    A132BarCodReo = P09DR66_A132BarCodReo[0] ;
                                    A129BarCod = P09DR66_A129BarCod[0] ;
                                    A361DisCod = P09DR66_A361DisCod[0] ;
                                    A396EmprCod = P09DR66_A396EmprCod[0] ;
                                    AV452count = (long)(AV452count+1) ;
                                    brk9DR23 = true ;
                                    pr_default.readNext(12);
                                 }
                                 if ( ! (GXutil.strcmp("", A4348DisUsrCod)==0) )
                                 {
                                    AV444Option = A4348DisUsrCod ;
                                    AV445Options.add(AV444Option, 0);
                                    AV450OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV452count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                                 }
                                 if ( AV445Options.size() == 50 )
                                 {
                                    /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                    if (true) break;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk9DR23 )
         {
            brk9DR23 = true ;
            pr_default.readNext(12);
         }
      }
      pr_default.close(12);
   }

   protected void cleanup( )
   {
      this.aP3[0] = consultadeproduccion_wcgetfilterdata.this.AV446OptionsJson;
      this.aP4[0] = consultadeproduccion_wcgetfilterdata.this.AV449OptionsDescJson;
      this.aP5[0] = consultadeproduccion_wcgetfilterdata.this.AV451OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV446OptionsJson = "" ;
      AV449OptionsDescJson = "" ;
      AV451OptionIndexesJson = "" ;
      AV445Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV448OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV450OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV453Session = httpContext.getWebSession();
      AV455GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV456GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV26TFCliNom = "" ;
      AV27TFCliNom_Sel = "" ;
      AV16TFBarNHdr = "" ;
      AV17TFBarNHdr_Sel = "" ;
      AV156TFBarAgrEst = "" ;
      AV157TFBarAgrEst_Sel = "" ;
      AV28TFBarSer = "" ;
      AV29TFBarSer_Sel = "" ;
      AV30TFBarSerDsc = "" ;
      AV31TFBarSerDsc_Sel = "" ;
      AV34TFBarTipArtDsc = "" ;
      AV35TFBarTipArtDsc_Sel = "" ;
      AV36TFBarColNom = "" ;
      AV37TFBarColNom_Sel = "" ;
      AV200TFBarNomCli = "" ;
      AV201TFBarNomCli_Sel = "" ;
      AV40TFBarFecGen = GXutil.nullDate() ;
      AV42TFBarFecCli = GXutil.nullDate() ;
      AV144TFBarFecFpr = GXutil.nullDate() ;
      AV46TFBarFecSal = GXutil.nullDate() ;
      AV64TFBarFasSig = "" ;
      AV65TFBarFasSig_Sel = "" ;
      AV324TFBarGirar = "" ;
      AV325TFBarGirar_Sel = "" ;
      AV246TFBarProPer = "" ;
      AV247TFBarProPer_Sel = "" ;
      AV476TFBarNormas = "" ;
      AV477TFBarNormas_Sel = "" ;
      AV478TFDisUsrCod = "" ;
      AV479TFDisUsrCod_Sel = "" ;
      AV459Emprcod = "" ;
      AV462bardisnumfrom = "" ;
      AV463bardisnumto = "" ;
      AV464barfecgenfrom = GXutil.nullDate() ;
      AV465barfecgento = GXutil.nullDate() ;
      AV482barfecclifrom = GXutil.nullDate() ;
      AV483barfecclito = GXutil.nullDate() ;
      AV484BarFecFprfrom = GXutil.nullDate() ;
      AV485BarFecFprto = GXutil.nullDate() ;
      AV486barfecsalfrom = GXutil.nullDate() ;
      AV487barfecsalto = GXutil.nullDate() ;
      AV488barserfrom = "" ;
      AV489barserto = "" ;
      AV492BarColNomfrom = "" ;
      AV493BarColNomto = "" ;
      AV496BarNomClifrom = "" ;
      AV497BarNomClito = "" ;
      AV501muestras = "" ;
      AV506barcodparfrom = "" ;
      AV507barcodparto = "" ;
      AV510Cod_idtx = "" ;
      AV513BarGirar = "" ;
      lV64TFBarFasSig = "" ;
      scmdbuf = "" ;
      lV26TFCliNom = "" ;
      lV16TFBarNHdr = "" ;
      lV156TFBarAgrEst = "" ;
      lV28TFBarSer = "" ;
      lV30TFBarSerDsc = "" ;
      lV34TFBarTipArtDsc = "" ;
      lV36TFBarColNom = "" ;
      lV200TFBarNomCli = "" ;
      lV324TFBarGirar = "" ;
      lV246TFBarProPer = "" ;
      lV478TFDisUsrCod = "" ;
      A279CliNom = "" ;
      A130BarCodPar = "" ;
      A120BarAgrEst = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A13711BarTipArtD = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A155BarFecCli = GXutil.nullDate() ;
      A158BarFecFpr = GXutil.nullDate() ;
      A161BarFecSal = GXutil.nullDate() ;
      A2454BarGirar = "" ;
      A2829BarProPer = "" ;
      A4348DisUsrCod = "" ;
      A3030BarPlf = "" ;
      A1955BarFasSig = "" ;
      A13934BarNormas = "" ;
      A13878PedidoClie = "" ;
      A396EmprCod = "" ;
      P09DR6_A279CliNom = new String[] {""} ;
      P09DR6_A3030BarPlf = new String[] {""} ;
      P09DR6_A1235BarNumCli = new int[1] ;
      P09DR6_A4348DisUsrCod = new String[] {""} ;
      P09DR6_A2829BarProPer = new String[] {""} ;
      P09DR6_A4466BarAcaAnh = new short[1] ;
      P09DR6_A2454BarGirar = new String[] {""} ;
      P09DR6_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR6_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR6_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR6_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR6_A213BarSit = new byte[1] ;
      P09DR6_A1234BarNomCli = new String[] {""} ;
      P09DR6_A136BarColNum = new int[1] ;
      P09DR6_A135BarColNom = new String[] {""} ;
      P09DR6_A13711BarTipArtD = new String[] {""} ;
      P09DR6_n13711BarTipArtD = new boolean[] {false} ;
      P09DR6_A217BarTipArt = new short[1] ;
      P09DR6_n217BarTipArt = new boolean[] {false} ;
      P09DR6_A1652BarSerDsc = new String[] {""} ;
      P09DR6_A212BarSer = new String[] {""} ;
      P09DR6_A120BarAgrEst = new String[] {""} ;
      P09DR6_A252CliCod = new int[1] ;
      P09DR6_n252CliCod = new boolean[] {false} ;
      P09DR6_A1955BarFasSig = new String[] {""} ;
      P09DR6_n1955BarFasSig = new boolean[] {false} ;
      P09DR6_A130BarCodPar = new String[] {""} ;
      P09DR6_A132BarCodReo = new byte[1] ;
      P09DR6_A129BarCod = new int[1] ;
      P09DR6_A361DisCod = new int[1] ;
      P09DR6_A143BarDisNum = new String[] {""} ;
      P09DR6_A4812BarEncCli = new String[] {""} ;
      P09DR6_A396EmprCod = new String[] {""} ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      A13696BarNHdr = "" ;
      AV444Option = "" ;
      P09DR11_A3030BarPlf = new String[] {""} ;
      P09DR11_A1235BarNumCli = new int[1] ;
      P09DR11_A4348DisUsrCod = new String[] {""} ;
      P09DR11_A2829BarProPer = new String[] {""} ;
      P09DR11_A4466BarAcaAnh = new short[1] ;
      P09DR11_A2454BarGirar = new String[] {""} ;
      P09DR11_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR11_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR11_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR11_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR11_A213BarSit = new byte[1] ;
      P09DR11_A1234BarNomCli = new String[] {""} ;
      P09DR11_A136BarColNum = new int[1] ;
      P09DR11_A135BarColNom = new String[] {""} ;
      P09DR11_A13711BarTipArtD = new String[] {""} ;
      P09DR11_n13711BarTipArtD = new boolean[] {false} ;
      P09DR11_A217BarTipArt = new short[1] ;
      P09DR11_n217BarTipArt = new boolean[] {false} ;
      P09DR11_A1652BarSerDsc = new String[] {""} ;
      P09DR11_A212BarSer = new String[] {""} ;
      P09DR11_A120BarAgrEst = new String[] {""} ;
      P09DR11_A279CliNom = new String[] {""} ;
      P09DR11_A252CliCod = new int[1] ;
      P09DR11_n252CliCod = new boolean[] {false} ;
      P09DR11_A1955BarFasSig = new String[] {""} ;
      P09DR11_n1955BarFasSig = new boolean[] {false} ;
      P09DR11_A130BarCodPar = new String[] {""} ;
      P09DR11_A132BarCodReo = new byte[1] ;
      P09DR11_A129BarCod = new int[1] ;
      P09DR11_A361DisCod = new int[1] ;
      P09DR11_A143BarDisNum = new String[] {""} ;
      P09DR11_A4812BarEncCli = new String[] {""} ;
      P09DR11_A396EmprCod = new String[] {""} ;
      P09DR16_A120BarAgrEst = new String[] {""} ;
      P09DR16_A3030BarPlf = new String[] {""} ;
      P09DR16_A1235BarNumCli = new int[1] ;
      P09DR16_A4348DisUsrCod = new String[] {""} ;
      P09DR16_A2829BarProPer = new String[] {""} ;
      P09DR16_A4466BarAcaAnh = new short[1] ;
      P09DR16_A2454BarGirar = new String[] {""} ;
      P09DR16_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR16_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR16_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR16_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR16_A213BarSit = new byte[1] ;
      P09DR16_A1234BarNomCli = new String[] {""} ;
      P09DR16_A136BarColNum = new int[1] ;
      P09DR16_A135BarColNom = new String[] {""} ;
      P09DR16_A13711BarTipArtD = new String[] {""} ;
      P09DR16_n13711BarTipArtD = new boolean[] {false} ;
      P09DR16_A217BarTipArt = new short[1] ;
      P09DR16_n217BarTipArt = new boolean[] {false} ;
      P09DR16_A1652BarSerDsc = new String[] {""} ;
      P09DR16_A212BarSer = new String[] {""} ;
      P09DR16_A279CliNom = new String[] {""} ;
      P09DR16_A252CliCod = new int[1] ;
      P09DR16_n252CliCod = new boolean[] {false} ;
      P09DR16_A1955BarFasSig = new String[] {""} ;
      P09DR16_n1955BarFasSig = new boolean[] {false} ;
      P09DR16_A130BarCodPar = new String[] {""} ;
      P09DR16_A132BarCodReo = new byte[1] ;
      P09DR16_A129BarCod = new int[1] ;
      P09DR16_A361DisCod = new int[1] ;
      P09DR16_A143BarDisNum = new String[] {""} ;
      P09DR16_A4812BarEncCli = new String[] {""} ;
      P09DR16_A396EmprCod = new String[] {""} ;
      AV447OptionDesc = "" ;
      P09DR21_A212BarSer = new String[] {""} ;
      P09DR21_A3030BarPlf = new String[] {""} ;
      P09DR21_A1235BarNumCli = new int[1] ;
      P09DR21_A4348DisUsrCod = new String[] {""} ;
      P09DR21_A2829BarProPer = new String[] {""} ;
      P09DR21_A4466BarAcaAnh = new short[1] ;
      P09DR21_A2454BarGirar = new String[] {""} ;
      P09DR21_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR21_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR21_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR21_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR21_A213BarSit = new byte[1] ;
      P09DR21_A1234BarNomCli = new String[] {""} ;
      P09DR21_A136BarColNum = new int[1] ;
      P09DR21_A135BarColNom = new String[] {""} ;
      P09DR21_A13711BarTipArtD = new String[] {""} ;
      P09DR21_n13711BarTipArtD = new boolean[] {false} ;
      P09DR21_A217BarTipArt = new short[1] ;
      P09DR21_n217BarTipArt = new boolean[] {false} ;
      P09DR21_A1652BarSerDsc = new String[] {""} ;
      P09DR21_A120BarAgrEst = new String[] {""} ;
      P09DR21_A279CliNom = new String[] {""} ;
      P09DR21_A252CliCod = new int[1] ;
      P09DR21_n252CliCod = new boolean[] {false} ;
      P09DR21_A1955BarFasSig = new String[] {""} ;
      P09DR21_n1955BarFasSig = new boolean[] {false} ;
      P09DR21_A130BarCodPar = new String[] {""} ;
      P09DR21_A132BarCodReo = new byte[1] ;
      P09DR21_A129BarCod = new int[1] ;
      P09DR21_A361DisCod = new int[1] ;
      P09DR21_A143BarDisNum = new String[] {""} ;
      P09DR21_A4812BarEncCli = new String[] {""} ;
      P09DR21_A396EmprCod = new String[] {""} ;
      P09DR26_A1652BarSerDsc = new String[] {""} ;
      P09DR26_A3030BarPlf = new String[] {""} ;
      P09DR26_A1235BarNumCli = new int[1] ;
      P09DR26_A4348DisUsrCod = new String[] {""} ;
      P09DR26_A2829BarProPer = new String[] {""} ;
      P09DR26_A4466BarAcaAnh = new short[1] ;
      P09DR26_A2454BarGirar = new String[] {""} ;
      P09DR26_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR26_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR26_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR26_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR26_A213BarSit = new byte[1] ;
      P09DR26_A1234BarNomCli = new String[] {""} ;
      P09DR26_A136BarColNum = new int[1] ;
      P09DR26_A135BarColNom = new String[] {""} ;
      P09DR26_A13711BarTipArtD = new String[] {""} ;
      P09DR26_n13711BarTipArtD = new boolean[] {false} ;
      P09DR26_A217BarTipArt = new short[1] ;
      P09DR26_n217BarTipArt = new boolean[] {false} ;
      P09DR26_A212BarSer = new String[] {""} ;
      P09DR26_A120BarAgrEst = new String[] {""} ;
      P09DR26_A279CliNom = new String[] {""} ;
      P09DR26_A252CliCod = new int[1] ;
      P09DR26_n252CliCod = new boolean[] {false} ;
      P09DR26_A1955BarFasSig = new String[] {""} ;
      P09DR26_n1955BarFasSig = new boolean[] {false} ;
      P09DR26_A130BarCodPar = new String[] {""} ;
      P09DR26_A132BarCodReo = new byte[1] ;
      P09DR26_A129BarCod = new int[1] ;
      P09DR26_A361DisCod = new int[1] ;
      P09DR26_A143BarDisNum = new String[] {""} ;
      P09DR26_A4812BarEncCli = new String[] {""} ;
      P09DR26_A396EmprCod = new String[] {""} ;
      P09DR31_A217BarTipArt = new short[1] ;
      P09DR31_n217BarTipArt = new boolean[] {false} ;
      P09DR31_A3030BarPlf = new String[] {""} ;
      P09DR31_A1235BarNumCli = new int[1] ;
      P09DR31_A4348DisUsrCod = new String[] {""} ;
      P09DR31_A2829BarProPer = new String[] {""} ;
      P09DR31_A4466BarAcaAnh = new short[1] ;
      P09DR31_A2454BarGirar = new String[] {""} ;
      P09DR31_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR31_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR31_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR31_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR31_A213BarSit = new byte[1] ;
      P09DR31_A1234BarNomCli = new String[] {""} ;
      P09DR31_A136BarColNum = new int[1] ;
      P09DR31_A135BarColNom = new String[] {""} ;
      P09DR31_A13711BarTipArtD = new String[] {""} ;
      P09DR31_n13711BarTipArtD = new boolean[] {false} ;
      P09DR31_A1652BarSerDsc = new String[] {""} ;
      P09DR31_A212BarSer = new String[] {""} ;
      P09DR31_A120BarAgrEst = new String[] {""} ;
      P09DR31_A279CliNom = new String[] {""} ;
      P09DR31_A252CliCod = new int[1] ;
      P09DR31_n252CliCod = new boolean[] {false} ;
      P09DR31_A1955BarFasSig = new String[] {""} ;
      P09DR31_n1955BarFasSig = new boolean[] {false} ;
      P09DR31_A130BarCodPar = new String[] {""} ;
      P09DR31_A132BarCodReo = new byte[1] ;
      P09DR31_A129BarCod = new int[1] ;
      P09DR31_A361DisCod = new int[1] ;
      P09DR31_A143BarDisNum = new String[] {""} ;
      P09DR31_A4812BarEncCli = new String[] {""} ;
      P09DR31_A396EmprCod = new String[] {""} ;
      P09DR36_A135BarColNom = new String[] {""} ;
      P09DR36_A3030BarPlf = new String[] {""} ;
      P09DR36_A1235BarNumCli = new int[1] ;
      P09DR36_A4348DisUsrCod = new String[] {""} ;
      P09DR36_A2829BarProPer = new String[] {""} ;
      P09DR36_A4466BarAcaAnh = new short[1] ;
      P09DR36_A2454BarGirar = new String[] {""} ;
      P09DR36_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR36_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR36_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR36_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR36_A213BarSit = new byte[1] ;
      P09DR36_A1234BarNomCli = new String[] {""} ;
      P09DR36_A136BarColNum = new int[1] ;
      P09DR36_A13711BarTipArtD = new String[] {""} ;
      P09DR36_n13711BarTipArtD = new boolean[] {false} ;
      P09DR36_A217BarTipArt = new short[1] ;
      P09DR36_n217BarTipArt = new boolean[] {false} ;
      P09DR36_A1652BarSerDsc = new String[] {""} ;
      P09DR36_A212BarSer = new String[] {""} ;
      P09DR36_A120BarAgrEst = new String[] {""} ;
      P09DR36_A279CliNom = new String[] {""} ;
      P09DR36_A252CliCod = new int[1] ;
      P09DR36_n252CliCod = new boolean[] {false} ;
      P09DR36_A1955BarFasSig = new String[] {""} ;
      P09DR36_n1955BarFasSig = new boolean[] {false} ;
      P09DR36_A130BarCodPar = new String[] {""} ;
      P09DR36_A132BarCodReo = new byte[1] ;
      P09DR36_A129BarCod = new int[1] ;
      P09DR36_A361DisCod = new int[1] ;
      P09DR36_A143BarDisNum = new String[] {""} ;
      P09DR36_A4812BarEncCli = new String[] {""} ;
      P09DR36_A396EmprCod = new String[] {""} ;
      P09DR41_A1234BarNomCli = new String[] {""} ;
      P09DR41_A3030BarPlf = new String[] {""} ;
      P09DR41_A1235BarNumCli = new int[1] ;
      P09DR41_A4348DisUsrCod = new String[] {""} ;
      P09DR41_A2829BarProPer = new String[] {""} ;
      P09DR41_A4466BarAcaAnh = new short[1] ;
      P09DR41_A2454BarGirar = new String[] {""} ;
      P09DR41_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR41_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR41_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR41_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR41_A213BarSit = new byte[1] ;
      P09DR41_A136BarColNum = new int[1] ;
      P09DR41_A135BarColNom = new String[] {""} ;
      P09DR41_A13711BarTipArtD = new String[] {""} ;
      P09DR41_n13711BarTipArtD = new boolean[] {false} ;
      P09DR41_A217BarTipArt = new short[1] ;
      P09DR41_n217BarTipArt = new boolean[] {false} ;
      P09DR41_A1652BarSerDsc = new String[] {""} ;
      P09DR41_A212BarSer = new String[] {""} ;
      P09DR41_A120BarAgrEst = new String[] {""} ;
      P09DR41_A279CliNom = new String[] {""} ;
      P09DR41_A252CliCod = new int[1] ;
      P09DR41_n252CliCod = new boolean[] {false} ;
      P09DR41_A1955BarFasSig = new String[] {""} ;
      P09DR41_n1955BarFasSig = new boolean[] {false} ;
      P09DR41_A130BarCodPar = new String[] {""} ;
      P09DR41_A132BarCodReo = new byte[1] ;
      P09DR41_A129BarCod = new int[1] ;
      P09DR41_A361DisCod = new int[1] ;
      P09DR41_A143BarDisNum = new String[] {""} ;
      P09DR41_A4812BarEncCli = new String[] {""} ;
      P09DR41_A396EmprCod = new String[] {""} ;
      P09DR46_A3030BarPlf = new String[] {""} ;
      P09DR46_A1235BarNumCli = new int[1] ;
      P09DR46_A4348DisUsrCod = new String[] {""} ;
      P09DR46_A2829BarProPer = new String[] {""} ;
      P09DR46_A4466BarAcaAnh = new short[1] ;
      P09DR46_A2454BarGirar = new String[] {""} ;
      P09DR46_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR46_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR46_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR46_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR46_A213BarSit = new byte[1] ;
      P09DR46_A1234BarNomCli = new String[] {""} ;
      P09DR46_A136BarColNum = new int[1] ;
      P09DR46_A135BarColNom = new String[] {""} ;
      P09DR46_A13711BarTipArtD = new String[] {""} ;
      P09DR46_n13711BarTipArtD = new boolean[] {false} ;
      P09DR46_A217BarTipArt = new short[1] ;
      P09DR46_n217BarTipArt = new boolean[] {false} ;
      P09DR46_A1652BarSerDsc = new String[] {""} ;
      P09DR46_A212BarSer = new String[] {""} ;
      P09DR46_A120BarAgrEst = new String[] {""} ;
      P09DR46_A279CliNom = new String[] {""} ;
      P09DR46_A252CliCod = new int[1] ;
      P09DR46_n252CliCod = new boolean[] {false} ;
      P09DR46_A1955BarFasSig = new String[] {""} ;
      P09DR46_n1955BarFasSig = new boolean[] {false} ;
      P09DR46_A130BarCodPar = new String[] {""} ;
      P09DR46_A132BarCodReo = new byte[1] ;
      P09DR46_A129BarCod = new int[1] ;
      P09DR46_A361DisCod = new int[1] ;
      P09DR46_A143BarDisNum = new String[] {""} ;
      P09DR46_A4812BarEncCli = new String[] {""} ;
      P09DR46_A396EmprCod = new String[] {""} ;
      P09DR51_A2454BarGirar = new String[] {""} ;
      P09DR51_A3030BarPlf = new String[] {""} ;
      P09DR51_A1235BarNumCli = new int[1] ;
      P09DR51_A4348DisUsrCod = new String[] {""} ;
      P09DR51_A2829BarProPer = new String[] {""} ;
      P09DR51_A4466BarAcaAnh = new short[1] ;
      P09DR51_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR51_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR51_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR51_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR51_A213BarSit = new byte[1] ;
      P09DR51_A1234BarNomCli = new String[] {""} ;
      P09DR51_A136BarColNum = new int[1] ;
      P09DR51_A135BarColNom = new String[] {""} ;
      P09DR51_A13711BarTipArtD = new String[] {""} ;
      P09DR51_n13711BarTipArtD = new boolean[] {false} ;
      P09DR51_A217BarTipArt = new short[1] ;
      P09DR51_n217BarTipArt = new boolean[] {false} ;
      P09DR51_A1652BarSerDsc = new String[] {""} ;
      P09DR51_A212BarSer = new String[] {""} ;
      P09DR51_A120BarAgrEst = new String[] {""} ;
      P09DR51_A279CliNom = new String[] {""} ;
      P09DR51_A252CliCod = new int[1] ;
      P09DR51_n252CliCod = new boolean[] {false} ;
      P09DR51_A1955BarFasSig = new String[] {""} ;
      P09DR51_n1955BarFasSig = new boolean[] {false} ;
      P09DR51_A130BarCodPar = new String[] {""} ;
      P09DR51_A132BarCodReo = new byte[1] ;
      P09DR51_A129BarCod = new int[1] ;
      P09DR51_A361DisCod = new int[1] ;
      P09DR51_A143BarDisNum = new String[] {""} ;
      P09DR51_A4812BarEncCli = new String[] {""} ;
      P09DR51_A396EmprCod = new String[] {""} ;
      P09DR56_A2829BarProPer = new String[] {""} ;
      P09DR56_A3030BarPlf = new String[] {""} ;
      P09DR56_A1235BarNumCli = new int[1] ;
      P09DR56_A4348DisUsrCod = new String[] {""} ;
      P09DR56_A4466BarAcaAnh = new short[1] ;
      P09DR56_A2454BarGirar = new String[] {""} ;
      P09DR56_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR56_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR56_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR56_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR56_A213BarSit = new byte[1] ;
      P09DR56_A1234BarNomCli = new String[] {""} ;
      P09DR56_A136BarColNum = new int[1] ;
      P09DR56_A135BarColNom = new String[] {""} ;
      P09DR56_A13711BarTipArtD = new String[] {""} ;
      P09DR56_n13711BarTipArtD = new boolean[] {false} ;
      P09DR56_A217BarTipArt = new short[1] ;
      P09DR56_n217BarTipArt = new boolean[] {false} ;
      P09DR56_A1652BarSerDsc = new String[] {""} ;
      P09DR56_A212BarSer = new String[] {""} ;
      P09DR56_A120BarAgrEst = new String[] {""} ;
      P09DR56_A279CliNom = new String[] {""} ;
      P09DR56_A252CliCod = new int[1] ;
      P09DR56_n252CliCod = new boolean[] {false} ;
      P09DR56_A1955BarFasSig = new String[] {""} ;
      P09DR56_n1955BarFasSig = new boolean[] {false} ;
      P09DR56_A130BarCodPar = new String[] {""} ;
      P09DR56_A132BarCodReo = new byte[1] ;
      P09DR56_A129BarCod = new int[1] ;
      P09DR56_A361DisCod = new int[1] ;
      P09DR56_A143BarDisNum = new String[] {""} ;
      P09DR56_A4812BarEncCli = new String[] {""} ;
      P09DR56_A396EmprCod = new String[] {""} ;
      P09DR61_A3030BarPlf = new String[] {""} ;
      P09DR61_A1235BarNumCli = new int[1] ;
      P09DR61_A4348DisUsrCod = new String[] {""} ;
      P09DR61_A2829BarProPer = new String[] {""} ;
      P09DR61_A4466BarAcaAnh = new short[1] ;
      P09DR61_A2454BarGirar = new String[] {""} ;
      P09DR61_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR61_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR61_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR61_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR61_A213BarSit = new byte[1] ;
      P09DR61_A1234BarNomCli = new String[] {""} ;
      P09DR61_A136BarColNum = new int[1] ;
      P09DR61_A135BarColNom = new String[] {""} ;
      P09DR61_A13711BarTipArtD = new String[] {""} ;
      P09DR61_n13711BarTipArtD = new boolean[] {false} ;
      P09DR61_A217BarTipArt = new short[1] ;
      P09DR61_n217BarTipArt = new boolean[] {false} ;
      P09DR61_A1652BarSerDsc = new String[] {""} ;
      P09DR61_A212BarSer = new String[] {""} ;
      P09DR61_A120BarAgrEst = new String[] {""} ;
      P09DR61_A279CliNom = new String[] {""} ;
      P09DR61_A252CliCod = new int[1] ;
      P09DR61_n252CliCod = new boolean[] {false} ;
      P09DR61_A1955BarFasSig = new String[] {""} ;
      P09DR61_n1955BarFasSig = new boolean[] {false} ;
      P09DR61_A130BarCodPar = new String[] {""} ;
      P09DR61_A132BarCodReo = new byte[1] ;
      P09DR61_A129BarCod = new int[1] ;
      P09DR61_A361DisCod = new int[1] ;
      P09DR61_A143BarDisNum = new String[] {""} ;
      P09DR61_A4812BarEncCli = new String[] {""} ;
      P09DR61_A396EmprCod = new String[] {""} ;
      P09DR66_A4348DisUsrCod = new String[] {""} ;
      P09DR66_A3030BarPlf = new String[] {""} ;
      P09DR66_A1235BarNumCli = new int[1] ;
      P09DR66_A2829BarProPer = new String[] {""} ;
      P09DR66_A4466BarAcaAnh = new short[1] ;
      P09DR66_A2454BarGirar = new String[] {""} ;
      P09DR66_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR66_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR66_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR66_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P09DR66_A213BarSit = new byte[1] ;
      P09DR66_A1234BarNomCli = new String[] {""} ;
      P09DR66_A136BarColNum = new int[1] ;
      P09DR66_A135BarColNom = new String[] {""} ;
      P09DR66_A13711BarTipArtD = new String[] {""} ;
      P09DR66_n13711BarTipArtD = new boolean[] {false} ;
      P09DR66_A217BarTipArt = new short[1] ;
      P09DR66_n217BarTipArt = new boolean[] {false} ;
      P09DR66_A1652BarSerDsc = new String[] {""} ;
      P09DR66_A212BarSer = new String[] {""} ;
      P09DR66_A120BarAgrEst = new String[] {""} ;
      P09DR66_A279CliNom = new String[] {""} ;
      P09DR66_A252CliCod = new int[1] ;
      P09DR66_n252CliCod = new boolean[] {false} ;
      P09DR66_A1955BarFasSig = new String[] {""} ;
      P09DR66_n1955BarFasSig = new boolean[] {false} ;
      P09DR66_A130BarCodPar = new String[] {""} ;
      P09DR66_A132BarCodReo = new byte[1] ;
      P09DR66_A129BarCod = new int[1] ;
      P09DR66_A361DisCod = new int[1] ;
      P09DR66_A143BarDisNum = new String[] {""} ;
      P09DR66_A4812BarEncCli = new String[] {""} ;
      P09DR66_A396EmprCod = new String[] {""} ;
      GXv_int3 = new long[1] ;
      GXv_int5 = new int[1] ;
      GXt_char6 = "" ;
      GXv_char10 = new String[1] ;
      GXv_char9 = new String[1] ;
      GXv_char8 = new String[1] ;
      GXv_char7 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.consultadeproduccion_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09DR6_A279CliNom, P09DR6_A3030BarPlf, P09DR6_A1235BarNumCli, P09DR6_A4348DisUsrCod, P09DR6_A2829BarProPer, P09DR6_A4466BarAcaAnh, P09DR6_A2454BarGirar, P09DR6_A161BarFecSal, P09DR6_A158BarFecFpr, P09DR6_A155BarFecCli,
            P09DR6_A159BarFecGen, P09DR6_A213BarSit, P09DR6_A1234BarNomCli, P09DR6_A136BarColNum, P09DR6_A135BarColNom, P09DR6_A13711BarTipArtD, P09DR6_n13711BarTipArtD, P09DR6_A217BarTipArt, P09DR6_n217BarTipArt, P09DR6_A1652BarSerDsc,
            P09DR6_A212BarSer, P09DR6_A120BarAgrEst, P09DR6_A252CliCod, P09DR6_n252CliCod, P09DR6_A1955BarFasSig, P09DR6_n1955BarFasSig, P09DR6_A130BarCodPar, P09DR6_A132BarCodReo, P09DR6_A129BarCod, P09DR6_A361DisCod,
            P09DR6_A143BarDisNum, P09DR6_A4812BarEncCli, P09DR6_A396EmprCod
            }
            , new Object[] {
            P09DR11_A3030BarPlf, P09DR11_A1235BarNumCli, P09DR11_A4348DisUsrCod, P09DR11_A2829BarProPer, P09DR11_A4466BarAcaAnh, P09DR11_A2454BarGirar, P09DR11_A161BarFecSal, P09DR11_A158BarFecFpr, P09DR11_A155BarFecCli, P09DR11_A159BarFecGen,
            P09DR11_A213BarSit, P09DR11_A1234BarNomCli, P09DR11_A136BarColNum, P09DR11_A135BarColNom, P09DR11_A13711BarTipArtD, P09DR11_n13711BarTipArtD, P09DR11_A217BarTipArt, P09DR11_n217BarTipArt, P09DR11_A1652BarSerDsc, P09DR11_A212BarSer,
            P09DR11_A120BarAgrEst, P09DR11_A279CliNom, P09DR11_A252CliCod, P09DR11_n252CliCod, P09DR11_A1955BarFasSig, P09DR11_n1955BarFasSig, P09DR11_A130BarCodPar, P09DR11_A132BarCodReo, P09DR11_A129BarCod, P09DR11_A361DisCod,
            P09DR11_A143BarDisNum, P09DR11_A4812BarEncCli, P09DR11_A396EmprCod
            }
            , new Object[] {
            P09DR16_A120BarAgrEst, P09DR16_A3030BarPlf, P09DR16_A1235BarNumCli, P09DR16_A4348DisUsrCod, P09DR16_A2829BarProPer, P09DR16_A4466BarAcaAnh, P09DR16_A2454BarGirar, P09DR16_A161BarFecSal, P09DR16_A158BarFecFpr, P09DR16_A155BarFecCli,
            P09DR16_A159BarFecGen, P09DR16_A213BarSit, P09DR16_A1234BarNomCli, P09DR16_A136BarColNum, P09DR16_A135BarColNom, P09DR16_A13711BarTipArtD, P09DR16_n13711BarTipArtD, P09DR16_A217BarTipArt, P09DR16_n217BarTipArt, P09DR16_A1652BarSerDsc,
            P09DR16_A212BarSer, P09DR16_A279CliNom, P09DR16_A252CliCod, P09DR16_n252CliCod, P09DR16_A1955BarFasSig, P09DR16_n1955BarFasSig, P09DR16_A130BarCodPar, P09DR16_A132BarCodReo, P09DR16_A129BarCod, P09DR16_A361DisCod,
            P09DR16_A143BarDisNum, P09DR16_A4812BarEncCli, P09DR16_A396EmprCod
            }
            , new Object[] {
            P09DR21_A212BarSer, P09DR21_A3030BarPlf, P09DR21_A1235BarNumCli, P09DR21_A4348DisUsrCod, P09DR21_A2829BarProPer, P09DR21_A4466BarAcaAnh, P09DR21_A2454BarGirar, P09DR21_A161BarFecSal, P09DR21_A158BarFecFpr, P09DR21_A155BarFecCli,
            P09DR21_A159BarFecGen, P09DR21_A213BarSit, P09DR21_A1234BarNomCli, P09DR21_A136BarColNum, P09DR21_A135BarColNom, P09DR21_A13711BarTipArtD, P09DR21_n13711BarTipArtD, P09DR21_A217BarTipArt, P09DR21_n217BarTipArt, P09DR21_A1652BarSerDsc,
            P09DR21_A120BarAgrEst, P09DR21_A279CliNom, P09DR21_A252CliCod, P09DR21_n252CliCod, P09DR21_A1955BarFasSig, P09DR21_n1955BarFasSig, P09DR21_A130BarCodPar, P09DR21_A132BarCodReo, P09DR21_A129BarCod, P09DR21_A361DisCod,
            P09DR21_A143BarDisNum, P09DR21_A4812BarEncCli, P09DR21_A396EmprCod
            }
            , new Object[] {
            P09DR26_A1652BarSerDsc, P09DR26_A3030BarPlf, P09DR26_A1235BarNumCli, P09DR26_A4348DisUsrCod, P09DR26_A2829BarProPer, P09DR26_A4466BarAcaAnh, P09DR26_A2454BarGirar, P09DR26_A161BarFecSal, P09DR26_A158BarFecFpr, P09DR26_A155BarFecCli,
            P09DR26_A159BarFecGen, P09DR26_A213BarSit, P09DR26_A1234BarNomCli, P09DR26_A136BarColNum, P09DR26_A135BarColNom, P09DR26_A13711BarTipArtD, P09DR26_n13711BarTipArtD, P09DR26_A217BarTipArt, P09DR26_n217BarTipArt, P09DR26_A212BarSer,
            P09DR26_A120BarAgrEst, P09DR26_A279CliNom, P09DR26_A252CliCod, P09DR26_n252CliCod, P09DR26_A1955BarFasSig, P09DR26_n1955BarFasSig, P09DR26_A130BarCodPar, P09DR26_A132BarCodReo, P09DR26_A129BarCod, P09DR26_A361DisCod,
            P09DR26_A143BarDisNum, P09DR26_A4812BarEncCli, P09DR26_A396EmprCod
            }
            , new Object[] {
            P09DR31_A217BarTipArt, P09DR31_n217BarTipArt, P09DR31_A3030BarPlf, P09DR31_A1235BarNumCli, P09DR31_A4348DisUsrCod, P09DR31_A2829BarProPer, P09DR31_A4466BarAcaAnh, P09DR31_A2454BarGirar, P09DR31_A161BarFecSal, P09DR31_A158BarFecFpr,
            P09DR31_A155BarFecCli, P09DR31_A159BarFecGen, P09DR31_A213BarSit, P09DR31_A1234BarNomCli, P09DR31_A136BarColNum, P09DR31_A135BarColNom, P09DR31_A13711BarTipArtD, P09DR31_n13711BarTipArtD, P09DR31_A1652BarSerDsc, P09DR31_A212BarSer,
            P09DR31_A120BarAgrEst, P09DR31_A279CliNom, P09DR31_A252CliCod, P09DR31_n252CliCod, P09DR31_A1955BarFasSig, P09DR31_n1955BarFasSig, P09DR31_A130BarCodPar, P09DR31_A132BarCodReo, P09DR31_A129BarCod, P09DR31_A361DisCod,
            P09DR31_A143BarDisNum, P09DR31_A4812BarEncCli, P09DR31_A396EmprCod
            }
            , new Object[] {
            P09DR36_A135BarColNom, P09DR36_A3030BarPlf, P09DR36_A1235BarNumCli, P09DR36_A4348DisUsrCod, P09DR36_A2829BarProPer, P09DR36_A4466BarAcaAnh, P09DR36_A2454BarGirar, P09DR36_A161BarFecSal, P09DR36_A158BarFecFpr, P09DR36_A155BarFecCli,
            P09DR36_A159BarFecGen, P09DR36_A213BarSit, P09DR36_A1234BarNomCli, P09DR36_A136BarColNum, P09DR36_A13711BarTipArtD, P09DR36_n13711BarTipArtD, P09DR36_A217BarTipArt, P09DR36_n217BarTipArt, P09DR36_A1652BarSerDsc, P09DR36_A212BarSer,
            P09DR36_A120BarAgrEst, P09DR36_A279CliNom, P09DR36_A252CliCod, P09DR36_n252CliCod, P09DR36_A1955BarFasSig, P09DR36_n1955BarFasSig, P09DR36_A130BarCodPar, P09DR36_A132BarCodReo, P09DR36_A129BarCod, P09DR36_A361DisCod,
            P09DR36_A143BarDisNum, P09DR36_A4812BarEncCli, P09DR36_A396EmprCod
            }
            , new Object[] {
            P09DR41_A1234BarNomCli, P09DR41_A3030BarPlf, P09DR41_A1235BarNumCli, P09DR41_A4348DisUsrCod, P09DR41_A2829BarProPer, P09DR41_A4466BarAcaAnh, P09DR41_A2454BarGirar, P09DR41_A161BarFecSal, P09DR41_A158BarFecFpr, P09DR41_A155BarFecCli,
            P09DR41_A159BarFecGen, P09DR41_A213BarSit, P09DR41_A136BarColNum, P09DR41_A135BarColNom, P09DR41_A13711BarTipArtD, P09DR41_n13711BarTipArtD, P09DR41_A217BarTipArt, P09DR41_n217BarTipArt, P09DR41_A1652BarSerDsc, P09DR41_A212BarSer,
            P09DR41_A120BarAgrEst, P09DR41_A279CliNom, P09DR41_A252CliCod, P09DR41_n252CliCod, P09DR41_A1955BarFasSig, P09DR41_n1955BarFasSig, P09DR41_A130BarCodPar, P09DR41_A132BarCodReo, P09DR41_A129BarCod, P09DR41_A361DisCod,
            P09DR41_A143BarDisNum, P09DR41_A4812BarEncCli, P09DR41_A396EmprCod
            }
            , new Object[] {
            P09DR46_A3030BarPlf, P09DR46_A1235BarNumCli, P09DR46_A4348DisUsrCod, P09DR46_A2829BarProPer, P09DR46_A4466BarAcaAnh, P09DR46_A2454BarGirar, P09DR46_A161BarFecSal, P09DR46_A158BarFecFpr, P09DR46_A155BarFecCli, P09DR46_A159BarFecGen,
            P09DR46_A213BarSit, P09DR46_A1234BarNomCli, P09DR46_A136BarColNum, P09DR46_A135BarColNom, P09DR46_A13711BarTipArtD, P09DR46_n13711BarTipArtD, P09DR46_A217BarTipArt, P09DR46_n217BarTipArt, P09DR46_A1652BarSerDsc, P09DR46_A212BarSer,
            P09DR46_A120BarAgrEst, P09DR46_A279CliNom, P09DR46_A252CliCod, P09DR46_n252CliCod, P09DR46_A1955BarFasSig, P09DR46_n1955BarFasSig, P09DR46_A130BarCodPar, P09DR46_A132BarCodReo, P09DR46_A129BarCod, P09DR46_A361DisCod,
            P09DR46_A143BarDisNum, P09DR46_A4812BarEncCli, P09DR46_A396EmprCod
            }
            , new Object[] {
            P09DR51_A2454BarGirar, P09DR51_A3030BarPlf, P09DR51_A1235BarNumCli, P09DR51_A4348DisUsrCod, P09DR51_A2829BarProPer, P09DR51_A4466BarAcaAnh, P09DR51_A161BarFecSal, P09DR51_A158BarFecFpr, P09DR51_A155BarFecCli, P09DR51_A159BarFecGen,
            P09DR51_A213BarSit, P09DR51_A1234BarNomCli, P09DR51_A136BarColNum, P09DR51_A135BarColNom, P09DR51_A13711BarTipArtD, P09DR51_n13711BarTipArtD, P09DR51_A217BarTipArt, P09DR51_n217BarTipArt, P09DR51_A1652BarSerDsc, P09DR51_A212BarSer,
            P09DR51_A120BarAgrEst, P09DR51_A279CliNom, P09DR51_A252CliCod, P09DR51_n252CliCod, P09DR51_A1955BarFasSig, P09DR51_n1955BarFasSig, P09DR51_A130BarCodPar, P09DR51_A132BarCodReo, P09DR51_A129BarCod, P09DR51_A361DisCod,
            P09DR51_A143BarDisNum, P09DR51_A4812BarEncCli, P09DR51_A396EmprCod
            }
            , new Object[] {
            P09DR56_A2829BarProPer, P09DR56_A3030BarPlf, P09DR56_A1235BarNumCli, P09DR56_A4348DisUsrCod, P09DR56_A4466BarAcaAnh, P09DR56_A2454BarGirar, P09DR56_A161BarFecSal, P09DR56_A158BarFecFpr, P09DR56_A155BarFecCli, P09DR56_A159BarFecGen,
            P09DR56_A213BarSit, P09DR56_A1234BarNomCli, P09DR56_A136BarColNum, P09DR56_A135BarColNom, P09DR56_A13711BarTipArtD, P09DR56_n13711BarTipArtD, P09DR56_A217BarTipArt, P09DR56_n217BarTipArt, P09DR56_A1652BarSerDsc, P09DR56_A212BarSer,
            P09DR56_A120BarAgrEst, P09DR56_A279CliNom, P09DR56_A252CliCod, P09DR56_n252CliCod, P09DR56_A1955BarFasSig, P09DR56_n1955BarFasSig, P09DR56_A130BarCodPar, P09DR56_A132BarCodReo, P09DR56_A129BarCod, P09DR56_A361DisCod,
            P09DR56_A143BarDisNum, P09DR56_A4812BarEncCli, P09DR56_A396EmprCod
            }
            , new Object[] {
            P09DR61_A3030BarPlf, P09DR61_A1235BarNumCli, P09DR61_A4348DisUsrCod, P09DR61_A2829BarProPer, P09DR61_A4466BarAcaAnh, P09DR61_A2454BarGirar, P09DR61_A161BarFecSal, P09DR61_A158BarFecFpr, P09DR61_A155BarFecCli, P09DR61_A159BarFecGen,
            P09DR61_A213BarSit, P09DR61_A1234BarNomCli, P09DR61_A136BarColNum, P09DR61_A135BarColNom, P09DR61_A13711BarTipArtD, P09DR61_n13711BarTipArtD, P09DR61_A217BarTipArt, P09DR61_n217BarTipArt, P09DR61_A1652BarSerDsc, P09DR61_A212BarSer,
            P09DR61_A120BarAgrEst, P09DR61_A279CliNom, P09DR61_A252CliCod, P09DR61_n252CliCod, P09DR61_A1955BarFasSig, P09DR61_n1955BarFasSig, P09DR61_A130BarCodPar, P09DR61_A132BarCodReo, P09DR61_A129BarCod, P09DR61_A361DisCod,
            P09DR61_A143BarDisNum, P09DR61_A4812BarEncCli, P09DR61_A396EmprCod
            }
            , new Object[] {
            P09DR66_A4348DisUsrCod, P09DR66_A3030BarPlf, P09DR66_A1235BarNumCli, P09DR66_A2829BarProPer, P09DR66_A4466BarAcaAnh, P09DR66_A2454BarGirar, P09DR66_A161BarFecSal, P09DR66_A158BarFecFpr, P09DR66_A155BarFecCli, P09DR66_A159BarFecGen,
            P09DR66_A213BarSit, P09DR66_A1234BarNomCli, P09DR66_A136BarColNum, P09DR66_A135BarColNom, P09DR66_A13711BarTipArtD, P09DR66_n13711BarTipArtD, P09DR66_A217BarTipArt, P09DR66_n217BarTipArt, P09DR66_A1652BarSerDsc, P09DR66_A212BarSer,
            P09DR66_A120BarAgrEst, P09DR66_A279CliNom, P09DR66_A252CliCod, P09DR66_n252CliCod, P09DR66_A1955BarFasSig, P09DR66_n1955BarFasSig, P09DR66_A130BarCodPar, P09DR66_A132BarCodReo, P09DR66_A129BarCod, P09DR66_A361DisCod,
            P09DR66_A143BarDisNum, P09DR66_A4812BarEncCli, P09DR66_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV124TFBarSit ;
   private byte AV125TFBarSit_To ;
   private byte AV466barsitfrom ;
   private byte AV467barsitto ;
   private byte AV504barcodreofrom ;
   private byte AV505barcodreoto ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private short AV32TFBarTipArt ;
   private short AV33TFBarTipArt_To ;
   private short AV372TFBarAcaAnh ;
   private short AV373TFBarAcaAnh_To ;
   private short AV490bartipartfrom ;
   private short AV491bartipartto ;
   private short A217BarTipArt ;
   private short A4466BarAcaAnh ;
   private short Gx_err ;
   private int AV516GXV1 ;
   private int AV24TFCliCod ;
   private int AV25TFCliCod_To ;
   private int AV38TFBarColNum ;
   private int AV39TFBarColNum_To ;
   private int AV480TFBarAlbFact ;
   private int AV481TFBarAlbFact_To ;
   private int AV460clicodfrom ;
   private int AV461clicodto ;
   private int AV494BarColNumfrom ;
   private int AV495BarColNumto ;
   private int AV498BarNumclifrom ;
   private int AV499barnumclito ;
   private int AV502barcodfrom ;
   private int AV503barcodto ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A13935BarAlbFact ;
   private int A361DisCod ;
   private int AV443InsertIndex ;
   private int GXt_int4 ;
   private int GXv_int5[] ;
   private long AV468TFBarAlbUltimo ;
   private long AV469TFBarAlbUltimo_To ;
   private long A13930BarAlbUlti ;
   private long AV452count ;
   private long GXt_int2 ;
   private long GXv_int3[] ;
   private String AV26TFCliNom ;
   private String AV27TFCliNom_Sel ;
   private String AV16TFBarNHdr ;
   private String AV17TFBarNHdr_Sel ;
   private String AV156TFBarAgrEst ;
   private String AV157TFBarAgrEst_Sel ;
   private String AV28TFBarSer ;
   private String AV29TFBarSer_Sel ;
   private String AV30TFBarSerDsc ;
   private String AV31TFBarSerDsc_Sel ;
   private String AV34TFBarTipArtDsc ;
   private String AV35TFBarTipArtDsc_Sel ;
   private String AV36TFBarColNom ;
   private String AV37TFBarColNom_Sel ;
   private String AV200TFBarNomCli ;
   private String AV201TFBarNomCli_Sel ;
   private String AV64TFBarFasSig ;
   private String AV65TFBarFasSig_Sel ;
   private String AV324TFBarGirar ;
   private String AV325TFBarGirar_Sel ;
   private String AV246TFBarProPer ;
   private String AV247TFBarProPer_Sel ;
   private String AV478TFDisUsrCod ;
   private String AV479TFDisUsrCod_Sel ;
   private String AV459Emprcod ;
   private String AV462bardisnumfrom ;
   private String AV463bardisnumto ;
   private String AV488barserfrom ;
   private String AV489barserto ;
   private String AV492BarColNomfrom ;
   private String AV493BarColNomto ;
   private String AV496BarNomClifrom ;
   private String AV497BarNomClito ;
   private String AV501muestras ;
   private String AV506barcodparfrom ;
   private String AV507barcodparto ;
   private String AV510Cod_idtx ;
   private String AV513BarGirar ;
   private String lV64TFBarFasSig ;
   private String scmdbuf ;
   private String lV26TFCliNom ;
   private String lV16TFBarNHdr ;
   private String lV156TFBarAgrEst ;
   private String lV28TFBarSer ;
   private String lV30TFBarSerDsc ;
   private String lV34TFBarTipArtDsc ;
   private String lV36TFBarColNom ;
   private String lV200TFBarNomCli ;
   private String lV324TFBarGirar ;
   private String lV246TFBarProPer ;
   private String lV478TFDisUsrCod ;
   private String A279CliNom ;
   private String A130BarCodPar ;
   private String A120BarAgrEst ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A13711BarTipArtD ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A2454BarGirar ;
   private String A2829BarProPer ;
   private String A4348DisUsrCod ;
   private String A3030BarPlf ;
   private String A1955BarFasSig ;
   private String A13878PedidoClie ;
   private String A396EmprCod ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String A13696BarNHdr ;
   private String GXt_char6 ;
   private String GXv_char10[] ;
   private String GXv_char9[] ;
   private String GXv_char8[] ;
   private String GXv_char7[] ;
   private java.util.Date AV40TFBarFecGen ;
   private java.util.Date AV42TFBarFecCli ;
   private java.util.Date AV144TFBarFecFpr ;
   private java.util.Date AV46TFBarFecSal ;
   private java.util.Date AV464barfecgenfrom ;
   private java.util.Date AV465barfecgento ;
   private java.util.Date AV482barfecclifrom ;
   private java.util.Date AV483barfecclito ;
   private java.util.Date AV484BarFecFprfrom ;
   private java.util.Date AV485BarFecFprto ;
   private java.util.Date AV486barfecsalfrom ;
   private java.util.Date AV487barfecsalto ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A158BarFecFpr ;
   private java.util.Date A161BarFecSal ;
   private boolean returnInSub ;
   private boolean brk9DR2 ;
   private boolean n13711BarTipArtD ;
   private boolean n217BarTipArt ;
   private boolean n252CliCod ;
   private boolean n1955BarFasSig ;
   private boolean brk9DR5 ;
   private boolean brk9DR7 ;
   private boolean brk9DR9 ;
   private boolean brk9DR11 ;
   private boolean brk9DR13 ;
   private boolean brk9DR15 ;
   private boolean brk9DR18 ;
   private boolean brk9DR20 ;
   private boolean brk9DR23 ;
   private String AV446OptionsJson ;
   private String AV449OptionsDescJson ;
   private String AV451OptionIndexesJson ;
   private String AV442DDOName ;
   private String AV440SearchTxt ;
   private String AV441SearchTxtTo ;
   private String AV476TFBarNormas ;
   private String AV477TFBarNormas_Sel ;
   private String A13934BarNormas ;
   private String AV444Option ;
   private String AV447OptionDesc ;
   private com.genexus.webpanels.WebSession AV453Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09DR6_A279CliNom ;
   private String[] P09DR6_A3030BarPlf ;
   private int[] P09DR6_A1235BarNumCli ;
   private String[] P09DR6_A4348DisUsrCod ;
   private String[] P09DR6_A2829BarProPer ;
   private short[] P09DR6_A4466BarAcaAnh ;
   private String[] P09DR6_A2454BarGirar ;
   private java.util.Date[] P09DR6_A161BarFecSal ;
   private java.util.Date[] P09DR6_A158BarFecFpr ;
   private java.util.Date[] P09DR6_A155BarFecCli ;
   private java.util.Date[] P09DR6_A159BarFecGen ;
   private byte[] P09DR6_A213BarSit ;
   private String[] P09DR6_A1234BarNomCli ;
   private int[] P09DR6_A136BarColNum ;
   private String[] P09DR6_A135BarColNom ;
   private String[] P09DR6_A13711BarTipArtD ;
   private boolean[] P09DR6_n13711BarTipArtD ;
   private short[] P09DR6_A217BarTipArt ;
   private boolean[] P09DR6_n217BarTipArt ;
   private String[] P09DR6_A1652BarSerDsc ;
   private String[] P09DR6_A212BarSer ;
   private String[] P09DR6_A120BarAgrEst ;
   private int[] P09DR6_A252CliCod ;
   private boolean[] P09DR6_n252CliCod ;
   private String[] P09DR6_A1955BarFasSig ;
   private boolean[] P09DR6_n1955BarFasSig ;
   private String[] P09DR6_A130BarCodPar ;
   private byte[] P09DR6_A132BarCodReo ;
   private int[] P09DR6_A129BarCod ;
   private int[] P09DR6_A361DisCod ;
   private String[] P09DR6_A143BarDisNum ;
   private String[] P09DR6_A4812BarEncCli ;
   private String[] P09DR6_A396EmprCod ;
   private String[] P09DR11_A3030BarPlf ;
   private int[] P09DR11_A1235BarNumCli ;
   private String[] P09DR11_A4348DisUsrCod ;
   private String[] P09DR11_A2829BarProPer ;
   private short[] P09DR11_A4466BarAcaAnh ;
   private String[] P09DR11_A2454BarGirar ;
   private java.util.Date[] P09DR11_A161BarFecSal ;
   private java.util.Date[] P09DR11_A158BarFecFpr ;
   private java.util.Date[] P09DR11_A155BarFecCli ;
   private java.util.Date[] P09DR11_A159BarFecGen ;
   private byte[] P09DR11_A213BarSit ;
   private String[] P09DR11_A1234BarNomCli ;
   private int[] P09DR11_A136BarColNum ;
   private String[] P09DR11_A135BarColNom ;
   private String[] P09DR11_A13711BarTipArtD ;
   private boolean[] P09DR11_n13711BarTipArtD ;
   private short[] P09DR11_A217BarTipArt ;
   private boolean[] P09DR11_n217BarTipArt ;
   private String[] P09DR11_A1652BarSerDsc ;
   private String[] P09DR11_A212BarSer ;
   private String[] P09DR11_A120BarAgrEst ;
   private String[] P09DR11_A279CliNom ;
   private int[] P09DR11_A252CliCod ;
   private boolean[] P09DR11_n252CliCod ;
   private String[] P09DR11_A1955BarFasSig ;
   private boolean[] P09DR11_n1955BarFasSig ;
   private String[] P09DR11_A130BarCodPar ;
   private byte[] P09DR11_A132BarCodReo ;
   private int[] P09DR11_A129BarCod ;
   private int[] P09DR11_A361DisCod ;
   private String[] P09DR11_A143BarDisNum ;
   private String[] P09DR11_A4812BarEncCli ;
   private String[] P09DR11_A396EmprCod ;
   private String[] P09DR16_A120BarAgrEst ;
   private String[] P09DR16_A3030BarPlf ;
   private int[] P09DR16_A1235BarNumCli ;
   private String[] P09DR16_A4348DisUsrCod ;
   private String[] P09DR16_A2829BarProPer ;
   private short[] P09DR16_A4466BarAcaAnh ;
   private String[] P09DR16_A2454BarGirar ;
   private java.util.Date[] P09DR16_A161BarFecSal ;
   private java.util.Date[] P09DR16_A158BarFecFpr ;
   private java.util.Date[] P09DR16_A155BarFecCli ;
   private java.util.Date[] P09DR16_A159BarFecGen ;
   private byte[] P09DR16_A213BarSit ;
   private String[] P09DR16_A1234BarNomCli ;
   private int[] P09DR16_A136BarColNum ;
   private String[] P09DR16_A135BarColNom ;
   private String[] P09DR16_A13711BarTipArtD ;
   private boolean[] P09DR16_n13711BarTipArtD ;
   private short[] P09DR16_A217BarTipArt ;
   private boolean[] P09DR16_n217BarTipArt ;
   private String[] P09DR16_A1652BarSerDsc ;
   private String[] P09DR16_A212BarSer ;
   private String[] P09DR16_A279CliNom ;
   private int[] P09DR16_A252CliCod ;
   private boolean[] P09DR16_n252CliCod ;
   private String[] P09DR16_A1955BarFasSig ;
   private boolean[] P09DR16_n1955BarFasSig ;
   private String[] P09DR16_A130BarCodPar ;
   private byte[] P09DR16_A132BarCodReo ;
   private int[] P09DR16_A129BarCod ;
   private int[] P09DR16_A361DisCod ;
   private String[] P09DR16_A143BarDisNum ;
   private String[] P09DR16_A4812BarEncCli ;
   private String[] P09DR16_A396EmprCod ;
   private String[] P09DR21_A212BarSer ;
   private String[] P09DR21_A3030BarPlf ;
   private int[] P09DR21_A1235BarNumCli ;
   private String[] P09DR21_A4348DisUsrCod ;
   private String[] P09DR21_A2829BarProPer ;
   private short[] P09DR21_A4466BarAcaAnh ;
   private String[] P09DR21_A2454BarGirar ;
   private java.util.Date[] P09DR21_A161BarFecSal ;
   private java.util.Date[] P09DR21_A158BarFecFpr ;
   private java.util.Date[] P09DR21_A155BarFecCli ;
   private java.util.Date[] P09DR21_A159BarFecGen ;
   private byte[] P09DR21_A213BarSit ;
   private String[] P09DR21_A1234BarNomCli ;
   private int[] P09DR21_A136BarColNum ;
   private String[] P09DR21_A135BarColNom ;
   private String[] P09DR21_A13711BarTipArtD ;
   private boolean[] P09DR21_n13711BarTipArtD ;
   private short[] P09DR21_A217BarTipArt ;
   private boolean[] P09DR21_n217BarTipArt ;
   private String[] P09DR21_A1652BarSerDsc ;
   private String[] P09DR21_A120BarAgrEst ;
   private String[] P09DR21_A279CliNom ;
   private int[] P09DR21_A252CliCod ;
   private boolean[] P09DR21_n252CliCod ;
   private String[] P09DR21_A1955BarFasSig ;
   private boolean[] P09DR21_n1955BarFasSig ;
   private String[] P09DR21_A130BarCodPar ;
   private byte[] P09DR21_A132BarCodReo ;
   private int[] P09DR21_A129BarCod ;
   private int[] P09DR21_A361DisCod ;
   private String[] P09DR21_A143BarDisNum ;
   private String[] P09DR21_A4812BarEncCli ;
   private String[] P09DR21_A396EmprCod ;
   private String[] P09DR26_A1652BarSerDsc ;
   private String[] P09DR26_A3030BarPlf ;
   private int[] P09DR26_A1235BarNumCli ;
   private String[] P09DR26_A4348DisUsrCod ;
   private String[] P09DR26_A2829BarProPer ;
   private short[] P09DR26_A4466BarAcaAnh ;
   private String[] P09DR26_A2454BarGirar ;
   private java.util.Date[] P09DR26_A161BarFecSal ;
   private java.util.Date[] P09DR26_A158BarFecFpr ;
   private java.util.Date[] P09DR26_A155BarFecCli ;
   private java.util.Date[] P09DR26_A159BarFecGen ;
   private byte[] P09DR26_A213BarSit ;
   private String[] P09DR26_A1234BarNomCli ;
   private int[] P09DR26_A136BarColNum ;
   private String[] P09DR26_A135BarColNom ;
   private String[] P09DR26_A13711BarTipArtD ;
   private boolean[] P09DR26_n13711BarTipArtD ;
   private short[] P09DR26_A217BarTipArt ;
   private boolean[] P09DR26_n217BarTipArt ;
   private String[] P09DR26_A212BarSer ;
   private String[] P09DR26_A120BarAgrEst ;
   private String[] P09DR26_A279CliNom ;
   private int[] P09DR26_A252CliCod ;
   private boolean[] P09DR26_n252CliCod ;
   private String[] P09DR26_A1955BarFasSig ;
   private boolean[] P09DR26_n1955BarFasSig ;
   private String[] P09DR26_A130BarCodPar ;
   private byte[] P09DR26_A132BarCodReo ;
   private int[] P09DR26_A129BarCod ;
   private int[] P09DR26_A361DisCod ;
   private String[] P09DR26_A143BarDisNum ;
   private String[] P09DR26_A4812BarEncCli ;
   private String[] P09DR26_A396EmprCod ;
   private short[] P09DR31_A217BarTipArt ;
   private boolean[] P09DR31_n217BarTipArt ;
   private String[] P09DR31_A3030BarPlf ;
   private int[] P09DR31_A1235BarNumCli ;
   private String[] P09DR31_A4348DisUsrCod ;
   private String[] P09DR31_A2829BarProPer ;
   private short[] P09DR31_A4466BarAcaAnh ;
   private String[] P09DR31_A2454BarGirar ;
   private java.util.Date[] P09DR31_A161BarFecSal ;
   private java.util.Date[] P09DR31_A158BarFecFpr ;
   private java.util.Date[] P09DR31_A155BarFecCli ;
   private java.util.Date[] P09DR31_A159BarFecGen ;
   private byte[] P09DR31_A213BarSit ;
   private String[] P09DR31_A1234BarNomCli ;
   private int[] P09DR31_A136BarColNum ;
   private String[] P09DR31_A135BarColNom ;
   private String[] P09DR31_A13711BarTipArtD ;
   private boolean[] P09DR31_n13711BarTipArtD ;
   private String[] P09DR31_A1652BarSerDsc ;
   private String[] P09DR31_A212BarSer ;
   private String[] P09DR31_A120BarAgrEst ;
   private String[] P09DR31_A279CliNom ;
   private int[] P09DR31_A252CliCod ;
   private boolean[] P09DR31_n252CliCod ;
   private String[] P09DR31_A1955BarFasSig ;
   private boolean[] P09DR31_n1955BarFasSig ;
   private String[] P09DR31_A130BarCodPar ;
   private byte[] P09DR31_A132BarCodReo ;
   private int[] P09DR31_A129BarCod ;
   private int[] P09DR31_A361DisCod ;
   private String[] P09DR31_A143BarDisNum ;
   private String[] P09DR31_A4812BarEncCli ;
   private String[] P09DR31_A396EmprCod ;
   private String[] P09DR36_A135BarColNom ;
   private String[] P09DR36_A3030BarPlf ;
   private int[] P09DR36_A1235BarNumCli ;
   private String[] P09DR36_A4348DisUsrCod ;
   private String[] P09DR36_A2829BarProPer ;
   private short[] P09DR36_A4466BarAcaAnh ;
   private String[] P09DR36_A2454BarGirar ;
   private java.util.Date[] P09DR36_A161BarFecSal ;
   private java.util.Date[] P09DR36_A158BarFecFpr ;
   private java.util.Date[] P09DR36_A155BarFecCli ;
   private java.util.Date[] P09DR36_A159BarFecGen ;
   private byte[] P09DR36_A213BarSit ;
   private String[] P09DR36_A1234BarNomCli ;
   private int[] P09DR36_A136BarColNum ;
   private String[] P09DR36_A13711BarTipArtD ;
   private boolean[] P09DR36_n13711BarTipArtD ;
   private short[] P09DR36_A217BarTipArt ;
   private boolean[] P09DR36_n217BarTipArt ;
   private String[] P09DR36_A1652BarSerDsc ;
   private String[] P09DR36_A212BarSer ;
   private String[] P09DR36_A120BarAgrEst ;
   private String[] P09DR36_A279CliNom ;
   private int[] P09DR36_A252CliCod ;
   private boolean[] P09DR36_n252CliCod ;
   private String[] P09DR36_A1955BarFasSig ;
   private boolean[] P09DR36_n1955BarFasSig ;
   private String[] P09DR36_A130BarCodPar ;
   private byte[] P09DR36_A132BarCodReo ;
   private int[] P09DR36_A129BarCod ;
   private int[] P09DR36_A361DisCod ;
   private String[] P09DR36_A143BarDisNum ;
   private String[] P09DR36_A4812BarEncCli ;
   private String[] P09DR36_A396EmprCod ;
   private String[] P09DR41_A1234BarNomCli ;
   private String[] P09DR41_A3030BarPlf ;
   private int[] P09DR41_A1235BarNumCli ;
   private String[] P09DR41_A4348DisUsrCod ;
   private String[] P09DR41_A2829BarProPer ;
   private short[] P09DR41_A4466BarAcaAnh ;
   private String[] P09DR41_A2454BarGirar ;
   private java.util.Date[] P09DR41_A161BarFecSal ;
   private java.util.Date[] P09DR41_A158BarFecFpr ;
   private java.util.Date[] P09DR41_A155BarFecCli ;
   private java.util.Date[] P09DR41_A159BarFecGen ;
   private byte[] P09DR41_A213BarSit ;
   private int[] P09DR41_A136BarColNum ;
   private String[] P09DR41_A135BarColNom ;
   private String[] P09DR41_A13711BarTipArtD ;
   private boolean[] P09DR41_n13711BarTipArtD ;
   private short[] P09DR41_A217BarTipArt ;
   private boolean[] P09DR41_n217BarTipArt ;
   private String[] P09DR41_A1652BarSerDsc ;
   private String[] P09DR41_A212BarSer ;
   private String[] P09DR41_A120BarAgrEst ;
   private String[] P09DR41_A279CliNom ;
   private int[] P09DR41_A252CliCod ;
   private boolean[] P09DR41_n252CliCod ;
   private String[] P09DR41_A1955BarFasSig ;
   private boolean[] P09DR41_n1955BarFasSig ;
   private String[] P09DR41_A130BarCodPar ;
   private byte[] P09DR41_A132BarCodReo ;
   private int[] P09DR41_A129BarCod ;
   private int[] P09DR41_A361DisCod ;
   private String[] P09DR41_A143BarDisNum ;
   private String[] P09DR41_A4812BarEncCli ;
   private String[] P09DR41_A396EmprCod ;
   private String[] P09DR46_A3030BarPlf ;
   private int[] P09DR46_A1235BarNumCli ;
   private String[] P09DR46_A4348DisUsrCod ;
   private String[] P09DR46_A2829BarProPer ;
   private short[] P09DR46_A4466BarAcaAnh ;
   private String[] P09DR46_A2454BarGirar ;
   private java.util.Date[] P09DR46_A161BarFecSal ;
   private java.util.Date[] P09DR46_A158BarFecFpr ;
   private java.util.Date[] P09DR46_A155BarFecCli ;
   private java.util.Date[] P09DR46_A159BarFecGen ;
   private byte[] P09DR46_A213BarSit ;
   private String[] P09DR46_A1234BarNomCli ;
   private int[] P09DR46_A136BarColNum ;
   private String[] P09DR46_A135BarColNom ;
   private String[] P09DR46_A13711BarTipArtD ;
   private boolean[] P09DR46_n13711BarTipArtD ;
   private short[] P09DR46_A217BarTipArt ;
   private boolean[] P09DR46_n217BarTipArt ;
   private String[] P09DR46_A1652BarSerDsc ;
   private String[] P09DR46_A212BarSer ;
   private String[] P09DR46_A120BarAgrEst ;
   private String[] P09DR46_A279CliNom ;
   private int[] P09DR46_A252CliCod ;
   private boolean[] P09DR46_n252CliCod ;
   private String[] P09DR46_A1955BarFasSig ;
   private boolean[] P09DR46_n1955BarFasSig ;
   private String[] P09DR46_A130BarCodPar ;
   private byte[] P09DR46_A132BarCodReo ;
   private int[] P09DR46_A129BarCod ;
   private int[] P09DR46_A361DisCod ;
   private String[] P09DR46_A143BarDisNum ;
   private String[] P09DR46_A4812BarEncCli ;
   private String[] P09DR46_A396EmprCod ;
   private String[] P09DR51_A2454BarGirar ;
   private String[] P09DR51_A3030BarPlf ;
   private int[] P09DR51_A1235BarNumCli ;
   private String[] P09DR51_A4348DisUsrCod ;
   private String[] P09DR51_A2829BarProPer ;
   private short[] P09DR51_A4466BarAcaAnh ;
   private java.util.Date[] P09DR51_A161BarFecSal ;
   private java.util.Date[] P09DR51_A158BarFecFpr ;
   private java.util.Date[] P09DR51_A155BarFecCli ;
   private java.util.Date[] P09DR51_A159BarFecGen ;
   private byte[] P09DR51_A213BarSit ;
   private String[] P09DR51_A1234BarNomCli ;
   private int[] P09DR51_A136BarColNum ;
   private String[] P09DR51_A135BarColNom ;
   private String[] P09DR51_A13711BarTipArtD ;
   private boolean[] P09DR51_n13711BarTipArtD ;
   private short[] P09DR51_A217BarTipArt ;
   private boolean[] P09DR51_n217BarTipArt ;
   private String[] P09DR51_A1652BarSerDsc ;
   private String[] P09DR51_A212BarSer ;
   private String[] P09DR51_A120BarAgrEst ;
   private String[] P09DR51_A279CliNom ;
   private int[] P09DR51_A252CliCod ;
   private boolean[] P09DR51_n252CliCod ;
   private String[] P09DR51_A1955BarFasSig ;
   private boolean[] P09DR51_n1955BarFasSig ;
   private String[] P09DR51_A130BarCodPar ;
   private byte[] P09DR51_A132BarCodReo ;
   private int[] P09DR51_A129BarCod ;
   private int[] P09DR51_A361DisCod ;
   private String[] P09DR51_A143BarDisNum ;
   private String[] P09DR51_A4812BarEncCli ;
   private String[] P09DR51_A396EmprCod ;
   private String[] P09DR56_A2829BarProPer ;
   private String[] P09DR56_A3030BarPlf ;
   private int[] P09DR56_A1235BarNumCli ;
   private String[] P09DR56_A4348DisUsrCod ;
   private short[] P09DR56_A4466BarAcaAnh ;
   private String[] P09DR56_A2454BarGirar ;
   private java.util.Date[] P09DR56_A161BarFecSal ;
   private java.util.Date[] P09DR56_A158BarFecFpr ;
   private java.util.Date[] P09DR56_A155BarFecCli ;
   private java.util.Date[] P09DR56_A159BarFecGen ;
   private byte[] P09DR56_A213BarSit ;
   private String[] P09DR56_A1234BarNomCli ;
   private int[] P09DR56_A136BarColNum ;
   private String[] P09DR56_A135BarColNom ;
   private String[] P09DR56_A13711BarTipArtD ;
   private boolean[] P09DR56_n13711BarTipArtD ;
   private short[] P09DR56_A217BarTipArt ;
   private boolean[] P09DR56_n217BarTipArt ;
   private String[] P09DR56_A1652BarSerDsc ;
   private String[] P09DR56_A212BarSer ;
   private String[] P09DR56_A120BarAgrEst ;
   private String[] P09DR56_A279CliNom ;
   private int[] P09DR56_A252CliCod ;
   private boolean[] P09DR56_n252CliCod ;
   private String[] P09DR56_A1955BarFasSig ;
   private boolean[] P09DR56_n1955BarFasSig ;
   private String[] P09DR56_A130BarCodPar ;
   private byte[] P09DR56_A132BarCodReo ;
   private int[] P09DR56_A129BarCod ;
   private int[] P09DR56_A361DisCod ;
   private String[] P09DR56_A143BarDisNum ;
   private String[] P09DR56_A4812BarEncCli ;
   private String[] P09DR56_A396EmprCod ;
   private String[] P09DR61_A3030BarPlf ;
   private int[] P09DR61_A1235BarNumCli ;
   private String[] P09DR61_A4348DisUsrCod ;
   private String[] P09DR61_A2829BarProPer ;
   private short[] P09DR61_A4466BarAcaAnh ;
   private String[] P09DR61_A2454BarGirar ;
   private java.util.Date[] P09DR61_A161BarFecSal ;
   private java.util.Date[] P09DR61_A158BarFecFpr ;
   private java.util.Date[] P09DR61_A155BarFecCli ;
   private java.util.Date[] P09DR61_A159BarFecGen ;
   private byte[] P09DR61_A213BarSit ;
   private String[] P09DR61_A1234BarNomCli ;
   private int[] P09DR61_A136BarColNum ;
   private String[] P09DR61_A135BarColNom ;
   private String[] P09DR61_A13711BarTipArtD ;
   private boolean[] P09DR61_n13711BarTipArtD ;
   private short[] P09DR61_A217BarTipArt ;
   private boolean[] P09DR61_n217BarTipArt ;
   private String[] P09DR61_A1652BarSerDsc ;
   private String[] P09DR61_A212BarSer ;
   private String[] P09DR61_A120BarAgrEst ;
   private String[] P09DR61_A279CliNom ;
   private int[] P09DR61_A252CliCod ;
   private boolean[] P09DR61_n252CliCod ;
   private String[] P09DR61_A1955BarFasSig ;
   private boolean[] P09DR61_n1955BarFasSig ;
   private String[] P09DR61_A130BarCodPar ;
   private byte[] P09DR61_A132BarCodReo ;
   private int[] P09DR61_A129BarCod ;
   private int[] P09DR61_A361DisCod ;
   private String[] P09DR61_A143BarDisNum ;
   private String[] P09DR61_A4812BarEncCli ;
   private String[] P09DR61_A396EmprCod ;
   private String[] P09DR66_A4348DisUsrCod ;
   private String[] P09DR66_A3030BarPlf ;
   private int[] P09DR66_A1235BarNumCli ;
   private String[] P09DR66_A2829BarProPer ;
   private short[] P09DR66_A4466BarAcaAnh ;
   private String[] P09DR66_A2454BarGirar ;
   private java.util.Date[] P09DR66_A161BarFecSal ;
   private java.util.Date[] P09DR66_A158BarFecFpr ;
   private java.util.Date[] P09DR66_A155BarFecCli ;
   private java.util.Date[] P09DR66_A159BarFecGen ;
   private byte[] P09DR66_A213BarSit ;
   private String[] P09DR66_A1234BarNomCli ;
   private int[] P09DR66_A136BarColNum ;
   private String[] P09DR66_A135BarColNom ;
   private String[] P09DR66_A13711BarTipArtD ;
   private boolean[] P09DR66_n13711BarTipArtD ;
   private short[] P09DR66_A217BarTipArt ;
   private boolean[] P09DR66_n217BarTipArt ;
   private String[] P09DR66_A1652BarSerDsc ;
   private String[] P09DR66_A212BarSer ;
   private String[] P09DR66_A120BarAgrEst ;
   private String[] P09DR66_A279CliNom ;
   private int[] P09DR66_A252CliCod ;
   private boolean[] P09DR66_n252CliCod ;
   private String[] P09DR66_A1955BarFasSig ;
   private boolean[] P09DR66_n1955BarFasSig ;
   private String[] P09DR66_A130BarCodPar ;
   private byte[] P09DR66_A132BarCodReo ;
   private int[] P09DR66_A129BarCod ;
   private int[] P09DR66_A361DisCod ;
   private String[] P09DR66_A143BarDisNum ;
   private String[] P09DR66_A4812BarEncCli ;
   private String[] P09DR66_A396EmprCod ;
   private GXSimpleCollection<String> AV445Options ;
   private GXSimpleCollection<String> AV448OptionsDesc ;
   private GXSimpleCollection<String> AV450OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPGridState AV455GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV456GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class consultadeproduccion_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09DR6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV24TFCliCod ,
                                          int AV25TFCliCod_To ,
                                          String AV27TFCliNom_Sel ,
                                          String AV26TFCliNom ,
                                          String AV17TFBarNHdr_Sel ,
                                          String AV16TFBarNHdr ,
                                          String AV157TFBarAgrEst_Sel ,
                                          String AV156TFBarAgrEst ,
                                          String AV29TFBarSer_Sel ,
                                          String AV28TFBarSer ,
                                          String AV31TFBarSerDsc_Sel ,
                                          String AV30TFBarSerDsc ,
                                          short AV32TFBarTipArt ,
                                          short AV33TFBarTipArt_To ,
                                          String AV35TFBarTipArtDsc_Sel ,
                                          String AV34TFBarTipArtDsc ,
                                          String AV37TFBarColNom_Sel ,
                                          String AV36TFBarColNom ,
                                          int AV38TFBarColNum ,
                                          int AV39TFBarColNum_To ,
                                          String AV201TFBarNomCli_Sel ,
                                          String AV200TFBarNomCli ,
                                          byte AV124TFBarSit ,
                                          byte AV125TFBarSit_To ,
                                          java.util.Date AV40TFBarFecGen ,
                                          java.util.Date AV42TFBarFecCli ,
                                          java.util.Date AV144TFBarFecFpr ,
                                          java.util.Date AV46TFBarFecSal ,
                                          String AV325TFBarGirar_Sel ,
                                          String AV324TFBarGirar ,
                                          short AV372TFBarAcaAnh ,
                                          short AV373TFBarAcaAnh_To ,
                                          String AV247TFBarProPer_Sel ,
                                          String AV246TFBarProPer ,
                                          String AV479TFDisUsrCod_Sel ,
                                          String AV478TFDisUsrCod ,
                                          int AV460clicodfrom ,
                                          int AV461clicodto ,
                                          java.util.Date AV464barfecgenfrom ,
                                          java.util.Date AV465barfecgento ,
                                          java.util.Date AV486barfecsalfrom ,
                                          java.util.Date AV487barfecsalto ,
                                          java.util.Date AV482barfecclifrom ,
                                          java.util.Date AV483barfecclito ,
                                          java.util.Date AV484BarFecFprfrom ,
                                          java.util.Date AV485BarFecFprto ,
                                          String AV488barserfrom ,
                                          String AV489barserto ,
                                          String AV492BarColNomfrom ,
                                          String AV493BarColNomto ,
                                          int AV494BarColNumfrom ,
                                          int AV495BarColNumto ,
                                          String AV496BarNomClifrom ,
                                          String AV497BarNomClito ,
                                          int AV498BarNumclifrom ,
                                          int AV499barnumclito ,
                                          short AV490bartipartfrom ,
                                          short AV491bartipartto ,
                                          String AV501muestras ,
                                          int AV502barcodfrom ,
                                          int AV503barcodto ,
                                          byte AV504barcodreofrom ,
                                          byte AV505barcodreoto ,
                                          String AV506barcodparfrom ,
                                          String AV507barcodparto ,
                                          String AV510Cod_idtx ,
                                          String AV513BarGirar ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A120BarAgrEst ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          short A217BarTipArt ,
                                          String A13711BarTipArtD ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          byte A213BarSit ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A155BarFecCli ,
                                          java.util.Date A158BarFecFpr ,
                                          java.util.Date A161BarFecSal ,
                                          String A2454BarGirar ,
                                          short A4466BarAcaAnh ,
                                          String A2829BarProPer ,
                                          String A4348DisUsrCod ,
                                          int A1235BarNumCli ,
                                          String A3030BarPlf ,
                                          String AV65TFBarFasSig_Sel ,
                                          String AV64TFBarFasSig ,
                                          String A1955BarFasSig ,
                                          long AV468TFBarAlbUltimo ,
                                          long A13930BarAlbUlti ,
                                          long AV469TFBarAlbUltimo_To ,
                                          int AV480TFBarAlbFact ,
                                          int A13935BarAlbFact ,
                                          int AV481TFBarAlbFact_To ,
                                          String AV477TFBarNormas_Sel ,
                                          String AV476TFBarNormas ,
                                          String A13934BarNormas ,
                                          String AV462bardisnumfrom ,
                                          String A13878PedidoClie ,
                                          String AV463bardisnumto ,
                                          byte AV466barsitfrom ,
                                          byte AV467barsitto ,
                                          String A396EmprCod ,
                                          String AV459Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[75];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T4.CliNom, T1.BarPlf, T1.BarNumCli, T2.DisUsrCod, T1.BarProPer, T1.BarAcaAnh, T1.BarGirar, T1.BarFecSal, T1.BarFecFpr, T1.BarFecCli, T1.BarFecGen, T1.BarSit," ;
      scmdbuf += " T1.BarNomCli, T1.BarColNum, T1.BarColNom, T3.TipArtDsc AS BarTipArtD, T1.BarTipArt AS BarTipArt, T1.BarSerDsc, T1.BarSer, T1.BarAgrEst, T1.CliCod, COALESCE( T5.BarFasSig," ;
      scmdbuf += " ' ') AS BarFasSig, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.DisCod, T1.BarDisNum, T1.BarEncCli, T1.EmprCod FROM ((((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod AND T3.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.CliCod = T1.CliCod) LEFT JOIN (SELECT MIN(T6.FasCod) AS BarFasSig, COALESCE( T7.BarFasLin, 0) AS BarFasLin, T6.EmprCod, T6.BarCod, T6.BarCodReo," ;
      scmdbuf += " T6.BarCodPar FROM ((TXPBARFAS T6 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP" ;
      scmdbuf += " BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T6.EmprCod AND T7.BarCod = T6.BarCod AND T7.BarCodReo = T6.BarCodReo AND T7.BarCodPar = T6.BarCodPar)" ;
      scmdbuf += " INNER JOIN (SELECT MIN(T9.BarOrdLin) AS GXC1, COALESCE( T10.BarFasLin, 0) AS BarFasLin, T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar FROM (TXPBARFAS T9 LEFT" ;
      scmdbuf += " JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T10 ON T10.EmprCod = T9.EmprCod AND T10.BarCod = T9.BarCod AND T10.BarCodReo = T9.BarCodReo AND T10.BarCodPar = T9.BarCodPar) WHERE (T9.BarOrdLin >= 0) AND (T9.BarOrdLin" ;
      scmdbuf += " > COALESCE( T10.BarFasLin, 0)) AND (T9.BarFasEst = 0) GROUP BY T10.BarFasLin, T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar ) T8 ON T8.EmprCod = T6.EmprCod" ;
      scmdbuf += " AND T8.BarCod = T6.BarCod AND T8.BarCodReo = T6.BarCodReo AND T8.BarCodPar = T6.BarCodPar) WHERE (T6.BarOrdLin = T8.GXC1) AND (T6.BarOrdLin >= 0) AND (T6.BarOrdLin" ;
      scmdbuf += " > COALESCE( T7.BarFasLin, 0)) AND (T6.BarFasEst = 0) GROUP BY T7.BarFasLin, T6.EmprCod, T6.BarCod, T6.BarCodReo, T6.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV24TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( ! (0==AV25TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV27TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV157TFBarAgrEst_Sel)==0) && ( ! (GXutil.strcmp("", AV156TFBarAgrEst)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV157TFBarAgrEst_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV29TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV28TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV29TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV31TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV30TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV31TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( ! (0==AV32TFBarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( ! (0==AV33TFBarTipArt_To) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV35TFBarTipArtDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV34TFBarTipArtDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35TFBarTipArtDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int11[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV37TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV36TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int11[25] = (byte)(1) ;
      }
      if ( ! (0==AV38TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int11[26] = (byte)(1) ;
      }
      if ( ! (0==AV39TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int11[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV201TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV200TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV201TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int11[29] = (byte)(1) ;
      }
      if ( ! (0==AV124TFBarSit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int11[30] = (byte)(1) ;
      }
      if ( ! (0==AV125TFBarSit_To) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int11[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV40TFBarFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int11[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42TFBarFecCli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int11[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV144TFBarFecFpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int11[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV46TFBarFecSal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int11[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV325TFBarGirar_Sel)==0) && ( ! (GXutil.strcmp("", AV324TFBarGirar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarGirar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV325TFBarGirar_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int11[37] = (byte)(1) ;
      }
      if ( ! (0==AV372TFBarAcaAnh) )
      {
         addWhere(sWhereString, "(T1.BarAcaAnh >= ?)");
      }
      else
      {
         GXv_int11[38] = (byte)(1) ;
      }
      if ( ! (0==AV373TFBarAcaAnh_To) )
      {
         addWhere(sWhereString, "(T1.BarAcaAnh <= ?)");
      }
      else
      {
         GXv_int11[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV247TFBarProPer_Sel)==0) && ( ! (GXutil.strcmp("", AV246TFBarProPer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarProPer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV247TFBarProPer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int11[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV479TFDisUsrCod_Sel)==0) && ( ! (GXutil.strcmp("", AV478TFDisUsrCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV479TFDisUsrCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.DisUsrCod = ?)");
      }
      else
      {
         GXv_int11[43] = (byte)(1) ;
      }
      if ( ! (0==AV460clicodfrom) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int11[44] = (byte)(1) ;
      }
      if ( ! (0==AV461clicodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int11[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV464barfecgenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int11[46] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV465barfecgento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int11[47] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV486barfecsalfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int11[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV487barfecsalto)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int11[49] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV482barfecclifrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int11[50] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV483barfecclito)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli <= ?)");
      }
      else
      {
         GXv_int11[51] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV484BarFecFprfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int11[52] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV485BarFecFprto)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int11[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV488barserfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int11[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV489barserto)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int11[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV492BarColNomfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int11[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV493BarColNomto)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int11[57] = (byte)(1) ;
      }
      if ( ! (0==AV494BarColNumfrom) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int11[58] = (byte)(1) ;
      }
      if ( ! (0==AV495BarColNumto) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int11[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV496BarNomClifrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli >= ?)");
      }
      else
      {
         GXv_int11[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV497BarNomClito)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli <= ?)");
      }
      else
      {
         GXv_int11[61] = (byte)(1) ;
      }
      if ( ! (0==AV498BarNumclifrom) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int11[62] = (byte)(1) ;
      }
      if ( ! (0==AV499barnumclito) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int11[63] = (byte)(1) ;
      }
      if ( ! (0==AV490bartipartfrom) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int11[64] = (byte)(1) ;
      }
      if ( ! (0==AV491bartipartto) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int11[65] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV501muestras)==0) )
      {
         addWhere(sWhereString, "(T1.BarPlf = ?)");
      }
      else
      {
         GXv_int11[66] = (byte)(1) ;
      }
      if ( ! (0==AV502barcodfrom) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int11[67] = (byte)(1) ;
      }
      if ( ! (0==AV503barcodto) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int11[68] = (byte)(1) ;
      }
      if ( ! (0==AV504barcodreofrom) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int11[69] = (byte)(1) ;
      }
      if ( ! (0==AV505barcodreoto) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int11[70] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV506barcodparfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar >= ?)");
      }
      else
      {
         GXv_int11[71] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV507barcodparto)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar <= ?)");
      }
      else
      {
         GXv_int11[72] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV510Cod_idtx)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int11[73] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV513BarGirar)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int11[74] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T4.CliNom" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_P09DR11( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV24TFCliCod ,
                                           int AV25TFCliCod_To ,
                                           String AV27TFCliNom_Sel ,
                                           String AV26TFCliNom ,
                                           String AV17TFBarNHdr_Sel ,
                                           String AV16TFBarNHdr ,
                                           String AV157TFBarAgrEst_Sel ,
                                           String AV156TFBarAgrEst ,
                                           String AV29TFBarSer_Sel ,
                                           String AV28TFBarSer ,
                                           String AV31TFBarSerDsc_Sel ,
                                           String AV30TFBarSerDsc ,
                                           short AV32TFBarTipArt ,
                                           short AV33TFBarTipArt_To ,
                                           String AV35TFBarTipArtDsc_Sel ,
                                           String AV34TFBarTipArtDsc ,
                                           String AV37TFBarColNom_Sel ,
                                           String AV36TFBarColNom ,
                                           int AV38TFBarColNum ,
                                           int AV39TFBarColNum_To ,
                                           String AV201TFBarNomCli_Sel ,
                                           String AV200TFBarNomCli ,
                                           byte AV124TFBarSit ,
                                           byte AV125TFBarSit_To ,
                                           java.util.Date AV40TFBarFecGen ,
                                           java.util.Date AV42TFBarFecCli ,
                                           java.util.Date AV144TFBarFecFpr ,
                                           java.util.Date AV46TFBarFecSal ,
                                           String AV325TFBarGirar_Sel ,
                                           String AV324TFBarGirar ,
                                           short AV372TFBarAcaAnh ,
                                           short AV373TFBarAcaAnh_To ,
                                           String AV247TFBarProPer_Sel ,
                                           String AV246TFBarProPer ,
                                           String AV479TFDisUsrCod_Sel ,
                                           String AV478TFDisUsrCod ,
                                           int AV460clicodfrom ,
                                           int AV461clicodto ,
                                           java.util.Date AV464barfecgenfrom ,
                                           java.util.Date AV465barfecgento ,
                                           java.util.Date AV486barfecsalfrom ,
                                           java.util.Date AV487barfecsalto ,
                                           java.util.Date AV482barfecclifrom ,
                                           java.util.Date AV483barfecclito ,
                                           java.util.Date AV484BarFecFprfrom ,
                                           java.util.Date AV485BarFecFprto ,
                                           String AV488barserfrom ,
                                           String AV489barserto ,
                                           String AV492BarColNomfrom ,
                                           String AV493BarColNomto ,
                                           int AV494BarColNumfrom ,
                                           int AV495BarColNumto ,
                                           String AV496BarNomClifrom ,
                                           String AV497BarNomClito ,
                                           int AV498BarNumclifrom ,
                                           int AV499barnumclito ,
                                           short AV490bartipartfrom ,
                                           short AV491bartipartto ,
                                           String AV501muestras ,
                                           int AV502barcodfrom ,
                                           int AV503barcodto ,
                                           byte AV504barcodreofrom ,
                                           byte AV505barcodreoto ,
                                           String AV506barcodparfrom ,
                                           String AV507barcodparto ,
                                           String AV510Cod_idtx ,
                                           String AV513BarGirar ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A120BarAgrEst ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           short A217BarTipArt ,
                                           String A13711BarTipArtD ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           byte A213BarSit ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date A155BarFecCli ,
                                           java.util.Date A158BarFecFpr ,
                                           java.util.Date A161BarFecSal ,
                                           String A2454BarGirar ,
                                           short A4466BarAcaAnh ,
                                           String A2829BarProPer ,
                                           String A4348DisUsrCod ,
                                           int A1235BarNumCli ,
                                           String A3030BarPlf ,
                                           String AV65TFBarFasSig_Sel ,
                                           String AV64TFBarFasSig ,
                                           String A1955BarFasSig ,
                                           long AV468TFBarAlbUltimo ,
                                           long A13930BarAlbUlti ,
                                           long AV469TFBarAlbUltimo_To ,
                                           int AV480TFBarAlbFact ,
                                           int A13935BarAlbFact ,
                                           int AV481TFBarAlbFact_To ,
                                           String AV477TFBarNormas_Sel ,
                                           String AV476TFBarNormas ,
                                           String A13934BarNormas ,
                                           String AV462bardisnumfrom ,
                                           String A13878PedidoClie ,
                                           String AV463bardisnumto ,
                                           byte AV466barsitfrom ,
                                           byte AV467barsitto ,
                                           String AV459Emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int13 = new byte[75];
      Object[] GXv_Object14 = new Object[2];
      scmdbuf = "SELECT T1.BarPlf, T1.BarNumCli, T2.DisUsrCod, T1.BarProPer, T1.BarAcaAnh, T1.BarGirar, T1.BarFecSal, T1.BarFecFpr, T1.BarFecCli, T1.BarFecGen, T1.BarSit, T1.BarNomCli," ;
      scmdbuf += " T1.BarColNum, T1.BarColNom, T3.TipArtDsc AS BarTipArtD, T1.BarTipArt AS BarTipArt, T1.BarSerDsc, T1.BarSer, T1.BarAgrEst, T4.CliNom, T1.CliCod, COALESCE( T5.BarFasSig," ;
      scmdbuf += " ' ') AS BarFasSig, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.DisCod, T1.BarDisNum, T1.BarEncCli, T1.EmprCod FROM ((((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod AND T3.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.CliCod = T1.CliCod) LEFT JOIN (SELECT MIN(T6.FasCod) AS BarFasSig, COALESCE( T7.BarFasLin, 0) AS BarFasLin, T6.EmprCod, T6.BarCod, T6.BarCodReo," ;
      scmdbuf += " T6.BarCodPar FROM ((TXPBARFAS T6 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP" ;
      scmdbuf += " BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T6.EmprCod AND T7.BarCod = T6.BarCod AND T7.BarCodReo = T6.BarCodReo AND T7.BarCodPar = T6.BarCodPar)" ;
      scmdbuf += " INNER JOIN (SELECT MIN(T9.BarOrdLin) AS GXC1, COALESCE( T10.BarFasLin, 0) AS BarFasLin, T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar FROM (TXPBARFAS T9 LEFT" ;
      scmdbuf += " JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T10 ON T10.EmprCod = T9.EmprCod AND T10.BarCod = T9.BarCod AND T10.BarCodReo = T9.BarCodReo AND T10.BarCodPar = T9.BarCodPar) WHERE (T9.BarOrdLin >= 0) AND (T9.BarOrdLin" ;
      scmdbuf += " > COALESCE( T10.BarFasLin, 0)) AND (T9.BarFasEst = 0) GROUP BY T10.BarFasLin, T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar ) T8 ON T8.EmprCod = T6.EmprCod" ;
      scmdbuf += " AND T8.BarCod = T6.BarCod AND T8.BarCodReo = T6.BarCodReo AND T8.BarCodPar = T6.BarCodPar) WHERE (T6.BarOrdLin = T8.GXC1) AND (T6.BarOrdLin >= 0) AND (T6.BarOrdLin" ;
      scmdbuf += " > COALESCE( T7.BarFasLin, 0)) AND (T6.BarFasEst = 0) GROUP BY T7.BarFasLin, T6.EmprCod, T6.BarCod, T6.BarCodReo, T6.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      if ( ! (0==AV24TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int13[8] = (byte)(1) ;
      }
      if ( ! (0==AV25TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int13[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV27TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int13[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int13[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV157TFBarAgrEst_Sel)==0) && ( ! (GXutil.strcmp("", AV156TFBarAgrEst)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV157TFBarAgrEst_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int13[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV29TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV28TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV29TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int13[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV31TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV30TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV31TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int13[19] = (byte)(1) ;
      }
      if ( ! (0==AV32TFBarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int13[20] = (byte)(1) ;
      }
      if ( ! (0==AV33TFBarTipArt_To) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int13[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV35TFBarTipArtDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV34TFBarTipArtDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35TFBarTipArtDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int13[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV37TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV36TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int13[25] = (byte)(1) ;
      }
      if ( ! (0==AV38TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int13[26] = (byte)(1) ;
      }
      if ( ! (0==AV39TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int13[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV201TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV200TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV201TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int13[29] = (byte)(1) ;
      }
      if ( ! (0==AV124TFBarSit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int13[30] = (byte)(1) ;
      }
      if ( ! (0==AV125TFBarSit_To) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int13[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV40TFBarFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int13[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42TFBarFecCli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int13[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV144TFBarFecFpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int13[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV46TFBarFecSal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int13[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV325TFBarGirar_Sel)==0) && ( ! (GXutil.strcmp("", AV324TFBarGirar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarGirar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV325TFBarGirar_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int13[37] = (byte)(1) ;
      }
      if ( ! (0==AV372TFBarAcaAnh) )
      {
         addWhere(sWhereString, "(T1.BarAcaAnh >= ?)");
      }
      else
      {
         GXv_int13[38] = (byte)(1) ;
      }
      if ( ! (0==AV373TFBarAcaAnh_To) )
      {
         addWhere(sWhereString, "(T1.BarAcaAnh <= ?)");
      }
      else
      {
         GXv_int13[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV247TFBarProPer_Sel)==0) && ( ! (GXutil.strcmp("", AV246TFBarProPer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarProPer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV247TFBarProPer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int13[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV479TFDisUsrCod_Sel)==0) && ( ! (GXutil.strcmp("", AV478TFDisUsrCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV479TFDisUsrCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.DisUsrCod = ?)");
      }
      else
      {
         GXv_int13[43] = (byte)(1) ;
      }
      if ( ! (0==AV460clicodfrom) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int13[44] = (byte)(1) ;
      }
      if ( ! (0==AV461clicodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int13[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV464barfecgenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int13[46] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV465barfecgento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int13[47] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV486barfecsalfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int13[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV487barfecsalto)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int13[49] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV482barfecclifrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int13[50] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV483barfecclito)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli <= ?)");
      }
      else
      {
         GXv_int13[51] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV484BarFecFprfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int13[52] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV485BarFecFprto)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int13[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV488barserfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int13[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV489barserto)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int13[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV492BarColNomfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int13[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV493BarColNomto)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int13[57] = (byte)(1) ;
      }
      if ( ! (0==AV494BarColNumfrom) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int13[58] = (byte)(1) ;
      }
      if ( ! (0==AV495BarColNumto) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int13[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV496BarNomClifrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli >= ?)");
      }
      else
      {
         GXv_int13[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV497BarNomClito)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli <= ?)");
      }
      else
      {
         GXv_int13[61] = (byte)(1) ;
      }
      if ( ! (0==AV498BarNumclifrom) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int13[62] = (byte)(1) ;
      }
      if ( ! (0==AV499barnumclito) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int13[63] = (byte)(1) ;
      }
      if ( ! (0==AV490bartipartfrom) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int13[64] = (byte)(1) ;
      }
      if ( ! (0==AV491bartipartto) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int13[65] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV501muestras)==0) )
      {
         addWhere(sWhereString, "(T1.BarPlf = ?)");
      }
      else
      {
         GXv_int13[66] = (byte)(1) ;
      }
      if ( ! (0==AV502barcodfrom) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int13[67] = (byte)(1) ;
      }
      if ( ! (0==AV503barcodto) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int13[68] = (byte)(1) ;
      }
      if ( ! (0==AV504barcodreofrom) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int13[69] = (byte)(1) ;
      }
      if ( ! (0==AV505barcodreoto) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int13[70] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV506barcodparfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar >= ?)");
      }
      else
      {
         GXv_int13[71] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV507barcodparto)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar <= ?)");
      }
      else
      {
         GXv_int13[72] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV510Cod_idtx)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int13[73] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV513BarGirar)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int13[74] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object14[0] = scmdbuf ;
      GXv_Object14[1] = GXv_int13 ;
      return GXv_Object14 ;
   }

   protected Object[] conditional_P09DR16( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV24TFCliCod ,
                                           int AV25TFCliCod_To ,
                                           String AV27TFCliNom_Sel ,
                                           String AV26TFCliNom ,
                                           String AV17TFBarNHdr_Sel ,
                                           String AV16TFBarNHdr ,
                                           String AV157TFBarAgrEst_Sel ,
                                           String AV156TFBarAgrEst ,
                                           String AV29TFBarSer_Sel ,
                                           String AV28TFBarSer ,
                                           String AV31TFBarSerDsc_Sel ,
                                           String AV30TFBarSerDsc ,
                                           short AV32TFBarTipArt ,
                                           short AV33TFBarTipArt_To ,
                                           String AV35TFBarTipArtDsc_Sel ,
                                           String AV34TFBarTipArtDsc ,
                                           String AV37TFBarColNom_Sel ,
                                           String AV36TFBarColNom ,
                                           int AV38TFBarColNum ,
                                           int AV39TFBarColNum_To ,
                                           String AV201TFBarNomCli_Sel ,
                                           String AV200TFBarNomCli ,
                                           byte AV124TFBarSit ,
                                           byte AV125TFBarSit_To ,
                                           java.util.Date AV40TFBarFecGen ,
                                           java.util.Date AV42TFBarFecCli ,
                                           java.util.Date AV144TFBarFecFpr ,
                                           java.util.Date AV46TFBarFecSal ,
                                           String AV325TFBarGirar_Sel ,
                                           String AV324TFBarGirar ,
                                           short AV372TFBarAcaAnh ,
                                           short AV373TFBarAcaAnh_To ,
                                           String AV247TFBarProPer_Sel ,
                                           String AV246TFBarProPer ,
                                           String AV479TFDisUsrCod_Sel ,
                                           String AV478TFDisUsrCod ,
                                           int AV460clicodfrom ,
                                           int AV461clicodto ,
                                           java.util.Date AV464barfecgenfrom ,
                                           java.util.Date AV465barfecgento ,
                                           java.util.Date AV486barfecsalfrom ,
                                           java.util.Date AV487barfecsalto ,
                                           java.util.Date AV482barfecclifrom ,
                                           java.util.Date AV483barfecclito ,
                                           java.util.Date AV484BarFecFprfrom ,
                                           java.util.Date AV485BarFecFprto ,
                                           String AV488barserfrom ,
                                           String AV489barserto ,
                                           String AV492BarColNomfrom ,
                                           String AV493BarColNomto ,
                                           int AV494BarColNumfrom ,
                                           int AV495BarColNumto ,
                                           String AV496BarNomClifrom ,
                                           String AV497BarNomClito ,
                                           int AV498BarNumclifrom ,
                                           int AV499barnumclito ,
                                           short AV490bartipartfrom ,
                                           short AV491bartipartto ,
                                           String AV501muestras ,
                                           int AV502barcodfrom ,
                                           int AV503barcodto ,
                                           byte AV504barcodreofrom ,
                                           byte AV505barcodreoto ,
                                           String AV506barcodparfrom ,
                                           String AV507barcodparto ,
                                           String AV510Cod_idtx ,
                                           String AV513BarGirar ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A120BarAgrEst ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           short A217BarTipArt ,
                                           String A13711BarTipArtD ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           byte A213BarSit ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date A155BarFecCli ,
                                           java.util.Date A158BarFecFpr ,
                                           java.util.Date A161BarFecSal ,
                                           String A2454BarGirar ,
                                           short A4466BarAcaAnh ,
                                           String A2829BarProPer ,
                                           String A4348DisUsrCod ,
                                           int A1235BarNumCli ,
                                           String A3030BarPlf ,
                                           String AV65TFBarFasSig_Sel ,
                                           String AV64TFBarFasSig ,
                                           String A1955BarFasSig ,
                                           long AV468TFBarAlbUltimo ,
                                           long A13930BarAlbUlti ,
                                           long AV469TFBarAlbUltimo_To ,
                                           int AV480TFBarAlbFact ,
                                           int A13935BarAlbFact ,
                                           int AV481TFBarAlbFact_To ,
                                           String AV477TFBarNormas_Sel ,
                                           String AV476TFBarNormas ,
                                           String A13934BarNormas ,
                                           String AV462bardisnumfrom ,
                                           String A13878PedidoClie ,
                                           String AV463bardisnumto ,
                                           byte AV466barsitfrom ,
                                           byte AV467barsitto ,
                                           String A396EmprCod ,
                                           String AV459Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int15 = new byte[75];
      Object[] GXv_Object16 = new Object[2];
      scmdbuf = "SELECT T1.BarAgrEst, T1.BarPlf, T1.BarNumCli, T2.DisUsrCod, T1.BarProPer, T1.BarAcaAnh, T1.BarGirar, T1.BarFecSal, T1.BarFecFpr, T1.BarFecCli, T1.BarFecGen, T1.BarSit," ;
      scmdbuf += " T1.BarNomCli, T1.BarColNum, T1.BarColNom, T3.TipArtDsc AS BarTipArtD, T1.BarTipArt AS BarTipArt, T1.BarSerDsc, T1.BarSer, T4.CliNom, T1.CliCod, COALESCE( T5.BarFasSig," ;
      scmdbuf += " ' ') AS BarFasSig, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.DisCod, T1.BarDisNum, T1.BarEncCli, T1.EmprCod FROM ((((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod AND T3.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.CliCod = T1.CliCod) LEFT JOIN (SELECT MIN(T6.FasCod) AS BarFasSig, COALESCE( T7.BarFasLin, 0) AS BarFasLin, T6.EmprCod, T6.BarCod, T6.BarCodReo," ;
      scmdbuf += " T6.BarCodPar FROM ((TXPBARFAS T6 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP" ;
      scmdbuf += " BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T6.EmprCod AND T7.BarCod = T6.BarCod AND T7.BarCodReo = T6.BarCodReo AND T7.BarCodPar = T6.BarCodPar)" ;
      scmdbuf += " INNER JOIN (SELECT MIN(T9.BarOrdLin) AS GXC1, COALESCE( T10.BarFasLin, 0) AS BarFasLin, T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar FROM (TXPBARFAS T9 LEFT" ;
      scmdbuf += " JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T10 ON T10.EmprCod = T9.EmprCod AND T10.BarCod = T9.BarCod AND T10.BarCodReo = T9.BarCodReo AND T10.BarCodPar = T9.BarCodPar) WHERE (T9.BarOrdLin >= 0) AND (T9.BarOrdLin" ;
      scmdbuf += " > COALESCE( T10.BarFasLin, 0)) AND (T9.BarFasEst = 0) GROUP BY T10.BarFasLin, T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar ) T8 ON T8.EmprCod = T6.EmprCod" ;
      scmdbuf += " AND T8.BarCod = T6.BarCod AND T8.BarCodReo = T6.BarCodReo AND T8.BarCodPar = T6.BarCodPar) WHERE (T6.BarOrdLin = T8.GXC1) AND (T6.BarOrdLin >= 0) AND (T6.BarOrdLin" ;
      scmdbuf += " > COALESCE( T7.BarFasLin, 0)) AND (T6.BarFasEst = 0) GROUP BY T7.BarFasLin, T6.EmprCod, T6.BarCod, T6.BarCodReo, T6.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV24TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int15[8] = (byte)(1) ;
      }
      if ( ! (0==AV25TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int15[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV27TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int15[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int15[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV157TFBarAgrEst_Sel)==0) && ( ! (GXutil.strcmp("", AV156TFBarAgrEst)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV157TFBarAgrEst_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int15[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV29TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV28TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV29TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int15[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV31TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV30TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV31TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int15[19] = (byte)(1) ;
      }
      if ( ! (0==AV32TFBarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int15[20] = (byte)(1) ;
      }
      if ( ! (0==AV33TFBarTipArt_To) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int15[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV35TFBarTipArtDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV34TFBarTipArtDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35TFBarTipArtDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int15[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV37TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV36TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int15[25] = (byte)(1) ;
      }
      if ( ! (0==AV38TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int15[26] = (byte)(1) ;
      }
      if ( ! (0==AV39TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int15[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV201TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV200TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV201TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int15[29] = (byte)(1) ;
      }
      if ( ! (0==AV124TFBarSit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int15[30] = (byte)(1) ;
      }
      if ( ! (0==AV125TFBarSit_To) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int15[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV40TFBarFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int15[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42TFBarFecCli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int15[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV144TFBarFecFpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int15[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV46TFBarFecSal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int15[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV325TFBarGirar_Sel)==0) && ( ! (GXutil.strcmp("", AV324TFBarGirar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarGirar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV325TFBarGirar_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int15[37] = (byte)(1) ;
      }
      if ( ! (0==AV372TFBarAcaAnh) )
      {
         addWhere(sWhereString, "(T1.BarAcaAnh >= ?)");
      }
      else
      {
         GXv_int15[38] = (byte)(1) ;
      }
      if ( ! (0==AV373TFBarAcaAnh_To) )
      {
         addWhere(sWhereString, "(T1.BarAcaAnh <= ?)");
      }
      else
      {
         GXv_int15[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV247TFBarProPer_Sel)==0) && ( ! (GXutil.strcmp("", AV246TFBarProPer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarProPer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV247TFBarProPer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int15[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV479TFDisUsrCod_Sel)==0) && ( ! (GXutil.strcmp("", AV478TFDisUsrCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV479TFDisUsrCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.DisUsrCod = ?)");
      }
      else
      {
         GXv_int15[43] = (byte)(1) ;
      }
      if ( ! (0==AV460clicodfrom) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int15[44] = (byte)(1) ;
      }
      if ( ! (0==AV461clicodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int15[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV464barfecgenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int15[46] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV465barfecgento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int15[47] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV486barfecsalfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int15[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV487barfecsalto)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int15[49] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV482barfecclifrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int15[50] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV483barfecclito)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli <= ?)");
      }
      else
      {
         GXv_int15[51] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV484BarFecFprfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int15[52] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV485BarFecFprto)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int15[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV488barserfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int15[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV489barserto)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int15[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV492BarColNomfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int15[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV493BarColNomto)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int15[57] = (byte)(1) ;
      }
      if ( ! (0==AV494BarColNumfrom) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int15[58] = (byte)(1) ;
      }
      if ( ! (0==AV495BarColNumto) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int15[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV496BarNomClifrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli >= ?)");
      }
      else
      {
         GXv_int15[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV497BarNomClito)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli <= ?)");
      }
      else
      {
         GXv_int15[61] = (byte)(1) ;
      }
      if ( ! (0==AV498BarNumclifrom) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int15[62] = (byte)(1) ;
      }
      if ( ! (0==AV499barnumclito) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int15[63] = (byte)(1) ;
      }
      if ( ! (0==AV490bartipartfrom) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int15[64] = (byte)(1) ;
      }
      if ( ! (0==AV491bartipartto) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int15[65] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV501muestras)==0) )
      {
         addWhere(sWhereString, "(T1.BarPlf = ?)");
      }
      else
      {
         GXv_int15[66] = (byte)(1) ;
      }
      if ( ! (0==AV502barcodfrom) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int15[67] = (byte)(1) ;
      }
      if ( ! (0==AV503barcodto) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int15[68] = (byte)(1) ;
      }
      if ( ! (0==AV504barcodreofrom) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int15[69] = (byte)(1) ;
      }
      if ( ! (0==AV505barcodreoto) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int15[70] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV506barcodparfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar >= ?)");
      }
      else
      {
         GXv_int15[71] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV507barcodparto)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar <= ?)");
      }
      else
      {
         GXv_int15[72] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV510Cod_idtx)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int15[73] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV513BarGirar)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int15[74] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarAgrEst" ;
      GXv_Object16[0] = scmdbuf ;
      GXv_Object16[1] = GXv_int15 ;
      return GXv_Object16 ;
   }

   protected Object[] conditional_P09DR21( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV24TFCliCod ,
                                           int AV25TFCliCod_To ,
                                           String AV27TFCliNom_Sel ,
                                           String AV26TFCliNom ,
                                           String AV17TFBarNHdr_Sel ,
                                           String AV16TFBarNHdr ,
                                           String AV157TFBarAgrEst_Sel ,
                                           String AV156TFBarAgrEst ,
                                           String AV29TFBarSer_Sel ,
                                           String AV28TFBarSer ,
                                           String AV31TFBarSerDsc_Sel ,
                                           String AV30TFBarSerDsc ,
                                           short AV32TFBarTipArt ,
                                           short AV33TFBarTipArt_To ,
                                           String AV35TFBarTipArtDsc_Sel ,
                                           String AV34TFBarTipArtDsc ,
                                           String AV37TFBarColNom_Sel ,
                                           String AV36TFBarColNom ,
                                           int AV38TFBarColNum ,
                                           int AV39TFBarColNum_To ,
                                           String AV201TFBarNomCli_Sel ,
                                           String AV200TFBarNomCli ,
                                           byte AV124TFBarSit ,
                                           byte AV125TFBarSit_To ,
                                           java.util.Date AV40TFBarFecGen ,
                                           java.util.Date AV42TFBarFecCli ,
                                           java.util.Date AV144TFBarFecFpr ,
                                           java.util.Date AV46TFBarFecSal ,
                                           String AV325TFBarGirar_Sel ,
                                           String AV324TFBarGirar ,
                                           short AV372TFBarAcaAnh ,
                                           short AV373TFBarAcaAnh_To ,
                                           String AV247TFBarProPer_Sel ,
                                           String AV246TFBarProPer ,
                                           String AV479TFDisUsrCod_Sel ,
                                           String AV478TFDisUsrCod ,
                                           int AV460clicodfrom ,
                                           int AV461clicodto ,
                                           java.util.Date AV464barfecgenfrom ,
                                           java.util.Date AV465barfecgento ,
                                           java.util.Date AV486barfecsalfrom ,
                                           java.util.Date AV487barfecsalto ,
                                           java.util.Date AV482barfecclifrom ,
                                           java.util.Date AV483barfecclito ,
                                           java.util.Date AV484BarFecFprfrom ,
                                           java.util.Date AV485BarFecFprto ,
                                           String AV488barserfrom ,
                                           String AV489barserto ,
                                           String AV492BarColNomfrom ,
                                           String AV493BarColNomto ,
                                           int AV494BarColNumfrom ,
                                           int AV495BarColNumto ,
                                           String AV496BarNomClifrom ,
                                           String AV497BarNomClito ,
                                           int AV498BarNumclifrom ,
                                           int AV499barnumclito ,
                                           short AV490bartipartfrom ,
                                           short AV491bartipartto ,
                                           String AV501muestras ,
                                           int AV502barcodfrom ,
                                           int AV503barcodto ,
                                           byte AV504barcodreofrom ,
                                           byte AV505barcodreoto ,
                                           String AV506barcodparfrom ,
                                           String AV507barcodparto ,
                                           String AV510Cod_idtx ,
                                           String AV513BarGirar ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A120BarAgrEst ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           short A217BarTipArt ,
                                           String A13711BarTipArtD ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           byte A213BarSit ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date A155BarFecCli ,
                                           java.util.Date A158BarFecFpr ,
                                           java.util.Date A161BarFecSal ,
                                           String A2454BarGirar ,
                                           short A4466BarAcaAnh ,
                                           String A2829BarProPer ,
                                           String A4348DisUsrCod ,
                                           int A1235BarNumCli ,
                                           String A3030BarPlf ,
                                           String AV65TFBarFasSig_Sel ,
                                           String AV64TFBarFasSig ,
                                           String A1955BarFasSig ,
                                           long AV468TFBarAlbUltimo ,
                                           long A13930BarAlbUlti ,
                                           long AV469TFBarAlbUltimo_To ,
                                           int AV480TFBarAlbFact ,
                                           int A13935BarAlbFact ,
                                           int AV481TFBarAlbFact_To ,
                                           String AV477TFBarNormas_Sel ,
                                           String AV476TFBarNormas ,
                                           String A13934BarNormas ,
                                           String AV462bardisnumfrom ,
                                           String A13878PedidoClie ,
                                           String AV463bardisnumto ,
                                           byte AV466barsitfrom ,
                                           byte AV467barsitto ,
                                           String AV459Emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[75];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT T1.BarSer, T1.BarPlf, T1.BarNumCli, T2.DisUsrCod, T1.BarProPer, T1.BarAcaAnh, T1.BarGirar, T1.BarFecSal, T1.BarFecFpr, T1.BarFecCli, T1.BarFecGen, T1.BarSit," ;
      scmdbuf += " T1.BarNomCli, T1.BarColNum, T1.BarColNom, T3.TipArtDsc AS BarTipArtD, T1.BarTipArt AS BarTipArt, T1.BarSerDsc, T1.BarAgrEst, T4.CliNom, T1.CliCod, COALESCE( T5.BarFasSig," ;
      scmdbuf += " ' ') AS BarFasSig, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.DisCod, T1.BarDisNum, T1.BarEncCli, T1.EmprCod FROM ((((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod AND T3.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.CliCod = T1.CliCod) LEFT JOIN (SELECT MIN(T6.FasCod) AS BarFasSig, COALESCE( T7.BarFasLin, 0) AS BarFasLin, T6.EmprCod, T6.BarCod, T6.BarCodReo," ;
      scmdbuf += " T6.BarCodPar FROM ((TXPBARFAS T6 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP" ;
      scmdbuf += " BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T6.EmprCod AND T7.BarCod = T6.BarCod AND T7.BarCodReo = T6.BarCodReo AND T7.BarCodPar = T6.BarCodPar)" ;
      scmdbuf += " INNER JOIN (SELECT MIN(T9.BarOrdLin) AS GXC1, COALESCE( T10.BarFasLin, 0) AS BarFasLin, T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar FROM (TXPBARFAS T9 LEFT" ;
      scmdbuf += " JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T10 ON T10.EmprCod = T9.EmprCod AND T10.BarCod = T9.BarCod AND T10.BarCodReo = T9.BarCodReo AND T10.BarCodPar = T9.BarCodPar) WHERE (T9.BarOrdLin >= 0) AND (T9.BarOrdLin" ;
      scmdbuf += " > COALESCE( T10.BarFasLin, 0)) AND (T9.BarFasEst = 0) GROUP BY T10.BarFasLin, T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar ) T8 ON T8.EmprCod = T6.EmprCod" ;
      scmdbuf += " AND T8.BarCod = T6.BarCod AND T8.BarCodReo = T6.BarCodReo AND T8.BarCodPar = T6.BarCodPar) WHERE (T6.BarOrdLin = T8.GXC1) AND (T6.BarOrdLin >= 0) AND (T6.BarOrdLin" ;
      scmdbuf += " > COALESCE( T7.BarFasLin, 0)) AND (T6.BarFasEst = 0) GROUP BY T7.BarFasLin, T6.EmprCod, T6.BarCod, T6.BarCodReo, T6.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      if ( ! (0==AV24TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( ! (0==AV25TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV27TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV157TFBarAgrEst_Sel)==0) && ( ! (GXutil.strcmp("", AV156TFBarAgrEst)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV157TFBarAgrEst_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV29TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV28TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV29TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV31TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV30TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV31TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      if ( ! (0==AV32TFBarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int17[20] = (byte)(1) ;
      }
      if ( ! (0==AV33TFBarTipArt_To) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int17[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV35TFBarTipArtDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV34TFBarTipArtDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35TFBarTipArtDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int17[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV37TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV36TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int17[25] = (byte)(1) ;
      }
      if ( ! (0==AV38TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int17[26] = (byte)(1) ;
      }
      if ( ! (0==AV39TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int17[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV201TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV200TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV201TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int17[29] = (byte)(1) ;
      }
      if ( ! (0==AV124TFBarSit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int17[30] = (byte)(1) ;
      }
      if ( ! (0==AV125TFBarSit_To) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int17[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV40TFBarFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int17[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42TFBarFecCli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int17[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV144TFBarFecFpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int17[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV46TFBarFecSal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int17[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV325TFBarGirar_Sel)==0) && ( ! (GXutil.strcmp("", AV324TFBarGirar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarGirar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV325TFBarGirar_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int17[37] = (byte)(1) ;
      }
      if ( ! (0==AV372TFBarAcaAnh) )
      {
         addWhere(sWhereString, "(T1.BarAcaAnh >= ?)");
      }
      else
      {
         GXv_int17[38] = (byte)(1) ;
      }
      if ( ! (0==AV373TFBarAcaAnh_To) )
      {
         addWhere(sWhereString, "(T1.BarAcaAnh <= ?)");
      }
      else
      {
         GXv_int17[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV247TFBarProPer_Sel)==0) && ( ! (GXutil.strcmp("", AV246TFBarProPer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarProPer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV247TFBarProPer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int17[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV479TFDisUsrCod_Sel)==0) && ( ! (GXutil.strcmp("", AV478TFDisUsrCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV479TFDisUsrCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.DisUsrCod = ?)");
      }
      else
      {
         GXv_int17[43] = (byte)(1) ;
      }
      if ( ! (0==AV460clicodfrom) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int17[44] = (byte)(1) ;
      }
      if ( ! (0==AV461clicodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int17[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV464barfecgenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int17[46] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV465barfecgento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int17[47] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV486barfecsalfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int17[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV487barfecsalto)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int17[49] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV482barfecclifrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int17[50] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV483barfecclito)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli <= ?)");
      }
      else
      {
         GXv_int17[51] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV484BarFecFprfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int17[52] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV485BarFecFprto)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int17[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV488barserfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int17[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV489barserto)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int17[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV492BarColNomfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int17[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV493BarColNomto)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int17[57] = (byte)(1) ;
      }
      if ( ! (0==AV494BarColNumfrom) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int17[58] = (byte)(1) ;
      }
      if ( ! (0==AV495BarColNumto) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int17[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV496BarNomClifrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli >= ?)");
      }
      else
      {
         GXv_int17[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV497BarNomClito)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli <= ?)");
      }
      else
      {
         GXv_int17[61] = (byte)(1) ;
      }
      if ( ! (0==AV498BarNumclifrom) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int17[62] = (byte)(1) ;
      }
      if ( ! (0==AV499barnumclito) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int17[63] = (byte)(1) ;
      }
      if ( ! (0==AV490bartipartfrom) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int17[64] = (byte)(1) ;
      }
      if ( ! (0==AV491bartipartto) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int17[65] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV501muestras)==0) )
      {
         addWhere(sWhereString, "(T1.BarPlf = ?)");
      }
      else
      {
         GXv_int17[66] = (byte)(1) ;
      }
      if ( ! (0==AV502barcodfrom) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int17[67] = (byte)(1) ;
      }
      if ( ! (0==AV503barcodto) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int17[68] = (byte)(1) ;
      }
      if ( ! (0==AV504barcodreofrom) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int17[69] = (byte)(1) ;
      }
      if ( ! (0==AV505barcodreoto) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int17[70] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV506barcodparfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar >= ?)");
      }
      else
      {
         GXv_int17[71] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV507barcodparto)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar <= ?)");
      }
      else
      {
         GXv_int17[72] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV510Cod_idtx)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int17[73] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV513BarGirar)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int17[74] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarSer" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_P09DR26( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV24TFCliCod ,
                                           int AV25TFCliCod_To ,
                                           String AV27TFCliNom_Sel ,
                                           String AV26TFCliNom ,
                                           String AV17TFBarNHdr_Sel ,
                                           String AV16TFBarNHdr ,
                                           String AV157TFBarAgrEst_Sel ,
                                           String AV156TFBarAgrEst ,
                                           String AV29TFBarSer_Sel ,
                                           String AV28TFBarSer ,
                                           String AV31TFBarSerDsc_Sel ,
                                           String AV30TFBarSerDsc ,
                                           short AV32TFBarTipArt ,
                                           short AV33TFBarTipArt_To ,
                                           String AV35TFBarTipArtDsc_Sel ,
                                           String AV34TFBarTipArtDsc ,
                                           String AV37TFBarColNom_Sel ,
                                           String AV36TFBarColNom ,
                                           int AV38TFBarColNum ,
                                           int AV39TFBarColNum_To ,
                                           String AV201TFBarNomCli_Sel ,
                                           String AV200TFBarNomCli ,
                                           byte AV124TFBarSit ,
                                           byte AV125TFBarSit_To ,
                                           java.util.Date AV40TFBarFecGen ,
                                           java.util.Date AV42TFBarFecCli ,
                                           java.util.Date AV144TFBarFecFpr ,
                                           java.util.Date AV46TFBarFecSal ,
                                           String AV325TFBarGirar_Sel ,
                                           String AV324TFBarGirar ,
                                           short AV372TFBarAcaAnh ,
                                           short AV373TFBarAcaAnh_To ,
                                           String AV247TFBarProPer_Sel ,
                                           String AV246TFBarProPer ,
                                           String AV479TFDisUsrCod_Sel ,
                                           String AV478TFDisUsrCod ,
                                           int AV460clicodfrom ,
                                           int AV461clicodto ,
                                           java.util.Date AV464barfecgenfrom ,
                                           java.util.Date AV465barfecgento ,
                                           java.util.Date AV486barfecsalfrom ,
                                           java.util.Date AV487barfecsalto ,
                                           java.util.Date AV482barfecclifrom ,
                                           java.util.Date AV483barfecclito ,
                                           java.util.Date AV484BarFecFprfrom ,
                                           java.util.Date AV485BarFecFprto ,
                                           String AV488barserfrom ,
                                           String AV489barserto ,
                                           String AV492BarColNomfrom ,
                                           String AV493BarColNomto ,
                                           int AV494BarColNumfrom ,
                                           int AV495BarColNumto ,
                                           String AV496BarNomClifrom ,
                                           String AV497BarNomClito ,
                                           int AV498BarNumclifrom ,
                                           int AV499barnumclito ,
                                           short AV490bartipartfrom ,
                                           short AV491bartipartto ,
                                           String AV501muestras ,
                                           int AV502barcodfrom ,
                                           int AV503barcodto ,
                                           byte AV504barcodreofrom ,
                                           byte AV505barcodreoto ,
                                           String AV506barcodparfrom ,
                                           String AV507barcodparto ,
                                           String AV510Cod_idtx ,
                                           String AV513BarGirar ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A120BarAgrEst ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           short A217BarTipArt ,
                                           String A13711BarTipArtD ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           byte A213BarSit ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date A155BarFecCli ,
                                           java.util.Date A158BarFecFpr ,
                                           java.util.Date A161BarFecSal ,
                                           String A2454BarGirar ,
                                           short A4466BarAcaAnh ,
                                           String A2829BarProPer ,
                                           String A4348DisUsrCod ,
                                           int A1235BarNumCli ,
                                           String A3030BarPlf ,
                                           String AV65TFBarFasSig_Sel ,
                                           String AV64TFBarFasSig ,
                                           String A1955BarFasSig ,
                                           long AV468TFBarAlbUltimo ,
                                           long A13930BarAlbUlti ,
                                           long AV469TFBarAlbUltimo_To ,
                                           int AV480TFBarAlbFact ,
                                           int A13935BarAlbFact ,
                                           int AV481TFBarAlbFact_To ,
                                           String AV477TFBarNormas_Sel ,
                                           String AV476TFBarNormas ,
                                           String A13934BarNormas ,
                                           String AV462bardisnumfrom ,
                                           String A13878PedidoClie ,
                                           String AV463bardisnumto ,
                                           byte AV466barsitfrom ,
                                           byte AV467barsitto ,
                                           String A396EmprCod ,
                                           String AV459Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[75];
      Object[] GXv_Object20 = new Object[2];
      scmdbuf = "SELECT T1.BarSerDsc, T1.BarPlf, T1.BarNumCli, T2.DisUsrCod, T1.BarProPer, T1.BarAcaAnh, T1.BarGirar, T1.BarFecSal, T1.BarFecFpr, T1.BarFecCli, T1.BarFecGen, T1.BarSit," ;
      scmdbuf += " T1.BarNomCli, T1.BarColNum, T1.BarColNom, T3.TipArtDsc AS BarTipArtD, T1.BarTipArt AS BarTipArt, T1.BarSer, T1.BarAgrEst, T4.CliNom, T1.CliCod, COALESCE( T5.BarFasSig," ;
      scmdbuf += " ' ') AS BarFasSig, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.DisCod, T1.BarDisNum, T1.BarEncCli, T1.EmprCod FROM ((((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod AND T3.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.CliCod = T1.CliCod) LEFT JOIN (SELECT MIN(T6.FasCod) AS BarFasSig, COALESCE( T7.BarFasLin, 0) AS BarFasLin, T6.EmprCod, T6.BarCod, T6.BarCodReo," ;
      scmdbuf += " T6.BarCodPar FROM ((TXPBARFAS T6 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP" ;
      scmdbuf += " BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T6.EmprCod AND T7.BarCod = T6.BarCod AND T7.BarCodReo = T6.BarCodReo AND T7.BarCodPar = T6.BarCodPar)" ;
      scmdbuf += " INNER JOIN (SELECT MIN(T9.BarOrdLin) AS GXC1, COALESCE( T10.BarFasLin, 0) AS BarFasLin, T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar FROM (TXPBARFAS T9 LEFT" ;
      scmdbuf += " JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T10 ON T10.EmprCod = T9.EmprCod AND T10.BarCod = T9.BarCod AND T10.BarCodReo = T9.BarCodReo AND T10.BarCodPar = T9.BarCodPar) WHERE (T9.BarOrdLin >= 0) AND (T9.BarOrdLin" ;
      scmdbuf += " > COALESCE( T10.BarFasLin, 0)) AND (T9.BarFasEst = 0) GROUP BY T10.BarFasLin, T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar ) T8 ON T8.EmprCod = T6.EmprCod" ;
      scmdbuf += " AND T8.BarCod = T6.BarCod AND T8.BarCodReo = T6.BarCodReo AND T8.BarCodPar = T6.BarCodPar) WHERE (T6.BarOrdLin = T8.GXC1) AND (T6.BarOrdLin >= 0) AND (T6.BarOrdLin" ;
      scmdbuf += " > COALESCE( T7.BarFasLin, 0)) AND (T6.BarFasEst = 0) GROUP BY T7.BarFasLin, T6.EmprCod, T6.BarCod, T6.BarCodReo, T6.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV24TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int19[8] = (byte)(1) ;
      }
      if ( ! (0==AV25TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int19[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV27TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int19[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int19[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV157TFBarAgrEst_Sel)==0) && ( ! (GXutil.strcmp("", AV156TFBarAgrEst)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV157TFBarAgrEst_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int19[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV29TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV28TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV29TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int19[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV31TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV30TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV31TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int19[19] = (byte)(1) ;
      }
      if ( ! (0==AV32TFBarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int19[20] = (byte)(1) ;
      }
      if ( ! (0==AV33TFBarTipArt_To) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int19[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV35TFBarTipArtDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV34TFBarTipArtDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35TFBarTipArtDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int19[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV37TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV36TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int19[25] = (byte)(1) ;
      }
      if ( ! (0==AV38TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int19[26] = (byte)(1) ;
      }
      if ( ! (0==AV39TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int19[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV201TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV200TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV201TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int19[29] = (byte)(1) ;
      }
      if ( ! (0==AV124TFBarSit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int19[30] = (byte)(1) ;
      }
      if ( ! (0==AV125TFBarSit_To) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int19[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV40TFBarFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int19[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42TFBarFecCli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int19[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV144TFBarFecFpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int19[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV46TFBarFecSal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int19[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV325TFBarGirar_Sel)==0) && ( ! (GXutil.strcmp("", AV324TFBarGirar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarGirar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV325TFBarGirar_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int19[37] = (byte)(1) ;
      }
      if ( ! (0==AV372TFBarAcaAnh) )
      {
         addWhere(sWhereString, "(T1.BarAcaAnh >= ?)");
      }
      else
      {
         GXv_int19[38] = (byte)(1) ;
      }
      if ( ! (0==AV373TFBarAcaAnh_To) )
      {
         addWhere(sWhereString, "(T1.BarAcaAnh <= ?)");
      }
      else
      {
         GXv_int19[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV247TFBarProPer_Sel)==0) && ( ! (GXutil.strcmp("", AV246TFBarProPer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarProPer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV247TFBarProPer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int19[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV479TFDisUsrCod_Sel)==0) && ( ! (GXutil.strcmp("", AV478TFDisUsrCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV479TFDisUsrCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.DisUsrCod = ?)");
      }
      else
      {
         GXv_int19[43] = (byte)(1) ;
      }
      if ( ! (0==AV460clicodfrom) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int19[44] = (byte)(1) ;
      }
      if ( ! (0==AV461clicodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int19[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV464barfecgenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int19[46] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV465barfecgento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int19[47] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV486barfecsalfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int19[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV487barfecsalto)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int19[49] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV482barfecclifrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int19[50] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV483barfecclito)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli <= ?)");
      }
      else
      {
         GXv_int19[51] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV484BarFecFprfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int19[52] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV485BarFecFprto)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int19[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV488barserfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int19[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV489barserto)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int19[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV492BarColNomfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int19[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV493BarColNomto)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int19[57] = (byte)(1) ;
      }
      if ( ! (0==AV494BarColNumfrom) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int19[58] = (byte)(1) ;
      }
      if ( ! (0==AV495BarColNumto) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int19[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV496BarNomClifrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli >= ?)");
      }
      else
      {
         GXv_int19[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV497BarNomClito)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli <= ?)");
      }
      else
      {
         GXv_int19[61] = (byte)(1) ;
      }
      if ( ! (0==AV498BarNumclifrom) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int19[62] = (byte)(1) ;
      }
      if ( ! (0==AV499barnumclito) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int19[63] = (byte)(1) ;
      }
      if ( ! (0==AV490bartipartfrom) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int19[64] = (byte)(1) ;
      }
      if ( ! (0==AV491bartipartto) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int19[65] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV501muestras)==0) )
      {
         addWhere(sWhereString, "(T1.BarPlf = ?)");
      }
      else
      {
         GXv_int19[66] = (byte)(1) ;
      }
      if ( ! (0==AV502barcodfrom) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int19[67] = (byte)(1) ;
      }
      if ( ! (0==AV503barcodto) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int19[68] = (byte)(1) ;
      }
      if ( ! (0==AV504barcodreofrom) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int19[69] = (byte)(1) ;
      }
      if ( ! (0==AV505barcodreoto) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int19[70] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV506barcodparfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar >= ?)");
      }
      else
      {
         GXv_int19[71] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV507barcodparto)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar <= ?)");
      }
      else
      {
         GXv_int19[72] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV510Cod_idtx)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int19[73] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV513BarGirar)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int19[74] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarSerDsc" ;
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
   }

   protected Object[] conditional_P09DR31( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV24TFCliCod ,
                                           int AV25TFCliCod_To ,
                                           String AV27TFCliNom_Sel ,
                                           String AV26TFCliNom ,
                                           String AV17TFBarNHdr_Sel ,
                                           String AV16TFBarNHdr ,
                                           String AV157TFBarAgrEst_Sel ,
                                           String AV156TFBarAgrEst ,
                                           String AV29TFBarSer_Sel ,
                                           String AV28TFBarSer ,
                                           String AV31TFBarSerDsc_Sel ,
                                           String AV30TFBarSerDsc ,
                                           short AV32TFBarTipArt ,
                                           short AV33TFBarTipArt_To ,
                                           String AV35TFBarTipArtDsc_Sel ,
                                           String AV34TFBarTipArtDsc ,
                                           String AV37TFBarColNom_Sel ,
                                           String AV36TFBarColNom ,
                                           int AV38TFBarColNum ,
                                           int AV39TFBarColNum_To ,
                                           String AV201TFBarNomCli_Sel ,
                                           String AV200TFBarNomCli ,
                                           byte AV124TFBarSit ,
                                           byte AV125TFBarSit_To ,
                                           java.util.Date AV40TFBarFecGen ,
                                           java.util.Date AV42TFBarFecCli ,
                                           java.util.Date AV144TFBarFecFpr ,
                                           java.util.Date AV46TFBarFecSal ,
                                           String AV325TFBarGirar_Sel ,
                                           String AV324TFBarGirar ,
                                           short AV372TFBarAcaAnh ,
                                           short AV373TFBarAcaAnh_To ,
                                           String AV247TFBarProPer_Sel ,
                                           String AV246TFBarProPer ,
                                           String AV479TFDisUsrCod_Sel ,
                                           String AV478TFDisUsrCod ,
                                           int AV460clicodfrom ,
                                           int AV461clicodto ,
                                           java.util.Date AV464barfecgenfrom ,
                                           java.util.Date AV465barfecgento ,
                                           java.util.Date AV486barfecsalfrom ,
                                           java.util.Date AV487barfecsalto ,
                                           java.util.Date AV482barfecclifrom ,
                                           java.util.Date AV483barfecclito ,
                                           java.util.Date AV484BarFecFprfrom ,
                                           java.util.Date AV485BarFecFprto ,
                                           String AV488barserfrom ,
                                           String AV489barserto ,
                                           String AV492BarColNomfrom ,
                                           String AV493BarColNomto ,
                                           int AV494BarColNumfrom ,
                                           int AV495BarColNumto ,
                                           String AV496BarNomClifrom ,
                                           String AV497BarNomClito ,
                                           int AV498BarNumclifrom ,
                                           int AV499barnumclito ,
                                           short AV490bartipartfrom ,
                                           short AV491bartipartto ,
                                           String AV501muestras ,
                                           int AV502barcodfrom ,
                                           int AV503barcodto ,
                                           byte AV504barcodreofrom ,
                                           byte AV505barcodreoto ,
                                           String AV506barcodparfrom ,
                                           String AV507barcodparto ,
                                           String AV510Cod_idtx ,
                                           String AV513BarGirar ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A120BarAgrEst ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           short A217BarTipArt ,
                                           String A13711BarTipArtD ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           byte A213BarSit ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date A155BarFecCli ,
                                           java.util.Date A158BarFecFpr ,
                                           java.util.Date A161BarFecSal ,
                                           String A2454BarGirar ,
                                           short A4466BarAcaAnh ,
                                           String A2829BarProPer ,
                                           String A4348DisUsrCod ,
                                           int A1235BarNumCli ,
                                           String A3030BarPlf ,
                                           String AV65TFBarFasSig_Sel ,
                                           String AV64TFBarFasSig ,
                                           String A1955BarFasSig ,
                                           long AV468TFBarAlbUltimo ,
                                           long A13930BarAlbUlti ,
                                           long AV469TFBarAlbUltimo_To ,
                                           int AV480TFBarAlbFact ,
                                           int A13935BarAlbFact ,
                                           int AV481TFBarAlbFact_To ,
                                           String AV477TFBarNormas_Sel ,
                                           String AV476TFBarNormas ,
                                           String A13934BarNormas ,
                                           String AV462bardisnumfrom ,
                                           String A13878PedidoClie ,
                                           String AV463bardisnumto ,
                                           byte AV466barsitfrom ,
                                           byte AV467barsitto ,
                                           String AV459Emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int21 = new byte[75];
      Object[] GXv_Object22 = new Object[2];
      scmdbuf = "SELECT T1.BarTipArt AS BarTipArt, T1.BarPlf, T1.BarNumCli, T2.DisUsrCod, T1.BarProPer, T1.BarAcaAnh, T1.BarGirar, T1.BarFecSal, T1.BarFecFpr, T1.BarFecCli, T1.BarFecGen," ;
      scmdbuf += " T1.BarSit, T1.BarNomCli, T1.BarColNum, T1.BarColNom, T3.TipArtDsc AS BarTipArtD, T1.BarSerDsc, T1.BarSer, T1.BarAgrEst, T4.CliNom, T1.CliCod, COALESCE( T5.BarFasSig," ;
      scmdbuf += " ' ') AS BarFasSig, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.DisCod, T1.BarDisNum, T1.BarEncCli, T1.EmprCod FROM ((((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod AND T3.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.CliCod = T1.CliCod) LEFT JOIN (SELECT MIN(T6.FasCod) AS BarFasSig, COALESCE( T7.BarFasLin, 0) AS BarFasLin, T6.EmprCod, T6.BarCod, T6.BarCodReo," ;
      scmdbuf += " T6.BarCodPar FROM ((TXPBARFAS T6 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP" ;
      scmdbuf += " BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T6.EmprCod AND T7.BarCod = T6.BarCod AND T7.BarCodReo = T6.BarCodReo AND T7.BarCodPar = T6.BarCodPar)" ;
      scmdbuf += " INNER JOIN (SELECT MIN(T9.BarOrdLin) AS GXC1, COALESCE( T10.BarFasLin, 0) AS BarFasLin, T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar FROM (TXPBARFAS T9 LEFT" ;
      scmdbuf += " JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T10 ON T10.EmprCod = T9.EmprCod AND T10.BarCod = T9.BarCod AND T10.BarCodReo = T9.BarCodReo AND T10.BarCodPar = T9.BarCodPar) WHERE (T9.BarOrdLin >= 0) AND (T9.BarOrdLin" ;
      scmdbuf += " > COALESCE( T10.BarFasLin, 0)) AND (T9.BarFasEst = 0) GROUP BY T10.BarFasLin, T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar ) T8 ON T8.EmprCod = T6.EmprCod" ;
      scmdbuf += " AND T8.BarCod = T6.BarCod AND T8.BarCodReo = T6.BarCodReo AND T8.BarCodPar = T6.BarCodPar) WHERE (T6.BarOrdLin = T8.GXC1) AND (T6.BarOrdLin >= 0) AND (T6.BarOrdLin" ;
      scmdbuf += " > COALESCE( T7.BarFasLin, 0)) AND (T6.BarFasEst = 0) GROUP BY T7.BarFasLin, T6.EmprCod, T6.BarCod, T6.BarCodReo, T6.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      if ( ! (0==AV24TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int21[8] = (byte)(1) ;
      }
      if ( ! (0==AV25TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int21[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV27TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int21[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int21[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV157TFBarAgrEst_Sel)==0) && ( ! (GXutil.strcmp("", AV156TFBarAgrEst)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV157TFBarAgrEst_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int21[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV29TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV28TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV29TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int21[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV31TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV30TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV31TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int21[19] = (byte)(1) ;
      }
      if ( ! (0==AV32TFBarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int21[20] = (byte)(1) ;
      }
      if ( ! (0==AV33TFBarTipArt_To) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int21[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV35TFBarTipArtDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV34TFBarTipArtDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35TFBarTipArtDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int21[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV37TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV36TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int21[25] = (byte)(1) ;
      }
      if ( ! (0==AV38TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int21[26] = (byte)(1) ;
      }
      if ( ! (0==AV39TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int21[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV201TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV200TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV201TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int21[29] = (byte)(1) ;
      }
      if ( ! (0==AV124TFBarSit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int21[30] = (byte)(1) ;
      }
      if ( ! (0==AV125TFBarSit_To) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int21[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV40TFBarFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int21[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42TFBarFecCli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int21[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV144TFBarFecFpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int21[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV46TFBarFecSal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int21[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV325TFBarGirar_Sel)==0) && ( ! (GXutil.strcmp("", AV324TFBarGirar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarGirar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV325TFBarGirar_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int21[37] = (byte)(1) ;
      }
      if ( ! (0==AV372TFBarAcaAnh) )
      {
         addWhere(sWhereString, "(T1.BarAcaAnh >= ?)");
      }
      else
      {
         GXv_int21[38] = (byte)(1) ;
      }
      if ( ! (0==AV373TFBarAcaAnh_To) )
      {
         addWhere(sWhereString, "(T1.BarAcaAnh <= ?)");
      }
      else
      {
         GXv_int21[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV247TFBarProPer_Sel)==0) && ( ! (GXutil.strcmp("", AV246TFBarProPer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarProPer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV247TFBarProPer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int21[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV479TFDisUsrCod_Sel)==0) && ( ! (GXutil.strcmp("", AV478TFDisUsrCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV479TFDisUsrCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.DisUsrCod = ?)");
      }
      else
      {
         GXv_int21[43] = (byte)(1) ;
      }
      if ( ! (0==AV460clicodfrom) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int21[44] = (byte)(1) ;
      }
      if ( ! (0==AV461clicodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int21[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV464barfecgenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int21[46] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV465barfecgento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int21[47] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV486barfecsalfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int21[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV487barfecsalto)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int21[49] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV482barfecclifrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int21[50] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV483barfecclito)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli <= ?)");
      }
      else
      {
         GXv_int21[51] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV484BarFecFprfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int21[52] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV485BarFecFprto)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int21[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV488barserfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int21[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV489barserto)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int21[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV492BarColNomfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int21[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV493BarColNomto)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int21[57] = (byte)(1) ;
      }
      if ( ! (0==AV494BarColNumfrom) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int21[58] = (byte)(1) ;
      }
      if ( ! (0==AV495BarColNumto) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int21[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV496BarNomClifrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli >= ?)");
      }
      else
      {
         GXv_int21[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV497BarNomClito)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli <= ?)");
      }
      else
      {
         GXv_int21[61] = (byte)(1) ;
      }
      if ( ! (0==AV498BarNumclifrom) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int21[62] = (byte)(1) ;
      }
      if ( ! (0==AV499barnumclito) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int21[63] = (byte)(1) ;
      }
      if ( ! (0==AV490bartipartfrom) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int21[64] = (byte)(1) ;
      }
      if ( ! (0==AV491bartipartto) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int21[65] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV501muestras)==0) )
      {
         addWhere(sWhereString, "(T1.BarPlf = ?)");
      }
      else
      {
         GXv_int21[66] = (byte)(1) ;
      }
      if ( ! (0==AV502barcodfrom) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int21[67] = (byte)(1) ;
      }
      if ( ! (0==AV503barcodto) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int21[68] = (byte)(1) ;
      }
      if ( ! (0==AV504barcodreofrom) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int21[69] = (byte)(1) ;
      }
      if ( ! (0==AV505barcodreoto) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int21[70] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV506barcodparfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar >= ?)");
      }
      else
      {
         GXv_int21[71] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV507barcodparto)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar <= ?)");
      }
      else
      {
         GXv_int21[72] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV510Cod_idtx)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int21[73] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV513BarGirar)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int21[74] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarTipArt" ;
      GXv_Object22[0] = scmdbuf ;
      GXv_Object22[1] = GXv_int21 ;
      return GXv_Object22 ;
   }

   protected Object[] conditional_P09DR36( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV24TFCliCod ,
                                           int AV25TFCliCod_To ,
                                           String AV27TFCliNom_Sel ,
                                           String AV26TFCliNom ,
                                           String AV17TFBarNHdr_Sel ,
                                           String AV16TFBarNHdr ,
                                           String AV157TFBarAgrEst_Sel ,
                                           String AV156TFBarAgrEst ,
                                           String AV29TFBarSer_Sel ,
                                           String AV28TFBarSer ,
                                           String AV31TFBarSerDsc_Sel ,
                                           String AV30TFBarSerDsc ,
                                           short AV32TFBarTipArt ,
                                           short AV33TFBarTipArt_To ,
                                           String AV35TFBarTipArtDsc_Sel ,
                                           String AV34TFBarTipArtDsc ,
                                           String AV37TFBarColNom_Sel ,
                                           String AV36TFBarColNom ,
                                           int AV38TFBarColNum ,
                                           int AV39TFBarColNum_To ,
                                           String AV201TFBarNomCli_Sel ,
                                           String AV200TFBarNomCli ,
                                           byte AV124TFBarSit ,
                                           byte AV125TFBarSit_To ,
                                           java.util.Date AV40TFBarFecGen ,
                                           java.util.Date AV42TFBarFecCli ,
                                           java.util.Date AV144TFBarFecFpr ,
                                           java.util.Date AV46TFBarFecSal ,
                                           String AV325TFBarGirar_Sel ,
                                           String AV324TFBarGirar ,
                                           short AV372TFBarAcaAnh ,
                                           short AV373TFBarAcaAnh_To ,
                                           String AV247TFBarProPer_Sel ,
                                           String AV246TFBarProPer ,
                                           String AV479TFDisUsrCod_Sel ,
                                           String AV478TFDisUsrCod ,
                                           int AV460clicodfrom ,
                                           int AV461clicodto ,
                                           java.util.Date AV464barfecgenfrom ,
                                           java.util.Date AV465barfecgento ,
                                           java.util.Date AV486barfecsalfrom ,
                                           java.util.Date AV487barfecsalto ,
                                           java.util.Date AV482barfecclifrom ,
                                           java.util.Date AV483barfecclito ,
                                           java.util.Date AV484BarFecFprfrom ,
                                           java.util.Date AV485BarFecFprto ,
                                           String AV488barserfrom ,
                                           String AV489barserto ,
                                           String AV492BarColNomfrom ,
                                           String AV493BarColNomto ,
                                           int AV494BarColNumfrom ,
                                           int AV495BarColNumto ,
                                           String AV496BarNomClifrom ,
                                           String AV497BarNomClito ,
                                           int AV498BarNumclifrom ,
                                           int AV499barnumclito ,
                                           short AV490bartipartfrom ,
                                           short AV491bartipartto ,
                                           String AV501muestras ,
                                           int AV502barcodfrom ,
                                           int AV503barcodto ,
                                           byte AV504barcodreofrom ,
                                           byte AV505barcodreoto ,
                                           String AV506barcodparfrom ,
                                           String AV507barcodparto ,
                                           String AV510Cod_idtx ,
                                           String AV513BarGirar ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A120BarAgrEst ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           short A217BarTipArt ,
                                           String A13711BarTipArtD ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           byte A213BarSit ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date A155BarFecCli ,
                                           java.util.Date A158BarFecFpr ,
                                           java.util.Date A161BarFecSal ,
                                           String A2454BarGirar ,
                                           short A4466BarAcaAnh ,
                                           String A2829BarProPer ,
                                           String A4348DisUsrCod ,
                                           int A1235BarNumCli ,
                                           String A3030BarPlf ,
                                           String AV65TFBarFasSig_Sel ,
                                           String AV64TFBarFasSig ,
                                           String A1955BarFasSig ,
                                           long AV468TFBarAlbUltimo ,
                                           long A13930BarAlbUlti ,
                                           long AV469TFBarAlbUltimo_To ,
                                           int AV480TFBarAlbFact ,
                                           int A13935BarAlbFact ,
                                           int AV481TFBarAlbFact_To ,
                                           String AV477TFBarNormas_Sel ,
                                           String AV476TFBarNormas ,
                                           String A13934BarNormas ,
                                           String AV462bardisnumfrom ,
                                           String A13878PedidoClie ,
                                           String AV463bardisnumto ,
                                           byte AV466barsitfrom ,
                                           byte AV467barsitto ,
                                           String A396EmprCod ,
                                           String AV459Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[75];
      Object[] GXv_Object24 = new Object[2];
      scmdbuf = "SELECT T1.BarColNom, T1.BarPlf, T1.BarNumCli, T2.DisUsrCod, T1.BarProPer, T1.BarAcaAnh, T1.BarGirar, T1.BarFecSal, T1.BarFecFpr, T1.BarFecCli, T1.BarFecGen, T1.BarSit," ;
      scmdbuf += " T1.BarNomCli, T1.BarColNum, T3.TipArtDsc AS BarTipArtD, T1.BarTipArt AS BarTipArt, T1.BarSerDsc, T1.BarSer, T1.BarAgrEst, T4.CliNom, T1.CliCod, COALESCE( T5.BarFasSig," ;
      scmdbuf += " ' ') AS BarFasSig, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.DisCod, T1.BarDisNum, T1.BarEncCli, T1.EmprCod FROM ((((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod AND T3.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.CliCod = T1.CliCod) LEFT JOIN (SELECT MIN(T6.FasCod) AS BarFasSig, COALESCE( T7.BarFasLin, 0) AS BarFasLin, T6.EmprCod, T6.BarCod, T6.BarCodReo," ;
      scmdbuf += " T6.BarCodPar FROM ((TXPBARFAS T6 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP" ;
      scmdbuf += " BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T6.EmprCod AND T7.BarCod = T6.BarCod AND T7.BarCodReo = T6.BarCodReo AND T7.BarCodPar = T6.BarCodPar)" ;
      scmdbuf += " INNER JOIN (SELECT MIN(T9.BarOrdLin) AS GXC1, COALESCE( T10.BarFasLin, 0) AS BarFasLin, T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar FROM (TXPBARFAS T9 LEFT" ;
      scmdbuf += " JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T10 ON T10.EmprCod = T9.EmprCod AND T10.BarCod = T9.BarCod AND T10.BarCodReo = T9.BarCodReo AND T10.BarCodPar = T9.BarCodPar) WHERE (T9.BarOrdLin >= 0) AND (T9.BarOrdLin" ;
      scmdbuf += " > COALESCE( T10.BarFasLin, 0)) AND (T9.BarFasEst = 0) GROUP BY T10.BarFasLin, T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar ) T8 ON T8.EmprCod = T6.EmprCod" ;
      scmdbuf += " AND T8.BarCod = T6.BarCod AND T8.BarCodReo = T6.BarCodReo AND T8.BarCodPar = T6.BarCodPar) WHERE (T6.BarOrdLin = T8.GXC1) AND (T6.BarOrdLin >= 0) AND (T6.BarOrdLin" ;
      scmdbuf += " > COALESCE( T7.BarFasLin, 0)) AND (T6.BarFasEst = 0) GROUP BY T7.BarFasLin, T6.EmprCod, T6.BarCod, T6.BarCodReo, T6.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV24TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int23[8] = (byte)(1) ;
      }
      if ( ! (0==AV25TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int23[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV27TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int23[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int23[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV157TFBarAgrEst_Sel)==0) && ( ! (GXutil.strcmp("", AV156TFBarAgrEst)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV157TFBarAgrEst_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int23[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV29TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV28TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV29TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int23[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV31TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV30TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV31TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int23[19] = (byte)(1) ;
      }
      if ( ! (0==AV32TFBarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int23[20] = (byte)(1) ;
      }
      if ( ! (0==AV33TFBarTipArt_To) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int23[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV35TFBarTipArtDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV34TFBarTipArtDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35TFBarTipArtDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int23[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV37TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV36TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int23[25] = (byte)(1) ;
      }
      if ( ! (0==AV38TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int23[26] = (byte)(1) ;
      }
      if ( ! (0==AV39TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int23[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV201TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV200TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV201TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int23[29] = (byte)(1) ;
      }
      if ( ! (0==AV124TFBarSit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int23[30] = (byte)(1) ;
      }
      if ( ! (0==AV125TFBarSit_To) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int23[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV40TFBarFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int23[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42TFBarFecCli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int23[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV144TFBarFecFpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int23[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV46TFBarFecSal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int23[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV325TFBarGirar_Sel)==0) && ( ! (GXutil.strcmp("", AV324TFBarGirar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarGirar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV325TFBarGirar_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int23[37] = (byte)(1) ;
      }
      if ( ! (0==AV372TFBarAcaAnh) )
      {
         addWhere(sWhereString, "(T1.BarAcaAnh >= ?)");
      }
      else
      {
         GXv_int23[38] = (byte)(1) ;
      }
      if ( ! (0==AV373TFBarAcaAnh_To) )
      {
         addWhere(sWhereString, "(T1.BarAcaAnh <= ?)");
      }
      else
      {
         GXv_int23[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV247TFBarProPer_Sel)==0) && ( ! (GXutil.strcmp("", AV246TFBarProPer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarProPer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV247TFBarProPer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int23[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV479TFDisUsrCod_Sel)==0) && ( ! (GXutil.strcmp("", AV478TFDisUsrCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV479TFDisUsrCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.DisUsrCod = ?)");
      }
      else
      {
         GXv_int23[43] = (byte)(1) ;
      }
      if ( ! (0==AV460clicodfrom) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int23[44] = (byte)(1) ;
      }
      if ( ! (0==AV461clicodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int23[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV464barfecgenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int23[46] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV465barfecgento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int23[47] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV486barfecsalfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int23[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV487barfecsalto)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int23[49] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV482barfecclifrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int23[50] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV483barfecclito)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli <= ?)");
      }
      else
      {
         GXv_int23[51] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV484BarFecFprfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int23[52] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV485BarFecFprto)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int23[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV488barserfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int23[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV489barserto)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int23[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV492BarColNomfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int23[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV493BarColNomto)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int23[57] = (byte)(1) ;
      }
      if ( ! (0==AV494BarColNumfrom) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int23[58] = (byte)(1) ;
      }
      if ( ! (0==AV495BarColNumto) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int23[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV496BarNomClifrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli >= ?)");
      }
      else
      {
         GXv_int23[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV497BarNomClito)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli <= ?)");
      }
      else
      {
         GXv_int23[61] = (byte)(1) ;
      }
      if ( ! (0==AV498BarNumclifrom) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int23[62] = (byte)(1) ;
      }
      if ( ! (0==AV499barnumclito) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int23[63] = (byte)(1) ;
      }
      if ( ! (0==AV490bartipartfrom) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int23[64] = (byte)(1) ;
      }
      if ( ! (0==AV491bartipartto) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int23[65] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV501muestras)==0) )
      {
         addWhere(sWhereString, "(T1.BarPlf = ?)");
      }
      else
      {
         GXv_int23[66] = (byte)(1) ;
      }
      if ( ! (0==AV502barcodfrom) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int23[67] = (byte)(1) ;
      }
      if ( ! (0==AV503barcodto) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int23[68] = (byte)(1) ;
      }
      if ( ! (0==AV504barcodreofrom) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int23[69] = (byte)(1) ;
      }
      if ( ! (0==AV505barcodreoto) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int23[70] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV506barcodparfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar >= ?)");
      }
      else
      {
         GXv_int23[71] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV507barcodparto)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar <= ?)");
      }
      else
      {
         GXv_int23[72] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV510Cod_idtx)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int23[73] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV513BarGirar)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int23[74] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarColNom" ;
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
   }

   protected Object[] conditional_P09DR41( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV24TFCliCod ,
                                           int AV25TFCliCod_To ,
                                           String AV27TFCliNom_Sel ,
                                           String AV26TFCliNom ,
                                           String AV17TFBarNHdr_Sel ,
                                           String AV16TFBarNHdr ,
                                           String AV157TFBarAgrEst_Sel ,
                                           String AV156TFBarAgrEst ,
                                           String AV29TFBarSer_Sel ,
                                           String AV28TFBarSer ,
                                           String AV31TFBarSerDsc_Sel ,
                                           String AV30TFBarSerDsc ,
                                           short AV32TFBarTipArt ,
                                           short AV33TFBarTipArt_To ,
                                           String AV35TFBarTipArtDsc_Sel ,
                                           String AV34TFBarTipArtDsc ,
                                           String AV37TFBarColNom_Sel ,
                                           String AV36TFBarColNom ,
                                           int AV38TFBarColNum ,
                                           int AV39TFBarColNum_To ,
                                           String AV201TFBarNomCli_Sel ,
                                           String AV200TFBarNomCli ,
                                           byte AV124TFBarSit ,
                                           byte AV125TFBarSit_To ,
                                           java.util.Date AV40TFBarFecGen ,
                                           java.util.Date AV42TFBarFecCli ,
                                           java.util.Date AV144TFBarFecFpr ,
                                           java.util.Date AV46TFBarFecSal ,
                                           String AV325TFBarGirar_Sel ,
                                           String AV324TFBarGirar ,
                                           short AV372TFBarAcaAnh ,
                                           short AV373TFBarAcaAnh_To ,
                                           String AV247TFBarProPer_Sel ,
                                           String AV246TFBarProPer ,
                                           String AV479TFDisUsrCod_Sel ,
                                           String AV478TFDisUsrCod ,
                                           int AV460clicodfrom ,
                                           int AV461clicodto ,
                                           java.util.Date AV464barfecgenfrom ,
                                           java.util.Date AV465barfecgento ,
                                           java.util.Date AV486barfecsalfrom ,
                                           java.util.Date AV487barfecsalto ,
                                           java.util.Date AV482barfecclifrom ,
                                           java.util.Date AV483barfecclito ,
                                           java.util.Date AV484BarFecFprfrom ,
                                           java.util.Date AV485BarFecFprto ,
                                           String AV488barserfrom ,
                                           String AV489barserto ,
                                           String AV492BarColNomfrom ,
                                           String AV493BarColNomto ,
                                           int AV494BarColNumfrom ,
                                           int AV495BarColNumto ,
                                           String AV496BarNomClifrom ,
                                           String AV497BarNomClito ,
                                           int AV498BarNumclifrom ,
                                           int AV499barnumclito ,
                                           short AV490bartipartfrom ,
                                           short AV491bartipartto ,
                                           String AV501muestras ,
                                           int AV502barcodfrom ,
                                           int AV503barcodto ,
                                           byte AV504barcodreofrom ,
                                           byte AV505barcodreoto ,
                                           String AV506barcodparfrom ,
                                           String AV507barcodparto ,
                                           String AV510Cod_idtx ,
                                           String AV513BarGirar ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A120BarAgrEst ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           short A217BarTipArt ,
                                           String A13711BarTipArtD ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           byte A213BarSit ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date A155BarFecCli ,
                                           java.util.Date A158BarFecFpr ,
                                           java.util.Date A161BarFecSal ,
                                           String A2454BarGirar ,
                                           short A4466BarAcaAnh ,
                                           String A2829BarProPer ,
                                           String A4348DisUsrCod ,
                                           int A1235BarNumCli ,
                                           String A3030BarPlf ,
                                           String AV65TFBarFasSig_Sel ,
                                           String AV64TFBarFasSig ,
                                           String A1955BarFasSig ,
                                           long AV468TFBarAlbUltimo ,
                                           long A13930BarAlbUlti ,
                                           long AV469TFBarAlbUltimo_To ,
                                           int AV480TFBarAlbFact ,
                                           int A13935BarAlbFact ,
                                           int AV481TFBarAlbFact_To ,
                                           String AV477TFBarNormas_Sel ,
                                           String AV476TFBarNormas ,
                                           String A13934BarNormas ,
                                           String AV462bardisnumfrom ,
                                           String A13878PedidoClie ,
                                           String AV463bardisnumto ,
                                           byte AV466barsitfrom ,
                                           byte AV467barsitto ,
                                           String A396EmprCod ,
                                           String AV459Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int25 = new byte[75];
      Object[] GXv_Object26 = new Object[2];
      scmdbuf = "SELECT T1.BarNomCli, T1.BarPlf, T1.BarNumCli, T2.DisUsrCod, T1.BarProPer, T1.BarAcaAnh, T1.BarGirar, T1.BarFecSal, T1.BarFecFpr, T1.BarFecCli, T1.BarFecGen, T1.BarSit," ;
      scmdbuf += " T1.BarColNum, T1.BarColNom, T3.TipArtDsc AS BarTipArtD, T1.BarTipArt AS BarTipArt, T1.BarSerDsc, T1.BarSer, T1.BarAgrEst, T4.CliNom, T1.CliCod, COALESCE( T5.BarFasSig," ;
      scmdbuf += " ' ') AS BarFasSig, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.DisCod, T1.BarDisNum, T1.BarEncCli, T1.EmprCod FROM ((((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod AND T3.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.CliCod = T1.CliCod) LEFT JOIN (SELECT MIN(T6.FasCod) AS BarFasSig, COALESCE( T7.BarFasLin, 0) AS BarFasLin, T6.EmprCod, T6.BarCod, T6.BarCodReo," ;
      scmdbuf += " T6.BarCodPar FROM ((TXPBARFAS T6 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP" ;
      scmdbuf += " BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T6.EmprCod AND T7.BarCod = T6.BarCod AND T7.BarCodReo = T6.BarCodReo AND T7.BarCodPar = T6.BarCodPar)" ;
      scmdbuf += " INNER JOIN (SELECT MIN(T9.BarOrdLin) AS GXC1, COALESCE( T10.BarFasLin, 0) AS BarFasLin, T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar FROM (TXPBARFAS T9 LEFT" ;
      scmdbuf += " JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T10 ON T10.EmprCod = T9.EmprCod AND T10.BarCod = T9.BarCod AND T10.BarCodReo = T9.BarCodReo AND T10.BarCodPar = T9.BarCodPar) WHERE (T9.BarOrdLin >= 0) AND (T9.BarOrdLin" ;
      scmdbuf += " > COALESCE( T10.BarFasLin, 0)) AND (T9.BarFasEst = 0) GROUP BY T10.BarFasLin, T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar ) T8 ON T8.EmprCod = T6.EmprCod" ;
      scmdbuf += " AND T8.BarCod = T6.BarCod AND T8.BarCodReo = T6.BarCodReo AND T8.BarCodPar = T6.BarCodPar) WHERE (T6.BarOrdLin = T8.GXC1) AND (T6.BarOrdLin >= 0) AND (T6.BarOrdLin" ;
      scmdbuf += " > COALESCE( T7.BarFasLin, 0)) AND (T6.BarFasEst = 0) GROUP BY T7.BarFasLin, T6.EmprCod, T6.BarCod, T6.BarCodReo, T6.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV24TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int25[8] = (byte)(1) ;
      }
      if ( ! (0==AV25TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int25[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV27TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int25[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int25[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV157TFBarAgrEst_Sel)==0) && ( ! (GXutil.strcmp("", AV156TFBarAgrEst)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV157TFBarAgrEst_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int25[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV29TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV28TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV29TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int25[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV31TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV30TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV31TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int25[19] = (byte)(1) ;
      }
      if ( ! (0==AV32TFBarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int25[20] = (byte)(1) ;
      }
      if ( ! (0==AV33TFBarTipArt_To) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int25[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV35TFBarTipArtDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV34TFBarTipArtDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35TFBarTipArtDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int25[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV37TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV36TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int25[25] = (byte)(1) ;
      }
      if ( ! (0==AV38TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int25[26] = (byte)(1) ;
      }
      if ( ! (0==AV39TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int25[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV201TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV200TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV201TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int25[29] = (byte)(1) ;
      }
      if ( ! (0==AV124TFBarSit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int25[30] = (byte)(1) ;
      }
      if ( ! (0==AV125TFBarSit_To) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int25[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV40TFBarFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int25[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42TFBarFecCli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int25[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV144TFBarFecFpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int25[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV46TFBarFecSal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int25[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV325TFBarGirar_Sel)==0) && ( ! (GXutil.strcmp("", AV324TFBarGirar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarGirar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV325TFBarGirar_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int25[37] = (byte)(1) ;
      }
      if ( ! (0==AV372TFBarAcaAnh) )
      {
         addWhere(sWhereString, "(T1.BarAcaAnh >= ?)");
      }
      else
      {
         GXv_int25[38] = (byte)(1) ;
      }
      if ( ! (0==AV373TFBarAcaAnh_To) )
      {
         addWhere(sWhereString, "(T1.BarAcaAnh <= ?)");
      }
      else
      {
         GXv_int25[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV247TFBarProPer_Sel)==0) && ( ! (GXutil.strcmp("", AV246TFBarProPer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarProPer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV247TFBarProPer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int25[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV479TFDisUsrCod_Sel)==0) && ( ! (GXutil.strcmp("", AV478TFDisUsrCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV479TFDisUsrCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.DisUsrCod = ?)");
      }
      else
      {
         GXv_int25[43] = (byte)(1) ;
      }
      if ( ! (0==AV460clicodfrom) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int25[44] = (byte)(1) ;
      }
      if ( ! (0==AV461clicodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int25[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV464barfecgenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int25[46] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV465barfecgento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int25[47] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV486barfecsalfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int25[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV487barfecsalto)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int25[49] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV482barfecclifrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int25[50] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV483barfecclito)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli <= ?)");
      }
      else
      {
         GXv_int25[51] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV484BarFecFprfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int25[52] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV485BarFecFprto)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int25[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV488barserfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int25[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV489barserto)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int25[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV492BarColNomfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int25[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV493BarColNomto)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int25[57] = (byte)(1) ;
      }
      if ( ! (0==AV494BarColNumfrom) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int25[58] = (byte)(1) ;
      }
      if ( ! (0==AV495BarColNumto) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int25[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV496BarNomClifrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli >= ?)");
      }
      else
      {
         GXv_int25[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV497BarNomClito)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli <= ?)");
      }
      else
      {
         GXv_int25[61] = (byte)(1) ;
      }
      if ( ! (0==AV498BarNumclifrom) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int25[62] = (byte)(1) ;
      }
      if ( ! (0==AV499barnumclito) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int25[63] = (byte)(1) ;
      }
      if ( ! (0==AV490bartipartfrom) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int25[64] = (byte)(1) ;
      }
      if ( ! (0==AV491bartipartto) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int25[65] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV501muestras)==0) )
      {
         addWhere(sWhereString, "(T1.BarPlf = ?)");
      }
      else
      {
         GXv_int25[66] = (byte)(1) ;
      }
      if ( ! (0==AV502barcodfrom) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int25[67] = (byte)(1) ;
      }
      if ( ! (0==AV503barcodto) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int25[68] = (byte)(1) ;
      }
      if ( ! (0==AV504barcodreofrom) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int25[69] = (byte)(1) ;
      }
      if ( ! (0==AV505barcodreoto) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int25[70] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV506barcodparfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar >= ?)");
      }
      else
      {
         GXv_int25[71] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV507barcodparto)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar <= ?)");
      }
      else
      {
         GXv_int25[72] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV510Cod_idtx)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int25[73] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV513BarGirar)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int25[74] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarNomCli" ;
      GXv_Object26[0] = scmdbuf ;
      GXv_Object26[1] = GXv_int25 ;
      return GXv_Object26 ;
   }

   protected Object[] conditional_P09DR46( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV24TFCliCod ,
                                           int AV25TFCliCod_To ,
                                           String AV27TFCliNom_Sel ,
                                           String AV26TFCliNom ,
                                           String AV17TFBarNHdr_Sel ,
                                           String AV16TFBarNHdr ,
                                           String AV157TFBarAgrEst_Sel ,
                                           String AV156TFBarAgrEst ,
                                           String AV29TFBarSer_Sel ,
                                           String AV28TFBarSer ,
                                           String AV31TFBarSerDsc_Sel ,
                                           String AV30TFBarSerDsc ,
                                           short AV32TFBarTipArt ,
                                           short AV33TFBarTipArt_To ,
                                           String AV35TFBarTipArtDsc_Sel ,
                                           String AV34TFBarTipArtDsc ,
                                           String AV37TFBarColNom_Sel ,
                                           String AV36TFBarColNom ,
                                           int AV38TFBarColNum ,
                                           int AV39TFBarColNum_To ,
                                           String AV201TFBarNomCli_Sel ,
                                           String AV200TFBarNomCli ,
                                           byte AV124TFBarSit ,
                                           byte AV125TFBarSit_To ,
                                           java.util.Date AV40TFBarFecGen ,
                                           java.util.Date AV42TFBarFecCli ,
                                           java.util.Date AV144TFBarFecFpr ,
                                           java.util.Date AV46TFBarFecSal ,
                                           String AV325TFBarGirar_Sel ,
                                           String AV324TFBarGirar ,
                                           short AV372TFBarAcaAnh ,
                                           short AV373TFBarAcaAnh_To ,
                                           String AV247TFBarProPer_Sel ,
                                           String AV246TFBarProPer ,
                                           String AV479TFDisUsrCod_Sel ,
                                           String AV478TFDisUsrCod ,
                                           int AV460clicodfrom ,
                                           int AV461clicodto ,
                                           java.util.Date AV464barfecgenfrom ,
                                           java.util.Date AV465barfecgento ,
                                           java.util.Date AV486barfecsalfrom ,
                                           java.util.Date AV487barfecsalto ,
                                           java.util.Date AV482barfecclifrom ,
                                           java.util.Date AV483barfecclito ,
                                           java.util.Date AV484BarFecFprfrom ,
                                           java.util.Date AV485BarFecFprto ,
                                           String AV488barserfrom ,
                                           String AV489barserto ,
                                           String AV492BarColNomfrom ,
                                           String AV493BarColNomto ,
                                           int AV494BarColNumfrom ,
                                           int AV495BarColNumto ,
                                           String AV496BarNomClifrom ,
                                           String AV497BarNomClito ,
                                           int AV498BarNumclifrom ,
                                           int AV499barnumclito ,
                                           short AV490bartipartfrom ,
                                           short AV491bartipartto ,
                                           String AV501muestras ,
                                           int AV502barcodfrom ,
                                           int AV503barcodto ,
                                           byte AV504barcodreofrom ,
                                           byte AV505barcodreoto ,
                                           String AV506barcodparfrom ,
                                           String AV507barcodparto ,
                                           String AV510Cod_idtx ,
                                           String AV513BarGirar ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A120BarAgrEst ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           short A217BarTipArt ,
                                           String A13711BarTipArtD ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           byte A213BarSit ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date A155BarFecCli ,
                                           java.util.Date A158BarFecFpr ,
                                           java.util.Date A161BarFecSal ,
                                           String A2454BarGirar ,
                                           short A4466BarAcaAnh ,
                                           String A2829BarProPer ,
                                           String A4348DisUsrCod ,
                                           int A1235BarNumCli ,
                                           String A3030BarPlf ,
                                           String AV65TFBarFasSig_Sel ,
                                           String AV64TFBarFasSig ,
                                           String A1955BarFasSig ,
                                           long AV468TFBarAlbUltimo ,
                                           long A13930BarAlbUlti ,
                                           long AV469TFBarAlbUltimo_To ,
                                           int AV480TFBarAlbFact ,
                                           int A13935BarAlbFact ,
                                           int AV481TFBarAlbFact_To ,
                                           String AV477TFBarNormas_Sel ,
                                           String AV476TFBarNormas ,
                                           String A13934BarNormas ,
                                           String AV462bardisnumfrom ,
                                           String A13878PedidoClie ,
                                           String AV463bardisnumto ,
                                           byte AV466barsitfrom ,
                                           byte AV467barsitto ,
                                           String AV459Emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int27 = new byte[75];
      Object[] GXv_Object28 = new Object[2];
      scmdbuf = "SELECT T1.BarPlf, T1.BarNumCli, T2.DisUsrCod, T1.BarProPer, T1.BarAcaAnh, T1.BarGirar, T1.BarFecSal, T1.BarFecFpr, T1.BarFecCli, T1.BarFecGen, T1.BarSit, T1.BarNomCli," ;
      scmdbuf += " T1.BarColNum, T1.BarColNom, T3.TipArtDsc AS BarTipArtD, T1.BarTipArt AS BarTipArt, T1.BarSerDsc, T1.BarSer, T1.BarAgrEst, T4.CliNom, T1.CliCod, COALESCE( T5.BarFasSig," ;
      scmdbuf += " ' ') AS BarFasSig, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.DisCod, T1.BarDisNum, T1.BarEncCli, T1.EmprCod FROM ((((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod AND T3.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.CliCod = T1.CliCod) LEFT JOIN (SELECT MIN(T6.FasCod) AS BarFasSig, COALESCE( T7.BarFasLin, 0) AS BarFasLin, T6.EmprCod, T6.BarCod, T6.BarCodReo," ;
      scmdbuf += " T6.BarCodPar FROM ((TXPBARFAS T6 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP" ;
      scmdbuf += " BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T6.EmprCod AND T7.BarCod = T6.BarCod AND T7.BarCodReo = T6.BarCodReo AND T7.BarCodPar = T6.BarCodPar)" ;
      scmdbuf += " INNER JOIN (SELECT MIN(T9.BarOrdLin) AS GXC1, COALESCE( T10.BarFasLin, 0) AS BarFasLin, T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar FROM (TXPBARFAS T9 LEFT" ;
      scmdbuf += " JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T10 ON T10.EmprCod = T9.EmprCod AND T10.BarCod = T9.BarCod AND T10.BarCodReo = T9.BarCodReo AND T10.BarCodPar = T9.BarCodPar) WHERE (T9.BarOrdLin >= 0) AND (T9.BarOrdLin" ;
      scmdbuf += " > COALESCE( T10.BarFasLin, 0)) AND (T9.BarFasEst = 0) GROUP BY T10.BarFasLin, T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar ) T8 ON T8.EmprCod = T6.EmprCod" ;
      scmdbuf += " AND T8.BarCod = T6.BarCod AND T8.BarCodReo = T6.BarCodReo AND T8.BarCodPar = T6.BarCodPar) WHERE (T6.BarOrdLin = T8.GXC1) AND (T6.BarOrdLin >= 0) AND (T6.BarOrdLin" ;
      scmdbuf += " > COALESCE( T7.BarFasLin, 0)) AND (T6.BarFasEst = 0) GROUP BY T7.BarFasLin, T6.EmprCod, T6.BarCod, T6.BarCodReo, T6.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      if ( ! (0==AV24TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int27[8] = (byte)(1) ;
      }
      if ( ! (0==AV25TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int27[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV27TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int27[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int27[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV157TFBarAgrEst_Sel)==0) && ( ! (GXutil.strcmp("", AV156TFBarAgrEst)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV157TFBarAgrEst_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int27[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV29TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV28TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV29TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int27[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV31TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV30TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV31TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int27[19] = (byte)(1) ;
      }
      if ( ! (0==AV32TFBarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int27[20] = (byte)(1) ;
      }
      if ( ! (0==AV33TFBarTipArt_To) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int27[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV35TFBarTipArtDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV34TFBarTipArtDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35TFBarTipArtDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int27[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV37TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV36TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int27[25] = (byte)(1) ;
      }
      if ( ! (0==AV38TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int27[26] = (byte)(1) ;
      }
      if ( ! (0==AV39TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int27[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV201TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV200TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV201TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int27[29] = (byte)(1) ;
      }
      if ( ! (0==AV124TFBarSit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int27[30] = (byte)(1) ;
      }
      if ( ! (0==AV125TFBarSit_To) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int27[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV40TFBarFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int27[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42TFBarFecCli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int27[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV144TFBarFecFpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int27[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV46TFBarFecSal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int27[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV325TFBarGirar_Sel)==0) && ( ! (GXutil.strcmp("", AV324TFBarGirar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarGirar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV325TFBarGirar_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int27[37] = (byte)(1) ;
      }
      if ( ! (0==AV372TFBarAcaAnh) )
      {
         addWhere(sWhereString, "(T1.BarAcaAnh >= ?)");
      }
      else
      {
         GXv_int27[38] = (byte)(1) ;
      }
      if ( ! (0==AV373TFBarAcaAnh_To) )
      {
         addWhere(sWhereString, "(T1.BarAcaAnh <= ?)");
      }
      else
      {
         GXv_int27[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV247TFBarProPer_Sel)==0) && ( ! (GXutil.strcmp("", AV246TFBarProPer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarProPer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV247TFBarProPer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int27[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV479TFDisUsrCod_Sel)==0) && ( ! (GXutil.strcmp("", AV478TFDisUsrCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV479TFDisUsrCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.DisUsrCod = ?)");
      }
      else
      {
         GXv_int27[43] = (byte)(1) ;
      }
      if ( ! (0==AV460clicodfrom) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int27[44] = (byte)(1) ;
      }
      if ( ! (0==AV461clicodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int27[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV464barfecgenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int27[46] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV465barfecgento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int27[47] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV486barfecsalfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int27[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV487barfecsalto)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int27[49] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV482barfecclifrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int27[50] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV483barfecclito)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli <= ?)");
      }
      else
      {
         GXv_int27[51] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV484BarFecFprfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int27[52] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV485BarFecFprto)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int27[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV488barserfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int27[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV489barserto)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int27[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV492BarColNomfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int27[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV493BarColNomto)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int27[57] = (byte)(1) ;
      }
      if ( ! (0==AV494BarColNumfrom) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int27[58] = (byte)(1) ;
      }
      if ( ! (0==AV495BarColNumto) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int27[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV496BarNomClifrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli >= ?)");
      }
      else
      {
         GXv_int27[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV497BarNomClito)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli <= ?)");
      }
      else
      {
         GXv_int27[61] = (byte)(1) ;
      }
      if ( ! (0==AV498BarNumclifrom) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int27[62] = (byte)(1) ;
      }
      if ( ! (0==AV499barnumclito) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int27[63] = (byte)(1) ;
      }
      if ( ! (0==AV490bartipartfrom) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int27[64] = (byte)(1) ;
      }
      if ( ! (0==AV491bartipartto) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int27[65] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV501muestras)==0) )
      {
         addWhere(sWhereString, "(T1.BarPlf = ?)");
      }
      else
      {
         GXv_int27[66] = (byte)(1) ;
      }
      if ( ! (0==AV502barcodfrom) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int27[67] = (byte)(1) ;
      }
      if ( ! (0==AV503barcodto) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int27[68] = (byte)(1) ;
      }
      if ( ! (0==AV504barcodreofrom) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int27[69] = (byte)(1) ;
      }
      if ( ! (0==AV505barcodreoto) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int27[70] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV506barcodparfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar >= ?)");
      }
      else
      {
         GXv_int27[71] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV507barcodparto)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar <= ?)");
      }
      else
      {
         GXv_int27[72] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV510Cod_idtx)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int27[73] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV513BarGirar)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int27[74] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object28[0] = scmdbuf ;
      GXv_Object28[1] = GXv_int27 ;
      return GXv_Object28 ;
   }

   protected Object[] conditional_P09DR51( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV24TFCliCod ,
                                           int AV25TFCliCod_To ,
                                           String AV27TFCliNom_Sel ,
                                           String AV26TFCliNom ,
                                           String AV17TFBarNHdr_Sel ,
                                           String AV16TFBarNHdr ,
                                           String AV157TFBarAgrEst_Sel ,
                                           String AV156TFBarAgrEst ,
                                           String AV29TFBarSer_Sel ,
                                           String AV28TFBarSer ,
                                           String AV31TFBarSerDsc_Sel ,
                                           String AV30TFBarSerDsc ,
                                           short AV32TFBarTipArt ,
                                           short AV33TFBarTipArt_To ,
                                           String AV35TFBarTipArtDsc_Sel ,
                                           String AV34TFBarTipArtDsc ,
                                           String AV37TFBarColNom_Sel ,
                                           String AV36TFBarColNom ,
                                           int AV38TFBarColNum ,
                                           int AV39TFBarColNum_To ,
                                           String AV201TFBarNomCli_Sel ,
                                           String AV200TFBarNomCli ,
                                           byte AV124TFBarSit ,
                                           byte AV125TFBarSit_To ,
                                           java.util.Date AV40TFBarFecGen ,
                                           java.util.Date AV42TFBarFecCli ,
                                           java.util.Date AV144TFBarFecFpr ,
                                           java.util.Date AV46TFBarFecSal ,
                                           String AV325TFBarGirar_Sel ,
                                           String AV324TFBarGirar ,
                                           short AV372TFBarAcaAnh ,
                                           short AV373TFBarAcaAnh_To ,
                                           String AV247TFBarProPer_Sel ,
                                           String AV246TFBarProPer ,
                                           String AV479TFDisUsrCod_Sel ,
                                           String AV478TFDisUsrCod ,
                                           int AV460clicodfrom ,
                                           int AV461clicodto ,
                                           java.util.Date AV464barfecgenfrom ,
                                           java.util.Date AV465barfecgento ,
                                           java.util.Date AV486barfecsalfrom ,
                                           java.util.Date AV487barfecsalto ,
                                           java.util.Date AV482barfecclifrom ,
                                           java.util.Date AV483barfecclito ,
                                           java.util.Date AV484BarFecFprfrom ,
                                           java.util.Date AV485BarFecFprto ,
                                           String AV488barserfrom ,
                                           String AV489barserto ,
                                           String AV492BarColNomfrom ,
                                           String AV493BarColNomto ,
                                           int AV494BarColNumfrom ,
                                           int AV495BarColNumto ,
                                           String AV496BarNomClifrom ,
                                           String AV497BarNomClito ,
                                           int AV498BarNumclifrom ,
                                           int AV499barnumclito ,
                                           short AV490bartipartfrom ,
                                           short AV491bartipartto ,
                                           String AV501muestras ,
                                           int AV502barcodfrom ,
                                           int AV503barcodto ,
                                           byte AV504barcodreofrom ,
                                           byte AV505barcodreoto ,
                                           String AV506barcodparfrom ,
                                           String AV507barcodparto ,
                                           String AV510Cod_idtx ,
                                           String AV513BarGirar ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A120BarAgrEst ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           short A217BarTipArt ,
                                           String A13711BarTipArtD ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           byte A213BarSit ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date A155BarFecCli ,
                                           java.util.Date A158BarFecFpr ,
                                           java.util.Date A161BarFecSal ,
                                           String A2454BarGirar ,
                                           short A4466BarAcaAnh ,
                                           String A2829BarProPer ,
                                           String A4348DisUsrCod ,
                                           int A1235BarNumCli ,
                                           String A3030BarPlf ,
                                           String AV65TFBarFasSig_Sel ,
                                           String AV64TFBarFasSig ,
                                           String A1955BarFasSig ,
                                           long AV468TFBarAlbUltimo ,
                                           long A13930BarAlbUlti ,
                                           long AV469TFBarAlbUltimo_To ,
                                           int AV480TFBarAlbFact ,
                                           int A13935BarAlbFact ,
                                           int AV481TFBarAlbFact_To ,
                                           String AV477TFBarNormas_Sel ,
                                           String AV476TFBarNormas ,
                                           String A13934BarNormas ,
                                           String AV462bardisnumfrom ,
                                           String A13878PedidoClie ,
                                           String AV463bardisnumto ,
                                           byte AV466barsitfrom ,
                                           byte AV467barsitto ,
                                           String A396EmprCod ,
                                           String AV459Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int29 = new byte[75];
      Object[] GXv_Object30 = new Object[2];
      scmdbuf = "SELECT T1.BarGirar, T1.BarPlf, T1.BarNumCli, T2.DisUsrCod, T1.BarProPer, T1.BarAcaAnh, T1.BarFecSal, T1.BarFecFpr, T1.BarFecCli, T1.BarFecGen, T1.BarSit, T1.BarNomCli," ;
      scmdbuf += " T1.BarColNum, T1.BarColNom, T3.TipArtDsc AS BarTipArtD, T1.BarTipArt AS BarTipArt, T1.BarSerDsc, T1.BarSer, T1.BarAgrEst, T4.CliNom, T1.CliCod, COALESCE( T5.BarFasSig," ;
      scmdbuf += " ' ') AS BarFasSig, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.DisCod, T1.BarDisNum, T1.BarEncCli, T1.EmprCod FROM ((((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod AND T3.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.CliCod = T1.CliCod) LEFT JOIN (SELECT MIN(T6.FasCod) AS BarFasSig, COALESCE( T7.BarFasLin, 0) AS BarFasLin, T6.EmprCod, T6.BarCod, T6.BarCodReo," ;
      scmdbuf += " T6.BarCodPar FROM ((TXPBARFAS T6 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP" ;
      scmdbuf += " BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T6.EmprCod AND T7.BarCod = T6.BarCod AND T7.BarCodReo = T6.BarCodReo AND T7.BarCodPar = T6.BarCodPar)" ;
      scmdbuf += " INNER JOIN (SELECT MIN(T9.BarOrdLin) AS GXC1, COALESCE( T10.BarFasLin, 0) AS BarFasLin, T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar FROM (TXPBARFAS T9 LEFT" ;
      scmdbuf += " JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T10 ON T10.EmprCod = T9.EmprCod AND T10.BarCod = T9.BarCod AND T10.BarCodReo = T9.BarCodReo AND T10.BarCodPar = T9.BarCodPar) WHERE (T9.BarOrdLin >= 0) AND (T9.BarOrdLin" ;
      scmdbuf += " > COALESCE( T10.BarFasLin, 0)) AND (T9.BarFasEst = 0) GROUP BY T10.BarFasLin, T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar ) T8 ON T8.EmprCod = T6.EmprCod" ;
      scmdbuf += " AND T8.BarCod = T6.BarCod AND T8.BarCodReo = T6.BarCodReo AND T8.BarCodPar = T6.BarCodPar) WHERE (T6.BarOrdLin = T8.GXC1) AND (T6.BarOrdLin >= 0) AND (T6.BarOrdLin" ;
      scmdbuf += " > COALESCE( T7.BarFasLin, 0)) AND (T6.BarFasEst = 0) GROUP BY T7.BarFasLin, T6.EmprCod, T6.BarCod, T6.BarCodReo, T6.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV24TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int29[8] = (byte)(1) ;
      }
      if ( ! (0==AV25TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int29[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV27TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int29[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int29[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV157TFBarAgrEst_Sel)==0) && ( ! (GXutil.strcmp("", AV156TFBarAgrEst)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV157TFBarAgrEst_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int29[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV29TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV28TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV29TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int29[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV31TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV30TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV31TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int29[19] = (byte)(1) ;
      }
      if ( ! (0==AV32TFBarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int29[20] = (byte)(1) ;
      }
      if ( ! (0==AV33TFBarTipArt_To) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int29[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV35TFBarTipArtDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV34TFBarTipArtDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35TFBarTipArtDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int29[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV37TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV36TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int29[25] = (byte)(1) ;
      }
      if ( ! (0==AV38TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int29[26] = (byte)(1) ;
      }
      if ( ! (0==AV39TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int29[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV201TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV200TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV201TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int29[29] = (byte)(1) ;
      }
      if ( ! (0==AV124TFBarSit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int29[30] = (byte)(1) ;
      }
      if ( ! (0==AV125TFBarSit_To) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int29[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV40TFBarFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int29[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42TFBarFecCli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int29[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV144TFBarFecFpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int29[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV46TFBarFecSal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int29[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV325TFBarGirar_Sel)==0) && ( ! (GXutil.strcmp("", AV324TFBarGirar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarGirar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV325TFBarGirar_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int29[37] = (byte)(1) ;
      }
      if ( ! (0==AV372TFBarAcaAnh) )
      {
         addWhere(sWhereString, "(T1.BarAcaAnh >= ?)");
      }
      else
      {
         GXv_int29[38] = (byte)(1) ;
      }
      if ( ! (0==AV373TFBarAcaAnh_To) )
      {
         addWhere(sWhereString, "(T1.BarAcaAnh <= ?)");
      }
      else
      {
         GXv_int29[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV247TFBarProPer_Sel)==0) && ( ! (GXutil.strcmp("", AV246TFBarProPer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarProPer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV247TFBarProPer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int29[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV479TFDisUsrCod_Sel)==0) && ( ! (GXutil.strcmp("", AV478TFDisUsrCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV479TFDisUsrCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.DisUsrCod = ?)");
      }
      else
      {
         GXv_int29[43] = (byte)(1) ;
      }
      if ( ! (0==AV460clicodfrom) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int29[44] = (byte)(1) ;
      }
      if ( ! (0==AV461clicodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int29[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV464barfecgenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int29[46] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV465barfecgento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int29[47] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV486barfecsalfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int29[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV487barfecsalto)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int29[49] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV482barfecclifrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int29[50] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV483barfecclito)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli <= ?)");
      }
      else
      {
         GXv_int29[51] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV484BarFecFprfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int29[52] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV485BarFecFprto)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int29[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV488barserfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int29[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV489barserto)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int29[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV492BarColNomfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int29[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV493BarColNomto)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int29[57] = (byte)(1) ;
      }
      if ( ! (0==AV494BarColNumfrom) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int29[58] = (byte)(1) ;
      }
      if ( ! (0==AV495BarColNumto) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int29[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV496BarNomClifrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli >= ?)");
      }
      else
      {
         GXv_int29[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV497BarNomClito)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli <= ?)");
      }
      else
      {
         GXv_int29[61] = (byte)(1) ;
      }
      if ( ! (0==AV498BarNumclifrom) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int29[62] = (byte)(1) ;
      }
      if ( ! (0==AV499barnumclito) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int29[63] = (byte)(1) ;
      }
      if ( ! (0==AV490bartipartfrom) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int29[64] = (byte)(1) ;
      }
      if ( ! (0==AV491bartipartto) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int29[65] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV501muestras)==0) )
      {
         addWhere(sWhereString, "(T1.BarPlf = ?)");
      }
      else
      {
         GXv_int29[66] = (byte)(1) ;
      }
      if ( ! (0==AV502barcodfrom) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int29[67] = (byte)(1) ;
      }
      if ( ! (0==AV503barcodto) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int29[68] = (byte)(1) ;
      }
      if ( ! (0==AV504barcodreofrom) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int29[69] = (byte)(1) ;
      }
      if ( ! (0==AV505barcodreoto) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int29[70] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV506barcodparfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar >= ?)");
      }
      else
      {
         GXv_int29[71] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV507barcodparto)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar <= ?)");
      }
      else
      {
         GXv_int29[72] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV510Cod_idtx)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int29[73] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV513BarGirar)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int29[74] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarGirar" ;
      GXv_Object30[0] = scmdbuf ;
      GXv_Object30[1] = GXv_int29 ;
      return GXv_Object30 ;
   }

   protected Object[] conditional_P09DR56( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV24TFCliCod ,
                                           int AV25TFCliCod_To ,
                                           String AV27TFCliNom_Sel ,
                                           String AV26TFCliNom ,
                                           String AV17TFBarNHdr_Sel ,
                                           String AV16TFBarNHdr ,
                                           String AV157TFBarAgrEst_Sel ,
                                           String AV156TFBarAgrEst ,
                                           String AV29TFBarSer_Sel ,
                                           String AV28TFBarSer ,
                                           String AV31TFBarSerDsc_Sel ,
                                           String AV30TFBarSerDsc ,
                                           short AV32TFBarTipArt ,
                                           short AV33TFBarTipArt_To ,
                                           String AV35TFBarTipArtDsc_Sel ,
                                           String AV34TFBarTipArtDsc ,
                                           String AV37TFBarColNom_Sel ,
                                           String AV36TFBarColNom ,
                                           int AV38TFBarColNum ,
                                           int AV39TFBarColNum_To ,
                                           String AV201TFBarNomCli_Sel ,
                                           String AV200TFBarNomCli ,
                                           byte AV124TFBarSit ,
                                           byte AV125TFBarSit_To ,
                                           java.util.Date AV40TFBarFecGen ,
                                           java.util.Date AV42TFBarFecCli ,
                                           java.util.Date AV144TFBarFecFpr ,
                                           java.util.Date AV46TFBarFecSal ,
                                           String AV325TFBarGirar_Sel ,
                                           String AV324TFBarGirar ,
                                           short AV372TFBarAcaAnh ,
                                           short AV373TFBarAcaAnh_To ,
                                           String AV247TFBarProPer_Sel ,
                                           String AV246TFBarProPer ,
                                           String AV479TFDisUsrCod_Sel ,
                                           String AV478TFDisUsrCod ,
                                           int AV460clicodfrom ,
                                           int AV461clicodto ,
                                           java.util.Date AV464barfecgenfrom ,
                                           java.util.Date AV465barfecgento ,
                                           java.util.Date AV486barfecsalfrom ,
                                           java.util.Date AV487barfecsalto ,
                                           java.util.Date AV482barfecclifrom ,
                                           java.util.Date AV483barfecclito ,
                                           java.util.Date AV484BarFecFprfrom ,
                                           java.util.Date AV485BarFecFprto ,
                                           String AV488barserfrom ,
                                           String AV489barserto ,
                                           String AV492BarColNomfrom ,
                                           String AV493BarColNomto ,
                                           int AV494BarColNumfrom ,
                                           int AV495BarColNumto ,
                                           String AV496BarNomClifrom ,
                                           String AV497BarNomClito ,
                                           int AV498BarNumclifrom ,
                                           int AV499barnumclito ,
                                           short AV490bartipartfrom ,
                                           short AV491bartipartto ,
                                           String AV501muestras ,
                                           int AV502barcodfrom ,
                                           int AV503barcodto ,
                                           byte AV504barcodreofrom ,
                                           byte AV505barcodreoto ,
                                           String AV506barcodparfrom ,
                                           String AV507barcodparto ,
                                           String AV510Cod_idtx ,
                                           String AV513BarGirar ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A120BarAgrEst ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           short A217BarTipArt ,
                                           String A13711BarTipArtD ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           byte A213BarSit ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date A155BarFecCli ,
                                           java.util.Date A158BarFecFpr ,
                                           java.util.Date A161BarFecSal ,
                                           String A2454BarGirar ,
                                           short A4466BarAcaAnh ,
                                           String A2829BarProPer ,
                                           String A4348DisUsrCod ,
                                           int A1235BarNumCli ,
                                           String A3030BarPlf ,
                                           String AV65TFBarFasSig_Sel ,
                                           String AV64TFBarFasSig ,
                                           String A1955BarFasSig ,
                                           long AV468TFBarAlbUltimo ,
                                           long A13930BarAlbUlti ,
                                           long AV469TFBarAlbUltimo_To ,
                                           int AV480TFBarAlbFact ,
                                           int A13935BarAlbFact ,
                                           int AV481TFBarAlbFact_To ,
                                           String AV477TFBarNormas_Sel ,
                                           String AV476TFBarNormas ,
                                           String A13934BarNormas ,
                                           String AV462bardisnumfrom ,
                                           String A13878PedidoClie ,
                                           String AV463bardisnumto ,
                                           byte AV466barsitfrom ,
                                           byte AV467barsitto ,
                                           String A396EmprCod ,
                                           String AV459Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int31 = new byte[75];
      Object[] GXv_Object32 = new Object[2];
      scmdbuf = "SELECT T1.BarProPer, T1.BarPlf, T1.BarNumCli, T2.DisUsrCod, T1.BarAcaAnh, T1.BarGirar, T1.BarFecSal, T1.BarFecFpr, T1.BarFecCli, T1.BarFecGen, T1.BarSit, T1.BarNomCli," ;
      scmdbuf += " T1.BarColNum, T1.BarColNom, T3.TipArtDsc AS BarTipArtD, T1.BarTipArt AS BarTipArt, T1.BarSerDsc, T1.BarSer, T1.BarAgrEst, T4.CliNom, T1.CliCod, COALESCE( T5.BarFasSig," ;
      scmdbuf += " ' ') AS BarFasSig, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.DisCod, T1.BarDisNum, T1.BarEncCli, T1.EmprCod FROM ((((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod AND T3.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.CliCod = T1.CliCod) LEFT JOIN (SELECT MIN(T6.FasCod) AS BarFasSig, COALESCE( T7.BarFasLin, 0) AS BarFasLin, T6.EmprCod, T6.BarCod, T6.BarCodReo," ;
      scmdbuf += " T6.BarCodPar FROM ((TXPBARFAS T6 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP" ;
      scmdbuf += " BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T6.EmprCod AND T7.BarCod = T6.BarCod AND T7.BarCodReo = T6.BarCodReo AND T7.BarCodPar = T6.BarCodPar)" ;
      scmdbuf += " INNER JOIN (SELECT MIN(T9.BarOrdLin) AS GXC1, COALESCE( T10.BarFasLin, 0) AS BarFasLin, T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar FROM (TXPBARFAS T9 LEFT" ;
      scmdbuf += " JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T10 ON T10.EmprCod = T9.EmprCod AND T10.BarCod = T9.BarCod AND T10.BarCodReo = T9.BarCodReo AND T10.BarCodPar = T9.BarCodPar) WHERE (T9.BarOrdLin >= 0) AND (T9.BarOrdLin" ;
      scmdbuf += " > COALESCE( T10.BarFasLin, 0)) AND (T9.BarFasEst = 0) GROUP BY T10.BarFasLin, T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar ) T8 ON T8.EmprCod = T6.EmprCod" ;
      scmdbuf += " AND T8.BarCod = T6.BarCod AND T8.BarCodReo = T6.BarCodReo AND T8.BarCodPar = T6.BarCodPar) WHERE (T6.BarOrdLin = T8.GXC1) AND (T6.BarOrdLin >= 0) AND (T6.BarOrdLin" ;
      scmdbuf += " > COALESCE( T7.BarFasLin, 0)) AND (T6.BarFasEst = 0) GROUP BY T7.BarFasLin, T6.EmprCod, T6.BarCod, T6.BarCodReo, T6.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV24TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int31[8] = (byte)(1) ;
      }
      if ( ! (0==AV25TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int31[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV27TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int31[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int31[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV157TFBarAgrEst_Sel)==0) && ( ! (GXutil.strcmp("", AV156TFBarAgrEst)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV157TFBarAgrEst_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int31[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV29TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV28TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV29TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int31[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV31TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV30TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV31TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int31[19] = (byte)(1) ;
      }
      if ( ! (0==AV32TFBarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int31[20] = (byte)(1) ;
      }
      if ( ! (0==AV33TFBarTipArt_To) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int31[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV35TFBarTipArtDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV34TFBarTipArtDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35TFBarTipArtDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int31[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV37TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV36TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int31[25] = (byte)(1) ;
      }
      if ( ! (0==AV38TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int31[26] = (byte)(1) ;
      }
      if ( ! (0==AV39TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int31[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV201TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV200TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV201TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int31[29] = (byte)(1) ;
      }
      if ( ! (0==AV124TFBarSit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int31[30] = (byte)(1) ;
      }
      if ( ! (0==AV125TFBarSit_To) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int31[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV40TFBarFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int31[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42TFBarFecCli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int31[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV144TFBarFecFpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int31[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV46TFBarFecSal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int31[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV325TFBarGirar_Sel)==0) && ( ! (GXutil.strcmp("", AV324TFBarGirar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarGirar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV325TFBarGirar_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int31[37] = (byte)(1) ;
      }
      if ( ! (0==AV372TFBarAcaAnh) )
      {
         addWhere(sWhereString, "(T1.BarAcaAnh >= ?)");
      }
      else
      {
         GXv_int31[38] = (byte)(1) ;
      }
      if ( ! (0==AV373TFBarAcaAnh_To) )
      {
         addWhere(sWhereString, "(T1.BarAcaAnh <= ?)");
      }
      else
      {
         GXv_int31[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV247TFBarProPer_Sel)==0) && ( ! (GXutil.strcmp("", AV246TFBarProPer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarProPer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV247TFBarProPer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int31[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV479TFDisUsrCod_Sel)==0) && ( ! (GXutil.strcmp("", AV478TFDisUsrCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV479TFDisUsrCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.DisUsrCod = ?)");
      }
      else
      {
         GXv_int31[43] = (byte)(1) ;
      }
      if ( ! (0==AV460clicodfrom) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int31[44] = (byte)(1) ;
      }
      if ( ! (0==AV461clicodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int31[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV464barfecgenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int31[46] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV465barfecgento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int31[47] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV486barfecsalfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int31[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV487barfecsalto)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int31[49] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV482barfecclifrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int31[50] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV483barfecclito)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli <= ?)");
      }
      else
      {
         GXv_int31[51] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV484BarFecFprfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int31[52] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV485BarFecFprto)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int31[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV488barserfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int31[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV489barserto)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int31[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV492BarColNomfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int31[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV493BarColNomto)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int31[57] = (byte)(1) ;
      }
      if ( ! (0==AV494BarColNumfrom) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int31[58] = (byte)(1) ;
      }
      if ( ! (0==AV495BarColNumto) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int31[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV496BarNomClifrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli >= ?)");
      }
      else
      {
         GXv_int31[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV497BarNomClito)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli <= ?)");
      }
      else
      {
         GXv_int31[61] = (byte)(1) ;
      }
      if ( ! (0==AV498BarNumclifrom) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int31[62] = (byte)(1) ;
      }
      if ( ! (0==AV499barnumclito) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int31[63] = (byte)(1) ;
      }
      if ( ! (0==AV490bartipartfrom) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int31[64] = (byte)(1) ;
      }
      if ( ! (0==AV491bartipartto) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int31[65] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV501muestras)==0) )
      {
         addWhere(sWhereString, "(T1.BarPlf = ?)");
      }
      else
      {
         GXv_int31[66] = (byte)(1) ;
      }
      if ( ! (0==AV502barcodfrom) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int31[67] = (byte)(1) ;
      }
      if ( ! (0==AV503barcodto) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int31[68] = (byte)(1) ;
      }
      if ( ! (0==AV504barcodreofrom) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int31[69] = (byte)(1) ;
      }
      if ( ! (0==AV505barcodreoto) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int31[70] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV506barcodparfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar >= ?)");
      }
      else
      {
         GXv_int31[71] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV507barcodparto)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar <= ?)");
      }
      else
      {
         GXv_int31[72] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV510Cod_idtx)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int31[73] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV513BarGirar)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int31[74] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarProPer" ;
      GXv_Object32[0] = scmdbuf ;
      GXv_Object32[1] = GXv_int31 ;
      return GXv_Object32 ;
   }

   protected Object[] conditional_P09DR61( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV24TFCliCod ,
                                           int AV25TFCliCod_To ,
                                           String AV27TFCliNom_Sel ,
                                           String AV26TFCliNom ,
                                           String AV17TFBarNHdr_Sel ,
                                           String AV16TFBarNHdr ,
                                           String AV157TFBarAgrEst_Sel ,
                                           String AV156TFBarAgrEst ,
                                           String AV29TFBarSer_Sel ,
                                           String AV28TFBarSer ,
                                           String AV31TFBarSerDsc_Sel ,
                                           String AV30TFBarSerDsc ,
                                           short AV32TFBarTipArt ,
                                           short AV33TFBarTipArt_To ,
                                           String AV35TFBarTipArtDsc_Sel ,
                                           String AV34TFBarTipArtDsc ,
                                           String AV37TFBarColNom_Sel ,
                                           String AV36TFBarColNom ,
                                           int AV38TFBarColNum ,
                                           int AV39TFBarColNum_To ,
                                           String AV201TFBarNomCli_Sel ,
                                           String AV200TFBarNomCli ,
                                           byte AV124TFBarSit ,
                                           byte AV125TFBarSit_To ,
                                           java.util.Date AV40TFBarFecGen ,
                                           java.util.Date AV42TFBarFecCli ,
                                           java.util.Date AV144TFBarFecFpr ,
                                           java.util.Date AV46TFBarFecSal ,
                                           String AV325TFBarGirar_Sel ,
                                           String AV324TFBarGirar ,
                                           short AV372TFBarAcaAnh ,
                                           short AV373TFBarAcaAnh_To ,
                                           String AV247TFBarProPer_Sel ,
                                           String AV246TFBarProPer ,
                                           String AV479TFDisUsrCod_Sel ,
                                           String AV478TFDisUsrCod ,
                                           int AV460clicodfrom ,
                                           int AV461clicodto ,
                                           java.util.Date AV464barfecgenfrom ,
                                           java.util.Date AV465barfecgento ,
                                           java.util.Date AV486barfecsalfrom ,
                                           java.util.Date AV487barfecsalto ,
                                           java.util.Date AV482barfecclifrom ,
                                           java.util.Date AV483barfecclito ,
                                           java.util.Date AV484BarFecFprfrom ,
                                           java.util.Date AV485BarFecFprto ,
                                           String AV488barserfrom ,
                                           String AV489barserto ,
                                           String AV492BarColNomfrom ,
                                           String AV493BarColNomto ,
                                           int AV494BarColNumfrom ,
                                           int AV495BarColNumto ,
                                           String AV496BarNomClifrom ,
                                           String AV497BarNomClito ,
                                           int AV498BarNumclifrom ,
                                           int AV499barnumclito ,
                                           short AV490bartipartfrom ,
                                           short AV491bartipartto ,
                                           String AV501muestras ,
                                           int AV502barcodfrom ,
                                           int AV503barcodto ,
                                           byte AV504barcodreofrom ,
                                           byte AV505barcodreoto ,
                                           String AV506barcodparfrom ,
                                           String AV507barcodparto ,
                                           String AV510Cod_idtx ,
                                           String AV513BarGirar ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A120BarAgrEst ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           short A217BarTipArt ,
                                           String A13711BarTipArtD ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           byte A213BarSit ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date A155BarFecCli ,
                                           java.util.Date A158BarFecFpr ,
                                           java.util.Date A161BarFecSal ,
                                           String A2454BarGirar ,
                                           short A4466BarAcaAnh ,
                                           String A2829BarProPer ,
                                           String A4348DisUsrCod ,
                                           int A1235BarNumCli ,
                                           String A3030BarPlf ,
                                           String AV65TFBarFasSig_Sel ,
                                           String AV64TFBarFasSig ,
                                           String A1955BarFasSig ,
                                           long AV468TFBarAlbUltimo ,
                                           long A13930BarAlbUlti ,
                                           long AV469TFBarAlbUltimo_To ,
                                           int AV480TFBarAlbFact ,
                                           int A13935BarAlbFact ,
                                           int AV481TFBarAlbFact_To ,
                                           String AV477TFBarNormas_Sel ,
                                           String AV476TFBarNormas ,
                                           String A13934BarNormas ,
                                           String AV462bardisnumfrom ,
                                           String A13878PedidoClie ,
                                           String AV463bardisnumto ,
                                           byte AV466barsitfrom ,
                                           byte AV467barsitto ,
                                           String AV459Emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int33 = new byte[75];
      Object[] GXv_Object34 = new Object[2];
      scmdbuf = "SELECT T1.BarPlf, T1.BarNumCli, T2.DisUsrCod, T1.BarProPer, T1.BarAcaAnh, T1.BarGirar, T1.BarFecSal, T1.BarFecFpr, T1.BarFecCli, T1.BarFecGen, T1.BarSit, T1.BarNomCli," ;
      scmdbuf += " T1.BarColNum, T1.BarColNom, T3.TipArtDsc AS BarTipArtD, T1.BarTipArt AS BarTipArt, T1.BarSerDsc, T1.BarSer, T1.BarAgrEst, T4.CliNom, T1.CliCod, COALESCE( T5.BarFasSig," ;
      scmdbuf += " ' ') AS BarFasSig, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.DisCod, T1.BarDisNum, T1.BarEncCli, T1.EmprCod FROM ((((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod AND T3.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.CliCod = T1.CliCod) LEFT JOIN (SELECT MIN(T6.FasCod) AS BarFasSig, COALESCE( T7.BarFasLin, 0) AS BarFasLin, T6.EmprCod, T6.BarCod, T6.BarCodReo," ;
      scmdbuf += " T6.BarCodPar FROM ((TXPBARFAS T6 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP" ;
      scmdbuf += " BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T6.EmprCod AND T7.BarCod = T6.BarCod AND T7.BarCodReo = T6.BarCodReo AND T7.BarCodPar = T6.BarCodPar)" ;
      scmdbuf += " INNER JOIN (SELECT MIN(T9.BarOrdLin) AS GXC1, COALESCE( T10.BarFasLin, 0) AS BarFasLin, T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar FROM (TXPBARFAS T9 LEFT" ;
      scmdbuf += " JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T10 ON T10.EmprCod = T9.EmprCod AND T10.BarCod = T9.BarCod AND T10.BarCodReo = T9.BarCodReo AND T10.BarCodPar = T9.BarCodPar) WHERE (T9.BarOrdLin >= 0) AND (T9.BarOrdLin" ;
      scmdbuf += " > COALESCE( T10.BarFasLin, 0)) AND (T9.BarFasEst = 0) GROUP BY T10.BarFasLin, T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar ) T8 ON T8.EmprCod = T6.EmprCod" ;
      scmdbuf += " AND T8.BarCod = T6.BarCod AND T8.BarCodReo = T6.BarCodReo AND T8.BarCodPar = T6.BarCodPar) WHERE (T6.BarOrdLin = T8.GXC1) AND (T6.BarOrdLin >= 0) AND (T6.BarOrdLin" ;
      scmdbuf += " > COALESCE( T7.BarFasLin, 0)) AND (T6.BarFasEst = 0) GROUP BY T7.BarFasLin, T6.EmprCod, T6.BarCod, T6.BarCodReo, T6.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      if ( ! (0==AV24TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int33[8] = (byte)(1) ;
      }
      if ( ! (0==AV25TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int33[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV27TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int33[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int33[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV157TFBarAgrEst_Sel)==0) && ( ! (GXutil.strcmp("", AV156TFBarAgrEst)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV157TFBarAgrEst_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int33[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV29TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV28TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV29TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int33[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV31TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV30TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV31TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int33[19] = (byte)(1) ;
      }
      if ( ! (0==AV32TFBarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int33[20] = (byte)(1) ;
      }
      if ( ! (0==AV33TFBarTipArt_To) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int33[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV35TFBarTipArtDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV34TFBarTipArtDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35TFBarTipArtDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int33[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV37TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV36TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int33[25] = (byte)(1) ;
      }
      if ( ! (0==AV38TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int33[26] = (byte)(1) ;
      }
      if ( ! (0==AV39TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int33[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV201TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV200TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV201TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int33[29] = (byte)(1) ;
      }
      if ( ! (0==AV124TFBarSit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int33[30] = (byte)(1) ;
      }
      if ( ! (0==AV125TFBarSit_To) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int33[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV40TFBarFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int33[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42TFBarFecCli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int33[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV144TFBarFecFpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int33[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV46TFBarFecSal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int33[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV325TFBarGirar_Sel)==0) && ( ! (GXutil.strcmp("", AV324TFBarGirar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarGirar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV325TFBarGirar_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int33[37] = (byte)(1) ;
      }
      if ( ! (0==AV372TFBarAcaAnh) )
      {
         addWhere(sWhereString, "(T1.BarAcaAnh >= ?)");
      }
      else
      {
         GXv_int33[38] = (byte)(1) ;
      }
      if ( ! (0==AV373TFBarAcaAnh_To) )
      {
         addWhere(sWhereString, "(T1.BarAcaAnh <= ?)");
      }
      else
      {
         GXv_int33[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV247TFBarProPer_Sel)==0) && ( ! (GXutil.strcmp("", AV246TFBarProPer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarProPer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV247TFBarProPer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int33[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV479TFDisUsrCod_Sel)==0) && ( ! (GXutil.strcmp("", AV478TFDisUsrCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV479TFDisUsrCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.DisUsrCod = ?)");
      }
      else
      {
         GXv_int33[43] = (byte)(1) ;
      }
      if ( ! (0==AV460clicodfrom) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int33[44] = (byte)(1) ;
      }
      if ( ! (0==AV461clicodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int33[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV464barfecgenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int33[46] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV465barfecgento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int33[47] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV486barfecsalfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int33[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV487barfecsalto)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int33[49] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV482barfecclifrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int33[50] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV483barfecclito)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli <= ?)");
      }
      else
      {
         GXv_int33[51] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV484BarFecFprfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int33[52] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV485BarFecFprto)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int33[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV488barserfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int33[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV489barserto)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int33[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV492BarColNomfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int33[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV493BarColNomto)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int33[57] = (byte)(1) ;
      }
      if ( ! (0==AV494BarColNumfrom) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int33[58] = (byte)(1) ;
      }
      if ( ! (0==AV495BarColNumto) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int33[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV496BarNomClifrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli >= ?)");
      }
      else
      {
         GXv_int33[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV497BarNomClito)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli <= ?)");
      }
      else
      {
         GXv_int33[61] = (byte)(1) ;
      }
      if ( ! (0==AV498BarNumclifrom) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int33[62] = (byte)(1) ;
      }
      if ( ! (0==AV499barnumclito) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int33[63] = (byte)(1) ;
      }
      if ( ! (0==AV490bartipartfrom) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int33[64] = (byte)(1) ;
      }
      if ( ! (0==AV491bartipartto) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int33[65] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV501muestras)==0) )
      {
         addWhere(sWhereString, "(T1.BarPlf = ?)");
      }
      else
      {
         GXv_int33[66] = (byte)(1) ;
      }
      if ( ! (0==AV502barcodfrom) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int33[67] = (byte)(1) ;
      }
      if ( ! (0==AV503barcodto) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int33[68] = (byte)(1) ;
      }
      if ( ! (0==AV504barcodreofrom) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int33[69] = (byte)(1) ;
      }
      if ( ! (0==AV505barcodreoto) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int33[70] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV506barcodparfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar >= ?)");
      }
      else
      {
         GXv_int33[71] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV507barcodparto)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar <= ?)");
      }
      else
      {
         GXv_int33[72] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV510Cod_idtx)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int33[73] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV513BarGirar)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int33[74] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object34[0] = scmdbuf ;
      GXv_Object34[1] = GXv_int33 ;
      return GXv_Object34 ;
   }

   protected Object[] conditional_P09DR66( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV24TFCliCod ,
                                           int AV25TFCliCod_To ,
                                           String AV27TFCliNom_Sel ,
                                           String AV26TFCliNom ,
                                           String AV17TFBarNHdr_Sel ,
                                           String AV16TFBarNHdr ,
                                           String AV157TFBarAgrEst_Sel ,
                                           String AV156TFBarAgrEst ,
                                           String AV29TFBarSer_Sel ,
                                           String AV28TFBarSer ,
                                           String AV31TFBarSerDsc_Sel ,
                                           String AV30TFBarSerDsc ,
                                           short AV32TFBarTipArt ,
                                           short AV33TFBarTipArt_To ,
                                           String AV35TFBarTipArtDsc_Sel ,
                                           String AV34TFBarTipArtDsc ,
                                           String AV37TFBarColNom_Sel ,
                                           String AV36TFBarColNom ,
                                           int AV38TFBarColNum ,
                                           int AV39TFBarColNum_To ,
                                           String AV201TFBarNomCli_Sel ,
                                           String AV200TFBarNomCli ,
                                           byte AV124TFBarSit ,
                                           byte AV125TFBarSit_To ,
                                           java.util.Date AV40TFBarFecGen ,
                                           java.util.Date AV42TFBarFecCli ,
                                           java.util.Date AV144TFBarFecFpr ,
                                           java.util.Date AV46TFBarFecSal ,
                                           String AV325TFBarGirar_Sel ,
                                           String AV324TFBarGirar ,
                                           short AV372TFBarAcaAnh ,
                                           short AV373TFBarAcaAnh_To ,
                                           String AV247TFBarProPer_Sel ,
                                           String AV246TFBarProPer ,
                                           String AV479TFDisUsrCod_Sel ,
                                           String AV478TFDisUsrCod ,
                                           int AV460clicodfrom ,
                                           int AV461clicodto ,
                                           java.util.Date AV464barfecgenfrom ,
                                           java.util.Date AV465barfecgento ,
                                           java.util.Date AV486barfecsalfrom ,
                                           java.util.Date AV487barfecsalto ,
                                           java.util.Date AV482barfecclifrom ,
                                           java.util.Date AV483barfecclito ,
                                           java.util.Date AV484BarFecFprfrom ,
                                           java.util.Date AV485BarFecFprto ,
                                           String AV488barserfrom ,
                                           String AV489barserto ,
                                           String AV492BarColNomfrom ,
                                           String AV493BarColNomto ,
                                           int AV494BarColNumfrom ,
                                           int AV495BarColNumto ,
                                           String AV496BarNomClifrom ,
                                           String AV497BarNomClito ,
                                           int AV498BarNumclifrom ,
                                           int AV499barnumclito ,
                                           short AV490bartipartfrom ,
                                           short AV491bartipartto ,
                                           String AV501muestras ,
                                           int AV502barcodfrom ,
                                           int AV503barcodto ,
                                           byte AV504barcodreofrom ,
                                           byte AV505barcodreoto ,
                                           String AV506barcodparfrom ,
                                           String AV507barcodparto ,
                                           String AV510Cod_idtx ,
                                           String AV513BarGirar ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A120BarAgrEst ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           short A217BarTipArt ,
                                           String A13711BarTipArtD ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           byte A213BarSit ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date A155BarFecCli ,
                                           java.util.Date A158BarFecFpr ,
                                           java.util.Date A161BarFecSal ,
                                           String A2454BarGirar ,
                                           short A4466BarAcaAnh ,
                                           String A2829BarProPer ,
                                           String A4348DisUsrCod ,
                                           int A1235BarNumCli ,
                                           String A3030BarPlf ,
                                           String AV65TFBarFasSig_Sel ,
                                           String AV64TFBarFasSig ,
                                           String A1955BarFasSig ,
                                           long AV468TFBarAlbUltimo ,
                                           long A13930BarAlbUlti ,
                                           long AV469TFBarAlbUltimo_To ,
                                           int AV480TFBarAlbFact ,
                                           int A13935BarAlbFact ,
                                           int AV481TFBarAlbFact_To ,
                                           String AV477TFBarNormas_Sel ,
                                           String AV476TFBarNormas ,
                                           String A13934BarNormas ,
                                           String AV462bardisnumfrom ,
                                           String A13878PedidoClie ,
                                           String AV463bardisnumto ,
                                           byte AV466barsitfrom ,
                                           byte AV467barsitto ,
                                           String A396EmprCod ,
                                           String AV459Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int35 = new byte[75];
      Object[] GXv_Object36 = new Object[2];
      scmdbuf = "SELECT T2.DisUsrCod, T1.BarPlf, T1.BarNumCli, T1.BarProPer, T1.BarAcaAnh, T1.BarGirar, T1.BarFecSal, T1.BarFecFpr, T1.BarFecCli, T1.BarFecGen, T1.BarSit, T1.BarNomCli," ;
      scmdbuf += " T1.BarColNum, T1.BarColNom, T3.TipArtDsc AS BarTipArtD, T1.BarTipArt AS BarTipArt, T1.BarSerDsc, T1.BarSer, T1.BarAgrEst, T4.CliNom, T1.CliCod, COALESCE( T5.BarFasSig," ;
      scmdbuf += " ' ') AS BarFasSig, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.DisCod, T1.BarDisNum, T1.BarEncCli, T1.EmprCod FROM ((((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod AND T3.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.CliCod = T1.CliCod) LEFT JOIN (SELECT MIN(T6.FasCod) AS BarFasSig, COALESCE( T7.BarFasLin, 0) AS BarFasLin, T6.EmprCod, T6.BarCod, T6.BarCodReo," ;
      scmdbuf += " T6.BarCodPar FROM ((TXPBARFAS T6 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP" ;
      scmdbuf += " BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T6.EmprCod AND T7.BarCod = T6.BarCod AND T7.BarCodReo = T6.BarCodReo AND T7.BarCodPar = T6.BarCodPar)" ;
      scmdbuf += " INNER JOIN (SELECT MIN(T9.BarOrdLin) AS GXC1, COALESCE( T10.BarFasLin, 0) AS BarFasLin, T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar FROM (TXPBARFAS T9 LEFT" ;
      scmdbuf += " JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T10 ON T10.EmprCod = T9.EmprCod AND T10.BarCod = T9.BarCod AND T10.BarCodReo = T9.BarCodReo AND T10.BarCodPar = T9.BarCodPar) WHERE (T9.BarOrdLin >= 0) AND (T9.BarOrdLin" ;
      scmdbuf += " > COALESCE( T10.BarFasLin, 0)) AND (T9.BarFasEst = 0) GROUP BY T10.BarFasLin, T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar ) T8 ON T8.EmprCod = T6.EmprCod" ;
      scmdbuf += " AND T8.BarCod = T6.BarCod AND T8.BarCodReo = T6.BarCodReo AND T8.BarCodPar = T6.BarCodPar) WHERE (T6.BarOrdLin = T8.GXC1) AND (T6.BarOrdLin >= 0) AND (T6.BarOrdLin" ;
      scmdbuf += " > COALESCE( T7.BarFasLin, 0)) AND (T6.BarFasEst = 0) GROUP BY T7.BarFasLin, T6.EmprCod, T6.BarCod, T6.BarCodReo, T6.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV24TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int35[8] = (byte)(1) ;
      }
      if ( ! (0==AV25TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int35[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV27TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int35[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int35[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV157TFBarAgrEst_Sel)==0) && ( ! (GXutil.strcmp("", AV156TFBarAgrEst)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV157TFBarAgrEst_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int35[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV29TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV28TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV29TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int35[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV31TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV30TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV31TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int35[19] = (byte)(1) ;
      }
      if ( ! (0==AV32TFBarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int35[20] = (byte)(1) ;
      }
      if ( ! (0==AV33TFBarTipArt_To) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int35[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV35TFBarTipArtDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV34TFBarTipArtDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35TFBarTipArtDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int35[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV37TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV36TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int35[25] = (byte)(1) ;
      }
      if ( ! (0==AV38TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int35[26] = (byte)(1) ;
      }
      if ( ! (0==AV39TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int35[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV201TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV200TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV201TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int35[29] = (byte)(1) ;
      }
      if ( ! (0==AV124TFBarSit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int35[30] = (byte)(1) ;
      }
      if ( ! (0==AV125TFBarSit_To) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int35[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV40TFBarFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int35[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42TFBarFecCli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int35[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV144TFBarFecFpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int35[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV46TFBarFecSal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int35[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV325TFBarGirar_Sel)==0) && ( ! (GXutil.strcmp("", AV324TFBarGirar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarGirar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV325TFBarGirar_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int35[37] = (byte)(1) ;
      }
      if ( ! (0==AV372TFBarAcaAnh) )
      {
         addWhere(sWhereString, "(T1.BarAcaAnh >= ?)");
      }
      else
      {
         GXv_int35[38] = (byte)(1) ;
      }
      if ( ! (0==AV373TFBarAcaAnh_To) )
      {
         addWhere(sWhereString, "(T1.BarAcaAnh <= ?)");
      }
      else
      {
         GXv_int35[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV247TFBarProPer_Sel)==0) && ( ! (GXutil.strcmp("", AV246TFBarProPer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarProPer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV247TFBarProPer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int35[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV479TFDisUsrCod_Sel)==0) && ( ! (GXutil.strcmp("", AV478TFDisUsrCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV479TFDisUsrCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.DisUsrCod = ?)");
      }
      else
      {
         GXv_int35[43] = (byte)(1) ;
      }
      if ( ! (0==AV460clicodfrom) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int35[44] = (byte)(1) ;
      }
      if ( ! (0==AV461clicodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int35[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV464barfecgenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int35[46] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV465barfecgento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int35[47] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV486barfecsalfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int35[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV487barfecsalto)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int35[49] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV482barfecclifrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int35[50] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV483barfecclito)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli <= ?)");
      }
      else
      {
         GXv_int35[51] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV484BarFecFprfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int35[52] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV485BarFecFprto)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int35[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV488barserfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int35[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV489barserto)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int35[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV492BarColNomfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int35[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV493BarColNomto)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int35[57] = (byte)(1) ;
      }
      if ( ! (0==AV494BarColNumfrom) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int35[58] = (byte)(1) ;
      }
      if ( ! (0==AV495BarColNumto) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int35[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV496BarNomClifrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli >= ?)");
      }
      else
      {
         GXv_int35[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV497BarNomClito)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli <= ?)");
      }
      else
      {
         GXv_int35[61] = (byte)(1) ;
      }
      if ( ! (0==AV498BarNumclifrom) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int35[62] = (byte)(1) ;
      }
      if ( ! (0==AV499barnumclito) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int35[63] = (byte)(1) ;
      }
      if ( ! (0==AV490bartipartfrom) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int35[64] = (byte)(1) ;
      }
      if ( ! (0==AV491bartipartto) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int35[65] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV501muestras)==0) )
      {
         addWhere(sWhereString, "(T1.BarPlf = ?)");
      }
      else
      {
         GXv_int35[66] = (byte)(1) ;
      }
      if ( ! (0==AV502barcodfrom) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int35[67] = (byte)(1) ;
      }
      if ( ! (0==AV503barcodto) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int35[68] = (byte)(1) ;
      }
      if ( ! (0==AV504barcodreofrom) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int35[69] = (byte)(1) ;
      }
      if ( ! (0==AV505barcodreoto) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int35[70] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV506barcodparfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar >= ?)");
      }
      else
      {
         GXv_int35[71] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV507barcodparto)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar <= ?)");
      }
      else
      {
         GXv_int35[72] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV510Cod_idtx)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int35[73] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV513BarGirar)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int35[74] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.DisUsrCod" ;
      GXv_Object36[0] = scmdbuf ;
      GXv_Object36[1] = GXv_int35 ;
      return GXv_Object36 ;
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
                  return conditional_P09DR6(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.util.Date)dynConstraints[44] , (java.util.Date)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , ((Number) dynConstraints[55]).intValue() , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).shortValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , ((Number) dynConstraints[60]).intValue() , ((Number) dynConstraints[61]).byteValue() , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , ((Number) dynConstraints[67]).intValue() , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , ((Number) dynConstraints[70]).byteValue() , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , ((Number) dynConstraints[75]).shortValue() , (String)dynConstraints[76] , (String)dynConstraints[77] , ((Number) dynConstraints[78]).intValue() , (String)dynConstraints[79] , ((Number) dynConstraints[80]).byteValue() , (java.util.Date)dynConstraints[81] , (java.util.Date)dynConstraints[82] , (java.util.Date)dynConstraints[83] , (java.util.Date)dynConstraints[84] , (String)dynConstraints[85] , ((Number) dynConstraints[86]).shortValue() , (String)dynConstraints[87] , (String)dynConstraints[88] , ((Number) dynConstraints[89]).intValue() , (String)dynConstraints[90] , (String)dynConstraints[91] , (String)dynConstraints[92] , (String)dynConstraints[93] , ((Number) dynConstraints[94]).longValue() , ((Number) dynConstraints[95]).longValue() , ((Number) dynConstraints[96]).longValue() , ((Number) dynConstraints[97]).intValue() , ((Number) dynConstraints[98]).intValue() , ((Number) dynConstraints[99]).intValue() , (String)dynConstraints[100] , (String)dynConstraints[101] , (String)dynConstraints[102] , (String)dynConstraints[103] , (String)dynConstraints[104] , (String)dynConstraints[105] , ((Number) dynConstraints[106]).byteValue() , ((Number) dynConstraints[107]).byteValue() , (String)dynConstraints[108] , (String)dynConstraints[109] );
            case 1 :
                  return conditional_P09DR11(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.util.Date)dynConstraints[44] , (java.util.Date)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , ((Number) dynConstraints[55]).intValue() , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).shortValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , ((Number) dynConstraints[60]).intValue() , ((Number) dynConstraints[61]).byteValue() , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , ((Number) dynConstraints[67]).intValue() , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , ((Number) dynConstraints[70]).byteValue() , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , ((Number) dynConstraints[75]).shortValue() , (String)dynConstraints[76] , (String)dynConstraints[77] , ((Number) dynConstraints[78]).intValue() , (String)dynConstraints[79] , ((Number) dynConstraints[80]).byteValue() , (java.util.Date)dynConstraints[81] , (java.util.Date)dynConstraints[82] , (java.util.Date)dynConstraints[83] , (java.util.Date)dynConstraints[84] , (String)dynConstraints[85] , ((Number) dynConstraints[86]).shortValue() , (String)dynConstraints[87] , (String)dynConstraints[88] , ((Number) dynConstraints[89]).intValue() , (String)dynConstraints[90] , (String)dynConstraints[91] , (String)dynConstraints[92] , (String)dynConstraints[93] , ((Number) dynConstraints[94]).longValue() , ((Number) dynConstraints[95]).longValue() , ((Number) dynConstraints[96]).longValue() , ((Number) dynConstraints[97]).intValue() , ((Number) dynConstraints[98]).intValue() , ((Number) dynConstraints[99]).intValue() , (String)dynConstraints[100] , (String)dynConstraints[101] , (String)dynConstraints[102] , (String)dynConstraints[103] , (String)dynConstraints[104] , (String)dynConstraints[105] , ((Number) dynConstraints[106]).byteValue() , ((Number) dynConstraints[107]).byteValue() , (String)dynConstraints[108] , (String)dynConstraints[109] );
            case 2 :
                  return conditional_P09DR16(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.util.Date)dynConstraints[44] , (java.util.Date)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , ((Number) dynConstraints[55]).intValue() , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).shortValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , ((Number) dynConstraints[60]).intValue() , ((Number) dynConstraints[61]).byteValue() , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , ((Number) dynConstraints[67]).intValue() , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , ((Number) dynConstraints[70]).byteValue() , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , ((Number) dynConstraints[75]).shortValue() , (String)dynConstraints[76] , (String)dynConstraints[77] , ((Number) dynConstraints[78]).intValue() , (String)dynConstraints[79] , ((Number) dynConstraints[80]).byteValue() , (java.util.Date)dynConstraints[81] , (java.util.Date)dynConstraints[82] , (java.util.Date)dynConstraints[83] , (java.util.Date)dynConstraints[84] , (String)dynConstraints[85] , ((Number) dynConstraints[86]).shortValue() , (String)dynConstraints[87] , (String)dynConstraints[88] , ((Number) dynConstraints[89]).intValue() , (String)dynConstraints[90] , (String)dynConstraints[91] , (String)dynConstraints[92] , (String)dynConstraints[93] , ((Number) dynConstraints[94]).longValue() , ((Number) dynConstraints[95]).longValue() , ((Number) dynConstraints[96]).longValue() , ((Number) dynConstraints[97]).intValue() , ((Number) dynConstraints[98]).intValue() , ((Number) dynConstraints[99]).intValue() , (String)dynConstraints[100] , (String)dynConstraints[101] , (String)dynConstraints[102] , (String)dynConstraints[103] , (String)dynConstraints[104] , (String)dynConstraints[105] , ((Number) dynConstraints[106]).byteValue() , ((Number) dynConstraints[107]).byteValue() , (String)dynConstraints[108] , (String)dynConstraints[109] );
            case 3 :
                  return conditional_P09DR21(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.util.Date)dynConstraints[44] , (java.util.Date)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , ((Number) dynConstraints[55]).intValue() , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).shortValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , ((Number) dynConstraints[60]).intValue() , ((Number) dynConstraints[61]).byteValue() , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , ((Number) dynConstraints[67]).intValue() , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , ((Number) dynConstraints[70]).byteValue() , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , ((Number) dynConstraints[75]).shortValue() , (String)dynConstraints[76] , (String)dynConstraints[77] , ((Number) dynConstraints[78]).intValue() , (String)dynConstraints[79] , ((Number) dynConstraints[80]).byteValue() , (java.util.Date)dynConstraints[81] , (java.util.Date)dynConstraints[82] , (java.util.Date)dynConstraints[83] , (java.util.Date)dynConstraints[84] , (String)dynConstraints[85] , ((Number) dynConstraints[86]).shortValue() , (String)dynConstraints[87] , (String)dynConstraints[88] , ((Number) dynConstraints[89]).intValue() , (String)dynConstraints[90] , (String)dynConstraints[91] , (String)dynConstraints[92] , (String)dynConstraints[93] , ((Number) dynConstraints[94]).longValue() , ((Number) dynConstraints[95]).longValue() , ((Number) dynConstraints[96]).longValue() , ((Number) dynConstraints[97]).intValue() , ((Number) dynConstraints[98]).intValue() , ((Number) dynConstraints[99]).intValue() , (String)dynConstraints[100] , (String)dynConstraints[101] , (String)dynConstraints[102] , (String)dynConstraints[103] , (String)dynConstraints[104] , (String)dynConstraints[105] , ((Number) dynConstraints[106]).byteValue() , ((Number) dynConstraints[107]).byteValue() , (String)dynConstraints[108] , (String)dynConstraints[109] );
            case 4 :
                  return conditional_P09DR26(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.util.Date)dynConstraints[44] , (java.util.Date)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , ((Number) dynConstraints[55]).intValue() , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).shortValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , ((Number) dynConstraints[60]).intValue() , ((Number) dynConstraints[61]).byteValue() , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , ((Number) dynConstraints[67]).intValue() , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , ((Number) dynConstraints[70]).byteValue() , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , ((Number) dynConstraints[75]).shortValue() , (String)dynConstraints[76] , (String)dynConstraints[77] , ((Number) dynConstraints[78]).intValue() , (String)dynConstraints[79] , ((Number) dynConstraints[80]).byteValue() , (java.util.Date)dynConstraints[81] , (java.util.Date)dynConstraints[82] , (java.util.Date)dynConstraints[83] , (java.util.Date)dynConstraints[84] , (String)dynConstraints[85] , ((Number) dynConstraints[86]).shortValue() , (String)dynConstraints[87] , (String)dynConstraints[88] , ((Number) dynConstraints[89]).intValue() , (String)dynConstraints[90] , (String)dynConstraints[91] , (String)dynConstraints[92] , (String)dynConstraints[93] , ((Number) dynConstraints[94]).longValue() , ((Number) dynConstraints[95]).longValue() , ((Number) dynConstraints[96]).longValue() , ((Number) dynConstraints[97]).intValue() , ((Number) dynConstraints[98]).intValue() , ((Number) dynConstraints[99]).intValue() , (String)dynConstraints[100] , (String)dynConstraints[101] , (String)dynConstraints[102] , (String)dynConstraints[103] , (String)dynConstraints[104] , (String)dynConstraints[105] , ((Number) dynConstraints[106]).byteValue() , ((Number) dynConstraints[107]).byteValue() , (String)dynConstraints[108] , (String)dynConstraints[109] );
            case 5 :
                  return conditional_P09DR31(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.util.Date)dynConstraints[44] , (java.util.Date)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , ((Number) dynConstraints[55]).intValue() , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).shortValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , ((Number) dynConstraints[60]).intValue() , ((Number) dynConstraints[61]).byteValue() , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , ((Number) dynConstraints[67]).intValue() , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , ((Number) dynConstraints[70]).byteValue() , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , ((Number) dynConstraints[75]).shortValue() , (String)dynConstraints[76] , (String)dynConstraints[77] , ((Number) dynConstraints[78]).intValue() , (String)dynConstraints[79] , ((Number) dynConstraints[80]).byteValue() , (java.util.Date)dynConstraints[81] , (java.util.Date)dynConstraints[82] , (java.util.Date)dynConstraints[83] , (java.util.Date)dynConstraints[84] , (String)dynConstraints[85] , ((Number) dynConstraints[86]).shortValue() , (String)dynConstraints[87] , (String)dynConstraints[88] , ((Number) dynConstraints[89]).intValue() , (String)dynConstraints[90] , (String)dynConstraints[91] , (String)dynConstraints[92] , (String)dynConstraints[93] , ((Number) dynConstraints[94]).longValue() , ((Number) dynConstraints[95]).longValue() , ((Number) dynConstraints[96]).longValue() , ((Number) dynConstraints[97]).intValue() , ((Number) dynConstraints[98]).intValue() , ((Number) dynConstraints[99]).intValue() , (String)dynConstraints[100] , (String)dynConstraints[101] , (String)dynConstraints[102] , (String)dynConstraints[103] , (String)dynConstraints[104] , (String)dynConstraints[105] , ((Number) dynConstraints[106]).byteValue() , ((Number) dynConstraints[107]).byteValue() , (String)dynConstraints[108] , (String)dynConstraints[109] );
            case 6 :
                  return conditional_P09DR36(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.util.Date)dynConstraints[44] , (java.util.Date)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , ((Number) dynConstraints[55]).intValue() , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).shortValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , ((Number) dynConstraints[60]).intValue() , ((Number) dynConstraints[61]).byteValue() , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , ((Number) dynConstraints[67]).intValue() , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , ((Number) dynConstraints[70]).byteValue() , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , ((Number) dynConstraints[75]).shortValue() , (String)dynConstraints[76] , (String)dynConstraints[77] , ((Number) dynConstraints[78]).intValue() , (String)dynConstraints[79] , ((Number) dynConstraints[80]).byteValue() , (java.util.Date)dynConstraints[81] , (java.util.Date)dynConstraints[82] , (java.util.Date)dynConstraints[83] , (java.util.Date)dynConstraints[84] , (String)dynConstraints[85] , ((Number) dynConstraints[86]).shortValue() , (String)dynConstraints[87] , (String)dynConstraints[88] , ((Number) dynConstraints[89]).intValue() , (String)dynConstraints[90] , (String)dynConstraints[91] , (String)dynConstraints[92] , (String)dynConstraints[93] , ((Number) dynConstraints[94]).longValue() , ((Number) dynConstraints[95]).longValue() , ((Number) dynConstraints[96]).longValue() , ((Number) dynConstraints[97]).intValue() , ((Number) dynConstraints[98]).intValue() , ((Number) dynConstraints[99]).intValue() , (String)dynConstraints[100] , (String)dynConstraints[101] , (String)dynConstraints[102] , (String)dynConstraints[103] , (String)dynConstraints[104] , (String)dynConstraints[105] , ((Number) dynConstraints[106]).byteValue() , ((Number) dynConstraints[107]).byteValue() , (String)dynConstraints[108] , (String)dynConstraints[109] );
            case 7 :
                  return conditional_P09DR41(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.util.Date)dynConstraints[44] , (java.util.Date)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , ((Number) dynConstraints[55]).intValue() , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).shortValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , ((Number) dynConstraints[60]).intValue() , ((Number) dynConstraints[61]).byteValue() , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , ((Number) dynConstraints[67]).intValue() , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , ((Number) dynConstraints[70]).byteValue() , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , ((Number) dynConstraints[75]).shortValue() , (String)dynConstraints[76] , (String)dynConstraints[77] , ((Number) dynConstraints[78]).intValue() , (String)dynConstraints[79] , ((Number) dynConstraints[80]).byteValue() , (java.util.Date)dynConstraints[81] , (java.util.Date)dynConstraints[82] , (java.util.Date)dynConstraints[83] , (java.util.Date)dynConstraints[84] , (String)dynConstraints[85] , ((Number) dynConstraints[86]).shortValue() , (String)dynConstraints[87] , (String)dynConstraints[88] , ((Number) dynConstraints[89]).intValue() , (String)dynConstraints[90] , (String)dynConstraints[91] , (String)dynConstraints[92] , (String)dynConstraints[93] , ((Number) dynConstraints[94]).longValue() , ((Number) dynConstraints[95]).longValue() , ((Number) dynConstraints[96]).longValue() , ((Number) dynConstraints[97]).intValue() , ((Number) dynConstraints[98]).intValue() , ((Number) dynConstraints[99]).intValue() , (String)dynConstraints[100] , (String)dynConstraints[101] , (String)dynConstraints[102] , (String)dynConstraints[103] , (String)dynConstraints[104] , (String)dynConstraints[105] , ((Number) dynConstraints[106]).byteValue() , ((Number) dynConstraints[107]).byteValue() , (String)dynConstraints[108] , (String)dynConstraints[109] );
            case 8 :
                  return conditional_P09DR46(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.util.Date)dynConstraints[44] , (java.util.Date)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , ((Number) dynConstraints[55]).intValue() , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).shortValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , ((Number) dynConstraints[60]).intValue() , ((Number) dynConstraints[61]).byteValue() , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , ((Number) dynConstraints[67]).intValue() , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , ((Number) dynConstraints[70]).byteValue() , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , ((Number) dynConstraints[75]).shortValue() , (String)dynConstraints[76] , (String)dynConstraints[77] , ((Number) dynConstraints[78]).intValue() , (String)dynConstraints[79] , ((Number) dynConstraints[80]).byteValue() , (java.util.Date)dynConstraints[81] , (java.util.Date)dynConstraints[82] , (java.util.Date)dynConstraints[83] , (java.util.Date)dynConstraints[84] , (String)dynConstraints[85] , ((Number) dynConstraints[86]).shortValue() , (String)dynConstraints[87] , (String)dynConstraints[88] , ((Number) dynConstraints[89]).intValue() , (String)dynConstraints[90] , (String)dynConstraints[91] , (String)dynConstraints[92] , (String)dynConstraints[93] , ((Number) dynConstraints[94]).longValue() , ((Number) dynConstraints[95]).longValue() , ((Number) dynConstraints[96]).longValue() , ((Number) dynConstraints[97]).intValue() , ((Number) dynConstraints[98]).intValue() , ((Number) dynConstraints[99]).intValue() , (String)dynConstraints[100] , (String)dynConstraints[101] , (String)dynConstraints[102] , (String)dynConstraints[103] , (String)dynConstraints[104] , (String)dynConstraints[105] , ((Number) dynConstraints[106]).byteValue() , ((Number) dynConstraints[107]).byteValue() , (String)dynConstraints[108] , (String)dynConstraints[109] );
            case 9 :
                  return conditional_P09DR51(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.util.Date)dynConstraints[44] , (java.util.Date)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , ((Number) dynConstraints[55]).intValue() , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).shortValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , ((Number) dynConstraints[60]).intValue() , ((Number) dynConstraints[61]).byteValue() , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , ((Number) dynConstraints[67]).intValue() , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , ((Number) dynConstraints[70]).byteValue() , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , ((Number) dynConstraints[75]).shortValue() , (String)dynConstraints[76] , (String)dynConstraints[77] , ((Number) dynConstraints[78]).intValue() , (String)dynConstraints[79] , ((Number) dynConstraints[80]).byteValue() , (java.util.Date)dynConstraints[81] , (java.util.Date)dynConstraints[82] , (java.util.Date)dynConstraints[83] , (java.util.Date)dynConstraints[84] , (String)dynConstraints[85] , ((Number) dynConstraints[86]).shortValue() , (String)dynConstraints[87] , (String)dynConstraints[88] , ((Number) dynConstraints[89]).intValue() , (String)dynConstraints[90] , (String)dynConstraints[91] , (String)dynConstraints[92] , (String)dynConstraints[93] , ((Number) dynConstraints[94]).longValue() , ((Number) dynConstraints[95]).longValue() , ((Number) dynConstraints[96]).longValue() , ((Number) dynConstraints[97]).intValue() , ((Number) dynConstraints[98]).intValue() , ((Number) dynConstraints[99]).intValue() , (String)dynConstraints[100] , (String)dynConstraints[101] , (String)dynConstraints[102] , (String)dynConstraints[103] , (String)dynConstraints[104] , (String)dynConstraints[105] , ((Number) dynConstraints[106]).byteValue() , ((Number) dynConstraints[107]).byteValue() , (String)dynConstraints[108] , (String)dynConstraints[109] );
            case 10 :
                  return conditional_P09DR56(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.util.Date)dynConstraints[44] , (java.util.Date)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , ((Number) dynConstraints[55]).intValue() , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).shortValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , ((Number) dynConstraints[60]).intValue() , ((Number) dynConstraints[61]).byteValue() , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , ((Number) dynConstraints[67]).intValue() , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , ((Number) dynConstraints[70]).byteValue() , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , ((Number) dynConstraints[75]).shortValue() , (String)dynConstraints[76] , (String)dynConstraints[77] , ((Number) dynConstraints[78]).intValue() , (String)dynConstraints[79] , ((Number) dynConstraints[80]).byteValue() , (java.util.Date)dynConstraints[81] , (java.util.Date)dynConstraints[82] , (java.util.Date)dynConstraints[83] , (java.util.Date)dynConstraints[84] , (String)dynConstraints[85] , ((Number) dynConstraints[86]).shortValue() , (String)dynConstraints[87] , (String)dynConstraints[88] , ((Number) dynConstraints[89]).intValue() , (String)dynConstraints[90] , (String)dynConstraints[91] , (String)dynConstraints[92] , (String)dynConstraints[93] , ((Number) dynConstraints[94]).longValue() , ((Number) dynConstraints[95]).longValue() , ((Number) dynConstraints[96]).longValue() , ((Number) dynConstraints[97]).intValue() , ((Number) dynConstraints[98]).intValue() , ((Number) dynConstraints[99]).intValue() , (String)dynConstraints[100] , (String)dynConstraints[101] , (String)dynConstraints[102] , (String)dynConstraints[103] , (String)dynConstraints[104] , (String)dynConstraints[105] , ((Number) dynConstraints[106]).byteValue() , ((Number) dynConstraints[107]).byteValue() , (String)dynConstraints[108] , (String)dynConstraints[109] );
            case 11 :
                  return conditional_P09DR61(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.util.Date)dynConstraints[44] , (java.util.Date)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , ((Number) dynConstraints[55]).intValue() , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).shortValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , ((Number) dynConstraints[60]).intValue() , ((Number) dynConstraints[61]).byteValue() , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , ((Number) dynConstraints[67]).intValue() , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , ((Number) dynConstraints[70]).byteValue() , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , ((Number) dynConstraints[75]).shortValue() , (String)dynConstraints[76] , (String)dynConstraints[77] , ((Number) dynConstraints[78]).intValue() , (String)dynConstraints[79] , ((Number) dynConstraints[80]).byteValue() , (java.util.Date)dynConstraints[81] , (java.util.Date)dynConstraints[82] , (java.util.Date)dynConstraints[83] , (java.util.Date)dynConstraints[84] , (String)dynConstraints[85] , ((Number) dynConstraints[86]).shortValue() , (String)dynConstraints[87] , (String)dynConstraints[88] , ((Number) dynConstraints[89]).intValue() , (String)dynConstraints[90] , (String)dynConstraints[91] , (String)dynConstraints[92] , (String)dynConstraints[93] , ((Number) dynConstraints[94]).longValue() , ((Number) dynConstraints[95]).longValue() , ((Number) dynConstraints[96]).longValue() , ((Number) dynConstraints[97]).intValue() , ((Number) dynConstraints[98]).intValue() , ((Number) dynConstraints[99]).intValue() , (String)dynConstraints[100] , (String)dynConstraints[101] , (String)dynConstraints[102] , (String)dynConstraints[103] , (String)dynConstraints[104] , (String)dynConstraints[105] , ((Number) dynConstraints[106]).byteValue() , ((Number) dynConstraints[107]).byteValue() , (String)dynConstraints[108] , (String)dynConstraints[109] );
            case 12 :
                  return conditional_P09DR66(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.util.Date)dynConstraints[44] , (java.util.Date)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , ((Number) dynConstraints[55]).intValue() , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).shortValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , ((Number) dynConstraints[60]).intValue() , ((Number) dynConstraints[61]).byteValue() , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , ((Number) dynConstraints[67]).intValue() , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , ((Number) dynConstraints[70]).byteValue() , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , ((Number) dynConstraints[75]).shortValue() , (String)dynConstraints[76] , (String)dynConstraints[77] , ((Number) dynConstraints[78]).intValue() , (String)dynConstraints[79] , ((Number) dynConstraints[80]).byteValue() , (java.util.Date)dynConstraints[81] , (java.util.Date)dynConstraints[82] , (java.util.Date)dynConstraints[83] , (java.util.Date)dynConstraints[84] , (String)dynConstraints[85] , ((Number) dynConstraints[86]).shortValue() , (String)dynConstraints[87] , (String)dynConstraints[88] , ((Number) dynConstraints[89]).intValue() , (String)dynConstraints[90] , (String)dynConstraints[91] , (String)dynConstraints[92] , (String)dynConstraints[93] , ((Number) dynConstraints[94]).longValue() , ((Number) dynConstraints[95]).longValue() , ((Number) dynConstraints[96]).longValue() , ((Number) dynConstraints[97]).intValue() , ((Number) dynConstraints[98]).intValue() , ((Number) dynConstraints[99]).intValue() , (String)dynConstraints[100] , (String)dynConstraints[101] , (String)dynConstraints[102] , (String)dynConstraints[103] , (String)dynConstraints[104] , (String)dynConstraints[105] , ((Number) dynConstraints[106]).byteValue() , ((Number) dynConstraints[107]).byteValue() , (String)dynConstraints[108] , (String)dynConstraints[109] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09DR6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09DR11", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09DR16", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09DR21", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09DR26", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09DR31", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09DR36", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09DR41", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09DR46", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09DR51", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09DR56", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09DR61", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09DR66", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 13);
               ((String[]) buf[15])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(17);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(18, 26);
               ((String[]) buf[20])[0] = rslt.getString(19, 16);
               ((String[]) buf[21])[0] = rslt.getString(20, 1);
               ((int[]) buf[22])[0] = rslt.getInt(21);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(22, 8);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(23, 1);
               ((byte[]) buf[27])[0] = rslt.getByte(24);
               ((int[]) buf[28])[0] = rslt.getInt(25);
               ((int[]) buf[29])[0] = rslt.getInt(26);
               ((String[]) buf[30])[0] = rslt.getString(27, 8);
               ((String[]) buf[31])[0] = rslt.getString(28, 20);
               ((String[]) buf[32])[0] = rslt.getString(29, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 13);
               ((String[]) buf[14])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(16);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(17, 26);
               ((String[]) buf[19])[0] = rslt.getString(18, 16);
               ((String[]) buf[20])[0] = rslt.getString(19, 1);
               ((String[]) buf[21])[0] = rslt.getString(20, 30);
               ((int[]) buf[22])[0] = rslt.getInt(21);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(22, 8);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(23, 1);
               ((byte[]) buf[27])[0] = rslt.getByte(24);
               ((int[]) buf[28])[0] = rslt.getInt(25);
               ((int[]) buf[29])[0] = rslt.getInt(26);
               ((String[]) buf[30])[0] = rslt.getString(27, 8);
               ((String[]) buf[31])[0] = rslt.getString(28, 20);
               ((String[]) buf[32])[0] = rslt.getString(29, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 13);
               ((String[]) buf[15])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(17);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(18, 26);
               ((String[]) buf[20])[0] = rslt.getString(19, 16);
               ((String[]) buf[21])[0] = rslt.getString(20, 30);
               ((int[]) buf[22])[0] = rslt.getInt(21);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(22, 8);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(23, 1);
               ((byte[]) buf[27])[0] = rslt.getByte(24);
               ((int[]) buf[28])[0] = rslt.getInt(25);
               ((int[]) buf[29])[0] = rslt.getInt(26);
               ((String[]) buf[30])[0] = rslt.getString(27, 8);
               ((String[]) buf[31])[0] = rslt.getString(28, 20);
               ((String[]) buf[32])[0] = rslt.getString(29, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 13);
               ((String[]) buf[15])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(17);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(18, 26);
               ((String[]) buf[20])[0] = rslt.getString(19, 1);
               ((String[]) buf[21])[0] = rslt.getString(20, 30);
               ((int[]) buf[22])[0] = rslt.getInt(21);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(22, 8);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(23, 1);
               ((byte[]) buf[27])[0] = rslt.getByte(24);
               ((int[]) buf[28])[0] = rslt.getInt(25);
               ((int[]) buf[29])[0] = rslt.getInt(26);
               ((String[]) buf[30])[0] = rslt.getString(27, 8);
               ((String[]) buf[31])[0] = rslt.getString(28, 20);
               ((String[]) buf[32])[0] = rslt.getString(29, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 13);
               ((String[]) buf[15])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(17);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(18, 16);
               ((String[]) buf[20])[0] = rslt.getString(19, 1);
               ((String[]) buf[21])[0] = rslt.getString(20, 30);
               ((int[]) buf[22])[0] = rslt.getInt(21);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(22, 8);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(23, 1);
               ((byte[]) buf[27])[0] = rslt.getByte(24);
               ((int[]) buf[28])[0] = rslt.getInt(25);
               ((int[]) buf[29])[0] = rslt.getInt(26);
               ((String[]) buf[30])[0] = rslt.getString(27, 8);
               ((String[]) buf[31])[0] = rslt.getString(28, 20);
               ((String[]) buf[32])[0] = rslt.getString(29, 3);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 20);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(11);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((String[]) buf[15])[0] = rslt.getString(15, 13);
               ((String[]) buf[16])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(17, 26);
               ((String[]) buf[19])[0] = rslt.getString(18, 16);
               ((String[]) buf[20])[0] = rslt.getString(19, 1);
               ((String[]) buf[21])[0] = rslt.getString(20, 30);
               ((int[]) buf[22])[0] = rslt.getInt(21);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(22, 8);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(23, 1);
               ((byte[]) buf[27])[0] = rslt.getByte(24);
               ((int[]) buf[28])[0] = rslt.getInt(25);
               ((int[]) buf[29])[0] = rslt.getInt(26);
               ((String[]) buf[30])[0] = rslt.getString(27, 8);
               ((String[]) buf[31])[0] = rslt.getString(28, 20);
               ((String[]) buf[32])[0] = rslt.getString(29, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(16);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(17, 26);
               ((String[]) buf[19])[0] = rslt.getString(18, 16);
               ((String[]) buf[20])[0] = rslt.getString(19, 1);
               ((String[]) buf[21])[0] = rslt.getString(20, 30);
               ((int[]) buf[22])[0] = rslt.getInt(21);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(22, 8);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(23, 1);
               ((byte[]) buf[27])[0] = rslt.getByte(24);
               ((int[]) buf[28])[0] = rslt.getInt(25);
               ((int[]) buf[29])[0] = rslt.getInt(26);
               ((String[]) buf[30])[0] = rslt.getString(27, 8);
               ((String[]) buf[31])[0] = rslt.getString(28, 20);
               ((String[]) buf[32])[0] = rslt.getString(29, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 13);
               ((String[]) buf[14])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(16);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(17, 26);
               ((String[]) buf[19])[0] = rslt.getString(18, 16);
               ((String[]) buf[20])[0] = rslt.getString(19, 1);
               ((String[]) buf[21])[0] = rslt.getString(20, 30);
               ((int[]) buf[22])[0] = rslt.getInt(21);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(22, 8);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(23, 1);
               ((byte[]) buf[27])[0] = rslt.getByte(24);
               ((int[]) buf[28])[0] = rslt.getInt(25);
               ((int[]) buf[29])[0] = rslt.getInt(26);
               ((String[]) buf[30])[0] = rslt.getString(27, 8);
               ((String[]) buf[31])[0] = rslt.getString(28, 20);
               ((String[]) buf[32])[0] = rslt.getString(29, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 13);
               ((String[]) buf[14])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(16);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(17, 26);
               ((String[]) buf[19])[0] = rslt.getString(18, 16);
               ((String[]) buf[20])[0] = rslt.getString(19, 1);
               ((String[]) buf[21])[0] = rslt.getString(20, 30);
               ((int[]) buf[22])[0] = rslt.getInt(21);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(22, 8);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(23, 1);
               ((byte[]) buf[27])[0] = rslt.getByte(24);
               ((int[]) buf[28])[0] = rslt.getInt(25);
               ((int[]) buf[29])[0] = rslt.getInt(26);
               ((String[]) buf[30])[0] = rslt.getString(27, 8);
               ((String[]) buf[31])[0] = rslt.getString(28, 20);
               ((String[]) buf[32])[0] = rslt.getString(29, 3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 13);
               ((String[]) buf[14])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(16);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(17, 26);
               ((String[]) buf[19])[0] = rslt.getString(18, 16);
               ((String[]) buf[20])[0] = rslt.getString(19, 1);
               ((String[]) buf[21])[0] = rslt.getString(20, 30);
               ((int[]) buf[22])[0] = rslt.getInt(21);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(22, 8);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(23, 1);
               ((byte[]) buf[27])[0] = rslt.getByte(24);
               ((int[]) buf[28])[0] = rslt.getInt(25);
               ((int[]) buf[29])[0] = rslt.getInt(26);
               ((String[]) buf[30])[0] = rslt.getString(27, 8);
               ((String[]) buf[31])[0] = rslt.getString(28, 20);
               ((String[]) buf[32])[0] = rslt.getString(29, 3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 13);
               ((String[]) buf[14])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(16);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(17, 26);
               ((String[]) buf[19])[0] = rslt.getString(18, 16);
               ((String[]) buf[20])[0] = rslt.getString(19, 1);
               ((String[]) buf[21])[0] = rslt.getString(20, 30);
               ((int[]) buf[22])[0] = rslt.getInt(21);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(22, 8);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(23, 1);
               ((byte[]) buf[27])[0] = rslt.getByte(24);
               ((int[]) buf[28])[0] = rslt.getInt(25);
               ((int[]) buf[29])[0] = rslt.getInt(26);
               ((String[]) buf[30])[0] = rslt.getString(27, 8);
               ((String[]) buf[31])[0] = rslt.getString(28, 20);
               ((String[]) buf[32])[0] = rslt.getString(29, 3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 13);
               ((String[]) buf[14])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(16);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(17, 26);
               ((String[]) buf[19])[0] = rslt.getString(18, 16);
               ((String[]) buf[20])[0] = rslt.getString(19, 1);
               ((String[]) buf[21])[0] = rslt.getString(20, 30);
               ((int[]) buf[22])[0] = rslt.getInt(21);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(22, 8);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(23, 1);
               ((byte[]) buf[27])[0] = rslt.getByte(24);
               ((int[]) buf[28])[0] = rslt.getInt(25);
               ((int[]) buf[29])[0] = rslt.getInt(26);
               ((String[]) buf[30])[0] = rslt.getString(27, 8);
               ((String[]) buf[31])[0] = rslt.getString(28, 20);
               ((String[]) buf[32])[0] = rslt.getString(29, 3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 13);
               ((String[]) buf[14])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(16);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(17, 26);
               ((String[]) buf[19])[0] = rslt.getString(18, 16);
               ((String[]) buf[20])[0] = rslt.getString(19, 1);
               ((String[]) buf[21])[0] = rslt.getString(20, 30);
               ((int[]) buf[22])[0] = rslt.getInt(21);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(22, 8);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(23, 1);
               ((byte[]) buf[27])[0] = rslt.getByte(24);
               ((int[]) buf[28])[0] = rslt.getInt(25);
               ((int[]) buf[29])[0] = rslt.getInt(26);
               ((String[]) buf[30])[0] = rslt.getString(27, 8);
               ((String[]) buf[31])[0] = rslt.getString(28, 20);
               ((String[]) buf[32])[0] = rslt.getString(29, 3);
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
                  stmt.setString(sIdx, (String)parms[75], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[80]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[81]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 3);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 11);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 11);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[95]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[96]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[105]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[106]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[107]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[108]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[109]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[110]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 20);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 20);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[113]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[114]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 8);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 8);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 8);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 8);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[119]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[120]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[121]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[122]);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[123]);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[124]);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[125]);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[126]);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[127]);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[128]);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 16);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 16);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[131], 13);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[132], 13);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[133]).intValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[134]).intValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 13);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 13);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[138]).intValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[139]).shortValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[140]).shortValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 1);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[142]).intValue());
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[143]).intValue());
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[144]).byteValue());
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[145]).byteValue());
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[146], 1);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 1);
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 4);
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[149], 20);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[81]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[82]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 11);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 11);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[95]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[96]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[105]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[106]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[107]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[108]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[109]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[110]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 20);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 20);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[113]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[114]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 8);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 8);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 8);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 8);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[119]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[120]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[121]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[122]);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[123]);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[124]);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[125]);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[126]);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[127]);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[128]);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 16);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 16);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[131], 13);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[132], 13);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[133]).intValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[134]).intValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 13);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 13);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[138]).intValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[139]).shortValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[140]).shortValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 1);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[142]).intValue());
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[143]).intValue());
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[144]).byteValue());
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[145]).byteValue());
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[146], 1);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 1);
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 4);
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[149], 20);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[80]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[81]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 3);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 11);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 11);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[95]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[96]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[105]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[106]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[107]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[108]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[109]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[110]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 20);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 20);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[113]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[114]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 8);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 8);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 8);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 8);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[119]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[120]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[121]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[122]);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[123]);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[124]);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[125]);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[126]);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[127]);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[128]);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 16);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 16);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[131], 13);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[132], 13);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[133]).intValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[134]).intValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 13);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 13);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[138]).intValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[139]).shortValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[140]).shortValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 1);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[142]).intValue());
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[143]).intValue());
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[144]).byteValue());
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[145]).byteValue());
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[146], 1);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 1);
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 4);
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[149], 20);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[81]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[82]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 11);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 11);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[95]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[96]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[105]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[106]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[107]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[108]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[109]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[110]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 20);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 20);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[113]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[114]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 8);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 8);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 8);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 8);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[119]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[120]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[121]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[122]);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[123]);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[124]);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[125]);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[126]);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[127]);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[128]);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 16);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 16);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[131], 13);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[132], 13);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[133]).intValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[134]).intValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 13);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 13);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[138]).intValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[139]).shortValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[140]).shortValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 1);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[142]).intValue());
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[143]).intValue());
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[144]).byteValue());
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[145]).byteValue());
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[146], 1);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 1);
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 4);
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[149], 20);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[80]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[81]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 3);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 11);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 11);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[95]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[96]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[105]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[106]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[107]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[108]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[109]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[110]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 20);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 20);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[113]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[114]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 8);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 8);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 8);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 8);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[119]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[120]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[121]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[122]);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[123]);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[124]);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[125]);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[126]);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[127]);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[128]);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 16);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 16);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[131], 13);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[132], 13);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[133]).intValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[134]).intValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 13);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 13);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[138]).intValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[139]).shortValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[140]).shortValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 1);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[142]).intValue());
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[143]).intValue());
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[144]).byteValue());
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[145]).byteValue());
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[146], 1);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 1);
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 4);
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[149], 20);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[81]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[82]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 11);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 11);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[95]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[96]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[105]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[106]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[107]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[108]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[109]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[110]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 20);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 20);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[113]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[114]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 8);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 8);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 8);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 8);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[119]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[120]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[121]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[122]);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[123]);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[124]);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[125]);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[126]);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[127]);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[128]);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 16);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 16);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[131], 13);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[132], 13);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[133]).intValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[134]).intValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 13);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 13);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[138]).intValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[139]).shortValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[140]).shortValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 1);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[142]).intValue());
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[143]).intValue());
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[144]).byteValue());
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[145]).byteValue());
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[146], 1);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 1);
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 4);
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[149], 20);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[80]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[81]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 3);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 11);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 11);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[95]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[96]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[105]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[106]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[107]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[108]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[109]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[110]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 20);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 20);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[113]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[114]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 8);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 8);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 8);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 8);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[119]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[120]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[121]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[122]);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[123]);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[124]);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[125]);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[126]);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[127]);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[128]);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 16);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 16);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[131], 13);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[132], 13);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[133]).intValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[134]).intValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 13);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 13);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[138]).intValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[139]).shortValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[140]).shortValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 1);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[142]).intValue());
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[143]).intValue());
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[144]).byteValue());
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[145]).byteValue());
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[146], 1);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 1);
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 4);
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[149], 20);
               }
               return;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[80]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[81]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 3);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 11);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 11);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[95]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[96]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[105]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[106]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[107]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[108]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[109]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[110]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 20);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 20);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[113]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[114]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 8);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 8);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 8);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 8);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[119]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[120]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[121]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[122]);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[123]);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[124]);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[125]);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[126]);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[127]);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[128]);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 16);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 16);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[131], 13);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[132], 13);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[133]).intValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[134]).intValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 13);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 13);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[138]).intValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[139]).shortValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[140]).shortValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 1);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[142]).intValue());
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[143]).intValue());
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[144]).byteValue());
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[145]).byteValue());
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[146], 1);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 1);
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 4);
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[149], 20);
               }
               return;
            case 8 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[81]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[82]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 11);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 11);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[95]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[96]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[105]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[106]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[107]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[108]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[109]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[110]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 20);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 20);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[113]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[114]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 8);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 8);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 8);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 8);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[119]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[120]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[121]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[122]);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[123]);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[124]);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[125]);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[126]);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[127]);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[128]);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 16);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 16);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[131], 13);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[132], 13);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[133]).intValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[134]).intValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 13);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 13);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[138]).intValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[139]).shortValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[140]).shortValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 1);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[142]).intValue());
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[143]).intValue());
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[144]).byteValue());
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[145]).byteValue());
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[146], 1);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 1);
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 4);
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[149], 20);
               }
               return;
            case 9 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[80]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[81]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 3);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 11);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 11);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[95]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[96]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[105]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[106]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[107]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[108]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[109]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[110]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 20);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 20);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[113]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[114]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 8);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 8);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 8);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 8);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[119]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[120]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[121]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[122]);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[123]);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[124]);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[125]);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[126]);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[127]);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[128]);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 16);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 16);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[131], 13);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[132], 13);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[133]).intValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[134]).intValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 13);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 13);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[138]).intValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[139]).shortValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[140]).shortValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 1);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[142]).intValue());
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[143]).intValue());
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[144]).byteValue());
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[145]).byteValue());
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[146], 1);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 1);
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 4);
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[149], 20);
               }
               return;
            case 10 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[80]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[81]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 3);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 11);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 11);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[95]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[96]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[105]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[106]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[107]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[108]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[109]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[110]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 20);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 20);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[113]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[114]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 8);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 8);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 8);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 8);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[119]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[120]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[121]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[122]);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[123]);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[124]);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[125]);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[126]);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[127]);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[128]);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 16);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 16);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[131], 13);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[132], 13);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[133]).intValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[134]).intValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 13);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 13);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[138]).intValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[139]).shortValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[140]).shortValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 1);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[142]).intValue());
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[143]).intValue());
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[144]).byteValue());
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[145]).byteValue());
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[146], 1);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 1);
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 4);
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[149], 20);
               }
               return;
            case 11 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[81]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[82]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 11);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 11);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[95]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[96]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[105]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[106]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[107]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[108]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[109]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[110]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 20);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 20);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[113]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[114]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 8);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 8);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 8);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 8);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[119]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[120]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[121]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[122]);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[123]);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[124]);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[125]);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[126]);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[127]);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[128]);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 16);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 16);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[131], 13);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[132], 13);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[133]).intValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[134]).intValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 13);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 13);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[138]).intValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[139]).shortValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[140]).shortValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 1);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[142]).intValue());
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[143]).intValue());
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[144]).byteValue());
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[145]).byteValue());
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[146], 1);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 1);
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 4);
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[149], 20);
               }
               return;
            case 12 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[80]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[81]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 3);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 11);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 11);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[95]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[96]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[105]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[106]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[107]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[108]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[109]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[110]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 20);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 20);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[113]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[114]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 8);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 8);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 8);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 8);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[119]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[120]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[121]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[122]);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[123]);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[124]);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[125]);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[126]);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[127]);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[128]);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 16);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 16);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[131], 13);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[132], 13);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[133]).intValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[134]).intValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 13);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 13);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[138]).intValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[139]).shortValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[140]).shortValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 1);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[142]).intValue());
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[143]).intValue());
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[144]).byteValue());
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[145]).byteValue());
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[146], 1);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 1);
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 4);
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[149], 20);
               }
               return;
      }
   }

}

