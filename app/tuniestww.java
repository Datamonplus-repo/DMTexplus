package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tuniestww", "/app.tuniestww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tuniestww extends GXWebObjectStub
{
   public tuniestww( )
   {
   }

   public tuniestww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tuniestww.class ));
   }

   public tuniestww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tuniestww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tuniestww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " UNIDADES";
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

