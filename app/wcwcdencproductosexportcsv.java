package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcwcdencproductosexportcsv", "/app.wcwcdencproductosexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcwcdencproductosexportcsv extends GXWebObjectStub
{
   public wcwcdencproductosexportcsv( )
   {
   }

   public wcwcdencproductosexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcwcdencproductosexportcsv.class ));
   }

   public wcwcdencproductosexportcsv( int remoteHandle ,
                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcwcdencproductosexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcwcdencproductosexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCWcdencproductos Export CSV";
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

