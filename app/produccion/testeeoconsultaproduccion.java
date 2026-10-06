package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccion.testeeoconsultaproduccion", "/app.produccion.testeeoconsultaproduccion"})
@jakarta.servlet.annotation.MultipartConfig
public final  class testeeoconsultaproduccion extends GXWebObjectStub
{
   public testeeoconsultaproduccion( )
   {
   }

   public testeeoconsultaproduccion( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( testeeoconsultaproduccion.class ));
   }

   public testeeoconsultaproduccion( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.produccion.testeeoconsultaproduccion_impl pgm = new app.produccion.testeeoconsultaproduccion_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new testeeoconsultaproduccion_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new testeeoconsultaproduccion_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Teste EOConsulta Produccion";
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

