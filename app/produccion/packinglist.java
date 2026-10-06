package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccion.packinglist", "/app.produccion.packinglist"})
@jakarta.servlet.annotation.MultipartConfig
public final  class packinglist extends GXWebObjectStub
{
   public packinglist( )
   {
   }

   public packinglist( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( packinglist.class ));
   }

   public packinglist( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new packinglist_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new packinglist_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Packing List";
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

