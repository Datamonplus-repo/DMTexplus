package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tarticuwwexportreport", "/app.tarticuwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tarticuwwexportreport extends GXWebObjectStub
{
   public tarticuwwexportreport( )
   {
   }

   public tarticuwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tarticuwwexportreport.class ));
   }

   public tarticuwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tarticuwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tarticuwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Lista de Ficha Técnica (Artículo)";
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

