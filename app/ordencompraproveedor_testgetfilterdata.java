package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ordencompraproveedor_testgetfilterdata extends GXProcedure
{
   public ordencompraproveedor_testgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ordencompraproveedor_testgetfilterdata.class ), "" );
   }

   public ordencompraproveedor_testgetfilterdata( int remoteHandle ,
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
      ordencompraproveedor_testgetfilterdata.this.aP5 = new String[] {""};
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
      ordencompraproveedor_testgetfilterdata.this.AV26DDOName = aP0;
      ordencompraproveedor_testgetfilterdata.this.AV27SearchTxt = aP1;
      ordencompraproveedor_testgetfilterdata.this.AV28SearchTxtTo = aP2;
      ordencompraproveedor_testgetfilterdata.this.aP3 = aP3;
      ordencompraproveedor_testgetfilterdata.this.aP4 = aP4;
      ordencompraproveedor_testgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV18OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV19OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_SDTCOMPRAPRODUCTOQUIMICO__PRDNUM") == 0 )
      {
         AV11TFSDTCompraProductoQuimico__PrdNum = AV27SearchTxt ;
         AV12TFSDTCompraProductoQuimico__PrdNum_Sel = "" ;
         /* Execute user subroutine: 'LOADSDTCOMPRAPRODUCTOQUIMICO__PRDNUMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV29OptionsJson = AV16Options.toJSonString(false) ;
      AV30OptionsDescJson = AV18OptionsDesc.toJSonString(false) ;
      AV31OptionIndexesJson = AV19OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV21Session.getValue("OrdenCompraProveedor_TestGridState"), "") == 0 )
      {
         AV23GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "OrdenCompraProveedor_TestGridState"), null, null);
      }
      else
      {
         AV23GridState.fromxml(AV21Session.getValue("OrdenCompraProveedor_TestGridState"), null, null);
      }
      AV35GXV1 = 1 ;
      while ( AV35GXV1 <= AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV35GXV1));
         if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV32FilterFullText = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSDTCOMPRAPRODUCTOQUIMICO__PRDNUM") == 0 )
         {
            AV11TFSDTCompraProductoQuimico__PrdNum = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSDTCOMPRAPRODUCTOQUIMICO__PRDNUM_SEL") == 0 )
         {
            AV12TFSDTCompraProductoQuimico__PrdNum_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV35GXV1 = (int)(AV35GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADSDTCOMPRAPRODUCTOQUIMICO__PRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV36GXV2 = 1 ;
      while ( AV36GXV2 <= AV10SDTCompraProductoQuimico.size() )
      {
         AV13SDTCompraProductoQuimicoItem = (app.SdtSDTCompraProductoQuimico_Item)((app.SdtSDTCompraProductoQuimico_Item)AV10SDTCompraProductoQuimico.elementAt(-1+AV36GXV2));
         if ( ! (GXutil.strcmp("", AV13SDTCompraProductoQuimicoItem.getgxTv_SdtSDTCompraProductoQuimico_Item_Prdnum())==0) )
         {
            AV15Option = AV13SDTCompraProductoQuimicoItem.getgxTv_SdtSDTCompraProductoQuimico_Item_Prdnum() ;
            AV14InsertIndex = 1 ;
            while ( ( AV14InsertIndex <= AV16Options.size() ) && ( GXutil.strcmp((String)AV16Options.elementAt(-1+AV14InsertIndex), AV15Option) < 0 ) )
            {
               AV14InsertIndex = (int)(AV14InsertIndex+1) ;
            }
            if ( ( ( AV14InsertIndex == AV16Options.size() + 1 ) ) || ( GXutil.strcmp((String)AV16Options.elementAt(-1+AV14InsertIndex), AV15Option) != 0 ) )
            {
               AV16Options.add(AV15Option, AV14InsertIndex);
            }
         }
         AV36GXV2 = (int)(AV36GXV2+1) ;
      }
   }

   protected void cleanup( )
   {
      this.aP3[0] = ordencompraproveedor_testgetfilterdata.this.AV29OptionsJson;
      this.aP4[0] = ordencompraproveedor_testgetfilterdata.this.AV30OptionsDescJson;
      this.aP5[0] = ordencompraproveedor_testgetfilterdata.this.AV31OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV29OptionsJson = "" ;
      AV30OptionsDescJson = "" ;
      AV31OptionIndexesJson = "" ;
      AV16Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV18OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV19OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV11TFSDTCompraProductoQuimico__PrdNum = "" ;
      AV12TFSDTCompraProductoQuimico__PrdNum_Sel = "" ;
      AV21Session = httpContext.getWebSession();
      AV23GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV24GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV32FilterFullText = "" ;
      AV10SDTCompraProductoQuimico = new GXBaseCollection<app.SdtSDTCompraProductoQuimico_Item>(app.SdtSDTCompraProductoQuimico_Item.class, "Item", "TexplusNET", remoteHandle);
      AV13SDTCompraProductoQuimicoItem = new app.SdtSDTCompraProductoQuimico_Item(remoteHandle, context);
      AV15Option = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV35GXV1 ;
   private int AV36GXV2 ;
   private int AV14InsertIndex ;
   private String AV11TFSDTCompraProductoQuimico__PrdNum ;
   private String AV12TFSDTCompraProductoQuimico__PrdNum_Sel ;
   private boolean returnInSub ;
   private String AV29OptionsJson ;
   private String AV30OptionsDescJson ;
   private String AV31OptionIndexesJson ;
   private String AV26DDOName ;
   private String AV27SearchTxt ;
   private String AV28SearchTxtTo ;
   private String AV32FilterFullText ;
   private String AV15Option ;
   private com.genexus.webpanels.WebSession AV21Session ;
   private GXBaseCollection<app.SdtSDTCompraProductoQuimico_Item> AV10SDTCompraProductoQuimico ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private GXSimpleCollection<String> AV16Options ;
   private GXSimpleCollection<String> AV18OptionsDesc ;
   private GXSimpleCollection<String> AV19OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.SdtSDTCompraProductoQuimico_Item AV13SDTCompraProductoQuimicoItem ;
   private app.wwpbaseobjects.SdtWWPGridState AV23GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV24GridStateFilterValue ;
}

