package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tinditexwwexportreport", "/app.ficherosbasicos.tinditexwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tinditexwwexportreport extends GXWebObjectStub
{
   public tinditexwwexportreport( )
   {
   }

   public tinditexwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tinditexwwexportreport.class ));
   }

   public tinditexwwexportreport( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tinditexwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tinditexwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado Clear to Wear";
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

