package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcdetallepiezasexportcsv", "/app.wcdetallepiezasexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcdetallepiezasexportcsv extends GXWebObjectStub
{
   public wcdetallepiezasexportcsv( )
   {
   }

   public wcdetallepiezasexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcdetallepiezasexportcsv.class ));
   }

   public wcdetallepiezasexportcsv( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcdetallepiezasexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcdetallepiezasexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCDetalle Piezas Export CSV";
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

