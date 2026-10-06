package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcodparwwexportreport", "/app.tcodparwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcodparwwexportreport extends GXWebObjectStub
{
   public tcodparwwexportreport( )
   {
   }

   public tcodparwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcodparwwexportreport.class ));
   }

   public tcodparwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcodparwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcodparwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado Paros";
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

