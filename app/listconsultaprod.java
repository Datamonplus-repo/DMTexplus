package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.listconsultaprod", "/app.listconsultaprod"})
@jakarta.servlet.annotation.MultipartConfig
public final  class listconsultaprod extends GXWebObjectStub
{
   public listconsultaprod( )
   {
   }

   public listconsultaprod( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( listconsultaprod.class ));
   }

   public listconsultaprod( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new listconsultaprod_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new listconsultaprod_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Consulta de Produccion";
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

