package app.wwpbaseobjects ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class gethomesampledata extends GXProcedure
{
   public gethomesampledata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gethomesampledata.class ), "" );
   }

   public gethomesampledata( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.wwpbaseobjects.SdtHomeSampleData_HomeSampleDataItem> executeUdp( )
   {
      gethomesampledata.this.aP0 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtHomeSampleData_HomeSampleDataItem>()};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( GXBaseCollection<app.wwpbaseobjects.SdtHomeSampleData_HomeSampleDataItem>[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( GXBaseCollection<app.wwpbaseobjects.SdtHomeSampleData_HomeSampleDataItem>[] aP0 )
   {
      gethomesampledata.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gxm1homesampledata = (app.wwpbaseobjects.SdtHomeSampleData_HomeSampleDataItem)new app.wwpbaseobjects.SdtHomeSampleData_HomeSampleDataItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1homesampledata, 0);
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productname( "10/10/23" );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productprice( DecimalUtil.doubleToDec(1) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productvolume( DecimalUtil.doubleToDec(2) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productweight( DecimalUtil.doubleToDec(4) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productdiscount( DecimalUtil.doubleToDec(1) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productstatus( (byte)(1) );
      Gxm1homesampledata = (app.wwpbaseobjects.SdtHomeSampleData_HomeSampleDataItem)new app.wwpbaseobjects.SdtHomeSampleData_HomeSampleDataItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1homesampledata, 0);
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productname( "15/10/23" );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productprice( DecimalUtil.doubleToDec(3) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productvolume( DecimalUtil.doubleToDec(2) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productweight( DecimalUtil.doubleToDec(6) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productdiscount( DecimalUtil.doubleToDec(1) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productstatus( (byte)(2) );
      Gxm1homesampledata = (app.wwpbaseobjects.SdtHomeSampleData_HomeSampleDataItem)new app.wwpbaseobjects.SdtHomeSampleData_HomeSampleDataItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1homesampledata, 0);
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productname( "17/10/23" );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productprice( DecimalUtil.doubleToDec(2) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productvolume( DecimalUtil.doubleToDec(1) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productweight( DecimalUtil.doubleToDec(4) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productdiscount( DecimalUtil.doubleToDec(1) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productstatus( (byte)(3) );
      Gxm1homesampledata = (app.wwpbaseobjects.SdtHomeSampleData_HomeSampleDataItem)new app.wwpbaseobjects.SdtHomeSampleData_HomeSampleDataItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1homesampledata, 0);
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productname( "20/10/23" );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productprice( DecimalUtil.doubleToDec(4) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productvolume( DecimalUtil.doubleToDec(3) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productweight( DecimalUtil.doubleToDec(7) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productdiscount( DecimalUtil.doubleToDec(2) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productstatus( (byte)(1) );
      Gxm1homesampledata = (app.wwpbaseobjects.SdtHomeSampleData_HomeSampleDataItem)new app.wwpbaseobjects.SdtHomeSampleData_HomeSampleDataItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1homesampledata, 0);
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productname( "25/10/23" );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productprice( DecimalUtil.doubleToDec(2) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productvolume( DecimalUtil.doubleToDec(3) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productweight( DecimalUtil.doubleToDec(4) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productdiscount( DecimalUtil.doubleToDec(3) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productstatus( (byte)(4) );
      Gxm1homesampledata = (app.wwpbaseobjects.SdtHomeSampleData_HomeSampleDataItem)new app.wwpbaseobjects.SdtHomeSampleData_HomeSampleDataItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1homesampledata, 0);
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productname( "10/11/23" );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productprice( DecimalUtil.doubleToDec(3) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productvolume( DecimalUtil.doubleToDec(1) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productweight( DecimalUtil.doubleToDec(3) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productdiscount( DecimalUtil.doubleToDec(1) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productstatus( (byte)(1) );
      Gxm1homesampledata = (app.wwpbaseobjects.SdtHomeSampleData_HomeSampleDataItem)new app.wwpbaseobjects.SdtHomeSampleData_HomeSampleDataItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1homesampledata, 0);
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productname( "15/11/23" );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productprice( DecimalUtil.doubleToDec(2) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productvolume( DecimalUtil.doubleToDec(3) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productweight( DecimalUtil.doubleToDec(5) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productdiscount( DecimalUtil.doubleToDec(2) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productstatus( (byte)(4) );
      Gxm1homesampledata = (app.wwpbaseobjects.SdtHomeSampleData_HomeSampleDataItem)new app.wwpbaseobjects.SdtHomeSampleData_HomeSampleDataItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1homesampledata, 0);
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productname( "20/11/23" );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productprice( DecimalUtil.doubleToDec(2) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productvolume( DecimalUtil.doubleToDec(4) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productweight( DecimalUtil.doubleToDec(6) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productdiscount( DecimalUtil.doubleToDec(1) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productstatus( (byte)(1) );
      Gxm1homesampledata = (app.wwpbaseobjects.SdtHomeSampleData_HomeSampleDataItem)new app.wwpbaseobjects.SdtHomeSampleData_HomeSampleDataItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1homesampledata, 0);
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productname( "25/11/23" );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productprice( DecimalUtil.doubleToDec(4) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productvolume( DecimalUtil.doubleToDec(5) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productweight( DecimalUtil.doubleToDec(3) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productdiscount( DecimalUtil.doubleToDec(2) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productstatus( (byte)(2) );
      Gxm1homesampledata = (app.wwpbaseobjects.SdtHomeSampleData_HomeSampleDataItem)new app.wwpbaseobjects.SdtHomeSampleData_HomeSampleDataItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1homesampledata, 0);
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productname( "30/11/23" );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productprice( DecimalUtil.doubleToDec(1) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productvolume( DecimalUtil.doubleToDec(4) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productweight( DecimalUtil.doubleToDec(6) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productdiscount( DecimalUtil.doubleToDec(3) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productstatus( (byte)(1) );
      Gxm1homesampledata = (app.wwpbaseobjects.SdtHomeSampleData_HomeSampleDataItem)new app.wwpbaseobjects.SdtHomeSampleData_HomeSampleDataItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1homesampledata, 0);
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productname( "02/12/23" );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productprice( DecimalUtil.doubleToDec(3) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productvolume( DecimalUtil.doubleToDec(2) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productweight( DecimalUtil.doubleToDec(3) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productdiscount( DecimalUtil.doubleToDec(2) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productstatus( (byte)(1) );
      Gxm1homesampledata = (app.wwpbaseobjects.SdtHomeSampleData_HomeSampleDataItem)new app.wwpbaseobjects.SdtHomeSampleData_HomeSampleDataItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1homesampledata, 0);
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productname( "02/12/23" );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productprice( DecimalUtil.doubleToDec(2) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productvolume( DecimalUtil.doubleToDec(3) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productweight( DecimalUtil.doubleToDec(4) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productdiscount( DecimalUtil.doubleToDec(1) );
      Gxm1homesampledata.setgxTv_SdtHomeSampleData_HomeSampleDataItem_Productstatus( (byte)(4) );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = gethomesampledata.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.wwpbaseobjects.SdtHomeSampleData_HomeSampleDataItem>(app.wwpbaseobjects.SdtHomeSampleData_HomeSampleDataItem.class, "HomeSampleDataItem", "TexplusNET", remoteHandle);
      Gxm1homesampledata = new app.wwpbaseobjects.SdtHomeSampleData_HomeSampleDataItem(remoteHandle, context);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private GXBaseCollection<app.wwpbaseobjects.SdtHomeSampleData_HomeSampleDataItem>[] aP0 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtHomeSampleData_HomeSampleDataItem> Gxm2rootcol ;
   private app.wwpbaseobjects.SdtHomeSampleData_HomeSampleDataItem Gxm1homesampledata ;
}

