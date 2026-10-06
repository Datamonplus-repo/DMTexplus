package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.entradarecuentos___wcexportcsv", "/app.entradarecuentos___wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class entradarecuentos___wcexportcsv extends GXWebObjectStub
{
   public entradarecuentos___wcexportcsv( )
   {
   }

   public entradarecuentos___wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( entradarecuentos___wcexportcsv.class ));
   }

   public entradarecuentos___wcexportcsv( int remoteHandle ,
                                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new entradarecuentos___wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new entradarecuentos___wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Entrada Recuentos___WCExport CSV";
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

