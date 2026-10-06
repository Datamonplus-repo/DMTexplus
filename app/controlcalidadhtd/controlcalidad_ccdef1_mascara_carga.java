package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controlcalidad_ccdef1_mascara_carga extends GXProcedure
{
   public controlcalidad_ccdef1_mascara_carga( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidad_ccdef1_mascara_carga.class ), "" );
   }

   public controlcalidad_ccdef1_mascara_carga( int remoteHandle ,
                                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( )
   {
      controlcalidad_ccdef1_mascara_carga.this.aP0 = new String[] {""};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( String[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( String[] aP0 )
   {
      controlcalidad_ccdef1_mascara_carga.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10ControlCalidad_CCDEF1_Mascara_json = "" ;
      AV8ControlCalidad_CCDEF1_Mascara.clear();
      AV9ControlCalidad_CCDEF1_Mascara_item = (app.controlcalidadhtd.SdtControlCalidad_CCDEF1_Mascara_Item)new app.controlcalidadhtd.SdtControlCalidad_CCDEF1_Mascara_Item(remoteHandle, context);
      AV9ControlCalidad_CCDEF1_Mascara_item.setgxTv_SdtControlCalidad_CCDEF1_Mascara_Item_Valor( "X" );
      AV9ControlCalidad_CCDEF1_Mascara_item.setgxTv_SdtControlCalidad_CCDEF1_Mascara_Item_Descripcion( "Puede introducirse cualquier carácter." );
      AV8ControlCalidad_CCDEF1_Mascara.add(AV9ControlCalidad_CCDEF1_Mascara_item, 0);
      AV9ControlCalidad_CCDEF1_Mascara_item = (app.controlcalidadhtd.SdtControlCalidad_CCDEF1_Mascara_Item)new app.controlcalidadhtd.SdtControlCalidad_CCDEF1_Mascara_Item(remoteHandle, context);
      AV9ControlCalidad_CCDEF1_Mascara_item.setgxTv_SdtControlCalidad_CCDEF1_Mascara_Item_Valor( "9" );
      AV9ControlCalidad_CCDEF1_Mascara_item.setgxTv_SdtControlCalidad_CCDEF1_Mascara_Item_Descripcion( "Pueden introducirse dígitos y signos, como el signo menos ( – )." );
      AV8ControlCalidad_CCDEF1_Mascara.add(AV9ControlCalidad_CCDEF1_Mascara_item, 0);
      AV9ControlCalidad_CCDEF1_Mascara_item = (app.controlcalidadhtd.SdtControlCalidad_CCDEF1_Mascara_Item)new app.controlcalidadhtd.SdtControlCalidad_CCDEF1_Mascara_Item(remoteHandle, context);
      AV9ControlCalidad_CCDEF1_Mascara_item.setgxTv_SdtControlCalidad_CCDEF1_Mascara_Item_Valor( "#" );
      AV9ControlCalidad_CCDEF1_Mascara_item.setgxTv_SdtControlCalidad_CCDEF1_Mascara_Item_Descripcion( "Pueden introducirse dígitos, espacios en blanco y signos" );
      AV8ControlCalidad_CCDEF1_Mascara.add(AV9ControlCalidad_CCDEF1_Mascara_item, 0);
      AV10ControlCalidad_CCDEF1_Mascara_json = AV8ControlCalidad_CCDEF1_Mascara.toJSonString(false) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = controlcalidad_ccdef1_mascara_carga.this.AV10ControlCalidad_CCDEF1_Mascara_json;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10ControlCalidad_CCDEF1_Mascara_json = "" ;
      AV8ControlCalidad_CCDEF1_Mascara = new GXBaseCollection<app.controlcalidadhtd.SdtControlCalidad_CCDEF1_Mascara_Item>(app.controlcalidadhtd.SdtControlCalidad_CCDEF1_Mascara_Item.class, "Item", "TexplusNET", remoteHandle);
      AV9ControlCalidad_CCDEF1_Mascara_item = new app.controlcalidadhtd.SdtControlCalidad_CCDEF1_Mascara_Item(remoteHandle, context);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV10ControlCalidad_CCDEF1_Mascara_json ;
   private String[] aP0 ;
   private GXBaseCollection<app.controlcalidadhtd.SdtControlCalidad_CCDEF1_Mascara_Item> AV8ControlCalidad_CCDEF1_Mascara ;
   private app.controlcalidadhtd.SdtControlCalidad_CCDEF1_Mascara_Item AV9ControlCalidad_CCDEF1_Mascara_item ;
}

