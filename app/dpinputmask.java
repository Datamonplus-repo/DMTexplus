package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpinputmask extends GXProcedure
{
   public dpinputmask( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpinputmask.class ), "" );
   }

   public dpinputmask( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtSDTInputMask_Item> executeUdp( )
   {
      dpinputmask.this.aP0 = new GXBaseCollection[] {new GXBaseCollection<app.SdtSDTInputMask_Item>()};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( GXBaseCollection<app.SdtSDTInputMask_Item>[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( GXBaseCollection<app.SdtSDTInputMask_Item>[] aP0 )
   {
      dpinputmask.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gxm1sdtinputmask = (app.SdtSDTInputMask_Item)new app.SdtSDTInputMask_Item(remoteHandle, context);
      Gxm2rootcol.add(Gxm1sdtinputmask, 0);
      Gxm1sdtinputmask.setgxTv_SdtSDTInputMask_Item_Value( "X" );
      Gxm1sdtinputmask.setgxTv_SdtSDTInputMask_Item_Description( httpContext.getMessage( "Puede introducirse cualquier carácter.", "") );
      Gxm1sdtinputmask = (app.SdtSDTInputMask_Item)new app.SdtSDTInputMask_Item(remoteHandle, context);
      Gxm2rootcol.add(Gxm1sdtinputmask, 0);
      Gxm1sdtinputmask.setgxTv_SdtSDTInputMask_Item_Value( "9" );
      Gxm1sdtinputmask.setgxTv_SdtSDTInputMask_Item_Description( httpContext.getMessage( "Pueden introducirse dígitos y signos, como el signo menos ( – ).", "") );
      Gxm1sdtinputmask = (app.SdtSDTInputMask_Item)new app.SdtSDTInputMask_Item(remoteHandle, context);
      Gxm2rootcol.add(Gxm1sdtinputmask, 0);
      Gxm1sdtinputmask.setgxTv_SdtSDTInputMask_Item_Value( "#" );
      Gxm1sdtinputmask.setgxTv_SdtSDTInputMask_Item_Description( httpContext.getMessage( "Pueden introducirse dígitos, espacios en blanco y signos.", "") );
      Gxm1sdtinputmask = (app.SdtSDTInputMask_Item)new app.SdtSDTInputMask_Item(remoteHandle, context);
      Gxm2rootcol.add(Gxm1sdtinputmask, 0);
      Gxm1sdtinputmask.setgxTv_SdtSDTInputMask_Item_Value( "$" );
      Gxm1sdtinputmask.setgxTv_SdtSDTInputMask_Item_Description( httpContext.getMessage( "Muestra el símbolo de moneda actual (especificada con SET CURRENCY) en una posición fija.", "") );
      Gxm1sdtinputmask = (app.SdtSDTInputMask_Item)new app.SdtSDTInputMask_Item(remoteHandle, context);
      Gxm2rootcol.add(Gxm1sdtinputmask, 0);
      Gxm1sdtinputmask.setgxTv_SdtSDTInputMask_Item_Value( "$$" );
      Gxm1sdtinputmask.setgxTv_SdtSDTInputMask_Item_Description( httpContext.getMessage( "Muestra un símbolo de moneda flotante que siempre aparece junto a los dígitos del Spinner o TextBox.", "") );
      Gxm1sdtinputmask = (app.SdtSDTInputMask_Item)new app.SdtSDTInputMask_Item(remoteHandle, context);
      Gxm2rootcol.add(Gxm1sdtinputmask, 0);
      Gxm1sdtinputmask.setgxTv_SdtSDTInputMask_Item_Value( "*" );
      Gxm1sdtinputmask.setgxTv_SdtSDTInputMask_Item_Description( httpContext.getMessage( "Se muestran asteriscos a la izquierda del valor.", "") );
      Gxm1sdtinputmask = (app.SdtSDTInputMask_Item)new app.SdtSDTInputMask_Item(remoteHandle, context);
      Gxm2rootcol.add(Gxm1sdtinputmask, 0);
      Gxm1sdtinputmask.setgxTv_SdtSDTInputMask_Item_Value( "." );
      Gxm1sdtinputmask.setgxTv_SdtSDTInputMask_Item_Description( httpContext.getMessage( "Un punto especifica la posición de coma decimal.", "") );
      Gxm1sdtinputmask = (app.SdtSDTInputMask_Item)new app.SdtSDTInputMask_Item(remoteHandle, context);
      Gxm2rootcol.add(Gxm1sdtinputmask, 0);
      Gxm1sdtinputmask.setgxTv_SdtSDTInputMask_Item_Value( "," );
      Gxm1sdtinputmask.setgxTv_SdtSDTInputMask_Item_Description( httpContext.getMessage( "Pueden incluirse comas para separar dígitos a la izquierda de la coma decimal.", "") );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = dpinputmask.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.SdtSDTInputMask_Item>(app.SdtSDTInputMask_Item.class, "Item", "TexplusNET", remoteHandle);
      Gxm1sdtinputmask = new app.SdtSDTInputMask_Item(remoteHandle, context);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private GXBaseCollection<app.SdtSDTInputMask_Item>[] aP0 ;
   private GXBaseCollection<app.SdtSDTInputMask_Item> Gxm2rootcol ;
   private app.SdtSDTInputMask_Item Gxm1sdtinputmask ;
}

