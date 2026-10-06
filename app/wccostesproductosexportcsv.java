package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wccostesproductosexportcsv", "/app.wccostesproductosexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wccostesproductosexportcsv extends GXWebObjectStub
{
   public wccostesproductosexportcsv( )
   {
   }

   public wccostesproductosexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wccostesproductosexportcsv.class ));
   }

   public wccostesproductosexportcsv( int remoteHandle ,
                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wccostesproductosexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wccostesproductosexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCCostes Productos Export CSV";
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

