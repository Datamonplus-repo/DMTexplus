package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wctablaalbfasexportcsv", "/app.wctablaalbfasexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wctablaalbfasexportcsv extends GXWebObjectStub
{
   public wctablaalbfasexportcsv( )
   {
   }

   public wctablaalbfasexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wctablaalbfasexportcsv.class ));
   }

   public wctablaalbfasexportcsv( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wctablaalbfasexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wctablaalbfasexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCTabla Albfas Export CSV";
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

