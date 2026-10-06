package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.tmaticewwexportreport", "/app.formulaciontinte.tmaticewwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmaticewwexportreport extends GXWebObjectStub
{
   public tmaticewwexportreport( )
   {
   }

   public tmaticewwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmaticewwexportreport.class ));
   }

   public tmaticewwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmaticewwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmaticewwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado Matices";
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

