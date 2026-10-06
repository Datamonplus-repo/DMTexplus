package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.tensprdwwexportreport", "/app.gestionlaboratorio.tensprdwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tensprdwwexportreport extends GXWebObjectStub
{
   public tensprdwwexportreport( )
   {
   }

   public tensprdwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tensprdwwexportreport.class ));
   }

   public tensprdwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tensprdwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tensprdwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tipos de Productos";
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

