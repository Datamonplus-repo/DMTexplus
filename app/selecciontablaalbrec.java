package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.selecciontablaalbrec", "/app.selecciontablaalbrec"})
@jakarta.servlet.annotation.MultipartConfig
public final  class selecciontablaalbrec extends GXWebObjectStub
{
   public selecciontablaalbrec( )
   {
   }

   public selecciontablaalbrec( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( selecciontablaalbrec.class ));
   }

   public selecciontablaalbrec( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.selecciontablaalbrec_impl pgm = new app.selecciontablaalbrec_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new selecciontablaalbrec_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new selecciontablaalbrec_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Entradas Almacen";
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

