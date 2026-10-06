package app.lectoroptico ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.lectoroptico.lector__wwexportcsv", "/app.lectoroptico.lector__wwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class lector__wwexportcsv extends GXWebObjectStub
{
   public lector__wwexportcsv( )
   {
   }

   public lector__wwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( lector__wwexportcsv.class ));
   }

   public lector__wwexportcsv( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new lector__wwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new lector__wwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Lector__WWExport CSV";
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

