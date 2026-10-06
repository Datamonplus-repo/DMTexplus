package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tlectorwwexportreport", "/app.tlectorwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tlectorwwexportreport extends GXWebObjectStub
{
   public tlectorwwexportreport( )
   {
   }

   public tlectorwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tlectorwwexportreport.class ));
   }

   public tlectorwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tlectorwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tlectorwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado Tabla LECTOR";
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

