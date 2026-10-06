package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.tsolidewwexportreport", "/app.formulaciontinte.tsolidewwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tsolidewwexportreport extends GXWebObjectStub
{
   public tsolidewwexportreport( )
   {
   }

   public tsolidewwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tsolidewwexportreport.class ));
   }

   public tsolidewwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tsolidewwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tsolidewwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado de Solidez";
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

