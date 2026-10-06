package app.wwpbaseobjects ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wwp_managefiltersloadsavedfilters extends GXProcedure
{
   public wwp_managefiltersloadsavedfilters( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wwp_managefiltersloadsavedfilters.class ), "" );
   }

   public wwp_managefiltersloadsavedfilters( int remoteHandle ,
                                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> executeUdp( String aP0 ,
                                                                                              String aP1 ,
                                                                                              String aP2 ,
                                                                                              boolean aP3 )
   {
      wwp_managefiltersloadsavedfilters.this.aP4 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        boolean aP3 ,
                        GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             boolean aP3 ,
                             GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>[] aP4 )
   {
      wwp_managefiltersloadsavedfilters.this.AV8Key = aP0;
      wwp_managefiltersloadsavedfilters.this.AV13CleanJSFormat = aP1;
      wwp_managefiltersloadsavedfilters.this.AV14TableInternalName = aP2;
      wwp_managefiltersloadsavedfilters.this.AV15HasAdvancedFilters = aP3;
      wwp_managefiltersloadsavedfilters.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle) ;
      AV10ManageFiltersDataItem = (app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item)new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item(remoteHandle, context);
      AV10ManageFiltersDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Title( httpContext.getMessage( "WWP_CleanFiltersCaption", "") );
      AV10ManageFiltersDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Eventkey( "<#Clean#>" );
      AV10ManageFiltersDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Isdivider( false );
      AV10ManageFiltersDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Fonticon( "fa fa-times-circle" );
      if ( ! (GXutil.strcmp("", AV13CleanJSFormat)==0) )
      {
         AV10ManageFiltersDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Jsonclickevent( GXutil.format( AV13CleanJSFormat, AV14TableInternalName, "", "", "", "", "", "", "", "") );
      }
      AV9ManageFiltersData.add(AV10ManageFiltersDataItem, 0);
      AV10ManageFiltersDataItem = (app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item)new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item(remoteHandle, context);
      AV10ManageFiltersDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Title( httpContext.getMessage( "WWP_SaveFilterAsOption", "") );
      AV10ManageFiltersDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Eventkey( "<#Save#>" );
      AV10ManageFiltersDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Isdivider( false );
      AV10ManageFiltersDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Fonticon( "fa fa-save" );
      AV9ManageFiltersData.add(AV10ManageFiltersDataItem, 0);
      if ( AV15HasAdvancedFilters )
      {
         AV10ManageFiltersDataItem = (app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item)new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item(remoteHandle, context);
         AV10ManageFiltersDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Title( httpContext.getMessage( "WWP_ShowAdvancedFilters", "")+"|"+httpContext.getMessage( "WWP_HideAdvancedFilters", "") );
         AV10ManageFiltersDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Eventkey( "<#ADV#>" );
         AV10ManageFiltersDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Isdivider( false );
         AV10ManageFiltersDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Fonticon( "fas fa-filter" );
         AV9ManageFiltersData.add(AV10ManageFiltersDataItem, 0);
      }
      AV12ManageFiltersItems.fromxml(new app.wwpbaseobjects.loadmanagefiltersstate(remoteHandle, context).executeUdp( AV8Key), null, null);
      if ( AV12ManageFiltersItems.size() > 0 )
      {
         AV10ManageFiltersDataItem = (app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item)new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item(remoteHandle, context);
         AV10ManageFiltersDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Isdivider( true );
         AV9ManageFiltersData.add(AV10ManageFiltersDataItem, 0);
         AV18GXV1 = 1 ;
         while ( AV18GXV1 <= AV12ManageFiltersItems.size() )
         {
            AV11ManageFiltersItem = (app.wwpbaseobjects.SdtGridStateCollection_Item)((app.wwpbaseobjects.SdtGridStateCollection_Item)AV12ManageFiltersItems.elementAt(-1+AV18GXV1));
            AV10ManageFiltersDataItem = (app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item)new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item(remoteHandle, context);
            AV10ManageFiltersDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Title( AV11ManageFiltersItem.getgxTv_SdtGridStateCollection_Item_Title() );
            AV10ManageFiltersDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Eventkey( AV11ManageFiltersItem.getgxTv_SdtGridStateCollection_Item_Title() );
            AV10ManageFiltersDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Isdivider( false );
            if ( ! (GXutil.strcmp("", AV13CleanJSFormat)==0) )
            {
               AV10ManageFiltersDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Jsonclickevent( GXutil.format( AV13CleanJSFormat, AV14TableInternalName, "", "", "", "", "", "", "", "") );
            }
            AV9ManageFiltersData.add(AV10ManageFiltersDataItem, 0);
            if ( AV9ManageFiltersData.size() == 13 )
            {
               if (true) break;
            }
            AV18GXV1 = (int)(AV18GXV1+1) ;
         }
         AV10ManageFiltersDataItem = (app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item)new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item(remoteHandle, context);
         AV10ManageFiltersDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Isdivider( true );
         AV9ManageFiltersData.add(AV10ManageFiltersDataItem, 0);
         AV10ManageFiltersDataItem = (app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item)new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item(remoteHandle, context);
         AV10ManageFiltersDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Title( httpContext.getMessage( "WWP_ManageFiltersOption", "") );
         AV10ManageFiltersDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Eventkey( "<#Manage#>" );
         AV10ManageFiltersDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Isdivider( false );
         AV10ManageFiltersDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Fonticon( "fa fa-cog" );
         AV10ManageFiltersDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Jsonclickevent( "" );
         AV9ManageFiltersData.add(AV10ManageFiltersDataItem, 0);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = wwp_managefiltersloadsavedfilters.this.AV9ManageFiltersData;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV10ManageFiltersDataItem = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item(remoteHandle, context);
      AV12ManageFiltersItems = new GXBaseCollection<app.wwpbaseobjects.SdtGridStateCollection_Item>(app.wwpbaseobjects.SdtGridStateCollection_Item.class, "Item", "", remoteHandle);
      AV11ManageFiltersItem = new app.wwpbaseobjects.SdtGridStateCollection_Item(remoteHandle, context);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV18GXV1 ;
   private boolean AV15HasAdvancedFilters ;
   private String AV8Key ;
   private String AV13CleanJSFormat ;
   private String AV14TableInternalName ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>[] aP4 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV9ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtGridStateCollection_Item> AV12ManageFiltersItems ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item AV10ManageFiltersDataItem ;
   private app.wwpbaseobjects.SdtGridStateCollection_Item AV11ManageFiltersItem ;
}

