package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.almacentejidoencrudo__wp", "/app.almacentejidoencrudo__wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class almacentejidoencrudo__wp extends GXWebObjectStub
{
   public almacentejidoencrudo__wp( )
   {
   }

   public almacentejidoencrudo__wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( almacentejidoencrudo__wp.class ));
   }

   public almacentejidoencrudo__wp( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.almacentejidoencrudo__wp_impl pgm = new app.almacentejidoencrudo__wp_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new almacentejidoencrudo__wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new almacentejidoencrudo__wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informes Almacen Tejido Crudo";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

