package app.datamon ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pget_menufake extends GXProcedure
{
   public pget_menufake( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pget_menufake.class ), "" );
   }

   public pget_menufake( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.datamon.SdtSdtMenu_ITEM> executeUdp( )
   {
      pget_menufake.this.aP0 = new GXBaseCollection[] {new GXBaseCollection<app.datamon.SdtSdtMenu_ITEM>()};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( GXBaseCollection<app.datamon.SdtSdtMenu_ITEM>[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( GXBaseCollection<app.datamon.SdtSdtMenu_ITEM>[] aP0 )
   {
      pget_menufake.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pget_menufake.this.AV8SdtMenu;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8SdtMenu = new GXBaseCollection<app.datamon.SdtSdtMenu_ITEM>(app.datamon.SdtSdtMenu_ITEM.class, "ITEM", "TexplusNET", remoteHandle);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private GXBaseCollection<app.datamon.SdtSdtMenu_ITEM>[] aP0 ;
   private GXBaseCollection<app.datamon.SdtSdtMenu_ITEM> AV8SdtMenu ;
}

