package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.listconsultaprodexportcsv", "/app.listconsultaprodexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class listconsultaprodexportcsv extends GXWebObjectStub
{
   public listconsultaprodexportcsv( )
   {
   }

   public listconsultaprodexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( listconsultaprodexportcsv.class ));
   }

   public listconsultaprodexportcsv( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new listconsultaprodexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new listconsultaprodexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "List Consulta Prod Export CSV";
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

