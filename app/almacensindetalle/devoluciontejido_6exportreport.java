package app.almacensindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.almacensindetalle.devoluciontejido_6exportreport", "/app.almacensindetalle.devoluciontejido_6exportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class devoluciontejido_6exportreport extends GXWebObjectStub
{
   public devoluciontejido_6exportreport( )
   {
   }

   public devoluciontejido_6exportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( devoluciontejido_6exportreport.class ));
   }

   public devoluciontejido_6exportreport( int remoteHandle ,
                                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new devoluciontejido_6exportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new devoluciontejido_6exportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Fichero RESULT.xml";
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

