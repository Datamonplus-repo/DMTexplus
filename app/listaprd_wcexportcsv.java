package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.listaprd_wcexportcsv", "/app.listaprd_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class listaprd_wcexportcsv extends GXWebObjectStub
{
   public listaprd_wcexportcsv( )
   {
   }

   public listaprd_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( listaprd_wcexportcsv.class ));
   }

   public listaprd_wcexportcsv( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new listaprd_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new listaprd_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Lista Prd_WCExport CSV";
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

