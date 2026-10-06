package app.lectoroptico ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.lectoroptico.lector__wwexportreport", "/app.lectoroptico.lector__wwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class lector__wwexportreport extends GXWebObjectStub
{
   public lector__wwexportreport( )
   {
   }

   public lector__wwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( lector__wwexportreport.class ));
   }

   public lector__wwexportreport( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new lector__wwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new lector__wwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Lector__WWExport Report";
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

