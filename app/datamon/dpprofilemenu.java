package app.datamon ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpprofilemenu extends GXProcedure
{
   public dpprofilemenu( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpprofilemenu.class ), "" );
   }

   public dpprofilemenu( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.datamon.SdtSdtProfileMenu_Menu> executeUdp( String aP0 )
   {
      dpprofilemenu.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<app.datamon.SdtSdtProfileMenu_Menu>()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String aP0 ,
                        GXBaseCollection<app.datamon.SdtSdtProfileMenu_Menu>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             GXBaseCollection<app.datamon.SdtSdtProfileMenu_Menu>[] aP1 )
   {
      dpprofilemenu.this.AV5UsuCod = aP0;
      dpprofilemenu.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gxm1sdtprofilemenu = (app.datamon.SdtSdtProfileMenu_Menu)new app.datamon.SdtSdtProfileMenu_Menu(remoteHandle, context);
      Gxm2rootcol.add(Gxm1sdtprofilemenu, 0);
      Gxm1sdtprofilemenu.setgxTv_SdtSdtProfileMenu_Menu_Profilemenutitle( httpContext.getMessage( "SAIR", "") );
      Gxm1sdtprofilemenu.setgxTv_SdtSdtProfileMenu_Menu_Profilemenuicon( "" );
      Gxm1sdtprofilemenu.setgxTv_SdtSdtProfileMenu_Menu_Profilemenuurl( "#" );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = dpprofilemenu.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.datamon.SdtSdtProfileMenu_Menu>(app.datamon.SdtSdtProfileMenu_Menu.class, "Menu", "TexplusNET", remoteHandle);
      Gxm1sdtprofilemenu = new app.datamon.SdtSdtProfileMenu_Menu(remoteHandle, context);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV5UsuCod ;
   private GXBaseCollection<app.datamon.SdtSdtProfileMenu_Menu>[] aP1 ;
   private GXBaseCollection<app.datamon.SdtSdtProfileMenu_Menu> Gxm2rootcol ;
   private app.datamon.SdtSdtProfileMenu_Menu Gxm1sdtprofilemenu ;
}

