package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.informeproduccionresumen", "/app.informeproduccionresumen"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informeproduccionresumen extends GXWebObjectStub
{
   public informeproduccionresumen( )
   {
   }

   public informeproduccionresumen( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informeproduccionresumen.class ));
   }

   public informeproduccionresumen( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.informeproduccionresumen_impl pgm = new app.informeproduccionresumen_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informeproduccionresumen_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informeproduccionresumen_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Produccion Resumen";
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

