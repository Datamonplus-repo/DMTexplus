package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.tunmefowwexportreport", "/app.formulaciontinte.tunmefowwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tunmefowwexportreport extends GXWebObjectStub
{
   public tunmefowwexportreport( )
   {
   }

   public tunmefowwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tunmefowwexportreport.class ));
   }

   public tunmefowwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tunmefowwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tunmefowwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado Unidades";
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

