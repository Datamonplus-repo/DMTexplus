package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tnormaswwexportreport", "/app.tnormaswwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tnormaswwexportreport extends GXWebObjectStub
{
   public tnormaswwexportreport( )
   {
   }

   public tnormaswwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tnormaswwexportreport.class ));
   }

   public tnormaswwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tnormaswwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tnormaswwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TNORMASWWExport Report";
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

