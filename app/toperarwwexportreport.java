package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.toperarwwexportreport", "/app.toperarwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class toperarwwexportreport extends GXWebObjectStub
{
   public toperarwwexportreport( )
   {
   }

   public toperarwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( toperarwwexportreport.class ));
   }

   public toperarwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new toperarwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new toperarwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado Operarios";
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

